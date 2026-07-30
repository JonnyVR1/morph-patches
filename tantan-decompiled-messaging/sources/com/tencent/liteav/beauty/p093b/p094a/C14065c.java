package com.tencent.liteav.beauty.p093b.p094a;

import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14065c extends C14015h {
    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(6);
        this.f58168a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram == 0 || !mo82803b()) {
            this.f58174g = false;
        } else {
            this.f58174g = true;
        }
        mo82804c();
        return this.f58174g;
    }
}
