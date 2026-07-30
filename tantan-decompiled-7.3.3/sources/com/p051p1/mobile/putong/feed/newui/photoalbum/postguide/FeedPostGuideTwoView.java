package com.p051p1.mobile.putong.feed.newui.photoalbum.postguide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.kuh;
import p153l.lbc0;
import p153l.qa00;
import p153l.tuh;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostGuideTwoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRelative f43170c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f43171d;

    /* JADX INFO: renamed from: e */
    public VText f43172e;

    /* JADX INFO: renamed from: f */
    public VLinear f43173f;

    /* JADX INFO: renamed from: g */
    public VText f43174g;

    /* JADX INFO: renamed from: h */
    public VText f43175h;

    /* JADX INFO: renamed from: i */
    public Act f43176i;

    /* JADX INFO: renamed from: j */
    public MyTabPostGuide f43177j;

    public FeedPostGuideTwoView(Context context) {
        super(context);
        m66230R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m66230R(Context context) {
        addView(m66232Q(LayoutInflater.from(context), this));
        this.f43172e.setTypeface(null, 1);
        this.f43174g.setTypeface(null, 1);
        this.f43176i = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m66231S(MyTabPostGuide myTabPostGuide, String str, View view) {
        TopicMoment topicMomentNew_;
        if (TextUtils.isEmpty(myTabPostGuide.topicId)) {
            topicMomentNew_ = null;
        } else {
            topicMomentNew_ = TopicMoment.new_();
            topicMomentNew_.f40095id = myTabPostGuide.topicId;
            topicMomentNew_.name = myTabPostGuide.topicName;
        }
        kuh.m151539b(this.f43176i, topicMomentNew_);
        kuh.m151538a(2, myTabPostGuide, str);
    }

    /* JADX INFO: renamed from: Q */
    public View m66232Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tuh.m192752b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m66233T(final MyTabPostGuide myTabPostGuide, final String str) {
        this.f43177j = myTabPostGuide;
        if (TextUtils.isEmpty(myTabPostGuide.picture)) {
            uqb0.f180374G.m127138Y0(this.f43171d, lbc0.f130858H3);
        } else {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f43171d;
            String str2 = myTabPostGuide.picture;
            int i = qa00.f156292E;
            fsb0Var.m127109I0(vDraweeView, str2, i, i);
        }
        this.f43174g.setText(myTabPostGuide.title);
        this.f43175h.setText(myTabPostGuide.subtitle);
        this.f43172e.setText(myTabPostGuide.buttonText);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.suh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170687a.m66231S(myTabPostGuide, str, view);
            }
        });
    }

    public FeedPostGuideTwoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66230R(context);
    }

    public FeedPostGuideTwoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66230R(context);
    }
}
