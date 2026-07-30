package com.tencent.could.huiyansdk.fragments;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.HandlerThread;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.api.InterfaceC13873c;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.callback.InterfaceC13882a;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.enums.PackageTest;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import com.tencent.could.huiyansdk.helper.C13899a;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13904d;
import com.tencent.could.huiyansdk.manager.C13904d.a;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.manager.C13906f;
import com.tencent.could.huiyansdk.permission.C13918c;
import com.tencent.could.huiyansdk.turing.C13922d;
import com.tencent.could.huiyansdk.turing.C13924f;
import com.tencent.could.huiyansdk.turing.HandlerC13923e;
import com.tencent.could.huiyansdk.turing.InterfaceC13919a;
import com.tencent.could.huiyansdk.utils.C13926a;
import com.tencent.could.huiyansdk.utils.C13927b;
import com.tencent.could.huiyansdk.utils.C13931f;
import com.tencent.could.huiyansdk.utils.C13933h;
import com.tencent.could.huiyansdk.utils.C13934i;
import com.tencent.could.huiyansdk.utils.C13936k;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.HandlerC13932g;
import com.tencent.could.huiyansdk.view.CameraDateGatherView;
import com.tencent.could.huiyansdk.view.DialogC13942b;
import com.tencent.could.huiyansdk.view.HudView;
import com.tencent.could.huiyansdk.view.HuiYanReflectLayout;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.Primes;
import p149l.b50;
import p149l.e16;
import p149l.otb;

/* JADX INFO: loaded from: classes2.dex */
public class AuthingFragment extends BaseFragment {

    /* JADX INFO: renamed from: a */
    public InterfaceC13919a f57367a;

    /* JADX INFO: renamed from: b */
    public ImageView f57368b;

    /* JADX INFO: renamed from: c */
    public TextView f57369c;

    /* JADX INFO: renamed from: d */
    public TextView f57370d;

    /* JADX INFO: renamed from: e */
    public TextView f57371e;

    /* JADX INFO: renamed from: f */
    public TextView f57372f;

    /* JADX INFO: renamed from: g */
    public HudView f57373g;

    /* JADX INFO: renamed from: h */
    public HuiYanReflectLayout f57374h;

    /* JADX INFO: renamed from: i */
    public LoadingFrontAnimatorView f57375i;

    /* JADX INFO: renamed from: p */
    public C13933h f57382p;

    /* JADX INFO: renamed from: q */
    public CameraHolder f57383q;

    /* JADX INFO: renamed from: r */
    public DialogC13942b f57384r;

    /* JADX INFO: renamed from: v */
    public AnimationDrawable f57388v;

    /* JADX INFO: renamed from: j */
    public volatile boolean f57376j = false;

    /* JADX INFO: renamed from: k */
    public int f57377k = -1;

    /* JADX INFO: renamed from: l */
    public boolean f57378l = false;

    /* JADX INFO: renamed from: m */
    public volatile boolean f57379m = false;

    /* JADX INFO: renamed from: n */
    public volatile boolean f57380n = false;

    /* JADX INFO: renamed from: o */
    public volatile boolean f57381o = false;

    /* JADX INFO: renamed from: s */
    public boolean f57385s = false;

    /* JADX INFO: renamed from: t */
    public volatile boolean f57386t = false;

    /* JADX INFO: renamed from: u */
    public volatile boolean f57387u = false;

    /* JADX INFO: renamed from: w */
    public int f57389w = 0;

    /* JADX INFO: renamed from: x */
    public volatile boolean f57390x = false;

