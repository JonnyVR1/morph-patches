package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.afh;
import p149l.vs0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentDetailToolBarView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMomentDetailToolBarView f40882a;

    /* JADX INFO: renamed from: b */
    public VText f40883b;

    /* JADX INFO: renamed from: c */
    public VLinear f40884c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f40885d;

    /* JADX INFO: renamed from: e */
    public VText f40886e;

    /* JADX INFO: renamed from: f */
    public TextView f40887f;

    /* JADX INFO: renamed from: g */
    public VImage f40888g;

    /* JADX INFO: renamed from: h */
    public Moment f40889h;

    /* JADX INFO: renamed from: i */
    public boolean f40890i;

    public FeedMomentDetailToolBarView(Context context) {
        super(context);
    }

    private void setAttentionVisible(int i) {
        if (vs0.m199798d(this.f40889h) || !this.f40890i) {
            this.f40887f.setVisibility(8);
        } else {
            this.f40887f.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m63125a(View view) {
        afh.m96222a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public PutongAct m63126b() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m63127c() {
        FeedModule.f38855d.m209346Pb().mo193135g(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63125a(this);
        m63127c();
    }

    public FeedMomentDetailToolBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentDetailToolBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
