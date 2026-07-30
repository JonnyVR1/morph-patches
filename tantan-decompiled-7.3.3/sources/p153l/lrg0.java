package p153l;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class lrg0 {

    /* JADX INFO: renamed from: a */
    public final int f133325a;

    /* JADX INFO: renamed from: b */
    public final long f133326b;

    /* JADX INFO: renamed from: c */
    public final long f133327c;

    /* JADX INFO: renamed from: d */
    public final long f133328d;

    public lrg0(Cursor cursor) {
        this.f133325a = cursor.getInt(cursor.getColumnIndex("breakpoint_id"));
        this.f133326b = cursor.getInt(cursor.getColumnIndex("start_offset"));
        this.f133327c = cursor.getInt(cursor.getColumnIndex("content_length"));
        this.f133328d = cursor.getInt(cursor.getColumnIndex("current_offset"));
    }
}
