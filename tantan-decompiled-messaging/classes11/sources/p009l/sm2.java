package p009l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlILikeUserItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xma;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class sm2<V extends s7m> extends jq2<V> implements ntl {

    /* JADX INFO: renamed from: a */
    public boolean f20358a;

    /* JADX INFO: renamed from: b */
    public LikeUser f20359b;

    public sm2(mcr mcrVar) {
        super(mcrVar);
        this.f20358a = false;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m22260g0(IntlILikeUserItemView intlILikeUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            intlILikeUserItemView.f6782c.setVisibility(0);
        } else {
            intlILikeUserItemView.f6782c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m22265l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ PaymentResultWrapper m22266m0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m22267n0(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[PHI: r3
      0x0072: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:22:0x0047, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void m22273F0(int i, Intent intent) {
        String str;
        User userPa;
        String str2;
        LikeUser likeUser = this.f20359b;
        if (likeUser == null || (userPa = CoreModule.c.e0.Pa((str = likeUser.userId))) == null || vwb.J(userPa.pictures)) {
            return;
        }
        int intExtra = 0;
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        String str3 = ((Media) userPa.pictures.get(0)).url;
        if (intent != null) {
            intExtra = intent.getIntExtra(CoreMemberModule.F().b().bo(), 0);
            String stringExtra = intent.getStringExtra(CoreMemberModule.F().b().ch());
            if (TextUtils.isEmpty(stringExtra)) {
                str2 = str3;
            } else {
                str2 = stringExtra;
            }
        } else {
            str2 = str3;
        }
        CoreMemberModule.F().b().Qd(mo11582q0(), z, z2, intExtra, str2, z2 ? m22283x0(intent, str) : null, userPa, this.f20359b, mo11586t0(), new gm2(this));
        this.f20359b = null;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m22270C0(int i) {
        return i == CoreModule.l.a().Ck();
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m22271D0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m22272E0(int i) {
        return i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.LEFT.getValue() || i == SwipeDirection.UP.getValue();
    }

    @Override // p009l.ntl
    /* JADX INFO: renamed from: G */
    public void mo19516G(LikeUser likeUser, IntlILikeUserItemView intlILikeUserItemView) {
        mo11575Q0();
        if (xma.e4()) {
            CoreModule.P().a().qm(mo11582q0(), mo11584s0(), Privilege.liked_user, (e30) null);
        } else {
            this.f20359b = likeUser;
            mo11577S0(likeUser, intlILikeUserItemView);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m22274G0(Pair pair) {
        this.f20358a = ((Boolean) pair.second).booleanValue();
        mo11572L0((List) pair.first);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m22275H0(PaymentResultWrapper paymentResultWrapper) {
        mo11571J0();
        m22277N0();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m22276I0(int i, int i2, Intent intent) {
        if (m22270C0(i)) {
            return m22285z0(i2, intent);
        }
        if (i == 786) {
            return m22284y0(i2, intent);
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public abstract void mo11571J0();

    @Override // p009l.ntl
    /* JADX INFO: renamed from: K */
    public void mo19517K(LikeUser likeUser) {
        if (mo11573O0(likeUser)) {
            CoreModule.c.a1.A(likeUser.userId);
            if (mo11583r0() <= 0) {
                mo11574P0(null);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public abstract void mo11572L0(List<LikeUser> list);

    @Override // p009l.ntl
    /* JADX INFO: renamed from: N */
    public void mo19518N(LikeUser likeUser, User user) {
        if (vwb.J(user.pictures)) {
            return;
        }
        mo11576R0(((DbObject) user).id);
        CoreMemberModule.F().b().Qd(mo11582q0(), true, true, 0, ((Media) user.picture(0).cover()).url, (String) null, user, likeUser, mo11586t0(), new gm2(this));
    }

    /* JADX INFO: renamed from: N0 */
    public void m22277N0() {
        CoreModule.c.a1.j();
        CoreModule.c.a1.k();
        CoreModule.c.a1.x(1, 20);
    }

    /* JADX INFO: renamed from: O0 */
    public abstract boolean mo11573O0(LikeUser likeUser);

    /* JADX INFO: renamed from: P0 */
    public abstract void mo11574P0(List<LikeUser> list);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo11575Q0();

    /* JADX INFO: renamed from: R0 */
    public abstract void mo11576R0(String str);

    /* JADX INFO: renamed from: S0 */
    public void mo11577S0(LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView) {
        CoreModule.P().a().s7(mo11582q0(), likeUser.userId, intlILikeUserItemView, new e30() { // from class: l.im2
            public final void call(Object obj) {
                sm2.m22260g0(intlILikeUserItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public void m22278U0() {
        duringCreated(CoreModule.c.a1.l()).subscribe(mkd0.H(new e30() { // from class: l.km2
            public final void call(Object obj) {
                this.f15762a.m22274G0((Pair) obj);
            }
        }, new e30() { // from class: l.lm2
            public final void call(Object obj) {
                sm2.m22267n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public void m22279V0() {
        duringCreated(CoreModule.P().g().On().filter(new w9j() { // from class: l.mm2
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f16993a.m22271D0((PaymentResultWrapper) obj));
            }
        }).switchMap(new w9j() { // from class: l.nm2
            public final Object call(Object obj) {
                return this.f17575a.m22280W0((PaymentResultWrapper) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.om2
            public final void call(Object obj) {
                this.f18169a.m22275H0((PaymentResultWrapper) obj);
            }
        }, new e30() { // from class: l.pm2
            public final void call(Object obj) {
                sm2.m22265l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public final c<PaymentResultWrapper> m22280W0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? c.just(paymentResultWrapper) : CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.hm2
            public final Object call(Object obj) {
                return sm2.m22266m0(paymentResultWrapper, (List) obj);
            }
        });
    }

    @Override // p009l.ntl
    /* JADX INFO: renamed from: b */
    public void mo19519b() {
        if (this.f20358a) {
            int iMo11583r0 = mo11583r0() + 1;
            CoreModule.c.a1.k();
            CoreModule.c.a1.x(iMo11583r0, 20);
        }
    }

    @Override // p009l.ntl
    /* JADX INFO: renamed from: g */
    public boolean mo19520g() {
        return this.f20358a;
    }

    @Override // p009l.ntl
    /* JADX INFO: renamed from: o */
    public boolean mo19521o(User user) {
        return CoreModule.c.a1.n(((DbObject) user).id) == null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m22281p0(final Runnable runnable) {
        lifecycle().takeFirst(new w9j() { // from class: l.qm2
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.rm2
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public abstract Act mo11582q0();

    /* JADX INFO: renamed from: r0 */
    public abstract int mo11583r0();

    /* JADX INFO: renamed from: s0 */
    public abstract String mo11584s0();

    /* JADX INFO: renamed from: t0 */
    public abstract String mo11586t0();

    /* JADX INFO: renamed from: u0 */
    public void m22282u0() {
        LikeUser likeUser = this.f20359b;
        if (likeUser == null) {
            return;
        }
        mo19517K(likeUser);
        this.f20359b = null;
    }

    /* JADX INFO: renamed from: x0 */
    public String m22283x0(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(CoreModule.l.a().gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.l.a().L8());
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m22284y0(int i, Intent intent) {
        CoreMemberModule.F().b().Jb(mo11582q0(), i, intent);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m22285z0(final int i, final Intent intent) {
        if (i == SwipeDirection.REMOVE.getValue()) {
            m22281p0(new Runnable() { // from class: l.fm2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13083a.m22282u0();
                }
            });
            return true;
        }
        if (!m22272E0(i)) {
            return false;
        }
        m22281p0(new Runnable() { // from class: l.jm2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15224a.m22273F0(i, intent);
            }
        });
        return true;
    }

    public void destroy() {
    }
}
