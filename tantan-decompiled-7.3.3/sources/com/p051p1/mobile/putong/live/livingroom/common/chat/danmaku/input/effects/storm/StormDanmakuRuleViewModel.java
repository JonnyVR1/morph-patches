package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import p151v.VImage;
import p153l.bnl0;
import p153l.efv;
import p153l.iam;
import p153l.q6g0;
import p153l.s6g0;

/* JADX INFO: loaded from: classes4.dex */
public class StormDanmakuRuleViewModel extends LinearLayout implements iam<q6g0> {

    /* JADX INFO: renamed from: a */
    public VImage f49641a;

    /* JADX INFO: renamed from: b */
    public LiveMkWebView f49642b;

    public StormDanmakuRuleViewModel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m73710b(View view) {
        s6g0.m184885a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(final q6g0 q6g0Var) {
        bnl0.m105509E0(this.f49641a, new View.OnClickListener() { // from class: l.r6g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q6g0Var.m175593J3();
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
        LiveMkWebView liveMkWebView = this.f49642b;
        if (liveMkWebView != null) {
            liveMkWebView.m70050p();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73710b(this);
        LiveMkWebView liveMkWebView = this.f49642b;
        if (liveMkWebView != null) {
            String str = efv.f93861r;
            CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
            liveMkWebView.m70059y(true, str, bgType);
            this.f49642b.setWebViewBg(bgType);
            this.f49642b.m70057w(str);
        }
    }
}
