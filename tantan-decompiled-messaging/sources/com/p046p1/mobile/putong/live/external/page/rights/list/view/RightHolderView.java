package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel;
import com.tantanapp.common.utils.CrashHelper;
import p149l.t2d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightHolderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RightHolderView f46077a;

    public RightHolderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70616a(View view) {
        t2d0.m186968a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m70617b(RightHolderModel rightHolderModel) {
        int color;
        try {
            color = Color.parseColor(rightHolderModel.m70563H());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            color = Color.parseColor("#ffffff");
        }
        this.f46077a.setBackgroundColor(color);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70616a(this);
    }

    public RightHolderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightHolderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
