package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import java.util.List;
import p147v.VDraweeView;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.dac0;
import p149l.f30;
import p149l.hxs;
import p149l.oow;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class MagicGestureItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52055a;

    /* JADX INFO: renamed from: b */
    public VText f52056b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f52057c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.MagicGestureItemView$a */
    public static class C12936a extends dac0<BLiveDynamicEffect> {

        /* JADX INFO: renamed from: c */
        public List<BLiveDynamicEffect> f52058c;

        /* JADX INFO: renamed from: d */
        public Act f52059d;

        /* JADX INFO: renamed from: e */
        public f30<BLiveDynamicEffect, Boolean> f52060e;

        public C12936a(List<BLiveDynamicEffect> list, Act act, f30<BLiveDynamicEffect, Boolean> f30Var) {
            this.f52058c = list;
            this.f52059d = act;
            this.f52060e = f30Var;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f52058c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f52059d.inflater().inflate(t6c0.f168083K3, (ViewGroup) null);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final BLiveDynamicEffect bLiveDynamicEffect, int i, final int i2) {
            final MagicGestureListItemView magicGestureListItemView = (MagicGestureListItemView) view;
            magicGestureListItemView.f52062d.setText(bLiveDynamicEffect.name);
            hxs.m133406s("context_livingAct", magicGestureListItemView.f52061c, bLiveDynamicEffect.cover);
            magicGestureListItemView.setSelected(bLiveDynamicEffect.isSelected);
            xdl0.m208329E0(magicGestureListItemView, new View.OnClickListener() { // from class: l.now
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f139884a.m76600I(magicGestureListItemView, i2, bLiveDynamicEffect, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G */
        public final void m76598G(boolean z, int i) {
            for (int i2 = 0; i2 < mo28824C(); i2++) {
                BLiveDynamicEffect item = getItem(i2);
                if (i2 == i) {
                    item.isSelected = z;
                } else {
                    item.isSelected = false;
                }
            }
            notifyDataSetChanged();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public BLiveDynamicEffect getItem(int i) {
            return this.f52058c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m76600I(MagicGestureListItemView magicGestureListItemView, int i, BLiveDynamicEffect bLiveDynamicEffect, View view) {
            magicGestureListItemView.setSelected(!magicGestureListItemView.isSelected());
            m76598G(magicGestureListItemView.isSelected(), i);
            f30<BLiveDynamicEffect, Boolean> f30Var = this.f52060e;
            if (f30Var != null) {
                f30Var.call(bLiveDynamicEffect, Boolean.valueOf(magicGestureListItemView.isSelected()));
            }
        }
    }

    public MagicGestureItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76595a(View view) {
        oow.m165286a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76595a(this);
    }

    public MagicGestureItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagicGestureItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
