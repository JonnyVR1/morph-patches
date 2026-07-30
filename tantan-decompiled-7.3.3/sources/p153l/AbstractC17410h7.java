package p153l;

import com.google.common.hash.Funnel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.h7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17410h7 implements azk {
    @Override // p153l.su80
    /* JADX INFO: renamed from: c */
    public azk mo101072c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            mo16408k(charSequence.charAt(i));
        }
        return this;
    }

    @Override // p153l.su80
    /* JADX INFO: renamed from: d */
    public azk mo16405d(CharSequence charSequence, Charset charset) {
        return mo133755f(charSequence.toString().getBytes(charset));
    }

    @Override // p153l.azk
    /* JADX INFO: renamed from: g */
    public <T> azk mo101073g(T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }

    @Override // p153l.azk
    /* JADX INFO: renamed from: h */
    public abstract azk mo16406h(byte[] bArr, int i, int i2);

    @Override // p153l.su80
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public azk mo133755f(byte[] bArr) {
        return mo16406h(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k */
    public abstract azk mo16408k(char c);
}
