package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import l.d3c0;
import l.j690;
import l.xdl0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeODiamondService extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4873a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4874b;

    public PrivilegeODiamondService(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7599a(View view) {
        j690.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7600b() {
        xdl0.A0(getContext(), this.f4873a, d3c0.A6);
        this.f4874b.setImageUrl(CoreModule.m1854P().m11706a().m5576zj(CoreModule.f1534c.f3628e0.m21490p9()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7599a(this);
    }

    public PrivilegeODiamondService(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondService(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
