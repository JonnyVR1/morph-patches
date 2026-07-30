package com.p000p1.mobile.putong.core.newui.profile.expandprofilelike;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.app.swipback.SwipeBackLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.h30;
import l.j760;
import l.t100;
import l.xdl0;
import p009l.lkf;
import p009l.wjf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandProfileLikeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public wjf f5290c;

    /* JADX INFO: renamed from: d */
    public lkf f5291d;

    /* JADX INFO: renamed from: e */
    public String f5292e;

    /* JADX INFO: renamed from: f */
    public String f5293f;

    /* JADX INFO: renamed from: g */
    public String f5294g;

    /* JADX INFO: renamed from: h */
    public User f5295h;

    /* JADX INFO: renamed from: i */
    public CoreSuggested.UserInfo f5296i;

    /* JADX INFO: renamed from: j */
    public int f5297j;

    /* JADX INFO: renamed from: k */
    public String f5298k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct$a */
    public class ViewOnLayoutChangeListenerC0381a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public int f5299a;

        /* JADX INFO: renamed from: b */
        public boolean f5300b;

        /* JADX INFO: renamed from: c */
        public int f5301c;

        /* JADX INFO: renamed from: d */
        public boolean f5302d = false;

        /* JADX INFO: renamed from: e */
        public int f5303e = 0;

        /* JADX INFO: renamed from: f */
        public int f5304f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f5305g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ViewGroup f5306h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ View f5307i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ h30 f5308j;

        public ViewOnLayoutChangeListenerC0381a(boolean z, ViewGroup viewGroup, View view, h30 h30Var) {
            this.f5305g = z;
            this.f5306h = viewGroup;
            this.f5307i = view;
            this.f5308j = h30Var;
            int iD = 0;
            if (ExpandProfileLikeAct.this.getSupportActionBar() != null && !z) {
                iD = t100.d(56.0f);
            }
            this.f5304f = iD;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m7475b(View view, int i) {
            if (view != null) {
                view.getLayoutParams().height = this.f5299a + i;
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
            int iMin = Math.min(this.f5299a, ((Act) ExpandProfileLikeAct.this).screenHeight);
            this.f5299a = iMin;
            int i12 = i4 - i2;
            int i13 = iMin - (i12 - this.f5304f);
            if (SwipeBackLayout.D) {
                View childAt = this.f5306h.getChildAt(0);
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (i10 = ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) == (i11 = this.f5303e)) {
                    z = false;
                    i9 = 0;
                } else {
                    i9 = i10 - i11;
                    i13 -= i10 - i11;
                    this.f5303e = i10;
                    this.f5299a = (i12 - this.f5304f) + i13;
                    z = true;
                }
            } else {
                z = false;
                i9 = 0;
            }
            boolean z2 = i13 > t100.d(100.0f);
            if (!z2) {
                this.f5299a = i12 - this.f5304f;
                final int top = 0;
                Object parent = view;
                while ((parent instanceof View) && parent != ExpandProfileLikeAct.this.getWindow().getDecorView()) {
                    View view2 = (View) parent;
                    top += view2.getTop();
                    parent = view2.getParent();
                }
                if (this.f5307i.getMeasuredHeight() - top != this.f5299a || top != this.f5307i.getPaddingTop()) {
                    if (this.f5302d) {
                        final View view3 = this.f5307i;
                        e51.G(new Runnable() { // from class: l.ojf
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f18106a.m7475b(view3, top);
                            }
                        });
                    } else {
                        this.f5302d = true;
                        this.f5307i.getLayoutParams().height = this.f5299a + top;
                        this.f5307i.setPadding(0, top, 0, 0);
                        this.f5307i.requestLayout();
                    }
                }
            }
            if (z2 == this.f5300b && i13 == this.f5301c && !z) {
                return;
            }
            this.f5300b = z2;
            if (z2) {
                this.f5301c = i13;
                Act.savedKeyboardHeight.put(Integer.valueOf(i13));
            }
            h30 h30Var = this.f5308j;
            if (h30Var != null) {
                h30Var.b(Boolean.valueOf(this.f5300b && ExpandProfileLikeAct.this.lifecycle_() == c.i), Integer.valueOf(this.f5301c), Boolean.valueOf(z), Integer.valueOf(i9));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct$b */
    public static /* synthetic */ class C0382b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5310a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f5310a = iArr;
            try {
                iArr[HomeCardExpandedType.ABOUT_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5310a[HomeCardExpandedType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5310a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5310a[HomeCardExpandedType.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static Intent m7470V1(Act act, CoreSuggested.UserInfo userInfo, String str, String str2, String str3, int i) {
        Intent intent = new Intent((Context) act, (Class<?>) ExpandProfileLikeAct.class);
        intent.putExtra("from", str2);
        intent.putExtra(MiniWidgetProvider.KEY_TYPE, str3);
        intent.putExtra("user", str);
        intent.putExtra("index", i);
        intent.putExtra("user_info", (Parcelable) userInfo);
        intent.putExtra("user_info", (Parcelable) userInfo);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public final wjf m7471X1() {
        return new wjf(this, this.f5292e, this.f5293f, this.f5296i, this.f5295h, this.f5297j);
    }

    /* JADX INFO: renamed from: Y1 */
    public final lkf m7472Y1() {
        return new lkf(this);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m7473Z1() {
        String str;
        int i = C0382b.f5310a[HomeCardExpandedType.getTypeByAlias(this.f5293f).ordinal()];
        String str2 = "profile_like_button";
        if (i == 1) {
            str = "self_introduction";
        } else if (i == 2) {
            str = "answer";
        } else if (i == 3) {
            str = "photo";
        } else if (i != 4) {
            str = "";
        } else {
            str2 = this.f5292e;
            str = "avatar";
        }
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("profile_like_limit", Integer.valueOf(CoreModule.c.o3().profileLike.remaining)), j760.a("profile_module", str), j760.a("send_profile_like_from", str2)});
    }

    public void checkGradientColors() {
        super.checkGradientColors();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5291d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        if (getIntent().hasExtra("from")) {
            this.f5292e = getIntent().getStringExtra("from");
            this.f5293f = getIntent().getStringExtra(MiniWidgetProvider.KEY_TYPE);
            this.f5294g = getIntent().getStringExtra("user");
            this.f5296i = getIntent().getParcelableExtra("user_info");
            this.f5297j = getIntent().getIntExtra("index", 0);
            this.f5298k = getIntent().getStringExtra("EXT_VALUE");
        }
        if (TextUtils.isEmpty(this.f5294g)) {
            return;
        }
        this.f5295h = CoreModule.c.e0.M7(this.f5294g);
        this.f5290c = m7471X1();
        lkf lkfVarM7472Y1 = m7472Y1();
        this.f5291d = lkfVarM7472Y1;
        this.f5290c.C(lkfVarM7472Y1);
        m7473Z1();
        this.f5290c.m24280l0();
    }

    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.a(this.f5290c)) {
            this.f5290c.m24279a0();
        }
    }

    public void onPointerCaptureChanged(boolean z) {
    }

    public void onStartLifecycle() {
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.f5291d.m17942Y(z);
    }

    public String pageId() {
        return "p_send_profile_like";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View setUpKeyboardDetectorLayout(View view, View view2, h30<Boolean, Integer, Boolean, Integer> h30Var) {
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        boolean zHasFeature = getWindow().hasFeature(9);
        view.setPadding(0, ((getSupportActionBar() == null || zHasFeature) ? 0 : t100.d(56.0f)) + xdl0.F0(), 0, 0);
        viewGroup.addView(view, 0);
        view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0381a(zHasFeature, viewGroup, view, h30Var));
        return view2;
    }
}
