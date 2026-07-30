package p009l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserMedal;
import com.p1.mobile.putong.data.UserMedalWrapper;
import com.p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p1.mobile.putong.live.base.data.BLiveMedal;
import com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.agv;
import l.e30;
import l.e4g;
import l.ffw;
import l.gm0;
import l.h9g;
import l.i3c0;
import l.imf0;
import l.k1t;
import l.mcr;
import l.mmj;
import l.nvp;
import l.t100;
import l.u1t;
import l.v4n0;
import l.vdt;
import l.vwb;
import l.xdl0;
import l.z3g;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wtn0 {

    /* JADX INFO: renamed from: a */
    public Context f22319a;

    /* JADX INFO: renamed from: b */
    public List<CommonMedalView> f22320b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f22321c = "";

    /* JADX INFO: renamed from: d */
    public String f22322d;

    /* JADX INFO: renamed from: e */
    public boolean f22323e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public gm0 f22324f;

    /* JADX INFO: renamed from: g */
    public mcr f22325g;

    public wtn0(boolean z) {
        this.f22323e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m24543b(CommonMedalView commonMedalView, imf0 imf0Var) {
        xdl0.D0(t100.d(50.0f), new View[]{commonMedalView});
        commonMedalView.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: h */
    public void m24549h(Context context, @NonNull CommonMedalView... commonMedalViewArr) {
        vwb.z(this.f22320b, new k1t());
        this.f22320b.clear();
        Collections.addAll(this.f22320b, commonMedalViewArr);
        this.f22319a = context;
    }

    /* JADX INFO: renamed from: i */
    public void m24550i() {
        m24551j();
        this.f22320b.clear();
        this.f22321c = null;
    }

    /* JADX INFO: renamed from: j */
    public void m24551j() {
        if (this.f22322d != null) {
            ptk.m20688h().m20690g(this.f22322d);
            this.f22322d = null;
        }
        this.f22321c = null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m24552k(UserMedal userMedal) {
        return (vdt.b(3) || TextUtils.isEmpty(userMedal.familyText)) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m24553l(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.voiceFanbaseText);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m24554m(BLiveMedal bLiveMedal, User user, View view) {
        m24557p(bLiveMedal, view, user.isMe());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m24555n(String str) {
        m24551j();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m24556o(String str) {
        this.f22322d = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m24557p(@NonNull BLiveMedal bLiveMedal, View view, boolean z) {
        String strD = mmj.D(z ? bLiveMedal.i18nMainDescription : bLiveMedal.i18nGuestDescription);
        if (bLiveMedal.id.equals(this.f22321c)) {
            m24551j();
        } else {
            m24551j();
            m24562u(view, strD, bLiveMedal.id);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m24558q(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM15021j = ((ggv) ypv.m25491l(fld0.f13077c)).m15021j(userMedal.familyGrade);
        if (bLiveIntlVoiceMedalM15021j == null) {
            return;
        }
        nvp nvpVarM = nvp.a.n().s(userMedal.familyGrade).z(userMedal.familyText).u(bLiveIntlVoiceMedalM15021j.icon).x(bLiveIntlVoiceMedalM15021j.startColor).q(bLiveIntlVoiceMedalM15021j.endColor).v(userMedal.familyLight).y("family").p(bLiveIntlVoiceMedalM15021j.borderColor).r("not_chat").m();
        commonMedalView.setImageResource(i3c0.Na);
        xdl0.D0(z3g.h((Paint) null, nvpVarM.j(), nvpVarM.f()), new View[]{commonMedalView});
        c cVarE = e4g.e(nvpVarM);
        if (cVarE == null || (mcrVar = this.f22325g) == null) {
            return;
        }
        mcrVar.duringCreated(cVarE).subscribe(ffw.e(new u1t(commonMedalView), new e30() { // from class: l.vtn0
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.M(commonMedalView, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void m24559r(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalM15025n = ((ggv) ypv.m25491l(fld0.f13077c)).m15025n(userMedal.voiceFanbaseGrade);
        if (bLiveIntlVoiceMedalM15025n == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = commonMedalView.getLayoutParams();
        nvp nvpVarM = nvp.a.n().y("voiceFanBase").s(userMedal.voiceFanbaseGrade).z(userMedal.voiceFanbaseText).w(userMedal.voiceFanbaseColor).u(bLiveIntlVoiceMedalM15025n.icon).x(bLiveIntlVoiceMedalM15025n.startColor).q(bLiveIntlVoiceMedalM15025n.endColor).p(bLiveIntlVoiceMedalM15025n.borderStartColor).o(bLiveIntlVoiceMedalM15025n.borderEndColor).t((layoutParams == null || layoutParams.height <= t100.d(20.0f)) ? t100.d(20.0f) : layoutParams.height).r("not_chat").m();
        commonMedalView.setImageResource(i3c0.Na);
        int iE = v4n0.e((Paint) null, nvpVarM.j(), nvpVarM.f());
        xdl0.C0(commonMedalView, nvpVarM.f());
        xdl0.D0(iE, new View[]{commonMedalView});
        c cVarE = e4g.e(nvpVarM);
        if (cVarE == null || (mcrVar = this.f22325g) == null) {
            return;
        }
        mcrVar.duringCreated(cVarE).subscribe(ffw.e(new u1t(commonMedalView), new e30() { // from class: l.ptn0
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: s */
    public void m24560s(@NonNull final User user) {
        int i;
        mcr mcrVar;
        Iterator<CommonMedalView> it = this.f22320b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            CommonMedalView next = it.next();
            xdl0.M(next, false);
            next.setOnClickListener(null);
        }
        if (this.f22320b.isEmpty()) {
            return;
        }
        if (vwb.J(user.medal.singleRoomMedals) && vwb.J(user.medal.multiRoomMedals)) {
            return;
        }
        UserMedalWrapper userMedalWrapper = user.medal;
        for (UserMedal userMedal : vzo0.m23766b(userMedalWrapper.singleRoomMedals, userMedalWrapper.multiRoomMedals)) {
            if (i >= this.f22320b.size()) {
                return;
            }
            final CommonMedalView commonMedalView = this.f22320b.get(i);
            if (m24552k(userMedal)) {
                m24558q(commonMedalView, userMedal);
            } else if (m24553l(userMedal)) {
                m24559r(commonMedalView, userMedal);
            } else {
                final BLiveMedal bLiveMedalM15031t = ((ggv) ypv.m25491l(fld0.f13077c)).m15031t(userMedal.id, "live", user.medal.version);
                if (bLiveMedalM15031t != null) {
                    xdl0.M0(commonMedalView, true);
                    if (this.f22323e) {
                        xdl0.E0(commonMedalView, new View.OnClickListener() { // from class: l.qtn0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f19525a.m24554m(bLiveMedalM15031t, user, view);
                            }
                        });
                    } else {
                        commonMedalView.setOnClickListener(null);
                    }
                    if (!bLiveMedalM15031t.isFanbaseMedal()) {
                        commonMedalView.setBackground(null);
                        agv.j(commonMedalView, bLiveMedalM15031t.getStaticUrl(), bLiveMedalM15031t.getDynamicUrl());
                    } else if (ypv.m25490k().P6() && this.f22324f != null) {
                        commonMedalView.setImageResource(i3c0.Na);
                        int i2 = userMedal.fanbaseGrade;
                        gm0 gm0Var = this.f22324f;
                        c cVarI = h9g.i(i2, gm0Var.b, gm0Var.a);
                        if (cVarI != null && (mcrVar = this.f22325g) != null) {
                            mcrVar.duringCreated(cVarI).subscribe(ffw.e(new e30() { // from class: l.rtn0
                                public final void call(Object obj) {
                                    wtn0.m24543b(commonMedalView, (imf0) obj);
                                }
                            }, new e30() { // from class: l.stn0
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
    public void m24561t(mcr mcrVar) {
        this.f22325g = mcrVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m24562u(View view, String str, String str2) {
        ptk ptkVarM20688h = ptk.m20688h();
        jtk jtkVarM17214v = new jtk(this.f22319a).m17213u(str).m17197e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m17203k(true).m17212t(12).m17214v(false);
        int i = t100.i;
        int i2 = t100.f;
        this.f22322d = ptkVarM20688h.m20702t(jtkVarM17214v.m17211s(i, i2, i, i2).m17201i(jtk.f15293A).m17193a(8000L).m17194b(new jtk.InterfaceC0979a() { // from class: l.ttn0
            @Override // p009l.jtk.InterfaceC0979a
            /* JADX INFO: renamed from: a */
            public final void mo17215a(String str3) {
                this.f20863a.m24555n(str3);
            }
        }).m17196d(new jtk.InterfaceC0980b() { // from class: l.utn0
            @Override // p009l.jtk.InterfaceC0980b
            /* JADX INFO: renamed from: a */
            public final void mo17216a(String str3) {
                this.f21335a.m24556o(str3);
            }
        }), view);
        this.f22321c = str2;
    }

    /* JADX INFO: renamed from: v */
    public void m24563v(gm0 gm0Var) {
        this.f22324f = gm0Var;
    }
}
