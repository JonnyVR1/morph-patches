package com.p003p1.mobile.android.app;

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
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import com.momo.xeengine.gift.GiftLogEvent;
import com.p003p1.mobile.android.R$string;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import com.p003p1.mobile.android.app.swipback.SwipeBackLayout;
import com.p003p1.mobile.android.p005ui.cropiwa.CropperAct;
import com.p003p1.mobile.android.p005ui.poplevel.PopLifecycleEvent;
import com.p003p1.mobile.android.statistic.AutoSpeedCustomView;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.tantanapp.common.utils.CrashHelper;
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
import l.bd50;
import l.cwf0;
import l.d30;
import l.du2;
import l.e30;
import l.eqh0;
import l.f30;
import l.fpd0;
import l.gbl0;
import l.h30;
import l.h4g0;
import l.i30;
import l.j760;
import l.m8c;
import l.mep0;
import l.n11;
import l.nu0;
import l.roj0;
import l.t100;
import l.tpd0;
import l.u620;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y6q0;
import l.z3g0;
import l.zbc0;
import l.zvf0;
import org.joor.Reflect;
import p007l.b6c0;
import p007l.bt0;
import p007l.c0e;
import p007l.c16;
import p007l.d0e;
import p007l.dd80;
import p007l.e51;
import p007l.hi3;
import p007l.hn5;
import p007l.k0m;
import p007l.k9j;
import p007l.lqf;
import p007l.lsi0;
import p007l.mbh0;
import p007l.mcr;
import p007l.mkd0;
import p007l.nx0;
import p007l.ozb0;
import p007l.p4c0;
import p007l.pc80;
import p007l.u660;
import p007l.y20;
import p007l.yd5;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
    private static ArrayList<C0214u> sensors;
    private static long startTime;
    private static long stopTime;
    int actionBarColor;
    private ActionMenuView actionMenuView;
    private C0229a activityReslutManager;
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
    y20.AbstractC0786a partTransition;
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
    C0215v trans;
    public static e30<Throwable> EMPTY_ON_ERROR = new e30() { // from class: l.k10
        public final void call(Object obj) {
            mkd0.m9880M((Throwable) obj);
        }
    };
    public static d30 ACTION0_NOTHING = new d30() { // from class: l.v10
        public final void call() {
            Act.m661o1();
        }
    };
    private static b<Boolean> frontBs = b.b();
    private static b<Boolean> mediaCaptureBs = b.b();
    private static int activityCount = 0;
    private static boolean foregroundStatusUpdated = false;
    private static C0211r foreground = null;
    private static HashMap<Integer, ArrayList<C0211r>> acts = new HashMap<>();
    private static a<roj0> globalLifecycleSubject = a.b();
    private static int sessionCount = 0;
    private static Handler backgroundCheckHandler = new HandlerC0202i(Looper.getMainLooper());
    public static Field TOOLBAR_NAV_BUTTON_VIEW_FIELD = Reflect.on(Toolbar.class).field0("mNavButtonView");
    public static Field TOOLBAR_TITLE_VIEW_FILED = Reflect.on(Toolbar.class).field0("mTitleTextView");
    public static Field TOOLBAR_MENU_VIEW_FILED = Reflect.on(Toolbar.class).field0("mMenuView");
    public static tpd0 savedKeyboardHeight = new tpd0("keyboard_height", t100.d(220.0f));
    public static String tempFileName = null;
    static LinkedList<C0215v> tempQueue = new LinkedList<>();
    private static boolean lmdResult = false;
    private final a<C0231c> lifecycleSubject = a.b();
    private final a<pc80> popLifeSub = a.b();
    public Act act = this;

    public enum PickMediaError {
        NOT_RESOLVABLE,
        FILE_NOT_FOUND
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0194a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public int f1002a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f1003b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z3g0 f1004c;

        public ViewTreeObserverOnGlobalLayoutListenerC0194a(View view, z3g0 z3g0Var) {
            this.f1003b = view;
            this.f1004c = z3g0Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f1002a == -1) {
                this.f1002a = this.f1003b.getMeasuredHeight();
            }
            int measuredHeight = this.f1002a - this.f1003b.getMeasuredHeight();
            if (measuredHeight > t100.d(100.0f)) {
                this.f1004c.onNext(Boolean.TRUE);
            } else if (measuredHeight < (-t100.d(100.0f))) {
                this.f1004c.onNext(Boolean.FALSE);
            }
            this.f1002a = this.f1003b.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$b */
    public class C0195b implements C0229a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1005a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0229a.a f1006b;

        public C0195b(int i, C0229a.a aVar) {
            this.f1005a = i;
            this.f1006b = aVar;
        }

        @Override // com.p003p1.mobile.android.app.C0229a.a
        /* JADX INFO: renamed from: a */
        public boolean mo672a(int i, int i2, Intent intent) {
            if (this.f1005a != i) {
                return false;
            }
            boolean zMo672a = this.f1006b.mo672a(i, i2, intent);
            Act.this.activityReslutManager.m885d(this);
            return zMo672a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$c */
    public class C0196c implements Animator.AnimatorListener {
        public C0196c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act act = Act.this;
            y20.AbstractC0786a abstractC0786a = act.partTransition;
            act.partTransition = null;
            act.actualFinish();
            if (abstractC0786a != null) {
                abstractC0786a.m11867m(Act.this.act);
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
    public class C0197d implements Animator.AnimatorListener {
        public C0197d() {
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
    public class C0198e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f1011b;

        public C0198e(View view, Drawable drawable) {
            this.f1010a = view;
            this.f1011b = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Act.this.currentTransAnim = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act.this.currentTransAnim = null;
            View view = this.f1010a;
            if (view != null) {
                view.setBackgroundDrawable(this.f1011b);
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
    public class C0199f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f1013a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f1014b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Drawable f1015c;

        public C0199f(Act act, View view, Drawable drawable) {
            this.f1013a = act;
            this.f1014b = view;
            this.f1015c = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Act.this.currentTransAnim = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act act = Act.this;
            act.currentTransAnim = null;
            C0215v c0215v = act.trans;
            if (c0215v != null && !c0215v.f1063b.mo682e()) {
                View decorView = this.f1013a.getWindow().getDecorView();
                if (decorView instanceof ViewGroup) {
                    decorView = ((ViewGroup) decorView).getChildAt(0);
                }
                if (decorView != null) {
                    decorView.setVisibility(4);
                }
            }
            View view = this.f1014b;
            if (view != null) {
                view.setBackgroundDrawable(this.f1015c);
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
    public class C0200g extends l.a<j760<String, CharSequence>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f1017c;

        public C0200g(ArrayList arrayList) {
            this.f1017c = arrayList;
        }

        /* JADX INFO: renamed from: m */
        public View m674m(ViewGroup viewGroup, int i) {
            return Act.this.inflater().inflate(b6c0.f1916b, viewGroup, false);
        }

        /* JADX INFO: renamed from: p */
        public List<j760<String, CharSequence>> m675p() {
            return this.f1017c;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void m673j(View view, j760<String, CharSequence> j760Var, int i, int i2) {
            TextView textView = (TextView) view.findViewById(p4c0.f3638R0);
            TextView textView2 = (TextView) view.findViewById(p4c0.f3700y);
            textView.setText((CharSequence) j760Var.a);
            textView2.setText((CharSequence) j760Var.b);
            textView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$h */
    public class C0201h implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0214u f1019a;

        public C0201h(C0214u c0214u) {
            this.f1019a = c0214u;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                C0214u c0214u = this.f1019a;
                int i = c0214u.f1061d;
                if (i >= 10) {
                    if (Act.lmdResultMoved()) {
                        Act.lmdEnd();
                        return;
                    } else {
                        this.f1019a.f1061d = 0;
                        return;
                    }
                }
                float[] fArr = c0214u.f1060c[i];
                float[] fArr2 = sensorEvent.values;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                c0214u.f1061d = i + 1;
            } catch (Exception e) {
                CrashHelper.c(new Exception("Act lmdCreate exception:" + e.getMessage(), e));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$i */
    public class HandlerC0202i extends Handler {
        public HandlerC0202i(Looper looper) {
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
    public class ViewOnAttachStateChangeListenerC0203j implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0203j() {
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
    public class C0204k extends ArrayAdapter<String> {
        public C0204k(Context context, int i) {
            super(context, i);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            textView.setTextColor(-16777216);
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$l */
    public class C0205l implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f1022a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f1023b;

        public C0205l(ArrayAdapter arrayAdapter, List list) {
            this.f1022a = arrayAdapter;
            this.f1023b = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ArrayAdapter arrayAdapter = this.f1022a;
            if (zIsEmpty) {
                arrayAdapter.clear();
                this.f1022a.addAll(this.f1023b);
            } else {
                arrayAdapter.clear();
                this.f1022a.addAll(vwb.n(this.f1023b, new w9j() { // from class: l.s20
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
    public class C0206m implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f1025a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f1026b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Dialog f1027c;

        public C0206m(ArrayAdapter arrayAdapter, ArrayList arrayList, Dialog dialog) {
            this.f1025a = arrayAdapter;
            this.f1026b = arrayList;
            this.f1027c = dialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, final int i, long j) {
            zvf0.u("e_debug_tool", "p_debug_tool_dialog_view", new j760[]{vwb.Y("debug_tool_name", (String) this.f1025a.getItem(i))});
            ArrayList arrayList = this.f1026b;
            final ArrayAdapter arrayAdapter = this.f1025a;
            ((d30) ((j760) vwb.r(arrayList, new w9j() { // from class: l.t20
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) ((j760) obj).a).equals(arrayAdapter.getItem(i)));
                }
            })).b).call();
            this.f1027c.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$n */
    public class DialogInterfaceOnDismissListenerC0207n implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f1029a;

        public DialogInterfaceOnDismissListenerC0207n(cwf0 cwf0Var) {
            this.f1029a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f1029a.k();
            this.f1029a.j();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$o */
    public class C0208o implements bd50 {

        /* JADX INFO: renamed from: a */
        public int f1031a;

        /* JADX INFO: renamed from: b */
        public int f1032b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f1033c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ h30 f1034d;

        public C0208o(View view, h30 h30Var) {
            this.f1033c = view;
            this.f1034d = h30Var;
        }

        @NonNull
        public y6q0 onApplyWindowInsets(@NonNull View view, @NonNull y6q0 y6q0Var) {
            int i;
            boolean zP = y6q0Var.p(y6q0.l.b());
            int i2 = y6q0Var.f(y6q0.l.b()).d;
            if (i2 != 0) {
                this.f1032b = i2;
            }
            int i3 = y6q0Var.f(y6q0.l.d()).d;
            int i4 = this.f1031a;
            int iAbs = 0;
            boolean z = i4 != i3;
            if (z) {
                iAbs = Math.abs(i3 - i4);
                this.f1031a = i3;
                xdl0.U(this.f1033c, i3);
            }
            if (zP && (i = this.f1032b) != 0) {
                Act.savedKeyboardHeight.put(Integer.valueOf(i - i3));
            }
            h30 h30Var = this.f1034d;
            if (h30Var != null) {
                h30Var.b(Boolean.valueOf(zP), Integer.valueOf(this.f1032b - i3), Boolean.valueOf(z), Integer.valueOf(iAbs));
            }
            return y6q0Var;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$p */
    public class ViewOnLayoutChangeListenerC0209p implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0213t f1036a;

        public ViewOnLayoutChangeListenerC0209p(C0213t c0213t) {
            this.f1036a = c0213t;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f1036a.m691c(view, i2, i4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$q */
    public class ViewTreeObserverOnGlobalLayoutListenerC0210q implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public int f1038a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f1039b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f1040c;

        public ViewTreeObserverOnGlobalLayoutListenerC0210q(View view, WeakReference weakReference) {
            this.f1039b = view;
            this.f1040c = weakReference;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f1038a == -1) {
                this.f1038a = this.f1039b.getMeasuredHeight();
            }
            int iMin = Math.min(this.f1038a, Act.this.screenHeight);
            this.f1038a = iMin;
            int measuredHeight = iMin - this.f1039b.getMeasuredHeight();
            if (measuredHeight > t100.d(100.0f)) {
                if (this.f1040c.get() != null) {
                    ((e30) this.f1040c.get()).call(Boolean.TRUE);
                }
            } else if (measuredHeight < (-t100.d(100.0f)) && this.f1040c.get() != null) {
                ((e30) this.f1040c.get()).call(Boolean.FALSE);
            }
            this.f1038a = this.f1039b.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$r */
    public static class C0211r {

        /* JADX INFO: renamed from: a */
        @NonNull
        public WeakReference<Activity> f1042a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public C0231c f1043b;

        /* JADX INFO: renamed from: c */
        public long f1044c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f1045d;
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$s */
    public static class C0212s<FROM extends Act, TO extends Act> extends AbstractC0216w<FROM, TO> {
        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: b */
        public boolean mo679b() {
            return true;
        }

        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: e */
        public boolean mo682e() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: f */
        public void mo683f(Act act) {
            act.overridePendingTransition(ozb0.f3585c, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: g */
        public void mo684g(Act act) {
            act.overridePendingTransition(0, ozb0.f3586d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator mo680c(FROM from, TO to) {
            mep0.Y0(from, to);
            return to.enterAnimation();
        }

        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Animator mo681d(FROM from, TO to) {
            return to.exitAnimation();
        }

        @Override // com.p003p1.mobile.android.app.Act.AbstractC0216w
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo685h(FROM from, TO to) {
            to.initAnimationState();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$t */
    public class C0213t {

        /* JADX INFO: renamed from: a */
        public View f1046a;

        /* JADX INFO: renamed from: b */
        public View f1047b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f1048c;

        /* JADX INFO: renamed from: d */
        public h30<Boolean, Integer, Boolean, Integer> f1049d;

        /* JADX INFO: renamed from: e */
        public int f1050e;

        /* JADX INFO: renamed from: f */
        public boolean f1051f;

        /* JADX INFO: renamed from: g */
        public int f1052g;

        /* JADX INFO: renamed from: h */
        public boolean f1053h = false;

        /* JADX INFO: renamed from: i */
        public int f1054i = 0;

        /* JADX INFO: renamed from: j */
        public boolean f1055j;

        /* JADX INFO: renamed from: k */
        public int f1056k;

        /* JADX WARN: Multi-variable type inference failed */
        public C0213t(View view, View view2, h30<Boolean, Integer, Boolean, Integer> h30Var, ViewGroup viewGroup) {
            int iD = 0;
            this.f1055j = Act.this.getWindow().hasFeature(9);
            if (Act.this.getSupportActionBar() != null && !this.f1055j) {
                iD = t100.d(56.0f);
            }
            this.f1056k = iD;
            this.f1046a = view;
            this.f1047b = view2;
            this.f1049d = h30Var;
            this.f1048c = viewGroup;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m690b(int i) {
            View view = this.f1046a;
            if (view != null) {
                view.getLayoutParams().height = this.f1050e + i;
                this.f1046a.setPadding(0, i, 0, 0);
                this.f1046a.requestLayout();
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0052  */
        /* JADX INFO: renamed from: c */
        public void m691c(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int i5;
            this.f1050e = Math.min(this.f1050e, Act.this.screenHeight);
            Rect rect = new Rect();
            this.f1047b.getWindowVisibleDisplayFrame(rect);
            int i6 = rect.bottom - rect.top;
            int i7 = this.f1050e - (i6 - this.f1056k);
            if (SwipeBackLayout.f1260D) {
                View childAt = this.f1048c.getChildAt(0);
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (i4 = ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) == (i5 = this.f1054i)) {
                    z = false;
                    i3 = 0;
                } else {
                    i3 = i4 - i5;
                    i7 -= i4 - i5;
                    this.f1054i = i4;
                    this.f1050e = (i6 - this.f1056k) + i7;
                    z = true;
                }
            } else {
                z = false;
                i3 = 0;
            }
            boolean z2 = i7 > t100.d(100.0f);
            if (!z2) {
                this.f1050e = i6 - this.f1056k;
                if ("MI 9".equals(Build.MODEL) && Build.VERSION.SDK_INT <= 34) {
                    this.f1050e = i2 - i;
                }
                final int top = 0;
                Object parent = view;
                while ((parent instanceof View) && parent != Act.this.getWindow().getDecorView()) {
                    View view2 = (View) parent;
                    top += view2.getTop();
                    parent = view2.getParent();
                }
                if (this.f1046a.getMeasuredHeight() - top != this.f1050e || top != this.f1046a.getPaddingTop()) {
                    if (this.f1053h) {
                        e51.m9024G(new Runnable() { // from class: l.u20
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f4466a.m690b(top);
                            }
                        });
                    } else {
                        this.f1053h = true;
                        this.f1046a.getLayoutParams().height = this.f1050e + top;
                        this.f1046a.setPadding(0, top, 0, 0);
                        this.f1046a.requestLayout();
                    }
                }
            }
            if (z2 == this.f1051f && i7 == this.f1052g && !z) {
                return;
            }
            this.f1051f = z2;
            if (z2) {
                this.f1052g = i7;
                Act.savedKeyboardHeight.put(Integer.valueOf(i7));
            }
            h30<Boolean, Integer, Boolean, Integer> h30Var = this.f1049d;
            if (h30Var != null) {
                h30Var.b(Boolean.valueOf(this.f1051f && Act.this.lifecycle_() == C0231c.f1247i), Integer.valueOf(this.f1052g), Boolean.valueOf(z), Integer.valueOf(i3));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$u */
    public static class C0214u {

        /* JADX INFO: renamed from: a */
        public Sensor f1058a;

        /* JADX INFO: renamed from: b */
        public SensorEventListener f1059b;

        /* JADX INFO: renamed from: c */
        public float[][] f1060c;

        /* JADX INFO: renamed from: d */
        public int f1061d;

        public C0214u() {
            this.f1060c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
            this.f1061d = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$v */
    public static class C0215v {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<Act> f1062a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final AbstractC0216w f1063b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final String f1064c;

        public C0215v(@NonNull WeakReference<Act> weakReference, @NonNull AbstractC0216w abstractC0216w, @NonNull String str) {
            this.f1062a = weakReference;
            this.f1063b = abstractC0216w;
            this.f1064c = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$w */
    public static abstract class AbstractC0216w<FROM, TO> {
        /* JADX INFO: renamed from: a */
        public View m693a(TO to) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo679b() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract Animator mo680c(FROM from, TO to);

        /* JADX INFO: renamed from: d */
        public abstract Animator mo681d(FROM from, TO to);

        /* JADX INFO: renamed from: e */
        public boolean mo682e() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public void mo683f(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public void mo684g(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: h */
        public void mo685h(FROM from, TO to) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act() {
        u660.m11183e().m11185b(this);
        this.hackCenterTitle = false;
        this.centralTitle = null;
        this.originalTitle = null;
        this.specialTitle = null;
        this.centralLayout = null;
        this.specialLayout = null;
        this.centralFilter = null;
        this.specialFilter = null;
        this.activityReslutManager = new C0229a();
        this.actionBarColor = 0;
        this.trans = null;
        this.currentTransAnim = null;
        this.finishingByAnimation = false;
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ c m636I0(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ y6q0 m637J0(boolean[] zArr, int[] iArr, boolean z, ViewGroup.LayoutParams layoutParams, FrameLayout frameLayout, View view, View view2, y6q0 y6q0Var) {
        boolean zP = y6q0Var.p(y6q0.l.b());
        int i = y6q0Var.f(y6q0.l.b()).d;
        int i2 = y6q0Var.f(y6q0.l.d()).d;
        if (zP == zArr[0] && iArr[0] == i) {
            return y6q0Var;
        }
        iArr[0] = i;
        zArr[0] = zP;
        int i3 = z ? 0 : y6q0Var.f(y6q0.l.e()).b;
        if (zP) {
            layoutParams.height = (frameLayout.getMeasuredHeight() - iArr[0]) - i3;
        } else {
            layoutParams.height = (frameLayout.getMeasuredHeight() - i3) - i2;
        }
        view.setLayoutParams(layoutParams);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ Boolean m638K0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m642P0(e30 e30Var, d30 d30Var, C0231c c0231c) {
        if (c0231c instanceof C0231c.a) {
            e30Var.call(((C0231c.a) c0231c).f1258p);
        } else if (c0231c == C0231c.f1251m) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m643Q0(final View view, z3g0 z3g0Var) {
        final ViewTreeObserverOnGlobalLayoutListenerC0194a viewTreeObserverOnGlobalLayoutListenerC0194a = new ViewTreeObserverOnGlobalLayoutListenerC0194a(view, z3g0Var);
        z3g0Var.b(h4g0.a(new d30() { // from class: l.e20
            public final void call() {
                Act.m658l1(view, viewTreeObserverOnGlobalLayoutListenerC0194a);
            }
        }));
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0194a);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ String m644R0(j760 j760Var) {
        return (String) j760Var.a;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ c m646T0(c cVar) {
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void actualFinish() {
        SwipeBackLayout swipeBackLayout;
        Iterator<ArrayList<C0211r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C0211r c0211r : it.next()) {
                if (c0211r.f1042a.get() == this) {
                    z = true;
                    c0211r.f1045d = true;
                }
            }
        }
        if (!super/*android.app.Activity*/.isFinishing()) {
            super/*android.app.Activity*/.finish();
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        if (!SWIPE_BACK_SUPPORTED || (swipeBackLayout = this.swipeBack) == null) {
            return;
        }
        swipeBackLayout.m920x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean canResolveTargetPackage(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void changeGlobalLifecycleStates() {
        foregroundStatusUpdated = false;
        C0211r c0211r = foreground;
        tryUpdateForegroundStatus();
        if (c0211r == null && foreground == null) {
            return;
        }
        if (c0211r == null || foreground == null || c0211r.f1042a.get() != foreground.f1042a.get()) {
            globalLifecycleSubject.onNext(roj0.a);
        }
    }

    private void debugColorAllViews(View view, int i) {
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.argb(20, zbc0.a.nextInt(255), zbc0.a.nextInt(255), zbc0.a.nextInt(255)));
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
                u620.e(activity);
            } catch (Exception e) {
                CrashHelper.c(new Exception("defaultOnHomePressed:" + e.getMessage(), e));
            }
        } catch (Exception unused) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ Activity m654f1(C0211r c0211r) {
        if (c0211r == null) {
            return null;
        }
        return c0211r.f1042a.get();
    }

    private boolean fixOrientation() {
        try {
            ((ActivityInfo) Reflect.on("android.app.Activity").field0("mActivityInfo").get(this)).screenOrientation = -1;
            return true;
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            CrashHelper.c(new RuntimeException("try fix SavedInstanceState", th));
        }
    }

    public static c<C0211r> foreground() {
        return globalLifecycleSubject.map(new w9j() { // from class: l.f20
            public final Object call(Object obj) {
                return Act.foreground;
            }
        }).distinctUntilChanged(new w9j() { // from class: l.h20
            public final Object call(Object obj) {
                return Act.m654f1((Act.C0211r) obj);
            }
        });
    }

    public static C0211r foreground_() {
        return foreground;
    }

    public static c<Boolean> front() {
        return frontBs.onBackpressureLatest().asObservable();
    }

    public static HashMap<Integer, ArrayList<C0211r>> globalLifeCycle_() {
        return acts;
    }

    public static c<HashMap<Integer, ArrayList<C0211r>>> globalLifecycle() {
        return globalLifecycleSubject.map(new w9j() { // from class: l.m20
            public final Object call(Object obj) {
                return Act.acts;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void hideInput(int i) {
        try {
            getWindow().setSoftInputMode(i);
            if (getWindow().getCurrentFocus() != null) {
                imm().hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            } else {
                imm().hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception(getClass().getSimpleName() + " hideInput " + e.getMessage(), e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InputMethodManager imm() {
        return (InputMethodManager) getSystemService("input_method");
    }

    public static boolean isAppVisible() {
        return startTime > stopTime;
    }

    private boolean isSpecificRecordVideo() {
        String str = Build.BRAND;
        if ("Xiaomi".equals(str) && "MI 8 SE".equals(Build.MODEL)) {
            return true;
        }
        if ("vivo".equals(str) && "vivo NEX S".equals(Build.MODEL)) {
            return true;
        }
        if ("vivo".equals(str) && "V1809A".equals(Build.MODEL)) {
            return true;
        }
        return "Xiaomi".equals(str) && "MI 8".equals(Build.MODEL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isTranslucentOrFloating() {
        boolean zBooleanValue = false;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Reflect.on("com.android.internal.R$styleable").field0("Window").get(null));
            zBooleanValue = ((Boolean) Reflect.on("android.content.pm.ActivityInfo").call("isTranslucentOrFloating", new Object[]{typedArrayObtainStyledAttributes}).get()).booleanValue();
            typedArrayObtainStyledAttributes.recycle();
            return zBooleanValue;
        } catch (Exception e) {
            CrashHelper.c(e);
            return zBooleanValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isUnspecifiedState() {
        try {
            return (getPackageManager().getActivityInfo(getComponentName(), 128).softInputMode & 240) == 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static c<Boolean> keyboardListenerObservable(final View view) {
        return c.create(new c.a() { // from class: l.r20
            public final void call(Object obj) {
                Act.m643Q0(view, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m658l1(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateStatusAndActionBar$27(int i, int i2, int i3, int i4, i30 i30Var, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        setStatusBarColor(yd5.m11926a(i, i2, animatedFraction));
        ColorDrawable colorDrawable = new ColorDrawable(yd5.m11926a(i3, i4, animatedFraction));
        if (i30Var != null) {
            i30Var.u(colorDrawable);
        }
        this.actionBarColor = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        ArrayList arrayList = new ArrayList(fpd0.debugNames);
        Collections.sort(arrayList);
        dialog().m806e0(arrayList).m808g0(new Dialog.InterfaceC0223g() { // from class: l.t10
            @Override // com.p003p1.mobile.android.app.Dialog.InterfaceC0223g
            /* JADX INFO: renamed from: a */
            public final void mo840a(com.p003p1.mobile.android.app.Dialog dialog, View view, int i, CharSequence charSequence) {
                new tpd0(charSequence.toString(), 0).clear();
            }
        }).m839z0();
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
    public /* synthetic */ void lambda$initDataOnCreate$14(C0231c c0231c) {
        if (c0231c == C0231c.f1247i) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.ACTIVE, true, getPopLifeName()));
            return;
        }
        if (c0231c == C0231c.f1253o || c0231c == C0231c.f1251m) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.DESTROY, true, getPopLifeName()));
            return;
        }
        C0231c c0231c2 = C0231c.f1249k;
        a<pc80> aVar = this.popLifeSub;
        if (c0231c == c0231c2) {
            aVar.onNext(pc80.m10251a(PopLifecycleEvent.STOP, true, getPopLifeName()));
        } else if (aVar.e() == null) {
            this.popLifeSub.onNext(pc80.m10251a(PopLifecycleEvent.PENDING, true, getPopLifeName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$initPartTransitionPostCreate$32(AtomicBoolean atomicBoolean) {
        y20.AbstractC0786a abstractC0786a;
        if (!atomicBoolean.getAndSet(true)) {
            if (isFinishing() || (abstractC0786a = this.partTransition) == null) {
                return Boolean.FALSE;
            }
            View viewM11857c = abstractC0786a.m11857c(this.act);
            Drawable background = viewM11857c == null ? null : viewM11857c.getBackground();
            if (viewM11857c != null) {
                viewM11857c.setBackgroundDrawable(null);
            }
            Animator animatorM11860f = this.partTransition.m11860f(this.act);
            if (animatorM11860f != null) {
                animatorM11860f.addListener(new C0198e(viewM11857c, background));
                animatorM11860f.start();
                this.currentTransAnim = animatorM11860f;
            } else if (viewM11857c != null) {
                viewM11857c.setBackgroundDrawable(background);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$initTransitionPostCreate$33(AtomicBoolean atomicBoolean, Act act) {
        C0215v c0215v;
        if (!atomicBoolean.getAndSet(true)) {
            if (isFinishing() || (c0215v = this.trans) == null) {
                return Boolean.FALSE;
            }
            View viewM693a = c0215v.f1063b.m693a(this.act);
            Drawable background = viewM693a == null ? null : viewM693a.getBackground();
            if (viewM693a != null) {
                viewM693a.setBackgroundDrawable(null);
            }
            Animator animatorMo680c = this.trans.f1063b.mo680c(act, this.act);
            if (animatorMo680c != null) {
                animatorMo680c.addListener(new C0199f(act, viewM693a, background));
                animatorMo680c.start();
                this.currentTransAnim = animatorMo680c;
            } else if (viewM693a != null) {
                viewM693a.setBackgroundDrawable(background);
            }
        }
        return Boolean.TRUE;
    }

    private /* synthetic */ void lambda$new$4(C0231c c0231c) {
    }

    private static /* synthetic */ void lambda$new$5(C0211r c0211r) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$15(View view) {
        showDebugMenu();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$16(C0231c c0231c) {
        SwipeBackLayout swipeBackLayout;
        if (c0231c == C0231c.f1247i && SWIPE_BACK_SUPPORTED && (swipeBackLayout = this.swipeBack) != null) {
            swipeBackLayout.m916s();
        }
        Bundle bundle = c0231c instanceof C0231c.a ? ((C0231c.a) c0231c).f1258p : null;
        du2.b("[common][lifecycle]", getClass(), c0231c.f1256c, bundle != null ? bundle.toString() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$pendChangeActionButtonTypeface$13() {
        Toolbar toolbar = toolbar();
        if (toolbar == null) {
            return Boolean.TRUE;
        }
        Iterator it = vwb.n(xdl0.s(toolbar), new w9j() { // from class: l.u10
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.c(3));
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

    private static C0214u lmdCreate(String str, Sensor sensor) {
        if (sensor == null) {
            return null;
        }
        C0214u c0214u = new C0214u();
        c0214u.f1058a = sensor;
        C0201h c0201h = new C0201h(c0214u);
        c0214u.f1059b = c0201h;
        sensorManager.registerListener(c0201h, c0214u.f1058a, 3);
        return c0214u;
    }

    public static boolean lmdEnd() {
        try {
            SensorManager sensorManager2 = sensorManager;
            if (sensorManager2 != null) {
                sensorManager = null;
                for (C0214u c0214u : sensors) {
                    if (c0214u != null) {
                        sensorManager2.unregisterListener(c0214u.f1059b, c0214u.f1058a);
                    }
                }
                lmdResult = lmdResultMoved();
                sensors.clear();
                sensors = null;
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("Act lmdEnd:" + e.getMessage(), e));
        }
        return lmdResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lmdResultMoved() {
        ArrayList<C0214u> arrayList = sensors;
        if (arrayList != null) {
            for (C0214u c0214u : arrayList) {
                if (c0214u != null && c0214u.f1061d >= 10) {
                    float f = c0214u.f1060c[5][0];
                    int i = 0;
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (c0214u.f1060c[i2][0] != f) {
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
    public static /* synthetic */ void m661o1() {
    }

    public static Dialog progress(Activity activity, String str, String str2) {
        View viewInflate;
        Window window;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            viewInflate = LayoutInflater.from(activity).inflate(b6c0.f1914F, (ViewGroup) null);
        } else {
            viewInflate = LayoutInflater.from(activity).inflate(b6c0.f1913E, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(p4c0.f3671j0);
            TextView textView2 = (TextView) viewInflate.findViewById(p4c0.f3609D);
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
        androidx.appcompat.app.a aVarCreate = new androidx.appcompat.app.a.a(activity).setView(viewInflate).setCancelable(false).create();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && (window = aVarCreate.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = aVarCreate.getWindow().getAttributes();
            attributes.gravity = 17;
            attributes.width = t100.d(78.0f);
            attributes.height = t100.d(78.0f);
            aVarCreate.getWindow().setAttributes(attributes);
        }
        aVarCreate.setCanceledOnTouchOutside(false);
        return aVarCreate;
    }

    private void reportPickMediaError(PickMediaError pickMediaError) {
        if (pickMediaError == PickMediaError.NOT_RESOLVABLE) {
            lsi0.m9835i(R$string.f823h7, false);
        } else if (pickMediaError == PickMediaError.FILE_NOT_FOUND) {
            lsi0.m9835i(R$string.f823h7, false);
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
        C0211r c0211r = null;
        for (ArrayList<C0211r> arrayList : acts.values()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0211r c0211r2 = arrayList.get(size);
                C0231c c0231c = c0211r2.f1043b;
                if (c0231c == C0231c.f1246h || c0231c == C0231c.f1247i) {
                    foregroundStatusUpdated = true;
                    foreground = c0211r2;
                    return;
                }
                if ((c0231c == C0231c.f1249k || c0231c == C0231c.f1248j) && c0211r2.f1044c > SystemClock.uptimeMillis() - 1000 && (c0211r == null || c0211r.f1044c <= c0211r2.f1044c)) {
                    c0211r = c0211r2;
                }
            }
        }
        foregroundStatusUpdated = true;
        foreground = c0211r;
    }

    public Act act() {
        return this;
    }

    public String actionItemPadding(String str) {
        return str.trim();
    }

    public l.a<j760<String, CharSequence>> adapterChangeLog(ArrayList<j760<String, CharSequence>> arrayList) {
        return new C0200g(arrayList);
    }

    public void addSwipeBackListener(mbh0 mbh0Var) {
        SwipeBackLayout swipeBackLayout;
        if (!SWIPE_BACK_SUPPORTED || (swipeBackLayout = this.swipeBack) == null) {
            return;
        }
        swipeBackLayout.m914q(mbh0Var);
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
                this.f3589a.lambda$animateStatusAndActionBar$27(iStatusBarColor, i, i3, i2, supportActionBar, valueAnimator);
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
        lambda$debugItems$19();
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
            CrashHelper.c(new Exception("checkPickMediaError:" + e.getMessage(), e));
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

    @Override // p007l.mcr
    public void creates(final e30<Bundle> e30Var, final d30 d30Var) {
        n11.c();
        this.lifecycleSubject.subscribe(new e30() { // from class: l.n20
            public final void call(Object obj) {
                Act.m642P0(e30Var, d30Var, (C0231c) obj);
            }
        }, EMPTY_ON_ERROR, ACTION0_NOTHING);
    }

    public void cropImage(String str) {
        startActivityForResult(CropperAct.m1324E1(this, str), CROP_IMAGE);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(new j760<>("finish the activity", new d30() { // from class: l.a20
            public final void call() {
                this.f1832a.lambda$debugItems$19();
            }
        }));
        arrayList.add(new j760<>("clear SavedValue", new d30() { // from class: l.b20
            public final void call() {
                this.f1905a.lambda$debugItems$21();
            }
        }));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View decorOrSwipingDecorView() {
        return SWIPE_BACK_SUPPORTED ? this.swipeBack.m917t() : getWindow().getDecorView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog.C0221e dialog() {
        return new Dialog.C0221e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dimStatusBar(boolean z) {
        getWindow().getDecorView().setSystemUiVisibility(z ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable drawable(int i) {
        return nu0.b(this, i);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(v9j<c<T>> v9jVar, boolean z) {
        return mkd0.m9871D(v9jVar, lifecycle().compose(mkd0.m9872E()), z);
    }

    public Animator enterAnimation() {
        return null;
    }

    public Animator exitAnimation() {
        return null;
    }

    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void lambda$debugItems$19() {
        this.lifecycleSubject.onNext(C0231c.f1253o);
        C0215v c0215v = this.trans;
        if (c0215v != null) {
            if (this.finishingByAnimation) {
                return;
            }
            this.finishingByAnimation = true;
            if (this.currentTransAnim == null || c0215v.f1063b.mo679b()) {
                finishStartWithAnim();
                return;
            } else {
                bt0.m8651f(this.currentTransAnim, new Runnable() { // from class: l.m10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3274a.lambda$finish$29();
                    }
                });
                return;
            }
        }
        y20.AbstractC0786a abstractC0786a = this.partTransition;
        if (abstractC0786a == null) {
            actualFinish();
            return;
        }
        if (this.finishingByAnimation) {
            return;
        }
        this.finishingByAnimation = true;
        if (this.currentTransAnim == null || abstractC0786a.m11858d()) {
            finishPartStartWithAnim();
        } else {
            bt0.m8651f(this.currentTransAnim, new Runnable() { // from class: l.n10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3337a.lambda$finish$30();
                }
            });
        }
    }

    public void finishPartStartWithAnim() {
        View viewM11857c = this.partTransition.m11857c(this.act);
        if (viewM11857c != null) {
            viewM11857c.setBackgroundDrawable(null);
        }
        Animator animatorM11862h = this.partTransition.m11862h(this.act);
        if (animatorM11862h != null) {
            animatorM11862h.addListener(new C0196c());
            animatorM11862h.start();
        } else {
            this.partTransition = null;
            actualFinish();
        }
    }

    public void finishStartWithAnim() {
        AppCompatActivity appCompatActivity = (Act) this.trans.f1062a.get();
        if (appCompatActivity == null) {
            this.trans = null;
            actualFinish();
            return;
        }
        View viewM693a = this.trans.f1063b.m693a(this);
        if (viewM693a != null) {
            viewM693a.setBackgroundDrawable(null);
        }
        final View decorView = appCompatActivity.getWindow().getDecorView();
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
        Animator animatorMo681d = this.trans.f1063b.mo681d(appCompatActivity, this);
        if (animatorMo681d != null) {
            animatorMo681d.addListener(new C0197d());
            animatorMo681d.start();
        } else {
            this.trans = null;
            actualFinish();
        }
    }

    public void finishWithoutCustomAnimation() {
        this.lifecycleSubject.onNext(C0231c.f1253o);
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

    /* JADX WARN: Multi-variable type inference failed */
    public TextView getCentralTitle(CharSequence charSequence) {
        VText vText = new VText(this);
        int i = t100.j;
        int i2 = t100.e;
        vText.setPadding(i, i2, i, i2);
        vText.setSingleLine();
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setTypeface(eqh0.c(3));
        vText.setText(charSequence);
        vText.setTextColor(this.originalTitle.getTextColors());
        vText.setTextSize(0, this.originalTitle.getTextSize());
        return vText;
    }

    @Override // p007l.k0m
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

    /* JADX WARN: Multi-variable type inference failed */
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

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater inflater() {
        return LayoutInflater.from(this);
    }

    public void initAnimationState() {
    }

    @CallSuper
    public void initDataOnCreate() {
        lqf.m9815a().m9817c(ExtraActLifecycle.onInitDataOnCreate, this);
        lifecycle().subscribe(new e30() { // from class: l.o10
            public final void call(Object obj) {
                this.f3474a.lambda$initDataOnCreate$14((C0231c) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPartTransitionCreate() {
        String stringExtra = getIntent().getStringExtra("unique_transition_key");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.partTransition = y20.m11854b(stringExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPartTransitionPostCreate() {
        y20.AbstractC0786a abstractC0786a = this.partTransition;
        if (abstractC0786a != null) {
            abstractC0786a.m11869o(this.act);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            xdl0.b0(getWindow().getDecorView(), new v9j() { // from class: l.w10
                public final Object call() {
                    return this.f5002a.lambda$initPartTransitionPostCreate$32(atomicBoolean);
                }
            });
        }
    }

    @CallSuper
    public void initSubscription() {
        lqf.m9815a().m9817c(ExtraActLifecycle.onInitSubscription, this);
    }

    public void initTransitionCreate() {
        Act act;
        C0215v c0215vPoll = tempQueue.poll();
        if (c0215vPoll == null || !c0215vPoll.f1064c.equals(getClass().getName()) || (act = c0215vPoll.f1062a.get()) == null) {
            return;
        }
        this.trans = new C0215v(new WeakReference(act), c0215vPoll.f1063b, c0215vPoll.f1064c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initTransitionPostCreate() {
        final Act act;
        C0215v c0215v = this.trans;
        if (c0215v == null || (act = c0215v.f1062a.get()) == null) {
            return;
        }
        this.trans.f1063b.mo685h(act, this.act);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        xdl0.b0(getWindow().getDecorView(), new v9j() { // from class: l.i20
            public final Object call() {
                return this.f2861a.lambda$initTransitionPostCreate$33(atomicBoolean, act);
            }
        });
    }

    public boolean isAdjustResizeEnabled() {
        return isAdjustResizeInAttributes() || isAdjustResizeInManifest();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isAdjustResizeInAttributes() {
        return (getWindow().getAttributes().softInputMode & 240) == 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isAdjustResizeInManifest() {
        try {
            return (getPackageManager().getActivityInfo(getComponentName(), 128).softInputMode & 240) == 16;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public boolean isCancelable() {
        Object showingDialog = getShowingDialog();
        if (!(showingDialog instanceof Dialog)) {
            return true;
        }
        Dialog.C0221e c0221e = ((Dialog) showingDialog).f1106l;
        if (c0221e == null) {
            return false;
        }
        return c0221e.f1140F;
    }

    public boolean isDialogShowing() {
        List<WeakReference<Dialog>> list = this.showingDialogList;
        return list != null && list.size() > 0 && this.showingDialogList.get(0).get() != null && this.showingDialogList.get(0).get().isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isFinishing() {
        return super/*android.app.Activity*/.isFinishing() || this.finishingByAnimation;
    }

    @Override // p007l.mcr, p007l.d0e
    public c<C0231c> lifecycle() {
        return this.lifecycleSubject;
    }

    @Override // p007l.mcr
    public C0231c lifecycle_() {
        return (C0231c) this.lifecycleSubject.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void lmdStart(int i) {
        try {
            if (sensorManager == null) {
                e51.m9025H(App.f1068e, new Runnable() { // from class: l.o20
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act.lmdEnd();
                    }
                }, i);
                lmdResult = false;
                sensorManager = (SensorManager) getSystemService("sensor");
                ArrayList<C0214u> arrayList = new ArrayList<>();
                sensors = arrayList;
                arrayList.add(lmdCreate("0", sensorManager.getDefaultSensor(1)));
                sensors.add(lmdCreate(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, sensorManager.getDefaultSensor(4)));
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("Act lmdStart exception:" + e.getMessage(), e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            File fileM9572O = k9j.m9572O("cache");
            tempFileName = fileM9572O.getAbsolutePath();
            Uri uriForFile = FileProvider.getUriForFile(this, "files." + getPackageName(), fileM9572O);
            if (!z && needAwardFilePermission()) {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setDataAndType(uriForFile, "video/*");
                    List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent2, 65536);
                    if (!vwb.J(listQueryIntentActivities)) {
                        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
                        }
                    }
                } catch (ActivityNotFoundException e) {
                    CrashHelper.c(e);
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
            this.act.startActivityForResult(intent, z ? TAKE_PICTURE : RECORD_VIDEO);
            mediaCaptureBs.onNext(Boolean.valueOf(z));
        } catch (ActivityNotFoundException e2) {
            CrashHelper.c(e2);
            lsi0.m9834h(R$string.f813g7);
        } catch (SecurityException e3) {
            CrashHelper.c(e3);
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

    /* JADX WARN: Multi-variable type inference failed */
    public dd80.C0522a newDialog() {
        return new dd80.C0522a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(16)
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityReslutManager.m883b(i, i2, intent)) {
            return;
        }
        if (i2 != -1) {
            try {
                super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
                return;
            } catch (IllegalStateException e) {
                if (!"Task is already complete".equals(e.getMessage())) {
                    throw e;
                }
                CrashHelper.c(e);
                return;
            }
        }
        PickMediaError pickMediaError = null;
        if (i == PICK_IMAGES && intent.getClipData() != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                String strM8714g = c16.m8714g(intent.getClipData().getItemAt(i3).getUri());
                PickMediaError pickMediaErrorCheckPickMediaError = checkPickMediaError(strM8714g);
                if (pickMediaErrorCheckPickMediaError == null) {
                    arrayList.add(strM8714g);
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
        if ((i == PICK_IMAGE || i == PICK_IMAGES) && intent.getData() != null) {
            ArrayList arrayList2 = new ArrayList();
            String strM8714g2 = c16.m8714g(intent.getData());
            PickMediaError pickMediaErrorCheckPickMediaError2 = checkPickMediaError(strM8714g2);
            if (pickMediaErrorCheckPickMediaError2 != null) {
                reportPickMediaError(pickMediaErrorCheckPickMediaError2);
                return;
            } else {
                arrayList2.add(strM8714g2);
                onPickImagesSystemResult(arrayList2);
                return;
            }
        }
        if (i == PICK_VIDEO) {
            String strM8714g3 = c16.m8714g(intent.getData());
            PickMediaError pickMediaErrorCheckPickMediaError3 = checkPickMediaError(strM8714g3);
            if (pickMediaErrorCheckPickMediaError3 == null) {
                onPickVideoSystemResult(strM8714g3);
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
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
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

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xdl0.G0(true);
        this.screenHeight = xdl0.x0(this);
        int iZ0 = xdl0.z0(this);
        this.screenWidth = iZ0;
        if (hn5.m9347d(iZ0)) {
            hn5.m9346c(this, 360);
            hn5.m9346c(App.f1068e, 360);
        } else {
            hn5.m9345b(this);
            hn5.m9345b(App.f1068e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            CrashHelper.d(new IllegalArgumentException("Act getParcelableExtra error ，act = " + this, e), LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);
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
        hi3.m9335a(getIntent().getExtras(), getClass().getSimpleName().concat(",onCreate getIntent"));
        if (bundle != null) {
            hi3.m9335a(bundle, getClass().getSimpleName().concat(",onCreate sis"));
            Bundle bundle4 = bundle.getBundle(STAT_GLOBAL_STATE);
            if (bundle4 != null) {
                onRestoreGlobalState(bundle4);
            }
        }
        initDataOnCreate();
        initSubscription();
        setTheme();
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack = SwipeBackLayout.m905w(this);
            TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.statusBarColor});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.swipeBack.m907B(color);
            getWindow().setStatusBarColor(0);
        }
        super.onCreate(bundle);
        this.res = getResources();
        this.screenHeight = xdl0.x0(this);
        int iZ0 = xdl0.z0(this);
        this.screenWidth = iZ0;
        if (hn5.m9347d(iZ0)) {
            hn5.m9346c(this, 360);
            hn5.m9346c(App.f1068e, 360);
        } else {
            hn5.m9345b(this);
            hn5.m9345b(App.f1068e);
        }
        if (C0230b.f1237a) {
            getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalFocusChangeListener(new C0230b.a());
        }
        initTransitionCreate();
        initPartTransitionCreate();
        preCreateView(bundle);
        if (isFinishing()) {
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().w(true);
            getSupportActionBar().A(getSupportActionBar().j() / 2.0f);
            try {
                View view = (View) TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar());
                if (view != null) {
                    view.setFocusable(false);
                }
                TextView textView = (TextView) TOOLBAR_TITLE_VIEW_FILED.get(toolbar());
                if (textView != null) {
                    textView.setTypeface(eqh0.c(3));
                }
                view.setMinimumWidth(t100.d(56.0f));
                if (debugShowMenu && getSupportActionBar() != null) {
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p10
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            return this.f3588a.lambda$onCreate$15(view2);
                        }
                    });
                }
            } catch (IllegalAccessException e2) {
                CrashHelper.c(e2);
            }
        }
        boolean z3 = App.f1065b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        View viewInflateView = inflateView(inflater(), null);
        monitorInflateViewCost(jCurrentTimeMillis);
        setWindowContentOverlayCompat();
        if (viewInflateView != null) {
            setContentView(viewInflateView);
        }
        lifecycle().subscribe(new e30() { // from class: l.q10
            public final void call(Object obj) {
                this.f3805a.lambda$onCreate$16((C0231c) obj);
            }
        });
        this.lifecycleSubject.onNext(new C0231c.a(bundle));
        this.lifecycleSubject.onNext(C0231c.f1244f);
        if (viewInflateView != null) {
            viewInflateView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0203j());
            if (gbl0.O(viewInflateView)) {
                possiblyResizeChildOfContent();
            }
        }
        int taskId = getTaskId();
        ArrayList<C0211r> arrayList = acts.get(Integer.valueOf(taskId));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            acts.put(Integer.valueOf(taskId), arrayList);
        }
        C0211r c0211r = new C0211r();
        c0211r.f1042a = new WeakReference<>(this);
        c0211r.f1043b = C0231c.f1244f;
        arrayList.add(c0211r);
        changeGlobalLifecycleStates();
        AutoSpeedCustomView autoSpeedCustomView = new AutoSpeedCustomView(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(1, 1);
        autoSpeedCustomView.setBackgroundColor(0);
        autoSpeedCustomView.setLayoutParams(layoutParams);
        ((ViewGroup) getWindow().getDecorView()).addView(autoSpeedCustomView);
    }

    public void onCropImageResult(String str) {
    }

    @Deprecated
    public final void onDestroy() {
        SwipeBackLayout swipeBackLayout;
        if (this.hasBlockOnCreate) {
            super.onDestroy();
            return;
        }
        this.lifecycleSubject.onNext(C0231c.f1251m);
        this.lifecycleSubject.onCompleted();
        Iterator<ArrayList<C0211r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<C0211r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().f1042a.get() == this) {
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
                CrashHelper.c(new Exception(getClass().getSimpleName() + " onDestroy: " + e.getMessage(), e));
            }
        }
        if (SWIPE_BACK_SUPPORTED && (swipeBackLayout = this.swipeBack) != null) {
            swipeBackLayout.m920x();
        }
        onDestroyLifecycle();
        super.onDestroy();
        afterDestroyLivecycle();
    }

    @CallSuper
    public void onDestroyLifecycle() {
        if (isFromBackStack || e51.m9018A(App.f1068e)) {
            return;
        }
        isFromDestoryed = true;
        lqf.m9815a().m9817c(ExtraActLifecycle.onDestroyToBackground, this);
    }

    @Override // p007l.d0e
    public void onDialogAttachToWindow(Dialog dialog) {
        if (this.showingDialogList == null) {
            this.showingDialogList = new ArrayList();
        }
        this.showingDialogList.add(new WeakReference<>(dialog));
    }

    @Override // p007l.d0e
    public void onDialogDetachFromWindow(final Dialog dialog) {
        WeakReference weakReference;
        List<WeakReference<Dialog>> list = this.showingDialogList;
        if (list == null || (weakReference = (WeakReference) vwb.r(list, new w9j() { // from class: l.l10
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
            ((Dialog) this.showingDialogList.get(0).get()).f4210i.filter(new w9j() { // from class: l.j20
                public final Object call(Object obj) {
                    return Act.m638K0((Boolean) obj);
                }
            }).take(1).subscribe(new e30() { // from class: l.k20
                public final void call(Object obj) {
                    d30Var.call();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onHomePressed() {
        defaultOnHomePressed(this);
    }

    public void onNewIntent(Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onNewIntent(intent);
        lqf.m9815a().m9817c(ExtraActLifecycle.onNewIntent, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        }
        this.act.onHomePressed();
        return true;
    }

    @Deprecated
    public final void onPause() {
        if (this.hasBlockOnResume) {
            super/*androidx.fragment.app.FragmentActivity*/.onPause();
            return;
        }
        this.lifecycleSubject.onNext(C0231c.f1248j);
        Iterator<ArrayList<C0211r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C0211r c0211r : it.next()) {
                if (c0211r.f1042a.get() == this) {
                    c0211r.f1043b = C0231c.f1248j;
                    c0211r.f1044c = SystemClock.uptimeMillis();
                    z = true;
                }
            }
        }
        if (z) {
            changeGlobalLifecycleStates();
        }
        onPauseLifecycle();
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
    }

    @CallSuper
    public void onPauseLifecycle() {
    }

    public void onPickImagesSystemResult(List<String> list) {
    }

    public void onPickVideoSystemResult(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            this.swipeBack.m915r();
        }
        initTransitionPostCreate();
        initPartTransitionPostCreate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        try {
            if (this.actionMenuView == null) {
                this.actionMenuView = (ActionMenuView) TOOLBAR_MENU_VIEW_FILED.get(toolbar());
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        if (this.actionMenuView != null) {
            int iD = t100.d(8.0f);
            ArrayList nonActionItems = menu != null ? ((MenuBuilder) menu).getNonActionItems() : null;
            if (nonActionItems == null) {
                z = false;
            } else {
                int size = nonActionItems.size();
                if (size == 1) {
                    z = !((MenuItemImpl) nonActionItems.get(0)).isActionViewExpanded();
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
                    actionMenuView.setPadding(0, 0, iD, 0);
                }
            }
        }
        return super/*android.app.Activity*/.onPrepareOptionsMenu(menu);
    }

    public void onReadIntentError() {
    }

    public void onRecordVideoResult(String str) {
    }

    @CallSuper
    public void onRestoreGlobalState(Bundle bundle) {
    }

    @Deprecated
    public final void onResume() {
        boolean zShouldBlockOnResume = shouldBlockOnResume();
        this.hasBlockOnResume = zShouldBlockOnResume;
        if (zShouldBlockOnResume) {
            super/*androidx.fragment.app.FragmentActivity*/.onResume();
            lambda$debugItems$19();
            return;
        }
        C0215v c0215v = this.trans;
        if (c0215v != null && c0215v.f1062a.get() != null) {
            this.trans.f1063b.mo683f(this.act);
        }
        y20.AbstractC0786a abstractC0786a = this.partTransition;
        if (abstractC0786a != null) {
            abstractC0786a.m11866l(this.act);
        }
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        this.lifecycleSubject.onNext(C0231c.f1247i);
        Iterator<ArrayList<C0211r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C0211r c0211r : it.next()) {
                if (c0211r.f1042a.get() == this) {
                    c0211r.f1043b = C0231c.f1247i;
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
            lqf.m9815a().m9817c(ExtraActLifecycle.onResumeFromAppStart, this);
        } else if (isFromBackground) {
            lqf.m9815a().m9817c(ExtraActLifecycle.onResumeFromBackground, this);
        }
        if (isInit || isFromBackStack || isFromDestoryed || isFromBackground) {
            lqf.m9815a().m9817c(ExtraActLifecycle.onResumeFromAppStartOrBackground, this);
        }
        isInit = false;
        isFromBackStack = false;
        isFromDestoryed = false;
        isFromBackground = false;
    }

    @CallSuper
    public void onSaveGlobalState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        onSaveGlobalState(bundle2);
        bundle.putBundle(STAT_GLOBAL_STATE, bundle2);
        hi3.m9335a(bundle, getClass().getSimpleName().concat(",onSaveInstanceState"));
    }

    @Deprecated
    public final void onStart() {
        boolean zShouldBlockOnStart = shouldBlockOnStart();
        this.hasBlockOnStart = zShouldBlockOnStart;
        if (zShouldBlockOnStart) {
            super.onStart();
            lambda$debugItems$19();
            return;
        }
        super.onStart();
        this.lifecycleSubject.onNext(C0231c.f1246h);
        Iterator<ArrayList<C0211r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C0211r c0211r : it.next()) {
                if (c0211r.f1042a.get() == this) {
                    c0211r.f1043b = C0231c.f1246h;
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

    @Deprecated
    public final void onStop() {
        if (this.hasBlockOnStart) {
            super.onStop();
            return;
        }
        this.lifecycleSubject.onNext(C0231c.f1249k);
        Iterator<ArrayList<C0211r>> it = acts.values().iterator();
        while (it.hasNext()) {
            for (C0211r c0211r : it.next()) {
                if (c0211r.f1042a.get() == this) {
                    c0211r.f1043b = C0231c.f1249k;
                    c0211r.f1044c = SystemClock.uptimeMillis();
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
        if (isFromBackStack || e51.m9018A(App.f1068e)) {
            return;
        }
        isFromBackground = true;
        lqf.m9815a().m9817c(ExtraActLifecycle.onStopToBackground, this);
    }

    public void onTakePictureResult(String str) {
    }

    public String pageId() {
        return getClass().getName();
    }

    public void pendChangeActionButtonTypeface() {
        xdl0.b0(findViewById(R.id.content), new v9j() { // from class: l.y10
            public final Object call() {
                return this.f5369a.lambda$pendChangeActionButtonTypeface$13();
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
                startActivityForResult(intent, PICK_IMAGES);
                return;
            } catch (ActivityNotFoundException e) {
                CrashHelper.c(e);
                pickImagesSystem(false);
                return;
            }
        }
        Intent intent2 = new Intent("android.intent.action.PICK");
        intent2.setType("image/*");
        try {
            startActivityForResult(intent2, PICK_IMAGE);
        } catch (ActivityNotFoundException e2) {
            CrashHelper.c(e2);
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.setType("image/*");
            try {
                startActivityForResult(intent3, PICK_IMAGE);
            } catch (ActivityNotFoundException e3) {
                CrashHelper.c(e3);
            }
        }
    }

    public void pickVideoSystem() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("video/*");
        try {
            try {
                try {
                    startActivityForResult(intent, PICK_VIDEO);
                } catch (ActivityNotFoundException unused) {
                    Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("video/*");
                    startActivityForResult(intent2, PICK_VIDEO);
                }
            } catch (ActivityNotFoundException unused2) {
                Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                intent3.setType("video/*");
                startActivityForResult(Intent.createChooser(intent3, ""), PICK_VIDEO);
            }
        } catch (ActivityNotFoundException e) {
            CrashHelper.c(e);
        }
    }

    @Override // p007l.k0m
    public a<pc80> popLifeObs() {
        return this.popLifeSub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void possiblyResizeChildOfContent() {
        if (!this.isSetUpKeyboardDetectorLayout && Build.VERSION.SDK_INT > 34 && isAdjustResizeEnabled()) {
            View decorView = getWindow().getDecorView();
            final boolean z = (decorView.getSystemUiVisibility() & 1024) == 1024;
            final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            final View childAt = frameLayout.getChildAt(0);
            final ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            final int[] iArr = {0};
            final boolean[] zArr = {false};
            gbl0.y0(decorView, new bd50() { // from class: l.z10
                public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                    return Act.m637J0(zArr, iArr, z, layoutParams, frameLayout, childAt, view, y6q0Var);
                }
            });
            gbl0.g0(decorView);
        }
    }

    public void post(Runnable runnable) {
        e51.m9024G(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void postDelayed(Runnable runnable, long j) {
        e51.m9025H(this, runnable, j);
    }

    public void preCreateView(Bundle bundle) {
    }

    public void progressDismiss() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
                CrashHelper.c(new Exception(getClass().getSimpleName() + " progressDismiss: " + e.getMessage(), e));
            }
            this.progressDialog = null;
        }
    }

    public void realFinishAfterFinishingAnimation() {
        C0215v c0215v = this.trans;
        AbstractC0216w abstractC0216w = c0215v == null ? null : c0215v.f1063b;
        this.trans = null;
        actualFinish();
        if (abstractC0216w != null) {
            abstractC0216w.mo684g(this);
        }
    }

    @Deprecated
    public void recordVideo() {
        mediaCapture(false);
    }

    public void registerOnActivityResultListener(C0229a.a aVar) {
        this.activityReslutManager.m884c(aVar);
    }

    public void removeCallbacks(Runnable runnable) {
        e51.m9027J(runnable);
    }

    public void removeKeyboardListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public void setActionBarColor(int i) {
        this.actionBarColor = i;
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u(new ColorDrawable(i));
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
            this.swipeBack.m922z();
        }
    }

    @Deprecated
    public ViewTreeObserver.OnGlobalLayoutListener setKeyboardListener(View view, e30<Boolean> e30Var) {
        ViewTreeObserverOnGlobalLayoutListenerC0210q viewTreeObserverOnGlobalLayoutListenerC0210q = new ViewTreeObserverOnGlobalLayoutListenerC0210q(view, new WeakReference(e30Var));
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0210q);
        return viewTreeObserverOnGlobalLayoutListenerC0210q;
    }

    public void setNavigationBarColor(int i) {
        if (Build.VERSION.SDK_INT <= 34) {
            this.act.getWindow().setNavigationBarColor(i);
        } else if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m906A(i);
        }
    }

    public void setPaddingToNavigationBar(int i) {
        if (Build.VERSION.SDK_INT <= 34 || !SWIPE_BACK_SUPPORTED) {
            return;
        }
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById.getTag(p4c0.f3662f) == null || !viewFindViewById.getTag(p4c0.f3662f).equals(Integer.valueOf(i))) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i);
            viewFindViewById.setTag(p4c0.f3662f, Integer.valueOf(i));
            this.swipeBack.m909D(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            return;
        }
        super/*android.app.Activity*/.setRequestedOrientation(i);
    }

    public void setStatusBarColor(int i) {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m907B(i);
        }
    }

    public void setSwipeBackEnable(boolean z) {
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.setEnableGesture(z);
        }
    }

    public void setTheme() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitle(String str, boolean z) {
        if (!z) {
            super/*android.app.Activity*/.setTitle(str);
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
            ViewGroup.LayoutParams eVar = new Toolbar.e(-2, -2);
            ((i30.a) eVar).a = 17;
            toolbar().addView(this.centralTitle, eVar);
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
            CrashHelper.c(e);
            setTitle(str);
        } catch (IllegalArgumentException e2) {
            CrashHelper.c(e2);
            setTitle(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View setTopViewLayout(View view) {
        return setUpKeyboardDetectorLayout(view, new LinearLayout(this), (h30<Boolean, Integer, Boolean, Integer>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View setUpKeyboardDetectorLayout(View view, View view2, h30<Boolean, Integer, Boolean, Integer> h30Var) {
        this.isSetUpKeyboardDetectorLayout = true;
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        view.setPadding(0, ((getSupportActionBar() == null || getWindow().hasFeature(9)) ? 0 : t100.d(56.0f)) + xdl0.F0(), 0, 0);
        viewGroup.addView(view, 0);
        if (Build.VERSION.SDK_INT <= 34) {
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0209p(new C0213t(view, view2, h30Var, viewGroup)));
            return view2;
        }
        gbl0.y0(viewGroup, new C0208o(view, h30Var));
        gbl0.g0(viewGroup);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.app.Dialog, com.p1.mobile.android.app.Dialog, l.szd] */
    public void showDebugMenu(ArrayList<j760<String, d30>> arrayList) {
        ArrayList arrayListQ = vwb.Q(arrayList, new w9j() { // from class: l.r10
            public final Object call(Object obj) {
                return Act.m644R0((j760) obj);
            }
        });
        m8c.c(arrayListQ);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, t100.d(5.0f), 0, 0);
        AppCompatEditText appCompatEditText = new AppCompatEditText(this);
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setHint(R.string.search_go);
        appCompatEditText.setTextSize(16.0f);
        appCompatEditText.setGravity(19);
        int iD = t100.d(24.0f);
        appCompatEditText.setPadding(iD, t100.d(16.0f), iD, t100.d(16.0f));
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(3);
        C0204k c0204k = new C0204k(this, b6c0.f1910B);
        c0204k.addAll(arrayListQ);
        appCompatEditText.addTextChangedListener(new C0205l(c0204k, arrayListQ));
        appCompatEditText.setOnClickListener(new View.OnClickListener() { // from class: l.s10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.r("e_debug_tool_search", "p_debug_tool_dialog_view");
            }
        });
        linearLayout.addView((View) appCompatEditText, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, -2));
        VList vList = new VList(this);
        vList.setDivider(null);
        vList.setAdapter(c0204k);
        linearLayout.addView((View) vList, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ?? M838z = dialog().m791P(linearLayout, false).m838z();
        M838z.getWindow().setSoftInputMode(16);
        M838z.show();
        vList.setOnItemClickListener(new C0206m(c0204k, arrayList, M838z));
        cwf0 cwf0Var = new cwf0("p_debug_tool_dialog_view", Dialog.class.getName());
        cwf0Var.i();
        cwf0Var.l();
        M838z.setOnDismissListener(new DialogInterfaceOnDismissListenerC0207n(cwf0Var));
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.requestFocus();
    }

    public boolean showInput(View view, int i) {
        return imm().showSoftInput(view, i);
    }

    public void startActivityForResult(int i, Intent intent, C0229a.a aVar) {
        if (!this.activityReslutManager.m882a(aVar)) {
            this.activityReslutManager.m884c(new C0195b(i, aVar));
        }
        startActivityForResult(intent, i);
    }

    public void startActivityForResultFromFragmentWithCustomTransition(Frag frag, Intent intent, int i, AbstractC0216w abstractC0216w) {
        if (abstractC0216w != null) {
            tempQueue.add(new C0215v(new WeakReference(this), abstractC0216w, intent.getComponent().getClassName()));
        }
        startActivityFromFragment(frag, intent, i);
    }

    public void startActivityForResultWithCustomTransition(Intent intent, int i, AbstractC0216w abstractC0216w) {
        if (abstractC0216w != null) {
            tempQueue.add(new C0215v(new WeakReference(this), abstractC0216w, intent.getComponent().getClassName()));
        }
        startActivityForResult(intent, i);
    }

    public void startActivityFromFragmentWithCustomTransition(Frag frag, Intent intent, AbstractC0216w abstractC0216w) {
        startActivityForResultFromFragmentWithCustomTransition(frag, intent, -1, abstractC0216w);
    }

    public void startActivityWithCustomTransition(Intent intent, AbstractC0216w abstractC0216w) {
        startActivityForResultWithCustomTransition(intent, -1, abstractC0216w);
    }

    public int statusBarColor() {
        if (SWIPE_BACK_SUPPORTED) {
            return this.swipeBack.m908C();
        }
        return -16777216;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String string(int i) {
        return getString(i);
    }

    @Deprecated
    public void takePicture() {
        mediaCapture(true);
    }

    public Toolbar toolbar() {
        return findViewById(p4c0.f3652a);
    }

    public void unregisterOnActivityResultListener(C0229a.a aVar) {
        this.activityReslutManager.m885d(aVar);
    }

    public <T> c<T> duringCreated(final c<T> cVar, boolean z) {
        return duringCreated(new v9j() { // from class: l.g20
            public final Object call() {
                return Act.m636I0(cVar);
            }
        }, z);
    }

    @Override // p007l.mcr
    public void creates(e30<Bundle> e30Var) {
        creates(e30Var, ACTION0_NOTHING);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(v9j<c<T>> v9jVar) {
        return duringCreated((v9j) v9jVar, true);
    }

    @Override // p007l.mcr
    public <T> c<T> duringCreated(final c<T> cVar) {
        return duringCreated((v9j) new v9j() { // from class: l.q20
            public final Object call() {
                return Act.m646T0(cVar);
            }
        }, true);
    }

    public void startActivityForResult(Intent intent, C0229a.a aVar) {
        startActivityForResult(1001, intent, aVar);
    }

    public void startActivityForResultWithCustomTransition(Intent intent, int i, AbstractC0216w abstractC0216w, C0229a.a aVar) {
        if (abstractC0216w != null) {
            tempQueue.add(new C0215v(new WeakReference(this), abstractC0216w, intent.getComponent().getClassName()));
        }
        startActivityForResult(i, intent, aVar);
    }

    private void debugColorAllViews() {
        debugColorAllViews(findViewById(R.id.content), 0);
    }

    public View setUpKeyboardDetectorLayout(View view, View view2, final f30<Boolean, Integer> f30Var) {
        return setUpKeyboardDetectorLayout(view, view2, new h30() { // from class: l.d20
            /* JADX INFO: renamed from: b */
            public final void m8838b(Object obj, Object obj2, Object obj3, Object obj4) {
                f30Var.call((Boolean) obj, (Integer) obj2);
            }
        });
    }

    public void hideInput() {
        hideInput(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean hideInput(View view) {
        getWindow().setSoftInputMode(2);
        return imm().hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog progress(int i, boolean z) {
        return progress(getString(i), z);
    }

    public Dialog progress(String str) {
        return progress(str, false);
    }

    public Dialog progress(String str, boolean z) {
        return progress(str, null, z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                        this.f3199a.lambda$progress$28(dialogProgress, z2, f, attributes, valueAnimator);
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitle(CharSequence charSequence) {
        super/*android.app.Activity*/.setTitle(charSequence);
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
                xdl0.d0(this.originalTitle, Math.max(0, (((int) ((xdl0.y0() - t100.d(114.0f)) - textView4.getPaint().measureText(charSequence.toString()))) / 2) - t100.d(12.0f)));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
            } catch (IllegalArgumentException e2) {
                CrashHelper.c(e2);
            }
            toolbar().setTitle(charSequence);
        }
    }

    @Deprecated
    public void mediaCapture(boolean z) {
        mediaCapture(z, false);
    }

    public static c<Boolean> mediaCapture() {
        return mediaCaptureBs.onBackpressureLatest().asObservable();
    }

    public void setTitle(int i) {
        setTitle(string(i));
    }

    public void showDebugMenu() {
        showDebugMenu(debugItems());
    }
}
