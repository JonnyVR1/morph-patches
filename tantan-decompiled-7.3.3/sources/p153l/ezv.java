package p153l;

import com.p051p1.mobile.putong.data.Meta;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class ezv implements zyv {

    /* JADX INFO: renamed from: a */
    public final long f96627a;

    /* JADX INFO: renamed from: b */
    public final boolean f96628b;

    public ezv(osh0 osh0Var) {
        u21.m194238b(new Runnable() { // from class: l.azv
            @Override // java.lang.Runnable
            public final void run() {
                this.f74192a.m123432l();
            }
        });
        osh0Var.m168997g();
        this.f96628b = osh0Var.m169005o();
        this.f96627a = ((long) osh0Var.m168996f()) * 5184000000L;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m123422d(File file, Meta meta) {
        int i = meta.code;
        nki.m163623f(file);
    }

    @Override // p153l.zyv
    /* JADX INFO: renamed from: a */
    public void mo123425a() {
        new Runnable() { // from class: l.czv
            @Override // java.lang.Runnable
            public final void run() {
                this.f84499a.m123430j();
            }
        };
    }

    @Override // p153l.zyv
    /* JADX INFO: renamed from: b */
    public void mo123426b() {
        u21.m194238b(new Runnable() { // from class: l.bzv
            @Override // java.lang.Runnable
            public final void run() {
                this.f79177a.m123429i();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final File m123427g() {
        File file = new File(msh0.m159788c());
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length == 0) {
            m123432l();
        }
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length <= 0) {
            return null;
        }
        return file.listFiles()[0];
    }

    /* JADX INFO: renamed from: h */
    public final boolean m123428h(String str) {
        try {
            return Long.parseLong(str.contains("_") ? str.substring(str.indexOf("_"), str.indexOf(".")) : str.substring(0, str.indexOf("."))) - System.currentTimeMillis() >= this.f96627a;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m123429i() {
        File fileM123427g = m123427g();
        if (fileM123427g == null) {
            return;
        }
        m123431k(fileM123427g);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m123430j() {
        File[] fileArrListFiles;
        m123432l();
        File file = new File(msh0.m159788c());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (this.f96628b && m123428h(file2.getName())) {
                nki.m163623f(file2);
            } else {
                m123431k(file2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m123431k(final File file) {
        try {
            ypd.m217010d(msh0.m159789d(), file).subscribe(dhw.m115825d(new y20() { // from class: l.dzv
                @Override // p153l.y20
                public final void call(Object obj) {
                    ezv.m123422d(file, (Meta) obj);
                }
            }));
        } catch (Exception e) {
            fhw.m125605a("[live][real-time-log]", e.getMessage());
            CrashHelper.m82480d(new RuntimeException("日志上报异常 ： " + e.toString()), 5000);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m123432l() {
        kej0.m149336b(msh0.m159786a(), msh0.m159788c());
    }
}
