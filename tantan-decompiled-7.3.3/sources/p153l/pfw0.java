package p153l;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public final class pfw0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final Context f152211a;

    /* JADX INFO: renamed from: b */
    public final AudioManager f152212b;

    /* JADX INFO: renamed from: c */
    public final nfw0 f152213c;

    /* JADX INFO: renamed from: d */
    public float f152214d;

    /* JADX INFO: renamed from: e */
    public final egw0 f152215e;

    public pfw0(Handler handler, Context context, nfw0 nfw0Var, egw0 egw0Var) {
        super(handler);
        this.f152211a = context;
        this.f152212b = (AudioManager) context.getSystemService("audio");
        this.f152213c = nfw0Var;
        this.f152215e = egw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m172159a() {
        this.f152214d = m172161c();
        m172162d();
        this.f152211a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m172160b() {
        this.f152211a.getContentResolver().unregisterContentObserver(this);
    }

    /* JADX INFO: renamed from: c */
    public final float m172161c() {
        AudioManager audioManager = this.f152212b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: d */
    public final void m172162d() {
        this.f152215e.m120814e(this.f152214d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fM172161c = m172161c();
        if (fM172161c != this.f152214d) {
            this.f152214d = fM172161c;
            m172162d();
        }
    }
}
