package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.di00;
import p153l.di5;
import p153l.n570;
import p153l.pf60;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailExpandBottomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MomentDetailExpandBottomView f41760a;

    /* JADX INFO: renamed from: b */
    public VText f41761b;

    /* JADX INFO: renamed from: c */
    public VText f41762c;

    /* JADX INFO: renamed from: d */
    public n570 f41763d;

    /* JADX INFO: renamed from: e */
    public di5 f41764e;

    /* JADX INFO: renamed from: f */
    public int f41765f;

    /* JADX INFO: renamed from: g */
    public String f41766g;

    /* JADX INFO: renamed from: h */
    public String f41767h;

    /* JADX INFO: renamed from: i */
    public String f41768i;

    /* JADX INFO: renamed from: j */
    public Links f41769j;

    /* JADX INFO: renamed from: k */
    public String f41770k;

    /* JADX INFO: renamed from: l */
    public String f41771l;

    /* JADX INFO: renamed from: m */
    public String f41772m;

    /* JADX INFO: renamed from: n */
    public boolean f41773n;

    public MomentDetailExpandBottomView(Context context) {
        super(context);
        this.f41773n = false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m64321c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m64323e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public final void m64325g(View view) {
        di00.m115838a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m64326h(pf60 pf60Var) {
        boolean z;
        if (!NullChecker.m82486a(this.f41769j) || TextUtils.isEmpty(this.f41769j.next)) {
            z = true;
        } else {
            this.f41764e.m115867f0(this.f41768i, null);
            z = false;
        }
        this.f41764e.m115852P(this.f41765f, this.f41768i, (List) pf60Var.f152157b, (Links) pf60Var.f152156a, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64327i(pf60 pf60Var) {
        boolean z;
        if (!NullChecker.m82486a(this.f41769j) || TextUtils.isEmpty(this.f41769j.next)) {
            z = true;
        } else {
            this.f41764e.m115867f0(this.f41768i, null);
            z = false;
        }
        this.f41764e.m115852P(this.f41765f, this.f41768i, (List) pf60Var.f152157b, (Links) pf60Var.f152156a, z);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m64328j(View view) {
        if (NullChecker.m82487b(this.f41764e)) {
            if (this.f41764e.m115860Y(this.f41768i)) {
                this.f41764e.m115852P(this.f41765f, this.f41768i, new ArrayList(), null, false);
                return;
            }
            boolean z = this.f41773n;
            n570 n570Var = this.f41763d;
            if (z) {
                String str = this.f41772m;
                String str2 = this.f41770k;
                String str3 = this.f41771l;
                String str4 = this.f41768i;
                Links links = this.f41769j;
                n570Var.m161694x(str, str2, str3, str4, links != null ? links.next : "").subscribe(psd0.m173597H(new y20() { // from class: l.zh00
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f204369a.m64326h((pf60) obj);
                    }
                }, new y20() { // from class: l.ai00
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        MomentDetailExpandBottomView.m64323e((Throwable) obj);
                    }
                }));
                return;
            }
            String str5 = this.f41772m;
            String str6 = this.f41766g;
            String str7 = this.f41767h;
            String str8 = this.f41768i;
            Links links2 = this.f41769j;
            n570Var.m161693w(str5, str6, str7, str8, links2 != null ? links2.next : "").subscribe(psd0.m173597H(new y20() { // from class: l.bi00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76824a.m64327i((pf60) obj);
                }
            }, new y20() { // from class: l.ci00
                @Override // p153l.y20
                public final void call(Object obj) {
                    MomentDetailExpandBottomView.m64321c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m64329k(View view) {
        if (NullChecker.m82487b(this.f41764e)) {
            this.f41764e.m115864c0(this.f41765f, this.f41768i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m64330l(n570 n570Var, di5 di5Var, String str, String str2, String str3, Links links, String str4, boolean z, int i) {
        this.f41764e = di5Var;
        this.f41765f = i;
        this.f41763d = n570Var;
        this.f41766g = str;
        this.f41767h = str2;
        this.f41768i = str3;
        this.f41769j = links;
        this.f41773n = false;
        this.f41772m = str4;
        bnl0.m105524M(this.f41762c, z);
        bnl0.m105524M(this.f41761b, !z);
    }

    /* JADX INFO: renamed from: m */
    public void m64331m(n570 n570Var, di5 di5Var, String str, String str2, String str3, Links links, String str4, boolean z, int i) {
        this.f41764e = di5Var;
        this.f41765f = i;
        this.f41763d = n570Var;
        this.f41770k = str;
        this.f41771l = str2;
        this.f41768i = str3;
        this.f41769j = links;
        this.f41773n = true;
        this.f41772m = str4;
        bnl0.m105524M(this.f41762c, z);
        bnl0.m105524M(this.f41761b, true ^ z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64325g(this);
        this.f41761b.setOnClickListener(new View.OnClickListener() { // from class: l.xh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194263a.m64328j(view);
            }
        });
        this.f41762c.setOnClickListener(new View.OnClickListener() { // from class: l.yh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199894a.m64329k(view);
            }
        });
    }

    public MomentDetailExpandBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41773n = false;
    }

    public MomentDetailExpandBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41773n = false;
    }
}
