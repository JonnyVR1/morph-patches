package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class p8f implements g5g0 {

    /* JADX INFO: renamed from: a */
    public final zwb f147589a = new zwb();

    /* JADX INFO: renamed from: b */
    public final j5g0 f147590b = new j5g0();

    /* JADX INFO: renamed from: c */
    public final Deque<k5g0> f147591c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public int f147592d;

    /* JADX INFO: renamed from: e */
    public boolean f147593e;

    /* JADX INFO: renamed from: l.p8f$a */
    public class C19154a extends k5g0 {
        public C19154a() {
        }

        @Override // p149l.fhd
        /* JADX INFO: renamed from: u */
        public void mo121353u() {
            p8f.this.m167797i(this);
        }
    }

    /* JADX INFO: renamed from: l.p8f$b */
    public static final class C19155b implements e5g0 {

        /* JADX INFO: renamed from: a */
        public final long f147595a;

        /* JADX INFO: renamed from: b */
        public final ImmutableList<ywb> f147596b;

        public C19155b(long j, ImmutableList<ywb> immutableList) {
            this.f147595a = j;
            this.f147596b = immutableList;
        }

        @Override // p149l.e5g0
        /* JADX INFO: renamed from: a */
        public long mo114791a(int i) {
            p11.m167007a(i == 0);
            return this.f147595a;
        }

        @Override // p149l.e5g0
        /* JADX INFO: renamed from: b */
        public int mo114792b() {
            return 1;
        }

        @Override // p149l.e5g0
        /* JADX INFO: renamed from: f */
        public int mo114793f(long j) {
            return this.f147595a > j ? 0 : -1;
        }

        @Override // p149l.e5g0
        /* JADX INFO: renamed from: g */
        public List<ywb> mo114794g(long j) {
            return j >= this.f147595a ? this.f147596b : ImmutableList.m15685of();
        }
    }

    public p8f() {
        for (int i = 0; i < 2; i++) {
            this.f147591c.addFirst(new C19154a());
        }
        this.f147592d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m167797i(k5g0 k5g0Var) {
        p11.m167013g(this.f147591c.size() < 2);
        p11.m167007a(!this.f147591c.contains(k5g0Var));
        k5g0Var.mo9803i();
        this.f147591c.addFirst(k5g0Var);
    }

    @Override // p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j5g0 mo101811a() throws SubtitleDecoderException {
        p11.m167013g(!this.f147593e);
        if (this.f147592d != 0) {
            return null;
        }
        this.f147592d = 1;
        return this.f147590b;
    }

    @Override // p149l.bhd
    public void flush() {
        p11.m167013g(!this.f147593e);
        this.f147590b.mo9803i();
        this.f147592d = 0;
    }

    @Override // p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k5g0 mo101812c() throws SubtitleDecoderException {
        p11.m167013g(!this.f147593e);
        if (this.f147592d != 2 || this.f147591c.isEmpty()) {
            return null;
        }
        k5g0 k5g0VarRemoveFirst = this.f147591c.removeFirst();
        if (this.f147590b.m154495p()) {
            k5g0VarRemoveFirst.m154490h(4);
        } else {
            j5g0 j5g0Var = this.f147590b;
            k5g0VarRemoveFirst.m144539v(this.f147590b.f7377e, new C19155b(j5g0Var.f7377e, this.f147589a.m220581a(((ByteBuffer) p11.m167011e(j5g0Var.f7375c)).array())), 0L);
        }
        this.f147590b.mo9803i();
        this.f147592d = 0;
        return k5g0VarRemoveFirst;
    }

    @Override // p149l.bhd
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo101813d(j5g0 j5g0Var) throws SubtitleDecoderException {
        p11.m167013g(!this.f147593e);
        p11.m167013g(this.f147592d == 1);
        p11.m167007a(this.f147590b == j5g0Var);
        this.f147592d = 2;
    }

    @Override // p149l.bhd
    public void release() {
        this.f147593e = true;
    }

    @Override // p149l.g5g0
    /* JADX INFO: renamed from: b */
    public void mo124526b(long j) {
    }
}
