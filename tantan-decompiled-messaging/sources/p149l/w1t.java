package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserMedal;
import com.p046p1.mobile.putong.data.UserMedalWrapper;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class w1t {

    /* JADX INFO: renamed from: a */
    public Context f184052a;

    /* JADX INFO: renamed from: b */
    public List<CommonMedalView> f184053b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f184054c = "";

    /* JADX INFO: renamed from: d */
    public String f184055d;

    /* JADX INFO: renamed from: e */
    public boolean f184056e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public gm0 f184057f;

    /* JADX INFO: renamed from: g */
    public e30<BLiveMedal> f184058g;

    /* JADX INFO: renamed from: h */
    public mcr f184059h;

    public w1t(boolean z) {
        this.f184056e = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m200957h(CommonMedalView commonMedalView, imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m95419b().getWidth() > 0) {
                Bitmap bitmapM95419b = a9gVar.m95419b();
                xdl0.m208327D0((int) (((bitmapM95419b.getWidth() * 1.0f) / bitmapM95419b.getHeight()) * (commonMedalView.getHeight() > 0 ? commonMedalView.getHeight() : t100.m186890d(14.0f))), commonMedalView);
            } else {
                xdl0.m208327D0(t100.m186890d(50.0f), commonMedalView);
            }
        } else {
            xdl0.m208327D0(t100.m186890d(50.0f), commonMedalView);
        }
        commonMedalView.setBackground(imf0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m200959j(VDraweeView vDraweeView, imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m95419b().getWidth() > 0) {
                Bitmap bitmapM95419b = a9gVar.m95419b();
                xdl0.m208327D0((int) (((bitmapM95419b.getWidth() * 1.0f) / bitmapM95419b.getHeight()) * vDraweeView.getHeight()), vDraweeView);
            } else {
                xdl0.m208327D0(t100.m186890d(50.0f), vDraweeView);
            }
        } else {
            xdl0.m208327D0(t100.m186890d(50.0f), vDraweeView);
        }
        vDraweeView.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m200960v(CommonMedalView commonMedalView, imf0 imf0Var) {
        commonMedalView.setBackground(imf0Var);
        if ((imf0Var instanceof z3g) && ((z3g) imf0Var).m217038f()) {
            ex4.m118575z(commonMedalView);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m200961A(VDraweeView vDraweeView, int i) {
        UserWealthGradeConfig userWealthGradeConfigM126038x = ((ggv) ypv.m215673l(fld0.f98148c)).m126038x(i);
        if (TextUtils.isEmpty(userWealthGradeConfigM126038x.wealthIconUrl)) {
            return;
        }
        xdl0.m208344M(vDraweeView, true);
        xdl0.m208327D0(t100.m186890d(32.0f), vDraweeView);
        qib0.f154691G.m102356Z0(vDraweeView, userWealthGradeConfigM126038x.wealthIconUrl);
    }

    /* JADX INFO: renamed from: B */
    public void m200962B(e30<BLiveMedal> e30Var) {
        this.f184058g = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public void m200963C(mcr mcrVar) {
        this.f184059h = mcrVar;
    }

    /* JADX INFO: renamed from: D */
    public void m200964D(View view, String str, String str2) {
        ptk ptkVarM171332h = ptk.m171332h();
        jtk jtkVarM143130v = new jtk(this.f184052a).m143129u(str).m143113e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m143119k(true).m143128t(12).m143130v(false);
        int i = t100.f167260i;
        int i2 = t100.f167257f;
        this.f184055d = ptkVarM171332h.m171346t(jtkVarM143130v.m143127s(i, i2, i, i2).m143117i(jtk.f119614A).m143109a(8000L).m143110b(new jtk.InterfaceC17856a() { // from class: l.s1t
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str3) {
                this.f161935a.m200973r(str3);
            }
        }).m143112d(new jtk.InterfaceC17857b() { // from class: l.t1t
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str3) {
                this.f167369a.m200974s(str3);
            }
        }), view);
        this.f184054c = str2;
    }

    /* JADX INFO: renamed from: E */
    public void m200965E(gm0 gm0Var) {
        this.f184057f = gm0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m200966k(Context context, @NonNull CommonMedalView... commonMedalViewArr) {
        vwb.m200354z(this.f184053b, new k1t());
        this.f184053b.clear();
        Collections.addAll(this.f184053b, commonMedalViewArr);
        this.f184052a = context;
    }

    /* JADX INFO: renamed from: l */
    public void m200967l() {
        m200968m();
        this.f184053b.clear();
        this.f184054c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m200968m() {
        if (this.f184055d != null) {
            ptk.m171332h().m171334g(this.f184055d);
            this.f184055d = null;
        }
        this.f184054c = null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m200969n(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.familyText);
    }

    /* JADX INFO: renamed from: o */
    public boolean m200970o(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.voiceFanbaseText);
    }

    /* JADX INFO: renamed from: p */
    public boolean m200971p(String str) {
        return TextUtils.equals(this.f184054c, str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m200972q(BLiveMedal bLiveMedal, User user, boolean z, View view) {
        m200975t(bLiveMedal, view, user.isMe(), z);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m200973r(String str) {
        m200968m();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m200974s(String str) {
        this.f184055d = null;
        this.f184054c = "";
    }

    /* JADX INFO: renamed from: t */
    public void m200975t(@NonNull BLiveMedal bLiveMedal, View view, boolean z, boolean z2) {
        String strM155401D = mmj.m155401D(z ? bLiveMedal.i18nMainDescription : bLiveMedal.i18nGuestDescription);
        if (bLiveMedal.f44397id.equals(this.f184054c)) {
            m200968m();
            return;
        }
        m200968m();
        zvf0.m220396r(ycu.f197487e, "p_audio_profile");
        if (z2 && NullChecker.m81303a(this.f184058g)) {
            this.f184058g.call(bLiveMedal);
        } else {
            m200964D(view, strM155401D, bLiveMedal.f44397id);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m200976u(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM126024j = ((ggv) ypv.m215673l(fld0.f98148c)).m126024j(userMedal.familyGrade);
        if (bLiveIntlVoiceMedalM126024j == null) {
            return;
        }
        nvp nvpVarM161735m = nvp.C18786a.m161734n().m161746y(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY).m161740s(userMedal.familyGrade).m161747z(userMedal.familyText).m161742u(bLiveIntlVoiceMedalM126024j.icon).m161743v(userMedal.familyLight).m161745x(bLiveIntlVoiceMedalM126024j.startColor).m161738q(bLiveIntlVoiceMedalM126024j.endColor).m161737p(bLiveIntlVoiceMedalM126024j.borderColor).m161739r("not_chat").m161735m();
        commonMedalView.setImageResource(i3c0.f110804Na);
        xdl0.m208327D0(z3g.m217034h(null, nvpVarM161735m.m161716j(), nvpVarM161735m.m161712f()), commonMedalView);
        C22306c<imf0> c22306cM114681e = e4g.m114681e(nvpVarM161735m);
        if (c22306cM114681e == null || (mcrVar = this.f184059h) == null) {
            return;
        }
        mcrVar.duringCreated(c22306cM114681e).subscribe(ffw.m121194e(new e30() { // from class: l.q1t
            @Override // p149l.e30
            public final void call(Object obj) {
                w1t.m200960v(commonMedalView, (imf0) obj);
            }
        }, new e30() { // from class: l.r1t
            @Override // p149l.e30
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.m208344M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: w */
    public void m200977w(final VDraweeView vDraweeView, int i) {
        mcr mcrVar;
        if (!ypv.m215672k().m195706P6() || this.f184057f == null) {
            return;
        }
        vDraweeView.setImageResource(i3c0.f110804Na);
        gm0 gm0Var = this.f184057f;
        C22306c<imf0> c22306cM130000i = h9g.m130000i(i, gm0Var.f103418b, gm0Var.f103417a);
        if (c22306cM130000i == null || (mcrVar = this.f184059h) == null) {
            return;
        }
        mcrVar.duringCreated(c22306cM130000i).subscribe(ffw.m121194e(new e30() { // from class: l.l1t
            @Override // p149l.e30
            public final void call(Object obj) {
                w1t.m200959j(vDraweeView, (imf0) obj);
            }
        }, new e30() { // from class: l.m1t
            @Override // p149l.e30
            public final void call(Object obj) {
                vDraweeView.setBackground(null);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m200978x(final CommonMedalView commonMedalView, UserMedal userMedal) {
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
        if (c22306cM114681e == null || (mcrVar = this.f184059h) == null) {
            return;
        }
        mcrVar.duringCreated(c22306cM114681e).subscribe(ffw.m121194e(new u1t(commonMedalView), new e30() { // from class: l.v1t
            @Override // p149l.e30
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.m208344M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: y */
    public void m200979y(@NonNull User user) {
        m200980z(user, false);
    }

    /* JADX INFO: renamed from: z */
    public void m200980z(@NonNull final User user, final boolean z) {
        int i;
        mcr mcrVar;
        Iterator<CommonMedalView> it = this.f184053b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            CommonMedalView next = it.next();
            xdl0.m208344M(next, false);
            next.setOnClickListener(null);
        }
        if (this.f184053b.isEmpty()) {
            return;
        }
        if (vwb.m200296J(user.medal.singleRoomMedals) && vwb.m200296J(user.medal.multiRoomMedals)) {
            return;
        }
        UserMedalWrapper userMedalWrapper = user.medal;
        for (UserMedal userMedal : dck0.m110720e(userMedalWrapper.singleRoomMedals, userMedalWrapper.multiRoomMedals)) {
            if (i >= this.f184053b.size()) {
                break;
            }
            final CommonMedalView commonMedalView = this.f184053b.get(i);
            if (m200969n(userMedal)) {
                m200976u(commonMedalView, userMedal);
            } else if (m200970o(userMedal)) {
                m200978x(commonMedalView, userMedal);
            } else {
                final BLiveMedal bLiveMedalM126034t = ((ggv) ypv.m215673l(fld0.f98148c)).m126034t(userMedal.f38831id, "live", user.medal.version);
                if (bLiveMedalM126034t != null) {
                    xdl0.m208345M0(commonMedalView, true);
                    if (this.f184056e) {
                        xdl0.m208329E0(commonMedalView, new View.OnClickListener() { // from class: l.n1t
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f136721a.m200972q(bLiveMedalM126034t, user, z, view);
                            }
                        });
                    } else {
                        commonMedalView.setOnClickListener(null);
                    }
                    if (!bLiveMedalM126034t.isFanbaseMedal()) {
                        commonMedalView.setBackground(null);
                        agv.m96352j(commonMedalView, bLiveMedalM126034t.getStaticUrl(), bLiveMedalM126034t.getDynamicUrl());
                    } else if (ypv.m215672k().m195706P6() && this.f184057f != null) {
                        commonMedalView.setImageResource(i3c0.f110804Na);
                        int i2 = userMedal.fanbaseGrade;
                        gm0 gm0Var = this.f184057f;
                        C22306c<imf0> c22306cM130000i = h9g.m130000i(i2, gm0Var.f103418b, gm0Var.f103417a);
                        if (c22306cM130000i != null && (mcrVar = this.f184059h) != null) {
                            mcrVar.duringCreated(c22306cM130000i).subscribe(ffw.m121194e(new e30() { // from class: l.o1t
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    w1t.m200957h(commonMedalView, (imf0) obj);
                                }
                            }, new e30() { // from class: l.p1t
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
        zvf0.m220402x(ycu.f197487e, "p_audio_profile");
    }
}