    /* JADX INFO: renamed from: y */
    public volatile boolean f57391y = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82257a(AuthState authState, Object obj) {
        switch (authState) {
            case PREPARE:
                C13905e c13905e = C13905e.a.f57445a;
                c13905e.m82337a(1, "AuthingFragment", ">>>start prepare event");
                if (this.f57375i != null) {
                    AuthUiConfig authUiConfig = C13880j.a.f57352a.f57344c;
                    if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnStart()) {
                        this.f57375i.setVisibility(8);
                    } else {
                        this.f57375i.m82426b();
                    }
                } else {
                    c13905e.m82337a(2, "AuthingFragment", "loadingFrontAnimatorView is null!");
                }
                break;
            case START_GET_LIVE_TYPE:
                if (!this.f57387u) {
                    C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>start auth and get live info");
                    YtSDKKitFramework.YtSDKPlatformContext platformContext = YtSDKKitFramework.getInstance().getPlatformContext();
                    CameraHolder cameraHolder = this.f57383q;
                    if (cameraHolder != null) {
                        platformContext.currentCamera = cameraHolder.getCurrentCamera();
                        platformContext.currentCameraId = this.f57383q.getCameraId();
                        platformContext.currentRotateState = this.f57383q.getCurrentRotate();
                        platformContext.currentAppContext = HuiYanBaseApi.C13881a.f57357a.m82240a();
                    }
                    platformContext.reflectListener = new C13897g(this);
                    platformContext.baseFunctionListener = new C13898h(this);
                    C13902b c13902b = C13902b.b.f57433a;
                    c13902b.getClass();
                    c13902b.f57423n = HuiYanAuthTipsEvent.NONE;
                    HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
                    huiYanBaseApi.getClass();
                    C13900b c13900b = C13900b.a.f57405a;
                    c13900b.getClass();
                    HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f57354b;
                    if (huiYanBaseCallBack != null) {
                        huiYanBaseCallBack.onOperateTimeEvent("GetConfigUseTime", 1, false, "");
                    }
                    int iM82311a = c13900b.m82311a(platformContext, c13900b.m82318b(), new C13899a(c13900b));
                    if (iM82311a != 0) {
                        CommonUtils.sendErrorAndExitAuth(Primes.SMALL_FACTOR_LIMIT, "YtSDKKitFramework init error ! code: " + iM82311a);
                    } else if (huiYanBaseApi.m82243b() != HuiYanLiveMode.ACTION_REFLECT_MODE) {
                        C13880j.a.f57352a.m82232a(HuiYanAuthEvent.START_AUTH, true);
                        c13902b.getClass();
                        c13902b.m82328a(AuthState.START_CAMERA_PREVIEW, (Object) null);
                    }
                    this.f57387u = true;
                } else {
                    C13905e.a.f57445a.m82337a(1, "AuthingFragment", "has started auth and got live info");
                }
                break;
            case START_CAMERA_PREVIEW:
                m82282h();
                break;
            case AUTH_ACTION:
                m82283i();
                break;
            case ON_FIRST_FOUND_FACE:
                C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>first found the face. start AuthTimeOutMs");
                break;
            case ON_ENTRY_OTHER_ACTION:
                this.f57379m = true;
                C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>enter other action. start AuthTimeOutMs");
                C13880j c13880j = C13880j.a.f57352a;
                m82277b(c13880j.m82235b().getAuthTimeOutMs(), c13880j.m82235b().isShowActionTimeout());
                break;
            case ON_ENTRY_BOT:
                this.f57380n = false;
                this.f57381o = true;
                C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>entry long check, start LongCheckTimeOutMs");
                C13880j c13880j2 = C13880j.a.f57352a;
                m82277b(c13880j2.m82235b().getLongCheckTimeOutMs(), c13880j2.m82235b().isShowLongCheckTimeout());
                break;
            case ON_EXIT_BOT:
                this.f57380n = true;
                this.f57381o = false;
                C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>first found the face. start AuthTimeOutMs");
                break;
            case AUTH_END:
                m82284j();
                break;
            case AUTH_FAIL:
                m82273a(obj);
                break;
            case AUTH_ERROR_DIALOG:
                m82279b(obj);
                break;
            default:
                C13905e.a.f57445a.m82337a(1, "AuthingFragment", "error state");
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82260b(CompareResult compareResult) {
        if (this.f57385s) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "error dialog had showing!");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "activity is null or is finishing by create ErrorInfoDialog");
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            return;
        }
        if (this.f57384r == null) {
            this.f57384r = new DialogC13942b(activity, 0);
        }
        this.f57385s = true;
        C13880j c13880j = C13880j.a.f57352a;
        c13880j.f57346e = true;
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null) {
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            return;
        }
        DialogC13942b dialogC13942b = this.f57384r;
        dialogC13942b.getClass();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Window window = dialogC13942b.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        HuiYanSdkConfig huiYanSdkConfig = c13880j.f57343b;
        boolean zIsLandMode = huiYanSdkConfig != null ? huiYanSdkConfig.isLandMode() : false;
        int i = point.x;
        if (zIsLandMode) {
            attributes.height = (int) (i * 0.32f);
            attributes.width = (int) (point.y * 0.7f);
        } else {
            attributes.width = (int) (i * 0.8f);
            attributes.height = (int) (point.y * 0.4f);
        }
        window.setAttributes(attributes);
        DialogC13942b dialogC13942b2 = this.f57384r;
        int errorCode = compareResult.getErrorCode();
        String errorMsg = compareResult.getErrorMsg();
        dialogC13942b2.f57583b = errorCode;
        dialogC13942b2.f57584c = errorMsg;
        TextView textView = dialogC13942b2.f57582a;
        if (textView != null) {
            textView.setText(errorMsg);
        }
        if (c13880j.f57345d) {
            C13905e.a.f57445a.m82337a(2, "ErrorInfoDialog", "activity has exit, do not need show!");
        } else {
            dialogC13942b2.show();
        }
        m82280b(true);
        C13905e.a.f57445a.m82337a(2, "AuthingFragment", "showErrorDialog error code:" + compareResult.getErrorCode() + " msg: " + compareResult.getErrorMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m82264d() {
        Object obj = this.f57367a;
        if (obj != null && (obj instanceof View)) {
            ((View) obj).setVisibility(0);
            this.f57367a.mo82378a();
        }
        this.f57378l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m82266e() {
        if (this.f57383q == null) {
            this.f57383q = new CameraHolder();
        }
        this.f57383q.setLoggerCallBack(new C13894d(this));
        this.f57383q.setEventListener(new C13895e(this));
        CameraConfig cameraConfig = new CameraConfig();
        cameraConfig.setMainThread(false);
        C13880j c13880j = C13880j.a.f57352a;
        if (c13880j.m82237d()) {
            cameraConfig.setPreWidth(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            cameraConfig.setPreHeight(720);
            HuiYanBaseApi.C13881a.f57357a.m82241a(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        } else {
            cameraConfig.setPreWidth(640);
            cameraConfig.setPreHeight(480);
            HuiYanBaseApi.C13881a.f57357a.m82241a(480, 640);
        }
        HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
        if (huiYanSdkConfigM82235b != null) {
            PackageTest packageTest = huiYanSdkConfigM82235b.getPackageTest();
            if (packageTest == PackageTest.BIG || packageTest == PackageTest.MEDIUM) {
                cameraConfig.setMinFps(30);
                cameraConfig.setMaxFps(30);
            } else {
                cameraConfig.setMinFps(15);
                cameraConfig.setMaxFps(15);
            }
            cameraConfig.setBackCamera(huiYanSdkConfigM82235b.isUseBackCamera());
            if (huiYanSdkConfigM82235b.isUseBackCamera()) {
                cameraConfig.setZoom(huiYanSdkConfigM82235b.getZoomLevel());
            }
            cameraConfig.setMustDiffMinAndMaxFps(huiYanSdkConfigM82235b.isMustDiffMinAndMaxFps());
        } else {
            cameraConfig.setMinFps(30);
            cameraConfig.setMaxFps(30);
            cameraConfig.setBackCamera(false);
        }
        cameraConfig.setByteDataBuffer(true);
        cameraConfig.setSupportZoom(false);
        if (huiYanSdkConfigM82235b != null) {
            cameraConfig.setLand(huiYanSdkConfigM82235b.isLandMode());
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        this.f57383q.initCameraHolder(huiYanBaseApi.m82240a(), cameraConfig);
        this.f57367a.setCameraHolder(this.f57383q);
        Context contextM82240a = huiYanBaseApi.m82240a();
        CameraHolder cameraHolder = this.f57383q;
        if (cameraHolder == null || contextM82240a == null) {
            return;
        }
        cameraHolder.openCamera(contextM82240a);
        C13924f c13924f = C13924f.a.f57496a;
        HandlerThread handlerThread = new HandlerThread("turing");
        c13924f.f57493l = handlerThread;
        handlerThread.start();
        c13924f.f57494m = new HandlerC13923e(c13924f, c13924f.f57493l.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m82268f() {
        int i;
        CameraHolder cameraHolder = this.f57383q;
        if (cameraHolder != null) {
            cameraHolder.release();
            C13924f.a.f57496a.m82383b();
        }
        m82280b(true);
        C13880j c13880j = C13880j.a.f57352a;
        if (c13880j.m82235b().isAutoScreenBrightness() && (i = this.f57377k) != -1) {
            m82276b(i);
            this.f57377k = -1;
        }
        C13904d.b.f57440a.m82334a();
        HuiYanSdkConfig huiYanSdkConfig = c13880j.f57343b;
        if (!(huiYanSdkConfig == null ? false : huiYanSdkConfig.isWaitingUserCompare())) {
            CommonUtils.closeCurrentFragment();
            return;
        }
        if (this.f57368b == null) {
            return;
        }
        AuthUiConfig authUiConfig = c13880j.f57344c;
        if (authUiConfig != null) {
            if (this.f57374h != null && authUiConfig.getLoadingStageBgColor() != -1) {
                this.f57374h.setBackgroundColor(authUiConfig.getLoadingStageBgColor());
            }
            TextView textView = this.f57369c;
            if (textView != null) {
                textView.setText(getContextResources().getString(C13869R.string.txy_wait_for_result));
                int loadingStageTipsColor = authUiConfig.getLoadingStageTipsColor();
                TextView textView2 = this.f57369c;
                if (loadingStageTipsColor != -1) {
                    textView2.setTextColor(authUiConfig.getLoadingStageTipsColor());
                } else {
                    textView2.setTextColor(getContextResources().getColor(C13869R.color.txy_black));
                }
            }
        }
        TextView textView3 = this.f57370d;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.findViewById(C13869R.id.txy_auth_common_background_views).setVisibility(4);
            this.fragmentView.findViewById(C13869R.id.txy_cancel_txt_btn).setVisibility(4);
        }
        this.f57368b.setVisibility(0);
        InterfaceC13873c interfaceC13873c = c13880j.f57349h;
        if (interfaceC13873c != null) {
            this.f57388v = interfaceC13873c.getWaitingAnimation();
        }
        if (this.f57388v == null) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "animationDrawable is null!");
            return;
        }
        Object obj = this.f57367a;
        if (obj != null && (obj instanceof View)) {
            ((View) obj).setVisibility(4);
        }
        this.f57368b.setImageDrawable(this.f57388v);
        this.f57388v.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m82270g() {
        C13936k c13936k = C13936k.b.f57526a;
        if (c13936k.f57522b != null) {
            c13936k.f57522b = null;
        }
        CountDownTimer countDownTimer = c13936k.f57521a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            c13936k.f57521a = null;
        }
        TextView textView = this.f57371e;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void backPopEvent() {
        super.backPopEvent();
        m82274a(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m82281c() {
        if (this.f57368b == null) {
            return;
        }
        AuthUiConfig authUiConfig = C13880j.a.f57352a.f57344c;
        if (authUiConfig != null && authUiConfig.isHideAvatarGuideFrame()) {
            this.f57368b.setVisibility(8);
            return;
        }
        this.f57368b.setScaleX(0.935f);
        this.f57368b.setScaleY(0.935f);
        this.f57368b.setVisibility(0);
        this.f57368b.setImageResource(C13869R.drawable.txy_huiyan_head_guide_frame);
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void exit() {
        super.exit();
        C13880j.a.f57352a.f57345d = true;
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.lifecycle.InterfaceC0475e
    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    /* JADX INFO: renamed from: h */
    public final void m82282h() {
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>start camera preview(get light data ok)");
        runOnUiThread(new Runnable() { // from class: l.ce1
            @Override // java.lang.Runnable
            public final void run() {
                this.f80427a.m82264d();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m82283i() {
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>start auth action");
        runOnUiThread(new Runnable() { // from class: l.he1
            @Override // java.lang.Runnable
            public final void run() {
                this.f107323a.m82266e();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m82284j() {
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>start auth end.");
        m82287m();
        runOnUiThread(new Runnable() { // from class: l.zd1
            @Override // java.lang.Runnable
            public final void run() {
                this.f202613a.m82268f();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m82285k() {
        Sensor defaultSensor;
        C13904d c13904d = C13904d.b.f57440a;
        Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
        if (contextM82240a == null) {
            Log.e("LightSensor", "context is null");
        } else if (!c13904d.f57437c) {
            c13904d.f57437c = true;
            SensorManager sensorManager = (SensorManager) contextM82240a.getApplicationContext().getSystemService("sensor");
            c13904d.f57435a = sensorManager;
            if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(5)) == null) {
                C13905e.a.f57445a.m82337a(2, "LightSensor", " 光线传感器不可用~");
            } else {
                C13904d.a aVar = c13904d.new a();
                c13904d.f57436b = aVar;
                c13904d.f57435a.registerListener(aVar, defaultSensor, 3);
            }
        }
        C13904d.c cVar = new C13904d.c() { // from class: l.xd1
            @Override // com.tencent.could.huiyansdk.manager.C13904d.c
            /* JADX INFO: renamed from: a */
            public final void mo82335a(float f) {
                this.f192290a.m82251a(f);
            }
        };
        if (c13904d.f57436b != null) {
            c13904d.f57438d = cVar;
        } else {
            C13905e.a.f57445a.m82337a(2, "LightSensor", "设备无光线传感器或者未调用start()方法");
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "can not get activity!");
            return;
        }
        try {
            this.f57377k = Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "can not get screen brightness");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m82286l() {
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", "start prepare auth");
        this.f57391y = true;
        C13902b c13902b = C13902b.b.f57433a;
        InterfaceC13882a interfaceC13882a = new InterfaceC13882a() { // from class: l.de1
            @Override // com.tencent.could.huiyansdk.callback.InterfaceC13882a
            /* JADX INFO: renamed from: a */
            public final void mo82244a(AuthState authState, Object obj) {
                this.f85693a.m82257a(authState, obj);
            }
        };
        c13902b.f57428s = false;
        Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
        if (contextM82240a == null) {
            Log.e("AuthStateManager", "context is null!");
        } else {
            Resources resources = contextM82240a.getResources();
            c13902b.f57424o = resources.getColor(C13869R.color.txy_feedback_txt_red);
            c13902b.f57425p = resources.getColor(C13869R.color.txy_black);
            c13902b.f57426q = resources.getColor(C13869R.color.txy_auth_bg_red_error);
            c13902b.f57427r = resources.getColor(C13869R.color.txy_auth_bg_green_tip);
            AuthUiConfig authUiConfig = C13880j.a.f57352a.f57344c;
            if (authUiConfig != null) {
                if (authUiConfig.getFeedBackErrorColor() != -1) {
                    c13902b.f57424o = authUiConfig.getFeedBackErrorColor();
                }
                if (authUiConfig.getFeedBackTxtColor() != -1) {
                    c13902b.f57425p = authUiConfig.getFeedBackTxtColor();
                }
                if (authUiConfig.getAuthCircleErrorColor() != -1) {
                    c13902b.f57426q = authUiConfig.getAuthCircleErrorColor();
                }
                if (authUiConfig.getAuthCircleCorrectColor() != -1) {
                    c13902b.f57427r = authUiConfig.getAuthCircleCorrectColor();
                }
            }
        }
        c13902b.f57411b = interfaceC13882a;
        c13902b.m82328a(AuthState.PREPARE, (Object) null);
        c13902b.f57418i = -1;
        c13902b.f57419j = -1;
        c13902b.f57420k = 3;
        c13902b.m82328a(AuthState.AUTH_ACTION, (Object) null);
    }

    /* JADX INFO: renamed from: m */
    public final void m82287m() {
        runOnUiThread(new Runnable() { // from class: l.wd1
            @Override // java.lang.Runnable
            public final void run() {
                this.f185750a.m82270g();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.f57387u = false;
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", "on attach.");
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        boolean z;
        if (this.fragmentView == null) {
            int landAuthLayoutResId = C13869R.layout.txy_huiyan_fragment_authing;
            C13880j c13880j = C13880j.a.f57352a;
            HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
            if (huiYanSdkConfigM82235b == null || !huiYanSdkConfigM82235b.isLandMode()) {
                z = false;
            } else {
                landAuthLayoutResId = C13869R.layout.txy_huiyan_fragment_authing_land;
                z = true;
            }
            AuthUiConfig authUiConfig = c13880j.f57344c;
            if (authUiConfig != null && !z && authUiConfig.getAuthLayoutResId() != -1) {
                landAuthLayoutResId = authUiConfig.getAuthLayoutResId();
            }
            if (c13880j.m82236c()) {
                landAuthLayoutResId = C13869R.layout.txy_private_huiyan_fragment_authing_720_bot;
                if (authUiConfig != null && authUiConfig.getAuthWithLongCheck720LayoutResId() != -1) {
                    landAuthLayoutResId = authUiConfig.getAuthWithLongCheck720LayoutResId();
                }
            }
            if (authUiConfig != null && z && authUiConfig.getLandAuthLayoutResId() != -1) {
                landAuthLayoutResId = authUiConfig.getLandAuthLayoutResId();
            }
            this.fragmentView = layoutInflater.inflate(landAuthLayoutResId, viewGroup, false);
            m82275b();
            m82272a();
            C13902b.b.f57433a.f57412c = new C13896f(this);
            this.f57374h = (HuiYanReflectLayout) this.fragmentView.findViewById(C13869R.id.txy_auth_layout_bg);
            HuiYanSdkConfig huiYanSdkConfig = c13880j.f57343b;
            if ((huiYanSdkConfig == null ? PageColorStyle.Light : huiYanSdkConfig.getPageColorStyle()) == PageColorStyle.Light) {
                this.f57374h.setBackgroundColor(getContextResources().getColor(C13869R.color.txy_white));
            } else {
                TextView textView = (TextView) this.fragmentView.findViewById(C13869R.id.txy_cancel_txt_btn);
                Resources contextResources = getContextResources();
                int i = C13869R.color.txy_white;
                textView.setTextColor(contextResources.getColor(i));
                this.f57369c.setTextColor(getContextResources().getColor(i));
                this.f57371e.setTextColor(getContextResources().getColor(i));
                this.f57368b.setImageResource(C13869R.drawable.txy_prepare_face_head_black);
                this.f57374h.setBackgroundColor(getContextResources().getColor(C13869R.color.txy_black));
            }
            C13924f c13924f = C13924f.a.f57496a;
            TuringResultCacheEntity turingResultCacheEntity = c13924f.f57487f;
            if (turingResultCacheEntity != null) {
                turingResultCacheEntity.reset();
            }
            if (!c13924f.f57491j || c13924f.f57488g == null) {
                C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "init turing sdk logic, turing is not create!");
            } else {
                c13924f.f57483b = false;
                C13922d c13922d = new C13922d(c13924f);
                if (!c13924f.f57491j || c13924f.f57488g == null) {
                    C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "set event listener, turing is not create!");
                } else {
                    c13924f.f57488g.f57479a = c13922d;
                }
                c13924f.f57489h = new C13906f();
            }
            C13927b.a.f57501a.f57500a = new C13934i<>(20, "FrameCreatePool");
            C13926a.a.f57499a.f57498a = new C13934i<>(10, "ChangeBytePool");
            if (c13880j.m82237d()) {
                InterfaceC13919a interfaceC13919a = this.f57367a;
                if (interfaceC13919a instanceof CameraDateGatherView) {
                    ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) ((CameraDateGatherView) interfaceC13919a).getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) c0220a).height = (int) (((double) ((ViewGroup.MarginLayoutParams) c0220a).height) * 1.3d);
                    ((CameraDateGatherView) this.f57367a).setLayoutParams(c0220a);
                }
            }
            AuthUiConfig authUiConfig2 = c13880j.f57344c;
            if (authUiConfig2 != null) {
                if (this.f57374h != null && authUiConfig2.getAuthLayoutBgColor() != -1) {
                    this.f57374h.setBackgroundColor(authUiConfig2.getAuthLayoutBgColor());
                }
                if (this.f57369c != null && authUiConfig2.getFeedBackTxtColor() != -1) {
                    this.f57369c.setTextColor(authUiConfig2.getFeedBackTxtColor());
                }
                if (this.f57370d != null && authUiConfig2.getFeedBackExtraTipColor() != -1) {
                    this.f57370d.setTextColor(authUiConfig2.getFeedBackExtraTipColor());
                }
                if (authUiConfig2.isTransparentStatusBar()) {
                    TextView textView2 = this.f57372f;
                    if (textView2 != null) {
                        ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) textView2.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) c0220a2).topMargin += CommonUtils.dpToPx(this.f57372f, authUiConfig2.getTransparentStatusBarMoveHeight());
                        this.f57372f.setLayoutParams(c0220a2);
                    }
                    TextView textView3 = this.f57371e;
                    if (textView3 != null) {
                        ConstraintLayout.C0220a c0220a3 = (ConstraintLayout.C0220a) textView3.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) c0220a3).topMargin += CommonUtils.dpToPx(this.f57371e, authUiConfig2.getTransparentStatusBarMoveHeight());
                        this.f57371e.setLayoutParams(c0220a3);
                    }
                }
                if (this.f57372f != null && authUiConfig2.getCancelTxtColor() != -10) {
                    this.f57372f.setTextColor(authUiConfig2.getCancelTxtColor());
                }
                if (this.f57371e != null && authUiConfig2.getCountDownTxtColor() != -10) {
                    this.f57371e.setTextColor(authUiConfig2.getCountDownTxtColor());
                }
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C13905e.a.f57445a.m82337a(2, "AuthingFragment", "activity is null!");
            } else {
                C13918c c13918c = C13918c.a.f57478a;
                String[] strArr = C13931f.f57509a;
                C13891a c13891a = new C13891a(this);
                c13918c.f57476b = c13891a;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (e16.m114373a(activity, strArr[i2]) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (strArr2.length > 0) {
                    b50.m100287u(activity, strArr2, 119);
                } else {
                    c13891a.m82289b();
                }
            }
        }
        C13880j c13880j2 = C13880j.a.f57352a;
        if (c13880j2.m82237d()) {
            if (c13880j2.m82236c()) {
                YtSDKKitFramework.getInstance().setDetectRect(new Rect(20, 180, 700, 1100));
            } else {
                YtSDKKitFramework.getInstance().setDetectRect(new Rect(20, 280, 700, 1000));
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        int i;
        super.onDestroy();
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", "on destroy.");
        this.f57387u = false;
        this.f57385s = false;
        DialogC13942b dialogC13942b = this.f57384r;
        if (dialogC13942b != null) {
            dialogC13942b.dismiss();
            this.f57384r = null;
        }
        if (this.f57367a != null) {
            this.f57367a = null;
        }
        HuiYanBaseApi.C13881a.f57357a.getClass();
        C13900b c13900b = C13900b.a.f57405a;
        if (c13900b.f57403b != null) {
            c13900b.f57403b = null;
        }
        YtSDKKitFramework.getInstance().deInit();
        C13904d.b.f57440a.m82334a();
        if (C13880j.a.f57352a.m82235b().isAutoScreenBrightness() && (i = this.f57377k) != -1) {
            m82276b(i);
        }
        CameraHolder cameraHolder = this.f57383q;
        if (cameraHolder != null) {
            cameraHolder.release();
            C13924f.a.f57496a.m82383b();
        }
        C13902b c13902b = C13902b.b.f57433a;
        if (c13902b.f57412c != null) {
            c13902b.f57412c = null;
        }
        if (c13902b.f57411b != null) {
            c13902b.f57411b = null;
        }
        if (c13902b.f57421l != null) {
            c13902b.f57421l = null;
        }
        c13902b.f57413d = false;
        m82280b(true);
        C13933h c13933h = this.f57382p;
        if (c13933h != null && c13933h.f57513b != null) {
            c13933h.f57513b.removeMessages(1);
            c13933h.f57513b = null;
            HandlerThread handlerThread = c13933h.f57512a;
            if (handlerThread != null && handlerThread.isAlive()) {
                c13933h.f57512a.quitSafely();
            }
        }
        C13924f c13924f = C13924f.a.f57496a;
        C13906f c13906f = c13924f.f57489h;
        if (c13906f != null) {
            while (c13906f.f57446a.size() > 0) {
                C13927b.a.f57501a.m82391a(c13906f.f57446a.poll());
            }
            c13906f.f57455j = true;
            c13906f.f57456k = true;
            c13906f.f57461p = false;
            c13906f.f57462q = true;
        }
        c13924f.f57486e = false;
        c13924f.f57485d = false;
        c13924f.f57483b = false;
        c13924f.m82383b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m82272a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
        if (!(contextM82240a == null ? false : C13931f.m82403a(contextM82240a, C13931f.f57509a))) {
            super.onStop();
            return;
        }
        C13880j c13880j = C13880j.a.f57352a;
        HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
        if (huiYanSdkConfigM82235b == null || !huiYanSdkConfigM82235b.isBackgroundStopAuth()) {
            super.onStop();
            return;
        }
        if (c13880j.f57346e) {
            super.onStop();
            return;
        }
        if (!this.f57391y) {
            super.onStop();
            return;
        }
        CameraHolder cameraHolder = this.f57383q;
        if (cameraHolder != null) {
            cameraHolder.release();
        }
        if (getContext() != null) {
            String resString = getResString(C13869R.string.txy_do_not_change_app_in_auth);
            InterfaceC13872b interfaceC13872b = c13880j.f57348g;
            if (interfaceC13872b != null) {
                interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", resString);
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorMsg(resString);
            compareResult.setErrorCode(214);
            m82279b((Object) compareResult);
        }
        super.onStop();
    }

    /* JADX INFO: renamed from: b */
    public final void m82275b() {
        HudView hudView;
        this.f57367a = (InterfaceC13919a) this.fragmentView.findViewById(C13869R.id.txy_camera_gather_view);
        View view = this.fragmentView;
        int i = C13869R.id.txy_cancel_txt_btn;
        view.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: l.be1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75093a.m82255a(view2);
            }
        });
        this.f57368b = (ImageView) this.fragmentView.findViewById(C13869R.id.txy_camera_prepare_img);
        this.f57369c = (TextView) this.fragmentView.findViewById(C13869R.id.txy_auth_feed_back_txt);
        this.f57370d = (TextView) this.fragmentView.findViewById(C13869R.id.txy_auth_feed_back_extra_tip_txt);
        this.f57375i = (LoadingFrontAnimatorView) this.fragmentView.findViewById(C13869R.id.txy_auth_loading_front_animator_view);
        this.f57371e = (TextView) this.fragmentView.findViewById(C13869R.id.txy_count_down_txt_view);
        this.f57372f = (TextView) this.fragmentView.findViewById(i);
        this.f57373g = (HudView) this.fragmentView.findViewById(C13869R.id.txy_hud_view);
        HuiYanSdkConfig huiYanSdkConfigM82235b = C13880j.a.f57352a.m82235b();
        if (huiYanSdkConfigM82235b != null && huiYanSdkConfigM82235b.isShowDebugView() && (hudView = this.f57373g) != null) {
            hudView.setVisibility(0);
        }
        C13933h c13933h = new C13933h();
        this.f57382p = c13933h;
        TextView textView = this.f57370d;
        c13933h.f57516e.clear();
        c13933h.f57514c = textView;
        if (c13933h.f57512a == null) {
            HandlerThread handlerThread = new HandlerThread("showTips");
            c13933h.f57512a = handlerThread;
            handlerThread.start();
            c13933h.f57513b = new HandlerC13932g(c13933h, c13933h.f57512a.getLooper());
            c13933h.m82408b();
        }
        this.f57369c.setText(C13869R.string.txy_face_preparing3);
        if (this.f57371e != null) {
            C13936k.b.f57526a.f57522b = new C13893c(this);
        }
        this.f57385s = false;
        this.f57389w = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m82277b(final long j, final boolean z) {
        runOnUiThread(new Runnable() { // from class: l.fe1
            @Override // java.lang.Runnable
            public final void run() {
                this.f97090a.m82253a(j, z);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m82279b(Object obj) {
        m82287m();
        if (obj instanceof CompareResult) {
            final CompareResult compareResult = (CompareResult) obj;
            AuthUiConfig authUiConfig = C13880j.a.f57352a.f57344c;
            if (!(authUiConfig == null ? true : authUiConfig.isShowErrorDialog())) {
                CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            } else {
                runOnUiThread(new Runnable() { // from class: l.ae1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f68981a.m82260b(compareResult);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82278b(final ColorMatrixColorFilter colorMatrixColorFilter) {
        runOnUiThread(new Runnable() { // from class: l.ee1
            @Override // java.lang.Runnable
            public final void run() {
                this.f90659a.m82254a(colorMatrixColorFilter);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m82276b(final int i) {
        runOnUiThread(new Runnable() { // from class: l.ge1
            @Override // java.lang.Runnable
            public final void run() {
                this.f102143a.m82252a(i);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m82280b(boolean z) {
        LoadingFrontAnimatorView loadingFrontAnimatorView = this.f57375i;
        if (loadingFrontAnimatorView != null) {
            loadingFrontAnimatorView.f57581l = false;
            if (z) {
                loadingFrontAnimatorView.setVisibility(8);
            }
            ValueAnimator valueAnimator = loadingFrontAnimatorView.f57571b;
            if (valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning() || loadingFrontAnimatorView.f57571b.isStarted()) {
                loadingFrontAnimatorView.f57571b.cancel();
                loadingFrontAnimatorView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m82274a(boolean z) {
        String str;
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "AuthingFragment", "user cancel the auth check.");
        if (z) {
            str = "PrivacyDialog";
        } else {
            AuthState authState = C13902b.b.f57433a.f57410a;
            c13905e.m82337a(1, "AuthingFragment", "cancelAuthCheckByUser current state is " + authState);
            if (authState.compareTo(AuthState.AUTH_FAIL) >= 0) {
                c13905e.m82337a(2, "AuthingFragment", "user cancel the auth check, but current state is error!");
            } else if (authState.compareTo(AuthState.AUTH_END) >= 0) {
                str = "WaitingPage";
            } else if (authState.compareTo(AuthState.START_CAMERA_PREVIEW) >= 0) {
                str = "AuthCheckPage";
            }
            str = "PreparePage";
        }
        String str2 = str;
        InterfaceC13872b interfaceC13872b = C13880j.a.f57352a.f57348g;
        if (interfaceC13872b != null) {
            interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "UserCancelAuth", "");
        }
        HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C13881a.f57357a.f57354b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo("UserCancel", 1, 0L, str2);
        }
        CommonUtils.sendErrorAndExitAuth(212, getResString(C13869R.string.txt_user_cancel_check));
    }

    /* JADX INFO: renamed from: a */
    public void m82273a(Object obj) {
        C13905e.a.f57445a.m82337a(1, "AuthingFragment", ">>>local auth fail");
        m82287m();
        if (obj instanceof CompareResult) {
            final CompareResult compareResult = (CompareResult) obj;
            runOnUiThread(new Runnable() { // from class: l.yd1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197511a.m82256a(compareResult);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m82255a(View view) {
        m82274a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82251a(float f) {
        String resString;
        boolean z;
        boolean z2;
        if (f < 4.0f) {
            resString = getResString(C13869R.string.txy_light_low);
            z = true;
        } else {
            resString = "";
            z = false;
        }
        if (f > 235.0f) {
            resString = getResString(C13869R.string.txy_light_strong);
            z2 = true;
            z = true;
        } else {
            z2 = false;
        }
        if (this.f57370d == null) {
            return;
        }
        boolean z3 = this.f57386t;
        if (!z) {
            if (z3) {
                this.f57386t = false;
                this.f57382p.m82407a("");
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f57382p.m82407a(resString);
        if (z2) {
            C13880j.a.f57352a.m82233a(HuiYanAuthTipsEvent.LIGHT_TOO_STRONG, true);
        } else {
            C13880j.a.f57352a.m82233a(HuiYanAuthTipsEvent.LIGHT_TOO_LOW, true);
        }
        this.f57386t = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m82272a() {
        if (this.f57367a instanceof View) {
            if (this.f57378l) {
                m82281c();
                ((View) this.f57367a).setVisibility(0);
            } else {
                this.f57368b.setVisibility(0);
                ((View) this.f57367a).setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82253a(long j, boolean z) {
        C13936k.b.f57526a.m82411a(j);
        TextView textView = this.f57371e;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
        AuthUiConfig authUiConfig = C13880j.a.f57352a.f57344c;
        if (authUiConfig == null || authUiConfig.isShowCountdown()) {
            return;
        }
        this.f57371e.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82256a(CompareResult compareResult) {
        m82280b(true);
        CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
        C13905e.a.f57445a.m82337a(2, "AuthingFragment", "local auth fail! code: " + compareResult.getErrorCode() + " msg: " + compareResult.getErrorMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82254a(ColorMatrixColorFilter colorMatrixColorFilter) {
        HuiYanReflectLayout huiYanReflectLayout = this.f57374h;
        if (huiYanReflectLayout != null && huiYanReflectLayout.f57567a != null) {
            huiYanReflectLayout.f57568b = colorMatrixColorFilter;
            huiYanReflectLayout.invalidate();
        }
        if (this.f57376j) {
            return;
        }
        this.f57376j = true;
        this.f57382p.m82407a("");
        m82287m();
        C13880j.a.f57352a.m82232a(HuiYanAuthEvent.REFLECT_CHECK, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82252a(int i) {
        try {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i == -1) {
                attributes.screenBrightness = -1.0f;
            } else {
                if (i <= 0) {
                    i = 1;
                }
                attributes.screenBrightness = i / 255.0f;
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            C13905e.a.f57445a.m82337a(2, "AuthingFragment", "set current screen brightness error: " + e.getLocalizedMessage());
        }
    }
}
