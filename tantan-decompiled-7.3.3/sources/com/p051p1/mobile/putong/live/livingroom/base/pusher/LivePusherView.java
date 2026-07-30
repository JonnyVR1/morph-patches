package com.p051p1.mobile.putong.live.livingroom.base.pusher;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.LiveLoadingView;
import p151v.VText;
import p153l.abc0;
import p153l.bnl0;
import p153l.cpb0;
import p153l.d4m;
import p153l.gft;
import p153l.iam;
import p153l.lu6;
import p153l.mdc0;
import p153l.qa00;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LivePusherView extends FrameLayout implements iam<cpb0>, d4m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f48718a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f48719b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f48720c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f48721d;

    /* JADX INFO: renamed from: e */
    public VText f48722e;

    /* JADX INFO: renamed from: f */
    public ImageView f48723f;

    /* JADX INFO: renamed from: g */
    public ViewStub f48724g;

    /* JADX INFO: renamed from: h */
    public ViewStub f48725h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f48726i;

    /* JADX INFO: renamed from: j */
    public cpb0 f48727j;

    /* JADX INFO: renamed from: k */
    public PopupWindow f48728k;

    /* JADX INFO: renamed from: l */
    public int f48729l;

    /* JADX INFO: renamed from: m */
    public LiveLoadingView f48730m;

    public LivePusherView(@NonNull Context context) {
        super(context);
        this.f48729l = -qa00.m175859d(50.0f);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.d4m
    /* JADX INFO: renamed from: a */
    public void mo73156a(String str, final int i) {
        m73161i(false);
        if (this.f48726i == null) {
            LinearLayout linearLayout = (LinearLayout) this.f48725h.inflate();
            this.f48726i = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f48726i.findViewById(mdc0.f136274q1).setOnClickListener(new View.OnClickListener() { // from class: l.fft
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98830a.m73160f(i, view);
                }
            });
        }
        ((TextView) this.f48726i.findViewById(mdc0.f136301t1)).setText(str);
        this.f48726i.setTag(mdc0.f135932F3, Integer.valueOf(i));
        bnl0.m105524M(this.f48726i, true);
    }

    @Override // p153l.d4m
    /* JADX INFO: renamed from: b */
    public void mo73157b() {
        LinearLayout linearLayout = this.f48726i;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m73158d(View view) {
        gft.m130119a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
        m73161i(false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cpb0 cpb0Var) {
        this.f48727j = cpb0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73160f(int i, View view) {
        this.f48727j.mo95984q1(RefreshCause.ClickError, i);
    }

    @Override // p153l.d4m
    public int getErrorCode() {
        LinearLayout linearLayout = this.f48726i;
        if (linearLayout == null) {
            return 0;
        }
        Object tag = linearLayout.getTag(mdc0.f135932F3);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m73161i(boolean z) {
        m73162j(z);
        PopupWindow popupWindow = this.f48728k;
        if (!z) {
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f48728k.dismiss();
            return;
        }
        if (popupWindow == null) {
            View viewInflate = View.inflate(getContext(), yec0.f199327yb, null);
            viewInflate.setBackgroundDrawable(getContext().getResources().getDrawable(abc0.f69545r6));
            ((TextView) viewInflate.findViewById(R.id.message)).setText(lu6.m155847c(zrv.m221193k().m203546W3()));
            PopupWindow popupWindow2 = new PopupWindow(getContext());
            this.f48728k = popupWindow2;
            popupWindow2.setContentView(viewInflate);
            this.f48728k.setTouchable(false);
            this.f48728k.setBackgroundDrawable(null);
        }
        if (this.f48728k.isShowing()) {
            return;
        }
        this.f48728k.showAtLocation(this, 17, 0, this.f48729l);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m73162j(boolean z) {
        if (z || this.f48730m != null) {
            if (this.f48730m == null) {
                this.f48730m = (LiveLoadingView) this.f48724g.inflate();
            }
            LiveLoadingView liveLoadingView = this.f48730m;
            if (z) {
                bnl0.m105524M(liveLoadingView, true);
                this.f48730m.m69927g();
            } else {
                liveLoadingView.m69928h();
                bnl0.m105524M(this.f48724g, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73158d(this);
        C12878a.INSTANCE.m73163a(this.f48723f);
    }

    public void setWaterMarkUserId(String str) {
        this.f48722e.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        bnl0.m105524M(this.f48721d, z);
    }

    public LivePusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48729l = -qa00.m175859d(50.0f);
    }

    public LivePusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48729l = -qa00.m175859d(50.0f);
    }
}
