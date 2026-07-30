package p153l;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class npv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f143136a;

    /* JADX INFO: renamed from: b */
    public final Context f143137b;

    public npv0(xvw0 xvw0Var, Context context) {
        this.f143136a = xvw0Var;
        this.f143137b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ opv0 m164249a() throws Exception {
        int iMo109057i;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.f143137b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168508va)).booleanValue()) {
            iMo109057i = bxy0.m106935s().mo109057i(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iMo109057i = -1;
            streamMaxVolume = -1;
        }
        return new opv0(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iMo109057i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), bxy0.m106936t().m157990a(), bxy0.m106936t().m157993e());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 13;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f143136a.mo155969R(new Callable() { // from class: l.mpv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f137956a.m164249a();
            }
        });
    }
}
