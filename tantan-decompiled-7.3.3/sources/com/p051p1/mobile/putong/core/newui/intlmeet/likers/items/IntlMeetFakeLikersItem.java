package com.p051p1.mobile.putong.core.newui.intlmeet.likers.items;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SuperlikeByCount;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.VDraweeView;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.gbc0;
import p153l.gta;
import p153l.joa;
import p153l.jyb;
import p153l.neo;
import p153l.oeo;
import p153l.svl;
import p153l.uqb0;
import p153l.yho;
import p153l.yio;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f24957h;

    /* JADX INFO: renamed from: i */
    public VLinear f24958i;

    /* JADX INFO: renamed from: j */
    public VText f24959j;

    /* JADX INFO: renamed from: k */
    public VImage f24960k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f24961l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f24962m;

    /* JADX INFO: renamed from: n */
    public VText_NoTopPadding f24963n;

    /* JADX INFO: renamed from: o */
    public VText_NoTopPadding f24964o;

    /* JADX INFO: renamed from: p */
    public VImage f24965p;

    /* JADX INFO: renamed from: q */
    public View f24966q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f24967r;

    /* JADX INFO: renamed from: s */
    public VImage f24968s;

    /* JADX INFO: renamed from: t */
    public TextView f24969t;

    /* JADX INFO: renamed from: u */
    public View f24970u;

    /* JADX INFO: renamed from: v */
    public User f24971v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem$a */
    public class ViewTreeObserverOnPreDrawListenerC8229a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC8229a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IntlMeetFakeLikersItem.this.f24963n.getViewTreeObserver().removeOnPreDrawListener(this);
            int width = IntlMeetFakeLikersItem.this.f24963n.getWidth();
            if (width > 0) {
                ViewGroup.LayoutParams layoutParams = IntlMeetFakeLikersItem.this.f24966q.getLayoutParams();
                layoutParams.width = width;
                IntlMeetFakeLikersItem.this.f24966q.setLayoutParams(layoutParams);
                bnl0.m105524M(IntlMeetFakeLikersItem.this.f24966q, true);
            }
            return true;
        }
    }

    public IntlMeetFakeLikersItem(@NonNull Context context) {
        super(context);
    }

    public User getUser() {
        return this.f24971v;
    }

    /* JADX INFO: renamed from: i */
    public final void m40388i(View view) {
        neo.m162907a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m40389j(svl svlVar, Act act, View view) {
        oeo oeoVar = (oeo) svlVar;
        m40395p(oeoVar);
        m40396q(oeoVar);
        m40394o();
        if (CoreModule.f18264c.f20414p0.m219063h3()) {
            m40397r(act);
        } else {
            m40398s(act);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m40390k(User user) {
        yio.C21610a c21610aM216342b = yio.m216342b(user);
        this.f24969t.setText(c21610aM216342b.f200227a);
        int i = c21610aM216342b.f200228b;
        VImage vImage = this.f24968s;
        if (i == 0) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
            this.f24968s.setImageResource(c21610aM216342b.f200228b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m40391l(Act act, User user) {
        bnl0.m105524M(this.f24962m, true);
        this.f24963n.setText(user.name);
        this.f24964o.setText(user.age.toString());
        bnl0.m105524M(this.f24964o, true ^ CoreModule.f18264c.f20303E0.m141091z3(user));
        uqb0.f180396b0.f170325b.showUserVerificationLogo(act, user, this.f24965p);
        this.f24963n.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8229a());
    }

    /* JADX INFO: renamed from: m */
    public final void m40392m(User user) {
        bnl0.m105524M(this.f24958i, false);
        if (jyb.m147479J(CoreModule.f18264c.f20432v0.f130575X)) {
            return;
        }
        for (SuperlikeByCount superlikeByCount : CoreModule.f18264c.f20432v0.f130575X) {
            if (TextUtils.equals(superlikeByCount.f21252id, user.f56859id)) {
                bnl0.m105524M(this.f24958i, true);
                this.f24959j.setTypeface(Typeface.defaultFromStyle(1));
                this.f24959j.setText(String.format(App.f16088e.getString(R$string.f21388g0), Integer.valueOf(superlikeByCount.count)));
                this.f24960k.setImageResource(IntlCountryCodeController.m29125v() ? gbc0.f103211U : gbc0.f103204T);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m40393n(final Act act, final svl svlVar) {
        if (svlVar instanceof oeo) {
            this.f24971v = ((oeo) svlVar).getUser();
            if (gta.m132210e().m132214d().mo34738Oq()) {
                m40391l(act, this.f24971v);
                m40390k(this.f24971v);
                m40392m(this.f24971v);
            } else {
                bnl0.m105524M(this.f24962m, false);
                this.f24969t.setText(CoreModule.m30933P().m143405a().mo34551mi(this.f24971v.location.distance));
            }
            if (gta.m132210e().m132214d().mo34821ed()) {
                uqb0.f180374G.m127120O(this.f24957h, this.f24971v.m61308fp().profileBig().formatted(), 4, 10);
                bnl0.m105524M(this.f24970u, true);
                bnl0.m105525M0(this.f24967r, false);
            } else {
                bnl0.m105524M(this.f24970u, false);
                bnl0.m105525M0(this.f24967r, true);
                uqb0.f180374G.m127120O(this.f24957h, this.f24971v.m61308fp().profileBig().formatted(), 4, 20);
            }
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.meo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136548a.m40389j(svlVar, act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m40394o() {
        yho.m215980g("see_feed");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40388i(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m40395p(oeo oeoVar) {
        if (gta.m132210e().m132214d().mo34738Oq()) {
            yho.m215984k(yio.m216341a(oeoVar.getUser().f56859id) ? "superlike_tag" : null, yio.m216343c(oeoVar.getUser()));
        } else {
            yho.m215984k(null, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m40396q(oeo oeoVar) {
        if (!gta.m132210e().m132214d().mo34738Oq()) {
            yho.m215989p(oeoVar.getUser().f56859id, false, null, null);
        } else {
            yho.m215989p(oeoVar.getUser().f56859id, false, yio.m216341a(oeoVar.getUser().f56859id) ? "superlike_tag" : null, yio.m216343c(oeoVar.getUser()));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m40397r(Act act) {
        if (joa.m146392i4()) {
            CoreModule.m30933P().m143405a().mo34365Lf(act, "p_intl_meet_view,e_intl_meet_see_users,click", Privilege.see_who_likes_me, null, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m40398s(Act act) {
        if (joa.m146392i4()) {
            CoreModule.m30933P().m143405a().showSeeDialog(act, null, "p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    public IntlMeetFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMeetFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
