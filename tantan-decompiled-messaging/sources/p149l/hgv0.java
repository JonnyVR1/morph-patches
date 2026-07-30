package p149l;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class hgv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f107664a;

    /* JADX INFO: renamed from: b */
    public final Context f107665b;

    public hgv0(rmw0 rmw0Var, Context context) {
        this.f107664a = rmw0Var;
        this.f107665b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ igv0 m130926a() throws Exception {
        int iMo176736i;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.f107665b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132437va)).booleanValue()) {
            iMo176736i = vny0.m199081s().mo176736i(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iMo176736i = -1;
            streamMaxVolume = -1;
        }
        return new igv0(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iMo176736i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), vny0.m199082t().m124395a(), vny0.m199082t().m124398e());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 13;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f107664a.mo122102R(new Callable() { // from class: l.ggv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f102565a.m130926a();
            }
        });
    }
}
