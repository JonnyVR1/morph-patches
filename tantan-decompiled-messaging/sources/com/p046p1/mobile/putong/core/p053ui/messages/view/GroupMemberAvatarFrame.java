package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import p147v.VFrame_Squared;
import p149l.ffx;

/* JADX INFO: loaded from: classes4.dex */
public class GroupMemberAvatarFrame extends VFrame_Squared {

    /* JADX INFO: renamed from: a */
    public float f32327a;

    public GroupMemberAvatarFrame(Context context) {
        super(context);
        this.f32327a = 0.8f;
    }

    @Override // p147v.VFrame_Squared, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            measureChild(getChildAt(0), ffx.m121199b((int) (getMeasuredWidth() * this.f32327a)), ffx.m121199b((int) (getMeasuredHeight() * this.f32327a)));
        }
    }

    public GroupMemberAvatarFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32327a = 0.8f;
    }

    public GroupMemberAvatarFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32327a = 0.8f;
    }
}
