package p149l;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
class bkq0 implements tjq0 {

    /* JADX INFO: renamed from: b */
    private static String f76117b = "content://com.vivo.vms.IdProvider/IdentifierId/";

    /* JADX INFO: renamed from: c */
    private static String f76118c = f76117b + "OAID";

    /* JADX INFO: renamed from: d */
    private static String f76119d = f76117b + "VAID_";

    /* JADX INFO: renamed from: e */
    private static String f76120e = f76117b + "AAID_";

    /* JADX INFO: renamed from: f */
    private static String f76121f = f76117b + "OAIDSTATUS";

    /* JADX INFO: renamed from: g */
    private static String f76122g = "persist.sys.identifierid.supported";

    /* JADX INFO: renamed from: a */
    private Context f76123a;

    public bkq0(Context context) {
        this.f76123a = context;
    }

    /* JADX INFO: renamed from: b */
    private String m102503b(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor = null;
        string = null;
        String string = null;
        try {
            cursorQuery = this.f76123a.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return string;
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m102504c(Context context) {
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f76117b).getAuthority(), 128);
            return (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public boolean mo97175a() {
        return "1".equals(jwq0.m143665a(f76122g, "0"));
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public String mo97174a() {
        return m102503b(f76118c);
    }
}
