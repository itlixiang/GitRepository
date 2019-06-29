package com.qq.domain;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 666
 * @Date: 2019/6/28
 * @Time: 19:05
 */

public class ResultInfo {

   private boolean flag;
   private Object date;
   private String msg;

   public boolean isFlag() {
      return flag;
   }

   public void setFlag(boolean flag) {
      this.flag = flag;
   }

   public Object getDate() {
      return date;
   }

   public void setDate(Object date) {
      this.date = date;
   }

   public String getMsg() {
      return msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }
}
