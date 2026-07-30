package p149l;

import com.google.common.hash.Funnel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.m7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18410m7 implements kwk {
    @Override // p149l.om80
    /* JADX INFO: renamed from: c */
    public kwk mo147548c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            mo16353j(charSequence.charAt(i));
        }
        return this;
    }

    @Override // p149l.om80
    /* JADX INFO: renamed from: d */
    public kwk mo16350d(CharSequence charSequence, Charset charset) {
        return mo153319e(charSequence.toString().getBytes(charset));
    }

    @Override // p149l.kwk
    /* JADX INFO: renamed from: f */
    public <T> kwk mo147549f(T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }

    @Override // p149l.kwk
    /* JADX INFO: renamed from: g */
    public abstract kwk mo16351g(byte[] bArr, int i, int i2);

    @Override // p149l.om80
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public kwk mo153319e(byte[] bArr) {
        return mo16351g(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public abstract kwk mo16353j(char c);
}
