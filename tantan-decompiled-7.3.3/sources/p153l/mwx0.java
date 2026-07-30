package p153l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class mwx0 {

    /* JADX INFO: renamed from: a */
    public final AudioManager f139162a;

    /* JADX INFO: renamed from: b */
    public final fwx0 f139163b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public iwx0 f139164c;

    /* JADX INFO: renamed from: d */
    public int f139165d;

    /* JADX INFO: renamed from: e */
    public float f139166e = 1.0f;

    public mwx0(Context context, Handler handler, iwx0 iwx0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f139162a = audioManager;
        this.f139164c = iwx0Var;
        this.f139163b = new fwx0(this, handler);
        this.f139165d = 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m160603c(mwx0 mwx0Var, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                mwx0Var.m160609g(3);
                return;
            } else {
                mwx0Var.m160608f(0);
                mwx0Var.m160609g(2);
                return;
            }
        }
        if (i == -1) {
            mwx0Var.m160608f(-1);
            mwx0Var.m160607e();
        } else if (i == 1) {
            mwx0Var.m160609g(1);
            mwx0Var.m160608f(1);
        } else {
            y4w0.m214278f("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m160604a() {
        return this.f139166e;
    }

    /* JADX INFO: renamed from: b */
    public final int m160605b(boolean z, int i) {
        m160607e();
        return z ? 1 : -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m160606d() {
        this.f139164c = null;
        m160607e();
    }

    /* JADX INFO: renamed from: e */
    public final void m160607e() {
        if (this.f139165d == 0) {
            return;
        }
        if (mpw0.f137957a < 26) {
            this.f139162a.abandonAudioFocus(this.f139163b);
        }
        m160609g(0);
    }

    /* JADX INFO: renamed from: f */
    public final void m160608f(int i) {
        iwx0 iwx0Var = this.f139164c;
        if (iwx0Var != null) {
            v5y0 v5y0Var = (v5y0) iwx0Var;
            boolean zMo158176b = v5y0Var.f182588a.mo158176b();
            v5y0Var.f182588a.m161846U(zMo158176b, i, n6y0.m161816H(zMo158176b, i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m160609g(int i) {
        if (this.f139165d == i) {
            return;
        }
        this.f139165d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f139166e != f) {
            this.f139166e = f;
            iwx0 iwx0Var = this.f139164c;
            if (iwx0Var != null) {
                ((v5y0) iwx0Var).f182588a.m161843R();
            }
        }
    }
}
