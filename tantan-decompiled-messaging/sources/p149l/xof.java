package p149l;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m87232d2 = {"Ll/xof;", "Ljava/io/ByteArrayOutputStream;", "", "size", "<init>", "(I)V", "", "k", "()[B", "buffer", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xof extends ByteArrayOutputStream {
    public xof(int i) {
        super(i);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final byte[] m210417k() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        bArr.getClass();
        return bArr;
    }
}
