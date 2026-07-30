package p153l;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes.dex */
public abstract class d4e {

    /* JADX INFO: renamed from: a */
    public static final d4e f85033a = new C16444a();

    /* JADX INFO: renamed from: b */
    public static final d4e f85034b = new C16445b();

    /* JADX INFO: renamed from: c */
    public static final d4e f85035c = new C16446c();

    /* JADX INFO: renamed from: d */
    public static final d4e f85036d = new C16447d();

    /* JADX INFO: renamed from: e */
    public static final d4e f85037e = new C16448e();

    /* JADX INFO: renamed from: l.d4e$a */
    public class C16444a extends d4e {
        @Override // p153l.d4e
        /* JADX INFO: renamed from: a */
        public boolean mo114180a() {
            return true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: b */
        public boolean mo114181b() {
            return true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: c */
        public boolean mo114182c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: d */
        public boolean mo114183d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.d4e$b */
    public class C16445b extends d4e {
        @Override // p153l.d4e
        /* JADX INFO: renamed from: a */
        public boolean mo114180a() {
            return false;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: b */
        public boolean mo114181b() {
            return false;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: c */
        public boolean mo114182c(DataSource dataSource) {
            return false;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: d */
        public boolean mo114183d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.d4e$c */
    public class C16446c extends d4e {
        @Override // p153l.d4e
        /* JADX INFO: renamed from: a */
        public boolean mo114180a() {
            return true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: b */
        public boolean mo114181b() {
            return false;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: c */
        public boolean mo114182c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: d */
        public boolean mo114183d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.d4e$d */
    public class C16447d extends d4e {
        @Override // p153l.d4e
        /* JADX INFO: renamed from: a */
        public boolean mo114180a() {
            return false;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: b */
        public boolean mo114181b() {
            return true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: c */
        public boolean mo114182c(DataSource dataSource) {
            return false;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: d */
        public boolean mo114183d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.d4e$e */
    public class C16448e extends d4e {
        @Override // p153l.d4e
        /* JADX INFO: renamed from: a */
        public boolean mo114180a() {
            return true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: b */
        public boolean mo114181b() {
            return true;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: c */
        public boolean mo114182c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p153l.d4e
        /* JADX INFO: renamed from: d */
        public boolean mo114183d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo114180a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo114181b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo114182c(DataSource dataSource);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo114183d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
