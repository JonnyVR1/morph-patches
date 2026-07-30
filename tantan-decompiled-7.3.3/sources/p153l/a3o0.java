package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserMedal;
import com.p051p1.mobile.putong.data.UserMedalWrapper;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class a3o0 {

    /* JADX INFO: renamed from: a */
    public Context f68302a;

    /* JADX INFO: renamed from: b */
    public List<CommonMedalView> f68303b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f68304c = "";

    /* JADX INFO: renamed from: d */
    public String f68305d;

    /* JADX INFO: renamed from: e */
    public boolean f68306e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public cm0 f68307f;

    /* JADX INFO: renamed from: g */
    public ner f68308g;

    public a3o0(boolean z) {
        this.f68306e = z;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m95842b(CommonMedalView commonMedalView, ruf0 ruf0Var) {
        bnl0.m105507D0(qa00.m175859d(50.0f), commonMedalView);
        commonMedalView.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: h */
    public void m95848h(Context context, @NonNull CommonMedalView... commonMedalViewArr) {
        jyb.m147537z(this.f68303b, new l3t());
        this.f68303b.clear();
        Collections.addAll(this.f68303b, commonMedalViewArr);
        this.f68302a = context;
    }

    /* JADX INFO: renamed from: i */
    public void m95849i() {
        m95850j();
        this.f68303b.clear();
        this.f68304c = null;
    }

    /* JADX INFO: renamed from: j */
    public void m95850j() {
        if (this.f68305d != null) {
            fwk.m127777h().m127779g(this.f68305d);
            this.f68305d = null;
        }
        this.f68304c = null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m95851k(UserMedal userMedal) {
        return (wft.m206159b(3) || TextUtils.isEmpty(userMedal.familyText)) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m95852l(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.voiceFanbaseText);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m95853m(BLiveMedal bLiveMedal, User user, View view) {
        m95856p(bLiveMedal, view, user.isMe());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m95854n(String str) {
        m95850j();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m95855o(String str) {
        this.f68305d = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m95856p(@NonNull BLiveMedal bLiveMedal, View view, boolean z) {
        String strM111768D = cpj.m111768D(z ? bLiveMedal.i18nMainDescription : bLiveMedal.i18nGuestDescription);
        if (bLiveMedal.f45245id.equals(this.f68304c)) {
            m95850j();
        } else {
            m95850j();
            m95861u(view, strM111768D, bLiveMedal.f45245id);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m95857q(final CommonMedalView commonMedalView, UserMedal userMedal) {
        ner nerVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM135158j = ((hiv) zrv.m221194l(htd0.f111521c)).m135158j(userMedal.familyGrade);
        if (bLiveIntlVoiceMedalM135158j == null) {
            return;
        }
        nxp nxpVarM165235m = nxp.C18985a.m165234n().m165240s(userMedal.familyGrade).m165247z(userMedal.familyText).m165242u(bLiveIntlVoiceMedalM135158j.icon).m165245x(bLiveIntlVoiceMedalM135158j.startColor).m165238q(bLiveIntlVoiceMedalM135158j.endColor).m165243v(userMedal.familyLight).m165246y(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY).m165237p(bLiveIntlVoiceMedalM135158j.borderColor).m165239r("not_chat").m165235m();
        commonMedalView.setImageResource(obc0.f146132Na);
        bnl0.m105507D0(n5g.m161713h(null, nxpVarM165235m.m165216j(), nxpVarM165235m.m165212f()), commonMedalView);
        C22421c<ruf0> c22421cM184664e = s5g.m184664e(nxpVarM165235m);
        if (c22421cM184664e == null || (nerVar = this.f68308g) == null) {
            return;
        }
        nerVar.duringCreated(c22421cM184664e).subscribe(dhw.m115826e(new v3t(commonMedalView), new y20() { // from class: l.z2o0
            @Override // p153l.y20
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        bnl0.m105524M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: r */
    public void m95858r(final CommonMedalView commonMedalView, UserMedal userMedal) {
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
        if (c22421cM184664e == null || (nerVar = this.f68308g) == null) {
            return;
        }
        nerVar.duringCreated(c22421cM184664e).subscribe(dhw.m115826e(new v3t(commonMedalView), new y20() { // from class: l.t2o0
            @Override // p153l.y20
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        bnl0.m105524M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: s */
    public void m95859s(@NonNull final User user) {
        int i;
        ner nerVar;
        Iterator<CommonMedalView> it = this.f68303b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            CommonMedalView next = it.next();
            bnl0.m105524M(next, false);
            next.setOnClickListener(null);
        }
        if (this.f68303b.isEmpty()) {
            return;
        }
        if (jyb.m147479J(user.medal.singleRoomMedals) && jyb.m147479J(user.medal.multiRoomMedals)) {
            return;
        }
        UserMedalWrapper userMedalWrapper = user.medal;
        for (UserMedal userMedal : z8p0.m219018b(userMedalWrapper.singleRoomMedals, userMedalWrapper.multiRoomMedals)) {
            if (i >= this.f68303b.size()) {
                return;
            }
            final CommonMedalView commonMedalView = this.f68303b.get(i);
            if (m95851k(userMedal)) {
                m95857q(commonMedalView, userMedal);
            } else if (m95852l(userMedal)) {
                m95858r(commonMedalView, userMedal);
            } else {
                final BLiveMedal bLiveMedalM135168t = ((hiv) zrv.m221194l(htd0.f111521c)).m135168t(userMedal.f39679id, "live", user.medal.version);
                if (bLiveMedalM135168t != null) {
                    bnl0.m105525M0(commonMedalView, true);
                    if (this.f68306e) {
                        bnl0.m105509E0(commonMedalView, new View.OnClickListener() { // from class: l.u2o0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f177232a.m95853m(bLiveMedalM135168t, user, view);
                            }
                        });
                    } else {
                        commonMedalView.setOnClickListener(null);
                    }
                    if (!bLiveMedalM135168t.isFanbaseMedal()) {
                        commonMedalView.setBackground(null);
                        biv.m104525j(commonMedalView, bLiveMedalM135168t.getStaticUrl(), bLiveMedalM135168t.getDynamicUrl());
                    } else if (zrv.m221193k().m203493P6() && this.f68307f != null) {
                        commonMedalView.setImageResource(obc0.f146132Na);
                        int i2 = userMedal.fanbaseGrade;
                        cm0 cm0Var = this.f68307f;
                        C22421c<ruf0> c22421cM200515i = vag.m200515i(i2, cm0Var.f82502b, cm0Var.f82501a);
                        if (c22421cM200515i != null && (nerVar = this.f68308g) != null) {
                            nerVar.duringCreated(c22421cM200515i).subscribe(dhw.m115826e(new y20() { // from class: l.v2o0
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    a3o0.m95842b(commonMedalView, (ruf0) obj);
                                }
                            }, new y20() { // from class: l.w2o0
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
    }

    /* JADX INFO: renamed from: t */
    public void m95860t(ner nerVar) {
        this.f68308g = nerVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m95861u(View view, String str, String str2) {
        fwk fwkVarM127777h = fwk.m127777h();
        zvk zvkVarM221777v = new zvk(this.f68302a).m221776u(str).m221760e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m221766k(true).m221775t(12).m221777v(false);
        int i = qa00.f156322i;
        int i2 = qa00.f156319f;
        this.f68305d = fwkVarM127777h.m127791t(zvkVarM221777v.m221774s(i, i2, i, i2).m221764i(zvk.f206224A).m221756a(8000L).m221757b(new zvk.InterfaceC21905a() { // from class: l.x2o0
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str3) {
                this.f192163a.m95854n(str3);
            }
        }).m221759d(new zvk.InterfaceC21906b() { // from class: l.y2o0
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str3) {
                this.f197270a.m95855o(str3);
            }
        }), view);
        this.f68304c = str2;
    }

    /* JADX INFO: renamed from: v */
    public void m95862v(cm0 cm0Var) {
        this.f68307f = cm0Var;
    }
}
