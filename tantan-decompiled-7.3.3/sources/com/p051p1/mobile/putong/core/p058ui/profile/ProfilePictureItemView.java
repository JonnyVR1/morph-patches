package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import p153l.nya0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfilePictureItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f33889a;

    /* JADX INFO: renamed from: b */
    public PictureView f33890b;

    public ProfilePictureItemView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m51954a(View view) {
        nya0.m165316a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51954a(this);
    }

    public ProfilePictureItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfilePictureItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
