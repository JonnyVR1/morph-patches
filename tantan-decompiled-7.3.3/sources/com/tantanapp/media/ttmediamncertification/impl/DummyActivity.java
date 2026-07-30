package com.tantanapp.media.ttmediamncertification.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.core.glcore.util.ErrorCode;
import com.immomo.mncertification.MNFCService;
import com.immomo.mncertification.resultbean.CertificationResult;
import p153l.kxf;
import p153l.ltl;

/* JADX INFO: loaded from: classes12.dex */
public class DummyActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ltl.InterfaceC18463b f57014a;

    /* JADX INFO: renamed from: a */
    public void m82572a(ltl.InterfaceC18463b interfaceC18463b) {
        this.f57014a = interfaceC18463b;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        kxf kxfVar = new kxf();
        if (i == 9001) {
            CertificationResult certificationResultFetchResult = MNFCService.getInstance().fetchResult(intent);
            if (certificationResultFetchResult == null || certificationResultFetchResult.resultCode != 0) {
                kxfVar.f129195h = false;
                kxfVar.f129189b = String.valueOf(certificationResultFetchResult.resultCode);
            } else {
                kxfVar.f129195h = true;
                kxfVar.f129202o = certificationResultFetchResult.personId;
                kxfVar.f129189b = String.valueOf(certificationResultFetchResult.resultCode);
            }
        } else {
            kxfVar.f129195h = false;
            kxfVar.f129189b = "requestCode error";
        }
        ltl.InterfaceC18463b interfaceC18463b = this.f57014a;
        if (interfaceC18463b != null) {
            interfaceC18463b.mo122142a(kxfVar);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("option-key-mode");
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != 510808060) {
                if (iHashCode == 1750187739 && stringExtra.equals("VERIFY_SILENT")) {
                    MNFCService.getInstance().startSilentCertification(this, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
                    return;
                }
            } else if (stringExtra.equals("VERIFY_INTERACTIVE")) {
                MNFCService.Config config = new MNFCService.Config();
                int intExtra = intent.getIntExtra("option-key-action-count", 4);
                String stringExtra2 = intent.getStringExtra("option-key-page-title");
                config.actionCount = intExtra;
                config.title = stringExtra2;
                MNFCService.getInstance().startInteractiveCertification(this, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, config);
                return;
            }
            MNFCService.getInstance().startSilentCertification(this, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
        } catch (Exception e) {
            kxf kxfVar = new kxf();
            kxfVar.f129195h = false;
            kxfVar.f129191d = e.getMessage();
            ltl.InterfaceC18463b interfaceC18463b = this.f57014a;
            if (interfaceC18463b != null) {
                interfaceC18463b.mo122142a(kxfVar);
            }
            finish();
        }
    }
}
