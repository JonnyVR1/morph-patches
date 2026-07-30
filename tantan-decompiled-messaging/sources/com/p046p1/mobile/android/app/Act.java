package com.p046p1.mobile.android.app;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0074a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p046p1.mobile.android.R$string;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.swipback.SwipeBackLayout;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.android.p048ui.poplevel.PopLifecycleEvent;
import com.p046p1.mobile.android.statistic.AutoSpeedCustomView;
import com.tantanapp.common.utils.CrashHelper;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joor.Reflect;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VList;
import p147v.VText;
import p149l.AbstractC15503a;
import p149l.b6c0;
import p149l.bd50;
import p149l.bt0;
import p149l.c0e;
import p149l.c16;
import p149l.cwf0;
import p149l.d0e;
import p149l.d30;
import p149l.dd80;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.f30;
import p149l.fpd0;
import p149l.gbl0;
import p149l.h30;
import p149l.h4g0;
import p149l.hi3;
import p149l.hn5;
import p149l.i30;
import p149l.j760;
import p149l.k0m;
import p149l.k9j;
import p149l.lqf;
import p149l.lsi0;
import p149l.m8c;
import p149l.mbh0;
import p149l.mcr;
import p149l.mep0;
import p149l.mkd0;
import p149l.n11;
import p149l.nu0;
import p149l.nx0;
import p149l.ozb0;
import p149l.p4c0;
import p149l.pc80;
import p149l.roj0;
import p149l.t100;
import p149l.tpd0;
import p149l.u620;
import p149l.u660;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y20;
import p149l.y6q0;
import p149l.yd5;
import p149l.z3g0;
import p149l.zbc0;
import p149l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Act extends AppCompatActivity implements mcr, d0e, k0m {
    public static final int CROP_IMAGE = 24576;
    public static final boolean DEBUG_LIFECYCLE = false;
    public static final String FRAGMENTS_TAG = "android:fragments";
    protected static final int PICK_IMAGE = 8192;
    protected static final int PICK_IMAGES = 4096;
    static final int PICK_VIDEO = 12288;
    static final int RECORD_VIDEO = 20480;
    private static final String STAT_GLOBAL_STATE = ".global_state";
    public static final long STOP_CHECK_DELAY = 1000;
    public static final String STUB_SAVED_INSTANCE_STATE = "tanker_savedInstanceState";
    public static final String SUPPORT_FRAGMENTS_TAG = "android:support:fragments";
    protected static final boolean SWIPE_BACK_SUPPORTED = true;
    private static final String TAG = "Act";
    public static final int TAKE_PICTURE = 16384;
    public static boolean debugShowMenu = false;
    public static boolean isActResumed = false;
    public static boolean isFromBackStack = false;
    public static boolean isFromBackground = false;
    public static boolean isFromDestoryed = false;
    public static boolean isInit = true;
    private static SensorManager sensorManager;
    private static ArrayList<C4302u> sensors;
    private static long startTime;
    private static long stopTime;
    int actionBarColor;
    private ActionMenuView actionMenuView;
    private C4317a activityReslutManager;
    public boolean callOnRestoreInstanceState;
    public TextView centralFilter;
    public LinearLayout centralLayout;
    public TextView centralTitle;
    Animator currentTransAnim;
    boolean finishingByAnimation;
    public boolean hackCenterTitle;
    boolean hasBlockOnCreate;
    boolean hasBlockOnResume;
    boolean hasBlockOnStart;
    private boolean isSetUpKeyboardDetectorLayout;
    private long lastItemSelectedTime;
    public TextView originalTitle;
    y20.AbstractC21281a partTransition;
    protected Dialog progressDialog;
    public Resources res;
    public Bundle savedInstanceStateCache;
    public int screenHeight;
    public int screenWidth;
    private List<WeakReference<Dialog>> showingDialogList;
    public TextView specialFilter;
    public LinearLayout specialLayout;
    public TextView specialTitle;
    private SwipeBackLayout swipeBack;
    C4303v trans;
    public static e30<Throwable> EMPTY_ON_ERROR = new e30() { // from class: l.k10
        @Override // p149l.e30
        public final void call(Object obj) {
            mkd0.m154961M((Throwable) obj);
        }
    };
    public static d30 ACTION0_NOTHING = new d30() { // from class: l.v10
        @Override // p149l.d30
        public final void call() {
            Act.m20390o1();
        }
    };
    private static C22393b<Boolean> frontBs = C22393b.m221521b();
    private static C22393b<Boolean> mediaCaptureBs = C22393b.m221521b();
    private static int activityCount = 0;
    private static boolean foregroundStatusUpdated = false;
    private static C4299r foreground = null;
    private static HashMap<Integer, ArrayList<C4299r>> acts = new HashMap<>();
    private static C22392a<roj0> globalLifecycleSubject = C22392a.m221512b();
    private static int sessionCount = 0;
    private static Handler backgroundCheckHandler = new HandlerC4290i(Looper.getMainLooper());
    public static Field TOOLBAR_NAV_BUTTON_VIEW_FIELD = Reflect.m221135on((Class<?>) Toolbar.class).field0("mNavButtonView");
    public static Field TOOLBAR_TITLE_VIEW_FILED = Reflect.m221135on((Class<?>) Toolbar.class).field0("mTitleTextView");
    public static Field TOOLBAR_MENU_VIEW_FILED = Reflect.m221135on((Class<?>) Toolbar.class).field0("mMenuView");
    public static tpd0 savedKeyboardHeight = new tpd0("keyboard_height", t100.m186890d(220.0f));
    public static String tempFileName = null;
    static LinkedList<C4303v> tempQueue = new LinkedList<>();
    private static boolean lmdResult = false;
    private final C22392a<C4319c> lifecycleSubject = C22392a.m221512b();
    private final C22392a<pc80> popLifeSub = C22392a.m221512b();
    public Act act = this;

    public enum PickMediaError {
        NOT_RESOLVABLE,
        FILE_NOT_FOUND
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC4282a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public int f15303a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f15304b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z3g0 f15305c;

        public ViewTreeObserverOnGlobalLayoutListenerC4282a(View view, z3g0 z3g0Var) {
            this.f15304b = view;
            this.f15305c = z3g0Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f15303a == -1) {
                this.f15303a = this.f15304b.getMeasuredHeight();
            }
            int measuredHeight = this.f15303a - this.f15304b.getMeasuredHeight();
            if (measuredHeight > t100.m186890d(100.0f)) {
                this.f15305c.onNext(Boolean.TRUE);
            } else if (measuredHeight < (-t100.m186890d(100.0f))) {
                this.f15305c.onNext(Boolean.FALSE);
            }
            this.f15303a = this.f15304b.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$b */
    public class C4283b implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f15306a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4317a.a f15307b;

        public C4283b(int i, C4317a.a aVar) {
            this.f15306a = i;
            this.f15307b = aVar;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (this.f15306a != i) {
                return false;
            }
            boolean zMo20401a = this.f15307b.mo20401a(i, i2, intent);
            Act.this.activityReslutManager.m20614d(this);
            return zMo20401a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$c */
    public class C4284c implements Animator.AnimatorListener {
        public C4284c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act act = Act.this;
            y20.AbstractC21281a abstractC21281a = act.partTransition;
            act.partTransition = null;
            act.actualFinish();
            if (abstractC21281a != null) {
                abstractC21281a.m212330m(Act.this.act);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$d */
    public class C4285d implements Animator.AnimatorListener {
        public C4285d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act.this.realFinishAfterFinishingAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$e */
    public class C4286e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f15311a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f15312b;

        public C4286e(View view, Drawable drawable) {
            this.f15311a = view;
            this.f15312b = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Act.this.currentTransAnim = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act.this.currentTransAnim = null;
            View view = this.f15311a;
            if (view != null) {
                view.setBackgroundDrawable(this.f15312b);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$f */
    public class C4287f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f15314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f15315b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Drawable f15316c;

        public C4287f(Act act, View view, Drawable drawable) {
            this.f15314a = act;
            this.f15315b = view;
            this.f15316c = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Act.this.currentTransAnim = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act act = Act.this;
            act.currentTransAnim = null;
            C4303v c4303v = act.trans;
            if (c4303v != null && !c4303v.f15364b.mo20411e()) {
                View decorView = this.f15314a.getWindow().getDecorView();
                if (decorView instanceof ViewGroup) {
                    decorView = ((ViewGroup) decorView).getChildAt(0);
                }
                if (decorView != null) {
                    decorView.setVisibility(4);
                }
            }
            View view = this.f15315b;
            if (view != null) {
                view.setBackgroundDrawable(this.f15316c);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$g */
    public class C4288g extends AbstractC15503a<j760<String, CharSequence>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f15318c;

        public C4288g(ArrayList arrayList) {
            this.f15318c = arrayList;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return Act.this.inflater().inflate(b6c0.f73776b, viewGroup, false);
        }

        @Override // p149l.AbstractC15503a
        /* JADX INFO: renamed from: p */
        public List<j760<String, CharSequence>> mo20404p() {
            return this.f15318c;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, j760<String, CharSequence> j760Var, int i, int i2) {
            TextView textView = (TextView) view.findViewById(p4c0.f147090R0);
            TextView textView2 = (TextView) view.findViewById(p4c0.f147152y);
            textView.setText(j760Var.f116564a);
            textView2.setText(j760Var.f116565b);
            textView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$h */
    public class C4289h implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4302u f15320a;

        public C4289h(C4302u c4302u) {
            this.f15320a = c4302u;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                C4302u c4302u = this.f15320a;
                int i = c4302u.f15362d;
                if (i >= 10) {
                    if (Act.lmdResultMoved()) {
                        Act.lmdEnd();
                        return;
                    } else {
                        this.f15320a.f15362d = 0;
                        return;
                    }
                }
                float[] fArr = c4302u.f15361c[i];
                float[] fArr2 = sensorEvent.values;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                c4302u.f15362d = i + 1;
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("Act lmdCreate exception:" + e.getMessage(), e));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$i */
    public class HandlerC4290i extends Handler {
        public HandlerC4290i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Act.changeGlobalLifecycleStates();
            if (Act.foreground_() == null) {
                Act.sessionCount++;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$j */
    public class ViewOnAttachStateChangeListenerC4291j implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC4291j() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Act.this.possiblyResizeChildOfContent();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$k */
    public class C4292k extends ArrayAdapter<String> {
        public C4292k(Context context, int i) {
            super(context, i);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            textView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$l */
    public class C4293l implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f15323a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f15324b;

        public C4293l(ArrayAdapter arrayAdapter, List list) {
            this.f15323a = arrayAdapter;
            this.f15324b = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ArrayAdapter arrayAdapter = this.f15323a;
            if (zIsEmpty) {
                arrayAdapter.clear();
                this.f15323a.addAll(this.f15324b);
            } else {
                arrayAdapter.clear();
                this.f15323a.addAll(vwb.m200339n(this.f15324b, new w9j() { // from class: l.s20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((String) obj).toLowerCase().contains(editable));
                    }
                }));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$m */
    public class C4294m implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f15326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f15327b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Dialog f15328c;

        public C4294m(ArrayAdapter arrayAdapter, ArrayList arrayList, Dialog dialog) {
            this.f15326a = arrayAdapter;
            this.f15327b = arrayList;
            this.f15328c = dialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, final int i, long j) {
            zvf0.m220399u("e_debug_tool", "p_debug_tool_dialog_view", vwb.m200311Y("debug_tool_name", (String) this.f15326a.getItem(i)));
            ArrayList arrayList = this.f15327b;
            final ArrayAdapter arrayAdapter = this.f15326a;
            ((d30) ((j760) vwb.m200346r(arrayList, new w9j() { // from class: l.t20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) ((j760) obj).f116564a).equals(arrayAdapter.getItem(i)));
                }
            })).f116565b).call();
            this.f15328c.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$n */
    public class DialogInterfaceOnDismissListenerC4295n implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f15330a;

        public DialogInterfaceOnDismissListenerC4295n(cwf0 cwf0Var) {
            this.f15330a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f15330a.m109035k();
            this.f15330a.m109034j();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$o */
    public class C4296o implements bd50 {

        /* JADX INFO: renamed from: a */
        public int f15332a;

        /* JADX INFO: renamed from: b */
        public int f15333b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f15334c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ h30 f15335d;

        public C4296o(View view, h30 h30Var) {
            this.f15334c = view;
            this.f15335d = h30Var;
        }

        @Override // p149l.bd50
        @NonNull
        public y6q0 onApplyWindowInsets(@NonNull View view, @NonNull y6q0 y6q0Var) {
            int i;
            boolean zM213188p = y6q0Var.m213188p(y6q0.C21326l.m213232b());
            int i2 = y6q0Var.m213179f(y6q0.C21326l.m213232b()).f160975d;
            if (i2 != 0) {
                this.f15333b = i2;
            }
            int i3 = y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d;
            int i4 = this.f15332a;
            int iAbs = 0;
            boolean z = i4 != i3;
            if (z) {
                iAbs = Math.abs(i3 - i4);
                this.f15332a = i3;
                xdl0.m208357U(this.f15334c, i3);
            }
            if (zM213188p && (i = this.f15333b) != 0) {
                Act.savedKeyboardHeight.put(Integer.valueOf(i - i3));
            }
            h30 h30Var = this.f15335d;
            if (h30Var != null) {
                h30Var.mo105798b(Boolean.valueOf(zM213188p), Integer.valueOf(this.f15333b - i3), Boolean.valueOf(z), Integer.valueOf(iAbs));
            }
            return y6q0Var;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$p */
    public class ViewOnLayoutChangeListenerC4297p implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4301t f15337a;

        public ViewOnLayoutChangeListenerC4297p(C4301t c4301t) {
            this.f15337a = c4301t;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f15337a.m20420c(view, i2, i4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$q */
    public class ViewTreeObserverOnGlobalLayoutListenerC4298q implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public int f15339a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f15340b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f15341c;

        public ViewTreeObserverOnGlobalLayoutListenerC4298q(View view, WeakReference weakReference) {
            this.f15340b = view;
            this.f15341c = weakReference;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f15339a == -1) {
                this.f15339a = this.f15340b.getMeasuredHeight();
            }
            int iMin = Math.min(this.f15339a, Act.this.screenHeight);
            this.f15339a = iMin;
            int measuredHeight = iMin - this.f15340b.getMeasuredHeight();
            if (measuredHeight > t100.m186890d(100.0f)) {
                if (this.f15341c.get() != null) {
                    ((e30) this.f15341c.get()).call(Boolean.TRUE);
                }
            } else if (measuredHeight < (-t100.m186890d(100.0f)) && this.f15341c.get() != null) {
                ((e30) this.f15341c.get()).call(Boolean.FALSE);
            }
            this.f15339a = this.f15340b.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$r */
    public static class C4299r {

        /* JADX INFO: renamed from: a */
        @NonNull
        public WeakReference<Activity> f15343a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public C4319c f15344b;

        /* JADX INFO: renamed from: c */
        public long f15345c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f15346d;
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$s */
    public static class C4300s<FROM extends Act, TO extends Act> extends AbstractC4304w<FROM, TO> {
        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: b */
        public boolean mo20408b() {
            return true;
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: e */
        public boolean mo20411e() {
            return true;
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: f */
        public void mo20412f(Act act) {
            act.overridePendingTransition(ozb0.f146415c, 0);
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: g */
        public void mo20413g(Act act) {
            act.overridePendingTransition(0, ozb0.f146416d);
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator mo20409c(FROM from, TO to) {
            mep0.m154297Y0(from, to);
            return to.enterAnimation();
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Animator mo20410d(FROM from, TO to) {
            return to.exitAnimation();
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo20414h(FROM from, TO to) {
            to.initAnimationState();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$t */
    public class C4301t {

        /* JADX INFO: renamed from: a */
        public View f15347a;

        /* JADX INFO: renamed from: b */
        public View f15348b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f15349c;

        /* JADX INFO: renamed from: d */
        public h30<Boolean, Integer, Boolean, Integer> f15350d;

        /* JADX INFO: renamed from: e */
        public int f15351e;

        /* JADX INFO: renamed from: f */
        public boolean f15352f;

        /* JADX INFO: renamed from: g */
        public int f15353g;

        /* JADX INFO: renamed from: h */
        public boolean f15354h = false;

        /* JADX INFO: renamed from: i */
        public int f15355i = 0;

        /* JADX INFO: renamed from: j */
        public boolean f15356j;

        /* JADX INFO: renamed from: k */
        public int f15357k;

        public C4301t(View view, View view2, h30<Boolean, Integer, Boolean, Integer> h30Var, ViewGroup viewGroup) {
            int iM186890d = 0;
            this.f15356j = Act.this.getWindow().hasFeature(9);
            if (Act.this.getSupportActionBar() != null && !this.f15356j) {
                iM186890d = t100.m186890d(56.0f);
            }
            this.f15357k = iM186890d;
            this.f15347a = view;
            this.f15348b = view2;
            this.f15350d = h30Var;
            this.f15349c = viewGroup;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m20419b(int i) {
            View view = this.f15347a;
            if (view != null) {
                view.getLayoutParams().height = this.f15351e + i;
                this.f15347a.setPadding(0, i, 0, 0);
                this.f15347a.requestLayout();
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0052  */
        /* JADX INFO: renamed from: c */
        public void m20420c(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int i5;
            this.f15351e = Math.min(this.f15351e, Act.this.screenHeight);
            Rect rect = new Rect();
            this.f15348b.getWindowVisibleDisplayFrame(rect);
            int i6 = rect.bottom - rect.top;
            int i7 = this.f15351e - (i6 - this.f15357k);
            if (SwipeBackLayout.f15561D) {
                View childAt = this.f15349c.getChildAt(0);
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (i4 = ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) == (i5 = this.f15355i)) {
                    z = false;
                    i3 = 0;
                } else {
                    i3 = i4 - i5;
                    i7 -= i4 - i5;
                    this.f15355i = i4;
                    this.f15351e = (i6 - this.f15357k) + i7;
                    z = true;
                }
            } else {
                z = false;
                i3 = 0;
            }
            boolean z2 = i7 > t100.m186890d(100.0f);
            if (!z2) {
                this.f15351e = i6 - this.f15357k;
                if ("MI 9".equals(Build.MODEL) && Build.VERSION.SDK_INT <= 34) {
                    this.f15351e = i2 - i;
                }
                final int top = 0;
                Object parent = view;
                while ((parent instanceof View) && parent != Act.this.getWindow().getDecorView()) {
                    View view2 = (View) parent;
                    top += view2.getTop();
                    parent = view2.getParent();
                }
                if (this.f15347a.getMeasuredHeight() - top != this.f15351e || top != this.f15347a.getPaddingTop()) {
                    if (this.f15354h) {
                        e51.m114742G(new Runnable() { // from class: l.u20
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f173057a.m20419b(top);
                            }
                        });
                    } else {
                        this.f15354h = true;
                        this.f15347a.getLayoutParams().height = this.f15351e + top;
                        this.f15347a.setPadding(0, top, 0, 0);
                        this.f15347a.requestLayout();
                    }
                }
            }
            if (z2 == this.f15352f && i7 == this.f15353g && !z) {
                return;
            }
            this.f15352f = z2;
            if (z2) {
                this.f15353g = i7;
                Act.savedKeyboardHeight.put(Integer.valueOf(i7));
            }
            h30<Boolean, Integer, Boolean, Integer> h30Var = this.f15350d;
            if (h30Var != null) {
                h30Var.mo105798b(Boolean.valueOf(this.f15352f && Act.this.lifecycle_() == C4319c.f15548i), Integer.valueOf(this.f15353g), Boolean.valueOf(z), Integer.valueOf(i3));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$u */
    public static class C4302u {

        /* JADX INFO: renamed from: a */
        public Sensor f15359a;

        /* JADX INFO: renamed from: b */
        public SensorEventListener f15360b;

        /* JADX INFO: renamed from: c */
        public float[][] f15361c;

        /* JADX INFO: renamed from: d */
        public int f15362d;

        public C4302u() {
            this.f15361c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
            this.f15362d = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$v */
    public static class C4303v {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<Act> f15363a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final AbstractC4304w f15364b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final String f15365c;

        public C4303v(@NonNull WeakReference<Act> weakReference, @NonNull AbstractC4304w abstractC4304w, @NonNull String str) {
            this.f15363a = weakReference;
            this.f15364b = abstractC4304w;
            this.f15365c = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$w */
    public static abstract class AbstractC4304w<FROM, TO> {
        /* JADX INFO: renamed from: a */
        public View mo20422a(TO to) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo20408b() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract Animator mo20409c(FROM from, TO to);

        /* JADX INFO: renamed from: d */
        public abstract Animator mo20410d(FROM from, TO to);

        /* JADX INFO: renamed from: e */
        public boolean mo20411e() {
            return true;
        }

        /* JADX INFO: renamed from: f */
        public void mo20412f(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: g */
        public void mo20413g(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: h */
        public void mo20414h(FROM from, TO to) {
        }
    }

    public Act() {
        u660.m191956e().m191958b(this);
        this.hackCenterTitle = false;
        this.centralTitle = null;
        this.originalTitle = null;
        this.specialTitle = null;
        this.centralLayout = null;
        this.specialLayout = null;
        this.centralFilter = null;
        this.specialFilter = null;
        this.activityReslutManager = new C4317a();
        this.actionBarColor = 0;
        this.trans = null;
        this.currentTransAnim = null;
        this.finishingByAnimation = false;
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ C22306c m20365I0(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ y6q0 m20366J0(boolean[] zArr, int[] iArr, boolean z, ViewGroup.LayoutParams layoutParams, FrameLayout frameLayout, View view, View view2, y6q0 y6q0Var) {
        boolean zM213188p = y6q0Var.m213188p(y6q0.C21326l.m213232b());
        int i = y6q0Var.m213179f(y6q0.C21326l.m213232b()).f160975d;
        int i2 = y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d;
        if (zM213188p == zArr[0] && iArr[0] == i) {
            return y6q0Var;
        }
        iArr[0] = i;
        zArr[0] = zM213188p;
        int i3 = z ? 0 : y6q0Var.m213179f(y6q0.C21326l.m213235e()).f160973b;
        if (zM213188p) {
            layoutParams.height = (frameLayout.getMeasuredHeight() - iArr[0]) - i3;
        } else {
            layoutParams.height = (frameLayout.getMeasuredHeight() - i3) - i2;
        }
        view.setLayoutParams(layoutParams);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ Boolean m20367K0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m20371P0(e30 e30Var, d30 d30Var, C4319c c4319c) {
        if (c4319c instanceof C4319c.a) {
            e30Var.call(((C4319c.a) c4319c).f15559p);
        } else if (c4319c == C4319c.f15552m) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m20372Q0(final View view, z3g0 z3g0Var) {
        final ViewTreeObserverOnGlobalLayoutListenerC4282a viewTreeObserverOnGlobalLayoutListenerC4282a = new ViewTreeObserverOnGlobalLayoutListenerC4282a(view, z3g0Var);
        z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.e20
            @Override // p149l.d30
            public final void call() {
                Act.m20387l1(view, viewTreeObserverOnGlobalLayoutListenerC4282a);
            }
        }));
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4282a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ String m20373R0(j760 j760Var) {
        return (String) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ C22306c m20375T0(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actualFinish() {
        SwipeBackLayout swipeBackLayout;
        Iterator<ArrayList<C4299r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4299r c4299r : it.next()) {
                if (c4299r.f15343a.get() == this) {
                    z = true;
                    c4299r.f15346d = true;
                }
            }
        }
        if (!super.isFinishing()) {
            super.finish();
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        if (!SWIPE_BACK_SUPPORTED || (swipeBackLayout = this.swipeBack) == null) {
            return;
        }
        swipeBackLayout.m20649x();
    }

    private boolean canResolveTargetPackage(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void changeGlobalLifecycleStates() {
        foregroundStatusUpdated = false;
        C4299r c4299r = foreground;
        tryUpdateForegroundStatus();
        if (c4299r == null && foreground == null) {
            return;
        }
        if (c4299r == null || foreground == null || c4299r.f15343a.get() != foreground.f15343a.get()) {
            globalLifecycleSubject.onNext(roj0.f160388a);
        }
    }

    private void debugColorAllViews(View view, int i) {
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.argb(20, zbc0.f202434a.nextInt(255), zbc0.f202434a.nextInt(255), zbc0.f202434a.nextInt(255)));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                debugColorAllViews(viewGroup.getChildAt(i2), i + 1);
            }
        }
    }

    public static void defaultOnHomePressed(Activity activity) {
        try {
            try {
                u620.m191908e(activity);
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("defaultOnHomePressed:" + e.getMessage(), e));
            }
        } catch (Exception unused) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ Activity m20383f1(C4299r c4299r) {
        if (c4299r == null) {
            return null;
        }
        return c4299r.f15343a.get();
    }

    private boolean fixOrientation() {
        try {
            ((ActivityInfo) Reflect.m221137on("android.app.Activity").field0("mActivityInfo").get(this)).screenOrientation = -1;
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    private void fixSavedInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i == 29 || i == 30) {
                bundle.setClassLoader(getClassLoader());
                Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                if (bundle2 != null) {
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (it.hasNext()) {
                        Object obj = bundle2.get(it.next());
                        if (obj instanceof Bundle) {
                            ((Bundle) obj).setClassLoader(getClassLoader());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(new RuntimeException("try fix SavedInstanceState", th));
        }
    }

    public static C22306c<C4299r> foreground() {
        return globalLifecycleSubject.map(new w9j() { // from class: l.f20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Act.foreground;
            }
        }).distinctUntilChanged((w9j<? super R, ? extends U>) new w9j() { // from class: l.h20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Act.m20383f1((Act.C4299r) obj);
            }
        });
    }

    public static C4299r foreground_() {
        return foreground;
    }

    public static C22306c<Boolean> front() {
        return frontBs.onBackpressureLatest().asObservable();
    }

    public static HashMap<Integer, ArrayList<C4299r>> globalLifeCycle_() {
        return acts;
    }

    public static C22306c<HashMap<Integer, ArrayList<C4299r>>> globalLifecycle() {
        return globalLifecycleSubject.map(new w9j() { // from class: l.m20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Act.acts;
            }
        });
    }

    private void hideInput(int i) {
        try {
            getWindow().setSoftInputMode(i);
            if (getWindow().getCurrentFocus() != null) {
                imm().hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            } else {
                imm().hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception(getClass().getSimpleName() + " hideInput " + e.getMessage(), e));
        }
    }

    private InputMethodManager imm() {
        return (InputMethodManager) getSystemService("input_method");
    }

    public static boolean isAppVisible() {
        return startTime > stopTime;
    }

    private boolean isSpecificRecordVideo() {
        String str = Build.BRAND;
        if (ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str) && "MI 8 SE".equals(Build.MODEL)) {
            return true;
        }
        if (HardwareEarMonitorUtils.MANUFACTURER_VIVO.equals(str) && "vivo NEX S".equals(Build.MODEL)) {
            return true;
        }
        if (HardwareEarMonitorUtils.MANUFACTURER_VIVO.equals(str) && "V1809A".equals(Build.MODEL)) {
            return true;
        }
        return ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str) && "MI 8".equals(Build.MODEL);
    }

    private boolean isTranslucentOrFloating() {
        boolean zBooleanValue = false;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Reflect.m221137on("com.android.internal.R$styleable").field0("Window").get(null));
            zBooleanValue = ((Boolean) Reflect.m221137on("android.content.pm.ActivityInfo").call("isTranslucentOrFloating", typedArrayObtainStyledAttributes).get()).booleanValue();
            typedArrayObtainStyledAttributes.recycle();
            return zBooleanValue;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return zBooleanValue;
        }
    }

    private boolean isUnspecifiedState() {
        try {
            return (getPackageManager().getActivityInfo(getComponentName(), 128).softInputMode & 240) == 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static C22306c<Boolean> keyboardListenerObservable(final View view) {
        return C22306c.create(new C22306c.a() { // from class: l.r20
            @Override // p149l.e30
            public final void call(Object obj) {
                Act.m20372Q0(view, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m20387l1(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateStatusAndActionBar$27(int i, int i2, int i3, int i4, i30 i30Var, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        setStatusBarColor(yd5.m214214a(i, i2, animatedFraction));
        ColorDrawable colorDrawable = new ColorDrawable(yd5.m214214a(i3, i4, animatedFraction));
        if (i30Var != null) {
            i30Var.mo134134u(colorDrawable);
        }
        this.actionBarColor = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        ArrayList arrayList = new ArrayList(fpd0.debugNames);
        Collections.sort(arrayList);
        dialog().m20535e0(arrayList).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.t10
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(com.p046p1.mobile.android.app.Dialog dialog, View view, int i, CharSequence charSequence) {
                new tpd0(charSequence.toString(), 0).clear();
            }
        }).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$29() {
        this.currentTransAnim = null;
        finishStartWithAnim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$30() {
        this.currentTransAnim = null;
        finishPartStartWithAnim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initDataOnCreate$14(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.ACTIVE, true, getPopLifeName()));
            return;
        }
        if (c4319c == C4319c.f15554o || c4319c == C4319c.f15552m) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.DESTROY, true, getPopLifeName()));
            return;
        }
        C4319c c4319c2 = C4319c.f15550k;
        C22392a<pc80> c22392a = this.popLifeSub;
        if (c4319c == c4319c2) {
            c22392a.onNext(pc80.m168320a(PopLifecycleEvent.STOP, true, getPopLifeName()));
        } else if (c22392a.m221515e() == null) {
            this.popLifeSub.onNext(pc80.m168320a(PopLifecycleEvent.PENDING, true, getPopLifeName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$initPartTransitionPostCreate$32(AtomicBoolean atomicBoolean) {
        y20.AbstractC21281a abstractC21281a;
        if (!atomicBoolean.getAndSet(true)) {
            if (isFinishing() || (abstractC21281a = this.partTransition) == null) {
                return Boolean.FALSE;
            }
            View viewM212320c = abstractC21281a.m212320c(this.act);
            Drawable background = viewM212320c == null ? null : viewM212320c.getBackground();
            if (viewM212320c != null) {
                viewM212320c.setBackgroundDrawable(null);
            }
            Animator animatorM212323f = this.partTransition.m212323f(this.act);
            if (animatorM212323f != null) {
                animatorM212323f.addListener(new C4286e(viewM212320c, background));
                animatorM212323f.start();
                this.currentTransAnim = animatorM212323f;
            } else if (viewM212320c != null) {
                viewM212320c.setBackgroundDrawable(background);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$initTransitionPostCreate$33(AtomicBoolean atomicBoolean, Act act) {
        C4303v c4303v;
        if (!atomicBoolean.getAndSet(true)) {
            if (isFinishing() || (c4303v = this.trans) == null) {
                return Boolean.FALSE;
            }
            View viewMo20422a = c4303v.f15364b.mo20422a(this.act);
            Drawable background = viewMo20422a == null ? null : viewMo20422a.getBackground();
            if (viewMo20422a != null) {
                viewMo20422a.setBackgroundDrawable(null);
            }
            Animator animatorMo20409c = this.trans.f15364b.mo20409c(act, this.act);
            if (animatorMo20409c != null) {
                animatorMo20409c.addListener(new C4287f(act, viewMo20422a, background));
                animatorMo20409c.start();
                this.currentTransAnim = animatorMo20409c;
            } else if (viewMo20422a != null) {
                viewMo20422a.setBackgroundDrawable(background);
            }
        }
        return Boolean.TRUE;
    }

    private /* synthetic */ void lambda$new$4(C4319c c4319c) {
    }

    private static /* synthetic */ void lambda$new$5(C4299r c4299r) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$15(View view) {
        showDebugMenu();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$16(C4319c c4319c) {
        SwipeBackLayout swipeBackLayout;
        if (c4319c == C4319c.f15548i && SWIPE_BACK_SUPPORTED && (swipeBackLayout = this.swipeBack) != null) {
            swipeBackLayout.m20645s();
        }
        Bundle bundle = c4319c instanceof C4319c.a ? ((C4319c.a) c4319c).f15559p : null;
        du2.m113671b("[common][lifecycle]", getClass(), c4319c.f15557c, bundle != null ? bundle.toString() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$pendChangeActionButtonTypeface$13() {
        Toolbar toolbar = toolbar();
        if (toolbar == null) {
            return Boolean.TRUE;
        }
        Iterator it = vwb.m200339n(xdl0.m208399s(toolbar), new w9j() { // from class: l.u10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.m117752c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$progress$28(Dialog dialog, boolean z, float f, WindowManager.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        if (this.progressDialog == dialog) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.alpha = valueAnimator.getAnimatedFraction();
            if (z) {
                attributes.dimAmount = f;
            }
            dialog.getWindow().setAttributes(layoutParams);
        }
    }

    private static C4302u lmdCreate(String str, Sensor sensor) {
        if (sensor == null) {
            return null;
        }
        C4302u c4302u = new C4302u();
        c4302u.f15359a = sensor;
        C4289h c4289h = new C4289h(c4302u);
        c4302u.f15360b = c4289h;
        sensorManager.registerListener(c4289h, c4302u.f15359a, 3);
        return c4302u;
    }

    public static boolean lmdEnd() {
        try {
            SensorManager sensorManager2 = sensorManager;
            if (sensorManager2 != null) {
                sensorManager = null;
                for (C4302u c4302u : sensors) {
                    if (c4302u != null) {
                        sensorManager2.unregisterListener(c4302u.f15360b, c4302u.f15359a);
                    }
                }
                lmdResult = lmdResultMoved();
                sensors.clear();
                sensors = null;
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("Act lmdEnd:" + e.getMessage(), e));
        }
        return lmdResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lmdResultMoved() {
        ArrayList<C4302u> arrayList = sensors;
        if (arrayList != null) {
            for (C4302u c4302u : arrayList) {
                if (c4302u != null && c4302u.f15362d >= 10) {
                    float f = c4302u.f15361c[5][0];
                    int i = 0;
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (c4302u.f15361c[i2][0] != f) {
                            i++;
                        }
                        if (i >= 5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean needAwardFilePermission() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toUpperCase().equals("HONOR")) {
            return true;
        }
        if (TextUtils.isEmpty(str) || !str.toUpperCase().equals("NUBIA")) {
            return !TextUtils.isEmpty(str) && str.toUpperCase().equals("HUAWEI");
        }
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ void m20390o1() {
    }

    public static Dialog progress(Activity activity, String str, String str2) {
        View viewInflate;
        Window window;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            viewInflate = LayoutInflater.from(activity).inflate(b6c0.f73774F, (ViewGroup) null);
        } else {
            viewInflate = LayoutInflater.from(activity).inflate(b6c0.f73773E, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(p4c0.f147123j0);
            TextView textView2 = (TextView) viewInflate.findViewById(p4c0.f147061D);
            if (textView != null) {
                textView.setText(str);
            }
            if (textView2 != null) {
                if (TextUtils.isEmpty(str2)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(str2);
                }
            }
        }
        DialogInterfaceC0074a dialogInterfaceC0074aCreate = new DialogInterfaceC0074a.a(activity).setView(viewInflate).setCancelable(false).create();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && (window = dialogInterfaceC0074aCreate.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = dialogInterfaceC0074aCreate.getWindow().getAttributes();
            attributes.gravity = 17;
            attributes.width = t100.m186890d(78.0f);
            attributes.height = t100.m186890d(78.0f);
            dialogInterfaceC0074aCreate.getWindow().setAttributes(attributes);
        }
        dialogInterfaceC0074aCreate.setCanceledOnTouchOutside(false);
        return dialogInterfaceC0074aCreate;
    }

    private void reportPickMediaError(PickMediaError pickMediaError) {
        if (pickMediaError == PickMediaError.NOT_RESOLVABLE) {
            lsi0.m151579i(R$string.f15124h7, false);
        } else if (pickMediaError == PickMediaError.FILE_NOT_FOUND) {
            lsi0.m151579i(R$string.f15124h7, false);
        }
    }

    public static int sessionCount() {
        return sessionCount;
    }

    private void setWindowContentOverlayCompat() {
    }

    public static void tryUpdateForegroundStatus() {
        if (foregroundStatusUpdated) {
            return;
        }
        C4299r c4299r = null;
        for (ArrayList<C4299r> arrayList : acts.values()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4299r c4299r2 = arrayList.get(size);
                C4319c c4319c = c4299r2.f15344b;
                if (c4319c == C4319c.f15547h || c4319c == C4319c.f15548i) {
                    foregroundStatusUpdated = true;
                    foreground = c4299r2;
                    return;
                }
                if ((c4319c == C4319c.f15550k || c4319c == C4319c.f15549j) && c4299r2.f15345c > SystemClock.uptimeMillis() - 1000 && (c4299r == null || c4299r.f15345c <= c4299r2.f15345c)) {
                    c4299r = c4299r2;
                }
            }
        }
        foregroundStatusUpdated = true;
        foreground = c4299r;
    }

    public Act act() {
        return this;
    }

    public String actionItemPadding(String str) {
        return str.trim();
    }

    public AbstractC15503a<j760<String, CharSequence>> adapterChangeLog(ArrayList<j760<String, CharSequence>> arrayList) {
        return new C4288g(arrayList);
    }

    public void addSwipeBackListener(mbh0 mbh0Var) {
        SwipeBackLayout swipeBackLayout;
        if (!SWIPE_BACK_SUPPORTED || (swipeBackLayout = this.swipeBack) == null) {
            return;
        }
        swipeBackLayout.m20643q(mbh0Var);
    }

    @CallSuper
    public void afterDestroyLivecycle() {
    }

    public void alwaysHideInput() {
        hideInput(3);
    }

    public void animateStatusAndActionBar(final int i, final int i2) {
        final int iStatusBarColor = statusBarColor();
        final i30 supportActionBar = getSupportActionBar();
        final int i3 = this.actionBarColor;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f146785a.lambda$animateStatusAndActionBar$27(iStatusBarColor, i, i3, i2, supportActionBar, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L).start();
    }

    public void changeAppLocale(String str) {
        Locale locale = new Locale(str);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, displayMetrics);
        m47815F2();
    }

    public boolean checkOptionsItemSelectSpeedOk() {
        if (SystemClock.elapsedRealtime() - this.lastItemSelectedTime <= 300) {
            return false;
        }
        this.lastItemSelectedTime = SystemClock.elapsedRealtime();
        return true;
    }

    public PickMediaError checkPickMediaError(String str) {
        try {
            if (str == null) {
                return PickMediaError.NOT_RESOLVABLE;
            }
            if (new File(str).exists()) {
                return null;
            }
            return PickMediaError.FILE_NOT_FOUND;
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("checkPickMediaError:" + e.getMessage(), e));
            return PickMediaError.NOT_RESOLVABLE;
        }
    }

    public void checkSavedInstanceStateAndCache(Bundle bundle) {
    }

    public void clearUpKeyboardListenerAndResizeChildOfContent() {
        this.isSetUpKeyboardDetectorLayout = false;
        possiblyResizeChildOfContent();
    }

    public int color(int i) {
        return getResources().getColor(i);
    }

    @Override // p149l.mcr
    public void creates(final e30<Bundle> e30Var, final d30 d30Var) {
        n11.m157330c();
        this.lifecycleSubject.subscribe(new e30() { // from class: l.n20
            @Override // p149l.e30
            public final void call(Object obj) {
                Act.m20371P0(e30Var, d30Var, (C4319c) obj);
            }
        }, EMPTY_ON_ERROR, ACTION0_NOTHING);
    }

    public void cropImage(String str) {
        startActivityForResult(CropperAct.m21052E1(this, str), CROP_IMAGE);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(new j760<>("finish the activity", new d30() { // from class: l.a20
            @Override // p149l.d30
            public final void call() {
                this.f67214a.lambda$debugItems$19();
            }
        }));
        arrayList.add(new j760<>("clear SavedValue", new d30() { // from class: l.b20
            @Override // p149l.d30
            public final void call() {
                this.f72650a.lambda$debugItems$21();
            }
        }));
        return arrayList;
    }

    public View decorOrSwipingDecorView() {
        return SWIPE_BACK_SUPPORTED ? this.swipeBack.m20646t() : getWindow().getDecorView();
    }

    public Dialog.C4309e dialog() {
        return new Dialog.C4309e(this);
    }

    public void dimStatusBar(boolean z) {
        getWindow().getDecorView().setSystemUiVisibility(z ? 1 : 0);
    }

    public Drawable drawable(int i) {
        return nu0.m161424b(this, i);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return mkd0.m154952D(v9jVar, lifecycle().compose(mkd0.m154953E()), z);
    }

    public Animator enterAnimation() {
        return null;
    }

    public Animator exitAnimation() {
        return null;
    }

    @Override // android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void lambda$debugItems$19() {
        this.lifecycleSubject.onNext(C4319c.f15554o);
        C4303v c4303v = this.trans;
        if (c4303v != null) {
            if (this.finishingByAnimation) {
                return;
            }
            this.finishingByAnimation = true;
            if (this.currentTransAnim == null || c4303v.f15364b.mo20408b()) {
                finishStartWithAnim();
                return;
            } else {
                bt0.m103733f(this.currentTransAnim, new Runnable() { // from class: l.m10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f130787a.lambda$finish$29();
                    }
                });
                return;
            }
        }
        y20.AbstractC21281a abstractC21281a = this.partTransition;
        if (abstractC21281a == null) {
            actualFinish();
            return;
        }
        if (this.finishingByAnimation) {
            return;
        }
        this.finishingByAnimation = true;
        if (this.currentTransAnim == null || abstractC21281a.m212321d()) {
            finishPartStartWithAnim();
        } else {
            bt0.m103733f(this.currentTransAnim, new Runnable() { // from class: l.n10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136608a.lambda$finish$30();
                }
            });
        }
    }

    public void finishPartStartWithAnim() {
        View viewM212320c = this.partTransition.m212320c(this.act);
        if (viewM212320c != null) {
            viewM212320c.setBackgroundDrawable(null);
        }
        Animator animatorM212325h = this.partTransition.m212325h(this.act);
        if (animatorM212325h != null) {
            animatorM212325h.addListener(new C4284c());
            animatorM212325h.start();
        } else {
            this.partTransition = null;
            actualFinish();
        }
    }

    public void finishStartWithAnim() {
        Act act = this.trans.f15363a.get();
        if (act == null) {
            this.trans = null;
            actualFinish();
            return;
        }
        View viewMo20422a = this.trans.f15364b.mo20422a(this);
        if (viewMo20422a != null) {
            viewMo20422a.setBackgroundDrawable(null);
        }
        final View decorView = act.getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            decorView = ((ViewGroup) decorView).getChildAt(0);
        }
        if (decorView != null) {
            decorView.setVisibility(0);
            post(new Runnable() { // from class: l.x10
                @Override // java.lang.Runnable
                public final void run() {
                    decorView.setVisibility(0);
                }
            });
        }
        Animator animatorMo20410d = this.trans.f15364b.mo20410d(act, this);
        if (animatorMo20410d != null) {
            animatorMo20410d.addListener(new C4285d());
            animatorMo20410d.start();
        } else {
            this.trans = null;
            actualFinish();
        }
    }

    public void finishWithoutCustomAnimation() {
        this.lifecycleSubject.onNext(C4319c.f15554o);
        actualFinish();
    }

    public c0e flow() {
        return new c0e();
    }

    public FragmentManager fragmentManager() {
        return getSupportFragmentManager();
    }

    @NonNull
    public abstract nx0 getAppTheme();

    public TextView getCentralTitle(CharSequence charSequence) {
        VText vText = new VText(this);
        int i = t100.f167261j;
        int i2 = t100.f167256e;
        vText.setPadding(i, i2, i, i2);
        vText.setSingleLine();
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setTypeface(eqh0.m117752c(3));
        vText.setText(charSequence);
        vText.setTextColor(this.originalTitle.getTextColors());
        vText.setTextSize(0, this.originalTitle.getTextSize());
        return vText;
    }

    @Override // p149l.k0m
    public String getPopLifeName() {
        return getClass().getSimpleName() + "_" + hashCode();
    }

    public Dialog getShowingDialog() {
        List<WeakReference<Dialog>> list = this.showingDialogList;
        if (list != null && list.size() > 0) {
            for (int size = this.showingDialogList.size() - 1; size >= 0; size--) {
                if (this.showingDialogList.get(size).get() != null) {
                    return this.showingDialogList.get(size).get();
                }
            }
        }
        return null;
    }

    public boolean hasCustomTransition() {
        return this.trans != null;
    }

    public void hideSystemUi(boolean z) {
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(3846);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1792);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public LayoutInflater inflater() {
        return LayoutInflater.from(this);
    }

    public void initAnimationState() {
    }

    @CallSuper
    public void initDataOnCreate() {
        lqf.m151015a().m151017c(ExtraActLifecycle.onInitDataOnCreate, this);
        lifecycle().subscribe(new e30() { // from class: l.o10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141396a.lambda$initDataOnCreate$14((C4319c) obj);
            }
        });
    }

    public void initPartTransitionCreate() {
        String stringExtra = getIntent().getStringExtra("unique_transition_key");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.partTransition = y20.m212317b(stringExtra);
    }

    public void initPartTransitionPostCreate() {
        y20.AbstractC21281a abstractC21281a = this.partTransition;
        if (abstractC21281a != null) {
            abstractC21281a.m212332o(this.act);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            xdl0.m208366b0(getWindow().getDecorView(), new v9j() { // from class: l.w10
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f183963a.lambda$initPartTransitionPostCreate$32(atomicBoolean);
                }
            });
        }
    }

    @CallSuper
    public void initSubscription() {
        lqf.m151015a().m151017c(ExtraActLifecycle.onInitSubscription, this);
    }

    public void initTransitionCreate() {
        Act act;
        C4303v c4303vPoll = tempQueue.poll();
        if (c4303vPoll == null || !c4303vPoll.f15365c.equals(getClass().getName()) || (act = c4303vPoll.f15363a.get()) == null) {
            return;
        }
        this.trans = new C4303v(new WeakReference(act), c4303vPoll.f15364b, c4303vPoll.f15365c);
    }

    public void initTransitionPostCreate() {
        final Act act;
        C4303v c4303v = this.trans;
        if (c4303v == null || (act = c4303v.f15363a.get()) == null) {
            return;
        }
        this.trans.f15364b.mo20414h(act, this.act);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        xdl0.m208366b0(getWindow().getDecorView(), new v9j() { // from class: l.i20
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f110526a.lambda$initTransitionPostCreate$33(atomicBoolean, act);
            }
        });
    }

    public boolean isAdjustResizeEnabled() {
        return isAdjustResizeInAttributes() || isAdjustResizeInManifest();
    }

    public boolean isAdjustResizeInAttributes() {
        return (getWindow().getAttributes().softInputMode & 240) == 16;
    }

    public boolean isAdjustResizeInManifest() {
        try {
            return (getPackageManager().getActivityInfo(getComponentName(), 128).softInputMode & 240) == 16;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public boolean isCancelable() {
        Dialog showingDialog = getShowingDialog();
        if (!(showingDialog instanceof Dialog)) {
            return true;
        }
        Dialog.C4309e c4309e = ((Dialog) showingDialog).f15407l;
        if (c4309e == null) {
            return false;
        }
        return c4309e.f15441F;
    }

    public boolean isDialogShowing() {
        List<WeakReference<Dialog>> list = this.showingDialogList;
        return list != null && list.size() > 0 && this.showingDialogList.get(0).get() != null && this.showingDialogList.get(0).get().isShowing();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return super.isFinishing() || this.finishingByAnimation;
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return this.lifecycleSubject;
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return this.lifecycleSubject.m221515e();
    }

    public void lmdStart(int i) {
        try {
            if (sensorManager == null) {
                e51.m114743H(App.f15369e, new Runnable() { // from class: l.o20
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act.lmdEnd();
                    }
                }, i);
                lmdResult = false;
                sensorManager = (SensorManager) getSystemService("sensor");
                ArrayList<C4302u> arrayList = new ArrayList<>();
                sensors = arrayList;
                arrayList.add(lmdCreate("0", sensorManager.getDefaultSensor(1)));
                sensors.add(lmdCreate("1", sensorManager.getDefaultSensor(4)));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("Act lmdStart exception:" + e.getMessage(), e));
        }
    }

    @Deprecated
    public void mediaCapture(boolean z, boolean z2) {
        Intent intent = new Intent(z ? "android.media.action.IMAGE_CAPTURE" : "android.media.action.VIDEO_CAPTURE");
        if (z) {
            intent.setPackage("com.android.camera");
            if (!canResolveTargetPackage(intent)) {
                intent.setPackage(null);
            }
        }
        if (z || !isSpecificRecordVideo()) {
            File fileM145083O = k9j.m145083O("cache");
            tempFileName = fileM145083O.getAbsolutePath();
            Uri uriForFile = FileProvider.getUriForFile(this, "files." + getPackageName(), fileM145083O);
            if (!z && needAwardFilePermission()) {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setDataAndType(uriForFile, "video/*");
                    List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent2, 65536);
                    if (!vwb.m200296J(listQueryIntentActivities)) {
                        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
                        }
                    }
                } catch (ActivityNotFoundException e) {
                    CrashHelper.m81296c(e);
                }
            }
            intent.putExtra("output", uriForFile);
        }
        intent.putExtra("return-data", true);
        if (z2) {
            intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        try {
            this.act.startActivityForResult(intent, z ? 16384 : RECORD_VIDEO);
            mediaCaptureBs.onNext(Boolean.valueOf(z));
        } catch (ActivityNotFoundException e2) {
            CrashHelper.m81296c(e2);
            lsi0.m151578h(R$string.f15114g7);
        } catch (SecurityException e3) {
            CrashHelper.m81296c(e3);
        }
    }

    public void monitorInflateViewCost(long j) {
    }

    public boolean needMarkResume() {
        return true;
    }

    public boolean needXmlMonitor() {
        return false;
    }

    public dd80.C16336a newDialog() {
        return new dd80.C16336a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @TargetApi(16)
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityReslutManager.m20612b(i, i2, intent)) {
            return;
        }
        if (i2 != -1) {
            try {
                super.onActivityResult(i, i2, intent);
                return;
            } catch (IllegalStateException e) {
                if (!"Task is already complete".equals(e.getMessage())) {
                    throw e;
                }
                CrashHelper.m81296c(e);
                return;
            }
        }
        PickMediaError pickMediaError = null;
        if (i == 4096 && intent.getClipData() != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                String strM104830g = c16.m104830g(intent.getClipData().getItemAt(i3).getUri());
                PickMediaError pickMediaErrorCheckPickMediaError = checkPickMediaError(strM104830g);
                if (pickMediaErrorCheckPickMediaError == null) {
                    arrayList.add(strM104830g);
                } else if (pickMediaError == null) {
                    pickMediaError = pickMediaErrorCheckPickMediaError;
                }
            }
            if (pickMediaError != null) {
                reportPickMediaError(pickMediaError);
            }
            if (arrayList.size() > 0) {
                onPickImagesSystemResult(arrayList);
                return;
            }
            return;
        }
        if ((i == 8192 || i == 4096) && intent.getData() != null) {
            ArrayList arrayList2 = new ArrayList();
            String strM104830g2 = c16.m104830g(intent.getData());
            PickMediaError pickMediaErrorCheckPickMediaError2 = checkPickMediaError(strM104830g2);
            if (pickMediaErrorCheckPickMediaError2 != null) {
                reportPickMediaError(pickMediaErrorCheckPickMediaError2);
                return;
            } else {
                arrayList2.add(strM104830g2);
                onPickImagesSystemResult(arrayList2);
                return;
            }
        }
        if (i == 12288) {
            String strM104830g3 = c16.m104830g(intent.getData());
            PickMediaError pickMediaErrorCheckPickMediaError3 = checkPickMediaError(strM104830g3);
            if (pickMediaErrorCheckPickMediaError3 == null) {
                onPickVideoSystemResult(strM104830g3);
                return;
            } else {
                reportPickMediaError(pickMediaErrorCheckPickMediaError3);
                return;
            }
        }
        if (i == RECORD_VIDEO) {
            if (isSpecificRecordVideo() && intent.getData() != null && "content".equals(intent.getData().getScheme())) {
                Cursor cursorQuery = getContentResolver().query(intent.getData(), new String[]{"_data"}, null, null, null);
                tempFileName = (cursorQuery == null || !cursorQuery.moveToFirst()) ? null : cursorQuery.getString(0);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            String str = tempFileName;
            if (str != null) {
                onRecordVideoResult(str);
                tempFileName = null;
                return;
            }
            return;
        }
        if (i == 16384) {
            String str2 = tempFileName;
            if (str2 != null) {
                onTakePictureResult(str2);
                tempFileName = null;
                return;
            }
            return;
        }
        if (i != 24576) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        String stringExtra = intent.getStringExtra("path");
        if (stringExtra != null) {
            onCropImageResult(stringExtra);
            post(new Runnable() { // from class: l.c20
                @Override // java.lang.Runnable
                public final void run() {
                    System.gc();
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xdl0.m208333G0(true);
        this.screenHeight = xdl0.m208410x0(this);
        int iM208414z0 = xdl0.m208414z0(this);
        this.screenWidth = iM208414z0;
        if (hn5.m131881d(iM208414z0)) {
            hn5.m131880c(this, 360);
            hn5.m131880c(App.f15369e, 360);
        } else {
            hn5.m131879b(this);
            hn5.m131879b(App.f15369e);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @Deprecated
    public final void onCreate(Bundle bundle) {
        boolean z;
        Bundle bundle2;
        fixSavedInstanceState(bundle);
        try {
            Bundle bundle3 = (Bundle) getIntent().getParcelableExtra(STUB_SAVED_INSTANCE_STATE);
            this.savedInstanceStateCache = bundle3;
            fixSavedInstanceState(bundle3);
            checkSavedInstanceStateAndCache(bundle);
            z = false;
        } catch (Exception e) {
            CrashHelper.m81297d(new IllegalArgumentException("Act getParcelableExtra error ，act = " + this, e), 1000);
            onReadIntentError();
            z = true;
        }
        if (bundle == null && (bundle2 = this.savedInstanceStateCache) != null) {
            this.callOnRestoreInstanceState = true;
            bundle = bundle2;
        }
        isActResumed = false;
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            fixOrientation();
        }
        boolean z2 = z || shouldBlockOnCreate(bundle);
        this.hasBlockOnCreate = z2;
        if (z2) {
            if (bundle != null) {
                bundle.remove(FRAGMENTS_TAG);
                bundle.remove(SUPPORT_FRAGMENTS_TAG);
                this.callOnRestoreInstanceState = false;
                this.savedInstanceStateCache = null;
            }
            super.onCreate(bundle);
            actualFinish();
            return;
        }
        hi3.m131197a(getIntent().getExtras(), getClass().getSimpleName().concat(",onCreate getIntent"));
        if (bundle != null) {
            hi3.m131197a(bundle, getClass().getSimpleName().concat(",onCreate sis"));
            Bundle bundle4 = bundle.getBundle(STAT_GLOBAL_STATE);
            if (bundle4 != null) {
                onRestoreGlobalState(bundle4);
            }
        }
        initDataOnCreate();
        initSubscription();
        setTheme();
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack = SwipeBackLayout.m20634w(this);
            TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.statusBarColor});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.swipeBack.m20636B(color);
            getWindow().setStatusBarColor(0);
        }
        super.onCreate(bundle);
        this.res = getResources();
        this.screenHeight = xdl0.m208410x0(this);
        int iM208414z0 = xdl0.m208414z0(this);
        this.screenWidth = iM208414z0;
        if (hn5.m131881d(iM208414z0)) {
            hn5.m131880c(this, 360);
            hn5.m131880c(App.f15369e, 360);
        } else {
            hn5.m131879b(this);
            hn5.m131879b(App.f15369e);
        }
        if (C4318b.f15538a) {
            getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalFocusChangeListener(new C4318b.a());
        }
        initTransitionCreate();
        initPartTransitionCreate();
        preCreateView(bundle);
        if (isFinishing()) {
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo134136w(true);
            getSupportActionBar().mo134111A(getSupportActionBar().mo134123j() / 2.0f);
            try {
                View view = (View) TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar());
                if (view != null) {
                    view.setFocusable(false);
                }
                TextView textView = (TextView) TOOLBAR_TITLE_VIEW_FILED.get(toolbar());
                if (textView != null) {
                    textView.setTypeface(eqh0.m117752c(3));
                }
                view.setMinimumWidth(t100.m186890d(56.0f));
                if (debugShowMenu && getSupportActionBar() != null) {
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p10
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            return this.f146634a.lambda$onCreate$15(view2);
                        }
                    });
                }
            } catch (IllegalAccessException e2) {
                CrashHelper.m81296c(e2);
            }
        }
        boolean z3 = App.f15366b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        View viewInflateView = inflateView(inflater(), null);
        monitorInflateViewCost(jCurrentTimeMillis);
        setWindowContentOverlayCompat();
        if (viewInflateView != null) {
            setContentView(viewInflateView);
        }
        lifecycle().subscribe(new e30() { // from class: l.q10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152101a.lambda$onCreate$16((C4319c) obj);
            }
        });
        this.lifecycleSubject.onNext(new C4319c.a(bundle));
        this.lifecycleSubject.onNext(C4319c.f15545f);
        if (viewInflateView != null) {
            viewInflateView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4291j());
            if (gbl0.m125170O(viewInflateView)) {
                possiblyResizeChildOfContent();
            }
        }
        int taskId = getTaskId();
        ArrayList<C4299r> arrayList = acts.get(Integer.valueOf(taskId));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            acts.put(Integer.valueOf(taskId), arrayList);
        }
        C4299r c4299r = new C4299r();
        c4299r.f15343a = new WeakReference<>(this);
        c4299r.f15344b = C4319c.f15545f;
        arrayList.add(c4299r);
        changeGlobalLifecycleStates();
        AutoSpeedCustomView autoSpeedCustomView = new AutoSpeedCustomView(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(1, 1);
        autoSpeedCustomView.setBackgroundColor(0);
        autoSpeedCustomView.setLayoutParams(layoutParams);
        ((ViewGroup) getWindow().getDecorView()).addView(autoSpeedCustomView);
    }

    public void onCropImageResult(String str) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated
    public final void onDestroy() {
        SwipeBackLayout swipeBackLayout;
        if (this.hasBlockOnCreate) {
            super.onDestroy();
            return;
        }
        this.lifecycleSubject.onNext(C4319c.f15552m);
        this.lifecycleSubject.onCompleted();
        Iterator<ArrayList<C4299r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().f15343a.get() == this) {
                    it2.remove();
                    z = true;
                }
            }
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception(getClass().getSimpleName() + " onDestroy: " + e.getMessage(), e));
            }
        }
        if (SWIPE_BACK_SUPPORTED && (swipeBackLayout = this.swipeBack) != null) {
            swipeBackLayout.m20649x();
        }
        onDestroyLifecycle();
        super.onDestroy();
        afterDestroyLivecycle();
    }

    @CallSuper
    public void onDestroyLifecycle() {
        if (isFromBackStack || e51.m114736A(App.f15369e)) {
            return;
        }
        isFromDestoryed = true;
        lqf.m151015a().m151017c(ExtraActLifecycle.onDestroyToBackground, this);
    }

    @Override // p149l.d0e
    public void onDialogAttachToWindow(Dialog dialog) {
        if (this.showingDialogList == null) {
            this.showingDialogList = new ArrayList();
        }
        this.showingDialogList.add(new WeakReference<>(dialog));
    }

    @Override // p149l.d0e
    public void onDialogDetachFromWindow(final Dialog dialog) {
        WeakReference weakReference;
        List<WeakReference<Dialog>> list = this.showingDialogList;
        if (list == null || (weakReference = (WeakReference) vwb.m200346r(list, new w9j() { // from class: l.l10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((WeakReference) obj).get() == dialog);
            }
        })) == null) {
            return;
        }
        this.showingDialogList.remove(weakReference);
    }

    public void onDialogDismissExtra(final d30 d30Var) {
        if (isDialogShowing() && (this.showingDialogList.get(0).get() instanceof Dialog)) {
            ((Dialog) this.showingDialogList.get(0).get()).f167046i.filter(new w9j() { // from class: l.j20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Act.m20367K0((Boolean) obj);
                }
            }).take(1).subscribe(new e30() { // from class: l.k20
                @Override // p149l.e30
                public final void call(Object obj) {
                    d30Var.call();
                }
            });
        }
    }

    public void onHomePressed() {
        defaultOnHomePressed(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        lqf.m151015a().m151017c(ExtraActLifecycle.onNewIntent, this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.act.onHomePressed();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated
    public final void onPause() {
        if (this.hasBlockOnResume) {
            super.onPause();
            return;
        }
        this.lifecycleSubject.onNext(C4319c.f15549j);
        Iterator<ArrayList<C4299r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4299r c4299r : it.next()) {
                if (c4299r.f15343a.get() == this) {
                    c4299r.f15344b = C4319c.f15549j;
                    c4299r.f15345c = SystemClock.uptimeMillis();
                    z = true;
                }
            }
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        onPauseLifecycle();
        super.onPause();
    }

    @CallSuper
    public void onPauseLifecycle() {
    }

    public void onPickImagesSystemResult(List<String> list) {
    }

    public void onPickVideoSystemResult(String str) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        if (this.callOnRestoreInstanceState) {
            onRestoreInstanceState(this.savedInstanceStateCache);
            super.onPostCreate(this.savedInstanceStateCache);
            this.callOnRestoreInstanceState = false;
            this.savedInstanceStateCache = null;
        } else {
            super.onPostCreate(bundle);
        }
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m20644r();
        }
        initTransitionPostCreate();
        initPartTransitionPostCreate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        try {
            if (this.actionMenuView == null) {
                this.actionMenuView = (ActionMenuView) TOOLBAR_MENU_VIEW_FILED.get(toolbar());
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        if (this.actionMenuView != null) {
            int iM186890d = t100.m186890d(8.0f);
            ArrayList<MenuItemImpl> nonActionItems = menu != null ? ((MenuBuilder) menu).getNonActionItems() : null;
            if (nonActionItems == null) {
                z = false;
            } else {
                int size = nonActionItems.size();
                if (size == 1) {
                    z = !nonActionItems.get(0).isActionViewExpanded();
                } else if (size > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.actionMenuView.setPadding(0, 0, 0, 0);
            } else {
                int size2 = menu.size();
                boolean z2 = false;
                for (int i = 0; i < size2; i++) {
                    MenuItem item = menu.getItem(i);
                    if (item.isVisible() && (item.getIcon() != null || item.getActionView() != null)) {
                        z2 = true;
                    }
                }
                ActionMenuView actionMenuView = this.actionMenuView;
                if (z2) {
                    actionMenuView.setPadding(0, 0, 0, 0);
                } else {
                    actionMenuView.setPadding(0, 0, iM186890d, 0);
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onReadIntentError() {
    }

    public void onRecordVideoResult(String str) {
    }

    @CallSuper
    public void onRestoreGlobalState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated
    public final void onResume() {
        boolean zShouldBlockOnResume = shouldBlockOnResume();
        this.hasBlockOnResume = zShouldBlockOnResume;
        if (zShouldBlockOnResume) {
            super.onResume();
            m47815F2();
            return;
        }
        C4303v c4303v = this.trans;
        if (c4303v != null && c4303v.f15363a.get() != null) {
            this.trans.f15364b.mo20412f(this.act);
        }
        y20.AbstractC21281a abstractC21281a = this.partTransition;
        if (abstractC21281a != null) {
            abstractC21281a.m212329l(this.act);
        }
        super.onResume();
        this.lifecycleSubject.onNext(C4319c.f15548i);
        Iterator<ArrayList<C4299r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4299r c4299r : it.next()) {
                if (c4299r.f15343a.get() == this) {
                    c4299r.f15344b = C4319c.f15548i;
                    z = true;
                }
            }
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        backgroundCheckHandler.removeCallbacksAndMessages(null);
        onResumeLifecycle();
        if (needMarkResume()) {
            isActResumed = true;
        }
    }

    @CallSuper
    public void onResumeLifecycle() {
        if (isInit || isFromBackStack || isFromDestoryed) {
            lqf.m151015a().m151017c(ExtraActLifecycle.onResumeFromAppStart, this);
        } else if (isFromBackground) {
            lqf.m151015a().m151017c(ExtraActLifecycle.onResumeFromBackground, this);
        }
        if (isInit || isFromBackStack || isFromDestoryed || isFromBackground) {
            lqf.m151015a().m151017c(ExtraActLifecycle.onResumeFromAppStartOrBackground, this);
        }
        isInit = false;
        isFromBackStack = false;
        isFromDestoryed = false;
        isFromBackground = false;
    }

    @CallSuper
    public void onSaveGlobalState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        onSaveGlobalState(bundle2);
        bundle.putBundle(STAT_GLOBAL_STATE, bundle2);
        hi3.m131197a(bundle, getClass().getSimpleName().concat(",onSaveInstanceState"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated
    public final void onStart() {
        boolean zShouldBlockOnStart = shouldBlockOnStart();
        this.hasBlockOnStart = zShouldBlockOnStart;
        if (zShouldBlockOnStart) {
            super.onStart();
            m47815F2();
            return;
        }
        super.onStart();
        this.lifecycleSubject.onNext(C4319c.f15547h);
        Iterator<ArrayList<C4299r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4299r c4299r : it.next()) {
                if (c4299r.f15343a.get() == this) {
                    c4299r.f15344b = C4319c.f15547h;
                    z = true;
                }
            }
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        int i = activityCount + 1;
        activityCount = i;
        if (i == 1) {
            frontBs.onNext(Boolean.TRUE);
        }
        startTime++;
        onStartLifecycle();
    }

    @CallSuper
    public void onStartLifecycle() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated
    public final void onStop() {
        if (this.hasBlockOnStart) {
            super.onStop();
            return;
        }
        this.lifecycleSubject.onNext(C4319c.f15550k);
        Iterator<ArrayList<C4299r>> it = acts.values().iterator();
        while (it.hasNext()) {
            for (C4299r c4299r : it.next()) {
                if (c4299r.f15343a.get() == this) {
                    c4299r.f15344b = C4319c.f15550k;
                    c4299r.f15345c = SystemClock.uptimeMillis();
                }
            }
        }
        Handler handler = backgroundCheckHandler;
        handler.sendMessageDelayed(handler.obtainMessage(), 1010L);
        stopTime++;
        onStopLifecycle();
        int i = activityCount - 1;
        activityCount = i;
        if (i == 0) {
            frontBs.onNext(Boolean.FALSE);
        }
        super.onStop();
    }

    @CallSuper
    public void onStopLifecycle() {
        if (isFromBackStack || e51.m114736A(App.f15369e)) {
            return;
        }
        isFromBackground = true;
        lqf.m151015a().m151017c(ExtraActLifecycle.onStopToBackground, this);
    }

    public void onTakePictureResult(String str) {
    }

    public String pageId() {
        return getClass().getName();
    }

    public void pendChangeActionButtonTypeface() {
        xdl0.m208366b0(findViewById(R.id.content), new v9j() { // from class: l.y10
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f195368a.lambda$pendChangeActionButtonTypeface$13();
            }
        });
    }

    public void pickImageSystem() {
        pickImagesSystem(false);
    }

    public void pickImagesSystem(boolean z) {
        if (z) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
            try {
                startActivityForResult(intent, 4096);
                return;
            } catch (ActivityNotFoundException e) {
                CrashHelper.m81296c(e);
                pickImagesSystem(false);
                return;
            }
        }
        Intent intent2 = new Intent("android.intent.action.PICK");
        intent2.setType("image/*");
        try {
            startActivityForResult(intent2, 8192);
        } catch (ActivityNotFoundException e2) {
            CrashHelper.m81296c(e2);
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.setType("image/*");
            try {
                startActivityForResult(intent3, 8192);
            } catch (ActivityNotFoundException e3) {
                CrashHelper.m81296c(e3);
            }
        }
    }

    public void pickVideoSystem() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("video/*");
        try {
            try {
                try {
                    startActivityForResult(intent, 12288);
                } catch (ActivityNotFoundException unused) {
                    Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("video/*");
                    startActivityForResult(intent2, 12288);
                }
            } catch (ActivityNotFoundException unused2) {
                Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                intent3.setType("video/*");
                startActivityForResult(Intent.createChooser(intent3, ""), 12288);
            }
        } catch (ActivityNotFoundException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.k0m
    public C22392a<pc80> popLifeObs() {
        return this.popLifeSub;
    }

    public void possiblyResizeChildOfContent() {
        if (!this.isSetUpKeyboardDetectorLayout && Build.VERSION.SDK_INT > 34 && isAdjustResizeEnabled()) {
            View decorView = getWindow().getDecorView();
            final boolean z = (decorView.getSystemUiVisibility() & 1024) == 1024;
            final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            final View childAt = frameLayout.getChildAt(0);
            final ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            final int[] iArr = {0};
            final boolean[] zArr = {false};
            gbl0.m125231y0(decorView, new bd50() { // from class: l.z10
                @Override // p149l.bd50
                public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                    return Act.m20366J0(zArr, iArr, z, layoutParams, frameLayout, childAt, view, y6q0Var);
                }
            });
            gbl0.m125195g0(decorView);
        }
    }

    public void post(Runnable runnable) {
        e51.m114742G(runnable);
    }

    public void postDelayed(Runnable runnable, long j) {
        e51.m114743H(this, runnable, j);
    }

    public void preCreateView(Bundle bundle) {
    }

    public void progressDismiss() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception(getClass().getSimpleName() + " progressDismiss: " + e.getMessage(), e));
            }
            this.progressDialog = null;
        }
    }

    public void realFinishAfterFinishingAnimation() {
        C4303v c4303v = this.trans;
        AbstractC4304w abstractC4304w = c4303v == null ? null : c4303v.f15364b;
        this.trans = null;
        actualFinish();
        if (abstractC4304w != null) {
            abstractC4304w.mo20413g(this);
        }
    }

    @Deprecated
    public void recordVideo() {
        mediaCapture(false);
    }

    public void registerOnActivityResultListener(C4317a.a aVar) {
        this.activityReslutManager.m20613c(aVar);
    }

    public void removeCallbacks(Runnable runnable) {
        e51.m114745J(runnable);
    }

    public void removeKeyboardListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public void setActionBarColor(int i) {
        this.actionBarColor = i;
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo134134u(new ColorDrawable(i));
        }
    }

    public void setConvertActivityFromTranslucentEnable(boolean z) {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.setEnableConvertActivityFromTranslucent(z);
        }
    }

    public void setFullSlide(boolean z) {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.setFullSlide(z);
        }
    }

    public void setGradientStatusBar() {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m20651z();
        }
    }

    @Deprecated
    public ViewTreeObserver.OnGlobalLayoutListener setKeyboardListener(View view, e30<Boolean> e30Var) {
        ViewTreeObserverOnGlobalLayoutListenerC4298q viewTreeObserverOnGlobalLayoutListenerC4298q = new ViewTreeObserverOnGlobalLayoutListenerC4298q(view, new WeakReference(e30Var));
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4298q);
        return viewTreeObserverOnGlobalLayoutListenerC4298q;
    }

    public void setNavigationBarColor(int i) {
        if (Build.VERSION.SDK_INT <= 34) {
            this.act.getWindow().setNavigationBarColor(i);
        } else if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m20635A(i);
        }
    }

    public void setPaddingToNavigationBar(int i) {
        if (Build.VERSION.SDK_INT <= 34 || !SWIPE_BACK_SUPPORTED) {
            return;
        }
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById.getTag(p4c0.f147114f) == null || !viewFindViewById.getTag(p4c0.f147114f).equals(Integer.valueOf(i))) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i);
            viewFindViewById.setTag(p4c0.f147114f, Integer.valueOf(i));
            this.swipeBack.m20638D(true);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            return;
        }
        super.setRequestedOrientation(i);
    }

    public void setStatusBarColor(int i) {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m20636B(i);
        }
    }

    public void setSwipeBackEnable(boolean z) {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.setEnableGesture(z);
        }
    }

    public void setTheme() {
    }

    public void setTitle(String str, boolean z) {
        if (!z) {
            super.setTitle(str);
            TextView textView = this.originalTitle;
            if (textView != null) {
                textView.setVisibility(0);
            }
            LinearLayout linearLayout = this.centralLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                TextView textView2 = this.centralTitle;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            LinearLayout linearLayout2 = this.specialLayout;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                return;
            }
            TextView textView3 = this.specialTitle;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView4 = this.centralTitle;
        if (textView4 != null && this.originalTitle != null) {
            textView4.setVisibility(0);
            this.centralTitle.setText(str);
            this.originalTitle.setVisibility(8);
            LinearLayout linearLayout3 = this.centralLayout;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            TextView textView5 = this.centralFilter;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            LinearLayout linearLayout4 = this.specialLayout;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
                return;
            }
            TextView textView6 = this.specialTitle;
            if (textView6 != null) {
                textView6.setVisibility(8);
                return;
            }
            return;
        }
        try {
            TextView textView7 = (TextView) TOOLBAR_TITLE_VIEW_FILED.get(toolbar());
            this.originalTitle = textView7;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            this.centralTitle = getCentralTitle(str);
            Toolbar.C0159e c0159e = new Toolbar.C0159e(-2, -2);
            c0159e.f110601a = 17;
            toolbar().addView(this.centralTitle, c0159e);
            TextView textView8 = this.centralFilter;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.specialLayout;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
                return;
            }
            TextView textView9 = this.specialTitle;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            setTitle(str);
        } catch (IllegalArgumentException e2) {
            CrashHelper.m81296c(e2);
            setTitle(str);
        }
    }

    public View setTopViewLayout(View view) {
        return setUpKeyboardDetectorLayout(view, new LinearLayout(this), (h30<Boolean, Integer, Boolean, Integer>) null);
    }

    public View setUpKeyboardDetectorLayout(View view, View view2, h30<Boolean, Integer, Boolean, Integer> h30Var) {
        this.isSetUpKeyboardDetectorLayout = true;
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        view.setPadding(0, ((getSupportActionBar() == null || getWindow().hasFeature(9)) ? 0 : t100.m186890d(56.0f)) + xdl0.m208331F0(), 0, 0);
        viewGroup.addView(view, 0);
        if (Build.VERSION.SDK_INT <= 34) {
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4297p(new C4301t(view, view2, h30Var, viewGroup)));
            return view2;
        }
        gbl0.m125231y0(viewGroup, new C4296o(view, h30Var));
        gbl0.m125195g0(viewGroup);
        return view2;
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    public boolean shouldBlockOnResume() {
        return false;
    }

    public boolean shouldBlockOnStart() {
        return false;
    }

    public void showDebugMenu(ArrayList<j760<String, d30>> arrayList) {
        ArrayList arrayListM200303Q = vwb.m200303Q(arrayList, new w9j() { // from class: l.r10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Act.m20373R0((j760) obj);
            }
        });
        m8c.m153482c(arrayListM200303Q);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, t100.m186890d(5.0f), 0, 0);
        AppCompatEditText appCompatEditText = new AppCompatEditText(this);
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setHint(R.string.search_go);
        appCompatEditText.setTextSize(16.0f);
        appCompatEditText.setGravity(19);
        int iM186890d = t100.m186890d(24.0f);
        appCompatEditText.setPadding(iM186890d, t100.m186890d(16.0f), iM186890d, t100.m186890d(16.0f));
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(3);
        C4292k c4292k = new C4292k(this, b6c0.f73770B);
        c4292k.addAll(arrayListM200303Q);
        appCompatEditText.addTextChangedListener(new C4293l(c4292k, arrayListM200303Q));
        appCompatEditText.setOnClickListener(new View.OnClickListener() { // from class: l.s10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220396r("e_debug_tool_search", "p_debug_tool_dialog_view");
            }
        });
        linearLayout.addView(appCompatEditText, new LinearLayout.LayoutParams(-1, -2));
        VList vList = new VList(this);
        vList.setDivider(null);
        vList.setAdapter((ListAdapter) c4292k);
        linearLayout.addView(vList, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Dialog dialogM20567z = dialog().m20520P(linearLayout, false).m20567z();
        dialogM20567z.getWindow().setSoftInputMode(16);
        dialogM20567z.show();
        vList.setOnItemClickListener(new C4294m(c4292k, arrayList, dialogM20567z));
        cwf0 cwf0Var = new cwf0("p_debug_tool_dialog_view", Dialog.class.getName());
        cwf0Var.m109033i();
        cwf0Var.m109036l();
        dialogM20567z.setOnDismissListener(new DialogInterfaceOnDismissListenerC4295n(cwf0Var));
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.requestFocus();
    }

    public boolean showInput(View view, int i) {
        return imm().showSoftInput(view, i);
    }

    public void startActivityForResult(int i, Intent intent, C4317a.a aVar) {
        if (!this.activityReslutManager.m20611a(aVar)) {
            this.activityReslutManager.m20613c(new C4283b(i, aVar));
        }
        startActivityForResult(intent, i);
    }

    public void startActivityForResultFromFragmentWithCustomTransition(Frag frag, Intent intent, int i, AbstractC4304w abstractC4304w) {
        if (abstractC4304w != null) {
            tempQueue.add(new C4303v(new WeakReference(this), abstractC4304w, intent.getComponent().getClassName()));
        }
        startActivityFromFragment(frag, intent, i);
    }

    public void startActivityForResultWithCustomTransition(Intent intent, int i, AbstractC4304w abstractC4304w) {
        if (abstractC4304w != null) {
            tempQueue.add(new C4303v(new WeakReference(this), abstractC4304w, intent.getComponent().getClassName()));
        }
        startActivityForResult(intent, i);
    }

    public void startActivityFromFragmentWithCustomTransition(Frag frag, Intent intent, AbstractC4304w abstractC4304w) {
        startActivityForResultFromFragmentWithCustomTransition(frag, intent, -1, abstractC4304w);
    }

    public void startActivityWithCustomTransition(Intent intent, AbstractC4304w abstractC4304w) {
        startActivityForResultWithCustomTransition(intent, -1, abstractC4304w);
    }

    public int statusBarColor() {
        return SWIPE_BACK_SUPPORTED ? this.swipeBack.m20637C() : RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    public String string(int i) {
        return getString(i);
    }

    @Deprecated
    public void takePicture() {
        mediaCapture(true);
    }

    public Toolbar toolbar() {
        return (Toolbar) findViewById(p4c0.f147104a);
    }

    public void unregisterOnActivityResultListener(C4317a.a aVar) {
        this.activityReslutManager.m20614d(aVar);
    }

    public <T> C22306c<T> duringCreated(final C22306c<T> c22306c, boolean z) {
        return duringCreated(new v9j() { // from class: l.g20
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Act.m20365I0(c22306c);
            }
        }, z);
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        creates(e30Var, ACTION0_NOTHING);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return duringCreated((v9j) v9jVar, true);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(final C22306c<T> c22306c) {
        return duringCreated((v9j) new v9j() { // from class: l.q20
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Act.m20375T0(c22306c);
            }
        }, true);
    }

    public void startActivityForResult(Intent intent, C4317a.a aVar) {
        startActivityForResult(1001, intent, aVar);
    }

    public void startActivityForResultWithCustomTransition(Intent intent, int i, AbstractC4304w abstractC4304w, C4317a.a aVar) {
        if (abstractC4304w != null) {
            tempQueue.add(new C4303v(new WeakReference(this), abstractC4304w, intent.getComponent().getClassName()));
        }
        startActivityForResult(i, intent, aVar);
    }

    private void debugColorAllViews() {
        debugColorAllViews(findViewById(R.id.content), 0);
    }

    public View setUpKeyboardDetectorLayout(View view, View view2, final f30<Boolean, Integer> f30Var) {
        return setUpKeyboardDetectorLayout(view, view2, new h30() { // from class: l.d20
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                f30Var.call((Boolean) obj, (Integer) obj2);
            }
        });
    }

    public void hideInput() {
        hideInput(2);
    }

    public boolean hideInput(View view) {
        getWindow().setSoftInputMode(2);
        return imm().hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public Dialog progress(int i, boolean z) {
        return progress(getString(i), z);
    }

    public Dialog progress(String str) {
        return progress(str, false);
    }

    public Dialog progress(String str, boolean z) {
        return progress(str, null, z, true);
    }

    public Dialog progress(String str, String str2, boolean z, final boolean z2) {
        if (this.progressDialog == null && !isFinishing()) {
            final Dialog dialogProgress = progress(this, str, str2);
            dialogProgress.show();
            this.progressDialog = dialogProgress;
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final WindowManager.LayoutParams attributes = dialogProgress.getWindow().getAttributes();
                attributes.alpha = 0.0f;
                final float f = attributes.dimAmount;
                if (z2) {
                    attributes.dimAmount = 0.0f;
                }
                dialogProgress.getWindow().setAttributes(attributes);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l20
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f125695a.lambda$progress$28(dialogProgress, z2, f, attributes, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.setStartDelay(400L);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
                valueAnimatorOfFloat.start();
            }
            return dialogProgress;
        }
        return this.progressDialog;
    }

    public Dialog progress(int i) {
        return progress(i, false);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        TextView textView = this.originalTitle;
        if (textView != null) {
            textView.setVisibility(0);
        }
        LinearLayout linearLayout = this.centralLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        } else {
            TextView textView2 = this.centralTitle;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        LinearLayout linearLayout2 = this.specialLayout;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        } else {
            TextView textView3 = this.specialTitle;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        if (this.hackCenterTitle) {
            try {
                TextView textView4 = (TextView) TOOLBAR_TITLE_VIEW_FILED.get(toolbar());
                this.originalTitle = textView4;
                xdl0.m208370d0(this.originalTitle, Math.max(0, (((int) ((xdl0.m208412y0() - t100.m186890d(114.0f)) - textView4.getPaint().measureText(charSequence.toString()))) / 2) - t100.m186890d(12.0f)));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
            } catch (IllegalArgumentException e2) {
                CrashHelper.m81296c(e2);
            }
            toolbar().setTitle(charSequence);
        }
    }

    @Deprecated
    public void mediaCapture(boolean z) {
        mediaCapture(z, false);
    }

    public static C22306c<Boolean> mediaCapture() {
        return mediaCaptureBs.onBackpressureLatest().asObservable();
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        setTitle(string(i));
    }

    public void showDebugMenu() {
        showDebugMenu(debugItems());
    }
}
