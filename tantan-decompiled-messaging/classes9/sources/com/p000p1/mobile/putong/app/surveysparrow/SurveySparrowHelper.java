package com.p000p1.mobile.putong.app.surveysparrow;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.o;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.app.surveysparrow.SurveySparrowHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SurveyData;
import com.p1.mobile.putong.data.SurveySparrowData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.surveysparrow.ss_android_sdk.SsSurvey;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.e30;
import l.jcr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import p006l.z4h0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J%\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/app/surveysparrow/SurveySparrowHelper;", "", "<init>", "()V", "", "n", "l", "Landroid/app/Activity;", "activity", "", "surveyToken", "", "forceComplete", "r", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "", "resultCode", "Landroid/content/Intent;", "data", "o", "(ILandroid/content/Intent;)V", "i", "Ll/z4h0;", "a", "Ll/z4h0;", "api", "Lcom/p1/mobile/putong/data/SurveyData;", "b", "Lcom/p1/mobile/putong/data/SurveyData;", "surveyData", "c", "Lkotlin/Lazy;", "m", "()I", "surveyInterval", "", "d", "J", "lastFetchTime", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class SurveySparrowHelper {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static SurveyData surveyData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static long lastFetchTime;

    @NotNull
    public static final SurveySparrowHelper INSTANCE = new SurveySparrowHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final z4h0 api = new z4h0();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy surveyInterval = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.a5h0
        public final Object invoke() {
            return Integer.valueOf(SurveySparrowHelper.m1588d());
        }
    });

    /* JADX INFO: renamed from: d */
    public static int m1588d() {
        return RemoteConfig.x().z("intl_survey_check_interval", 3600) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m1593j(SurveySparrowData surveySparrowData) {
        SurveyData surveyData2;
        String str;
        Act.r rVarForeground_;
        WeakReference weakReference;
        Activity activity;
        if (surveySparrowData != null && (surveyData2 = surveySparrowData.data) != null && (str = surveyData2.token) != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null && (rVarForeground_ = Act.foreground_()) != null && (weakReference = rVarForeground_.a) != null && (activity = (Activity) weakReference.get()) != null) {
                SurveyData surveyData3 = surveySparrowData.data;
                surveyData = surveyData3;
                INSTANCE.m1604r(activity, str, surveyData3.forceComplete);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m1594k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m1595p(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m1596q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m1597s(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m1598t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public final void m1599i() {
        WeakReference weakReference;
        if (!qib0.f19805c0.signedIn_() || System.currentTimeMillis() - lastFetchTime <= m1601m()) {
            return;
        }
        Act.r rVarForeground_ = Act.foreground_();
        if (((rVarForeground_ == null || (weakReference = rVarForeground_.a) == null) ? null : (Activity) weakReference.get()) instanceof Act) {
            lastFetchTime = System.currentTimeMillis();
            try {
                Result.Companion companion = Result.Companion;
                c<SurveySparrowData> cVarM28568D = api.m28568D();
                final Function1 function1 = new Function1() { // from class: l.b5h0
                    public final Object invoke(Object obj) {
                        return SurveySparrowHelper.m1593j((SurveySparrowData) obj);
                    }
                };
                Result.constructor-impl(cVarM28568D.subscribe(new e30() { // from class: l.c5h0
                    public final void call(Object obj) {
                        SurveySparrowHelper.m1594k(function1, obj);
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.a(th));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1600l() {
        lastFetchTime = 0L;
        m1599i();
    }

    /* JADX INFO: renamed from: m */
    public final int m1601m() {
        return ((Number) surveyInterval.getValue()).intValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m1602n() {
        o.Companion.a().getLifecycle().a(new LifecycleEventObserver() { // from class: com.p1.mobile.putong.app.surveysparrow.SurveySparrowHelper$initSurvey$appLifecycleObserver$1

            /* JADX INFO: renamed from: com.p1.mobile.putong.app.surveysparrow.SurveySparrowHelper$initSurvey$appLifecycleObserver$1$a */
            @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C0126a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f1191a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f1191a = iArr;
                }
            }

            public void onStateChanged(jcr source, Lifecycle.Event event) {
                source.getClass();
                event.getClass();
                if (C0126a.f1191a[event.ordinal()] == 1) {
                    SurveySparrowHelper.INSTANCE.m1599i();
                }
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m1603o(int resultCode, @Nullable Intent data) {
        SurveyData surveyData2;
        String str;
        if (resultCode != -1 || data == null || (surveyData2 = surveyData) == null || !surveyData2.forceComplete) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            z4h0 z4h0Var = api;
            SurveyData surveyData3 = surveyData;
            if (surveyData3 == null || (str = surveyData3.token) == null) {
                str = "";
            }
            c<?> cVarM28569F = z4h0Var.m28569F(str);
            final Function1 function1 = new Function1() { // from class: l.d5h0
                public final Object invoke(Object obj) {
                    return SurveySparrowHelper.m1595p(obj);
                }
            };
            Result.constructor-impl(cVarM28569F.subscribe(new e30() { // from class: l.e5h0
                public final void call(Object obj) {
                    SurveySparrowHelper.m1596q(function1, obj);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1604r(@NotNull Activity activity, @NotNull String surveyToken, boolean forceComplete) {
        String str;
        String strValueOf;
        PhoneNumber phoneNumber;
        String str2;
        PhoneNumber phoneNumber2;
        String str3 = "male";
        activity.getClass();
        surveyToken.getClass();
        if (StringsKt.e0(surveyToken)) {
            return;
        }
        try {
            SsSurvey ssSurvey = new SsSurvey("hello8253.surveysparrow.com", surveyToken);
            try {
                Result.Companion companion = Result.Companion;
                User userMe_ = qib0.f19805c0.me_();
                if (userMe_ != null) {
                    ssSurvey.addCustomParam("publicID", userMe_.publicId);
                    ssSurvey.addCustomParam("age", String.valueOf(userMe_.age.intValue()));
                    ssSurvey.addCustomParam("name", userMe_.name);
                    if (!TEnum.equals(userMe_.gender, "male")) {
                        str3 = "female";
                    }
                    ssSurvey.addCustomParam("gender", str3);
                    Settings settings = userMe_.settings;
                    String str4 = "";
                    if (settings == null || (str = settings.email) == null) {
                        str = "";
                    }
                    ssSurvey.addCustomParam("userEmail", str);
                    Settings settings2 = userMe_.settings;
                    if (settings2 == null || (phoneNumber2 = settings2.phoneNumber) == null || (strValueOf = String.valueOf(phoneNumber2.countryCode)) == null) {
                        strValueOf = "";
                    }
                    ssSurvey.addCustomParam("countryCode", strValueOf);
                    Settings settings3 = userMe_.settings;
                    if (settings3 != null && (phoneNumber = settings3.phoneNumber) != null && (str2 = phoneNumber.number) != null) {
                        str4 = str2;
                    }
                    ssSurvey.addCustomParam("phoneNumber", str4);
                } else {
                    userMe_ = null;
                }
                Result.constructor-impl(userMe_);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.a(th));
            }
            com.surveysparrow.ss_android_sdk.c cVar = new com.surveysparrow.ss_android_sdk.c(activity, ssSurvey);
            cVar.a(true);
            cVar.d(1242);
            if (forceComplete) {
                return;
            }
            try {
                c<?> cVarM28569F = api.m28569F(surveyToken);
                final Function1 function1 = new Function1() { // from class: l.f5h0
                    public final Object invoke(Object obj) {
                        return SurveySparrowHelper.m1597s(obj);
                    }
                };
                Result.constructor-impl(cVarM28569F.subscribe(new e30() { // from class: l.g5h0
                    public final void call(Object obj) {
                        SurveySparrowHelper.m1598t(function1, obj);
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                Result.constructor-impl(ResultKt.a(th2));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
