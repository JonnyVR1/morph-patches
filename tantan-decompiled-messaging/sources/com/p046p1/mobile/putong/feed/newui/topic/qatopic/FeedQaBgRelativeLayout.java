package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class FeedQaBgRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public w9j<Integer, Boolean> f43068a;

    public FeedQaBgRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        w9j<Integer, Boolean> w9jVar = this.f43068a;
        if (w9jVar != null) {
            if (i2 == 0) {
                if (w9jVar.call(0).booleanValue()) {
                    return i - 1;
                }
                if (this.f43068a.call(1).booleanValue()) {
                    return 0;
                }
            } else if (i2 == 1) {
                if (w9jVar.call(1).booleanValue()) {
                    return i - 1;
                }
                if (this.f43068a.call(0).booleanValue()) {
                    return 0;
                }
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public boolean isChildrenDrawingOrderEnabled() {
        return true;
    }

    public void setIsViewIsSelect(w9j<Integer, Boolean> w9jVar) {
        this.f43068a = w9jVar;
    }

    public FeedQaBgRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedQaBgRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedQaBgRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
