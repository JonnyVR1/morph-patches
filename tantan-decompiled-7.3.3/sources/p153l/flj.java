package p153l;

import android.text.TextUtils;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.p036mk.core.offlinedownload.UnzipErrorException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class flj {

    /* JADX INFO: renamed from: b */
    private static volatile flj f99658b;

    /* JADX INFO: renamed from: a */
    private List<String> f99659a = new ArrayList();

    /* JADX INFO: renamed from: l.flj$b */
    public class RunnableC17008b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f99665a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ elj f99666b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f99667c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f99668d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ okj f99669e;

        public RunnableC17008b(String str, elj eljVar, String str2, boolean z, okj okjVar) {
            this.f99665a = str;
            this.f99666b = eljVar;
            this.f99667c = str2;
            this.f99668d = z;
            this.f99669e = okjVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File file = new File(this.f99665a);
            try {
                flj.this.m126148e(file, this.f99666b);
                flj.this.m126153l(this.f99667c, this.f99666b, file, this.f99668d, this.f99669e);
                this.f99669e.mo138412c(this.f99667c, 1);
            } catch (UnzipErrorException e) {
                this.f99669e.mo138411b(this.f99667c, 1, e);
            } catch (Exception e2) {
                this.f99669e.mo138411b(this.f99667c, 0, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m126148e(File file, elj eljVar) throws Throwable {
        if (TextUtils.equals(eljVar.f94561d, oiw.m167802e(file))) {
            return;
        }
        file.delete();
        wtq0.m207906a("check file md5 failed!");
    }

    /* JADX INFO: renamed from: g */
    public static flj m126149g() {
        if (f99658b == null) {
            synchronized (flj.class) {
                try {
                    if (f99658b == null) {
                        f99658b = new flj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f99658b;
    }

    /* JADX INFO: renamed from: h */
    private String m126150h(String str) {
        return i8g0.m139006h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m126151j(String str, yjw yjwVar, elj eljVar, boolean z, okj okjVar) {
        if (TextUtils.isEmpty(str) || yjwVar == null || okjVar == null) {
            return;
        }
        this.f99659a.remove(m126150h(eljVar.f94559b));
        String strM216445a = yjwVar.m216445a();
        if (TextUtils.isEmpty(strM216445a)) {
            okjVar.mo138411b(str, 0, new NullPointerException("savePath is null"));
        } else {
            C3486c.m17566d(3, new RunnableC17008b(strM216445a, eljVar, str, z, okjVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m126152k(String str, Exception exc, okj okjVar) {
        if (TextUtils.isEmpty(str) || okjVar == null) {
            return;
        }
        this.f99659a.remove(str);
        okjVar.mo138411b(str, 0, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m126153l(String str, elj eljVar, File file, boolean z, okj okjVar) throws Throwable {
        String str2;
        if (eljVar == null || !eljVar.f94563f) {
            str2 = str;
            if (!FepManager.m17582z().m17595r(file.getAbsolutePath(), str2, "custom", "9999999999", eljVar == null ? "" : eljVar.f94558a)) {
                file.delete();
                throw new UnzipErrorException("unzip file " + file + " failed.");
            }
        } else {
            File fileM130653a = glj.m130653a(str, eljVar);
            if (!qyj0.m178654b(str, file, fileM130653a.getAbsolutePath(), true, okjVar)) {
                FileUtil.m17527k(fileM130653a);
                file.delete();
                throw new UnzipErrorException("unzip file " + file + " failed.");
            }
            str2 = str;
        }
        if (z) {
            glj.m130661i(str2, eljVar, true);
        } else {
            glj.m130660h(str2, eljVar);
        }
        file.delete();
    }

    /* JADX INFO: renamed from: m */
    private void m126154m(String str, String str2, elj eljVar, boolean z, boolean z2, okj okjVar) {
        if (TextUtils.isEmpty(eljVar.f94559b) || eljVar.f94559b == null) {
            if (okjVar != null) {
                okjVar.mo138411b(str, 0, new NullPointerException("url is null"));
                return;
            }
            return;
        }
        zjw zjwVar = zjw.INSTANCE;
        if (!zjwVar.m219988c()) {
            m126152k(str, new IllegalStateException("downloader not initialized"), okjVar);
            return;
        }
        String strM126150h = m126150h(eljVar.f94559b);
        this.f99659a.add(strM126150h);
        yjw yjwVar = new yjw();
        yjwVar.m216452h(strM126150h);
        yjwVar.m216451g(eljVar.f94559b);
        yjwVar.m216450f(false);
        yjwVar.m216449e(str2);
        yjwVar.m216448d(z2);
        zjwVar.m219986a(yjwVar, false, new C17007a(okjVar, str, eljVar, z));
    }

    /* JADX INFO: renamed from: f */
    public void m126155f(String str, elj eljVar, boolean z, boolean z2, okj okjVar) throws Throwable {
        if (eljVar == null || !eljVar.m121228a()) {
            if (okjVar != null) {
                okjVar.mo138411b(str, 0, new IllegalArgumentException("resource is null or not valid"));
                return;
            }
            return;
        }
        File fileM130654b = eljVar.f94563f ? glj.m130654b(str, eljVar, null) : FepManager.m17582z().m17594q(str, "custom");
        if (fileM130654b != null && !fileM130654b.exists()) {
            fileM130654b.mkdirs();
        }
        String strM130658f = glj.m130658f(eljVar.f94559b);
        if (TextUtils.isEmpty(strM130658f)) {
            if (okjVar != null) {
                okjVar.mo138411b(str, 0, new IllegalArgumentException("cannot get name by url: " + eljVar.f94559b));
                return;
            }
            return;
        }
        if (m126156i(m126150h(eljVar.f94559b))) {
            return;
        }
        File file = new File(fileM130654b, strM130658f);
        file.delete();
        if (z) {
            glj.m130661i(str, eljVar, false);
        }
        m126154m(str, file.getAbsolutePath(), eljVar, z, z2, okjVar);
    }

    /* JADX INFO: renamed from: i */
    public boolean m126156i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zjw.INSTANCE.m219989d(str);
    }

    /* JADX INFO: renamed from: l.flj$a */
    public class C17007a implements mxl.InterfaceC18742a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ okj f99660a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f99661b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ elj f99662c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f99663d;

        public C17007a(okj okjVar, String str, elj eljVar, boolean z) {
            this.f99660a = okjVar;
            this.f99661b = str;
            this.f99662c = eljVar;
            this.f99663d = z;
        }

        @Override // p153l.mxl.InterfaceC18742a
        /* JADX INFO: renamed from: a */
        public void mo126157a(yjw yjwVar, int i) {
            flj.this.m126152k(this.f99661b, new IllegalStateException("download failed"), this.f99660a);
        }

        @Override // p153l.mxl.InterfaceC18742a
        /* JADX INFO: renamed from: b */
        public void mo126158b(yjw yjwVar) {
            flj.this.m126151j(this.f99661b, yjwVar, this.f99662c, this.f99663d, this.f99660a);
        }

        @Override // p153l.mxl.InterfaceC18742a
        /* JADX INFO: renamed from: c */
        public void mo126159c(yjw yjwVar) {
        }
    }
}
