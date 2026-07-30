package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.MomentShareInfo;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.g1i;
import p153l.orb0;
import p153l.pf60;
import p153l.ryh;
import p153l.tfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSharelinkView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f43350a;

    /* JADX INFO: renamed from: b */
    public TextView f43351b;

    /* JADX INFO: renamed from: c */
    public TextView f43352c;

    /* JADX INFO: renamed from: d */
    public MomentShareInfo f43353d;

    /* JADX INFO: renamed from: e */
    public boolean f43354e;

    /* JADX INFO: renamed from: f */
    public String f43355f;

    /* JADX INFO: renamed from: g */
    public String f43356g;

    /* JADX INFO: renamed from: h */
    public String f43357h;

    public FeedSharelinkView(Context context) {
        super(context);
        this.f43354e = true;
        this.f43355f = "";
        this.f43356g = "";
        this.f43357h = "";
    }

    /* JADX INFO: renamed from: b */
    public final void m66412b(View view) {
        g1i.m128512a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m66413c() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.f1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96799a.m66414d(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m66414d(View view) {
        MomentShareInfo momentShareInfo;
        if (!this.f43354e || (momentShareInfo = this.f43353d) == null || TextUtils.isEmpty(momentShareInfo.landingPage)) {
            return;
        }
        m66417g();
        if (this.f43353d.landingPage.startsWith("tantan")) {
            if (getContext() instanceof Activity) {
                ryh.m183607b((Activity) getContext(), Uri.parse(this.f43353d.landingPage));
            }
        } else {
            Context context = getContext();
            Context context2 = getContext();
            MomentShareInfo momentShareInfo2 = this.f43353d;
            context.startActivity(orb0.m168893j(context2, momentShareInfo2.title, momentShareInfo2.landingPage));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m66415e(MomentShareInfo momentShareInfo, String str) {
        m66416f(momentShareInfo, str, User.ID_TEAM_ACCOUNT, User.ID_TEAM_ACCOUNT);
    }

    /* JADX INFO: renamed from: f */
    public void m66416f(MomentShareInfo momentShareInfo, String str, String str2, String str3) {
        this.f43353d = momentShareInfo;
        this.f43355f = str;
        this.f43356g = str2;
        this.f43357h = str3;
        if (momentShareInfo == null) {
            return;
        }
        this.f43351b.setText(momentShareInfo.title);
        this.f43352c.setText(this.f43353d.description);
        uqb0.f180374G.m127115L0(this.f43350a, this.f43353d.url);
    }

    /* JADX INFO: renamed from: g */
    public final void m66417g() {
        tfj0.m190940c("e_share_link", this.f43355f, pf60.m172085a("information", this.f43353d.getTrackInfomation()), pf60.m172085a("link_style", this.f43353d.name), pf60.m172085a("other_user_id", this.f43357h));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66412b(this);
        m66413c();
    }

    public void setCanClick(boolean z) {
        this.f43354e = z;
    }

    public FeedSharelinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43354e = true;
        this.f43355f = "";
        this.f43356g = "";
        this.f43357h = "";
    }

    public FeedSharelinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43354e = true;
        this.f43355f = "";
        this.f43356g = "";
        this.f43357h = "";
    }
}
