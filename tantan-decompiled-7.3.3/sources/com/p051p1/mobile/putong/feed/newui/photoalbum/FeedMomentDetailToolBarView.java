package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.at0;
import p153l.pgh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentDetailToolBarView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMomentDetailToolBarView f41730a;

    /* JADX INFO: renamed from: b */
    public VText f41731b;

    /* JADX INFO: renamed from: c */
    public VLinear f41732c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f41733d;

    /* JADX INFO: renamed from: e */
    public VText f41734e;

    /* JADX INFO: renamed from: f */
    public TextView f41735f;

    /* JADX INFO: renamed from: g */
    public VImage f41736g;

    /* JADX INFO: renamed from: h */
    public Moment f41737h;

    /* JADX INFO: renamed from: i */
    public boolean f41738i;

    public FeedMomentDetailToolBarView(Context context) {
        super(context);
    }

    private void setAttentionVisible(int i) {
        if (at0.m100010d(this.f41737h) || !this.f41738i) {
            this.f41735f.setVisibility(8);
        } else {
            this.f41735f.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m64308a(View view) {
        pgh.m172232a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public PutongAct m64309b() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m64310c() {
        FeedModule.f39703d.m145587Pb().mo144672g(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64308a(this);
        m64310c();
    }

    public FeedMomentDetailToolBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentDetailToolBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
