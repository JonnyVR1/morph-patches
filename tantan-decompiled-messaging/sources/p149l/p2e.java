package p149l;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2e {

    /* JADX INFO: renamed from: a */
    public static final p2e f146845a = new C19112a();

    /* JADX INFO: renamed from: b */
    public static final p2e f146846b = new C19113b();

    /* JADX INFO: renamed from: c */
    public static final p2e f146847c = new C19114c();

    /* JADX INFO: renamed from: d */
    public static final p2e f146848d = new C19115d();

    /* JADX INFO: renamed from: e */
    public static final p2e f146849e = new C19116e();

    /* JADX INFO: renamed from: l.p2e$a */
    public class C19112a extends p2e {
        @Override // p149l.p2e
        /* JADX INFO: renamed from: a */
        public boolean mo167158a() {
            return true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: b */
        public boolean mo167159b() {
            return true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: c */
        public boolean mo167160c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: d */
        public boolean mo167161d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.p2e$b */
    public class C19113b extends p2e {
        @Override // p149l.p2e
        /* JADX INFO: renamed from: a */
        public boolean mo167158a() {
            return false;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: b */
        public boolean mo167159b() {
            return false;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: c */
        public boolean mo167160c(DataSource dataSource) {
            return false;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: d */
        public boolean mo167161d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.p2e$c */
    public class C19114c extends p2e {
        @Override // p149l.p2e
        /* JADX INFO: renamed from: a */
        public boolean mo167158a() {
            return true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: b */
        public boolean mo167159b() {
            return false;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: c */
        public boolean mo167160c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: d */
        public boolean mo167161d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.p2e$d */
    public class C19115d extends p2e {
        @Override // p149l.p2e
        /* JADX INFO: renamed from: a */
        public boolean mo167158a() {
            return false;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: b */
        public boolean mo167159b() {
            return true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: c */
        public boolean mo167160c(DataSource dataSource) {
            return false;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: d */
        public boolean mo167161d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.p2e$e */
    public class C19116e extends p2e {
        @Override // p149l.p2e
        /* JADX INFO: renamed from: a */
        public boolean mo167158a() {
            return true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: b */
        public boolean mo167159b() {
            return true;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: c */
        public boolean mo167160c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p149l.p2e
        /* JADX INFO: renamed from: d */
        public boolean mo167161d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo167158a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo167159b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo167160c(DataSource dataSource);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo167161d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
