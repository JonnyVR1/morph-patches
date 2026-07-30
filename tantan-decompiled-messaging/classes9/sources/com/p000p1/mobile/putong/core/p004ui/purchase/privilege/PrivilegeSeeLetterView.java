package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d3c0;
import l.lb90;
import l.zz6;
import p006l.qib0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeSeeLetterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f4885a;

    public PrivilegeSeeLetterView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7611a(View view) {
        lb90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7612b() {
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(CoreModule.m1854P().m11706a().m5482mb());
        if (NullChecker.a(userM21393Pa)) {
            this.f4885a.setImageUrl(((Media) userM21393Pa.fp()).url);
        } else {
            qib0.f19782G.m12767Y0(this.f4885a, zz6.u0() ? d3c0.Q8 : d3c0.P8);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7611a(this);
    }

    public PrivilegeSeeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSeeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
