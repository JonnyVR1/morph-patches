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
import l.jo0;
import l.r8d0;
import l.t9u;
import l.wq2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ait implements w2m {

    /* JADX INFO: renamed from: b */
    public final Frag f7646b;

    /* JADX INFO: renamed from: c */
    public final String f7647c;

    /* JADX INFO: renamed from: d */
    public final String f7648d;

    /* JADX INFO: renamed from: e */
    public r8d0 f7649e;

    /* JADX INFO: renamed from: f */
    public final bit f7650f;

    /* JADX INFO: renamed from: a */
    public final ff3<hqv> f7645a = new ff3<>(hqv.m14713g());

    /* JADX INFO: renamed from: g */
    public final bs5 f7651g = new bs5();

    /* JADX INFO: renamed from: h */
    public final String f7652h = getClass().getSimpleName();

    /* JADX INFO: renamed from: l.ait$a */
    public static /* synthetic */ class C0489a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7653a;

        static {
            int[] iArr = new int[JumpRoomType.values().length];
            f7653a = iArr;
            try {
                iArr[JumpRoomType.END_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ait(Frag frag, String str, String str2) {
        this.f7646b = frag;
        this.f7647c = str;
        this.f7648d = str2;
        this.f7650f = new bit(str, str2);
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: a */
    public void mo9803a() {
        this.f7651g.c();
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: b */
    public void mo9804b(final Collection<String> collection) {
        this.f7645a.a(new e30() { // from class: l.vht
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
            m9813r(this.f7649e);
        } else {
            if (i == -1 || i <= iM14721n - 4) {
                return;
            }
            m9814s();
        }
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: d */
    public void mo9806d(JumpRoomData jumpRoomData) {
        if (C0489a.f7653a[jumpRoomData.getJumpRoomType().ordinal()] != 1) {
            return;
        }
        mo9804b(jumpRoomData.getLiveIdNeedToRemove());
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: e */
    public void mo9807e(final r8d0 r8d0Var) {
        this.f7645a.a(new e30() { // from class: l.yht
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
        return (hqv) this.f7645a.c();
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: g */
    public c<hqv> mo9809g() {
        return this.f7645a.d();
    }

    @Override // p002l.w2m
    /* JADX INFO: renamed from: i */
    public void mo9810i(final r8d0 r8d0Var, boolean z) {
        this.f7649e = r8d0Var;
        if (z) {
            m9813r(r8d0Var);
        } else {
            this.f7645a.a(new e30() { // from class: l.xht
                public final void call(Object obj) {
                    ((hqv) obj).m14714f(((wq2) r8d0Var).c.id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m9811p(hqv hqvVar, t9u t9uVar) {
        hqvVar.m14723p(t9uVar);
        this.f7645a.e(hqvVar);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m9812q(final t9u t9uVar) {
        this.f7645a.a(new e30() { // from class: l.zht
            public final void call(Object obj) {
                ((hqv) obj).m14723p(t9uVar);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m9813r(r8d0 r8d0Var) {
        if (r8d0Var == null) {
            return;
        }
        final hqv hqvVar = new hqv(((wq2) r8d0Var).c, ((wq2) r8d0Var).b, ((wq2) r8d0Var).a);
        hqvVar.m14714f(((wq2) r8d0Var).c.id);
        this.f7651g.a(this.f7646b.duringCreated(this.f7650f.m10376b()).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.uht
            public final void call(Object obj) {
                this.f20659a.m9811p(hqvVar, (t9u) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public final void m9814s() {
        this.f7651g.a(this.f7646b.duringCreated(this.f7650f.m10377c(((hqv) this.f7645a.c()).m14717j())).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.wht
            public final void call(Object obj) {
                this.f21784a.m9812q((t9u) obj);
            }
        })));
    }
}
