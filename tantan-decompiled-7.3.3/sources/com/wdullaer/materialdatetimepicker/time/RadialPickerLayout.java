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
import p153l.j26;
import p153l.q9c0;

/* JADX INFO: loaded from: classes2.dex */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: A */
    private AccessibilityManager f62206A;

    /* JADX INFO: renamed from: B */
    private AnimatorSet f62207B;

    /* JADX INFO: renamed from: C */
    private Handler f62208C;

    /* JADX INFO: renamed from: a */
    private final int f62209a;

    /* JADX INFO: renamed from: b */
    private final int f62210b;

    /* JADX INFO: renamed from: c */
    private Timepoint f62211c;

    /* JADX INFO: renamed from: d */
    private InterfaceC14838a f62212d;

    /* JADX INFO: renamed from: e */
    private InterfaceC14823f f62213e;

    /* JADX INFO: renamed from: f */
    private boolean f62214f;

    /* JADX INFO: renamed from: g */
    private Timepoint f62215g;

    /* JADX INFO: renamed from: h */
    private boolean f62216h;

    /* JADX INFO: renamed from: i */
    private int f62217i;

    /* JADX INFO: renamed from: j */
    private CircleView f62218j;

    /* JADX INFO: renamed from: k */
    private AmPmCirclesView f62219k;

    /* JADX INFO: renamed from: l */
    private RadialTextsView f62220l;

    /* JADX INFO: renamed from: m */
    private RadialTextsView f62221m;

    /* JADX INFO: renamed from: n */
    private RadialTextsView f62222n;

    /* JADX INFO: renamed from: o */
    private RadialSelectorView f62223o;

    /* JADX INFO: renamed from: p */
    private RadialSelectorView f62224p;

    /* JADX INFO: renamed from: q */
    private RadialSelectorView f62225q;

    /* JADX INFO: renamed from: r */
    private View f62226r;

    /* JADX INFO: renamed from: s */
    private int[] f62227s;

    /* JADX INFO: renamed from: t */
    private boolean f62228t;

    /* JADX INFO: renamed from: u */
    private int f62229u;

    /* JADX INFO: renamed from: v */
    private boolean f62230v;

    /* JADX INFO: renamed from: w */
    private boolean f62231w;

    /* JADX INFO: renamed from: x */
    private int f62232x;

    /* JADX INFO: renamed from: y */
    private float f62233y;

    /* JADX INFO: renamed from: z */
    private float f62234z;

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$a */
    public class C14818a implements RadialTextsView.InterfaceC14828c {
        public C14818a() {
        }

        @Override // com.wdullaer.materialdatetimepicker.time.RadialTextsView.InterfaceC14828c
        /* JADX INFO: renamed from: a */
        public boolean mo86358a(int i) {
            return !RadialPickerLayout.this.f62212d.mo86399h(new Timepoint(RadialPickerLayout.this.f62215g.m86408b(), RadialPickerLayout.this.f62215g.m86409f(), i), 2);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$b */
    public class C14819b implements RadialTextsView.InterfaceC14828c {
        public C14819b() {
        }

        @Override // com.wdullaer.materialdatetimepicker.time.RadialTextsView.InterfaceC14828c
        /* JADX INFO: renamed from: a */
        public boolean mo86358a(int i) {
            return !RadialPickerLayout.this.f62212d.mo86399h(new Timepoint(RadialPickerLayout.this.f62215g.m86408b(), i, RadialPickerLayout.this.f62215g.m86410g()), 1);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$c */
    public class C14820c implements RadialTextsView.InterfaceC14828c {
        public C14820c() {
        }

        @Override // com.wdullaer.materialdatetimepicker.time.RadialTextsView.InterfaceC14828c
        /* JADX INFO: renamed from: a */
        public boolean mo86358a(int i) {
            Timepoint timepoint = new Timepoint(i, RadialPickerLayout.this.f62215g.m86409f(), RadialPickerLayout.this.f62215g.m86410g());
            if (!RadialPickerLayout.this.f62216h && RadialPickerLayout.this.getIsCurrentlyAmOrPm() == 1) {
                timepoint.m86414n();
            }
            if (!RadialPickerLayout.this.f62216h && RadialPickerLayout.this.getIsCurrentlyAmOrPm() == 0) {
                timepoint.m86413m();
            }
            return !RadialPickerLayout.this.f62212d.mo86399h(timepoint, 0);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$d */
    public class RunnableC14821d implements Runnable {
        public RunnableC14821d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialPickerLayout.this.f62219k.setAmOrPmPressed(RadialPickerLayout.this.f62229u);
            RadialPickerLayout.this.f62219k.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$e */
    public class RunnableC14822e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Boolean[] f62239a;

        public RunnableC14822e(Boolean[] boolArr) {
            this.f62239a = boolArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialPickerLayout.this.f62230v = true;
            RadialPickerLayout radialPickerLayout = RadialPickerLayout.this;
            radialPickerLayout.f62211c = radialPickerLayout.m86347o(radialPickerLayout.f62232x, this.f62239a[0].booleanValue(), false);
            RadialPickerLayout radialPickerLayout2 = RadialPickerLayout.this;
            radialPickerLayout2.f62211c = radialPickerLayout2.m86351t(radialPickerLayout2.f62211c, RadialPickerLayout.this.getCurrentItemShowing());
            RadialPickerLayout radialPickerLayout3 = RadialPickerLayout.this;
            radialPickerLayout3.m86350s(radialPickerLayout3.f62211c, true, RadialPickerLayout.this.getCurrentItemShowing());
            RadialPickerLayout.this.f62213e.mo86359c(RadialPickerLayout.this.f62211c);
        }
    }

    /* JADX INFO: renamed from: com.wdullaer.materialdatetimepicker.time.RadialPickerLayout$f */
    public interface InterfaceC14823f {
        /* JADX INFO: renamed from: c */
        void mo86359c(Timepoint timepoint);

        /* JADX INFO: renamed from: d */
        void mo86360d();

        /* JADX INFO: renamed from: e */
        void mo86361e(int i);
    }

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62229u = -1;
        this.f62208C = new Handler();
        setOnTouchListener(this);
        this.f62209a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f62210b = ViewConfiguration.getTapTimeout();
        this.f62230v = false;
        CircleView circleView = new CircleView(context);
        this.f62218j = circleView;
        addView(circleView);
        AmPmCirclesView amPmCirclesView = new AmPmCirclesView(context);
        this.f62219k = amPmCirclesView;
        addView(amPmCirclesView);
        RadialSelectorView radialSelectorView = new RadialSelectorView(context);
        this.f62223o = radialSelectorView;
        addView(radialSelectorView);
        RadialSelectorView radialSelectorView2 = new RadialSelectorView(context);
        this.f62224p = radialSelectorView2;
        addView(radialSelectorView2);
        RadialSelectorView radialSelectorView3 = new RadialSelectorView(context);
        this.f62225q = radialSelectorView3;
        addView(radialSelectorView3);
        RadialTextsView radialTextsView = new RadialTextsView(context);
        this.f62220l = radialTextsView;
        addView(radialTextsView);
        RadialTextsView radialTextsView2 = new RadialTextsView(context);
        this.f62221m = radialTextsView2;
        addView(radialTextsView2);
        RadialTextsView radialTextsView3 = new RadialTextsView(context);
        this.f62222n = radialTextsView3;
        addView(radialTextsView3);
        m86349r();
        this.f62211c = null;
        this.f62228t = true;
        View view = new View(context);
        this.f62226r = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f62226r.setBackgroundColor(j26.m143190c(context, q9c0.f156235t));
        this.f62226r.setVisibility(4);
        addView(this.f62226r);
        this.f62206A = (AccessibilityManager) context.getSystemService("accessibility");
        this.f62214f = false;
    }

    private int getCurrentlyShowingValue() {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f62215g.m86408b();
        }
        if (currentItemShowing == 1) {
            return this.f62215g.m86409f();
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.f62215g.m86410g();
    }

    /* JADX INFO: renamed from: n */
    private int m86346n(float f, float f2, boolean z, Boolean[] boolArr) {
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.f62223o.m86362a(f, f2, z, boolArr);
        }
        if (currentItemShowing == 1) {
            return this.f62224p.m86362a(f, f2, z, boolArr);
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.f62225q.m86362a(f, f2, z, boolArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX INFO: renamed from: o */
    public Timepoint m86347o(int i, boolean z, boolean z2) {
        if (i == -1) {
            return null;
        }
        int currentItemShowing = getCurrentItemShowing();
        int iM86353w = (z2 || !(currentItemShowing == 1 || currentItemShowing == 2)) ? m86353w(i, 0) : m86354x(i);
        int i2 = currentItemShowing != 0 ? 6 : 30;
        if (currentItemShowing == 0) {
            if (this.f62216h) {
                if (iM86353w == 0 && z) {
                    iM86353w = 360;
                } else if (iM86353w == 360 && !z) {
                    iM86353w = 0;
                }
            } else if (iM86353w == 0) {
                iM86353w = 360;
            }
        } else if (iM86353w == 360 && (currentItemShowing == 1 || currentItemShowing == 2)) {
            iM86353w = 0;
        }
        int i3 = iM86353w / i2;
        if (currentItemShowing == 0 && this.f62216h && !z && iM86353w != 0) {
            i3 += 12;
        }
        if (currentItemShowing != 0) {
            if (currentItemShowing != 1) {
                return currentItemShowing != 2 ? this.f62215g : new Timepoint(this.f62215g.m86408b(), this.f62215g.m86409f(), i3);
            }
            return new Timepoint(this.f62215g.m86408b(), i3, this.f62215g.m86410g());
        }
        if (!this.f62216h && getIsCurrentlyAmOrPm() == 1 && iM86353w != 360) {
            i3 += 12;
        }
        return new Timepoint((!this.f62216h && getIsCurrentlyAmOrPm() == 0 && iM86353w == 360) ? 0 : i3, this.f62215g.m86409f(), this.f62215g.m86410g());
    }

    /* JADX INFO: renamed from: q */
    private boolean m86348q(int i) {
        return this.f62216h && i <= 12 && i != 0;
    }

    /* JADX INFO: renamed from: r */
    private void m86349r() {
        this.f62227s = new int[361];
        int i = 1;
        int i2 = 8;
        int i3 = 0;
        for (int i4 = 0; i4 < 361; i4++) {
            this.f62227s[i4] = i3;
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
    public void m86350s(Timepoint timepoint, boolean z, int i) {
        if (i == 0) {
            int iM86408b = timepoint.m86408b();
            boolean zM86348q = m86348q(iM86408b);
            int i2 = iM86408b % 12;
            int i3 = (i2 * 360) / 12;
            boolean z2 = this.f62216h;
            if (!z2) {
                iM86408b = i2;
            }
            if (!z2 && iM86408b == 0) {
                iM86408b += 12;
            }
            this.f62223o.m86364c(i3, zM86348q, z);
            this.f62220l.setSelection(iM86408b);
            if (timepoint.m86409f() != this.f62215g.m86409f()) {
                this.f62224p.m86364c((timepoint.m86409f() * 360) / 60, zM86348q, z);
                this.f62221m.setSelection(timepoint.m86409f());
            }
            if (timepoint.m86410g() != this.f62215g.m86410g()) {
                this.f62225q.m86364c((timepoint.m86410g() * 360) / 60, zM86348q, z);
                this.f62222n.setSelection(timepoint.m86410g());
            }
        } else if (i == 1) {
            this.f62224p.m86364c((timepoint.m86409f() * 360) / 60, false, z);
            this.f62221m.setSelection(timepoint.m86409f());
            if (timepoint.m86410g() != this.f62215g.m86410g()) {
                this.f62225q.m86364c((timepoint.m86410g() * 360) / 60, false, z);
                this.f62222n.setSelection(timepoint.m86410g());
            }
        } else if (i == 2) {
            this.f62225q.m86364c((timepoint.m86410g() * 360) / 60, false, z);
            this.f62222n.setSelection(timepoint.m86410g());
        }
        int currentItemShowing = getCurrentItemShowing();
        if (currentItemShowing == 0) {
            this.f62223o.invalidate();
            this.f62220l.invalidate();
        } else if (currentItemShowing == 1) {
            this.f62224p.invalidate();
            this.f62221m.invalidate();
        } else {
            if (currentItemShowing != 2) {
                return;
            }
            this.f62225q.invalidate();
            this.f62222n.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public Timepoint m86351t(Timepoint timepoint, int i) {
        if (i == 0) {
            return this.f62212d.mo86396b(timepoint, Timepoint.TYPE.HOUR);
        }
        if (i != 1) {
            return i != 2 ? this.f62215g : this.f62212d.mo86396b(timepoint, Timepoint.TYPE.SECOND);
        }
        return this.f62212d.mo86396b(timepoint, Timepoint.TYPE.MINUTE);
    }

    /* JADX INFO: renamed from: v */
    private void m86352v(int i, Timepoint timepoint) {
        Timepoint timepointM86351t = m86351t(timepoint, i);
        this.f62215g = timepointM86351t;
        m86350s(timepointM86351t, false, i);
    }

    /* JADX INFO: renamed from: w */
    private static int m86353w(int i, int i2) {
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
    private int m86354x(int i) {
        int[] iArr = this.f62227s;
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
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), calendar.getTimeInMillis(), this.f62216h ? MMConstants.ERR_WATERMARK_READ : 1));
        return true;
    }

    public int getCurrentItemShowing() {
        int i = this.f62217i;
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        Log.e("RadialPickerLayout", "Current item showing was unfortunately set to " + this.f62217i);
        return -1;
    }

    public int getHours() {
        return this.f62215g.m86408b();
    }

    public int getIsCurrentlyAmOrPm() {
        if (this.f62215g.m86411h()) {
            return 0;
        }
        return this.f62215g.m86412i() ? 1 : -1;
    }

    public int getMinutes() {
        return this.f62215g.m86409f();
    }

    public int getSeconds() {
        return this.f62215g.m86410g();
    }

    public Timepoint getTime() {
        return this.f62215g;
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
        int iM86346n;
        int i;
        Timepoint timepoint;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Boolean[] boolArr = {Boolean.FALSE};
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.f62228t) {
                return true;
            }
            this.f62233y = x;
            this.f62234z = y;
            this.f62211c = null;
            this.f62230v = false;
            this.f62231w = true;
            if (this.f62216h || this.f62212d.getVersion() != TimePickerDialog.Version.VERSION_1) {
                this.f62229u = -1;
            } else {
                this.f62229u = this.f62219k.m86330a(x, y);
            }
            int i2 = this.f62229u;
            if (i2 == 0 || i2 == 1) {
                this.f62212d.mo86401w();
                this.f62232x = -1;
                this.f62208C.postDelayed(new RunnableC14821d(), this.f62210b);
            } else {
                int iM86346n2 = m86346n(x, y, this.f62206A.isTouchExplorationEnabled(), boolArr);
                this.f62232x = iM86346n2;
                if (this.f62212d.mo86399h(m86347o(iM86346n2, boolArr[0].booleanValue(), false), getCurrentItemShowing())) {
                    this.f62232x = -1;
                }
                if (this.f62232x != -1) {
                    this.f62212d.mo86401w();
                    this.f62208C.postDelayed(new RunnableC14822e(boolArr), this.f62210b);
                }
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.f62228t) {
                    Log.e("RadialPickerLayout", "Input was disabled, but received ACTION_MOVE.");
                    return true;
                }
                float fAbs = Math.abs(y - this.f62234z);
                float fAbs2 = Math.abs(x - this.f62233y);
                if (this.f62230v) {
                    i = this.f62229u;
                    if (i != 0) {
                        this.f62208C.removeCallbacksAndMessages(null);
                        if (this.f62219k.m86330a(x, y) != this.f62229u) {
                            this.f62219k.setAmOrPmPressed(-1);
                            this.f62219k.invalidate();
                            this.f62229u = -1;
                        }
                    } else {
                        this.f62208C.removeCallbacksAndMessages(null);
                        if (this.f62219k.m86330a(x, y) != this.f62229u) {
                            this.f62219k.setAmOrPmPressed(-1);
                            this.f62219k.invalidate();
                            this.f62229u = -1;
                        }
                    }
                } else {
                    int i3 = this.f62209a;
                    if (fAbs2 > i3 || fAbs > i3) {
                        i = this.f62229u;
                        if (i != 0 || i == 1) {
                            this.f62208C.removeCallbacksAndMessages(null);
                            if (this.f62219k.m86330a(x, y) != this.f62229u) {
                                this.f62219k.setAmOrPmPressed(-1);
                                this.f62219k.invalidate();
                                this.f62229u = -1;
                            }
                        } else if (this.f62232x != -1) {
                            this.f62230v = true;
                            this.f62208C.removeCallbacksAndMessages(null);
                            int iM86346n3 = m86346n(x, y, true, boolArr);
                            if (iM86346n3 != -1) {
                                Timepoint timepointM86351t = m86351t(m86347o(iM86346n3, boolArr[0].booleanValue(), false), getCurrentItemShowing());
                                m86350s(timepointM86351t, true, getCurrentItemShowing());
                                if (timepointM86351t != null && ((timepoint = this.f62211c) == null || !timepoint.equals(timepointM86351t))) {
                                    this.f62212d.mo86401w();
                                    this.f62211c = timepointM86351t;
                                    this.f62213e.mo86359c(timepointM86351t);
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        } else {
            if (!this.f62228t) {
                this.f62213e.mo86360d();
                return true;
            }
            this.f62208C.removeCallbacksAndMessages(null);
            this.f62231w = false;
            int i4 = this.f62229u;
            if (i4 != 0 && i4 != 1) {
                if (this.f62232x != -1 && (iM86346n = m86346n(x, y, this.f62230v, boolArr)) != -1) {
                    Timepoint timepointM86351t2 = m86351t(m86347o(iM86346n, boolArr[0].booleanValue(), !this.f62230v), getCurrentItemShowing());
                    m86350s(timepointM86351t2, false, getCurrentItemShowing());
                    this.f62215g = timepointM86351t2;
                    this.f62213e.mo86359c(timepointM86351t2);
                    this.f62213e.mo86361e(getCurrentItemShowing());
                }
                this.f62230v = false;
                return true;
            }
            int iM86330a = this.f62219k.m86330a(x, y);
            this.f62219k.setAmOrPmPressed(-1);
            this.f62219k.invalidate();
            if (iM86330a == this.f62229u) {
                this.f62219k.setAmOrPm(iM86330a);
                if (getIsCurrentlyAmOrPm() != iM86330a) {
                    Timepoint timepoint2 = new Timepoint(this.f62215g);
                    int i5 = this.f62229u;
                    if (i5 == 0) {
                        timepoint2.m86413m();
                    } else if (i5 == 1) {
                        timepoint2.m86414n();
                    }
                    Timepoint timepointM86351t3 = m86351t(timepoint2, 0);
                    m86350s(timepointM86351t3, false, 0);
                    this.f62215g = timepointM86351t3;
                    this.f62213e.mo86359c(timepointM86351t3);
                }
            }
            this.f62229u = -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m86355p(Context context, InterfaceC14838a interfaceC14838a, Timepoint timepoint, boolean z) {
        int[] iArr;
        String str;
        if (this.f62214f) {
            Log.e("RadialPickerLayout", "Time has already been initialized.");
            return;
        }
        this.f62212d = interfaceC14838a;
        this.f62216h = this.f62206A.isTouchExplorationEnabled() || z;
        this.f62218j.m86332a(context, this.f62212d);
        this.f62218j.invalidate();
        if (!this.f62216h && this.f62212d.getVersion() == TimePickerDialog.Version.VERSION_1) {
            this.f62219k.m86331b(context, this.f62212d, !timepoint.m86411h() ? 1 : 0);
            this.f62219k.invalidate();
        }
        C14818a c14818a = new C14818a();
        C14819b c14819b = new C14819b();
        C14820c c14820c = new C14820c();
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
        RadialTextsView radialTextsView = this.f62220l;
        if (!z) {
            strArr2 = null;
        }
        radialTextsView.m86369d(context, strArr, strArr2, this.f62212d, c14820c, true);
        RadialTextsView radialTextsView2 = this.f62220l;
        int iM86408b = timepoint.m86408b();
        if (!z) {
            iM86408b = iArr2[iM86408b % 12];
        }
        radialTextsView2.setSelection(iM86408b);
        this.f62220l.invalidate();
        this.f62221m.m86369d(context, strArr3, null, this.f62212d, c14819b, false);
        this.f62221m.setSelection(timepoint.m86409f());
        this.f62221m.invalidate();
        this.f62222n.m86369d(context, strArr4, null, this.f62212d, c14818a, false);
        this.f62222n.setSelection(timepoint.m86410g());
        this.f62222n.invalidate();
        this.f62215g = timepoint;
        this.f62223o.m86363b(context, this.f62212d, z, true, (timepoint.m86408b() % 12) * 30, m86348q(timepoint.m86408b()));
        this.f62224p.m86363b(context, this.f62212d, false, false, timepoint.m86409f() * 6, false);
        this.f62225q.m86363b(context, this.f62212d, false, false, timepoint.m86410g() * 6, false);
        this.f62214f = true;
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
        int iM86353w = m86353w(currentlyShowingValue * i3, i2) / i3;
        if (currentItemShowing != 0) {
            i4 = 55;
        } else if (this.f62216h) {
            i4 = 23;
        } else {
            i4 = 12;
            i5 = 1;
        }
        if (iM86353w > i4) {
            iM86353w = i5;
        } else if (iM86353w < i5) {
            iM86353w = i4;
        }
        if (currentItemShowing == 0) {
            timepoint = new Timepoint(iM86353w, this.f62215g.m86409f(), this.f62215g.m86410g());
        } else {
            if (currentItemShowing != 1) {
                if (currentItemShowing != 2) {
                    timepoint2 = this.f62215g;
                } else {
                    timepoint = new Timepoint(this.f62215g.m86408b(), this.f62215g.m86409f(), iM86353w);
                }
                m86352v(currentItemShowing, timepoint2);
                this.f62213e.mo86359c(timepoint2);
                return true;
            }
            timepoint = new Timepoint(this.f62215g.m86408b(), iM86353w, this.f62215g.m86410g());
        }
        timepoint2 = timepoint;
        m86352v(currentItemShowing, timepoint2);
        this.f62213e.mo86359c(timepoint2);
        return true;
    }

    public void setAmOrPm(int i) {
        this.f62219k.setAmOrPm(i);
        this.f62219k.invalidate();
        Timepoint timepoint = new Timepoint(this.f62215g);
        if (i == 0) {
            timepoint.m86413m();
        } else if (i == 1) {
            timepoint.m86414n();
        }
        Timepoint timepointM86351t = m86351t(timepoint, 0);
        m86350s(timepointM86351t, false, 0);
        this.f62215g = timepointM86351t;
        this.f62213e.mo86359c(timepointM86351t);
    }

    public void setOnValueSelectedListener(InterfaceC14823f interfaceC14823f) {
        this.f62213e = interfaceC14823f;
    }

    public void setTime(Timepoint timepoint) {
        m86352v(0, timepoint);
    }

    /* JADX INFO: renamed from: u */
    public void m86356u(int i, boolean z) {
        if (i != 0 && i != 1 && i != 2) {
            Log.e("RadialPickerLayout", "TimePicker does not support view at index " + i);
            return;
        }
        int currentItemShowing = getCurrentItemShowing();
        this.f62217i = i;
        if (!z || i == currentItemShowing) {
            int i2 = i == 0 ? 1 : 0;
            int i3 = i == 1 ? 1 : 0;
            int i4 = i != 2 ? 0 : 1;
            float f = i2;
            this.f62220l.setAlpha(f);
            this.f62223o.setAlpha(f);
            float f2 = i3;
            this.f62221m.setAlpha(f2);
            this.f62224p.setAlpha(f2);
            float f3 = i4;
            this.f62222n.setAlpha(f3);
            this.f62225q.setAlpha(f3);
            return;
        }
        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[4];
        if (i == 1 && currentItemShowing == 0) {
            objectAnimatorArr[0] = this.f62220l.getDisappearAnimator();
            objectAnimatorArr[1] = this.f62223o.getDisappearAnimator();
            objectAnimatorArr[2] = this.f62221m.getReappearAnimator();
            objectAnimatorArr[3] = this.f62224p.getReappearAnimator();
        } else if (i == 0 && currentItemShowing == 1) {
            objectAnimatorArr[0] = this.f62220l.getReappearAnimator();
            objectAnimatorArr[1] = this.f62223o.getReappearAnimator();
            objectAnimatorArr[2] = this.f62221m.getDisappearAnimator();
            objectAnimatorArr[3] = this.f62224p.getDisappearAnimator();
        } else if (i == 1 && currentItemShowing == 2) {
            objectAnimatorArr[0] = this.f62222n.getDisappearAnimator();
            objectAnimatorArr[1] = this.f62225q.getDisappearAnimator();
            objectAnimatorArr[2] = this.f62221m.getReappearAnimator();
            objectAnimatorArr[3] = this.f62224p.getReappearAnimator();
        } else if (i == 0 && currentItemShowing == 2) {
            objectAnimatorArr[0] = this.f62222n.getDisappearAnimator();
            objectAnimatorArr[1] = this.f62225q.getDisappearAnimator();
            objectAnimatorArr[2] = this.f62220l.getReappearAnimator();
            objectAnimatorArr[3] = this.f62223o.getReappearAnimator();
        } else if (i == 2 && currentItemShowing == 1) {
            objectAnimatorArr[0] = this.f62222n.getReappearAnimator();
            objectAnimatorArr[1] = this.f62225q.getReappearAnimator();
            objectAnimatorArr[2] = this.f62221m.getDisappearAnimator();
            objectAnimatorArr[3] = this.f62224p.getDisappearAnimator();
        } else if (i == 2 && currentItemShowing == 0) {
            objectAnimatorArr[0] = this.f62222n.getReappearAnimator();
            objectAnimatorArr[1] = this.f62225q.getReappearAnimator();
            objectAnimatorArr[2] = this.f62220l.getDisappearAnimator();
            objectAnimatorArr[3] = this.f62223o.getDisappearAnimator();
        }
        AnimatorSet animatorSet = this.f62207B;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f62207B.end();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f62207B = animatorSet2;
        animatorSet2.playTogether(objectAnimatorArr);
        this.f62207B.start();
    }

    /* JADX INFO: renamed from: y */
    public boolean m86357y(boolean z) {
        if (this.f62231w && !z) {
            return false;
        }
        this.f62228t = z;
        this.f62226r.setVisibility(z ? 4 : 0);
        return true;
    }
}
