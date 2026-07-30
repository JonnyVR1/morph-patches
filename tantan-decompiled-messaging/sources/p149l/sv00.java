package p149l;

import android.os.Looper;
import android.os.Message;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class sv00 extends hu00 {

    /* JADX INFO: renamed from: k */
    private final String f166514k;

    public sv00(Looper looper) {
        super(looper);
        this.f166514k = "Pipeline_Normal_pip->PIPLINE";
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if ((i & 3840) <= 0) {
            int i2 = i & 255;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (!this.f109460b.isEmpty()) {
                        synchronized (this.f109460b) {
                            try {
                                Iterator<hu00.InterfaceC17394c> it = this.f109460b.iterator();
                                while (it.hasNext()) {
                                    it.next().mo99216a(message.what, message.arg1, message.obj);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } else if (!this.f109461c.isEmpty()) {
                    synchronized (this.f109461c) {
                        try {
                            int i3 = 0;
                            for (hu00.InterfaceC17395d interfaceC17395d : this.f109461c) {
                                if (interfaceC17395d instanceof dxl) {
                                    n8c.m158483a("jzheng", " STOP onRecordStateListener[" + i3 + "] " + interfaceC17395d + " / " + message.obj);
                                    interfaceC17395d.mo19741j0(message.obj);
                                    i3++;
                                }
                            }
                            for (hu00.InterfaceC17395d interfaceC17395d2 : this.f109461c) {
                                if (!(interfaceC17395d2 instanceof dxl)) {
                                    n8c.m158483a("jzheng", " STOP onRecordStateListener[" + i3 + "] " + interfaceC17395d2 + " / " + message.obj);
                                    interfaceC17395d2.mo19741j0(message.obj);
                                    i3++;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else if (!this.f109461c.isEmpty()) {
                synchronized (this.f109461c) {
                    try {
                        int i4 = 0;
                        for (hu00.InterfaceC17395d interfaceC17395d3 : this.f109461c) {
                            n8c.m158483a("jzheng", " START onRecordStateListener[" + i4 + "] " + interfaceC17395d3 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + message.obj);
                            interfaceC17395d3.mo19733d0(message.obj);
                            i4++;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else if (!this.f109459a.isEmpty()) {
            synchronized (this.f109459a) {
                try {
                    for (hu00.InterfaceC17393b interfaceC17393b : this.f109459a) {
                        boolean zM128023b = gu00.m128023b(message.what);
                        int i5 = message.what;
                        if (zM128023b) {
                            interfaceC17393b.mo19749q0(i5, message.arg1, message.obj);
                        } else if (gu00.m128022a(i5)) {
                            interfaceC17393b.mo19750w0(message.what, message.arg1, message.obj);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        if (!this.f109463e.isEmpty()) {
            synchronized (this.f109463e) {
                try {
                    Iterator<hu00.InterfaceC17394c> it2 = this.f109463e.iterator();
                    while (it2.hasNext()) {
                        this.f109460b.remove(it2.next());
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            this.f109463e.clear();
        }
        if (!this.f109462d.isEmpty()) {
            synchronized (this.f109462d) {
                try {
                    Iterator<hu00.InterfaceC17393b> it3 = this.f109462d.iterator();
                    while (it3.hasNext()) {
                        this.f109459a.remove(it3.next());
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.f109462d.clear();
        }
        if (!this.f109464f.isEmpty()) {
            synchronized (this.f109464f) {
                try {
                    Iterator<hu00.InterfaceC17395d> it4 = this.f109464f.iterator();
                    while (it4.hasNext()) {
                        this.f109461c.remove(it4.next());
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            this.f109464f.clear();
        }
        if (this.f109466h) {
            this.f109463e.clear();
            this.f109460b.clear();
            this.f109466h = false;
        }
        if (this.f109467i) {
            this.f109461c.clear();
            this.f109464f.clear();
        }
        if (this.f109465g) {
            this.f109462d.clear();
            this.f109459a.clear();
        }
    }
}
