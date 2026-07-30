package com.p046p1.mobile.putong.core.p053ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VText;
import p149l.j1j;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class FourSelectOneAdCard extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29708a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f29709b;

    /* JADX INFO: renamed from: c */
    public VText f29710c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f29711d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29712e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f29713f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f29714g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f29715h;

    /* JADX INFO: renamed from: i */
    public VDraweeView[] f29716i;

    public FourSelectOneAdCard(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m46102e(View view) {
        j1j.m139323a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m46103f(int i) {
        CoreSuggested.UserInfo userInfo;
        FourSelectOneAdCardData fourSelectOneAdCardData;
        qib0.f154691G.m102331L0(this.f29708a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJPQlZNTkVNRURFUzVIWlJUWUhaUUNYQlRJTTNBVTE0IiwidyI6NzE4LCJoIjoxMjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzIwNTc1OTQwNTA1MjMxNjB9.png");
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e == null || i >= partialListOptM221515e.loaded.size() || (fourSelectOneAdCardData = (userInfo = partialListOptM221515e.loaded.get(i)).fourSelectOneAdCardData) == null || vwb.m200296J(fourSelectOneAdCardData.avatarList)) {
            return;
        }
        this.f29709b.setText(userInfo.fourSelectOneAdCardData.adTitle);
        this.f29710c.setText(userInfo.fourSelectOneAdCardData.adContent);
        int iMin = Math.min(userInfo.fourSelectOneAdCardData.avatarList.size(), 4);
        for (int i2 = 0; i2 < iMin; i2++) {
            qib0.f154691G.m102331L0(this.f29716i[i2], userInfo.fourSelectOneAdCardData.avatarList.get(i2));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46102e(this);
        this.f29716i = new VDraweeView[]{this.f29711d, this.f29712e, this.f29713f, this.f29714g};
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.h1j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f17545c.f19663m0.f19346I2.onNext(j760.m140076a(SwipeDirection.RIGHT, null));
            }
        });
    }

    public FourSelectOneAdCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FourSelectOneAdCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
