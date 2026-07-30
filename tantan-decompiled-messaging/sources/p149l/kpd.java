package p149l;

import com.tencent.mmkv.MMKV;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class kpd extends hnw.AbstractC17359d {
    public kpd(boolean z) {
        super(z);
    }

    @Override // p149l.hnw.InterfaceC17358c
    /* JADX INFO: renamed from: b */
    public int mo98250b() {
        return MMKV.ExpireInHour;
    }

    @Override // p149l.hnw.InterfaceC17358c
    /* JADX INFO: renamed from: e */
    public boolean mo98253e() {
        return true;
    }

    @Override // p149l.hnw.AbstractC17359d
    /* JADX INFO: renamed from: f */
    public String mo132028f() {
        return inw.m137164b().getFilesDir() + File.separator + "mmfile";
    }
}
