package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import p149l.jqa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfilePictureItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f33041a;

    /* JADX INFO: renamed from: b */
    public PictureView f33042b;

    public ProfilePictureItemView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m50771a(View view) {
        jqa0.m142785a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50771a(this);
    }

    public ProfilePictureItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfilePictureItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
