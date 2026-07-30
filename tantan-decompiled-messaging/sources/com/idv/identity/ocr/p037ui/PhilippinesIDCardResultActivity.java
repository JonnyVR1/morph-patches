package com.idv.identity.ocr.p037ui;

import android.widget.EditText;
import p149l.k4c0;
import p149l.kcm;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class PhilippinesIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12621A;

    /* JADX INFO: renamed from: B */
    private EditText f12622B;

    /* JADX INFO: renamed from: C */
    private EditText f12623C;

    /* JADX INFO: renamed from: D */
    private EditText f12624D;

    /* JADX INFO: renamed from: E */
    private EditText f12625E;

    /* JADX INFO: renamed from: F */
    private EditText f12626F;

    /* JADX INFO: renamed from: z */
    private EditText f12627z;

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191122j);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        this.f12627z = (EditText) findViewById(k4c0.f121002R);
        this.f12621A = (EditText) findViewById(k4c0.f121057n0);
        this.f12622B = (EditText) findViewById(k4c0.f121055m0);
        this.f12623C = (EditText) findViewById(k4c0.f121045i0);
        this.f12624D = (EditText) findViewById(k4c0.f121075w0);
        this.f12625E = (EditText) findViewById(k4c0.f120976E);
        this.f12626F = (EditText) findViewById(k4c0.f120974D);
        EditText editText = this.f12627z;
        if (editText != null) {
            editText.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        EditText editText2 = this.f12621A;
        if (editText2 != null) {
            editText2.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.surname);
        }
        EditText editText3 = this.f12622B;
        if (editText3 != null) {
            editText3.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.givenname);
        }
        EditText editText4 = this.f12623C;
        if (editText4 != null) {
            editText4.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.middlename);
        }
        EditText editText5 = this.f12624D;
        if (editText5 != null) {
            editText5.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        EditText editText6 = this.f12625E;
        if (editText6 != null) {
            editText6.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText7 = this.f12626F;
        if (editText7 != null) {
            editText7.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.address);
        }
    }
}
