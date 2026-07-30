package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p153l.bk90;
import p153l.jbc0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeUnlockOnlineView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35966a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35967b;

    public PrivilegeUnlockOnlineView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55467a(View view) {
        bk90.m104796a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55468b(boolean z) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            this.f35966a.setImageUrl(userM116600p9.m61308fp().url);
        }
        AutoVDraweeView autoVDraweeView = this.f35967b;
        if (z) {
            autoVDraweeView.setImageResource(jbc0.f119772t9);
        } else {
            autoVDraweeView.setImageResource(jbc0.f119758s9);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55467a(this);
    }

    public PrivilegeUnlockOnlineView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUnlockOnlineView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
