package p149l;

import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class i500 extends ytj0 {
    public static final int UPLOAD_FAIL = 102;
    public static final int UPLOAD_SUCCESS = 101;
    private static volatile i500 instance;
    private boolean isUploading = false;
    private C22392a<Integer> progress = C22392a.m221512b();

    private i500() {
    }

    /* JADX INFO: renamed from: d */
    public static i500 m134436d() {
        if (instance == null) {
            synchronized (i500.class) {
                try {
                    if (instance == null) {
                        instance = new i500();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // p149l.ytj0
    /* JADX INFO: renamed from: a */
    public void mo134437a(int i, int i2) {
        this.progress.onNext(Integer.valueOf(((i + 1) * 100) / i2));
    }

    @Override // p149l.ytj0
    /* JADX INFO: renamed from: b */
    public void mo134438b(Throwable th) {
        this.isUploading = false;
        this.progress.onNext(102);
        CrashHelper.m81296c(new Exception("upload log error:" + th.getMessage(), th));
    }

    @Override // p149l.ytj0
    /* JADX INFO: renamed from: c */
    public void mo134439c() {
        this.isUploading = false;
        this.progress.onNext(101);
        this.progress.onNext(0);
    }

    /* JADX INFO: renamed from: e */
    public void m134440e(List<Date> list, @Nullable String str) {
        if (list == null || list.size() < 1 || this.isUploading) {
            return;
        }
        au2.m98911D(list, str, 0L, this);
    }
}
