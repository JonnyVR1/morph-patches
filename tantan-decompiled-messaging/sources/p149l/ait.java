package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import java.util.Collection;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class ait implements w2m {

    /* JADX INFO: renamed from: b */
    public final Frag f70058b;

    /* JADX INFO: renamed from: c */
    public final String f70059c;

    /* JADX INFO: renamed from: d */
    public final String f70060d;

    /* JADX INFO: renamed from: e */
    public r8d0 f70061e;

    /* JADX INFO: renamed from: f */
    public final bit f70062f;

    /* JADX INFO: renamed from: a */
    public final ff3<hqv> f70057a = new ff3<>(hqv.m132593g());

    /* JADX INFO: renamed from: g */
    public final bs5 f70063g = new bs5();

    /* JADX INFO: renamed from: h */
    public final String f70064h = getClass().getSimpleName();

    /* JADX INFO: renamed from: l.ait$a */
    public static /* synthetic */ class C15637a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70065a;

        static {
            int[] iArr = new int[JumpRoomType.values().length];
            f70065a = iArr;
            try {
                iArr[JumpRoomType.END_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ait(Frag frag, String str, String str2) {
        this.f70058b = frag;
        this.f70059c = str;
        this.f70060d = str2;
        this.f70062f = new bit(str, str2);
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: a */
    public void mo96928a() {
        this.f70063g.m103657c();
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: b */
    public void mo96929b(final Collection<String> collection) {
        this.f70057a.m121100a(new e30() { // from class: l.vht
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
            m96938r(this.f70061e);
        } else {
            if (i == -1 || i <= iM132601n - 4) {
                return;
            }
            m96939s();
        }
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: d */
    public void mo96931d(JumpRoomData jumpRoomData) {
        if (C15637a.f70065a[jumpRoomData.getJumpRoomType().ordinal()] != 1) {
            return;
        }
        mo96929b(jumpRoomData.getLiveIdNeedToRemove());
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: e */
    public void mo96932e(final r8d0 r8d0Var) {
        this.f70057a.m121100a(new e30() { // from class: l.yht
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
        return this.f70057a.m121102c();
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: g */
    public C22306c<hqv> mo96934g() {
        return this.f70057a.m121103d();
    }

    @Override // p149l.w2m
    /* JADX INFO: renamed from: i */
    public void mo96935i(final r8d0 r8d0Var, boolean z) {
        this.f70061e = r8d0Var;
        if (z) {
            m96938r(r8d0Var);
        } else {
            this.f70057a.m121100a(new e30() { // from class: l.xht
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((hqv) obj).m132594f(r8d0Var.f187610c.f44323id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m96936p(hqv hqvVar, t9u t9uVar) {
        hqvVar.m132603p(t9uVar);
        this.f70057a.m121104e(hqvVar);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m96937q(final t9u t9uVar) {
        this.f70057a.m121100a(new e30() { // from class: l.zht
            @Override // p149l.e30
            public final void call(Object obj) {
                ((hqv) obj).m132603p(t9uVar);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m96938r(r8d0 r8d0Var) {
        if (r8d0Var == null) {
            return;
        }
        final hqv hqvVar = new hqv(r8d0Var.f187610c, r8d0Var.f187609b, r8d0Var.f187608a);
        hqvVar.m132594f(r8d0Var.f187610c.f44323id);
        this.f70063g.m103655a(this.f70058b.duringCreated(this.f70062f.m102121b()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.uht
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176591a.m96936p(hqvVar, (t9u) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public final void m96939s() {
        this.f70063g.m103655a(this.f70058b.duringCreated(this.f70062f.m102122c(this.f70057a.m121102c().m132597j())).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.wht
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186464a.m96937q((t9u) obj);
            }
        })));
    }
}
