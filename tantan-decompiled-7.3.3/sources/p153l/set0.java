package p153l;

import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class set0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f167644a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f167645b = new AtomicInteger(0);

    /* JADX INFO: renamed from: O */
    public static int m185572O() {
        return f167644a.get();
    }

    /* JADX INFO: renamed from: Q */
    public static int m185573Q() {
        return f167645b.get();
    }

    /* JADX INFO: renamed from: u */
    public static AtomicInteger m185574u() {
        return f167644a;
    }

    /* JADX INFO: renamed from: v */
    public static AtomicInteger m185575v() {
        return f167645b;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo125726A(int i);

    /* JADX INFO: renamed from: B */
    public abstract void mo125727B(int i);

    /* JADX INFO: renamed from: C */
    public abstract void mo125728C(ret0 ret0Var);

    /* JADX INFO: renamed from: D */
    public abstract void mo125729D(int i);

    /* JADX INFO: renamed from: E */
    public abstract void mo125730E(int i);

    /* JADX INFO: renamed from: F */
    public abstract void mo125731F(boolean z);

    /* JADX INFO: renamed from: G */
    public abstract void mo125732G(@Nullable Integer num);

    /* JADX INFO: renamed from: H */
    public abstract void mo125733H(boolean z);

    /* JADX INFO: renamed from: I */
    public abstract void mo125734I(int i);

    /* JADX INFO: renamed from: J */
    public abstract void mo125735J(Surface surface, boolean z) throws IOException;

    /* JADX INFO: renamed from: K */
    public abstract void mo125736K(float f, boolean z) throws IOException;

    /* JADX INFO: renamed from: L */
    public abstract void mo125737L();

    /* JADX INFO: renamed from: M */
    public abstract boolean mo125738M();

    /* JADX INFO: renamed from: N */
    public abstract int mo125739N();

    /* JADX INFO: renamed from: P */
    public abstract int mo125740P();

    /* JADX INFO: renamed from: R */
    public abstract long mo125741R();

    /* JADX INFO: renamed from: S */
    public abstract long mo125742S();

    /* JADX INFO: renamed from: T */
    public abstract long mo125743T();

    /* JADX INFO: renamed from: U */
    public abstract long mo125744U();

    /* JADX INFO: renamed from: V */
    public abstract long mo125745V();

    /* JADX INFO: renamed from: r */
    public abstract long mo125753r();

    /* JADX INFO: renamed from: s */
    public abstract long mo125754s();

    @Nullable
    /* JADX INFO: renamed from: t */
    public abstract Integer mo125755t();

    /* JADX INFO: renamed from: w */
    public abstract void mo125756w(Uri[] uriArr, String str);

    /* JADX INFO: renamed from: x */
    public abstract void mo125757x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    /* JADX INFO: renamed from: y */
    public abstract void mo125758y();

    /* JADX INFO: renamed from: z */
    public abstract void mo125759z(long j);
}
