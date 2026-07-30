package com.p051p1.mobile.putong.core.p058ui.view;

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
import p153l.fo0;
import p153l.ibc0;
import p153l.jxy;
import p153l.kcg0;
import p153l.psd0;
import p153l.y20;
import p153l.z4z;

/* JADX INFO: loaded from: classes12.dex */
public class MessageAudioSignatureView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f37628a;

    /* JADX INFO: renamed from: b */
    public VImage f37629b;

    /* JADX INFO: renamed from: c */
    public StageView f37630c;

    /* JADX INFO: renamed from: d */
    public AudioSignature f37631d;

    /* JADX INFO: renamed from: e */
    public AudioPlayer f37632e;

    /* JADX INFO: renamed from: f */
    public kcg0 f37633f;

    /* JADX INFO: renamed from: g */
    public boolean f37634g;

    /* JADX INFO: renamed from: h */
    public z4z f37635h;

    public MessageAudioSignatureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public static int m57318b(float f) {
        if (f > 29.0f) {
            return 30;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m57319c(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f37634g = true;
            if (this.f37635h == null) {
                jxy jxyVar = new jxy(m57318b(this.f37631d.duration), this.f37628a);
                this.f37635h = jxyVar;
                jxyVar.m218617a();
            }
            this.f37629b.setImageResource(ibc0.f113975a7);
            this.f37630c.m82168h(0.0f, 1.0f, 1000);
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f37634g) {
            if (state == AudioPlayer.State.finished) {
                this.f37635h.stop();
                this.f37635h = null;
            }
            this.f37630c.setPercent(0.0f);
            this.f37634g = false;
            this.f37629b.setImageResource(ibc0.f113984b7);
            this.f37628a.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(m57318b(this.f37631d.duration))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f37632e = audioPlayer;
        this.f37633f = audioPlayer.obs().distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.kxy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129254a.m57319c((AudioPlayer.State) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f37632e.destroy();
        this.f37632e = null;
        psd0.m173633z(this.f37633f);
        super.onDetachedFromWindow();
    }

    public MessageAudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageAudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
