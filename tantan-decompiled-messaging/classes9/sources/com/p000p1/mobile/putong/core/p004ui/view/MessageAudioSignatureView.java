package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.android.media.AudioPlayer;
import com.p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.bone.StageView;
import java.util.Locale;
import l.c3c0;
import l.c4g0;
import l.e30;
import l.jo0;
import l.mkd0;
import p006l.cwy;
import p006l.moy;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MessageAudioSignatureView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f6561a;

    /* JADX INFO: renamed from: b */
    public VImage f6562b;

    /* JADX INFO: renamed from: c */
    public StageView f6563c;

    /* JADX INFO: renamed from: d */
    public AudioSignature f6564d;

    /* JADX INFO: renamed from: e */
    public AudioPlayer f6565e;

    /* JADX INFO: renamed from: f */
    public c4g0 f6566f;

    /* JADX INFO: renamed from: g */
    public boolean f6567g;

    /* JADX INFO: renamed from: h */
    public cwy f6568h;

    public MessageAudioSignatureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public static int m9562b(float f) {
        if (f > 29.0f) {
            return 30;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m9563c(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f6567g = true;
            if (this.f6568h == null) {
                moy moyVar = new moy(m9562b(this.f6564d.duration), this.f6561a);
                this.f6568h = moyVar;
                moyVar.m13684a();
            }
            this.f6562b.setImageResource(c3c0.a7);
            this.f6563c.h(0.0f, 1.0f, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f6567g) {
            if (state == AudioPlayer.State.finished) {
                this.f6568h.stop();
                this.f6568h = null;
            }
            this.f6563c.setPercent(0.0f);
            this.f6567g = false;
            this.f6562b.setImageResource(c3c0.b7);
            this.f6561a.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(m9562b(this.f6564d.duration))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f6565e = audioPlayer;
        this.f6566f = audioPlayer.obs().distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.noy
            public final void call(Object obj) {
                this.f17767a.m9563c((AudioPlayer.State) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f6565e.destroy();
        this.f6565e = null;
        mkd0.z(this.f6566f);
        super.onDetachedFromWindow();
    }

    public MessageAudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageAudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
