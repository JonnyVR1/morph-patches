package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveMagicList;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.cpw;
import p149l.f30;
import p149l.hxs;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xlf0;

/* JADX INFO: loaded from: classes5.dex */
public class MagicGestureView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f52063c;

    /* JADX INFO: renamed from: d */
    public VText f52064d;

    /* JADX INFO: renamed from: e */
    public VLinear f52065e;

    public MagicGestureView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m76603Q(View view) {
        cpw.m108197a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m76604R(String str, List<BLiveMagicList> list, f30<BLiveDynamicEffect, Boolean> f30Var) {
        this.f52064d.setText(str);
        this.f52065e.removeAllViews();
        for (BLiveMagicList bLiveMagicList : list) {
            ArrayList arrayListM200339n = vwb.m200339n(bLiveMagicList.dynamicEffect, new w9j() { // from class: l.bpw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveDynamicEffect) obj).hasDownloaded);
                }
            });
            if (!vwb.m200296J(arrayListM200339n)) {
                MagicGestureItemView magicGestureItemView = (MagicGestureItemView) act().getLayoutInflater().inflate(t6c0.f168059I3, (ViewGroup) null);
                hxs.m133406s("context_livingAct", magicGestureItemView.f52055a, bLiveMagicList.gesture);
                magicGestureItemView.f52056b.setText(bLiveMagicList.name);
                int iM186890d = t100.m186890d(10.0f);
                magicGestureItemView.f52057c.addItemDecoration(new xlf0(iM186890d, iM186890d));
                magicGestureItemView.f52057c.setAdapter(new MagicGestureItemView.C12936a(arrayListM200339n, act(), f30Var));
                int i = xdl0.f192404f;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
                layoutParams.topMargin = iM186890d;
                this.f52065e.addView(magicGestureItemView, layoutParams);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76603Q(this);
    }

    public MagicGestureView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagicGestureView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
