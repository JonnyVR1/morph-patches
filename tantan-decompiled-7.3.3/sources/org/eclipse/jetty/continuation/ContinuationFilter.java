package org.eclipse.jetty.continuation;

import com.p074ss.bytertc.engine.BuildConfig;
import java.io.IOException;
import javax.servlet.ServletException;
import p153l.ase0;
import p153l.gli;
import p153l.gse0;
import p153l.lse0;
import p153l.nli;
import p153l.sli;

/* JADX INFO: loaded from: classes2.dex */
public class ContinuationFilter implements gli {
    static boolean __debug;
    static boolean _initialized;
    ase0 _context;
    private boolean _debug;
    private boolean _faux;
    private boolean _filtered;
    private boolean _jetty6;

    public interface FilteredContinuation extends Continuation {
        boolean enter(lse0 lse0Var);

        boolean exit();
    }

    private void debug(String str, Throwable th) {
        if (this._debug) {
            boolean z = th instanceof ContinuationThrowable;
            ase0 ase0Var = this._context;
            if (!z) {
                ase0Var.log(str, th);
                return;
            }
            ase0Var.log(str + ":" + th);
        }
    }

    @Override // p153l.gli
    public void destroy() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    @Override // p153l.gli
    public void doFilter(gse0 gse0Var, lse0 lse0Var, nli nliVar) throws ServletException, IOException {
        FilteredContinuation fauxContinuation;
        if (!this._filtered) {
            try {
                nliVar.doFilter(gse0Var, lse0Var);
                return;
            } catch (ContinuationThrowable e) {
                debug("caught", e);
                return;
            }
        }
        Continuation continuation = (Continuation) gse0Var.getAttribute(Continuation.ATTRIBUTE);
        if (!this._faux || (continuation != null && (continuation instanceof FauxContinuation))) {
            fauxContinuation = (FilteredContinuation) continuation;
        } else {
            fauxContinuation = new FauxContinuation(gse0Var);
            gse0Var.setAttribute(Continuation.ATTRIBUTE, fauxContinuation);
        }
        while (true) {
            boolean z = false;
            while (!z) {
                z = true;
                if (fauxContinuation != null) {
                    try {
                        try {
                            if (!fauxContinuation.enter(lse0Var)) {
                                if (fauxContinuation == null) {
                                    fauxContinuation = (FilteredContinuation) gse0Var.getAttribute(Continuation.ATTRIBUTE);
                                }
                                if (fauxContinuation == null || fauxContinuation.exit()) {
                                }
                            }
                        } catch (ContinuationThrowable e2) {
                            debug("faux", e2);
                            if (fauxContinuation == null) {
                                fauxContinuation = (FilteredContinuation) gse0Var.getAttribute(Continuation.ATTRIBUTE);
                            }
                            if (fauxContinuation == null) {
                                continue;
                            } else if (fauxContinuation.exit()) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fauxContinuation == null) {
                            fauxContinuation = (FilteredContinuation) gse0Var.getAttribute(Continuation.ATTRIBUTE);
                        }
                        if (fauxContinuation != null) {
                            fauxContinuation.exit();
                        }
                        throw th;
                    }
                }
                nliVar.doFilter(gse0Var, lse0Var);
                if (fauxContinuation == null) {
                    fauxContinuation = (FilteredContinuation) gse0Var.getAttribute(Continuation.ATTRIBUTE);
                }
                if (fauxContinuation == null) {
                    continue;
                }
            }
            return;
        }
    }

    @Override // p153l.gli
    public void init(sli sliVar) throws ServletException {
        boolean zEquals = "org.eclipse.jetty.servlet".equals(sliVar.getClass().getPackage().getName());
        this._context = sliVar.getServletContext();
        String initParameter = sliVar.getInitParameter(BuildConfig.BUILD_TYPE);
        boolean z = initParameter != null && Boolean.parseBoolean(initParameter);
        this._debug = z;
        if (z) {
            __debug = true;
        }
        String initParameter2 = sliVar.getInitParameter("jetty6");
        if (initParameter2 == null) {
            initParameter2 = sliVar.getInitParameter("partial");
        }
        if (initParameter2 != null) {
            this._jetty6 = Boolean.parseBoolean(initParameter2);
        } else {
            this._jetty6 = ContinuationSupport.__jetty6 && !zEquals;
        }
        String initParameter3 = sliVar.getInitParameter("faux");
        if (initParameter3 != null) {
            this._faux = Boolean.parseBoolean(initParameter3);
        } else {
            this._faux = (zEquals || this._jetty6 || this._context.getMajorVersion() >= 3) ? false : true;
        }
        this._filtered = this._faux || this._jetty6;
        if (this._debug) {
            this._context.log("ContinuationFilter  jetty=" + zEquals + " jetty6=" + this._jetty6 + " faux=" + this._faux + " filtered=" + this._filtered + " servlet3=" + ContinuationSupport.__servlet3);
        }
        _initialized = true;
    }

    private void debug(String str) {
        if (this._debug) {
            this._context.log(str);
        }
    }
}
