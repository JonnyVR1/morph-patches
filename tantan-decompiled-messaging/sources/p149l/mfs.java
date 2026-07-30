package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import p147v.VRadioButton;

/* JADX INFO: loaded from: classes4.dex */
public class mfs implements s7m<ahs<?>> {

    /* JADX INFO: renamed from: a */
    public ahs<?> f133617a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f133618b;

    /* JADX INFO: renamed from: c */
    public GiftDialogContentView f133619c;

    /* JADX INFO: renamed from: d */
    public DialogC12611a f133620d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m154409O(DialogInterface dialogInterface) {
        trj.m190420a();
        this.f133619c.m74397b();
        ahs<?> ahsVar = this.f133617a;
        if (ahsVar != null) {
            ahsVar.mo94471O3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m154410U(View view) {
        m154429w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m154411V(e30 e30Var, VRadioButton vRadioButton, View view) {
        e30Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m154429w();
    }

    /* JADX INFO: renamed from: a0 */
    private void m154413a0() {
        GiftDialogContentView giftDialogContentView;
        if (this.f133618b == null || (giftDialogContentView = this.f133619c) == null) {
            return;
        }
        giftDialogContentView.m74388E0();
    }

    /* JADX INFO: renamed from: b0 */
    private void m154415b0(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m154416c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m154418e(View view) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m154425n(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m154428u() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74405v0();
        }
    }

    /* JADX INFO: renamed from: w */
    private void m154429w() {
        DialogC12611a dialogC12611a = this.f133620d;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
            this.f133620d = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public View m154430A() {
        if (this.f133619c == null) {
            return null;
        }
        boolean zM154435G = m154435G();
        GiftDialogContentView giftDialogContentView = this.f133619c;
        return zM154435G ? giftDialogContentView.f50269e : giftDialogContentView.f50273i;
    }

    /* JADX INFO: renamed from: B */
    public yr50 m154431B() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        return giftDialogContentView != null ? giftDialogContentView.getFlyDestination() : yr50.m215781c();
    }

    /* JADX INFO: renamed from: C */
    public BLiveWealthButton m154432C() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.f50277m.getNobleInfo();
        }
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m154433E() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null) {
            return 0;
        }
        return giftDialogContentView.f50278n.getHeight();
    }

