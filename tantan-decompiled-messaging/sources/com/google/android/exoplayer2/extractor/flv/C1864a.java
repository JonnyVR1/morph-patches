package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.C21594z1;
import p149l.d860;
import p149l.m6j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1864a extends TagPayloadReader {

    /* JADX INFO: renamed from: e */
    public static final int[] f7484e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f7485b;

    /* JADX INFO: renamed from: c */
    public boolean f7486c;

    /* JADX INFO: renamed from: d */
    public int f7487d;

    public C1864a(m6j0 m6j0Var) {
        super(m6j0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo9982b(d860 d860Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f7485b) {
            d860Var.m110293V(1);
        } else {
            int iM110279H = d860Var.m110279H();
            int i = (iM110279H >> 4) & 15;
            this.f7487d = i;
            if (i == 2) {
                this.f7483a.mo11110b(new C1871k.b().m10346g0(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG).m10323J(1).m10347h0(f7484e[(iM110279H >> 2) & 3]).m10320G());
                this.f7486c = true;
            } else if (i == 7 || i == 8) {
                this.f7483a.mo11110b(new C1871k.b().m10346g0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m10323J(1).m10347h0(TXRecordCommon.AUDIO_SAMPLERATE_8000).m10320G());
                this.f7486c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f7487d);
            }
            this.f7485b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo9983c(d860 d860Var, long j) throws ParserException {
        if (this.f7487d == 2) {
            int iM110295a = d860Var.m110295a();
            this.f7483a.m153238d(d860Var, iM110295a);
            this.f7483a.mo11109a(j, 1, iM110295a, 0, null);
            return true;
        }
        int iM110279H = d860Var.m110279H();
        if (iM110279H != 0 || this.f7486c) {
            if (this.f7487d == 10 && iM110279H != 1) {
                return false;
            }
            int iM110295a2 = d860Var.m110295a();
            this.f7483a.m153238d(d860Var, iM110295a2);
            this.f7483a.mo11109a(j, 1, iM110295a2, 0, null);
            return true;
        }
        int iM110295a3 = d860Var.m110295a();
        byte[] bArr = new byte[iM110295a3];
        d860Var.m110306l(bArr, 0, iM110295a3);
        C21594z1.b bVarM216778f = C21594z1.m216778f(bArr);
        this.f7483a.mo11110b(new C1871k.b().m10346g0("audio/mp4a-latm").m10324K(bVarM216778f.f201036c).m10323J(bVarM216778f.f201035b).m10347h0(bVarM216778f.f201034a).m10335V(Collections.singletonList(bArr)).m10320G());
        this.f7486c = true;
        return false;
    }
}
