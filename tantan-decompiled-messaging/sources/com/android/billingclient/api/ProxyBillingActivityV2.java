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
import com.google.android.gms.internal.play_billing.C2403p;
import p149l.a60;
import p149l.f60;
import p149l.g60;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: c */
    private g60 f3895c;

    /* JADX INFO: renamed from: d */
    private g60 f3896d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private ResultReceiver f3897e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private ResultReceiver f3898f;

    @VisibleForTesting
    /* JADX INFO: renamed from: G0 */
    public final void m4805G0(ActivityResult activityResult) {
        Intent intentM200a = activityResult.m200a();
        int iM4966b = C2403p.m14914e(intentM200a, "ProxyBillingActivityV2").m4966b();
        ResultReceiver resultReceiver = this.f3897e;
        if (resultReceiver != null) {
            resultReceiver.send(iM4966b, intentM200a == null ? null : intentM200a.getExtras());
        }
        if (activityResult.m201b() != -1 || iM4966b != 0) {
            C2403p.m14920k("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.m201b() + " and billing's responseCode: " + iM4966b);
        }
        finish();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: H0 */
    public final void m4806H0(ActivityResult activityResult) {
        Intent intentM200a = activityResult.m200a();
        int iM4966b = C2403p.m14914e(intentM200a, "ProxyBillingActivityV2").m4966b();
        ResultReceiver resultReceiver = this.f3898f;
        if (resultReceiver != null) {
            resultReceiver.send(iM4966b, intentM200a == null ? null : intentM200a.getExtras());
        }
        if (activityResult.m201b() != -1 || iM4966b != 0) {
            C2403p.m14920k("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.m201b()), Integer.valueOf(iM4966b)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f3895c = registerForActivityResult(new f60(), new a60() { // from class: l.zlt0
            @Override // p149l.a60
            /* JADX INFO: renamed from: a */
            public final void mo2610a(Object obj) {
                this.f203660a.m4805G0((ActivityResult) obj);
            }
        });
        this.f3896d = registerForActivityResult(new f60(), new a60() { // from class: l.int0
            @Override // p149l.a60
            /* JADX INFO: renamed from: a */
            public final void mo2610a(Object obj) {
                this.f114047a.m4806H0((ActivityResult) obj);
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
        C2403p.m14919j("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f3897e = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f3895c.m124547b(new IntentSenderRequest.C0054b(pendingIntent).m226a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f3898f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f3896d.m124547b(new IntentSenderRequest.C0054b(pendingIntent2).m226a());
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
