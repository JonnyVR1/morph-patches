package com.tantanapp.media.ttmediamncertification.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.core.glcore.util.ErrorCode;
import com.immomo.mncertification.MNFCService;
import com.immomo.mncertification.resultbean.CertificationResult;
import p149l.wvf;
import p149l.yql;

/* JADX INFO: loaded from: classes13.dex */
public class DummyActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public yql.InterfaceC21481b f56166a;

    /* JADX INFO: renamed from: a */
    public void m81389a(yql.InterfaceC21481b interfaceC21481b) {
        this.f56166a = interfaceC21481b;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        wvf wvfVar = new wvf();
        if (i == 9001) {
            CertificationResult certificationResultFetchResult = MNFCService.getInstance().fetchResult(intent);
            if (certificationResultFetchResult == null || certificationResultFetchResult.resultCode != 0) {
                wvfVar.f188243h = false;
                wvfVar.f188237b = String.valueOf(certificationResultFetchResult.resultCode);
            } else {
                wvfVar.f188243h = true;
                wvfVar.f188250o = certificationResultFetchResult.personId;
                wvfVar.f188237b = String.valueOf(certificationResultFetchResult.resultCode);
            }
        } else {
            wvfVar.f188243h = false;
            wvfVar.f188237b = "requestCode error";
        }
        yql.InterfaceC21481b interfaceC21481b = this.f56166a;
        if (interfaceC21481b != null) {
            interfaceC21481b.mo102166a(wvfVar);
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
            wvf wvfVar = new wvf();
            wvfVar.f188243h = false;
            wvfVar.f188239d = e.getMessage();
            yql.InterfaceC21481b interfaceC21481b = this.f56166a;
            if (interfaceC21481b != null) {
                interfaceC21481b.mo102166a(wvfVar);
            }
            finish();
        }
    }
}
