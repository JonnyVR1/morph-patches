package p149l;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class rjx extends qjx {

    /* JADX INFO: renamed from: m */
    private hu00.InterfaceC17392a f159754m;

    public rjx(@NonNull hu00.InterfaceC17392a interfaceC17392a) {
        this.f159754m = interfaceC17392a;
    }

    @Override // p149l.qjx
    @TargetApi(18)
    /* JADX INFO: renamed from: g */
    public int mo175045g(yt10 yt10Var) {
        synchronized (this.f155011i) {
            try {
                if (this.f155008f == null) {
                    this.f155008f = yt10Var;
                    yt10Var.mo19754H1(this.f155012j);
                }
                if (this.f155010h != null && this.f155007e == null) {
                    this.f155007e = new cjx(this.f155008f);
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "init mAudioCodec" + this.f155007e);
                    if (!this.f155007e.m107288e(this.f155010h)) {
                        this.f155006d = null;
                        hu00.InterfaceC17392a interfaceC17392a = this.f159754m;
                        if (interfaceC17392a != null) {
                            interfaceC17392a.mo128349g(20736, 1, 0, null);
                        }
                        return 5;
                    }
                    this.f155007e.m107293k();
                }
                if (this.f155009g != null && this.f155006d == null) {
                    this.f155006d = new cjx(this.f155008f);
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "init mVideoCodec" + this.f155006d);
                    if (!this.f155006d.m107288e(this.f155009g)) {
                        hu00.InterfaceC17392a interfaceC17392a2 = this.f159754m;
                        if (interfaceC17392a2 != null) {
                            interfaceC17392a2.mo128349g(20736, 2, 0, null);
                        }
                        this.f155006d = null;
                        return 4;
                    }
                    if (this.f155009g.getInteger("color-format") == 19) {
                        this.f155006d.m107293k();
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
