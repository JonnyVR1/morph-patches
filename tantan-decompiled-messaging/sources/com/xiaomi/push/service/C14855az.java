package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.xiaomi.push.C14743gi;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14750gp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p149l.dxq0;
import p149l.ilq0;
import p149l.nwq0;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.az */
/* JADX INFO: loaded from: classes2.dex */
public class C14855az {

    /* JADX INFO: renamed from: a */
    private static String f63006a;

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat f63007a;

    /* JADX INFO: renamed from: a */
    private static AtomicLong f63008a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f63007a = simpleDateFormat;
        f63006a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<C14766he> m86600a(List<C14744gj> list, String str, String str2, int i) {
        int length;
        if (list == null) {
            ilq0.m137025B("requests can not be null in TinyDataHelper.transToThriftObj().");
            return null;
        }
        if (list.size() == 0) {
            ilq0.m137025B("requests.length is 0 in TinyDataHelper.transToThriftObj().");
            return null;
        }
        ArrayList<C14766he> arrayList = new ArrayList<>();
        C14743gi c14743gi = new C14743gi();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C14744gj c14744gj = list.get(i3);
            if (c14744gj != null) {
                if (c14744gj.m85617a() == null || !c14744gj.m85617a().containsKey("item_size")) {
                    length = 0;
                } else {
                    String str3 = c14744gj.m85617a().get("item_size");
                    if (TextUtils.isEmpty(str3)) {
                        length = 0;
                    } else {
                        try {
                            length = Integer.parseInt(str3);
                        } catch (Exception unused) {
                            length = 0;
                        }
                    }
                    if (c14744gj.m85617a().size() == 1) {
                        c14744gj.m85614a((Map<String, String>) null);
                    } else {
                        c14744gj.m85617a().remove("item_size");
                    }
                }
                if (length <= 0) {
                    length = C14788m.m86277e(c14744gj).length;
                }
                if (length > i) {
                    ilq0.m137025B("TinyData is too big, ignore upload request item:" + c14744gj.m85633d());
                } else {
                    if (i2 + length > i) {
                        arrayList.add(m86598a(str, str2, c14743gi));
                        c14743gi = new C14743gi();
                        i2 = 0;
                    }
                    c14743gi.m85607a(c14744gj);
                    i2 += length;
                }
            }
        }
        if (c14743gi.m85604a() != 0) {
            arrayList.add(m86598a(str, str2, c14743gi));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m86599a() {
        String str;
        try {
            str = f63007a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f63006a, str)) {
                f63008a.set(0L);
                f63006a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str + "-" + f63008a.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    private static C14766he m86598a(String str, String str2, C14743gi c14743gi) {
        return new C14766he(User.ID_TEAM_ACCOUNT, false).m85964d(str).m85956b(str2).m85947a(dxq0.m114024h(C14788m.m86277e(c14743gi))).m85960c(EnumC14750gp.UploadTinyData.f62110a);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86602a(C14744gj c14744gj, boolean z) {
        if (c14744gj == null) {
            ilq0.m137040m("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z && TextUtils.isEmpty(c14744gj.f61879a)) {
            ilq0.m137040m("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(c14744gj.f61886d)) {
            ilq0.m137040m("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(c14744gj.f61885c)) {
            ilq0.m137040m("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!vlq0.m198846i(c14744gj.f61886d)) {
            ilq0.m137040m("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!vlq0.m198846i(c14744gj.f61885c)) {
            ilq0.m137040m("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        String str = c14744gj.f61884b;
        if (str == null || str.length() <= 30720) {
            return false;
        }
        ilq0.m137040m("item.data is too large(" + c14744gj.f61884b.length() + "), max size for data is 30720 , verfiy ClientUploadDataItem failed.");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m86601a(Context context, String str, String str2, long j, String str3) {
        C14744gj c14744gj = new C14744gj();
        c14744gj.m85632d(str);
        c14744gj.m85628c(str2);
        c14744gj.m85612a(j);
        c14744gj.m85624b(str3);
        c14744gj.m85613a("push_sdk_channel");
        c14744gj.m85640g(context.getPackageName());
        c14744gj.m85635e(context.getPackageName());
        c14744gj.m85615a(true);
        c14744gj.m85623b(System.currentTimeMillis());
        c14744gj.m85638f(m86599a());
        C14857ba.m86611a(context, c14744gj);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86603a(String str) {
        return !nwq0.m161886i() || "com.miui.hybrid".equals(str);
    }
}
