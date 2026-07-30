package com.momo.mcamera.mask.hotdance;

import p149l.rbj;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class TextureChangeFilter extends ts2 {
    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBuffer = rbjVar2;
        rbjVar2.m178612k(false);
        this.glFrameBuffer.m178604c(getWidth(), getHeight());
    }
}
