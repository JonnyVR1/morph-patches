package p153l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class tnd implements bam.InterfaceC15959e {

    /* JADX INFO: renamed from: a */
    public bam.InterfaceC15959e f175242a;

    /* JADX INFO: renamed from: b */
    public long f175243b = 0;

    /* JADX INFO: renamed from: c */
    public String f175244c;

    /* JADX INFO: renamed from: d */
    public int f175245d;

    @Override // p153l.bam.InterfaceC15959e
    /* JADX INFO: renamed from: a */
    public void mo103217a(String str, int i) {
        bam.InterfaceC15959e interfaceC15959e = this.f175242a;
        if (interfaceC15959e != null) {
            interfaceC15959e.mo103217a(str, i);
        }
        this.f175245d = i;
        this.f175244c = str;
        this.f175243b = System.currentTimeMillis();
    }

    @Override // p153l.bam.InterfaceC15959e
    /* JADX INFO: renamed from: b */
    public void mo103218b(int i) {
        bam.InterfaceC15959e interfaceC15959e = this.f175242a;
        if (interfaceC15959e != null) {
            interfaceC15959e.mo103218b(i);
        }
    }

    @Override // p153l.bam.InterfaceC15959e
    /* JADX INFO: renamed from: c */
    public void mo103219c(Throwable th, String str) {
        bam.InterfaceC15959e interfaceC15959e = this.f175242a;
        if (interfaceC15959e != null) {
            interfaceC15959e.mo103219c(th, str);
        }
        if (th != null) {
            CrashHelper.m82479c(th);
        }
        if (this.f175245d == 0) {
            kc5.m149100e(this.f175244c, false);
        }
    }

    @Override // p153l.bam.InterfaceC15959e
    public void onSuccess(String str) {
        bam.InterfaceC15959e interfaceC15959e = this.f175242a;
        if (interfaceC15959e != null) {
            interfaceC15959e.onSuccess(str);
        }
        if (this.f175245d == 0) {
            kc5.m149100e(this.f175244c, true);
        }
    }
}
