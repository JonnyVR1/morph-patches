package com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p046p1.mobile.putong.live.base.data.BQuickInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansInvitationView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hpd0;
import p149l.hxs;
import p149l.ofg;
import p149l.qib0;
import p149l.t100;
import p149l.x8g;
import p149l.xdl0;
import p149l.xgg;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class FansInvitationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49006d;

    /* JADX INFO: renamed from: e */
    public VText f49007e;

    /* JADX INFO: renamed from: f */
    public VText f49008f;

    /* JADX INFO: renamed from: g */
    public VText f49009g;

    /* JADX INFO: renamed from: h */
    public Handler f49010h;

    /* JADX INFO: renamed from: i */
    public int f49011i;

    /* JADX INFO: renamed from: j */
    public String f49012j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansInvitationView$a */
    public class HandlerC12755a extends Handler {
        public HandlerC12755a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (FansInvitationView.this.f49011i > 0) {
                FansInvitationView.this.f49011i--;
                FansInvitationView.this.m72857n0();
            }
        }
    }

    public FansInvitationView(Context context) {
        super(context);
        this.f49010h = new HandlerC12755a(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m72851h0(x8g x8gVar, BFansBaseRecall bFansBaseRecall, View view) {
        xgg.m208676d(x8gVar.m206027E2().m132146l0().f56011id, x8gVar.m206027E2().m149814k(), "push");
        if (new hpd0("live_fans_invitation" + qib0.f154713b0.f139230a.userId(), Boolean.FALSE).get().booleanValue()) {
            x8gVar.m207388u4();
        } else {
            x8gVar.m206028F2().FansInvitationEvent.showInvitationDialog().mo172463j(bFansBaseRecall.inviteDetail.title);
        }
    }

    public String getTimeStr() {
        int i = this.f49011i;
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m72855l0(View view) {
        ofg.m164067a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m72856m0(final x8g x8gVar, final BFansBaseRecall bFansBaseRecall) {
        BQuickInvite bQuickInvite = bFansBaseRecall.quickInvite;
        this.f49011i = bQuickInvite.countDown;
        this.f49012j = bQuickInvite.desc;
        hxs.m133400m("context_livingAct", this.f49006d, ydt.f197620j, t100.m186890d(54.0f), t100.m186890d(54.0f));
        this.f49007e.setText(bFansBaseRecall.quickInvite.title);
        this.f49008f.setText(bFansBaseRecall.quickInvite.desc);
        this.f49009g.setEnabled(bFansBaseRecall.quickInvite.enable && this.f49011i == 0);
        this.f49009g.setText(bFansBaseRecall.quickInvite.buttonText);
        xdl0.m208329E0(this.f49009g, new View.OnClickListener() { // from class: l.nfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansInvitationView.m72851h0(x8gVar, bFansBaseRecall, view);
            }
        });
        if (this.f49011i == 0 || bFansBaseRecall.quickInvite.enable) {
            return;
        }
        m72857n0();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m72857n0() {
        int i = this.f49011i;
        Handler handler = this.f49010h;
        if (i == 0) {
            handler.removeCallbacksAndMessages(null);
            this.f49009g.setEnabled(true);
            this.f49008f.setText(this.f49012j);
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.f49008f.setText(Html.fromHtml("<font color='#fe7e1d'>" + getTimeStr() + "</font> " + getContext().getResources().getString(R$string.f47513s4)));
        this.f49010h.sendEmptyMessageDelayed(0, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49010h.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72855l0(this);
    }

    public FansInvitationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49010h = new HandlerC12755a(Looper.getMainLooper());
    }

    public FansInvitationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49010h = new HandlerC12755a(Looper.getMainLooper());
    }
}
