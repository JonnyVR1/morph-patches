package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.data.ThirdShareSource;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.t100;
import l.xdl0;
import p007l.ebh;
import p007l.n8i;
import v.VLinear;
import v.VText;
import v.VText_Expandable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedListTextWithCommentItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListTextWithCommentItem f2316a;

    /* JADX INFO: renamed from: b */
    public VLinear f2317b;

    /* JADX INFO: renamed from: c */
    public TextView f2318c;

    /* JADX INFO: renamed from: d */
    public VText f2319d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2320e;

    /* JADX INFO: renamed from: f */
    public VText_Expandable f2321f;

    /* JADX INFO: renamed from: g */
    public VText f2322g;

    /* JADX INFO: renamed from: h */
    public Moment f2323h;

    /* JADX INFO: renamed from: i */
    public RawFeed f2324i;

    /* JADX INFO: renamed from: j */
    public String f2325j;

    /* JADX INFO: renamed from: k */
    public HashMap<String, Boolean> f2326k;

    public FeedListTextWithCommentItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m4120c(View view) {
        ebh.m9691a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m4121d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m4122e() {
        xdl0.M(this.f2322g, true);
        this.f2322g.setText("该动态已被用户删除");
    }

    /* JADX INFO: renamed from: f */
    public final void m4123f() {
        this.f2321f.setText(this.f2323h.value);
        this.f2321f.n(this.f2326k, ((DbObject) this.f2323h).id);
        this.f2321f.setOnClickListener(new View.OnClickListener() { // from class: l.dbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6888a.m4125h(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m4124g() {
        ThirdShareSource thirdShareSource = this.f2323h.thirdShareSource;
        if (thirdShareSource == null || TextUtils.isEmpty(thirdShareSource.sourceId)) {
            xdl0.M(this.f2322g, false);
            return;
        }
        xdl0.M(this.f2322g, true);
        final Moment momentM16753w7 = FeedModule.f316d.m16753w7(this.f2323h.thirdShareSource.sourceId);
        if (momentM16753w7 == null || TextUtils.isEmpty(momentM16753w7.owner)) {
            m4122e();
            return;
        }
        User userM16628e8 = FeedModule.f316d.m16628e8(momentM16753w7.owner);
        if (userM16628e8 == null || TextUtils.isEmpty(((DbObject) momentM16753w7).id) || TextUtils.isEmpty(userM16628e8.name)) {
            m4122e();
            return;
        }
        this.f2322g.setText("@" + userM16628e8.name + momentM16753w7.value);
        this.f2322g.setOnClickListener(new View.OnClickListener() { // from class: l.cbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6600a.m4126i(momentM16753w7, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4125h(View view) {
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(this.f2325j).m5943m(((DbObject) this.f2323h).id).m5944n(this.f2323h.owner).m5950t(true).m5945o(this.f2323h.momentValue).m5949s(this.f2324i).m5932b();
        if (intentM5932b == null) {
            return;
        }
        m4121d().startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4126i(Moment moment, View view) {
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5933c(false).m5936f(this.f2325j).m5943m(((DbObject) moment).id).m5940j(false).m5944n(moment.owner).m5937g(-1).m5950t(true).m5938h(false).m5945o(moment.momentValue).m5932b();
        if (intentM5932b == null) {
            return;
        }
        m4121d().startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: j */
    public final void m4127j(int i) {
        xdl0.d0(this.f2317b, 0);
        xdl0.M(this.f2317b, true);
        boolean zEquals = this.f2323h.feedTime.equals(FeedModule.f313a.getString(R$string.f537i2));
        VText vText = this.f2319d;
        if (zEquals) {
            xdl0.M(vText, false);
            this.f2318c.setText(this.f2323h.feedTime);
            TextView textView = this.f2318c;
            textView.setTextSize(n8i.m12112f(textView, t100.d(55.0f), this.f2323h.feedTime, 17.0f));
        } else {
            xdl0.M(vText, true);
            String[] strArrSplit = this.f2323h.feedTime.split("/");
            this.f2318c.setText(strArrSplit[0]);
            this.f2319d.setText(strArrSplit[1]);
        }
        TextView textView2 = this.f2318c;
        if (i == 0) {
            xdl0.X(textView2, t100.d(17.0f));
        } else {
            xdl0.X(textView2, 0);
        }
        xdl0.X(this.f2317b, t100.d(-2.0f));
        this.f2319d.setGravity(1);
        this.f2318c.setGravity(1);
        this.f2319d.setIncludeFontPadding(false);
        this.f2318c.setIncludeFontPadding(false);
    }

    /* JADX INFO: renamed from: k */
    public void m4128k(Moment moment, String str, int i, HashMap<String, Boolean> map, String str2) {
        m4129l(moment, str, i, map, str2, null);
    }

    /* JADX INFO: renamed from: l */
    public void m4129l(Moment moment, String str, int i, HashMap<String, Boolean> map, String str2, RawFeed rawFeed) {
        this.f2325j = str;
        this.f2323h = moment;
        this.f2324i = rawFeed;
        this.f2326k = map;
        if (moment == null) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        m4123f();
        m4124g();
        LinearLayout linearLayout = this.f2320e;
        if (i == 0) {
            xdl0.X(linearLayout, t100.d(m4121d() instanceof MomentDetailAct ? 0.0f : 16.0f));
        } else {
            xdl0.X(linearLayout, 0);
        }
        if (TextUtils.isEmpty(moment.feedTime) || (m4121d() instanceof MomentDetailAct)) {
            xdl0.M(this.f2317b, false);
        } else {
            m4127j(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4120c(this);
    }

    public FeedListTextWithCommentItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedListTextWithCommentItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedListTextWithCommentItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
