package com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansInvitationView;
import com.p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p1.mobile.putong.live.base.data.BQuickInvite;
import com.tantanapp.common.data.DbObject;
import l.hpd0;
import l.hxs;
import l.qib0;
import l.t100;
import l.xdl0;
import l.ydt;
import p002l.ofg;
import p002l.x8g;
import p002l.xgg;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansInvitationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f5048d;

    /* JADX INFO: renamed from: e */
    public VText f5049e;

    /* JADX INFO: renamed from: f */
    public VText f5050f;

    /* JADX INFO: renamed from: g */
    public VText f5051g;

    /* JADX INFO: renamed from: h */
    public Handler f5052h;

    /* JADX INFO: renamed from: i */
    public int f5053i;

    /* JADX INFO: renamed from: j */
    public String f5054j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansInvitationView$a */
    public class HandlerC0344a extends Handler {
        public HandlerC0344a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (FansInvitationView.this.f5053i > 0) {
                FansInvitationView.this.f5053i--;
                FansInvitationView.this.m6376n0();
            }
        }
    }

    public FansInvitationView(Context context) {
        super(context);
        this.f5052h = new HandlerC0344a(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m6370h0(x8g x8gVar, BFansBaseRecall bFansBaseRecall, View view) {
        xgg.m25929d(((DbObject) x8gVar.m25547E2().m14582l0()).id, x8gVar.m25547E2().m17235k(), "push");
        if (((Boolean) new hpd0("live_fans_invitation" + qib0.b0.a.userId(), Boolean.FALSE).get()).booleanValue()) {
            x8gVar.m25765u4();
        } else {
            x8gVar.m25548F2().FansInvitationEvent.showInvitationDialog().j(bFansBaseRecall.inviteDetail.title);
        }
    }

    public String getTimeStr() {
        int i = this.f5053i;
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6374l0(View view) {
        ofg.m19447a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m6375m0(final x8g x8gVar, final BFansBaseRecall bFansBaseRecall) {
        BQuickInvite bQuickInvite = bFansBaseRecall.quickInvite;
        this.f5053i = bQuickInvite.countDown;
        this.f5054j = bQuickInvite.desc;
        hxs.m("context_livingAct", this.f5048d, ydt.j, t100.d(54.0f), t100.d(54.0f));
        this.f5049e.setText(bFansBaseRecall.quickInvite.title);
        this.f5050f.setText(bFansBaseRecall.quickInvite.desc);
        this.f5051g.setEnabled(bFansBaseRecall.quickInvite.enable && this.f5053i == 0);
        this.f5051g.setText(bFansBaseRecall.quickInvite.buttonText);
        xdl0.E0(this.f5051g, new View.OnClickListener() { // from class: l.nfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansInvitationView.m6370h0(x8gVar, bFansBaseRecall, view);
            }
        });
        if (this.f5053i == 0 || bFansBaseRecall.quickInvite.enable) {
            return;
        }
        m6376n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m6376n0() {
        int i = this.f5053i;
        Handler handler = this.f5052h;
        if (i == 0) {
            handler.removeCallbacksAndMessages(null);
            this.f5051g.setEnabled(true);
            this.f5050f.setText(this.f5054j);
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.f5050f.setText(Html.fromHtml("<font color='#fe7e1d'>" + getTimeStr() + "</font> " + getContext().getResources().getString(R$string.f3555s4)));
        this.f5052h.sendEmptyMessageDelayed(0, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f5052h.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6374l0(this);
    }

    public FansInvitationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5052h = new HandlerC0344a(Looper.getMainLooper());
    }

    public FansInvitationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5052h = new HandlerC0344a(Looper.getMainLooper());
    }
}
