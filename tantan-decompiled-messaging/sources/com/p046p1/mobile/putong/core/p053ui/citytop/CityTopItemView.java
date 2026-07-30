package com.p046p1.mobile.putong.core.p053ui.citytop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.mqi0;
import p149l.qib0;
import p149l.r65;
import p149l.t100;
import p149l.u65;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class CityTopItemView extends FrameLayout implements C8300b.b<Greeting> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f28700a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f28701b;

    /* JADX INFO: renamed from: c */
    public VImage f28702c;

    /* JADX INFO: renamed from: d */
    public VImage f28703d;

    /* JADX INFO: renamed from: e */
    public VImage f28704e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f28705f;

    /* JADX INFO: renamed from: g */
    public VText f28706g;

    /* JADX INFO: renamed from: h */
    public TextView f28707h;

    /* JADX INFO: renamed from: i */
    public VImage f28708i;

    /* JADX INFO: renamed from: j */
    public VImage f28709j;

    /* JADX INFO: renamed from: k */
    public VText f28710k;

    /* JADX INFO: renamed from: l */
    public VText f28711l;

    /* JADX INFO: renamed from: m */
    public Greeting f28712m;

    public CityTopItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m44578e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m44579c(View view) {
        u65.m191954a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m44580d() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m44581f(e30 e30Var, Greeting greeting, View view) {
        zvf0.m220396r("e_city_cover_received_like_user_card", m44580d().pageId());
        if (m44580d().lifecycle_() == C4319c.f15548i && NullChecker.m81303a(e30Var)) {
            e30Var.call(greeting);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m44582g(d30 d30Var, View view) {
        if (m44580d().lifecycle_() != C4319c.f15548i) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public void m44583h(User user, Message message, final Greeting greeting, final e30<Greeting> e30Var, final d30 d30Var) {
        zvf0.m220402x("e_city_cover_received_like_user_card", m44580d().pageId());
        this.f28712m = greeting;
        xdl0.m208342L(this, new View.OnClickListener() { // from class: l.s65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162615a.m44581f(e30Var, greeting, view);
            }
        });
        xdl0.m208342L(this.f28708i, new View.OnClickListener() { // from class: l.t65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167923a.m44582g(d30Var, view);
            }
        });
        qib0.f154691G.m102335N0(this.f28700a, user.m60124fp().profileMiddle().formatted(), false);
        user.showPicVerificationIcon(this.f28701b, this.f28702c);
        StringBuilder sb = new StringBuilder();
        if (!user.isHideAgeFromSVip()) {
            sb.append(user.age);
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip()) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(m44578e(user.location.distance));
        }
        this.f28706g.setText(sb);
        if (NullChecker.m81303a(message)) {
            this.f28707h.setText(message.value);
        }
        xdl0.m208344M(this.f28709j, false);
        xdl0.m208344M(this.f28705f, true);
        if (greeting.createdTime > r65.m178034l().f157895b.get().longValue()) {
            xdl0.m208344M(this.f28710k, true);
            xdl0.m208344M(this.f28711l, false);
        } else if (mqi0.m155944o() - Math.round(user.location.updatedTime) <= 180000) {
            xdl0.m208345M0(this.f28711l, true);
            xdl0.m208344M(this.f28710k, false);
        } else {
            xdl0.m208344M(this.f28710k, false);
            xdl0.m208345M0(this.f28711l, false);
        }
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "superliked")) {
            xdl0.m208344M(this.f28709j, true);
        }
        this.f28704e.setVisibility(4);
        this.f28703d.setVisibility(4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44579c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28705f.getLayoutParams();
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM208412y0) {
            layoutParams.height = iM208412y0;
            this.f28705f.setLayoutParams(layoutParams);
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
    @Override // com.p046p1.mobile.putong.core.p053ui.citytop.C8300b.b
    public Greeting getWrapperData() {
        return this.f28712m;
    }
}
