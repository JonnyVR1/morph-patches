package p153l;

import android.os.Looper;
import android.os.Message;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class a410 extends q210 {

    /* JADX INFO: renamed from: k */
    private final String f68346k;

    public a410(Looper looper) {
        super(looper);
        this.f68346k = "Pipeline_Normal_pip->PIPLINE";
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if ((i & 3840) <= 0) {
            int i2 = i & 255;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (!this.f155258b.isEmpty()) {
                        synchronized (this.f155258b) {
                            try {
                                Iterator<q210.InterfaceC19502c> it = this.f155258b.iterator();
                                while (it.hasNext()) {
                                    it.next().mo133538a(message.what, message.arg1, message.obj);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } else if (!this.f155259c.isEmpty()) {
                    synchronized (this.f155259c) {
                        try {
                            int i3 = 0;
                            for (q210.InterfaceC19503d interfaceC19503d : this.f155259c) {
                                if (interfaceC19503d instanceof wzl) {
                                    t9c.m189743a("jzheng", " STOP onRecordStateListener[" + i3 + "] " + interfaceC19503d + " / " + message.obj);
                                    interfaceC19503d.mo20740j0(message.obj);
                                    i3++;
                                }
                            }
                            for (q210.InterfaceC19503d interfaceC19503d2 : this.f155259c) {
                                if (!(interfaceC19503d2 instanceof wzl)) {
                                    t9c.m189743a("jzheng", " STOP onRecordStateListener[" + i3 + "] " + interfaceC19503d2 + " / " + message.obj);
                                    interfaceC19503d2.mo20740j0(message.obj);
                                    i3++;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else if (!this.f155259c.isEmpty()) {
                synchronized (this.f155259c) {
                    try {
                        int i4 = 0;
                        for (q210.InterfaceC19503d interfaceC19503d3 : this.f155259c) {
                            t9c.m189743a("jzheng", " START onRecordStateListener[" + i4 + "] " + interfaceC19503d3 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + message.obj);
                            interfaceC19503d3.mo20732d0(message.obj);
                            i4++;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else if (!this.f155257a.isEmpty()) {
            synchronized (this.f155257a) {
                try {
                    for (q210.InterfaceC19501b interfaceC19501b : this.f155257a) {
                        boolean zM170321b = p210.m170321b(message.what);
                        int i5 = message.what;
                        if (zM170321b) {
                            interfaceC19501b.mo20748q0(i5, message.arg1, message.obj);
                        } else if (p210.m170320a(i5)) {
                            interfaceC19501b.mo20749w0(message.what, message.arg1, message.obj);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        if (!this.f155261e.isEmpty()) {
            synchronized (this.f155261e) {
                try {
                    Iterator<q210.InterfaceC19502c> it2 = this.f155261e.iterator();
                    while (it2.hasNext()) {
                        this.f155258b.remove(it2.next());
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            this.f155261e.clear();
        }
        if (!this.f155260d.isEmpty()) {
            synchronized (this.f155260d) {
                try {
                    Iterator<q210.InterfaceC19501b> it3 = this.f155260d.iterator();
                    while (it3.hasNext()) {
                        this.f155257a.remove(it3.next());
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.f155260d.clear();
        }
        if (!this.f155262f.isEmpty()) {
            synchronized (this.f155262f) {
                try {
                    Iterator<q210.InterfaceC19503d> it4 = this.f155262f.iterator();
                    while (it4.hasNext()) {
                        this.f155259c.remove(it4.next());
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            this.f155262f.clear();
        }
        if (this.f155264h) {
            this.f155261e.clear();
            this.f155258b.clear();
            this.f155264h = false;
        }
        if (this.f155265i) {
            this.f155259c.clear();
            this.f155262f.clear();
        }
        if (this.f155263g) {
            this.f155260d.clear();
            this.f155257a.clear();
        }
    }
}