    /* JADX INFO: renamed from: F */
    public int m154434F() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null) {
            return 0;
        }
        return giftDialogContentView.f50277m.getHeight();
    }

    /* JADX INFO: renamed from: G */
    public boolean m154435G() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.m208349O0(giftDialogContentView.f50269e);
    }

    /* JADX INFO: renamed from: H */
    public boolean m154436H() {
        return this.f133619c.f50279o.f50299l != -1;
    }

    /* JADX INFO: renamed from: I */
    public boolean m154437I() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.m208349O0(giftDialogContentView.f50278n);
    }

    /* JADX INFO: renamed from: J */
    public boolean m154438J() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.m208349O0(giftDialogContentView.f50275k);
    }

    /* JADX INFO: renamed from: K */
    public boolean m154439K() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null) {
            return false;
        }
        return xdl0.m208349O0(giftDialogContentView.f50277m);
    }

    /* JADX INFO: renamed from: L */
    public void m154440L(Act act) {
        if (this.f133618b == null) {
            ipj.m137487b(act, new e30() { // from class: l.dfs
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85975a.m154443P((GiftDialogContentView) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m154441M() {
        DialogC12611a dialogC12611a = this.f133620d;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: N */
    public boolean m154442N() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        return giftDialogContentView != null && giftDialogContentView.m74402s0();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m154443P(GiftDialogContentView giftDialogContentView) {
        this.f133619c = giftDialogContentView;
        this.f133617a.mo96635P5(giftDialogContentView);
        byr byrVar = new byr(this.f133617a, this.f133619c);
        this.f133618b = byrVar;
        byrVar.m71778j0(LiveDialogEnum.GIFT);
        this.f133619c.m74401r0(this.f133617a, new d30() { // from class: l.jfs
            @Override // p149l.d30
            public final void call() {
                this.f117686a.m154461v();
            }
        });
        this.f133618b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kfs
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f122968a.m154409O(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m154444Q(final tae taeVar, String str, byr byrVar, BLiveGiftItem bLiveGiftItem, final BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        ahs<?> ahsVar = this.f133617a;
        ihs ihsVar = taeVar.f169110b;
        axj.m99436j(ahsVar, ihsVar, ihsVar.m136286k(), "NA", this.f133617a.mo77274R2(), bLiveGiftExtraDrawInfo.getGiftNum(), "picture", this.f133617a.m96634P4(), false);
        pge0 pge0VarM168675d = pge0.m168675d(String.valueOf(bLiveGiftItem.f44377id), bLiveGiftItem, new e30() { // from class: l.afs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69213a.m154447T(taeVar, bLiveGiftExtraDrawInfo, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.bfs
            @Override // p149l.e30
            public final void call(Object obj) {
                mfs.m154416c((Throwable) obj);
            }
        }, new e30() { // from class: l.cfs
            @Override // p149l.e30
            public final void call(Object obj) {
                mfs.m154425n((Integer) obj);
            }
        }, false, bLiveGiftExtraDrawInfo.getGiftNum(), str, this.f133617a.m96628M4(), BLiveTraceServerData.getNativeTabBarTraceServerData(taeVar.f169110b.m136284i(), taeVar.f169111c, taeVar.f169112d));
        pge0VarM168675d.f148674w = bLiveGiftExtraDrawInfo;
        this.f133617a.m96647X5(pge0VarM168675d);
        byrVar.dismiss();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m154445R() {
        this.f133617a.m206028F2().GiftDialogEventGroup.openGoWallet().mo172463j(new ip50().m137454d(true).m137455e(null).m137456f("liveGiftBarRechargeClick"));
        axj.m99440n(this.f133617a.mo77274R2());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m154446S() {
        this.f133617a.m206028F2().GiftDialogEventGroup.openSendGiftRecordsPage().m172467p();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m154447T(tae taeVar, BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ahs<?> ahsVar = this.f133617a;
        ihs ihsVar = taeVar.f169110b;
        axj.m99444r(ahsVar, ihsVar, ihsVar.m136286k(), bLiveGivenGiftBrief, this.f133617a.mo77274R2(), bLiveGiftExtraDrawInfo.getGiftNum(), "picture", this.f133617a.m96634P4(), false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m154448W(e30 e30Var, VRadioButton vRadioButton, View view) {
        e30Var.call(Boolean.valueOf(vRadioButton.isSelected()));
        m154429w();
    }

    /* JADX INFO: renamed from: X */
    public void m154449X(umj umjVar) {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74406w0(umjVar);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m154450Y(hvj hvjVar) {
        hvjVar.m133180m(((Boolean) this.f133617a.m129297F3(new wvk(700))).booleanValue());
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74386B0(hvjVar);
            e51.m114742G(new Runnable() { // from class: l.wes
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185971a.m154428u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m154451Z(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74387D0(userLiveHierarchyProgressChange);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m154452c0(mnj mnjVar, int i) {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74408z0(mnjVar, i);
        }
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: d0 */
    public void m154453d0(final tae taeVar, final String str) {
        if (this.f133617a.act() == null) {
            return;
        }
        m154461v();
        DrawGiftContainer drawGiftContainer = (DrawGiftContainer) this.f133617a.act().inflater().inflate(t6c0.f168597z0, (ViewGroup) null);
        final byr byrVar = new byr(this.f133617a, drawGiftContainer);
        drawGiftContainer.m73516I0(taeVar, new f30() { // from class: l.lfs
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f127920a.m154444Q(taeVar, str, byrVar, (BLiveGiftItem) obj, (BLiveGiftExtraDrawInfo) obj2);
            }
        }, new d30() { // from class: l.yes
            @Override // p149l.d30
            public final void call() {
                this.f197719a.m154446S();
            }
        }, new d30() { // from class: l.xes
            @Override // p149l.d30
            public final void call() {
                this.f192621a.m154445R();
            }
        }, new d30() { // from class: l.zes
            @Override // p149l.d30
            public final void call() {
                byrVar.dismiss();
            }
        });
        byrVar.m71778j0(LiveDialogEnum.GIFT);
        byrVar.show();
    }

    @Override // p149l.s7m
    public void destroy() {
        m154413a0();
        m154455f0(false);
        this.f133617a.m206028F2().BottomEvent.refreshGiftRedDot().mo172463j(Boolean.FALSE);
        m154461v();
    }

    /* JADX INFO: renamed from: e0 */
    public void m154454e0() {
        DialogC12611a dialogC12611a = this.f133618b;
        if (dialogC12611a != null) {
            dialogC12611a.show();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m154455f0(boolean z) {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74390H0(z);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m154456g0(Act act, final e30<Boolean> e30Var, final e30<Boolean> e30Var2, long j) {
        m154429w();
        View viewInflate = act.inflater().inflate(t6c0.f168299c1, (ViewGroup) null);
        DialogC12611a dialogC12611a = new DialogC12611a(act, viewInflate);
        this.f133620d = dialogC12611a;
        dialogC12611a.m71771c0(d8c0.f84847b);
        View viewFindViewById = viewInflate.findViewById(g5c0.f100904d1);
        final VRadioButton vRadioButton = (VRadioButton) viewInflate.findViewById(g5c0.f101019p0);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f101046s0);
        vRadioButton.setSelected(false);
        View viewFindViewById2 = viewInflate.findViewById(g5c0.f101037r0);
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f100762N6);
        TextView textView3 = (TextView) viewInflate.findViewById(g5c0.f100923f0);
        TextView textView4 = (TextView) viewInflate.findViewById(g5c0.f101109z0);
        m154415b0(textView2);
        m154415b0(textView3);
        m154415b0(textView4);
        m154415b0(textView);
        textView2.setText(ypv.f199497e.getString(u6n.m192015a() ? R$string.f47141b5 : R$string.f47119a5, Long.valueOf(j)));
        textView3.setText(ypv.f199497e.getString(R$string.f47662z));
        textView4.setText(ypv.f199497e.getString(R$string.f47382m5));
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.efs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VRadioButton vRadioButton2 = vRadioButton;
                vRadioButton2.setSelected(!vRadioButton2.isSelected());
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ffs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97303a.m154410U(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.gfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mfs.m154418e(view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.hfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107513a.m154411V(e30Var2, vRadioButton, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: l.ifs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113051a.m154448W(e30Var, vRadioButton, view);
            }
        });
        this.f133620d.show();
    }

    /* JADX INFO: renamed from: h0 */
    public void m154457h0() {
        GiftDialogContentView giftDialogContentView;
        if (!isShowing() || (giftDialogContentView = this.f133619c) == null) {
            return;
        }
        giftDialogContentView.m74391I0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m154458i0() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74394L0();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        DialogC12611a dialogC12611a = this.f133618b;
        if (dialogC12611a == null) {
            return false;
        }
        return dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: j0 */
    public void m154459j0(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            giftDialogContentView.m74396O0(ihsVar, bLiveGivenGiftBrief);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ahs<?> ahsVar) {
        this.f133617a = ahsVar;
    }

    /* JADX INFO: renamed from: v */
    public void m154461v() {
        DialogC12611a dialogC12611a = this.f133618b;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f133618b.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public AbstractC16991g4.a m154462x() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView == null || !xdl0.m208349O0(giftDialogContentView.f50281q.f50266i)) {
            return null;
        }
        return new AbstractC16991g4.a(this.f133619c.f50281q.f50266i);
    }

    /* JADX INFO: renamed from: y */
    public int m154463y() {
        GiftDialogContentView giftDialogContentView = this.f133619c;
        if (giftDialogContentView != null) {
            return giftDialogContentView.getCurrentShowGiftPanel().f50296i.getCurrentItem();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public GiftDialogContentView m154464z() {
        return this.f133619c;
    }
}
