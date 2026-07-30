package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import java.util.Collection;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class zro0 implements o5m {

    /* JADX INFO: renamed from: b */
    public ugd0 f205779b;

    /* JADX INFO: renamed from: c */
    public final String f205780c;

    /* JADX INFO: renamed from: d */
    public final String f205781d;

    /* JADX INFO: renamed from: e */
    public final Frag f205782e;

    /* JADX INFO: renamed from: f */
    public final aso0 f205783f;

    /* JADX INFO: renamed from: a */
    public final tf3<isv> f205778a = new tf3<>(isv.m141975g());

    /* JADX INFO: renamed from: g */
    public final ft5 f205784g = new ft5();

    /* JADX INFO: renamed from: l.zro0$a */
    public static /* synthetic */ class C21872a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f205785a;

        static {
            int[] iArr = new int[JumpRoomType.values().length];
            f205785a = iArr;
            try {
                iArr[JumpRoomType.END_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public zro0(Frag frag, String str, String str2) {
        this.f205782e = frag;
        this.f205780c = str;
        this.f205781d = str2;
        this.f205783f = new aso0(str, str2);
    }

    /* JADX INFO: renamed from: q */
    private void m221173q(ugd0 ugd0Var) {
        if (ugd0Var == null) {
            return;
        }
        final isv isvVar = new isv(ugd0Var.f138293c, ugd0Var.f138292b, ugd0Var.f138291a);
        isvVar.m141976f(ugd0Var.f138293c.f45171id);
        this.f205784g.m127297a(this.f205782e.duringCreated(this.f205783f.m99961a(ugd0Var)).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.xro0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195942a.m221175o(isvVar, (kfn0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: r */
    private void m221174r() {
        this.f205784g.m127297a(this.f205782e.duringCreated(this.f205783f.m99962b(this.f205778a.m190910c().m141984o())).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.vro0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185505a.m221176p((kfn0) obj);
            }
        })));
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: a */
    public void mo104851a() {
        this.f205784g.m127299c();
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: b */
    public void mo104852b(final Collection<String> collection) {
        this.f205778a.m190908a(new y20() { // from class: l.uro0
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
            m221173q(this.f205779b);
        } else if (i > iM141983n - 3) {
            m221174r();
        }
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: d */
    public void mo104854d(JumpRoomData jumpRoomData) {
        if (C21872a.f205785a[jumpRoomData.getJumpRoomType().ordinal()] != 1) {
            return;
        }
        mo104852b(jumpRoomData.getLiveIdNeedToRemove());
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: e */
    public void mo104855e(final ugd0 ugd0Var) {
        this.f205778a.m190908a(new y20() { // from class: l.wro0
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
        return this.f205778a.m190910c();
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: g */
    public C22421c<isv> mo104857g() {
        return this.f205778a.m190911d();
    }

    @Override // p153l.o5m
    /* JADX INFO: renamed from: i */
    public void mo104858i(ugd0 ugd0Var, boolean z) {
        this.f205779b = ugd0Var;
        if (z) {
            m221173q(ugd0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m221175o(isv isvVar, kfn0 kfn0Var) {
        isvVar.m141986q(kfn0Var);
        this.f205778a.m190912e(isvVar);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m221176p(final kfn0 kfn0Var) {
        this.f205778a.m190908a(new y20() { // from class: l.yro0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((isv) obj).m141986q(kfn0Var);
            }
        });
    }
}
