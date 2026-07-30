package com.p000p1.mobile.putong.core.p001ui.campus.detailinfo;

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
import com.p000p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.p001ui.campus.SelectSchoolAct;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentCardPreviewAct;
import com.p000p1.mobile.putong.core.p001ui.campus.StudentInfoAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.sql.Date;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import l.c0e;
import l.e30;
import l.f6c0;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.oyx;
import l.qib0;
import l.s7m;
import l.t100;
import l.u4c0;
import l.w0c0;
import l.w9j;
import l.x2c0;
import p003l.e2g0;
import p003l.l1g0;
import p003l.ygh0;
import rx.c;
import v.VButton_FakeShadow;
import v.VDraweeView;
import v.VFrame;
import v.VMaterialEdit_FakeSpinner;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.detailinfo.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3073a implements s7m<StudentInfoPresenter> {

    /* JADX INFO: renamed from: a */
    public VFrame f1072a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit_FakeSpinner f1073b;

    /* JADX INFO: renamed from: c */
    public VText f1074c;

    /* JADX INFO: renamed from: d */
    public VFrame f1075d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit_FakeSpinner f1076e;

    /* JADX INFO: renamed from: f */
    public VText f1077f;

    /* JADX INFO: renamed from: g */
    public VText f1078g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f1079h;

    /* JADX INFO: renamed from: i */
    public VFrame f1080i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f1081j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f1082k;

    /* JADX INFO: renamed from: l */
    public VFrame f1083l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f1084m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f1085n;

    /* JADX INFO: renamed from: o */
    public VText f1086o;

    /* JADX INFO: renamed from: p */
    public VText f1087p;

    /* JADX INFO: renamed from: q */
    public VText f1088q;

    /* JADX INFO: renamed from: r */
    public VButton_FakeShadow f1089r;

    /* JADX INFO: renamed from: s */
    public StudentInfoPresenter f1090s;

    /* JADX INFO: renamed from: t */
    public StudentInfoAct f1091t;

    /* JADX INFO: renamed from: u */
    public Dialog f1092u;

    /* JADX INFO: renamed from: v */
    public View f1093v;

    public C3073a(StudentInfoAct studentInfoAct) {
        this.f1091t = studentInfoAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m1824K(View view) {
        PutongAct putongAct = this.f1091t;
        putongAct.startActivity(AccessTokenWebViewAct.Z1(putongAct, "", ((CoreAssetsSettings) CoreModule.d.g()).graduateActivity.entranceUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m1825L(View view) {
        if (TextUtils.isEmpty(this.f1090s.m1820u0())) {
            lsi0.y(this.f1091t.getString(R.string.D0));
        } else {
            m1867Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m1826M(View view) {
        this.f1090s.f1062b = StudentInfoPresenter.PicType.FRONT;
        m1852B("http://auto.tancdn.com/v1/images/eyJpZCI6IlVMWlNaMkZGNUhIT1UyR09INU43RlVSU0pGSDdONSIsInciOjcyNiwiaCI6NDI5LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTQ4NTIxODA4NDcwOTI0NjkzOTB9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m1827N(View view) {
        this.f1090s.f1062b = StudentInfoPresenter.PicType.BACK;
        m1852B("http://auto.tancdn.com/v1/images/eyJpZCI6Ik1PQTNVTlFQWE1aUVVEQjdJWVM1TUZKU0ZJV003USIsInciOjcyNiwiaCI6NDI4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTE1MDIzNjEyNjY3Nzk1MzY5MjV9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m1828O(View view) {
        this.f1090s.f1062b = StudentInfoPresenter.PicType.FRONT;
        this.f1091t.startActivityForResultWithCustomTransition(StudentCardPreviewAct.m1774c2(act(), this.f1090s.m1819t0(), false), 1, new l1g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m1829P(View view) {
        this.f1090s.f1062b = StudentInfoPresenter.PicType.BACK;
        this.f1091t.startActivityForResultWithCustomTransition(StudentCardPreviewAct.m1774c2(act(), this.f1090s.m1818s0(), false), 1, new l1g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m1830Q(View view) {
        this.f1090s.m1812V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m1831R(View view) {
        PutongAct putongAct = this.f1091t;
        putongAct.startActivityForResult(SelectSchoolAct.m1768V1(putongAct, this.f1090s.m1798D0(), this.f1090s.m1820u0(), false), 0);
    }

    /* JADX INFO: renamed from: a0 */
    private void m1833a0() {
        boolean zM1822y0 = this.f1090s.m1822y0();
        this.f1089r.setActivated(!zM1822y0);
        this.f1089r.setClickable(zM1822y0);
    }

    /* JADX INFO: renamed from: A */
    public void m1851A(String str, StudentVerification studentVerification) {
        this.f1073b.setText(str);
        String str2 = studentVerification.startTime;
        if (TextUtils.isEmpty(str2)) {
            this.f1076e.setText("");
        } else if (!str2.endsWith("-01") || str2.length() < 10) {
            CrashHelper.d(new Throwable("IllegalStateException startTime:" + str2 + "user id" + CoreModule.H().userId()), 100);
            this.f1076e.setText(studentVerification.startTime);
        } else {
            this.f1076e.setText(str2.substring(0, str2.lastIndexOf("-01")));
        }
        if (TEnum.equals(studentVerification.status, "preVerified") && !m1857G()) {
            boolean zM1823z0 = this.f1090s.m1823z0();
            this.f1089r.setActivated(!zM1823z0);
            this.f1089r.setClickable(zM1823z0);
            return;
        }
        if (m1870c0() == 0) {
            this.f1090s.m1811U0(studentVerification.pictures);
        }
        if (NullChecker.a(studentVerification.rejectionReasons) && studentVerification.rejectionReasons.size() > 0) {
            StudentInfoPresenter studentInfoPresenter = this.f1090s;
            if (studentInfoPresenter.f1065e) {
                studentInfoPresenter.m1796A0(studentVerification.rejectionReasons);
            }
            m1871d0();
        }
        m1833a0();
    }

    /* JADX INFO: renamed from: B */
    public final void m1852B(String str) {
        if (this.f1093v == null) {
            this.f1093v = this.f1091t.inflater().inflate(f6c0.re, (ViewGroup) null, false);
        }
        m1856F();
        if (this.f1092u == null) {
            this.f1092u = new Dialog(this.f1091t, 0);
        }
        VDraweeView vDraweeViewFindViewById = this.f1093v.findViewById(u4c0.P5);
        vDraweeViewFindViewById.setHierarchy(qib0.G.l().K(RoundingParams.c(t100.d(12.0f))).a());
        vDraweeViewFindViewById.setImageURI(str);
        this.f1092u.setTitle((CharSequence) null);
        this.f1092u.setContentView(this.f1093v);
        this.f1092u.setCancelable(true);
        this.f1092u.show();
        m1877z(this.f1092u, 80, true, 1.0d);
    }

    /* JADX INFO: renamed from: C */
    public final Pair<WheelView, NumericWheelAdapter> m1853C(View view) {
        WheelView wheelViewFindViewById = view.findViewById(u4c0.Pf);
        NumericWheelAdapter numericWheelAdapter = new NumericWheelAdapter(this.f1091t, 1, 12, "%02d");
        wheelViewFindViewById.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(w0c0.b);
        numericWheelAdapter.setTextSize(20);
        wheelViewFindViewById.setCyclic(false);
        wheelViewFindViewById.setCurrentItem(8);
        return new Pair<>(wheelViewFindViewById, numericWheelAdapter);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m1854C0() {
        return this.f1091t;
    }

    /* JADX INFO: renamed from: E */
    public final Pair<WheelView, NumericWheelAdapter> m1855E(View view) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(qib0.H.guessedCurrentServerTime()));
        int i = calendar.get(1);
        WheelView wheelViewFindViewById = view.findViewById(u4c0.Qf);
        NumericWheelAdapter numericWheelAdapter = new NumericWheelAdapter(this.f1091t, i - 10, i + 3);
        wheelViewFindViewById.setViewAdapter(numericWheelAdapter);
        numericWheelAdapter.setTextColor(w0c0.b);
        numericWheelAdapter.setTextSize(20);
        wheelViewFindViewById.setCyclic(false);
        wheelViewFindViewById.setCurrentItem(10);
        return new Pair<>(wheelViewFindViewById, numericWheelAdapter);
    }

    /* JADX INFO: renamed from: F */
    public final void m1856F() {
        this.f1093v.findViewById(u4c0.D4).setOnClickListener(new View.OnClickListener() { // from class: l.d2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4102a.m1860J(view);
            }
        });
        this.f1093v.findViewById(u4c0.C4).setOnClickListener(new View.OnClickListener() { // from class: l.n1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6464a.m1858H(view);
            }
        });
        this.f1093v.findViewById(u4c0.Q0).setOnClickListener(new View.OnClickListener() { // from class: l.o1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6581a.m1859I(view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public boolean m1857G() {
        return this.f1079h.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m1858H(View view) {
        this.f1091t.pickImagesWithPicker(1, false, false, false, ygh0.f9036e);
        if (NullChecker.a(this.f1092u) && this.f1092u.isShowing()) {
            this.f1092u.dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m1859I(View view) {
        this.f1092u.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m1860J(View view) {
        oyx.l(this.f1091t);
        if (NullChecker.a(this.f1092u) && this.f1092u.isShowing()) {
            this.f1092u.dismiss();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m1861S(Pair pair, Pair pair2) {
        this.f1090s.m1817r0(((NumericWheelAdapter) pair.second).getItemText(((WheelView) pair.first).getCurrentItem()) + CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR + ((NumericWheelAdapter) pair2.second).getItemText(((WheelView) pair2.first).getCurrentItem()) + "-01");
        this.f1090s.f1066f.f1068b = false;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m1862T(VDraweeView vDraweeView, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i, VText vText, c0e c0eVar, Long l2) {
        ((AnimationDrawable) vDraweeView.getBackground()).start();
        float interpolation = accelerateDecelerateInterpolator.getInterpolation(l2.longValue() / (i - 1.0f));
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setRoundingMode(RoundingMode.FLOOR);
        vText.setText(act().getString(R.string.y0) + "(" + percentInstance.format(interpolation) + ")");
        if (l2.longValue() == i - 1) {
            ((AnimationDrawable) vDraweeView.getBackground()).stop();
            c0eVar.k(1, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m1863U(c cVar, final VDraweeView vDraweeView, final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, final int i, final VText vText, final c0e c0eVar, DialogInterface dialogInterface) {
        cVar.subscribe(mkd0.G(new e30() { // from class: l.u1g0
            public final void call(Object obj) {
                this.f7647a.m1862T(vDraweeView, accelerateDecelerateInterpolator, i, vText, c0eVar, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ com.p1.mobile.android.app.Dialog m1864V(final c0e c0eVar) {
        final com.p1.mobile.android.app.Dialog dialogZ = act().dialog().M(f6c0.Ve).B(false).z();
        View viewP = dialogZ.P();
        final VText vTextFindViewById = viewP.findViewById(u4c0.Va);
        final VDraweeView vDraweeViewFindViewById = viewP.findViewById(u4c0.Wa);
        final int i = 15;
        final c cVarObserveOn = c.interval(200L, TimeUnit.MILLISECONDS).onBackpressureLatest().take(15).takeWhile(new w9j() { // from class: l.r1g0
            public final Object call(Object obj) {
                return Boolean.valueOf(dialogZ.isShowing());
            }
        }).observeOn(jo0.a());
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        dialogZ.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.s1g0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f7259a.m1863U(cVarObserveOn, vDraweeViewFindViewById, accelerateDecelerateInterpolator, i, vTextFindViewById, c0eVar, dialogInterface);
            }
        });
        return dialogZ;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m1865W(c0e c0eVar) {
        c0eVar.g();
        act().finish();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ com.p1.mobile.android.app.Dialog m1866X(final c0e c0eVar) {
        return act().dialog().v().E0(R.string.L0).c0(x2c0.Cu).x0(act().getResources().getDrawable(x2c0.yo)).t0(R.string.B0, new Runnable() { // from class: l.t1g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7502a.m1865W(c0eVar);
            }
        }).B(false).z();
    }

    /* JADX INFO: renamed from: Y */
    public final void m1867Y() {
        View viewInflate = this.f1091t.inflater().inflate(f6c0.se, (ViewGroup) null);
        final Pair<WheelView, NumericWheelAdapter> pairM1855E = m1855E(viewInflate);
        final Pair<WheelView, NumericWheelAdapter> pairM1853C = m1853C(viewInflate);
        this.f1091t.dialog().E0(R.string.A0).O(viewInflate).v().t0(R.string.k, new Runnable() { // from class: l.c2g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3501a.m1861S(pairM1855E, pairM1853C);
            }
        }).x0(this.f1091t.drawable(x2c0.yo)).z0();
    }

    /* JADX INFO: renamed from: Z */
    public void m1868Z(Media media) {
        boolean z = media instanceof Picture;
        LinearLayout linearLayout = this.f1084m;
        if (!z) {
            linearLayout.setVisibility(0);
            this.f1085n.setVisibility(4);
            return;
        }
        linearLayout.setVisibility(4);
        this.f1085n.setVisibility(0);
        Picture picture = (Picture) media;
        this.f1085n.setZoomAnimationKey(Media.URL_TO_CACHEKEY(((Media) picture).url));
        qib0.G.Q0(this.f1085n, picture.calculatedWidth(picture.size.width));
    }

    @Nullable
    public Act act() {
        return this.f1091t;
    }

    /* JADX INFO: renamed from: b0 */
    public void m1869b0(Media media) {
        boolean z = media instanceof Picture;
        LinearLayout linearLayout = this.f1081j;
        if (!z) {
            linearLayout.setVisibility(0);
            this.f1082k.setVisibility(4);
            return;
        }
        linearLayout.setVisibility(4);
        this.f1082k.setVisibility(0);
        Picture picture = (Picture) media;
        this.f1082k.setZoomAnimationKey(Media.URL_TO_CACHEKEY(((Media) picture).url));
        qib0.G.Q0(this.f1082k, picture.calculatedWidth(picture.size.width));
    }

    /* JADX INFO: renamed from: c0 */
    public final int m1870c0() {
        int i = this.f1090s.m1823z0() ? 0 : 4;
        this.f1079h.setVisibility(i);
        return i;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1871d0() {
        boolean z = this.f1090s.f1066f.f1067a;
        VText vText = this.f1074c;
        if (z) {
            vText.setVisibility(0);
            this.f1073b.setForcePrimaryColor(true);
        } else {
            vText.setVisibility(4);
            this.f1073b.setForcePrimaryColor(false);
        }
        boolean z2 = this.f1090s.f1066f.f1068b;
        VText vText2 = this.f1077f;
        if (z2) {
            vText2.setVisibility(0);
            this.f1076e.setForcePrimaryColor(true);
        } else {
            vText2.setVisibility(4);
            this.f1076e.setForcePrimaryColor(false);
        }
        boolean z3 = this.f1090s.f1066f.f1069c;
        VText vText3 = this.f1086o;
        if (z3) {
            vText3.setVisibility(0);
            this.f1080i.setBackgroundResource(x2c0.iu);
        } else {
            vText3.setVisibility(4);
            this.f1080i.setBackgroundResource(x2c0.hu);
        }
        boolean z4 = this.f1090s.f1066f.f1070d;
        VText vText4 = this.f1087p;
        if (z4) {
            vText4.setVisibility(0);
            this.f1083l.setBackgroundResource(x2c0.iu);
        } else {
            vText4.setVisibility(4);
            this.f1083l.setBackgroundResource(x2c0.hu);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m1872e0(boolean z) {
        act().progressDismiss();
        if (z) {
            act().flow().o(new w9j[]{new w9j() { // from class: l.p1g0
                public final Object call(Object obj) {
                    return this.f6795a.m1864V((c0e) obj);
                }
            }, new w9j() { // from class: l.q1g0
                public final Object call(Object obj) {
                    return this.f6939a.m1866X((c0e) obj);
                }
            }}).q();
        } else {
            lsi0.y(act().getString(R.string.I0));
            act().finish();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m1875x(layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public void m1874r() {
        PutongAct putongAct = this.f1091t;
        putongAct.setTitle(putongAct.getString(R.string.E0));
        if (CoreModule.d.O()) {
            this.f1078g.setVisibility(0);
            this.f1078g.setText(((CoreAssetsSettings) CoreModule.d.g()).graduateActivity.name);
        }
        this.f1078g.setOnClickListener(new View.OnClickListener() { // from class: l.m1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6243a.m1824K(view);
            }
        });
        this.f1076e.setOnClickListener(new View.OnClickListener() { // from class: l.v1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7856a.m1825L(view);
            }
        });
        this.f1081j.setOnClickListener(new View.OnClickListener() { // from class: l.w1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8111a.m1826M(view);
            }
        });
        this.f1084m.setOnClickListener(new View.OnClickListener() { // from class: l.x1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8293a.m1827N(view);
            }
        });
        this.f1082k.setOnClickListener(new View.OnClickListener() { // from class: l.y1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8623a.m1828O(view);
            }
        });
        this.f1085n.setOnClickListener(new View.OnClickListener() { // from class: l.z1g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9177a.m1829P(view);
            }
        });
        this.f1089r.setOnClickListener(new View.OnClickListener() { // from class: l.a2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2721a.m1830Q(view);
            }
        });
        this.f1073b.setOnClickListener(new View.OnClickListener() { // from class: l.b2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2920a.m1831R(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public View m1875x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e2g0.m6239b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m1873i1(StudentInfoPresenter studentInfoPresenter) {
        this.f1090s = studentInfoPresenter;
    }

    /* JADX INFO: renamed from: z */
    public final void m1877z(Dialog dialog, int i, boolean z, double d) {
        Window window = dialog.getWindow();
        window.setGravity(i);
        window.setBackgroundDrawableResource(w0c0.v1);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        DisplayMetrics displayMetricsC = t100.c();
        Rect rect = new Rect();
        this.f1091t.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (z) {
            int i2 = rect.bottom;
            if (i2 != displayMetricsC.heightPixels) {
                attributes.height = i2 - rect.top;
            } else {
                window.setGravity(80);
                attributes.height = displayMetricsC.heightPixels - rect.top;
            }
        }
        attributes.width = (int) (((double) displayMetricsC.widthPixels) * d);
        window.setAttributes(attributes);
    }
}
