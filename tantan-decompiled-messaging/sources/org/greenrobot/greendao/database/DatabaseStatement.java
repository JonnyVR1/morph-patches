package org.greenrobot.greendao.database;

/* JADX INFO: loaded from: classes3.dex */
public interface DatabaseStatement {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);

    void clearBindings();

    void close();

    void execute();

    long executeInsert();

    Object getRawStatement();

    long simpleQueryForLong();
}
