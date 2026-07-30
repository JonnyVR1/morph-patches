package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import java.util.Collection;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class bkt implements o5m {

    /* JADX INFO: renamed from: b */
    public final Frag f77116b;

    /* JADX INFO: renamed from: c */
    public final String f77117c;

    /* JADX INFO: renamed from: d */
    public final String f77118d;

    /* JADX INFO: renamed from: e */
    public ugd0 f77119e;

    /* JADX INFO: renamed from: f */
    public final ckt f77120f;

    /* JADX INFO: renamed from: a */
    public final tf3<isv> f77115a = new tf3<>(isv.m141975g());

    /* JADX INFO: renamed from: g */
    public final ft5 f77121g = new ft5();

    /* JADX INFO: renamed from: h */
    public final String f77122h = getClass().getSimpleName();

    /* JADX INFO: renamed from: l.bkt$a */
    public static /* synthetic */ class C16030a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77123a;

        static {
            int[] iArr = new int[JumpRoomType.values().length];
            f77123a = iArr;
            try {
                iArr[JumpRoomType.END_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public bkt(Frag frag, String str, String str2) {
        this.f77116b = frag;
        this.f77117c = str;
        this.f77118d = str2;
        this.f77120f = new ckt(str, str2);
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: a */
    public void mo104851a() {
        this.f77121g.m127299c();
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: b */
    public void mo104852b(final Collection<String> collection) {
        this.f77115a.m190908a(new y20() { // from class: l.wjt
            @Override // p153l.y20
            public final void call(Object obj) {
                ((isv) obj).m141987r(collection);
            }
        });
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: c */
    public void mo104853c(int i) {
        int iM141983n = mo104856f().m141983n();
        if (iM141983n == 0) {
            m104861r(this.f77119e);
        } else {
            if (i == -1 || i <= iM141983n - 4) {
                return;
            }
            m104862s();
        }
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: d */
    public void mo104854d(JumpRoomData jumpRoomData) {
        if (C16030a.f77123a[jumpRoomData.getJumpRoomType().ordinal()] != 1) {
            return;
        }
        mo104852b(jumpRoomData.getLiveIdNeedToRemove());
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: e */
    public void mo104855e(final ugd0 ugd0Var) {
        this.f77115a.m190908a(new y20() { // from class: l.zjt
            @Override // p153l.y20
            public final void call(Object obj) {
                ugd0 ugd0Var2 = ugd0Var;
                ((isv) obj).m141990u(ugd0Var2.f138293c, ugd0Var2.f138292b, ugd0Var2.f138291a);
            }
        });
    }

    @Override // p153l.o5m
    @NonNull
    /* JADX INFO: renamed from: f */
    public isv mo104856f() {
        return this.f77115a.m190910c();
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: g */
    public C22421c<isv> mo104857g() {
        return this.f77115a.m190911d();
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: i */
    public void mo104858i(final ugd0 ugd0Var, boolean z) {
        this.f77119e = ugd0Var;
        if (z) {
            m104861r(ugd0Var);
        } else {
            this.f77115a.m190908a(new y20() { // from class: l.yjt
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((isv) obj).m141976f(ugd0Var.f138293c.f45171id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m104859p(isv isvVar, ubu ubuVar) {
        isvVar.m141985p(ubuVar);
        this.f77115a.m190912e(isvVar);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m104860q(final ubu ubuVar) {
        this.f77115a.m190908a(new y20() { // from class: l.akt
            @Override // p153l.y20
            public final void call(Object obj) {
                ((isv) obj).m141985p(ubuVar);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m104861r(ugd0 ugd0Var) {
        if (ugd0Var == null) {
            return;
        }
        final isv isvVar = new isv(ugd0Var.f138293c, ugd0Var.f138292b, ugd0Var.f138291a);
        isvVar.m141976f(ugd0Var.f138293c.f45171id);
        this.f77121g.m127297a(this.f77116b.duringCreated(this.f77120f.m110389b()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.vjt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184442a.m104859p(isvVar, (ubu) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public final void m104862s() {
        this.f77121g.m127297a(this.f77116b.duringCreated(this.f77120f.m110390c(this.f77115a.m190910c().m141979j())).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.xjt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194644a.m104860q((ubu) obj);
            }
        })));
    }
}
