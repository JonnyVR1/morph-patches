package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.C21738z1;
import p153l.ig60;
import p153l.qfj0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1887a extends TagPayloadReader {

    /* JADX INFO: renamed from: e */
    public static final int[] f7521e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f7522b;

    /* JADX INFO: renamed from: c */
    public boolean f7523c;

    /* JADX INFO: renamed from: d */
    public int f7524d;

    public C1887a(qfj0 qfj0Var) {
        super(qfj0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo10036b(ig60 ig60Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f7522b) {
            ig60Var.m139809V(1);
        } else {
            int iM139795H = ig60Var.m139795H();
            int i = (iM139795H >> 4) & 15;
            this.f7524d = i;
            if (i == 2) {
                this.f7520a.mo11164b(new C1894k.b().m10400g0(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG).m10377J(1).m10401h0(f7521e[(iM139795H >> 2) & 3]).m10374G());
                this.f7523c = true;
            } else if (i == 7 || i == 8) {
                this.f7520a.mo11164b(new C1894k.b().m10400g0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m10377J(1).m10401h0(TXRecordCommon.AUDIO_SAMPLERATE_8000).m10374G());
                this.f7523c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f7524d);
            }
            this.f7522b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo10037c(ig60 ig60Var, long j) throws ParserException {
        if (this.f7524d == 2) {
            int iM139811a = ig60Var.m139811a();
            this.f7520a.m176370d(ig60Var, iM139811a);
            this.f7520a.mo11163a(j, 1, iM139811a, 0, null);
            return true;
        }
        int iM139795H = ig60Var.m139795H();
        if (iM139795H != 0 || this.f7523c) {
            if (this.f7524d == 10 && iM139795H != 1) {
                return false;
            }
            int iM139811a2 = ig60Var.m139811a();
            this.f7520a.m176370d(ig60Var, iM139811a2);
            this.f7520a.mo11163a(j, 1, iM139811a2, 0, null);
            return true;
        }
        int iM139811a3 = ig60Var.m139811a();
        byte[] bArr = new byte[iM139811a3];
        ig60Var.m139822l(bArr, 0, iM139811a3);
        C21738z1.b bVarM218271f = C21738z1.m218271f(bArr);
        this.f7520a.mo11164b(new C1894k.b().m10400g0("audio/mp4a-latm").m10378K(bVarM218271f.f202475c).m10377J(bVarM218271f.f202474b).m10401h0(bVarM218271f.f202473a).m10389V(Collections.singletonList(bArr)).m10374G());
        this.f7523c = true;
        return false;
    }
}
