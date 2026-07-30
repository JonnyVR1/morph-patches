package p149l;

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
public final class tss0 implements fvt0 {

    /* JADX INFO: renamed from: a */
    public final Application f171954a;

    /* JADX INFO: renamed from: b */
    public final vns0 f171955b;

    /* JADX INFO: renamed from: c */
    public final Handler f171956c;

    /* JADX INFO: renamed from: d */
    public final Executor f171957d;

    /* JADX INFO: renamed from: e */
    public final gsu0 f171958e;

    /* JADX INFO: renamed from: f */
    public final wer0 f171959f;

    /* JADX INFO: renamed from: g */
    public final ywr0 f171960g;

    /* JADX INFO: renamed from: h */
    public final nhr0 f171961h;

    public tss0(Application application, vns0 vns0Var, Handler handler, Executor executor, gsu0 gsu0Var, wer0 wer0Var, ywr0 ywr0Var, nhr0 nhr0Var) {
        this.f171954a = application;
        this.f171955b = vns0Var;
        this.f171956c = handler;
        this.f171957d = executor;
        this.f171958e = gsu0Var;
        this.f171959f = wer0Var;
        this.f171960g = ywr0Var;
        this.f171961h = nhr0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // p149l.fvt0
    @UiThread
    /* JADX INFO: renamed from: a */
    public final boolean mo123369a(String str, JSONObject jSONObject) {
        switch (str) {
            case "load_complete":
                this.f171960g.m216420j();
                return true;
            case "configure_app_assets":
                m190568b();
                return true;
            case "browser":
                m190572f(jSONObject);
                return true;
            case "dismiss":
                switch (jSONObject.optString(NotificationCompat.CATEGORY_STATUS)) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "personalized":
                    case "CONSENT_SIGNAL_SUFFICIENT":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                    case "non_personalized":
                        this.f171960g.m216418h(3);
                    default:
                        this.f171960g.m216419i(new zzg(1, "We are getting something wrong with the webview."));
                }
            default:
                return false;
        }
    }

    @UiThread
    /* JADX INFO: renamed from: b */
    public final void m190568b() {
        this.f171957d.execute(new Runnable() { // from class: l.rrs0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160776a.m190569c();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m190569c() {
        String strConcat;
        JSONObject jSONObject = new JSONObject();
        Application application = this.f171954a;
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
            for (String str : this.f171961h.m159447b().keySet()) {
                jSONObject2.put(str, this.f171961h.m159447b().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        this.f171960g.m216416d().m13763d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m190570d(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri uri = Uri.parse(str);
        this.f171958e.m127840b(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.f171959f);
    }

    /* JADX INFO: renamed from: e */
    public final void m190571e(int i, String str, String str2) {
        this.f171960g.m216421k(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public final void m190572f(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        TextUtils.isEmpty(strOptString);
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString));
        }
        try {
            this.f171955b.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            "Action[browser]: can not open url: ".concat(String.valueOf(strOptString));
        }
    }

    @Override // p149l.fvt0
    public final Executor zza() {
        final Handler handler = this.f171956c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: l.mqs0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
