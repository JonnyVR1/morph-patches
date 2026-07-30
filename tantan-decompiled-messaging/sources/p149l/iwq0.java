package p149l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class iwq0 {

    /* JADX INFO: renamed from: a */
    private String f115292a = null;

    /* JADX INFO: renamed from: b */
    private String f115293b = null;

    /* JADX INFO: renamed from: c */
    private int f115294c = -1;

    public iwq0(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public String m138758a() {
        if (!TextUtils.isEmpty(this.f115292a) && !"0".equals(this.f115292a)) {
            return this.f115292a;
        }
        if (!TextUtils.isEmpty(this.f115293b) && !"0".equals(this.f115293b)) {
            return this.f115293b;
        }
        String strM194563f = hrq0.m132693b().m194563f();
        this.f115292a = strM194563f;
        if (!TextUtils.isEmpty(strM194563f) && !"0".equals(this.f115292a)) {
            return this.f115292a;
        }
        String strM118499g = ewq0.m118487c().m118499g();
        this.f115293b = strM118499g;
        return strM118499g;
    }

    /* JADX INFO: renamed from: b */
    public void m138759b(String str) {
        this.f115292a = str;
        ewq0.m118487c().m118501i(str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m138760c() {
        return this.f115292a != null;
    }
}
