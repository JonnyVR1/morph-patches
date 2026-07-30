package com.p046p1.mobile.putong.live.livingroom.common.signin.rule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import p149l.ddv;
import p149l.q4f0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInRuleFrame extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f49381a;

    /* JADX INFO: renamed from: b */
    public LiveMkWebView f49382b;

    /* JADX INFO: renamed from: c */
    public C12769a f49383c;

    public SignInRuleFrame(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m73281b(View view) {
        q4f0.m172933a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73282c(C12769a c12769a) {
        this.f49383c = c12769a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m73283d(View view) {
        C12769a c12769a = this.f49383c;
        if (c12769a != null) {
            c12769a.m73174r4(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m73284e() {
        LiveMkWebView liveMkWebView = this.f49382b;
        if (liveMkWebView != null) {
            liveMkWebView.m68867p();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73281b(this);
        LiveMkWebView liveMkWebView = this.f49382b;
        if (liveMkWebView != null) {
            String str = ddv.f85667q;
            CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
            liveMkWebView.m68876y(true, str, bgType);
            this.f49382b.setWebViewBg(bgType);
            this.f49382b.m68874w(str);
        }
        this.f49381a.m68713d(R$string.f46812Ld, true);
        this.f49381a.setBackListener(new View.OnClickListener() { // from class: l.p4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147168a.m73283d(view);
            }
        });
        this.f49381a.setLeftView(1);
        this.f49381a.setDivider(true);
    }
}
