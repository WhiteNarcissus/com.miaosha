package com.miaosha.audit;

import java.util.Date;

public class Entity implements IAuditEntity {

   private Long SectionId ;
 private Long id ;
 private Long  masterId;
 private Integer isEffective;
 private String auditState ;
 private Long auditId ;
 private Date commitTime ;
 private Date auditTime ;

 @Override
 public void makeId(Audit audit) {
  this.id = audit.getAuditId();
 }

 @Override
 public void makeMasterId(Audit audit) {
  this.masterId = audit.getMasterId();
 }

 @Override
 public void makeEffective(Audit audit) {
  this.isEffective = audit.getIsEffective();
 }

 @Override
 public void makeAuditState(Audit audit) {
  this.auditState = audit.getAuditState();
 }

 @Override
 public void makeAuditId(Audit audit) {
  this.auditId = audit.getAuditId();
 }

 @Override
 public void makeCommitTime(Audit audit) {
  this.id = audit.getAuditId();
 }

 @Override
 public void makeAuditTime(Audit audit) {
  this.id = audit.getAuditId();
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public Long getMasterId() {
  return masterId;
 }

 public void setMasterId(Long masterId) {
  this.masterId = masterId;
 }

 public Integer getIsEffective() {
  return isEffective;
 }

 public void setIsEffective(Integer isEffective) {
  this.isEffective = isEffective;
 }

 public String getAuditState() {
  return auditState;
 }

 public void setAuditState(String auditState) {
  this.auditState = auditState;
 }

 public Long getAuditId() {
  return auditId;
 }

 public void setAuditId(Long auditId) {
  this.auditId = auditId;
 }

 public Date getCommitTime() {
  return commitTime;
 }

 public void setCommitTime(Date commitTime) {
  this.commitTime = commitTime;
 }

 public Date getAuditTime() {
  return auditTime;
 }

 public void setAuditTime(Date auditTime) {
  this.auditTime = auditTime;
 }
}
