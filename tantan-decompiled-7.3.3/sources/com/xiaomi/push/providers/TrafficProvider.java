package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import p153l.csq0;
import p153l.p2r0;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
public class TrafficProvider extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final UriMatcher f63581a;

    /* JADX INFO: renamed from: a */
    public static final Uri f63582a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* JADX INFO: renamed from: a */
    private SQLiteOpenHelper f63583a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f63581a = uriMatcher;
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
        if (f63581a.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        ypg0.m217021a("Unknown URI ", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f63583a = new csq0(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        synchronized (csq0.f83481b) {
            try {
                if (f63581a.match(uri) != 1) {
                    throw new IllegalArgumentException("Unknown URI " + uri);
                }
                cursorQuery = this.f63583a.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f63581a.match(uri) != 2 || contentValues == null || !contentValues.containsKey("imsi")) {
            return 0;
        }
        p2r0.m170394l(contentValues.getAsString("imsi"));
        return 0;
    }
}
