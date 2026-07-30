package p149l;

import android.database.Cursor;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes.dex */
public final class wlg0 {

    /* JADX INFO: renamed from: a */
    public final int f186896a;

    /* JADX INFO: renamed from: b */
    public final String f186897b;

    /* JADX INFO: renamed from: c */
    public final String f186898c;

    /* JADX INFO: renamed from: d */
    public final String f186899d;

    /* JADX INFO: renamed from: e */
    public final String f186900e;

    /* JADX INFO: renamed from: f */
    public final boolean f186901f;

    /* JADX INFO: renamed from: g */
    public final boolean f186902g;

    public wlg0(Cursor cursor) {
        this.f186896a = cursor.getInt(cursor.getColumnIndex("id"));
        this.f186897b = cursor.getString(cursor.getColumnIndex("url"));
        this.f186898c = cursor.getString(cursor.getColumnIndex("etag"));
        this.f186899d = cursor.getString(cursor.getColumnIndex("parent_path"));
        this.f186900e = cursor.getString(cursor.getColumnIndex("filename"));
        this.f186901f = cursor.getInt(cursor.getColumnIndex("task_only_parent_path")) == 1;
        this.f186902g = cursor.getInt(cursor.getColumnIndex(HttpHeaderValues.CHUNKED)) == 1;
    }
}
