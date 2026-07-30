package com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p151v.VText;
import p153l.obc0;
import p153l.qa00;
import p153l.sqq;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogCheckBox extends VText implements sqq {
    public JsDialogCheckBox(Context context) {
        super(context);
    }

    private void setChecked(BLiveJsDialogItemType bLiveJsDialogItemType) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(getContext().getDrawable(bLiveJsDialogItemType.checked ? obc0.f146437o3 : obc0.f146425n3), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // p153l.sqq
    /* JADX INFO: renamed from: g */
    public void mo74286g(final BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m187556c(this, str, bLiveJsDialogItemType);
        setCompoundDrawablePadding(qa00.m175859d(6.0f));
        setChecked(bLiveJsDialogItemType);
        setGravity(17);
        layoutParams.gravity = m187557d(bLiveJsDialogItemType);
        setOnClickListener(new View.OnClickListener() { // from class: l.lqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133240a.m74288o(bLiveJsDialogItemType, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m74288o(BLiveJsDialogItemType bLiveJsDialogItemType, View view) {
        m74289p(bLiveJsDialogItemType);
        z20<String, String> z20Var = bLiveJsDialogItemType.actionListener;
        if (z20Var != null) {
            z20Var.call(bLiveJsDialogItemType.callback, bLiveJsDialogItemType.checked ? "1" : "0");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m74289p(BLiveJsDialogItemType bLiveJsDialogItemType) {
        bLiveJsDialogItemType.checked = !bLiveJsDialogItemType.checked;
        setChecked(bLiveJsDialogItemType);
    }

    public JsDialogCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
