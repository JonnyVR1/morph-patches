package com.facebook.imagepipeline.nativecode;

import p149l.egm;
import p149l.i5e;
import p149l.kod;
import p149l.tim;
import p149l.uim;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class NativeJpegTranscoderFactory implements uim {

    /* JADX INFO: renamed from: a */
    public final int f6461a;

    /* JADX INFO: renamed from: b */
    public final boolean f6462b;

    /* JADX INFO: renamed from: c */
    public final boolean f6463c;

    @i5e
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f6461a = i;
        this.f6462b = z;
        this.f6463c = z2;
    }

    @Override // p149l.uim
    @i5e
    public tim createImageTranscoder(egm egmVar, boolean z) {
        if (egmVar != kod.JPEG) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f6461a, this.f6462b, this.f6463c);
    }
}
