package com.p000p1.mobile.putong.live.livingroom.common.signin.rule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.ddv;
import p002l.q4f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInRuleFrame extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f5423a;

    /* JADX INFO: renamed from: b */
    public LiveMkWebView f5424b;

    /* JADX INFO: renamed from: c */
    public C0358a f5425c;

    public SignInRuleFrame(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m6816b(View view) {
        q4f0.m21021a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6817c(C0358a c0358a) {
        this.f5425c = c0358a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m6818d(View view) {
        C0358a c0358a = this.f5425c;
        if (c0358a != null) {
            c0358a.m6702r4(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m6819e() {
        LiveMkWebView liveMkWebView = this.f5424b;
        if (liveMkWebView != null) {
            liveMkWebView.p();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6816b(this);
        LiveMkWebView liveMkWebView = this.f5424b;
        if (liveMkWebView != null) {
            String str = ddv.q;
            CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
            liveMkWebView.y(true, str, bgType);
            this.f5424b.setWebViewBg(bgType);
            this.f5424b.w(str);
        }
        this.f5423a.d(R$string.f2854Ld, true);
        this.f5423a.setBackListener(new View.OnClickListener() { // from class: l.p4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17001a.m6818d(view);
            }
        });
        this.f5423a.setLeftView(1);
        this.f5423a.setDivider(true);
    }
}
