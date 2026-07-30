package com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xkm;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostMediaPickerFrag extends MediaPickerFrag {
    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag
    /* JADX INFO: renamed from: E5 */
    public void mo39311E5() {
        if (this.f54025T == null) {
            this.f54025T = new xkm(act(), this.f54013z);
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag
    /* JADX INFO: renamed from: Y5 */
    public void mo39312Y5() {
        super.mo39312Y5();
        boolean zIsEmpty = this.f54013z.allSelectedMedias.isEmpty();
        TextView textView = this.f54023R;
        if (zIsEmpty) {
            textView.setClickable(false);
            this.f54023R.setTextColor(654311423);
            this.f54024S.setTextColor(654311423);
            this.f54024S.setClickable(false);
            this.f54024S.setSelected(false);
            return;
        }
        textView.setClickable(true);
        this.f54023R.setTextColor(-419430401);
        this.f54024S.setTextColor(-419430401);
        this.f54024S.setClickable(true);
        this.f54024S.setSelected(true);
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag, com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f54014I.setBackgroundResource(x2c0.f189478K8);
        this.f54014I.setBackgroundResource(x2c0.f189478K8);
        xdl0.m208345M0(this.f54015J, false);
        this.f54016K.setTextColor(getResources().getColor(w0c0.f183901x1));
        this.f54017L.setColorFilter(Color.argb(255, 255, 255, 255));
        this.f54019N.setBackground(null);
        this.f54021P.f54030a.setBackgroundColor(getResources().getColor(w0c0.f183809U));
        this.f54022Q.setBackgroundColor(getResources().getColor(w0c0.f183809U));
        xdl0.m208325C0(this.f54022Q, t100.m186890d(66.0f));
        this.f54024S.setBackground(getResources().getDrawable(x2c0.f189571N8));
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag, com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
    }
}
