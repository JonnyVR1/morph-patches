package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C1657e;
import com.facebook.login.LoginTargetApp;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ayb;
import p149l.p620;
import p149l.wum;
import p149l.yrv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m87232d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "", "resultCode", "resultIntent", "a", "(ILandroid/content/Intent;)V", "", "Z", "shouldCloseCustomTab", "Landroid/content/BroadcastReceiver;", "b", "Landroid/content/BroadcastReceiver;", "redirectReceiver", "Companion", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final String f5877c = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final String f5878d = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final String f5879e = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final String f5880f = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final String f5881g = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final String f5882h = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final String f5883i = Intrinsics.m87496l(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean shouldCloseCustomTab = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BroadcastReceiver redirectReceiver;

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m87232d2 = {"Lcom/facebook/CustomTabMainActivity$a;", "", "<init>", "()V", "", "urlString", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "EXTRA_ACTION", "Ljava/lang/String;", "EXTRA_CHROME_PACKAGE", "EXTRA_PARAMS", "EXTRA_TARGET_APP", "EXTRA_URL", "NO_ACTIVITY_EXCEPTION", "REFRESH_ACTION", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Bundle m7476b(String urlString) {
            Uri uri = Uri.parse(urlString);
            C1657e c1657e = C1657e.INSTANCE;
            Bundle bundleM8853o0 = C1657e.m8853o0(uri.getQuery());
            bundleM8853o0.putAll(C1657e.m8853o0(uri.getFragment()));
            return bundleM8853o0;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$b */
    @Metadata(m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
    public /* synthetic */ class C1501b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5886a;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            f5886a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7474a(int resultCode, Intent resultIntent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            yrv.m215864b(this).m215868e(broadcastReceiver);
        }
        if (resultIntent != null) {
            String stringExtra = resultIntent.getStringExtra(f5880f);
            Bundle bundleM7476b = stringExtra != null ? INSTANCE.m7476b(stringExtra) : new Bundle();
            p620 p620Var = p620.INSTANCE;
            Intent intent = getIntent();
            intent.getClass();
            Intent intentM167586m = p620.m167586m(intent, bundleM7476b, null);
            if (intentM167586m != null) {
                resultIntent = intentM167586m;
            }
            setResult(resultCode, resultIntent);
        } else {
            p620 p620Var2 = p620.INSTANCE;
            Intent intent2 = getIntent();
            intent2.getClass();
            setResult(resultCode, p620.m167586m(intent2, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        String str = CustomTabActivity.f5874b;
        if (Intrinsics.m87488d(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (savedInstanceState != null || (stringExtra = getIntent().getStringExtra(f5877c)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f5878d);
        boolean zM99538a = (C1501b.f5886a[LoginTargetApp.INSTANCE.m9120a(getIntent().getStringExtra(f5881g)).ordinal()] == 1 ? new wum(stringExtra, bundleExtra) : new ayb(stringExtra, bundleExtra)).m99538a(this, getIntent().getStringExtra(f5879e));
        this.shouldCloseCustomTab = false;
        if (!zM99538a) {
            setResult(0, getIntent().putExtra(f5883i, true));
            finish();
        } else {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                    context.getClass();
                    intent.getClass();
                    Intent intent2 = new Intent(this.this$0, (Class<?>) CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f5882h);
                    String str2 = CustomTabMainActivity.f5880f;
                    intent2.putExtra(str2, intent.getStringExtra(str2));
                    intent2.addFlags(603979776);
                    this.this$0.startActivity(intent2);
                }
            };
            this.redirectReceiver = broadcastReceiver;
            yrv.m215864b(this).m215866c(broadcastReceiver, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (Intrinsics.m87488d(f5882h, intent.getAction())) {
            yrv.m215864b(this).m215867d(new Intent(CustomTabActivity.f5875c));
            m7474a(-1, intent);
        } else if (Intrinsics.m87488d(CustomTabActivity.f5874b, intent.getAction())) {
            m7474a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            m7474a(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
