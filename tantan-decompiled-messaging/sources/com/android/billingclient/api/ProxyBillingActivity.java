package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.C2403p;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    @Nullable
    private ResultReceiver f3890a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private ResultReceiver f3891b;

    /* JADX INFO: renamed from: c */
    private boolean f3892c;

    /* JADX INFO: renamed from: d */
    private boolean f3893d;

    /* JADX INFO: renamed from: e */
    private int f3894e;

    /* JADX INFO: renamed from: a */
    private Intent m4803a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    private Intent m4804b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intentM4804b;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 110) {
            int iM4966b = C2403p.m14914e(intent, "ProxyBillingActivity").m4966b();
            if (i2 != -1) {
                C2403p.m14920k("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + iM4966b);
            } else if (iM4966b != 0) {
                i2 = -1;
                C2403p.m14920k("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + iM4966b);
            } else {
                iM4966b = 0;
            }
            ResultReceiver resultReceiver = this.f3890a;
            if (resultReceiver != null) {
                resultReceiver.send(iM4966b, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentM4804b = m4804b();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentM4804b = m4803a(string);
                        intentM4804b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentM4804b = m4804b();
                        intentM4804b.putExtras(intent.getExtras());
                        intentM4804b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentM4804b = m4804b();
                    C2403p.m14920k("ProxyBillingActivity", "Got null bundle!");
                    intentM4804b.putExtra("RESPONSE_CODE", 6);
                    intentM4804b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    C0871d.a aVarM4962c = C0871d.m4962c();
                    aVarM4962c.m4969c(6);
                    aVarM4962c.m4968b("An internal error occurred.");
                    intentM4804b.putExtra("FAILURE_LOGGING_PAYLOAD", C0876f0.m5023b(22, 2, aVarM4962c.m4967a()).m14965d());
                    intentM4804b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if (i == 110) {
                    intentM4804b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM4804b);
            }
        } else if (i == 101) {
            int iM14910a = C2403p.m14910a(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f3891b;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iM14910a, intent != null ? intent.getExtras() : null);
            }
        } else {
            C2403p.m14920k("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.f3892c = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            C2403p.m14919j("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f3892c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f3890a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f3891b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f3893d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f3894e = bundle.getInt("activity_code", 100);
            return;
        }
        C2403p.m14919j("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f3894e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f3893d = true;
                this.f3894e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f3890a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f3891b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f3894e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f3892c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3894e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            C2403p.m14921l("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.f3890a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f3891b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentM4804b = m4804b();
                    if (this.f3893d) {
                        intentM4804b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentM4804b.putExtra("RESPONSE_CODE", 6);
                    intentM4804b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentM4804b);
                }
            }
            this.f3892c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f3892c) {
            Intent intentM4804b = m4804b();
            intentM4804b.putExtra("RESPONSE_CODE", 1);
            intentM4804b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i = this.f3894e;
            if (i == 110 || i == 100) {
                intentM4804b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentM4804b);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3890a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3891b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3892c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3893d);
        bundle.putInt("activity_code", this.f3894e);
    }
}
