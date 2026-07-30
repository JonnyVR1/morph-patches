package com.p051p1.mobile.putong.live.external.square.search.recent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gnt;
import p153l.irn;
import p153l.izs;
import p153l.mr2;
import p153l.rmt;
import p153l.yau;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSearchRecentItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f47080a;

    /* JADX INFO: renamed from: b */
    public VText f47081b;

    /* JADX INFO: renamed from: c */
    public VText f47082c;

    public LiveSearchRecentItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72019a(View view) {
        rmt.m182108a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72020b(mr2 mr2Var) {
        izs.m142871v("context_common", this.f47080a, mr2Var.f138292b.getCoverUrl(), bnl0.m105587w(140.0f), bnl0.m105587w(140.0f), false, false, irn.m141839a(), null);
        this.f47081b.setText(mr2Var.f138291a.name);
        boolean zEquals = TEnum.equals(mr2Var.f138293c.state, "stopped");
        bnl0.m105524M(this.f47082c, !zEquals);
        BLiveAbsData bLiveAbsData = mr2Var.f138293c;
        if (zEquals) {
            gnt.m130985e(bLiveAbsData.anchor.f45267id, true);
        } else {
            gnt.m130991k("p_live_search", bLiveAbsData, 0, "recent_browsing");
            this.f47082c.setText(yau.m214935c(mr2Var.f138293c.memberCount));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72019a(this);
    }

    public LiveSearchRecentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSearchRecentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
