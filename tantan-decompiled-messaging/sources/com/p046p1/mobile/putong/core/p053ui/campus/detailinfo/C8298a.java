package com.p046p1.mobile.putong.core.p053ui.campus.detailinfo;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.campus.SelectSchoolAct;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentCardPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.sql.Date;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;
import p149l.c0e;
import p149l.e2g0;
import p149l.e30;
import p149l.f6c0;
import p149l.jo0;
import p149l.l1g0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.oyx;
import p149l.qib0;
import p149l.s7m;
import p149l.t100;
import p149l.u4c0;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.ygh0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.detailinfo.a */
/* JADX INFO: loaded from: classes10.dex */
public class C8298a implements s7m<StudentInfoPresenter> {

    /* JADX INFO: renamed from: a */
    public VFrame f28678a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit_FakeSpinner f28679b;

    /* JADX INFO: renamed from: c */
    public VText f28680c;

    /* JADX INFO: renamed from: d */
    public VFrame f28681d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit_FakeSpinner f28682e;

    /* JADX INFO: renamed from: f */
    public VText f28683f;

    /* JADX INFO: renamed from: g */
    public VText f28684g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f28685h;

    /* JADX INFO: renamed from: i */
    public VFrame f28686i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f28687j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f28688k;

    /* JADX INFO: renamed from: l */
    public VFrame f28689l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f28690m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f28691n;

    /* JADX INFO: renamed from: o */
    public VText f28692o;

    /* JADX INFO: renamed from: p */
    public VText f28693p;

    /* JADX INFO: renamed from: q */
    public VText f28694q;

    /* JADX INFO: renamed from: r */
    public VButton_FakeShadow f28695r;

    /* JADX INFO: renamed from: s */
    public StudentInfoPresenter f28696s;

    /* JADX INFO: renamed from: t */
    public StudentInfoAct f28697t;

    /* JADX INFO: renamed from: u */
    public Dialog f28698u;

    /* JADX INFO: renamed from: v */
    public View f28699v;

