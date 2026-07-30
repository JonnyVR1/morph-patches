package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.d3c0;
import l.n3b0;
import l.t100;
import l.vb90;
import l.xdl0;
import l.zz6;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeUnLimitLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4889a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4890b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f4891c;

    /* JADX INFO: renamed from: d */
    public VImage f4892d;

    /* JADX INFO: renamed from: e */
    public VImage f4893e;

    public PrivilegeUnLimitLikeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7615a(View view) {
        vb90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7616b() {
        this.f4892d.setImageResource(d3c0.Fc);
        boolean zA = NullChecker.a(n3b0.n());
        FrameLayout frameLayout = this.f4889a;
        if (zA) {
            xdl0.M(frameLayout, true);
            xdl0.M(this.f4893e, false);
            qib0.f19782G.m12767Y0(this.f4890b, zz6.u0() ? d3c0.zc : d3c0.yc);
            this.f4891c.setImageUrl(((Media) n3b0.n().fp()).url);
            return;
        }
        xdl0.M(frameLayout, false);
        xdl0.M(this.f4893e, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4893e.getLayoutParams();
        if (layoutParams.height != t100.d(128.0f)) {
            layoutParams.height = t100.d(128.0f);
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f4893e.setLayoutParams(layoutParams);
        }
        this.f4893e.setImageResource(zz6.u0() ? d3c0.Gc : d3c0.Dc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7615a(this);
    }

    public PrivilegeUnLimitLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUnLimitLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
