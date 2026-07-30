package com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p051p1.mobile.putong.live.base.data.BQuickInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansInvitationView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.chg;
import p153l.izs;
import p153l.jxd0;
import p153l.lag;
import p153l.lig;
import p153l.qa00;
import p153l.uqb0;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class FansInvitationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49854d;

    /* JADX INFO: renamed from: e */
    public VText f49855e;

    /* JADX INFO: renamed from: f */
    public VText f49856f;

    /* JADX INFO: renamed from: g */
    public VText f49857g;

    /* JADX INFO: renamed from: h */
    public Handler f49858h;

    /* JADX INFO: renamed from: i */
    public int f49859i;

    /* JADX INFO: renamed from: j */
    public String f49860j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansInvitationView$a */
    public class HandlerC12918a extends Handler {
        public HandlerC12918a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (FansInvitationView.this.f49859i > 0) {
                FansInvitationView.this.f49859i--;
                FansInvitationView.this.m74040n0();
            }
        }
    }

    public FansInvitationView(Context context) {
        super(context);
        this.f49858h = new HandlerC12918a(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2] */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74034h0(lag lagVar, BFansBaseRecall bFansBaseRecall, View view) {
        lig.m154374d(lagVar.m213810E2().m168532l0().f56859id, lagVar.m213810E2().m202191k(), "push");
        if (new jxd0("live_fans_invitation" + uqb0.f180396b0.f170324a.userId(), Boolean.FALSE).get().booleanValue()) {
            lagVar.m153493u4();
        } else {
            lagVar.m213811F2().FansInvitationEvent.showInvitationDialog().mo199273j(bFansBaseRecall.inviteDetail.title);
        }
    }

    public String getTimeStr() {
        int i = this.f49859i;
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74038l0(View view) {
        chg.m109769a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m74039m0(final lag lagVar, final BFansBaseRecall bFansBaseRecall) {
        BQuickInvite bQuickInvite = bFansBaseRecall.quickInvite;
        this.f49859i = bQuickInvite.countDown;
        this.f49860j = bQuickInvite.desc;
        izs.m142862m("context_livingAct", this.f49854d, zft.f204215j, qa00.m175859d(54.0f), qa00.m175859d(54.0f));
        this.f49855e.setText(bFansBaseRecall.quickInvite.title);
        this.f49856f.setText(bFansBaseRecall.quickInvite.desc);
        this.f49857g.setEnabled(bFansBaseRecall.quickInvite.enable && this.f49859i == 0);
        this.f49857g.setText(bFansBaseRecall.quickInvite.buttonText);
        bnl0.m105509E0(this.f49857g, new View.OnClickListener() { // from class: l.bhg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansInvitationView.m74034h0(lagVar, bFansBaseRecall, view);
            }
        });
        if (this.f49859i == 0 || bFansBaseRecall.quickInvite.enable) {
            return;
        }
        m74040n0();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m74040n0() {
        int i = this.f49859i;
        Handler handler = this.f49858h;
        if (i == 0) {
            handler.removeCallbacksAndMessages(null);
            this.f49857g.setEnabled(true);
            this.f49856f.setText(this.f49860j);
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.f49856f.setText(Html.fromHtml("<font color='#fe7e1d'>" + getTimeStr() + "</font> " + getContext().getResources().getString(R$string.f48361s4)));
        this.f49858h.sendEmptyMessageDelayed(0, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49858h.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74038l0(this);
    }

    public FansInvitationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49858h = new HandlerC12918a(Looper.getMainLooper());
    }

    public FansInvitationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49858h = new HandlerC12918a(Looper.getMainLooper());
    }
}
