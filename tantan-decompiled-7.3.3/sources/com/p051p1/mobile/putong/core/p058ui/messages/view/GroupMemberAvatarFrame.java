package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import p151v.VFrame_Squared;
import p153l.dox;

/* JADX INFO: loaded from: classes4.dex */
public class GroupMemberAvatarFrame extends VFrame_Squared {

    /* JADX INFO: renamed from: a */
    public float f33175a;

    public GroupMemberAvatarFrame(Context context) {
        super(context);
        this.f33175a = 0.8f;
    }

    @Override // p151v.VFrame_Squared, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            measureChild(getChildAt(0), dox.m117364b((int) (getMeasuredWidth() * this.f33175a)), dox.m117364b((int) (getMeasuredHeight() * this.f33175a)));
        }
    }

    public GroupMemberAvatarFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33175a = 0.8f;
    }

    public GroupMemberAvatarFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33175a = 0.8f;
    }
}
