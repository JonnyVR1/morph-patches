package com.p051p1.mobile.putong.live.livingroom.virtual.userCard.dressup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import p151v.VDraweeView;
import p153l.b7m0;
import p153l.bnl0;
import p153l.izs;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualUserDressUpItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VirtualUserDressUpItemView f53639a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53640b;

    /* JADX INFO: renamed from: c */
    public TextView f53641c;

    /* JADX INFO: renamed from: d */
    public TextView f53642d;

    /* JADX INFO: renamed from: e */
    public TextView f53643e;

    public VirtualUserDressUpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78743b(View view) {
        b7m0.m102848a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m78744c(final BLiveUserDressUp bLiveUserDressUp, final y20<BLiveUserDressUp> y20Var) {
        this.f53641c.setText(bLiveUserDressUp.name);
        this.f53642d.setText(bLiveUserDressUp.desc);
        izs.m142868s("context_livingAct", this.f53640b, bLiveUserDressUp.imageUrl);
        bnl0.m105509E0(this.f53643e, new View.OnClickListener() { // from class: l.a7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveUserDressUp);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78743b(this);
    }

    public VirtualUserDressUpItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualUserDressUpItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
