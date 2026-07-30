package com.p051p1.mobile.putong.live.livingroom.common.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p153l.irn;
import p153l.izs;
import p153l.wlj;

/* JADX INFO: loaded from: classes4.dex */
public class MysteryAvatarView extends VDraweeView {
    public MysteryAvatarView(Context context, wlj wljVar) {
        super(context, wljVar);
    }

    /* JADX INFO: renamed from: u */
    public void m73314u(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) getLayoutParams();
        c0221a.f1225O = f;
        c0221a.f1226P = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: v */
    public void m73315v() {
        setController(null);
    }

    /* JADX INFO: renamed from: w */
    public void m73316w(int i, @NotNull String str) {
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
            CrashHelper.m82479c(e);
            i2 = i;
            i3 = i2;
        }
        izs.m142871v("context_single_room", this, str, i2, i3, false, false, irn.m141839a(), null);
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
