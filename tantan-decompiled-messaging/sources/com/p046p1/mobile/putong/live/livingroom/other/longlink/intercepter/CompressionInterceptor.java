package com.p046p1.mobile.putong.live.livingroom.other.longlink.intercepter;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p149l.apl;
import p149l.bxm;
import p149l.lkf0;
import p149l.lwt;
import p149l.s460;
import p149l.vq4;
import p149l.wkf0;
import p149l.xfw;

/* JADX INFO: loaded from: classes4.dex */
public class CompressionInterceptor extends bxm {

    /* JADX INFO: renamed from: b */
    public final HashMap<Integer, apl> f51210b;

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
        this.f51210b = map;
        map.put(1, new xfw());
        map.put(2, new lkf0());
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        byte bM152011j;
        s460 s460VarMo159107c = vq4Var.mo159107c();
        wkf0 wkf0VarM182209b = s460VarMo159107c.m182209b();
        if ((wkf0VarM182209b instanceof lwt) && (bM152011j = ((lwt) wkf0VarM182209b).m152011j()) != 0) {
            apl aplVarM75482f = m75482f(bM152011j);
            if (aplVarM75482f == null) {
                vq4Var.mo159106b().m149499m().mo216486b(new CompressionMethodNotFound("current compression code:" + ((int) bM152011j)));
                return;
            }
            try {
                s460VarMo159107c.m182211d(aplVarM75482f.mo98141a(s460VarMo159107c.m182208a()));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                vq4Var.mo159106b().m149499m().mo216486b(new CompressionFailException("decompression data length:" + s460VarMo159107c.m182208a().length + ",data:" + Arrays.toString(s460VarMo159107c.m182208a()), e));
                return;
            }
        }
        vq4Var.mo159105a(s460VarMo159107c);
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
        vq4Var.mo159105a(vq4Var.mo159107c());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final apl m75482f(int i) {
        return this.f51210b.get(Integer.valueOf(i));
    }
}
