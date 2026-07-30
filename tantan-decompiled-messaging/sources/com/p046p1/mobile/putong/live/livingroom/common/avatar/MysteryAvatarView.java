package com.p046p1.mobile.putong.live.livingroom.common.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p149l.djj;
import p149l.hxs;
import p149l.ipn;

/* JADX INFO: loaded from: classes4.dex */
public class MysteryAvatarView extends VDraweeView {
    public MysteryAvatarView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX INFO: renamed from: u */
    public void m72131u(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) getLayoutParams();
        c0220a.f1225O = f;
        c0220a.f1226P = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: v */
    public void m72132v() {
        setController(null);
    }

    /* JADX INFO: renamed from: w */
    public void m72133w(int i, @NotNull String str) {
        int i2;
        int i3;
        int i4;
        try {
            ViewGroup.LayoutParams layoutParams = ((ViewGroup) getParent()).getLayoutParams();
            int i5 = layoutParams.width;
            if (i5 <= 0 || (i4 = layoutParams.height) <= 0 || i <= i5) {
                i4 = i;
            } else {
                i = i5;
            }
            i2 = i;
            i3 = i4;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            i2 = i;
            i3 = i2;
        }
        hxs.m133409v("context_single_room", this, str, i2, i3, false, false, ipn.m137564a(), null);
    }

    public MysteryAvatarView(Context context) {
        super(context);
    }

    public MysteryAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MysteryAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MysteryAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
