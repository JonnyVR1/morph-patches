package p149l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class z7e extends xq4 {

    /* JADX INFO: renamed from: l.z7e$a */
    public class C21645a implements agh0.InterfaceC15613c {
        public C21645a() {
        }

        @Override // p149l.agh0.InterfaceC15613c
        /* JADX INFO: renamed from: a */
        public void mo96317a(float f, double d) {
            xq4.InterfaceC21198a interfaceC21198aM210544a = z7e.this.m210544a();
            if (interfaceC21198aM210544a != null) {
                interfaceC21198aM210544a.mo111648a(f, d, z7e.this);
            }
        }
    }

    public z7e(String str) {
        super(str);
        m210552j(5);
    }

    /* JADX INFO: renamed from: k */
    private boolean m217453k(whe wheVar, File file) {
        if (!vhe.m198442a(file)) {
            return false;
        }
        try {
            File fileM198446e = vhe.m198446e(wheVar);
            return fileM198446e.exists() && TextUtils.equals(wheVar.m203128d().m112029d(), ngw.m159358e(fileM198446e)) && fileM198446e.renameTo(file);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m217454l(whe wheVar, File file) throws Throwable {
        dje0 dje0VarM203128d = wheVar.m203128d();
        File fileM198450i = vhe.m198450i(wheVar);
        if (fileM198450i.exists()) {
            try {
                String strM112029d = dje0VarM203128d.m112029d();
                MLog.m19459d("SDKResource", "serverMd5: " + strM112029d, new Object[0]);
                String strM159358e = ngw.m159358e(fileM198450i);
                MLog.m19459d("SDKResource", "localMd5: " + strM159358e, new Object[0]);
                if (strM112029d.equalsIgnoreCase(strM159358e)) {
                    if (!vhe.m198442a(file)) {
                        m210550h(3, "删除downloadFile失败");
                        return false;
                    }
                    phi.m168969a(fileM198450i, file);
                    MLog.m19459d("SDKResource", "download from sd card success", new Object[0]);
                    m210545b().m215705g(3);
                    return true;
                }
                MLog.m19459d("SDKResource", "md5 is not match", new Object[0]);
            } catch (Exception e) {
                MLog.printErrStackTrace("SDKResource", e);
            }
        } else {
            MLog.m19459d("SDKResource", "sd card backup file not exit", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private boolean m217455m(whe wheVar, File file, dje0 dje0Var) {
        String strM122289a = fn5.m122289a(dje0Var);
        if (TextUtils.isEmpty(strM122289a)) {
            m210550h(3, "down url is empty");
            return false;
        }
        if (!vhe.m198442a(file)) {
            m210550h(3, "删除downloadFile失败");
            return false;
        }
        try {
            o8e o8eVar = new o8e();
            o8eVar.m163136b(new C21645a());
            agh0.C15612b c15612bM163135a = o8eVar.m163135a(strM122289a, file.getAbsolutePath(), wheVar.m203126b());
            boolean z = c15612bM163135a.f69371a;
            if (z) {
                MLog.m19459d("SDKResource", "%s 下载全量文件完成，大小：%d kb", wheVar.m203126b(), Long.valueOf(file.length() / 1024));
                m210545b().m215705g(1);
                return z;
            }
            m210550h(3, "下载过程出现异常, reason: " + c15612bM163135a.f69372b);
            return z;
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            m210551i(3, e);
            return false;
        }
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) {
        dje0 dje0VarM203128d = wheVar.m203128d();
        File fileM198445d = vhe.m198445d(wheVar);
        if (m217453k(wheVar, fileM198445d)) {
            rwc0.m181387a("Event_Resource_Local_Access", 1, null);
            return true;
        }
        if (m217454l(wheVar, fileM198445d)) {
            return true;
        }
        return m217455m(wheVar, fileM198445d, dje0VarM203128d);
    }

    public z7e() {
        this("DownloadFullHandler");
    }
}
