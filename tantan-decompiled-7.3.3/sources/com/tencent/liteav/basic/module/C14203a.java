package com.tencent.liteav.basic.module;

/* JADX INFO: renamed from: com.tencent.liteav.basic.module.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14203a {
    private String mID = "";

    public void clearID() {
        synchronized (this) {
            try {
                if (this.mID.length() != 0) {
                    TXCStatus.m84181b(this.mID);
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
        return TXCStatus.m84184d(this.mID, i);
    }

    public String getID() {
        return this.mID;
    }

    public int getIntValue(int i) {
        return TXCStatus.m84182c(this.mID, i);
    }

    public long getLongValue(int i) {
        return TXCStatus.m84174a(this.mID, i);
    }

    public String getStringValue(int i) {
        return TXCStatus.m84179b(this.mID, i);
    }

    public void setID(String str) {
        clearID();
        synchronized (this) {
            try {
                if (str.length() != 0) {
                    this.mID = str;
                    TXCStatus.m84176a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setStatusValue(int i, Object obj) {
        return TXCStatus.m84178a(this.mID, i, obj);
    }

    public double getDoubleValue(int i, int i2) {
        return TXCStatus.m84185d(this.mID, i, i2);
    }

    public int getIntValue(int i, int i2) {
        return TXCStatus.m84183c(this.mID, i, i2);
    }

    public long getLongValue(int i, int i2) {
        return TXCStatus.m84175a(this.mID, i, i2);
    }

    public String getStringValue(int i, int i2) {
        return TXCStatus.m84180b(this.mID, i, i2);
    }

    public boolean setStatusValue(int i, int i2, Object obj) {
        return TXCStatus.m84177a(this.mID, i, i2, obj);
    }
}
