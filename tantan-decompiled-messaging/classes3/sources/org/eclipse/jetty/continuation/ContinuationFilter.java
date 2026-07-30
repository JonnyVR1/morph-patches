package org.eclipse.jetty.continuation;

import java.io.IOException;
import javax.servlet.ServletException;
import l.bke0;
import l.gke0;
import l.jii;
import l.qii;
import l.vii;
import l.vje0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ContinuationFilter implements jii {
    static boolean __debug;
    static boolean _initialized;
    vje0 _context;
    private boolean _debug;
    private boolean _faux;
    private boolean _filtered;
    private boolean _jetty6;

    public interface FilteredContinuation extends Continuation {
        boolean enter(gke0 gke0Var);

        boolean exit();
    }

    private void debug(String str, Throwable th) {
        if (this._debug) {
            boolean z = th instanceof ContinuationThrowable;
            vje0 vje0Var = this._context;
            if (!z) {
                vje0Var.log(str, th);
                return;
            }
            vje0Var.log(str + ":" + th);
        }
    }

    public void destroy() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    public void doFilter(bke0 bke0Var, gke0 gke0Var, qii qiiVar) throws ServletException, IOException {
        FilteredContinuation fauxContinuation;
        if (!this._filtered) {
            try {
                qiiVar.doFilter(bke0Var, gke0Var);
                return;
            } catch (ContinuationThrowable e) {
                debug("caught", e);
                return;
            }
        }
        Continuation continuation = (Continuation) bke0Var.getAttribute(Continuation.ATTRIBUTE);
        if (!this._faux || (continuation != null && (continuation instanceof FauxContinuation))) {
            fauxContinuation = (FilteredContinuation) continuation;
        } else {
            fauxContinuation = new FauxContinuation(bke0Var);
            bke0Var.setAttribute(Continuation.ATTRIBUTE, fauxContinuation);
        }
        while (true) {
            boolean z = false;
            while (!z) {
                z = true;
                if (fauxContinuation != null) {
                    try {
                        try {
                            if (!fauxContinuation.enter(gke0Var)) {
                                if (fauxContinuation == null) {
                                    fauxContinuation = (FilteredContinuation) bke0Var.getAttribute(Continuation.ATTRIBUTE);
                                }
                                if (fauxContinuation == null || fauxContinuation.exit()) {
                                }
                            }
                        } catch (ContinuationThrowable e2) {
                            debug("faux", e2);
                            if (fauxContinuation == null) {
                                fauxContinuation = (FilteredContinuation) bke0Var.getAttribute(Continuation.ATTRIBUTE);
                            }
                            if (fauxContinuation == null) {
                                continue;
                            } else if (fauxContinuation.exit()) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fauxContinuation == null) {
                            fauxContinuation = (FilteredContinuation) bke0Var.getAttribute(Continuation.ATTRIBUTE);
                        }
                        if (fauxContinuation != null) {
                            fauxContinuation.exit();
                        }
                        throw th;
                    }
                }
                qiiVar.doFilter(bke0Var, gke0Var);
                if (fauxContinuation == null) {
                    fauxContinuation = (FilteredContinuation) bke0Var.getAttribute(Continuation.ATTRIBUTE);
                }
                if (fauxContinuation == null) {
                    continue;
                }
            }
            return;
        }
    }

    public void init(vii viiVar) throws ServletException {
        boolean zEquals = "org.eclipse.jetty.servlet".equals(viiVar.getClass().getPackage().getName());
        this._context = viiVar.getServletContext();
        String initParameter = viiVar.getInitParameter("debug");
        boolean z = initParameter != null && Boolean.parseBoolean(initParameter);
        this._debug = z;
        if (z) {
            __debug = true;
        }
        String initParameter2 = viiVar.getInitParameter("jetty6");
        if (initParameter2 == null) {
            initParameter2 = viiVar.getInitParameter("partial");
        }
        if (initParameter2 != null) {
            this._jetty6 = Boolean.parseBoolean(initParameter2);
        } else {
            this._jetty6 = ContinuationSupport.__jetty6 && !zEquals;
        }
        String initParameter3 = viiVar.getInitParameter("faux");
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
