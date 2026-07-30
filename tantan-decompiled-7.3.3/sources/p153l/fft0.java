package p153l;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes6.dex */
public final class fft0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final AudioManager f98832a;

    /* JADX INFO: renamed from: b */
    public final eft0 f98833b;

    /* JADX INFO: renamed from: c */
    public boolean f98834c;

    /* JADX INFO: renamed from: d */
    public boolean f98835d;

    /* JADX INFO: renamed from: e */
    public boolean f98836e;

    /* JADX INFO: renamed from: f */
    public float f98837f = 1.0f;

    public fft0(Context context, eft0 eft0Var) {
        this.f98832a = (AudioManager) context.getSystemService("audio");
        this.f98833b = eft0Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m125419a() {
        float f = this.f98836e ? 0.0f : this.f98837f;
        if (this.f98834c) {
            return f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m125420b() {
        this.f98835d = true;
        m125424f();
    }

    /* JADX INFO: renamed from: c */
    public final void m125421c() {
        this.f98835d = false;
        m125424f();
    }

    /* JADX INFO: renamed from: d */
    public final void m125422d(boolean z) {
        this.f98836e = z;
        m125424f();
    }

    /* JADX INFO: renamed from: e */
    public final void m125423e(float f) {
        this.f98837f = f;
        m125424f();
    }

    /* JADX INFO: renamed from: f */
    public final void m125424f() {
        if (!this.f98835d || this.f98836e || this.f98837f <= 0.0f) {
            if (this.f98834c) {
                AudioManager audioManager = this.f98832a;
                if (audioManager != null) {
                    this.f98834c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f98833b.zzn();
                return;
            }
            return;
        }
        if (this.f98834c) {
            return;
        }
        AudioManager audioManager2 = this.f98832a;
        if (audioManager2 != null) {
            this.f98834c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f98833b.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f98834c = i > 0;
        this.f98833b.zzn();
    }
}
