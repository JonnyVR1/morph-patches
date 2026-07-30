package p153l;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface drx {

    /* JADX INFO: renamed from: a */
    public static final drx f90441a = new C16613a();

    /* JADX INFO: renamed from: l.drx$a */
    public class C16613a implements drx {
        @Override // p153l.drx
        /* JADX INFO: renamed from: a */
        public long mo11144a() {
            throw new NoSuchElementException();
        }

        @Override // p153l.drx
        /* JADX INFO: renamed from: b */
        public long mo11145b() {
            throw new NoSuchElementException();
        }

        @Override // p153l.drx
        public boolean next() {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo11144a();

    /* JADX INFO: renamed from: b */
    long mo11145b();

    boolean next();
}
