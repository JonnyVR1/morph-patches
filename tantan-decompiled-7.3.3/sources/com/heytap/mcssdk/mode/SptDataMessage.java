package com.heytap.mcssdk.mode;

/* JADX INFO: loaded from: classes7.dex */
public class SptDataMessage extends Message {
    private String mAppID;
    private String mContent;
    private String mDescription;
    private String mGlobalID;

    public String getAppID() {
        return this.mAppID;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getGlobalID() {
        return this.mGlobalID;
    }

    @Override // com.heytap.mcssdk.mode.Message
    public int getType() {
        return 4103;
    }

    public void setAppID(String str) {
        this.mAppID = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setGlobalID(String str) {
        this.mGlobalID = str;
    }

    public String toString() {
        return "SptDataMessage{mGlobalID='" + this.mGlobalID + "', mContent='" + this.mContent + "', mDescription='" + this.mDescription + "', mAppID='" + this.mAppID + "'}";
    }
}
