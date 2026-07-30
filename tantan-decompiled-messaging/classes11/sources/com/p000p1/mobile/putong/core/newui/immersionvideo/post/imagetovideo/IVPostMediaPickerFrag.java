package com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import l.t100;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import p009l.xkm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IVPostMediaPickerFrag extends MediaPickerFrag {
    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag
    /* JADX INFO: renamed from: E5 */
    public void mo3336E5() {
        if (this.f7631T == null) {
            this.f7631T = new xkm(act(), this.f7619z);
        }
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag
    /* JADX INFO: renamed from: Y5 */
    public void mo3337Y5() {
        super.mo3337Y5();
        boolean zIsEmpty = this.f7619z.allSelectedMedias.isEmpty();
        TextView textView = this.f7629R;
        if (zIsEmpty) {
            textView.setClickable(false);
            this.f7629R.setTextColor(654311423);
            this.f7630S.setTextColor(654311423);
            this.f7630S.setClickable(false);
            this.f7630S.setSelected(false);
            return;
        }
        textView.setClickable(true);
        this.f7629R.setTextColor(-419430401);
        this.f7630S.setTextColor(-419430401);
        this.f7630S.setClickable(true);
        this.f7630S.setSelected(true);
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag, com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: g4 */
    public void mo3338g4(Bundle bundle) {
        super.mo3338g4(bundle);
        this.f7620I.setBackgroundResource(x2c0.K8);
        this.f7620I.setBackgroundResource(x2c0.K8);
        xdl0.M0(this.f7621J, false);
        this.f7622K.setTextColor(getResources().getColor(w0c0.x1));
        this.f7623L.setColorFilter(Color.argb(255, 255, 255, 255));
        this.f7625N.setBackground(null);
        this.f7627P.f7636a.setBackgroundColor(getResources().getColor(w0c0.U));
        this.f7628Q.setBackgroundColor(getResources().getColor(w0c0.U));
        xdl0.C0(this.f7628Q, t100.d(66.0f));
        this.f7630S.setBackground(getResources().getDrawable(x2c0.N8));
    }

    @Override // com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag, com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag
    /* JADX INFO: renamed from: n4 */
    public void mo3339n4(Bundle bundle) {
        super.mo3339n4(bundle);
    }
}
