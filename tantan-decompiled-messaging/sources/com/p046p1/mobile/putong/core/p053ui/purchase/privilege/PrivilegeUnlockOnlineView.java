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
import p149l.xb90;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeUnlockOnlineView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35118a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35119b;

    public PrivilegeUnlockOnlineView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54284a(View view) {
        xb90.m207724a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54285b(boolean z) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            this.f35118a.setImageUrl(userM169527p9.m60124fp().url);
        }
        AutoVDraweeView autoVDraweeView = this.f35119b;
        if (z) {
            autoVDraweeView.setImageResource(d3c0.f84117t9);
        } else {
            autoVDraweeView.setImageResource(d3c0.f84103s9);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54284a(this);
    }

    public PrivilegeUnlockOnlineView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUnlockOnlineView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
