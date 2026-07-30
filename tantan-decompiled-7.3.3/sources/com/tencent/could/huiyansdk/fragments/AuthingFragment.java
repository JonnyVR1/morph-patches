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
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.api.InterfaceC14036c;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.callback.InterfaceC14045a;
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
import com.tencent.could.huiyansdk.helper.C14062a;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14067d;
import com.tencent.could.huiyansdk.manager.C14067d.a;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.manager.C14069f;
import com.tencent.could.huiyansdk.permission.C14081c;
import com.tencent.could.huiyansdk.turing.C14085d;
import com.tencent.could.huiyansdk.turing.C14087f;
import com.tencent.could.huiyansdk.turing.HandlerC14086e;
import com.tencent.could.huiyansdk.turing.InterfaceC14082a;
import com.tencent.could.huiyansdk.utils.C14089a;
import com.tencent.could.huiyansdk.utils.C14090b;
import com.tencent.could.huiyansdk.utils.C14094f;
import com.tencent.could.huiyansdk.utils.C14096h;
import com.tencent.could.huiyansdk.utils.C14097i;
import com.tencent.could.huiyansdk.utils.C14099k;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.HandlerC14095g;
import com.tencent.could.huiyansdk.view.CameraDateGatherView;
import com.tencent.could.huiyansdk.view.DialogC14105b;
import com.tencent.could.huiyansdk.view.HudView;
import com.tencent.could.huiyansdk.view.HuiYanReflectLayout;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.Primes;
import p153l.cvb;
import p153l.j26;
import p153l.v40;

/* JADX INFO: loaded from: classes12.dex */
public class AuthingFragment extends BaseFragment {

    /* JADX INFO: renamed from: a */
    public InterfaceC14082a f58215a;

    /* JADX INFO: renamed from: b */
    public ImageView f58216b;

    /* JADX INFO: renamed from: c */
    public TextView f58217c;

    /* JADX INFO: renamed from: d */
    public TextView f58218d;

    /* JADX INFO: renamed from: e */
    public TextView f58219e;

    /* JADX INFO: renamed from: f */
    public TextView f58220f;

    /* JADX INFO: renamed from: g */
    public HudView f58221g;

    /* JADX INFO: renamed from: h */
    public HuiYanReflectLayout f58222h;

    /* JADX INFO: renamed from: i */
    public LoadingFrontAnimatorView f58223i;

    /* JADX INFO: renamed from: p */
    public C14096h f58230p;

    /* JADX INFO: renamed from: q */
    public CameraHolder f58231q;

    /* JADX INFO: renamed from: r */
    public DialogC14105b f58232r;

    /* JADX INFO: renamed from: v */
    public AnimationDrawable f58236v;

    /* JADX INFO: renamed from: j */
    public volatile boolean f58224j = false;

    /* JADX INFO: renamed from: k */
    public int f58225k = -1;

    /* JADX INFO: renamed from: l */
    public boolean f58226l = false;

    /* JADX INFO: renamed from: m */
    public volatile boolean f58227m = false;

    /* JADX INFO: renamed from: n */
    public volatile boolean f58228n = false;

    /* JADX INFO: renamed from: o */
    public volatile boolean f58229o = false;

    /* JADX INFO: renamed from: s */
    public boolean f58233s = false;

    /* JADX INFO: renamed from: t */
    public volatile boolean f58234t = false;

    /* JADX INFO: renamed from: u */
    public volatile boolean f58235u = false;

    /* JADX INFO: renamed from: w */
    public int f58237w = 0;

    /* JADX INFO: renamed from: x */
    public volatile boolean f58238x = false;

