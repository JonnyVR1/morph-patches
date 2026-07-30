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
import p153l.bnl0;
import p153l.jbc0;
import p153l.ne90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeODiamondService extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f35940a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35941b;

    public PrivilegeODiamondService(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55447a(View view) {
        ne90.m162816a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55448b() {
        bnl0.m105501A0(getContext(), this.f35940a, jbc0.f119149A6);
        this.f35941b.setImageUrl(CoreModule.m30933P().m143405a().mo34642zj(CoreModule.f18264c.f20381e0.m116600p9()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55447a(this);
    }

    public PrivilegeODiamondService(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeODiamondService(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
