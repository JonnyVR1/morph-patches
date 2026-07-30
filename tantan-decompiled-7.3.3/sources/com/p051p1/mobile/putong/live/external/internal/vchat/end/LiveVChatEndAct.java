package com.p051p1.mobile.putong.live.external.internal.vchat.end;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.btu;
import p153l.dhw;
import p153l.efv;
import p153l.hgc0;
import p153l.jwu;
import p153l.nbc0;
import p153l.nsh0;
import p153l.o1j0;
import p153l.q7c0;
import p153l.th0;
import p153l.tju;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatEndAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VImage f45946c;

    /* JADX INFO: renamed from: d */
    public VText f45947d;

    /* JADX INFO: renamed from: e */
    public VText f45948e;

    /* JADX INFO: renamed from: f */
    public VText f45949f;

    /* JADX INFO: renamed from: g */
    public View f45950g;

    /* JADX INFO: renamed from: h */
    public ImageView f45951h;

    /* JADX INFO: renamed from: i */
    public VText f45952i;

    /* JADX INFO: renamed from: j */
    public View f45953j;

    /* JADX INFO: renamed from: k */
    public ImageView f45954k;

    /* JADX INFO: renamed from: l */
    public VText f45955l;

    /* JADX INFO: renamed from: m */
    public View f45956m;

    /* JADX INFO: renamed from: n */
    public ImageView f45957n;

    /* JADX INFO: renamed from: o */
    public VText f45958o;

    /* JADX INFO: renamed from: p */
    public VText f45959p;

    /* JADX INFO: renamed from: q */
    public String f45960q;

    /* JADX INFO: renamed from: r */
    public String f45961r;

    /* JADX INFO: renamed from: s */
    public th0 f45962s;

    /* JADX INFO: renamed from: t */
    public BottomSheetDialog f45963t;

    /* JADX INFO: renamed from: u */
    public String f45964u = "satisfied";

    /* JADX INFO: renamed from: i2 */
    public static Intent m70468i2(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatEndAct.class);
        intent.putExtra("live_force_stop_content", str3);
        intent.putExtra("live_chat_id", str);
        intent.putExtra("live_anchor_id", str2);
        intent.putExtra("live_trace_id", str4);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m70469k2(View view) {
        m70479u2(this.f45960q);
    }

    /* JADX INFO: renamed from: s2 */
    private void m70470s2(String str, String str2, String str3, String str4, long j) {
        act().startActivity(LiveWebViewAct.m70066d2(act(), efv.m120734l(str, str2, str3, str4, j)));
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        act().overridePendingTransition(0, q7c0.f155957f);
    }

    /* JADX INFO: renamed from: h2 */
    public View m70471h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tju.m191457b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f45960q = (String) getIntent().getSerializableExtra("live_chat_id");
        this.f45961r = (String) getIntent().getSerializableExtra("live_force_stop_content");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (TextUtils.isEmpty(this.f45961r)) {
            m70479u2(this.f45960q);
            nsh0.m164608j("videoChat", "LiveVChatEndAct requestAndShowSummary ");
            return;
        }
        th0 th0VarM191142a = new th0.C20312a(this.act).m191151j(this.f45961r).m191156o(new View.OnClickListener() { // from class: l.kju
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127142a.m70469k2(view);
            }
        }).m191159r("好的").m191142a();
        this.f45962s = th0VarM191142a;
        th0VarM191142a.m191141g();
        nsh0.m164608j("videoChat", "LiveVChatEndAct show alert:" + this.f45961r);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m70472l2(Throwable th) {
        this.act.m68056e2();
        o1j0.m165634h(R$string.f47568H9);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m70473m2(BLiveVideoChatSummary bLiveVideoChatSummary, View view) {
        this.f45963t.dismiss();
        btu.m106392h(bLiveVideoChatSummary.anchor.userId, bLiveVideoChatSummary.chatId, this.f45964u);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m70474n2(BLiveVideoChatSummary bLiveVideoChatSummary, View view) {
        String str = bLiveVideoChatSummary.anchor.userId;
        m70470s2(str, str, bLiveVideoChatSummary.liveId, bLiveVideoChatSummary.roomId, bLiveVideoChatSummary.endTime);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m70475o2(DialogInterface dialogInterface) {
        this.act.m68056e2();
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m70476p2(View view) {
        this.f45964u = "dissatisfied";
        m70480v2(this.f45950g, false);
        m70480v2(this.f45956m, false);
        m70480v2(this.f45953j, false);
        View view2 = this.f45950g;
        m70480v2(view2, !view2.isSelected());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m70477q2(View view) {
        this.f45964u = "basic_satisfaction";
        m70480v2(this.f45950g, false);
        m70480v2(this.f45956m, false);
        m70480v2(this.f45953j, false);
        View view2 = this.f45953j;
        m70480v2(view2, !view2.isSelected());
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m70478r2(View view) {
        this.f45964u = "satisfied";
        m70480v2(this.f45950g, false);
        m70480v2(this.f45956m, false);
        m70480v2(this.f45953j, false);
        View view2 = this.f45956m;
        m70480v2(view2, !view2.isSelected());
    }

    /* JADX INFO: renamed from: u2 */
    public final void m70479u2(String str) {
        nsh0.m164608j("videoChat", "requestAndShowSummary:" + str);
        duringCreated(jwu.m147236K(str)).subscribe(dhw.m115826e(new y20() { // from class: l.lju
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132413a.m70481w2((BLiveVideoChatSummary) obj);
            }
        }, new y20() { // from class: l.mju
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137161a.m70472l2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m70480v2(View view, boolean z) {
        view.setSelected(z);
        boolean zIsSelected = view.isSelected();
        View view2 = this.f45950g;
        if (zIsSelected) {
            if (view == view2) {
                this.f45951h.setImageResource(nbc0.f141113L0);
                return;
            } else if (view == this.f45953j) {
                this.f45954k.setImageResource(nbc0.f141105H0);
                return;
            } else {
                if (view == this.f45956m) {
                    this.f45957n.setImageResource(nbc0.f141109J0);
                    return;
                }
                return;
            }
        }
        if (view == view2) {
            this.f45951h.setImageResource(nbc0.f141115M0);
        } else if (view == this.f45953j) {
            this.f45954k.setImageResource(nbc0.f141107I0);
        } else if (view == this.f45956m) {
            this.f45957n.setImageResource(nbc0.f141111K0);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final void m70481w2(final BLiveVideoChatSummary bLiveVideoChatSummary) {
        if (this.f45963t == null) {
            this.f45963t = new BottomSheetDialog(this.act, hgc0.f109387d);
            this.f45963t.setContentView(m70471h2(this.act.inflater(), null));
            bnl0.m105509E0(this.f45959p, new View.OnClickListener() { // from class: l.nju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142346a.m70473m2(bLiveVideoChatSummary, view);
                }
            });
            bnl0.m105509E0(this.f45946c, new View.OnClickListener() { // from class: l.oju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147719a.m70474n2(bLiveVideoChatSummary, view);
                }
            });
            this.f45963t.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pju
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f152743a.m70475o2(dialogInterface);
                }
            });
            this.f45948e.setText(String.format("本次通话时长%d分钟", Integer.valueOf(bLiveVideoChatSummary.orderMinutes)));
            this.f45949f.setText("请评价本次和 " + xau.m209906p(bLiveVideoChatSummary.anchor.userName, 6) + " 的通话体验");
            bnl0.m105509E0(this.f45950g, new View.OnClickListener() { // from class: l.qju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158049a.m70476p2(view);
                }
            });
            bnl0.m105509E0(this.f45953j, new View.OnClickListener() { // from class: l.rju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163515a.m70477q2(view);
                }
            });
            bnl0.m105509E0(this.f45956m, new View.OnClickListener() { // from class: l.sju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169178a.m70478r2(view);
                }
            });
        }
        this.f45963t.show();
        btu.m106393i(bLiveVideoChatSummary.anchor.userId, bLiveVideoChatSummary.chatId);
    }
}
