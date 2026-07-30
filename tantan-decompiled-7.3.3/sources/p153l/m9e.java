package p153l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class m9e extends wr4 {

    /* JADX INFO: renamed from: l.m9e$a */
    public class C18572a implements ioh0.InterfaceC17761c {
        public C18572a() {
        }

        @Override // p153l.ioh0.InterfaceC17761c
        /* JADX INFO: renamed from: a */
        public void mo141308a(float f, double d) {
            wr4.InterfaceC21169a interfaceC21169aM207543a = m9e.this.m207543a();
            if (interfaceC21169aM207543a != null) {
                interfaceC21169aM207543a.mo150627a(f, d, m9e.this);
            }
        }
    }

    public m9e(String str) {
        super(str);
        m207551j(5);
    }

    /* JADX INFO: renamed from: k */
    private boolean m157563k(aje ajeVar, File file) {
        if (!zie.m219728a(file)) {
            return false;
        }
        try {
            File fileM219732e = zie.m219732e(ajeVar);
            return fileM219732e.exists() && TextUtils.equals(ajeVar.m98369d().m141814d(), miw.m158556e(fileM219732e)) && fileM219732e.renameTo(file);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m157564l(aje ajeVar, File file) throws Throwable {
        ire0 ire0VarM98369d = ajeVar.m98369d();
        File fileM219736i = zie.m219736i(ajeVar);
        if (fileM219736i.exists()) {
            try {
                String strM141814d = ire0VarM98369d.m141814d();
                MLog.m20458d("SDKResource", "serverMd5: " + strM141814d, new Object[0]);
                String strM158556e = miw.m158556e(fileM219736i);
                MLog.m20458d("SDKResource", "localMd5: " + strM158556e, new Object[0]);
                if (strM141814d.equalsIgnoreCase(strM158556e)) {
                    if (!zie.m219728a(file)) {
                        m207549h(3, "删除downloadFile失败");
                        return false;
                    }
                    mki.m158787a(fileM219736i, file);
                    MLog.m20458d("SDKResource", "download from sd card success", new Object[0]);
                    m207544b().m212780g(3);
                    return true;
                }
                MLog.m20458d("SDKResource", "md5 is not match", new Object[0]);
            } catch (Exception e) {
                MLog.printErrStackTrace("SDKResource", e);
            }
        } else {
            MLog.m20458d("SDKResource", "sd card backup file not exit", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private boolean m157565m(aje ajeVar, File file, ire0 ire0Var) {
        String strM146330a = jo5.m146330a(ire0Var);
        if (TextUtils.isEmpty(strM146330a)) {
            m207549h(3, "down url is empty");
            return false;
        }
        if (!zie.m219728a(file)) {
            m207549h(3, "删除downloadFile失败");
            return false;
        }
        try {
            z9e z9eVar = new z9e();
            z9eVar.m219072b(new C18572a());
            ioh0.C17760b c17760bM219071a = z9eVar.m219071a(strM146330a, file.getAbsolutePath(), ajeVar.m98367b());
            boolean z = c17760bM219071a.f116158a;
            if (z) {
                MLog.m20458d("SDKResource", "%s 下载全量文件完成，大小：%d kb", ajeVar.m98367b(), Long.valueOf(file.length() / 1024));
                m207544b().m212780g(1);
                return z;
            }
            m207549h(3, "下载过程出现异常, reason: " + c17760bM219071a.f116159b);
            return z;
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            m207550i(3, e);
            return false;
        }
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) {
        ire0 ire0VarM98369d = ajeVar.m98369d();
        File fileM219731d = zie.m219731d(ajeVar);
        if (m157563k(ajeVar, fileM219731d)) {
            u4d0.m194475a("Event_Resource_Local_Access", 1, null);
            return true;
        }
        if (m157564l(ajeVar, fileM219731d)) {
            return true;
        }
        return m157565m(ajeVar, fileM219731d, ire0VarM98369d);
    }

    public m9e() {
        this("DownloadFullHandler");
    }
}
