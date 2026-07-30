package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveMagicList;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bsw;
import p153l.guf0;
import p153l.izs;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.yec0;
import p153l.z20;

/* JADX INFO: loaded from: classes5.dex */
public class MagicGestureView extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f52911c;

    /* JADX INFO: renamed from: d */
    public VText f52912d;

    /* JADX INFO: renamed from: e */
    public VLinear f52913e;

    public MagicGestureView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m77786Q(View view) {
        bsw.m106315a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m77787R(String str, List<BLiveMagicList> list, z20<BLiveDynamicEffect, Boolean> z20Var) {
        this.f52912d.setText(str);
        this.f52913e.removeAllViews();
        for (BLiveMagicList bLiveMagicList : list) {
            ArrayList arrayListM147522n = jyb.m147522n(bLiveMagicList.dynamicEffect, new qcj() { // from class: l.asw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveDynamicEffect) obj).hasDownloaded);
                }
            });
            if (!jyb.m147479J(arrayListM147522n)) {
                MagicGestureItemView magicGestureItemView = (MagicGestureItemView) act().getLayoutInflater().inflate(yec0.f198791I3, (ViewGroup) null);
                izs.m142868s("context_livingAct", magicGestureItemView.f52903a, bLiveMagicList.gesture);
                magicGestureItemView.f52904b.setText(bLiveMagicList.name);
                int iM175859d = qa00.m175859d(10.0f);
                magicGestureItemView.f52905c.addItemDecoration(new guf0(iM175859d, iM175859d));
                magicGestureItemView.f52905c.setAdapter(new MagicGestureItemView.C13099a(arrayListM147522n, act(), z20Var));
                int i = bnl0.f77545f;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
                layoutParams.topMargin = iM175859d;
                this.f52913e.addView(magicGestureItemView, layoutParams);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77786Q(this);
    }

    public MagicGestureView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagicGestureView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
