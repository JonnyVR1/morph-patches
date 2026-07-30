package com.p000p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SuperlikeByCount;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.b3c0;
import l.d30;
import l.e30;
import l.nco;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xma;
import p009l.etl;
import p009l.oco;
import p009l.yfo;
import p009l.ygo;
import v.VDraweeView;
import v.VFrame_Shadow;
import v.VImage;
import v.VLinear;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetFakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f2993h;

    /* JADX INFO: renamed from: i */
    public VLinear f2994i;

    /* JADX INFO: renamed from: j */
    public VText f2995j;

    /* JADX INFO: renamed from: k */
    public VImage f2996k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f2997l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f2998m;

    /* JADX INFO: renamed from: n */
    public VText_NoTopPadding f2999n;

    /* JADX INFO: renamed from: o */
    public VText_NoTopPadding f3000o;

    /* JADX INFO: renamed from: p */
    public VImage f3001p;

    /* JADX INFO: renamed from: q */
    public View f3002q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f3003r;

    /* JADX INFO: renamed from: s */
    public VImage f3004s;

    /* JADX INFO: renamed from: t */
    public TextView f3005t;

    /* JADX INFO: renamed from: u */
    public View f3006u;

    /* JADX INFO: renamed from: v */
    public User f3007v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem$a */
    public class ViewTreeObserverOnPreDrawListenerC0242a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0242a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IntlMeetFakeLikersItem.this.f2999n.getViewTreeObserver().removeOnPreDrawListener(this);
            int width = IntlMeetFakeLikersItem.this.f2999n.getWidth();
            if (width > 0) {
                ViewGroup.LayoutParams layoutParams = IntlMeetFakeLikersItem.this.f3002q.getLayoutParams();
                layoutParams.width = width;
                IntlMeetFakeLikersItem.this.f3002q.setLayoutParams(layoutParams);
                xdl0.M(IntlMeetFakeLikersItem.this.f3002q, true);
            }
            return true;
        }
    }

    public IntlMeetFakeLikersItem(@NonNull Context context) {
        super(context);
    }

    public User getUser() {
        return this.f3007v;
    }

    /* JADX INFO: renamed from: i */
    public final void m3432i(View view) {
        nco.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m3433j(etl etlVar, Act act, View view) {
        oco ocoVar = (oco) etlVar;
        m3439p(ocoVar);
        m3440q(ocoVar);
        m3438o();
        if (CoreModule.c.p0.h3()) {
            m3441r(act);
        } else {
            m3442s(act);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3434k(User user) {
        ygo.C1331a c1331aM25371b = ygo.m25371b(user);
        this.f3005t.setText(c1331aM25371b.f23056a);
        int i = c1331aM25371b.f23057b;
        VImage vImage = this.f3004s;
        if (i == 0) {
            xdl0.M(vImage, false);
        } else {
            xdl0.M(vImage, true);
            this.f3004s.setImageResource(c1331aM25371b.f23057b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3435l(Act act, User user) {
        xdl0.M(this.f2998m, true);
        this.f2999n.setText(user.name);
        this.f3000o.setText(user.age.toString());
        xdl0.M(this.f3000o, true ^ CoreModule.c.E0.z3(user));
        qib0.b0.b.showUserVerificationLogo(act, user, this.f3001p);
        this.f2999n.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0242a());
    }

    /* JADX INFO: renamed from: m */
    public final void m3436m(User user) {
        xdl0.M(this.f2994i, false);
        if (vwb.J(CoreModule.c.v0.W)) {
            return;
        }
        for (SuperlikeByCount superlikeByCount : CoreModule.c.v0.W) {
            if (TextUtils.equals(superlikeByCount.id, ((DbObject) user).id)) {
                xdl0.M(this.f2994i, true);
                this.f2995j.setTypeface(Typeface.defaultFromStyle(1));
                this.f2995j.setText(String.format(App.e.getString(R.string.g0), Integer.valueOf(superlikeByCount.count)));
                this.f2996k.setImageResource(IntlCountryCodeController.v() ? b3c0.U : b3c0.T);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public void m3437n(final Act act, final etl etlVar) {
        if (etlVar instanceof oco) {
            this.f3007v = ((oco) etlVar).getUser();
            if (ura.e().d().Oq()) {
                m3435l(act, this.f3007v);
                m3434k(this.f3007v);
                m3436m(this.f3007v);
            } else {
                xdl0.M(this.f2998m, false);
                this.f3005t.setText(CoreModule.P().a().mi(this.f3007v.location.distance));
            }
            if (ura.e().d().ed()) {
                qib0.G.O(this.f2993h, this.f3007v.fp().profileBig().formatted(), 4, 10);
                xdl0.M(this.f3006u, true);
                xdl0.M0(this.f3003r, false);
            } else {
                xdl0.M(this.f3006u, false);
                xdl0.M0(this.f3003r, true);
                qib0.G.O(this.f2993h, this.f3007v.fp().profileBig().formatted(), 4, 20);
            }
            xdl0.E0(this, new View.OnClickListener() { // from class: l.mco
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16805a.m3433j(etlVar, act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3438o() {
        yfo.m25355g("see_feed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3432i(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3439p(oco ocoVar) {
        if (ura.e().d().Oq()) {
            yfo.m25359k(ygo.m25370a(((DbObject) ocoVar.getUser()).id) ? "superlike_tag" : null, ygo.m25372c(ocoVar.getUser()));
        } else {
            yfo.m25359k(null, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3440q(oco ocoVar) {
        if (!ura.e().d().Oq()) {
            yfo.m25364p(((DbObject) ocoVar.getUser()).id, false, null, null);
        } else {
            yfo.m25364p(((DbObject) ocoVar.getUser()).id, false, ygo.m25370a(((DbObject) ocoVar.getUser()).id) ? "superlike_tag" : null, ygo.m25372c(ocoVar.getUser()));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3441r(Act act) {
        if (xma.h4()) {
            CoreModule.P().a().Lf(act, "p_intl_meet_view,e_intl_meet_see_users,click", Privilege.see_who_likes_me, (e30) null, (e30) null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3442s(Act act) {
        if (xma.h4()) {
            CoreModule.P().a().showSeeDialog(act, (d30) null, "p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    public IntlMeetFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMeetFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
