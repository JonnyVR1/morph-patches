package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import java.util.Collection;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class vio0 implements w2m {

    /* JADX INFO: renamed from: b */
    public r8d0 f181623b;

    /* JADX INFO: renamed from: c */
    public final String f181624c;

    /* JADX INFO: renamed from: d */
    public final String f181625d;

    /* JADX INFO: renamed from: e */
    public final Frag f181626e;

    /* JADX INFO: renamed from: f */
    public final wio0 f181627f;

    /* JADX INFO: renamed from: a */
    public final ff3<hqv> f181622a = new ff3<>(hqv.m132593g());

    /* JADX INFO: renamed from: g */
    public final bs5 f181628g = new bs5();

    /* JADX INFO: renamed from: l.vio0$a */
    public static /* synthetic */ class C20648a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f181629a;

        static {
            int[] iArr = new int[JumpRoomType.values().length];
            f181629a = iArr;
            try {
                iArr[JumpRoomType.END_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public vio0(Frag frag, String str, String str2) {
        this.f181626e = frag;
        this.f181624c = str;
        this.f181625d = str2;
        this.f181627f = new wio0(str, str2);
    }

    /* JADX INFO: renamed from: q */
    private void m198592q(r8d0 r8d0Var) {
        if (r8d0Var == null) {
            return;
        }
        final hqv hqvVar = new hqv(r8d0Var.f187610c, r8d0Var.f187609b, r8d0Var.f187608a);
        hqvVar.m132594f(r8d0Var.f187610c.f44323id);
        this.f181628g.m103655a(this.f181626e.duringCreated(this.f181627f.m203342a(r8d0Var)).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.tio0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170598a.m198594o(hqvVar, (g6n0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: r */
    private void m198593r() {
        this.f181628g.m103655a(this.f181626e.duringCreated(this.f181627f.m203343b(this.f181622a.m121102c().m132602o())).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.rio0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159574a.m198595p((g6n0) obj);
            }
        })));
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: a */
    public void mo96928a() {
        this.f181628g.m103657c();
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: b */
    public void mo96929b(final Collection<String> collection) {
        this.f181622a.m121100a(new e30() { // from class: l.qio0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((hqv) obj).m132605r(collection);
            }
        });
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: c */
    public void mo96930c(int i) {
        int iM132601n = mo96933f().m132601n();
        if (iM132601n == 0) {
            m198592q(this.f181623b);
        } else if (i > iM132601n - 3) {
            m198593r();
        }
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: d */
    public void mo96931d(JumpRoomData jumpRoomData) {
        if (C20648a.f181629a[jumpRoomData.getJumpRoomType().ordinal()] != 1) {
            return;
        }
        mo96929b(jumpRoomData.getLiveIdNeedToRemove());
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: e */
    public void mo96932e(final r8d0 r8d0Var) {
        this.f181622a.m121100a(new e30() { // from class: l.sio0
            @Override // p149l.e30
            public final void call(Object obj) {
                r8d0 r8d0Var2 = r8d0Var;
                ((hqv) obj).m132608u(r8d0Var2.f187610c, r8d0Var2.f187609b, r8d0Var2.f187608a);
            }
        });
    }

    @Override // p149l.w2m
    @NonNull
    /* JADX INFO: renamed from: f */
    public hqv mo96933f() {
        return this.f181622a.m121102c();
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: g */
    public C22306c<hqv> mo96934g() {
        return this.f181622a.m121103d();
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: i */
    public void mo96935i(r8d0 r8d0Var, boolean z) {
        this.f181623b = r8d0Var;
        if (z) {
            m198592q(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m198594o(hqv hqvVar, g6n0 g6n0Var) {
        hqvVar.m132604q(g6n0Var);
        this.f181622a.m121104e(hqvVar);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m198595p(final g6n0 g6n0Var) {
        this.f181622a.m121100a(new e30() { // from class: l.uio0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((hqv) obj).m132604q(g6n0Var);
            }
        });
    }
}
