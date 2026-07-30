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
import p149l.j690;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeODiamondService extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f35092a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35093b;

    public PrivilegeODiamondService(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54264a(View view) {
        j690.m139905a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54265b() {
        xdl0.m208321A0(getContext(), this.f35092a, d3c0.f83494A6);
        this.f35093b.setImageUrl(CoreModule.m29935P().m94651a().mo33639zj(CoreModule.f17545c.f19639e0.m169527p9()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54264a(this);
    }

    public PrivilegeODiamondService(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondService(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
