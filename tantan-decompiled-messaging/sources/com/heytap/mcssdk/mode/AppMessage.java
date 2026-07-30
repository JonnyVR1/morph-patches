package com.heytap.mcssdk.mode;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class AppMessage extends Message {
    private int mBalanceTime;
    private String mContent;
    private long mEndDate;
    private String mRule;
    private long mStartDate;
    private String mTitle;
    private String mTimeRanges = "08:00-22:00";
    private int mForcedDelivery = 0;
    private int mDistinctBycontent = 0;

    public int getBalanceTime() {
        return this.mBalanceTime;
    }

    public String getContent() {
        return this.mContent;
    }

    public int getDistinctBycontent() {
        return this.mDistinctBycontent;
    }

    public long getEndDate() {
        return this.mEndDate;
    }

    public int getForcedDelivery() {
        return this.mForcedDelivery;
    }

    public String getRule() {
        return this.mRule;
    }

    public long getStartDate() {
        return this.mStartDate;
    }

    public String getTimeRanges() {
        return this.mTimeRanges;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.heytap.mcssdk.mode.Message
    public int getType() {
        return 4098;
    }

    public void setBalanceTime(int i) {
        this.mBalanceTime = i;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setDistinctBycontent(int i) {
        this.mDistinctBycontent = i;
    }

    public void setEndDate(long j) {
        this.mEndDate = j;
    }

    public void setForcedDelivery(int i) {
        this.mForcedDelivery = i;
    }

    public void setRule(String str) {
        this.mRule = str;
    }

    public void setStartDate(long j) {
        this.mStartDate = j;
    }

    public void setTimeRanges(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mTimeRanges = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String toString() {
        return "AppMessage{mTitle='" + this.mTitle + "', mContent='" + this.mContent + "', mStartDate=" + this.mStartDate + ", mEndDate=" + this.mEndDate + ", mBalanceTime=" + this.mBalanceTime + ", mTimeRanges='" + this.mTimeRanges + "', mRule='" + this.mRule + "', mForcedDelivery=" + this.mForcedDelivery + ", mDistinctBycontent=" + this.mDistinctBycontent + '}';
    }
}
