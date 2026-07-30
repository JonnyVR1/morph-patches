package p153l;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.UiThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z1t0 implements l4u0 {

    /* JADX INFO: renamed from: a */
    public final Application f202592a;

    /* JADX INFO: renamed from: b */
    public final bxs0 f202593b;

    /* JADX INFO: renamed from: c */
    public final Handler f202594c;

    /* JADX INFO: renamed from: d */
    public final Executor f202595d;

    /* JADX INFO: renamed from: e */
    public final m1v0 f202596e;

    /* JADX INFO: renamed from: f */
    public final cor0 f202597f;

    /* JADX INFO: renamed from: g */
    public final e6s0 f202598g;

    /* JADX INFO: renamed from: h */
    public final tqr0 f202599h;

    public z1t0(Application application, bxs0 bxs0Var, Handler handler, Executor executor, m1v0 m1v0Var, cor0 cor0Var, e6s0 e6s0Var, tqr0 tqr0Var) {
        this.f202592a = application;
        this.f202593b = bxs0Var;
        this.f202594c = handler;
        this.f202595d = executor;
        this.f202596e = m1v0Var;
        this.f202597f = cor0Var;
        this.f202598g = e6s0Var;
        this.f202599h = tqr0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // p153l.l4u0
    @UiThread
    /* JADX INFO: renamed from: a */
    public final boolean mo111689a(String str, JSONObject jSONObject) {
        switch (str) {
            case "load_complete":
                this.f202598g.m119677j();
                return true;
            case "configure_app_assets":
                m218375b();
                return true;
            case "browser":
                m218379f(jSONObject);
                return true;
            case "dismiss":
                switch (jSONObject.optString(NotificationCompat.CATEGORY_STATUS)) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "personalized":
                    case "CONSENT_SIGNAL_SUFFICIENT":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                    case "non_personalized":
                        this.f202598g.m119675h(3);
                    default:
                        this.f202598g.m119676i(new zzg(1, "We are getting something wrong with the webview."));
                }
            default:
                return false;
        }
    }

    @UiThread
    /* JADX INFO: renamed from: b */
    public final void m218375b() {
        this.f202595d.execute(new Runnable() { // from class: l.x0t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191937a.m218376c();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m218376c() {
        String strConcat;
        JSONObject jSONObject = new JSONObject();
        Application application = this.f202592a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.f202599h.m192352b().keySet()) {
                jSONObject2.put(str, this.f202599h.m192352b().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        this.f202598g.m119673d().m13817d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m218377d(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri uri = Uri.parse(str);
        this.f202596e.m156722b(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.f202597f);
    }

    /* JADX INFO: renamed from: e */
    public final void m218378e(int i, String str, String str2) {
        this.f202598g.m119678k(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public final void m218379f(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        TextUtils.isEmpty(strOptString);
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString));
        }
        try {
            this.f202593b.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            "Action[browser]: can not open url: ".concat(String.valueOf(strOptString));
        }
    }

    @Override // p153l.l4u0
    public final Executor zza() {
        final Handler handler = this.f202594c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: l.szs0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
