package com.tencent.could.huiyansdk.api;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.VideoSize;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.utils.C13936k;
import com.tencent.could.huiyansdk.utils.C13938m;
import com.tencent.could.huiyansdk.utils.C13939n;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.HandlerC13937l;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.j */
/* JADX INFO: loaded from: classes2.dex */
public class C13880j {

    /* JADX INFO: renamed from: a */
    public InterfaceC13877g f57342a;

    /* JADX INFO: renamed from: b */
    public HuiYanSdkConfig f57343b;

    /* JADX INFO: renamed from: c */
    public AuthUiConfig f57344c;

    /* JADX INFO: renamed from: d */
    public boolean f57345d = false;

    /* JADX INFO: renamed from: e */
    public volatile boolean f57346e = false;

    /* JADX INFO: renamed from: f */
    public InterfaceC13876f f57347f;

    /* JADX INFO: renamed from: g */
    public InterfaceC13872b f57348g;

    /* JADX INFO: renamed from: h */
    public InterfaceC13873c f57349h;

    /* JADX INFO: renamed from: i */
    public WeakReference<Context> f57350i;

    /* JADX INFO: renamed from: j */
    public HuiYanAuthTipsEvent f57351j;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.api.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13880j f57352a = new C13880j();
    }

    /* JADX INFO: renamed from: a */
    public void m82232a(HuiYanAuthEvent huiYanAuthEvent, boolean z) {
        if (huiYanAuthEvent == HuiYanAuthEvent.NONE) {
            C13905e.a.f57445a.m82337a(2, "HuiYanSdkImp", "Auth event is none");
            return;
        }
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(2, "HuiYanSdkImp", "<auth event>: " + huiYanAuthEvent);
        InterfaceC13877g interfaceC13877g = this.f57342a;
        if (interfaceC13877g != null) {
            interfaceC13877g.onAuthEvent(huiYanAuthEvent);
        }
        HuiYanSdkConfig huiYanSdkConfig = this.f57343b;
        if (huiYanSdkConfig == null || !huiYanSdkConfig.isUseTransition()) {
            return;
        }
        C13939n c13939nM82412a = C13939n.m82412a();
        c13939nM82412a.getClass();
        if (z) {
            return;
        }
        C13880j c13880j = a.f57352a;
        InterfaceC13877g interfaceC13877g2 = c13880j.f57342a;
        if (new C13938m(c13939nM82412a).contains(huiYanAuthEvent)) {
            if (c13939nM82412a.f57528a == null) {
                HandlerThread handlerThread = new HandlerThread("transition");
                c13939nM82412a.f57528a = handlerThread;
                handlerThread.start();
                c13939nM82412a.f57529b = new HandlerC13937l(c13939nM82412a, c13939nM82412a.f57528a.getLooper(), interfaceC13877g2);
            }
            long transitionTime = c13880j.m82235b().getTransitionTime();
            if (c13939nM82412a.f57529b == null) {
                return;
            }
            C13871a.m82219a().getClass();
            c13905e.m82337a(2, "a", "do pause");
            YtSDKKitFramework.getInstance().doPause();
            C13936k.b.f57526a.f57523c = true;
            c13905e.m82337a(1, "TimeOutHelper", "timeout pause");
            InterfaceC13877g interfaceC13877g3 = c13880j.f57342a;
            if (interfaceC13877g3 != null) {
                interfaceC13877g3.onBeginTransition();
            }
            try {
                Message messageObtainMessage = c13939nM82412a.f57529b.obtainMessage();
                messageObtainMessage.what = 1;
                c13939nM82412a.f57529b.sendMessageDelayed(messageObtainMessage, transitionTime);
            } catch (Exception e) {
                C13905e.a.f57445a.m82337a(2, "n", "failed to send transition event" + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public HuiYanSdkConfig m82235b() {
        if (this.f57343b == null) {
            this.f57343b = new HuiYanSdkConfig();
        }
        return this.f57343b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m82236c() {
        HuiYanSdkConfig huiYanSdkConfig = this.f57343b;
        return huiYanSdkConfig != null && huiYanSdkConfig.isOpenLongCheck() && this.f57343b.isLongCheckUseBlurMode();
    }

    /* JADX INFO: renamed from: d */
    public boolean m82237d() {
        AuthUiConfig authUiConfig = this.f57344c;
        return authUiConfig != null && authUiConfig.getVideoSize() == VideoSize.SIZE_720P;
    }

    /* JADX INFO: renamed from: e */
    public void m82238e() {
        a.f57352a.m82232a(HuiYanAuthEvent.START_AUTH, true);
        C13902b c13902b = C13902b.b.f57433a;
        c13902b.getClass();
        c13902b.m82328a(AuthState.START_CAMERA_PREVIEW, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public void m82239f() {
        if (this.f57347f != null) {
            this.f57347f = null;
        }
        if (this.f57348g != null) {
            this.f57348g = null;
        }
        this.f57346e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m82234a(String str, String str2) {
        this.f57346e = true;
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82336a();
        InterfaceC13876f interfaceC13876f = this.f57347f;
        if (interfaceC13876f != null) {
            interfaceC13876f.onCompareSuccess(str, str2);
        } else {
            c13905e.m82337a(2, "HuiYanSdkImp", "HuiYan onCompareSuccess code! ");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82233a(HuiYanAuthTipsEvent huiYanAuthTipsEvent, boolean z) {
        if (huiYanAuthTipsEvent == null || huiYanAuthTipsEvent == HuiYanAuthTipsEvent.NONE) {
            return;
        }
        if (z) {
            if (this.f57351j == huiYanAuthTipsEvent) {
                return;
            } else {
                this.f57351j = huiYanAuthTipsEvent;
            }
        }
        InterfaceC13877g interfaceC13877g = this.f57342a;
        if (interfaceC13877g != null) {
            interfaceC13877g.onAuthTipsEvent(huiYanAuthTipsEvent);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m82231a(int i, String str) {
        try {
            this.f57346e = true;
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(2, "HuiYanSdkImp", "huiyan failed, code: " + i + " msg:" + str);
            if (this.f57347f != null) {
                c13905e.m82336a();
                Context context = CommonUtils.getContext();
                if (context != null && !TextUtils.isEmpty(str) && str.contains(String.valueOf(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL))) {
                    this.f57347f.onFail(229, context.getString(C13869R.string.txy_yt_face_ref_angle_detect_error));
                } else {
                    this.f57347f.onFail(i, str);
                }
            }
            m82239f();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m82230a() {
        WeakReference<Context> weakReference = this.f57350i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
