package com.surveysparrow.ss_android_sdk;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.core.data.Active;
import com.surveysparrow.ss_android_sdk.SsSurveyFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.a60;
import p149l.d60;
import p149l.e16;
import p149l.e60;
import p149l.g60;
import p149l.lf50;
import p149l.m3c0;
import p149l.mf50;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public final class SsSurveyFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    private String f55700A;

    /* JADX INFO: renamed from: C */
    private ProgressBar f55702C;

    /* JADX INFO: renamed from: D */
    private ObjectAnimator f55703D;

    /* JADX INFO: renamed from: E */
    public JSONObject f55704E;

    /* JADX INFO: renamed from: F */
    private mf50 f55705F;

    /* JADX INFO: renamed from: H */
    private lf50 f55707H;

    /* JADX INFO: renamed from: J */
    private g60<Intent> f55709J;

    /* JADX INFO: renamed from: K */
    private ValueCallback<Uri> f55710K;

    /* JADX INFO: renamed from: L */
    private ValueCallback<Uri[]> f55711L;

    /* JADX INFO: renamed from: N */
    private WebView f55713N;

    /* JADX INFO: renamed from: O */
    private g60<String> f55714O;

    /* JADX INFO: renamed from: z */
    private SsSurvey f55715z;

    /* JADX INFO: renamed from: B */
    private int f55701B = 0;

    /* JADX INFO: renamed from: G */
    public Boolean f55706G = Boolean.FALSE;

    /* JADX INFO: renamed from: I */
    private boolean f55708I = false;

    /* JADX INFO: renamed from: M */
    private Uri f55712M = null;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$a */
    public class C13506a implements AsyncTaskC13511a.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CompletableFuture f55716a;

        public C13506a(CompletableFuture completableFuture) {
            this.f55716a = completableFuture;
        }

        @Override // com.surveysparrow.ss_android_sdk.AsyncTaskC13511a.a
        public void onResponse(String str) {
            this.f55716a.complete(str);
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$b */
    public class ViewOnClickListenerC13507b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FrameLayout f55718a;

        /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$b$a */
        public class a implements AsyncTaskC13512b.a {
            public a() {
            }

            @Override // com.surveysparrow.ss_android_sdk.AsyncTaskC13512b.a
            public void onResponse(String str) {
                try {
                    SsSurveyFragment.this.f55704E = new JSONObject(str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$b$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewOnClickListenerC13507b.this.f55718a.setVisibility(8);
            }
        }

        public ViewOnClickListenerC13507b(FrameLayout frameLayout) {
            this.f55718a = frameLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "https://" + SsSurveyFragment.this.f55715z.getDomain() + "/nps/widget/contact/" + SsSurveyFragment.this.f55701B;
            AsyncTaskC13512b asyncTaskC13512b = new AsyncTaskC13512b(str, SsSurveyFragment.this.f55715z.getSurveyToken(), SsSurveyFragment.this.f55701B, SsSurveyFragment.this.f55706G, new a());
            asyncTaskC13512b.execute(str);
            try {
                asyncTaskC13512b.m81012a();
            } catch (InterruptedException e) {
                Log.e("SS_VALIDATION", "Error in closeSurvey" + e);
            }
            try {
                if (SsSurveyFragment.this.f55704E.getBoolean("surveyClosed")) {
                    lf50 lf50Var = SsSurveyFragment.this.f55707H;
                    SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
                    if (lf50Var != null) {
                        ssSurveyFragment.f55707H.mo80987L();
                    } else {
                        ssSurveyFragment.requireActivity().runOnUiThread(new b());
                    }
                }
            } catch (Exception e2) {
                Log.e("SS_VALIDATION", "Error in  processing  close survey json" + e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$c */
    public class C13508c extends WebViewClient {
        final /* synthetic */ HashMap val$properties;

        public C13508c(HashMap map) {
            this.val$properties = map;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.val$properties.containsKey("isCloseButtonEnabled") || Boolean.TRUE.equals(this.val$properties.get("isCloseButtonEnabled"))) {
                webView.evaluateJavascript("const styleTag = document.createElement(\"style\"); styleTag.innerHTML = `.ss-language-selector--wrapper { margin-right: 45px; }`; document.body.appendChild(styleTag);", null);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.contains("https://surveysparrow.com/thankyou") || !SsSurveyFragment.this.f55715z.getThankYouRedirect()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$d */
    public class C13509d extends WebChromeClient {
        final /* synthetic */ ImageButton val$closeButton;

        public C13509d(ImageButton imageButton) {
            this.val$closeButton = imageButton;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
            if (i == 100) {
                ssSurveyFragment.f55702C.setVisibility(8);
                this.val$closeButton.setVisibility(0);
            } else {
                ssSurveyFragment.f55703D = ObjectAnimator.ofInt(ssSurveyFragment.f55702C, "progress", SsSurveyFragment.this.f55702C.getProgress(), i);
                SsSurveyFragment.this.f55703D.setDuration(300L);
                SsSurveyFragment.this.f55703D.start();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (SsSurveyFragment.this.f55711L != null) {
                SsSurveyFragment.this.f55711L.onReceiveValue(null);
            }
            SsSurveyFragment.this.f55711L = valueCallback;
            if (SsSurveyFragment.this.f55708I) {
                return true;
            }
            try {
                SsSurveyFragment.this.startActivityForResult(fileChooserParams.createIntent(), 1184);
                return true;
            } catch (ActivityNotFoundException unused) {
                SsSurveyFragment.this.f55711L = null;
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m80989V3(SsSurveyFragment ssSurveyFragment, Boolean bool) {
        ssSurveyFragment.getClass();
        if (!bool.booleanValue()) {
            ssSurveyFragment.f55708I = false;
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(ssSurveyFragment.getActivity().getPackageManager()) != null) {
            ssSurveyFragment.f55709J.m124547b(intent);
        } else {
            ssSurveyFragment.f55708I = false;
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m80990W3(SsSurveyFragment ssSurveyFragment, ActivityResult activityResult) {
        ssSurveyFragment.getClass();
        ssSurveyFragment.m81004k4(activityResult.m201b(), activityResult.m200a());
    }

    /* JADX INFO: renamed from: k4 */
    private void m81004k4(int i, Intent intent) {
        Bitmap bitmap;
        if (i == -1 && intent != null && (bitmap = (Bitmap) intent.getExtras().get("data")) != null) {
            File file = new File(requireContext().getFilesDir(), "image_" + System.currentTimeMillis() + ".png");
            this.f55712M = Uri.fromFile(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    this.f55711L.onReceiveValue(new Uri[]{this.f55712M});
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                this.f55711L.onReceiveValue(null);
            }
            this.f55711L = null;
        }
        if (i != -1) {
            this.f55711L.onReceiveValue(null);
            this.f55711L = null;
        }
        this.f55708I = false;
    }

    /* JADX INFO: renamed from: l4 */
    public void m81005l4(lf50 lf50Var) {
        this.f55707H = lf50Var;
    }

    /* JADX INFO: renamed from: m4 */
    public void m81006m4(int i) {
        this.f55701B = i;
    }

    /* JADX INFO: renamed from: n4 */
    public SsSurveyFragment m81007n4(SsSurvey ssSurvey) {
        this.f55715z = ssSurvey;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 1184) {
            if (i != 1183) {
                super.onActivityResult(i, i2, intent);
                return;
            } else {
                if (this.f55710K == null) {
                    return;
                }
                this.f55710K.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                this.f55710K = null;
                return;
            }
        }
        if (this.f55711L == null) {
            return;
        }
        if (i2 != -1 || intent == null) {
            uriArr = null;
        } else {
            if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                uriArr = new Uri[itemCount];
                for (int i3 = 0; i3 < itemCount; i3++) {
                    uriArr[i3] = intent.getClipData().getItemAt(i3).getUri();
                }
            } else if (intent.getData() != null) {
                uriArr = new Uri[]{intent.getData()};
            } else {
                uriArr = null;
            }
        }
        this.f55711L.onReceiveValue(uriArr);
        this.f55711L = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        this.f55700A = getActivity().getClass().getSimpleName();
        super.onAttach(context);
        this.f55705F = (mf50) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f55714O = registerForActivityResult(new d60(), new a60() { // from class: l.msf0
            @Override // p149l.a60
            /* JADX INFO: renamed from: a */
            public final void mo2610a(Object obj) {
                SsSurveyFragment.m80989V3(this.f135480a, (Boolean) obj);
            }
        });
        this.f55709J = registerForActivityResult(new e60(), new a60() { // from class: l.nsf0
            @Override // p149l.a60
            /* JADX INFO: renamed from: a */
            public final void mo2610a(Object obj) {
                SsSurveyFragment.m80990W3(this.f140265a, (ActivityResult) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13506a c13506a = null;
        if (!this.f55700A.equals("SsSurveyActivity")) {
            SsSurvey.C13503a[] customParams = this.f55715z.getCustomParams();
            String str = "https://" + this.f55715z.getDomain() + "/sdk/validate-survey/" + this.f55715z.getSurveyToken();
            CompletableFuture completableFuture = new CompletableFuture();
            new AsyncTaskC13511a(str, customParams, new C13506a(completableFuture)).execute(str);
            completableFuture.join();
            try {
                JSONObject jSONObject = new JSONObject((String) completableFuture.get());
                jSONObject.toString();
                if (!jSONObject.getBoolean(Active.TYPE)) {
                    return null;
                }
                if (jSONObject.has("widgetContactId")) {
                    this.f55701B = jSONObject.getInt("widgetContactId");
                }
            } catch (Exception e) {
                Log.e("SS_VALIDATION", "Error in  processing  apiCallTask json" + e);
            }
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        ProgressBar progressBar = new ProgressBar(getActivity(), null, R.attr.progressBarStyleHorizontal);
        this.f55702C = progressBar;
        progressBar.setMax(100);
        this.f55702C.setLayoutParams(new FrameLayout.LayoutParams(-1, 6, 48));
        WebView webView = new WebView(getActivity());
        this.f55713N = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f55713N.getSettings().setDomStorageEnabled(true);
        this.f55713N.addJavascriptInterface(new C13510e(this, c13506a), "SsAndroidSdk");
        ConstraintLayout constraintLayout = new ConstraintLayout(getActivity());
        constraintLayout.setLayoutParams(new ConstraintLayout.C0220a(-1, -1));
        ImageButton imageButton = new ImageButton(getActivity());
        imageButton.setImageResource(m3c0.f131036a);
        imageButton.setBackgroundResource(m3c0.f131037b);
        imageButton.setClickable(true);
        imageButton.setPadding(10, 10, 10, 10);
        imageButton.setVisibility(8);
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-2, -2);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        c0220a.f1268s = 0;
        c0220a.f1251h = 0;
        c0220a.setMargins(0, iApplyDimension, iApplyDimension, 0);
        imageButton.setLayoutParams(c0220a);
        constraintLayout.addView(imageButton);
        HashMap properties = this.f55715z.getProperties() != null ? this.f55715z.getProperties() : new HashMap();
        imageButton.setOnClickListener(new ViewOnClickListenerC13507b(frameLayout));
        this.f55713N.setWebViewClient(new C13508c(properties));
        this.f55713N.setWebChromeClient(new C13509d(imageButton));
        this.f55713N.loadUrl(this.f55715z.getSsUrl());
        frameLayout.addView(this.f55713N);
        frameLayout.addView(this.f55702C);
        if (!properties.containsKey("isCloseButtonEnabled") || Boolean.TRUE.equals(properties.get("isCloseButtonEnabled"))) {
            frameLayout.addView(constraintLayout);
        }
        return frameLayout;
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$e */
    public class C13510e {
        private C13510e() {
        }

        @JavascriptInterface
        public void captureImage() {
            if (SsSurveyFragment.this.f55708I) {
                return;
            }
            SsSurveyFragment.this.f55708I = true;
            if (e16.m114373a(SsSurveyFragment.this.getActivity(), "android.permission.CAMERA") != 0) {
                SsSurveyFragment.this.f55714O.m124547b("android.permission.CAMERA");
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            ComponentName componentNameResolveActivity = intent.resolveActivity(SsSurveyFragment.this.getActivity().getPackageManager());
            SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
            if (componentNameResolveActivity != null) {
                ssSurveyFragment.f55709J.m124547b(intent);
            } else {
                ssSurveyFragment.f55708I = false;
            }
        }

        @JavascriptInterface
        public void shareData(String str) {
            SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
            ssSurveyFragment.f55706G = Boolean.TRUE;
            ssSurveyFragment.f55705F.mo80988m(C13513c.m81016e(str));
        }

        public /* synthetic */ C13510e(SsSurveyFragment ssSurveyFragment, C13506a c13506a) {
            this();
        }
    }
}
