package com.idv.identity.ocr.p044ui;

import android.widget.EditText;
import p153l.afm;
import p153l.dec0;
import p153l.rcc0;

/* JADX INFO: loaded from: classes7.dex */
public class PhilippinesIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13362A;

    /* JADX INFO: renamed from: B */
    private EditText f13363B;

    /* JADX INFO: renamed from: C */
    private EditText f13364C;

    /* JADX INFO: renamed from: D */
    private EditText f13365D;

    /* JADX INFO: renamed from: E */
    private EditText f13366E;

    /* JADX INFO: renamed from: F */
    private EditText f13367F;

    /* JADX INFO: renamed from: z */
    private EditText f13368z;

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88006j);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        this.f13368z = (EditText) findViewById(rcc0.f162121R);
        this.f13362A = (EditText) findViewById(rcc0.f162176n0);
        this.f13363B = (EditText) findViewById(rcc0.f162174m0);
        this.f13364C = (EditText) findViewById(rcc0.f162164i0);
        this.f13365D = (EditText) findViewById(rcc0.f162194w0);
        this.f13366E = (EditText) findViewById(rcc0.f162095E);
        this.f13367F = (EditText) findViewById(rcc0.f162093D);
        EditText editText = this.f13368z;
        if (editText != null) {
            editText.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        EditText editText2 = this.f13362A;
        if (editText2 != null) {
            editText2.setText(afm.m97360H().m97425V().ocrResult.ocrResult.surname);
        }
        EditText editText3 = this.f13363B;
        if (editText3 != null) {
            editText3.setText(afm.m97360H().m97425V().ocrResult.ocrResult.givenname);
        }
        EditText editText4 = this.f13364C;
        if (editText4 != null) {
            editText4.setText(afm.m97360H().m97425V().ocrResult.ocrResult.middlename);
        }
        EditText editText5 = this.f13365D;
        if (editText5 != null) {
            editText5.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        EditText editText6 = this.f13366E;
        if (editText6 != null) {
            editText6.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText7 = this.f13367F;
        if (editText7 != null) {
            editText7.setText(afm.m97360H().m97425V().ocrResult.ocrResult.address);
        }
    }
}
