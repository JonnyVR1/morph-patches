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
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.bkb0;
import p149l.eth;
import p149l.f3c0;
import p149l.qib0;
import p149l.t100;
import p149l.vsh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostGuideTwoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRelative f42322c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42323d;

    /* JADX INFO: renamed from: e */
    public VText f42324e;

    /* JADX INFO: renamed from: f */
    public VLinear f42325f;

    /* JADX INFO: renamed from: g */
    public VText f42326g;

    /* JADX INFO: renamed from: h */
    public VText f42327h;

    /* JADX INFO: renamed from: i */
    public Act f42328i;

    /* JADX INFO: renamed from: j */
    public MyTabPostGuide f42329j;

    public FeedPostGuideTwoView(Context context) {
        super(context);
        m65047R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m65047R(Context context) {
        addView(m65049Q(LayoutInflater.from(context), this));
        this.f42324e.setTypeface(null, 1);
        this.f42326g.setTypeface(null, 1);
        this.f42328i = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m65048S(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f39247id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        vsh.m199868b(this.f42328i, topicMomentNew_);
        vsh.m199867a(2, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: Q */
    public View m65049Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eth.m118101b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m65050T(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f42329j = myTabPostGuide;
        if (TextUtils.isEmpty(myTabPostGuide.picture)) {
            qib0.f154691G.m102354Y0(this.f42323d, f3c0.f94340H3);
        } else {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f42323d;
            String str2 = myTabPostGuide.picture;
            int i = t100.f167230E;
            bkb0Var.m102325I0(vDraweeView, str2, i, i);
        }
        this.f42326g.setText(myTabPostGuide.title);
        this.f42327h.setText(myTabPostGuide.subtitle);
        this.f42324e.setText(myTabPostGuide.buttonText);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87842a.m65048S(myTabPostGuide, str, view);
            }
        });
    }

    public FeedPostGuideTwoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65047R(context);
    }

    public FeedPostGuideTwoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65047R(context);
    }
}
