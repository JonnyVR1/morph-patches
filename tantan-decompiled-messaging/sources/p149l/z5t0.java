package p149l;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes6.dex */
public final class z5t0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final AudioManager f201858a;

    /* JADX INFO: renamed from: b */
    public final y5t0 f201859b;

    /* JADX INFO: renamed from: c */
    public boolean f201860c;

    /* JADX INFO: renamed from: d */
    public boolean f201861d;

    /* JADX INFO: renamed from: e */
    public boolean f201862e;

    /* JADX INFO: renamed from: f */
    public float f201863f = 1.0f;

    public z5t0(Context context, y5t0 y5t0Var) {
        this.f201858a = (AudioManager) context.getSystemService("audio");
        this.f201859b = y5t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m217370a() {
        float f = this.f201862e ? 0.0f : this.f201863f;
        if (this.f201860c) {
            return f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m217371b() {
        this.f201861d = true;
        m217375f();
    }

    /* JADX INFO: renamed from: c */
    public final void m217372c() {
        this.f201861d = false;
        m217375f();
    }

    /* JADX INFO: renamed from: d */
    public final void m217373d(boolean z) {
        this.f201862e = z;
        m217375f();
    }

    /* JADX INFO: renamed from: e */
    public final void m217374e(float f) {
        this.f201863f = f;
        m217375f();
    }

    /* JADX INFO: renamed from: f */
    public final void m217375f() {
        if (!this.f201861d || this.f201862e || this.f201863f <= 0.0f) {
            if (this.f201860c) {
                AudioManager audioManager = this.f201858a;
                if (audioManager != null) {
                    this.f201860c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f201859b.zzn();
                return;
            }
            return;
        }
        if (this.f201860c) {
            return;
        }
        AudioManager audioManager2 = this.f201858a;
        if (audioManager2 != null) {
            this.f201860c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f201859b.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f201860c = i > 0;
        this.f201859b.zzn();
    }
}
