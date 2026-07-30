package com.tencent.liteav.basic.module;

/* JADX INFO: renamed from: com.tencent.liteav.basic.module.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14040a {
    private String mID = "";

    public void clearID() {
        synchronized (this) {
            try {
                if (this.mID.length() != 0) {
                    TXCStatus.m82998b(this.mID);
                    this.mID = "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        clearID();
        super.finalize();
    }

    public double getDoubleValue(int i) {
        return TXCStatus.m83001d(this.mID, i);
    }

    public String getID() {
        return this.mID;
    }

    public int getIntValue(int i) {
        return TXCStatus.m82999c(this.mID, i);
    }

    public long getLongValue(int i) {
        return TXCStatus.m82991a(this.mID, i);
    }

    public String getStringValue(int i) {
        return TXCStatus.m82996b(this.mID, i);
    }

    public void setID(String str) {
        clearID();
        synchronized (this) {
            try {
                if (str.length() != 0) {
                    this.mID = str;
                    TXCStatus.m82993a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setStatusValue(int i, Object obj) {
        return TXCStatus.m82995a(this.mID, i, obj);
    }

    public double getDoubleValue(int i, int i2) {
        return TXCStatus.m83002d(this.mID, i, i2);
    }

    public int getIntValue(int i, int i2) {
        return TXCStatus.m83000c(this.mID, i, i2);
    }

    public long getLongValue(int i, int i2) {
        return TXCStatus.m82992a(this.mID, i, i2);
    }

    public String getStringValue(int i, int i2) {
        return TXCStatus.m82997b(this.mID, i, i2);
    }

    public boolean setStatusValue(int i, int i2, Object obj) {
        return TXCStatus.m82994a(this.mID, i, i2, obj);
    }
}
