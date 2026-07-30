package io.requery.android.database.sqlite;

import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteCustomExtension {
    public final String entryPoint;
    public final String path;

    public SQLiteCustomExtension(String str, String str2) {
        if (str == null) {
            wg3.m206174a("null path");
            throw null;
        }
        this.path = str;
        this.entryPoint = str2;
    }
}
