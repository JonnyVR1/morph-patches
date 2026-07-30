package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.d3u;
import p153l.mbs;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareLiveVideoItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f47182d;

    /* JADX INFO: renamed from: e */
    public VFrame f47183e;

    /* JADX INFO: renamed from: f */
    public VText f47184f;

    /* JADX INFO: renamed from: g */
    public VText f47185g;

    /* JADX INFO: renamed from: h */
    public VText f47186h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f47187i;

    /* JADX INFO: renamed from: j */
    public View f47188j;

    public LiveSquareLiveVideoItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m72092h0(View view) {
        d3u.m113903a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72092h0(this);
        if (mbs.m157853g().mo31745a().mo192251h()) {
            bnl0.m105537U(this.f47185g, qa00.m175859d(40.0f));
        }
    }

    public LiveSquareLiveVideoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareLiveVideoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
