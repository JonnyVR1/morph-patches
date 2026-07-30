package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class SortLayoutView extends VLinear {
    public SortLayoutView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public void m79869Q(final List<GiftTab.SortRule> list, final y20<GiftTab.SortRule> y20Var) {
        removeAllViews();
        for (final int i = 0; i < list.size(); i++) {
            VText vText = new VText(getContext());
            vText.setTextColor(Color.parseColor("#CCFFFFFF"));
            vText.setTextSize(14.0f);
            int i2 = bnl0.f77545f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = qa00.m175859d(16.0f);
            layoutParams.leftMargin = qa00.m175859d(22.0f);
            layoutParams.rightMargin = qa00.m175859d(22.0f);
            addView(vText, layoutParams);
            vText.setText(list.get(i).name);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.ytf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call((GiftTab.SortRule) list.get(i));
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(fc2.m124979i(Color.parseColor("#303034"), 16));
    }

    public SortLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SortLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
