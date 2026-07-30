package com.p051p1.mobile.putong.core.p058ui.citytop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.pzi0;
import p153l.qa00;
import p153l.s75;
import p153l.uqb0;
import p153l.v75;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class CityTopItemView extends FrameLayout implements C8463b.b<Greeting> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29548a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f29549b;

    /* JADX INFO: renamed from: c */
    public VImage f29550c;

    /* JADX INFO: renamed from: d */
    public VImage f29551d;

    /* JADX INFO: renamed from: e */
    public VImage f29552e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f29553f;

    /* JADX INFO: renamed from: g */
    public VText f29554g;

    /* JADX INFO: renamed from: h */
    public TextView f29555h;

    /* JADX INFO: renamed from: i */
    public VImage f29556i;

    /* JADX INFO: renamed from: j */
    public VImage f29557j;

    /* JADX INFO: renamed from: k */
    public VText f29558k;

    /* JADX INFO: renamed from: l */
    public VText f29559l;

    /* JADX INFO: renamed from: m */
    public Greeting f29560m;

    public CityTopItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m45761e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m45762c(View view) {
        v75.m200191a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m45763d() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m45764f(y20 y20Var, Greeting greeting, View view) {
        i4g0.m138520r("e_city_cover_received_like_user_card", m45763d().pageId());
        if (m45763d().lifecycle_() == C4470c.f16267i && NullChecker.m82486a(y20Var)) {
            y20Var.call(greeting);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m45765g(x20 x20Var, View view) {
        if (m45763d().lifecycle_() != C4470c.f16267i) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: h */
    public void m45766h(User user, Message message, final Greeting greeting, final y20<Greeting> y20Var, final x20 x20Var) {
        i4g0.m138526x("e_city_cover_received_like_user_card", m45763d().pageId());
        this.f29560m = greeting;
        bnl0.m105522L(this, new View.OnClickListener() { // from class: l.t75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172397a.m45764f(y20Var, greeting, view);
            }
        });
        bnl0.m105522L(this.f29556i, new View.OnClickListener() { // from class: l.u75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177882a.m45765g(x20Var, view);
            }
        });
        uqb0.f180374G.m127119N0(this.f29548a, user.m61308fp().profileMiddle().formatted(), false);
        user.showPicVerificationIcon(this.f29549b, this.f29550c);
        StringBuilder sb = new StringBuilder();
        if (!user.isHideAgeFromSVip()) {
            sb.append(user.age);
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip()) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(m45761e(user.location.distance));
        }
        this.f29554g.setText(sb);
        if (NullChecker.m82486a(message)) {
            this.f29555h.setText(message.value);
        }
        bnl0.m105524M(this.f29557j, false);
        bnl0.m105524M(this.f29553f, true);
        if (greeting.createdTime > s75.m184964l().f166646b.get().longValue()) {
            bnl0.m105524M(this.f29558k, true);
            bnl0.m105524M(this.f29559l, false);
        } else if (pzi0.m174454o() - Math.round(user.location.updatedTime) <= 180000) {
            bnl0.m105525M0(this.f29559l, true);
            bnl0.m105524M(this.f29558k, false);
        } else {
            bnl0.m105524M(this.f29558k, false);
            bnl0.m105525M0(this.f29559l, false);
        }
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "superliked")) {
            bnl0.m105524M(this.f29557j, true);
        }
        this.f29552e.setVisibility(4);
        this.f29551d.setVisibility(4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45762c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29553f.getLayoutParams();
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM105592y0) {
            layoutParams.height = iM105592y0;
            this.f29553f.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public CityTopItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityTopItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p051p1.mobile.putong.core.p058ui.citytop.C8463b.b
    public Greeting getWrapperData() {
        return this.f29560m;
    }
}
