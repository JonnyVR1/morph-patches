package p149l;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public interface kwk extends om80 {
    @Override // p149l.om80
    /* JADX INFO: renamed from: a */
    kwk mo16348a(int i);

    @Override // p149l.om80
    /* JADX INFO: renamed from: b */
    kwk mo16349b(long j);

    @Override // p149l.om80
    /* JADX INFO: renamed from: c */
    kwk mo147548c(CharSequence charSequence);

    @Override // p149l.om80
    /* JADX INFO: renamed from: d */
    kwk mo16350d(CharSequence charSequence, Charset charset);

    /* JADX INFO: renamed from: f */
    <T> kwk mo147549f(T t, Funnel<? super T> funnel);

    /* JADX INFO: renamed from: g */
    kwk mo16351g(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: h */
    kwk mo16352h(ByteBuffer byteBuffer);

    HashCode hash();
}