    /* JADX INFO: renamed from: y */
    public volatile boolean f58239y = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83440a(AuthState authState, Object obj) {
        switch (authState) {
            case PREPARE:
                C14068e c14068e = C14068e.a.f58293a;
                c14068e.m83520a(1, "AuthingFragment", ">>>start prepare event");
                if (this.f58223i != null) {
                    AuthUiConfig authUiConfig = C14043j.a.f58200a.f58192c;
                    if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnStart()) {
                        this.f58223i.setVisibility(8);
                    } else {
                        this.f58223i.m83609b();
                    }
                } else {
                    c14068e.m83520a(2, "AuthingFragment", "loadingFrontAnimatorView is null!");
                }
                break;
            case START_GET_LIVE_TYPE:
                if (!this.f58235u) {
                    C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>start auth and get live info");
                    YtSDKKitFramework.YtSDKPlatformContext platformContext = YtSDKKitFramework.getInstance().getPlatformContext();
                    CameraHolder cameraHolder = this.f58231q;
                    if (cameraHolder != null) {
                        platformContext.currentCamera = cameraHolder.getCurrentCamera();
                        platformContext.currentCameraId = this.f58231q.getCameraId();
                        platformContext.currentRotateState = this.f58231q.getCurrentRotate();
                        platformContext.currentAppContext = HuiYanBaseApi.C14044a.f58205a.m83423a();
                    }
                    platformContext.reflectListener = new C14060g(this);
                    platformContext.baseFunctionListener = new C14061h(this);
                    C14065b c14065b = C14065b.b.f58281a;
                    c14065b.getClass();
                    c14065b.f58271n = HuiYanAuthTipsEvent.NONE;
                    HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
                    huiYanBaseApi.getClass();
                    C14063b c14063b = C14063b.a.f58253a;
                    c14063b.getClass();
                    HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f58202b;
                    if (huiYanBaseCallBack != null) {
                        huiYanBaseCallBack.onOperateTimeEvent("GetConfigUseTime", 1, false, "");
                    }
                    int iM83494a = c14063b.m83494a(platformContext, c14063b.m83501b(), new C14062a(c14063b));
                    if (iM83494a != 0) {
                        CommonUtils.sendErrorAndExitAuth(Primes.SMALL_FACTOR_LIMIT, "YtSDKKitFramework init error ! code: " + iM83494a);
                    } else if (huiYanBaseApi.m83426b() != HuiYanLiveMode.ACTION_REFLECT_MODE) {
                        C14043j.a.f58200a.m83415a(HuiYanAuthEvent.START_AUTH, true);
                        c14065b.getClass();
                        c14065b.m83511a(AuthState.START_CAMERA_PREVIEW, (Object) null);
                    }
                    this.f58235u = true;
                } else {
                    C14068e.a.f58293a.m83520a(1, "AuthingFragment", "has started auth and got live info");
                }
                break;
            case START_CAMERA_PREVIEW:
                m83465h();
                break;
            case AUTH_ACTION:
                m83466i();
                break;
            case ON_FIRST_FOUND_FACE:
                C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>first found the face. start AuthTimeOutMs");
                break;
            case ON_ENTRY_OTHER_ACTION:
                this.f58227m = true;
                C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>enter other action. start AuthTimeOutMs");
                C14043j c14043j = C14043j.a.f58200a;
                m83460b(c14043j.m83418b().getAuthTimeOutMs(), c14043j.m83418b().isShowActionTimeout());
                break;
            case ON_ENTRY_BOT:
                this.f58228n = false;
                this.f58229o = true;
                C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>entry long check, start LongCheckTimeOutMs");
                C14043j c14043j2 = C14043j.a.f58200a;
                m83460b(c14043j2.m83418b().getLongCheckTimeOutMs(), c14043j2.m83418b().isShowLongCheckTimeout());
                break;
            case ON_EXIT_BOT:
                this.f58228n = true;
                this.f58229o = false;
                C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>first found the face. start AuthTimeOutMs");
                break;
            case AUTH_END:
                m83467j();
                break;
            case AUTH_FAIL:
                m83456a(obj);
                break;
            case AUTH_ERROR_DIALOG:
                m83462b(obj);
                break;
            default:
                C14068e.a.f58293a.m83520a(1, "AuthingFragment", "error state");
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83443b(CompareResult compareResult) {
        if (this.f58233s) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "error dialog had showing!");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "activity is null or is finishing by create ErrorInfoDialog");
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            return;
        }
        if (this.f58232r == null) {
            this.f58232r = new DialogC14105b(activity, 0);
        }
        this.f58233s = true;
        C14043j c14043j = C14043j.a.f58200a;
        c14043j.f58194e = true;
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null) {
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            return;
        }
        DialogC14105b dialogC14105b = this.f58232r;
        dialogC14105b.getClass();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Window window = dialogC14105b.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        HuiYanSdkConfig huiYanSdkConfig = c14043j.f58191b;
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
        DialogC14105b dialogC14105b2 = this.f58232r;
        int errorCode = compareResult.getErrorCode();
        String errorMsg = compareResult.getErrorMsg();
        dialogC14105b2.f58431b = errorCode;
        dialogC14105b2.f58432c = errorMsg;
        TextView textView = dialogC14105b2.f58430a;
        if (textView != null) {
            textView.setText(errorMsg);
        }
        if (c14043j.f58193d) {
            C14068e.a.f58293a.m83520a(2, "ErrorInfoDialog", "activity has exit, do not need show!");
        } else {
            dialogC14105b2.show();
        }
        m83463b(true);
        C14068e.a.f58293a.m83520a(2, "AuthingFragment", "showErrorDialog error code:" + compareResult.getErrorCode() + " msg: " + compareResult.getErrorMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m83447d() {
        Object obj = this.f58215a;
        if (obj != null && (obj instanceof View)) {
            ((View) obj).setVisibility(0);
            this.f58215a.mo83561a();
        }
        this.f58226l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m83449e() {
        if (this.f58231q == null) {
            this.f58231q = new CameraHolder();
        }
        this.f58231q.setLoggerCallBack(new C14057d(this));
        this.f58231q.setEventListener(new C14058e(this));
        CameraConfig cameraConfig = new CameraConfig();
        cameraConfig.setMainThread(false);
        C14043j c14043j = C14043j.a.f58200a;
        if (c14043j.m83420d()) {
            cameraConfig.setPreWidth(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            cameraConfig.setPreHeight(720);
            HuiYanBaseApi.C14044a.f58205a.m83424a(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        } else {
            cameraConfig.setPreWidth(640);
            cameraConfig.setPreHeight(480);
            HuiYanBaseApi.C14044a.f58205a.m83424a(480, 640);
        }
        HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
        if (huiYanSdkConfigM83418b != null) {
            PackageTest packageTest = huiYanSdkConfigM83418b.getPackageTest();
            if (packageTest == PackageTest.BIG || packageTest == PackageTest.MEDIUM) {
                cameraConfig.setMinFps(30);
                cameraConfig.setMaxFps(30);
            } else {
                cameraConfig.setMinFps(15);
                cameraConfig.setMaxFps(15);
            }
            cameraConfig.setBackCamera(huiYanSdkConfigM83418b.isUseBackCamera());
            if (huiYanSdkConfigM83418b.isUseBackCamera()) {
                cameraConfig.setZoom(huiYanSdkConfigM83418b.getZoomLevel());
            }
            cameraConfig.setMustDiffMinAndMaxFps(huiYanSdkConfigM83418b.isMustDiffMinAndMaxFps());
        } else {
            cameraConfig.setMinFps(30);
            cameraConfig.setMaxFps(30);
            cameraConfig.setBackCamera(false);
        }
        cameraConfig.setByteDataBuffer(true);
        cameraConfig.setSupportZoom(false);
        if (huiYanSdkConfigM83418b != null) {
            cameraConfig.setLand(huiYanSdkConfigM83418b.isLandMode());
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        this.f58231q.initCameraHolder(huiYanBaseApi.m83423a(), cameraConfig);
        this.f58215a.setCameraHolder(this.f58231q);
        Context contextM83423a = huiYanBaseApi.m83423a();
        CameraHolder cameraHolder = this.f58231q;
        if (cameraHolder == null || contextM83423a == null) {
            return;
        }
        cameraHolder.openCamera(contextM83423a);
        C14087f c14087f = C14087f.a.f58344a;
        HandlerThread handlerThread = new HandlerThread("turing");
        c14087f.f58341l = handlerThread;
        handlerThread.start();
        c14087f.f58342m = new HandlerC14086e(c14087f, c14087f.f58341l.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m83451f() {
        int i;
        CameraHolder cameraHolder = this.f58231q;
        if (cameraHolder != null) {
            cameraHolder.release();
            C14087f.a.f58344a.m83566b();
        }
        m83463b(true);
        C14043j c14043j = C14043j.a.f58200a;
        if (c14043j.m83418b().isAutoScreenBrightness() && (i = this.f58225k) != -1) {
            m83459b(i);
            this.f58225k = -1;
        }
        C14067d.b.f58288a.m83517a();
        HuiYanSdkConfig huiYanSdkConfig = c14043j.f58191b;
        if (!(huiYanSdkConfig == null ? false : huiYanSdkConfig.isWaitingUserCompare())) {
            CommonUtils.closeCurrentFragment();
            return;
        }
        if (this.f58216b == null) {
            return;
        }
        AuthUiConfig authUiConfig = c14043j.f58192c;
        if (authUiConfig != null) {
            if (this.f58222h != null && authUiConfig.getLoadingStageBgColor() != -1) {
                this.f58222h.setBackgroundColor(authUiConfig.getLoadingStageBgColor());
            }
            TextView textView = this.f58217c;
            if (textView != null) {
                textView.setText(getContextResources().getString(C14032R.string.txy_wait_for_result));
                int loadingStageTipsColor = authUiConfig.getLoadingStageTipsColor();
                TextView textView2 = this.f58217c;
                if (loadingStageTipsColor != -1) {
                    textView2.setTextColor(authUiConfig.getLoadingStageTipsColor());
                } else {
                    textView2.setTextColor(getContextResources().getColor(C14032R.color.txy_black));
                }
            }
        }
        TextView textView3 = this.f58218d;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.findViewById(C14032R.id.txy_auth_common_background_views).setVisibility(4);
            this.fragmentView.findViewById(C14032R.id.txy_cancel_txt_btn).setVisibility(4);
        }
        this.f58216b.setVisibility(0);
        InterfaceC14036c interfaceC14036c = c14043j.f58197h;
        if (interfaceC14036c != null) {
            this.f58236v = interfaceC14036c.getWaitingAnimation();
        }
        if (this.f58236v == null) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "animationDrawable is null!");
            return;
        }
        Object obj = this.f58215a;
        if (obj != null && (obj instanceof View)) {
            ((View) obj).setVisibility(4);
        }
        this.f58216b.setImageDrawable(this.f58236v);
        this.f58236v.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m83453g() {
        C14099k c14099k = C14099k.b.f58374a;
        if (c14099k.f58370b != null) {
            c14099k.f58370b = null;
        }
        CountDownTimer countDownTimer = c14099k.f58369a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            c14099k.f58369a = null;
        }
        TextView textView = this.f58219e;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void backPopEvent() {
        super.backPopEvent();
        m83457a(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m83464c() {
        if (this.f58216b == null) {
            return;
        }
        AuthUiConfig authUiConfig = C14043j.a.f58200a.f58192c;
        if (authUiConfig != null && authUiConfig.isHideAvatarGuideFrame()) {
            this.f58216b.setVisibility(8);
            return;
        }
        this.f58216b.setScaleX(0.935f);
        this.f58216b.setScaleY(0.935f);
        this.f58216b.setVisibility(0);
        this.f58216b.setImageResource(C14032R.drawable.txy_huiyan_head_guide_frame);
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void exit() {
        super.exit();
        C14043j.a.f58200a.f58193d = true;
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    /* JADX INFO: renamed from: h */
    public final void m83465h() {
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>start camera preview(get light data ok)");
        runOnUiThread(new Runnable() { // from class: l.je1
            @Override // java.lang.Runnable
            public final void run() {
                this.f120379a.m83447d();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m83466i() {
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>start auth action");
        runOnUiThread(new Runnable() { // from class: l.oe1
            @Override // java.lang.Runnable
            public final void run() {
                this.f146959a.m83449e();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m83467j() {
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>start auth end.");
        m83470m();
        runOnUiThread(new Runnable() { // from class: l.ge1
            @Override // java.lang.Runnable
            public final void run() {
                this.f103760a.m83451f();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m83468k() {
        Sensor defaultSensor;
        C14067d c14067d = C14067d.b.f58288a;
        Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
        if (contextM83423a == null) {
            Log.e("LightSensor", "context is null");
        } else if (!c14067d.f58285c) {
            c14067d.f58285c = true;
            SensorManager sensorManager = (SensorManager) contextM83423a.getApplicationContext().getSystemService("sensor");
            c14067d.f58283a = sensorManager;
            if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(5)) == null) {
                C14068e.a.f58293a.m83520a(2, "LightSensor", " 光线传感器不可用~");
            } else {
                C14067d.a aVar = c14067d.new a();
                c14067d.f58284b = aVar;
                c14067d.f58283a.registerListener(aVar, defaultSensor, 3);
            }
        }
        C14067d.c cVar = new C14067d.c() { // from class: l.ee1
            @Override // com.tencent.could.huiyansdk.manager.C14067d.c
            /* JADX INFO: renamed from: a */
            public final void mo83518a(float f) {
                this.f93612a.m83434a(f);
            }
        };
        if (c14067d.f58284b != null) {
            c14067d.f58286d = cVar;
        } else {
            C14068e.a.f58293a.m83520a(2, "LightSensor", "设备无光线传感器或者未调用start()方法");
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "can not get activity!");
            return;
        }
        try {
            this.f58225k = Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "can not get screen brightness");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m83469l() {
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", "start prepare auth");
        this.f58239y = true;
        C14065b c14065b = C14065b.b.f58281a;
        InterfaceC14045a interfaceC14045a = new InterfaceC14045a() { // from class: l.ke1
            @Override // com.tencent.could.huiyansdk.callback.InterfaceC14045a
            /* JADX INFO: renamed from: a */
            public final void mo83427a(AuthState authState, Object obj) {
                this.f125288a.m83440a(authState, obj);
            }
        };
        c14065b.f58276s = false;
        Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
        if (contextM83423a == null) {
            Log.e("AuthStateManager", "context is null!");
        } else {
            Resources resources = contextM83423a.getResources();
            c14065b.f58272o = resources.getColor(C14032R.color.txy_feedback_txt_red);
            c14065b.f58273p = resources.getColor(C14032R.color.txy_black);
            c14065b.f58274q = resources.getColor(C14032R.color.txy_auth_bg_red_error);
            c14065b.f58275r = resources.getColor(C14032R.color.txy_auth_bg_green_tip);
            AuthUiConfig authUiConfig = C14043j.a.f58200a.f58192c;
            if (authUiConfig != null) {
                if (authUiConfig.getFeedBackErrorColor() != -1) {
                    c14065b.f58272o = authUiConfig.getFeedBackErrorColor();
                }
                if (authUiConfig.getFeedBackTxtColor() != -1) {
                    c14065b.f58273p = authUiConfig.getFeedBackTxtColor();
                }
                if (authUiConfig.getAuthCircleErrorColor() != -1) {
                    c14065b.f58274q = authUiConfig.getAuthCircleErrorColor();
                }
                if (authUiConfig.getAuthCircleCorrectColor() != -1) {
                    c14065b.f58275r = authUiConfig.getAuthCircleCorrectColor();
                }
            }
        }
        c14065b.f58259b = interfaceC14045a;
        c14065b.m83511a(AuthState.PREPARE, (Object) null);
        c14065b.f58266i = -1;
        c14065b.f58267j = -1;
        c14065b.f58268k = 3;
        c14065b.m83511a(AuthState.AUTH_ACTION, (Object) null);
    }

    /* JADX INFO: renamed from: m */
    public final void m83470m() {
        runOnUiThread(new Runnable() { // from class: l.de1
            @Override // java.lang.Runnable
            public final void run() {
                this.f87982a.m83453g();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.f58235u = false;
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", "on attach.");
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        boolean z;
        if (this.fragmentView == null) {
            int landAuthLayoutResId = C14032R.layout.txy_huiyan_fragment_authing;
            C14043j c14043j = C14043j.a.f58200a;
            HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
            if (huiYanSdkConfigM83418b == null || !huiYanSdkConfigM83418b.isLandMode()) {
                z = false;
            } else {
                landAuthLayoutResId = C14032R.layout.txy_huiyan_fragment_authing_land;
                z = true;
            }
            AuthUiConfig authUiConfig = c14043j.f58192c;
            if (authUiConfig != null && !z && authUiConfig.getAuthLayoutResId() != -1) {
                landAuthLayoutResId = authUiConfig.getAuthLayoutResId();
            }
            if (c14043j.m83419c()) {
                landAuthLayoutResId = C14032R.layout.txy_private_huiyan_fragment_authing_720_bot;
                if (authUiConfig != null && authUiConfig.getAuthWithLongCheck720LayoutResId() != -1) {
                    landAuthLayoutResId = authUiConfig.getAuthWithLongCheck720LayoutResId();
                }
            }
            if (authUiConfig != null && z && authUiConfig.getLandAuthLayoutResId() != -1) {
                landAuthLayoutResId = authUiConfig.getLandAuthLayoutResId();
            }
            this.fragmentView = layoutInflater.inflate(landAuthLayoutResId, viewGroup, false);
            m83458b();
            m83455a();
            C14065b.b.f58281a.f58260c = new C14059f(this);
            this.f58222h = (HuiYanReflectLayout) this.fragmentView.findViewById(C14032R.id.txy_auth_layout_bg);
            HuiYanSdkConfig huiYanSdkConfig = c14043j.f58191b;
            if ((huiYanSdkConfig == null ? PageColorStyle.Light : huiYanSdkConfig.getPageColorStyle()) == PageColorStyle.Light) {
                this.f58222h.setBackgroundColor(getContextResources().getColor(C14032R.color.txy_white));
            } else {
                TextView textView = (TextView) this.fragmentView.findViewById(C14032R.id.txy_cancel_txt_btn);
                Resources contextResources = getContextResources();
                int i = C14032R.color.txy_white;
                textView.setTextColor(contextResources.getColor(i));
                this.f58217c.setTextColor(getContextResources().getColor(i));
                this.f58219e.setTextColor(getContextResources().getColor(i));
                this.f58216b.setImageResource(C14032R.drawable.txy_prepare_face_head_black);
                this.f58222h.setBackgroundColor(getContextResources().getColor(C14032R.color.txy_black));
            }
            C14087f c14087f = C14087f.a.f58344a;
            TuringResultCacheEntity turingResultCacheEntity = c14087f.f58335f;
            if (turingResultCacheEntity != null) {
                turingResultCacheEntity.reset();
            }
            if (!c14087f.f58339j || c14087f.f58336g == null) {
                C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "init turing sdk logic, turing is not create!");
            } else {
                c14087f.f58331b = false;
                C14085d c14085d = new C14085d(c14087f);
                if (!c14087f.f58339j || c14087f.f58336g == null) {
                    C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "set event listener, turing is not create!");
                } else {
                    c14087f.f58336g.f58327a = c14085d;
                }
                c14087f.f58337h = new C14069f();
            }
            C14090b.a.f58349a.f58348a = new C14097i<>(20, "FrameCreatePool");
            C14089a.a.f58347a.f58346a = new C14097i<>(10, "ChangeBytePool");
            if (c14043j.m83420d()) {
                InterfaceC14082a interfaceC14082a = this.f58215a;
                if (interfaceC14082a instanceof CameraDateGatherView) {
                    ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) ((CameraDateGatherView) interfaceC14082a).getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) c0221a).height = (int) (((double) ((ViewGroup.MarginLayoutParams) c0221a).height) * 1.3d);
                    ((CameraDateGatherView) this.f58215a).setLayoutParams(c0221a);
                }
            }
            AuthUiConfig authUiConfig2 = c14043j.f58192c;
            if (authUiConfig2 != null) {
                if (this.f58222h != null && authUiConfig2.getAuthLayoutBgColor() != -1) {
                    this.f58222h.setBackgroundColor(authUiConfig2.getAuthLayoutBgColor());
                }
                if (this.f58217c != null && authUiConfig2.getFeedBackTxtColor() != -1) {
                    this.f58217c.setTextColor(authUiConfig2.getFeedBackTxtColor());
                }
                if (this.f58218d != null && authUiConfig2.getFeedBackExtraTipColor() != -1) {
                    this.f58218d.setTextColor(authUiConfig2.getFeedBackExtraTipColor());
                }
                if (authUiConfig2.isTransparentStatusBar()) {
                    TextView textView2 = this.f58220f;
                    if (textView2 != null) {
                        ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) textView2.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) c0221a2).topMargin += CommonUtils.dpToPx(this.f58220f, authUiConfig2.getTransparentStatusBarMoveHeight());
                        this.f58220f.setLayoutParams(c0221a2);
                    }
                    TextView textView3 = this.f58219e;
                    if (textView3 != null) {
                        ConstraintLayout.C0221a c0221a3 = (ConstraintLayout.C0221a) textView3.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) c0221a3).topMargin += CommonUtils.dpToPx(this.f58219e, authUiConfig2.getTransparentStatusBarMoveHeight());
                        this.f58219e.setLayoutParams(c0221a3);
                    }
                }
                if (this.f58220f != null && authUiConfig2.getCancelTxtColor() != -10) {
                    this.f58220f.setTextColor(authUiConfig2.getCancelTxtColor());
                }
                if (this.f58219e != null && authUiConfig2.getCountDownTxtColor() != -10) {
                    this.f58219e.setTextColor(authUiConfig2.getCountDownTxtColor());
                }
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C14068e.a.f58293a.m83520a(2, "AuthingFragment", "activity is null!");
            } else {
                C14081c c14081c = C14081c.a.f58326a;
                String[] strArr = C14094f.f58357a;
                C14054a c14054a = new C14054a(this);
                c14081c.f58324b = c14054a;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (j26.m143188a(activity, strArr[i2]) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (strArr2.length > 0) {
                    v40.m199644u(activity, strArr2, 119);
                } else {
                    c14054a.m83472b();
                }
            }
        }
        C14043j c14043j2 = C14043j.a.f58200a;
        if (c14043j2.m83420d()) {
            if (c14043j2.m83419c()) {
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
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", "on destroy.");
        this.f58235u = false;
        this.f58233s = false;
        DialogC14105b dialogC14105b = this.f58232r;
        if (dialogC14105b != null) {
            dialogC14105b.dismiss();
            this.f58232r = null;
        }
        if (this.f58215a != null) {
            this.f58215a = null;
        }
        HuiYanBaseApi.C14044a.f58205a.getClass();
        C14063b c14063b = C14063b.a.f58253a;
        if (c14063b.f58251b != null) {
            c14063b.f58251b = null;
        }
        YtSDKKitFramework.getInstance().deInit();
        C14067d.b.f58288a.m83517a();
        if (C14043j.a.f58200a.m83418b().isAutoScreenBrightness() && (i = this.f58225k) != -1) {
            m83459b(i);
        }
        CameraHolder cameraHolder = this.f58231q;
        if (cameraHolder != null) {
            cameraHolder.release();
            C14087f.a.f58344a.m83566b();
        }
        C14065b c14065b = C14065b.b.f58281a;
        if (c14065b.f58260c != null) {
            c14065b.f58260c = null;
        }
        if (c14065b.f58259b != null) {
            c14065b.f58259b = null;
        }
        if (c14065b.f58269l != null) {
            c14065b.f58269l = null;
        }
        c14065b.f58261d = false;
        m83463b(true);
        C14096h c14096h = this.f58230p;
        if (c14096h != null && c14096h.f58361b != null) {
            c14096h.f58361b.removeMessages(1);
            c14096h.f58361b = null;
            HandlerThread handlerThread = c14096h.f58360a;
            if (handlerThread != null && handlerThread.isAlive()) {
                c14096h.f58360a.quitSafely();
            }
        }
        C14087f c14087f = C14087f.a.f58344a;
        C14069f c14069f = c14087f.f58337h;
        if (c14069f != null) {
            while (c14069f.f58294a.size() > 0) {
                C14090b.a.f58349a.m83574a(c14069f.f58294a.poll());
            }
            c14069f.f58303j = true;
            c14069f.f58304k = true;
            c14069f.f58309p = false;
            c14069f.f58310q = true;
        }
        c14087f.f58334e = false;
        c14087f.f58333d = false;
        c14087f.f58331b = false;
        c14087f.m83566b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m83455a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
        if (!(contextM83423a == null ? false : C14094f.m83586a(contextM83423a, C14094f.f58357a))) {
            super.onStop();
            return;
        }
        C14043j c14043j = C14043j.a.f58200a;
        HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
        if (huiYanSdkConfigM83418b == null || !huiYanSdkConfigM83418b.isBackgroundStopAuth()) {
            super.onStop();
            return;
        }
        if (c14043j.f58194e) {
            super.onStop();
            return;
        }
        if (!this.f58239y) {
            super.onStop();
            return;
        }
        CameraHolder cameraHolder = this.f58231q;
        if (cameraHolder != null) {
            cameraHolder.release();
        }
        if (getContext() != null) {
            String resString = getResString(C14032R.string.txy_do_not_change_app_in_auth);
            InterfaceC14035b interfaceC14035b = c14043j.f58196g;
            if (interfaceC14035b != null) {
                interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", resString);
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorMsg(resString);
            compareResult.setErrorCode(214);
            m83462b((Object) compareResult);
        }
        super.onStop();
    }

    /* JADX INFO: renamed from: b */
    public final void m83458b() {
        HudView hudView;
        this.f58215a = (InterfaceC14082a) this.fragmentView.findViewById(C14032R.id.txy_camera_gather_view);
        View view = this.fragmentView;
        int i = C14032R.id.txy_cancel_txt_btn;
        view.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: l.ie1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114543a.m83438a(view2);
            }
        });
        this.f58216b = (ImageView) this.fragmentView.findViewById(C14032R.id.txy_camera_prepare_img);
        this.f58217c = (TextView) this.fragmentView.findViewById(C14032R.id.txy_auth_feed_back_txt);
        this.f58218d = (TextView) this.fragmentView.findViewById(C14032R.id.txy_auth_feed_back_extra_tip_txt);
        this.f58223i = (LoadingFrontAnimatorView) this.fragmentView.findViewById(C14032R.id.txy_auth_loading_front_animator_view);
        this.f58219e = (TextView) this.fragmentView.findViewById(C14032R.id.txy_count_down_txt_view);
        this.f58220f = (TextView) this.fragmentView.findViewById(i);
        this.f58221g = (HudView) this.fragmentView.findViewById(C14032R.id.txy_hud_view);
        HuiYanSdkConfig huiYanSdkConfigM83418b = C14043j.a.f58200a.m83418b();
        if (huiYanSdkConfigM83418b != null && huiYanSdkConfigM83418b.isShowDebugView() && (hudView = this.f58221g) != null) {
            hudView.setVisibility(0);
        }
        C14096h c14096h = new C14096h();
        this.f58230p = c14096h;
        TextView textView = this.f58218d;
        c14096h.f58364e.clear();
        c14096h.f58362c = textView;
        if (c14096h.f58360a == null) {
            HandlerThread handlerThread = new HandlerThread("showTips");
            c14096h.f58360a = handlerThread;
            handlerThread.start();
            c14096h.f58361b = new HandlerC14095g(c14096h, c14096h.f58360a.getLooper());
            c14096h.m83591b();
        }
        this.f58217c.setText(C14032R.string.txy_face_preparing3);
        if (this.f58219e != null) {
            C14099k.b.f58374a.f58370b = new C14056c(this);
        }
        this.f58233s = false;
        this.f58237w = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m83460b(final long j, final boolean z) {
        runOnUiThread(new Runnable() { // from class: l.me1
            @Override // java.lang.Runnable
            public final void run() {
                this.f136430a.m83436a(j, z);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m83462b(Object obj) {
        m83470m();
        if (obj instanceof CompareResult) {
            final CompareResult compareResult = (CompareResult) obj;
            AuthUiConfig authUiConfig = C14043j.a.f58200a.f58192c;
            if (!(authUiConfig == null ? true : authUiConfig.isShowErrorDialog())) {
                CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            } else {
                runOnUiThread(new Runnable() { // from class: l.he1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f109057a.m83443b(compareResult);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83461b(final ColorMatrixColorFilter colorMatrixColorFilter) {
        runOnUiThread(new Runnable() { // from class: l.le1
            @Override // java.lang.Runnable
            public final void run() {
                this.f131688a.m83437a(colorMatrixColorFilter);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m83459b(final int i) {
        runOnUiThread(new Runnable() { // from class: l.ne1
            @Override // java.lang.Runnable
            public final void run() {
                this.f141564a.m83435a(i);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m83463b(boolean z) {
        LoadingFrontAnimatorView loadingFrontAnimatorView = this.f58223i;
        if (loadingFrontAnimatorView != null) {
            loadingFrontAnimatorView.f58429l = false;
            if (z) {
                loadingFrontAnimatorView.setVisibility(8);
            }
            ValueAnimator valueAnimator = loadingFrontAnimatorView.f58419b;
            if (valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning() || loadingFrontAnimatorView.f58419b.isStarted()) {
                loadingFrontAnimatorView.f58419b.cancel();
                loadingFrontAnimatorView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m83457a(boolean z) {
        String str;
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "AuthingFragment", "user cancel the auth check.");
        if (z) {
            str = "PrivacyDialog";
        } else {
            AuthState authState = C14065b.b.f58281a.f58258a;
            c14068e.m83520a(1, "AuthingFragment", "cancelAuthCheckByUser current state is " + authState);
            if (authState.compareTo(AuthState.AUTH_FAIL) >= 0) {
                c14068e.m83520a(2, "AuthingFragment", "user cancel the auth check, but current state is error!");
            } else if (authState.compareTo(AuthState.AUTH_END) >= 0) {
                str = "WaitingPage";
            } else if (authState.compareTo(AuthState.START_CAMERA_PREVIEW) >= 0) {
                str = "AuthCheckPage";
            }
            str = "PreparePage";
        }
        String str2 = str;
        InterfaceC14035b interfaceC14035b = C14043j.a.f58200a.f58196g;
        if (interfaceC14035b != null) {
            interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "UserCancelAuth", "");
        }
        HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C14044a.f58205a.f58202b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo("UserCancel", 1, 0L, str2);
        }
        CommonUtils.sendErrorAndExitAuth(212, getResString(C14032R.string.txt_user_cancel_check));
    }

    /* JADX INFO: renamed from: a */
    public void m83456a(Object obj) {
        C14068e.a.f58293a.m83520a(1, "AuthingFragment", ">>>local auth fail");
        m83470m();
        if (obj instanceof CompareResult) {
            final CompareResult compareResult = (CompareResult) obj;
            runOnUiThread(new Runnable() { // from class: l.fe1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98540a.m83439a(compareResult);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m83438a(View view) {
        m83457a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83434a(float f) {
        String resString;
        boolean z;
        boolean z2;
        if (f < 4.0f) {
            resString = getResString(C14032R.string.txy_light_low);
            z = true;
        } else {
            resString = "";
            z = false;
        }
        if (f > 235.0f) {
            resString = getResString(C14032R.string.txy_light_strong);
            z2 = true;
            z = true;
        } else {
            z2 = false;
        }
        if (this.f58218d == null) {
            return;
        }
        boolean z3 = this.f58234t;
        if (!z) {
            if (z3) {
                this.f58234t = false;
                this.f58230p.m83590a("");
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f58230p.m83590a(resString);
        if (z2) {
            C14043j.a.f58200a.m83416a(HuiYanAuthTipsEvent.LIGHT_TOO_STRONG, true);
        } else {
            C14043j.a.f58200a.m83416a(HuiYanAuthTipsEvent.LIGHT_TOO_LOW, true);
        }
        this.f58234t = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m83455a() {
        if (this.f58215a instanceof View) {
            if (this.f58226l) {
                m83464c();
                ((View) this.f58215a).setVisibility(0);
            } else {
                this.f58216b.setVisibility(0);
                ((View) this.f58215a).setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83436a(long j, boolean z) {
        C14099k.b.f58374a.m83594a(j);
        TextView textView = this.f58219e;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
        AuthUiConfig authUiConfig = C14043j.a.f58200a.f58192c;
        if (authUiConfig == null || authUiConfig.isShowCountdown()) {
            return;
        }
        this.f58219e.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83439a(CompareResult compareResult) {
        m83463b(true);
        CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
        C14068e.a.f58293a.m83520a(2, "AuthingFragment", "local auth fail! code: " + compareResult.getErrorCode() + " msg: " + compareResult.getErrorMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83437a(ColorMatrixColorFilter colorMatrixColorFilter) {
        HuiYanReflectLayout huiYanReflectLayout = this.f58222h;
        if (huiYanReflectLayout != null && huiYanReflectLayout.f58415a != null) {
            huiYanReflectLayout.f58416b = colorMatrixColorFilter;
            huiYanReflectLayout.invalidate();
        }
        if (this.f58224j) {
            return;
        }
        this.f58224j = true;
        this.f58230p.m83590a("");
        m83470m();
        C14043j.a.f58200a.m83415a(HuiYanAuthEvent.REFLECT_CHECK, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83435a(int i) {
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
            C14068e.a.f58293a.m83520a(2, "AuthingFragment", "set current screen brightness error: " + e.getLocalizedMessage());
        }
    }
}
