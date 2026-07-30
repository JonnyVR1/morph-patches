package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p149l.d3c0;
import p149l.lb90;
import p149l.qib0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeSeeLetterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35104a;

    public PrivilegeSeeLetterView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54276a(View view) {
        lb90.m149217a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54277b() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(CoreModule.m29935P().m94651a().mo33545mb());
        if (NullChecker.m81303a(userM169430Pa)) {
            this.f35104a.setImageUrl(userM169430Pa.m60124fp().url);
        } else {
            qib0.f154691G.m102354Y0(this.f35104a, zz6.m221004u0() ? d3c0.f83720Q8 : d3c0.f83706P8);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54276a(this);
    }

    public PrivilegeSeeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSeeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
