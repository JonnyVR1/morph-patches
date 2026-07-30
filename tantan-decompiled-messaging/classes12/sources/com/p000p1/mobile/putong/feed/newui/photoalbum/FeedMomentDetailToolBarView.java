package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.app.PutongAct;
import p007l.afh;
import p007l.vs0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentDetailToolBarView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMomentDetailToolBarView f2343a;

    /* JADX INFO: renamed from: b */
    public VText f2344b;

    /* JADX INFO: renamed from: c */
    public VLinear f2345c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2346d;

    /* JADX INFO: renamed from: e */
    public VText f2347e;

    /* JADX INFO: renamed from: f */
    public TextView f2348f;

    /* JADX INFO: renamed from: g */
    public VImage f2349g;

    /* JADX INFO: renamed from: h */
    public Moment f2350h;

    /* JADX INFO: renamed from: i */
    public boolean f2351i;

    public FeedMomentDetailToolBarView(Context context) {
        super(context);
    }

    private void setAttentionVisible(int i) {
        if (vs0.m15566d(this.f2350h) || !this.f2351i) {
            this.f2348f.setVisibility(8);
        } else {
            this.f2348f.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4141a(View view) {
        afh.m8537a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public PutongAct m4142b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m4143c() {
        FeedModule.f316d.m16527Pb().mo15080g(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4141a(this);
        m4143c();
    }

    public FeedMomentDetailToolBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentDetailToolBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
