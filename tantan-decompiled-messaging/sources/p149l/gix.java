package p149l;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface gix {

    /* JADX INFO: renamed from: a */
    public static final gix f102980a = new C17086a();

    /* JADX INFO: renamed from: l.gix$a */
    public class C17086a implements gix {
        @Override // p149l.gix
        /* JADX INFO: renamed from: a */
        public long mo11090a() {
            throw new NoSuchElementException();
        }

        @Override // p149l.gix
        /* JADX INFO: renamed from: b */
        public long mo11091b() {
            throw new NoSuchElementException();
        }

        @Override // p149l.gix
        public boolean next() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo11090a();

    /* JADX INFO: renamed from: b */
    long mo11091b();

    boolean next();
}
