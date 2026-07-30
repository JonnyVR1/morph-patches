package com.p046p1.mobile.putong.live.external.intl.music;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.et10;
import p149l.f5c0;
import p149l.h3c0;
import p149l.jbu;
import p149l.mep0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class MusicScanningItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f45706d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45707e;

    /* JADX INFO: renamed from: f */
    public TextView f45708f;

    /* JADX INFO: renamed from: g */
    public VImage f45709g;

    /* JADX INFO: renamed from: h */
    public VText f45710h;

    /* JADX INFO: renamed from: i */
    public View f45711i;

    public MusicScanningItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m70237h0(IntlMusicBean intlMusicBean, boolean z, boolean z2) {
        this.f45706d.setText(intlMusicBean.title);
        this.f45708f.setText(jbu.m140818Z(intlMusicBean.duration / 1000));
        this.f45710h.setText(intlMusicBean.author);
        VImage vImage = this.f45709g;
        if (z2) {
            vImage.setSelected(z);
            this.f45709g.setImageResource(h3c0.f105688m0);
            xdl0.m208344M(this.f45711i, false);
        } else {
            vImage.setImageResource(h3c0.f105633R);
            xdl0.m208344M(this.f45711i, true);
        }
        et10.m117969a(intlMusicBean.filePath, this.f45707e, h3c0.f105613H);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45706d = (TextView) findViewById(f5c0.f95039Q0);
        this.f45707e = (VDraweeView) findViewById(f5c0.f95035P);
        this.f45708f = (TextView) findViewById(f5c0.f95026M0);
        this.f45709g = (VImage) findViewById(f5c0.f95162x1);
        this.f45710h = (VText) findViewById(f5c0.f95018K0);
        this.f45711i = findViewById(f5c0.f95054V0);
        mep0.m154302d1(this.f45707e, t100.m186890d(8.0f));
    }

    public MusicScanningItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicScanningItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
