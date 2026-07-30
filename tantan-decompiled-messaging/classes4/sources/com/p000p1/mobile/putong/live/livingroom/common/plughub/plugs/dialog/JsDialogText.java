package com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p002l.soq;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class JsDialogText extends VText implements soq {
    public JsDialogText(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.soq
    /* JADX INFO: renamed from: g */
    public void mo6629g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m22585c(this, str, bLiveJsDialogItemType);
    }

    public JsDialogText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
