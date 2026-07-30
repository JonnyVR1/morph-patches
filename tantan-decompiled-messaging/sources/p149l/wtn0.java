package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.data.UserMedalWrapper;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class wtn0 {

    /* JADX INFO: renamed from: a */
    public Context f188032a;

    /* JADX INFO: renamed from: b */
    public List<CommonMedalView> f188033b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f188034c = "";

    /* JADX INFO: renamed from: d */
    public String f188035d;

    /* JADX INFO: renamed from: e */
    public boolean f188036e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public gm0 f188037f;

    /* JADX INFO: renamed from: g */
    public mcr f188038g;

    public wtn0(boolean z) {
        this.f188036e = z;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m205555b(CommonMedalView commonMedalView, imf0 imf0Var) {
        xdl0.m208327D0(t100.m186890d(50.0f), commonMedalView);
        commonMedalView.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: h */
    public void m205561h(Context context, @NonNull CommonMedalView... commonMedalViewArr) {
        vwb.m200354z(this.f188033b, new k1t());
        this.f188033b.clear();
        Collections.addAll(this.f188033b, commonMedalViewArr);
        this.f188032a = context;
    }

    /* JADX INFO: renamed from: i */
    public void m205562i() {
        m205563j();
        this.f188033b.clear();
        this.f188034c = null;
    }

    /* JADX INFO: renamed from: j */
    public void m205563j() {
        if (this.f188035d != null) {
            ptk.m171332h().m171334g(this.f188035d);
            this.f188035d = null;
        }
        this.f188034c = null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m205564k(UserMedal userMedal) {
        return (vdt.m198092b(3) || TextUtils.isEmpty(userMedal.familyText)) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m205565l(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.voiceFanbaseText);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m205566m(BLiveMedal bLiveMedal, User user, View view) {
        m205569p(bLiveMedal, view, user.isMe());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m205567n(String str) {
        m205563j();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m205568o(String str) {
        this.f188035d = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m205569p(@NonNull BLiveMedal bLiveMedal, View view, boolean z) {
        String strM155401D = mmj.m155401D(z ? bLiveMedal.i18nMainDescription : bLiveMedal.i18nGuestDescription);
        if (bLiveMedal.f44397id.equals(this.f188034c)) {
            m205563j();
        } else {
            m205563j();
            m205574u(view, strM155401D, bLiveMedal.f44397id);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m205570q(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM126024j = ((ggv) ypv.m215673l(fld0.f98148c)).m126024j(userMedal.familyGrade);
        if (bLiveIntlVoiceMedalM126024j == null) {
            return;
        }
        nvp nvpVarM161735m = nvp.C18786a.m161734n().m161740s(userMedal.familyGrade).m161747z(userMedal.familyText).m161742u(bLiveIntlVoiceMedalM126024j.icon).m161745x(bLiveIntlVoiceMedalM126024j.startColor).m161738q(bLiveIntlVoiceMedalM126024j.endColor).m161743v(userMedal.familyLight).m161746y(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY).m161737p(bLiveIntlVoiceMedalM126024j.borderColor).m161739r("not_chat").m161735m();
        commonMedalView.setImageResource(i3c0.f110804Na);
        xdl0.m208327D0(z3g.m217034h(null, nvpVarM161735m.m161716j(), nvpVarM161735m.m161712f()), commonMedalView);
        C22306c<imf0> c22306cM114681e = e4g.m114681e(nvpVarM161735m);
        if (c22306cM114681e == null || (mcrVar = this.f188038g) == null) {
            return;
        }
        mcrVar.duringCreated(c22306cM114681e).subscribe(ffw.m121194e(new u1t(commonMedalView), new e30() { // from class: l.vtn0
            @Override // p149l.e30
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.m208344M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: r */
    public void m205571r(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM126028n = ((ggv) ypv.m215673l(fld0.f98148c)).m126028n(userMedal.voiceFanbaseGrade);
        if (bLiveIntlVoiceMedalM126028n == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = commonMedalView.getLayoutParams();
        nvp nvpVarM161735m = nvp.C18786a.m161734n().m161746y("voiceFanBase").m161740s(userMedal.voiceFanbaseGrade).m161747z(userMedal.voiceFanbaseText).m161744w(userMedal.voiceFanbaseColor).m161742u(bLiveIntlVoiceMedalM126028n.icon).m161745x(bLiveIntlVoiceMedalM126028n.startColor).m161738q(bLiveIntlVoiceMedalM126028n.endColor).m161737p(bLiveIntlVoiceMedalM126028n.borderStartColor).m161736o(bLiveIntlVoiceMedalM126028n.borderEndColor).m161741t((layoutParams == null || layoutParams.height <= t100.m186890d(20.0f)) ? t100.m186890d(20.0f) : layoutParams.height).m161739r("not_chat").m161735m();
        commonMedalView.setImageResource(i3c0.f110804Na);
        int iM197047e = v4n0.m197047e(null, nvpVarM161735m.m161716j(), nvpVarM161735m.m161712f());
        xdl0.m208325C0(commonMedalView, nvpVarM161735m.m161712f());
        xdl0.m208327D0(iM197047e, commonMedalView);
        C22306c<imf0> c22306cM114681e = e4g.m114681e(nvpVarM161735m);
        if (c22306cM114681e == null || (mcrVar = this.f188038g) == null) {
            return;
        }
        mcrVar.duringCreated(c22306cM114681e).subscribe(ffw.m121194e(new u1t(commonMedalView), new e30() { // from class: l.ptn0
            @Override // p149l.e30
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.m208344M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: s */
    public void m205572s(@NonNull final User user) {
        int i;
        mcr mcrVar;
        Iterator<CommonMedalView> it = this.f188033b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            CommonMedalView next = it.next();
            xdl0.m208344M(next, false);
            next.setOnClickListener(null);
        }
        if (this.f188033b.isEmpty()) {
            return;
        }
        if (vwb.m200296J(user.medal.singleRoomMedals) && vwb.m200296J(user.medal.multiRoomMedals)) {
            return;
        }
        UserMedalWrapper userMedalWrapper = user.medal;
        for (UserMedal userMedal : vzo0.m200775b(userMedalWrapper.singleRoomMedals, userMedalWrapper.multiRoomMedals)) {
            if (i >= this.f188033b.size()) {
                return;
            }
            final CommonMedalView commonMedalView = this.f188033b.get(i);
            if (m205564k(userMedal)) {
                m205570q(commonMedalView, userMedal);
            } else if (m205565l(userMedal)) {
                m205571r(commonMedalView, userMedal);
            } else {
                final BLiveMedal bLiveMedalM126034t = ((ggv) ypv.m215673l(fld0.f98148c)).m126034t(userMedal.f38831id, "live", user.medal.version);
                if (bLiveMedalM126034t != null) {
                    xdl0.m208345M0(commonMedalView, true);
                    if (this.f188036e) {
                        xdl0.m208329E0(commonMedalView, new View.OnClickListener() { // from class: l.qtn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f156372a.m205566m(bLiveMedalM126034t, user, view);
                            }
                        });
                    } else {
                        commonMedalView.setOnClickListener(null);
                    }
                    if (!bLiveMedalM126034t.isFanbaseMedal()) {
                        commonMedalView.setBackground(null);
                        agv.m96352j(commonMedalView, bLiveMedalM126034t.getStaticUrl(), bLiveMedalM126034t.getDynamicUrl());
                    } else if (ypv.m215672k().m195706P6() && this.f188037f != null) {
                        commonMedalView.setImageResource(i3c0.f110804Na);
                        int i2 = userMedal.fanbaseGrade;
                        gm0 gm0Var = this.f188037f;
                        C22306c<imf0> c22306cM130000i = h9g.m130000i(i2, gm0Var.f103418b, gm0Var.f103417a);
                        if (c22306cM130000i != null && (mcrVar = this.f188038g) != null) {
                            mcrVar.duringCreated(c22306cM130000i).subscribe(ffw.m121194e(new e30() { // from class: l.rtn0
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    wtn0.m205555b(commonMedalView, (imf0) obj);
                                }
                            }, new e30() { // from class: l.stn0
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    commonMedalView.setBackground(null);
                                }
                            }));
                        }
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m205573t(mcr mcrVar) {
        this.f188038g = mcrVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m205574u(View view, String str, String str2) {
        ptk ptkVarM171332h = ptk.m171332h();
        jtk jtkVarM143130v = new jtk(this.f188032a).m143129u(str).m143113e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m143119k(true).m143128t(12).m143130v(false);
        int i = t100.f167260i;
        int i2 = t100.f167257f;
        this.f188035d = ptkVarM171332h.m171346t(jtkVarM143130v.m143127s(i, i2, i, i2).m143117i(jtk.f119614A).m143109a(8000L).m143110b(new jtk.InterfaceC17856a() { // from class: l.ttn0
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str3) {
                this.f172037a.m205567n(str3);
            }
        }).m143112d(new jtk.InterfaceC17857b() { // from class: l.utn0
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str3) {
                this.f178279a.m205568o(str3);
            }
        }), view);
        this.f188034c = str2;
    }

    /* JADX INFO: renamed from: v */
    public void m205575v(gm0 gm0Var) {
        this.f188037f = gm0Var;
    }
}
