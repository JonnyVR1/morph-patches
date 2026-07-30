package p149l;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class gbn0 extends LiveMenuDialogHolder<yan0> {

    /* JADX INFO: renamed from: A */
    public Runnable f101882A;

    /* JADX INFO: renamed from: k */
    public VDraweeView f101883k;

    /* JADX INFO: renamed from: l */
    public View f101884l;

    /* JADX INFO: renamed from: m */
    public VText f101885m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f101886n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f101887o;

    /* JADX INFO: renamed from: p */
    public VText f101888p;

    /* JADX INFO: renamed from: q */
    public VText f101889q;

    /* JADX INFO: renamed from: r */
    public VText f101890r;

    /* JADX INFO: renamed from: s */
    public VText f101891s;

    /* JADX INFO: renamed from: t */
    public VText f101892t;

    /* JADX INFO: renamed from: u */
    public VText f101893u;

    /* JADX INFO: renamed from: v */
    public View f101894v;

    /* JADX INFO: renamed from: w */
    public View f101895w;

    /* JADX INFO: renamed from: x */
    public Animator f101896x;

    /* JADX INFO: renamed from: y */
    public View f101897y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f101898z;

    /* JADX INFO: renamed from: l.gbn0$a */
    public class RunnableC17051a implements Runnable {
        public RunnableC17051a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gbn0.this.f101896x != null) {
                gbn0.this.f101896x.start();
            }
        }
    }

    /* JADX INFO: renamed from: l.gbn0$b */
    public class C17052b extends ym2 {
        public C17052b() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            xdl0.m208325C0(gbn0.this.f101883k, (int) (xdl0.m208412y0() * (ngmVar.getHeight() / ngmVar.getWidth())));
        }
    }

    /* JADX INFO: renamed from: l.gbn0$d */
    public class C17054d implements zfv.C21687a.a {
        public C17054d() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            gbn0.this.mo71838p();
            lsi0.m151593w(R$string.f47566ud);
        }
    }

    public gbn0(yan0 yan0Var) {
        super(t6c0.f168136O8, yan0Var.act(), yan0Var, j2g0.m139458e(true));
        this.f101882A = new RunnableC17051a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public View m125309S() {
        View view = this.f101897y;
        View view2 = this.f101895w;
        return view == view2 ? this.f101894v : view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m125310T(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m125311g0() {
        dt0.m113501A(this.f101896x);
        View view = this.f101897y;
        Property property = View.TRANSLATION_Y;
        Animator animatorM103741n = bt0.m103741n(view, property, 0.0f, -t100.m186890d(21.0f));
        View view2 = this.f101897y;
        Property property2 = View.ALPHA;
        Animator animatorM103753z = bt0.m103753z(animatorM103741n, bt0.m103741n(view2, property2, 1.0f, 0.0f), bt0.m103741n(m125309S(), property, t100.m186890d(21.0f), 0.0f), bt0.m103741n(m125309S(), property2, 0.0f, 1.0f));
        this.f101896x = animatorM103753z;
        dt0.m113501A(animatorM103753z);
        this.f101896x.addListener(new C17053c());
        this.f101896x.setInterpolator(new LinearInterpolator());
        this.f101896x.setDuration(300L);
        e51.m114745J(this.f101882A);
        e51.m114743H(((yan0) this.f47757b).act(), this.f101882A, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX INFO: renamed from: r */
    private void m125312r() {
        xdl0.m208329E0(this.f101884l, new View.OnClickListener() { // from class: l.zan0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202381a.m125310T(view);
            }
        });
        mep0.m154301c1(this.f101883k, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
    }

    /* JADX INFO: renamed from: R */
    public final void m125313R(View view) {
        this.f101883k = (VDraweeView) view.findViewById(g5c0.f100710I);
        this.f101884l = view.findViewById(g5c0.f100638A);
        this.f101885m = (VText) view.findViewById(g5c0.f101104y4);
        this.f101886n = (VDraweeView) view.findViewById(g5c0.f100905d2);
        this.f101887o = (VDraweeView) view.findViewById(g5c0.f101054t);
        this.f101890r = (VText) view.findViewById(g5c0.f100963j0);
        this.f101891s = (VText) view.findViewById(g5c0.f100943h0);
        this.f101892t = (VText) view.findViewById(g5c0.f100753M6);
        this.f101893u = (VText) view.findViewById(g5c0.f100762N6);
        this.f101889q = (VText) view.findViewById(g5c0.f100896c3);
        this.f101888p = (VText) view.findViewById(g5c0.f100916e3);
        this.f101894v = view.findViewById(g5c0.f100906d3);
        this.f101895w = view.findViewById(g5c0.f100886b3);
        this.f101898z = (VDraweeView) view.findViewById(g5c0.f100926f3);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m125314U(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        m125321b0(giftWallV3GiftWeekStarGiftMainDetail);
        m125325f0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m125315V(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m125323d0(giftWallV3GiftWeekStarGiftMainDetail, 1);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m125316W(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m125320a0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m125317X(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m125320a0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m125318Y(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        ((yan0) this.f47757b).m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        T t = this.f47757b;
        u4n0.m191752k(t, ((nnn0) ((yan0) t).m206027E2()).m132140j0(), giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.f53754id);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m125319Z(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m125323d0(giftWallV3GiftWeekStarGiftMainDetail, giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m125320a0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        T t = this.f47757b;
        ((yan0) t).m213865W3(((yan0) t).f197226j, giftWallV3GiftWeekStarGiftMainDetail.gift.f53753id, new e30() { // from class: l.ebn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90364a.m125314U((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    /* JADX INFO: renamed from: b0 */
    public void m125321b0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        View.OnClickListener onClickListener;
        hxs.m133410w("context_livingAct", this.f101883k, giftWallV3GiftWeekStarGiftMainDetail.gift.bgImage, new C17052b());
        m125322c0(giftWallV3GiftWeekStarGiftMainDetail);
        this.f101893u.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.name);
        boolean z = giftWallV3GiftWeekStarGiftMainDetail.gift.canGift && giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum > 0;
        m125324e0(!z);
        hxs.m133412y(this.f101886n, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        kvc0.m147360i(this.f101886n, !giftWallV3GiftWeekStarGiftMainDetail.gift.isOwned);
        boolean zIsEmpty = TextUtils.isEmpty(giftWallV3GiftWeekStarGiftMainDetail.gift.tips);
        VText vText = this.f101892t;
        if (zIsEmpty) {
            xdl0.m208345M0(vText, false);
        } else {
            xdl0.m208345M0(vText, true);
            this.f101892t.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.tips);
        }
        this.f101890r.setText(R$string.f47426o5);
        if (giftWallV3GiftWeekStarGiftMainDetail.gift.isOwned) {
            this.f101891s.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.sendGiftCount + "");
            this.f101891s.setTextSize(15.0f);
            hxs.m133412y(this.f101887o, giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.avatar);
            boolean zEquals = ypv.f199493a.m199309D0().equals(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.f53754id);
            VText vText2 = this.f101885m;
            if (zEquals) {
                vText2.setText(R$string.f47522sd);
                if (z) {
                    onClickListener = new View.OnClickListener() { // from class: l.abn0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f68733a.m125315V(giftWallV3GiftWeekStarGiftMainDetail, view);
                        }
                    };
                } else {
                    onClickListener = null;
                }
            } else {
                vText2.setText(R$string.f46862O0);
                if (z) {
                    onClickListener = new View.OnClickListener() { // from class: l.bbn0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f74860a.m125316W(giftWallV3GiftWeekStarGiftMainDetail, view);
                        }
                    };
                } else {
                    onClickListener = null;
                }
            }
        } else {
            this.f101887o.setController(null);
            this.f101891s.setText(R$string.f47093Z0);
            this.f101891s.setTextSize(10.0f);
            this.f101890r.setText(R$string.f47426o5);
            this.f101885m.setText(R$string.f47263gh);
            if (z) {
                onClickListener = new View.OnClickListener() { // from class: l.cbn0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f80171a.m125317X(giftWallV3GiftWeekStarGiftMainDetail, view);
                    }
                };
            } else {
                onClickListener = null;
            }
        }
        xdl0.m208329E0(this.f101885m, onClickListener);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser;
        if (userBean == null || TextUtils.isEmpty(userBean.f53754id)) {
            xdl0.m208329E0(this.f101887o, null);
        } else {
            xdl0.m208329E0(this.f101887o, new View.OnClickListener() { // from class: l.dbn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85328a.m125318Y(giftWallV3GiftWeekStarGiftMainDetail, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m125322c0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        hxs.m133412y(this.f101898z, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.meUser;
        VText vText = this.f101889q;
        if (userBean != null) {
            vText.setText(giftWallV3GiftWeekStarGiftMainDetail.meUser.sendGiftCount + "");
        } else {
            vText.setText("0");
        }
        this.f101888p.setText("" + giftWallV3GiftWeekStarGiftMainDetail.gift.receivedCount);
        View view = this.f101894v;
        this.f101897y = view;
        view.setAlpha(1.0f);
        this.f101894v.setTranslationY(0.0f);
        this.f101895w.setAlpha(0.0f);
        this.f101895w.setTranslationY(0.0f);
        m125311g0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m125323d0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, int i) {
        cfe0.C16123a c16123aM106530u = new cfe0.C16123a().m106530u(giftWallV3GiftWeekStarGiftMainDetail.gift.f53753id, new C17054d(), i, "giftWall", "giftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("common"), BLiveTraceServerBiz.get(BLiveTraceServerBiz.giftcollection)));
        T t = this.f47757b;
        c16123aM106530u.f80610u = ((yan0) t).f197226j;
        c16123aM106530u.f80590a = "voice_gift_wall";
        ((yan0) t).m206028F2().SendGiftEventGroup.sendGift().mo172463j(c16123aM106530u.m106529t());
    }

    /* JADX INFO: renamed from: e0 */
    public void m125324e0(boolean z) {
        VText vText = this.f101885m;
        if (z) {
            vText.setTextColor(Color.parseColor("#33FFFFFF"));
            this.f101885m.setBackgroundResource(i3c0.f110872U0);
        } else {
            vText.setTextColor(Color.parseColor("#ffffff"));
            this.f101885m.setBackgroundResource(i3c0.f111106o0);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m125325f0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        new xh0.C21150a(((yan0) this.f47757b).act()).m208731j(w8u.m202219v(R$string.f47434od, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.gift.price * giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.gift.name, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.user.name)).m208738q(R$string.f47135b).m208736o(new View.OnClickListener() { // from class: l.fbn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96737a.m125319Z(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        }).m208726e(R$string.f47113a).m208722a().m208721g();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m125313R(view);
        m125312r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        this.f101887o.setController(null);
        this.f101890r.setText("");
        this.f101891s.setText("");
        dt0.m113501A(this.f101896x);
    }

    /* JADX INFO: renamed from: l.gbn0$c */
    public class C17053c implements Animator.AnimatorListener {
        public C17053c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            gbn0 gbn0Var = gbn0.this;
            gbn0Var.f101897y = gbn0Var.m125309S();
            gbn0.this.m125311g0();
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
