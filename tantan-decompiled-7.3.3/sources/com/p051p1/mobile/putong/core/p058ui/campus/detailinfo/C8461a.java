package com.p051p1.mobile.putong.core.p058ui.campus.detailinfo;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import cn.qqtheme.framework.wheelview.WheelView;
import cn.qqtheme.framework.wheelview.adapter.NumericWheelAdapter;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.campus.SelectSchoolAct;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentCardPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StudentVerification;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.sql.Date;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;
import p153l.adc0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.fo0;
import p153l.fph0;
import p153l.iam;
import p153l.kec0;
import p153l.l7y;
import p153l.lag0;
import p153l.o1j0;
import p153l.psd0;
import p153l.q1e;
import p153l.qa00;
import p153l.qcj;
import p153l.s9g0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.detailinfo.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8461a implements iam<StudentInfoPresenter> {

    /* JADX INFO: renamed from: a */
    public VFrame f29526a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit_FakeSpinner f29527b;

    /* JADX INFO: renamed from: c */
    public VText f29528c;

    /* JADX INFO: renamed from: d */
    public VFrame f29529d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit_FakeSpinner f29530e;

    /* JADX INFO: renamed from: f */
    public VText f29531f;

    /* JADX INFO: renamed from: g */
    public VText f29532g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f29533h;

    /* JADX INFO: renamed from: i */
    public VFrame f29534i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f29535j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f29536k;

    /* JADX INFO: renamed from: l */
    public VFrame f29537l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f29538m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f29539n;

    /* JADX INFO: renamed from: o */
    public VText f29540o;

    /* JADX INFO: renamed from: p */
    public VText f29541p;

    /* JADX INFO: renamed from: q */
    public VText f29542q;

    /* JADX INFO: renamed from: r */
    public VButton_FakeShadow f29543r;

    /* JADX INFO: renamed from: s */
    public StudentInfoPresenter f29544s;

    /* JADX INFO: renamed from: t */
    public StudentInfoAct f29545t;

    /* JADX INFO: renamed from: u */
    public Dialog f29546u;

    /* JADX INFO: renamed from: v */
    public View f29547v;

    public C8461a(StudentInfoAct studentInfoAct) {
        this.f29545t = studentInfoAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m45707K(View view) {
        StudentInfoAct studentInfoAct = this.f29545t;
        studentInfoAct.startActivity(AccessTokenWebViewAct.m81333a2(studentInfoAct, "", CoreModule.f18265d.m144645g().graduateActivity.entranceUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m45708L(View view) {
        if (TextUtils.isEmpty(this.f29544s.m45703u0())) {
            o1j0.m165651y(this.f29545t.getString(R$string.f18379D0));
        } else {
            m45749Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m45709M(View view) {
        this.f29544s.f29516b = StudentInfoPresenter.PicType.FRONT;
        m45735B("http://auto.tancdn.com/v1/images/eyJpZCI6IlVMWlNaMkZGNUhIT1UyR09INU43RlVSU0pGSDdONSIsInciOjcyNiwiaCI6NDI5LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ4NTIxODA4NDcwOTI0NjkzOTB9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m45710N(View view) {
        this.f29544s.f29516b = StudentInfoPresenter.PicType.BACK;
        m45735B("http://auto.tancdn.com/v1/images/eyJpZCI6Ik1PQTNVTlFQWE1aUVVEQjdJWVM1TUZKU0ZJV003USIsInciOjcyNiwiaCI6NDI4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTE1MDIzNjEyNjY3Nzk1MzY5MjV9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m45711O(View view) {
        this.f29544s.f29516b = StudentInfoPresenter.PicType.FRONT;
        this.f29545t.startActivityForResultWithCustomTransition(StudentCardPreviewAct.m45658d2(getAct(), this.f29544s.m45702t0(), false), 1, new s9g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m45712P(View view) {
        this.f29544s.f29516b = StudentInfoPresenter.PicType.BACK;
        this.f29545t.startActivityForResultWithCustomTransition(StudentCardPreviewAct.m45658d2(getAct(), this.f29544s.m45701s0(), false), 1, new s9g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m45713Q(View view) {
        this.f29544s.m45696V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m45714R(View view) {
        StudentInfoAct studentInfoAct = this.f29545t;
        studentInfoAct.startActivityForResult(SelectSchoolAct.m45652X1(studentInfoAct, this.f29544s.m45682D0(), this.f29544s.m45703u0(), false), 0);
    }

    /* JADX INFO: renamed from: a0 */
    private void m45716a0() {
        boolean zM45705y0 = this.f29544s.m45705y0();
        this.f29543r.setActivated(!zM45705y0);
        this.f29543r.setClickable(zM45705y0);
    }

    /* JADX INFO: renamed from: A */
    public void m45734A(String str, StudentVerification studentVerification) {
        this.f29527b.setText(str);
        String str2 = studentVerification.startTime;
        if (TextUtils.isEmpty(str2)) {
            this.f29530e.setText("");
        } else if (!str2.endsWith("-01") || str2.length() < 10) {
            CrashHelper.m82480d(new Throwable("IllegalStateException startTime:" + str2 + "user id" + CoreModule.m30929H().userId()), 100);
            this.f29530e.setText(studentVerification.startTime);
        } else {
            this.f29530e.setText(str2.substring(0, str2.lastIndexOf("-01")));
        }
        if (TEnum.equals(studentVerification.status, StudentVerificationStatus.preVerified) && !m45739G()) {
            boolean zM45706z0 = this.f29544s.m45706z0();
            this.f29543r.setActivated(!zM45706z0);
            this.f29543r.setClickable(zM45706z0);
            return;
        }
        if (m45752c0() == 0) {
            this.f29544s.m45695U0(studentVerification.pictures);
        }
        if (NullChecker.m82486a(studentVerification.rejectionReasons) && studentVerification.rejectionReasons.size() > 0) {
            StudentInfoPresenter studentInfoPresenter = this.f29544s;
            if (studentInfoPresenter.f29519e) {
                studentInfoPresenter.m45680A0(studentVerification.rejectionReasons);
            }
            m45753d0();
        }
        m45716a0();
    }

    /* JADX INFO: renamed from: B */
    public final void m45735B(String str) {
        if (this.f29547v == null) {
            this.f29547v = this.f29545t.inflater().inflate(kec0.f126158ye, (ViewGroup) null, false);
        }
        m45738F();
        if (this.f29546u == null) {
            this.f29546u = new Dialog(this.f29545t, 0);
        }
        VDraweeView vDraweeView = (VDraweeView) this.f29547v.findViewById(adc0.f70099R5);
        vDraweeView.setHierarchy(uqb0.f180374G.m98795l().m211636K(RoundingParams.m8303c(qa00.m175859d(12.0f))).m211638a());
        vDraweeView.setImageURI(str);
        this.f29546u.setTitle((CharSequence) null);
        this.f29546u.setContentView(this.f29547v);
        this.f29546u.setCancelable(true);
        this.f29546u.show();
        m45758z(this.f29546u, 80, true, 1.0d);
    }

    /* JADX INFO: renamed from: C */
    public final Pair<WheelView, NumericWheelAdapter> m45736C(View view) {
        WheelView wheelView = (WheelView) view.findViewById(adc0.f70126Sf);
        NumericWheelAdapter numericWheelAdapter = new NumericWheelAdapter(this.f29545t, 1, 12, "%02d");
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(c9c0.f80400b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(false);
        wheelView.setCurrentItem(8);
        return new Pair<>(wheelView, numericWheelAdapter);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f29545t;
    }

    /* JADX INFO: renamed from: E */
    public final Pair<WheelView, NumericWheelAdapter> m45737E(View view) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(uqb0.f180376H.guessedCurrentServerTime()));
        int i = calendar.get(1);
        WheelView wheelView = (WheelView) view.findViewById(adc0.f70143Tf);
        NumericWheelAdapter numericWheelAdapter = new NumericWheelAdapter(this.f29545t, i - 10, i + 3);
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(c9c0.f80400b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(false);
        wheelView.setCurrentItem(10);
        return new Pair<>(wheelView, numericWheelAdapter);
    }

    /* JADX INFO: renamed from: F */
    public final void m45738F() {
        ((VText) this.f29547v.findViewById(adc0.f69894F4)).setOnClickListener(new View.OnClickListener() { // from class: l.kag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124679a.m45742J(view);
            }
        });
        ((VText) this.f29547v.findViewById(adc0.f69877E4)).setOnClickListener(new View.OnClickListener() { // from class: l.u9g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178117a.m45740H(view);
            }
        });
        ((VText) this.f29547v.findViewById(adc0.f70077Q0)).setOnClickListener(new View.OnClickListener() { // from class: l.v9g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183001a.m45741I(view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public boolean m45739G() {
        return this.f29533h.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m45740H(View view) {
        this.f29545t.pickImagesWithPicker(1, false, false, false, fph0.f100172e);
        if (NullChecker.m82486a(this.f29546u) && this.f29546u.isShowing()) {
            this.f29546u.dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m45741I(View view) {
        this.f29546u.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m45742J(View view) {
        l7y.m153160l(this.f29545t);
        if (NullChecker.m82486a(this.f29546u) && this.f29546u.isShowing()) {
            this.f29546u.dismiss();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m45743S(Pair pair, Pair pair2) {
        this.f29544s.m45700r0(((NumericWheelAdapter) pair.second).getItemText(((WheelView) pair.first).getCurrentItem()) + "-" + ((NumericWheelAdapter) pair2.second).getItemText(((WheelView) pair2.first).getCurrentItem()) + "-01");
        this.f29544s.f29520f.f29522b = false;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m45744T(VDraweeView vDraweeView, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i, VText vText, q1e q1eVar, Long l2) {
        ((AnimationDrawable) vDraweeView.getBackground()).start();
        float interpolation = accelerateDecelerateInterpolator.getInterpolation(l2.longValue() / (i - 1.0f));
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setRoundingMode(RoundingMode.FLOOR);
        vText.setText(getAct().getString(R$string.f19818y0) + "(" + percentInstance.format(interpolation) + ")");
        if (l2.longValue() == i - 1) {
            ((AnimationDrawable) vDraweeView.getBackground()).stop();
            q1eVar.m174879k(1, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m45745U(C22421c c22421c, final VDraweeView vDraweeView, final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, final int i, final VText vText, final q1e q1eVar, DialogInterface dialogInterface) {
        c22421c.subscribe(psd0.m173596G(new y20() { // from class: l.bag0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75687a.m45744T(vDraweeView, accelerateDecelerateInterpolator, i, vText, q1eVar, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ com.p051p1.mobile.android.app.Dialog m45746V(final q1e q1eVar) {
        final com.p051p1.mobile.android.app.Dialog dialogM21566z = getAct().dialog().m21516M(kec0.f125786cf).m21495B(false).m21566z();
        View viewM21457P = dialogM21566z.m21457P();
        final VText vText = (VText) viewM21457P.findViewById(adc0.f70205Xa);
        final VDraweeView vDraweeView = (VDraweeView) viewM21457P.findViewById(adc0.f70221Ya);
        final int i = 15;
        final C22421c<Long> c22421cObserveOn = C22421c.interval(200L, TimeUnit.MILLISECONDS).onBackpressureLatest().take(15).takeWhile(new qcj() { // from class: l.y9g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(dialogM21566z.isShowing());
            }
        }).observeOn(fo0.m126432a());
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        dialogM21566z.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.z9g0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f203481a.m45745U(c22421cObserveOn, vDraweeView, accelerateDecelerateInterpolator, i, vText, q1eVar, dialogInterface);
            }
        });
        return dialogM21566z;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m45747W(q1e q1eVar) {
        q1eVar.m174875g();
        getAct().m48999H2();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ com.p051p1.mobile.android.app.Dialog m45748X(final q1e q1eVar) {
        return getAct().dialog().m21558v().m21502E0(R$string.f18627L0).m21532c0(dbc0.f87365qv).m21563x0(getAct().getResources().getDrawable(dbc0.f87227mp)).m21555t0(R$string.f18317B0, new Runnable() { // from class: l.aag0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69141a.m45747W(q1eVar);
            }
        }).m21495B(false).m21566z();
    }

    /* JADX INFO: renamed from: Y */
    public final void m45749Y() {
        View viewInflate = this.f29545t.inflater().inflate(kec0.f126175ze, (ViewGroup) null);
        final Pair<WheelView, NumericWheelAdapter> pairM45737E = m45737E(viewInflate);
        final Pair<WheelView, NumericWheelAdapter> pairM45736C = m45736C(viewInflate);
        this.f29545t.dialog().m21502E0(R$string.f18286A0).m21518O(viewInflate).m21558v().m21555t0(R$string.f19383k, new Runnable() { // from class: l.jag0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118981a.m45743S(pairM45737E, pairM45736C);
            }
        }).m21563x0(this.f29545t.drawable(dbc0.f87227mp)).m21567z0();
    }

    /* JADX INFO: renamed from: Z */
    public void m45750Z(Media media) {
        boolean z = media instanceof Picture;
        LinearLayout linearLayout = this.f29538m;
        if (!z) {
            linearLayout.setVisibility(0);
            this.f29539n.setVisibility(4);
            return;
        }
        linearLayout.setVisibility(4);
        this.f29539n.setVisibility(0);
        Picture picture = (Picture) media;
        this.f29539n.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        uqb0.f180374G.m127125Q0(this.f29539n, picture.calculatedWidth(picture.size.width));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f29545t;
    }

    /* JADX INFO: renamed from: b0 */
    public void m45751b0(Media media) {
        boolean z = media instanceof Picture;
        LinearLayout linearLayout = this.f29535j;
        if (!z) {
            linearLayout.setVisibility(0);
            this.f29536k.setVisibility(4);
            return;
        }
        linearLayout.setVisibility(4);
        this.f29536k.setVisibility(0);
        Picture picture = (Picture) media;
        this.f29536k.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        uqb0.f180374G.m127125Q0(this.f29536k, picture.calculatedWidth(picture.size.width));
    }

    /* JADX INFO: renamed from: c0 */
    public final int m45752c0() {
        int i = this.f29544s.m45706z0() ? 0 : 4;
        this.f29533h.setVisibility(i);
        return i;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m45753d0() {
        boolean z = this.f29544s.f29520f.f29521a;
        VText vText = this.f29528c;
        if (z) {
            vText.setVisibility(0);
            this.f29527b.setForcePrimaryColor(true);
        } else {
            vText.setVisibility(4);
            this.f29527b.setForcePrimaryColor(false);
        }
        boolean z2 = this.f29544s.f29520f.f29522b;
        VText vText2 = this.f29531f;
        if (z2) {
            vText2.setVisibility(0);
            this.f29530e.setForcePrimaryColor(true);
        } else {
            vText2.setVisibility(4);
            this.f29530e.setForcePrimaryColor(false);
        }
        boolean z3 = this.f29544s.f29520f.f29523c;
        VText vText3 = this.f29540o;
        if (z3) {
            vText3.setVisibility(0);
            this.f29534i.setBackgroundResource(dbc0.f86711Wu);
        } else {
            vText3.setVisibility(4);
            this.f29534i.setBackgroundResource(dbc0.f86679Vu);
        }
        boolean z4 = this.f29544s.f29520f.f29524d;
        VText vText4 = this.f29541p;
        if (z4) {
            vText4.setVisibility(0);
            this.f29537l.setBackgroundResource(dbc0.f86711Wu);
        } else {
            vText4.setVisibility(4);
            this.f29537l.setBackgroundResource(dbc0.f86679Vu);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m45754e0(boolean z) {
        getAct().progressDismiss();
        if (z) {
            getAct().flow().m174883o(new qcj() { // from class: l.w9g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f188011a.m45746V((q1e) obj);
                }
            }, new qcj() { // from class: l.x9g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f192940a.m45748X((q1e) obj);
                }
            }).m174885q();
        } else {
            o1j0.m165651y(getAct().getString(R$string.f18534I0));
            getAct().m48999H2();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m45756x(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m45755r() {
        StudentInfoAct studentInfoAct = this.f29545t;
        studentInfoAct.setTitle(studentInfoAct.getString(R$string.f18410E0));
        if (CoreModule.f18265d.m217951O()) {
            this.f29532g.setVisibility(0);
            this.f29532g.setText(CoreModule.f18265d.m144645g().graduateActivity.name);
        }
        this.f29532g.setOnClickListener(new View.OnClickListener() { // from class: l.t9g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172638a.m45707K(view);
            }
        });
        this.f29530e.setOnClickListener(new View.OnClickListener() { // from class: l.cag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80588a.m45708L(view);
            }
        });
        this.f29535j.setOnClickListener(new View.OnClickListener() { // from class: l.dag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85872a.m45709M(view);
            }
        });
        this.f29538m.setOnClickListener(new View.OnClickListener() { // from class: l.eag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92783a.m45710N(view);
            }
        });
        this.f29536k.setOnClickListener(new View.OnClickListener() { // from class: l.fag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97981a.m45711O(view);
            }
        });
        this.f29539n.setOnClickListener(new View.OnClickListener() { // from class: l.gag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102983a.m45712P(view);
            }
        });
        this.f29543r.setOnClickListener(new View.OnClickListener() { // from class: l.hag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108496a.m45713Q(view);
            }
        });
        this.f29527b.setOnClickListener(new View.OnClickListener() { // from class: l.iag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113593a.m45714R(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public View m45756x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lag0.m153500b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(StudentInfoPresenter studentInfoPresenter) {
        this.f29544s = studentInfoPresenter;
    }

    /* JADX INFO: renamed from: z */
    public final void m45758z(Dialog dialog, int i, boolean z, double d) {
        Window window = dialog.getWindow();
        window.setGravity(i);
        window.setBackgroundDrawableResource(c9c0.f80468w1);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        DisplayMetrics displayMetricsM175858c = qa00.m175858c();
        Rect rect = new Rect();
        this.f29545t.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (z) {
            int i2 = rect.bottom;
            if (i2 != displayMetricsM175858c.heightPixels) {
                attributes.height = i2 - rect.top;
            } else {
                window.setGravity(80);
                attributes.height = displayMetricsM175858c.heightPixels - rect.top;
            }
        }
        attributes.width = (int) (((double) displayMetricsM175858c.widthPixels) * d);
        window.setAttributes(attributes);
    }
}
