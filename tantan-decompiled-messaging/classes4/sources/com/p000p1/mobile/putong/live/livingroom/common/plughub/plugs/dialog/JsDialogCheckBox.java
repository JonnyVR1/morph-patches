package com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import l.f30;
import l.t100;
import p002l.i3c0;
import p002l.soq;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class JsDialogCheckBox extends VText implements soq {
    public JsDialogCheckBox(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setChecked(BLiveJsDialogItemType bLiveJsDialogItemType) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(getContext().getDrawable(bLiveJsDialogItemType.checked ? i3c0.f12894o3 : i3c0.f12882n3), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.soq
    /* JADX INFO: renamed from: g */
    public void mo6629g(final BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m22585c(this, str, bLiveJsDialogItemType);
        setCompoundDrawablePadding(t100.d(6.0f));
        setChecked(bLiveJsDialogItemType);
        setGravity(17);
        layoutParams.gravity = m22586d(bLiveJsDialogItemType);
        setOnClickListener(new View.OnClickListener() { // from class: l.loq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14971a.m6631o(bLiveJsDialogItemType, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m6631o(BLiveJsDialogItemType bLiveJsDialogItemType, View view) {
        m6632p(bLiveJsDialogItemType);
        f30 f30Var = bLiveJsDialogItemType.actionListener;
        if (f30Var != null) {
            f30Var.call(bLiveJsDialogItemType.callback, bLiveJsDialogItemType.checked ? "1" : "0");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6632p(BLiveJsDialogItemType bLiveJsDialogItemType) {
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
