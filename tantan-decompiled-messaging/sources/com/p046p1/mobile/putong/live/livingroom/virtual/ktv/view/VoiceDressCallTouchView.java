package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

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
import p147v.VLinear;
import p149l.m96;
import p149l.mqi0;
import p149l.n96;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceDressCallTouchView extends VLinear {

    /* JADX INFO: renamed from: p */
    public static String f52511p = "VoiceDressCallTouchView";

    /* JADX INFO: renamed from: q */
    public static String f52512q = "idle";

    /* JADX INFO: renamed from: r */
    public static String f52513r = "sending";

    /* JADX INFO: renamed from: c */
    public long f52514c;

    /* JADX INFO: renamed from: d */
    public final int f52515d;

    /* JADX INFO: renamed from: e */
    public final int f52516e;

    /* JADX INFO: renamed from: f */
    public final int f52517f;

    /* JADX INFO: renamed from: g */
    public final int f52518g;

    /* JADX INFO: renamed from: h */
    public final int f52519h;

    /* JADX INFO: renamed from: i */
    public volatile int f52520i;

    /* JADX INFO: renamed from: j */
    public volatile int f52521j;

    /* JADX INFO: renamed from: k */
    public InterfaceC12968b f52522k;

    /* JADX INFO: renamed from: l */
    public HandlerThread f52523l;

    /* JADX INFO: renamed from: m */
    public Handler f52524m;

    /* JADX INFO: renamed from: n */
    public String f52525n;

    /* JADX INFO: renamed from: o */
    public Parcelable f52526o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView$a */
    public class HandlerC12967a extends Handler {
        public HandlerC12967a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            String unused = VoiceDressCallTouchView.f52511p;
            int i = message.what;
            String unused2 = VoiceDressCallTouchView.f52511p;
            int unused3 = VoiceDressCallTouchView.this.f52521j;
            int unused4 = VoiceDressCallTouchView.this.f52520i;
            VoiceDressCallTouchView.this.m77146W(message);
            String unused5 = VoiceDressCallTouchView.f52511p;
            int unused6 = VoiceDressCallTouchView.this.f52521j;
            int unused7 = VoiceDressCallTouchView.this.f52520i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView$b */
    public interface InterfaceC12968b {
        /* JADX INFO: renamed from: a */
        void mo77095a(int i);

        /* JADX INFO: renamed from: b */
        void mo77096b(int i);
    }

    public VoiceDressCallTouchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52515d = 1;
        this.f52516e = 2;
        this.f52517f = 3;
        this.f52518g = 4;
        this.f52519h = 5;
        this.f52525n = f52512q;
    }

    /* JADX INFO: renamed from: c0 */
    private void m77145c0() {
        this.f52520i = 0;
        this.f52521j = 0;
    }

    private void setState(String str) {
        this.f52525n = str;
    }

    /* JADX INFO: renamed from: W */
    public final void m77146W(@NonNull Message message) {
        int i = message.what;
        if (i == 1) {
            this.f52524m.removeCallbacksAndMessages(null);
            this.f52520i++;
            m77150a0(this.f52520i + this.f52521j);
            m77154f0(3, 1000);
            return;
        }
        if (i == 2) {
            this.f52524m.removeMessages(3);
            this.f52524m.removeMessages(2);
            this.f52521j++;
            m77150a0(this.f52520i + this.f52521j);
            m77154f0(2, 100);
            m77155g0(getContext());
            return;
        }
        if (i == 3) {
            this.f52524m.removeCallbacksAndMessages(null);
            m77153e0(this.f52520i + this.f52521j);
        } else if (i == 4) {
            this.f52524m.removeCallbacksAndMessages(null);
            m77153e0(this.f52520i + this.f52521j);
        } else {
            if (i != 5) {
                return;
            }
            m77145c0();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m77147X() {
        HandlerThread handlerThread = new HandlerThread("VoiceDressCallTouchView");
        this.f52523l = handlerThread;
        handlerThread.start();
        this.f52524m = new HandlerC12967a(this.f52523l.getLooper());
        setState(f52512q);
        m77154f0(5, 0);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m77148Y(int i) {
        this.f52522k.mo77096b(i);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m77149Z(int i) {
        setState(f52513r);
        m77154f0(5, 0);
        this.f52522k.mo77095a(i);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m77150a0(final int i) {
        if (!NullChecker.m81303a(this.f52522k) || i <= 0) {
            return;
        }
        post(new Runnable() { // from class: l.r3n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157550a.m77148Y(i);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m77151b0() {
        if (this.f52520i > 0) {
            m77153e0(this.f52520i + this.f52521j);
        }
        HandlerThread handlerThread = this.f52523l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f52523l = null;
        }
        Handler handler = this.f52524m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f52524m = null;
        }
        setState(f52512q);
    }

    /* JADX INFO: renamed from: d0 */
    public void m77152d0() {
        setState(f52512q);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m77153e0(final int i) {
        if (!NullChecker.m81303a(this.f52522k) || i <= 0) {
            return;
        }
        post(new Runnable() { // from class: l.q3n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152488a.m77149Z(i);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m77154f0(int i, int i2) {
        if (this.f52524m != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            this.f52524m.sendMessageDelayed(messageObtain, i2);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g0 */
    public void m77155g0(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f52526o == null) {
            this.f52526o = VibrationEffect.createOneShot(30L, 150);
        }
        if (m96.m153609a(this.f52526o)) {
            vibrator.vibrate(n96.m158534a(this.f52526o));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f52521j = 0;
            this.f52514c = mqi0.m155944o();
            if (f52513r.equals(this.f52525n)) {
                return false;
            }
            m77154f0(2, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || !f52512q.equals(this.f52525n)) {
            return super.onTouchEvent(motionEvent);
        }
        if (mqi0.m155944o() - this.f52514c >= ViewConfiguration.getLongPressTimeout()) {
            m77154f0(4, 0);
        } else {
            m77154f0(1, 0);
        }
        return true;
    }

    public void setOnSendListener(InterfaceC12968b interfaceC12968b) {
        this.f52522k = interfaceC12968b;
    }

    public VoiceDressCallTouchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceDressCallTouchView(Context context) {
        this(context, null);
    }
}
