package com.tin_project.scraper;

import java.util.Date;

class Status {
  public Date timestamp;
  public long error_code;
  public Object error_message;
  public long elapsed;
  public long credit_count;
  public Object notice;
  public long total_count;

  public Status() {
  }

  public Status(Date timestamp, long error_code, Object error_message, int elapsed, int credit_count, Object notice, int total_count) {
    this.timestamp = timestamp;
    this.error_code = error_code;
    this.error_message = error_message;
    this.elapsed = elapsed;
    this.credit_count = credit_count;
    this.notice = notice;
    this.total_count = total_count;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public long getError_code() {
    return error_code;
  }

  public void setError_code(long error_code) {
    this.error_code = error_code;
  }

  public Object getError_message() {
    return error_message;
  }

  public void setError_message(Object error_message) {
    this.error_message = error_message;
  }

  public long getElapsed() {
    return elapsed;
  }

  public void setElapsed(long elapsed) {
    this.elapsed = elapsed;
  }

  public long getCredit_count() {
    return credit_count;
  }

  public void setCredit_count(long credit_count) {
    this.credit_count = credit_count;
  }

  public Object getNotice() {
    return notice;
  }

  public void setNotice(Object notice) {
    this.notice = notice;
  }

  public long getTotal_count() {
    return total_count;
  }

  public void setTotal_count(long total_count) {
    this.total_count = total_count;
  }

  @Override
  public String toString() {
    return "Status{" +
            "timestamp=" + timestamp +
            ", error_code=" + error_code +
            ", error_message=" + error_message +
            ", elapsed=" + elapsed +
            ", credit_count=" + credit_count +
            ", notice=" + notice +
            ", total_count=" + total_count +
            '}';
  }
}
