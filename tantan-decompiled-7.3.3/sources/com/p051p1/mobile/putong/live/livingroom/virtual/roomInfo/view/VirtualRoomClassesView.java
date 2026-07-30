package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.jyb;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomClassesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public y20<BLiveVoiceRoomSubClass> f53579a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f53580b;

    public VirtualRoomClassesView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final View m78665b(final BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        final LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(16);
        linearLayout.setSelected(bLiveVoiceRoomSubClass.isSelected);
        if (bLiveVoiceRoomSubClass.isSelected) {
            this.f53580b = linearLayout;
        }
        linearLayout.setBackgroundResource(obc0.f146217V6);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.g3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102008a.m78666c(linearLayout, bLiveVoiceRoomSubClass, view);
            }
        });
        VDraweeView vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(16.0f), qa00.m175859d(16.0f));
        layoutParams.leftMargin = qa00.m175859d(12.0f);
        linearLayout.addView(vDraweeView, layoutParams);
        izs.m142868s("context_livingAct", vDraweeView, bLiveVoiceRoomSubClass.icon);
        TextView textView = new TextView(getContext());
        textView.setText(bLiveVoiceRoomSubClass.name);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#66ffffff"));
        int i = bnl0.f77545f;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.leftMargin = qa00.m175859d(6.0f);
        layoutParams2.rightMargin = qa00.m175859d(12.0f);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m78666c(LinearLayout linearLayout, BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass, View view) {
        m78667d(linearLayout, bLiveVoiceRoomSubClass);
    }

    /* JADX INFO: renamed from: d */
    public final void m78667d(LinearLayout linearLayout, BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        linearLayout.setSelected(true);
        LinearLayout linearLayout2 = this.f53580b;
        if (linearLayout2 == null || linearLayout2 != linearLayout) {
            if (linearLayout2 != null) {
                linearLayout2.setSelected(false);
            }
            this.f53580b = linearLayout;
            y20<BLiveVoiceRoomSubClass> y20Var = this.f53579a;
            if (y20Var != null) {
                y20Var.call(bLiveVoiceRoomSubClass);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m78668e(List<BLiveVoiceRoomClass> list) {
        removeAllViews();
        if (jyb.m147479J(list)) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            BLiveVoiceRoomClass bLiveVoiceRoomClass = list.get(i);
            TextView textView = new TextView(getContext());
            textView.setText(bLiveVoiceRoomClass.name);
            textView.setTextSize(15.0f);
            textView.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = bnl0.f77545f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = i > 0 ? qa00.m175859d(14.0f) : 0;
            layoutParams.bottomMargin = qa00.f156318e;
            addView(textView, layoutParams);
            FlowLayout flowLayout = new FlowLayout(getContext());
            addView(flowLayout, new LinearLayout.LayoutParams(bnl0.f77545f, bnl0.f77544e));
            List<BLiveVoiceRoomSubClass> list2 = bLiveVoiceRoomClass.subClasses;
            if (!jyb.m147479J(list2)) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    View viewM78665b = m78665b(list2.get(i3));
                    FlowLayout.LayoutParams layoutParams2 = new FlowLayout.LayoutParams(bnl0.f77545f, qa00.f156337x);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = qa00.m175859d(5.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = qa00.m175859d(5.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = qa00.m175859d(10.0f);
                    flowLayout.addView(viewM78665b, layoutParams2);
                }
            }
            i++;
        }
    }

    public void setSelectListener(y20<BLiveVoiceRoomSubClass> y20Var) {
        this.f53579a = y20Var;
    }

    public VirtualRoomClassesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomClassesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
