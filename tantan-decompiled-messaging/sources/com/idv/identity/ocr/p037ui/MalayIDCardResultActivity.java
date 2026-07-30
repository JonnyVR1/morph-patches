package com.idv.identity.ocr.p037ui;

import android.widget.TextView;
import p149l.k4c0;
import p149l.kcm;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class MalayIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private TextView f12616A;

    /* JADX INFO: renamed from: B */
    private TextView f12617B;

    /* JADX INFO: renamed from: C */
    private TextView f12618C;

    /* JADX INFO: renamed from: D */
    private TextView f12619D;

    /* JADX INFO: renamed from: z */
    private TextView f12620z;

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191121i);
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
        this.f12620z = (TextView) findViewById(k4c0.f121002R);
        this.f12616A = (TextView) findViewById(k4c0.f121065r0);
        this.f12617B = (TextView) findViewById(k4c0.f121075w0);
        this.f12618C = (TextView) findViewById(k4c0.f121053l0);
        this.f12619D = (TextView) findViewById(k4c0.f120974D);
        TextView textView = this.f12620z;
        if (textView != null) {
            textView.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        TextView textView2 = this.f12616A;
        if (textView2 != null) {
            textView2.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.name);
        }
        TextView textView3 = this.f12617B;
        if (textView3 != null) {
            textView3.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        TextView textView4 = this.f12618C;
        if (textView4 != null) {
            textView4.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.nationality);
        }
        TextView textView5 = this.f12619D;
        if (textView5 != null) {
            textView5.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.address);
        }
    }
}
