package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1831b;
import com.google.android.exoplayer2.audio.C1818a;
import p149l.jwv;
import p149l.ma1;
import p149l.oa1;
import p149l.p11;
import p149l.pa1;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1831b {

    /* JADX INFO: renamed from: a */
    public final AudioManager f7272a;

    /* JADX INFO: renamed from: b */
    public final a f7273b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public b f7274c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C1818a f7275d;

    /* JADX INFO: renamed from: f */
    public int f7277f;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f7279h;

    /* JADX INFO: renamed from: i */
    public boolean f7280i;

    /* JADX INFO: renamed from: g */
    public float f7278g = 1.0f;

    /* JADX INFO: renamed from: e */
    public int f7276e = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final Handler f7281a;

        public a(Handler handler) {
            this.f7281a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f7281a.post(new Runnable() { // from class: l.wa1
                @Override // java.lang.Runnable
                public final void run() {
                    C1831b.this.m9688h(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b */
    public interface b {
        /* JADX INFO: renamed from: F */
        void mo9699F(float f);

        /* JADX INFO: renamed from: G */
        void mo9700G(int i);
    }

    public C1831b(Context context, Handler handler, b bVar) {
        this.f7272a = (AudioManager) p11.m167011e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f7274c = bVar;
        this.f7273b = new a(handler);
    }

    /* JADX INFO: renamed from: e */
    public static int m9682e(@Nullable C1818a c1818a) {
        if (c1818a == null) {
            return 0;
        }
        switch (c1818a.f7151c) {
            case 0:
                jwv.m143689i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (c1818a.f7149a == 1) {
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
                jwv.m143689i("AudioFocusManager", "Unidentified audio usage: " + c1818a.f7151c);
                return 0;
            case 16:
                return vck0.f180948a >= 19 ? 4 : 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9683a() {
        this.f7272a.abandonAudioFocus(this.f7273b);
    }

    /* JADX INFO: renamed from: b */
    public final void m9684b() {
        if (this.f7276e == 0) {
            return;
        }
        if (vck0.f180948a >= 26) {
            m9685c();
        } else {
            m9683a();
        }
        m9694n(0);
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: c */
    public final void m9685c() {
        AudioFocusRequest audioFocusRequest = this.f7279h;
        if (audioFocusRequest != null) {
            this.f7272a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9686f(int i) {
        b bVar = this.f7274c;
        if (bVar != null) {
            bVar.mo9700G(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public float m9687g() {
        return this.f7278g;
    }

    /* JADX INFO: renamed from: h */
    public final void m9688h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !m9697q()) {
                m9694n(3);
                return;
            } else {
                m9686f(0);
                m9694n(2);
                return;
            }
        }
        if (i == -1) {
            m9686f(-1);
            m9684b();
        } else if (i == 1) {
            m9694n(1);
            m9686f(1);
        } else {
            jwv.m143689i("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m9689i() {
        this.f7274c = null;
        m9684b();
    }

    /* JADX INFO: renamed from: j */
    public final int m9690j() {
        if (this.f7276e == 1) {
            return 1;
        }
        if ((vck0.f180948a >= 26 ? m9692l() : m9691k()) == 1) {
            m9694n(1);
            return 1;
        }
        m9694n(0);
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m9691k() {
        return this.f7272a.requestAudioFocus(this.f7273b, vck0.m197867j0(((C1818a) p11.m167011e(this.f7275d)).f7151c), this.f7277f);
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: l */
    public final int m9692l() {
        AudioFocusRequest.Builder builderM163222a;
        AudioFocusRequest audioFocusRequest = this.f7279h;
        if (audioFocusRequest == null || this.f7280i) {
            if (audioFocusRequest == null) {
                pa1.m167970a();
                builderM163222a = ma1.m153628a(this.f7277f);
            } else {
                pa1.m167970a();
                builderM163222a = oa1.m163222a(this.f7279h);
            }
            this.f7279h = builderM163222a.setAudioAttributes(((C1818a) p11.m167011e(this.f7275d)).m9532b().f7155a).setWillPauseWhenDucked(m9697q()).setOnAudioFocusChangeListener(this.f7273b).build();
            this.f7280i = false;
        }
        return this.f7272a.requestAudioFocus(this.f7279h);
    }

    /* JADX INFO: renamed from: m */
    public void m9693m(@Nullable C1818a c1818a) {
        if (vck0.m197845c(this.f7275d, c1818a)) {
            return;
        }
        this.f7275d = c1818a;
        int iM9682e = m9682e(c1818a);
        this.f7277f = iM9682e;
        boolean z = true;
        if (iM9682e != 1 && iM9682e != 0) {
            z = false;
        }
        p11.m167008b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* JADX INFO: renamed from: n */
    public final void m9694n(int i) {
        if (this.f7276e == i) {
            return;
        }
        this.f7276e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f7278g == f) {
            return;
        }
        this.f7278g = f;
        b bVar = this.f7274c;
        if (bVar != null) {
            bVar.mo9699F(f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9695o(int i) {
        return i == 1 || this.f7277f != 1;
    }

    /* JADX INFO: renamed from: p */
    public int m9696p(boolean z, int i) {
        if (m9695o(i)) {
            m9684b();
            return z ? 1 : -1;
        }
        if (z) {
            return m9690j();
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9697q() {
        C1818a c1818a = this.f7275d;
        return c1818a != null && c1818a.f7149a == 1;
    }
}
