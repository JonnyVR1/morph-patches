package p149l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import javax.servlet.http.HttpServletResponse;

/* JADX INFO: loaded from: classes2.dex */
public class dk40 extends qkl {

    /* JADX INFO: renamed from: e */
    public static final ResourceBundle f86592e = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: a */
    public ck40 f86593a;

    /* JADX INFO: renamed from: b */
    public PrintWriter f86594b;

    /* JADX INFO: renamed from: c */
    public boolean f86595c;

    /* JADX INFO: renamed from: d */
    public boolean f86596d;

    public dk40(HttpServletResponse httpServletResponse) {
        super(httpServletResponse);
        this.f86593a = new ck40();
    }

    /* JADX INFO: renamed from: a */
    public void m112161a() {
        if (this.f86595c) {
            return;
        }
        PrintWriter printWriter = this.f86594b;
        if (printWriter != null) {
            printWriter.flush();
        }
        setContentLength(this.f86593a.m107357k());
    }

    @Override // p149l.hke0, p149l.gke0
    public zje0 getOutputStream() throws IOException {
        if (this.f86594b == null) {
            this.f86596d = true;
            return this.f86593a;
        }
        qkq0.m175383a(f86592e.getString("err.ise.getOutputStream"));
        return null;
    }

    @Override // p149l.hke0, p149l.gke0
    public PrintWriter getWriter() throws UnsupportedEncodingException {
        if (this.f86596d) {
            qkq0.m175383a(f86592e.getString("err.ise.getWriter"));
            return null;
        }
        if (this.f86594b == null) {
            this.f86594b = new PrintWriter(new OutputStreamWriter(this.f86593a, getCharacterEncoding()));
        }
        return this.f86594b;
    }

    @Override // p149l.hke0, p149l.gke0
    public void setContentLength(int i) {
        super.setContentLength(i);
        this.f86595c = true;
    }
}
