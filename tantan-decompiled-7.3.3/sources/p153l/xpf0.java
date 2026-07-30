package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class xpf0 extends wof0<rdg0, sdg0, SubtitleDecoderException> implements odg0 {

    /* JADX INFO: renamed from: n */
    public final String f195707n;

    /* JADX INFO: renamed from: l.xpf0$a */
    public class C21406a extends sdg0 {
        public C21406a() {
        }

        @Override // p153l.lid
        /* JADX INFO: renamed from: u */
        public void mo150584u() {
            xpf0.this.m207295r(this);
        }
    }

    public xpf0(String str) {
        super(new rdg0[2], new sdg0[2]);
        this.f195707n = str;
        m207298u(1024);
    }

    /* JADX INFO: renamed from: A */
    public abstract mdg0 mo122811A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    @Override // p153l.wof0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final rdg0 mo207284g() {
        return new rdg0();
    }

    @Override // p153l.wof0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final sdg0 mo207285h() {
        return new C21406a();
    }

    @Override // p153l.wof0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException mo207286i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // p153l.wof0
    @Nullable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException mo207287j(rdg0 rdg0Var, sdg0 sdg0Var, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) w11.m204369e(rdg0Var.f7412c);
            sdg0Var.m185463v(rdg0Var.f7414e, mo122811A(byteBuffer.array(), byteBuffer.limit(), z), rdg0Var.f162308i);
            sdg0Var.m97775j(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // p153l.odg0
    /* JADX INFO: renamed from: b */
    public void mo131055b(long j) {
    }
}
