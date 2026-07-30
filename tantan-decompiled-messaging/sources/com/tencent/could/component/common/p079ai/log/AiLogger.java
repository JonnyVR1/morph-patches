package com.tencent.could.component.common.p079ai.log;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class AiLogger {
    public AiLogConfig config;
    public C13851b printer;

    public AiLogger(Context context, AiLogConfig aiLogConfig) {
        this.config = aiLogConfig;
        this.printer = new C13851b(context, aiLogConfig);
    }

    private String formatString(String str, Object... objArr) {
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(objArr[i]);
        }
        return sb.toString();
    }

    public void asset(String str) {
        asset(this.config.getDefaultTag(), str);
    }

    public void debug(String str) {
        debug(this.config.getDefaultTag(), str);
    }

    public void error(String str) {
        error(this.config.getDefaultTag(), str);
    }

    public void info(String str) {
        info(this.config.getDefaultTag(), str);
    }

    public void release() {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            HandlerC13852c handlerC13852c = c13851b.f57263e;
            if (handlerC13852c == null) {
                Log.e("FilePrinter", "writeHandler is null");
            } else {
                handlerC13852c.removeMessages(1);
                HandlerC13852c handlerC13852c2 = c13851b.f57263e;
                C13855f c13855f = handlerC13852c2.f57268d;
                if (c13855f != null) {
                    c13855f.m82204a();
                }
                handlerC13852c2.f57268d = null;
                c13851b.f57263e = null;
                HandlerThread handlerThread = c13851b.f57264f;
                if (handlerThread != null && handlerThread.isAlive()) {
                    c13851b.f57264f.quitSafely();
                }
            }
        }
        this.printer = null;
    }

    public void verbose(String str) {
        verbose(this.config.getDefaultTag(), str);
    }

    public void warn(String str) {
        warn(this.config.getDefaultTag(), str);
    }

    public void asset(String str, String str2) {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            c13851b.m82199a(7, str, str2);
        }
    }

    public void debug(String str, String str2) {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            c13851b.m82199a(3, str, str2);
        }
    }

    public void error(String str, String str2) {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            c13851b.m82199a(6, str, str2);
        }
    }

    public void info(String str, String str2) {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            c13851b.m82199a(4, str, str2);
        }
    }

    public void verbose(String str, String str2) {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            c13851b.m82199a(3, str, str2);
        }
    }

    public void warn(String str, String str2) {
        C13851b c13851b = this.printer;
        if (c13851b != null) {
            c13851b.m82199a(5, str, str2);
        }
    }

    public void asset(String str, String str2, Object... objArr) {
        asset(str, formatString(str2, objArr));
    }

    public void debug(String str, String str2, Object... objArr) {
        debug(str, formatString(str2, objArr));
    }

    public void error(String str, String str2, Object... objArr) {
        error(str, formatString(str2, objArr));
    }

    public void info(String str, String str2, Object... objArr) {
        info(str, formatString(str2, objArr));
    }

    public void verbose(String str, String str2, Object... objArr) {
        verbose(str, formatString(str2, objArr));
    }

    public void warn(String str, String str2, Object... objArr) {
        warn(str, formatString(str2, objArr));
    }
}
