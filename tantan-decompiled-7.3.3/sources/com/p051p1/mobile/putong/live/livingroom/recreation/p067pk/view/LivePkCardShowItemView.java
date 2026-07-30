package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import java.util.List;
import p151v.VDraweeView;
import p153l.ect;
import p153l.izs;
import p153l.n3d0;
import p153l.n9c0;
import p153l.tzi0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkCardShowItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52489d;

    /* JADX INFO: renamed from: e */
    public TextView f52490e;

    /* JADX INFO: renamed from: f */
    public TextView f52491f;

    public LivePkCardShowItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77321h0(View view) {
        ect.m120402a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i0 */
    public void m77322i0(BLivePKCardItem bLivePKCardItem) {
        izs.m142868s("context_livingAct", this.f52489d, bLivePKCardItem.icon);
        this.f52490e.setText(bLivePKCardItem.name);
        int iM77241E = PkViewInternal.m77241E(bLivePKCardItem.startTs, bLivePKCardItem.duration);
        List<String> listM193663a = tzi0.m193663a(iM77241E * 1000);
        this.f52491f.setText(listM193663a.get(1) + ":" + listM193663a.get(2) + BLiveStormDanmakuGiftResourceType.f45294s);
        this.f52491f.setTextColor(n3d0.m161277a(iM77241E <= 10 ? n9c0.f140870u0 : n9c0.f140847m1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77321h0(this);
    }

    public LivePkCardShowItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkCardShowItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
