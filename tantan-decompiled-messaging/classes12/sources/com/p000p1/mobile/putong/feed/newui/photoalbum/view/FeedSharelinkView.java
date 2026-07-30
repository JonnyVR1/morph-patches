package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.MomentShareInfo;
import l.j760;
import l.qib0;
import l.xdl0;
import p007l.cxh;
import p007l.kjb0;
import p007l.p6j0;
import p007l.rzh;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSharelinkView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3963a;

    /* JADX INFO: renamed from: b */
    public TextView f3964b;

    /* JADX INFO: renamed from: c */
    public TextView f3965c;

    /* JADX INFO: renamed from: d */
    public MomentShareInfo f3966d;

    /* JADX INFO: renamed from: e */
    public boolean f3967e;

    /* JADX INFO: renamed from: f */
    public String f3968f;

    /* JADX INFO: renamed from: g */
    public String f3969g;

    /* JADX INFO: renamed from: h */
    public String f3970h;

    public FeedSharelinkView(Context context) {
        super(context);
        this.f3967e = true;
        this.f3968f = "";
        this.f3969g = "";
        this.f3970h = "";
    }

    /* JADX INFO: renamed from: b */
    public final void m6330b(View view) {
        rzh.m13972a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m6331c() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.qzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12433a.m6332d(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m6332d(View view) {
        MomentShareInfo momentShareInfo;
        if (!this.f3967e || (momentShareInfo = this.f3966d) == null || TextUtils.isEmpty(momentShareInfo.landingPage)) {
            return;
        }
        m6335g();
        if (this.f3966d.landingPage.startsWith("tantan")) {
            if (getContext() instanceof Activity) {
                cxh.m9252b((Activity) getContext(), Uri.parse(this.f3966d.landingPage));
            }
        } else {
            Context context = getContext();
            Context context2 = getContext();
            MomentShareInfo momentShareInfo2 = this.f3966d;
            context.startActivity(kjb0.m11458j(context2, momentShareInfo2.title, momentShareInfo2.landingPage));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m6333e(MomentShareInfo momentShareInfo, String str) {
        m6334f(momentShareInfo, str, User.ID_TEAM_ACCOUNT, User.ID_TEAM_ACCOUNT);
    }

    /* JADX INFO: renamed from: f */
    public void m6334f(MomentShareInfo momentShareInfo, String str, String str2, String str3) {
        this.f3966d = momentShareInfo;
        this.f3968f = str;
        this.f3969g = str2;
        this.f3970h = str3;
        if (momentShareInfo == null) {
            return;
        }
        this.f3964b.setText(momentShareInfo.title);
        this.f3965c.setText(this.f3966d.description);
        qib0.G.L0(this.f3963a, this.f3966d.url);
    }

    /* JADX INFO: renamed from: g */
    public final void m6335g() {
        p6j0.m12913c("e_share_link", this.f3968f, j760.a("information", this.f3966d.getTrackInfomation()), j760.a("link_style", this.f3966d.name), j760.a("other_user_id", this.f3970h));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6330b(this);
        m6331c();
    }

    public void setCanClick(boolean z) {
        this.f3967e = z;
    }

    public FeedSharelinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3967e = true;
        this.f3968f = "";
        this.f3969g = "";
        this.f3970h = "";
    }

    public FeedSharelinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3967e = true;
        this.f3968f = "";
        this.f3969g = "";
        this.f3970h = "";
    }
}
