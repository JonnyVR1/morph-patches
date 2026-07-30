package p149l;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class uvc0 extends gxb {

    /* JADX INFO: renamed from: i */
    public int f178524i;

    /* JADX INFO: renamed from: j */
    public int f178525j;

    /* JADX INFO: renamed from: k */
    public LayoutInflater f178526k;

    @Deprecated
    public uvc0(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f178525j = i;
        this.f178524i = i;
        this.f178526k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p149l.gxb
    /* JADX INFO: renamed from: f */
    public View mo128539f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f178526k.inflate(this.f178525j, viewGroup, false);
    }

    @Override // p149l.gxb
    /* JADX INFO: renamed from: g */
    public View mo123284g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f178526k.inflate(this.f178524i, viewGroup, false);
    }
}
