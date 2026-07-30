package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.xiaomi.push.C14891gi;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14898gp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p153l.bvq0;
import p153l.j6r0;
import p153l.ouq0;
import p153l.t5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.az */
/* JADX INFO: loaded from: classes2.dex */
public class C15003az {

    /* JADX INFO: renamed from: a */
    private static String f63853a;

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat f63854a;

    /* JADX INFO: renamed from: a */
    private static AtomicLong f63855a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f63854a = simpleDateFormat;
        f63853a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<C14914he> m87771a(List<C14892gj> list, String str, String str2, int i) {
        int length;
        if (list == null) {
            ouq0.m169378B("requests can not be null in TinyDataHelper.transToThriftObj().");
            return null;
        }
        if (list.size() == 0) {
            ouq0.m169378B("requests.length is 0 in TinyDataHelper.transToThriftObj().");
            return null;
        }
        ArrayList<C14914he> arrayList = new ArrayList<>();
        C14891gi c14891gi = new C14891gi();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C14892gj c14892gj = list.get(i3);
            if (c14892gj != null) {
                if (c14892gj.m86788a() == null || !c14892gj.m86788a().containsKey("item_size")) {
                    length = 0;
                } else {
                    String str3 = c14892gj.m86788a().get("item_size");
                    if (TextUtils.isEmpty(str3)) {
                        length = 0;
                    } else {
                        try {
                            length = Integer.parseInt(str3);
                        } catch (Exception unused) {
                            length = 0;
                        }
                    }
                    if (c14892gj.m86788a().size() == 1) {
                        c14892gj.m86785a((Map<String, String>) null);
                    } else {
                        c14892gj.m86788a().remove("item_size");
                    }
                }
                if (length <= 0) {
                    length = C14936m.m87448e(c14892gj).length;
                }
                if (length > i) {
                    ouq0.m169378B("TinyData is too big, ignore upload request item:" + c14892gj.m86804d());
                } else {
                    if (i2 + length > i) {
                        arrayList.add(m87769a(str, str2, c14891gi));
                        c14891gi = new C14891gi();
                        i2 = 0;
                    }
                    c14891gi.m86778a(c14892gj);
                    i2 += length;
                }
            }
        }
        if (c14891gi.m86775a() != 0) {
            arrayList.add(m87769a(str, str2, c14891gi));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m87770a() {
        String str;
        try {
            str = f63854a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f63853a, str)) {
                f63855a.set(0L);
                f63853a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str + "-" + f63855a.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    private static C14914he m87769a(String str, String str2, C14891gi c14891gi) {
        return new C14914he(User.ID_TEAM_ACCOUNT, false).m87135d(str).m87127b(str2).m87118a(j6r0.m143697h(C14936m.m87448e(c14891gi))).m87131c(EnumC14898gp.UploadTinyData.f62957a);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87773a(C14892gj c14892gj, boolean z) {
        if (c14892gj == null) {
            ouq0.m169393m("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z && TextUtils.isEmpty(c14892gj.f62726a)) {
            ouq0.m169393m("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(c14892gj.f62733d)) {
            ouq0.m169393m("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(c14892gj.f62732c)) {
            ouq0.m169393m("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!bvq0.m106595i(c14892gj.f62733d)) {
            ouq0.m169393m("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!bvq0.m106595i(c14892gj.f62732c)) {
            ouq0.m169393m("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        String str = c14892gj.f62731b;
        if (str == null || str.length() <= 30720) {
            return false;
        }
        ouq0.m169393m("item.data is too large(" + c14892gj.f62731b.length() + "), max size for data is 30720 , verfiy ClientUploadDataItem failed.");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m87772a(Context context, String str, String str2, long j, String str3) {
        C14892gj c14892gj = new C14892gj();
        c14892gj.m86803d(str);
        c14892gj.m86799c(str2);
        c14892gj.m86783a(j);
        c14892gj.m86795b(str3);
        c14892gj.m86784a("push_sdk_channel");
        c14892gj.m86811g(context.getPackageName());
        c14892gj.m86806e(context.getPackageName());
        c14892gj.m86786a(true);
        c14892gj.m86794b(System.currentTimeMillis());
        c14892gj.m86809f(m87770a());
        C15005ba.m87782a(context, c14892gj);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87774a(String str) {
        return !t5r0.m189425i() || "com.miui.hybrid".equals(str);
    }
}
