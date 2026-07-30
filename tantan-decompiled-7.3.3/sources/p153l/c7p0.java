package p153l;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import p151v.VDraweeView;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class c7p0<D extends rwn0> implements iam<e7p0<D>> {

    /* JADX INFO: renamed from: a */
    public final x3t f80128a = new x3t(true);

    /* JADX INFO: renamed from: b */
    public e7p0<D> f80129b;

    /* JADX INFO: renamed from: c */
    public VoiceUserCardMedalAndNameView f80130c;

    /* JADX INFO: renamed from: l.c7p0$a */
    public class C16206a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f80131a;

        public C16206a(VDraweeView vDraweeView) {
            this.f80131a = vDraweeView;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f80131a.getLayoutParams();
            int i = qa00.f156324k;
            layoutParams.height = i;
            layoutParams.width = (int) ((qimVar.getWidth() / qimVar.getHeight()) * i);
            this.f80131a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.c7p0$b */
    public class C16207b extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f80133a;

        public C16207b(VDraweeView vDraweeView) {
            this.f80133a = vDraweeView;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f80133a.getLayoutParams();
            int i = qa00.f156324k;
            layoutParams.height = i;
            layoutParams.width = (int) ((qimVar.getWidth() / qimVar.getHeight()) * i);
            this.f80133a.setLayoutParams(layoutParams);
        }
    }

    public c7p0(VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView) {
        this.f80130c = voiceUserCardMedalAndNameView;
    }

    /* JADX INFO: renamed from: l */
    private void m108314l(User user) {
        bnl0.m105524M(this.f80130c.f54775d, true);
        this.f80130c.f54775d.setText(this.f80129b.m119764m4(user, yau.m214935c(user.profile.followships.counters.followers), q8g0.m175811p(user.location.distance, true), user.location.region.city));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f80130c.f54772a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(e7p0<D> e7p0Var) {
        this.f80129b = e7p0Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m108316d(long j, boolean z, boolean z2) {
        if (z2) {
            return n3d0.m161280d(R$string.f47940Z);
        }
        String strM161280d = n3d0.m161280d(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47458C9 : R$string.f47414A9);
        String strM209910t = xau.m209910t(R$string.f47892We);
        if (!z) {
            strM161280d = strM209910t;
        }
        if (j > 999999) {
            double d = j;
            if (xau.m209905o(yau.m214935c(d)) != -1) {
                return strM161280d + yau.m214935c(d);
            }
        }
        return strM161280d + j;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m108317e(BLiveAnchorLevel bLiveAnchorLevel, VDraweeView vDraweeView, View view) {
        if (this.f80128a.m209283p(bLiveAnchorLevel.getClassParseName())) {
            return;
        }
        this.f80128a.m209280m();
        this.f80128a.m209276D(vDraweeView, m108316d(this.f80129b.m119765n4().m200529d().gap, true, this.f80129b.m119765n4().m200529d().wealthRatio == 1.0d), bLiveAnchorLevel.getClassParseName());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m108318f(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, VDraweeView vDraweeView, View view) {
        if (this.f80129b.m100217f4() == null || !TextUtils.equals(this.f80129b.m100217f4().f56859id, zrv.f205799a.m207631D0()) || this.f80128a.m209283p(bLiveUserProfileConfigHierarchy.getClassParseName())) {
            return;
        }
        this.f80128a.m209280m();
        this.f80128a.m209276D(vDraweeView, m108316d(bLiveUserProfileConfigHierarchy.gap, false, bLiveUserProfileConfigHierarchy.wealthRatio == 1.0d), bLiveUserProfileConfigHierarchy.getClassParseName());
    }

    /* JADX INFO: renamed from: i */
    public final void m108319i() {
        final VDraweeView vDraweeView = this.f80130c.f54779h;
        final BLiveAnchorLevel bLiveAnchorLevelM135154f = ((hiv) zrv.m221194l(htd0.f111521c)).m135154f(this.f80129b.m119765n4().m200530e().grade);
        if (TextUtils.isEmpty(bLiveAnchorLevelM135154f.backendUrl)) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105507D0(qa00.f156335v, vDraweeView);
            uqb0.f180374G.m127117M0(vDraweeView, bLiveAnchorLevelM135154f.backendUrl, new C16207b(vDraweeView));
        }
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.a7p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68834a.m108317e(bLiveAnchorLevelM135154f, vDraweeView, view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m108320j(User user) {
        if (user == null) {
            this.f80130c.f54772a.setVisibility(8);
            this.f80130c.f54775d.setVisibility(8);
            this.f80130c.f54777f.setVisibility(8);
            return;
        }
        x3t x3tVar = this.f80128a;
        Act act = getAct();
        VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView = this.f80130c;
        x3tVar.m209278k(act, voiceUserCardMedalAndNameView.f54781j, voiceUserCardMedalAndNameView.f54782k, voiceUserCardMedalAndNameView.f54783l, voiceUserCardMedalAndNameView.f54784m);
        this.f80128a.m209291y(user);
        this.f80130c.f54772a.setVisibility(0);
        this.f80130c.f54777f.setVisibility(0);
        this.f80130c.f54773b.setText(String.valueOf(user.age));
        this.f80130c.f54774c.setBackground(n3d0.m161278b(TEnum.equals(user.gender, "male") ? obc0.f146046G8 : obc0.f146022E8));
        bnl0.m105524M(this.f80130c.f54773b, !user.isHideAgeFromSVip());
        this.f80130c.f54778g.setText(q8g0.m175804j0(user.profile.zodiac));
        this.f80130c.f54778g.setVisibility(0);
        m108314l(user);
        vak0 vak0VarM119765n4 = this.f80129b.m119765n4();
        if (vak0VarM119765n4 == null || vak0VarM119765n4.m200543r() == null) {
            this.f80130c.f54772a.setText(user.name);
        } else {
            und0.m196834b(this.f80130c.f54772a, user.name, n3d0.m161277a(n9c0.f140823e1), vak0VarM119765n4.m200543r().userNameGradientColors);
        }
        bnl0.m105524M(this.f80130c.f54779h, false);
        if (vak0VarM119765n4.m200546u() && zrv.m221193k().m203746u7() && vak0VarM119765n4.m200535j() != null) {
            m108322m();
        } else {
            if (vak0VarM119765n4.m200529d() == null || vak0VarM119765n4.m200529d().grade < 0) {
                return;
            }
            m108319i();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m108321k(nsv<User> nsvVar) {
        m108320j(nsvVar != null ? nsvVar.f143542a : null);
    }

    /* JADX INFO: renamed from: m */
    public final void m108322m() {
        final VDraweeView vDraweeView = this.f80130c.f54779h;
        final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchyM200541p = this.f80129b.m119765n4().m200541p();
        UserWealthGradeConfig userWealthGradeConfigM135172x = ((hiv) zrv.m221194l(htd0.f111521c)).m135172x((int) bLiveUserProfileConfigHierarchyM200541p.grade);
        if (TextUtils.isEmpty(userWealthGradeConfigM135172x.wealthIconUrl)) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105507D0(qa00.f156335v, vDraweeView);
            uqb0.f180374G.m127117M0(vDraweeView, userWealthGradeConfigM135172x.wealthIconUrl, new C16206a(vDraweeView));
        }
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.b7p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75328a.m108318f(bLiveUserProfileConfigHierarchyM200541p, vDraweeView, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
