package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.media.AudioPlayer;
import com.p046p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.bone.StageView;
import java.util.Locale;
import p147v.VImage;
import p147v.VText;
import p149l.c3c0;
import p149l.c4g0;
import p149l.cwy;
import p149l.e30;
import p149l.jo0;
import p149l.mkd0;
import p149l.moy;

/* JADX INFO: loaded from: classes9.dex */
public class MessageAudioSignatureView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f36780a;

    /* JADX INFO: renamed from: b */
    public VImage f36781b;

    /* JADX INFO: renamed from: c */
    public StageView f36782c;

    /* JADX INFO: renamed from: d */
    public AudioSignature f36783d;

    /* JADX INFO: renamed from: e */
    public AudioPlayer f36784e;

    /* JADX INFO: renamed from: f */
    public c4g0 f36785f;

    /* JADX INFO: renamed from: g */
    public boolean f36786g;

    /* JADX INFO: renamed from: h */
    public cwy f36787h;

    public MessageAudioSignatureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public static int m56135b(float f) {
        if (f > 29.0f) {
            return 30;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m56136c(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f36786g = true;
            if (this.f36787h == null) {
                moy moyVar = new moy(m56135b(this.f36783d.duration), this.f36780a);
                this.f36787h = moyVar;
                moyVar.m109078a();
            }
            this.f36781b.setImageResource(c3c0.f78700a7);
            this.f36782c.m80985h(0.0f, 1.0f, 1000);
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f36786g) {
            if (state == AudioPlayer.State.finished) {
                this.f36787h.stop();
                this.f36787h = null;
            }
            this.f36782c.setPercent(0.0f);
            this.f36786g = false;
            this.f36781b.setImageResource(c3c0.f78709b7);
            this.f36780a.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(m56135b(this.f36783d.duration))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f36784e = audioPlayer;
        this.f36785f = audioPlayer.obs().distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.noy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139890a.m56136c((AudioPlayer.State) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f36784e.destroy();
        this.f36784e = null;
        mkd0.m154992z(this.f36785f);
        super.onDetachedFromWindow();
    }

    public MessageAudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageAudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
