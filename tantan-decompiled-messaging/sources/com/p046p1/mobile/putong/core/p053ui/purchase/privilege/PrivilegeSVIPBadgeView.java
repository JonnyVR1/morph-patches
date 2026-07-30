package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.kb90;
import p149l.sab0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeSVIPBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35100a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35101b;

    /* JADX INFO: renamed from: c */
    public VImage f35102c;

    /* JADX INFO: renamed from: d */
    public VImage f35103d;

    public PrivilegeSVIPBadgeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54274a(View view) {
        kb90.m145266a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54275b(PurchaseType purchaseType) {
        this.f35101b.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        boolean zM182897o = sab0.m182897o(purchaseType);
        VImage vImage = this.f35102c;
        if (zM182897o) {
            vImage.setImageResource(d3c0.f83772U8);
            this.f35100a.setBackgroundResource(d3c0.f83759T8);
            this.f35103d.setImageResource(d3c0.f83813Xa);
        } else {
            vImage.setImageResource(d3c0.f83798W8);
            this.f35100a.setBackgroundResource(d3c0.f83785V8);
            this.f35103d.setImageResource(d3c0.f83826Ya);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54274a(this);
    }

    public PrivilegeSVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSVIPBadgeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
