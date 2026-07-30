package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import l.d3c0;
import l.k690;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeODiamondSkin extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f4875a;

    /* JADX INFO: renamed from: b */
    public VImage f4876b;

    public PrivilegeODiamondSkin(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7601a(View view) {
        k690.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7602b() {
        this.f4875a.setImageUrl(CoreModule.m1854P().m11706a().m5576zj(CoreModule.f1534c.f3628e0.m21490p9()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7601a(this);
        this.f4876b.setImageResource(d3c0.x6);
    }

    public PrivilegeODiamondSkin(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondSkin(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
