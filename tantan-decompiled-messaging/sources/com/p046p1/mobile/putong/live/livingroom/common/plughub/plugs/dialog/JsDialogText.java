package com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p147v.VText;
import p149l.soq;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogText extends VText implements soq {
    public JsDialogText(Context context) {
        super(context);
    }

    @Override // p149l.soq
    /* JADX INFO: renamed from: g */
    public void mo73103g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m185292c(this, str, bLiveJsDialogItemType);
    }

    public JsDialogText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
