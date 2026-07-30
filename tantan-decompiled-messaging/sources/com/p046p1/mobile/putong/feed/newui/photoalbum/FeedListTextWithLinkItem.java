package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_Expandable;
import p149l.cxh;
import p149l.hbh;
import p149l.j760;
import p149l.kjb0;
import p149l.n8i;
import p149l.p6j0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedListTextWithLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListTextWithLinkItem f40866a;

    /* JADX INFO: renamed from: b */
    public VLinear f40867b;

    /* JADX INFO: renamed from: c */
    public TextView f40868c;

    /* JADX INFO: renamed from: d */
    public VText f40869d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f40870e;

    /* JADX INFO: renamed from: f */
    public VText_Expandable f40871f;

    /* JADX INFO: renamed from: g */
    public VText f40872g;

    /* JADX INFO: renamed from: h */
    public int f40873h;

    /* JADX INFO: renamed from: i */
    public Moment f40874i;

    /* JADX INFO: renamed from: j */
    public RawFeed f40875j;

    /* JADX INFO: renamed from: k */
    public String f40876k;

    /* JADX INFO: renamed from: l */
    public String f40877l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Boolean> f40878m;

    /* JADX INFO: renamed from: n */
    public int f40879n;

    /* JADX INFO: renamed from: o */
    public boolean f40880o;

    /* JADX INFO: renamed from: p */
    public int f40881p;

    public FeedListTextWithLinkItem(Context context) {
        super(context);
        this.f40880o = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m63116c(View view) {
        hbh.m130330a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m63117d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m63118e() {
        this.f40871f.setText(this.f40874i.value);
        this.f40871f.m223283n(this.f40878m, this.f40874i.f56011id);
        xdl0.m208344M(this.f40872g, (TextUtils.isEmpty(this.f40874i.landingPage) && TextUtils.isEmpty(this.f40874i.deeplink)) ? false : true);
        this.f40866a.setOnClickListener(new View.OnClickListener() { // from class: l.fbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96714a.m63121h(view);
            }
        });
        this.f40872g.setOnClickListener(new View.OnClickListener() { // from class: l.gbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101853a.m63122i(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m63119f() {
        String str = this.f40877l;
        j760 j760VarM140076a = j760.m140076a("qa_optional", this.f40874i.shareMyVote ? "1" : "0");
        List<TopicMomentIdBox> list = this.f40874i.topics;
        p6j0.m167669c("e_moment", str, j760VarM140076a, j760.m140076a("topic_id", (list == null || list.size() == 0) ? "" : this.f40874i.topics.get(0).f38824id), j760.m140076a("moment_id", this.f40874i.f56011id), j760.m140076a("owner_id", this.f40874i.owner), j760.m140076a("order", Integer.valueOf(this.f40879n)), j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f40874i)), j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(this.f40874i))), j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(this.f40874i))), j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(this.f40874i.owner)))));
    }

    /* JADX INFO: renamed from: g */
    public final void m63120g() {
        if (TextUtils.isEmpty(this.f40874i.simpleActivity.name)) {
            return;
        }
        p6j0.m167669c("e_activity_moment", this.f40877l, vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f40874i.simpleActivity.f39235id), vwb.m200311Y("activity_name", this.f40874i.simpleActivity.name), vwb.m200311Y("moment_show_type", "card"), vwb.m200311Y("moments_user_id", this.f40874i.owner));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m63121h(View view) {
        if (this.f40880o) {
            m63119f();
            Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(this.f40876k).m64846m(this.f40874i.f56011id).m64847n(this.f40874i.owner).m64853t(true).m64848o(this.f40874i.momentValue).m64852s(this.f40875j).m64835b();
            if (intentM64835b == null) {
                return;
            }
            m63117d().startActivity(intentM64835b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m63122i(View view) {
        m63120g();
        m63119f();
        if (!TextUtils.isEmpty(this.f40874i.deeplink)) {
            cxh.m109100b(m63117d(), Uri.parse(this.f40874i.deeplink));
        } else if (TextUtils.isEmpty(this.f40874i.landingPage) || !this.f40874i.landingPage.startsWith("tantan")) {
            m63117d().startActivity(kjb0.m146199j(m63117d(), m63117d().getResources().getString(R$string.f39092k4), this.f40874i.landingPage));
        } else {
            cxh.m109100b(m63117d(), Uri.parse(this.f40874i.landingPage));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m63123j(int i, Moment moment, String str, int i2, HashMap<String, Boolean> map, String str2) {
        m63124k(i, moment, str, i2, map, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public void m63124k(int i, Moment moment, String str, int i2, HashMap<String, Boolean> map, String str2, RawFeed rawFeed) {
        this.f40876k = str;
        this.f40873h = i;
        this.f40874i = moment;
        this.f40875j = rawFeed;
        this.f40879n = i2;
        this.f40877l = str2;
        this.f40878m = map;
        m63118e();
        int iM186890d = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            xdl0.m208344M(this.f40867b, false);
            xdl0.m208360X(this.f40870e, this.f40881p);
        } else {
            xdl0.m208344M(this.f40867b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f38852a.getString(R$string.f39076i2));
            VText vText = this.f40869d;
            if (zEquals) {
                xdl0.m208344M(vText, false);
                this.f40868c.setText(moment.feedTime);
                TextView textView = this.f40868c;
                textView.setTextSize(n8i.m158499f(textView, t100.m186890d(55.0f), moment.feedTime, 17.0f));
            } else {
                xdl0.m208344M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f40868c.setTextSize(20.0f);
                this.f40868c.setText(strArrSplit[0]);
                this.f40869d.setText(strArrSplit[1]);
            }
            if (i2 == 0) {
                xdl0.m208360X(this.f40868c, t100.m186890d(24.0f));
                xdl0.m208360X(this.f40869d, t100.m186890d(24.0f));
                xdl0.m208360X(this.f40870e, t100.m186890d(28.0f));
            } else {
                xdl0.m208360X(this.f40870e, this.f40881p);
                xdl0.m208360X(this.f40868c, -t100.m186890d(4.0f));
                xdl0.m208360X(this.f40869d, -t100.m186890d(4.0f));
            }
        }
        if (i == 2) {
            iM186890d = t100.m186890d(16.0f);
        } else if (m63117d() instanceof MomentDetailAct) {
            iM186890d = t100.m186890d(8.0f);
        }
        xdl0.m208374f0(this, iM186890d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63116c(this);
        this.f40881p = ((FrameLayout.LayoutParams) this.f40870e.getLayoutParams()).topMargin;
    }

    public void setNeedInnerClick(boolean z) {
        this.f40880o = z;
    }

    public FeedListTextWithLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40880o = true;
    }

    public FeedListTextWithLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40880o = true;
    }
}
