package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.n3b0;
import p149l.qib0;
import p149l.t100;
import p149l.vb90;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeUnLimitLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35108a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35109b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35110c;

    /* JADX INFO: renamed from: d */
    public VImage f35111d;

    /* JADX INFO: renamed from: e */
    public VImage f35112e;

    public PrivilegeUnLimitLikeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54280a(View view) {
        vb90.m197706a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54281b() {
        this.f35111d.setImageResource(d3c0.f83570Fc);
        boolean zM81303a = NullChecker.m81303a(n3b0.m157739n());
        FrameLayout frameLayout = this.f35108a;
        if (zM81303a) {
            xdl0.m208344M(frameLayout, true);
            xdl0.m208344M(this.f35112e, false);
            qib0.f154691G.m102354Y0(this.f35109b, zz6.m221004u0() ? d3c0.f84204zc : d3c0.f84190yc);
            this.f35110c.setImageUrl(n3b0.m157739n().m60124fp().url);
            return;
        }
        xdl0.m208344M(frameLayout, false);
        xdl0.m208344M(this.f35112e, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35112e.getLayoutParams();
        if (layoutParams.height != t100.m186890d(128.0f)) {
            layoutParams.height = t100.m186890d(128.0f);
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f35112e.setLayoutParams(layoutParams);
        }
        this.f35112e.setImageResource(zz6.m221004u0() ? d3c0.f83584Gc : d3c0.f83542Dc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54280a(this);
    }

    public PrivilegeUnLimitLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUnLimitLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
