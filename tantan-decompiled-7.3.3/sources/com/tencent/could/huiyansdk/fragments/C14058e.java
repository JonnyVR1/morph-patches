package com.tencent.could.huiyansdk.fragments;

import android.hardware.Camera;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.api.InterfaceC14036c;
import com.tencent.could.huiyansdk.api.InterfaceC14037d;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.manager.C14069f;
import com.tencent.could.huiyansdk.turing.AbstractC14083b;
import com.tencent.could.huiyansdk.turing.C14087f;
import com.tencent.could.huiyansdk.turing.EmptyTuringHelper;
import com.tencent.could.huiyansdk.turing.InterfaceC14082a;
import com.tencent.could.huiyansdk.utils.C14090b;
import com.tencent.could.huiyansdk.utils.C14097i;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.view.CameraDateBotGatherView;
import com.tencent.could.huiyansdk.view.HudView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.e */
/* JADX INFO: loaded from: classes12.dex */
public class C14058e implements CameraEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58244a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.e$a */
    public class a implements InterfaceC14037d {
        public a(C14058e c14058e) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.e$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AuthingFragment authingFragment = C14058e.this.f58244a;
            if (authingFragment.f58216b != null) {
                authingFragment.m83464c();
            }
            C14058e.this.f58244a.m83468k();
            C14058e.this.f58244a.m83463b(false);
            if (C14058e.this.f58244a.f58223i == null) {
                return;
            }
            AuthUiConfig authUiConfig = C14043j.a.f58200a.f58192c;
            if (authUiConfig == null || !authUiConfig.isHideFrontCircleViewOnCheck()) {
                C14058e.this.f58244a.f58223i.setVisibility(0);
            } else {
                C14058e.this.f58244a.f58223i.setVisibility(8);
            }
        }
    }

    public C14058e(AuthingFragment authingFragment) {
        this.f58244a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83476a() {
        String str;
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "AuthingFragment", "on get camera succeed!");
        C14087f c14087f = C14087f.a.f58344a;
        int i = 0;
        if (!c14087f.f58339j || c14087f.f58336g == null) {
            StringBuilder sb = new StringBuilder("get auth error info, turing is not create! ");
            sb.append(c14087f.f58339j);
            sb.append(", ");
            sb.append(c14087f.f58336g == null);
            c14068e.m83520a(2, "TuringSdkHelper", sb.toString());
            str = "init error";
        } else {
            ((EmptyTuringHelper) c14087f.f58336g).getClass();
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            HuiYanBaseConfig huiYanBaseConfig = HuiYanBaseApi.C14044a.f58205a.f58203c;
            if (huiYanBaseConfig == null ? true : huiYanBaseConfig.isOpenCheckRiskMode()) {
                c14068e.m83520a(2, "AuthingFragment", "turing auth error!");
                CommonUtils.sendErrorAndExitAuth(231, this.f58244a.getString(C14032R.string.txy_turing_auth_lic_error) + " error: " + str);
                return;
            }
        }
        if (C14050a.a.f58212a.f58210e) {
            c14068e.m83520a(2, "AuthingFragment", "get config first.");
            C14043j c14043j = C14043j.a.f58200a;
            a aVar = new a(this);
            InterfaceC14035b interfaceC14035b = c14043j.f58196g;
            if (interfaceC14035b != null) {
                interfaceC14035b.onPrepare(aVar);
                return;
            }
            return;
        }
        c14068e.m83520a(2, "AuthingFragment", "not get config first.");
        AuthingFragment authingFragment = this.f58244a;
        View turingPreviewView = (View) authingFragment.f58215a;
        CameraHolder cameraHolder = authingFragment.f58231q;
        c14087f.f58340k = false;
        if (!c14087f.f58339j) {
            c14068e.m83520a(2, "TuringSdkHelper", "start turing face defender, turing is not create!");
            i = -701;
        } else if (c14087f.f58336g == null) {
            c14068e.m83520a(2, "TuringSdkHelper", "start turing face defender, turing interface is null");
            i = -702;
        } else {
            new WeakReference(turingPreviewView);
            try {
                Camera.Size cameraSize = cameraHolder.getCameraSize();
                C14069f c14069f = c14087f.f58337h;
                if (c14069f != null) {
                    c14069f.m83532a(cameraSize.width, cameraSize.height, cameraHolder.getCurrentRotate());
                }
                C14043j c14043j2 = C14043j.a.f58200a;
                HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j2.m83418b();
                if (huiYanSdkConfigM83418b != null) {
                    c14087f.f58330a = huiYanSdkConfigM83418b.getCheckEnvRiskTimeout();
                    c14068e.m83520a(1, "TuringSdkHelper", "update defaultTuringTimeOut: " + c14087f.f58330a);
                }
                HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
                HuiYanBaseConfig huiYanBaseConfig2 = huiYanBaseApi.f58203c;
                if (!(huiYanBaseConfig2 == null ? true : huiYanBaseConfig2.isOpenCheckRiskMode())) {
                    c14087f.f58330a = 300L;
                }
                c14087f.f58343n = System.currentTimeMillis();
                if (c14087f.f58342m != null) {
                    Message messageObtainMessage = c14087f.f58342m.obtainMessage();
                    messageObtainMessage.what = 5;
                    c14087f.f58342m.sendMessageDelayed(messageObtainMessage, c14087f.f58330a);
                    HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f58202b;
                    if (huiYanBaseCallBack != null) {
                        huiYanBaseCallBack.onOperateTimeEvent("GetTuringTokenUseTime", 1, false, "");
                    }
                } else {
                    c14068e.m83520a(2, "TuringSdkHelper", "start turing face defender, handler == null!");
                }
                InterfaceC14036c interfaceC14036c = c14043j2.f58197h;
                if (turingPreviewView instanceof CameraDateBotGatherView) {
                    turingPreviewView = ((CameraDateBotGatherView) turingPreviewView).getTuringPreviewView();
                }
                AbstractC14083b abstractC14083b = c14087f.f58336g;
                try {
                    if (interfaceC14036c == null) {
                        abstractC14083b.mo83560a(turingPreviewView, cameraHolder, "");
                    } else {
                        abstractC14083b.mo83560a(turingPreviewView, cameraHolder, interfaceC14036c.getCurrentToken());
                    }
                } catch (Exception e) {
                    C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "start turing face defender, error: " + e.getLocalizedMessage());
                    i = -706;
                }
            } catch (RuntimeException e2) {
                C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "camera get parameters with error: " + e2.getLocalizedMessage());
                i = -705;
            }
        }
        if (i != 0) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "failed to start turing face defender!");
            CommonUtils.sendErrorAndExitAuth(213, authingFragment.getResString(C14032R.string.txy_inner_error) + "(startTuring fail: " + i + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83478b() {
        HudView hudView = this.f58244a.f58221g;
        hudView.f58414c++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - hudView.f58413b;
        if (j >= 1000) {
            int i = (hudView.f58414c * 1000) / ((int) j);
            hudView.f58414c = 0;
            hudView.f58413b = jCurrentTimeMillis;
            TextView textView = hudView.f58412a;
            if (textView != null) {
                textView.setText("current fps: " + i);
                hudView.invalidate();
            }
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onAutoFocusSucceed() {
        Log.e("AuthingFragment", "auto focus success!");
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onCameraClosed() {
        Log.e("AuthingFragment", "close camera success!");
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onCameraSucceed() {
        this.f58244a.runOnUiThread(new Runnable() { // from class: l.c0r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79294a.m83476a();
            }
        });
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onDataFrameCallBack(byte[] bArr) {
        byte[] bArrAcquire;
        byte[] bArrPoll;
        if (bArr == null) {
            return;
        }
        HuiYanSdkConfig huiYanSdkConfigM83418b = C14043j.a.f58200a.m83418b();
        if (huiYanSdkConfigM83418b != null && huiYanSdkConfigM83418b.isShowDebugView()) {
            AuthingFragment authingFragment = this.f58244a;
            if (authingFragment.f58221g != null) {
                authingFragment.runOnUiThread(new Runnable() { // from class: l.b0r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f74290a.m83478b();
                    }
                });
            }
        }
        if (huiYanSdkConfigM83418b == null || huiYanSdkConfigM83418b.isJustCheckRawCamera()) {
            return;
        }
        C14087f c14087f = C14087f.a.f58344a;
        if (c14087f.f58339j && c14087f.f58336g != null) {
            if (c14087f.f58342m == null) {
                C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "cancelWaitFirstFrameTimeOut handler == null!");
            } else if (!c14087f.f58333d) {
                c14087f.f58333d = true;
                C14068e.a.f58293a.m83520a(1, "TuringSdkHelper", "remove first frame time out event!");
                c14087f.f58342m.removeMessages(3);
                C14069f c14069f = c14087f.f58337h;
                if (c14069f != null) {
                    c14069f.m83544h();
                }
            }
            C14090b c14090b = C14090b.a.f58349a;
            synchronized (C14090b.class) {
                try {
                    C14097i<byte[]> c14097i = c14090b.f58348a;
                    bArrAcquire = c14097i == null ? null : c14097i.acquire();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bArrAcquire == null) {
                bArrAcquire = (byte[]) bArr.clone();
            } else {
                for (int i = 0; i < bArr.length; i++) {
                    bArrAcquire[i] = bArr[i];
                }
            }
            if (c14087f.f58331b) {
                if (c14087f.f58336g != null) {
                    ((EmptyTuringHelper) c14087f.f58336g).getClass();
                }
                C14069f c14069f2 = c14087f.f58337h;
                if (c14069f2 != null) {
                    if (c14069f2.m83543d() || c14069f2.f58303j) {
                        C14090b.a.f58349a.m83574a(bArrAcquire);
                    } else {
                        int i2 = c14069f2.f58305l;
                        if (i2 < 5) {
                            c14069f2.f58305l = i2 + 1;
                            C14090b.a.f58349a.m83574a(bArrAcquire);
                        } else {
                            if (c14069f2.f58294a.size() >= 10 && (bArrPoll = c14069f2.f58294a.poll()) != null) {
                                C14090b.a.f58349a.m83574a(bArrPoll);
                            }
                            c14069f2.f58294a.add(bArrAcquire);
                        }
                    }
                }
            }
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        Camera.Size cameraSize = this.f58244a.f58231q.getCameraSize();
        huiYanBaseApi.getClass();
        C14063b.a.f58253a.getClass();
        if (cameraSize == null) {
            Log.e("YouTuSdkHelper", "input camera error! size is null");
        } else {
            YtSDKKitFramework.getInstance().updateWithFrameData(bArr, cameraSize.width, cameraSize.height, 1);
        }
        if (C14043j.a.f58200a.m83419c()) {
            InterfaceC14082a interfaceC14082a = this.f58244a.f58215a;
            if (interfaceC14082a instanceof CameraDateBotGatherView) {
                ((CameraDateBotGatherView) interfaceC14082a).m83600b(bArr);
            }
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onEventError(int i, String str) {
        int i2;
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "AuthingFragment", "onEventError: " + i + " msg: " + str);
        if (i == 4 || i == 5) {
            c14068e.m83520a(2, "AuthingFragment", str);
            return;
        }
        int i3 = i == 3 ? 214 : 215;
        int i4 = C14032R.string.txy_inner_error;
        if (i == 7) {
            i2 = C14032R.string.txy_set_display_orientation_error;
            i3 = 230;
        } else {
            i2 = i4;
        }
        if (i3 == 214) {
            i2 = C14032R.string.txy_do_not_change_app_in_auth;
        }
        if (i3 == 215) {
            i2 = C14032R.string.txy_get_or_init_camera_error;
        }
        if (this.f58244a.getContext() == null) {
            c14068e.m83520a(2, "AuthingFragment", "camera on error context is null! code " + i3);
            CommonUtils.sendErrorAndExitAuth(213, this.f58244a.getResString(i4) + " camera error code: " + i3);
            return;
        }
        String resString = this.f58244a.getResString(i2);
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorMsg(resString);
        compareResult.setErrorCode(i3);
        this.f58244a.m83462b((Object) compareResult);
        C14043j c14043j = C14043j.a.f58200a;
        InterfaceC14035b interfaceC14035b = c14043j.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "OpenCameraError", resString);
        }
        InterfaceC14035b interfaceC14035b2 = c14043j.f58196g;
        if (interfaceC14035b2 != null) {
            interfaceC14035b2.updateOperateInfo("StartCamera", 1, 0L, resString);
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onPreviewSucceed() {
        new WeakReference(this.f58244a.f58231q.getCurrentCamera());
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "AuthingFragment", "on preview succeed!");
        C14043j c14043j = C14043j.a.f58200a;
        InterfaceC14035b interfaceC14035b = c14043j.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "OpenCameraSuccess", "");
        }
        InterfaceC14035b interfaceC14035b2 = c14043j.f58196g;
        if (interfaceC14035b2 != null) {
            interfaceC14035b2.updateOperateInfo("StartCamera", 1, 1L, "");
        }
        C14087f c14087f = C14087f.a.f58344a;
        if (c14087f.f58342m == null) {
            c14068e.m83520a(2, "TuringSdkHelper", "startTimeOutForWaitFirstFrame handler == null!");
        } else {
            c14068e.m83520a(1, "TuringSdkHelper", "start set event first frame time out!");
            Message messageObtainMessage = c14087f.f58342m.obtainMessage();
            messageObtainMessage.what = 3;
            c14087f.f58342m.sendMessageDelayed(messageObtainMessage, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
        C14065b.b.f58281a.f58269l = c14087f.f58337h;
        c14068e.m83520a(1, "AuthingFragment", "start PrepareFaceTimeOutMs");
        this.f58244a.m83460b(c14043j.m83418b().getPrepareFaceTimeOutMs(), c14043j.m83418b().isShowPrepareTimeout());
        this.f58244a.runOnUiThread(new b());
    }
}
