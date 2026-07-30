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
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.api.InterfaceC13873c;
import com.tencent.could.huiyansdk.api.InterfaceC13874d;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.manager.C13906f;
import com.tencent.could.huiyansdk.turing.AbstractC13920b;
import com.tencent.could.huiyansdk.turing.C13924f;
import com.tencent.could.huiyansdk.turing.EmptyTuringHelper;
import com.tencent.could.huiyansdk.turing.InterfaceC13919a;
import com.tencent.could.huiyansdk.utils.C13927b;
import com.tencent.could.huiyansdk.utils.C13934i;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.view.CameraDateBotGatherView;
import com.tencent.could.huiyansdk.view.HudView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13895e implements CameraEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57396a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.e$a */
    public class a implements InterfaceC13874d {
        public a(C13895e c13895e) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.e$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AuthingFragment authingFragment = C13895e.this.f57396a;
            if (authingFragment.f57368b != null) {
                authingFragment.m82281c();
            }
            C13895e.this.f57396a.m82285k();
            C13895e.this.f57396a.m82280b(false);
            if (C13895e.this.f57396a.f57375i == null) {
                return;
            }
            AuthUiConfig authUiConfig = C13880j.a.f57352a.f57344c;
            if (authUiConfig == null || !authUiConfig.isHideFrontCircleViewOnCheck()) {
                C13895e.this.f57396a.f57375i.setVisibility(0);
            } else {
                C13895e.this.f57396a.f57375i.setVisibility(8);
            }
        }
    }

    public C13895e(AuthingFragment authingFragment) {
        this.f57396a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82293a() {
        String str;
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "AuthingFragment", "on get camera succeed!");
        C13924f c13924f = C13924f.a.f57496a;
        int i = 0;
        if (!c13924f.f57491j || c13924f.f57488g == null) {
            StringBuilder sb = new StringBuilder("get auth error info, turing is not create! ");
            sb.append(c13924f.f57491j);
            sb.append(", ");
            sb.append(c13924f.f57488g == null);
            c13905e.m82337a(2, "TuringSdkHelper", sb.toString());
            str = "init error";
        } else {
            ((EmptyTuringHelper) c13924f.f57488g).getClass();
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            HuiYanBaseConfig huiYanBaseConfig = HuiYanBaseApi.C13881a.f57357a.f57355c;
            if (huiYanBaseConfig == null ? true : huiYanBaseConfig.isOpenCheckRiskMode()) {
                c13905e.m82337a(2, "AuthingFragment", "turing auth error!");
                CommonUtils.sendErrorAndExitAuth(231, this.f57396a.getString(C13869R.string.txy_turing_auth_lic_error) + " error: " + str);
                return;
            }
        }
        if (C13887a.a.f57364a.f57362e) {
            c13905e.m82337a(2, "AuthingFragment", "get config first.");
            C13880j c13880j = C13880j.a.f57352a;
            a aVar = new a(this);
            InterfaceC13872b interfaceC13872b = c13880j.f57348g;
            if (interfaceC13872b != null) {
                interfaceC13872b.onPrepare(aVar);
                return;
            }
            return;
        }
        c13905e.m82337a(2, "AuthingFragment", "not get config first.");
        AuthingFragment authingFragment = this.f57396a;
        View turingPreviewView = (View) authingFragment.f57367a;
        CameraHolder cameraHolder = authingFragment.f57383q;
        c13924f.f57492k = false;
        if (!c13924f.f57491j) {
            c13905e.m82337a(2, "TuringSdkHelper", "start turing face defender, turing is not create!");
            i = -701;
        } else if (c13924f.f57488g == null) {
            c13905e.m82337a(2, "TuringSdkHelper", "start turing face defender, turing interface is null");
            i = -702;
        } else {
            new WeakReference(turingPreviewView);
            try {
                Camera.Size cameraSize = cameraHolder.getCameraSize();
                C13906f c13906f = c13924f.f57489h;
                if (c13906f != null) {
                    c13906f.m82349a(cameraSize.width, cameraSize.height, cameraHolder.getCurrentRotate());
                }
                C13880j c13880j2 = C13880j.a.f57352a;
                HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j2.m82235b();
                if (huiYanSdkConfigM82235b != null) {
                    c13924f.f57482a = huiYanSdkConfigM82235b.getCheckEnvRiskTimeout();
                    c13905e.m82337a(1, "TuringSdkHelper", "update defaultTuringTimeOut: " + c13924f.f57482a);
                }
                HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
                HuiYanBaseConfig huiYanBaseConfig2 = huiYanBaseApi.f57355c;
                if (!(huiYanBaseConfig2 == null ? true : huiYanBaseConfig2.isOpenCheckRiskMode())) {
                    c13924f.f57482a = 300L;
                }
                c13924f.f57495n = System.currentTimeMillis();
                if (c13924f.f57494m != null) {
                    Message messageObtainMessage = c13924f.f57494m.obtainMessage();
                    messageObtainMessage.what = 5;
                    c13924f.f57494m.sendMessageDelayed(messageObtainMessage, c13924f.f57482a);
                    HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f57354b;
                    if (huiYanBaseCallBack != null) {
                        huiYanBaseCallBack.onOperateTimeEvent("GetTuringTokenUseTime", 1, false, "");
                    }
                } else {
                    c13905e.m82337a(2, "TuringSdkHelper", "start turing face defender, handler == null!");
                }
                InterfaceC13873c interfaceC13873c = c13880j2.f57349h;
                if (turingPreviewView instanceof CameraDateBotGatherView) {
                    turingPreviewView = ((CameraDateBotGatherView) turingPreviewView).getTuringPreviewView();
                }
                AbstractC13920b abstractC13920b = c13924f.f57488g;
                try {
                    if (interfaceC13873c == null) {
                        abstractC13920b.mo82377a(turingPreviewView, cameraHolder, "");
                    } else {
                        abstractC13920b.mo82377a(turingPreviewView, cameraHolder, interfaceC13873c.getCurrentToken());
                    }
                } catch (Exception e) {
                    C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "start turing face defender, error: " + e.getLocalizedMessage());
                    i = -706;
                }
            } catch (RuntimeException e2) {
                C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "camera get parameters with error: " + e2.getLocalizedMessage());
                i = -705;
            }
        }
        if (i != 0) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "failed to start turing face defender!");
            CommonUtils.sendErrorAndExitAuth(213, authingFragment.getResString(C13869R.string.txy_inner_error) + "(startTuring fail: " + i + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82295b() {
        HudView hudView = this.f57396a.f57373g;
        hudView.f57566c++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - hudView.f57565b;
        if (j >= 1000) {
            int i = (hudView.f57566c * 1000) / ((int) j);
            hudView.f57566c = 0;
            hudView.f57565b = jCurrentTimeMillis;
            TextView textView = hudView.f57564a;
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
        this.f57396a.runOnUiThread(new Runnable() { // from class: l.wqq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187718a.m82293a();
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
        HuiYanSdkConfig huiYanSdkConfigM82235b = C13880j.a.f57352a.m82235b();
        if (huiYanSdkConfigM82235b != null && huiYanSdkConfigM82235b.isShowDebugView()) {
            AuthingFragment authingFragment = this.f57396a;
            if (authingFragment.f57373g != null) {
                authingFragment.runOnUiThread(new Runnable() { // from class: l.vqq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f182670a.m82295b();
                    }
                });
            }
        }
        if (huiYanSdkConfigM82235b == null || huiYanSdkConfigM82235b.isJustCheckRawCamera()) {
            return;
        }
        C13924f c13924f = C13924f.a.f57496a;
        if (c13924f.f57491j && c13924f.f57488g != null) {
            if (c13924f.f57494m == null) {
                C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "cancelWaitFirstFrameTimeOut handler == null!");
            } else if (!c13924f.f57485d) {
                c13924f.f57485d = true;
                C13905e.a.f57445a.m82337a(1, "TuringSdkHelper", "remove first frame time out event!");
                c13924f.f57494m.removeMessages(3);
                C13906f c13906f = c13924f.f57489h;
                if (c13906f != null) {
                    c13906f.m82361h();
                }
            }
            C13927b c13927b = C13927b.a.f57501a;
            synchronized (C13927b.class) {
                try {
                    C13934i<byte[]> c13934i = c13927b.f57500a;
                    bArrAcquire = c13934i == null ? null : c13934i.acquire();
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
            if (c13924f.f57483b) {
                if (c13924f.f57488g != null) {
                    ((EmptyTuringHelper) c13924f.f57488g).getClass();
                }
                C13906f c13906f2 = c13924f.f57489h;
                if (c13906f2 != null) {
                    if (c13906f2.m82360d() || c13906f2.f57455j) {
                        C13927b.a.f57501a.m82391a(bArrAcquire);
                    } else {
                        int i2 = c13906f2.f57457l;
                        if (i2 < 5) {
                            c13906f2.f57457l = i2 + 1;
                            C13927b.a.f57501a.m82391a(bArrAcquire);
                        } else {
                            if (c13906f2.f57446a.size() >= 10 && (bArrPoll = c13906f2.f57446a.poll()) != null) {
                                C13927b.a.f57501a.m82391a(bArrPoll);
                            }
                            c13906f2.f57446a.add(bArrAcquire);
                        }
                    }
                }
            }
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        Camera.Size cameraSize = this.f57396a.f57383q.getCameraSize();
        huiYanBaseApi.getClass();
        C13900b.a.f57405a.getClass();
        if (cameraSize == null) {
            Log.e("YouTuSdkHelper", "input camera error! size is null");
        } else {
            YtSDKKitFramework.getInstance().updateWithFrameData(bArr, cameraSize.width, cameraSize.height, 1);
        }
        if (C13880j.a.f57352a.m82236c()) {
            InterfaceC13919a interfaceC13919a = this.f57396a.f57367a;
            if (interfaceC13919a instanceof CameraDateBotGatherView) {
                ((CameraDateBotGatherView) interfaceC13919a).m82417b(bArr);
            }
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onEventError(int i, String str) {
        int i2;
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "AuthingFragment", "onEventError: " + i + " msg: " + str);
        if (i == 4 || i == 5) {
            c13905e.m82337a(2, "AuthingFragment", str);
            return;
        }
        int i3 = i == 3 ? 214 : 215;
        int i4 = C13869R.string.txy_inner_error;
        if (i == 7) {
            i2 = C13869R.string.txy_set_display_orientation_error;
            i3 = 230;
        } else {
            i2 = i4;
        }
        if (i3 == 214) {
            i2 = C13869R.string.txy_do_not_change_app_in_auth;
        }
        if (i3 == 215) {
            i2 = C13869R.string.txy_get_or_init_camera_error;
        }
        if (this.f57396a.getContext() == null) {
            c13905e.m82337a(2, "AuthingFragment", "camera on error context is null! code " + i3);
            CommonUtils.sendErrorAndExitAuth(213, this.f57396a.getResString(i4) + " camera error code: " + i3);
            return;
        }
        String resString = this.f57396a.getResString(i2);
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorMsg(resString);
        compareResult.setErrorCode(i3);
        this.f57396a.m82279b((Object) compareResult);
        C13880j c13880j = C13880j.a.f57352a;
        InterfaceC13872b interfaceC13872b = c13880j.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "OpenCameraError", resString);
        }
        InterfaceC13872b interfaceC13872b2 = c13880j.f57348g;
        if (interfaceC13872b2 != null) {
            interfaceC13872b2.updateOperateInfo("StartCamera", 1, 0L, resString);
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onPreviewSucceed() {
        new WeakReference(this.f57396a.f57383q.getCurrentCamera());
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "AuthingFragment", "on preview succeed!");
        C13880j c13880j = C13880j.a.f57352a;
        InterfaceC13872b interfaceC13872b = c13880j.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "OpenCameraSuccess", "");
        }
        InterfaceC13872b interfaceC13872b2 = c13880j.f57348g;
        if (interfaceC13872b2 != null) {
            interfaceC13872b2.updateOperateInfo("StartCamera", 1, 1L, "");
        }
        C13924f c13924f = C13924f.a.f57496a;
        if (c13924f.f57494m == null) {
            c13905e.m82337a(2, "TuringSdkHelper", "startTimeOutForWaitFirstFrame handler == null!");
        } else {
            c13905e.m82337a(1, "TuringSdkHelper", "start set event first frame time out!");
            Message messageObtainMessage = c13924f.f57494m.obtainMessage();
            messageObtainMessage.what = 3;
            c13924f.f57494m.sendMessageDelayed(messageObtainMessage, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
        C13902b.b.f57433a.f57421l = c13924f.f57489h;
        c13905e.m82337a(1, "AuthingFragment", "start PrepareFaceTimeOutMs");
        this.f57396a.m82277b(c13880j.m82235b().getPrepareFaceTimeOutMs(), c13880j.m82235b().isShowPrepareTimeout());
        this.f57396a.runOnUiThread(new b());
    }
}
