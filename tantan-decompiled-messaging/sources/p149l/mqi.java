package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class mqi {

    /* JADX INFO: renamed from: a */
    public c4g0 f135242a;

    /* JADX INFO: renamed from: b */
    public c4g0 f135243b;

    /* JADX INFO: renamed from: c */
    public WeakReference<RoomFrag> f135244c;

    /* JADX INFO: renamed from: d */
    public boolean f135245d;

    /* JADX INFO: renamed from: e */
    public boolean f135246e;

    /* JADX INFO: renamed from: f */
    public c4g0 f135247f;

    /* JADX INFO: renamed from: l.mqi$a */
    public static final class C18535a {

        /* JADX INFO: renamed from: a */
        public static final mqi f135248a = new mqi();
    }

    public mqi() {
        this.f135245d = false;
        this.f135246e = false;
    }

    /* JADX INFO: renamed from: c */
    public static mqi m155920c() {
        return C18535a.f135248a;
    }

    /* JADX INFO: renamed from: a */
    public final void m155921a() {
        StringBuilder sb = new StringBuilder("FloatWindowListenPageHelper destroy. RoomFrag:");
        WeakReference<RoomFrag> weakReference = this.f135244c;
        sb.append(weakReference == null ? null : weakReference.get());
        hfw.m130790a("live_float_window", sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public void m155922b() {
        m155921a();
        mkd0.m154992z(this.f135242a);
        mkd0.m154992z(this.f135243b);
        mkd0.m154992z(this.f135247f);
        this.f135245d = false;
        this.f135246e = false;
        WeakReference<RoomFrag> weakReference = this.f135244c;
        if (weakReference != null) {
            weakReference.clear();
            this.f135244c = null;
        }
        this.f135242a = null;
        this.f135243b = null;
        this.f135247f = null;
    }

    /* JADX INFO: renamed from: d */
    public void m155923d(boolean z) {
        this.f135246e = z;
        this.f135245d = false;
    }

    /* JADX INFO: renamed from: e */
    public void m155924e(boolean z) {
        this.f135245d = z;
    }
}
