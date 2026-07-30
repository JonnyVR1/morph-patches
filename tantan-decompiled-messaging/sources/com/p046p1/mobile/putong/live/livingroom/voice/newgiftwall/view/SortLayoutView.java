package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.t100;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes11.dex */
public class SortLayoutView extends VLinear {
    public SortLayoutView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public void m78686Q(final List<GiftTab.SortRule> list, final e30<GiftTab.SortRule> e30Var) {
        removeAllViews();
        for (final int i = 0; i < list.size(); i++) {
            VText vText = new VText(getContext());
            vText.setTextColor(Color.parseColor("#CCFFFFFF"));
            vText.setTextSize(14.0f);
            int i2 = xdl0.f192404f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = t100.m186890d(16.0f);
            layoutParams.leftMargin = t100.m186890d(22.0f);
            layoutParams.rightMargin = t100.m186890d(22.0f);
            addView(vText, layoutParams);
            vText.setText(list.get(i).name);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.plf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call((GiftTab.SortRule) list.get(i));
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(yb2.m213884i(Color.parseColor("#303034"), 16));
    }

    public SortLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SortLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
