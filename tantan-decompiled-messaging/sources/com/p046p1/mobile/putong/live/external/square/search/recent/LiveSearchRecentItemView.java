package com.p046p1.mobile.putong.live.external.square.search.recent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import p147v.VDraweeView;
import p147v.VText;
import p149l.flt;
import p149l.hxs;
import p149l.ipn;
import p149l.qkt;
import p149l.wq2;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSearchRecentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f46232a;

    /* JADX INFO: renamed from: b */
    public VText f46233b;

    /* JADX INFO: renamed from: c */
    public VText f46234c;

    public LiveSearchRecentItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70836a(View view) {
        qkt.m175391a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m70837b(wq2 wq2Var) {
        hxs.m133409v("context_common", this.f46232a, wq2Var.f187609b.getCoverUrl(), xdl0.m208407w(140.0f), xdl0.m208407w(140.0f), false, false, ipn.m137564a(), null);
        this.f46233b.setText(wq2Var.f187608a.name);
        boolean zEquals = TEnum.equals(wq2Var.f187610c.state, "stopped");
        xdl0.m208344M(this.f46234c, !zEquals);
        BLiveAbsData bLiveAbsData = wq2Var.f187610c;
        if (zEquals) {
            flt.m122094e(bLiveAbsData.anchor.f44419id, true);
        } else {
            flt.m122100k("p_live_search", bLiveAbsData, 0, "recent_browsing");
            this.f46234c.setText(x8u.m207433c(wq2Var.f187610c.memberCount));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70836a(this);
    }

    public LiveSearchRecentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSearchRecentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
