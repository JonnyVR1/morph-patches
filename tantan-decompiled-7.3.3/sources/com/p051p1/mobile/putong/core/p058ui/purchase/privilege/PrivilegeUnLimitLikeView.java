package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.c17;
import p153l.jbc0;
import p153l.qa00;
import p153l.rbb0;
import p153l.uqb0;
import p153l.zj90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeUnLimitLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35956a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35957b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35958c;

    /* JADX INFO: renamed from: d */
    public VImage f35959d;

    /* JADX INFO: renamed from: e */
    public VImage f35960e;

    public PrivilegeUnLimitLikeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55463a(View view) {
        zj90.m219968a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55464b() {
        this.f35959d.setImageResource(jbc0.f119225Fc);
        boolean zM82486a = NullChecker.m82486a(rbb0.m180741n());
        FrameLayout frameLayout = this.f35956a;
        if (zM82486a) {
            bnl0.m105524M(frameLayout, true);
            bnl0.m105524M(this.f35960e, false);
            uqb0.f180374G.m127138Y0(this.f35957b, c17.m107528u0() ? jbc0.f119859zc : jbc0.f119845yc);
            this.f35958c.setImageUrl(rbb0.m180741n().m61308fp().url);
            return;
        }
        bnl0.m105524M(frameLayout, false);
        bnl0.m105524M(this.f35960e, true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35960e.getLayoutParams();
        if (layoutParams.height != qa00.m175859d(128.0f)) {
            layoutParams.height = qa00.m175859d(128.0f);
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            this.f35960e.setLayoutParams(layoutParams);
        }
        this.f35960e.setImageResource(c17.m107528u0() ? jbc0.f119239Gc : jbc0.f119197Dc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55463a(this);
    }

    public PrivilegeUnLimitLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUnLimitLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
