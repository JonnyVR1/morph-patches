package p153l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.momo.mulog.exception.MULogIllegalParamsException;

/* JADX INFO: loaded from: classes7.dex */
public class eqw {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f95404a;

    /* JADX INFO: renamed from: a */
    public static fzv m122068a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new MULogIllegalParamsException("business should not be null");
        }
        if (gzv.m133125e().m133128a(str)) {
            return new fzv(str);
        }
        throw new MULogIllegalParamsException(str + " has not registered");
    }

    /* JADX INFO: renamed from: b */
    public static void m122069b(Application application, fqw fqwVar) {
        if (application == null || fqwVar == null) {
            throw new MULogIllegalParamsException("context is null or config is null");
        }
        if (f95404a) {
            gqw.m131495s("already init");
            return;
        }
        m122070c(application, fqwVar);
        gqw.m131490n(application, fqwVar);
        jqw.m146639e(application, fqwVar);
        yy0.m217919c(application);
        f95404a = true;
    }

    /* JADX INFO: renamed from: c */
    private static void m122070c(Context context, fqw fqwVar) {
        if (fqwVar.f100342a) {
            MDLog.setLevel(0);
        }
        if (jv0.f122755a == null) {
            jv0.m147004d(context);
        }
    }
}
