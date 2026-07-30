package p153l;

import android.database.Cursor;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes.dex */
public final class eug0 {

    /* JADX INFO: renamed from: a */
    public final int f95864a;

    /* JADX INFO: renamed from: b */
    public final String f95865b;

    /* JADX INFO: renamed from: c */
    public final String f95866c;

    /* JADX INFO: renamed from: d */
    public final String f95867d;

    /* JADX INFO: renamed from: e */
    public final String f95868e;

    /* JADX INFO: renamed from: f */
    public final boolean f95869f;

    /* JADX INFO: renamed from: g */
    public final boolean f95870g;

    public eug0(Cursor cursor) {
        this.f95864a = cursor.getInt(cursor.getColumnIndex("id"));
        this.f95865b = cursor.getString(cursor.getColumnIndex("url"));
        this.f95866c = cursor.getString(cursor.getColumnIndex("etag"));
        this.f95867d = cursor.getString(cursor.getColumnIndex("parent_path"));
        this.f95868e = cursor.getString(cursor.getColumnIndex("filename"));
        this.f95869f = cursor.getInt(cursor.getColumnIndex("task_only_parent_path")) == 1;
        this.f95870g = cursor.getInt(cursor.getColumnIndex(HttpHeaderValues.CHUNKED)) == 1;
    }
}
