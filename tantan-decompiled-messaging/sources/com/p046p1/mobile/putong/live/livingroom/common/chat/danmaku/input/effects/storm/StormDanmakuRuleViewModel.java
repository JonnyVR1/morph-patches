package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import p147v.VImage;
import p149l.ddv;
import p149l.jyf0;
import p149l.lyf0;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class StormDanmakuRuleViewModel extends LinearLayout implements s7m<jyf0> {

    /* JADX INFO: renamed from: a */
    public VImage f48793a;

    /* JADX INFO: renamed from: b */
    public LiveMkWebView f48794b;

    public StormDanmakuRuleViewModel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m72527b(View view) {
        lyf0.m152246a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(final jyf0 jyf0Var) {
        xdl0.m208329E0(this.f48793a, new View.OnClickListener() { // from class: l.kyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jyf0Var.m143869J3();
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
        LiveMkWebView liveMkWebView = this.f48794b;
        if (liveMkWebView != null) {
            liveMkWebView.m68867p();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72527b(this);
        LiveMkWebView liveMkWebView = this.f48794b;
        if (liveMkWebView != null) {
            String str = ddv.f85668r;
            CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
            liveMkWebView.m68876y(true, str, bgType);
            this.f48794b.setWebViewBg(bgType);
            this.f48794b.m68874w(str);
        }
    }
}
