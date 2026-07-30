package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.MomentShareInfo;
import p147v.VDraweeView;
import p149l.cxh;
import p149l.j760;
import p149l.kjb0;
import p149l.p6j0;
import p149l.qib0;
import p149l.rzh;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSharelinkView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f42502a;

    /* JADX INFO: renamed from: b */
    public TextView f42503b;

    /* JADX INFO: renamed from: c */
    public TextView f42504c;

    /* JADX INFO: renamed from: d */
    public MomentShareInfo f42505d;

    /* JADX INFO: renamed from: e */
    public boolean f42506e;

    /* JADX INFO: renamed from: f */
    public String f42507f;

    /* JADX INFO: renamed from: g */
    public String f42508g;

    /* JADX INFO: renamed from: h */
    public String f42509h;

    public FeedSharelinkView(Context context) {
        super(context);
        this.f42506e = true;
        this.f42507f = "";
        this.f42508g = "";
        this.f42509h = "";
    }

    /* JADX INFO: renamed from: b */
    public final void m65229b(View view) {
        rzh.m181748a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m65230c() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.qzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157048a.m65231d(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m65231d(View view) {
        MomentShareInfo momentShareInfo;
        if (!this.f42506e || (momentShareInfo = this.f42505d) == null || TextUtils.isEmpty(momentShareInfo.landingPage)) {
            return;
        }
        m65234g();
        if (this.f42505d.landingPage.startsWith("tantan")) {
            if (getContext() instanceof Activity) {
                cxh.m109100b((Activity) getContext(), Uri.parse(this.f42505d.landingPage));
            }
        } else {
            Context context = getContext();
            Context context2 = getContext();
            MomentShareInfo momentShareInfo2 = this.f42505d;
            context.startActivity(kjb0.m146199j(context2, momentShareInfo2.title, momentShareInfo2.landingPage));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m65232e(MomentShareInfo momentShareInfo, String str) {
        m65233f(momentShareInfo, str, User.ID_TEAM_ACCOUNT, User.ID_TEAM_ACCOUNT);
    }

    /* JADX INFO: renamed from: f */
    public void m65233f(MomentShareInfo momentShareInfo, String str, String str2, String str3) {
        this.f42505d = momentShareInfo;
        this.f42507f = str;
        this.f42508g = str2;
        this.f42509h = str3;
        if (momentShareInfo == null) {
            return;
        }
        this.f42503b.setText(momentShareInfo.title);
        this.f42504c.setText(this.f42505d.description);
        qib0.f154691G.m102331L0(this.f42502a, this.f42505d.url);
    }

    /* JADX INFO: renamed from: g */
    public final void m65234g() {
        p6j0.m167669c("e_share_link", this.f42507f, j760.m140076a("information", this.f42505d.getTrackInfomation()), j760.m140076a("link_style", this.f42505d.name), j760.m140076a("other_user_id", this.f42509h));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65229b(this);
        m65230c();
    }

    public void setCanClick(boolean z) {
        this.f42506e = z;
    }

    public FeedSharelinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42506e = true;
        this.f42507f = "";
        this.f42508g = "";
        this.f42509h = "";
    }

    public FeedSharelinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42506e = true;
        this.f42507f = "";
        this.f42508g = "";
        this.f42509h = "";
    }
}
