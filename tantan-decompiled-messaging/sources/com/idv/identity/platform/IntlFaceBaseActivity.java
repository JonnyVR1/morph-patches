package com.idv.identity.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.util.Locale;
import p149l.gpf0;
import p149l.i6q0;
import p149l.ixq0;
import p149l.kpl;
import p149l.m8c0;
import p149l.rcm;

/* JADX INFO: loaded from: classes7.dex */
public class IntlFaceBaseActivity extends ComponentActivity {

    /* JADX INFO: renamed from: com.idv.identity.platform.IntlFaceBaseActivity$a */
    public class C3706a extends ContextThemeWrapper {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Configuration f12713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3706a(Context context, int i, Configuration configuration) {
            super(context, i);
            this.f12713a = configuration;
        }

        @Override // android.view.ContextThemeWrapper
        public void applyOverrideConfiguration(Configuration configuration) {
            if (configuration != null) {
                configuration.setTo(this.f12713a);
            }
            super.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: renamed from: G0 */
    private Locale m18101G0(String str) {
        if (!str.contains("-")) {
            return new Locale(str, "");
        }
        String[] strArrSplit = str.split("-");
        return new Locale(strArrSplit[0], strArrSplit[1]);
    }

    /* JADX INFO: renamed from: H0 */
    private Locale m18102H0() {
        String str = rcm.f158800o;
        str.getClass();
        switch (str) {
            case "zh-Hans":
                return Locale.SIMPLIFIED_CHINESE;
            case "zh-Hant":
                return Locale.TRADITIONAL_CHINESE;
            case "id":
                return new Locale("id", "");
            case "ja":
                return Locale.JAPANESE;
            case "ko":
                return Locale.KOREAN;
            case "ms":
                return new Locale("ms", "my");
            case "th":
                return new Locale("th", "");
            case "vi":
                return new Locale("vi", "");
            default:
                return m18101G0(str);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m18103I0() {
        return !TextUtils.isEmpty(rcm.f158800o);
    }

    /* JADX INFO: renamed from: J0 */
    public void m18104J0(boolean z, boolean z2, int i) {
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        if (z) {
            getWindow().setStatusBarColor(0);
        } else {
            getWindow().setStatusBarColor(getResources().getColor(i));
        }
        if (z2) {
            getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (m18103I0()) {
            Configuration configuration = context.getResources().getConfiguration();
            LocaleList localeList = new LocaleList(m18102H0());
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
            super.attachBaseContext(new C3706a(context.createConfigurationContext(configuration), m8c0.f132562b, configuration));
        } else {
            super.attachBaseContext(context);
        }
        gpf0.m127351a(getApplicationContext());
        gpf0.m127352b(this);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        kpl.m146872a().m146876e(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        i6q0.m134631b(getWindow(), false);
        getWindow().getDecorView().getRootView();
        kpl.m146872a().m146874c(this);
        ixq0.m138884a(toString() + ">>onCreate");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onCreate");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags(128);
        kpl.m146872a().m146876e(this);
        kpl.m146872a().m146875d(this);
        ixq0.m138884a(toString() + ">>onDestroy");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onDestroy");
        RecordService.getInstance().flush();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ixq0.m138884a(toString() + ">>onPause");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onPause");
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        kpl.m146872a().m146877f(this);
        ixq0.m138884a(toString() + ">>onResume");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onResume");
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        ixq0.m138884a(toString() + ">>onStart");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onStart");
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        ixq0.m138884a(toString() + ">>onStop");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onStop");
    }
}
