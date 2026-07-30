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
import p149l.ac90;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeVIPBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35120a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35121b;

    /* JADX INFO: renamed from: c */
    public VImage f35122c;

    /* JADX INFO: renamed from: d */
    public VImage f35123d;

    public PrivilegeVIPBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54286a(View view) {
        ac90.m95718a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54287b() {
        this.f35121b.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        this.f35122c.setImageResource(CoreModule.m29935P().m94654e().mo34988ul());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54286a(this);
    }

    public PrivilegeVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
