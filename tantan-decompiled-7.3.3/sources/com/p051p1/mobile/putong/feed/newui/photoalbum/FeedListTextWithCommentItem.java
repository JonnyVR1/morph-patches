package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.ThirdShareSource;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import java.util.HashMap;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_Expandable;
import p153l.bnl0;
import p153l.cai;
import p153l.qa00;
import p153l.tch;

/* JADX INFO: loaded from: classes13.dex */
public class FeedListTextWithCommentItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListTextWithCommentItem f41703a;

    /* JADX INFO: renamed from: b */
    public VLinear f41704b;

    /* JADX INFO: renamed from: c */
    public TextView f41705c;

    /* JADX INFO: renamed from: d */
    public VText f41706d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f41707e;

    /* JADX INFO: renamed from: f */
    public VText_Expandable f41708f;

    /* JADX INFO: renamed from: g */
    public VText f41709g;

    /* JADX INFO: renamed from: h */
    public Moment f41710h;

    /* JADX INFO: renamed from: i */
    public RawFeed f41711i;

    /* JADX INFO: renamed from: j */
    public String f41712j;

    /* JADX INFO: renamed from: k */
    public HashMap<String, Boolean> f41713k;

    public FeedListTextWithCommentItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m64287c(View view) {
        tch.m190448a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m64288d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m64289e() {
        bnl0.m105524M(this.f41709g, true);
        this.f41709g.setText("该动态已被用户删除");
    }

    /* JADX INFO: renamed from: f */
    public final void m64290f() {
        this.f41708f.setText(this.f41710h.value);
        this.f41708f.m224529n(this.f41713k, this.f41710h.f56859id);
        this.f41708f.setOnClickListener(new View.OnClickListener() { // from class: l.sch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167254a.m64292h(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m64291g() {
        ThirdShareSource thirdShareSource = this.f41710h.thirdShareSource;
        if (thirdShareSource == null || TextUtils.isEmpty(thirdShareSource.sourceId)) {
            bnl0.m105524M(this.f41709g, false);
            return;
        }
        bnl0.m105524M(this.f41709g, true);
        final Moment momentM145813w7 = FeedModule.f39703d.m145813w7(this.f41710h.thirdShareSource.sourceId);
        if (momentM145813w7 == null || TextUtils.isEmpty(momentM145813w7.owner)) {
            m64289e();
            return;
        }
        User userM145688e8 = FeedModule.f39703d.m145688e8(momentM145813w7.owner);
        if (userM145688e8 == null || TextUtils.isEmpty(momentM145813w7.f56859id) || TextUtils.isEmpty(userM145688e8.name)) {
            m64289e();
            return;
        }
        this.f41709g.setText("@" + userM145688e8.name + momentM145813w7.value);
        this.f41709g.setOnClickListener(new View.OnClickListener() { // from class: l.rch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162207a.m64293i(momentM145813w7, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m64292h(View view) {
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(this.f41712j).m66029m(this.f41710h.f56859id).m66030n(this.f41710h.owner).m66036t(true).m66031o(this.f41710h.momentValue).m66035s(this.f41711i).m66018b();
        if (intentM66018b == null) {
            return;
        }
        m64288d().startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64293i(Moment moment, View view) {
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66019c(false).m66022f(this.f41712j).m66029m(moment.f56859id).m66026j(false).m66030n(moment.owner).m66023g(-1).m66036t(true).m66024h(false).m66031o(moment.momentValue).m66018b();
        if (intentM66018b == null) {
            return;
        }
        m64288d().startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: j */
    public final void m64294j(int i) {
        bnl0.m105550d0(this.f41704b, 0);
        bnl0.m105524M(this.f41704b, true);
        boolean zEquals = this.f41710h.feedTime.equals(FeedModule.f39700a.getString(R$string.f39924i2));
        VText vText = this.f41706d;
        if (zEquals) {
            bnl0.m105524M(vText, false);
            this.f41705c.setText(this.f41710h.feedTime);
            TextView textView = this.f41705c;
            textView.setTextSize(cai.m108498f(textView, qa00.m175859d(55.0f), this.f41710h.feedTime, 17.0f));
        } else {
            bnl0.m105524M(vText, true);
            String[] strArrSplit = this.f41710h.feedTime.split("/");
            this.f41705c.setText(strArrSplit[0]);
            this.f41706d.setText(strArrSplit[1]);
        }
        TextView textView2 = this.f41705c;
        if (i == 0) {
            bnl0.m105540X(textView2, qa00.m175859d(17.0f));
        } else {
            bnl0.m105540X(textView2, 0);
        }
        bnl0.m105540X(this.f41704b, qa00.m175859d(-2.0f));
        this.f41706d.setGravity(1);
        this.f41705c.setGravity(1);
        this.f41706d.setIncludeFontPadding(false);
        this.f41705c.setIncludeFontPadding(false);
    }

    /* JADX INFO: renamed from: k */
    public void m64295k(Moment moment, String str, int i, HashMap<String, Boolean> map, String str2) {
        m64296l(moment, str, i, map, str2, null);
    }

    /* JADX INFO: renamed from: l */
    public void m64296l(Moment moment, String str, int i, HashMap<String, Boolean> map, String str2, RawFeed rawFeed) {
        this.f41712j = str;
        this.f41710h = moment;
        this.f41711i = rawFeed;
        this.f41713k = map;
        if (moment == null) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        m64290f();
        m64291g();
        LinearLayout linearLayout = this.f41707e;
        if (i == 0) {
            bnl0.m105540X(linearLayout, qa00.m175859d(m64288d() instanceof MomentDetailAct ? 0.0f : 16.0f));
        } else {
            bnl0.m105540X(linearLayout, 0);
        }
        if (TextUtils.isEmpty(moment.feedTime) || (m64288d() instanceof MomentDetailAct)) {
            bnl0.m105524M(this.f41704b, false);
        } else {
            m64294j(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64287c(this);
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
