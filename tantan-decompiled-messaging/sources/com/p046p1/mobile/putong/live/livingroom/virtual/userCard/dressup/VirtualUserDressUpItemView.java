package com.p046p1.mobile.putong.live.livingroom.virtual.userCard.dressup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import p147v.VDraweeView;
import p149l.e30;
import p149l.hxs;
import p149l.xdl0;
import p149l.xxl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualUserDressUpItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VirtualUserDressUpItemView f52791a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52792b;

    /* JADX INFO: renamed from: c */
    public TextView f52793c;

    /* JADX INFO: renamed from: d */
    public TextView f52794d;

    /* JADX INFO: renamed from: e */
    public TextView f52795e;

    public VirtualUserDressUpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m77560b(View view) {
        xxl0.m211511a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m77561c(final BLiveUserDressUp bLiveUserDressUp, final e30<BLiveUserDressUp> e30Var) {
        this.f52793c.setText(bLiveUserDressUp.name);
        this.f52794d.setText(bLiveUserDressUp.desc);
        hxs.m133406s("context_livingAct", this.f52792b, bLiveUserDressUp.imageUrl);
        xdl0.m208329E0(this.f52795e, new View.OnClickListener() { // from class: l.wxl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveUserDressUp);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77560b(this);
    }

    public VirtualUserDressUpItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualUserDressUpItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
