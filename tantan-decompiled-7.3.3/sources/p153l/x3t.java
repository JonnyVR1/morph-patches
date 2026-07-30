package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.data.UserMedalWrapper;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class x3t {

    /* JADX INFO: renamed from: a */
    public Context f192295a;

    /* JADX INFO: renamed from: b */
    public List<CommonMedalView> f192296b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f192297c = "";

    /* JADX INFO: renamed from: d */
    public String f192298d;

    /* JADX INFO: renamed from: e */
    public boolean f192299e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public cm0 f192300f;

    /* JADX INFO: renamed from: g */
    public y20<BLiveMedal> f192301g;

    /* JADX INFO: renamed from: h */
    public ner f192302h;

    public x3t(boolean z) {
        this.f192299e = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m209269h(CommonMedalView commonMedalView, ruf0 ruf0Var) {
        if (ruf0Var instanceof oag) {
            oag oagVar = (oag) ruf0Var;
            if (oagVar.m166838b().getWidth() > 0) {
                Bitmap bitmapM166838b = oagVar.m166838b();
                bnl0.m105507D0((int) (((bitmapM166838b.getWidth() * 1.0f) / bitmapM166838b.getHeight()) * (commonMedalView.getHeight() > 0 ? commonMedalView.getHeight() : qa00.m175859d(14.0f))), commonMedalView);
            } else {
                bnl0.m105507D0(qa00.m175859d(50.0f), commonMedalView);
            }
        } else {
            bnl0.m105507D0(qa00.m175859d(50.0f), commonMedalView);
        }
        commonMedalView.setBackground(ruf0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m209271j(VDraweeView vDraweeView, ruf0 ruf0Var) {
        if (ruf0Var instanceof oag) {
            oag oagVar = (oag) ruf0Var;
            if (oagVar.m166838b().getWidth() > 0) {
                Bitmap bitmapM166838b = oagVar.m166838b();
                bnl0.m105507D0((int) (((bitmapM166838b.getWidth() * 1.0f) / bitmapM166838b.getHeight()) * vDraweeView.getHeight()), vDraweeView);
            } else {
                bnl0.m105507D0(qa00.m175859d(50.0f), vDraweeView);
            }
        } else {
            bnl0.m105507D0(qa00.m175859d(50.0f), vDraweeView);
        }
        vDraweeView.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m209272v(CommonMedalView commonMedalView, ruf0 ruf0Var) {
        commonMedalView.setBackground(ruf0Var);
        if ((ruf0Var instanceof n5g) && ((n5g) ruf0Var).m161718f()) {
            dy4.m118616z(commonMedalView);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m209273A(VDraweeView vDraweeView, int i) {
        UserWealthGradeConfig userWealthGradeConfigM135172x = ((hiv) zrv.m221194l(htd0.f111521c)).m135172x(i);
        if (TextUtils.isEmpty(userWealthGradeConfigM135172x.wealthIconUrl)) {
            return;
        }
        bnl0.m105524M(vDraweeView, true);
        bnl0.m105507D0(qa00.m175859d(32.0f), vDraweeView);
        uqb0.f180374G.m127140Z0(vDraweeView, userWealthGradeConfigM135172x.wealthIconUrl);
    }

    /* JADX INFO: renamed from: B */
    public void m209274B(y20<BLiveMedal> y20Var) {
        this.f192301g = y20Var;
    }

    /* JADX INFO: renamed from: C */
    public void m209275C(ner nerVar) {
        this.f192302h = nerVar;
    }

    /* JADX INFO: renamed from: D */
    public void m209276D(View view, String str, String str2) {
        fwk fwkVarM127777h = fwk.m127777h();
        zvk zvkVarM221777v = new zvk(this.f192295a).m221776u(str).m221760e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m221766k(true).m221775t(12).m221777v(false);
        int i = qa00.f156322i;
        int i2 = qa00.f156319f;
        this.f192298d = fwkVarM127777h.m127791t(zvkVarM221777v.m221774s(i, i2, i, i2).m221764i(zvk.f206224A).m221756a(8000L).m221757b(new zvk.InterfaceC21905a() { // from class: l.t3t
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str3) {
                this.f171954a.m209285r(str3);
            }
        }).m221759d(new zvk.InterfaceC21906b() { // from class: l.u3t
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str3) {
                this.f177369a.m209286s(str3);
            }
        }), view);
        this.f192297c = str2;
    }

    /* JADX INFO: renamed from: E */
    public void m209277E(cm0 cm0Var) {
        this.f192300f = cm0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m209278k(Context context, @NonNull CommonMedalView... commonMedalViewArr) {
        jyb.m147537z(this.f192296b, new l3t());
        this.f192296b.clear();
        Collections.addAll(this.f192296b, commonMedalViewArr);
        this.f192295a = context;
    }

    /* JADX INFO: renamed from: l */
    public void m209279l() {
        m209280m();
        this.f192296b.clear();
        this.f192297c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m209280m() {
        if (this.f192298d != null) {
            fwk.m127777h().m127779g(this.f192298d);
            this.f192298d = null;
        }
        this.f192297c = null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m209281n(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.familyText);
    }

    /* JADX INFO: renamed from: o */
    public boolean m209282o(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.voiceFanbaseText);
    }

    /* JADX INFO: renamed from: p */
    public boolean m209283p(String str) {
        return TextUtils.equals(this.f192297c, str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m209284q(BLiveMedal bLiveMedal, User user, boolean z, View view) {
        m209287t(bLiveMedal, view, user.isMe(), z);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m209285r(String str) {
        m209280m();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m209286s(String str) {
        this.f192298d = null;
        this.f192297c = "";
    }

    /* JADX INFO: renamed from: t */
    public void m209287t(@NonNull BLiveMedal bLiveMedal, View view, boolean z, boolean z2) {
        String strM111768D = cpj.m111768D(z ? bLiveMedal.i18nMainDescription : bLiveMedal.i18nGuestDescription);
        if (bLiveMedal.f45245id.equals(this.f192297c)) {
            m209280m();
            return;
        }
        m209280m();
        i4g0.m138520r(zeu.f204078e, "p_audio_profile");
        if (z2 && NullChecker.m82486a(this.f192301g)) {
            this.f192301g.call(bLiveMedal);
        } else {
            m209276D(view, strM111768D, bLiveMedal.f45245id);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m209288u(final CommonMedalView commonMedalView, UserMedal userMedal) {
        ner nerVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM135158j = ((hiv) zrv.m221194l(htd0.f111521c)).m135158j(userMedal.familyGrade);
        if (bLiveIntlVoiceMedalM135158j == null) {
            return;
        }
        nxp nxpVarM165235m = nxp.C18985a.m165234n().m165246y(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY).m165240s(userMedal.familyGrade).m165247z(userMedal.familyText).m165242u(bLiveIntlVoiceMedalM135158j.icon).m165243v(userMedal.familyLight).m165245x(bLiveIntlVoiceMedalM135158j.startColor).m165238q(bLiveIntlVoiceMedalM135158j.endColor).m165237p(bLiveIntlVoiceMedalM135158j.borderColor).m165239r("not_chat").m165235m();
        commonMedalView.setImageResource(obc0.f146132Na);
        bnl0.m105507D0(n5g.m161713h(null, nxpVarM165235m.m165216j(), nxpVarM165235m.m165212f()), commonMedalView);
        C22421c<ruf0> c22421cM184664e = s5g.m184664e(nxpVarM165235m);
        if (c22421cM184664e == null || (nerVar = this.f192302h) == null) {
            return;
        }
        nerVar.duringCreated(c22421cM184664e).subscribe(dhw.m115826e(new y20() { // from class: l.r3t
            @Override // p153l.y20
            public final void call(Object obj) {
                x3t.m209272v(commonMedalView, (ruf0) obj);
            }
        }, new y20() { // from class: l.s3t
            @Override // p153l.y20
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        bnl0.m105524M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: w */
    public void m209289w(final VDraweeView vDraweeView, int i) {
        ner nerVar;
        if (!zrv.m221193k().m203493P6() || this.f192300f == null) {
            return;
        }
        vDraweeView.setImageResource(obc0.f146132Na);
        cm0 cm0Var = this.f192300f;
        C22421c<ruf0> c22421cM200515i = vag.m200515i(i, cm0Var.f82502b, cm0Var.f82501a);
        if (c22421cM200515i == null || (nerVar = this.f192302h) == null) {
            return;
        }
        nerVar.duringCreated(c22421cM200515i).subscribe(dhw.m115826e(new y20() { // from class: l.m3t
            @Override // p153l.y20
            public final void call(Object obj) {
                x3t.m209271j(vDraweeView, (ruf0) obj);
            }
        }, new y20() { // from class: l.n3t
            @Override // p153l.y20
            public final void call(Object obj) {
                vDraweeView.setBackground(null);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m209290x(final CommonMedalView commonMedalView, UserMedal userMedal) {
        ner nerVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM135162n = ((hiv) zrv.m221194l(htd0.f111521c)).m135162n(userMedal.voiceFanbaseGrade);
        if (bLiveIntlVoiceMedalM135162n == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = commonMedalView.getLayoutParams();
        nxp nxpVarM165235m = nxp.C18985a.m165234n().m165246y("voiceFanBase").m165240s(userMedal.voiceFanbaseGrade).m165247z(userMedal.voiceFanbaseText).m165244w(userMedal.voiceFanbaseColor).m165242u(bLiveIntlVoiceMedalM135162n.icon).m165245x(bLiveIntlVoiceMedalM135162n.startColor).m165238q(bLiveIntlVoiceMedalM135162n.endColor).m165237p(bLiveIntlVoiceMedalM135162n.borderStartColor).m165236o(bLiveIntlVoiceMedalM135162n.borderEndColor).m165241t((layoutParams == null || layoutParams.height <= qa00.m175859d(20.0f)) ? qa00.m175859d(20.0f) : layoutParams.height).m165239r("not_chat").m165235m();
        commonMedalView.setImageResource(obc0.f146132Na);
        int iM219349e = zdn0.m219349e(null, nxpVarM165235m.m165216j(), nxpVarM165235m.m165212f());
        bnl0.m105505C0(commonMedalView, nxpVarM165235m.m165212f());
        bnl0.m105507D0(iM219349e, commonMedalView);
        C22421c<ruf0> c22421cM184664e = s5g.m184664e(nxpVarM165235m);
        if (c22421cM184664e == null || (nerVar = this.f192302h) == null) {
            return;
        }
        nerVar.duringCreated(c22421cM184664e).subscribe(dhw.m115826e(new v3t(commonMedalView), new y20() { // from class: l.w3t
            @Override // p153l.y20
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        bnl0.m105524M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: y */
    public void m209291y(@NonNull User user) {
        m209292z(user, false);
    }

    /* JADX INFO: renamed from: z */
    public void m209292z(@NonNull final User user, final boolean z) {
        int i;
        ner nerVar;
        Iterator<CommonMedalView> it = this.f192296b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            CommonMedalView next = it.next();
            bnl0.m105524M(next, false);
            next.setOnClickListener(null);
        }
        if (this.f192296b.isEmpty()) {
            return;
        }
        if (jyb.m147479J(user.medal.singleRoomMedals) && jyb.m147479J(user.medal.multiRoomMedals)) {
            return;
        }
        UserMedalWrapper userMedalWrapper = user.medal;
        for (UserMedal userMedal : jlk0.m146083e(userMedalWrapper.singleRoomMedals, userMedalWrapper.multiRoomMedals)) {
            if (i >= this.f192296b.size()) {
                break;
            }
            final CommonMedalView commonMedalView = this.f192296b.get(i);
            if (m209281n(userMedal)) {
                m209288u(commonMedalView, userMedal);
            } else if (m209282o(userMedal)) {
                m209290x(commonMedalView, userMedal);
            } else {
                final BLiveMedal bLiveMedalM135168t = ((hiv) zrv.m221194l(htd0.f111521c)).m135168t(userMedal.f39679id, "live", user.medal.version);
                if (bLiveMedalM135168t != null) {
                    bnl0.m105525M0(commonMedalView, true);
                    if (this.f192299e) {
                        bnl0.m105509E0(commonMedalView, new View.OnClickListener() { // from class: l.o3t
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f144852a.m209284q(bLiveMedalM135168t, user, z, view);
                            }
                        });
                    } else {
                        commonMedalView.setOnClickListener(null);
                    }
                    if (!bLiveMedalM135168t.isFanbaseMedal()) {
                        commonMedalView.setBackground(null);
                        biv.m104525j(commonMedalView, bLiveMedalM135168t.getStaticUrl(), bLiveMedalM135168t.getDynamicUrl());
                    } else if (zrv.m221193k().m203493P6() && this.f192300f != null) {
                        commonMedalView.setImageResource(obc0.f146132Na);
                        int i2 = userMedal.fanbaseGrade;
                        cm0 cm0Var = this.f192300f;
                        C22421c<ruf0> c22421cM200515i = vag.m200515i(i2, cm0Var.f82502b, cm0Var.f82501a);
                        if (c22421cM200515i != null && (nerVar = this.f192302h) != null) {
                            nerVar.duringCreated(c22421cM200515i).subscribe(dhw.m115826e(new y20() { // from class: l.p3t
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    x3t.m209269h(commonMedalView, (ruf0) obj);
                                }
                            }, new y20() { // from class: l.q3t
                                @Override // p153l.y20
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
        i4g0.m138526x(zeu.f204078e, "p_audio_profile");
    }
}
