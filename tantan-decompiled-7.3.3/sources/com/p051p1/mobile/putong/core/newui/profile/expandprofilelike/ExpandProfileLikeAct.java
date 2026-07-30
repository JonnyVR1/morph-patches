package com.p051p1.mobile.putong.core.newui.profile.expandprofilelike;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.swipback.SwipeBackLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.b30;
import p153l.bnl0;
import p153l.clf;
import p153l.l51;
import p153l.pf60;
import p153l.qa00;
import p153l.rlf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandProfileLikeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public clf f27254c;

    /* JADX INFO: renamed from: d */
    public rlf f27255d;

    /* JADX INFO: renamed from: e */
    public String f27256e;

    /* JADX INFO: renamed from: f */
    public String f27257f;

    /* JADX INFO: renamed from: g */
    public String f27258g;

    /* JADX INFO: renamed from: h */
    public User f27259h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f27260i;

    /* JADX INFO: renamed from: j */
    public int f27261j;

    /* JADX INFO: renamed from: k */
    public String f27262k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct$a */
    public class ViewOnLayoutChangeListenerC8368a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public int f27263a;

        /* JADX INFO: renamed from: b */
        public boolean f27264b;

        /* JADX INFO: renamed from: c */
        public int f27265c;

        /* JADX INFO: renamed from: d */
        public boolean f27266d = false;

        /* JADX INFO: renamed from: e */
        public int f27267e = 0;

        /* JADX INFO: renamed from: f */
        public int f27268f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f27269g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ViewGroup f27270h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ View f27271i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ b30 f27272j;

        public ViewOnLayoutChangeListenerC8368a(boolean z, ViewGroup viewGroup, View view, b30 b30Var) {
            this.f27269g = z;
            this.f27270h = viewGroup;
            this.f27271i = view;
            this.f27272j = b30Var;
            int iM175859d = 0;
            if (ExpandProfileLikeAct.this.getSupportActionBar() != null && !z) {
                iM175859d = qa00.m175859d(56.0f);
            }
            this.f27268f = iM175859d;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m44265b(View view, int i) {
            if (view != null) {
                view.getLayoutParams().height = this.f27263a + i;
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
            int iMin = Math.min(this.f27263a, ExpandProfileLikeAct.this.screenHeight);
            this.f27263a = iMin;
            int i12 = i4 - i2;
            int i13 = iMin - (i12 - this.f27268f);
            if (SwipeBackLayout.f16280D) {
                View childAt = this.f27270h.getChildAt(0);
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (i10 = ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) == (i11 = this.f27267e)) {
                    z = false;
                    i9 = 0;
                } else {
                    i9 = i10 - i11;
                    i13 -= i10 - i11;
                    this.f27267e = i10;
                    this.f27263a = (i12 - this.f27268f) + i13;
                    z = true;
                }
            } else {
                z = false;
                i9 = 0;
            }
            boolean z2 = i13 > qa00.m175859d(100.0f);
            if (!z2) {
                this.f27263a = i12 - this.f27268f;
                final int top = 0;
                Object parent = view;
                while ((parent instanceof View) && parent != ExpandProfileLikeAct.this.getWindow().getDecorView()) {
                    View view2 = (View) parent;
                    top += view2.getTop();
                    parent = view2.getParent();
                }
                if (this.f27271i.getMeasuredHeight() - top != this.f27263a || top != this.f27271i.getPaddingTop()) {
                    if (this.f27266d) {
                        final View view3 = this.f27271i;
                        l51.m152887G(new Runnable() { // from class: l.ukf
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f179386a.m44265b(view3, top);
                            }
                        });
                    } else {
                        this.f27266d = true;
                        this.f27271i.getLayoutParams().height = this.f27263a + top;
                        this.f27271i.setPadding(0, top, 0, 0);
                        this.f27271i.requestLayout();
                    }
                }
            }
            if (z2 == this.f27264b && i13 == this.f27265c && !z) {
                return;
            }
            this.f27264b = z2;
            if (z2) {
                this.f27265c = i13;
                Act.savedKeyboardHeight.put(Integer.valueOf(i13));
            }
            b30 b30Var = this.f27272j;
            if (b30Var != null) {
                b30Var.mo102266b(Boolean.valueOf(this.f27264b && ExpandProfileLikeAct.this.lifecycle_() == C4470c.f16267i), Integer.valueOf(this.f27265c), Boolean.valueOf(z), Integer.valueOf(i9));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct$b */
    public static /* synthetic */ class C8369b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27274a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f27274a = iArr;
            try {
                iArr[HomeCardExpandedType.ABOUT_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27274a[HomeCardExpandedType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27274a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27274a[HomeCardExpandedType.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m44260X1(Act act, CoreSuggested.UserInfo userInfo, String str, String str2, String str3, int i) {
        Intent intent = new Intent(act, (Class<?>) ExpandProfileLikeAct.class);
        intent.putExtra("from", str2);
        intent.putExtra("type", str3);
        intent.putExtra("user", str);
        intent.putExtra(FirebaseAnalytics.Param.INDEX, i);
        intent.putExtra("user_info", userInfo);
        intent.putExtra("user_info", userInfo);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public final clf m44261Y1() {
        return new clf(this, this.f27256e, this.f27257f, this.f27260i, this.f27259h, this.f27261j);
    }

    /* JADX INFO: renamed from: Z1 */
    public final rlf m44262Z1() {
        return new rlf(this);
    }

    /* JADX INFO: renamed from: a2 */
    public final void m44263a2() {
        String str;
        int i = C8369b.f27274a[HomeCardExpandedType.getTypeByAlias(this.f27257f).ordinal()];
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
            str2 = this.f27256e;
            str = "avatar";
        }
        this.pageHelper.m152781p(pf60.m172085a("profile_like_limit", Integer.valueOf(CoreModule.f18264c.m32487o3().profileLike.remaining)), pf60.m172085a("profile_module", str), pf60.m172085a("send_profile_like_from", str2));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f27255d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        if (getIntent().hasExtra("from")) {
            this.f27256e = getIntent().getStringExtra("from");
            this.f27257f = getIntent().getStringExtra("type");
            this.f27258g = getIntent().getStringExtra("user");
            this.f27260i = (CoreSuggested.UserInfo) getIntent().getParcelableExtra("user_info");
            this.f27261j = getIntent().getIntExtra(FirebaseAnalytics.Param.INDEX, 0);
            this.f27262k = getIntent().getStringExtra("EXT_VALUE");
        }
        if (TextUtils.isEmpty(this.f27258g)) {
            return;
        }
        this.f27259h = CoreModule.f18264c.f20381e0.m116488M7(this.f27258g);
        this.f27254c = m44261Y1();
        rlf rlfVarM44262Z1 = m44262Z1();
        this.f27255d = rlfVarM44262Z1;
        this.f27254c.mo52715C(rlfVarM44262Z1);
        m44263a2();
        this.f27254c.m110600l0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m82486a(this.f27254c)) {
            this.f27254c.mo40473a0();
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f27255d.m181980Y(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_send_profile_like";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View setUpKeyboardDetectorLayout(View view, View view2, b30<Boolean, Integer, Boolean, Integer> b30Var) {
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        boolean zHasFeature = getWindow().hasFeature(9);
        view.setPadding(0, ((getSupportActionBar() == null || zHasFeature) ? 0 : qa00.m175859d(56.0f)) + bnl0.m105511F0(), 0, 0);
        viewGroup.addView(view, 0);
        view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8368a(zHasFeature, viewGroup, view, b30Var));
        return view2;
    }
}
