package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import java.lang.ref.WeakReference;
import l.c4g0;
import l.hfw;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mqi {

    /* JADX INFO: renamed from: a */
    public c4g0 f15590a;

    /* JADX INFO: renamed from: b */
    public c4g0 f15591b;

    /* JADX INFO: renamed from: c */
    public WeakReference<RoomFrag> f15592c;

    /* JADX INFO: renamed from: d */
    public boolean f15593d;

    /* JADX INFO: renamed from: e */
    public boolean f15594e;

    /* JADX INFO: renamed from: f */
    public c4g0 f15595f;

    /* JADX INFO: renamed from: l.mqi$a */
    public static final class C0684a {

        /* JADX INFO: renamed from: a */
        public static final mqi f15596a = new mqi();
    }

    public mqi() {
        this.f15593d = false;
        this.f15594e = false;
    }

    /* JADX INFO: renamed from: c */
    public static mqi m18135c() {
        return C0684a.f15596a;
    }

    /* JADX INFO: renamed from: a */
    public final void m18136a() {
        StringBuilder sb = new StringBuilder("FloatWindowListenPageHelper destroy. RoomFrag:");
        WeakReference<RoomFrag> weakReference = this.f15592c;
        sb.append(weakReference == null ? null : weakReference.get());
        hfw.a("live_float_window", sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public void m18137b() {
        m18136a();
        mkd0.z(this.f15590a);
        mkd0.z(this.f15591b);
        mkd0.z(this.f15595f);
        this.f15593d = false;
        this.f15594e = false;
        WeakReference<RoomFrag> weakReference = this.f15592c;
        if (weakReference != null) {
            weakReference.clear();
            this.f15592c = null;
        }
        this.f15590a = null;
        this.f15591b = null;
        this.f15595f = null;
    }

    /* JADX INFO: renamed from: d */
    public void m18138d(boolean z) {
        this.f15594e = z;
        this.f15593d = false;
    }

    /* JADX INFO: renamed from: e */
    public void m18139e(boolean z) {
        this.f15593d = z;
    }
}
