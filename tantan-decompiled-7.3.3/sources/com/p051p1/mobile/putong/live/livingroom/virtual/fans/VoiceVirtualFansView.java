package com.p051p1.mobile.putong.live.livingroom.virtual.fans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.ado0;
import p153l.bep0;
import p153l.bnl0;
import p153l.hep0;
import p153l.iam;
import p153l.jgc0;
import p153l.l51;
import p153l.obc0;
import p153l.qa00;
import p153l.vxr;
import p153l.x20;
import p153l.xau;
import p153l.yau;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualFansView extends RelativeLayout implements iam<bep0> {

    /* JADX INFO: renamed from: a */
    public TextView f53138a;

    /* JADX INFO: renamed from: b */
    public VText f53139b;

    /* JADX INFO: renamed from: c */
    public bep0 f53140c;

    /* JADX INFO: renamed from: d */
    public final PopupWindow f53141d;

    public VoiceVirtualFansView(Context context) {
        super(context);
        this.f53141d = new PopupWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m78122j(View view) {
        m78124s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m78123k(View view) {
        if (NullChecker.m82486a(this.f53140c)) {
            this.f53140c.m103771W3();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m78124s() {
        this.f53140c.m103773Z3();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public Act act() {
        return (Act) getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m78125e(View view) {
        hep0.m134670a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bep0 bep0Var) {
        this.f53140c = bep0Var;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m78128l() {
        if (this.f53141d.isShowing()) {
            this.f53141d.dismiss();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m78129m(SayHiBubbleView sayHiBubbleView, View view) {
        sayHiBubbleView.measure(bnl0.m105592y0(), bnl0.m105588w0());
        this.f53141d.showAsDropDown(view, -sayHiBubbleView.getMeasuredWidth(), -(view.getMeasuredHeight() - ((view.getMeasuredHeight() - qa00.m175859d(38.0f)) / 2)));
    }

    /* JADX INFO: renamed from: n */
    public void m78130n() {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f53138a, false);
        bnl0.m105524M(this.f53139b, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78125e(this);
        m78133r();
    }

    /* JADX INFO: renamed from: p */
    public void m78131p() {
        this.f53138a.setText("0");
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r7v9, types: [l.oo2] */
    /* JADX INFO: renamed from: q */
    public void m78132q(String str, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        final SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(yec0.f199092ga, (ViewGroup) null);
        sayHiBubbleView.setBackgroundResource(obc0.f146165Q9);
        int i = qa00.f156322i;
        int i2 = qa00.f156320g;
        sayHiBubbleView.setPadding(i, i2, qa00.f156325l, i2);
        sayHiBubbleView.m77831f(bLiveVoiceTagBubble, this.f53140c.m213810E2().m202194o(), this.f53140c.m213810E2().m168526j0(), this.f53140c.m213810E2().m202191k(), new x20() { // from class: l.eep0
            @Override // p153l.x20
            public final void call() {
                this.f93658a.m78128l();
            }
        });
        this.f53141d.setContentView(sayHiBubbleView);
        final TextView textView = this.f53138a;
        l51.m152886F(this.f53140c.act(), new Runnable() { // from class: l.fep0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98698a.m78129m(sayHiBubbleView, textView);
            }
        });
        l51.m152888H(this.f53140c.act(), new Runnable() { // from class: l.gep0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103850a.m78128l();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m78133r() {
        bnl0.m105509E0(this.f53138a, new View.OnClickListener() { // from class: l.cep0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81409a.m78122j(view);
            }
        });
        bnl0.m105509E0(this.f53139b, new View.OnClickListener() { // from class: l.dep0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88062a.m78123k(view);
            }
        });
        this.f53141d.setOutsideTouchable(true);
        this.f53141d.setWidth(-2);
        this.f53141d.setHeight(-2);
        this.f53141d.setAnimationStyle(jgc0.f120706m);
    }

    public void setData(ado0 ado0Var) {
        long jM97114J = ado0Var.m97114J();
        if (jM97114J > vxr.m203876d().m170983J1()) {
            VoiceChatInputView.f53867t = vxr.m203876d().m170981I1();
        } else {
            VoiceChatInputView.f53867t = 1000;
        }
        if (jM97114J > vxr.m203876d().m170985K1()) {
            CommonMaskAvatarView.setEnableMask(false);
            CommonMaskAvatarView.setEnableAnimMask(false);
        } else if (jM97114J < ((double) vxr.m203876d().m170985K1()) * 0.75d) {
            CommonMaskAvatarView.setEnableMask(true);
            CommonMaskAvatarView.setEnableAnimMask(true);
        }
        String strM209911u = xau.m209911u(R$string.f48441vi, Long.valueOf(ado0Var.m97114J()));
        if (yau.m214943k()) {
            strM209911u = String.valueOf(ado0Var.m97114J());
        }
        this.f53138a.setText(strM209911u);
    }

    /* JADX INFO: renamed from: u */
    public void m78134u(boolean z) {
        bnl0.m105524M(this, z);
        if (z) {
            bnl0.m105524M(this.f53138a, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m78135v(double d) {
        this.f53138a.setText(String.valueOf(d));
    }

    public VoiceVirtualFansView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53141d = new PopupWindow();
    }

    public VoiceVirtualFansView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53141d = new PopupWindow();
    }
}
