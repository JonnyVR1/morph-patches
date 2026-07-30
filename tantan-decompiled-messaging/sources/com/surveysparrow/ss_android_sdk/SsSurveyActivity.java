package com.surveysparrow.ss_android_sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC0427k;
import org.json.JSONObject;
import p149l.f8c0;
import p149l.h5c0;
import p149l.i30;
import p149l.lf50;
import p149l.mf50;
import p149l.u6c0;

/* JADX INFO: loaded from: classes13.dex */
public final class SsSurveyActivity extends AppCompatActivity implements mf50, lf50 {

    /* JADX INFO: renamed from: c */
    private SsSurvey f55693c;

    /* JADX INFO: renamed from: d */
    private int f55694d;

    /* JADX INFO: renamed from: e */
    private CharSequence f55695e;

    /* JADX INFO: renamed from: f */
    private boolean f55696f;

    /* JADX INFO: renamed from: g */
    private long f55697g;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyActivity$a */
    public class RunnableC13504a implements Runnable {
        public RunnableC13504a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SsSurveyActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyActivity$b */
    public class RunnableC13505b implements Runnable {
        public RunnableC13505b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SsSurveyActivity.this.finish();
        }
    }

    @Override // p149l.lf50
    /* JADX INFO: renamed from: L */
    public void mo80987L() {
        new Handler().postDelayed(new RunnableC13505b(), 0L);
    }

    @Override // p149l.mf50
    /* JADX INFO: renamed from: m */
    public void mo80988m(JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setData(Uri.parse(jSONObject.toString()));
        setResult(-1, intent);
        C13513c.m81015c(this, this.f55693c.getSurveyToken());
        new Handler().postDelayed(new RunnableC13504a(), this.f55697g);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            Intent intent = getIntent();
            this.f55694d = intent.getIntExtra("SS_ACTIVITY_THEME", f8c0.f96340a);
            this.f55695e = intent.getStringExtra("SS_APPBAR_TITLE");
            int intExtra = getIntent().getIntExtra("widgetContactId", 0);
            this.f55696f = intent.getBooleanExtra("SS_BACK_BUTTON", true);
            this.f55697g = intent.getLongExtra("SS_WAIT_TIME", 3000L);
            this.f55693c = (SsSurvey) intent.getSerializableExtra("SS_SURVEY");
            setTheme(this.f55694d);
            setContentView(u6c0.f174826a);
            i30 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo134115E(this.f55695e);
                supportActionBar.mo134136w(this.f55696f);
            }
            if (bundle == null) {
                AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
                SsSurveyFragment ssSurveyFragment = new SsSurveyFragment();
                ssSurveyFragment.m81005l4(this);
                ssSurveyFragment.m81006m4(intExtra);
                ssSurveyFragment.m81007n4(this.f55693c);
                abstractC0427kM2567m.m2804c(h5c0.f105942a, ssSurveyFragment, "SURVEY_FRAGMENT_TAG");
                abstractC0427kM2567m.mo2707i();
                return;
            }
            AbstractC0427k abstractC0427kM2567m2 = getSupportFragmentManager().m2567m();
            SsSurveyFragment ssSurveyFragment2 = (SsSurveyFragment) getSupportFragmentManager().m2557i0("SURVEY_FRAGMENT_TAG");
            ssSurveyFragment2.m81007n4(this.f55693c);
            ssSurveyFragment2.m81005l4(this);
            ssSurveyFragment2.m81006m4(intExtra);
            abstractC0427kM2567m2.m2812t(h5c0.f105942a, ssSurveyFragment2, "SURVEY_FRAGMENT_TAG");
            abstractC0427kM2567m2.mo2707i();
        } catch (Exception e) {
            Log.e("SS_RT_EXCEPTION_LOG", e.getStackTrace().toString());
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