    public C8298a(StudentInfoAct studentInfoAct) {
        this.f28697t = studentInfoAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m44524K(View view) {
        StudentInfoAct studentInfoAct = this.f28697t;
        studentInfoAct.startActivity(AccessTokenWebViewAct.m80150Z1(studentInfoAct, "", CoreModule.f17546d.m95177g().graduateActivity.entranceUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m44525L(View view) {
        if (TextUtils.isEmpty(this.f28696s.m44520u0())) {
            lsi0.m151595y(this.f28697t.getString(R$string.f17657D0));
        } else {
            m44566Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m44526M(View view) {
        this.f28696s.f28668b = StudentInfoPresenter.PicType.FRONT;
        m44552B("http://auto.tancdn.com/v1/images/eyJpZCI6IlVMWlNaMkZGNUhIT1UyR09INU43RlVSU0pGSDdONSIsInciOjcyNiwiaCI6NDI5LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ4NTIxODA4NDcwOTI0NjkzOTB9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m44527N(View view) {
        this.f28696s.f28668b = StudentInfoPresenter.PicType.BACK;
        m44552B("http://auto.tancdn.com/v1/images/eyJpZCI6Ik1PQTNVTlFQWE1aUVVEQjdJWVM1TUZKU0ZJV003USIsInciOjcyNiwiaCI6NDI4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTE1MDIzNjEyNjY3Nzk1MzY5MjV9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m44528O(View view) {
        this.f28696s.f28668b = StudentInfoPresenter.PicType.FRONT;
        this.f28697t.startActivityForResultWithCustomTransition(StudentCardPreviewAct.m44475c2(getAct(), this.f28696s.m44519t0(), false), 1, new l1g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m44529P(View view) {
        this.f28696s.f28668b = StudentInfoPresenter.PicType.BACK;
        this.f28697t.startActivityForResultWithCustomTransition(StudentCardPreviewAct.m44475c2(getAct(), this.f28696s.m44518s0(), false), 1, new l1g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m44530Q(View view) {
        this.f28696s.m44513V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m44531R(View view) {
        StudentInfoAct studentInfoAct = this.f28697t;
        studentInfoAct.startActivityForResult(SelectSchoolAct.m44469V1(studentInfoAct, this.f28696s.m44499D0(), this.f28696s.m44520u0(), false), 0);
    }

    /* JADX INFO: renamed from: a0 */
    private void m44533a0() {
        boolean zM44522y0 = this.f28696s.m44522y0();
        this.f28695r.setActivated(!zM44522y0);
        this.f28695r.setClickable(zM44522y0);
    }

    /* JADX INFO: renamed from: A */
    public void m44551A(String str, StudentVerification studentVerification) {
        this.f28679b.setText(str);
        String str2 = studentVerification.startTime;
        if (TextUtils.isEmpty(str2)) {
            this.f28682e.setText("");
        } else if (!str2.endsWith("-01") || str2.length() < 10) {
            CrashHelper.m81297d(new Throwable("IllegalStateException startTime:" + str2 + "user id" + CoreModule.m29931H().userId()), 100);
            this.f28682e.setText(studentVerification.startTime);
        } else {
            this.f28682e.setText(str2.substring(0, str2.lastIndexOf("-01")));
        }
        if (TEnum.equals(studentVerification.status, StudentVerificationStatus.preVerified) && !m44556G()) {
            boolean zM44523z0 = this.f28696s.m44523z0();
            this.f28695r.setActivated(!zM44523z0);
            this.f28695r.setClickable(zM44523z0);
            return;
        }
        if (m44569c0() == 0) {
            this.f28696s.m44512U0(studentVerification.pictures);
        }
        if (NullChecker.m81303a(studentVerification.rejectionReasons) && studentVerification.rejectionReasons.size() > 0) {
            StudentInfoPresenter studentInfoPresenter = this.f28696s;
            if (studentInfoPresenter.f28671e) {
                studentInfoPresenter.m44497A0(studentVerification.rejectionReasons);
            }
            m44570d0();
        }
        m44533a0();
    }

    /* JADX INFO: renamed from: B */
    public final void m44552B(String str) {
        if (this.f28699v == null) {
            this.f28699v = this.f28697t.inflater().inflate(f6c0.f95985re, (ViewGroup) null, false);
        }
        m44555F();
        if (this.f28698u == null) {
            this.f28698u = new Dialog(this.f28697t, 0);
        }
        VDraweeView vDraweeView = (VDraweeView) this.f28699v.findViewById(u4c0.f173977P5);
        vDraweeView.setHierarchy(qib0.f154691G.m184722l().m116870K(RoundingParams.m8249c(t100.m186890d(12.0f))).m116872a());
        vDraweeView.setImageURI(str);
        this.f28698u.setTitle((CharSequence) null);
        this.f28698u.setContentView(this.f28699v);
        this.f28698u.setCancelable(true);
        this.f28698u.show();
        m44575z(this.f28698u, 80, true, 1.0d);
    }

    /* JADX INFO: renamed from: C */
    public final Pair<WheelView, NumericWheelAdapter> m44553C(View view) {
        WheelView wheelView = (WheelView) view.findViewById(u4c0.f173987Pf);
        NumericWheelAdapter numericWheelAdapter = new NumericWheelAdapter(this.f28697t, 1, 12, "%02d");
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(w0c0.f183831b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(false);
        wheelView.setCurrentItem(8);
        return new Pair<>(wheelView, numericWheelAdapter);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f28697t;
    }

    /* JADX INFO: renamed from: E */
    public final Pair<WheelView, NumericWheelAdapter> m44554E(View view) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(qib0.f154693H.guessedCurrentServerTime()));
        int i = calendar.get(1);
        WheelView wheelView = (WheelView) view.findViewById(u4c0.f174004Qf);
        NumericWheelAdapter numericWheelAdapter = new NumericWheelAdapter(this.f28697t, i - 10, i + 3);
        wheelView.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(w0c0.f183831b);
        numericWheelAdapter.setTextSize(20);
        wheelView.setCyclic(false);
        wheelView.setCurrentItem(10);
        return new Pair<>(wheelView, numericWheelAdapter);
    }

    /* JADX INFO: renamed from: F */
    public final void m44555F() {
        ((VText) this.f28699v.findViewById(u4c0.f173772D4)).setOnClickListener(new View.OnClickListener() { // from class: l.d2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83385a.m44559J(view);
            }
        });
        ((VText) this.f28699v.findViewById(u4c0.f173755C4)).setOnClickListener(new View.OnClickListener() { // from class: l.n1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136634a.m44557H(view);
            }
        });
        ((VText) this.f28699v.findViewById(u4c0.f173989Q0)).setOnClickListener(new View.OnClickListener() { // from class: l.o1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141429a.m44558I(view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public boolean m44556G() {
        return this.f28685h.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m44557H(View view) {
        this.f28697t.pickImagesWithPicker(1, false, false, false, ygh0.f198170e);
        if (NullChecker.m81303a(this.f28698u) && this.f28698u.isShowing()) {
            this.f28698u.dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m44558I(View view) {
        this.f28698u.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m44559J(View view) {
        oyx.m166738l(this.f28697t);
        if (NullChecker.m81303a(this.f28698u) && this.f28698u.isShowing()) {
            this.f28698u.dismiss();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m44560S(Pair pair, Pair pair2) {
        this.f28696s.m44517r0(((NumericWheelAdapter) pair.second).getItemText(((WheelView) pair.first).getCurrentItem()) + "-" + ((NumericWheelAdapter) pair2.second).getItemText(((WheelView) pair2.first).getCurrentItem()) + "-01");
        this.f28696s.f28672f.f28674b = false;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m44561T(VDraweeView vDraweeView, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i, VText vText, c0e c0eVar, Long l2) {
        ((AnimationDrawable) vDraweeView.getBackground()).start();
        float interpolation = accelerateDecelerateInterpolator.getInterpolation(l2.longValue() / (i - 1.0f));
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setRoundingMode(RoundingMode.FLOOR);
        vText.setText(getAct().getString(R$string.f19079y0) + "(" + percentInstance.format(interpolation) + ")");
        if (l2.longValue() == i - 1) {
            ((AnimationDrawable) vDraweeView.getBackground()).stop();
            c0eVar.m104740k(1, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m44562U(C22306c c22306c, final VDraweeView vDraweeView, final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, final int i, final VText vText, final c0e c0eVar, DialogInterface dialogInterface) {
        c22306c.subscribe(mkd0.m154955G(new e30() { // from class: l.u1g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173005a.m44561T(vDraweeView, accelerateDecelerateInterpolator, i, vText, c0eVar, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ com.p046p1.mobile.android.app.Dialog m44563V(final c0e c0eVar) {
        final com.p046p1.mobile.android.app.Dialog dialogM20567z = getAct().dialog().m20517M(f6c0.f95617Ve).m20496B(false).m20567z();
        View viewM20458P = dialogM20567z.m20458P();
        final VText vText = (VText) viewM20458P.findViewById(u4c0.f174082Va);
        final VDraweeView vDraweeView = (VDraweeView) viewM20458P.findViewById(u4c0.f174098Wa);
        final int i = 15;
        final C22306c<Long> c22306cObserveOn = C22306c.interval(200L, TimeUnit.MILLISECONDS).onBackpressureLatest().take(15).takeWhile(new w9j() { // from class: l.r1g0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(dialogM20567z.isShowing());
            }
        }).observeOn(jo0.m142408a());
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        dialogM20567z.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.s1g0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f161889a.m44562U(c22306cObserveOn, vDraweeView, accelerateDecelerateInterpolator, i, vText, c0eVar, dialogInterface);
            }
        });
        return dialogM20567z;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m44564W(c0e c0eVar) {
        c0eVar.m104736g();
        getAct().m47815F2();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ com.p046p1.mobile.android.app.Dialog m44565X(final c0e c0eVar) {
        return getAct().dialog().m20559v().m20503E0(R$string.f17897L0).m20533c0(x2c0.f189248Cu).m20564x0(getAct().getResources().getDrawable(x2c0.f190755yo)).m20556t0(R$string.f17597B0, new Runnable() { // from class: l.t1g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167342a.m44564W(c0eVar);
            }
        }).m20496B(false).m20567z();
    }

    /* JADX INFO: renamed from: Y */
    public final void m44566Y() {
        View viewInflate = this.f28697t.inflater().inflate(f6c0.f96002se, (ViewGroup) null);
        final Pair<WheelView, NumericWheelAdapter> pairM44554E = m44554E(viewInflate);
        final Pair<WheelView, NumericWheelAdapter> pairM44553C = m44553C(viewInflate);
        this.f28697t.dialog().m20503E0(R$string.f17567A0).m20519O(viewInflate).m20559v().m20556t0(R$string.f18653k, new Runnable() { // from class: l.c2g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78355a.m44560S(pairM44554E, pairM44553C);
            }
        }).m20564x0(this.f28697t.drawable(x2c0.f190755yo)).m20568z0();
    }

    /* JADX INFO: renamed from: Z */
    public void m44567Z(Media media) {
        boolean z = media instanceof Picture;
        LinearLayout linearLayout = this.f28690m;
        if (!z) {
            linearLayout.setVisibility(0);
            this.f28691n.setVisibility(4);
            return;
        }
        linearLayout.setVisibility(4);
        this.f28691n.setVisibility(0);
        Picture picture = (Picture) media;
        this.f28691n.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        qib0.f154691G.m102341Q0(this.f28691n, picture.calculatedWidth(picture.size.width));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f28697t;
    }

    /* JADX INFO: renamed from: b0 */
    public void m44568b0(Media media) {
        boolean z = media instanceof Picture;
        LinearLayout linearLayout = this.f28687j;
        if (!z) {
            linearLayout.setVisibility(0);
            this.f28688k.setVisibility(4);
            return;
        }
        linearLayout.setVisibility(4);
        this.f28688k.setVisibility(0);
        Picture picture = (Picture) media;
        this.f28688k.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        qib0.f154691G.m102341Q0(this.f28688k, picture.calculatedWidth(picture.size.width));
    }

    /* JADX INFO: renamed from: c0 */
    public final int m44569c0() {
        int i = this.f28696s.m44523z0() ? 0 : 4;
        this.f28685h.setVisibility(i);
        return i;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m44570d0() {
        boolean z = this.f28696s.f28672f.f28673a;
        VText vText = this.f28680c;
        if (z) {
            vText.setVisibility(0);
            this.f28679b.setForcePrimaryColor(true);
        } else {
            vText.setVisibility(4);
            this.f28679b.setForcePrimaryColor(false);
        }
        boolean z2 = this.f28696s.f28672f.f28674b;
        VText vText2 = this.f28683f;
        if (z2) {
            vText2.setVisibility(0);
            this.f28682e.setForcePrimaryColor(true);
        } else {
            vText2.setVisibility(4);
            this.f28682e.setForcePrimaryColor(false);
        }
        boolean z3 = this.f28696s.f28672f.f28675c;
        VText vText3 = this.f28692o;
        if (z3) {
            vText3.setVisibility(0);
            this.f28686i.setBackgroundResource(x2c0.f190249iu);
        } else {
            vText3.setVisibility(4);
            this.f28686i.setBackgroundResource(x2c0.f190219hu);
        }
        boolean z4 = this.f28696s.f28672f.f28676d;
        VText vText4 = this.f28693p;
        if (z4) {
            vText4.setVisibility(0);
            this.f28689l.setBackgroundResource(x2c0.f190249iu);
        } else {
            vText4.setVisibility(4);
            this.f28689l.setBackgroundResource(x2c0.f190219hu);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m44571e0(boolean z) {
        getAct().progressDismiss();
        if (z) {
            getAct().flow().m104744o(new w9j() { // from class: l.p1g0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f146674a.m44563V((c0e) obj);
                }
            }, new w9j() { // from class: l.q1g0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f152130a.m44565X((c0e) obj);
                }
            }).m104746q();
        } else {
            lsi0.m151595y(getAct().getString(R$string.f17807I0));
            getAct().m47815F2();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m44573x(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m44572r() {
        StudentInfoAct studentInfoAct = this.f28697t;
        studentInfoAct.setTitle(studentInfoAct.getString(R$string.f17687E0));
        if (CoreModule.f17546d.m200505O()) {
            this.f28684g.setVisibility(0);
            this.f28684g.setText(CoreModule.f17546d.m95177g().graduateActivity.name);
        }
        this.f28684g.setOnClickListener(new View.OnClickListener() { // from class: l.m1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130831a.m44524K(view);
            }
        });
        this.f28682e.setOnClickListener(new View.OnClickListener() { // from class: l.v1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179232a.m44525L(view);
            }
        });
        this.f28687j.setOnClickListener(new View.OnClickListener() { // from class: l.w1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184002a.m44526M(view);
            }
        });
        this.f28690m.setOnClickListener(new View.OnClickListener() { // from class: l.x1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189072a.m44527N(view);
            }
        });
        this.f28688k.setOnClickListener(new View.OnClickListener() { // from class: l.y1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195411a.m44528O(view);
            }
        });
        this.f28691n.setOnClickListener(new View.OnClickListener() { // from class: l.z1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201073a.m44529P(view);
            }
        });
        this.f28695r.setOnClickListener(new View.OnClickListener() { // from class: l.a2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67256a.m44530Q(view);
            }
        });
        this.f28679b.setOnClickListener(new View.OnClickListener() { // from class: l.b2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72695a.m44531R(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public View m44573x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e2g0.m114501b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(StudentInfoPresenter studentInfoPresenter) {
        this.f28696s = studentInfoPresenter;
    }

    /* JADX INFO: renamed from: z */
    public final void m44575z(Dialog dialog, int i, boolean z, double d) {
        Window window = dialog.getWindow();
        window.setGravity(i);
        window.setBackgroundDrawableResource(w0c0.f183895v1);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        DisplayMetrics displayMetricsM186889c = t100.m186889c();
        Rect rect = new Rect();
        this.f28697t.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (z) {
            int i2 = rect.bottom;
            if (i2 != displayMetricsM186889c.heightPixels) {
                attributes.height = i2 - rect.top;
            } else {
                window.setGravity(80);
                attributes.height = displayMetricsM186889c.heightPixels - rect.top;
            }
        }
        attributes.width = (int) (((double) displayMetricsM186889c.widthPixels) * d);
        window.setAttributes(attributes);
    }
}
