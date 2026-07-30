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
import l.xb90;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeUnlockOnlineView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f4899a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4900b;

    public PrivilegeUnlockOnlineView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7619a(View view) {
        xb90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7620b(boolean z) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            this.f4899a.setImageUrl(((Media) userM21490p9.fp()).url);
        }
        AutoVDraweeView autoVDraweeView = this.f4900b;
        if (z) {
            autoVDraweeView.setImageResource(d3c0.t9);
        } else {
            autoVDraweeView.setImageResource(d3c0.s9);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7619a(this);
    }

    public PrivilegeUnlockOnlineView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUnlockOnlineView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
