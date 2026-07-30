package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.ek90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeVIPBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35968a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35969b;

    /* JADX INFO: renamed from: c */
    public VImage f35970c;

    /* JADX INFO: renamed from: d */
    public VImage f35971d;

    public PrivilegeVIPBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55469a(View view) {
        ek90.m121034a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55470b() {
        this.f35969b.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        this.f35970c.setImageResource(CoreModule.m30933P().m143408e().mo35991ul());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55469a(this);
    }

    public PrivilegeVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
