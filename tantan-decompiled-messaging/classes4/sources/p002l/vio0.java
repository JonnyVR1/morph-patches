package p002l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.android.app.Frag;
import java.util.Collection;
import l.bs5;
import l.e30;
import l.ff3;
import l.ffw;
import l.g6n0;
import l.jo0;
import l.r8d0;
import l.wq2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vio0 implements w2m {

    /* JADX INFO: renamed from: b */
    public r8d0 f21173b;

    /* JADX INFO: renamed from: c */
    public final String f21174c;

    /* JADX INFO: renamed from: d */
    public final String f21175d;

    /* JADX INFO: renamed from: e */
    public final Frag f21176e;

    /* JADX INFO: renamed from: f */
    public final wio0 f21177f;

    /* JADX INFO: renamed from: a */
    public final ff3<hqv> f21172a = new ff3<>(hqv.m14713g());

    /* JADX INFO: renamed from: g */
    public final bs5 f21178g = new bs5();

    /* JADX INFO: renamed from: l.vio0$a */
    public static /* synthetic */ class C0863a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21179a;

        static {
            int[] iArr = new int[JumpRoomType.values().length];
            f21179a = iArr;
            try {
                iArr[JumpRoomType.END_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public vio0(Frag frag, String str, String str2) {
        this.f21176e = frag;
        this.f21174c = str;
        this.f21175d = str2;
        this.f21177f = new wio0(str, str2);
    }

    /* JADX INFO: renamed from: q */
    private void m24012q(r8d0 r8d0Var) {
        if (r8d0Var == null) {
            return;
        }
        final hqv hqvVar = new hqv(((wq2) r8d0Var).c, ((wq2) r8d0Var).b, ((wq2) r8d0Var).a);
        hqvVar.m14714f(((wq2) r8d0Var).c.id);
        this.f21178g.a(this.f21176e.duringCreated(this.f21177f.m24665a(r8d0Var)).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.tio0
            public final void call(Object obj) {
                this.f20247a.m24014o(hqvVar, (g6n0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: r */
    private void m24013r() {
        this.f21178g.a(this.f21176e.duringCreated(this.f21177f.m24666b(((hqv) this.f21172a.c()).m14722o())).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.rio0
            public final void call(Object obj) {
                this.f18535a.m24015p((g6n0) obj);
            }
        })));
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: a */
    public void mo9803a() {
        this.f21178g.c();
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: b */
    public void mo9804b(final Collection<String> collection) {
        this.f21172a.a(new e30() { // from class: l.qio0
            public final void call(Object obj) {
                ((hqv) obj).m14725r(collection);
            }
        });
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: c */
    public void mo9805c(int i) {
        int iM14721n = mo9808f().m14721n();
        if (iM14721n == 0) {
            m24012q(this.f21173b);
        } else if (i > iM14721n - 3) {
            m24013r();
        }
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: d */
    public void mo9806d(JumpRoomData jumpRoomData) {
        if (C0863a.f21179a[jumpRoomData.getJumpRoomType().ordinal()] != 1) {
            return;
        }
        mo9804b(jumpRoomData.getLiveIdNeedToRemove());
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: e */
    public void mo9807e(final r8d0 r8d0Var) {
        this.f21172a.a(new e30() { // from class: l.sio0
            public final void call(Object obj) {
                r8d0 r8d0Var2 = r8d0Var;
                ((hqv) obj).m14728u(((wq2) r8d0Var2).c, ((wq2) r8d0Var2).b, ((wq2) r8d0Var2).a);
            }
        });
    }

    @Override // p002l.w2m
    @NonNull
    /* JADX INFO: renamed from: f */
    public hqv mo9808f() {
        return (hqv) this.f21172a.c();
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: g */
    public c<hqv> mo9809g() {
        return this.f21172a.d();
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: i */
    public void mo9810i(r8d0 r8d0Var, boolean z) {
        this.f21173b = r8d0Var;
        if (z) {
            m24012q(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m24014o(hqv hqvVar, g6n0 g6n0Var) {
        hqvVar.m14724q(g6n0Var);
        this.f21172a.e(hqvVar);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m24015p(final g6n0 g6n0Var) {
        this.f21172a.a(new e30() { // from class: l.uio0
            public final void call(Object obj) {
                ((hqv) obj).m14724q(g6n0Var);
            }
        });
    }
}
