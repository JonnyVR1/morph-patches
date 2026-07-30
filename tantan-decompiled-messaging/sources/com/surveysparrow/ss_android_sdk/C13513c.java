package com.surveysparrow.ss_android_sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.f8c0;

/* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.c */
/* JADX INFO: loaded from: classes13.dex */
public final class C13513c {

    /* JADX INFO: renamed from: q */
    private static boolean f55732q = false;

    /* JADX INFO: renamed from: a */
    private SsSurvey f55733a;

    /* JADX INFO: renamed from: b */
    private Activity f55734b;

    /* JADX INFO: renamed from: d */
    private CharSequence f55736d;

    /* JADX INFO: renamed from: g */
    private int f55739g;

    /* JADX INFO: renamed from: h */
    private CharSequence f55740h;

    /* JADX INFO: renamed from: i */
    private CharSequence f55741i;

    /* JADX INFO: renamed from: j */
    private CharSequence f55742j;

    /* JADX INFO: renamed from: k */
    private CharSequence f55743k;

    /* JADX INFO: renamed from: l */
    private String f55744l;

    /* JADX INFO: renamed from: c */
    private int f55735c = f8c0.f96340a;

    /* JADX INFO: renamed from: e */
    private boolean f55737e = true;

    /* JADX INFO: renamed from: f */
    private long f55738f = 3000;

    /* JADX INFO: renamed from: m */
    private long f55745m = 432000000;

    /* JADX INFO: renamed from: n */
    private long f55746n = 864000000;

    /* JADX INFO: renamed from: o */
    private int f55747o = 2;

    /* JADX INFO: renamed from: p */
    private int f55748p = 1;

    public C13513c(Activity activity, SsSurvey ssSurvey) {
        this.f55733a = ssSurvey;
        this.f55734b = activity;
        this.f55736d = activity.getString(R$string.f55692f);
        this.f55744l = "com.surveysparrow.android-sdk.SsSurveySharedPref." + ssSurvey.getSurveyToken();
        this.f55740h = activity.getString(R$string.f55690d);
        this.f55741i = activity.getString(R$string.f55687a);
        this.f55742j = activity.getString(R$string.f55689c);
        this.f55743k = activity.getString(R$string.f55688b);
    }

    /* JADX INFO: renamed from: b */
    private boolean m81014b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f55734b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: c */
    public static void m81015c(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.surveysparrow.android-sdk.SsSurveySharedPref." + str, 0).edit();
        editorEdit.putBoolean("IS_ALREADY_TAKEN", true);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m81016e(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            if (!f55732q) {
                return null;
            }
            Log.e("SS_DEBUG_LOG", e.getStackTrace().toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13513c m81017a(boolean z) {
        this.f55737e = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m81018d(int i) {
        if (!m81014b()) {
            Toast.makeText(this.f55734b, R$string.f55691e, 0).show();
            return;
        }
        Intent intent = new Intent(this.f55734b, (Class<?>) SsSurveyActivity.class);
        intent.putExtra("SS_SURVEY", this.f55733a);
        intent.putExtra("SS_ACTIVITY_THEME", this.f55735c);
        intent.putExtra("SS_APPBAR_TITLE", this.f55736d);
        intent.putExtra("SS_BACK_BUTTON", this.f55737e);
        intent.putExtra("SS_WAIT_TIME", this.f55738f);
        intent.putExtra("widgetContactId", this.f55739g);
        this.f55734b.startActivityForResult(intent, i);
    }
}
