package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import p147v.VFrame;
import p149l.llj0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ari0<T extends llj0> extends mlj0<T> {

    /* JADX INFO: renamed from: d */
    public int f71273d;

    /* JADX INFO: renamed from: e */
    public int f71274e;

    /* JADX INFO: renamed from: f */
    public boolean f71275f;

    /* JADX INFO: renamed from: g */
    public Handler f71276g;

    /* JADX INFO: renamed from: h */
    public Handler f71277h;

    /* JADX INFO: renamed from: l.ari0$a */
    public class HandlerC15697a extends Handler {
        public HandlerC15697a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (ari0.this.f71274e > 0) {
                ari0.this.f71274e -= 100;
                ari0.this.mo98409x();
            }
            if (ari0.this.f71274e == 0 && ari0.this.f71275f) {
                ari0.this.f71277h.sendEmptyMessageDelayed(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }
    }

    /* JADX INFO: renamed from: l.ari0$b */
    public class HandlerC15698b extends Handler {
        public HandlerC15698b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            ari0.this.mo98407v();
        }
    }

    public ari0(VFrame vFrame) {
        super(vFrame);
        this.f71276g = new HandlerC15697a(Looper.getMainLooper());
        this.f71277h = new HandlerC15698b(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: p */
    public void m98403p() {
        this.f71275f = false;
        this.f71276g.removeCallbacksAndMessages(null);
        this.f71277h.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: q */
    public int m98404q() {
        return (int) ((((double) this.f71274e) / ((double) this.f71273d)) * 100.0d);
    }

    /* JADX INFO: renamed from: s */
    public int m98405s() {
        return this.f71274e / 1000;
    }

    /* JADX INFO: renamed from: u */
    public String m98406u() {
        int iCeil = (int) Math.ceil(((double) this.f71274e) / 1000.0d);
        return String.format("%02d:%02d", Integer.valueOf(iCeil / 60), Integer.valueOf(iCeil % 60));
    }

    /* JADX INFO: renamed from: v */
    public void mo98407v() {
        T t = this.f134450c;
        if (t == null || t.m150494J3() == null) {
            return;
        }
        this.f134450c.m150494J3().m127020u4();
    }

    /* JADX INFO: renamed from: w */
    public void m98408w(int i, int i2) {
        if (this.f71275f) {
            return;
        }
        this.f71275f = true;
        this.f71273d = i2 * 1000;
        this.f71274e = i * 1000;
        this.f71277h.removeCallbacksAndMessages(null);
        mo98409x();
    }

    /* JADX INFO: renamed from: x */
    public void mo98409x() {
        this.f71276g.removeCallbacksAndMessages(null);
        this.f71276g.sendEmptyMessageDelayed(0, 100L);
    }
}
