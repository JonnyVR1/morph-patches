package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.User;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.mkd0;
import l.qib0;
import l.wp1;
import l.xdl0;
import p007l.ijb0;
import p007l.ter;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f5113a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5114b;

    /* JADX INFO: renamed from: c */
    public VImage f5115c;

    /* JADX INFO: renamed from: d */
    public VText f5116d;

    /* JADX INFO: renamed from: e */
    public View f5117e;

    public LikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m7826c(View view) {
        ter.m14509a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m7827d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m7828e(wp1<String> wp1Var, final String str, boolean z) {
        this.f5113a.setOnClickListener(new View.OnClickListener() { // from class: l.rer
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12632a.m7829f(str, view);
            }
        });
        xdl0.M(this.f5117e, !z);
        wp1Var.c(m7827d(), ijb0.m10912W(str)).subscribe(mkd0.G(new e30() { // from class: l.ser
            public final void call(Object obj) {
                this.f12898a.m7830g((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7829f(String str, View view) {
        m7827d().startActivityForResult(MomentsInProfileAct.m8110V1(m7827d(), str, "from_LikesDetailAct"), 22);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7830g(User user) {
        qib0.G.Q0(this.f5114b, user.m1042fp().profileSmall());
        this.f5116d.setText(user.name);
        qib0.b0.b.showUserVerificationLogo(m7827d(), user, this.f5115c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7826c(this);
    }

    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
