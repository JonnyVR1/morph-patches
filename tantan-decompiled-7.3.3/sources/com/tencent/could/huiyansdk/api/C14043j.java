package com.tencent.could.huiyansdk.api;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.VideoSize;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.utils.C14099k;
import com.tencent.could.huiyansdk.utils.C14101m;
import com.tencent.could.huiyansdk.utils.C14102n;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.HandlerC14100l;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.j */
/* JADX INFO: loaded from: classes12.dex */
public class C14043j {

    /* JADX INFO: renamed from: a */
    public InterfaceC14040g f58190a;

    /* JADX INFO: renamed from: b */
    public HuiYanSdkConfig f58191b;

    /* JADX INFO: renamed from: c */
    public AuthUiConfig f58192c;

    /* JADX INFO: renamed from: d */
    public boolean f58193d = false;

    /* JADX INFO: renamed from: e */
    public volatile boolean f58194e = false;

    /* JADX INFO: renamed from: f */
    public InterfaceC14039f f58195f;

    /* JADX INFO: renamed from: g */
    public InterfaceC14035b f58196g;

    /* JADX INFO: renamed from: h */
    public InterfaceC14036c f58197h;

    /* JADX INFO: renamed from: i */
    public WeakReference<Context> f58198i;

    /* JADX INFO: renamed from: j */
    public HuiYanAuthTipsEvent f58199j;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14043j f58200a = new C14043j();
    }

    /* JADX INFO: renamed from: a */
    public void m83415a(HuiYanAuthEvent huiYanAuthEvent, boolean z) {
        if (huiYanAuthEvent == HuiYanAuthEvent.NONE) {
            C14068e.a.f58293a.m83520a(2, "HuiYanSdkImp", "Auth event is none");
            return;
        }
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(2, "HuiYanSdkImp", "<auth event>: " + huiYanAuthEvent);
        InterfaceC14040g interfaceC14040g = this.f58190a;
        if (interfaceC14040g != null) {
            interfaceC14040g.onAuthEvent(huiYanAuthEvent);
        }
        HuiYanSdkConfig huiYanSdkConfig = this.f58191b;
        if (huiYanSdkConfig == null || !huiYanSdkConfig.isUseTransition()) {
            return;
        }
        C14102n c14102nM83595a = C14102n.m83595a();
        c14102nM83595a.getClass();
        if (z) {
            return;
        }
        C14043j c14043j = a.f58200a;
        InterfaceC14040g interfaceC14040g2 = c14043j.f58190a;
        if (new C14101m(c14102nM83595a).contains(huiYanAuthEvent)) {
            if (c14102nM83595a.f58376a == null) {
                HandlerThread handlerThread = new HandlerThread("transition");
                c14102nM83595a.f58376a = handlerThread;
                handlerThread.start();
                c14102nM83595a.f58377b = new HandlerC14100l(c14102nM83595a, c14102nM83595a.f58376a.getLooper(), interfaceC14040g2);
            }
            long transitionTime = c14043j.m83418b().getTransitionTime();
            if (c14102nM83595a.f58377b == null) {
                return;
            }
            C14034a.m83402a().getClass();
            c14068e.m83520a(2, "a", "do pause");
            YtSDKKitFramework.getInstance().doPause();
            C14099k.b.f58374a.f58371c = true;
            c14068e.m83520a(1, "TimeOutHelper", "timeout pause");
            InterfaceC14040g interfaceC14040g3 = c14043j.f58190a;
            if (interfaceC14040g3 != null) {
                interfaceC14040g3.onBeginTransition();
            }
            try {
                Message messageObtainMessage = c14102nM83595a.f58377b.obtainMessage();
                messageObtainMessage.what = 1;
                c14102nM83595a.f58377b.sendMessageDelayed(messageObtainMessage, transitionTime);
            } catch (Exception e) {
                C14068e.a.f58293a.m83520a(2, "n", "failed to send transition event" + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public HuiYanSdkConfig m83418b() {
        if (this.f58191b == null) {
            this.f58191b = new HuiYanSdkConfig();
        }
        return this.f58191b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m83419c() {
        HuiYanSdkConfig huiYanSdkConfig = this.f58191b;
        return huiYanSdkConfig != null && huiYanSdkConfig.isOpenLongCheck() && this.f58191b.isLongCheckUseBlurMode();
    }

    /* JADX INFO: renamed from: d */
    public boolean m83420d() {
        AuthUiConfig authUiConfig = this.f58192c;
        return authUiConfig != null && authUiConfig.getVideoSize() == VideoSize.SIZE_720P;
    }

    /* JADX INFO: renamed from: e */
    public void m83421e() {
        a.f58200a.m83415a(HuiYanAuthEvent.START_AUTH, true);
        C14065b c14065b = C14065b.b.f58281a;
        c14065b.getClass();
        c14065b.m83511a(AuthState.START_CAMERA_PREVIEW, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public void m83422f() {
        if (this.f58195f != null) {
            this.f58195f = null;
        }
        if (this.f58196g != null) {
            this.f58196g = null;
        }
        this.f58194e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m83417a(String str, String str2) {
        this.f58194e = true;
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83519a();
        InterfaceC14039f interfaceC14039f = this.f58195f;
        if (interfaceC14039f != null) {
            interfaceC14039f.onCompareSuccess(str, str2);
        } else {
            c14068e.m83520a(2, "HuiYanSdkImp", "HuiYan onCompareSuccess code! ");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83416a(HuiYanAuthTipsEvent huiYanAuthTipsEvent, boolean z) {
        if (huiYanAuthTipsEvent == null || huiYanAuthTipsEvent == HuiYanAuthTipsEvent.NONE) {
            return;
        }
        if (z) {
            if (this.f58199j == huiYanAuthTipsEvent) {
                return;
            } else {
                this.f58199j = huiYanAuthTipsEvent;
            }
        }
        InterfaceC14040g interfaceC14040g = this.f58190a;
        if (interfaceC14040g != null) {
            interfaceC14040g.onAuthTipsEvent(huiYanAuthTipsEvent);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83414a(int i, String str) {
        try {
            this.f58194e = true;
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(2, "HuiYanSdkImp", "huiyan failed, code: " + i + " msg:" + str);
            if (this.f58195f != null) {
                c14068e.m83519a();
                Context context = CommonUtils.getContext();
                if (context != null && !TextUtils.isEmpty(str) && str.contains(String.valueOf(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL))) {
                    this.f58195f.onFail(229, context.getString(C14032R.string.txy_yt_face_ref_angle_detect_error));
                } else {
                    this.f58195f.onFail(i, str);
                }
            }
            m83422f();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m83413a() {
        WeakReference<Context> weakReference = this.f58198i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
