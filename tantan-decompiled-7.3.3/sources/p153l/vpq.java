package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vpq implements zrf {

    /* JADX INFO: renamed from: b */
    public bsf f185283b;

    /* JADX INFO: renamed from: c */
    public int f185284c;

    /* JADX INFO: renamed from: d */
    public int f185285d;

    /* JADX INFO: renamed from: e */
    public int f185286e;

    /* JADX INFO: renamed from: g */
    @Nullable
    public MotionPhotoMetadata f185288g;

    /* JADX INFO: renamed from: h */
    public asf f185289h;

    /* JADX INFO: renamed from: i */
    public b3g0 f185290i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public c710 f185291j;

    /* JADX INFO: renamed from: a */
    public final ig60 f185282a = new ig60(6);

    /* JADX INFO: renamed from: f */
    public long f185287f = -1;

    @Nullable
    /* JADX INFO: renamed from: e */
    public static MotionPhotoMetadata m202333e(String str, long j) throws IOException {
        v610 v610VarM159092a;
        if (j == -1 || (v610VarM159092a = mmq0.m159092a(str)) == null) {
            return null;
        }
        return v610VarM159092a.m199962a(j);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        if (j == 0) {
            this.f185284c = 0;
            this.f185291j = null;
        } else if (this.f185284c == 5) {
            ((c710) w11.m204369e(this.f185291j)).mo11029a(j, j2);
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f185283b = bsfVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m202334c(asf asfVar) throws IOException {
        this.f185282a.m139804Q(2);
        asfVar.mo99900f(this.f185282a.m139815e(), 0, 2);
        asfVar.mo99904m(this.f185282a.m139801N() - 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m202335d() {
        m202336g(new Metadata.Entry[0]);
        ((bsf) w11.m204369e(this.f185283b)).mo11425l();
        this.f185283b.mo11424k(new mke0.C18641b(-9223372036854775807L));
        this.f185284c = 6;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        if (m202337i(asfVar) != 65496) {
            return false;
        }
        int iM202337i = m202337i(asfVar);
        this.f185285d = iM202337i;
        if (iM202337i == 65504) {
            m202334c(asfVar);
            this.f185285d = m202337i(asfVar);
        }
        if (this.f185285d != 65505) {
            return false;
        }
        asfVar.mo99904m(2);
        this.f185282a.m139804Q(6);
        asfVar.mo99900f(this.f185282a.m139815e(), 0, 6);
        return this.f185282a.m139797J() == 1165519206 && this.f185282a.m139801N() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m202336g(Metadata.Entry... entryArr) {
        ((bsf) w11.m204369e(this.f185283b)).mo11416b(1024, 4).mo11164b(new C1894k.b().m10380M(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG).m10393Z(new Metadata(entryArr)).m10374G());
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        int i = this.f185284c;
        if (i == 0) {
            m202338j(asfVar);
            return 0;
        }
        if (i == 1) {
            m202340l(asfVar);
            return 0;
        }
        if (i == 2) {
            m202339k(asfVar);
            return 0;
        }
        if (i == 4) {
            long position = asfVar.getPosition();
            long j = this.f185287f;
            if (position != j) {
                ll80Var.f132534a = j;
                return 1;
            }
            m202341m(asfVar);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            wpg0.m207458a();
            return 0;
        }
        if (this.f185290i == null || asfVar != this.f185289h) {
            this.f185289h = asfVar;
            this.f185290i = new b3g0(asfVar, this.f185287f);
        }
        int iMo11032h = ((c710) w11.m204369e(this.f185291j)).mo11032h(this.f185290i, ll80Var);
        if (iMo11032h == 1) {
            ll80Var.f132534a += this.f185287f;
        }
        return iMo11032h;
    }

    /* JADX INFO: renamed from: i */
    public final int m202337i(asf asfVar) throws IOException {
        this.f185282a.m139804Q(2);
        asfVar.mo99900f(this.f185282a.m139815e(), 0, 2);
        return this.f185282a.m139801N();
    }

    /* JADX INFO: renamed from: j */
    public final void m202338j(asf asfVar) throws IOException {
        this.f185282a.m139804Q(2);
        asfVar.readFully(this.f185282a.m139815e(), 0, 2);
        int iM139801N = this.f185282a.m139801N();
        this.f185285d = iM139801N;
        if (iM139801N == 65498) {
            if (this.f185287f != -1) {
                this.f185284c = 4;
                return;
            } else {
                m202335d();
                return;
            }
        }
        if ((iM139801N < 65488 || iM139801N > 65497) && iM139801N != 65281) {
            this.f185284c = 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m202339k(asf asfVar) throws IOException {
        String strM139789B;
        if (this.f185285d == 65505) {
            ig60 ig60Var = new ig60(this.f185286e);
            asfVar.readFully(ig60Var.m139815e(), 0, this.f185286e);
            if (this.f185288g == null && "http://ns.adobe.com/xap/1.0/".equals(ig60Var.m139789B()) && (strM139789B = ig60Var.m139789B()) != null) {
                MotionPhotoMetadata motionPhotoMetadataM202333e = m202333e(strM139789B, asfVar.getLength());
                this.f185288g = motionPhotoMetadataM202333e;
                if (motionPhotoMetadataM202333e != null) {
                    this.f185287f = motionPhotoMetadataM202333e.videoStartPosition;
                }
            }
        } else {
            asfVar.mo99905o(this.f185286e);
        }
        this.f185284c = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m202340l(asf asfVar) throws IOException {
        this.f185282a.m139804Q(2);
        asfVar.readFully(this.f185282a.m139815e(), 0, 2);
        this.f185286e = this.f185282a.m139801N() - 2;
        this.f185284c = 2;
    }

    /* JADX INFO: renamed from: m */
    public final void m202341m(asf asfVar) throws IOException {
        if (!asfVar.mo99901g(this.f185282a.m139815e(), 0, 1, true)) {
            m202335d();
            return;
        }
        asfVar.mo99902h();
        if (this.f185291j == null) {
            this.f185291j = new c710();
        }
        b3g0 b3g0Var = new b3g0(asfVar, this.f185287f);
        this.f185290i = b3g0Var;
        if (!this.f185291j.mo11031f(b3g0Var)) {
            m202335d();
        } else {
            this.f185291j.mo11030b(new c3g0(this.f185287f, (bsf) w11.m204369e(this.f185283b)));
            m202342n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m202342n() {
        m202336g((Metadata.Entry) w11.m204369e(this.f185288g));
        this.f185284c = 5;
    }

    @Override // p153l.zrf
    public void release() {
        c710 c710Var = this.f185291j;
        if (c710Var != null) {
            c710Var.release();
        }
    }
}
