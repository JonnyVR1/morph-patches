package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v9f implements odg0 {

    /* JADX INFO: renamed from: a */
    public final nyb f182990a = new nyb();

    /* JADX INFO: renamed from: b */
    public final rdg0 f182991b = new rdg0();

    /* JADX INFO: renamed from: c */
    public final Deque<sdg0> f182992c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public int f182993d;

    /* JADX INFO: renamed from: e */
    public boolean f182994e;

    /* JADX INFO: renamed from: l.v9f$a */
    public class C20792a extends sdg0 {
        public C20792a() {
        }

        @Override // p153l.lid
        /* JADX INFO: renamed from: u */
        public void mo150584u() {
            v9f.this.m200440i(this);
        }
    }

    /* JADX INFO: renamed from: l.v9f$b */
    public static final class C20793b implements mdg0 {

        /* JADX INFO: renamed from: a */
        public final long f182996a;

        /* JADX INFO: renamed from: b */
        public final ImmutableList<myb> f182997b;

        public C20793b(long j, ImmutableList<myb> immutableList) {
            this.f182996a = j;
            this.f182997b = immutableList;
        }

        @Override // p153l.mdg0
        /* JADX INFO: renamed from: a */
        public long mo95502a(int i) {
            w11.m204365a(i == 0);
            return this.f182996a;
        }

        @Override // p153l.mdg0
        /* JADX INFO: renamed from: b */
        public int mo95503b() {
            return 1;
        }

        @Override // p153l.mdg0
        /* JADX INFO: renamed from: f */
        public int mo95504f(long j) {
            return this.f182996a > j ? 0 : -1;
        }

        @Override // p153l.mdg0
        /* JADX INFO: renamed from: g */
        public List<myb> mo95505g(long j) {
            return j >= this.f182996a ? this.f182997b : ImmutableList.m15739of();
        }
    }

    public v9f() {
        for (int i = 0; i < 2; i++) {
            this.f182992c.addFirst(new C20792a());
        }
        this.f182993d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m200440i(sdg0 sdg0Var) {
        w11.m204371g(this.f182992c.size() < 2);
        w11.m204365a(!this.f182992c.contains(sdg0Var));
        sdg0Var.mo9857i();
        this.f182992c.addFirst(sdg0Var);
    }

    @Override // p153l.hid
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rdg0 mo135120a() throws SubtitleDecoderException {
        w11.m204371g(!this.f182994e);
        if (this.f182993d != 0) {
            return null;
        }
        this.f182993d = 1;
        return this.f182991b;
    }

    @Override // p153l.hid
    public void flush() {
        w11.m204371g(!this.f182994e);
        this.f182991b.mo9857i();
        this.f182993d = 0;
    }

    @Override // p153l.hid
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public sdg0 mo131056c() throws SubtitleDecoderException {
        w11.m204371g(!this.f182994e);
        if (this.f182993d != 2 || this.f182992c.isEmpty()) {
            return null;
        }
        sdg0 sdg0VarRemoveFirst = this.f182992c.removeFirst();
        if (this.f182991b.m97779p()) {
            sdg0VarRemoveFirst.m97774h(4);
        } else {
            rdg0 rdg0Var = this.f182991b;
            sdg0VarRemoveFirst.m185463v(this.f182991b.f7414e, new C20793b(rdg0Var.f7414e, this.f182990a.m165317a(((ByteBuffer) w11.m204369e(rdg0Var.f7412c)).array())), 0L);
        }
        this.f182991b.mo9857i();
        this.f182993d = 0;
        return sdg0VarRemoveFirst;
    }

    @Override // p153l.hid
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo135121d(rdg0 rdg0Var) throws SubtitleDecoderException {
        w11.m204371g(!this.f182994e);
        w11.m204371g(this.f182993d == 1);
        w11.m204365a(this.f182991b == rdg0Var);
        this.f182993d = 2;
    }

    @Override // p153l.hid
    public void release() {
        this.f182994e = true;
    }

    @Override // p153l.odg0
    /* JADX INFO: renamed from: b */
    public void mo131055b(long j) {
    }
}
