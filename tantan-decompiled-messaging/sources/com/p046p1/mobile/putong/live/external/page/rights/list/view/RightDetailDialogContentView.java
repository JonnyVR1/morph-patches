package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.v1d0;
import p149l.z1d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightDetailDialogContentView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RightDetailDialogContentView f46036a;

    /* JADX INFO: renamed from: b */
    public View f46037b;

    /* JADX INFO: renamed from: c */
    public CardView f46038c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f46039d;

    /* JADX INFO: renamed from: e */
    public VImage f46040e;

    /* JADX INFO: renamed from: f */
    public z1d0 f46041f;

    public RightDetailDialogContentView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m70579c(View view) {
        v1d0.m196547a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m70580d() {
        LiveMkWebView liveMkWebView = this.f46039d;
        if (liveMkWebView != null) {
            liveMkWebView.m68873v();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m70581e(View view) {
        this.f46041f.m216793d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m70582f(View view) {
        this.f46041f.m216793d();
    }

    /* JADX INFO: renamed from: g */
    public void m70583g() {
        LiveMkWebView liveMkWebView = this.f46039d;
        if (liveMkWebView != null) {
            liveMkWebView.m68867p();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m70584h(Act act, String str, String str2, z1d0 z1d0Var) {
        this.f46041f = z1d0Var;
        boolean zM81303a = NullChecker.m81303a(Uri.parse(str).getQueryParameter("_bid"));
        this.f46039d.m68867p();
        this.f46039d.removeAllViews();
        LiveMkWebView liveMkWebView = this.f46039d;
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebView.m68876y(zM81303a, str, bgType);
        this.f46039d.setWebViewBg(bgType);
        this.f46039d.m68862k((PutongAct) act, str2, str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70579c(this);
        this.f46040e.setOnClickListener(new View.OnClickListener() { // from class: l.t1d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167313a.m70581e(view);
            }
        });
        this.f46037b.setOnClickListener(new View.OnClickListener() { // from class: l.u1d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173003a.m70582f(view);
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
