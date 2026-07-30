package org.seamless.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Pager implements Serializable {
    private Long numOfRecords;
    private Integer page;
    private Long pageSize;

    public Pager(Long l2, Integer num) {
        this.numOfRecords = 0L;
        this.page = 1;
        this.pageSize = 15L;
        this.numOfRecords = l2;
        this.page = num;
    }

    public int getFirstPage() {
        return 1;
    }

    public long getIndexRangeBegin() {
        long jIntValue = ((long) (getPage().intValue() - 1)) * getPageSize().longValue();
        long jLongValue = getNumOfRecords().longValue() - 1;
        if (jIntValue < 0) {
            jIntValue = 0;
        }
        return Math.max(Math.min(jLongValue, jIntValue), 0L);
    }

    public long getIndexRangeEnd() {
        return Math.min(getIndexRangeBegin() + (getPageSize().longValue() - 1), getNumOfRecords().longValue() - 1);
    }

    public long getLastPage() {
        long jLongValue = this.numOfRecords.longValue() / this.pageSize.longValue();
        if (this.numOfRecords.longValue() % this.pageSize.longValue() == 0) {
            jLongValue--;
        }
        return jLongValue + 1;
    }

    public int getNextPage() {
        return this.page.intValue() + 1;
    }

    public Long getNumOfRecords() {
        return this.numOfRecords;
    }

    public Integer getPage() {
        return this.page;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public int getPreviousPage() {
        return this.page.intValue() - 1;
    }

    public boolean isNextPageAvailable() {
        return this.numOfRecords.longValue() - 1 > getIndexRangeEnd();
    }

    public boolean isPreviousPageAvailable() {
        return getIndexRangeBegin() + 1 > getPageSize().longValue();
    }

    public boolean isSeveralPages() {
        return getNumOfRecords().longValue() != 0 && getNumOfRecords().longValue() > getPageSize().longValue();
    }

    public void setNumOfRecords(Long l2) {
        this.numOfRecords = l2;
    }

    public void setPage(Integer num) {
        if (num != null) {
            this.page = num;
        }
    }

    public void setPageSize(Long l2) {
        if (l2 != null) {
            this.pageSize = l2;
        }
    }

    public String toString() {
        return "Pager - Records: " + getNumOfRecords() + " Page size: " + getPageSize();
    }

    public Pager(Long l2) {
        this.numOfRecords = 0L;
        this.page = 1;
        this.pageSize = 15L;
        this.numOfRecords = l2;
    }

    public Pager() {
        this.numOfRecords = 0L;
        this.page = 1;
        this.pageSize = 15L;
    }

    public Pager(Long l2, Integer num, Long l3) {
        this.numOfRecords = 0L;
        this.page = 1;
        this.numOfRecords = l2;
        this.page = num;
        this.pageSize = l3;
    }
}
