package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import java.util.List;
import p151v.VDraweeView;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jic0;
import p153l.nrw;
import p153l.yec0;
import p153l.z20;

/* JADX INFO: loaded from: classes5.dex */
public class MagicGestureItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52903a;

    /* JADX INFO: renamed from: b */
    public VText f52904b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f52905c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.MagicGestureItemView$a */
    public static class C13099a extends jic0<BLiveDynamicEffect> {

        /* JADX INFO: renamed from: c */
        public List<BLiveDynamicEffect> f52906c;

        /* JADX INFO: renamed from: d */
        public Act f52907d;

        /* JADX INFO: renamed from: e */
        public z20<BLiveDynamicEffect, Boolean> f52908e;

        public C13099a(List<BLiveDynamicEffect> list, Act act, z20<BLiveDynamicEffect, Boolean> z20Var) {
            this.f52906c = list;
            this.f52907d = act;
            this.f52908e = z20Var;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f52906c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f52907d.inflater().inflate(yec0.f198815K3, (ViewGroup) null);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final BLiveDynamicEffect bLiveDynamicEffect, int i, final int i2) {
            final MagicGestureListItemView magicGestureListItemView = (MagicGestureListItemView) view;
            magicGestureListItemView.f52910d.setText(bLiveDynamicEffect.name);
            izs.m142868s("context_livingAct", magicGestureListItemView.f52909c, bLiveDynamicEffect.cover);
            magicGestureListItemView.setSelected(bLiveDynamicEffect.isSelected);
            bnl0.m105509E0(magicGestureListItemView, new View.OnClickListener() { // from class: l.mrw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f138422a.m77783I(magicGestureListItemView, i2, bLiveDynamicEffect, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G */
        public final void m77781G(boolean z, int i) {
            for (int i2 = 0; i2 < mo29823C(); i2++) {
                BLiveDynamicEffect item = getItem(i2);
                if (i2 == i) {
                    item.isSelected = z;
                } else {
                    item.isSelected = false;
                }
            }
            notifyDataSetChanged();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public BLiveDynamicEffect getItem(int i) {
            return this.f52906c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m77783I(MagicGestureListItemView magicGestureListItemView, int i, BLiveDynamicEffect bLiveDynamicEffect, View view) {
            magicGestureListItemView.setSelected(!magicGestureListItemView.isSelected());
            m77781G(magicGestureListItemView.isSelected(), i);
            z20<BLiveDynamicEffect, Boolean> z20Var = this.f52908e;
            if (z20Var != null) {
                z20Var.call(bLiveDynamicEffect, Boolean.valueOf(magicGestureListItemView.isSelected()));
            }
        }
    }

    public MagicGestureItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77778a(View view) {
        nrw.m164534a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77778a(this);
    }

    public MagicGestureItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagicGestureItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
