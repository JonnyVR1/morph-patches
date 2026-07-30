package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.page.rights.list.model.RightHolderModel;
import com.tantanapp.common.utils.CrashHelper;
import p153l.wad0;

/* JADX INFO: loaded from: classes9.dex */
public class RightHolderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RightHolderView f46925a;

    public RightHolderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71799a(View view) {
        wad0.m205636a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m71800b(RightHolderModel rightHolderModel) {
        int color;
        try {
            color = Color.parseColor(rightHolderModel.m71746H());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            color = Color.parseColor("#ffffff");
        }
        this.f46925a.setBackgroundColor(color);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71799a(this);
    }

    public RightHolderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightHolderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
