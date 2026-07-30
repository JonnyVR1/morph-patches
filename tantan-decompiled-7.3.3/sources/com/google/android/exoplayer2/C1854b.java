package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1854b;
import com.google.android.exoplayer2.audio.C1841a;
import p153l.bmk0;
import p153l.kyv;
import p153l.ta1;
import p153l.va1;
import p153l.w11;
import p153l.wa1;

/* JADX INFO: renamed from: com.google.android.exoplayer2.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1854b {

    /* JADX INFO: renamed from: a */
    public final AudioManager f7309a;

    /* JADX INFO: renamed from: b */
    public final a f7310b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public b f7311c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C1841a f7312d;

    /* JADX INFO: renamed from: f */
    public int f7314f;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f7316h;

    /* JADX INFO: renamed from: i */
    public boolean f7317i;

    /* JADX INFO: renamed from: g */
    public float f7315g = 1.0f;

    /* JADX INFO: renamed from: e */
    public int f7313e = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final Handler f7318a;

        public a(Handler handler) {
            this.f7318a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f7318a.post(new Runnable() { // from class: l.db1
                @Override // java.lang.Runnable
                public final void run() {
                    C1854b.this.m9742h(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b */
    public interface b {
        /* JADX INFO: renamed from: F */
        void mo9753F(float f);

        /* JADX INFO: renamed from: G */
        void mo9754G(int i);
    }

    public C1854b(Context context, Handler handler, b bVar) {
        this.f7309a = (AudioManager) w11.m204369e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f7311c = bVar;
        this.f7310b = new a(handler);
    }

    /* JADX INFO: renamed from: e */
    public static int m9736e(@Nullable C1841a c1841a) {
        if (c1841a == null) {
            return 0;
        }
        switch (c1841a.f7188c) {
            case 0:
                kyv.m152151i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c1841a.f7186a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                kyv.m152151i("AudioFocusManager", "Unidentified audio usage: " + c1841a.f7188c);
                return 0;
            case 16:
                return bmk0.f77313a >= 19 ? 4 : 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9737a() {
        this.f7309a.abandonAudioFocus(this.f7310b);
    }

    /* JADX INFO: renamed from: b */
    public final void m9738b() {
        if (this.f7313e == 0) {
            return;
        }
        if (bmk0.f77313a >= 26) {
            m9739c();
        } else {
            m9737a();
        }
        m9748n(0);
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: c */
    public final void m9739c() {
        AudioFocusRequest audioFocusRequest = this.f7316h;
        if (audioFocusRequest != null) {
            this.f7309a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9740f(int i) {
        b bVar = this.f7311c;
        if (bVar != null) {
            bVar.mo9754G(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public float m9741g() {
        return this.f7315g;
    }

    /* JADX INFO: renamed from: h */
    public final void m9742h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !m9751q()) {
                m9748n(3);
                return;
            } else {
                m9740f(0);
                m9748n(2);
                return;
            }
        }
        if (i == -1) {
            m9740f(-1);
            m9738b();
        } else if (i == 1) {
            m9748n(1);
            m9740f(1);
        } else {
            kyv.m152151i("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m9743i() {
        this.f7311c = null;
        m9738b();
    }

    /* JADX INFO: renamed from: j */
    public final int m9744j() {
        if (this.f7313e == 1) {
            return 1;
        }
        if ((bmk0.f77313a >= 26 ? m9746l() : m9745k()) == 1) {
            m9748n(1);
            return 1;
        }
        m9748n(0);
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m9745k() {
        return this.f7309a.requestAudioFocus(this.f7310b, bmk0.m105145j0(((C1841a) w11.m204369e(this.f7312d)).f7188c), this.f7314f);
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: l */
    public final int m9746l() {
        AudioFocusRequest.Builder builderM200496a;
        AudioFocusRequest audioFocusRequest = this.f7316h;
        if (audioFocusRequest == null || this.f7317i) {
            if (audioFocusRequest == null) {
                wa1.m205632a();
                builderM200496a = ta1.m189769a(this.f7314f);
            } else {
                wa1.m205632a();
                builderM200496a = va1.m200496a(this.f7316h);
            }
            this.f7316h = builderM200496a.setAudioAttributes(((C1841a) w11.m204369e(this.f7312d)).m9586b().f7192a).setWillPauseWhenDucked(m9751q()).setOnAudioFocusChangeListener(this.f7310b).build();
            this.f7317i = false;
        }
        return this.f7309a.requestAudioFocus(this.f7316h);
    }

    /* JADX INFO: renamed from: m */
    public void m9747m(@Nullable C1841a c1841a) {
        if (bmk0.m105123c(this.f7312d, c1841a)) {
            return;
        }
        this.f7312d = c1841a;
        int iM9736e = m9736e(c1841a);
        this.f7314f = iM9736e;
        boolean z = true;
        if (iM9736e != 1 && iM9736e != 0) {
            z = false;
        }
        w11.m204366b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* JADX INFO: renamed from: n */
    public final void m9748n(int i) {
        if (this.f7313e == i) {
            return;
        }
        this.f7313e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f7315g == f) {
            return;
        }
        this.f7315g = f;
        b bVar = this.f7311c;
        if (bVar != null) {
            bVar.mo9753F(f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9749o(int i) {
        return i == 1 || this.f7314f != 1;
    }

    /* JADX INFO: renamed from: p */
    public int m9750p(boolean z, int i) {
        if (m9749o(i)) {
            m9738b();
            return z ? 1 : -1;
        }
        if (z) {
            return m9744j();
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9751q() {
        C1841a c1841a = this.f7312d;
        return c1841a != null && c1841a.f7186a == 1;
    }
}
