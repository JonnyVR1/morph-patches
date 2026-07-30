package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import java.util.List;
import l.e30;
import l.t100;
import l.xdl0;
import l.yb2;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SortLayoutView extends VLinear {
    public SortLayoutView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m8902Q(final List<GiftTab.SortRule> list, final e30<GiftTab.SortRule> e30Var) {
        removeAllViews();
        for (final int i = 0; i < list.size(); i++) {
            VText vText = new VText(getContext());
            vText.setTextColor(Color.parseColor("#CCFFFFFF"));
            vText.setTextSize(14.0f);
            int i2 = xdl0.f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = t100.d(16.0f);
            layoutParams.leftMargin = t100.d(22.0f);
            layoutParams.rightMargin = t100.d(22.0f);
            addView(vText, layoutParams);
            vText.setText(list.get(i).name);
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.plf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call((GiftTab.SortRule) list.get(i));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setBackgroundDrawable(yb2.i(Color.parseColor("#303034"), 16));
    }

    public SortLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SortLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
