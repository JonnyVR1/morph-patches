package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import immomo.com.mklibrary.core.offline.bsdiff.BsdiffUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class yhw {

    /* JADX INFO: renamed from: c */
    private static final String f198401c = "yhw";

    /* JADX INFO: renamed from: d */
    private static yhw f198402d;

    /* JADX INFO: renamed from: a */
    private HashMap<String, v750> f198403a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private kiw f198404b = kiw.m146150f();

    /* JADX INFO: renamed from: l.yhw$a */
    public class RunnableC21401a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ug2 f198405a;

        public RunnableC21401a(ug2 ug2Var) {
            this.f198405a = ug2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM217430a = z750.m217430a();
            yhw.this.f198404b.m146153c();
            ug2 ug2Var = this.f198405a;
            if (ug2Var != null) {
                if (zM217430a) {
                    ug2Var.mo97997c(null);
                } else {
                    ug2Var.mo97996b("清除失败");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yhw$b */
    public class RunnableC21402b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f198407a;

        public RunnableC21402b(String str) {
            this.f198407a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MDLog.m7389d("FepPublishManager", "delete package " + this.f198407a);
            MDLog.m7389d("webRsa", "delete package " + this.f198407a);
            z750.m217447r(this.f198407a);
            yhw.this.f198404b.m146154e(this.f198407a);
        }
    }

    /* JADX INFO: renamed from: l.yhw$c */
    public class RunnableC21403c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f198409a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f198410b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ug2 f198411c;

        public RunnableC21403c(String str, String str2, ug2 ug2Var) {
            this.f198409a = str;
            this.f198410b = str2;
            this.f198411c = ug2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            v750 v750VarM214871t = yhw.this.m214871t(this.f198409a);
            xhw xhwVar = new xhw();
            xhwVar.m101942k(this.f198409a);
            xhwVar.m101940i();
            xhwVar.m208843x(v750VarM214871t.m197340f());
            xhwVar.m208840u(-1L);
            xhwVar.m208842w(false);
            xhwVar.m101944m(this.f198410b);
            String strM214860q = yhw.m214860q(this.f198409a, 10086L, this.f198410b);
            xhwVar.m211117d(strM214860q);
            uhw.m193793e().m193797g(strM214860q, xhwVar);
            boolean zM214858n = yhw.this.m214858n(this.f198409a, this.f198410b, 0, 10086L, 0L);
            ug2 ug2Var = this.f198411c;
            if (ug2Var != null) {
                if (zM214858n) {
                    ug2Var.mo97997c(null);
                } else {
                    ug2Var.mo97996b(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yhw$d */
    public class RunnableC21404d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f198413a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f198414b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ug2 f198415c;

        public RunnableC21404d(String str, String str2, ug2 ug2Var) {
            this.f198413a = str;
            this.f198414b = str2;
            this.f198415c = ug2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            String str;
            v750 v750VarM214871t = yhw.this.m214871t(this.f198413a);
            xhw xhwVar = new xhw();
            xhwVar.m101942k(this.f198413a);
            xhwVar.m101940i();
            xhwVar.m208843x(v750VarM214871t.m197340f());
            long jCurrentTimeMillis = System.currentTimeMillis();
            esj0 esj0VarM178125c = null;
            try {
                esj0VarM178125c = r750.m178124d().m178125c(this.f198413a, this.f198414b, v750VarM214871t.m197340f(), v750VarM214871t.m197336b());
                yhw.this.m214857l(this.f198413a, esj0VarM178125c);
            } catch (Exception e) {
                e.printStackTrace();
                mxv.m156927b(yhw.f198401c, "tang----检查更新失败 : " + e.getMessage());
            }
            xhwVar.m208840u(System.currentTimeMillis() - jCurrentTimeMillis);
            if (esj0VarM178125c == null) {
                xhwVar.m208834o();
                xhwVar.m101939h();
                uhw.m193793e().m193799i(xhwVar);
                ug2 ug2Var = this.f198415c;
                if (ug2Var != null) {
                    ug2Var.mo97996b("离线包检查更新失败");
                    return;
                }
                return;
            }
            if (yhw.this.m214864y(v750VarM214871t, esj0VarM178125c)) {
                yhw.this.m214866D(this.f198413a);
            }
            yhw.this.m214845C(this.f198413a, esj0VarM178125c.f93019f);
            try {
                MDLog.m7399w("webRsa", "checkUpdate: \n" + esj0VarM178125c.m117914g().toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            mxv.m156926a(yhw.f198401c, "tang------完整包url " + esj0VarM178125c.m117911d() + "  增量包url " + esj0VarM178125c.m117910c());
            if (!esj0VarM178125c.m117912e()) {
                ug2 ug2Var2 = this.f198415c;
                if (ug2Var2 != null) {
                    ug2Var2.mo97997c(esj0VarM178125c.f93021h);
                }
                yhw.this.m214844B(this.f198413a);
                xhwVar.m208833n();
                xhwVar.m101939h();
                uhw.m193793e().m193799i(xhwVar);
                mxv.m156926a(yhw.f198401c, "tang-------没有最新包，不需要更新");
                return;
            }
            v750VarM214871t.m197346l();
            int iM214861r = yhw.this.m214861r(this.f198413a, 1, v750VarM214871t.m197340f());
            String strM117911d = esj0VarM178125c.m117911d();
            if (iM214861r == 1) {
                String strM117910c = esj0VarM178125c.m117910c();
                if (TextUtils.isEmpty(strM117910c)) {
                    str = strM117911d;
                    i = 0;
                } else {
                    i = iM214861r;
                    str = strM117910c;
                }
            } else {
                i = iM214861r;
                str = strM117911d;
            }
            xhwVar.m208842w(i == 1);
            xhwVar.m101944m(str);
            String strM214860q = yhw.m214860q(this.f198413a, esj0VarM178125c.f93016c, str);
            xhwVar.m211117d(strM214860q);
            uhw.m193793e().m193797g(strM214860q, xhwVar);
            mxv.m156926a(yhw.f198401c, "tang------下载类型是 " + i + "   下载url是 " + str);
            boolean zM214858n = yhw.this.m214858n(this.f198413a, str, i, esj0VarM178125c.f93016c, v750VarM214871t.m197340f());
            ug2 ug2Var3 = this.f198415c;
            if (zM214858n) {
                if (ug2Var3 != null) {
                    ug2Var3.mo97997c(esj0VarM178125c.f93021h);
                }
            } else if (ug2Var3 != null) {
                ug2Var3.mo97996b("离线包下载失败");
            }
        }
    }

    /* JADX INFO: renamed from: l.yhw$e */
    public class RunnableC21405e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f198417a;

        public RunnableC21405e(String str) {
            this.f198417a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            yhw.this.f198404b.m146158l(this.f198417a, System.currentTimeMillis());
        }
    }

    private yhw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m214844B(String str) {
        v750 v750VarM214871t = m214871t(str);
        if (v750VarM214871t != null) {
            boolean zM146157k = this.f198404b.m146157k(str, v750VarM214871t.m197346l());
            mxv.m156926a(f198401c, "tang------更新检查时间 " + zM146157k + "  " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m214845C(String str, int i) {
        v750 v750VarM214871t = m214871t(str);
        if (v750VarM214871t != null) {
            v750VarM214871t.m197348n(i);
            boolean zM146156j = this.f198404b.m146156j(str, i);
            mxv.m156926a(f198401c, "tang------更新检查时间 " + zM146156j + "  " + str);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m214846E(String str) {
        mxv.m156926a(f198401c, "tang----下载成功后，更新预处理情况 " + str);
        this.f198403a.remove(str);
        m214844B(str);
    }

    /* JADX INFO: renamed from: F */
    private boolean m214847F(String str, String str2, int i, long j, long j2) {
        File fileM217435f;
        File file;
        boolean z;
        File file2;
        boolean zM214863w;
        xhw xhwVar;
        String str3 = ".7z";
        String strM214860q = m214860q(str, j, str2);
        xul xulVarM193796f = uhw.m193793e().m193796f(strM214860q);
        xhw xhwVar2 = xulVarM193796f != null ? (xhw) xulVarM193796f : null;
        try {
            if (TextUtils.isEmpty(str2)) {
                throw new Exception("离线包下载失败，url为空");
            }
            boolean zM218878k = zhw.m218878k(str2);
            String str4 = zM218878k ? "alpha-" : "";
            if (!str2.endsWith(".7z")) {
                str3 = ".zip";
            }
            if (i == 1) {
                fileM217435f = z750.m217435f(str4 + str + "_patch", str3);
            } else {
                fileM217435f = z750.m217435f(str4 + str, str3);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                fileM217435f.delete();
                fileM217435f.createNewFile();
                m214859o(str, fileM217435f, str2);
                if (fileM217435f.length() <= 0 || !fileM217435f.exists()) {
                    file = fileM217435f;
                    try {
                        throw new Exception("离线包下载失败" + file.getAbsolutePath());
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        file.delete();
                        throw new Exception("离线包下载失败" + file.getAbsolutePath());
                    }
                }
                File file3 = fileM217435f;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (xhwVar2 != null) {
                    xhwVar2.m208841v(jCurrentTimeMillis2);
                    xhwVar2.m208844y(file3.length());
                }
                if (i == 1) {
                    File fileM217435f2 = z750.m217435f(str4 + str, str3);
                    fileM217435f2.delete();
                    fileM217435f2.createNewFile();
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    try {
                        file2 = file3;
                        try {
                            zM214863w = m214863w(file2, fileM217435f2, str4 + str, j2);
                            fileM217435f2 = fileM217435f2;
                        } catch (Throwable th) {
                            th = th;
                            Log4Android.m18417f().m18422e(th);
                            zM214863w = false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        file2 = file3;
                    }
                    if (xhwVar2 != null) {
                        xhwVar2.m208845z(System.currentTimeMillis() - jCurrentTimeMillis3);
                    }
                    if (zM214863w && fileM217435f2.exists() && fileM217435f2.length() > 0) {
                        file2.delete();
                        mxv.m156926a(f198401c, "tang------增量包合成完毕 " + fileM217435f2);
                    }
                    fileM217435f2.delete();
                    if (xhwVar2 != null) {
                        xhwVar2.m208837r();
                        xhwVar2.m101939h();
                        uhw.m193793e().m193799i(xhwVar2);
                        uhw.m193793e().m193798h(strM214860q);
                        xhwVar = null;
                    } else {
                        xhwVar = xhwVar2;
                    }
                    try {
                        throw new Exception("增量包合成失败" + file2.getAbsolutePath());
                    } catch (Throwable th3) {
                        th = th3;
                        xhwVar2 = xhwVar;
                        try {
                            th.printStackTrace();
                            lxv.m152098d(str, th.getMessage());
                            if (xhwVar2 != null) {
                                xhwVar2.m208835p();
                                xhwVar2.m101939h();
                                uhw.m193793e().m193799i(xhwVar2);
                                uhw.m193793e().m193798h(strM214860q);
                            }
                            return false;
                        } finally {
                            mxv.m156926a(f198401c, "tang-------取消下载任务纪录");
                            w750.m202005a().m202007c(str);
                        }
                    }
                }
                int iM155819h = mpj0.m155819h(str, xhwVar2, str3, zM218878k);
                if (iM155819h != 1 && i == 1) {
                    File fileM217433d = z750.m217433d(str4 + str, j2, str3);
                    if (fileM217433d.exists()) {
                        fileM217433d.delete();
                        mxv.m156926a(f198401c, "tang-------增量合成的离线包解压失败，删除备份包 " + fileM217433d.getAbsolutePath());
                    }
                }
                if (iM155819h != -1) {
                    if (iM155819h != -2) {
                        if (xhwVar2 != null) {
                            xhwVar2.m208836q();
                            xhwVar2.m101939h();
                            uhw.m193793e().m193799i(xhwVar2);
                            uhw.m193793e().m193798h(strM214860q);
                        }
                        m214846E(str);
                        z = true;
                    } else if (xhwVar2 != null) {
                        xhwVar2.m208839t();
                        xhwVar2.m101939h();
                        uhw.m193793e().m193799i(xhwVar2);
                        uhw.m193793e().m193798h(strM214860q);
                    }
                    mxv.m156926a(f198401c, "tang-------取消下载任务纪录");
                    w750.m202005a().m202007c(str);
                    return z;
                }
                if (xhwVar2 != null) {
                    xhwVar2.m208838s();
                    xhwVar2.m101939h();
                    uhw.m193793e().m193799i(xhwVar2);
                    uhw.m193793e().m193798h(strM214860q);
                }
                z = false;
                mxv.m156926a(f198401c, "tang-------取消下载任务纪录");
                w750.m202005a().m202007c(str);
                return z;
            } catch (Exception e2) {
                e = e2;
                file = fileM217435f;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m214857l(@Nullable String str, @Nullable esj0 esj0Var) {
        hei.INSTANCE.m130633a(str, esj0Var);
        fhw.INSTANCE.m121467j(str, esj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m214858n(String str, String str2, int i, long j, long j2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            mxv.m156927b(f198401c, "tang-----下载离线包失败，bid为空");
            return false;
        }
        if (w750.m202005a().m202006b(str)) {
            return m214847F(str, str2, i, j, j2);
        }
        mxv.m156927b(f198401c, str + "下载任务已经进行中..." + str2);
        return false;
    }

    /* JADX INFO: renamed from: o */
    private boolean m214859o(String str, File file, String str2) throws Exception {
        String str3 = f198401c;
        mxv.m156926a(str3, "tang-----downloadPackageFile bid   url " + str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            vsl vslVarM169154a = phw.m169153b().m169154a();
            HashMap map = new HashMap();
            map.put("Content-Type", "application/zip");
            mxv.m156926a(str3, "tang------下载离线包 " + str2 + "  " + file.getAbsolutePath());
            vslVarM169154a.mo87144b(str2, file, null, map);
            mxv.m156926a(str3, "tang-----downloadPackage download time " + (System.currentTimeMillis() - jCurrentTimeMillis) + "   " + file.getAbsolutePath());
            return true;
        } catch (Exception e) {
            lxv.m152098d(str, e.getMessage());
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m214860q(String str, long j, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str + "_" + j + "_" + str2.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public int m214861r(String str, int i, long j) {
        if (i == 1) {
            try {
                if (!z750.m217445p(str, j)) {
                    return 0;
                }
            } catch (IOException e) {
                Log4Android.m18417f().m18422e(e);
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: s */
    public static yhw m214862s() {
        if (f198402d == null) {
            synchronized (yhw.class) {
                try {
                    if (f198402d == null) {
                        f198402d = new yhw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198402d;
    }

    /* JADX INFO: renamed from: w */
    private boolean m214863w(File file, File file2, String str, long j) throws Throwable {
        String str2 = ".7z";
        try {
            if (!file2.getName().endsWith(".7z")) {
                str2 = ".zip";
            }
            File fileM217433d = z750.m217433d(str, j, str2);
            if (!file.exists() || !fileM217433d.exists() || fileM217433d.length() <= 0) {
                file.delete();
                throw new IOException("增量包或者备份包不存在 " + file.exists() + "   " + fileM217433d.exists());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = f198401c;
            mxv.m156930e(str3, "tang------合成增量包开始 bid=" + str + "  source " + fileM217433d + "  final " + file2 + "  patch " + file);
            int iApply_patch = BsdiffUtil.apply_patch(fileM217433d.getAbsolutePath(), file2.getAbsolutePath(), file.getAbsolutePath());
            mxv.m156930e(str3, "tang------合成增量包完成，耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  source " + fileM217433d + "  final " + file2 + "  patch " + file);
            return iApply_patch > 0;
        } catch (Throwable th) {
            Log4Android.m18417f().m18422e(th);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public boolean m214864y(v750 v750Var, esj0 esj0Var) {
        h460 h460Var;
        boolean z = false;
        if (esj0Var != null) {
            boolean z2 = esj0Var.f93020g == 1;
            boolean z3 = (v750Var == null || (h460Var = v750Var.f180303c) == null || !h460Var.m129228i()) ? false : true;
            z = z2 != z3;
            MDLog.m7390d("webRsa", "needSwitchEnv: %s, localIsSandbox: %s, checkUpdate, isSandbox: %s", Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z2));
        }
        return z;
    }

    /* JADX INFO: renamed from: A */
    public int m214865A(String str, @Nullable String str2, whw whwVar, boolean z) {
        if (TextUtils.equals("0", str)) {
            return -1;
        }
        v750 v750VarM214871t = m214871t(str);
        if (!v750VarM214871t.m197343i()) {
            if (whwVar != null) {
                whwVar.m203247p();
            }
            return -1;
        }
        h460 h460Var = v750VarM214871t.f180303c;
        if (h460Var == null) {
            if (whwVar != null) {
                whwVar.m203248q();
            }
            return -1;
        }
        if (System.currentTimeMillis() > h460Var.m129222c()) {
            m214866D(str);
            if (whwVar != null) {
                whwVar.m203247p();
            }
            return -1;
        }
        if (v750VarM214871t.m197344j()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (!mpj0.m155815d(v750VarM214871t.m197337c(), true)) {
                    m214862s().m214866D(str);
                    MDLog.m7400w("webRsa", "签名校验 check failed, package: %s, will remove", v750VarM214871t.m197337c());
                    return -2;
                }
                MDLog.m7399w("webRsa", "签名校验成功");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                MDLog.m7400w("webRsa", "签名校验 cost %d ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } else {
            MDLog.m7399w("webRsa", "不需要 rsa 签名校验");
        }
        if (v750VarM214871t.m197345k() && z) {
            giw.INSTANCE.m126407a(str2, str);
        }
        if (whwVar != null) {
            whwVar.m203252v(0L);
        }
        if (System.currentTimeMillis() - v750VarM214871t.m197335a() > 7200000) {
            C3804c.m18444d(2, new RunnableC21405e(str));
        }
        return 1;
    }

    /* JADX INFO: renamed from: D */
    public boolean m214866D(String str) {
        if (TextUtils.isEmpty(str) || !z750.m217437h(str).exists()) {
            return false;
        }
        C3804c.m18444d(2, new RunnableC21402b(str));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m214867j(String str, @Nullable String str2, ug2 ug2Var) {
        if (TextUtils.equals("0", str)) {
            return;
        }
        mxv.m156926a(f198401c, "tang-------检查更新 " + str);
        C3804c.m18444d(2, new RunnableC21404d(str, str2, ug2Var));
    }

    /* JADX INFO: renamed from: k */
    public void m214868k(ug2 ug2Var) {
        C3804c.m18444d(2, new RunnableC21401a(ug2Var));
    }

    /* JADX INFO: renamed from: m */
    public void m214869m(List<esj0> list) {
        int i;
        String str;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (esj0 esj0Var : list) {
            if (esj0Var != null && !TextUtils.isEmpty(esj0Var.f93014a)) {
                String str2 = esj0Var.f93014a;
                if (this.m214864y(this.m214871t(str2), esj0Var)) {
                    this.m214866D(str2);
                }
                String str3 = f198401c;
                mxv.m156926a(str3, "tang-------开始批量下载 " + str2);
                xhw xhwVar = new xhw();
                xhwVar.m101942k(str2);
                xhwVar.m101940i();
                xhwVar.m208843x(esj0Var.f93015b);
                xhwVar.m208840u(0L);
                int iM214861r = this.m214861r(str2, 1, esj0Var.f93015b);
                String strM117911d = esj0Var.m117911d();
                if (iM214861r == 1) {
                    String strM117910c = esj0Var.m117910c();
                    if (TextUtils.isEmpty(strM117910c)) {
                        str = strM117911d;
                        i = 0;
                    } else {
                        i = iM214861r;
                        str = strM117910c;
                    }
                } else {
                    i = iM214861r;
                    str = strM117911d;
                }
                xhwVar.m208842w(i == 1);
                xhwVar.m101944m(str);
                String strM214860q = m214860q(str2, esj0Var.f93016c, str);
                xhwVar.m211117d(strM214860q);
                uhw.m193793e().m193797g(strM214860q, xhwVar);
                yhw yhwVar = this;
                if (yhwVar.m214858n(str2, str, i, esj0Var.f93016c, esj0Var.f93015b)) {
                    mxv.m156926a(str3, "tang-------批量下载成功 " + str2);
                    yhwVar.m214844B(str2);
                } else {
                    mxv.m156927b(str3, "tang-------批量下载失败 " + str2);
                }
                this = yhwVar;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m214870p(String str, String str2, ug2 ug2Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        C3804c.m18444d(2, new RunnableC21403c(str, str2, ug2Var));
    }

    /* JADX INFO: renamed from: t */
    public v750 m214871t(String str) {
        v750 v750Var = this.f198403a.get(str);
        if (v750Var != null && v750Var.f180303c != null && TextUtils.equals(v750Var.f180301a, str)) {
            mxv.m156926a(f198401c, "tang-------已经缓存离线包配置");
            return v750Var;
        }
        String str2 = f198401c;
        mxv.m156926a(str2, "tang-------需要读取离线包配置");
        v750 v750Var2 = new v750(str);
        v750Var2.m197342h(z750.m217437h(str).getAbsolutePath());
        long jCurrentTimeMillis = System.currentTimeMillis();
        n460 n460VarM146155i = this.f198404b.m146155i(str);
        if (n460VarM146155i == null) {
            n460VarM146155i = new n460(str);
        }
        mxv.m156926a(str2, "tang-----读取离线包的使用情况 " + str + "   耗时" + (System.currentTimeMillis() - jCurrentTimeMillis));
        v750Var2.m197347m(n460VarM146155i);
        this.f198403a.put(str, v750Var2);
        return v750Var2;
    }

    /* JADX INFO: renamed from: u */
    public n460 m214872u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        n460 n460VarM146155i = this.f198404b.m146155i(str);
        return n460VarM146155i == null ? new n460(str) : n460VarM146155i;
    }

    /* JADX INFO: renamed from: v */
    public long m214873v(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        v750 v750VarM214871t = m214871t(str);
        if (v750VarM214871t.f180303c != null) {
            return v750VarM214871t.m197340f();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x */
    public long m214874x(String str) {
        File fileM217437h = z750.m217437h(str);
        if (!fileM217437h.exists()) {
            return -1L;
        }
        try {
            h460 h460VarM217446q = z750.m217446q(fileM217437h.getAbsolutePath());
            if (h460VarM217446q == null) {
                return -1L;
            }
            return h460VarM217446q.m129226g();
        } catch (IOException e) {
            Log4Android.m18417f().m18422e(e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: z */
    public int m214875z(String str, @Nullable String str2, whw whwVar) {
        return m214865A(str, str2, whwVar, true);
    }
}
