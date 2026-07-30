package com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p151v.VText;
import p153l.sqq;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogText extends VText implements sqq {
    public JsDialogText(Context context) {
        super(context);
    }

    @Override // p153l.sqq
    /* JADX INFO: renamed from: g */
    public void mo74286g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m187556c(this, str, bLiveJsDialogItemType);
    }

    public JsDialogText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
