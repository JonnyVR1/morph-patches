package com.idv.identity.ocr.p044ui;

import android.widget.TextView;
import p153l.afm;
import p153l.dec0;
import p153l.rcc0;

/* JADX INFO: loaded from: classes7.dex */
public class IndonesiaIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private TextView f13289A;

    /* JADX INFO: renamed from: B */
    private TextView f13290B;

    /* JADX INFO: renamed from: C */
    private TextView f13291C;

    /* JADX INFO: renamed from: D */
    private TextView f13292D;

    /* JADX INFO: renamed from: E */
    private TextView f13293E;

    /* JADX INFO: renamed from: F */
    private TextView f13294F;

    /* JADX INFO: renamed from: G */
    private TextView f13295G;

    /* JADX INFO: renamed from: H */
    private TextView f13296H;

    /* JADX INFO: renamed from: I */
    private TextView f13297I;

    /* JADX INFO: renamed from: J */
    private TextView f13298J;

    /* JADX INFO: renamed from: K */
    private TextView f13299K;

    /* JADX INFO: renamed from: L */
    private TextView f13300L;

    /* JADX INFO: renamed from: M */
    private TextView f13301M;

    /* JADX INFO: renamed from: N */
    private TextView f13302N;

    /* JADX INFO: renamed from: O */
    private TextView f13303O;

    /* JADX INFO: renamed from: P */
    private TextView f13304P;

    /* JADX INFO: renamed from: z */
    private TextView f13305z;

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88002f);
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
        this.f13305z = (TextView) findViewById(rcc0.f162121R);
        this.f13289A = (TextView) findViewById(rcc0.f162184r0);
        this.f13290B = (TextView) findViewById(rcc0.f162194w0);
        this.f13291C = (TextView) findViewById(rcc0.f162095E);
        this.f13292D = (TextView) findViewById(rcc0.f162097F);
        this.f13293E = (TextView) findViewById(rcc0.f162093D);
        this.f13294F = (TextView) findViewById(rcc0.f162196x0);
        this.f13295G = (TextView) findViewById(rcc0.f162103I);
        this.f13296H = (TextView) findViewById(rcc0.f162107K);
        this.f13297I = (TextView) findViewById(rcc0.f162192v0);
        this.f13298J = (TextView) findViewById(rcc0.f162161h0);
        this.f13299K = (TextView) findViewById(rcc0.f162129V);
        this.f13300L = (TextView) findViewById(rcc0.f162172l0);
        this.f13301M = (TextView) findViewById(rcc0.f162111M);
        this.f13302N = (TextView) findViewById(rcc0.f162190u0);
        this.f13303O = (TextView) findViewById(rcc0.f162099G);
        this.f13304P = (TextView) findViewById(rcc0.f162127U);
        TextView textView = this.f13305z;
        if (textView != null) {
            textView.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        TextView textView2 = this.f13289A;
        if (textView2 != null) {
            textView2.setText(afm.m97360H().m97425V().ocrResult.ocrResult.name);
        }
        TextView textView3 = this.f13290B;
        if (textView3 != null) {
            textView3.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        TextView textView4 = this.f13291C;
        if (textView4 != null) {
            textView4.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        TextView textView5 = this.f13292D;
        if (textView5 != null) {
            textView5.setText(afm.m97360H().m97425V().ocrResult.ocrResult.blood);
        }
        TextView textView6 = this.f13293E;
        if (textView6 != null) {
            textView6.setText(afm.m97360H().m97425V().ocrResult.ocrResult.address);
        }
        TextView textView7 = this.f13294F;
        if (textView7 != null) {
            textView7.setText(afm.m97360H().m97425V().ocrResult.ocrResult.street);
        }
        TextView textView8 = this.f13295G;
        if (textView8 != null) {
            textView8.setText(afm.m97360H().m97425V().ocrResult.ocrResult.county);
        }
        TextView textView9 = this.f13296H;
        if (textView9 != null) {
            textView9.setText(afm.m97360H().m97425V().ocrResult.ocrResult.district);
        }
        TextView textView10 = this.f13297I;
        if (textView10 != null) {
            textView10.setText(afm.m97360H().m97425V().ocrResult.ocrResult.religion);
        }
        TextView textView11 = this.f13298J;
        if (textView11 != null) {
            textView11.setText(afm.m97360H().m97425V().ocrResult.ocrResult.marriage);
        }
        TextView textView12 = this.f13299K;
        if (textView12 != null) {
            textView12.setText(afm.m97360H().m97425V().ocrResult.ocrResult.job);
        }
        TextView textView13 = this.f13300L;
        if (textView13 != null) {
            textView13.setText(afm.m97360H().m97425V().ocrResult.ocrResult.nationality);
        }
        TextView textView14 = this.f13301M;
        if (textView14 != null) {
            textView14.setText(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate);
        }
        TextView textView15 = this.f13302N;
        if (textView15 != null) {
            textView15.setText(afm.m97360H().m97425V().ocrResult.ocrResult.province);
        }
        TextView textView16 = this.f13303O;
        if (textView16 != null) {
            textView16.setText(afm.m97360H().m97425V().ocrResult.ocrResult.city);
        }
        TextView textView17 = this.f13304P;
        if (textView17 != null) {
            textView17.setText(afm.m97360H().m97425V().ocrResult.ocrResult.issueDate);
        }
    }
}
