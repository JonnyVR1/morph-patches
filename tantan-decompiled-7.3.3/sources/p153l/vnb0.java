package p153l;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public interface vnb0 {

    /* JADX INFO: renamed from: a */
    public static final vnb0 f184848a = new C20865a();

    /* JADX INFO: renamed from: a */
    boolean mo201967a(int i, List<xzk> list);

    /* JADX INFO: renamed from: b */
    boolean mo201968b(int i, List<xzk> list, boolean z);

    /* JADX INFO: renamed from: c */
    boolean mo201969c(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo201970d(int i, ErrorCode errorCode);

    /* JADX INFO: renamed from: l.vnb0$a */
    public static class C20865a implements vnb0 {
        @Override // p153l.vnb0
        /* JADX INFO: renamed from: a */
        public boolean mo201967a(int i, List<xzk> list) {
            return true;
        }

        @Override // p153l.vnb0
        /* JADX INFO: renamed from: b */
        public boolean mo201968b(int i, List<xzk> list, boolean z) {
            return true;
        }

        @Override // p153l.vnb0
        /* JADX INFO: renamed from: c */
        public boolean mo201969c(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip(i2);
            return true;
        }

        @Override // p153l.vnb0
        /* JADX INFO: renamed from: d */
        public void mo201970d(int i, ErrorCode errorCode) {
        }
    }
}
