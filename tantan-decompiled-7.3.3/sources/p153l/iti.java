package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class iti {

    /* JADX INFO: renamed from: a */
    public kcg0 f116838a;

    /* JADX INFO: renamed from: b */
    public kcg0 f116839b;

    /* JADX INFO: renamed from: c */
    public WeakReference<RoomFrag> f116840c;

    /* JADX INFO: renamed from: d */
    public boolean f116841d;

    /* JADX INFO: renamed from: e */
    public boolean f116842e;

    /* JADX INFO: renamed from: f */
    public kcg0 f116843f;

    /* JADX INFO: renamed from: l.iti$a */
    public static final class C17803a {

        /* JADX INFO: renamed from: a */
        public static final iti f116844a = new iti();
    }

    public iti() {
        this.f116841d = false;
        this.f116842e = false;
    }

    /* JADX INFO: renamed from: c */
    public static iti m142051c() {
        return C17803a.f116844a;
    }

    /* JADX INFO: renamed from: a */
    public final void m142052a() {
        StringBuilder sb = new StringBuilder("FloatWindowListenPageHelper destroy. RoomFrag:");
        WeakReference<RoomFrag> weakReference = this.f116840c;
        sb.append(weakReference == null ? null : weakReference.get());
        fhw.m125605a("live_float_window", sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public void m142053b() {
        m142052a();
        psd0.m173633z(this.f116838a);
        psd0.m173633z(this.f116839b);
        psd0.m173633z(this.f116843f);
        this.f116841d = false;
        this.f116842e = false;
        WeakReference<RoomFrag> weakReference = this.f116840c;
        if (weakReference != null) {
            weakReference.clear();
            this.f116840c = null;
        }
        this.f116838a = null;
        this.f116839b = null;
        this.f116843f = null;
    }

    /* JADX INFO: renamed from: d */
    public void m142054d(boolean z) {
        this.f116842e = z;
        this.f116841d = false;
    }

    /* JADX INFO: renamed from: e */
    public void m142055e(boolean z) {
        this.f116841d = z;
    }
}
