package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.ddv;
import l.s7m;
import l.xdl0;
import p002l.jyf0;
import p002l.lyf0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class StormDanmakuRuleViewModel extends LinearLayout implements s7m<jyf0> {

    /* JADX INFO: renamed from: a */
    public VImage f4835a;

    /* JADX INFO: renamed from: b */
    public LiveMkWebView f4836b;

    public StormDanmakuRuleViewModel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6019C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m6020b(View view) {
        lyf0.m17622a(this, view);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m6022i1(final jyf0 jyf0Var) {
        xdl0.E0(this.f4835a, new View.OnClickListener() { // from class: l.kyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jyf0Var.m16450J3();
            }
        });
    }

    public void destroy() {
        LiveMkWebView liveMkWebView = this.f4836b;
        if (liveMkWebView != null) {
            liveMkWebView.p();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6020b(this);
        LiveMkWebView liveMkWebView = this.f4836b;
        if (liveMkWebView != null) {
            String str = ddv.r;
            CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
            liveMkWebView.y(true, str, bgType);
            this.f4836b.setWebViewBg(bgType);
            this.f4836b.w(str);
        }
    }
}
