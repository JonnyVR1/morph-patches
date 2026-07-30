package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import l.ac90;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeVIPBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4901a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4902b;

    /* JADX INFO: renamed from: c */
    public VImage f4903c;

    /* JADX INFO: renamed from: d */
    public VImage f4904d;

    public PrivilegeVIPBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7621a(View view) {
        ac90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7622b() {
        this.f4902b.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        this.f4903c.setImageResource(CoreModule.m1854P().m11709e().m6925ul());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7621a(this);
    }

    public PrivilegeVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
