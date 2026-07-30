package io.requery.android.database.sqlite;

import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction callback;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            wg3.m206174a("name must not be null.");
            throw null;
        }
        this.name = str;
        this.numArgs = i;
        this.callback = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.callback.callback(strArr);
    }
}
