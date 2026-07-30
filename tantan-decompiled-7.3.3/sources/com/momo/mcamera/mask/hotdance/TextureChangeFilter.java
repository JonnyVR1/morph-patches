package com.momo.mcamera.mask.hotdance;

import p153l.jt2;
import p153l.lej;

/* JADX INFO: loaded from: classes8.dex */
public class TextureChangeFilter extends jt2 {
    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        lej lejVar2 = new lej(getWidth(), getHeight());
        this.glFrameBuffer = lejVar2;
        lejVar2.m153904k(false);
        this.glFrameBuffer.m153896c(getWidth(), getHeight());
    }
}
