package tech.sud.runtime.component.p021c;

import android.content.Context;
import android.media.AudioManager;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1200a {

    /* JADX INFO: renamed from: a */
    private AudioManager f11184a;

    /* JADX INFO: renamed from: b */
    private final C1241g f11185b;

    /* JADX INFO: renamed from: c */
    private AudioManager.OnAudioFocusChangeListener f11186c = new AudioManager.OnAudioFocusChangeListener() { // from class: tech.sud.runtime.component.c.a.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                C1200a.this.f11185b.m10465b(13, 1);
            } else {
                if (i != 1) {
                    return;
                }
                C1200a.this.f11185b.m10465b(13, 0);
            }
        }
    };

    public C1200a(C1241g c1241g, Context context) {
        this.f11184a = null;
        this.f11185b = c1241g;
        if (this.f11184a == null) {
            this.f11184a = (AudioManager) context.getApplicationContext().getSystemService("audio");
            m10088c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10086a() {
        m10087b();
        this.f11184a = null;
    }

    /* JADX INFO: renamed from: b */
    public void m10087b() {
        AudioManager audioManager = this.f11184a;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f11186c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10088c() {
        AudioManager audioManager = this.f11184a;
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f11186c, 3, 3);
        }
    }
}
