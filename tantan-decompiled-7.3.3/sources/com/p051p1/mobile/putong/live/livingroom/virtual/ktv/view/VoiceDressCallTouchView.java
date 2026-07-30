package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.pzi0;
import p153l.qa6;
import p153l.ra6;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceDressCallTouchView extends VLinear {

    /* JADX INFO: renamed from: p */
    public static String f53359p = "VoiceDressCallTouchView";

    /* JADX INFO: renamed from: q */
    public static String f53360q = "idle";

    /* JADX INFO: renamed from: r */
    public static String f53361r = "sending";

    /* JADX INFO: renamed from: c */
    public long f53362c;

    /* JADX INFO: renamed from: d */
    public final int f53363d;

    /* JADX INFO: renamed from: e */
    public final int f53364e;

    /* JADX INFO: renamed from: f */
    public final int f53365f;

    /* JADX INFO: renamed from: g */
    public final int f53366g;

    /* JADX INFO: renamed from: h */
    public final int f53367h;

    /* JADX INFO: renamed from: i */
    public volatile int f53368i;

    /* JADX INFO: renamed from: j */
    public volatile int f53369j;

    /* JADX INFO: renamed from: k */
    public InterfaceC13131b f53370k;

    /* JADX INFO: renamed from: l */
    public HandlerThread f53371l;

    /* JADX INFO: renamed from: m */
    public Handler f53372m;

    /* JADX INFO: renamed from: n */
    public String f53373n;

    /* JADX INFO: renamed from: o */
    public Parcelable f53374o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView$a */
    public class HandlerC13130a extends Handler {
        public HandlerC13130a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            String unused = VoiceDressCallTouchView.f53359p;
            int i = message.what;
            String unused2 = VoiceDressCallTouchView.f53359p;
            int unused3 = VoiceDressCallTouchView.this.f53369j;
            int unused4 = VoiceDressCallTouchView.this.f53368i;
            VoiceDressCallTouchView.this.m78329W(message);
            String unused5 = VoiceDressCallTouchView.f53359p;
            int unused6 = VoiceDressCallTouchView.this.f53369j;
            int unused7 = VoiceDressCallTouchView.this.f53368i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView$b */
    public interface InterfaceC13131b {
        /* JADX INFO: renamed from: a */
        void mo78278a(int i);

        /* JADX INFO: renamed from: b */
        void mo78279b(int i);
    }

    public VoiceDressCallTouchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53363d = 1;
        this.f53364e = 2;
        this.f53365f = 3;
        this.f53366g = 4;
        this.f53367h = 5;
        this.f53373n = f53360q;
    }

    /* JADX INFO: renamed from: c0 */
    private void m78328c0() {
        this.f53368i = 0;
        this.f53369j = 0;
    }

    private void setState(String str) {
        this.f53373n = str;
    }

    /* JADX INFO: renamed from: W */
    public final void m78329W(@NonNull Message message) {
        int i = message.what;
        if (i == 1) {
            this.f53372m.removeCallbacksAndMessages(null);
            this.f53368i++;
            m78333a0(this.f53368i + this.f53369j);
            m78337f0(3, 1000);
            return;
        }
        if (i == 2) {
            this.f53372m.removeMessages(3);
            this.f53372m.removeMessages(2);
            this.f53369j++;
            m78333a0(this.f53368i + this.f53369j);
            m78337f0(2, 100);
            m78338g0(getContext());
            return;
        }
        if (i == 3) {
            this.f53372m.removeCallbacksAndMessages(null);
            m78336e0(this.f53368i + this.f53369j);
        } else if (i == 4) {
            this.f53372m.removeCallbacksAndMessages(null);
            m78336e0(this.f53368i + this.f53369j);
        } else {
            if (i != 5) {
                return;
            }
            m78328c0();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m78330X() {
        HandlerThread handlerThread = new HandlerThread("VoiceDressCallTouchView");
        this.f53371l = handlerThread;
        handlerThread.start();
        this.f53372m = new HandlerC13130a(this.f53371l.getLooper());
        setState(f53360q);
        m78337f0(5, 0);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m78331Y(int i) {
        this.f53370k.mo78279b(i);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m78332Z(int i) {
        setState(f53361r);
        m78337f0(5, 0);
        this.f53370k.mo78278a(i);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m78333a0(final int i) {
        if (!NullChecker.m82486a(this.f53370k) || i <= 0) {
            return;
        }
        post(new Runnable() { // from class: l.vcn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f183476a.m78331Y(i);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m78334b0() {
        if (this.f53368i > 0) {
            m78336e0(this.f53368i + this.f53369j);
        }
        HandlerThread handlerThread = this.f53371l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f53371l = null;
        }
        Handler handler = this.f53372m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f53372m = null;
        }
        setState(f53360q);
    }

    /* JADX INFO: renamed from: d0 */
    public void m78335d0() {
        setState(f53360q);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m78336e0(final int i) {
        if (!NullChecker.m82486a(this.f53370k) || i <= 0) {
            return;
        }
        post(new Runnable() { // from class: l.ucn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178452a.m78332Z(i);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m78337f0(int i, int i2) {
        if (this.f53372m != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            this.f53372m.sendMessageDelayed(messageObtain, i2);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g0 */
    public void m78338g0(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f53374o == null) {
            this.f53374o = VibrationEffect.createOneShot(30L, 150);
        }
        if (qa6.m175862a(this.f53374o)) {
            vibrator.vibrate(ra6.m180709a(this.f53374o));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f53369j = 0;
            this.f53362c = pzi0.m174454o();
            if (f53361r.equals(this.f53373n)) {
                return false;
            }
            m78337f0(2, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || !f53360q.equals(this.f53373n)) {
            return super.onTouchEvent(motionEvent);
        }
        if (pzi0.m174454o() - this.f53362c >= ViewConfiguration.getLongPressTimeout()) {
            m78337f0(4, 0);
        } else {
            m78337f0(1, 0);
        }
        return true;
    }

    public void setOnSendListener(InterfaceC13131b interfaceC13131b) {
        this.f53370k = interfaceC13131b;
    }

    public VoiceDressCallTouchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceDressCallTouchView(Context context) {
        this(context, null);
    }
}
