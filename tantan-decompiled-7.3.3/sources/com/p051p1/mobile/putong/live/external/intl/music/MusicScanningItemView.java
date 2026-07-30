package com.p051p1.mobile.putong.live.external.intl.music;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.kdu;
import p153l.ldc0;
import p153l.m120;
import p153l.nbc0;
import p153l.qa00;
import p153l.qnp0;

/* JADX INFO: loaded from: classes9.dex */
public class MusicScanningItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f46554d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46555e;

    /* JADX INFO: renamed from: f */
    public TextView f46556f;

    /* JADX INFO: renamed from: g */
    public VImage f46557g;

    /* JADX INFO: renamed from: h */
    public VText f46558h;

    /* JADX INFO: renamed from: i */
    public View f46559i;

    public MusicScanningItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m71420h0(IntlMusicBean intlMusicBean, boolean z, boolean z2) {
        this.f46554d.setText(intlMusicBean.title);
        this.f46556f.setText(kdu.m149281Z(intlMusicBean.duration / 1000));
        this.f46558h.setText(intlMusicBean.author);
        VImage vImage = this.f46557g;
        if (z2) {
            vImage.setSelected(z);
            this.f46557g.setImageResource(nbc0.f141179m0);
            bnl0.m105524M(this.f46559i, false);
        } else {
            vImage.setImageResource(nbc0.f141124R);
            bnl0.m105524M(this.f46559i, true);
        }
        m120.m156551a(intlMusicBean.filePath, this.f46555e, nbc0.f141104H);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46554d = (TextView) findViewById(ldc0.f131496Q0);
        this.f46555e = (VDraweeView) findViewById(ldc0.f131492P);
        this.f46556f = (TextView) findViewById(ldc0.f131483M0);
        this.f46557g = (VImage) findViewById(ldc0.f131619x1);
        this.f46558h = (VText) findViewById(ldc0.f131475K0);
        this.f46559i = findViewById(ldc0.f131511V0);
        qnp0.m177261d1(this.f46555e, qa00.m175859d(8.0f));
    }

    public MusicScanningItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicScanningItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
