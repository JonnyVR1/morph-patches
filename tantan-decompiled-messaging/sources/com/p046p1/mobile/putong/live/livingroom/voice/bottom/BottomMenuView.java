package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import java.util.ArrayList;
import java.util.List;
import p149l.mim0;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xyb0;

/* JADX INFO: loaded from: classes5.dex */
public class BottomMenuView extends LinearLayout implements s7m<xyb0> {

    /* JADX INFO: renamed from: b */
    public static final int f52899b = t100.f167256e;

    /* JADX INFO: renamed from: a */
    public xyb0 f52900a;

    public BottomMenuView(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xyb0 xyb0Var) {
        this.f52900a = xyb0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m77746b(boolean z) {
        xdl0.m208345M0(this, z);
    }

    /* JADX INFO: renamed from: c */
    public void m77747c() {
    }

    @Override // p149l.s7m
    public void destroy() {
        removeAllViews();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void setItems(List<mim0<?>> list) {
        removeAllViews();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            mim0<?> mim0Var = list.get(i);
            KeyEvent.Callback callbackM154731X3 = mim0Var.m154731X3();
            if (callbackM154731X3 instanceof RedDot) {
                ((RedDot) callbackM154731X3).mo72138g0(mim0Var.mo108806l1());
            }
            if (mim0Var.f134019m.alignment == 1) {
                arrayList.add(mim0Var);
            } else {
                arrayList2.add(mim0Var);
            }
        }
        if (!vwb.m200296J(arrayList)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                mim0 mim0Var2 = (mim0) arrayList.get(i2);
                View viewM154731X3 = mim0Var2.m154731X3();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM154731X3.getLayoutParams();
                if (i2 == 0) {
                    marginLayoutParams.leftMargin = t100.m186890d(10.0f);
                } else {
                    marginLayoutParams.leftMargin = f52899b;
                }
                marginLayoutParams.rightMargin = f52899b;
                marginLayoutParams.bottomMargin = mim0Var2.mo116703Y3();
                addView(viewM154731X3);
            }
            addView(new View(getContext()), new LinearLayout.LayoutParams(0, xdl0.f192403e, 1.0f));
        }
        if (vwb.m200296J(arrayList2)) {
            return;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            mim0 mim0Var3 = (mim0) arrayList2.get(i3);
            View viewM154731X4 = mim0Var3.m154731X3();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewM154731X4.getLayoutParams();
            if (i3 != 0) {
                marginLayoutParams2.leftMargin = f52899b;
            }
            marginLayoutParams2.rightMargin = f52899b;
            marginLayoutParams2.bottomMargin = mim0Var3.mo116703Y3();
            addView(viewM154731X4);
        }
    }

    public BottomMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
