package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlILikeUserItemView;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p137rx.C22421c;
import p153l.iam;

/* JADX INFO: loaded from: classes3.dex */
public abstract class an2<V extends iam> extends ar2<V> implements bwl {

    /* JADX INFO: renamed from: a */
    public boolean f72303a;

    /* JADX INFO: renamed from: b */
    public LikeUser f72304b;

    public an2(ner nerVar) {
        super(nerVar);
        this.f72303a = false;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m98884g0(IntlILikeUserItemView intlILikeUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            intlILikeUserItemView.f30679c.setVisibility(0);
        } else {
            intlILikeUserItemView.f30679c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m98889l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ PaymentResultWrapper m98890m0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m98891n0(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[PHI: r3
      0x0072: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:22:0x0047, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void m98897F0(int i, Intent intent) {
        String str;
        User userM116503Pa;
        String str2;
        LikeUser likeUser = this.f72304b;
        if (likeUser == null || (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa((str = likeUser.userId))) == null || jyb.m147479J(userM116503Pa.pictures)) {
            return;
        }
        int intExtra = 0;
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        String str3 = userM116503Pa.pictures.get(0).url;
        if (intent != null) {
            intExtra = intent.getIntExtra(CoreMemberModule.m37004F().m187693b().mo36988bo(), 0);
            String stringExtra = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36990ch());
            if (TextUtils.isEmpty(stringExtra)) {
                str2 = str3;
            } else {
                str2 = stringExtra;
            }
        } else {
            str2 = str3;
        }
        CoreMemberModule.m37004F().m187693b().mo36979Qd(mo98919q0(), z, z2, intExtra, str2, z2 ? m98924x0(intent, str) : null, userM116503Pa, this.f72304b, mo98922t0(), new om2(this));
        this.f72304b = null;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m98894C0(int i) {
        return i == CoreModule.f18273l.m143405a().mo34302Ck();
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m98895D0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m98896E0(int i) {
        return i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.LEFT.getValue() || i == SwipeDirection.UP.getValue();
    }

    @Override // p153l.bwl
    /* JADX INFO: renamed from: G */
    public void mo98898G(LikeUser likeUser, IntlILikeUserItemView intlILikeUserItemView) {
        mo98909Q0();
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34575qm(mo98919q0(), mo98921s0(), Privilege.liked_user, null);
        } else {
            this.f72304b = likeUser;
            mo98911S0(likeUser, intlILikeUserItemView);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m98899G0(Pair pair) {
        this.f72303a = ((Boolean) pair.second).booleanValue();
        mo98904L0((List) pair.first);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m98900H0(PaymentResultWrapper paymentResultWrapper) {
        mo98902J0();
        m98906N0();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m98901I0(int i, int i2, Intent intent) {
        if (m98894C0(i)) {
            return m98926z0(i2, intent);
        }
        if (i == 786) {
            return m98925y0(i2, intent);
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public abstract void mo98902J0();

    @Override // p153l.bwl
    /* JADX INFO: renamed from: K */
    public void mo98903K(LikeUser likeUser) {
        if (mo98907O0(likeUser)) {
            CoreModule.f18264c.f20370a1.m180094A(likeUser.userId);
            if (mo98920r0() <= 0) {
                mo98908P0(null);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public abstract void mo98904L0(List<LikeUser> list);

    @Override // p153l.bwl
    /* JADX INFO: renamed from: N */
    public void mo98905N(LikeUser likeUser, User user) {
        if (jyb.m147479J(user.pictures)) {
            return;
        }
        mo98910R0(user.f56859id);
        CoreMemberModule.m37004F().m187693b().mo36979Qd(mo98919q0(), true, true, 0, user.picture(0).cover().url, null, user, likeUser, mo98922t0(), new om2(this));
    }

    /* JADX INFO: renamed from: N0 */
    public void m98906N0() {
        CoreModule.f18264c.f20370a1.m180095j();
        CoreModule.f18264c.f20370a1.m180096k();
        CoreModule.f18264c.f20370a1.m180109x(1, 20);
    }

    /* JADX INFO: renamed from: O0 */
    public abstract boolean mo98907O0(LikeUser likeUser);

    /* JADX INFO: renamed from: P0 */
    public abstract void mo98908P0(List<LikeUser> list);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo98909Q0();

    /* JADX INFO: renamed from: R0 */
    public abstract void mo98910R0(String str);

    /* JADX INFO: renamed from: S0 */
    public void mo98911S0(LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView) {
        CoreModule.m30933P().m143405a().mo34588s7(mo98919q0(), likeUser.userId, intlILikeUserItemView, new y20() { // from class: l.qm2
            @Override // p153l.y20
            public final void call(Object obj) {
                an2.m98884g0(intlILikeUserItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public void m98912U0() {
        duringCreated(CoreModule.f18264c.f20370a1.m180097l()).subscribe(psd0.m173597H(new y20() { // from class: l.sm2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169487a.m98899G0((Pair) obj);
            }
        }, new y20() { // from class: l.tm2
            @Override // p153l.y20
            public final void call(Object obj) {
                an2.m98891n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public void m98913V0() {
        duringCreated(CoreModule.m30933P().m143410g().mo36025On().filter(new qcj() { // from class: l.um2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f179595a.m98895D0((PaymentResultWrapper) obj));
            }
        }).switchMap(new qcj() { // from class: l.vm2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184660a.m98914W0((PaymentResultWrapper) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.wm2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189759a.m98900H0((PaymentResultWrapper) obj);
            }
        }, new y20() { // from class: l.xm2
            @Override // p153l.y20
            public final void call(Object obj) {
                an2.m98889l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public final C22421c<PaymentResultWrapper> m98914W0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22421c.just(paymentResultWrapper) : CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.pm2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return an2.m98890m0(paymentResultWrapper, (List) obj);
            }
        });
    }

    @Override // p153l.bwl
    /* JADX INFO: renamed from: b */
    public void mo98915b() {
        if (this.f72303a) {
            int iMo98920r0 = mo98920r0() + 1;
            CoreModule.f18264c.f20370a1.m180096k();
            CoreModule.f18264c.f20370a1.m180109x(iMo98920r0, 20);
        }
    }

    @Override // p153l.bwl
    /* JADX INFO: renamed from: g */
    public boolean mo98916g() {
        return this.f72303a;
    }

    @Override // p153l.bwl
    /* JADX INFO: renamed from: o */
    public boolean mo98917o(User user) {
        return CoreModule.f18264c.f20370a1.m180099n(user.f56859id) == null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m98918p0(final Runnable runnable) {
        lifecycle().takeFirst(new qcj() { // from class: l.ym2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zm2
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public abstract Act mo98919q0();

    /* JADX INFO: renamed from: r0 */
    public abstract int mo98920r0();

    /* JADX INFO: renamed from: s0 */
    public abstract String mo98921s0();

    /* JADX INFO: renamed from: t0 */
    public abstract String mo98922t0();

    /* JADX INFO: renamed from: u0 */
    public void m98923u0() {
        LikeUser likeUser = this.f72304b;
        if (likeUser == null) {
            return;
        }
        mo98903K(likeUser);
        this.f72304b = null;
    }

    /* JADX INFO: renamed from: x0 */
    public String m98924x0(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34509gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34360L8());
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m98925y0(int i, Intent intent) {
        CoreMemberModule.m37004F().m187693b().mo36975Jb(mo98919q0(), i, intent);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m98926z0(final int i, final Intent intent) {
        if (i == SwipeDirection.REMOVE.getValue()) {
            m98918p0(new Runnable() { // from class: l.nm2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f142613a.m98923u0();
                }
            });
            return true;
        }
        if (!m98896E0(i)) {
            return false;
        }
        m98918p0(new Runnable() { // from class: l.rm2
            @Override // java.lang.Runnable
            public final void run() {
                this.f163820a.m98897F0(i, intent);
            }
        });
        return true;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
