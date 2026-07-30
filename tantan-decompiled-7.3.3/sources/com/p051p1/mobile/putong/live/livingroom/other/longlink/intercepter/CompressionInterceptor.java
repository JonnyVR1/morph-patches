package com.p051p1.mobile.putong.live.livingroom.other.longlink.intercepter;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p153l.bzm;
import p153l.ftf0;
import p153l.mrl;
import p153l.myt;
import p153l.ur4;
import p153l.usf0;
import p153l.vhw;
import p153l.yc60;

/* JADX INFO: loaded from: classes5.dex */
public class CompressionInterceptor extends bzm {

    /* JADX INFO: renamed from: b */
    public final HashMap<Integer, mrl> f52058b;

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
        HashMap<Integer, mrl> map = new HashMap<>();
        this.f52058b = map;
        map.put(1, new vhw());
        map.put(2, new usf0());
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        byte bM160805j;
        yc60 yc60VarMo196644c = ur4Var.mo196644c();
        ftf0 ftf0VarM215136b = yc60VarMo196644c.m215136b();
        if ((ftf0VarM215136b instanceof myt) && (bM160805j = ((myt) ftf0VarM215136b).m160805j()) != 0) {
            mrl mrlVarM76665f = m76665f(bM160805j);
            if (mrlVarM76665f == null) {
                ur4Var.mo196643b().m186795m().mo204127b(new CompressionMethodNotFound("current compression code:" + ((int) bM160805j)));
                return;
            }
            try {
                yc60VarMo196644c.m215138d(mrlVarM76665f.mo159708a(yc60VarMo196644c.m215135a()));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                ur4Var.mo196643b().m186795m().mo204127b(new CompressionFailException("decompression data length:" + yc60VarMo196644c.m215135a().length + ",data:" + Arrays.toString(yc60VarMo196644c.m215135a()), e));
                return;
            }
        }
        ur4Var.mo196642a(yc60VarMo196644c);
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        ur4Var.mo196642a(ur4Var.mo196644c());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final mrl m76665f(int i) {
        return this.f52058b.get(Integer.valueOf(i));
    }
}
