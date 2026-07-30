package com.p051p1.mobile.android.app;

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
import androidx.appcompat.app.DialogInterfaceC0075a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p051p1.mobile.android.R$string;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.swipback.SwipeBackLayout;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.android.p053ui.poplevel.PopLifecycleEvent;
import com.p051p1.mobile.android.statistic.AutoSpeedCustomView;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VList;
import p151v.VText;
import p153l.AbstractC15610a;
import p153l.af60;
import p153l.b30;
import p153l.bnl0;
import p153l.c30;
import p153l.cf20;
import p153l.dgq0;
import p153l.e3m;
import p153l.ecj;
import p153l.gcg0;
import p153l.gec0;
import p153l.gkc0;
import p153l.gt0;
import p153l.h26;
import p153l.hxd0;
import p153l.i4g0;
import p153l.il50;
import p153l.jl80;
import p153l.jyb;
import p153l.kkl0;
import p153l.l4g0;
import p153l.l51;
import p153l.lo5;
import p153l.lyh0;
import p153l.ner;
import p153l.o1j0;
import p153l.pcg0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.q1e;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.r1e;
import p153l.s20;
import p153l.s9c;
import p153l.srf;
import p153l.tu0;
import p153l.tu2;
import p153l.u11;
import p153l.u7c0;
import p153l.ujh0;
import p153l.ux0;
import p153l.uxj0;
import p153l.vcc0;
import p153l.vi3;
import p153l.vk80;
import p153l.vxd0;
import p153l.x20;
import p153l.y20;
import p153l.ye5;
import p153l.z20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Act extends AppCompatActivity implements ner, r1e, e3m {
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
    private static ArrayList<C4453u> sensors;
    private static long startTime;
    private static long stopTime;
    int actionBarColor;
    private ActionMenuView actionMenuView;
    private C4468a activityReslutManager;
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
    s20.AbstractC19953a partTransition;
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
    C4454v trans;
    public static y20<Throwable> EMPTY_ON_ERROR = new y20() { // from class: l.e10
        @Override // p153l.y20
        public final void call(Object obj) {
            psd0.m173602M((Throwable) obj);
        }
    };
    public static x20 ACTION0_NOTHING = new x20() { // from class: l.p10
        @Override // p153l.x20
        public final void call() {
            Act.m21390p1();
        }
    };
    private static C22508b<Boolean> frontBs = C22508b.m222767b();
    private static C22508b<Boolean> mediaCaptureBs = C22508b.m222767b();
    private static int activityCount = 0;
    private static boolean foregroundStatusUpdated = false;
    private static C4450r foreground = null;
    private static HashMap<Integer, ArrayList<C4450r>> acts = new HashMap<>();
    private static C22507a<uxj0> globalLifecycleSubject = C22507a.m222758b();
    private static int sessionCount = 0;
    private static Handler backgroundCheckHandler = new HandlerC4441i(Looper.getMainLooper());
    public static Field TOOLBAR_NAV_BUTTON_VIEW_FIELD = Reflect.m222381on((Class<?>) Toolbar.class).field0("mNavButtonView");
    public static Field TOOLBAR_TITLE_VIEW_FILED = Reflect.m222381on((Class<?>) Toolbar.class).field0("mTitleTextView");
    public static Field TOOLBAR_MENU_VIEW_FILED = Reflect.m222381on((Class<?>) Toolbar.class).field0("mMenuView");
    public static vxd0 savedKeyboardHeight = new vxd0("keyboard_height", qa00.m175859d(220.0f));
    public static String tempFileName = null;
    static LinkedList<C4454v> tempQueue = new LinkedList<>();
    private static boolean lmdResult = false;
    private final C22507a<C4470c> lifecycleSubject = C22507a.m222758b();
    private final C22507a<vk80> popLifeSub = C22507a.m222758b();
    public Act act = this;

    public enum PickMediaError {
        NOT_RESOLVABLE,
        FILE_NOT_FOUND
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC4433a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public int f16022a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f16023b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gcg0 f16024c;

        public ViewTreeObserverOnGlobalLayoutListenerC4433a(View view, gcg0 gcg0Var) {
            this.f16023b = view;
            this.f16024c = gcg0Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f16022a == -1) {
                this.f16022a = this.f16023b.getMeasuredHeight();
            }
            int measuredHeight = this.f16022a - this.f16023b.getMeasuredHeight();
            if (measuredHeight > qa00.m175859d(100.0f)) {
                this.f16024c.onNext(Boolean.TRUE);
            } else if (measuredHeight < (-qa00.m175859d(100.0f))) {
                this.f16024c.onNext(Boolean.FALSE);
            }
            this.f16022a = this.f16023b.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$b */
    public class C4434b implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f16025a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4468a.a f16026b;

        public C4434b(int i, C4468a.a aVar) {
            this.f16025a = i;
            this.f16026b = aVar;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (this.f16025a != i) {
                return false;
            }
            boolean zMo21400a = this.f16026b.mo21400a(i, i2, intent);
            Act.this.activityReslutManager.m21613d(this);
            return zMo21400a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$c */
    public class C4435c implements Animator.AnimatorListener {
        public C4435c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act act = Act.this;
            s20.AbstractC19953a abstractC19953a = act.partTransition;
            act.partTransition = null;
            act.actualFinish();
            if (abstractC19953a != null) {
                abstractC19953a.m184082m(Act.this.act);
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
    public class C4436d implements Animator.AnimatorListener {
        public C4436d() {
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
    public class C4437e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f16030a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f16031b;

        public C4437e(View view, Drawable drawable) {
            this.f16030a = view;
            this.f16031b = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Act.this.currentTransAnim = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act.this.currentTransAnim = null;
            View view = this.f16030a;
            if (view != null) {
                view.setBackgroundDrawable(this.f16031b);
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
    public class C4438f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f16033a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f16034b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Drawable f16035c;

        public C4438f(Act act, View view, Drawable drawable) {
            this.f16033a = act;
            this.f16034b = view;
            this.f16035c = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Act.this.currentTransAnim = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Act act = Act.this;
            act.currentTransAnim = null;
            C4454v c4454v = act.trans;
            if (c4454v != null && !c4454v.f16083b.mo21410e()) {
                View decorView = this.f16033a.getWindow().getDecorView();
                if (decorView instanceof ViewGroup) {
                    decorView = ((ViewGroup) decorView).getChildAt(0);
                }
                if (decorView != null) {
                    decorView.setVisibility(4);
                }
            }
            View view = this.f16034b;
            if (view != null) {
                view.setBackgroundDrawable(this.f16035c);
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
    public class C4439g extends AbstractC15610a<pf60<String, CharSequence>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f16037c;

        public C4439g(ArrayList arrayList) {
            this.f16037c = arrayList;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return Act.this.inflater().inflate(gec0.f103789b, viewGroup, false);
        }

        @Override // p153l.AbstractC15610a
        /* JADX INFO: renamed from: p */
        public List<pf60<String, CharSequence>> mo21403p() {
            return this.f16037c;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, pf60<String, CharSequence> pf60Var, int i, int i2) {
            TextView textView = (TextView) view.findViewById(vcc0.f183390R0);
            TextView textView2 = (TextView) view.findViewById(vcc0.f183452y);
            textView.setText(pf60Var.f152156a);
            textView2.setText(pf60Var.f152157b);
            textView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$h */
    public class C4440h implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4453u f16039a;

        public C4440h(C4453u c4453u) {
            this.f16039a = c4453u;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                C4453u c4453u = this.f16039a;
                int i = c4453u.f16081d;
                if (i >= 10) {
                    if (Act.lmdResultMoved()) {
                        Act.lmdEnd();
                        return;
                    } else {
                        this.f16039a.f16081d = 0;
                        return;
                    }
                }
                float[] fArr = c4453u.f16080c[i];
                float[] fArr2 = sensorEvent.values;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                c4453u.f16081d = i + 1;
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("Act lmdCreate exception:" + e.getMessage(), e));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$i */
    public class HandlerC4441i extends Handler {
        public HandlerC4441i(Looper looper) {
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
    public class ViewOnAttachStateChangeListenerC4442j implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC4442j() {
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
    public class C4443k extends ArrayAdapter<String> {
        public C4443k(Context context, int i) {
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
    public class C4444l implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f16042a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f16043b;

        public C4444l(ArrayAdapter arrayAdapter, List list) {
            this.f16042a = arrayAdapter;
            this.f16043b = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(final Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ArrayAdapter arrayAdapter = this.f16042a;
            if (zIsEmpty) {
                arrayAdapter.clear();
                this.f16042a.addAll(this.f16043b);
            } else {
                arrayAdapter.clear();
                this.f16042a.addAll(jyb.m147522n(this.f16043b, new qcj() { // from class: l.m20
                    @Override // p153l.qcj
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
    public class C4445m implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayAdapter f16045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f16046b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Dialog f16047c;

        public C4445m(ArrayAdapter arrayAdapter, ArrayList arrayList, Dialog dialog) {
            this.f16045a = arrayAdapter;
            this.f16046b = arrayList;
            this.f16047c = dialog;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, final int i, long j) {
            i4g0.m138523u("e_debug_tool", "p_debug_tool_dialog_view", jyb.m147494Y("debug_tool_name", (String) this.f16045a.getItem(i)));
            ArrayList arrayList = this.f16046b;
            final ArrayAdapter arrayAdapter = this.f16045a;
            ((x20) ((pf60) jyb.m147529r(arrayList, new qcj() { // from class: l.n20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) ((pf60) obj).f152156a).equals(arrayAdapter.getItem(i)));
                }
            })).f152157b).call();
            this.f16047c.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$n */
    public class DialogInterfaceOnDismissListenerC4446n implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f16049a;

        public DialogInterfaceOnDismissListenerC4446n(l4g0 l4g0Var) {
            this.f16049a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f16049a.m152776k();
            this.f16049a.m152775j();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$o */
    public class C4447o implements il50 {

        /* JADX INFO: renamed from: a */
        public int f16051a;

        /* JADX INFO: renamed from: b */
        public int f16052b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f16053c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ b30 f16054d;

        public C4447o(View view, b30 b30Var) {
            this.f16053c = view;
            this.f16054d = b30Var;
        }

        @Override // p153l.il50
        @NonNull
        public dgq0 onApplyWindowInsets(@NonNull View view, @NonNull dgq0 dgq0Var) {
            int i;
            boolean zM115689p = dgq0Var.m115689p(dgq0.C16531l.m115733b());
            int i2 = dgq0Var.m115680f(dgq0.C16531l.m115733b()).f170860d;
            if (i2 != 0) {
                this.f16052b = i2;
            }
            int i3 = dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d;
            int i4 = this.f16051a;
            int iAbs = 0;
            boolean z = i4 != i3;
            if (z) {
                iAbs = Math.abs(i3 - i4);
                this.f16051a = i3;
                bnl0.m105537U(this.f16053c, i3);
            }
            if (zM115689p && (i = this.f16052b) != 0) {
                Act.savedKeyboardHeight.put(Integer.valueOf(i - i3));
            }
            b30 b30Var = this.f16054d;
            if (b30Var != null) {
                b30Var.mo102266b(Boolean.valueOf(zM115689p), Integer.valueOf(this.f16052b - i3), Boolean.valueOf(z), Integer.valueOf(iAbs));
            }
            return dgq0Var;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$p */
    public class ViewOnLayoutChangeListenerC4448p implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4452t f16056a;

        public ViewOnLayoutChangeListenerC4448p(C4452t c4452t) {
            this.f16056a = c4452t;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f16056a.m21419c(view, i2, i4);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$q */
    public class ViewTreeObserverOnGlobalLayoutListenerC4449q implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public int f16058a = -1;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f16059b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f16060c;

        public ViewTreeObserverOnGlobalLayoutListenerC4449q(View view, WeakReference weakReference) {
            this.f16059b = view;
            this.f16060c = weakReference;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f16058a == -1) {
                this.f16058a = this.f16059b.getMeasuredHeight();
            }
            int iMin = Math.min(this.f16058a, Act.this.screenHeight);
            this.f16058a = iMin;
            int measuredHeight = iMin - this.f16059b.getMeasuredHeight();
            if (measuredHeight > qa00.m175859d(100.0f)) {
                if (this.f16060c.get() != null) {
                    ((y20) this.f16060c.get()).call(Boolean.TRUE);
                }
            } else if (measuredHeight < (-qa00.m175859d(100.0f)) && this.f16060c.get() != null) {
                ((y20) this.f16060c.get()).call(Boolean.FALSE);
            }
            this.f16058a = this.f16059b.getMeasuredHeight();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$r */
    public static class C4450r {

        /* JADX INFO: renamed from: a */
        @NonNull
        public WeakReference<Activity> f16062a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public C4470c f16063b;

        /* JADX INFO: renamed from: c */
        public long f16064c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f16065d;
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$s */
    public static class C4451s<FROM extends Act, TO extends Act> extends AbstractC4455w<FROM, TO> {
        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: b */
        public boolean mo21407b() {
            return true;
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: e */
        public boolean mo21410e() {
            return true;
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: f */
        public void mo21411f(Act act) {
            act.overridePendingTransition(u7c0.f177897c, 0);
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: g */
        public void mo21412g(Act act) {
            act.overridePendingTransition(0, u7c0.f177898d);
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator mo21408c(FROM from, TO to) {
            qnp0.m177256Y0(from, to);
            return to.enterAnimation();
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Animator mo21409d(FROM from, TO to) {
            return to.exitAnimation();
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo21413h(FROM from, TO to) {
            to.initAnimationState();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$t */
    public class C4452t {

        /* JADX INFO: renamed from: a */
        public View f16066a;

        /* JADX INFO: renamed from: b */
        public View f16067b;

        /* JADX INFO: renamed from: c */
        public ViewGroup f16068c;

        /* JADX INFO: renamed from: d */
        public b30<Boolean, Integer, Boolean, Integer> f16069d;

        /* JADX INFO: renamed from: e */
        public int f16070e;

        /* JADX INFO: renamed from: f */
        public boolean f16071f;

        /* JADX INFO: renamed from: g */
        public int f16072g;

        /* JADX INFO: renamed from: h */
        public boolean f16073h = false;

        /* JADX INFO: renamed from: i */
        public int f16074i = 0;

        /* JADX INFO: renamed from: j */
        public boolean f16075j;

        /* JADX INFO: renamed from: k */
        public int f16076k;

        public C4452t(View view, View view2, b30<Boolean, Integer, Boolean, Integer> b30Var, ViewGroup viewGroup) {
            int iM175859d = 0;
            this.f16075j = Act.this.getWindow().hasFeature(9);
            if (Act.this.getSupportActionBar() != null && !this.f16075j) {
                iM175859d = qa00.m175859d(56.0f);
            }
            this.f16076k = iM175859d;
            this.f16066a = view;
            this.f16067b = view2;
            this.f16069d = b30Var;
            this.f16068c = viewGroup;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m21418b(int i) {
            View view = this.f16066a;
            if (view != null) {
                view.getLayoutParams().height = this.f16070e + i;
                this.f16066a.setPadding(0, i, 0, 0);
                this.f16066a.requestLayout();
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0052  */
        /* JADX INFO: renamed from: c */
        public void m21419c(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int i5;
            this.f16070e = Math.min(this.f16070e, Act.this.screenHeight);
            Rect rect = new Rect();
            this.f16067b.getWindowVisibleDisplayFrame(rect);
            int i6 = rect.bottom - rect.top;
            int i7 = this.f16070e - (i6 - this.f16076k);
            if (SwipeBackLayout.f16280D) {
                View childAt = this.f16068c.getChildAt(0);
                if (!(childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (i4 = ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) == (i5 = this.f16074i)) {
                    z = false;
                    i3 = 0;
                } else {
                    i3 = i4 - i5;
                    i7 -= i4 - i5;
                    this.f16074i = i4;
                    this.f16070e = (i6 - this.f16076k) + i7;
                    z = true;
                }
            } else {
                z = false;
                i3 = 0;
            }
            boolean z2 = i7 > qa00.m175859d(100.0f);
            if (!z2) {
                this.f16070e = i6 - this.f16076k;
                if ("MI 9".equals(Build.MODEL) && Build.VERSION.SDK_INT <= 34) {
                    this.f16070e = i2 - i;
                }
                final int top = 0;
                Object parent = view;
                while ((parent instanceof View) && parent != Act.this.getWindow().getDecorView()) {
                    View view2 = (View) parent;
                    top += view2.getTop();
                    parent = view2.getParent();
                }
                if (this.f16066a.getMeasuredHeight() - top != this.f16070e || top != this.f16066a.getPaddingTop()) {
                    if (this.f16073h) {
                        l51.m152887G(new Runnable() { // from class: l.o20
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f144701a.m21418b(top);
                            }
                        });
                    } else {
                        this.f16073h = true;
                        this.f16066a.getLayoutParams().height = this.f16070e + top;
                        this.f16066a.setPadding(0, top, 0, 0);
                        this.f16066a.requestLayout();
                    }
                }
            }
            if (z2 == this.f16071f && i7 == this.f16072g && !z) {
                return;
            }
            this.f16071f = z2;
            if (z2) {
                this.f16072g = i7;
                Act.savedKeyboardHeight.put(Integer.valueOf(i7));
            }
            b30<Boolean, Integer, Boolean, Integer> b30Var = this.f16069d;
            if (b30Var != null) {
                b30Var.mo102266b(Boolean.valueOf(this.f16071f && Act.this.lifecycle_() == C4470c.f16267i), Integer.valueOf(this.f16072g), Boolean.valueOf(z), Integer.valueOf(i3));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$u */
    public static class C4453u {

        /* JADX INFO: renamed from: a */
        public Sensor f16078a;

        /* JADX INFO: renamed from: b */
        public SensorEventListener f16079b;

        /* JADX INFO: renamed from: c */
        public float[][] f16080c;

        /* JADX INFO: renamed from: d */
        public int f16081d;

        public C4453u() {
            this.f16080c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
            this.f16081d = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$v */
    public static class C4454v {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<Act> f16082a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final AbstractC4455w f16083b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final String f16084c;

        public C4454v(@NonNull WeakReference<Act> weakReference, @NonNull AbstractC4455w abstractC4455w, @NonNull String str) {
            this.f16082a = weakReference;
            this.f16083b = abstractC4455w;
            this.f16084c = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Act$w */
    public static abstract class AbstractC4455w<FROM, TO> {
        /* JADX INFO: renamed from: a */
        public View mo21421a(TO to) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo21407b() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract Animator mo21408c(FROM from, TO to);

        /* JADX INFO: renamed from: d */
        public abstract Animator mo21409d(FROM from, TO to);

        /* JADX INFO: renamed from: e */
        public boolean mo21410e() {
            return true;
        }

        /* JADX INFO: renamed from: f */
        public void mo21411f(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: g */
        public void mo21412g(Act act) {
            act.overridePendingTransition(0, 0);
        }

        /* JADX INFO: renamed from: h */
        public void mo21413h(FROM from, TO to) {
        }
    }

    public Act() {
        af60.m97310e().m97312b(this);
        this.hackCenterTitle = false;
        this.centralTitle = null;
        this.originalTitle = null;
        this.specialTitle = null;
        this.centralLayout = null;
        this.specialLayout = null;
        this.centralFilter = null;
        this.specialFilter = null;
        this.activityReslutManager = new C4468a();
        this.actionBarColor = 0;
        this.trans = null;
        this.currentTransAnim = null;
        this.finishingByAnimation = false;
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ C22421c m21365J0(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ dgq0 m21366K0(boolean[] zArr, int[] iArr, boolean z, ViewGroup.LayoutParams layoutParams, FrameLayout frameLayout, View view, View view2, dgq0 dgq0Var) {
        boolean zM115689p = dgq0Var.m115689p(dgq0.C16531l.m115733b());
        int i = dgq0Var.m115680f(dgq0.C16531l.m115733b()).f170860d;
        int i2 = dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d;
        if (zM115689p == zArr[0] && iArr[0] == i) {
            return dgq0Var;
        }
        iArr[0] = i;
        zArr[0] = zM115689p;
        int i3 = z ? 0 : dgq0Var.m115680f(dgq0.C16531l.m115736e()).f170858b;
        if (zM115689p) {
            layoutParams.height = (frameLayout.getMeasuredHeight() - iArr[0]) - i3;
        } else {
            layoutParams.height = (frameLayout.getMeasuredHeight() - i3) - i2;
        }
        view.setLayoutParams(layoutParams);
        return dgq0Var;
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ Boolean m21367L0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m21371Q0(y20 y20Var, x20 x20Var, C4470c c4470c) {
        if (c4470c instanceof C4470c.a) {
            y20Var.call(((C4470c.a) c4470c).f16278p);
        } else if (c4470c == C4470c.f16271m) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m21372R0(final View view, gcg0 gcg0Var) {
        final ViewTreeObserverOnGlobalLayoutListenerC4433a viewTreeObserverOnGlobalLayoutListenerC4433a = new ViewTreeObserverOnGlobalLayoutListenerC4433a(view, gcg0Var);
        gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.y10
            @Override // p153l.x20
            public final void call() {
                Act.m21387m1(view, viewTreeObserverOnGlobalLayoutListenerC4433a);
            }
        }));
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4433a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ String m21373S0(pf60 pf60Var) {
        return (String) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ C22421c m21375U0(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actualFinish() {
        SwipeBackLayout swipeBackLayout;
        Iterator<ArrayList<C4450r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4450r c4450r : it.next()) {
                if (c4450r.f16062a.get() == this) {
                    z = true;
                    c4450r.f16065d = true;
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
        swipeBackLayout.m21648x();
    }

    private boolean canResolveTargetPackage(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void changeGlobalLifecycleStates() {
        foregroundStatusUpdated = false;
        C4450r c4450r = foreground;
        tryUpdateForegroundStatus();
        if (c4450r == null && foreground == null) {
            return;
        }
        if (c4450r == null || foreground == null || c4450r.f16062a.get() != foreground.f16062a.get()) {
            globalLifecycleSubject.onNext(uxj0.f181467a);
        }
    }

    private void debugColorAllViews(View view, int i) {
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.argb(20, gkc0.f104723a.nextInt(255), gkc0.f104723a.nextInt(255), gkc0.f104723a.nextInt(255)));
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
                cf20.m109510e(activity);
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("defaultOnHomePressed:" + e.getMessage(), e));
            }
        } catch (Exception unused) {
            activity.onBackPressed();
        }
    }

    private boolean fixOrientation() {
        try {
            ((ActivityInfo) Reflect.m222383on("android.app.Activity").field0("mActivityInfo").get(this)).screenOrientation = -1;
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
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
            CrashHelper.m82479c(new RuntimeException("try fix SavedInstanceState", th));
        }
    }

    public static C22421c<C4450r> foreground() {
        return globalLifecycleSubject.map(new qcj() { // from class: l.z10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Act.foreground;
            }
        }).distinctUntilChanged((qcj<? super R, ? extends U>) new qcj() { // from class: l.b20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Act.m21383h1((Act.C4450r) obj);
            }
        });
    }

    public static C4450r foreground_() {
        return foreground;
    }

    public static C22421c<Boolean> front() {
        return frontBs.onBackpressureLatest().asObservable();
    }

    public static HashMap<Integer, ArrayList<C4450r>> globalLifeCycle_() {
        return acts;
    }

    public static C22421c<HashMap<Integer, ArrayList<C4450r>>> globalLifecycle() {
        return globalLifecycleSubject.map(new qcj() { // from class: l.g20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Act.acts;
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Activity m21383h1(C4450r c4450r) {
        if (c4450r == null) {
            return null;
        }
        return c4450r.f16062a.get();
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
            CrashHelper.m82479c(new Exception(getClass().getSimpleName() + " hideInput " + e.getMessage(), e));
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
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Reflect.m222383on("com.android.internal.R$styleable").field0("Window").get(null));
            zBooleanValue = ((Boolean) Reflect.m222383on("android.content.pm.ActivityInfo").call("isTranslucentOrFloating", typedArrayObtainStyledAttributes).get()).booleanValue();
            typedArrayObtainStyledAttributes.recycle();
            return zBooleanValue;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return zBooleanValue;
        }
    }

    private boolean isUnspecifiedState() {
        try {
            return (getPackageManager().getActivityInfo(getComponentName(), 128).softInputMode & 240) == 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static C22421c<Boolean> keyboardListenerObservable(final View view) {
        return C22421c.create(new C22421c.a() { // from class: l.l20
            @Override // p153l.y20
            public final void call(Object obj) {
                Act.m21372R0(view, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateStatusAndActionBar$27(int i, int i2, int i3, int i4, c30 c30Var, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        setStatusBarColor(ye5.m215395a(i, i2, animatedFraction));
        ColorDrawable colorDrawable = new ColorDrawable(ye5.m215395a(i3, i4, animatedFraction));
        if (c30Var != null) {
            c30Var.mo102194u(colorDrawable);
        }
        this.actionBarColor = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$21() {
        ArrayList arrayList = new ArrayList(hxd0.debugNames);
        Collections.sort(arrayList);
        dialog().m21534e0(arrayList).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.n10
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(com.p051p1.mobile.android.app.Dialog dialog, View view, int i, CharSequence charSequence) {
                new vxd0(charSequence.toString(), 0).clear();
            }
        }).m21567z0();
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
    public /* synthetic */ void lambda$initDataOnCreate$14(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.ACTIVE, true, getPopLifeName()));
            return;
        }
        if (c4470c == C4470c.f16273o || c4470c == C4470c.f16271m) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.DESTROY, true, getPopLifeName()));
            return;
        }
        C4470c c4470c2 = C4470c.f16269k;
        C22507a<vk80> c22507a = this.popLifeSub;
        if (c4470c == c4470c2) {
            c22507a.onNext(vk80.m201567a(PopLifecycleEvent.STOP, true, getPopLifeName()));
        } else if (c22507a.m222761e() == null) {
            this.popLifeSub.onNext(vk80.m201567a(PopLifecycleEvent.PENDING, true, getPopLifeName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$initPartTransitionPostCreate$32(AtomicBoolean atomicBoolean) {
        s20.AbstractC19953a abstractC19953a;
        if (!atomicBoolean.getAndSet(true)) {
            if (isFinishing() || (abstractC19953a = this.partTransition) == null) {
                return Boolean.FALSE;
            }
            View viewM184072c = abstractC19953a.m184072c(this.act);
            Drawable background = viewM184072c == null ? null : viewM184072c.getBackground();
            if (viewM184072c != null) {
                viewM184072c.setBackgroundDrawable(null);
            }
            Animator animatorM184075f = this.partTransition.m184075f(this.act);
            if (animatorM184075f != null) {
                animatorM184075f.addListener(new C4437e(viewM184072c, background));
                animatorM184075f.start();
                this.currentTransAnim = animatorM184075f;
            } else if (viewM184072c != null) {
                viewM184072c.setBackgroundDrawable(background);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$initTransitionPostCreate$33(AtomicBoolean atomicBoolean, Act act) {
        C4454v c4454v;
        if (!atomicBoolean.getAndSet(true)) {
            if (isFinishing() || (c4454v = this.trans) == null) {
                return Boolean.FALSE;
            }
            View viewMo21421a = c4454v.f16083b.mo21421a(this.act);
            Drawable background = viewMo21421a == null ? null : viewMo21421a.getBackground();
            if (viewMo21421a != null) {
                viewMo21421a.setBackgroundDrawable(null);
            }
            Animator animatorMo21408c = this.trans.f16083b.mo21408c(act, this.act);
            if (animatorMo21408c != null) {
                animatorMo21408c.addListener(new C4438f(act, viewMo21421a, background));
                animatorMo21408c.start();
                this.currentTransAnim = animatorMo21408c;
            } else if (viewMo21421a != null) {
                viewMo21421a.setBackgroundDrawable(background);
            }
        }
        return Boolean.TRUE;
    }

    private /* synthetic */ void lambda$new$4(C4470c c4470c) {
    }

    private static /* synthetic */ void lambda$new$5(C4450r c4450r) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$15(View view) {
        showDebugMenu();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$16(C4470c c4470c) {
        SwipeBackLayout swipeBackLayout;
        if (c4470c == C4470c.f16267i && SWIPE_BACK_SUPPORTED && (swipeBackLayout = this.swipeBack) != null) {
            swipeBackLayout.m21644s();
        }
        Bundle bundle = c4470c instanceof C4470c.a ? ((C4470c.a) c4470c).f16278p : null;
        tu2.m192704b("[common][lifecycle]", getClass(), c4470c.f16276c, bundle != null ? bundle.toString() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$pendChangeActionButtonTypeface$13() {
        Toolbar toolbar = toolbar();
        if (toolbar == null) {
            return Boolean.TRUE;
        }
        Iterator it = jyb.m147522n(bnl0.m105579s(toolbar), new qcj() { // from class: l.o10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(lyh0.m156283c(3));
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

    private static C4453u lmdCreate(String str, Sensor sensor) {
        if (sensor == null) {
            return null;
        }
        C4453u c4453u = new C4453u();
        c4453u.f16078a = sensor;
        C4440h c4440h = new C4440h(c4453u);
        c4453u.f16079b = c4440h;
        sensorManager.registerListener(c4440h, c4453u.f16078a, 3);
        return c4453u;
    }

    public static boolean lmdEnd() {
        try {
            SensorManager sensorManager2 = sensorManager;
            if (sensorManager2 != null) {
                sensorManager = null;
                for (C4453u c4453u : sensors) {
                    if (c4453u != null) {
                        sensorManager2.unregisterListener(c4453u.f16079b, c4453u.f16078a);
                    }
                }
                lmdResult = lmdResultMoved();
                sensors.clear();
                sensors = null;
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("Act lmdEnd:" + e.getMessage(), e));
        }
        return lmdResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lmdResultMoved() {
        ArrayList<C4453u> arrayList = sensors;
        if (arrayList != null) {
            for (C4453u c4453u : arrayList) {
                if (c4453u != null && c4453u.f16081d >= 10) {
                    float f = c4453u.f16080c[5][0];
                    int i = 0;
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (c4453u.f16080c[i2][0] != f) {
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

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m21387m1(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
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

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m21390p1() {
    }

    public static Dialog progress(Activity activity, String str, String str2) {
        View viewInflate;
        Window window;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            viewInflate = LayoutInflater.from(activity).inflate(gec0.f103787F, (ViewGroup) null);
        } else {
            viewInflate = LayoutInflater.from(activity).inflate(gec0.f103786E, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(vcc0.f183423j0);
            TextView textView2 = (TextView) viewInflate.findViewById(vcc0.f183361D);
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
        DialogInterfaceC0075a dialogInterfaceC0075aCreate = new DialogInterfaceC0075a.a(activity).setView(viewInflate).setCancelable(false).create();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && (window = dialogInterfaceC0075aCreate.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = dialogInterfaceC0075aCreate.getWindow().getAttributes();
            attributes.gravity = 17;
            attributes.width = qa00.m175859d(78.0f);
            attributes.height = qa00.m175859d(78.0f);
            dialogInterfaceC0075aCreate.getWindow().setAttributes(attributes);
        }
        dialogInterfaceC0075aCreate.setCanceledOnTouchOutside(false);
        return dialogInterfaceC0075aCreate;
    }

    private void reportPickMediaError(PickMediaError pickMediaError) {
        if (pickMediaError == PickMediaError.NOT_RESOLVABLE) {
            o1j0.m165635i(R$string.f15843h7, false);
        } else if (pickMediaError == PickMediaError.FILE_NOT_FOUND) {
            o1j0.m165635i(R$string.f15843h7, false);
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
        C4450r c4450r = null;
        for (ArrayList<C4450r> arrayList : acts.values()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4450r c4450r2 = arrayList.get(size);
                C4470c c4470c = c4450r2.f16063b;
                if (c4470c == C4470c.f16266h || c4470c == C4470c.f16267i) {
                    foregroundStatusUpdated = true;
                    foreground = c4450r2;
                    return;
                }
                if ((c4470c == C4470c.f16269k || c4470c == C4470c.f16268j) && c4450r2.f16064c > SystemClock.uptimeMillis() - 1000 && (c4450r == null || c4450r.f16064c <= c4450r2.f16064c)) {
                    c4450r = c4450r2;
                }
            }
        }
        foregroundStatusUpdated = true;
        foreground = c4450r;
    }

    public Act act() {
        return this;
    }

    public String actionItemPadding(String str) {
        return str.trim();
    }

    public AbstractC15610a<pf60<String, CharSequence>> adapterChangeLog(ArrayList<pf60<String, CharSequence>> arrayList) {
        return new C4439g(arrayList);
    }

    public void addSwipeBackListener(ujh0 ujh0Var) {
        SwipeBackLayout swipeBackLayout;
        if (!SWIPE_BACK_SUPPORTED || (swipeBackLayout = this.swipeBack) == null) {
            return;
        }
        swipeBackLayout.m21642q(ujh0Var);
    }

    @CallSuper
    public void afterDestroyLivecycle() {
    }

    public void alwaysHideInput() {
        hideInput(3);
    }

    public void animateStatusAndActionBar(final int i, final int i2) {
        final int iStatusBarColor = statusBarColor();
        final c30 supportActionBar = getSupportActionBar();
        final int i3 = this.actionBarColor;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.j20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f118003a.lambda$animateStatusAndActionBar$27(iStatusBarColor, i, i3, i2, supportActionBar, valueAnimator);
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
        m48999H2();
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
            CrashHelper.m82479c(new Exception("checkPickMediaError:" + e.getMessage(), e));
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

    @Override // p153l.ner
    public void creates(final y20<Bundle> y20Var, final x20 x20Var) {
        u11.m193889c();
        this.lifecycleSubject.subscribe(new y20() { // from class: l.h20
            @Override // p153l.y20
            public final void call(Object obj) {
                Act.m21371Q0(y20Var, x20Var, (C4470c) obj);
            }
        }, EMPTY_ON_ERROR, ACTION0_NOTHING);
    }

    public void cropImage(String str) {
        startActivityForResult(CropperAct.m22051F1(this, str), CROP_IMAGE);
    }

    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        arrayList.add(new pf60<>("finish the activity", new x20() { // from class: l.u10
            @Override // p153l.x20
            public final void call() {
                this.f176959a.lambda$debugItems$19();
            }
        }));
        arrayList.add(new pf60<>("clear SavedValue", new x20() { // from class: l.v10
            @Override // p153l.x20
            public final void call() {
                this.f181917a.lambda$debugItems$21();
            }
        }));
        return arrayList;
    }

    public View decorOrSwipingDecorView() {
        return SWIPE_BACK_SUPPORTED ? this.swipeBack.m21645t() : getWindow().getDecorView();
    }

    public Dialog.C4460e dialog() {
        return new Dialog.C4460e(this);
    }

    public void dimStatusBar(boolean z) {
        getWindow().getDecorView().setSystemUiVisibility(z ? 1 : 0);
    }

    public Drawable drawable(int i) {
        return tu0.m192702b(this, i);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return psd0.m173593D(pcjVar, lifecycle().compose(psd0.m173594E()), z);
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
        this.lifecycleSubject.onNext(C4470c.f16273o);
        C4454v c4454v = this.trans;
        if (c4454v != null) {
            if (this.finishingByAnimation) {
                return;
            }
            this.finishingByAnimation = true;
            if (this.currentTransAnim == null || c4454v.f16083b.mo21407b()) {
                finishStartWithAnim();
                return;
            } else {
                gt0.m132160f(this.currentTransAnim, new Runnable() { // from class: l.g10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f101703a.lambda$finish$29();
                    }
                });
                return;
            }
        }
        s20.AbstractC19953a abstractC19953a = this.partTransition;
        if (abstractC19953a == null) {
            actualFinish();
            return;
        }
        if (this.finishingByAnimation) {
            return;
        }
        this.finishingByAnimation = true;
        if (this.currentTransAnim == null || abstractC19953a.m184073d()) {
            finishPartStartWithAnim();
        } else {
            gt0.m132160f(this.currentTransAnim, new Runnable() { // from class: l.h10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107360a.lambda$finish$30();
                }
            });
        }
    }

    public void finishPartStartWithAnim() {
        View viewM184072c = this.partTransition.m184072c(this.act);
        if (viewM184072c != null) {
            viewM184072c.setBackgroundDrawable(null);
        }
        Animator animatorM184077h = this.partTransition.m184077h(this.act);
        if (animatorM184077h != null) {
            animatorM184077h.addListener(new C4435c());
            animatorM184077h.start();
        } else {
            this.partTransition = null;
            actualFinish();
        }
    }

    public void finishStartWithAnim() {
        Act act = this.trans.f16082a.get();
        if (act == null) {
            this.trans = null;
            actualFinish();
            return;
        }
        View viewMo21421a = this.trans.f16083b.mo21421a(this);
        if (viewMo21421a != null) {
            viewMo21421a.setBackgroundDrawable(null);
        }
        final View decorView = act.getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            decorView = ((ViewGroup) decorView).getChildAt(0);
        }
        if (decorView != null) {
            decorView.setVisibility(0);
            post(new Runnable() { // from class: l.r10
                @Override // java.lang.Runnable
                public final void run() {
                    decorView.setVisibility(0);
                }
            });
        }
        Animator animatorMo21409d = this.trans.f16083b.mo21409d(act, this);
        if (animatorMo21409d != null) {
            animatorMo21409d.addListener(new C4436d());
            animatorMo21409d.start();
        } else {
            this.trans = null;
            actualFinish();
        }
    }

    public void finishWithoutCustomAnimation() {
        this.lifecycleSubject.onNext(C4470c.f16273o);
        actualFinish();
    }

    public q1e flow() {
        return new q1e();
    }

    public FragmentManager fragmentManager() {
        return getSupportFragmentManager();
    }

    @NonNull
    public abstract ux0 getAppTheme();

    public TextView getCentralTitle(CharSequence charSequence) {
        VText vText = new VText(this);
        int i = qa00.f156323j;
        int i2 = qa00.f156318e;
        vText.setPadding(i, i2, i, i2);
        vText.setSingleLine();
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setTypeface(lyh0.m156283c(3));
        vText.setText(charSequence);
        vText.setTextColor(this.originalTitle.getTextColors());
        vText.setTextSize(0, this.originalTitle.getTextSize());
        return vText;
    }

    @Override // p153l.e3m
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
        srf.m187598a().m187600c(ExtraActLifecycle.onInitDataOnCreate, this);
        lifecycle().subscribe(new y20() { // from class: l.i10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112472a.lambda$initDataOnCreate$14((C4470c) obj);
            }
        });
    }

    public void initPartTransitionCreate() {
        String stringExtra = getIntent().getStringExtra("unique_transition_key");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.partTransition = s20.m184069b(stringExtra);
    }

    public void initPartTransitionPostCreate() {
        s20.AbstractC19953a abstractC19953a = this.partTransition;
        if (abstractC19953a != null) {
            abstractC19953a.m184084o(this.act);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bnl0.m105546b0(getWindow().getDecorView(), new pcj() { // from class: l.q10
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f155134a.lambda$initPartTransitionPostCreate$32(atomicBoolean);
                }
            });
        }
    }

    @CallSuper
    public void initSubscription() {
        srf.m187598a().m187600c(ExtraActLifecycle.onInitSubscription, this);
    }

    public void initTransitionCreate() {
        Act act;
        C4454v c4454vPoll = tempQueue.poll();
        if (c4454vPoll == null || !c4454vPoll.f16084c.equals(getClass().getName()) || (act = c4454vPoll.f16082a.get()) == null) {
            return;
        }
        this.trans = new C4454v(new WeakReference(act), c4454vPoll.f16083b, c4454vPoll.f16084c);
    }

    public void initTransitionPostCreate() {
        final Act act;
        C4454v c4454v = this.trans;
        if (c4454v == null || (act = c4454v.f16082a.get()) == null) {
            return;
        }
        this.trans.f16083b.mo21413h(act, this.act);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        bnl0.m105546b0(getWindow().getDecorView(), new pcj() { // from class: l.c20
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79445a.lambda$initTransitionPostCreate$33(atomicBoolean, act);
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
        Dialog.C4460e c4460e = ((Dialog) showingDialog).f16126l;
        if (c4460e == null) {
            return false;
        }
        return c4460e.f16160F;
    }

    public boolean isDialogShowing() {
        List<WeakReference<Dialog>> list = this.showingDialogList;
        return list != null && list.size() > 0 && this.showingDialogList.get(0).get() != null && this.showingDialogList.get(0).get().isShowing();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return super.isFinishing() || this.finishingByAnimation;
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return this.lifecycleSubject;
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return this.lifecycleSubject.m222761e();
    }

    public void lmdStart(int i) {
        try {
            if (sensorManager == null) {
                l51.m152888H(App.f16088e, new Runnable() { // from class: l.i20
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act.lmdEnd();
                    }
                }, i);
                lmdResult = false;
                sensorManager = (SensorManager) getSystemService("sensor");
                ArrayList<C4453u> arrayList = new ArrayList<>();
                sensors = arrayList;
                arrayList.add(lmdCreate("0", sensorManager.getDefaultSensor(1)));
                sensors.add(lmdCreate("1", sensorManager.getDefaultSensor(4)));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("Act lmdStart exception:" + e.getMessage(), e));
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
            File fileM120381O = ecj.m120381O("cache");
            tempFileName = fileM120381O.getAbsolutePath();
            Uri uriForFile = FileProvider.getUriForFile(this, "files." + getPackageName(), fileM120381O);
            if (!z && needAwardFilePermission()) {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setDataAndType(uriForFile, "video/*");
                    List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent2, 65536);
                    if (!jyb.m147479J(listQueryIntentActivities)) {
                        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
                        }
                    }
                } catch (ActivityNotFoundException e) {
                    CrashHelper.m82479c(e);
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
            CrashHelper.m82479c(e2);
            o1j0.m165634h(R$string.f15833g7);
        } catch (SecurityException e3) {
            CrashHelper.m82479c(e3);
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

    public jl80.C17971a newDialog() {
        return new jl80.C17971a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @TargetApi(16)
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityReslutManager.m21611b(i, i2, intent)) {
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
                CrashHelper.m82479c(e);
                return;
            }
        }
        PickMediaError pickMediaError = null;
        if (i == 4096 && intent.getClipData() != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                String strM133370g = h26.m133370g(intent.getClipData().getItemAt(i3).getUri());
                PickMediaError pickMediaErrorCheckPickMediaError = checkPickMediaError(strM133370g);
                if (pickMediaErrorCheckPickMediaError == null) {
                    arrayList.add(strM133370g);
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
            String strM133370g2 = h26.m133370g(intent.getData());
            PickMediaError pickMediaErrorCheckPickMediaError2 = checkPickMediaError(strM133370g2);
            if (pickMediaErrorCheckPickMediaError2 != null) {
                reportPickMediaError(pickMediaErrorCheckPickMediaError2);
                return;
            } else {
                arrayList2.add(strM133370g2);
                onPickImagesSystemResult(arrayList2);
                return;
            }
        }
        if (i == 12288) {
            String strM133370g3 = h26.m133370g(intent.getData());
            PickMediaError pickMediaErrorCheckPickMediaError3 = checkPickMediaError(strM133370g3);
            if (pickMediaErrorCheckPickMediaError3 == null) {
                onPickVideoSystemResult(strM133370g3);
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
            post(new Runnable() { // from class: l.w10
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
        bnl0.m105513G0(true);
        this.screenHeight = bnl0.m105590x0(this);
        int iM105594z0 = bnl0.m105594z0(this);
        this.screenWidth = iM105594z0;
        if (lo5.m155040d(iM105594z0)) {
            lo5.m155039c(this, 360);
            lo5.m155039c(App.f16088e, 360);
        } else {
            lo5.m155038b(this);
            lo5.m155038b(App.f16088e);
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
            CrashHelper.m82480d(new IllegalArgumentException("Act getParcelableExtra error ，act = " + this, e), 1000);
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
        vi3.m201324a(getIntent().getExtras(), getClass().getSimpleName().concat(",onCreate getIntent"));
        if (bundle != null) {
            vi3.m201324a(bundle, getClass().getSimpleName().concat(",onCreate sis"));
            Bundle bundle4 = bundle.getBundle(STAT_GLOBAL_STATE);
            if (bundle4 != null) {
                onRestoreGlobalState(bundle4);
            }
        }
        initDataOnCreate();
        initSubscription();
        setTheme();
        if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack = SwipeBackLayout.m21633w(this);
            TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.statusBarColor});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.swipeBack.m21635B(color);
            getWindow().setStatusBarColor(0);
        }
        super.onCreate(bundle);
        this.res = getResources();
        this.screenHeight = bnl0.m105590x0(this);
        int iM105594z0 = bnl0.m105594z0(this);
        this.screenWidth = iM105594z0;
        if (lo5.m155040d(iM105594z0)) {
            lo5.m155039c(this, 360);
            lo5.m155039c(App.f16088e, 360);
        } else {
            lo5.m155038b(this);
            lo5.m155038b(App.f16088e);
        }
        if (C4469b.f16257a) {
            getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalFocusChangeListener(new C4469b.a());
        }
        initTransitionCreate();
        initPartTransitionCreate();
        preCreateView(bundle);
        if (isFinishing()) {
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo102196w(true);
            getSupportActionBar().mo102168A(getSupportActionBar().mo102183j() / 2.0f);
            try {
                View view = (View) TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar());
                if (view != null) {
                    view.setFocusable(false);
                }
                TextView textView = (TextView) TOOLBAR_TITLE_VIEW_FILED.get(toolbar());
                if (textView != null) {
                    textView.setTypeface(lyh0.m156283c(3));
                }
                view.setMinimumWidth(qa00.m175859d(56.0f));
                if (debugShowMenu && getSupportActionBar() != null) {
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.j10
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            return this.f117910a.lambda$onCreate$15(view2);
                        }
                    });
                }
            } catch (IllegalAccessException e2) {
                CrashHelper.m82479c(e2);
            }
        }
        boolean z3 = App.f16085b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        View viewInflateView = inflateView(inflater(), null);
        monitorInflateViewCost(jCurrentTimeMillis);
        setWindowContentOverlayCompat();
        if (viewInflateView != null) {
            setContentView(viewInflateView);
        }
        lifecycle().subscribe(new y20() { // from class: l.k10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123437a.lambda$onCreate$16((C4470c) obj);
            }
        });
        this.lifecycleSubject.onNext(new C4470c.a(bundle));
        this.lifecycleSubject.onNext(C4470c.f16264f);
        if (viewInflateView != null) {
            viewInflateView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4442j());
            if (kkl0.m150133O(viewInflateView)) {
                possiblyResizeChildOfContent();
            }
        }
        int taskId = getTaskId();
        ArrayList<C4450r> arrayList = acts.get(Integer.valueOf(taskId));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            acts.put(Integer.valueOf(taskId), arrayList);
        }
        C4450r c4450r = new C4450r();
        c4450r.f16062a = new WeakReference<>(this);
        c4450r.f16063b = C4470c.f16264f;
        arrayList.add(c4450r);
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
        this.lifecycleSubject.onNext(C4470c.f16271m);
        this.lifecycleSubject.onCompleted();
        Iterator<ArrayList<C4450r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().f16062a.get() == this) {
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
                CrashHelper.m82479c(new Exception(getClass().getSimpleName() + " onDestroy: " + e.getMessage(), e));
            }
        }
        if (SWIPE_BACK_SUPPORTED && (swipeBackLayout = this.swipeBack) != null) {
            swipeBackLayout.m21648x();
        }
        onDestroyLifecycle();
        super.onDestroy();
        afterDestroyLivecycle();
    }

    @CallSuper
    public void onDestroyLifecycle() {
        if (isFromBackStack || l51.m152881A(App.f16088e)) {
            return;
        }
        isFromDestoryed = true;
        srf.m187598a().m187600c(ExtraActLifecycle.onDestroyToBackground, this);
    }

    @Override // p153l.r1e
    public void onDialogAttachToWindow(Dialog dialog) {
        if (this.showingDialogList == null) {
            this.showingDialogList = new ArrayList();
        }
        this.showingDialogList.add(new WeakReference<>(dialog));
    }

    @Override // p153l.r1e
    public void onDialogDetachFromWindow(final Dialog dialog) {
        WeakReference weakReference;
        List<WeakReference<Dialog>> list = this.showingDialogList;
        if (list == null || (weakReference = (WeakReference) jyb.m147529r(list, new qcj() { // from class: l.f10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((WeakReference) obj).get() == dialog);
            }
        })) == null) {
            return;
        }
        this.showingDialogList.remove(weakReference);
    }

    public void onDialogDismissExtra(final x20 x20Var) {
        if (isDialogShowing() && (this.showingDialogList.get(0).get() instanceof Dialog)) {
            ((Dialog) this.showingDialogList.get(0).get()).f101746i.filter(new qcj() { // from class: l.d20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Act.m21367L0((Boolean) obj);
                }
            }).take(1).subscribe(new y20() { // from class: l.e20
                @Override // p153l.y20
                public final void call(Object obj) {
                    x20Var.call();
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
        srf.m187598a().m187600c(ExtraActLifecycle.onNewIntent, this);
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
        this.lifecycleSubject.onNext(C4470c.f16268j);
        Iterator<ArrayList<C4450r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4450r c4450r : it.next()) {
                if (c4450r.f16062a.get() == this) {
                    c4450r.f16063b = C4470c.f16268j;
                    c4450r.f16064c = SystemClock.uptimeMillis();
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
            this.swipeBack.m21643r();
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
            CrashHelper.m82479c(e);
        }
        if (this.actionMenuView != null) {
            int iM175859d = qa00.m175859d(8.0f);
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
                    actionMenuView.setPadding(0, 0, iM175859d, 0);
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
            m48999H2();
            return;
        }
        C4454v c4454v = this.trans;
        if (c4454v != null && c4454v.f16082a.get() != null) {
            this.trans.f16083b.mo21411f(this.act);
        }
        s20.AbstractC19953a abstractC19953a = this.partTransition;
        if (abstractC19953a != null) {
            abstractC19953a.m184081l(this.act);
        }
        super.onResume();
        this.lifecycleSubject.onNext(C4470c.f16267i);
        Iterator<ArrayList<C4450r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4450r c4450r : it.next()) {
                if (c4450r.f16062a.get() == this) {
                    c4450r.f16063b = C4470c.f16267i;
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
            srf.m187598a().m187600c(ExtraActLifecycle.onResumeFromAppStart, this);
        } else if (isFromBackground) {
            srf.m187598a().m187600c(ExtraActLifecycle.onResumeFromBackground, this);
        }
        if (isInit || isFromBackStack || isFromDestoryed || isFromBackground) {
            srf.m187598a().m187600c(ExtraActLifecycle.onResumeFromAppStartOrBackground, this);
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
        vi3.m201324a(bundle, getClass().getSimpleName().concat(",onSaveInstanceState"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated
    public final void onStart() {
        boolean zShouldBlockOnStart = shouldBlockOnStart();
        this.hasBlockOnStart = zShouldBlockOnStart;
        if (zShouldBlockOnStart) {
            super.onStart();
            m48999H2();
            return;
        }
        super.onStart();
        this.lifecycleSubject.onNext(C4470c.f16266h);
        Iterator<ArrayList<C4450r>> it = acts.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (C4450r c4450r : it.next()) {
                if (c4450r.f16062a.get() == this) {
                    c4450r.f16063b = C4470c.f16266h;
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
        this.lifecycleSubject.onNext(C4470c.f16269k);
        Iterator<ArrayList<C4450r>> it = acts.values().iterator();
        while (it.hasNext()) {
            for (C4450r c4450r : it.next()) {
                if (c4450r.f16062a.get() == this) {
                    c4450r.f16063b = C4470c.f16269k;
                    c4450r.f16064c = SystemClock.uptimeMillis();
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
        if (isFromBackStack || l51.m152881A(App.f16088e)) {
            return;
        }
        isFromBackground = true;
        srf.m187598a().m187600c(ExtraActLifecycle.onStopToBackground, this);
    }

    public void onTakePictureResult(String str) {
    }

    public String pageId() {
        return getClass().getName();
    }

    public void pendChangeActionButtonTypeface() {
        bnl0.m105546b0(findViewById(R.id.content), new pcj() { // from class: l.s10
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f165749a.lambda$pendChangeActionButtonTypeface$13();
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
                CrashHelper.m82479c(e);
                pickImagesSystem(false);
                return;
            }
        }
        Intent intent2 = new Intent("android.intent.action.PICK");
        intent2.setType("image/*");
        try {
            startActivityForResult(intent2, 8192);
        } catch (ActivityNotFoundException e2) {
            CrashHelper.m82479c(e2);
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.setType("image/*");
            try {
                startActivityForResult(intent3, 8192);
            } catch (ActivityNotFoundException e3) {
                CrashHelper.m82479c(e3);
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
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.e3m
    public C22507a<vk80> popLifeObs() {
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
            kkl0.m150194y0(decorView, new il50() { // from class: l.t10
                @Override // p153l.il50
                public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                    return Act.m21366K0(zArr, iArr, z, layoutParams, frameLayout, childAt, view, dgq0Var);
                }
            });
            kkl0.m150158g0(decorView);
        }
    }

    public void post(Runnable runnable) {
        l51.m152887G(runnable);
    }

    public void postDelayed(Runnable runnable, long j) {
        l51.m152888H(this, runnable, j);
    }

    public void preCreateView(Bundle bundle) {
    }

    public void progressDismiss() {
        Dialog dialog = this.progressDialog;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception(getClass().getSimpleName() + " progressDismiss: " + e.getMessage(), e));
            }
            this.progressDialog = null;
        }
    }

    public void realFinishAfterFinishingAnimation() {
        C4454v c4454v = this.trans;
        AbstractC4455w abstractC4455w = c4454v == null ? null : c4454v.f16083b;
        this.trans = null;
        actualFinish();
        if (abstractC4455w != null) {
            abstractC4455w.mo21412g(this);
        }
    }

    @Deprecated
    public void recordVideo() {
        mediaCapture(false);
    }

    public void registerOnActivityResultListener(C4468a.a aVar) {
        this.activityReslutManager.m21612c(aVar);
    }

    public void removeCallbacks(Runnable runnable) {
        l51.m152890J(runnable);
    }

    public void removeKeyboardListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public void setActionBarColor(int i) {
        this.actionBarColor = i;
        c30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo102194u(new ColorDrawable(i));
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
            this.swipeBack.m21650z();
        }
    }

    @Deprecated
    public ViewTreeObserver.OnGlobalLayoutListener setKeyboardListener(View view, y20<Boolean> y20Var) {
        ViewTreeObserverOnGlobalLayoutListenerC4449q viewTreeObserverOnGlobalLayoutListenerC4449q = new ViewTreeObserverOnGlobalLayoutListenerC4449q(view, new WeakReference(y20Var));
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4449q);
        return viewTreeObserverOnGlobalLayoutListenerC4449q;
    }

    public void setNavigationBarColor(int i) {
        if (Build.VERSION.SDK_INT <= 34) {
            this.act.getWindow().setNavigationBarColor(i);
        } else if (SWIPE_BACK_SUPPORTED) {
            this.swipeBack.m21634A(i);
        }
    }

    public void setPaddingToNavigationBar(int i) {
        if (Build.VERSION.SDK_INT <= 34 || !SWIPE_BACK_SUPPORTED) {
            return;
        }
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById.getTag(vcc0.f183414f) == null || !viewFindViewById.getTag(vcc0.f183414f).equals(Integer.valueOf(i))) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i);
            viewFindViewById.setTag(vcc0.f183414f, Integer.valueOf(i));
            this.swipeBack.m21637D(true);
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
            this.swipeBack.m21635B(i);
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
            Toolbar.C0160e c0160e = new Toolbar.C0160e(-2, -2);
            c0160e.f79555a = 17;
            toolbar().addView(this.centralTitle, c0160e);
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
            CrashHelper.m82479c(e);
            setTitle(str);
        } catch (IllegalArgumentException e2) {
            CrashHelper.m82479c(e2);
            setTitle(str);
        }
    }

    public View setTopViewLayout(View view) {
        return setUpKeyboardDetectorLayout(view, new LinearLayout(this), (b30<Boolean, Integer, Boolean, Integer>) null);
    }

    public View setUpKeyboardDetectorLayout(View view, View view2, b30<Boolean, Integer, Boolean, Integer> b30Var) {
        this.isSetUpKeyboardDetectorLayout = true;
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        view.setPadding(0, ((getSupportActionBar() == null || getWindow().hasFeature(9)) ? 0 : qa00.m175859d(56.0f)) + bnl0.m105511F0(), 0, 0);
        viewGroup.addView(view, 0);
        if (Build.VERSION.SDK_INT <= 34) {
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4448p(new C4452t(view, view2, b30Var, viewGroup)));
            return view2;
        }
        kkl0.m150194y0(viewGroup, new C4447o(view, b30Var));
        kkl0.m150158g0(viewGroup);
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

    public void showDebugMenu(ArrayList<pf60<String, x20>> arrayList) {
        ArrayList arrayListM147486Q = jyb.m147486Q(arrayList, new qcj() { // from class: l.l10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Act.m21373S0((pf60) obj);
            }
        });
        s9c.m185173c(arrayListM147486Q);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, qa00.m175859d(5.0f), 0, 0);
        AppCompatEditText appCompatEditText = new AppCompatEditText(this);
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setHint(R.string.search_go);
        appCompatEditText.setTextSize(16.0f);
        appCompatEditText.setGravity(19);
        int iM175859d = qa00.m175859d(24.0f);
        appCompatEditText.setPadding(iM175859d, qa00.m175859d(16.0f), iM175859d, qa00.m175859d(16.0f));
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(3);
        C4443k c4443k = new C4443k(this, gec0.f103783B);
        c4443k.addAll(arrayListM147486Q);
        appCompatEditText.addTextChangedListener(new C4444l(c4443k, arrayListM147486Q));
        appCompatEditText.setOnClickListener(new View.OnClickListener() { // from class: l.m10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138520r("e_debug_tool_search", "p_debug_tool_dialog_view");
            }
        });
        linearLayout.addView(appCompatEditText, new LinearLayout.LayoutParams(-1, -2));
        VList vList = new VList(this);
        vList.setDivider(null);
        vList.setAdapter((ListAdapter) c4443k);
        linearLayout.addView(vList, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Dialog dialogM21566z = dialog().m21519P(linearLayout, false).m21566z();
        dialogM21566z.getWindow().setSoftInputMode(16);
        dialogM21566z.show();
        vList.setOnItemClickListener(new C4445m(c4443k, arrayList, dialogM21566z));
        l4g0 l4g0Var = new l4g0("p_debug_tool_dialog_view", Dialog.class.getName());
        l4g0Var.m152774i();
        l4g0Var.m152777l();
        dialogM21566z.setOnDismissListener(new DialogInterfaceOnDismissListenerC4446n(l4g0Var));
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.requestFocus();
    }

    public boolean showInput(View view, int i) {
        return imm().showSoftInput(view, i);
    }

    public void startActivityForResult(int i, Intent intent, C4468a.a aVar) {
        if (!this.activityReslutManager.m21610a(aVar)) {
            this.activityReslutManager.m21612c(new C4434b(i, aVar));
        }
        startActivityForResult(intent, i);
    }

    public void startActivityForResultFromFragmentWithCustomTransition(Frag frag, Intent intent, int i, AbstractC4455w abstractC4455w) {
        if (abstractC4455w != null) {
            tempQueue.add(new C4454v(new WeakReference(this), abstractC4455w, intent.getComponent().getClassName()));
        }
        startActivityFromFragment(frag, intent, i);
    }

    public void startActivityForResultWithCustomTransition(Intent intent, int i, AbstractC4455w abstractC4455w) {
        if (abstractC4455w != null) {
            tempQueue.add(new C4454v(new WeakReference(this), abstractC4455w, intent.getComponent().getClassName()));
        }
        startActivityForResult(intent, i);
    }

    public void startActivityFromFragmentWithCustomTransition(Frag frag, Intent intent, AbstractC4455w abstractC4455w) {
        startActivityForResultFromFragmentWithCustomTransition(frag, intent, -1, abstractC4455w);
    }

    public void startActivityWithCustomTransition(Intent intent, AbstractC4455w abstractC4455w) {
        startActivityForResultWithCustomTransition(intent, -1, abstractC4455w);
    }

    public int statusBarColor() {
        return SWIPE_BACK_SUPPORTED ? this.swipeBack.m21636C() : RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    public String string(int i) {
        return getString(i);
    }

    @Deprecated
    public void takePicture() {
        mediaCapture(true);
    }

    public Toolbar toolbar() {
        return (Toolbar) findViewById(vcc0.f183404a);
    }

    public void unregisterOnActivityResultListener(C4468a.a aVar) {
        this.activityReslutManager.m21613d(aVar);
    }

    public <T> C22421c<T> duringCreated(final C22421c<T> c22421c, boolean z) {
        return duringCreated(new pcj() { // from class: l.a20
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Act.m21365J0(c22421c);
            }
        }, z);
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        creates(y20Var, ACTION0_NOTHING);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return duringCreated((pcj) pcjVar, true);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(final C22421c<T> c22421c) {
        return duringCreated((pcj) new pcj() { // from class: l.k20
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Act.m21375U0(c22421c);
            }
        }, true);
    }

    public void startActivityForResult(Intent intent, C4468a.a aVar) {
        startActivityForResult(1001, intent, aVar);
    }

    public void startActivityForResultWithCustomTransition(Intent intent, int i, AbstractC4455w abstractC4455w, C4468a.a aVar) {
        if (abstractC4455w != null) {
            tempQueue.add(new C4454v(new WeakReference(this), abstractC4455w, intent.getComponent().getClassName()));
        }
        startActivityForResult(i, intent, aVar);
    }

    private void debugColorAllViews() {
        debugColorAllViews(findViewById(R.id.content), 0);
    }

    public View setUpKeyboardDetectorLayout(View view, View view2, final z20<Boolean, Integer> z20Var) {
        return setUpKeyboardDetectorLayout(view, view2, new b30() { // from class: l.x10
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                z20Var.call((Boolean) obj, (Integer) obj2);
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
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.f20
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f96842a.lambda$progress$28(dialogProgress, z2, f, attributes, valueAnimator);
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
                bnl0.m105550d0(this.originalTitle, Math.max(0, (((int) ((bnl0.m105592y0() - qa00.m175859d(114.0f)) - textView4.getPaint().measureText(charSequence.toString()))) / 2) - qa00.m175859d(12.0f)));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
            } catch (IllegalArgumentException e2) {
                CrashHelper.m82479c(e2);
            }
            toolbar().setTitle(charSequence);
        }
    }

    @Deprecated
    public void mediaCapture(boolean z) {
        mediaCapture(z, false);
    }

    public static C22421c<Boolean> mediaCapture() {
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
