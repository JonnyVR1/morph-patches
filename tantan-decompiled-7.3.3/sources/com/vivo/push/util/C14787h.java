package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* JADX INFO: renamed from: com.vivo.push.util.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C14787h implements BaseNotifyDataAdapter {

    /* JADX INFO: renamed from: e */
    private static int f61953e;

    /* JADX INFO: renamed from: f */
    private static int f61954f;

    /* JADX INFO: renamed from: a */
    private Resources f61955a;

    /* JADX INFO: renamed from: b */
    private String f61956b;

    /* JADX INFO: renamed from: c */
    private String f61957c;

    /* JADX INFO: renamed from: d */
    private String f61958d;

    /* JADX INFO: renamed from: a */
    private int m86150a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit != null && strArrSplit.length > 0) {
                str = strArrSplit[0];
            }
            try {
                for (int i = Integer.parseInt(str); i > 0; i--) {
                    String str3 = "vivo_push_ard" + i + str2;
                    C14795p.m86190c("DefaultNotifyDataAdapter", "get notify icon : ".concat(str3));
                    int identifier = this.f61955a.getIdentifier(str3, "drawable", this.f61956b);
                    if (identifier > 0) {
                        C14795p.m86190c("DefaultNotifyDataAdapter", "find notify icon : ".concat(str3));
                        return identifier;
                    }
                }
            } catch (Exception e) {
                C14795p.m86181a("DefaultNotifyDataAdapter", e);
            }
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        if (m86151a(f61953e)) {
            return f61953e;
        }
        String str = this.f61958d;
        int iM86150a = !m86152a(str) ? -1 : m86150a(str, "_notifyicon");
        f61953e = iM86150a;
        if (m86151a(iM86150a)) {
            return f61953e;
        }
        String strSubstring = this.f61957c;
        while (true) {
            boolean zIsEmpty = TextUtils.isEmpty(strSubstring);
            Resources resources = this.f61955a;
            if (zIsEmpty) {
                return resources.getIdentifier("vivo_push_notifyicon", "drawable", this.f61956b);
            }
            int identifier = resources.getIdentifier("vivo_push_rom" + strSubstring + "_notifyicon", "drawable", this.f61956b);
            if (identifier > 0) {
                return identifier;
            }
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        if (m86151a(f61954f)) {
            return f61954f;
        }
        String str = this.f61958d;
        int iM86150a = !m86152a(str) ? -1 : m86150a(str, "_icon");
        f61954f = iM86150a;
        if (m86151a(iM86150a)) {
            return f61954f;
        }
        String strSubstring = this.f61957c;
        while (true) {
            boolean zIsEmpty = TextUtils.isEmpty(strSubstring);
            Resources resources = this.f61955a;
            if (zIsEmpty) {
                return resources.getIdentifier("vivo_push_icon", "drawable", this.f61956b);
            }
            int identifier = resources.getIdentifier("vivo_push_rom" + strSubstring + "_icon", "drawable", this.f61956b);
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
        this.f61956b = context.getPackageName();
        this.f61955a = context.getResources();
        this.f61957c = C14789j.m86153a();
        this.f61958d = Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86152a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        C14795p.m86192d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86151a(int i) {
        return (i == -1 || i == 0) ? false : true;
    }
}
