package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.cad0;
import p153l.y9d0;

/* JADX INFO: loaded from: classes9.dex */
public class RightDetailDialogContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RightDetailDialogContentView f46884a;

    /* JADX INFO: renamed from: b */
    public View f46885b;

    /* JADX INFO: renamed from: c */
    public CardView f46886c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f46887d;

    /* JADX INFO: renamed from: e */
    public VImage f46888e;

    /* JADX INFO: renamed from: f */
    public cad0 f46889f;

    public RightDetailDialogContentView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m71762c(View view) {
        y9d0.m214818a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m71763d() {
        LiveMkWebView liveMkWebView = this.f46887d;
        if (liveMkWebView != null) {
            liveMkWebView.m70056v();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m71764e(View view) {
        this.f46889f.m108483d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m71765f(View view) {
        this.f46889f.m108483d();
    }

    /* JADX INFO: renamed from: g */
    public void m71766g() {
        LiveMkWebView liveMkWebView = this.f46887d;
        if (liveMkWebView != null) {
            liveMkWebView.m70050p();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m71767h(Act act, String str, String str2, cad0 cad0Var) {
        this.f46889f = cad0Var;
        boolean zM82486a = NullChecker.m82486a(Uri.parse(str).getQueryParameter("_bid"));
        this.f46887d.m70050p();
        this.f46887d.removeAllViews();
        LiveMkWebView liveMkWebView = this.f46887d;
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebView.m70059y(zM82486a, str, bgType);
        this.f46887d.setWebViewBg(bgType);
        this.f46887d.m70045k((PutongAct) act, str2, str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71762c(this);
        this.f46888e.setOnClickListener(new View.OnClickListener() { // from class: l.w9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188003a.m71764e(view);
            }
        });
        this.f46885b.setOnClickListener(new View.OnClickListener() { // from class: l.x9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192934a.m71765f(view);
            }
        });
    }

    public RightDetailDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightDetailDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
