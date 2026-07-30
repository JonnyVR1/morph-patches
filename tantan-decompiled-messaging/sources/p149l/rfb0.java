package p149l;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public interface rfb0 {

    /* JADX INFO: renamed from: a */
    public static final rfb0 f159135a = new C19691a();

    /* JADX INFO: renamed from: a */
    boolean mo179121a(int i, List<hxk> list);

    /* JADX INFO: renamed from: b */
    boolean mo179122b(int i, List<hxk> list, boolean z);

    /* JADX INFO: renamed from: c */
    boolean mo179123c(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo179124d(int i, ErrorCode errorCode);

    /* JADX INFO: renamed from: l.rfb0$a */
    public static class C19691a implements rfb0 {
        @Override // p149l.rfb0
        /* JADX INFO: renamed from: a */
        public boolean mo179121a(int i, List<hxk> list) {
            return true;
        }

        @Override // p149l.rfb0
        /* JADX INFO: renamed from: b */
        public boolean mo179122b(int i, List<hxk> list, boolean z) {
            return true;
        }

        @Override // p149l.rfb0
        /* JADX INFO: renamed from: c */
        public boolean mo179123c(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip(i2);
            return true;
        }

        @Override // p149l.rfb0
        /* JADX INFO: renamed from: d */
        public void mo179124d(int i, ErrorCode errorCode) {
        }
    }
}
