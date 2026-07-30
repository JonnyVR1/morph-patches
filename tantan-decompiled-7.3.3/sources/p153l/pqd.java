package p153l;

import com.tencent.mmkv.MMKV;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class pqd extends fqw.AbstractC17039d {
    public pqd(boolean z) {
        super(z);
    }

    @Override // p153l.fqw.InterfaceC17038c
    /* JADX INFO: renamed from: b */
    public int mo126809b() {
        return MMKV.ExpireInHour;
    }

    @Override // p153l.fqw.InterfaceC17038c
    /* JADX INFO: renamed from: e */
    public boolean mo126810e() {
        return true;
    }

    @Override // p153l.fqw.AbstractC17039d
    /* JADX INFO: renamed from: f */
    public String mo126811f() {
        return gqw.m131478b().getFilesDir() + File.separator + "mmfile";
    }
}
