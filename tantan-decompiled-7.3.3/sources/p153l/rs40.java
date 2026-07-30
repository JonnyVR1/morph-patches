package p153l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import javax.servlet.http.HttpServletResponse;

/* JADX INFO: loaded from: classes2.dex */
public class rs40 extends gnl {

    /* JADX INFO: renamed from: e */
    public static final ResourceBundle f164630e = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: a */
    public qs40 f164631a;

    /* JADX INFO: renamed from: b */
    public PrintWriter f164632b;

    /* JADX INFO: renamed from: c */
    public boolean f164633c;

    /* JADX INFO: renamed from: d */
    public boolean f164634d;

    public rs40(HttpServletResponse httpServletResponse) {
        super(httpServletResponse);
        this.f164631a = new qs40();
    }

    /* JADX INFO: renamed from: a */
    public void m182854a() {
        if (this.f164633c) {
            return;
        }
        PrintWriter printWriter = this.f164632b;
        if (printWriter != null) {
            printWriter.flush();
        }
        setContentLength(this.f164631a.m177724k());
    }

    @Override // p153l.mse0, p153l.lse0
    public ese0 getOutputStream() throws IOException {
        if (this.f164632b == null) {
            this.f164634d = true;
            return this.f164631a;
        }
        wtq0.m207906a(f164630e.getString("err.ise.getOutputStream"));
        return null;
    }

    @Override // p153l.mse0, p153l.lse0
    public PrintWriter getWriter() throws UnsupportedEncodingException {
        if (this.f164634d) {
            wtq0.m207906a(f164630e.getString("err.ise.getWriter"));
            return null;
        }
        if (this.f164632b == null) {
            this.f164632b = new PrintWriter(new OutputStreamWriter(this.f164631a, getCharacterEncoding()));
        }
        return this.f164632b;
    }

    @Override // p153l.mse0, p153l.lse0
    public void setContentLength(int i) {
        super.setContentLength(i);
        this.f164633c = true;
    }
}
