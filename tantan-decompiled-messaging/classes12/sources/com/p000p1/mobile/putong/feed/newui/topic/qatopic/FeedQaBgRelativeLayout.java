package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedQaBgRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public w9j<Integer, Boolean> f4529a;

    public FeedQaBgRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        w9j<Integer, Boolean> w9jVar = this.f4529a;
        if (w9jVar != null) {
            if (i2 == 0) {
                if (((Boolean) w9jVar.call(0)).booleanValue()) {
                    return i - 1;
                }
                if (((Boolean) this.f4529a.call(1)).booleanValue()) {
                    return 0;
                }
            } else if (i2 == 1) {
                if (((Boolean) w9jVar.call(1)).booleanValue()) {
                    return i - 1;
                }
                if (((Boolean) this.f4529a.call(0)).booleanValue()) {
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
        this.f4529a = w9jVar;
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
