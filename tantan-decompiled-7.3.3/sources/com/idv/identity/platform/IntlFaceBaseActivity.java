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
import p153l.hfm;
import p153l.nfq0;
import p153l.o6r0;
import p153l.pxf0;
import p153l.sgc0;
import p153l.xrl;

/* JADX INFO: loaded from: classes7.dex */
public class IntlFaceBaseActivity extends ComponentActivity {

    /* JADX INFO: renamed from: com.idv.identity.platform.IntlFaceBaseActivity$a */
    public class C3865a extends ContextThemeWrapper {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Configuration f13454a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3865a(Context context, int i, Configuration configuration) {
            super(context, i);
            this.f13454a = configuration;
        }

        @Override // android.view.ContextThemeWrapper
        public void applyOverrideConfiguration(Configuration configuration) {
            if (configuration != null) {
                configuration.setTo(this.f13454a);
            }
            super.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: renamed from: H0 */
    private Locale m19178H0(String str) {
        if (!str.contains("-")) {
            return new Locale(str, "");
        }
        String[] strArrSplit = str.split("-");
        return new Locale(strArrSplit[0], strArrSplit[1]);
    }

    /* JADX INFO: renamed from: I0 */
    private Locale m19179I0() {
        String str = hfm.f109330o;
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
                return m19178H0(str);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m19180J0() {
        return !TextUtils.isEmpty(hfm.f109330o);
    }

    /* JADX INFO: renamed from: K0 */
    public void m19181K0(boolean z, boolean z2, int i) {
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
        if (m19180J0()) {
            Configuration configuration = context.getResources().getConfiguration();
            LocaleList localeList = new LocaleList(m19179I0());
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
            super.attachBaseContext(new C3865a(context.createConfigurationContext(configuration), sgc0.f167845b, configuration));
        } else {
            super.attachBaseContext(context);
        }
        pxf0.m174219a(getApplicationContext());
        pxf0.m174220b(this);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        xrl.m212838a().m212842e(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        nfq0.m162936b(getWindow(), false);
        getWindow().getDecorView().getRootView();
        xrl.m212838a().m212840c(this);
        o6r0.m166281a(toString() + ">>onCreate");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onCreate");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags(128);
        xrl.m212838a().m212842e(this);
        xrl.m212838a().m212841d(this);
        o6r0.m166281a(toString() + ">>onDestroy");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onDestroy");
        RecordService.getInstance().flush();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        o6r0.m166281a(toString() + ">>onPause");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onPause");
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        xrl.m212838a().m212843f(this);
        o6r0.m166281a(toString() + ">>onResume");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onResume");
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        o6r0.m166281a(toString() + ">>onStart");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onStart");
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        o6r0.m166281a(toString() + ">>onStop");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LifeCircle", "ActivityName", getClass().getName(), "action", "onStop");
    }
}
