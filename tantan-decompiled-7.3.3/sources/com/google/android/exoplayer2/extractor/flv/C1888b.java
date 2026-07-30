package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import p153l.ig60;
import p153l.jb20;
import p153l.pp1;
import p153l.qfj0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1888b extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public final ig60 f7525b;

    /* JADX INFO: renamed from: c */
    public final ig60 f7526c;

    /* JADX INFO: renamed from: d */
    public int f7527d;

    /* JADX INFO: renamed from: e */
    public boolean f7528e;

    /* JADX INFO: renamed from: f */
    public boolean f7529f;

    /* JADX INFO: renamed from: g */
    public int f7530g;

    public C1888b(qfj0 qfj0Var) {
        super(qfj0Var);
        this.f7525b = new ig60(jb20.f119084a);
        this.f7526c = new ig60(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo10036b(ig60 ig60Var) throws TagPayloadReader.UnsupportedFormatException {
        int iM139795H = ig60Var.m139795H();
        int i = (iM139795H >> 4) & 15;
        int i2 = iM139795H & 15;
        if (i2 == 7) {
            this.f7530g = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo10037c(ig60 ig60Var, long j) throws ParserException {
        int iM139795H = ig60Var.m139795H();
        long jM139828r = j + (((long) ig60Var.m139828r()) * 1000);
        if (iM139795H == 0 && !this.f7528e) {
            ig60 ig60Var2 = new ig60(new byte[ig60Var.m139811a()]);
            ig60Var.m139822l(ig60Var2.m139815e(), 0, ig60Var.m139811a());
            pp1 pp1VarM173175b = pp1.m173175b(ig60Var2);
            this.f7527d = pp1VarM173175b.f153470b;
            this.f7520a.mo11164b(new C1894k.b().m10400g0(YtVideoEncoder.MIME_TYPE).m10378K(pp1VarM173175b.f153477i).m10407n0(pp1VarM173175b.f153471c).m10386S(pp1VarM173175b.f153472d).m10396c0(pp1VarM173175b.f153476h).m10389V(pp1VarM173175b.f153469a).m10374G());
            this.f7528e = true;
            return false;
        }
        if (iM139795H != 1 || !this.f7528e) {
            return false;
        }
        int i = this.f7530g == 1 ? 1 : 0;
        if (!this.f7529f && i == 0) {
            return false;
        }
        byte[] bArrM139815e = this.f7526c.m139815e();
        bArrM139815e[0] = 0;
        bArrM139815e[1] = 0;
        bArrM139815e[2] = 0;
        int i2 = 4 - this.f7527d;
        int i3 = 0;
        while (ig60Var.m139811a() > 0) {
            ig60Var.m139822l(this.f7526c.m139815e(), i2, this.f7527d);
            this.f7526c.m139808U(0);
            int iM139799L = this.f7526c.m139799L();
            this.f7525b.m139808U(0);
            this.f7520a.m176370d(this.f7525b, 4);
            this.f7520a.m176370d(ig60Var, iM139799L);
            i3 = i3 + 4 + iM139799L;
        }
        this.f7520a.mo11163a(jM139828r, i, i3, 0, null);
        this.f7529f = true;
        return true;
    }
}
