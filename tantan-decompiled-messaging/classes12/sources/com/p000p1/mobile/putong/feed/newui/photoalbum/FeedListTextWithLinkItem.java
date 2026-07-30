package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Order;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import java.util.List;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.cxh;
import p007l.hbh;
import p007l.kjb0;
import p007l.n8i;
import p007l.p6j0;
import p007l.vqg;
import p007l.zi60;
import v.VLinear;
import v.VText;
import v.VText_Expandable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedListTextWithLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListTextWithLinkItem f2327a;

    /* JADX INFO: renamed from: b */
    public VLinear f2328b;

    /* JADX INFO: renamed from: c */
    public TextView f2329c;

    /* JADX INFO: renamed from: d */
    public VText f2330d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2331e;

    /* JADX INFO: renamed from: f */
    public VText_Expandable f2332f;

    /* JADX INFO: renamed from: g */
    public VText f2333g;

    /* JADX INFO: renamed from: h */
    public int f2334h;

    /* JADX INFO: renamed from: i */
    public Moment f2335i;

    /* JADX INFO: renamed from: j */
    public RawFeed f2336j;

    /* JADX INFO: renamed from: k */
    public String f2337k;

    /* JADX INFO: renamed from: l */
    public String f2338l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Boolean> f2339m;

    /* JADX INFO: renamed from: n */
    public int f2340n;

    /* JADX INFO: renamed from: o */
    public boolean f2341o;

    /* JADX INFO: renamed from: p */
    public int f2342p;

    public FeedListTextWithLinkItem(Context context) {
        super(context);
        this.f2341o = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4132c(View view) {
        hbh.m10590a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m4133d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m4134e() {
        this.f2332f.setText(this.f2335i.value);
        this.f2332f.n(this.f2339m, ((DbObject) this.f2335i).id);
        xdl0.M(this.f2333g, (TextUtils.isEmpty(this.f2335i.landingPage) && TextUtils.isEmpty(this.f2335i.deeplink)) ? false : true);
        this.f2327a.setOnClickListener(new View.OnClickListener() { // from class: l.fbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8064a.m4137h(view);
            }
        });
        this.f2333g.setOnClickListener(new View.OnClickListener() { // from class: l.gbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8416a.m4138i(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m4135f() {
        String str = this.f2338l;
        j760 j760VarA = j760.a("qa_optional", this.f2335i.shareMyVote ? "1" : "0");
        List<TopicMomentIdBox> list = this.f2335i.topics;
        p6j0.m12913c("e_moment", str, j760VarA, j760.a("topic_id", (list == null || list.size() == 0) ? "" : this.f2335i.topics.get(0).f285id), j760.a("moment_id", ((DbObject) this.f2335i).id), j760.a("owner_id", this.f2335i.owner), j760.a(Order.TYPE, Integer.valueOf(this.f2340n)), j760.a("moment_type", zi60.m17436w().m17467y(this.f2335i)), j760.a("moment_distance", Long.valueOf(vqg.m15477G(this.f2335i))), j760.a("moment_create_time", Long.valueOf(vqg.m15475F(this.f2335i))), j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(this.f2335i.owner)))));
    }

    /* JADX INFO: renamed from: g */
    public final void m4136g() {
        if (TextUtils.isEmpty(this.f2335i.simpleActivity.name)) {
            return;
        }
        p6j0.m12913c("e_activity_moment", this.f2338l, vwb.Y("activity_id", this.f2335i.simpleActivity.f696id), vwb.Y("activity_name", this.f2335i.simpleActivity.name), vwb.Y("moment_show_type", MomentMessageType.card), vwb.Y("moments_user_id", this.f2335i.owner));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4137h(View view) {
        if (this.f2341o) {
            m4135f();
            Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(this.f2337k).m5943m(((DbObject) this.f2335i).id).m5944n(this.f2335i.owner).m5950t(true).m5945o(this.f2335i.momentValue).m5949s(this.f2336j).m5932b();
            if (intentM5932b == null) {
                return;
            }
            m4133d().startActivity(intentM5932b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4138i(View view) {
        m4136g();
        m4135f();
        if (!TextUtils.isEmpty(this.f2335i.deeplink)) {
            cxh.m9252b(m4133d(), Uri.parse(this.f2335i.deeplink));
        } else if (TextUtils.isEmpty(this.f2335i.landingPage) || !this.f2335i.landingPage.startsWith("tantan")) {
            m4133d().startActivity(kjb0.m11458j(m4133d(), m4133d().getResources().getString(R$string.f553k4), this.f2335i.landingPage));
        } else {
            cxh.m9252b(m4133d(), Uri.parse(this.f2335i.landingPage));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4139j(int i, Moment moment, String str, int i2, HashMap<String, Boolean> map, String str2) {
        m4140k(i, moment, str, i2, map, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public void m4140k(int i, Moment moment, String str, int i2, HashMap<String, Boolean> map, String str2, RawFeed rawFeed) {
        this.f2337k = str;
        this.f2334h = i;
        this.f2335i = moment;
        this.f2336j = rawFeed;
        this.f2340n = i2;
        this.f2338l = str2;
        this.f2339m = map;
        m4134e();
        int iD = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            xdl0.M(this.f2328b, false);
            xdl0.X(this.f2331e, this.f2342p);
        } else {
            xdl0.M(this.f2328b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f313a.getString(R$string.f537i2));
            VText vText = this.f2330d;
            if (zEquals) {
                xdl0.M(vText, false);
                this.f2329c.setText(moment.feedTime);
                TextView textView = this.f2329c;
                textView.setTextSize(n8i.m12112f(textView, t100.d(55.0f), moment.feedTime, 17.0f));
            } else {
                xdl0.M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f2329c.setTextSize(20.0f);
                this.f2329c.setText(strArrSplit[0]);
                this.f2330d.setText(strArrSplit[1]);
            }
            if (i2 == 0) {
                xdl0.X(this.f2329c, t100.d(24.0f));
                xdl0.X(this.f2330d, t100.d(24.0f));
                xdl0.X(this.f2331e, t100.d(28.0f));
            } else {
                xdl0.X(this.f2331e, this.f2342p);
                xdl0.X(this.f2329c, -t100.d(4.0f));
                xdl0.X(this.f2330d, -t100.d(4.0f));
            }
        }
        if (i == 2) {
            iD = t100.d(16.0f);
        } else if (m4133d() instanceof MomentDetailAct) {
            iD = t100.d(8.0f);
        }
        xdl0.f0(this, iD);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4132c(this);
        this.f2342p = ((FrameLayout.LayoutParams) this.f2331e.getLayoutParams()).topMargin;
    }

    public void setNeedInnerClick(boolean z) {
        this.f2341o = z;
    }

    public FeedListTextWithLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2341o = true;
    }

    public FeedListTextWithLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2341o = true;
    }
}
