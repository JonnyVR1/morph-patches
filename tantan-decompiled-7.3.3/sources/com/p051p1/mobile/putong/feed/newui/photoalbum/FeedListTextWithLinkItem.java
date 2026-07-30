package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_Expandable;
import p153l.bnl0;
import p153l.cai;
import p153l.er60;
import p153l.jyb;
import p153l.ksg;
import p153l.orb0;
import p153l.pf60;
import p153l.qa00;
import p153l.ryh;
import p153l.tfj0;
import p153l.wch;

/* JADX INFO: loaded from: classes13.dex */
public class FeedListTextWithLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListTextWithLinkItem f41714a;

    /* JADX INFO: renamed from: b */
    public VLinear f41715b;

    /* JADX INFO: renamed from: c */
    public TextView f41716c;

    /* JADX INFO: renamed from: d */
    public VText f41717d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f41718e;

    /* JADX INFO: renamed from: f */
    public VText_Expandable f41719f;

    /* JADX INFO: renamed from: g */
    public VText f41720g;

    /* JADX INFO: renamed from: h */
    public int f41721h;

    /* JADX INFO: renamed from: i */
    public Moment f41722i;

    /* JADX INFO: renamed from: j */
    public RawFeed f41723j;

    /* JADX INFO: renamed from: k */
    public String f41724k;

    /* JADX INFO: renamed from: l */
    public String f41725l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Boolean> f41726m;

    /* JADX INFO: renamed from: n */
    public int f41727n;

    /* JADX INFO: renamed from: o */
    public boolean f41728o;

    /* JADX INFO: renamed from: p */
    public int f41729p;

    public FeedListTextWithLinkItem(Context context) {
        super(context);
        this.f41728o = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m64299c(View view) {
        wch.m205799a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m64300d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m64301e() {
        this.f41719f.setText(this.f41722i.value);
        this.f41719f.m224529n(this.f41726m, this.f41722i.f56859id);
        bnl0.m105524M(this.f41720g, (TextUtils.isEmpty(this.f41722i.landingPage) && TextUtils.isEmpty(this.f41722i.deeplink)) ? false : true);
        this.f41714a.setOnClickListener(new View.OnClickListener() { // from class: l.uch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178434a.m64304h(view);
            }
        });
        this.f41720g.setOnClickListener(new View.OnClickListener() { // from class: l.vch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183463a.m64305i(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m64302f() {
        String str = this.f41725l;
        pf60 pf60VarM172085a = pf60.m172085a("qa_optional", this.f41722i.shareMyVote ? "1" : "0");
        List<TopicMomentIdBox> list = this.f41722i.topics;
        tfj0.m190940c("e_moment", str, pf60VarM172085a, pf60.m172085a("topic_id", (list == null || list.size() == 0) ? "" : this.f41722i.topics.get(0).f39672id), pf60.m172085a("moment_id", this.f41722i.f56859id), pf60.m172085a("owner_id", this.f41722i.owner), pf60.m172085a("order", Integer.valueOf(this.f41727n)), pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f41722i)), pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(this.f41722i))), pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(this.f41722i))), pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(this.f41722i.owner)))));
    }

    /* JADX INFO: renamed from: g */
    public final void m64303g() {
        if (TextUtils.isEmpty(this.f41722i.simpleActivity.name)) {
            return;
        }
        tfj0.m190940c("e_activity_moment", this.f41725l, jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f41722i.simpleActivity.f40083id), jyb.m147494Y("activity_name", this.f41722i.simpleActivity.name), jyb.m147494Y("moment_show_type", "card"), jyb.m147494Y("moments_user_id", this.f41722i.owner));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m64304h(View view) {
        if (this.f41728o) {
            m64302f();
            Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(this.f41724k).m66029m(this.f41722i.f56859id).m66030n(this.f41722i.owner).m66036t(true).m66031o(this.f41722i.momentValue).m66035s(this.f41723j).m66018b();
            if (intentM66018b == null) {
                return;
            }
            m64300d().startActivity(intentM66018b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64305i(View view) {
        m64303g();
        m64302f();
        if (!TextUtils.isEmpty(this.f41722i.deeplink)) {
            ryh.m183607b(m64300d(), Uri.parse(this.f41722i.deeplink));
        } else if (TextUtils.isEmpty(this.f41722i.landingPage) || !this.f41722i.landingPage.startsWith("tantan")) {
            m64300d().startActivity(orb0.m168893j(m64300d(), m64300d().getResources().getString(R$string.f39940k4), this.f41722i.landingPage));
        } else {
            ryh.m183607b(m64300d(), Uri.parse(this.f41722i.landingPage));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m64306j(int i, Moment moment, String str, int i2, HashMap<String, Boolean> map, String str2) {
        m64307k(i, moment, str, i2, map, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public void m64307k(int i, Moment moment, String str, int i2, HashMap<String, Boolean> map, String str2, RawFeed rawFeed) {
        this.f41724k = str;
        this.f41721h = i;
        this.f41722i = moment;
        this.f41723j = rawFeed;
        this.f41727n = i2;
        this.f41725l = str2;
        this.f41726m = map;
        m64301e();
        int iM175859d = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            bnl0.m105524M(this.f41715b, false);
            bnl0.m105540X(this.f41718e, this.f41729p);
        } else {
            bnl0.m105524M(this.f41715b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f39700a.getString(R$string.f39924i2));
            VText vText = this.f41717d;
            if (zEquals) {
                bnl0.m105524M(vText, false);
                this.f41716c.setText(moment.feedTime);
                TextView textView = this.f41716c;
                textView.setTextSize(cai.m108498f(textView, qa00.m175859d(55.0f), moment.feedTime, 17.0f));
            } else {
                bnl0.m105524M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f41716c.setTextSize(20.0f);
                this.f41716c.setText(strArrSplit[0]);
                this.f41717d.setText(strArrSplit[1]);
            }
            if (i2 == 0) {
                bnl0.m105540X(this.f41716c, qa00.m175859d(24.0f));
                bnl0.m105540X(this.f41717d, qa00.m175859d(24.0f));
                bnl0.m105540X(this.f41718e, qa00.m175859d(28.0f));
            } else {
                bnl0.m105540X(this.f41718e, this.f41729p);
                bnl0.m105540X(this.f41716c, -qa00.m175859d(4.0f));
                bnl0.m105540X(this.f41717d, -qa00.m175859d(4.0f));
            }
        }
        if (i == 2) {
            iM175859d = qa00.m175859d(16.0f);
        } else if (m64300d() instanceof MomentDetailAct) {
            iM175859d = qa00.m175859d(8.0f);
        }
        bnl0.m105554f0(this, iM175859d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64299c(this);
        this.f41729p = ((FrameLayout.LayoutParams) this.f41718e.getLayoutParams()).topMargin;
    }

    public void setNeedInnerClick(boolean z) {
        this.f41728o = z;
    }

    public FeedListTextWithLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41728o = true;
    }

    public FeedListTextWithLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41728o = true;
    }
}
