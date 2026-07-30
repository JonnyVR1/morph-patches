package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dq1;
import p153l.mrb0;
import p153l.psd0;
import p153l.ugr;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class LikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f44500a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44501b;

    /* JADX INFO: renamed from: c */
    public VImage f44502c;

    /* JADX INFO: renamed from: d */
    public VText f44503d;

    /* JADX INFO: renamed from: e */
    public View f44504e;

    public LikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m67818c(View view) {
        ugr.m195934a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m67819d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m67820e(dq1<String> dq1Var, final String str, boolean z) {
        this.f44500a.setOnClickListener(new View.OnClickListener() { // from class: l.sgr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167912a.m67821f(str, view);
            }
        });
        bnl0.m105524M(this.f44504e, !z);
        dq1Var.mo68557c(m67819d(), mrb0.m159645W(str)).subscribe(psd0.m173596G(new y20() { // from class: l.tgr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174123a.m67822g((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m67821f(String str, View view) {
        m67819d().startActivityForResult(MomentsInProfileAct.m68095X1(m67819d(), str, "from_LikesDetailAct"), 22);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m67822g(User user) {
        uqb0.f180374G.m127125Q0(this.f44501b, user.m61308fp().profileSmall());
        this.f44503d.setText(user.name);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67819d(), user, this.f44502c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67818c(this);
    }

    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
