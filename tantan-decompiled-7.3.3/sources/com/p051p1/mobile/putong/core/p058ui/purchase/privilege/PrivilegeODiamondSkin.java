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
import p153l.jbc0;
import p153l.oe90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeODiamondSkin extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35942a;

    /* JADX INFO: renamed from: b */
    public VImage f35943b;

    public PrivilegeODiamondSkin(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55449a(View view) {
        oe90.m167355a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55450b() {
        this.f35942a.setImageUrl(CoreModule.m30933P().m143405a().mo34642zj(CoreModule.f18264c.f20381e0.m116600p9()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55449a(this);
        this.f35943b.setImageResource(jbc0.f119825x6);
    }

    public PrivilegeODiamondSkin(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondSkin(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
