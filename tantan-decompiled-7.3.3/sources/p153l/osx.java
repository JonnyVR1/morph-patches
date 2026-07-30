package p153l;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class osx extends nsx {

    /* JADX INFO: renamed from: m */
    private q210.InterfaceC19500a f148910m;

    public osx(@NonNull q210.InterfaceC19500a interfaceC19500a) {
        this.f148910m = interfaceC19500a;
    }

    @Override // p153l.nsx
    @TargetApi(18)
    /* JADX INFO: renamed from: g */
    public int mo164654g(g220 g220Var) {
        synchronized (this.f143558i) {
            try {
                if (this.f143555f == null) {
                    this.f143555f = g220Var;
                    g220Var.mo20753H1(this.f143559j);
                }
                if (this.f143557h != null && this.f143554e == null) {
                    this.f143554e = new zrx(this.f143555f);
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "init mAudioCodec" + this.f143554e);
                    if (!this.f143554e.m221233e(this.f143557h)) {
                        this.f143553d = null;
                        q210.InterfaceC19500a interfaceC19500a = this.f148910m;
                        if (interfaceC19500a != null) {
                            interfaceC19500a.mo165950g(20736, 1, 0, null);
                        }
                        return 5;
                    }
                    this.f143554e.m221238k();
                }
                if (this.f143556g != null && this.f143553d == null) {
                    this.f143553d = new zrx(this.f143555f);
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "init mVideoCodec" + this.f143553d);
                    if (!this.f143553d.m221233e(this.f143556g)) {
                        q210.InterfaceC19500a interfaceC19500a2 = this.f148910m;
                        if (interfaceC19500a2 != null) {
                            interfaceC19500a2.mo165950g(20736, 2, 0, null);
                        }
                        this.f143553d = null;
                        return 4;
                    }
                    if (this.f143556g.getInteger("color-format") == 19) {
                        this.f143553d.m221238k();
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
