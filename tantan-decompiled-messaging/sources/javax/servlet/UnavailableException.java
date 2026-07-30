package javax.servlet;

import p149l.tje0;

/* JADX INFO: loaded from: classes2.dex */
public class UnavailableException extends ServletException {
    private boolean permanent;
    private int seconds;
    private tje0 servlet;

    public UnavailableException(int i, tje0 tje0Var, String str) {
        super(str);
        this.servlet = tje0Var;
        if (i <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i;
        }
        this.permanent = false;
    }

    public tje0 getServlet() {
        return this.servlet;
    }

    public int getUnavailableSeconds() {
        if (this.permanent) {
            return -1;
        }
        return this.seconds;
    }

    public boolean isPermanent() {
        return this.permanent;
    }

    public UnavailableException(tje0 tje0Var, String str) {
        super(str);
        this.servlet = tje0Var;
        this.permanent = true;
    }

    public UnavailableException(String str) {
        super(str);
        this.permanent = true;
    }

    public UnavailableException(String str, int i) {
        super(str);
        if (i <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i;
        }
        this.permanent = false;
    }
}
