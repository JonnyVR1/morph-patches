package p149l;

import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class da1 {

    /* JADX INFO: renamed from: a */
    private u460 f85170a;

    /* JADX INFO: renamed from: b */
    private List<ub1> f85171b;

    /* JADX INFO: renamed from: c */
    private Object f85172c = new Object();

    /* JADX INFO: renamed from: d */
    private ub1 f85173d;

    /* JADX INFO: renamed from: e */
    private InterfaceC16320a f85174e;

    /* JADX INFO: renamed from: l.da1$a */
    public interface InterfaceC16320a {
        /* JADX INFO: renamed from: a */
        void mo110529a(ByteBuffer byteBuffer, int i, long j);
    }

    /* JADX INFO: renamed from: a */
    public void m110524a(ub1 ub1Var) {
        synchronized (this.f85172c) {
            try {
                if (this.f85171b == null) {
                    this.f85171b = new ArrayList();
                }
                if (ub1Var != null) {
                    this.f85171b.add(ub1Var);
                }
                this.f85173d = ub1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m110525b() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "AudioController clearAllProcessor !!!");
        synchronized (this.f85172c) {
            this.f85171b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m110526c(ByteBuffer byteBuffer, int i, long j) {
        if (i > 0) {
            if (this.f85170a == null) {
                this.f85170a = new u460(byteBuffer);
            }
            this.f85170a.m191676e(byteBuffer);
            this.f85170a.m191675d(i, 0, 0, j, 0);
            u460 u460VarMo130258b = this.f85170a;
            List<ub1> list = this.f85171b;
            if (list != null) {
                Iterator<ub1> it = list.iterator();
                while (it.hasNext()) {
                    u460VarMo130258b = it.next().mo130258b(u460VarMo130258b, u460VarMo130258b.m191673b().size, u460VarMo130258b.m191673b().presentationTimeUs);
                    if (u460VarMo130258b == null) {
                        return;
                    }
                }
            }
            InterfaceC16320a interfaceC16320a = this.f85174e;
            if (interfaceC16320a != null) {
                interfaceC16320a.mo110529a(u460VarMo130258b.m191672a(), u460VarMo130258b.m191673b().size, u460VarMo130258b.m191673b().presentationTimeUs);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m110527d(InterfaceC16320a interfaceC16320a) {
        this.f85174e = interfaceC16320a;
    }

    /* JADX INFO: renamed from: e */
    public void m110528e(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("sample-rate") && mediaFormat.containsKey("channel-count")) {
            int integer = mediaFormat.getInteger("sample-rate");
            int integer2 = mediaFormat.getInteger("channel-count");
            int integer3 = mediaFormat.containsKey("bit-width") ? mediaFormat.getInteger("bit-width") : 16;
            synchronized (this.f85172c) {
                try {
                    ub1 ub1Var = this.f85173d;
                    if (ub1Var != null) {
                        ub1Var.mo192814d(integer, integer3, integer2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
