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
import p153l.kgc0;

/* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.c */
/* JADX INFO: loaded from: classes11.dex */
public final class C13676c {

    /* JADX INFO: renamed from: q */
    private static boolean f56580q = false;

    /* JADX INFO: renamed from: a */
    private SsSurvey f56581a;

    /* JADX INFO: renamed from: b */
    private Activity f56582b;

    /* JADX INFO: renamed from: d */
    private CharSequence f56584d;

    /* JADX INFO: renamed from: g */
    private int f56587g;

    /* JADX INFO: renamed from: h */
    private CharSequence f56588h;

    /* JADX INFO: renamed from: i */
    private CharSequence f56589i;

    /* JADX INFO: renamed from: j */
    private CharSequence f56590j;

    /* JADX INFO: renamed from: k */
    private CharSequence f56591k;

    /* JADX INFO: renamed from: l */
    private String f56592l;

    /* JADX INFO: renamed from: c */
    private int f56583c = kgc0.f126595a;

    /* JADX INFO: renamed from: e */
    private boolean f56585e = true;

    /* JADX INFO: renamed from: f */
    private long f56586f = 3000;

    /* JADX INFO: renamed from: m */
    private long f56593m = 432000000;

    /* JADX INFO: renamed from: n */
    private long f56594n = 864000000;

    /* JADX INFO: renamed from: o */
    private int f56595o = 2;

    /* JADX INFO: renamed from: p */
    private int f56596p = 1;

    public C13676c(Activity activity, SsSurvey ssSurvey) {
        this.f56581a = ssSurvey;
        this.f56582b = activity;
        this.f56584d = activity.getString(R$string.f56540f);
        this.f56592l = "com.surveysparrow.android-sdk.SsSurveySharedPref." + ssSurvey.getSurveyToken();
        this.f56588h = activity.getString(R$string.f56538d);
        this.f56589i = activity.getString(R$string.f56535a);
        this.f56590j = activity.getString(R$string.f56537c);
        this.f56591k = activity.getString(R$string.f56536b);
    }

    /* JADX INFO: renamed from: b */
    private boolean m82197b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f56582b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: renamed from: c */
    public static void m82198c(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.surveysparrow.android-sdk.SsSurveySharedPref." + str, 0).edit();
        editorEdit.putBoolean("IS_ALREADY_TAKEN", true);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m82199e(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            if (!f56580q) {
                return null;
            }
            Log.e("SS_DEBUG_LOG", e.getStackTrace().toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13676c m82200a(boolean z) {
        this.f56585e = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m82201d(int i) {
        if (!m82197b()) {
            Toast.makeText(this.f56582b, R$string.f56539e, 0).show();
            return;
        }
        Intent intent = new Intent(this.f56582b, (Class<?>) SsSurveyActivity.class);
        intent.putExtra("SS_SURVEY", this.f56581a);
        intent.putExtra("SS_ACTIVITY_THEME", this.f56583c);
        intent.putExtra("SS_APPBAR_TITLE", this.f56584d);
        intent.putExtra("SS_BACK_BUTTON", this.f56585e);
        intent.putExtra("SS_WAIT_TIME", this.f56586f);
        intent.putExtra("widgetContactId", this.f56587g);
        this.f56582b.startActivityForResult(intent, i);
    }
}
