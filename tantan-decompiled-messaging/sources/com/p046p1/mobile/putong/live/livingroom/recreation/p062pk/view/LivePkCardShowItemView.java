package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import java.util.List;
import p147v.VDraweeView;
import p149l.dat;
import p149l.h1c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.qqi0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkCardShowItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51641d;

    /* JADX INFO: renamed from: e */
    public TextView f51642e;

    /* JADX INFO: renamed from: f */
    public TextView f51643f;

    public LivePkCardShowItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76138h0(View view) {
        dat.m110630a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i0 */
    public void m76139i0(BLivePKCardItem bLivePKCardItem) {
        hxs.m133406s("context_livingAct", this.f51641d, bLivePKCardItem.icon);
        this.f51642e.setText(bLivePKCardItem.name);
        int iM76058E = PkViewInternal.m76058E(bLivePKCardItem.startTs, bLivePKCardItem.duration);
        List<String> listM175933a = qqi0.m175933a(iM76058E * 1000);
        this.f51643f.setText(listM175933a.get(1) + ":" + listM175933a.get(2) + BLiveStormDanmakuGiftResourceType.f44446s);
        this.f51643f.setTextColor(kvc0.m147352a(iM76058E <= 10 ? h1c0.f105409u0 : h1c0.f105386m1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76138h0(this);
    }

    public LivePkCardShowItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkCardShowItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
