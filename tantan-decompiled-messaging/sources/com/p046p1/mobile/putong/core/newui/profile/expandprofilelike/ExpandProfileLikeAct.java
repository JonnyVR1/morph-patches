package com.p046p1.mobile.putong.core.newui.profile.expandprofilelike;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.swipback.SwipeBackLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.e51;
import p149l.h30;
import p149l.j760;
import p149l.lkf;
import p149l.t100;
import p149l.wjf;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandProfileLikeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public wjf f26512c;

    /* JADX INFO: renamed from: d */
    public lkf f26513d;

    /* JADX INFO: renamed from: e */
    public String f26514e;

    /* JADX INFO: renamed from: f */
    public String f26515f;

    /* JADX INFO: renamed from: g */
    public String f26516g;

    /* JADX INFO: renamed from: h */
    public User f26517h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f26518i;

    /* JADX INFO: renamed from: j */
    public int f26519j;

    /* JADX INFO: renamed from: k */
    public String f26520k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct$a */
    public class ViewOnLayoutChangeListenerC8217a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public int f26521a;

        /* JADX INFO: renamed from: b */
        public boolean f26522b;

        /* JADX INFO: renamed from: c */
        public int f26523c;

        /* JADX INFO: renamed from: d */
        public boolean f26524d = false;

        /* JADX INFO: renamed from: e */
        public int f26525e = 0;

        /* JADX INFO: renamed from: f */
        public int f26526f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f26527g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ViewGroup f26528h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ View f26529i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ h30 f26530j;

        public ViewOnLayoutChangeListenerC8217a(boolean z, ViewGroup viewGroup, View view, h30 h30Var) {
            this.f26527g = z;
            this.f26528h = viewGroup;
            this.f26529i = view;
            this.f26530j = h30Var;
            int iM186890d = 0;
            if (ExpandProfileLikeAct.this.getSupportActionBar() != null && !z) {
                iM186890d = t100.m186890d(56.0f);
            }
            this.f26526f = iM186890d;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m43254b(View view, int i) {
            if (view != null) {
                view.getLayoutParams().height = this.f26521a + i;
                view.setPadding(0, i, 0, 0);
                view.requestLayout();
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0042  */
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            int i9;
            int i10;
            int i11;
            int iMin = Math.min(this.f26521a, ExpandProfileLikeAct.this.screenHeight);
            this.f26521a = iMin;
            int i12 = i4 - i2;
            int i13 = iMin - (i12 - this.f26526f);
            if (SwipeBackLayout.f15561D) {
                View childAt = this.f26528h.getChildAt(0);
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (i10 = ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) == (i11 = this.f26525e)) {
                    z = false;
                    i9 = 0;
                } else {
                    i9 = i10 - i11;
                    i13 -= i10 - i11;
                    this.f26525e = i10;
                    this.f26521a = (i12 - this.f26526f) + i13;
                    z = true;
                }
            } else {
                z = false;
                i9 = 0;
            }
            boolean z2 = i13 > t100.m186890d(100.0f);
            if (!z2) {
                this.f26521a = i12 - this.f26526f;
                final int top = 0;
                Object parent = view;
                while ((parent instanceof View) && parent != ExpandProfileLikeAct.this.getWindow().getDecorView()) {
                    View view2 = (View) parent;
                    top += view2.getTop();
                    parent = view2.getParent();
                }
                if (this.f26529i.getMeasuredHeight() - top != this.f26521a || top != this.f26529i.getPaddingTop()) {
                    if (this.f26524d) {
                        final View view3 = this.f26529i;
                        e51.m114742G(new Runnable() { // from class: l.ojf
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f144269a.m43254b(view3, top);
                            }
                        });
                    } else {
                        this.f26524d = true;
                        this.f26529i.getLayoutParams().height = this.f26521a + top;
                        this.f26529i.setPadding(0, top, 0, 0);
                        this.f26529i.requestLayout();
                    }
                }
            }
            if (z2 == this.f26522b && i13 == this.f26523c && !z) {
                return;
            }
            this.f26522b = z2;
            if (z2) {
                this.f26523c = i13;
                Act.savedKeyboardHeight.put(Integer.valueOf(i13));
            }
            h30 h30Var = this.f26530j;
            if (h30Var != null) {
                h30Var.mo105798b(Boolean.valueOf(this.f26522b && ExpandProfileLikeAct.this.lifecycle_() == C4319c.f15548i), Integer.valueOf(this.f26523c), Boolean.valueOf(z), Integer.valueOf(i9));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct$b */
    public static /* synthetic */ class C8218b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26532a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f26532a = iArr;
            try {
                iArr[HomeCardExpandedType.ABOUT_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26532a[HomeCardExpandedType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26532a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26532a[HomeCardExpandedType.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static Intent m43249V1(Act act, CoreSuggested.UserInfo userInfo, String str, String str2, String str3, int i) {
        Intent intent = new Intent(act, (Class<?>) ExpandProfileLikeAct.class);
        intent.putExtra("from", str2);
        intent.putExtra("type", str3);
        intent.putExtra("user", str);
        intent.putExtra(FirebaseAnalytics.Param.INDEX, i);
        intent.putExtra("user_info", userInfo);
        intent.putExtra("user_info", userInfo);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public final wjf m43250X1() {
        return new wjf(this, this.f26514e, this.f26515f, this.f26518i, this.f26517h, this.f26519j);
    }

    /* JADX INFO: renamed from: Y1 */
    public final lkf m43251Y1() {
        return new lkf(this);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m43252Z1() {
        String str;
        int i = C8218b.f26532a[HomeCardExpandedType.getTypeByAlias(this.f26515f).ordinal()];
        String str2 = "profile_like_button";
        if (i == 1) {
            str = "self_introduction";
        } else if (i == 2) {
            str = Answer.TYPE;
        } else if (i == 3) {
            str = ReminderAction.photo;
        } else if (i != 4) {
            str = "";
        } else {
            str2 = this.f26514e;
            str = "avatar";
        }
        this.pageHelper.m109040p(j760.m140076a("profile_like_limit", Integer.valueOf(CoreModule.f17545c.m31484o3().profileLike.remaining)), j760.m140076a("profile_module", str), j760.m140076a("send_profile_like_from", str2));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f26513d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        if (getIntent().hasExtra("from")) {
            this.f26514e = getIntent().getStringExtra("from");
            this.f26515f = getIntent().getStringExtra("type");
            this.f26516g = getIntent().getStringExtra("user");
            this.f26518i = (CoreSuggested.UserInfo) getIntent().getParcelableExtra("user_info");
            this.f26519j = getIntent().getIntExtra(FirebaseAnalytics.Param.INDEX, 0);
            this.f26520k = getIntent().getStringExtra("EXT_VALUE");
        }
        if (TextUtils.isEmpty(this.f26516g)) {
            return;
        }
        this.f26517h = CoreModule.f17545c.f19639e0.m169415M7(this.f26516g);
        this.f26512c = m43250X1();
        lkf lkfVarM43251Y1 = m43251Y1();
        this.f26513d = lkfVarM43251Y1;
        this.f26512c.mo51532C(lkfVarM43251Y1);
        m43252Z1();
        this.f26512c.m203427l0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m81303a(this.f26512c)) {
            this.f26512c.mo39470a0();
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f26513d.m150257Y(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_send_profile_like";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View setUpKeyboardDetectorLayout(View view, View view2, h30<Boolean, Integer, Boolean, Integer> h30Var) {
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        boolean zHasFeature = getWindow().hasFeature(9);
        view.setPadding(0, ((getSupportActionBar() == null || zHasFeature) ? 0 : t100.m186890d(56.0f)) + xdl0.m208331F0(), 0, 0);
        viewGroup.addView(view, 0);
        view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8217a(zHasFeature, viewGroup, view, h30Var));
        return view2;
    }
}
