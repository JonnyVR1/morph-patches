package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import p151v.VRadioButton;

/* JADX INFO: loaded from: classes4.dex */
public class nhs implements iam<bjs<?>> {

    /* JADX INFO: renamed from: a */
    public bjs<?> f142055a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f142056b;

    /* JADX INFO: renamed from: c */
    public GiftDialogContentView f142057c;

    /* JADX INFO: renamed from: d */
    public DialogC12774a f142058d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m163178O(DialogInterface dialogInterface) {
        juj.m146987a();
        this.f142057c.m75580b();
        bjs<?> bjsVar = this.f142055a;
        if (bjsVar != null) {
            bjsVar.mo96836O3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m163179U(View view) {
        m163198w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m163180V(y20 y20Var, VRadioButton vRadioButton, View view) {
        y20Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m163198w();
    }

    /* JADX INFO: renamed from: a0 */
    private void m163182a0() {
        GiftDialogContentView giftDialogContentView;
        if (this.f142056b == null || (giftDialogContentView = this.f142057c) == null) {
            return;
        }
        giftDialogContentView.m75571E0();
    }

    /* JADX INFO: renamed from: b0 */
    private void m163184b0(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m163185c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m163187e(View view) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m163194n(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m163197u() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75588v0();
        }
    }

    /* JADX INFO: renamed from: w */
    private void m163198w() {
        DialogC12774a dialogC12774a = this.f142058d;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
            this.f142058d = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public View m163199A() {
        if (this.f142057c == null) {
            return null;
        }
        boolean zM163204G = m163204G();
        GiftDialogContentView giftDialogContentView = this.f142057c;
        return zM163204G ? giftDialogContentView.f51117e : giftDialogContentView.f51121i;
    }

    /* JADX INFO: renamed from: B */
    public e060 m163200B() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        return giftDialogContentView != null ? giftDialogContentView.getFlyDestination() : e060.m118784c();
    }

    /* JADX INFO: renamed from: C */
    public BLiveWealthButton m163201C() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.f51125m.getNobleInfo();
        }
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m163202E() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null) {
            return 0;
        }
        return giftDialogContentView.f51126n.getHeight();
    }

