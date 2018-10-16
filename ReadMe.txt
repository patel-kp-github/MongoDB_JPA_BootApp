#install mongoDB
#set env file
#run mongo DB by command
mongod
#connect mongoDB by command
mongo
#put some data by below commands:
1) use test
2)db.createCollection("snippet");
3)db.snippet.insertMany([
  {
    "id" : "1",
    "title" : "demo title",
    "code" : "pitbull",
    "created":"10/16/2018",
    "modified":"10/16/2018"
  },
  {
     "id" : "2",
    "title" : "demo title2",
    "code" : "pitbull",
    "created":"10/16/2018",
    "modified":"10/16/2018"
  },
  {
    "id" : "3",
    "title" : "demo title3",
    "code" : "pitbull",
    "created":"10/16/2018",
    "modified":"10/16/2018"
  }
]);

#run boot application
#Hit URL localhost:8090/snippet 
