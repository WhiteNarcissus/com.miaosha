package com.miaosha.audit;

import java.util.Date;

public interface IAuditEntity {




    public void makeId(Audit audit) ;


    public void makeMasterId(Audit audit) ;




    public void makeEffective(Audit audit) ;
    public void makeAuditState(Audit audite) ;

    public void makeAuditId(Audit audit) ;

    public void makeCommitTime(Audit audit) ;

    public void makeAuditTime(Audit audit) ;

}
