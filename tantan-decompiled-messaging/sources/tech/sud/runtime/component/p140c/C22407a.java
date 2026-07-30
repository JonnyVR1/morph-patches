package tech.sud.runtime.component.p140c;

import android.content.Context;
import android.media.AudioManager;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22407a {

    /* JADX INFO: renamed from: a */
    private AudioManager f207559a;

    /* JADX INFO: renamed from: b */
    private final C22448g f207560b;

    /* JADX INFO: renamed from: c */
    private AudioManager.OnAudioFocusChangeListener f207561c = new AudioManager.OnAudioFocusChangeListener() { // from class: tech.sud.runtime.component.c.a.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                C22407a.this.f207560b.m221994b(13, 1);
            } else {
                if (i != 1) {
                    return;
                }
                C22407a.this.f207560b.m221994b(13, 0);
            }
        }
    };

    public C22407a(C22448g c22448g, Context context) {
        this.f207559a = null;
        this.f207560b = c22448g;
        if (this.f207559a == null) {
            this.f207559a = (AudioManager) context.getApplicationContext().getSystemService("audio");
            m221617c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221615a() {
        m221616b();
        this.f207559a = null;
    }

    /* JADX INFO: renamed from: b */
    public void m221616b() {
        AudioManager audioManager = this.f207559a;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f207561c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m221617c() {
        AudioManager audioManager = this.f207559a;
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f207561c, 3, 3);
        }
    }
}
