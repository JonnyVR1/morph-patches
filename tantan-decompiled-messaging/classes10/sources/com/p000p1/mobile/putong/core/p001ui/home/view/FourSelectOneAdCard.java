package com.p000p1.mobile.putong.core.p001ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.j760;
import l.qib0;
import l.vwb;
import l.xdl0;
import p003l.j1j;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FourSelectOneAdCard extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2102a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f2103b;

    /* JADX INFO: renamed from: c */
    public VText f2104c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2105d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f2106e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2107f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f2108g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f2109h;

    /* JADX INFO: renamed from: i */
    public VDraweeView[] f2110i;

    public FourSelectOneAdCard(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m3467e(View view) {
        j1j.m7317a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m3468f(int i) {
        CoreSuggested.UserInfo userInfo;
        FourSelectOneAdCardData fourSelectOneAdCardData;
        qib0.G.L0(this.f2102a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJPQlZNTkVNRURFUzVIWlJUWUhaUUNYQlRJTTNBVTE0IiwidyI6NzE4LCJoIjoxMjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzIwNTc1OTQwNTA1MjMxNjB9.png");
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt == null || i >= partialListOpt.loaded.size() || (fourSelectOneAdCardData = (userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i)).fourSelectOneAdCardData) == null || vwb.J(fourSelectOneAdCardData.avatarList)) {
            return;
        }
        this.f2103b.setText(userInfo.fourSelectOneAdCardData.adTitle);
        this.f2104c.setText(userInfo.fourSelectOneAdCardData.adContent);
        int iMin = Math.min(userInfo.fourSelectOneAdCardData.avatarList.size(), 4);
        for (int i2 = 0; i2 < iMin; i2++) {
            qib0.G.L0(this.f2110i[i2], userInfo.fourSelectOneAdCardData.avatarList.get(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3467e(this);
        this.f2110i = new VDraweeView[]{this.f2105d, this.f2106e, this.f2107f, this.f2108g};
        xdl0.E0(this, new View.OnClickListener() { // from class: l.h1j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
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
