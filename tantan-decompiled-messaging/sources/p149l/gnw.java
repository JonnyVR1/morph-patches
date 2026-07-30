package p149l;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.momo.mulog.exception.MULogIllegalParamsException;

/* JADX INFO: loaded from: classes7.dex */
public class gnw {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f103630a;

    /* JADX INFO: renamed from: a */
    public static gxv m127190a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new MULogIllegalParamsException("business should not be null");
        }
        if (hxv.m133419e().m133422a(str)) {
            return new gxv(str);
        }
        throw new MULogIllegalParamsException(str + " has not registered");
    }

    /* JADX INFO: renamed from: b */
    public static void m127191b(Application application, hnw hnwVar) {
        if (application == null || hnwVar == null) {
            throw new MULogIllegalParamsException("context is null or config is null");
        }
        if (f103630a) {
            inw.m137181s("already init");
            return;
        }
        m127192c(application, hnwVar);
        inw.m137176n(application, hnwVar);
        lnw.m150748e(application, hnwVar);
        ry0.m181656c(application);
        f103630a = true;
    }

    /* JADX INFO: renamed from: c */
    private static void m127192c(Context context, hnw hnwVar) {
        if (hnwVar.f108722a) {
            MDLog.setLevel(0);
        }
        if (ev0.f93300a == null) {
            ev0.m118236d(context);
        }
    }
}
