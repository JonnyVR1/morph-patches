package com.tencent.liteav.beauty.p098b.p099a;

import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14228c extends C14178h {
    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(6);
        this.f59016a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram == 0 || !mo83986b()) {
            this.f59022g = false;
        } else {
            this.f59022g = true;
        }
        mo83987c();
        return this.f59022g;
    }
}
