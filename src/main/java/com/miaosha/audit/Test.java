package com.miaosha.audit;

public class Test {


    public static void main(String[] args) {
        Commit commit = new Commit();
        Req req = new Req();
        Entity entity2 = new Entity();
        commit.commit(req,entity2);
        System.out.println(entity2.getAuditState());

    }
}
