package com.p006ss.bytertc.audio.device.hwearback.ovm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.NonNull;
import com.bytedance.realx.base.RXLogging;
import com.p006ss.bytertc.audio.device.base.ManufacturerChecker;
import com.p006ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OVMAuthManager extends Handler {
    private static final int OPEN_DELAY_TIME = 200;
    private static final String TAG = "OVMAuthManager";
    private static final Uri authUri = Uri.parse("content://com.oplus.ocs.out.OpenCapabilityThirdProvider/oplus");
    private static volatile OVMAuthManager sInstance;
    private List<AuthCallback> listenerList;
    private Messenger mAuthMessenger;
    private int mAuthResultCode;
    private Runnable notifyResultRunnable;

    public interface AuthCallback {
        void onResult(int i);
    }

    public static class CommonStatusCodes {
        public static final int APP_DISABLE_EXCEPTION = 1011;
        public static final int AUTHCODE_EXPECTED = 1004;
        public static final int AUTHCODE_INVALID = 1007;
        public static final int AUTHCODE_NOT_INIT = -2;
        public static final int AUTHCODE_NOT_SUPPORT = -3;
        public static final int AUTHCODE_NO_PERMISSION = -1;
        public static final int AUTHCODE_RECYCLE = 1006;
        public static final int AUTHENTICATE_FAIL = 1002;
        public static final int AUTHENTICATE_SUCCESS = 1001;
        public static final int CAPABILITY_EXCEPTION = 1008;
        public static final int INTERNAL_EXCEPTION = 1010;
        public static final int STATUS_EXCEPTION = 1009;
        public static final int TIME_EXPIRED = 1003;
        public static final int VERSION_INCOMPATIBLE = 1005;
    }

    private OVMAuthManager() {
        super(Looper.getMainLooper());
        this.mAuthResultCode = -2;
        this.mAuthMessenger = new Messenger(this);
        this.listenerList = new ArrayList();
        this.notifyResultRunnable = new Runnable() { // from class: l.b050
            @Override // java.lang.Runnable
            public final void run() {
                OVMAuthManager.m8335a(this.f5878a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8335a(OVMAuthManager oVMAuthManager) {
        ArrayList arrayList;
        synchronized (oVMAuthManager) {
            arrayList = new ArrayList(oVMAuthManager.listenerList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AuthCallback) it.next()).onResult(oVMAuthManager.mAuthResultCode);
        }
    }

    public static OVMAuthManager getInstance() {
        if (sInstance == null) {
            synchronized (OVMAuthManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new OVMAuthManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void notifyResult() {
        if (this.mAuthResultCode != -2) {
            removeCallbacks(this.notifyResultRunnable);
            postDelayed(this.notifyResultRunnable, 200L);
        }
    }

    public synchronized void addCallback(AuthCallback authCallback) {
        try {
            if (!this.listenerList.contains(authCallback)) {
                this.listenerList.add(authCallback);
            }
            notifyResult();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        synchronized (this) {
            try {
                Bundle data = message.getData();
                if (data == null) {
                    RXLogging.e(TAG, "handleMessage get bundle is null");
                } else {
                    this.mAuthResultCode = data.getInt("result_code");
                    notifyResult();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void removeCallback(AuthCallback authCallback) {
        this.listenerList.remove(authCallback);
    }

    public void startAuth(Context context, String str) {
        if (ManufacturerChecker.getManufacturerType() != ManufacturerChecker.Type.OP) {
            RXLogging.e(TAG, "no need to auth");
            this.mAuthResultCode = 1001;
            notifyResult();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("callback", this.mAuthMessenger.getBinder());
        this.mAuthResultCode = -2;
        try {
            context.getContentResolver().call(authUri, "auth", str, bundle);
        } catch (IllegalArgumentException unused) {
            RXLogging.i(TAG, "url is not exist, do not need auth ");
            this.mAuthResultCode = -3;
            notifyResult();
        } catch (RuntimeException e) {
            RXLogging.e(TAG, "auth error " + e.toString());
            this.mAuthResultCode = -1;
            notifyResult();
        }
    }
}
