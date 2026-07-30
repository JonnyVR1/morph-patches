package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import p149l.b320;
import p149l.d860;
import p149l.ip1;
import p149l.m6j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1865b extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public final d860 f7488b;

    /* JADX INFO: renamed from: c */
    public final d860 f7489c;

    /* JADX INFO: renamed from: d */
    public int f7490d;

    /* JADX INFO: renamed from: e */
    public boolean f7491e;

    /* JADX INFO: renamed from: f */
    public boolean f7492f;

    /* JADX INFO: renamed from: g */
    public int f7493g;

    public C1865b(m6j0 m6j0Var) {
        super(m6j0Var);
        this.f7488b = new d860(b320.f72762a);
        this.f7489c = new d860(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo9982b(d860 d860Var) throws TagPayloadReader.UnsupportedFormatException {
        int iM110279H = d860Var.m110279H();
        int i = (iM110279H >> 4) & 15;
        int i2 = iM110279H & 15;
        if (i2 == 7) {
            this.f7493g = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo9983c(d860 d860Var, long j) throws ParserException {
        int iM110279H = d860Var.m110279H();
        long jM110312r = j + (((long) d860Var.m110312r()) * 1000);
        if (iM110279H == 0 && !this.f7491e) {
            d860 d860Var2 = new d860(new byte[d860Var.m110295a()]);
            d860Var.m110306l(d860Var2.m110299e(), 0, d860Var.m110295a());
            ip1 ip1VarM137437b = ip1.m137437b(d860Var2);
            this.f7490d = ip1VarM137437b.f114243b;
            this.f7483a.mo11110b(new C1871k.b().m10346g0(YtVideoEncoder.MIME_TYPE).m10324K(ip1VarM137437b.f114250i).m10353n0(ip1VarM137437b.f114244c).m10332S(ip1VarM137437b.f114245d).m10342c0(ip1VarM137437b.f114249h).m10335V(ip1VarM137437b.f114242a).m10320G());
            this.f7491e = true;
            return false;
        }
        if (iM110279H != 1 || !this.f7491e) {
            return false;
        }
        int i = this.f7493g == 1 ? 1 : 0;
        if (!this.f7492f && i == 0) {
            return false;
        }
        byte[] bArrM110299e = this.f7489c.m110299e();
        bArrM110299e[0] = 0;
        bArrM110299e[1] = 0;
        bArrM110299e[2] = 0;
        int i2 = 4 - this.f7490d;
        int i3 = 0;
        while (d860Var.m110295a() > 0) {
            d860Var.m110306l(this.f7489c.m110299e(), i2, this.f7490d);
            this.f7489c.m110292U(0);
            int iM110283L = this.f7489c.m110283L();
            this.f7488b.m110292U(0);
            this.f7483a.m153238d(this.f7488b, 4);
            this.f7483a.m153238d(d860Var, iM110283L);
            i3 = i3 + 4 + iM110283L;
        }
        this.f7483a.mo11109a(jM110312r, i, i3, 0, null);
        this.f7492f = true;
        return true;
    }
}
