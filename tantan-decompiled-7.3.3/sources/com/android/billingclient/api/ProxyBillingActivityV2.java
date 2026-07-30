package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.C2426p;
import p153l.b60;
import p153l.c60;
import p153l.w50;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: c */
    private c60 f3895c;

    /* JADX INFO: renamed from: d */
    private c60 f3896d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private ResultReceiver f3897e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private ResultReceiver f3898f;

    @VisibleForTesting
    /* JADX INFO: renamed from: H0 */
    public final void m4815H0(ActivityResult activityResult) {
        Intent intentM201a = activityResult.m201a();
        int iM4976b = C2426p.m14968e(intentM201a, "ProxyBillingActivityV2").m4976b();
        ResultReceiver resultReceiver = this.f3897e;
        if (resultReceiver != null) {
            resultReceiver.send(iM4976b, intentM201a == null ? null : intentM201a.getExtras());
        }
        if (activityResult.m202b() != -1 || iM4976b != 0) {
            C2426p.m14974k("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.m202b() + " and billing's responseCode: " + iM4976b);
        }
        finish();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: I0 */
    public final void m4816I0(ActivityResult activityResult) {
        Intent intentM201a = activityResult.m201a();
        int iM4976b = C2426p.m14968e(intentM201a, "ProxyBillingActivityV2").m4976b();
        ResultReceiver resultReceiver = this.f3898f;
        if (resultReceiver != null) {
            resultReceiver.send(iM4976b, intentM201a == null ? null : intentM201a.getExtras());
        }
        if (activityResult.m202b() != -1 || iM4976b != 0) {
            C2426p.m14974k("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.m202b()), Integer.valueOf(iM4976b)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f3895c = registerForActivityResult(new b60(), new w50() { // from class: l.fvt0
            @Override // p153l.w50
            /* JADX INFO: renamed from: a */
            public final void mo2611a(Object obj) {
                this.f101092a.m4815H0((ActivityResult) obj);
            }
        });
        this.f3896d = registerForActivityResult(new b60(), new w50() { // from class: l.owt0
            @Override // p153l.w50
            /* JADX INFO: renamed from: a */
            public final void mo2611a(Object obj) {
                this.f149570a.m4816I0((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f3897e = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f3898f = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        C2426p.m14973j("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f3897e = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f3895c.m108087b(new IntentSenderRequest.C0055b(pendingIntent).m227a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f3898f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f3896d.m108087b(new IntentSenderRequest.C0055b(pendingIntent2).m227a());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3897e;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3898f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
