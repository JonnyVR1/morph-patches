package p149l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class gnx0 {

    /* JADX INFO: renamed from: a */
    public final AudioManager f103631a;

    /* JADX INFO: renamed from: b */
    public final zmx0 f103632b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public cnx0 f103633c;

    /* JADX INFO: renamed from: d */
    public int f103634d;

    /* JADX INFO: renamed from: e */
    public float f103635e = 1.0f;

    public gnx0(Context context, Handler handler, cnx0 cnx0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f103631a = audioManager;
        this.f103633c = cnx0Var;
        this.f103632b = new zmx0(this, handler);
        this.f103634d = 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m127196c(gnx0 gnx0Var, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                gnx0Var.m127202g(3);
                return;
            } else {
                gnx0Var.m127201f(0);
                gnx0Var.m127202g(2);
                return;
            }
        }
        if (i == -1) {
            gnx0Var.m127201f(-1);
            gnx0Var.m127200e();
        } else if (i == 1) {
            gnx0Var.m127202g(1);
            gnx0Var.m127201f(1);
        } else {
            svv0.m186111f("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m127197a() {
        return this.f103635e;
    }

    /* JADX INFO: renamed from: b */
    public final int m127198b(boolean z, int i) {
        m127200e();
        return z ? 1 : -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m127199d() {
        this.f103633c = null;
        m127200e();
    }

    /* JADX INFO: renamed from: e */
    public final void m127200e() {
        if (this.f103634d == 0) {
            return;
        }
        if (ggw0.f102568a < 26) {
            this.f103631a.abandonAudioFocus(this.f103632b);
        }
        m127202g(0);
    }

    /* JADX INFO: renamed from: f */
    public final void m127201f(int i) {
        cnx0 cnx0Var = this.f103633c;
        if (cnx0Var != null) {
            pwx0 pwx0Var = (pwx0) cnx0Var;
            boolean zMo124670b = pwx0Var.f151609a.mo124670b();
            pwx0Var.f151609a.m133466U(zMo124670b, i, hxx0.m133436H(zMo124670b, i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m127202g(int i) {
        if (this.f103634d == i) {
            return;
        }
        this.f103634d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f103635e != f) {
            this.f103635e = f;
            cnx0 cnx0Var = this.f103633c;
            if (cnx0Var != null) {
                ((pwx0) cnx0Var).f151609a.m133463R();
            }
        }
    }
}
