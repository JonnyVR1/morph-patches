package com.p000p1.mobile.putong.core.newui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.media.AudioPlayer;
import com.p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.bone.StageView;
import java.util.Locale;
import l.c4g0;
import l.e30;
import l.jo0;
import l.mkd0;
import l.x2c0;
import p009l.cqb;
import p009l.ed1;
import p009l.yc1;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AudioSignatureView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f5237a;

    /* JADX INFO: renamed from: b */
    public VImage f5238b;

    /* JADX INFO: renamed from: c */
    public StageView f5239c;

    /* JADX INFO: renamed from: d */
    public AudioSignature f5240d;

    /* JADX INFO: renamed from: e */
    public AudioPlayer f5241e;

    /* JADX INFO: renamed from: f */
    public c4g0 f5242f;

    /* JADX INFO: renamed from: g */
    public boolean f5243g;

    /* JADX INFO: renamed from: h */
    public cqb f5244h;

    public AudioSignatureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m7421b(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f5243g = true;
            if (this.f5244h == null) {
                ed1 ed1Var = new ed1(yc1.m25281a(this.f5240d.duration), this.f5237a);
                this.f5244h = ed1Var;
                ed1Var.m12760a();
            }
            this.f5238b.setImageResource(x2c0.Or);
            this.f5239c.h(0.0f, 1.0f, 1000);
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f5243g) {
            if (state == AudioPlayer.State.finished) {
                this.f5244h.stop();
                this.f5244h = null;
            }
            this.f5239c.setPercent(0.0f);
            this.f5243g = false;
            this.f5238b.setImageResource(x2c0.Pr);
            this.f5237a.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(yc1.m25281a(this.f5240d.duration))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f5241e = audioPlayer;
        this.f5242f = audioPlayer.obs().distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.gd1
            public final void call(Object obj) {
                this.f13442a.m7421b((AudioPlayer.State) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f5241e.destroy();
        this.f5241e = null;
        mkd0.z(this.f5242f);
        super.onDetachedFromWindow();
    }

    public AudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
