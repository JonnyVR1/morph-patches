package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveWealthButton;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.s7m;
import l.u6n;
import l.xdl0;
import l.ypv;
import v.VRadioButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mfs implements s7m<ahs<?>> {

    /* JADX INFO: renamed from: a */
    public ahs<?> f15372a;

    /* JADX INFO: renamed from: b */
    public C0200a f15373b;

    /* JADX INFO: renamed from: c */
    public GiftDialogContentView f15374c;

    /* JADX INFO: renamed from: d */
    public C0200a f15375d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m17850O(DialogInterface dialogInterface) {
        trj.m23151a();
        this.f15374c.m7980b();
        ahs<?> ahsVar = this.f15372a;
        if (ahsVar != null) {
            ahsVar.mo9256O3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m17851U(View view) {
        m17870w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m17852V(e30 e30Var, VRadioButton vRadioButton, View view) {
        e30Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m17870w();
    }

    /* JADX INFO: renamed from: a0 */
    private void m17854a0() {
        GiftDialogContentView giftDialogContentView;
        if (this.f15373b == null || (giftDialogContentView = this.f15374c) == null) {
            return;
        }
        giftDialogContentView.m7971E0();
    }

    /* JADX INFO: renamed from: b0 */
    private void m17856b0(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17857c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m17859e(View view) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m17866n(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m17869u() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7989v0();
        }
    }

    /* JADX INFO: renamed from: w */
    private void m17870w() {
        C0200a c0200a = this.f15375d;
        if (c0200a != null) {
            c0200a.dismiss();
            this.f15375d = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public View m17871A() {
        if (this.f15374c == null) {
            return null;
        }
        boolean zM17877G = m17877G();
        GiftDialogContentView giftDialogContentView = this.f15374c;
        return zM17877G ? giftDialogContentView.f6311e : giftDialogContentView.f6315i;
    }

    /* JADX INFO: renamed from: B */
    public yr50 m17872B() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        return giftDialogContentView != null ? giftDialogContentView.getFlyDestination() : yr50.m26912c();
    }

    /* JADX INFO: renamed from: C */
    public BLiveWealthButton m17873C() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.f6319m.getNobleInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: C0 */
    public Context m17874C0() {
        ConstraintLayout constraintLayout = this.f15374c;
        if (constraintLayout != null) {
            return constraintLayout.getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m17875E() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null) {
            return 0;
        }
        return giftDialogContentView.f6320n.getHeight();
    }

    /* JADX INFO: renamed from: F */
    public int m17876F() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null) {
            return 0;
        }
        return giftDialogContentView.f6319m.getHeight();
    }

    /* JADX INFO: renamed from: G */
    public boolean m17877G() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.O0(giftDialogContentView.f6311e);
    }

    /* JADX INFO: renamed from: H */
    public boolean m17878H() {
        return this.f15374c.f6321o.f6341l != -1;
    }

    /* JADX INFO: renamed from: I */
    public boolean m17879I() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.O0(giftDialogContentView.f6320n);
    }

    /* JADX INFO: renamed from: J */
    public boolean m17880J() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.O0(giftDialogContentView.f6317k);
    }

    /* JADX INFO: renamed from: K */
    public boolean m17881K() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.O0(giftDialogContentView.f6319m);
    }

    /* JADX INFO: renamed from: L */
    public void m17882L(Act act) {
        if (this.f15373b == null) {
            ipj.m15284b(act, new e30() { // from class: l.dfs
                public final void call(Object obj) {
                    this.f9203a.m17885P((GiftDialogContentView) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m17883M() {
        a aVar = this.f15375d;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: N */
    public boolean m17884N() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        return giftDialogContentView != null && giftDialogContentView.m7986s0();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m17885P(GiftDialogContentView giftDialogContentView) {
        this.f15374c = giftDialogContentView;
        this.f15372a.mo9731P5(giftDialogContentView);
        byr byrVar = new byr((wxs) this.f15372a, (View) this.f15374c);
        this.f15373b = byrVar;
        byrVar.m5146j0(LiveDialogEnum.GIFT);
        this.f15374c.m7985r0(this.f15372a, new d30() { // from class: l.jfs
            public final void call() {
                this.f13729a.m17904v();
            }
        });
        this.f15373b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kfs
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14313a.m17850O(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m17886Q(final tae taeVar, String str, byr byrVar, BLiveGiftItem bLiveGiftItem, final BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        ahs<?> ahsVar = this.f15372a;
        ihs ihsVar = taeVar.f20147b;
        axj.m10096j(ahsVar, ihsVar, ihsVar.m15163k(), "NA", this.f15372a.mo21430R2(), bLiveGiftExtraDrawInfo.getGiftNum(), "picture", this.f15372a.m9730P4(), false);
        pge0 pge0VarM20240d = pge0.m20240d(String.valueOf(bLiveGiftItem.id), bLiveGiftItem, new e30() { // from class: l.afs
            public final void call(Object obj) {
                this.f7537a.m17889T(taeVar, bLiveGiftExtraDrawInfo, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.bfs
            public final void call(Object obj) {
                mfs.m17857c((Throwable) obj);
            }
        }, new e30() { // from class: l.cfs
            public final void call(Object obj) {
                mfs.m17866n((Integer) obj);
            }
        }, false, bLiveGiftExtraDrawInfo.getGiftNum(), str, this.f15372a.m9724M4(), BLiveTraceServerData.getNativeTabBarTraceServerData(taeVar.f20147b.m15161i(), taeVar.f20148c, taeVar.f20149d));
        pge0VarM20240d.f17298w = bLiveGiftExtraDrawInfo;
        this.f15372a.m9744X5(pge0VarM20240d);
        byrVar.dismiss();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m17887R() {
        this.f15372a.m25548F2().GiftDialogEventGroup.openGoWallet().j(new ip50().m15280d(true).m15281e(null).m15282f("liveGiftBarRechargeClick"));
        axj.m10100n(this.f15372a.mo21430R2());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m17888S() {
        this.f15372a.m25548F2().GiftDialogEventGroup.openSendGiftRecordsPage().p();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m17889T(tae taeVar, BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ahs<?> ahsVar = this.f15372a;
        ihs ihsVar = taeVar.f20147b;
        axj.m10104r(ahsVar, ihsVar, ihsVar.m15163k(), bLiveGivenGiftBrief, this.f15372a.mo21430R2(), bLiveGiftExtraDrawInfo.getGiftNum(), "picture", this.f15372a.m9730P4(), false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m17890W(e30 e30Var, VRadioButton vRadioButton, View view) {
        e30Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m17870w();
    }

    /* JADX INFO: renamed from: X */
    public void m17891X(umj umjVar) {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7990w0(umjVar);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m17892Y(hvj hvjVar) {
        hvjVar.m14848m(((Boolean) this.f15372a.m14184F3(new wvk(700))).booleanValue());
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7969B0(hvjVar);
            e51.G(new Runnable() { // from class: l.wes
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21679a.m17869u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m17893Z(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7970D0(userLiveHierarchyProgressChange);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m17894c0(mnj mnjVar, int i) {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7992z0(mnjVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer] */
    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: d0 */
    public void m17895d0(final tae taeVar, final String str) {
        if (this.f15372a.act() == null) {
            return;
        }
        m17904v();
        ?? r1 = (DrawGiftContainer) this.f15372a.act().inflater().inflate(t6c0.f20093z0, (ViewGroup) null);
        final byr byrVar = new byr(this.f15372a, (View) r1);
        r1.m7058I0(taeVar, new f30() { // from class: l.lfs
            public final void call(Object obj, Object obj2) {
                this.f14841a.m17886Q(taeVar, str, byrVar, (BLiveGiftItem) obj, (BLiveGiftExtraDrawInfo) obj2);
            }
        }, new d30() { // from class: l.yes
            public final void call() {
                this.f22824a.m17888S();
            }
        }, new d30() { // from class: l.xes
            public final void call() {
                this.f22248a.m17887R();
            }
        }, new d30() { // from class: l.zes
            public final void call() {
                byrVar.dismiss();
            }
        });
        byrVar.m5146j0(LiveDialogEnum.GIFT);
        byrVar.show();
    }

    public void destroy() {
        m17854a0();
        m17897f0(false);
        this.f15372a.m25548F2().BottomEvent.refreshGiftRedDot().j(Boolean.FALSE);
        m17904v();
    }

    /* JADX INFO: renamed from: e0 */
    public void m17896e0() {
        C0200a c0200a = this.f15373b;
        if (c0200a != null) {
            c0200a.show();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m17897f0(boolean z) {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7973H0(z);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m17898g0(Act act, final e30<Boolean> e30Var, final e30<Boolean> e30Var2, long j) {
        m17870w();
        View viewInflate = act.inflater().inflate(t6c0.f19795c1, (ViewGroup) null);
        C0200a c0200a = new C0200a(act, viewInflate);
        this.f15375d = c0200a;
        c0200a.m5139c0(d8c0.f9097b);
        View viewFindViewById = viewInflate.findViewById(g5c0.f11054d1);
        final VRadioButton vRadioButtonFindViewById = viewInflate.findViewById(g5c0.f11169p0);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f11196s0);
        vRadioButtonFindViewById.setSelected(false);
        View viewFindViewById2 = viewInflate.findViewById(g5c0.f11187r0);
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f10912N6);
        TextView textView3 = (TextView) viewInflate.findViewById(g5c0.f11073f0);
        TextView textView4 = (TextView) viewInflate.findViewById(g5c0.f11259z0);
        m17856b0(textView2);
        m17856b0(textView3);
        m17856b0(textView4);
        m17856b0(textView);
        textView2.setText(ypv.e.getString(u6n.a() ? R$string.f3183b5 : R$string.f3161a5, Long.valueOf(j)));
        textView3.setText(ypv.e.getString(R$string.f3704z));
        textView4.setText(ypv.e.getString(R$string.f3424m5));
        xdl0.E0(viewFindViewById2, new View.OnClickListener() { // from class: l.efs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VRadioButton vRadioButton = vRadioButtonFindViewById;
                vRadioButton.setSelected(!vRadioButton.isSelected());
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ffs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10324a.m17851U(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.gfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mfs.m17859e(view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.hfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12019a.m17852V(e30Var2, vRadioButtonFindViewById, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: l.ifs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13222a.m17890W(e30Var, vRadioButtonFindViewById, view);
            }
        });
        this.f15375d.show();
    }

    /* JADX INFO: renamed from: h0 */
    public void m17899h0() {
        GiftDialogContentView giftDialogContentView;
        if (!isShowing() || (giftDialogContentView = this.f15374c) == null) {
            return;
        }
        giftDialogContentView.m7974I0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m17900i0() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7977L0();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        a aVar = this.f15373b;
        if (aVar == null) {
            return false;
        }
        return aVar.isShowing();
    }

    /* JADX INFO: renamed from: j0 */
    public void m17902j0(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m7979O0(ihsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m17901i1(ahs<?> ahsVar) {
        this.f15372a = ahsVar;
    }

    /* JADX INFO: renamed from: v */
    public void m17904v() {
        a aVar = this.f15373b;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f15373b.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0583g4.a m17905x() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView == null || !xdl0.O0(giftDialogContentView.f6323q.f6308i)) {
            return null;
        }
        return new AbstractC0583g4.a(this.f15374c.f6323q.f6308i);
    }

    /* JADX INFO: renamed from: y */
    public int m17906y() {
        GiftDialogContentView giftDialogContentView = this.f15374c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.getCurrentShowGiftPanel().f6338i.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public GiftDialogContentView m17907z() {
        return this.f15374c;
    }
}
