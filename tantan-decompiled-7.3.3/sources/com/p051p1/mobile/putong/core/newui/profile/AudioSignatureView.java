package com.p051p1.mobile.putong.core.newui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.media.AudioPlayer;
import com.p051p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.bone.StageView;
import java.util.Locale;
import p151v.VImage;
import p151v.VText;
import p153l.dbc0;
import p153l.fd1;
import p153l.fo0;
import p153l.kcg0;
import p153l.ld1;
import p153l.psd0;
import p153l.qrb;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class AudioSignatureView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f27201a;

    /* JADX INFO: renamed from: b */
    public VImage f27202b;

    /* JADX INFO: renamed from: c */
    public StageView f27203c;

    /* JADX INFO: renamed from: d */
    public AudioSignature f27204d;

    /* JADX INFO: renamed from: e */
    public AudioPlayer f27205e;

    /* JADX INFO: renamed from: f */
    public kcg0 f27206f;

    /* JADX INFO: renamed from: g */
    public boolean f27207g;

    /* JADX INFO: renamed from: h */
    public qrb f27208h;

    public AudioSignatureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m44216b(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f27207g = true;
            if (this.f27208h == null) {
                ld1 ld1Var = new ld1(fd1.m125075a(this.f27204d.duration), this.f27201a);
                this.f27208h = ld1Var;
                ld1Var.m177533a();
            }
            this.f27202b.setImageResource(dbc0.f86069Cs);
            this.f27203c.m82168h(0.0f, 1.0f, 1000);
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f27207g) {
            if (state == AudioPlayer.State.finished) {
                this.f27208h.stop();
                this.f27208h = null;
            }
            this.f27203c.setPercent(0.0f);
            this.f27207g = false;
            this.f27202b.setImageResource(dbc0.f86101Ds);
            this.f27201a.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(fd1.m125075a(this.f27204d.duration))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f27205e = audioPlayer;
        this.f27206f = audioPlayer.obs().distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.nd1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141421a.m44216b((AudioPlayer.State) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f27205e.destroy();
        this.f27205e = null;
        psd0.m173633z(this.f27206f);
        super.onDetachedFromWindow();
    }

    public AudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
