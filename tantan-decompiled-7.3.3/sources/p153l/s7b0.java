package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class s7b0 implements zrf {

    /* JADX INFO: renamed from: l */
    public static final esf f166659l = new esf() { // from class: l.r7b0
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return s7b0.m184998c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final h0j0 f166660a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<C20001a> f166661b;

    /* JADX INFO: renamed from: c */
    public final ig60 f166662c;

    /* JADX INFO: renamed from: d */
    public final q7b0 f166663d;

    /* JADX INFO: renamed from: e */
    public boolean f166664e;

    /* JADX INFO: renamed from: f */
    public boolean f166665f;

    /* JADX INFO: renamed from: g */
    public boolean f166666g;

    /* JADX INFO: renamed from: h */
    public long f166667h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public p7b0 f166668i;

    /* JADX INFO: renamed from: j */
    public bsf f166669j;

    /* JADX INFO: renamed from: k */
    public boolean f166670k;

    /* JADX INFO: renamed from: l.s7b0$a */
    public static final class C20001a {

        /* JADX INFO: renamed from: a */
        public final hte f166671a;

        /* JADX INFO: renamed from: b */
        public final h0j0 f166672b;

        /* JADX INFO: renamed from: c */
        public final hg60 f166673c = new hg60(new byte[64]);

        /* JADX INFO: renamed from: d */
        public boolean f166674d;

        /* JADX INFO: renamed from: e */
        public boolean f166675e;

        /* JADX INFO: renamed from: f */
        public boolean f166676f;

        /* JADX INFO: renamed from: g */
        public int f166677g;

        /* JADX INFO: renamed from: h */
        public long f166678h;

        public C20001a(hte hteVar, h0j0 h0j0Var) {
            this.f166671a = hteVar;
            this.f166672b = h0j0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m185000a(ig60 ig60Var) throws ParserException {
            ig60Var.m139822l(this.f166673c.f109369a, 0, 3);
            this.f166673c.m134913p(0);
            m185001b();
            ig60Var.m139822l(this.f166673c.f109369a, 0, this.f166677g);
            this.f166673c.m134913p(0);
            m185002c();
            this.f166671a.mo108402d(this.f166678h, 4);
            this.f166671a.mo108399a(ig60Var);
            this.f166671a.mo108401c();
        }

        /* JADX INFO: renamed from: b */
        public final void m185001b() {
            this.f166673c.m134915r(8);
            this.f166674d = this.f166673c.m134904g();
            this.f166675e = this.f166673c.m134904g();
            this.f166673c.m134915r(6);
            this.f166677g = this.f166673c.m134905h(8);
        }

        /* JADX INFO: renamed from: c */
        public final void m185002c() {
            this.f166678h = 0L;
            if (this.f166674d) {
                this.f166673c.m134915r(4);
                long jM134905h = ((long) this.f166673c.m134905h(3)) << 30;
                this.f166673c.m134915r(1);
                long jM134905h2 = jM134905h | ((long) (this.f166673c.m134905h(15) << 15));
                this.f166673c.m134915r(1);
                long jM134905h3 = jM134905h2 | ((long) this.f166673c.m134905h(15));
                this.f166673c.m134915r(1);
                if (!this.f166676f && this.f166675e) {
                    this.f166673c.m134915r(4);
                    long jM134905h4 = ((long) this.f166673c.m134905h(3)) << 30;
                    this.f166673c.m134915r(1);
                    long jM134905h5 = jM134905h4 | ((long) (this.f166673c.m134905h(15) << 15));
                    this.f166673c.m134915r(1);
                    long jM134905h6 = jM134905h5 | ((long) this.f166673c.m134905h(15));
                    this.f166673c.m134915r(1);
                    this.f166672b.m133174b(jM134905h6);
                    this.f166676f = true;
                }
                this.f166678h = this.f166672b.m133174b(jM134905h3);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m185003d() {
            this.f166676f = false;
            this.f166671a.mo108400b();
        }
    }

    public s7b0(h0j0 h0j0Var) {
        this.f166660a = h0j0Var;
        this.f166662c = new ig60(4096);
        this.f166661b = new SparseArray<>();
        this.f166663d = new q7b0();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m184998c() {
        return new zrf[]{new s7b0()};
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        boolean z = this.f166660a.m133177e() == -9223372036854775807L;
        if (!z) {
            long jM133175c = this.f166660a.m133175c();
            z = (jM133175c == -9223372036854775807L || jM133175c == 0 || jM133175c == j2) ? false : true;
        }
        if (z) {
            this.f166660a.m133179h(j2);
        }
        p7b0 p7b0Var = this.f166668i;
        if (p7b0Var != null) {
            p7b0Var.m123135h(j2);
        }
        for (int i = 0; i < this.f166661b.size(); i++) {
            this.f166661b.valueAt(i).m185003d();
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f166669j = bsfVar;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: d */
    public final void m184999d(long j) {
        if (this.f166670k) {
            return;
        }
        this.f166670k = true;
        if (this.f166663d.m175644c() == -9223372036854775807L) {
            this.f166669j.mo11424k(new mke0.C18641b(this.f166663d.m175644c()));
            return;
        }
        p7b0 p7b0Var = new p7b0(this.f166663d.m175645d(), this.f166663d.m175644c(), j);
        this.f166668i = p7b0Var;
        this.f166669j.mo11424k(p7b0Var.m123129b());
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        byte[] bArr = new byte[14];
        asfVar.mo99900f(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        asfVar.mo99904m(bArr[13] & 7);
        asfVar.mo99900f(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        hte nwkVar;
        w11.m204373i(this.f166669j);
        long length = asfVar.getLength();
        if (length != -1 && !this.f166663d.m175646e()) {
            return this.f166663d.m175648g(asfVar, ll80Var);
        }
        m184999d(length);
        p7b0 p7b0Var = this.f166668i;
        if (p7b0Var != null && p7b0Var.m123131d()) {
            return this.f166668i.m123130c(asfVar, ll80Var);
        }
        asfVar.mo99902h();
        long jMo99903k = length != -1 ? length - asfVar.mo99903k() : -1L;
        if ((jMo99903k != -1 && jMo99903k < 4) || !asfVar.mo99901g(this.f166662c.m139815e(), 0, 4, true)) {
            return -1;
        }
        this.f166662c.m139808U(0);
        int iM139827q = this.f166662c.m139827q();
        if (iM139827q == 441) {
            return -1;
        }
        if (iM139827q == 442) {
            asfVar.mo99900f(this.f166662c.m139815e(), 0, 10);
            this.f166662c.m139808U(9);
            asfVar.mo99905o((this.f166662c.m139795H() & 7) + 14);
            return 0;
        }
        if (iM139827q == 443) {
            asfVar.mo99900f(this.f166662c.m139815e(), 0, 2);
            this.f166662c.m139808U(0);
            asfVar.mo99905o(this.f166662c.m139801N() + 6);
            return 0;
        }
        if (((iM139827q & (-256)) >> 8) != 1) {
            asfVar.mo99905o(1);
            return 0;
        }
        int i = iM139827q & 255;
        C20001a c20001a = this.f166661b.get(i);
        if (!this.f166664e) {
            if (c20001a == null) {
                if (i == 189) {
                    nwkVar = new C21540y8();
                    this.f166665f = true;
                    this.f166667h = asfVar.getPosition();
                } else if ((iM139827q & 224) == 192) {
                    nwkVar = new h710();
                    this.f166665f = true;
                    this.f166667h = asfVar.getPosition();
                } else if ((iM139827q & 240) == 224) {
                    nwkVar = new nwk();
                    this.f166666g = true;
                    this.f166667h = asfVar.getPosition();
                } else {
                    nwkVar = null;
                }
                if (nwkVar != null) {
                    nwkVar.mo108403e(this.f166669j, new jkj0.C17969d(i, 256));
                    c20001a = new C20001a(nwkVar, this.f166660a);
                    this.f166661b.put(i, c20001a);
                }
            }
            if (asfVar.getPosition() > ((this.f166665f && this.f166666g) ? this.f166667h + 8192 : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f166664e = true;
                this.f166669j.mo11425l();
            }
        }
        asfVar.mo99900f(this.f166662c.m139815e(), 0, 2);
        this.f166662c.m139808U(0);
        int iM139801N = this.f166662c.m139801N() + 6;
        if (c20001a == null) {
            asfVar.mo99905o(iM139801N);
        } else {
            this.f166662c.m139804Q(iM139801N);
            asfVar.readFully(this.f166662c.m139815e(), 0, iM139801N);
            this.f166662c.m139808U(6);
            c20001a.m185000a(this.f166662c);
            ig60 ig60Var = this.f166662c;
            ig60Var.m139807T(ig60Var.m139812b());
        }
        return 0;
    }

    @Override // p153l.zrf
    public void release() {
    }

    public s7b0() {
        this(new h0j0(0L));
    }
}
