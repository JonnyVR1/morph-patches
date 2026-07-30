package tech.sud.runtime.component.p144c;

import android.content.Context;
import android.media.AudioManager;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22522a {

    /* JADX INFO: renamed from: a */
    private AudioManager f208481a;

    /* JADX INFO: renamed from: b */
    private final C22563g f208482b;

    /* JADX INFO: renamed from: c */
    private AudioManager.OnAudioFocusChangeListener f208483c = new AudioManager.OnAudioFocusChangeListener() { // from class: tech.sud.runtime.component.c.a.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                C22522a.this.f208482b.m223240b(13, 1);
            } else {
                if (i != 1) {
                    return;
                }
                C22522a.this.f208482b.m223240b(13, 0);
            }
        }
    };

    public C22522a(C22563g c22563g, Context context) {
        this.f208481a = null;
        this.f208482b = c22563g;
        if (this.f208481a == null) {
            this.f208481a = (AudioManager) context.getApplicationContext().getSystemService("audio");
            m222863c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222861a() {
        m222862b();
        this.f208481a = null;
    }

    /* JADX INFO: renamed from: b */
    public void m222862b() {
        AudioManager audioManager = this.f208481a;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f208483c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m222863c() {
        AudioManager audioManager = this.f208481a;
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f208483c, 3, 3);
        }
    }
}
