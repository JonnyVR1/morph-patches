package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.PictureView;
import l.jqa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfilePictureItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f863a;

    /* JADX INFO: renamed from: b */
    public PictureView f864b;

    public ProfilePictureItemView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1213a(View view) {
        jqa0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1213a(this);
    }

    public ProfilePictureItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfilePictureItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
