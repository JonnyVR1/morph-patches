package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import l.ffx;
import v.VFrame_Squared;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GroupMemberAvatarFrame extends VFrame_Squared {

    /* JADX INFO: renamed from: a */
    public float f149a;

    public GroupMemberAvatarFrame(Context context) {
        super(context);
        this.f149a = 0.8f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            measureChild(getChildAt(0), ffx.b((int) (getMeasuredWidth() * this.f149a)), ffx.b((int) (getMeasuredHeight() * this.f149a)));
        }
    }

    public GroupMemberAvatarFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149a = 0.8f;
    }

    public GroupMemberAvatarFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149a = 0.8f;
    }
}
