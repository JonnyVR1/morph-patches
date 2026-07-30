package p153l;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class zlc0 {

    /* JADX INFO: renamed from: a */
    protected final Set<String> f204899a;

    /* JADX INFO: renamed from: b */
    protected final ylc0.InterfaceC21623b f204900b;

    /* JADX INFO: renamed from: c */
    protected final ylc0.InterfaceC21622a f204901c;

    /* JADX INFO: renamed from: d */
    protected boolean f204902d;

    /* JADX INFO: renamed from: e */
    protected boolean f204903e;

    /* JADX INFO: renamed from: l.zlc0$a */
    public class RunnableC21833a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f204904a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f204905b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f204906c;

        public RunnableC21833a(Context context, String str, String str2, ylc0.InterfaceC21624c interfaceC21624c) {
            this.f204904a = context;
            this.f204905b = str;
            this.f204906c = str2;
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
        */
        public void run() {
            try {
                zlc0.this.m220176g(this.f204904a, this.f204905b, this.f204906c);
                throw null;
            } catch (MissingLibraryException unused) {
                throw null;
            } catch (UnsatisfiedLinkError unused2) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: l.zlc0$b */
    public class C21834b implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f204908a;

        public C21834b(String str) {
            this.f204908a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f204908a);
        }
    }

    public zlc0(ylc0.InterfaceC21623b interfaceC21623b, ylc0.InterfaceC21622a interfaceC21622a) {
        this.f204899a = new HashSet();
        if (interfaceC21623b == null) {
            wg3.m206174a("Cannot pass null library loader");
            throw null;
        }
        if (interfaceC21622a == null) {
            wg3.m206174a("Cannot pass null library installer");
            throw null;
        }
        this.f204900b = interfaceC21623b;
        this.f204901c = interfaceC21622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m220176g(Context context, String str, String str2) {
        zlc0 zlc0Var;
        Context context2;
        if (this.f204899a.contains(str) && !this.f204902d) {
            m220183i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f204900b.loadLibrary(str);
            this.f204899a.add(str);
            m220183i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            m220183i("Loading the library normally failed: %s", Log.getStackTraceString(e));
            m220183i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileM220179d = m220179d(context, str, str2);
            if (!fileM220179d.exists() || this.f204902d) {
                if (this.f204902d) {
                    m220183i("Forcing a re-link of %s (%s)...", str, str2);
                }
                m220177b(context, str, str2);
                zlc0Var = this;
                context2 = context;
                this.f204901c.mo202669a(context2, this.f204900b.mo197093b(), this.f204900b.mo197095d(str), fileM220179d, zlc0Var);
            } else {
                zlc0Var = this;
                context2 = context;
            }
            try {
                if (zlc0Var.f204903e) {
                    Iterator<String> it = new ote(fileM220179d).m169086m().iterator();
                    while (it.hasNext()) {
                        zlc0Var.m220180e(context2, zlc0Var.f204900b.mo197092a(it.next()));
                    }
                }
            } catch (IOException unused) {
            }
            zlc0Var.f204900b.mo197094c(fileM220179d.getAbsolutePath());
            zlc0Var.f204899a.add(str);
            zlc0Var.m220183i("%s (%s) was re-linked!", str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m220177b(Context context, String str, String str2) {
        File fileM220178c = m220178c(context);
        File fileM220179d = m220179d(context, str, str2);
        File[] fileArrListFiles = fileM220178c.listFiles(new C21834b(this.f204900b.mo197095d(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f204902d || !file.getAbsolutePath().equals(fileM220179d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public File m220178c(Context context) {
        return context.getDir(ShareConstants.SO_PATH, 0);
    }

    /* JADX INFO: renamed from: d */
    public File m220179d(Context context, String str, String str2) {
        String strMo197095d = this.f204900b.mo197095d(str);
        if (ksi0.m151246a(str2)) {
            return new File(m220178c(context), strMo197095d);
        }
        return new File(m220178c(context), strMo197095d + "." + str2);
    }

    /* JADX INFO: renamed from: e */
    public void m220180e(Context context, String str) {
        m220181f(context, str, null, null);
    }

    /* JADX INFO: renamed from: f */
    public void m220181f(Context context, String str, String str2, ylc0.InterfaceC21624c interfaceC21624c) {
        if (context == null) {
            wg3.m206174a("Given context is null");
            return;
        }
        if (ksi0.m151246a(str)) {
            wg3.m206174a("Given library is either null or empty");
            return;
        }
        m220183i("Beginning load of %s...", str);
        if (interfaceC21624c == null) {
            m220176g(context, str, str2);
        } else {
            new Thread(new RunnableC21833a(context, str, str2, interfaceC21624c)).start();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m220183i(String str, Object... objArr) {
        m220182h(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: renamed from: h */
    public void m220182h(String str) {
    }

    public zlc0() {
        this(new uph0(), new vt0());
    }
}
