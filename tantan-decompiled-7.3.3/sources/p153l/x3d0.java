package p153l;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class x3d0 extends uyb {

    /* JADX INFO: renamed from: i */
    public int f192245i;

    /* JADX INFO: renamed from: j */
    public int f192246j;

    /* JADX INFO: renamed from: k */
    public LayoutInflater f192247k;

    @Deprecated
    public x3d0(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f192246j = i;
        this.f192245i = i;
        this.f192247k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p153l.uyb
    /* JADX INFO: renamed from: f */
    public View mo198584f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f192247k.inflate(this.f192246j, viewGroup, false);
    }

    @Override // p153l.uyb
    /* JADX INFO: renamed from: g */
    public View mo161295g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f192247k.inflate(this.f192245i, viewGroup, false);
    }
}
