package com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.qa00;
import p153l.zmm;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostMediaPickerFrag extends MediaPickerFrag {
    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag
    /* JADX INFO: renamed from: E5 */
    public void mo40314E5() {
        if (this.f54873T == null) {
            this.f54873T = new zmm(act(), this.f54861z);
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag
    /* JADX INFO: renamed from: Y5 */
    public void mo40315Y5() {
        super.mo40315Y5();
        boolean zIsEmpty = this.f54861z.allSelectedMedias.isEmpty();
        TextView textView = this.f54871R;
        if (zIsEmpty) {
            textView.setClickable(false);
            this.f54871R.setTextColor(654311423);
            this.f54872S.setTextColor(654311423);
            this.f54872S.setClickable(false);
            this.f54872S.setSelected(false);
            return;
        }
        textView.setClickable(true);
        this.f54871R.setTextColor(-419430401);
        this.f54872S.setTextColor(-419430401);
        this.f54872S.setClickable(true);
        this.f54872S.setSelected(true);
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag, com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f54862I.setBackgroundResource(dbc0.f86337L8);
        this.f54862I.setBackgroundResource(dbc0.f86337L8);
        bnl0.m105525M0(this.f54863J, false);
        this.f54864K.setTextColor(getResources().getColor(c9c0.f80474y1));
        this.f54865L.setColorFilter(Color.argb(255, 255, 255, 255));
        this.f54867N.setBackground(null);
        this.f54869P.f54878a.setBackgroundColor(getResources().getColor(c9c0.f80381V));
        this.f54870Q.setBackgroundColor(getResources().getColor(c9c0.f80381V));
        bnl0.m105505C0(this.f54870Q, qa00.m175859d(66.0f));
        this.f54872S.setBackground(getResources().getDrawable(dbc0.f86433O8));
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag, com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
    }
}
