package com.surveysparrow.ss_android_sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC0428k;
import org.json.JSONObject;
import p153l.c30;
import p153l.kgc0;
import p153l.ndc0;
import p153l.rn50;
import p153l.sn50;
import p153l.zec0;

/* JADX INFO: loaded from: classes11.dex */
public final class SsSurveyActivity extends AppCompatActivity implements sn50, rn50 {

    /* JADX INFO: renamed from: c */
    private SsSurvey f56541c;

    /* JADX INFO: renamed from: d */
    private int f56542d;

    /* JADX INFO: renamed from: e */
    private CharSequence f56543e;

    /* JADX INFO: renamed from: f */
    private boolean f56544f;

    /* JADX INFO: renamed from: g */
    private long f56545g;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyActivity$a */
    public class RunnableC13667a implements Runnable {
        public RunnableC13667a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SsSurveyActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurveyActivity$b */
    public class RunnableC13668b implements Runnable {
        public RunnableC13668b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SsSurveyActivity.this.finish();
        }
    }

    @Override // p153l.rn50
    /* JADX INFO: renamed from: M */
    public void mo82170M() {
        new Handler().postDelayed(new RunnableC13668b(), 0L);
    }

    @Override // p153l.sn50
    /* JADX INFO: renamed from: m */
    public void mo82171m(JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setData(Uri.parse(jSONObject.toString()));
        setResult(-1, intent);
        C13676c.m82198c(this, this.f56541c.getSurveyToken());
        new Handler().postDelayed(new RunnableC13667a(), this.f56545g);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            Intent intent = getIntent();
            this.f56542d = intent.getIntExtra("SS_ACTIVITY_THEME", kgc0.f126595a);
            this.f56543e = intent.getStringExtra("SS_APPBAR_TITLE");
            int intExtra = getIntent().getIntExtra("widgetContactId", 0);
            this.f56544f = intent.getBooleanExtra("SS_BACK_BUTTON", true);
            this.f56545g = intent.getLongExtra("SS_WAIT_TIME", 3000L);
            this.f56541c = (SsSurvey) intent.getSerializableExtra("SS_SURVEY");
            setTheme(this.f56542d);
            setContentView(zec0.f203991a);
            c30 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo102172E(this.f56543e);
                supportActionBar.mo102196w(this.f56544f);
            }
            if (bundle == null) {
                AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
                SsSurveyFragment ssSurveyFragment = new SsSurveyFragment();
                ssSurveyFragment.m82188l4(this);
                ssSurveyFragment.m82189m4(intExtra);
                ssSurveyFragment.m82190n4(this.f56541c);
                abstractC0428kM2568m.m2805c(ndc0.f141477a, ssSurveyFragment, "SURVEY_FRAGMENT_TAG");
                abstractC0428kM2568m.mo2708i();
                return;
            }
            AbstractC0428k abstractC0428kM2568m2 = getSupportFragmentManager().m2568m();
            SsSurveyFragment ssSurveyFragment2 = (SsSurveyFragment) getSupportFragmentManager().m2558i0("SURVEY_FRAGMENT_TAG");
            ssSurveyFragment2.m82190n4(this.f56541c);
            ssSurveyFragment2.m82188l4(this);
            ssSurveyFragment2.m82189m4(intExtra);
            abstractC0428kM2568m2.m2813t(ndc0.f141477a, ssSurveyFragment2, "SURVEY_FRAGMENT_TAG");
            abstractC0428kM2568m2.mo2708i();
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
