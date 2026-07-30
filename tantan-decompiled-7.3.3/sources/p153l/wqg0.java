package p153l;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class wqg0 {

    /* JADX INFO: renamed from: a */
    public final feg0 f190400a;

    /* JADX INFO: renamed from: b */
    public final lxg0 f190401b;

    /* JADX INFO: renamed from: c */
    public final ljg0 f190402c;

    /* JADX INFO: renamed from: d */
    public final int f190403d;

    /* JADX INFO: renamed from: e */
    public final String f190404e;

    /* JADX INFO: renamed from: f */
    public final wqg0 f190405f;

    /* JADX INFO: renamed from: g */
    public boolean f190406g;

    /* JADX INFO: renamed from: h */
    public boolean f190407h;

    public wqg0(feg0 feg0Var, ImageView imageView, lxg0 lxg0Var, int i, String str) {
        this.f190400a = feg0Var;
        this.f190401b = lxg0Var;
        this.f190402c = imageView == null ? null : new ljg0(this, imageView, feg0Var.f98674h);
        this.f190403d = i;
        this.f190404e = str;
        this.f190405f = this;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo201288a();

    /* JADX INFO: renamed from: b */
    public final Object m207517b() {
        ljg0 ljg0Var = this.f190402c;
        if (ljg0Var == null) {
            return null;
        }
        return ljg0Var.get();
    }
}
