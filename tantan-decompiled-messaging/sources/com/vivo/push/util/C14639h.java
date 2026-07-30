package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* JADX INFO: renamed from: com.vivo.push.util.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C14639h implements BaseNotifyDataAdapter {

    /* JADX INFO: renamed from: e */
    private static int f61106e;

    /* JADX INFO: renamed from: f */
    private static int f61107f;

    /* JADX INFO: renamed from: a */
    private Resources f61108a;

    /* JADX INFO: renamed from: b */
    private String f61109b;

    /* JADX INFO: renamed from: c */
    private String f61110c;

    /* JADX INFO: renamed from: d */
    private String f61111d;

    /* JADX INFO: renamed from: a */
    private int m84979a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit != null && strArrSplit.length > 0) {
                str = strArrSplit[0];
            }
            try {
                for (int i = Integer.parseInt(str); i > 0; i--) {
                    String str3 = "vivo_push_ard" + i + str2;
                    C14647p.m85019c("DefaultNotifyDataAdapter", "get notify icon : ".concat(str3));
                    int identifier = this.f61108a.getIdentifier(str3, "drawable", this.f61109b);
                    if (identifier > 0) {
                        C14647p.m85019c("DefaultNotifyDataAdapter", "find notify icon : ".concat(str3));
                        return identifier;
                    }
                }
            } catch (Exception e) {
                C14647p.m85010a("DefaultNotifyDataAdapter", e);
            }
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        if (m84980a(f61106e)) {
            return f61106e;
        }
        String str = this.f61111d;
        int iM84979a = !m84981a(str) ? -1 : m84979a(str, "_notifyicon");
        f61106e = iM84979a;
        if (m84980a(iM84979a)) {
            return f61106e;
        }
        String strSubstring = this.f61110c;
        while (true) {
            boolean zIsEmpty = TextUtils.isEmpty(strSubstring);
            Resources resources = this.f61108a;
            if (zIsEmpty) {
                return resources.getIdentifier("vivo_push_notifyicon", "drawable", this.f61109b);
            }
            int identifier = resources.getIdentifier("vivo_push_rom" + strSubstring + "_notifyicon", "drawable", this.f61109b);
            if (identifier > 0) {
                return identifier;
            }
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        if (m84980a(f61107f)) {
            return f61107f;
        }
        String str = this.f61111d;
        int iM84979a = !m84981a(str) ? -1 : m84979a(str, "_icon");
        f61107f = iM84979a;
        if (m84980a(iM84979a)) {
            return f61107f;
        }
        String strSubstring = this.f61110c;
        while (true) {
            boolean zIsEmpty = TextUtils.isEmpty(strSubstring);
            Resources resources = this.f61108a;
            if (zIsEmpty) {
                return resources.getIdentifier("vivo_push_icon", "drawable", this.f61109b);
            }
            int identifier = resources.getIdentifier("vivo_push_rom" + strSubstring + "_icon", "drawable", this.f61109b);
            if (identifier > 0) {
                return identifier;
            }
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return 2;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.f61109b = context.getPackageName();
        this.f61108a = context.getResources();
        this.f61110c = C14641j.m84982a();
        this.f61111d = Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m84981a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        C14647p.m85021d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m84980a(int i) {
        return (i == -1 || i == 0) ? false : true;
    }
}
