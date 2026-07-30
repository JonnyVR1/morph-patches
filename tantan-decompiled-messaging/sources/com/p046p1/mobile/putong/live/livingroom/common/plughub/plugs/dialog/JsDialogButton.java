package com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import java.util.List;
import p149l.koq;
import p149l.soq;
import p149l.t100;
import p149l.uep0;
import p149l.vwb;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogButton extends CardView implements soq {

    /* JADX INFO: renamed from: a */
    public TextView f49254a;

    public JsDialogButton(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m73101e(View view) {
        koq.m146752a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public View m73102f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return koq.m146753b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.soq
    /* JADX INFO: renamed from: g */
    public void mo73103g(final BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m185292c(this.f49254a, str, bLiveJsDialogItemType);
        List<String> list = bLiveJsDialogItemType.btnBgColors;
        if (!vwb.m200296J(list) && list.size() == 2) {
            setBackground(yb2.m213886k(uep0.m193307B(list.get(0)), uep0.m193307B(list.get(1)), 6, GradientDrawable.Orientation.LEFT_RIGHT));
        }
        int iM186890d = t100.m186890d(12.0f);
        layoutParams.leftMargin = iM186890d;
        layoutParams.rightMargin = iM186890d;
        this.f49254a.setPadding(iM186890d, iM186890d, iM186890d, iM186890d);
        setCardElevation(t100.m186890d(bLiveJsDialogItemType.withShadow ? 6.0f : 0.0f));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.joq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BLiveJsDialogItemType bLiveJsDialogItemType2 = bLiveJsDialogItemType;
                bLiveJsDialogItemType2.actionListener.call(bLiveJsDialogItemType2.callback, "");
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73101e(this);
    }

    public JsDialogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
