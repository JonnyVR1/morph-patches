package com.p046p1.mobile.putong.core.newui.profile;

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
import p149l.c4g0;
import p149l.cqb;
import p149l.e30;
import p149l.ed1;
import p149l.jo0;
import p149l.mkd0;
import p149l.x2c0;
import p149l.yc1;

/* JADX INFO: loaded from: classes11.dex */
public class AudioSignatureView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f26459a;

    /* JADX INFO: renamed from: b */
    public VImage f26460b;

    /* JADX INFO: renamed from: c */
    public StageView f26461c;

    /* JADX INFO: renamed from: d */
    public AudioSignature f26462d;

    /* JADX INFO: renamed from: e */
    public AudioPlayer f26463e;

    /* JADX INFO: renamed from: f */
    public c4g0 f26464f;

    /* JADX INFO: renamed from: g */
    public boolean f26465g;

    /* JADX INFO: renamed from: h */
    public cqb f26466h;

    public AudioSignatureView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m43205b(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f26465g = true;
            if (this.f26466h == null) {
                ed1 ed1Var = new ed1(yc1.m213987a(this.f26462d.duration), this.f26459a);
                this.f26466h = ed1Var;
                ed1Var.m108245a();
            }
            this.f26460b.setImageResource(x2c0.f189621Or);
            this.f26461c.m80985h(0.0f, 1.0f, 1000);
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f26465g) {
            if (state == AudioPlayer.State.finished) {
                this.f26466h.stop();
                this.f26466h = null;
            }
            this.f26461c.setPercent(0.0f);
            this.f26465g = false;
            this.f26460b.setImageResource(x2c0.f189652Pr);
            this.f26459a.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(yc1.m213987a(this.f26462d.duration))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f26463e = audioPlayer;
        this.f26464f = audioPlayer.obs().distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.gd1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102072a.m43205b((AudioPlayer.State) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f26463e.destroy();
        this.f26463e = null;
        mkd0.m154992z(this.f26464f);
        super.onDetachedFromWindow();
    }

    public AudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioSignatureView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
