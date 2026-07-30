package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import p151v.VFrame;
import p153l.ouj0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d0j0<T extends ouj0> extends puj0<T> {

    /* JADX INFO: renamed from: d */
    public int f84567d;

    /* JADX INFO: renamed from: e */
    public int f84568e;

    /* JADX INFO: renamed from: f */
    public boolean f84569f;

    /* JADX INFO: renamed from: g */
    public Handler f84570g;

    /* JADX INFO: renamed from: h */
    public Handler f84571h;

    /* JADX INFO: renamed from: l.d0j0$a */
    public class HandlerC16407a extends Handler {
        public HandlerC16407a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (d0j0.this.f84568e > 0) {
                d0j0.this.f84568e -= 100;
                d0j0.this.mo106724x();
            }
            if (d0j0.this.f84568e == 0 && d0j0.this.f84569f) {
                d0j0.this.f84571h.sendEmptyMessageDelayed(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
        }
    }

    /* JADX INFO: renamed from: l.d0j0$b */
    public class HandlerC16408b extends Handler {
        public HandlerC16408b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            d0j0.this.mo113408v();
        }
    }

    public d0j0(VFrame vFrame) {
        super(vFrame);
        this.f84570g = new HandlerC16407a(Looper.getMainLooper());
        this.f84571h = new HandlerC16408b(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: p */
    public void m113404p() {
        this.f84569f = false;
        this.f84570g.removeCallbacksAndMessages(null);
        this.f84571h.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: q */
    public int m113405q() {
        return (int) ((((double) this.f84568e) / ((double) this.f84567d)) * 100.0d);
    }

    /* JADX INFO: renamed from: s */
    public int m113406s() {
        return this.f84568e / 1000;
    }

    /* JADX INFO: renamed from: u */
    public String m113407u() {
        int iCeil = (int) Math.ceil(((double) this.f84568e) / 1000.0d);
        return String.format("%02d:%02d", Integer.valueOf(iCeil / 60), Integer.valueOf(iCeil % 60));
    }

    /* JADX INFO: renamed from: v */
    public void mo113408v() {
        T t = this.f154194c;
        if (t == null || t.m169312J3() == null) {
            return;
        }
        this.f154194c.m169312J3().m147074u4();
    }

    /* JADX INFO: renamed from: w */
    public void m113409w(int i, int i2) {
        if (this.f84569f) {
            return;
        }
        this.f84569f = true;
        this.f84567d = i2 * 1000;
        this.f84568e = i * 1000;
        this.f84571h.removeCallbacksAndMessages(null);
        mo106724x();
    }

    /* JADX INFO: renamed from: x */
    public void mo106724x() {
        this.f84570g.removeCallbacksAndMessages(null);
        this.f84570g.sendEmptyMessageDelayed(0, 100L);
    }
}
