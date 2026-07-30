package p149l;

import android.content.Context;
import android.util.Log;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class sdc0 {

    /* JADX INFO: renamed from: a */
    protected final Set<String> f163822a;

    /* JADX INFO: renamed from: b */
    protected final rdc0.InterfaceC19680b f163823b;

    /* JADX INFO: renamed from: c */
    protected final rdc0.InterfaceC19679a f163824c;

    /* JADX INFO: renamed from: d */
    protected boolean f163825d;

    /* JADX INFO: renamed from: e */
    protected boolean f163826e;

    /* JADX INFO: renamed from: l.sdc0$a */
    public class RunnableC19908a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f163827a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f163828b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f163829c;

        public RunnableC19908a(Context context, String str, String str2, rdc0.InterfaceC19681c interfaceC19681c) {
            this.f163827a = context;
            this.f163828b = str;
            this.f163829c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                l.sdc0 r1 = p149l.sdc0.this     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r4.f163827a     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r4.f163828b     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r4.f163829c     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                p149l.sdc0.m183483a(r1, r2, r3, r4)     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p149l.sdc0.RunnableC19908a.run():void");
        }
    }

    /* JADX INFO: renamed from: l.sdc0$b */
    public class C19909b implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f163831a;

        public C19909b(String str) {
            this.f163831a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f163831a);
        }
    }

    public sdc0(rdc0.InterfaceC19680b interfaceC19680b, rdc0.InterfaceC19679a interfaceC19679a) {
        this.f163822a = new HashSet();
        if (interfaceC19680b == null) {
            ig3.m135964a("Cannot pass null library loader");
            throw null;
        }
        if (interfaceC19679a == null) {
            ig3.m135964a("Cannot pass null library installer");
            throw null;
        }
        this.f163823b = interfaceC19680b;
        this.f163824c = interfaceC19679a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m183484g(Context context, String str, String str2) {
        sdc0 sdc0Var;
        Context context2;
        if (this.f163822a.contains(str) && !this.f163825d) {
            m183491i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f163823b.loadLibrary(str);
            this.f163822a.add(str);
            m183491i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            m183491i("Loading the library normally failed: %s", Log.getStackTraceString(e));
            m183491i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileM183487d = m183487d(context, str, str2);
            if (!fileM183487d.exists() || this.f163825d) {
                if (this.f163825d) {
                    m183491i("Forcing a re-link of %s (%s)...", str, str2);
                }
                m183485b(context, str, str2);
                sdc0Var = this;
                context2 = context;
                this.f163824c.mo171258a(context2, this.f163823b.mo159398b(), this.f163823b.mo159400d(str), fileM183487d, sdc0Var);
            } else {
                sdc0Var = this;
                context2 = context;
            }
            try {
                if (sdc0Var.f163826e) {
                    Iterator<String> it = new kse(fileM183487d).m147058m().iterator();
                    while (it.hasNext()) {
                        sdc0Var.m183488e(context2, sdc0Var.f163823b.mo159397a(it.next()));
                    }
                }
            } catch (IOException unused) {
            }
            sdc0Var.f163823b.mo159399c(fileM183487d.getAbsolutePath());
            sdc0Var.f163822a.add(str);
            sdc0Var.m183491i("%s (%s) was re-linked!", str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m183485b(Context context, String str, String str2) {
        File fileM183486c = m183486c(context);
        File fileM183487d = m183487d(context, str, str2);
        File[] fileArrListFiles = fileM183486c.listFiles(new C19909b(this.f163823b.mo159400d(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f163825d || !file.getAbsolutePath().equals(fileM183487d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public File m183486c(Context context) {
        return context.getDir(ShareConstants.SO_PATH, 0);
    }

    /* JADX INFO: renamed from: d */
    public File m183487d(Context context, String str, String str2) {
        String strMo159400d = this.f163823b.mo159400d(str);
        if (kji0.m146235a(str2)) {
            return new File(m183486c(context), strMo159400d);
        }
        return new File(m183486c(context), strMo159400d + "." + str2);
    }

    /* JADX INFO: renamed from: e */
    public void m183488e(Context context, String str) {
        m183489f(context, str, null, null);
    }

    /* JADX INFO: renamed from: f */
    public void m183489f(Context context, String str, String str2, rdc0.InterfaceC19681c interfaceC19681c) {
        if (context == null) {
            ig3.m135964a("Given context is null");
            return;
        }
        if (kji0.m146235a(str)) {
            ig3.m135964a("Given library is either null or empty");
            return;
        }
        m183491i("Beginning load of %s...", str);
        if (interfaceC19681c == null) {
            m183484g(context, str, str2);
        } else {
            new Thread(new RunnableC19908a(context, str, str2, interfaceC19681c)).start();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m183491i(String str, Object... objArr) {
        m183490h(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: renamed from: h */
    public void m183490h(String str) {
    }

    public sdc0() {
        this(new nhh0(), new pt0());
    }
}
