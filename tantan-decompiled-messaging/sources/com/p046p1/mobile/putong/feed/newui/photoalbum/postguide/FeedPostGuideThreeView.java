package com.p046p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VLinear;
import p147v.VText;
import p149l.cth;
import p149l.vsh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostGuideThreeView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f42317c;

    /* JADX INFO: renamed from: d */
    public VText f42318d;

    /* JADX INFO: renamed from: e */
    public VLinear f42319e;

    /* JADX INFO: renamed from: f */
    public Act f42320f;

    /* JADX INFO: renamed from: g */
    public MyTabPostGuide f42321g;

    public FeedPostGuideThreeView(Context context) {
        super(context);
        m65042R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m65042R(Context context) {
        addView(m65044Q(LayoutInflater.from(context), this));
        this.f42320f = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m65043S(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f39247id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        vsh.m199868b(this.f42320f, topicMomentNew_);
        vsh.m199867a(3, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: Q */
    public View m65044Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cth.m108684b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m65045T(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f42321g = myTabPostGuide;
        this.f42318d.setText(myTabPostGuide.title);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.bth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77223a.m65043S(myTabPostGuide, str, view);
            }
        });
    }

    public FeedPostGuideThreeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65042R(context);
    }

    public FeedPostGuideThreeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65042R(context);
    }
}
