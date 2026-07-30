package p149l;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public final class j6w0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final Context f116541a;

    /* JADX INFO: renamed from: b */
    public final AudioManager f116542b;

    /* JADX INFO: renamed from: c */
    public final h6w0 f116543c;

    /* JADX INFO: renamed from: d */
    public float f116544d;

    /* JADX INFO: renamed from: e */
    public final y6w0 f116545e;

    public j6w0(Handler handler, Context context, h6w0 h6w0Var, y6w0 y6w0Var) {
        super(handler);
        this.f116541a = context;
        this.f116542b = (AudioManager) context.getSystemService("audio");
        this.f116543c = h6w0Var;
        this.f116545e = y6w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m140059a() {
        this.f116544d = m140061c();
        m140062d();
        this.f116541a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m140060b() {
        this.f116541a.getContentResolver().unregisterContentObserver(this);
    }

    /* JADX INFO: renamed from: c */
    public final float m140061c() {
        AudioManager audioManager = this.f116542b;
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
    public final void m140062d() {
        this.f116545e.m213255e(this.f116544d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fM140061c = m140061c();
        if (fM140061c != this.f116544d) {
            this.f116544d = fM140061c;
            m140062d();
        }
    }
}
