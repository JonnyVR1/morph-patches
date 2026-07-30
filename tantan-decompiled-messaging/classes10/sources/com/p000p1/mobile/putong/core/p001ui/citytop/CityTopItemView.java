package com.p000p1.mobile.putong.core.p001ui.citytop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.LikedUserFilter;
import com.p000p1.mobile.putong.core.data.Message;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.mqi0;
import l.qib0;
import l.r65;
import l.t100;
import l.xdl0;
import l.zvf0;
import p003l.u65;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityTopItemView extends FrameLayout implements C3075b.b<Greeting> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1094a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f1095b;

    /* JADX INFO: renamed from: c */
    public VImage f1096c;

    /* JADX INFO: renamed from: d */
    public VImage f1097d;

    /* JADX INFO: renamed from: e */
    public VImage f1098e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f1099f;

    /* JADX INFO: renamed from: g */
    public VText f1100g;

    /* JADX INFO: renamed from: h */
    public TextView f1101h;

    /* JADX INFO: renamed from: i */
    public VImage f1102i;

    /* JADX INFO: renamed from: j */
    public VImage f1103j;

    /* JADX INFO: renamed from: k */
    public VText f1104k;

    /* JADX INFO: renamed from: l */
    public VText f1105l;

    /* JADX INFO: renamed from: m */
    public Greeting f1106m;

    public CityTopItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m1880e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m1881c(View view) {
        u65.m9651a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m1882d() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1883f(e30 e30Var, Greeting greeting, View view) {
        zvf0.r("e_city_cover_received_like_user_card", m1882d().pageId());
        if (m1882d().lifecycle_() == c.i && NullChecker.a(e30Var)) {
            e30Var.call(greeting);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1884g(d30 d30Var, View view) {
        if (m1882d().lifecycle_() != c.i) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public void m1885h(User user, Message message, final Greeting greeting, final e30<Greeting> e30Var, final d30 d30Var) {
        zvf0.x("e_city_cover_received_like_user_card", m1882d().pageId());
        this.f1106m = greeting;
        xdl0.L(this, new View.OnClickListener() { // from class: l.s65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7286a.m1883f(e30Var, greeting, view);
            }
        });
        xdl0.L(this.f1102i, new View.OnClickListener() { // from class: l.t65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7514a.m1884g(d30Var, view);
            }
        });
        qib0.G.N0(this.f1094a, user.fp().profileMiddle().formatted(), false);
        user.showPicVerificationIcon(this.f1095b, this.f1096c);
        StringBuilder sb = new StringBuilder();
        if (!user.isHideAgeFromSVip()) {
            sb.append(user.age);
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip()) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(m1880e(user.location.distance));
        }
        this.f1100g.setText(sb);
        if (NullChecker.a(message)) {
            this.f1101h.setText(message.value);
        }
        xdl0.M(this.f1103j, false);
        xdl0.M(this.f1099f, true);
        if (greeting.createdTime > ((Long) r65.l().b.get()).longValue()) {
            xdl0.M(this.f1104k, true);
            xdl0.M(this.f1105l, false);
        } else if (mqi0.o() - Math.round(user.location.updatedTime) <= 180000) {
            xdl0.M0(this.f1105l, true);
            xdl0.M(this.f1104k, false);
        } else {
            xdl0.M(this.f1104k, false);
            xdl0.M0(this.f1105l, false);
        }
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, LikedUserFilter.superliked)) {
            xdl0.M(this.f1103j, true);
        }
        this.f1098e.setVisibility(4);
        this.f1097d.setVisibility(4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1881c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1099f.getLayoutParams();
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iY0) {
            layoutParams.height = iY0;
            this.f1099f.setLayoutParams(layoutParams);
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
    @Override // com.p000p1.mobile.putong.core.p001ui.citytop.C3075b.b
    public Greeting getWrapperData() {
        return this.f1106m;
    }
}
