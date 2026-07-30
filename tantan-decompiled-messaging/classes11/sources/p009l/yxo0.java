package p009l;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.tantanapp.common.data.DbObject;
import l.h1c0;
import l.i3c0;
import l.kvc0;
import l.mqv;
import l.ngm;
import l.nnn0;
import l.p1k0;
import l.qib0;
import l.rfd0;
import l.s7m;
import l.t100;
import l.w1t;
import l.w8u;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yxo0<D extends nnn0> implements s7m<ayo0<D>> {

    /* JADX INFO: renamed from: a */
    public final w1t f23275a = new w1t(true);

    /* JADX INFO: renamed from: b */
    public ayo0<D> f23276b;

    /* JADX INFO: renamed from: c */
    public VoiceUserCardMedalAndNameView f23277c;

    /* JADX INFO: renamed from: l.yxo0$a */
    public class C1339a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f23278a;

        public C1339a(VDraweeView vDraweeView) {
            this.f23278a = vDraweeView;
        }

        /* JADX INFO: renamed from: h */
        public void m25549h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23278a.getLayoutParams();
            int i = t100.k;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            this.f23278a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.yxo0$b */
    public class C1340b extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f23280a;

        public C1340b(VDraweeView vDraweeView) {
            this.f23280a = vDraweeView;
        }

        /* JADX INFO: renamed from: h */
        public void m25550h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23280a.getLayoutParams();
            int i = t100.k;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            this.f23280a.setLayoutParams(layoutParams);
        }
    }

    public yxo0(VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView) {
        this.f23277c = voiceUserCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: l */
    private void m25538l(User user) {
        xdl0.M(this.f23277c.f7533d, true);
        this.f23277c.f7533d.setText(this.f23276b.m11778m4(user, x8u.m24745c(user.profile.followships.counters.followers), i0g0.m16144p(user.location.distance, true), user.location.region.city));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25539C0() {
        return this.f23277c.f7530a.getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m25545i1(ayo0<D> ayo0Var) {
        this.f23276b = ayo0Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m25541d(long j, boolean z, boolean z2) {
        if (z2) {
            return kvc0.d(R.string.Z);
        }
        String strD = kvc0.d(((bgv) ypv.m25491l(fld0.f13080f)).m12018n() ? R.string.C9 : R.string.A9);
        String strT = w8u.t(R.string.We);
        if (!z) {
            strD = strT;
        }
        if (j > 999999) {
            double d = j;
            if (w8u.o(x8u.m24745c(d)) != -1) {
                return strD + x8u.m24745c(d);
            }
        }
        return strD + j;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m25542e(BLiveAnchorLevel bLiveAnchorLevel, VDraweeView vDraweeView, View view) {
        if (this.f23275a.p(bLiveAnchorLevel.getClassParseName())) {
            return;
        }
        this.f23275a.m();
        this.f23275a.D(vDraweeView, m25541d(this.f23276b.m11779n4().d().gap, true, this.f23276b.m11779n4().d().wealthRatio == 1.0d), bLiveAnchorLevel.getClassParseName());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m25543f(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, VDraweeView vDraweeView, View view) {
        if (this.f23276b.m24302f4() == null || !TextUtils.equals(((DbObject) this.f23276b.m24302f4()).id, ypv.f23196a.m23619D0()) || this.f23275a.p(bLiveUserProfileConfigHierarchy.getClassParseName())) {
            return;
        }
        this.f23275a.m();
        this.f23275a.D(vDraweeView, m25541d(bLiveUserProfileConfigHierarchy.gap, false, bLiveUserProfileConfigHierarchy.wealthRatio == 1.0d), bLiveUserProfileConfigHierarchy.getClassParseName());
    }

    /* JADX INFO: renamed from: i */
    public final void m25544i() {
        final View view = this.f23277c.f7537h;
        final BLiveAnchorLevel bLiveAnchorLevelM15017f = ((ggv) ypv.m25491l(fld0.f13077c)).m15017f(this.f23276b.m11779n4().e().grade);
        if (TextUtils.isEmpty(bLiveAnchorLevelM15017f.backendUrl)) {
            xdl0.M(view, false);
        } else {
            xdl0.M(view, true);
            xdl0.D0(t100.v, new View[]{view});
            qib0.G.M0(view, bLiveAnchorLevelM15017f.backendUrl, new C1340b(view));
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.wxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22362a.m25542e(bLiveAnchorLevelM15017f, view, view2);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m25546j(User user) {
        if (user == null) {
            this.f23277c.f7530a.setVisibility(8);
            this.f23277c.f7533d.setVisibility(8);
            this.f23277c.f7535f.setVisibility(8);
            return;
        }
        w1t w1tVar = this.f23275a;
        Act act = act();
        VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView = this.f23277c;
        w1tVar.k(act, new CommonMedalView[]{voiceUserCardMedalAndNameView.f7539j, voiceUserCardMedalAndNameView.f7540k, voiceUserCardMedalAndNameView.f7541l, voiceUserCardMedalAndNameView.f7542m});
        this.f23275a.y(user);
        this.f23277c.f7530a.setVisibility(0);
        this.f23277c.f7535f.setVisibility(0);
        this.f23277c.f7531b.setText(String.valueOf(user.age));
        this.f23277c.f7532c.setBackground(kvc0.b(TEnum.equals(user.gender, "male") ? i3c0.G8 : i3c0.E8));
        xdl0.M(this.f23277c.f7531b, !user.isHideAgeFromSVip());
        this.f23277c.f7536g.setText(i0g0.m16137j0(user.profile.zodiac));
        this.f23277c.f7536g.setVisibility(0);
        m25538l(user);
        p1k0 p1k0VarM11779n4 = this.f23276b.m11779n4();
        if (p1k0VarM11779n4 == null || p1k0VarM11779n4.r() == null) {
            this.f23277c.f7530a.setText(user.name);
        } else {
            rfd0.b(this.f23277c.f7530a, user.name, kvc0.a(h1c0.e1), p1k0VarM11779n4.r().userNameGradientColors);
        }
        xdl0.M(this.f23277c.f7537h, false);
        if (p1k0VarM11779n4.u() && ypv.m25490k().u7() && p1k0VarM11779n4.j() != null) {
            m25548m();
        } else {
            if (p1k0VarM11779n4.d() == null || p1k0VarM11779n4.d().grade < 0) {
                return;
            }
            m25544i();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25547k(mqv<User> mqvVar) {
        m25546j(mqvVar != null ? (User) mqvVar.a : null);
    }

    /* JADX INFO: renamed from: m */
    public final void m25548m() {
        final View view = this.f23277c.f7537h;
        final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchyP = this.f23276b.m11779n4().p();
        UserWealthGradeConfig userWealthGradeConfigM15035x = ((ggv) ypv.m25491l(fld0.f13077c)).m15035x((int) bLiveUserProfileConfigHierarchyP.grade);
        if (TextUtils.isEmpty(userWealthGradeConfigM15035x.wealthIconUrl)) {
            xdl0.M(view, false);
        } else {
            xdl0.M(view, true);
            xdl0.D0(t100.v, new View[]{view});
            qib0.G.M0(view, userWealthGradeConfigM15035x.wealthIconUrl, new C1339a(view));
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.xxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22798a.m25543f(bLiveUserProfileConfigHierarchyP, view, view2);
            }
        });
    }

    public void destroy() {
    }
}
