package com.p046p1.mobile.putong.core.newui.intlmeet.likers.items;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SuperlikeByCount;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.VDraweeView;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p149l.b3c0;
import p149l.etl;
import p149l.nco;
import p149l.oco;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.yfo;
import p149l.ygo;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f24215h;

    /* JADX INFO: renamed from: i */
    public VLinear f24216i;

    /* JADX INFO: renamed from: j */
    public VText f24217j;

    /* JADX INFO: renamed from: k */
    public VImage f24218k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f24219l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f24220m;

    /* JADX INFO: renamed from: n */
    public VText_NoTopPadding f24221n;

    /* JADX INFO: renamed from: o */
    public VText_NoTopPadding f24222o;

    /* JADX INFO: renamed from: p */
    public VImage f24223p;

    /* JADX INFO: renamed from: q */
    public View f24224q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f24225r;

    /* JADX INFO: renamed from: s */
    public VImage f24226s;

    /* JADX INFO: renamed from: t */
    public TextView f24227t;

    /* JADX INFO: renamed from: u */
    public View f24228u;

    /* JADX INFO: renamed from: v */
    public User f24229v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem$a */
    public class ViewTreeObserverOnPreDrawListenerC8078a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC8078a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IntlMeetFakeLikersItem.this.f24221n.getViewTreeObserver().removeOnPreDrawListener(this);
            int width = IntlMeetFakeLikersItem.this.f24221n.getWidth();
            if (width > 0) {
                ViewGroup.LayoutParams layoutParams = IntlMeetFakeLikersItem.this.f24224q.getLayoutParams();
                layoutParams.width = width;
                IntlMeetFakeLikersItem.this.f24224q.setLayoutParams(layoutParams);
                xdl0.m208344M(IntlMeetFakeLikersItem.this.f24224q, true);
            }
            return true;
        }
    }

    public IntlMeetFakeLikersItem(@NonNull Context context) {
        super(context);
    }

    public User getUser() {
        return this.f24229v;
    }

    /* JADX INFO: renamed from: i */
    public final void m39385i(View view) {
        nco.m158960a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m39386j(etl etlVar, Act act, View view) {
        oco ocoVar = (oco) etlVar;
        m39392p(ocoVar);
        m39393q(ocoVar);
        m39391o();
        if (CoreModule.f17545c.f19672p0.m173360h3()) {
            m39394r(act);
        } else {
            m39395s(act);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m39387k(User user) {
        ygo.C21397a c21397aM214739b = ygo.m214739b(user);
        this.f24227t.setText(c21397aM214739b.f198213a);
        int i = c21397aM214739b.f198214b;
        VImage vImage = this.f24226s;
        if (i == 0) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
            this.f24226s.setImageResource(c21397aM214739b.f198214b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m39388l(Act act, User user) {
        xdl0.m208344M(this.f24220m, true);
        this.f24221n.setText(user.name);
        this.f24222o.setText(user.age.toString());
        xdl0.m208344M(this.f24222o, true ^ CoreModule.f17545c.f19561E0.m203803z3(user));
        qib0.f154713b0.f139231b.showUserVerificationLogo(act, user, this.f24223p);
        this.f24221n.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8078a());
    }

    /* JADX INFO: renamed from: m */
    public final void m39389m(User user) {
        xdl0.m208344M(this.f24216i, false);
        if (vwb.m200296J(CoreModule.f17545c.f19690v0.f79723W)) {
            return;
        }
        for (SuperlikeByCount superlikeByCount : CoreModule.f17545c.f19690v0.f79723W) {
            if (TextUtils.equals(superlikeByCount.f20510id, user.f56011id)) {
                xdl0.m208344M(this.f24216i, true);
                this.f24217j.setTypeface(Typeface.defaultFromStyle(1));
                this.f24217j.setText(String.format(App.f15369e.getString(R$string.f20646g0), Integer.valueOf(superlikeByCount.count)));
                this.f24218k.setImageResource(IntlCountryCodeController.m28126v() ? b3c0.f72960U : b3c0.f72953T);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m39390n(final Act act, final etl etlVar) {
        if (etlVar instanceof oco) {
            this.f24229v = ((oco) etlVar).getUser();
            if (ura.m195053e().m195057d().mo33735Oq()) {
                m39388l(act, this.f24229v);
                m39387k(this.f24229v);
                m39389m(this.f24229v);
            } else {
                xdl0.m208344M(this.f24220m, false);
                this.f24227t.setText(CoreModule.m29935P().m94651a().mo33548mi(this.f24229v.location.distance));
            }
            if (ura.m195053e().m195057d().mo33818ed()) {
                qib0.f154691G.m102336O(this.f24215h, this.f24229v.m60124fp().profileBig().formatted(), 4, 10);
                xdl0.m208344M(this.f24228u, true);
                xdl0.m208345M0(this.f24225r, false);
            } else {
                xdl0.m208344M(this.f24228u, false);
                xdl0.m208345M0(this.f24225r, true);
                qib0.f154691G.m102336O(this.f24215h, this.f24229v.m60124fp().profileBig().formatted(), 4, 20);
            }
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.mco
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133171a.m39386j(etlVar, act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m39391o() {
        yfo.m214568g("see_feed");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39385i(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39392p(oco ocoVar) {
        if (ura.m195053e().m195057d().mo33735Oq()) {
            yfo.m214572k(ygo.m214738a(ocoVar.getUser().f56011id) ? "superlike_tag" : null, ygo.m214740c(ocoVar.getUser()));
        } else {
            yfo.m214572k(null, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m39393q(oco ocoVar) {
        if (!ura.m195053e().m195057d().mo33735Oq()) {
            yfo.m214577p(ocoVar.getUser().f56011id, false, null, null);
        } else {
            yfo.m214577p(ocoVar.getUser().f56011id, false, ygo.m214738a(ocoVar.getUser().f56011id) ? "superlike_tag" : null, ygo.m214740c(ocoVar.getUser()));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m39394r(Act act) {
        if (xma.m210077h4()) {
            CoreModule.m29935P().m94651a().mo33362Lf(act, "p_intl_meet_view,e_intl_meet_see_users,click", Privilege.see_who_likes_me, null, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m39395s(Act act) {
        if (xma.m210077h4()) {
            CoreModule.m29935P().m94651a().showSeeDialog(act, null, "p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    public IntlMeetFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMeetFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
