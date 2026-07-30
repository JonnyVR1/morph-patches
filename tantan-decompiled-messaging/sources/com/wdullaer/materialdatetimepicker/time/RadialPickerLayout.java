package com.wdullaer.materialdatetimepicker.time;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.momo.momortc.MMConstants;
import java.util.Calendar;
import java.util.Locale;
import p149l.e16;
import p149l.k1c0;

/* JADX INFO: loaded from: classes2.dex */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: A */
    private AccessibilityManager f61359A;

    /* JADX INFO: renamed from: B */
    private AnimatorSet f61360B;

    /* JADX INFO: renamed from: C */
    private Handler f61361C;

    /* JADX INFO: renamed from: a */
    private final int f61362a;

    /* JADX INFO: renamed from: b */
    private final int f61363b;

    /* JADX INFO: renamed from: c */
    private Timepoint f61364c;

    /* JADX INFO: renamed from: d */
    private InterfaceC14690a f61365d;

    /* JADX INFO: renamed from: e */
    private InterfaceC14675f f61366e;

    /* JADX INFO: renamed from: f */
    private boolean f61367f;

    /* JADX INFO: renamed from: g */
    private Timepoint f61368g;

    /* JADX INFO: renamed from: h */
    private boolean f61369h;

    /* JADX INFO: renamed from: i */
    private int f61370i;

    /* JADX INFO: renamed from: j */
    private CircleView f61371j;

    /* JADX INFO: renamed from: k */
    private AmPmCirclesView f61372k;

    /* JADX INFO: renamed from: l */
    private RadialTextsView f61373l;

    /* JADX INFO: renamed from: m */
    private RadialTextsView f61374m;

    /* JADX INFO: renamed from: n */
    private RadialTextsView f61375n;

    /* JADX INFO: renamed from: o */
    private RadialSelectorView f61376o;

    /* JADX INFO: renamed from: p */
    private RadialSelectorView f61377p;

    /* JADX INFO: renamed from: q */
    private RadialSelectorView f61378q;

    /* JADX INFO: renamed from: r */
    private View f61379r;

    /* JADX INFO: renamed from: s */
    private int[] f61380s;

    /* JADX INFO: renamed from: t */
    private boolean f61381t;

    /* JADX INFO: renamed from: u */
    private int f61382u;

    /* JADX INFO: renamed from: v */
    private boolean f61383v;

    /* JADX INFO: renamed from: w */
    private boolean f61384w;

    /* JADX INFO: renamed from: x */
    private int f61385x;

    /* JADX INFO: renamed from: y */
    private float f61386y;

    /* JADX INFO: renamed from: z */
    private float f61387z;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$a */
    public class C14670a implements RadialTextsView.InterfaceC14680c {
        public C14670a() {
        }

        @Override // com.wdullaer.materialdatetimepicker.time.RadialTextsView.InterfaceC14680c
        /* JADX INFO: renamed from: a */
        public boolean mo85187a(int i) {
            return !RadialPickerLayout.this.f61365d.mo85228h(new Timepoint(RadialPickerLayout.this.f61368g.m85237b(), RadialPickerLayout.this.f61368g.m85238f(), i), 2);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$b */
    public class C14671b implements RadialTextsView.InterfaceC14680c {
        public C14671b() {
        }

        @Override // com.wdullaer.materialdatetimepicker.time.RadialTextsView.InterfaceC14680c
        /* JADX INFO: renamed from: a */
        public boolean mo85187a(int i) {
            return !RadialPickerLayout.this.f61365d.mo85228h(new Timepoint(RadialPickerLayout.this.f61368g.m85237b(), i, RadialPickerLayout.this.f61368g.m85239g()), 1);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$c */
    public class C14672c implements RadialTextsView.InterfaceC14680c {
        public C14672c() {
        }

        @Override // com.wdullaer.materialdatetimepicker.time.RadialTextsView.InterfaceC14680c
        /* JADX INFO: renamed from: a */
        public boolean mo85187a(int i) {
            Timepoint timepoint = new Timepoint(i, RadialPickerLayout.this.f61368g.m85238f(), RadialPickerLayout.this.f61368g.m85239g());
            if (!RadialPickerLayout.this.f61369h && RadialPickerLayout.this.getIsCurrentlyAmOrPm() == 1) {
                timepoint.m85243n();
            }
            if (!RadialPickerLayout.this.f61369h && RadialPickerLayout.this.getIsCurrentlyAmOrPm() == 0) {
                timepoint.m85242m();
            }
            return !RadialPickerLayout.this.f61365d.mo85228h(timepoint, 0);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$d */
    public class RunnableC14673d implements Runnable {
        public RunnableC14673d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialPickerLayout.this.f61372k.setAmOrPmPressed(RadialPickerLayout.this.f61382u);
            RadialPickerLayout.this.f61372k.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$e */
    public class RunnableC14674e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Boolean[] f61392a;

        public RunnableC14674e(Boolean[] boolArr) {
            this.f61392a = boolArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialPickerLayout.this.f61383v = true;
            RadialPickerLayout radialPickerLayout = RadialPickerLayout.this;
            radialPickerLayout.f61364c = radialPickerLayout.m85176o(radialPickerLayout.f61385x, this.f61392a[0].booleanValue(), false);
            RadialPickerLayout radialPickerLayout2 = RadialPickerLayout.this;
            radialPickerLayout2.f61364c = radialPickerLayout2.m85180t(radialPickerLayout2.f61364c, RadialPickerLayout.this.getCurrentItemShowing());
            RadialPickerLayout radialPickerLayout3 = RadialPickerLayout.this;
            radialPickerLayout3.m85179s(radialPickerLayout3.f61364c, true, RadialPickerLayout.this.getCurrentItemShowing());
            RadialPickerLayout.this.f61366e.mo85188c(RadialPickerLayout.this.f61364c);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$f */
    public interface InterfaceC14675f {
        /* JADX INFO: renamed from: c */
        void mo85188c(Timepoint timepoint);

        /* JADX INFO: renamed from: d */
        void mo85189d();

        /* JADX INFO: renamed from: e */
        void mo85190e(int i);
    }

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61382u = -1;
        this.f61361C = new Handler();
        setOnTouchListener(this);
        this.f61362a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f61363b = ViewConfiguration.getTapTimeout();
        this.f61383v = false;
        CircleView circleView = new CircleView(context);
        this.f61371j = circleView;
        addView(circleView);
        AmPmCirclesView amPmCirclesView = new AmPmCirclesView(context);
        this.f61372k = amPmCirclesView;
        addView(amPmCirclesView);
        RadialSelectorView radialSelectorView = new RadialSelectorView(context);
        this.f61376o = radialSelectorView;
        addView(radialSelectorView);
        RadialSelectorView radialSelectorView2 = new RadialSelectorView(context);
        this.f61377p = radialSelectorView2;
        addView(radialSelectorView2);
        RadialSelectorView radialSelectorView3 = new RadialSelectorView(context);
        this.f61378q = radialSelectorView3;
        addView(radialSelectorView3);
        RadialTextsView radialTextsView = new RadialTextsView(context);
        this.f61373l = radialTextsView;
        addView(radialTextsView);
        RadialTextsView radialTextsView2 = new RadialTextsView(context);
        this.f61374m = radialTextsView2;
        addView(radialTextsView2);
        RadialTextsView radialTextsView3 = new RadialTextsView(context);
        this.f61375n = radialTextsView3;
        addView(radialTextsView3);
        m85178r();
        this.f61364c = null;
        this.f61381t = true;
        View view = new View(context);
        this.f61379r = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f61379r.setBackgroundColor(e16.m114375c(context, k1c0.f120577t));
        this.f61379r.setVisibility(4);
        addView(this.f61379r);
        this.f61359A = (AccessibilityManager) context.getSystemService("accessibility");
        this.f61367f = false;
    }

    private int getCurrentlyShowingValue() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f61368g.m85237b();
        }
        if (currentItemShowing == 1) {
            return this.f61368g.m85238f();
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.f61368g.m85239g();
    }

    /* JADX INFO: renamed from: n */
    private int m85175n(float f, float f2, boolean z, Boolean[] boolArr) {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f61376o.m85191a(f, f2, z, boolArr);
        }
        if (currentItemShowing == 1) {
            return this.f61377p.m85191a(f, f2, z, boolArr);
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.f61378q.m85191a(f, f2, z, boolArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX INFO: renamed from: o */
    public Timepoint m85176o(int i, boolean z, boolean z2) {
        if (i == -1) {
            return null;
        }
        int currentItemShowing = getCurrentItemShowing();
        int iM85182w = (z2 || !(currentItemShowing == 1 || currentItemShowing == 2)) ? m85182w(i, 0) : m85183x(i);
        int i2 = currentItemShowing != 0 ? 6 : 30;
        if (currentItemShowing == 0) {
            if (this.f61369h) {
                if (iM85182w == 0 && z) {
                    iM85182w = 360;
                } else if (iM85182w == 360 && !z) {
                    iM85182w = 0;
                }
            } else if (iM85182w == 0) {
                iM85182w = 360;
            }
        } else if (iM85182w == 360 && (currentItemShowing == 1 || currentItemShowing == 2)) {
            iM85182w = 0;
        }
        int i3 = iM85182w / i2;
        if (currentItemShowing == 0 && this.f61369h && !z && iM85182w != 0) {
            i3 += 12;
        }
        if (currentItemShowing != 0) {
            if (currentItemShowing != 1) {
                return currentItemShowing != 2 ? this.f61368g : new Timepoint(this.f61368g.m85237b(), this.f61368g.m85238f(), i3);
            }
            return new Timepoint(this.f61368g.m85237b(), i3, this.f61368g.m85239g());
        }
        if (!this.f61369h && getIsCurrentlyAmOrPm() == 1 && iM85182w != 360) {
            i3 += 12;
        }
        return new Timepoint((!this.f61369h && getIsCurrentlyAmOrPm() == 0 && iM85182w == 360) ? 0 : i3, this.f61368g.m85238f(), this.f61368g.m85239g());
    }

    /* JADX INFO: renamed from: q */
    private boolean m85177q(int i) {
        return this.f61369h && i <= 12 && i != 0;
    }

    /* JADX INFO: renamed from: r */
    private void m85178r() {
        this.f61380s = new int[361];
        int i = 1;
        int i2 = 8;
        int i3 = 0;
        for (int i4 = 0; i4 < 361; i4++) {
            this.f61380s[i4] = i3;
            if (i == i2) {
                i3 += 6;
                i2 = i3 == 360 ? 7 : i3 % 30 == 0 ? 14 : 4;
                i = 1;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m85179s(Timepoint timepoint, boolean z, int i) {
        if (i == 0) {
            int iM85237b = timepoint.m85237b();
            boolean zM85177q = m85177q(iM85237b);
            int i2 = iM85237b % 12;
            int i3 = (i2 * 360) / 12;
            boolean z2 = this.f61369h;
            if (!z2) {
                iM85237b = i2;
            }
            if (!z2 && iM85237b == 0) {
                iM85237b += 12;
            }
            this.f61376o.m85193c(i3, zM85177q, z);
            this.f61373l.setSelection(iM85237b);
            if (timepoint.m85238f() != this.f61368g.m85238f()) {
                this.f61377p.m85193c((timepoint.m85238f() * 360) / 60, zM85177q, z);
                this.f61374m.setSelection(timepoint.m85238f());
            }
            if (timepoint.m85239g() != this.f61368g.m85239g()) {
                this.f61378q.m85193c((timepoint.m85239g() * 360) / 60, zM85177q, z);
                this.f61375n.setSelection(timepoint.m85239g());
            }
        } else if (i == 1) {
            this.f61377p.m85193c((timepoint.m85238f() * 360) / 60, false, z);
            this.f61374m.setSelection(timepoint.m85238f());
            if (timepoint.m85239g() != this.f61368g.m85239g()) {
                this.f61378q.m85193c((timepoint.m85239g() * 360) / 60, false, z);
                this.f61375n.setSelection(timepoint.m85239g());
            }
        } else if (i == 2) {
            this.f61378q.m85193c((timepoint.m85239g() * 360) / 60, false, z);
            this.f61375n.setSelection(timepoint.m85239g());
        }
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            this.f61376o.invalidate();
            this.f61373l.invalidate();
        } else if (currentItemShowing == 1) {
            this.f61377p.invalidate();
            this.f61374m.invalidate();
        } else {
            if (currentItemShowing != 2) {
                return;
            }
            this.f61378q.invalidate();
            this.f61375n.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public Timepoint m85180t(Timepoint timepoint, int i) {
        if (i == 0) {
            return this.f61365d.mo85225b(timepoint, Timepoint.TYPE.HOUR);
        }
        if (i != 1) {
            return i != 2 ? this.f61368g : this.f61365d.mo85225b(timepoint, Timepoint.TYPE.SECOND);
        }
        return this.f61365d.mo85225b(timepoint, Timepoint.TYPE.MINUTE);
    }

    /* JADX INFO: renamed from: v */
    private void m85181v(int i, Timepoint timepoint) {
        Timepoint timepointM85180t = m85180t(timepoint, i);
        this.f61368g = timepointM85180t;
        m85179s(timepointM85180t, false, i);
    }

    /* JADX INFO: renamed from: w */
    private static int m85182w(int i, int i2) {
        int i3 = (i / 30) * 30;
        int i4 = i3 + 30;
        if (i2 != 1) {
            if (i2 == -1) {
                if (i == i3) {
                    return i3 - 30;
                }
            } else if (i - i3 < i4 - i) {
            }
            return i3;
        }
        return i4;
    }

    /* JADX INFO: renamed from: x */
    private int m85183x(int i) {
        int[] iArr = this.f61380s;
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Calendar calendar = Calendar.getInstance();
        calendar.set(10, getHours());
        calendar.set(12, getMinutes());
        calendar.set(13, getSeconds());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), calendar.getTimeInMillis(), this.f61369h ? MMConstants.ERR_WATERMARK_READ : 1));
        return true;
    }

    public int getCurrentItemShowing() {
        int i = this.f61370i;
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        Log.e("RadialPickerLayout", "Current item showing was unfortunately set to " + this.f61370i);
        return -1;
    }

    public int getHours() {
        return this.f61368g.m85237b();
    }

    public int getIsCurrentlyAmOrPm() {
        if (this.f61368g.m85240h()) {
            return 0;
        }
        return this.f61368g.m85241i() ? 1 : -1;
    }

    public int getMinutes() {
        return this.f61368g.m85238f();
    }

    public int getSeconds() {
        return this.f61368g.m85239g();
    }

    public Timepoint getTime() {
        return this.f61368g;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int iM85175n;
        int i;
        Timepoint timepoint;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Boolean[] boolArr = {Boolean.FALSE};
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.f61381t) {
                return true;
            }
            this.f61386y = x;
            this.f61387z = y;
            this.f61364c = null;
            this.f61383v = false;
            this.f61384w = true;
            if (this.f61369h || this.f61365d.getVersion() != TimePickerDialog.Version.VERSION_1) {
                this.f61382u = -1;
            } else {
                this.f61382u = this.f61372k.m85159a(x, y);
            }
            int i2 = this.f61382u;
            if (i2 == 0 || i2 == 1) {
                this.f61365d.mo85230w();
                this.f61385x = -1;
                this.f61361C.postDelayed(new RunnableC14673d(), this.f61363b);
            } else {
                int iM85175n2 = m85175n(x, y, this.f61359A.isTouchExplorationEnabled(), boolArr);
                this.f61385x = iM85175n2;
                if (this.f61365d.mo85228h(m85176o(iM85175n2, boolArr[0].booleanValue(), false), getCurrentItemShowing())) {
                    this.f61385x = -1;
                }
                if (this.f61385x != -1) {
                    this.f61365d.mo85230w();
                    this.f61361C.postDelayed(new RunnableC14674e(boolArr), this.f61363b);
                }
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.f61381t) {
                    Log.e("RadialPickerLayout", "Input was disabled, but received ACTION_MOVE.");
                    return true;
                }
                float fAbs = Math.abs(y - this.f61387z);
                float fAbs2 = Math.abs(x - this.f61386y);
                if (this.f61383v) {
                    i = this.f61382u;
                    if (i != 0) {
                        this.f61361C.removeCallbacksAndMessages(null);
                        if (this.f61372k.m85159a(x, y) != this.f61382u) {
                            this.f61372k.setAmOrPmPressed(-1);
                            this.f61372k.invalidate();
                            this.f61382u = -1;
                        }
                    } else {
                        this.f61361C.removeCallbacksAndMessages(null);
                        if (this.f61372k.m85159a(x, y) != this.f61382u) {
                            this.f61372k.setAmOrPmPressed(-1);
                            this.f61372k.invalidate();
                            this.f61382u = -1;
                        }
                    }
                } else {
                    int i3 = this.f61362a;
                    if (fAbs2 > i3 || fAbs > i3) {
                        i = this.f61382u;
                        if (i != 0 || i == 1) {
                            this.f61361C.removeCallbacksAndMessages(null);
                            if (this.f61372k.m85159a(x, y) != this.f61382u) {
                                this.f61372k.setAmOrPmPressed(-1);
                                this.f61372k.invalidate();
                                this.f61382u = -1;
                            }
                        } else if (this.f61385x != -1) {
                            this.f61383v = true;
                            this.f61361C.removeCallbacksAndMessages(null);
                            int iM85175n3 = m85175n(x, y, true, boolArr);
                            if (iM85175n3 != -1) {
                                Timepoint timepointM85180t = m85180t(m85176o(iM85175n3, boolArr[0].booleanValue(), false), getCurrentItemShowing());
                                m85179s(timepointM85180t, true, getCurrentItemShowing());
                                if (timepointM85180t != null && ((timepoint = this.f61364c) == null || !timepoint.equals(timepointM85180t))) {
                                    this.f61365d.mo85230w();
                                    this.f61364c = timepointM85180t;
                                    this.f61366e.mo85188c(timepointM85180t);
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        } else {
            if (!this.f61381t) {
                this.f61366e.mo85189d();
                return true;
            }
            this.f61361C.removeCallbacksAndMessages(null);
            this.f61384w = false;
            int i4 = this.f61382u;
            if (i4 != 0 && i4 != 1) {
                if (this.f61385x != -1 && (iM85175n = m85175n(x, y, this.f61383v, boolArr)) != -1) {
                    Timepoint timepointM85180t2 = m85180t(m85176o(iM85175n, boolArr[0].booleanValue(), !this.f61383v), getCurrentItemShowing());
                    m85179s(timepointM85180t2, false, getCurrentItemShowing());
                    this.f61368g = timepointM85180t2;
                    this.f61366e.mo85188c(timepointM85180t2);
                    this.f61366e.mo85190e(getCurrentItemShowing());
                }
                this.f61383v = false;
                return true;
            }
            int iM85159a = this.f61372k.m85159a(x, y);
            this.f61372k.setAmOrPmPressed(-1);
            this.f61372k.invalidate();
            if (iM85159a == this.f61382u) {
                this.f61372k.setAmOrPm(iM85159a);
                if (getIsCurrentlyAmOrPm() != iM85159a) {
                    Timepoint timepoint2 = new Timepoint(this.f61368g);
                    int i5 = this.f61382u;
                    if (i5 == 0) {
                        timepoint2.m85242m();
                    } else if (i5 == 1) {
                        timepoint2.m85243n();
                    }
                    Timepoint timepointM85180t3 = m85180t(timepoint2, 0);
                    m85179s(timepointM85180t3, false, 0);
                    this.f61368g = timepointM85180t3;
                    this.f61366e.mo85188c(timepointM85180t3);
                }
            }
            this.f61382u = -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m85184p(Context context, InterfaceC14690a interfaceC14690a, Timepoint timepoint, boolean z) {
        int[] iArr;
        String str;
        if (this.f61367f) {
            Log.e("RadialPickerLayout", "Time has already been initialized.");
            return;
        }
        this.f61365d = interfaceC14690a;
        this.f61369h = this.f61359A.isTouchExplorationEnabled() || z;
        this.f61371j.m85161a(context, this.f61365d);
        this.f61371j.invalidate();
        if (!this.f61369h && this.f61365d.getVersion() == TimePickerDialog.Version.VERSION_1) {
            this.f61372k.m85160b(context, this.f61365d, !timepoint.m85240h() ? 1 : 0);
            this.f61372k.invalidate();
        }
        C14670a c14670a = new C14670a();
        C14671b c14671b = new C14671b();
        C14672c c14672c = new C14672c();
        int i = 12;
        int[] iArr2 = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] iArr3 = {0, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        int[] iArr4 = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        int[] iArr5 = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        int i2 = 0;
        String[] strArr = new String[12];
        String[] strArr2 = new String[12];
        String[] strArr3 = new String[12];
        String[] strArr4 = new String[12];
        while (i2 < i) {
            int i3 = i;
            if (z) {
                iArr = iArr3;
                str = String.format(Locale.getDefault(), "%02d", Integer.valueOf(iArr[i2]));
            } else {
                iArr = iArr3;
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(iArr2[i2]));
            }
            strArr[i2] = str;
            strArr2[i2] = String.format(Locale.getDefault(), "%d", Integer.valueOf(iArr2[i2]));
            strArr3[i2] = String.format(Locale.getDefault(), "%02d", Integer.valueOf(iArr4[i2]));
            strArr4[i2] = String.format(Locale.getDefault(), "%02d", Integer.valueOf(iArr5[i2]));
            i2++;
            i = i3;
            iArr3 = iArr;
        }
        RadialTextsView radialTextsView = this.f61373l;
        if (!z) {
            strArr2 = null;
        }
        radialTextsView.m85198d(context, strArr, strArr2, this.f61365d, c14672c, true);
        RadialTextsView radialTextsView2 = this.f61373l;
        int iM85237b = timepoint.m85237b();
        if (!z) {
            iM85237b = iArr2[iM85237b % 12];
        }
        radialTextsView2.setSelection(iM85237b);
        this.f61373l.invalidate();
        this.f61374m.m85198d(context, strArr3, null, this.f61365d, c14671b, false);
        this.f61374m.setSelection(timepoint.m85238f());
        this.f61374m.invalidate();
        this.f61375n.m85198d(context, strArr4, null, this.f61365d, c14670a, false);
        this.f61375n.setSelection(timepoint.m85239g());
        this.f61375n.invalidate();
        this.f61368g = timepoint;
        this.f61376o.m85192b(context, this.f61365d, z, true, (timepoint.m85237b() % 12) * 30, m85177q(timepoint.m85237b()));
        this.f61377p.m85192b(context, this.f61365d, false, false, timepoint.m85238f() * 6, false);
        this.f61378q.m85192b(context, this.f61365d, false, false, timepoint.m85239g() * 6, false);
        this.f61367f = true;
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        Timepoint timepoint;
        Timepoint timepoint2;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        int i5 = 0;
        if (i == 4096) {
            i2 = 1;
        } else {
            i2 = i == 8192 ? -1 : 0;
        }
        if (i2 == 0) {
            return false;
        }
        int currentlyShowingValue = getCurrentlyShowingValue();
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            currentlyShowingValue %= 12;
            i3 = 30;
        } else {
            i3 = 6;
            if (currentItemShowing != 1 && currentItemShowing != 2) {
                i3 = 0;
            }
        }
        int iM85182w = m85182w(currentlyShowingValue * i3, i2) / i3;
        if (currentItemShowing != 0) {
            i4 = 55;
        } else if (this.f61369h) {
            i4 = 23;
        } else {
            i4 = 12;
            i5 = 1;
        }
        if (iM85182w > i4) {
            iM85182w = i5;
        } else if (iM85182w < i5) {
            iM85182w = i4;
        }
        if (currentItemShowing == 0) {
            timepoint = new Timepoint(iM85182w, this.f61368g.m85238f(), this.f61368g.m85239g());
        } else {
            if (currentItemShowing != 1) {
                if (currentItemShowing != 2) {
                    timepoint2 = this.f61368g;
                } else {
                    timepoint = new Timepoint(this.f61368g.m85237b(), this.f61368g.m85238f(), iM85182w);
                }
                m85181v(currentItemShowing, timepoint2);
                this.f61366e.mo85188c(timepoint2);
                return true;
            }
            timepoint = new Timepoint(this.f61368g.m85237b(), iM85182w, this.f61368g.m85239g());
        }
        timepoint2 = timepoint;
        m85181v(currentItemShowing, timepoint2);
        this.f61366e.mo85188c(timepoint2);
        return true;
    }

    public void setAmOrPm(int i) {
        this.f61372k.setAmOrPm(i);
        this.f61372k.invalidate();
        Timepoint timepoint = new Timepoint(this.f61368g);
        if (i == 0) {
            timepoint.m85242m();
        } else if (i == 1) {
            timepoint.m85243n();
        }
        Timepoint timepointM85180t = m85180t(timepoint, 0);
        m85179s(timepointM85180t, false, 0);
        this.f61368g = timepointM85180t;
        this.f61366e.mo85188c(timepointM85180t);
    }

    public void setOnValueSelectedListener(InterfaceC14675f interfaceC14675f) {
        this.f61366e = interfaceC14675f;
    }

    public void setTime(Timepoint timepoint) {
        m85181v(0, timepoint);
    }

    /* JADX INFO: renamed from: u */
    public void m85185u(int i, boolean z) {
        if (i != 0 && i != 1 && i != 2) {
            Log.e("RadialPickerLayout", "TimePicker does not support view at index " + i);
            return;
        }
        int currentItemShowing = getCurrentItemShowing();
        this.f61370i = i;
        if (!z || i == currentItemShowing) {
            int i2 = i == 0 ? 1 : 0;
            int i3 = i == 1 ? 1 : 0;
            int i4 = i != 2 ? 0 : 1;
            float f = i2;
            this.f61373l.setAlpha(f);
            this.f61376o.setAlpha(f);
            float f2 = i3;
            this.f61374m.setAlpha(f2);
            this.f61377p.setAlpha(f2);
            float f3 = i4;
            this.f61375n.setAlpha(f3);
            this.f61378q.setAlpha(f3);
            return;
        }
        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[4];
        if (i == 1 && currentItemShowing == 0) {
            objectAnimatorArr[0] = this.f61373l.getDisappearAnimator();
            objectAnimatorArr[1] = this.f61376o.getDisappearAnimator();
            objectAnimatorArr[2] = this.f61374m.getReappearAnimator();
            objectAnimatorArr[3] = this.f61377p.getReappearAnimator();
        } else if (i == 0 && currentItemShowing == 1) {
            objectAnimatorArr[0] = this.f61373l.getReappearAnimator();
            objectAnimatorArr[1] = this.f61376o.getReappearAnimator();
            objectAnimatorArr[2] = this.f61374m.getDisappearAnimator();
            objectAnimatorArr[3] = this.f61377p.getDisappearAnimator();
        } else if (i == 1 && currentItemShowing == 2) {
            objectAnimatorArr[0] = this.f61375n.getDisappearAnimator();
            objectAnimatorArr[1] = this.f61378q.getDisappearAnimator();
            objectAnimatorArr[2] = this.f61374m.getReappearAnimator();
            objectAnimatorArr[3] = this.f61377p.getReappearAnimator();
        } else if (i == 0 && currentItemShowing == 2) {
            objectAnimatorArr[0] = this.f61375n.getDisappearAnimator();
            objectAnimatorArr[1] = this.f61378q.getDisappearAnimator();
            objectAnimatorArr[2] = this.f61373l.getReappearAnimator();
            objectAnimatorArr[3] = this.f61376o.getReappearAnimator();
        } else if (i == 2 && currentItemShowing == 1) {
            objectAnimatorArr[0] = this.f61375n.getReappearAnimator();
            objectAnimatorArr[1] = this.f61378q.getReappearAnimator();
            objectAnimatorArr[2] = this.f61374m.getDisappearAnimator();
            objectAnimatorArr[3] = this.f61377p.getDisappearAnimator();
        } else if (i == 2 && currentItemShowing == 0) {
            objectAnimatorArr[0] = this.f61375n.getReappearAnimator();
            objectAnimatorArr[1] = this.f61378q.getReappearAnimator();
            objectAnimatorArr[2] = this.f61373l.getDisappearAnimator();
            objectAnimatorArr[3] = this.f61376o.getDisappearAnimator();
        }
        AnimatorSet animatorSet = this.f61360B;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f61360B.end();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f61360B = animatorSet2;
        animatorSet2.playTogether(objectAnimatorArr);
        this.f61360B.start();
    }

    /* JADX INFO: renamed from: y */
    public boolean m85186y(boolean z) {
        if (this.f61384w && !z) {
            return false;
        }
        this.f61381t = z;
        this.f61379r.setVisibility(z ? 4 : 0);
        return true;
    }
}
