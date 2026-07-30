package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VDraweeView;
import p149l.e30;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomClassesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public e30<BLiveVoiceRoomSubClass> f52731a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f52732b;

    public VirtualRoomClassesView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final View m77482b(final BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        final LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(16);
        linearLayout.setSelected(bLiveVoiceRoomSubClass.isSelected);
        if (bLiveVoiceRoomSubClass.isSelected) {
            this.f52732b = linearLayout;
        }
        linearLayout.setBackgroundResource(i3c0.f110889V6);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.cul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82582a.m77483c(linearLayout, bLiveVoiceRoomSubClass, view);
            }
        });
        VDraweeView vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(16.0f), t100.m186890d(16.0f));
        layoutParams.leftMargin = t100.m186890d(12.0f);
        linearLayout.addView(vDraweeView, layoutParams);
        hxs.m133406s("context_livingAct", vDraweeView, bLiveVoiceRoomSubClass.icon);
        TextView textView = new TextView(getContext());
        textView.setText(bLiveVoiceRoomSubClass.name);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#66ffffff"));
        int i = xdl0.f192404f;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.leftMargin = t100.m186890d(6.0f);
        layoutParams2.rightMargin = t100.m186890d(12.0f);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m77483c(LinearLayout linearLayout, BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass, View view) {
        m77484d(linearLayout, bLiveVoiceRoomSubClass);
    }

    /* JADX INFO: renamed from: d */
    public final void m77484d(LinearLayout linearLayout, BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        linearLayout.setSelected(true);
        LinearLayout linearLayout2 = this.f52732b;
        if (linearLayout2 == null || linearLayout2 != linearLayout) {
            if (linearLayout2 != null) {
                linearLayout2.setSelected(false);
            }
            this.f52732b = linearLayout;
            e30<BLiveVoiceRoomSubClass> e30Var = this.f52731a;
            if (e30Var != null) {
                e30Var.call(bLiveVoiceRoomSubClass);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m77485e(List<BLiveVoiceRoomClass> list) {
        removeAllViews();
        if (vwb.m200296J(list)) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            BLiveVoiceRoomClass bLiveVoiceRoomClass = list.get(i);
            TextView textView = new TextView(getContext());
            textView.setText(bLiveVoiceRoomClass.name);
            textView.setTextSize(15.0f);
            textView.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = xdl0.f192404f;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = i > 0 ? t100.m186890d(14.0f) : 0;
            layoutParams.bottomMargin = t100.f167256e;
            addView(textView, layoutParams);
            FlowLayout flowLayout = new FlowLayout(getContext());
            addView(flowLayout, new LinearLayout.LayoutParams(xdl0.f192404f, xdl0.f192403e));
            List<BLiveVoiceRoomSubClass> list2 = bLiveVoiceRoomClass.subClasses;
            if (!vwb.m200296J(list2)) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    View viewM77482b = m77482b(list2.get(i3));
                    FlowLayout.LayoutParams layoutParams2 = new FlowLayout.LayoutParams(xdl0.f192404f, t100.f167275x);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = t100.m186890d(5.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = t100.m186890d(5.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = t100.m186890d(10.0f);
                    flowLayout.addView(viewM77482b, layoutParams2);
                }
            }
            i++;
        }
    }

    public void setSelectListener(e30<BLiveVoiceRoomSubClass> e30Var) {
        this.f52731a = e30Var;
    }

    public VirtualRoomClassesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomClassesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
