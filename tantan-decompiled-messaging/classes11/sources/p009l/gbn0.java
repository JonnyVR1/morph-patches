package p009l;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.bt0;
import l.cfe0;
import l.dt0;
import l.e30;
import l.e51;
import l.g5c0;
import l.hce;
import l.hxs;
import l.i3c0;
import l.j2g0;
import l.kvc0;
import l.lsi0;
import l.mep0;
import l.ngm;
import l.t100;
import l.t6c0;
import l.u4n0;
import l.w8u;
import l.x6s;
import l.xdl0;
import l.xh0;
import l.ym2;
import l.zfv;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gbn0 extends LiveMenuDialogHolder<yan0> {

    /* JADX INFO: renamed from: A */
    public Runnable f13406A;

    /* JADX INFO: renamed from: k */
    public VDraweeView f13407k;

    /* JADX INFO: renamed from: l */
    public View f13408l;

    /* JADX INFO: renamed from: m */
    public VText f13409m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f13410n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f13411o;

    /* JADX INFO: renamed from: p */
    public VText f13412p;

    /* JADX INFO: renamed from: q */
    public VText f13413q;

    /* JADX INFO: renamed from: r */
    public VText f13414r;

    /* JADX INFO: renamed from: s */
    public VText f13415s;

    /* JADX INFO: renamed from: t */
    public VText f13416t;

    /* JADX INFO: renamed from: u */
    public VText f13417u;

    /* JADX INFO: renamed from: v */
    public View f13418v;

    /* JADX INFO: renamed from: w */
    public View f13419w;

    /* JADX INFO: renamed from: x */
    public Animator f13420x;

    /* JADX INFO: renamed from: y */
    public View f13421y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f13422z;

    /* JADX INFO: renamed from: l.gbn0$a */
    public class RunnableC0914a implements Runnable {
        public RunnableC0914a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gbn0.this.f13420x != null) {
                gbn0.this.f13420x.start();
            }
        }
    }

    /* JADX INFO: renamed from: l.gbn0$b */
    public class C0915b extends ym2 {
        public C0915b() {
        }

        /* JADX INFO: renamed from: h */
        public void m14884h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            xdl0.C0(gbn0.this.f13407k, (int) (xdl0.y0() * (ngmVar.getHeight() / ngmVar.getWidth())));
        }
    }

    /* JADX INFO: renamed from: l.gbn0$d */
    public class C0917d implements zfv.a.a {
        public C0917d() {
        }

        /* JADX INFO: renamed from: a */
        public void m14885a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            gbn0.this.p();
            lsi0.w(R.string.ud);
        }
    }

    public gbn0(yan0 yan0Var) {
        super(t6c0.O8, yan0Var.act(), yan0Var, j2g0.e(true));
        this.f13406A = new RunnableC0914a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public View m14865S() {
        View view = this.f13421y;
        View view2 = this.f13419w;
        return view == view2 ? this.f13418v : view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m14866T(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m14867g0() {
        dt0.A(this.f13420x);
        View view = this.f13421y;
        Property property = View.TRANSLATION_Y;
        Animator animatorN = bt0.n(view, property, new float[]{0.0f, -t100.d(21.0f)});
        View view2 = this.f13421y;
        Property property2 = View.ALPHA;
        Animator animatorZ = bt0.z(new Animator[]{animatorN, bt0.n(view2, property2, new float[]{1.0f, 0.0f}), bt0.n(m14865S(), property, new float[]{t100.d(21.0f), 0.0f}), bt0.n(m14865S(), property2, new float[]{0.0f, 1.0f})});
        this.f13420x = animatorZ;
        dt0.A(animatorZ);
        this.f13420x.addListener(new C0916c());
        this.f13420x.setInterpolator(new LinearInterpolator());
        this.f13420x.setDuration(300L);
        e51.J(this.f13406A);
        e51.H(((yan0) ((LiveMenuDialogHolder) this).b).act(), this.f13406A, 5000L);
    }

    /* JADX INFO: renamed from: r */
    private void m14868r() {
        xdl0.E0(this.f13408l, new View.OnClickListener() { // from class: l.zan0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23539a.m14866T(view);
            }
        });
        mep0.c1(this.f13407k, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
    }

    /* JADX INFO: renamed from: R */
    public final void m14869R(View view) {
        this.f13407k = view.findViewById(g5c0.I);
        this.f13408l = view.findViewById(g5c0.A);
        this.f13409m = view.findViewById(g5c0.y4);
        this.f13410n = view.findViewById(g5c0.d2);
        this.f13411o = view.findViewById(g5c0.t);
        this.f13414r = view.findViewById(g5c0.j0);
        this.f13415s = view.findViewById(g5c0.h0);
        this.f13416t = view.findViewById(g5c0.M6);
        this.f13417u = view.findViewById(g5c0.N6);
        this.f13413q = view.findViewById(g5c0.c3);
        this.f13412p = view.findViewById(g5c0.e3);
        this.f13418v = view.findViewById(g5c0.d3);
        this.f13419w = view.findViewById(g5c0.b3);
        this.f13422z = view.findViewById(g5c0.f3);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m14870U(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        m14877b0(giftWallV3GiftWeekStarGiftMainDetail);
        m14881f0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m14871V(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m14879d0(giftWallV3GiftWeekStarGiftMainDetail, 1);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m14872W(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m14876a0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m14873X(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m14876a0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m14874Y(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        ((yan0) ((LiveMenuDialogHolder) this).b).F2().OpenUserCardDialogEvent.dismiss().p();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        u4n0.k(x6sVar, ((yan0) x6sVar).E2().j0(), giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.f7360id);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m14875Z(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, View view) {
        m14879d0(giftWallV3GiftWeekStarGiftMainDetail, giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m14876a0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        ((yan0) x6sVar).m25211W3(((yan0) x6sVar).f22953j, giftWallV3GiftWeekStarGiftMainDetail.gift.f7359id, new e30() { // from class: l.ebn0
            public final void call(Object obj) {
                this.f12489a.m14870U((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    /* JADX INFO: renamed from: b0 */
    public void m14877b0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        View.OnClickListener onClickListener;
        hxs.w("context_livingAct", this.f13407k, giftWallV3GiftWeekStarGiftMainDetail.gift.bgImage, new C0915b());
        m14878c0(giftWallV3GiftWeekStarGiftMainDetail);
        this.f13417u.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.name);
        boolean z = giftWallV3GiftWeekStarGiftMainDetail.gift.canGift && giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum > 0;
        m14880e0(!z);
        hxs.y(this.f13410n, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        kvc0.i(this.f13410n, !giftWallV3GiftWeekStarGiftMainDetail.gift.isOwned);
        boolean zIsEmpty = TextUtils.isEmpty(giftWallV3GiftWeekStarGiftMainDetail.gift.tips);
        VText vText = this.f13416t;
        if (zIsEmpty) {
            xdl0.M0(vText, false);
        } else {
            xdl0.M0(vText, true);
            this.f13416t.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.tips);
        }
        this.f13414r.setText(R.string.o5);
        if (giftWallV3GiftWeekStarGiftMainDetail.gift.isOwned) {
            this.f13415s.setText(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.sendGiftCount + "");
            this.f13415s.setTextSize(15.0f);
            hxs.y(this.f13411o, giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.avatar);
            boolean zEquals = ypv.f23196a.m23619D0().equals(giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser.f7360id);
            VText vText2 = this.f13409m;
            if (zEquals) {
                vText2.setText(R.string.sd);
                if (z) {
                    onClickListener = new View.OnClickListener() { // from class: l.abn0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f9369a.m14871V(giftWallV3GiftWeekStarGiftMainDetail, view);
                        }
                    };
                } else {
                    onClickListener = null;
                }
            } else {
                vText2.setText(R.string.O0);
                if (z) {
                    onClickListener = new View.OnClickListener() { // from class: l.bbn0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f10002a.m14872W(giftWallV3GiftWeekStarGiftMainDetail, view);
                        }
                    };
                } else {
                    onClickListener = null;
                }
            }
        } else {
            this.f13411o.setController((hce) null);
            this.f13415s.setText(R.string.Z0);
            this.f13415s.setTextSize(10.0f);
            this.f13414r.setText(R.string.o5);
            this.f13409m.setText(R.string.gh);
            if (z) {
                onClickListener = new View.OnClickListener() { // from class: l.cbn0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10501a.m14873X(giftWallV3GiftWeekStarGiftMainDetail, view);
                    }
                };
            } else {
                onClickListener = null;
            }
        }
        xdl0.E0(this.f13409m, onClickListener);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.gift.top1ContributorUser;
        if (userBean == null || TextUtils.isEmpty(userBean.f7360id)) {
            xdl0.E0(this.f13411o, (View.OnClickListener) null);
        } else {
            xdl0.E0(this.f13411o, new View.OnClickListener() { // from class: l.dbn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11715a.m14874Y(giftWallV3GiftWeekStarGiftMainDetail, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14878c0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        hxs.y(this.f13422z, giftWallV3GiftWeekStarGiftMainDetail.gift.icon);
        UserBean userBean = giftWallV3GiftWeekStarGiftMainDetail.meUser;
        VText vText = this.f13413q;
        if (userBean != null) {
            vText.setText(giftWallV3GiftWeekStarGiftMainDetail.meUser.sendGiftCount + "");
        } else {
            vText.setText("0");
        }
        this.f13412p.setText("" + giftWallV3GiftWeekStarGiftMainDetail.gift.receivedCount);
        View view = this.f13418v;
        this.f13421y = view;
        view.setAlpha(1.0f);
        this.f13418v.setTranslationY(0.0f);
        this.f13419w.setAlpha(0.0f);
        this.f13419w.setTranslationY(0.0f);
        m14867g0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m14879d0(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail, int i) {
        cfe0.a aVarU = new cfe0.a().u(giftWallV3GiftWeekStarGiftMainDetail.gift.f7359id, new C0917d(), i, "giftWall", "giftWall", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("common"), BLiveTraceServerBiz.get("giftcollection")));
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        aVarU.u = ((yan0) x6sVar).f22953j;
        aVarU.a = "voice_gift_wall";
        ((yan0) x6sVar).F2().SendGiftEventGroup.sendGift().j(aVarU.t());
    }

    /* JADX INFO: renamed from: e0 */
    public void m14880e0(boolean z) {
        VText vText = this.f13409m;
        if (z) {
            vText.setTextColor(Color.parseColor("#33FFFFFF"));
            this.f13409m.setBackgroundResource(i3c0.U0);
        } else {
            vText.setTextColor(Color.parseColor("#ffffff"));
            this.f13409m.setBackgroundResource(i3c0.o0);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m14881f0(final GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        new xh0.a(((yan0) ((LiveMenuDialogHolder) this).b).act()).j(w8u.v(R.string.od, new Object[]{Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.gift.price * giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.gift.name, Integer.valueOf(giftWallV3GiftWeekStarGiftMainDetail.grabRankGiftNum), giftWallV3GiftWeekStarGiftMainDetail.user.name})).q(R.string.b).o(new View.OnClickListener() { // from class: l.fbn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12907a.m14875Z(giftWallV3GiftWeekStarGiftMainDetail, view);
            }
        }).e(R.string.a).a().g();
    }

    /* JADX INFO: renamed from: m */
    public void m14882m(View view) {
        super.m(view);
        m14869R(view);
        m14868r();
    }

    /* JADX INFO: renamed from: w */
    public void m14883w() {
        super.w();
        this.f13411o.setController((hce) null);
        this.f13414r.setText("");
        this.f13415s.setText("");
        dt0.A(this.f13420x);
    }

    /* JADX INFO: renamed from: l.gbn0$c */
    public class C0916c implements Animator.AnimatorListener {
        public C0916c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            gbn0 gbn0Var = gbn0.this;
            gbn0Var.f13421y = gbn0Var.m14865S();
            gbn0.this.m14867g0();
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
