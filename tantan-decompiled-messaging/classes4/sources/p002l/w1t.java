package p002l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserMedal;
import com.p1.mobile.putong.data.UserMedalWrapper;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p1.mobile.putong.live.base.data.BLiveMedal;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.agv;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.imf0;
import l.jtk;
import l.mcr;
import l.ptk;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ycu;
import l.ypv;
import l.zvf0;
import rx.c;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w1t {

    /* JADX INFO: renamed from: a */
    public Context f21417a;

    /* JADX INFO: renamed from: b */
    public List<CommonMedalView> f21418b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f21419c = "";

    /* JADX INFO: renamed from: d */
    public String f21420d;

    /* JADX INFO: renamed from: e */
    public boolean f21421e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public gm0 f21422f;

    /* JADX INFO: renamed from: g */
    public e30<BLiveMedal> f21423g;

    /* JADX INFO: renamed from: h */
    public mcr f21424h;

    public w1t(boolean z) {
        this.f21421e = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m24266h(CommonMedalView commonMedalView, imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m9456b().getWidth() > 0) {
                Bitmap bitmapM9456b = a9gVar.m9456b();
                xdl0.D0((int) (((bitmapM9456b.getWidth() * 1.0f) / bitmapM9456b.getHeight()) * (commonMedalView.getHeight() > 0 ? commonMedalView.getHeight() : t100.d(14.0f))), new View[]{commonMedalView});
            } else {
                xdl0.D0(t100.d(50.0f), new View[]{commonMedalView});
            }
        } else {
            xdl0.D0(t100.d(50.0f), new View[]{commonMedalView});
        }
        commonMedalView.setBackground(imf0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m24268j(VDraweeView vDraweeView, imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m9456b().getWidth() > 0) {
                Bitmap bitmapM9456b = a9gVar.m9456b();
                xdl0.D0((int) (((bitmapM9456b.getWidth() * 1.0f) / bitmapM9456b.getHeight()) * vDraweeView.getHeight()), new View[]{vDraweeView});
            } else {
                xdl0.D0(t100.d(50.0f), new View[]{vDraweeView});
            }
        } else {
            xdl0.D0(t100.d(50.0f), new View[]{vDraweeView});
        }
        vDraweeView.setBackground(imf0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static void m24269v(CommonMedalView commonMedalView, imf0 imf0Var) {
        commonMedalView.setBackground(imf0Var);
        if ((imf0Var instanceof z3g) && ((z3g) imf0Var).m27057f()) {
            ex4.m12832z(commonMedalView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void m24270A(VDraweeView vDraweeView, int i) {
        UserWealthGradeConfig userWealthGradeConfigX = ((ggv) ypv.l(fld0.c)).x(i);
        if (TextUtils.isEmpty(userWealthGradeConfigX.wealthIconUrl)) {
            return;
        }
        xdl0.M(vDraweeView, true);
        xdl0.D0(t100.d(32.0f), new View[]{vDraweeView});
        qib0.G.Z0(vDraweeView, userWealthGradeConfigX.wealthIconUrl);
    }

    /* JADX INFO: renamed from: B */
    public void m24271B(e30<BLiveMedal> e30Var) {
        this.f21423g = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public void m24272C(mcr mcrVar) {
        this.f21424h = mcrVar;
    }

    /* JADX INFO: renamed from: D */
    public void m24273D(View view, String str, String str2) {
        ptk ptkVarH = ptk.h();
        jtk jtkVarV = new jtk(this.f21417a).u(str).e(new int[]{Color.parseColor("#f79533"), Color.parseColor("#f7c333")}).k(true).t(12).v(false);
        int i = t100.i;
        int i2 = t100.f;
        this.f21420d = ptkVarH.t(jtkVarV.s(i, i2, i, i2).i(jtk.A).a(8000L).b(new jtk.a() { // from class: l.s1t
            /* JADX INFO: renamed from: a */
            public final void m22189a(String str3) {
                this.f18761a.m24282r(str3);
            }
        }).d(new jtk.b() { // from class: l.t1t
            /* JADX INFO: renamed from: a */
            public final void m22773a(String str3) {
                this.f19365a.m24283s(str3);
            }
        }), view);
        this.f21419c = str2;
    }

    /* JADX INFO: renamed from: E */
    public void m24274E(gm0 gm0Var) {
        this.f21422f = gm0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m24275k(Context context, @NonNull CommonMedalView... commonMedalViewArr) {
        vwb.z(this.f21418b, new e30() { // from class: l.k1t
            public final void call(Object obj) {
                ((CommonMedalView) obj).m6823k0();
            }
        });
        this.f21418b.clear();
        Collections.addAll(this.f21418b, commonMedalViewArr);
        this.f21417a = context;
    }

    /* JADX INFO: renamed from: l */
    public void m24276l() {
        m24277m();
        this.f21418b.clear();
        this.f21419c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m24277m() {
        if (this.f21420d != null) {
            ptk.h().g(this.f21420d);
            this.f21420d = null;
        }
        this.f21419c = null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24278n(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.familyText);
    }

    /* JADX INFO: renamed from: o */
    public boolean m24279o(UserMedal userMedal) {
        return !TextUtils.isEmpty(userMedal.voiceFanbaseText);
    }

    /* JADX INFO: renamed from: p */
    public boolean m24280p(String str) {
        return TextUtils.equals(this.f21419c, str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m24281q(BLiveMedal bLiveMedal, User user, boolean z, View view) {
        m24284t(bLiveMedal, view, user.isMe(), z);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m24282r(String str) {
        m24277m();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m24283s(String str) {
        this.f21420d = null;
        this.f21419c = "";
    }

    /* JADX INFO: renamed from: t */
    public void m24284t(@NonNull BLiveMedal bLiveMedal, View view, boolean z, boolean z2) {
        String strM18043D = mmj.m18043D(z ? bLiveMedal.i18nMainDescription : bLiveMedal.i18nGuestDescription);
        if (bLiveMedal.id.equals(this.f21419c)) {
            m24277m();
            return;
        }
        m24277m();
        zvf0.r(ycu.e, "p_audio_profile");
        if (z2 && NullChecker.a(this.f21423g)) {
            this.f21423g.call(bLiveMedal);
        } else {
            m24273D(view, strM18043D, bLiveMedal.id);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m24285u(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalJ = ((ggv) ypv.l(fld0.c)).j(userMedal.familyGrade);
        if (bLiveIntlVoiceMedalJ == null) {
            return;
        }
        nvp nvpVarM19134m = nvp.C0710a.m19133n().m19145y("family").m19139s(userMedal.familyGrade).m19146z(userMedal.familyText).m19141u(bLiveIntlVoiceMedalJ.icon).m19142v(userMedal.familyLight).m19144x(bLiveIntlVoiceMedalJ.startColor).m19137q(bLiveIntlVoiceMedalJ.endColor).m19136p(bLiveIntlVoiceMedalJ.borderColor).m19138r("not_chat").m19134m();
        commonMedalView.setImageResource(i3c0.f12589Na);
        xdl0.D0(z3g.m27052h(null, nvpVarM19134m.m19115j(), nvpVarM19134m.m19111f()), new View[]{commonMedalView});
        c<imf0> cVarM12184e = e4g.m12184e(nvpVarM19134m);
        if (cVarM12184e == null || (mcrVar = this.f21424h) == null) {
            return;
        }
        mcrVar.duringCreated(cVarM12184e).subscribe(ffw.e(new e30() { // from class: l.q1t
            public final void call(Object obj) {
                w1t.m24269v(commonMedalView, (imf0) obj);
            }
        }, new e30() { // from class: l.r1t
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: w */
    public void m24286w(final VDraweeView vDraweeView, int i) {
        mcr mcrVar;
        if (!ypv.k().P6() || this.f21422f == null) {
            return;
        }
        vDraweeView.setImageResource(i3c0.f12589Na);
        gm0 gm0Var = this.f21422f;
        c<imf0> cVarM14299i = h9g.m14299i(i, gm0Var.f11510b, gm0Var.f11509a);
        if (cVarM14299i == null || (mcrVar = this.f21424h) == null) {
            return;
        }
        mcrVar.duringCreated(cVarM14299i).subscribe(ffw.e(new e30() { // from class: l.l1t
            public final void call(Object obj) {
                w1t.m24268j(vDraweeView, (imf0) obj);
            }
        }, new e30() { // from class: l.m1t
            public final void call(Object obj) {
                vDraweeView.setBackground(null);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public void m24287x(final CommonMedalView commonMedalView, UserMedal userMedal) {
        mcr mcrVar;
        BLiveIntlVoiceMedal bLiveIntlVoiceMedalN = ((ggv) ypv.l(fld0.c)).n(userMedal.voiceFanbaseGrade);
        if (bLiveIntlVoiceMedalN == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = commonMedalView.getLayoutParams();
        nvp nvpVarM19134m = nvp.C0710a.m19133n().m19145y("voiceFanBase").m19139s(userMedal.voiceFanbaseGrade).m19146z(userMedal.voiceFanbaseText).m19143w(userMedal.voiceFanbaseColor).m19141u(bLiveIntlVoiceMedalN.icon).m19144x(bLiveIntlVoiceMedalN.startColor).m19137q(bLiveIntlVoiceMedalN.endColor).m19136p(bLiveIntlVoiceMedalN.borderStartColor).m19135o(bLiveIntlVoiceMedalN.borderEndColor).m19140t((layoutParams == null || layoutParams.height <= t100.d(20.0f)) ? t100.d(20.0f) : layoutParams.height).m19138r("not_chat").m19134m();
        commonMedalView.setImageResource(i3c0.f12589Na);
        int iM23745e = v4n0.m23745e(null, nvpVarM19134m.m19115j(), nvpVarM19134m.m19111f());
        xdl0.C0(commonMedalView, nvpVarM19134m.m19111f());
        xdl0.D0(iM23745e, new View[]{commonMedalView});
        c<imf0> cVarM12184e = e4g.m12184e(nvpVarM19134m);
        if (cVarM12184e == null || (mcrVar = this.f21424h) == null) {
            return;
        }
        mcrVar.duringCreated(cVarM12184e).subscribe(ffw.e(new e30() { // from class: l.u1t
            public final void call(Object obj) {
                commonMedalView.setBackground((imf0) obj);
            }
        }, new e30() { // from class: l.v1t
            public final void call(Object obj) {
                commonMedalView.setBackground(null);
            }
        }));
        xdl0.M(commonMedalView, true);
    }

    /* JADX INFO: renamed from: y */
    public void m24288y(@NonNull User user) {
        m24289z(user, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView] */
    /* JADX INFO: renamed from: z */
    public void m24289z(@NonNull final User user, final boolean z) {
        int i;
        mcr mcrVar;
        Iterator<CommonMedalView> it = this.f21418b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ConstraintLayout constraintLayout = (CommonMedalView) it.next();
            xdl0.M(constraintLayout, false);
            constraintLayout.setOnClickListener(null);
        }
        if (this.f21418b.isEmpty()) {
            return;
        }
        if (vwb.J(user.medal.singleRoomMedals) && vwb.J(user.medal.multiRoomMedals)) {
            return;
        }
        UserMedalWrapper userMedalWrapper = user.medal;
        for (UserMedal userMedal : dck0.m11737e(userMedalWrapper.singleRoomMedals, userMedalWrapper.multiRoomMedals)) {
            if (i >= this.f21418b.size()) {
                break;
            }
            final CommonMedalView commonMedalView = this.f21418b.get(i);
            if (m24278n(userMedal)) {
                m24285u(commonMedalView, userMedal);
            } else if (m24279o(userMedal)) {
                m24287x(commonMedalView, userMedal);
            } else {
                final BLiveMedal bLiveMedalT = ((ggv) ypv.l(fld0.c)).t(userMedal.id, "live", user.medal.version);
                if (bLiveMedalT != null) {
                    xdl0.M0(commonMedalView, true);
                    if (this.f21421e) {
                        xdl0.E0(commonMedalView, new View.OnClickListener() { // from class: l.n1t
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f15788a.m24281q(bLiveMedalT, user, z, view);
                            }
                        });
                    } else {
                        commonMedalView.setOnClickListener(null);
                    }
                    if (!bLiveMedalT.isFanbaseMedal()) {
                        commonMedalView.setBackground(null);
                        agv.j(commonMedalView, bLiveMedalT.getStaticUrl(), bLiveMedalT.getDynamicUrl());
                    } else if (ypv.k().P6() && this.f21422f != null) {
                        commonMedalView.setImageResource(i3c0.f12589Na);
                        int i2 = userMedal.fanbaseGrade;
                        gm0 gm0Var = this.f21422f;
                        c<imf0> cVarM14299i = h9g.m14299i(i2, gm0Var.f11510b, gm0Var.f11509a);
                        if (cVarM14299i != null && (mcrVar = this.f21424h) != null) {
                            mcrVar.duringCreated(cVarM14299i).subscribe(ffw.e(new e30() { // from class: l.o1t
                                public final void call(Object obj) {
                                    w1t.m24266h(commonMedalView, (imf0) obj);
                                }
                            }, new e30() { // from class: l.p1t
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
        zvf0.x(ycu.e, "p_audio_profile");
    }
}
