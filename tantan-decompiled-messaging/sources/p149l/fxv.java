package p149l;

import com.p046p1.mobile.putong.data.Meta;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class fxv implements axv {

    /* JADX INFO: renamed from: a */
    public final long f99813a;

    /* JADX INFO: renamed from: b */
    public final boolean f99814b;

    public fxv(hkh0 hkh0Var) {
        n21.m157541b(new Runnable() { // from class: l.bxv
            @Override // java.lang.Runnable
            public final void run() {
                this.f77824a.m123700l();
            }
        });
        hkh0Var.m131513g();
        this.f99814b = hkh0Var.m131521o();
        this.f99813a = ((long) hkh0Var.m131512f()) * 5184000000L;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m123692d(File file, Meta meta) {
        int i = meta.code;
        qhi.m174545f(file);
    }

    @Override // p149l.axv
    /* JADX INFO: renamed from: a */
    public void mo99522a() {
        new Runnable() { // from class: l.dxv
            @Override // java.lang.Runnable
            public final void run() {
                this.f88324a.m123698j();
            }
        };
    }

    @Override // p149l.axv
    /* JADX INFO: renamed from: b */
    public void mo99523b() {
        n21.m157541b(new Runnable() { // from class: l.cxv
            @Override // java.lang.Runnable
            public final void run() {
                this.f82890a.m123697i();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final File m123695g() {
        File file = new File(fkh0.m121857c());
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length == 0) {
            m123700l();
        }
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length <= 0) {
            return null;
        }
        return file.listFiles()[0];
    }

    /* JADX INFO: renamed from: h */
    public final boolean m123696h(String str) {
        try {
            return Long.parseLong(str.contains("_") ? str.substring(str.indexOf("_"), str.indexOf(".")) : str.substring(0, str.indexOf("."))) - System.currentTimeMillis() >= this.f99813a;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m123697i() {
        File fileM123695g = m123695g();
        if (fileM123695g == null) {
            return;
        }
        m123699k(fileM123695g);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m123698j() {
        File[] fileArrListFiles;
        m123700l();
        File file = new File(fkh0.m121857c());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (this.f99814b && m123696h(file2.getName())) {
                qhi.m174545f(file2);
            } else {
                m123699k(file2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m123699k(final File file) {
        try {
            tod.m189874d(fkh0.m121858d(), file).subscribe(ffw.m121193d(new e30() { // from class: l.exv
                @Override // p149l.e30
                public final void call(Object obj) {
                    fxv.m123692d(file, (Meta) obj);
                }
            }));
        } catch (Exception e) {
            hfw.m130790a("[live][real-time-log]", e.getMessage());
            CrashHelper.m81297d(new RuntimeException("日志上报异常 ： " + e.toString()), 5000);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m123700l() {
        g5j0.m124528b(fkh0.m121855a(), fkh0.m121857c());
    }
}
