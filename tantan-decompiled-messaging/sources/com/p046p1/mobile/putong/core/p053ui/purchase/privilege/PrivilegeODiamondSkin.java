package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.k690;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeODiamondSkin extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35094a;

    /* JADX INFO: renamed from: b */
    public VImage f35095b;

    public PrivilegeODiamondSkin(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54266a(View view) {
        k690.m144575a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54267b() {
        this.f35094a.setImageUrl(CoreModule.m29935P().m94651a().mo33639zj(CoreModule.f17545c.f19639e0.m169527p9()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54266a(this);
        this.f35095b.setImageResource(d3c0.f84170x6);
    }

    public PrivilegeODiamondSkin(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondSkin(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
