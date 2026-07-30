package p153l;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
class htq0 implements zsq0 {

    /* JADX INFO: renamed from: b */
    private static String f111576b = "content://com.vivo.vms.IdProvider/IdentifierId/";

    /* JADX INFO: renamed from: c */
    private static String f111577c = f111576b + "OAID";

    /* JADX INFO: renamed from: d */
    private static String f111578d = f111576b + "VAID_";

    /* JADX INFO: renamed from: e */
    private static String f111579e = f111576b + "AAID_";

    /* JADX INFO: renamed from: f */
    private static String f111580f = f111576b + "OAIDSTATUS";

    /* JADX INFO: renamed from: g */
    private static String f111581g = "persist.sys.identifierid.supported";

    /* JADX INFO: renamed from: a */
    private Context f111582a;

    public htq0(Context context) {
        this.f111582a = context;
    }

    /* JADX INFO: renamed from: b */
    private String m137097b(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor = null;
        string = null;
        String string = null;
        try {
            cursorQuery = this.f111582a.getContentResolver().query(Uri.parse(str), null, null, null, null);
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
    public static boolean m137098c(Context context) {
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f111576b).getAuthority(), 128);
            return (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public boolean mo100237a() {
        return "1".equals(p5r0.m170679a(f111581g, "0"));
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public String mo100236a() {
        return m137097b(f111577c);
    }
}
