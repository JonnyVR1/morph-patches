package com.idv.identity.ocr.p037ui;

import android.widget.TextView;
import p149l.k4c0;
import p149l.kcm;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class IndonesiaIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private TextView f12548A;

    /* JADX INFO: renamed from: B */
    private TextView f12549B;

    /* JADX INFO: renamed from: C */
    private TextView f12550C;

    /* JADX INFO: renamed from: D */
    private TextView f12551D;

    /* JADX INFO: renamed from: E */
    private TextView f12552E;

    /* JADX INFO: renamed from: F */
    private TextView f12553F;

    /* JADX INFO: renamed from: G */
    private TextView f12554G;

    /* JADX INFO: renamed from: H */
    private TextView f12555H;

    /* JADX INFO: renamed from: I */
    private TextView f12556I;

    /* JADX INFO: renamed from: J */
    private TextView f12557J;

    /* JADX INFO: renamed from: K */
    private TextView f12558K;

    /* JADX INFO: renamed from: L */
    private TextView f12559L;

    /* JADX INFO: renamed from: M */
    private TextView f12560M;

    /* JADX INFO: renamed from: N */
    private TextView f12561N;

    /* JADX INFO: renamed from: O */
    private TextView f12562O;

    /* JADX INFO: renamed from: P */
    private TextView f12563P;

    /* JADX INFO: renamed from: z */
    private TextView f12564z;

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191118f);
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
        this.f12564z = (TextView) findViewById(k4c0.f121002R);
        this.f12548A = (TextView) findViewById(k4c0.f121065r0);
        this.f12549B = (TextView) findViewById(k4c0.f121075w0);
        this.f12550C = (TextView) findViewById(k4c0.f120976E);
        this.f12551D = (TextView) findViewById(k4c0.f120978F);
        this.f12552E = (TextView) findViewById(k4c0.f120974D);
        this.f12553F = (TextView) findViewById(k4c0.f121077x0);
        this.f12554G = (TextView) findViewById(k4c0.f120984I);
        this.f12555H = (TextView) findViewById(k4c0.f120988K);
        this.f12556I = (TextView) findViewById(k4c0.f121073v0);
        this.f12557J = (TextView) findViewById(k4c0.f121042h0);
        this.f12558K = (TextView) findViewById(k4c0.f121010V);
        this.f12559L = (TextView) findViewById(k4c0.f121053l0);
        this.f12560M = (TextView) findViewById(k4c0.f120992M);
        this.f12561N = (TextView) findViewById(k4c0.f121071u0);
        this.f12562O = (TextView) findViewById(k4c0.f120980G);
        this.f12563P = (TextView) findViewById(k4c0.f121008U);
        TextView textView = this.f12564z;
        if (textView != null) {
            textView.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        TextView textView2 = this.f12548A;
        if (textView2 != null) {
            textView2.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.name);
        }
        TextView textView3 = this.f12549B;
        if (textView3 != null) {
            textView3.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        TextView textView4 = this.f12550C;
        if (textView4 != null) {
            textView4.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        TextView textView5 = this.f12551D;
        if (textView5 != null) {
            textView5.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.blood);
        }
        TextView textView6 = this.f12552E;
        if (textView6 != null) {
            textView6.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.address);
        }
        TextView textView7 = this.f12553F;
        if (textView7 != null) {
            textView7.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.street);
        }
        TextView textView8 = this.f12554G;
        if (textView8 != null) {
            textView8.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.county);
        }
        TextView textView9 = this.f12555H;
        if (textView9 != null) {
            textView9.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.district);
        }
        TextView textView10 = this.f12556I;
        if (textView10 != null) {
            textView10.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.religion);
        }
        TextView textView11 = this.f12557J;
        if (textView11 != null) {
            textView11.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.marriage);
        }
        TextView textView12 = this.f12558K;
        if (textView12 != null) {
            textView12.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.job);
        }
        TextView textView13 = this.f12559L;
        if (textView13 != null) {
            textView13.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.nationality);
        }
        TextView textView14 = this.f12560M;
        if (textView14 != null) {
            textView14.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate);
        }
        TextView textView15 = this.f12561N;
        if (textView15 != null) {
            textView15.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.province);
        }
        TextView textView16 = this.f12562O;
        if (textView16 != null) {
            textView16.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.city);
        }
        TextView textView17 = this.f12563P;
        if (textView17 != null) {
            textView17.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate);
        }
    }
}
