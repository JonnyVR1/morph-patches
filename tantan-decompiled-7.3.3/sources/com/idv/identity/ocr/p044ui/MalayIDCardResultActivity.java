package com.idv.identity.ocr.p044ui;

import android.widget.TextView;
import p153l.afm;
import p153l.dec0;
import p153l.rcc0;

/* JADX INFO: loaded from: classes7.dex */
public class MalayIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private TextView f13357A;

    /* JADX INFO: renamed from: B */
    private TextView f13358B;

    /* JADX INFO: renamed from: C */
    private TextView f13359C;

    /* JADX INFO: renamed from: D */
    private TextView f13360D;

    /* JADX INFO: renamed from: z */
    private TextView f13361z;

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88005i);
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
        this.f13361z = (TextView) findViewById(rcc0.f162121R);
        this.f13357A = (TextView) findViewById(rcc0.f162184r0);
        this.f13358B = (TextView) findViewById(rcc0.f162194w0);
        this.f13359C = (TextView) findViewById(rcc0.f162172l0);
        this.f13360D = (TextView) findViewById(rcc0.f162093D);
        TextView textView = this.f13361z;
        if (textView != null) {
            textView.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        TextView textView2 = this.f13357A;
        if (textView2 != null) {
            textView2.setText(afm.m97360H().m97425V().ocrResult.ocrResult.name);
        }
        TextView textView3 = this.f13358B;
        if (textView3 != null) {
            textView3.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        TextView textView4 = this.f13359C;
        if (textView4 != null) {
            textView4.setText(afm.m97360H().m97425V().ocrResult.ocrResult.nationality);
        }
        TextView textView5 = this.f13360D;
        if (textView5 != null) {
            textView5.setText(afm.m97360H().m97425V().ocrResult.ocrResult.address);
        }
    }
}
