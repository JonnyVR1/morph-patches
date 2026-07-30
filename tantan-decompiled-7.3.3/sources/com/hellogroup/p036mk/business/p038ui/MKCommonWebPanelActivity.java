package com.hellogroup.p036mk.business.p038ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.hellogroup.p036mk.business.base.activity.BaseMkActivity;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.math.Primes;
import p153l.ajw;
import p153l.i8g0;
import p153l.ilw;
import p153l.j50;
import p153l.jzv;
import p153l.q4g0;
import p153l.v1r;
import p153l.zqw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u001b8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00102\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\"\u001a\u00020!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010$R\u0018\u0010A\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010*¨\u0006D"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/MKCommonWebPanelActivity;", "Lcom/hellogroup/mk/business/base/activity/BaseMkActivity;", "<init>", "()V", "", "Y0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "a1", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", Permissions.TYPE, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "canGoBack", "j1", "(Z)V", "onBackPressed", "Ll/ilw;", "d1", "()Ll/ilw;", "e", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "f", "X0", "k1", "(Ljava/lang/String;)V", "mkUrl", "Ll/j50;", "g", "Ll/j50;", "V0", "()Ll/j50;", "f1", "(Ll/j50;)V", "binding", "h", "Z", "W0", "()Z", "h1", RXScreenCaptureService.KEY_INDEX, "transitionType", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class MKCommonWebPanelActivity extends BaseMkActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public j50 binding;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String transitionType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "MKCommonWebPanelActivity";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String mkUrl = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean canGoBack = true;

    /* JADX INFO: renamed from: Y0 */
    private final void m18133Y0() {
        String mkUrl;
        try {
            Intent intent = getIntent();
            if (intent == null || (mkUrl = intent.getStringExtra("param_start_url")) == null) {
                mkUrl = getMkUrl();
            }
            m18142k1(mkUrl);
            Uri uri = Uri.parse(getMkUrl());
            if (uri.getBooleanQueryParameter("_resize", false)) {
                ajw.m98498g(this, null);
            }
            m17782S0(Intrinsics.m88377d("1", uri.getQueryParameter("_ui_mode")));
            String queryParameter = uri.getQueryParameter("_transition_type");
            this.transitionType = queryParameter;
            v1r.m199050c(this, queryParameter);
        } catch (Throwable th) {
            jzv.m147730c(this.TAG, "", th);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public j50 m18134V0() {
        j50 j50Var = this.binding;
        if (j50Var == null) {
            Intrinsics.m88391r("binding");
        }
        return j50Var;
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public boolean getCanGoBack() {
        return this.canGoBack;
    }

    @NotNull
    /* JADX INFO: renamed from: X0, reason: from getter */
    public String getMkUrl() {
        return this.mkUrl;
    }

    /* JADX INFO: renamed from: a1 */
    public void m18137a1(@Nullable MKWebView mkWebView) {
    }

    @Nullable
    /* JADX INFO: renamed from: d1 */
    public ilw m18138d1() {
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public void m18139f1(@NotNull j50 j50Var) {
        j50Var.getClass();
        this.binding = j50Var;
    }

    /* JADX INFO: renamed from: h1 */
    public void m18140h1(boolean z) {
        this.canGoBack = z;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m18141j1(boolean canGoBack) {
        m18140h1(canGoBack);
    }

    /* JADX INFO: renamed from: k1 */
    public void m18142k1(@NotNull String str) {
        str.getClass();
        this.mkUrl = str;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        m18134V0().f118362c.m18178z0(requestCode, resultCode, data);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        v1r.m199049b(this);
        if (!m18134V0().f118362c.m18168B0() && getCanGoBack()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j50 j50VarM143493c = j50.m143493c(getLayoutInflater());
        j50VarM143493c.getClass();
        m18139f1(j50VarM143493c);
        setContentView(m18134V0().m143495b());
        q4g0.m175218f(getWindow());
        m18133Y0();
        if (i8g0.m139000b(getMkUrl())) {
            finish();
        } else {
            MKWebViewWrapper.m18166v0(m18134V0().f118362c, null, false, getMkUrl(), true, null, m18138d1(), null, null, new Function1<MKWebView, Unit>() { // from class: com.hellogroup.mk.business.ui.MKCommonWebPanelActivity.onCreate.1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MKWebView mKWebView) {
                    mKWebView.getClass();
                    MKCommonWebPanelActivity mKCommonWebPanelActivity = MKCommonWebPanelActivity.this;
                    mKCommonWebPanelActivity.m18137a1(mKCommonWebPanelActivity.m18134V0().f118362c.getMkWebView());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MKWebView mKWebView) {
                    invoke2(mKWebView);
                    return Unit.INSTANCE;
                }
            }, Primes.SMALL_FACTOR_LIMIT, null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m18134V0().f118362c.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m18134V0().f118362c.m18169D0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m18134V0().f118362c.m18170E0(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m18134V0().f118362c.m18171G0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m18134V0().f118362c.m18172H0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m18134V0().f118362c.m18173I0();
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.MKCommonWebPanelActivity$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/MKCommonWebPanelActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Ljava/lang/Class;", "Lcom/hellogroup/mk/business/ui/MKCommonWebPanelActivity;", "changeOpenUrlActivityClass", "", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m18143b(Companion companion, Context context, String str, Class cls, int i, Object obj) {
            if ((i & 4) != 0) {
                cls = null;
            }
            companion.m18144a(context, str, cls);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: a */
        public final void m18144a(@NotNull Context context, @Nullable String url, @Nullable Class<? extends MKCommonWebPanelActivity> changeOpenUrlActivityClass) {
            context.getClass();
            if (changeOpenUrlActivityClass == null) {
                changeOpenUrlActivityClass = MKCommonWebPanelActivity.class;
            }
            Intent intent = new Intent(context, changeOpenUrlActivityClass);
            intent.putExtra("param_start_url", url);
            if (!(context instanceof Activity)) {
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            zqw.m221059k(intent, url);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
