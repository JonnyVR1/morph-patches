package com.p051p1.mobile.putong.live.livingroom.common.signin.rule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import p153l.efv;
import p153l.xcf0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInRuleFrame extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f50229a;

    /* JADX INFO: renamed from: b */
    public LiveMkWebView f50230b;

    /* JADX INFO: renamed from: c */
    public C12932a f50231c;

    public SignInRuleFrame(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m74464b(View view) {
        xcf0.m210147a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74465c(C12932a c12932a) {
        this.f50231c = c12932a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74466d(View view) {
        C12932a c12932a = this.f50231c;
        if (c12932a != null) {
            c12932a.m74357r4(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m74467e() {
        LiveMkWebView liveMkWebView = this.f50230b;
        if (liveMkWebView != null) {
            liveMkWebView.m70050p();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74464b(this);
        LiveMkWebView liveMkWebView = this.f50230b;
        if (liveMkWebView != null) {
            String str = efv.f93860q;
            CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
            liveMkWebView.m70059y(true, str, bgType);
            this.f50230b.setWebViewBg(bgType);
            this.f50230b.m70057w(str);
        }
        this.f50229a.m69896d(R$string.f47660Ld, true);
        this.f50229a.setBackListener(new View.OnClickListener() { // from class: l.wcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188472a.m74466d(view);
            }
        });
        this.f50229a.setLeftView(1);
        this.f50229a.setDivider(true);
    }
}
