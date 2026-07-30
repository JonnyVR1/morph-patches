package com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import java.util.List;
import l.t100;
import l.uep0;
import l.vwb;
import l.xdl0;
import l.yb2;
import p002l.koq;
import p002l.soq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class JsDialogButton extends CardView implements soq {

    /* JADX INFO: renamed from: a */
    public TextView f5296a;

    public JsDialogButton(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m6627e(View view) {
        koq.m16731a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public View m6628f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return koq.m16732b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.soq
    /* JADX INFO: renamed from: g */
    public void mo6629g(final BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m22585c(this.f5296a, str, bLiveJsDialogItemType);
        List list = bLiveJsDialogItemType.btnBgColors;
        if (!vwb.J(list) && list.size() == 2) {
            setBackground(yb2.k(uep0.B((String) list.get(0)), uep0.B((String) list.get(1)), 6, GradientDrawable.Orientation.LEFT_RIGHT));
        }
        int iD = t100.d(12.0f);
        layoutParams.leftMargin = iD;
        layoutParams.rightMargin = iD;
        this.f5296a.setPadding(iD, iD, iD, iD);
        setCardElevation(t100.d(bLiveJsDialogItemType.withShadow ? 6.0f : 0.0f));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.joq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BLiveJsDialogItemType bLiveJsDialogItemType2 = bLiveJsDialogItemType;
                bLiveJsDialogItemType2.actionListener.call(bLiveJsDialogItemType2.callback, "");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6627e(this);
    }

    public JsDialogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
