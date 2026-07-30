package com.p000p1.mobile.putong.live.livingroom.other.longlink.intercepter;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p002l.apl;
import p002l.bxm;
import p002l.lkf0;
import p002l.lwt;
import p002l.s460;
import p002l.vq4;
import p002l.wkf0;
import p002l.xfw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CompressionInterceptor extends bxm {

    /* JADX INFO: renamed from: b */
    public final HashMap<Integer, apl> f7252b;

    public static class CompressionFailException extends RuntimeException {
        public CompressionFailException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static class CompressionMethodNotFound extends RuntimeException {
        public CompressionMethodNotFound(String str) {
            super(str);
        }
    }

    public CompressionInterceptor() {
        HashMap<Integer, apl> map = new HashMap<>();
        this.f7252b = map;
        map.put(1, new xfw());
        map.put(2, new lkf0());
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        byte bM17500j;
        s460 s460VarMo18695c = vq4Var.mo18695c();
        wkf0 wkf0VarM22194b = s460VarMo18695c.m22194b();
        if ((wkf0VarM22194b instanceof lwt) && (bM17500j = ((lwt) wkf0VarM22194b).m17500j()) != 0) {
            apl aplVarM9117f = m9117f(bM17500j);
            if (aplVarM9117f == null) {
                vq4Var.mo18694b().m17157m().mo26979b(new CompressionMethodNotFound("current compression code:" + ((int) bM17500j)));
                return;
            }
            try {
                s460VarMo18695c.m22196d(aplVarM9117f.mo9992a(s460VarMo18695c.m22193a()));
            } catch (Exception e) {
                CrashHelper.c(e);
                vq4Var.mo18694b().m17157m().mo26979b(new CompressionFailException("decompression data length:" + s460VarMo18695c.m22193a().length + ",data:" + Arrays.toString(s460VarMo18695c.m22193a()), e));
                return;
            }
        }
        vq4Var.mo18693a(s460VarMo18695c);
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        vq4Var.mo18693a(vq4Var.mo18695c());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final apl m9117f(int i) {
        return this.f7252b.get(Integer.valueOf(i));
    }
}
