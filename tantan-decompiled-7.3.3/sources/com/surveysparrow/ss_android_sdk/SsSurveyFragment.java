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
import com.p051p1.mobile.putong.core.data.Active;
import com.surveysparrow.ss_android_sdk.SsSurveyFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.a60;
import p153l.c60;
import p153l.j26;
import p153l.rbc0;
import p153l.rn50;
import p153l.sn50;
import p153l.w50;
import p153l.z50;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public final class SsSurveyFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    private String f56548A;

    /* JADX INFO: renamed from: C */
    private ProgressBar f56550C;

    /* JADX INFO: renamed from: D */
    private ObjectAnimator f56551D;

    /* JADX INFO: renamed from: E */
    public JSONObject f56552E;

    /* JADX INFO: renamed from: F */
    private sn50 f56553F;

    /* JADX INFO: renamed from: H */
    private rn50 f56555H;

    /* JADX INFO: renamed from: J */
    private c60<Intent> f56557J;

    /* JADX INFO: renamed from: K */
    private ValueCallback<Uri> f56558K;

    /* JADX INFO: renamed from: L */
    private ValueCallback<Uri[]> f56559L;

    /* JADX INFO: renamed from: N */
    private WebView f56561N;

    /* JADX INFO: renamed from: O */
    private c60<String> f56562O;

    /* JADX INFO: renamed from: z */
    private SsSurvey f56563z;

    /* JADX INFO: renamed from: B */
    private int f56549B = 0;

    /* JADX INFO: renamed from: G */
    public Boolean f56554G = Boolean.FALSE;

    /* JADX INFO: renamed from: I */
    private boolean f56556I = false;

    /* JADX INFO: renamed from: M */
    private Uri f56560M = null;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$a */
    public class C13669a implements AsyncTaskC13674a.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CompletableFuture f56564a;

        public C13669a(CompletableFuture completableFuture) {
            this.f56564a = completableFuture;
        }

        @Override // com.surveysparrow.ss_android_sdk.AsyncTaskC13674a.a
        public void onResponse(String str) {
            this.f56564a.complete(str);
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$b */
    public class ViewOnClickListenerC13670b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FrameLayout f56566a;

        /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$b$a */
        public class a implements AsyncTaskC13675b.a {
            public a() {
            }

            @Override // com.surveysparrow.ss_android_sdk.AsyncTaskC13675b.a
            public void onResponse(String str) {
                try {
                    SsSurveyFragment.this.f56552E = new JSONObject(str);
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
                ViewOnClickListenerC13670b.this.f56566a.setVisibility(8);
            }
        }

        public ViewOnClickListenerC13670b(FrameLayout frameLayout) {
            this.f56566a = frameLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "https://" + SsSurveyFragment.this.f56563z.getDomain() + "/nps/widget/contact/" + SsSurveyFragment.this.f56549B;
            AsyncTaskC13675b asyncTaskC13675b = new AsyncTaskC13675b(str, SsSurveyFragment.this.f56563z.getSurveyToken(), SsSurveyFragment.this.f56549B, SsSurveyFragment.this.f56554G, new a());
            asyncTaskC13675b.execute(str);
            try {
                asyncTaskC13675b.m82195a();
            } catch (InterruptedException e) {
                Log.e("SS_VALIDATION", "Error in closeSurvey" + e);
            }
            try {
                if (SsSurveyFragment.this.f56552E.getBoolean("surveyClosed")) {
                    rn50 rn50Var = SsSurveyFragment.this.f56555H;
                    SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
                    if (rn50Var != null) {
                        ssSurveyFragment.f56555H.mo82170M();
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
    public class C13671c extends WebViewClient {
        final /* synthetic */ HashMap val$properties;

        public C13671c(HashMap map) {
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
            if (str.contains("https://surveysparrow.com/thankyou") || !SsSurveyFragment.this.f56563z.getThankYouRedirect()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$d */
    public class C13672d extends WebChromeClient {
        final /* synthetic */ ImageButton val$closeButton;

        public C13672d(ImageButton imageButton) {
            this.val$closeButton = imageButton;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
            if (i == 100) {
                ssSurveyFragment.f56550C.setVisibility(8);
                this.val$closeButton.setVisibility(0);
            } else {
                ssSurveyFragment.f56551D = ObjectAnimator.ofInt(ssSurveyFragment.f56550C, "progress", SsSurveyFragment.this.f56550C.getProgress(), i);
                SsSurveyFragment.this.f56551D.setDuration(300L);
                SsSurveyFragment.this.f56551D.start();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (SsSurveyFragment.this.f56559L != null) {
                SsSurveyFragment.this.f56559L.onReceiveValue(null);
            }
            SsSurveyFragment.this.f56559L = valueCallback;
            if (SsSurveyFragment.this.f56556I) {
                return true;
            }
            try {
                SsSurveyFragment.this.startActivityForResult(fileChooserParams.createIntent(), 1184);
                return true;
            } catch (ActivityNotFoundException unused) {
                SsSurveyFragment.this.f56559L = null;
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m82172V3(SsSurveyFragment ssSurveyFragment, Boolean bool) {
        ssSurveyFragment.getClass();
        if (!bool.booleanValue()) {
            ssSurveyFragment.f56556I = false;
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(ssSurveyFragment.getActivity().getPackageManager()) != null) {
            ssSurveyFragment.f56557J.m108087b(intent);
        } else {
            ssSurveyFragment.f56556I = false;
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m82173W3(SsSurveyFragment ssSurveyFragment, ActivityResult activityResult) {
        ssSurveyFragment.getClass();
        ssSurveyFragment.m82187k4(activityResult.m202b(), activityResult.m201a());
    }

    /* JADX INFO: renamed from: k4 */
    private void m82187k4(int i, Intent intent) {
        Bitmap bitmap;
        if (i == -1 && intent != null && (bitmap = (Bitmap) intent.getExtras().get("data")) != null) {
            File file = new File(requireContext().getFilesDir(), "image_" + System.currentTimeMillis() + ".png");
            this.f56560M = Uri.fromFile(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    this.f56559L.onReceiveValue(new Uri[]{this.f56560M});
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
                this.f56559L.onReceiveValue(null);
            }
            this.f56559L = null;
        }
        if (i != -1) {
            this.f56559L.onReceiveValue(null);
            this.f56559L = null;
        }
        this.f56556I = false;
    }

    /* JADX INFO: renamed from: l4 */
    public void m82188l4(rn50 rn50Var) {
        this.f56555H = rn50Var;
    }

    /* JADX INFO: renamed from: m4 */
    public void m82189m4(int i) {
        this.f56549B = i;
    }

    /* JADX INFO: renamed from: n4 */
    public SsSurveyFragment m82190n4(SsSurvey ssSurvey) {
        this.f56563z = ssSurvey;
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
                if (this.f56558K == null) {
                    return;
                }
                this.f56558K.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                this.f56558K = null;
                return;
            }
        }
        if (this.f56559L == null) {
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
        this.f56559L.onReceiveValue(uriArr);
        this.f56559L = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        this.f56548A = getActivity().getClass().getSimpleName();
        super.onAttach(context);
        this.f56553F = (sn50) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f56562O = registerForActivityResult(new z50(), new w50() { // from class: l.v0g0
            @Override // p153l.w50
            /* JADX INFO: renamed from: a */
            public final void mo2611a(Object obj) {
                SsSurveyFragment.m82172V3(this.f181858a, (Boolean) obj);
            }
        });
        this.f56557J = registerForActivityResult(new a60(), new w50() { // from class: l.w0g0
            @Override // p153l.w50
            /* JADX INFO: renamed from: a */
            public final void mo2611a(Object obj) {
                SsSurveyFragment.m82173W3(this.f186594a, (ActivityResult) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13669a c13669a = null;
        if (!this.f56548A.equals("SsSurveyActivity")) {
            SsSurvey.C13666a[] customParams = this.f56563z.getCustomParams();
            String str = "https://" + this.f56563z.getDomain() + "/sdk/validate-survey/" + this.f56563z.getSurveyToken();
            CompletableFuture completableFuture = new CompletableFuture();
            new AsyncTaskC13674a(str, customParams, new C13669a(completableFuture)).execute(str);
            completableFuture.join();
            try {
                JSONObject jSONObject = new JSONObject((String) completableFuture.get());
                jSONObject.toString();
                if (!jSONObject.getBoolean(Active.TYPE)) {
                    return null;
                }
                if (jSONObject.has("widgetContactId")) {
                    this.f56549B = jSONObject.getInt("widgetContactId");
                }
            } catch (Exception e) {
                Log.e("SS_VALIDATION", "Error in  processing  apiCallTask json" + e);
            }
        }
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        ProgressBar progressBar = new ProgressBar(getActivity(), null, R.attr.progressBarStyleHorizontal);
        this.f56550C = progressBar;
        progressBar.setMax(100);
        this.f56550C.setLayoutParams(new FrameLayout.LayoutParams(-1, 6, 48));
        WebView webView = new WebView(getActivity());
        this.f56561N = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f56561N.getSettings().setDomStorageEnabled(true);
        this.f56561N.addJavascriptInterface(new C13673e(this, c13669a), "SsAndroidSdk");
        ConstraintLayout constraintLayout = new ConstraintLayout(getActivity());
        constraintLayout.setLayoutParams(new ConstraintLayout.C0221a(-1, -1));
        ImageButton imageButton = new ImageButton(getActivity());
        imageButton.setImageResource(rbc0.f162014a);
        imageButton.setBackgroundResource(rbc0.f162015b);
        imageButton.setClickable(true);
        imageButton.setPadding(10, 10, 10, 10);
        imageButton.setVisibility(8);
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-2, -2);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        c0221a.f1268s = 0;
        c0221a.f1251h = 0;
        c0221a.setMargins(0, iApplyDimension, iApplyDimension, 0);
        imageButton.setLayoutParams(c0221a);
        constraintLayout.addView(imageButton);
        HashMap properties = this.f56563z.getProperties() != null ? this.f56563z.getProperties() : new HashMap();
        imageButton.setOnClickListener(new ViewOnClickListenerC13670b(frameLayout));
        this.f56561N.setWebViewClient(new C13671c(properties));
        this.f56561N.setWebChromeClient(new C13672d(imageButton));
        this.f56561N.loadUrl(this.f56563z.getSsUrl());
        frameLayout.addView(this.f56561N);
        frameLayout.addView(this.f56550C);
        if (!properties.containsKey("isCloseButtonEnabled") || Boolean.TRUE.equals(properties.get("isCloseButtonEnabled"))) {
            frameLayout.addView(constraintLayout);
        }
        return frameLayout;
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyFragment$e */
    public class C13673e {
        private C13673e() {
        }

        @JavascriptInterface
        public void captureImage() {
            if (SsSurveyFragment.this.f56556I) {
                return;
            }
            SsSurveyFragment.this.f56556I = true;
            if (j26.m143188a(SsSurveyFragment.this.getActivity(), "android.permission.CAMERA") != 0) {
                SsSurveyFragment.this.f56562O.m108087b("android.permission.CAMERA");
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            ComponentName componentNameResolveActivity = intent.resolveActivity(SsSurveyFragment.this.getActivity().getPackageManager());
            SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
            if (componentNameResolveActivity != null) {
                ssSurveyFragment.f56557J.m108087b(intent);
            } else {
                ssSurveyFragment.f56556I = false;
            }
        }

        @JavascriptInterface
        public void shareData(String str) {
            SsSurveyFragment ssSurveyFragment = SsSurveyFragment.this;
            ssSurveyFragment.f56554G = Boolean.TRUE;
            ssSurveyFragment.f56553F.mo82171m(C13676c.m82199e(str));
        }

        public /* synthetic */ C13673e(SsSurveyFragment ssSurveyFragment, C13669a c13669a) {
            this();
        }
    }
}
