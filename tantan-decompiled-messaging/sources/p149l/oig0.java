package p149l;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class oig0 {

    /* JADX INFO: renamed from: a */
    public final x5g0 f144114a;

    /* JADX INFO: renamed from: b */
    public final dpg0 f144115b;

    /* JADX INFO: renamed from: c */
    public final dbg0 f144116c;

    /* JADX INFO: renamed from: d */
    public final int f144117d;

    /* JADX INFO: renamed from: e */
    public final String f144118e;

    /* JADX INFO: renamed from: f */
    public final oig0 f144119f;

    /* JADX INFO: renamed from: g */
    public boolean f144120g;

    /* JADX INFO: renamed from: h */
    public boolean f144121h;

    public oig0(x5g0 x5g0Var, ImageView imageView, dpg0 dpg0Var, int i, String str) {
        this.f144114a = x5g0Var;
        this.f144115b = dpg0Var;
        this.f144116c = imageView == null ? null : new dbg0(this, imageView, x5g0Var.f191145h);
        this.f144117d = i;
        this.f144118e = str;
        this.f144119f = this;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo158558a();

    /* JADX INFO: renamed from: b */
    public final Object m164511b() {
        dbg0 dbg0Var = this.f144116c;
        if (dbg0Var == null) {
            return null;
        }
        return dbg0Var.get();
    }
}
