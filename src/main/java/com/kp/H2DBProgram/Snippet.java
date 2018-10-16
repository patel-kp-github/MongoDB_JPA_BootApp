package com.kp.H2DBProgram;

 import org.springframework.data.annotation.Id;
 import org.springframework.data.mongodb.core.mapping.Document;

 import java.util.Date;

 @Document
 public class Snippet {

     @Id
     private String id;
     private String title;
     private String code;

     private Date created;

     private Date modified;

     public Snippet() {
         this.id = java.util.UUID.randomUUID().toString();
         this.title = title;
         this.code = code;
         this.created = new Date();
         this.modified = new Date();
     }

     public String getId() {
         return id;
     }


     public String getTitle() {
         return title;
     }

     public String getCode() {
         return code;
     }

     public Date getCreated() {
         return created;
     }

     public Date getModified() {
         return modified;
     }

     public void setId(String id) {
         this.id = id;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setCode(String code) {
         this.code = code;
     }

     public void setCreated(Date created) {
         this.created = created;
     }

     public void setModified(Date modified) {
         this.modified = modified;
     }
 }
