package p153l;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kkn0 extends LiveMenuDialogHolder<ckn0> {

    /* JADX INFO: renamed from: A */
    public Runnable f127240A;

    /* JADX INFO: renamed from: k */
    public VDraweeView f127241k;

    /* JADX INFO: renamed from: l */
    public View f127242l;

    /* JADX INFO: renamed from: m */
    public VText f127243m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f127244n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f127245o;

    /* JADX INFO: renamed from: p */
    public VText f127246p;

    /* JADX INFO: renamed from: q */
    public VText f127247q;

    /* JADX INFO: renamed from: r */
    public VText f127248r;

    /* JADX INFO: renamed from: s */
    public VText f127249s;

    /* JADX INFO: renamed from: t */
    public VText f127250t;

    /* JADX INFO: renamed from: u */
    public VText f127251u;

    /* JADX INFO: renamed from: v */
    public View f127252v;

    /* JADX INFO: renamed from: w */
    public View f127253w;

    /* JADX INFO: renamed from: x */
    public Animator f127254x;

    /* JADX INFO: renamed from: y */
    public View f127255y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f127256z;

    /* JADX INFO: renamed from: l.kkn0$a */
    public class RunnableC18198a implements Runnable {
        public RunnableC18198a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kkn0.this.f127254x != null) {
                kkn0.this.f127254x.start();
            }
        }
    }

    /* JADX INFO: renamed from: l.kkn0$b */
    public class C18199b extends fn2 {
        public C18199b() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            bnl0.m105505C0(kkn0.this.f127241k, (int) (bnl0.m105592y0() * (qimVar.getHeight() / qimVar.getWidth())));
        }
    }

    /* JADX INFO: renamed from: l.kkn0$d */
    public class C18201d implements aiv.C15716a.a {
        public C18201d() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            kkn0.this.mo73021p();
            o1j0.m165649w(R$string.f48414ud);
        }
    }

    public kkn0(ckn0 ckn0Var) {
        super(yec0.f198868O8, ckn0Var.act(), ckn0Var, qag0.m175924e(true));
        this.f127240A = new RunnableC18198a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public View m150283S() {
        View view = this.f127255y;
        View view2 = this.f127253w;
        return view == view2 ? this.f127252v : view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m150284T(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m150285g0() {
        it0.m142007A(this.f127254x);
        View view = this.f127255y;
        Property property = View.TRANSLATION_Y;
        Animator animatorM132168n = gt0.m132168n(view, property, 0.0f, -qa00.m175859d(21.0f));
        View view2 = this.f127255y;
        Property property2 = View.ALPHA;
        Animator animatorM132180z = gt0.m132180z(animatorM132168n, gt0.m132168n(view2, property2, 1.0f, 0.0f), gt0.m132168n(m150283S(), property, qa00.m175859d(21.0f), 0.0f), gt0.m132168n(m150283S(), property2, 0.0f, 1.0f));
        this.f127254x = animatorM132180z;
        it0.m142007A(animatorM132180z);
        this.f127254x.addListener(new C18200c());
        this.f127254x.setInterpolator(new LinearInterpolator());
        this.f127254x.setDuration(300L);
        l51.m152890J(this.f127240A);
        l51.m152888H(((ckn0) this.f48605b).act(), this.f127240A, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: r */
    private void m150286r() {
        bnl0.m105509E0(this.f127242l, new View.OnClickListener() { // from class: l.dkn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89422a.m150284T(view);
            }
        });
        qnp0.m177260c1(this.f127241k, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
    }

    /* JADX INFO: renamed from: R */
    public final void m150287R(View view) {
        this.f127241k = (VDraweeView) view.findViewById(mdc0.f135955I);
        this.f127242l = view.findViewById(mdc0.f135883A);
        this.f127243m = (VText) view.findViewById(mdc0.f136349y4);
        this.f127244n = (VDraweeView) view.findViewById(mdc0.f136150d2);
        this.f127245o = (VDraweeView) view.findViewById(mdc0.f136299t);
        this.f127248r = (VText) view.findViewById(mdc0.f136208j0);
        this.f127249s = (VText) view.findViewById(mdc0.f136188h0);
        this.f127250t = (VText) view.findViewById(mdc0.f135998M6);
        this.f127251u = (VText) view.findViewById(mdc0.f136007N6);
        this.f127247q = (VText) view.findViewById(mdc0.f136141c3);
        this.f127246p = (VText) view.findViewById(mdc0.f136161e3);
        this.f127252v = view.findViewById(mdc0.f136151d3);
        this.f127253w = view.findViewById(mdc0.f136131b3);
        this.f127256z = (VDraweeView) view.findViewById(mdc0.f136171f3);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m150288U(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        m150295b0(giftWallV3GiftWeekStarGiftMainDetail);
        m150299f0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m150289V(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m150297d0(giftWallV3GiftWeekStarGiftMainDetail, 1);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m150290W(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m150294a0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m150291X(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m150294a0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m150292Y(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        ((ckn0) this.f48605b).m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        T t = this.f48605b;
        ydn0.m215258k(t, ((rwn0) ((ckn0) t).m213810E2()).m168526j0(), giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.f54602id);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m150293Z(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m150297d0(giftWallV3GiftWeekStarGiftMainDetail, giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m150294a0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        T t = this.f48605b;
        ((ckn0) t).m110379W3(((ckn0) t).f82302j, giftWallV3GiftWeekStarGiftMainDetail.gift.f54601id, new y20() { // from class: l.ikn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115436a.m150288U((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    /* JADX INFO: renamed from: b0 */
    public void m150295b0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        View.OnClickListener onClickListener;
        izs.m142872w("context_livingAct", this.f127241k, giftWallV3GiftWeekStarGiftMainDetail.gift.bgImage, new C18199b());
        m150296c0(giftWallV3GiftWeekStarGiftMainDetail);
        this.f127251u.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.name);
        boolean z = giftWallV3GiftWeekStarGiftMainDetail.gift.canGift && giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum > 0;
        m150298e0(!z);
        izs.m142874y(this.f127244n, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        n3d0.m161285i(this.f127244n, !giftWallV3GiftWeekStarGiftMainDetail.gift.isOwned);
        boolean zIsEmpty = TextUtils.isEmpty(giftWallV3GiftWeekStarGiftMainDetail.gift.tips);
        VText vText = this.f127250t;
        if (zIsEmpty) {
            bnl0.m105525M0(vText, false);
        } else {
            bnl0.m105525M0(vText, true);
            this.f127250t.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.tips);
        }
        this.f127248r.setText(R$string.f48274o5);
        if (giftWallV3GiftWeekStarGiftMainDetail.gift.isOwned) {
            this.f127249s.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.sendGiftCount + "");
            this.f127249s.setTextSize(15.0f);
            izs.m142874y(this.f127245o, giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.avatar);
            boolean zEquals = zrv.f205799a.m207631D0().equals(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.f54602id);
            VText vText2 = this.f127243m;
            if (zEquals) {
                vText2.setText(R$string.f48370sd);
                if (z) {
                    onClickListener = new View.OnClickListener() { // from class: l.ekn0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f94415a.m150289V(giftWallV3GiftWeekStarGiftMainDetail, view);
                        }
                    };
                } else {
                    onClickListener = null;
                }
            } else {
                vText2.setText(R$string.f47710O0);
                if (z) {
                    onClickListener = new View.OnClickListener() { // from class: l.fkn0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f99534a.m150290W(giftWallV3GiftWeekStarGiftMainDetail, view);
                        }
                    };
                } else {
                    onClickListener = null;
                }
            }
        } else {
            this.f127245o.setController(null);
            this.f127249s.setText(R$string.f47941Z0);
            this.f127249s.setTextSize(10.0f);
            this.f127248r.setText(R$string.f48274o5);
            this.f127243m.setText(R$string.f48111gh);
            if (z) {
                onClickListener = new View.OnClickListener() { // from class: l.gkn0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f104754a.m150291X(giftWallV3GiftWeekStarGiftMainDetail, view);
                    }
                };
            } else {
                onClickListener = null;
            }
        }
        bnl0.m105509E0(this.f127243m, onClickListener);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser;
        if (userBean == null || TextUtils.isEmpty(userBean.f54602id)) {
            bnl0.m105509E0(this.f127245o, null);
        } else {
            bnl0.m105509E0(this.f127245o, new View.OnClickListener() { // from class: l.hkn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110441a.m150292Y(giftWallV3GiftWeekStarGiftMainDetail, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m150296c0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        izs.m142874y(this.f127256z, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.meUser;
        VText vText = this.f127247q;
        if (userBean != null) {
            vText.setText(giftWallV3GiftWeekStarGiftMainDetail.meUser.sendGiftCount + "");
        } else {
            vText.setText("0");
        }
        this.f127246p.setText("" + giftWallV3GiftWeekStarGiftMainDetail.gift.receivedCount);
        View view = this.f127252v;
        this.f127255y = view;
        view.setAlpha(1.0f);
        this.f127252v.setTranslationY(0.0f);
        this.f127253w.setAlpha(0.0f);
        this.f127253w.setTranslationY(0.0f);
        m150285g0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m150297d0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, int i) {
        hne0.C17513a c17513aM136084u = new hne0.C17513a().m136084u(giftWallV3GiftWeekStarGiftMainDetail.gift.f54601id, new C18201d(), i, "giftWall", "giftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("common"), BLiveTraceServerBiz.get(BLiveTraceServerBiz.giftcollection)));
        T t = this.f48605b;
        c17513aM136084u.f110753u = ((ckn0) t).f82302j;
        c17513aM136084u.f110733a = "voice_gift_wall";
        ((ckn0) t).m213811F2().SendGiftEventGroup.sendGift().mo199273j(c17513aM136084u.m136083t());
    }

    /* JADX INFO: renamed from: e0 */
    public void m150298e0(boolean z) {
        VText vText = this.f127243m;
        if (z) {
            vText.setTextColor(Color.parseColor("#33FFFFFF"));
            this.f127243m.setBackgroundResource(obc0.f146200U0);
        } else {
            vText.setTextColor(Color.parseColor("#ffffff"));
            this.f127243m.setBackgroundResource(obc0.f146434o0);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m150299f0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        new th0.C20312a(((ckn0) this.f48605b).act()).m191151j(xau.m209912v(R$string.f48282od, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.gift.price * giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.gift.name, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.user.name)).m191158q(R$string.f47983b).m191156o(new View.OnClickListener() { // from class: l.jkn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121436a.m150293Z(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        }).m191146e(R$string.f47961a).m191142a().m191141g();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m150287R(view);
        m150286r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        this.f127245o.setController(null);
        this.f127248r.setText("");
        this.f127249s.setText("");
        it0.m142007A(this.f127254x);
    }

    /* JADX INFO: renamed from: l.kkn0$c */
    public class C18200c implements Animator.AnimatorListener {
        public C18200c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            kkn0 kkn0Var = kkn0.this;
            kkn0Var.f127255y = kkn0Var.m150283S();
            kkn0.this.m150285g0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }
}
