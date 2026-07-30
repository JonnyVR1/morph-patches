package com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p147v.VText;
import p149l.f30;
import p149l.i3c0;
import p149l.soq;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogCheckBox extends VText implements soq {
    public JsDialogCheckBox(Context context) {
        super(context);
    }

    private void setChecked(BLiveJsDialogItemType bLiveJsDialogItemType) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(getContext().getDrawable(bLiveJsDialogItemType.checked ? i3c0.f111109o3 : i3c0.f111097n3), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // p149l.soq
    /* JADX INFO: renamed from: g */
    public void mo73103g(final BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m185292c(this, str, bLiveJsDialogItemType);
        setCompoundDrawablePadding(t100.m186890d(6.0f));
        setChecked(bLiveJsDialogItemType);
        setGravity(17);
        layoutParams.gravity = m185293d(bLiveJsDialogItemType);
        setOnClickListener(new View.OnClickListener() { // from class: l.loq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129128a.m73105o(bLiveJsDialogItemType, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m73105o(BLiveJsDialogItemType bLiveJsDialogItemType, View view) {
        m73106p(bLiveJsDialogItemType);
        f30<String, String> f30Var = bLiveJsDialogItemType.actionListener;
        if (f30Var != null) {
            f30Var.call(bLiveJsDialogItemType.callback, bLiveJsDialogItemType.checked ? "1" : "0");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m73106p(BLiveJsDialogItemType bLiveJsDialogItemType) {
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
