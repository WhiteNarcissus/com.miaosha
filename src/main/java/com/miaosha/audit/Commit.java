package com.miaosha.audit;

public class Commit {


    public void commit(Req req , IAuditEntity auditEntity ){
        Res res = new Res();
        res.setAuditState("audited");
        Audit audit = new Audit();
        audit.setAuditId(1l);
        audit.setAuditState(res.getAuditState());
        auditEntity.makeAuditState(audit);
    }

}
