package com.p000p1.mobile.putong.live.livingroom.common.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.CrashHelper;
import l.djj;
import l.hce;
import l.hxs;
import l.ipn;
import l.ym2;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MysteryAvatarView extends VDraweeView {
    public MysteryAvatarView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public void m5604u(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        ConstraintLayout.a layoutParams = getLayoutParams();
        layoutParams.O = f;
        layoutParams.P = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: v */
    public void m5605v() {
        setController((hce) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m5606w(int i, @NotNull String str) {
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
            CrashHelper.c(e);
            i2 = i;
            i3 = i2;
        }
        hxs.v("context_single_room", this, str, i2, i3, false, false, ipn.a(), (ym2) null);
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
