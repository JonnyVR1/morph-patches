package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.c1u;
import p149l.l9s;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareLiveVideoItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46334d;

    /* JADX INFO: renamed from: e */
    public VFrame f46335e;

    /* JADX INFO: renamed from: f */
    public VText f46336f;

    /* JADX INFO: renamed from: g */
    public VText f46337g;

    /* JADX INFO: renamed from: h */
    public VText f46338h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f46339i;

    /* JADX INFO: renamed from: j */
    public View f46340j;

    public LiveSquareLiveVideoItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70909h0(View view) {
        c1u.m104880a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70909h0(this);
        if (l9s.m149076g().mo30742a().mo165308h()) {
            xdl0.m208357U(this.f46337g, t100.m186890d(40.0f));
        }
    }

    public LiveSquareLiveVideoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareLiveVideoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
