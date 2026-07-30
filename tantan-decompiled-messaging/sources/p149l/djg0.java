package p149l;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class djg0 {

    /* JADX INFO: renamed from: a */
    public final int f86534a;

    /* JADX INFO: renamed from: b */
    public final long f86535b;

    /* JADX INFO: renamed from: c */
    public final long f86536c;

    /* JADX INFO: renamed from: d */
    public final long f86537d;

    public djg0(Cursor cursor) {
        this.f86534a = cursor.getInt(cursor.getColumnIndex("breakpoint_id"));
        this.f86535b = cursor.getInt(cursor.getColumnIndex("start_offset"));
        this.f86536c = cursor.getInt(cursor.getColumnIndex("content_length"));
        this.f86537d = cursor.getInt(cursor.getColumnIndex("current_offset"));
    }
}
