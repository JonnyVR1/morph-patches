package p149l;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import p147v.VDraweeView;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class yxo0<D extends nnn0> implements s7m<ayo0<D>> {

    /* JADX INFO: renamed from: a */
    public final w1t f200647a = new w1t(true);

    /* JADX INFO: renamed from: b */
    public ayo0<D> f200648b;

    /* JADX INFO: renamed from: c */
    public VoiceUserCardMedalAndNameView f200649c;

    /* JADX INFO: renamed from: l.yxo0$a */
    public class C21572a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f200650a;

        public C21572a(VDraweeView vDraweeView) {
            this.f200650a = vDraweeView;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200650a.getLayoutParams();
            int i = t100.f167262k;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            this.f200650a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.yxo0$b */
    public class C21573b extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f200652a;

        public C21573b(VDraweeView vDraweeView) {
            this.f200652a = vDraweeView;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200652a.getLayoutParams();
            int i = t100.f167262k;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            this.f200652a.setLayoutParams(layoutParams);
        }
    }

    public yxo0(VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView) {
        this.f200649c = voiceUserCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: l */
    private void m216471l(User user) {
        xdl0.m208344M(this.f200649c.f53927d, true);
        this.f200649c.f53927d.setText(this.f200648b.m99578m4(user, x8u.m207433c(user.profile.followships.counters.followers), i0g0.m133876p(user.location.distance, true), user.location.region.city));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f200649c.f53924a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ayo0<D> ayo0Var) {
        this.f200648b = ayo0Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m216473d(long j, boolean z, boolean z2) {
        if (z2) {
            return kvc0.m147355d(R$string.f47092Z);
        }
        String strM147355d = kvc0.m147355d(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f46610C9 : R$string.f46566A9);
        String strM202217t = w8u.m202217t(R$string.f47044We);
        if (!z) {
            strM147355d = strM202217t;
        }
        if (j > 999999) {
            double d = j;
            if (w8u.m202212o(x8u.m207433c(d)) != -1) {
                return strM147355d + x8u.m207433c(d);
            }
        }
        return strM147355d + j;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m216474e(BLiveAnchorLevel bLiveAnchorLevel, VDraweeView vDraweeView, View view) {
        if (this.f200647a.m200971p(bLiveAnchorLevel.getClassParseName())) {
            return;
        }
        this.f200647a.m200968m();
        this.f200647a.m200964D(vDraweeView, m216473d(this.f200648b.m99579n4().m167084d().gap, true, this.f200648b.m99579n4().m167084d().wealthRatio == 1.0d), bLiveAnchorLevel.getClassParseName());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m216475f(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, VDraweeView vDraweeView, View view) {
        if (this.f200648b.m203475f4() == null || !TextUtils.equals(this.f200648b.m203475f4().f56011id, ypv.f199493a.m199309D0()) || this.f200647a.m200971p(bLiveUserProfileConfigHierarchy.getClassParseName())) {
            return;
        }
        this.f200647a.m200968m();
        this.f200647a.m200964D(vDraweeView, m216473d(bLiveUserProfileConfigHierarchy.gap, false, bLiveUserProfileConfigHierarchy.wealthRatio == 1.0d), bLiveUserProfileConfigHierarchy.getClassParseName());
    }

    /* JADX INFO: renamed from: i */
    public final void m216476i() {
        final VDraweeView vDraweeView = this.f200649c.f53931h;
        final BLiveAnchorLevel bLiveAnchorLevelM126020f = ((ggv) ypv.m215673l(fld0.f98148c)).m126020f(this.f200648b.m99579n4().m167085e().grade);
        if (TextUtils.isEmpty(bLiveAnchorLevelM126020f.backendUrl)) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208327D0(t100.f167273v, vDraweeView);
            qib0.f154691G.m102333M0(vDraweeView, bLiveAnchorLevelM126020f.backendUrl, new C21573b(vDraweeView));
        }
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.wxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188501a.m216474e(bLiveAnchorLevelM126020f, vDraweeView, view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m216477j(User user) {
        if (user == null) {
            this.f200649c.f53924a.setVisibility(8);
            this.f200649c.f53927d.setVisibility(8);
            this.f200649c.f53929f.setVisibility(8);
            return;
        }
        w1t w1tVar = this.f200647a;
        Act act = getAct();
        VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView = this.f200649c;
        w1tVar.m200966k(act, voiceUserCardMedalAndNameView.f53933j, voiceUserCardMedalAndNameView.f53934k, voiceUserCardMedalAndNameView.f53935l, voiceUserCardMedalAndNameView.f53936m);
        this.f200647a.m200979y(user);
        this.f200649c.f53924a.setVisibility(0);
        this.f200649c.f53929f.setVisibility(0);
        this.f200649c.f53925b.setText(String.valueOf(user.age));
        this.f200649c.f53926c.setBackground(kvc0.m147353b(TEnum.equals(user.gender, "male") ? i3c0.f110718G8 : i3c0.f110694E8));
        xdl0.m208344M(this.f200649c.f53925b, !user.isHideAgeFromSVip());
        this.f200649c.f53930g.setText(i0g0.m133869j0(user.profile.zodiac));
        this.f200649c.f53930g.setVisibility(0);
        m216471l(user);
        p1k0 p1k0VarM99579n4 = this.f200648b.m99579n4();
        if (p1k0VarM99579n4 == null || p1k0VarM99579n4.m167098r() == null) {
            this.f200649c.f53924a.setText(user.name);
        } else {
            rfd0.m179126b(this.f200649c.f53924a, user.name, kvc0.m147352a(h1c0.f105362e1), p1k0VarM99579n4.m167098r().userNameGradientColors);
        }
        xdl0.m208344M(this.f200649c.f53931h, false);
        if (p1k0VarM99579n4.m167101u() && ypv.m215672k().m195959u7() && p1k0VarM99579n4.m167090j() != null) {
            m216479m();
        } else {
            if (p1k0VarM99579n4.m167084d() == null || p1k0VarM99579n4.m167084d().grade < 0) {
                return;
            }
            m216476i();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m216478k(mqv<User> mqvVar) {
        m216477j(mqvVar != null ? mqvVar.f135304a : null);
    }

    /* JADX INFO: renamed from: m */
    public final void m216479m() {
        final VDraweeView vDraweeView = this.f200649c.f53931h;
        final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchyM167096p = this.f200648b.m99579n4().m167096p();
        UserWealthGradeConfig userWealthGradeConfigM126038x = ((ggv) ypv.m215673l(fld0.f98148c)).m126038x((int) bLiveUserProfileConfigHierarchyM167096p.grade);
        if (TextUtils.isEmpty(userWealthGradeConfigM126038x.wealthIconUrl)) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208327D0(t100.f167273v, vDraweeView);
            qib0.f154691G.m102333M0(vDraweeView, userWealthGradeConfigM126038x.wealthIconUrl, new C21572a(vDraweeView));
        }
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.xxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194898a.m216475f(bLiveUserProfileConfigHierarchyM167096p, vDraweeView, view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
