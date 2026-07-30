package org.eclipse.jetty.server.handler;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.util.DateCache;
import org.eclipse.jetty.util.RolloverFileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class DebugHandler extends HandlerWrapper {
    private DateCache _date = new DateCache("HH:mm:ss", Locale.US);
    private OutputStream _out;
    private PrintStream _print;

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        if (this._out == null) {
            this._out = new RolloverFileOutputStream("./logs/yyyy_mm_dd.debug.log", true);
        }
        this._print = new PrintStream(this._out);
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
        this._print.close();
    }

    public OutputStream getOutputStream() {
        return this._out;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0229  */
    /* JADX WARN: Code duplicated, block: B:81:0x023a  */
    /* JADX WARN: Code duplicated, block: B:83:0x023e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0241  */
    /* JADX WARN: Code duplicated, block: B:85:0x0244  */
    /* JADX WARN: Code duplicated, block: B:87:0x025d  */
    /* JADX WARN: Code duplicated, block: B:89:0x026b  */
    /* JADX WARN: Code duplicated, block: B:90:0x026e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0272  */
    /* JADX WARN: Code duplicated, block: B:93:0x0275  */
    /* JADX WARN: Code duplicated, block: B:97:0x0290  */
    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
        boolean z;
        String strNow;
        int iLastMs;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Response response = request.getResponse();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        String str9 = (String) httpServletRequest.getAttribute("org.eclipse.jetty.thread.name");
        if (str9 == null) {
            str9 = name + ":" + request.getScheme() + "://" + request.getLocalAddr() + ":" + request.getLocalPort() + request.getUri();
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        String str10 = str9;
        try {
            try {
                String strNow2 = this._date.now();
                int iLastMs2 = this._date.lastMs();
                PrintStream printStream = this._print;
                try {
                    if (z2) {
                        str4 = ".";
                        StringBuilder sb = new StringBuilder();
                        sb.append(strNow2);
                        if (iLastMs2 > 99) {
                            str8 = str4;
                        } else {
                            str8 = iLastMs2 > 9 ? ".0" : ".00";
                        }
                        sb.append(str8);
                        sb.append(iLastMs2);
                        sb.append(":");
                        sb.append(str10);
                        sb.append(" RETRY");
                        printStream.println(sb.toString());
                    } else {
                        str4 = ".";
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strNow2);
                        if (iLastMs2 > 99) {
                            str5 = str4;
                        } else {
                            str5 = iLastMs2 > 9 ? ".0" : ".00";
                        }
                        sb2.append(str5);
                        sb2.append(iLastMs2);
                        sb2.append(":");
                        sb2.append(str10);
                        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb2.append(request.getRemoteAddr());
                        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb2.append(httpServletRequest.getMethod());
                        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sb2.append(request.getHeader("Cookie"));
                        sb2.append("; ");
                        sb2.append(request.getHeader("User-Agent"));
                        printStream.println(sb2.toString());
                    }
                    threadCurrentThread.setName(str10);
                    getHandler().handle(str, request, httpServletRequest, httpServletResponse);
                    threadCurrentThread.setName(name);
                    String strNow3 = this._date.now();
                    int iLastMs3 = this._date.lastMs();
                    if (request.getAsyncContinuation().isSuspended()) {
                        httpServletRequest.setAttribute("org.eclipse.jetty.thread.name", str10);
                        PrintStream printStream2 = this._print;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strNow3);
                        if (iLastMs3 > 99) {
                            str7 = str4;
                        } else {
                            str7 = iLastMs3 > 9 ? ".0" : ".00";
                        }
                        sb3.append(str7);
                        sb3.append(iLastMs3);
                        sb3.append(":");
                        sb3.append(str10);
                        sb3.append(" SUSPEND");
                        printStream2.println(sb3.toString());
                        return;
                    }
                    PrintStream printStream3 = this._print;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(strNow3);
                    if (iLastMs3 > 99) {
                        str6 = str4;
                    } else {
                        str6 = iLastMs3 > 9 ? ".0" : ".00";
                    }
                    sb4.append(str6);
                    sb4.append(iLastMs3);
                    sb4.append(":");
                    sb4.append(str10);
                    sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb4.append(response.getStatus());
                    sb4.append("");
                    sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb4.append(response.getContentType());
                    sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb4.append(response.getContentCount());
                    printStream3.println(sb4.toString());
                } catch (IOException e) {
                    e = e;
                    e.toString();
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    e.toString();
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    e.toString();
                    throw e;
                } catch (ServletException e4) {
                    e = e4;
                    String str11 = e.toString() + ":" + e.getCause();
                    throw e;
                }
            } catch (Throwable th) {
                th = th;
                threadCurrentThread.setName(name);
                strNow = this._date.now();
                iLastMs = this._date.lastMs();
                if (request.getAsyncContinuation().isSuspended()) {
                    httpServletRequest.setAttribute("org.eclipse.jetty.thread.name", str10);
                    PrintStream printStream4 = this._print;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(strNow);
                    if (iLastMs <= 99) {
                        str3 = ".";
                    } else if (iLastMs > 9) {
                        str3 = ".0";
                    } else {
                        str3 = ".00";
                    }
                    sb5.append(str3);
                    sb5.append(iLastMs);
                    sb5.append(":");
                    sb5.append(str10);
                    sb5.append(" SUSPEND");
                    printStream4.println(sb5.toString());
                } else {
                    PrintStream printStream5 = this._print;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(strNow);
                    if (iLastMs > 99) {
                        str2 = ".";
                    } else if (iLastMs > 9) {
                        str2 = ".0";
                    } else {
                        str2 = ".00";
                    }
                    sb6.append(str2);
                    sb6.append(iLastMs);
                    sb6.append(":");
                    sb6.append(str10);
                    sb6.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb6.append(response.getStatus());
                    sb6.append(0 != 0 ? "/".concat(null) : "");
                    sb6.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb6.append(response.getContentType());
                    sb6.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb6.append(response.getContentCount());
                    printStream5.println(sb6.toString());
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Error e6) {
            e = e6;
        } catch (RuntimeException e7) {
            e = e7;
        } catch (ServletException e8) {
            e = e8;
        } catch (Throwable th2) {
            th = th2;
            threadCurrentThread.setName(name);
            strNow = this._date.now();
            iLastMs = this._date.lastMs();
            if (request.getAsyncContinuation().isSuspended()) {
                httpServletRequest.setAttribute("org.eclipse.jetty.thread.name", str10);
                PrintStream printStream6 = this._print;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(strNow);
                if (iLastMs <= 99) {
                    str3 = ".";
                } else if (iLastMs > 9) {
                    str3 = ".0";
                } else {
                    str3 = ".00";
                }
                sb7.append(str3);
                sb7.append(iLastMs);
                sb7.append(":");
                sb7.append(str10);
                sb7.append(" SUSPEND");
                printStream6.println(sb7.toString());
            } else {
                PrintStream printStream7 = this._print;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(strNow);
                if (iLastMs > 99) {
                    str2 = ".";
                } else if (iLastMs > 9) {
                    str2 = ".0";
                } else {
                    str2 = ".00";
                }
                sb8.append(str2);
                sb8.append(iLastMs);
                sb8.append(":");
                sb8.append(str10);
                sb8.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb8.append(response.getStatus());
                sb8.append(0 != 0 ? "/".concat(null) : "");
                sb8.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb8.append(response.getContentType());
                sb8.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb8.append(response.getContentCount());
                printStream7.println(sb8.toString());
            }
            throw th;
        }
    }

    public void setOutputStream(OutputStream outputStream) {
        this._out = outputStream;
    }
}
