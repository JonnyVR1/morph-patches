package p153l;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public interface azk extends su80 {
    @Override // p153l.su80
    /* JADX INFO: renamed from: a */
    azk mo16403a(int i);

    @Override // p153l.su80
    /* JADX INFO: renamed from: b */
    azk mo16404b(long j);

    @Override // p153l.su80
    /* JADX INFO: renamed from: c */
    azk mo101072c(CharSequence charSequence);

    @Override // p153l.su80
    /* JADX INFO: renamed from: d */
    azk mo16405d(CharSequence charSequence, Charset charset);

    /* JADX INFO: renamed from: e */
    HashCode mo16384e();

    /* JADX INFO: renamed from: g */
    <T> azk mo101073g(T t, Funnel<? super T> funnel);

    /* JADX INFO: renamed from: h */
    azk mo16406h(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: i */
    azk mo16407i(ByteBuffer byteBuffer);
}
