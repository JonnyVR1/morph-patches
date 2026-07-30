package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wnq implements sqf {

    /* JADX INFO: renamed from: b */
    public uqf f187327b;

    /* JADX INFO: renamed from: c */
    public int f187328c;

    /* JADX INFO: renamed from: d */
    public int f187329d;

    /* JADX INFO: renamed from: e */
    public int f187330e;

    /* JADX INFO: renamed from: g */
    @Nullable
    public MotionPhotoMetadata f187332g;

    /* JADX INFO: renamed from: h */
    public tqf f187333h;

    /* JADX INFO: renamed from: i */
    public suf0 f187334i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public sy00 f187335j;

    /* JADX INFO: renamed from: a */
    public final d860 f187326a = new d860(6);

    /* JADX INFO: renamed from: f */
    public long f187331f = -1;

    @Nullable
    /* JADX INFO: renamed from: e */
    public static MotionPhotoMetadata m204751e(String str, long j) throws IOException {
        ly00 ly00VarM130605a;
        if (j == -1 || (ly00VarM130605a = hdq0.m130605a(str)) == null) {
            return null;
        }
        return ly00VarM130605a.m152116a(j);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        if (j == 0) {
            this.f187328c = 0;
            this.f187335j = null;
        } else if (this.f187328c == 5) {
            ((sy00) p11.m167011e(this.f187335j)).mo10975a(j, j2);
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f187327b = uqfVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m204752c(tqf tqfVar) throws IOException {
        this.f187326a.m110288Q(2);
        tqfVar.mo150655f(this.f187326a.m110299e(), 0, 2);
        tqfVar.mo150660m(this.f187326a.m110285N() - 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m204753d() {
        m204754g(new Metadata.Entry[0]);
        ((uqf) p11.m167011e(this.f187327b)).mo11371l();
        this.f187327b.mo11370k(new hce0.C17275b(-9223372036854775807L));
        this.f187328c = 6;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        if (m204755i(tqfVar) != 65496) {
            return false;
        }
        int iM204755i = m204755i(tqfVar);
        this.f187329d = iM204755i;
        if (iM204755i == 65504) {
            m204752c(tqfVar);
            this.f187329d = m204755i(tqfVar);
        }
        if (this.f187329d != 65505) {
            return false;
        }
        tqfVar.mo150660m(2);
        this.f187326a.m110288Q(6);
        tqfVar.mo150655f(this.f187326a.m110299e(), 0, 6);
        return this.f187326a.m110281J() == 1165519206 && this.f187326a.m110285N() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m204754g(Metadata.Entry... entryArr) {
        ((uqf) p11.m167011e(this.f187327b)).mo11362b(1024, 4).mo11110b(new C1871k.b().m10326M(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG).m10339Z(new Metadata(entryArr)).m10320G());
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        int i = this.f187328c;
        if (i == 0) {
            m204756j(tqfVar);
            return 0;
        }
        if (i == 1) {
            m204758l(tqfVar);
            return 0;
        }
        if (i == 2) {
            m204757k(tqfVar);
            return 0;
        }
        if (i == 4) {
            long position = tqfVar.getPosition();
            long j = this.f187331f;
            if (position != j) {
                fd80Var.f97018a = j;
                return 1;
            }
            m204759m(tqfVar);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            ohg0.m164364a();
            return 0;
        }
        if (this.f187334i == null || tqfVar != this.f187333h) {
            this.f187333h = tqfVar;
            this.f187334i = new suf0(tqfVar, this.f187331f);
        }
        int iMo10978h = ((sy00) p11.m167011e(this.f187335j)).mo10978h(this.f187334i, fd80Var);
        if (iMo10978h == 1) {
            fd80Var.f97018a += this.f187331f;
        }
        return iMo10978h;
    }

    /* JADX INFO: renamed from: i */
    public final int m204755i(tqf tqfVar) throws IOException {
        this.f187326a.m110288Q(2);
        tqfVar.mo150655f(this.f187326a.m110299e(), 0, 2);
        return this.f187326a.m110285N();
    }

    /* JADX INFO: renamed from: j */
    public final void m204756j(tqf tqfVar) throws IOException {
        this.f187326a.m110288Q(2);
        tqfVar.readFully(this.f187326a.m110299e(), 0, 2);
        int iM110285N = this.f187326a.m110285N();
        this.f187329d = iM110285N;
        if (iM110285N == 65498) {
            if (this.f187331f != -1) {
                this.f187328c = 4;
                return;
            } else {
                m204753d();
                return;
            }
        }
        if ((iM110285N < 65488 || iM110285N > 65497) && iM110285N != 65281) {
            this.f187328c = 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m204757k(tqf tqfVar) throws IOException {
        String strM110273B;
        if (this.f187329d == 65505) {
            d860 d860Var = new d860(this.f187330e);
            tqfVar.readFully(d860Var.m110299e(), 0, this.f187330e);
            if (this.f187332g == null && "http://ns.adobe.com/xap/1.0/".equals(d860Var.m110273B()) && (strM110273B = d860Var.m110273B()) != null) {
                MotionPhotoMetadata motionPhotoMetadataM204751e = m204751e(strM110273B, tqfVar.getLength());
                this.f187332g = motionPhotoMetadataM204751e;
                if (motionPhotoMetadataM204751e != null) {
                    this.f187331f = motionPhotoMetadataM204751e.videoStartPosition;
                }
            }
        } else {
            tqfVar.mo150661o(this.f187330e);
        }
        this.f187328c = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m204758l(tqf tqfVar) throws IOException {
        this.f187326a.m110288Q(2);
        tqfVar.readFully(this.f187326a.m110299e(), 0, 2);
        this.f187330e = this.f187326a.m110285N() - 2;
        this.f187328c = 2;
    }

    /* JADX INFO: renamed from: m */
    public final void m204759m(tqf tqfVar) throws IOException {
        if (!tqfVar.mo150656g(this.f187326a.m110299e(), 0, 1, true)) {
            m204753d();
            return;
        }
        tqfVar.mo150657h();
        if (this.f187335j == null) {
            this.f187335j = new sy00();
        }
        suf0 suf0Var = new suf0(tqfVar, this.f187331f);
        this.f187334i = suf0Var;
        if (!this.f187335j.mo10977f(suf0Var)) {
            m204753d();
        } else {
            this.f187335j.mo10976b(new tuf0(this.f187331f, (uqf) p11.m167011e(this.f187327b)));
            m204760n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m204760n() {
        m204754g((Metadata.Entry) p11.m167011e(this.f187332g));
        this.f187328c = 5;
    }

    @Override // p149l.sqf
    public void release() {
        sy00 sy00Var = this.f187335j;
        if (sy00Var != null) {
            sy00Var.release();
        }
    }
}
