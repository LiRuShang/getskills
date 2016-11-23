package cn.bawei.mongotest;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.util.JSON;

public class MyMongoTest {
	public static void main(String[] args) throws Exception {
		MongoClientOptions mcs = MongoClientOptions.builder().connectionsPerHost(6).connectTimeout(1000).build();
		
		MongoClient mongo = new MongoClient("127.0.0.1:27017",mcs);
		
		System.out.println("ConnectionsPerHost=="+mongo.getMongoClientOptions().getConnectionsPerHost());
		
		
		DB db = mongo.getDB("mydb");
		
		DBCollection users = db.getCollection("users");
        DBObject d =  users.findOne();
        //System.out.println("d=="+d);
        
        BasicDBObject d1 = new BasicDBObject();
        d1.put("userId", "myU1");
        d1.append("userId", "myU2").append("name", "updatename222");
        //users.insert(d1);
        
        String json = "{'userId':'1234','age':25}";
        DBObject d2 = (DBObject) JSON.parse(json);
        
        //users.insert(d1);
        
        BasicDBObject reobj = new BasicDBObject();
        reobj.put("userId", "myU2");
        
        //users.remove(reobj);
        
        String json2 = "{'userId':'4321','age':25}";
        DBObject d3 = (DBObject) JSON.parse(json2);
        //users.update(new BasicDBObject("userId","myU2"),d3);
        
        //db.users.update({userId:"4321"},{$set:{age:26}})
        BasicDBObject condition = new BasicDBObject("userId","4321");
        BasicDBObject updateValue = new BasicDBObject("age",20);        
        //users.update(condition, new BasicDBObject("$set",updateValue));        
        
        //DBCursor c = users.find();
        //DBCursor c = users.find(new BasicDBObject("userId","1234"));
        //DBCursor c = users.find(new BasicDBObject("userId","ttuu").append("age", 19));
        //db.users.find({userId:"ttuu",age:{$gt:20}})
        //DBCursor c = users.find(new BasicDBObject("userId","ttuu").append("age", new BasicDBObject("$gt",25)));
        //db.users.find({userId:"ttuu",age:{$gt:20,$lt:30}})
        DBCursor c = users.find(new BasicDBObject("userId","ttuu").append("age", new BasicDBObject("$gt",19).append("$lt", 30)));
		while(c.hasNext()){
			DBObject obj = c.next();
			System.out.println("obj==="+obj);
		}
        
//		BasicDBObject d1 = new BasicDBObject();
//		d1.put("userId","myU1");
//		d1.append("userId", "myU2").append("name", "updatename222");
		
//		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().add("userId", "u3").add("age", 123);
	
//		String json = "{'userId':'t234','age':234}";
//		DBObject d1 = (DBObject)JSON.parse(json);
		
//		users.insert(d1);
//		users.insert(builder.get());
		
//		users.remove(new BasicDBObject());
		
//		users.update(new BasicDBObject("userId", "myU2"),d1);
//		users.update(new BasicDBObject("userId", "myU2"),
//				new BasicDBObject("$set",
//							new BasicDBObject("name","newName")
//						)
//				);
		
//		DBObject d =  users.findOne();
//		System.out.println("d=="+d);
		
		// {userId:"ttuu" , age:{$gte:100,$lt:200}  }
		
		/*DBObject con = new BasicDBObject(
				"userId","ttuu").append(
				"age", new BasicDBObject("$gt",120).append("$lt", 210)				
				);
		
		DBObject show = new BasicDBObject("userId",1).append("age",1).append("_id", 0);
				
		DBCursor c = users.find(con,show).limit(2);
		while(c.hasNext()){
			DBObject d = c.next();
			System.out.println("d==="+d);
		}*/		
		
		mongo.close();
		
	}
}
