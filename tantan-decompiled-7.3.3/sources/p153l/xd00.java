package p153l;

import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class xd00 extends b3k0 {
    public static final int UPLOAD_FAIL = 102;
    public static final int UPLOAD_SUCCESS = 101;
    private static volatile xd00 instance;
    private boolean isUploading = false;
    private C22507a<Integer> progress = C22507a.m222758b();

    private xd00() {
    }

    /* JADX INFO: renamed from: d */
    public static xd00 m210440d() {
        if (instance == null) {
            synchronized (xd00.class) {
                try {
                    if (instance == null) {
                        instance = new xd00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // p153l.b3k0
    /* JADX INFO: renamed from: a */
    public void mo102341a(int i, int i2) {
        this.progress.onNext(Integer.valueOf(((i + 1) * 100) / i2));
    }

    @Override // p153l.b3k0
    /* JADX INFO: renamed from: b */
    public void mo102342b(Throwable th) {
        this.isUploading = false;
        this.progress.onNext(102);
        CrashHelper.m82479c(new Exception("upload log error:" + th.getMessage(), th));
    }

    @Override // p153l.b3k0
    /* JADX INFO: renamed from: c */
    public void mo102343c() {
        this.isUploading = false;
        this.progress.onNext(101);
        this.progress.onNext(0);
    }

    /* JADX INFO: renamed from: e */
    public void m210441e(List<Date> list, @Nullable String str) {
        if (list == null || list.size() < 1 || this.isUploading) {
            return;
        }
        qu2.m178104D(list, str, 0L, this);
    }
}
