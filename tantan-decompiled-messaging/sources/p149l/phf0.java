package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class phf0 extends pgf0<j5g0, k5g0, SubtitleDecoderException> implements g5g0 {

    /* JADX INFO: renamed from: n */
    public final String f148927n;

    /* JADX INFO: renamed from: l.phf0$a */
    public class C19214a extends k5g0 {
        public C19214a() {
        }

        @Override // p149l.fhd
        /* JADX INFO: renamed from: u */
        public void mo121353u() {
            phf0.this.m168710r(this);
        }
    }

    public phf0(String str) {
        super(new j5g0[2], new k5g0[2]);
        this.f148927n = str;
        m168713u(1024);
    }

    /* JADX INFO: renamed from: A */
    public abstract e5g0 mo97681A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    @Override // p149l.pgf0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final j5g0 mo168699g() {
        return new j5g0();
    }

    @Override // p149l.pgf0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final k5g0 mo168700h() {
        return new C19214a();
    }

    @Override // p149l.pgf0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException mo168701i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // p149l.pgf0
    @Nullable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException mo168702j(j5g0 j5g0Var, k5g0 k5g0Var, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) p11.m167011e(j5g0Var.f7375c);
            k5g0Var.m144539v(j5g0Var.f7377e, mo97681A(byteBuffer.array(), byteBuffer.limit(), z), j5g0Var.f116317i);
            k5g0Var.m154491j(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // p149l.g5g0
    /* JADX INFO: renamed from: b */
    public void mo124526b(long j) {
    }
}
