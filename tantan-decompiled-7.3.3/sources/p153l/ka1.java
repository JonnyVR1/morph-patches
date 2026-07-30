package p153l;

import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ka1 {

    /* JADX INFO: renamed from: a */
    private ad60 f124608a;

    /* JADX INFO: renamed from: b */
    private List<bc1> f124609b;

    /* JADX INFO: renamed from: c */
    private Object f124610c = new Object();

    /* JADX INFO: renamed from: d */
    private bc1 f124611d;

    /* JADX INFO: renamed from: e */
    private InterfaceC18125a f124612e;

    /* JADX INFO: renamed from: l.ka1$a */
    public interface InterfaceC18125a {
        /* JADX INFO: renamed from: a */
        void mo148923a(ByteBuffer byteBuffer, int i, long j);
    }

    /* JADX INFO: renamed from: a */
    public void m148918a(bc1 bc1Var) {
        synchronized (this.f124610c) {
            try {
                if (this.f124609b == null) {
                    this.f124609b = new ArrayList();
                }
                if (bc1Var != null) {
                    this.f124609b.add(bc1Var);
                }
                this.f124611d = bc1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m148919b() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "AudioController clearAllProcessor !!!");
        synchronized (this.f124610c) {
            this.f124609b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m148920c(ByteBuffer byteBuffer, int i, long j) {
        if (i > 0) {
            if (this.f124608a == null) {
                this.f124608a = new ad60(byteBuffer);
            }
            this.f124608a.m97019e(byteBuffer);
            this.f124608a.m97018d(i, 0, 0, j, 0);
            ad60 ad60VarMo103472b = this.f124608a;
            List<bc1> list = this.f124609b;
            if (list != null) {
                Iterator<bc1> it = list.iterator();
                while (it.hasNext()) {
                    ad60VarMo103472b = it.next().mo103472b(ad60VarMo103472b, ad60VarMo103472b.m97016b().size, ad60VarMo103472b.m97016b().presentationTimeUs);
                    if (ad60VarMo103472b == null) {
                        return;
                    }
                }
            }
            InterfaceC18125a interfaceC18125a = this.f124612e;
            if (interfaceC18125a != null) {
                interfaceC18125a.mo148923a(ad60VarMo103472b.m97015a(), ad60VarMo103472b.m97016b().size, ad60VarMo103472b.m97016b().presentationTimeUs);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m148921d(InterfaceC18125a interfaceC18125a) {
        this.f124612e = interfaceC18125a;
    }

    /* JADX INFO: renamed from: e */
    public void m148922e(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("sample-rate") && mediaFormat.containsKey("channel-count")) {
            int integer = mediaFormat.getInteger("sample-rate");
            int integer2 = mediaFormat.getInteger("channel-count");
            int integer3 = mediaFormat.containsKey("bit-width") ? mediaFormat.getInteger("bit-width") : 16;
            synchronized (this.f124610c) {
                try {
                    bc1 bc1Var = this.f124611d;
                    if (bc1Var != null) {
                        bc1Var.mo103474d(integer, integer3, integer2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