    /* JADX INFO: renamed from: F */
    public int m163203F() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null) {
            return 0;
        }
        return giftDialogContentView.f51125m.getHeight();
    }

    /* JADX INFO: renamed from: G */
    public boolean m163204G() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null) {
            return false;
        }
        return bnl0.m105529O0(giftDialogContentView.f51117e);
    }

    /* JADX INFO: renamed from: H */
    public boolean m163205H() {
        return this.f142057c.f51127o.f51147l != -1;
    }

    /* JADX INFO: renamed from: I */
    public boolean m163206I() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null) {
            return false;
        }
        return bnl0.m105529O0(giftDialogContentView.f51126n);
    }

    /* JADX INFO: renamed from: J */
    public boolean m163207J() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null) {
            return false;
        }
        return bnl0.m105529O0(giftDialogContentView.f51123k);
    }

    /* JADX INFO: renamed from: K */
    public boolean m163208K() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null) {
            return false;
        }
        return bnl0.m105529O0(giftDialogContentView.f51125m);
    }

    /* JADX INFO: renamed from: L */
    public void m163209L(Act act) {
        if (this.f142056b == null) {
            yrj.m217168b(act, new y20() { // from class: l.ehs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94071a.m163212P((GiftDialogContentView) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m163210M() {
        DialogC12774a dialogC12774a = this.f142058d;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: N */
    public boolean m163211N() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        return giftDialogContentView != null && giftDialogContentView.m75585s0();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m163212P(GiftDialogContentView giftDialogContentView) {
        this.f142057c = giftDialogContentView;
        this.f142055a.mo104722P5(giftDialogContentView);
        c0s c0sVar = new c0s(this.f142055a, this.f142057c);
        this.f142056b = c0sVar;
        c0sVar.m72961j0(LiveDialogEnum.GIFT);
        this.f142057c.m75584r0(this.f142055a, new x20() { // from class: l.khs
            @Override // p153l.x20
            public final void call() {
                this.f126904a.m163230v();
            }
        });
        this.f142056b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lhs
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f132135a.m163178O(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m163213Q(final xbe xbeVar, String str, c0s c0sVar, BLiveGiftItem bLiveGiftItem, final BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        bjs<?> bjsVar = this.f142055a;
        jjs jjsVar = xbeVar.f193153b;
        qzj.m178793j(bjsVar, jjsVar, jjsVar.m145125k(), "NA", this.f142055a.mo78457R2(), bLiveGiftExtraDrawInfo.getGiftNum(), "picture", this.f142055a.m104721P4(), false);
        uoe0 uoe0VarM196974d = uoe0.m196974d(String.valueOf(bLiveGiftItem.f45225id), bLiveGiftItem, new y20() { // from class: l.bhs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76811a.m163216T(xbeVar, bLiveGiftExtraDrawInfo, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.chs
            @Override // p153l.y20
            public final void call(Object obj) {
                nhs.m163185c((Throwable) obj);
            }
        }, new y20() { // from class: l.dhs
            @Override // p153l.y20
            public final void call(Object obj) {
                nhs.m163194n((Integer) obj);
            }
        }, false, bLiveGiftExtraDrawInfo.getGiftNum(), str, this.f142055a.m104715M4(), BLiveTraceServerData.getNativeTabBarTraceServerData(xbeVar.f193153b.m145123i(), xbeVar.f193154c, xbeVar.f193155d));
        uoe0VarM196974d.f180075w = bLiveGiftExtraDrawInfo;
        this.f142055a.m104734X5(uoe0VarM196974d);
        c0sVar.dismiss();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m163214R() {
        this.f142055a.m213811F2().GiftDialogEventGroup.openGoWallet().mo199273j(new ox50().m169679d(true).m169680e(null).m169681f("liveGiftBarRechargeClick"));
        qzj.m178797n(this.f142055a.mo78457R2());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m163215S() {
        this.f142055a.m213811F2().GiftDialogEventGroup.openSendGiftRecordsPage().m199277p();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m163216T(xbe xbeVar, BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bjs<?> bjsVar = this.f142055a;
        jjs jjsVar = xbeVar.f193153b;
        qzj.m178801r(bjsVar, jjsVar, jjsVar.m145125k(), bLiveGivenGiftBrief, this.f142055a.mo78457R2(), bLiveGiftExtraDrawInfo.getGiftNum(), "picture", this.f142055a.m104721P4(), false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m163217W(y20 y20Var, VRadioButton vRadioButton, View view) {
        y20Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m163198w();
    }

    /* JADX INFO: renamed from: X */
    public void m163218X(kpj kpjVar) {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75589w0(kpjVar);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m163219Y(xxj xxjVar) {
        xxjVar.m213539m(((Boolean) this.f142055a.m138856F3(new myk(700))).booleanValue());
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75569B0(xxjVar);
            l51.m152887G(new Runnable() { // from class: l.xgs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194231a.m163197u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m163220Z(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75570D0(userLiveHierarchyProgressChange);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m163221c0(cqj cqjVar, int i) {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75591z0(cqjVar, i);
        }
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: d0 */
    public void m163222d0(final xbe xbeVar, final String str) {
        if (this.f142055a.act() == null) {
            return;
        }
        m163230v();
        DrawGiftContainer drawGiftContainer = (DrawGiftContainer) this.f142055a.act().inflater().inflate(yec0.f199329z0, (ViewGroup) null);
        final c0s c0sVar = new c0s(this.f142055a, drawGiftContainer);
        drawGiftContainer.m74699I0(xbeVar, new z20() { // from class: l.mhs
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136874a.m163213Q(xbeVar, str, c0sVar, (BLiveGiftItem) obj, (BLiveGiftExtraDrawInfo) obj2);
            }
        }, new x20() { // from class: l.zgs
            @Override // p153l.x20
            public final void call() {
                this.f204335a.m163215S();
            }
        }, new x20() { // from class: l.ygs
            @Override // p153l.x20
            public final void call() {
                this.f199872a.m163214R();
            }
        }, new x20() { // from class: l.ahs
            @Override // p153l.x20
            public final void call() {
                c0sVar.dismiss();
            }
        });
        c0sVar.m72961j0(LiveDialogEnum.GIFT);
        c0sVar.show();
    }

    @Override // p153l.iam
    public void destroy() {
        m163182a0();
        m163224f0(false);
        this.f142055a.m213811F2().BottomEvent.refreshGiftRedDot().mo199273j(Boolean.FALSE);
        m163230v();
    }

    /* JADX INFO: renamed from: e0 */
    public void m163223e0() {
        DialogC12774a dialogC12774a = this.f142056b;
        if (dialogC12774a != null) {
            dialogC12774a.show();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m163224f0(boolean z) {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75573H0(z);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m163225g0(Act act, final y20<Boolean> y20Var, final y20<Boolean> y20Var2, long j) {
        m163198w();
        View viewInflate = act.inflater().inflate(yec0.f199031c1, (ViewGroup) null);
        DialogC12774a dialogC12774a = new DialogC12774a(act, viewInflate);
        this.f142058d = dialogC12774a;
        dialogC12774a.m72954c0(jgc0.f120695b);
        View viewFindViewById = viewInflate.findViewById(mdc0.f136149d1);
        final VRadioButton vRadioButton = (VRadioButton) viewInflate.findViewById(mdc0.f136264p0);
        TextView textView = (TextView) viewInflate.findViewById(mdc0.f136291s0);
        vRadioButton.setSelected(false);
        View viewFindViewById2 = viewInflate.findViewById(mdc0.f136282r0);
        TextView textView2 = (TextView) viewInflate.findViewById(mdc0.f136007N6);
        TextView textView3 = (TextView) viewInflate.findViewById(mdc0.f136168f0);
        TextView textView4 = (TextView) viewInflate.findViewById(mdc0.f136354z0);
        m163184b0(textView2);
        m163184b0(textView3);
        m163184b0(textView4);
        m163184b0(textView);
        textView2.setText(zrv.f205803e.getString(u8n.m195065a() ? R$string.f47989b5 : R$string.f47967a5, Long.valueOf(j)));
        textView3.setText(zrv.f205803e.getString(R$string.f48510z));
        textView4.setText(zrv.f205803e.getString(R$string.f48230m5));
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.fhs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VRadioButton vRadioButton2 = vRadioButton;
                vRadioButton2.setSelected(!vRadioButton2.isSelected());
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ghs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104150a.m163179U(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.hhs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nhs.m163187e(view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.ihs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115012a.m163180V(y20Var2, vRadioButton, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: l.jhs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121004a.m163217W(y20Var, vRadioButton, view);
            }
        });
        this.f142058d.show();
    }

    /* JADX INFO: renamed from: h0 */
    public void m163226h0() {
        GiftDialogContentView giftDialogContentView;
        if (!isShowing() || (giftDialogContentView = this.f142057c) == null) {
            return;
        }
        giftDialogContentView.m75574I0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m163227i0() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75577L0();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12774a dialogC12774a = this.f142056b;
        if (dialogC12774a == null) {
            return false;
        }
        return dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: j0 */
    public void m163228j0(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m75579O0(jjsVar, bLiveGivenGiftBrief);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bjs<?> bjsVar) {
        this.f142055a = bjsVar;
    }

    /* JADX INFO: renamed from: v */
    public void m163230v() {
        DialogC12774a dialogC12774a = this.f142056b;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f142056b.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public AbstractC17128g4.a m163231x() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView == null || !bnl0.m105529O0(giftDialogContentView.f51129q.f51114i)) {
            return null;
        }
        return new AbstractC17128g4.a(this.f142057c.f51129q.f51114i);
    }

    /* JADX INFO: renamed from: y */
    public int m163232y() {
        GiftDialogContentView giftDialogContentView = this.f142057c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.getCurrentShowGiftPanel().f51144i.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public GiftDialogContentView m163233z() {
        return this.f142057c;
    }
}
