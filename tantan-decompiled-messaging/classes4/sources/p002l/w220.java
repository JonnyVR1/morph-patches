package p002l;

import android.text.TextUtils;
import l.fld0;
import l.ggv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w220 {
    /* JADX INFO: renamed from: a */
    public static String m24290a() {
        return ((ggv) ypv.l(fld0.c)).i();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24291b() {
        String strM24290a = m24290a();
        return (TextUtils.isEmpty(strM24290a) || TextUtils.equals("0", strM24290a)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24292c() {
        return !m24291b();
    }
}
