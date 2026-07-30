package com.tencent.could.component.common.p084ai.log;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class AiLogger {
    public AiLogConfig config;
    public C14014b printer;

    public AiLogger(Context context, AiLogConfig aiLogConfig) {
        this.config = aiLogConfig;
        this.printer = new C14014b(context, aiLogConfig);
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
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            HandlerC14015c handlerC14015c = c14014b.f58111e;
            if (handlerC14015c == null) {
                Log.e("FilePrinter", "writeHandler is null");
            } else {
                handlerC14015c.removeMessages(1);
                HandlerC14015c handlerC14015c2 = c14014b.f58111e;
                C14018f c14018f = handlerC14015c2.f58116d;
                if (c14018f != null) {
                    c14018f.m83387a();
                }
                handlerC14015c2.f58116d = null;
                c14014b.f58111e = null;
                HandlerThread handlerThread = c14014b.f58112f;
                if (handlerThread != null && handlerThread.isAlive()) {
                    c14014b.f58112f.quitSafely();
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
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            c14014b.m83382a(7, str, str2);
        }
    }

    public void debug(String str, String str2) {
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            c14014b.m83382a(3, str, str2);
        }
    }

    public void error(String str, String str2) {
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            c14014b.m83382a(6, str, str2);
        }
    }

    public void info(String str, String str2) {
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            c14014b.m83382a(4, str, str2);
        }
    }

    public void verbose(String str, String str2) {
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            c14014b.m83382a(3, str, str2);
        }
    }

    public void warn(String str, String str2) {
        C14014b c14014b = this.printer;
        if (c14014b != null) {
            c14014b.m83382a(5, str, str2);
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
