package com.p046p1.mobile.putong.live.external.internal.vchat.end;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.aru;
import p149l.c8c0;
import p149l.ddv;
import p149l.e30;
import p149l.ffw;
import p149l.gkh0;
import p149l.h3c0;
import p149l.iuu;
import p149l.lsi0;
import p149l.shu;
import p149l.w8u;
import p149l.wzb0;
import p149l.xdl0;
import p149l.xh0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatEndAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VImage f45098c;

    /* JADX INFO: renamed from: d */
    public VText f45099d;

    /* JADX INFO: renamed from: e */
    public VText f45100e;

    /* JADX INFO: renamed from: f */
    public VText f45101f;

    /* JADX INFO: renamed from: g */
    public View f45102g;

    /* JADX INFO: renamed from: h */
    public ImageView f45103h;

    /* JADX INFO: renamed from: i */
    public VText f45104i;

    /* JADX INFO: renamed from: j */
    public View f45105j;

    /* JADX INFO: renamed from: k */
    public ImageView f45106k;

    /* JADX INFO: renamed from: l */
    public VText f45107l;

    /* JADX INFO: renamed from: m */
    public View f45108m;

    /* JADX INFO: renamed from: n */
    public ImageView f45109n;

    /* JADX INFO: renamed from: o */
    public VText f45110o;

    /* JADX INFO: renamed from: p */
    public VText f45111p;

    /* JADX INFO: renamed from: q */
    public String f45112q;

    /* JADX INFO: renamed from: r */
    public String f45113r;

    /* JADX INFO: renamed from: s */
    public xh0 f45114s;

    /* JADX INFO: renamed from: t */
    public BottomSheetDialog f45115t;

    /* JADX INFO: renamed from: u */
    public String f45116u = "satisfied";

    /* JADX INFO: renamed from: h2 */
    public static Intent m69285h2(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatEndAct.class);
        intent.putExtra("live_force_stop_content", str3);
        intent.putExtra("live_chat_id", str);
        intent.putExtra("live_anchor_id", str2);
        intent.putExtra("live_trace_id", str4);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m69286i2(View view) {
        m69296s2(this.f45112q);
    }

    /* JADX INFO: renamed from: r2 */
    private void m69287r2(String str, String str2, String str3, String str4, long j) {
        act().startActivity(LiveWebViewAct.m68883c2(act(), ddv.m111079l(str, str2, str3, str4, j)));
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        act().overridePendingTransition(0, wzb0.f188723f);
    }

    /* JADX INFO: renamed from: g2 */
    public View m69288g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return shu.m184267b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f45112q = (String) getIntent().getSerializableExtra("live_chat_id");
        this.f45113r = (String) getIntent().getSerializableExtra("live_force_stop_content");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (TextUtils.isEmpty(this.f45113r)) {
            m69296s2(this.f45112q);
            gkh0.m126627j("videoChat", "LiveVChatEndAct requestAndShowSummary ");
            return;
        }
        xh0 xh0VarM208722a = new xh0.C21150a(this.act).m208731j(this.f45113r).m208736o(new View.OnClickListener() { // from class: l.jhu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118017a.m69286i2(view);
            }
        }).m208739r("好的").m208722a();
        this.f45114s = xh0VarM208722a;
        xh0VarM208722a.m208721g();
        gkh0.m126627j("videoChat", "LiveVChatEndAct show alert:" + this.f45113r);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m69289k2(Throwable th) {
        this.act.m66873d2();
        lsi0.m151578h(R$string.f46720H9);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m69290l2(BLiveVideoChatSummary bLiveVideoChatSummary, View view) {
        this.f45115t.dismiss();
        aru.m98559h(bLiveVideoChatSummary.anchor.userId, bLiveVideoChatSummary.chatId, this.f45116u);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m69291m2(BLiveVideoChatSummary bLiveVideoChatSummary, View view) {
        String str = bLiveVideoChatSummary.anchor.userId;
        m69287r2(str, str, bLiveVideoChatSummary.liveId, bLiveVideoChatSummary.roomId, bLiveVideoChatSummary.endTime);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m69292n2(DialogInterface dialogInterface) {
        this.act.m66873d2();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m69293o2(View view) {
        this.f45116u = "dissatisfied";
        m69297u2(this.f45102g, false);
        m69297u2(this.f45108m, false);
        m69297u2(this.f45105j, false);
        View view2 = this.f45102g;
        m69297u2(view2, !view2.isSelected());
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m69294p2(View view) {
        this.f45116u = "basic_satisfaction";
        m69297u2(this.f45102g, false);
        m69297u2(this.f45108m, false);
        m69297u2(this.f45105j, false);
        View view2 = this.f45105j;
        m69297u2(view2, !view2.isSelected());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m69295q2(View view) {
        this.f45116u = "satisfied";
        m69297u2(this.f45102g, false);
        m69297u2(this.f45108m, false);
        m69297u2(this.f45105j, false);
        View view2 = this.f45108m;
        m69297u2(view2, !view2.isSelected());
    }

    /* JADX INFO: renamed from: s2 */
    public final void m69296s2(String str) {
        gkh0.m126627j("videoChat", "requestAndShowSummary:" + str);
        duringCreated(iuu.m138450K(str)).subscribe(ffw.m121194e(new e30() { // from class: l.khu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123231a.m69298v2((BLiveVideoChatSummary) obj);
            }
        }, new e30() { // from class: l.lhu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128138a.m69289k2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2 */
    public void m69297u2(View view, boolean z) {
        view.setSelected(z);
        boolean zIsSelected = view.isSelected();
        View view2 = this.f45102g;
        if (zIsSelected) {
            if (view == view2) {
                this.f45103h.setImageResource(h3c0.f105622L0);
                return;
            } else if (view == this.f45105j) {
                this.f45106k.setImageResource(h3c0.f105614H0);
                return;
            } else {
                if (view == this.f45108m) {
                    this.f45109n.setImageResource(h3c0.f105618J0);
                    return;
                }
                return;
            }
        }
        if (view == view2) {
            this.f45103h.setImageResource(h3c0.f105624M0);
        } else if (view == this.f45105j) {
            this.f45106k.setImageResource(h3c0.f105616I0);
        } else if (view == this.f45108m) {
            this.f45109n.setImageResource(h3c0.f105620K0);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m69298v2(final BLiveVideoChatSummary bLiveVideoChatSummary) {
        if (this.f45115t == null) {
            this.f45115t = new BottomSheetDialog(this.act, c8c0.f79739d);
            this.f45115t.setContentView(m69288g2(this.act.inflater(), null));
            xdl0.m208329E0(this.f45111p, new View.OnClickListener() { // from class: l.mhu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133910a.m69290l2(bLiveVideoChatSummary, view);
                }
            });
            xdl0.m208329E0(this.f45098c, new View.OnClickListener() { // from class: l.nhu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139034a.m69291m2(bLiveVideoChatSummary, view);
                }
            });
            this.f45115t.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ohu
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f144048a.m69292n2(dialogInterface);
                }
            });
            this.f45100e.setText(String.format("本次通话时长%d分钟", Integer.valueOf(bLiveVideoChatSummary.orderMinutes)));
            this.f45101f.setText("请评价本次和 " + w8u.m202213p(bLiveVideoChatSummary.anchor.userName, 6) + " 的通话体验");
            xdl0.m208329E0(this.f45102g, new View.OnClickListener() { // from class: l.phu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149053a.m69293o2(view);
                }
            });
            xdl0.m208329E0(this.f45105j, new View.OnClickListener() { // from class: l.qhu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f154520a.m69294p2(view);
                }
            });
            xdl0.m208329E0(this.f45108m, new View.OnClickListener() { // from class: l.rhu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159493a.m69295q2(view);
                }
            });
        }
        this.f45115t.show();
        aru.m98560i(bLiveVideoChatSummary.anchor.userId, bLiveVideoChatSummary.chatId);
    }
}
