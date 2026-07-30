package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlILikeUserItemView;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.C22306c;
import p149l.s7m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sm2<V extends s7m> extends jq2<V> implements ntl {

    /* JADX INFO: renamed from: a */
    public boolean f165318a;

    /* JADX INFO: renamed from: b */
    public LikeUser f165319b;

    public sm2(mcr mcrVar) {
        super(mcrVar);
        this.f165318a = false;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m184903g0(IntlILikeUserItemView intlILikeUserItemView, Boolean bool) {
        if (bool.booleanValue()) {
            intlILikeUserItemView.f29831c.setVisibility(0);
        } else {
            intlILikeUserItemView.f29831c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m184908l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ PaymentResultWrapper m184909m0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m184910n0(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[PHI: r3
      0x0072: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:22:0x0047, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void m184916F0(int i, Intent intent) {
        String str;
        User userM169430Pa;
        String str2;
        LikeUser likeUser = this.f165319b;
        if (likeUser == null || (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa((str = likeUser.userId))) == null || vwb.m200296J(userM169430Pa.pictures)) {
            return;
        }
        int intExtra = 0;
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        String str3 = userM169430Pa.pictures.get(0).url;
        if (intent != null) {
            intExtra = intent.getIntExtra(CoreMemberModule.m36001F().m132651b().mo35985bo(), 0);
            String stringExtra = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35987ch());
            if (TextUtils.isEmpty(stringExtra)) {
                str2 = str3;
            } else {
                str2 = stringExtra;
            }
        } else {
            str2 = str3;
        }
        CoreMemberModule.m36001F().m132651b().mo35976Qd(mo98157q0(), z, z2, intExtra, str2, z2 ? m184926x0(intent, str) : null, userM169430Pa, this.f165319b, mo98161t0(), new gm2(this));
        this.f165319b = null;
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m184913C0(int i) {
        return i == CoreModule.f17554l.m94651a().mo33299Ck();
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m184914D0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m184915E0(int i) {
        return i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.LEFT.getValue() || i == SwipeDirection.UP.getValue();
    }

    @Override // p149l.ntl
    /* JADX INFO: renamed from: G */
    public void mo161388G(LikeUser likeUser, IntlILikeUserItemView intlILikeUserItemView) {
        mo98152Q0();
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33572qm(mo98157q0(), mo98159s0(), Privilege.liked_user, null);
        } else {
            this.f165319b = likeUser;
            mo98154S0(likeUser, intlILikeUserItemView);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m184917G0(Pair pair) {
        this.f165318a = ((Boolean) pair.second).booleanValue();
        mo98149L0((List) pair.first);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m184918H0(PaymentResultWrapper paymentResultWrapper) {
        mo98148J0();
        m184920N0();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m184919I0(int i, int i2, Intent intent) {
        if (m184913C0(i)) {
            return m184928z0(i2, intent);
        }
        if (i == 786) {
            return m184927y0(i2, intent);
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public abstract void mo98148J0();

    @Override // p149l.ntl
    /* JADX INFO: renamed from: K */
    public void mo161389K(LikeUser likeUser) {
        if (mo98150O0(likeUser)) {
            CoreModule.f17545c.f19628a1.m134575A(likeUser.userId);
            if (mo98158r0() <= 0) {
                mo98151P0(null);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public abstract void mo98149L0(List<LikeUser> list);

    @Override // p149l.ntl
    /* JADX INFO: renamed from: N */
    public void mo161390N(LikeUser likeUser, User user) {
        if (vwb.m200296J(user.pictures)) {
            return;
        }
        mo98153R0(user.f56011id);
        CoreMemberModule.m36001F().m132651b().mo35976Qd(mo98157q0(), true, true, 0, user.picture(0).cover().url, null, user, likeUser, mo98161t0(), new gm2(this));
    }

    /* JADX INFO: renamed from: N0 */
    public void m184920N0() {
        CoreModule.f17545c.f19628a1.m134576j();
        CoreModule.f17545c.f19628a1.m134577k();
        CoreModule.f17545c.f19628a1.m134590x(1, 20);
    }

    /* JADX INFO: renamed from: O0 */
    public abstract boolean mo98150O0(LikeUser likeUser);

    /* JADX INFO: renamed from: P0 */
    public abstract void mo98151P0(List<LikeUser> list);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo98152Q0();

    /* JADX INFO: renamed from: R0 */
    public abstract void mo98153R0(String str);

    /* JADX INFO: renamed from: S0 */
    public void mo98154S0(LikeUser likeUser, final IntlILikeUserItemView intlILikeUserItemView) {
        CoreModule.m29935P().m94651a().mo33585s7(mo98157q0(), likeUser.userId, intlILikeUserItemView, new e30() { // from class: l.im2
            @Override // p149l.e30
            public final void call(Object obj) {
                sm2.m184903g0(intlILikeUserItemView, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public void m184921U0() {
        duringCreated(CoreModule.f17545c.f19628a1.m134578l()).subscribe(mkd0.m154956H(new e30() { // from class: l.km2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123732a.m184917G0((Pair) obj);
            }
        }, new e30() { // from class: l.lm2
            @Override // p149l.e30
            public final void call(Object obj) {
                sm2.m184910n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public void m184922V0() {
        duringCreated(CoreModule.m29935P().m94656g().mo35022On().filter(new w9j() { // from class: l.mm2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f134546a.m184914D0((PaymentResultWrapper) obj));
            }
        }).switchMap(new w9j() { // from class: l.nm2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139607a.m184923W0((PaymentResultWrapper) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.om2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144577a.m184918H0((PaymentResultWrapper) obj);
            }
        }, new e30() { // from class: l.pm2
            @Override // p149l.e30
            public final void call(Object obj) {
                sm2.m184908l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    public final C22306c<PaymentResultWrapper> m184923W0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22306c.just(paymentResultWrapper) : CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.hm2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sm2.m184909m0(paymentResultWrapper, (List) obj);
            }
        });
    }

    @Override // p149l.ntl
    /* JADX INFO: renamed from: b */
    public void mo161391b() {
        if (this.f165318a) {
            int iMo98158r0 = mo98158r0() + 1;
            CoreModule.f17545c.f19628a1.m134577k();
            CoreModule.f17545c.f19628a1.m134590x(iMo98158r0, 20);
        }
    }

    @Override // p149l.ntl
    /* JADX INFO: renamed from: g */
    public boolean mo161392g() {
        return this.f165318a;
    }

    @Override // p149l.ntl
    /* JADX INFO: renamed from: o */
    public boolean mo161393o(User user) {
        return CoreModule.f17545c.f19628a1.m134580n(user.f56011id) == null;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m184924p0(final Runnable runnable) {
        lifecycle().takeFirst(new w9j() { // from class: l.qm2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.rm2
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public abstract Act mo98157q0();

    /* JADX INFO: renamed from: r0 */
    public abstract int mo98158r0();

    /* JADX INFO: renamed from: s0 */
    public abstract String mo98159s0();

    /* JADX INFO: renamed from: t0 */
    public abstract String mo98161t0();

    /* JADX INFO: renamed from: u0 */
    public void m184925u0() {
        LikeUser likeUser = this.f165319b;
        if (likeUser == null) {
            return;
        }
        mo161389K(likeUser);
        this.f165319b = null;
    }

    /* JADX INFO: renamed from: x0 */
    public String m184926x0(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33506gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33357L8());
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m184927y0(int i, Intent intent) {
        CoreMemberModule.m36001F().m132651b().mo35972Jb(mo98157q0(), i, intent);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m184928z0(final int i, final Intent intent) {
        if (i == SwipeDirection.REMOVE.getValue()) {
            m184924p0(new Runnable() { // from class: l.fm2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98237a.m184925u0();
                }
            });
            return true;
        }
        if (!m184915E0(i)) {
            return false;
        }
        m184924p0(new Runnable() { // from class: l.jm2
            @Override // java.lang.Runnable
            public final void run() {
                this.f118609a.m184916F0(i, intent);
            }
        });
        return true;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
