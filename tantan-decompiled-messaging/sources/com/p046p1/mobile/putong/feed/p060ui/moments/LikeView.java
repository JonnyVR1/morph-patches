package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.ijb0;
import p149l.mkd0;
import p149l.qib0;
import p149l.ter;
import p149l.wp1;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class LikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f43652a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43653b;

    /* JADX INFO: renamed from: c */
    public VImage f43654c;

    /* JADX INFO: renamed from: d */
    public VText f43655d;

    /* JADX INFO: renamed from: e */
    public View f43656e;

    public LikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m66635c(View view) {
        ter.m188557a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m66636d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m66637e(wp1<String> wp1Var, final String str, boolean z) {
        this.f43652a.setOnClickListener(new View.OnClickListener() { // from class: l.rer
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159081a.m66638f(str, view);
            }
        });
        xdl0.m208344M(this.f43656e, !z);
        wp1Var.mo67374c(m66636d(), ijb0.m136559W(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.ser
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164032a.m66639g((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m66638f(String str, View view) {
        m66636d().startActivityForResult(MomentsInProfileAct.m66912V1(m66636d(), str, "from_LikesDetailAct"), 22);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m66639g(User user) {
        qib0.f154691G.m102341Q0(this.f43653b, user.m60124fp().profileSmall());
        this.f43655d.setText(user.name);
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66636d(), user, this.f43654c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66635c(this);
    }

    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
