package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import p149l.jtq0;
import p149l.qhg0;
import p149l.xiq0;

/* JADX INFO: loaded from: classes2.dex */
public class TrafficProvider extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final UriMatcher f62734a;

    /* JADX INFO: renamed from: a */
    public static final Uri f62735a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* JADX INFO: renamed from: a */
    private SQLiteOpenHelper f62736a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f62734a = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (f62734a.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        qhg0.m174539a("Unknown URI ", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f62736a = new xiq0(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        synchronized (xiq0.f193149b) {
            try {
                if (f62734a.match(uri) != 1) {
                    throw new IllegalArgumentException("Unknown URI " + uri);
                }
                cursorQuery = this.f62736a.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f62734a.match(uri) != 2 || contentValues == null || !contentValues.containsKey("imsi")) {
            return 0;
        }
        jtq0.m143170l(contentValues.getAsString("imsi"));
        return 0;
    }
}
