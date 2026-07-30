package com.p000p1.mobile.putong.core.p004ui.alifree;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.alifree.AliFreeUtils;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AliFreeUtils {

    /* JADX INFO: renamed from: a */
    public static c4g0 f4515a;

    /* JADX INFO: renamed from: b */
    public static List<String> f4516b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.alifree.AliFreeUtils$a */
    public static /* synthetic */ class C0203a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4517a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f4517a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m7274d(PurchaseType purchaseType) {
        String str = C0203a.f4517a[purchaseType.ordinal()] != 1 ? "%s 通过支付宝购买 VIP，获得全额免单" : "%s 通过支付宝购买 SVIP，获得全额免单";
        List<String> listM7275e = m7275e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM7275e.iterator();
        while (it.hasNext()) {
            arrayList.add(String.format(str, m7276f(it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m7275e() {
        if (!vwb.J(f4516b)) {
            Collections.shuffle(f4516b);
            return f4516b;
        }
        if (f4515a == null) {
            f4515a = c.fromCallable(new Callable() { // from class: l.ai0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AliFreeUtils.m7277g();
                }
            }).compose(mkd0.C()).filter(new w9j() { // from class: l.bi0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((List) obj));
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.ci0
                public final void call(Object obj) {
                    AliFreeUtils.f4516b = (List) obj;
                }
            }, new e30() { // from class: l.di0
                public final void call(Object obj) {
                    CrashHelper.c((Throwable) obj);
                }
            }));
        }
        return new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.alifree.AliFreeUtils.1
            {
                add("林德伟");
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static String m7276f(String str) {
        return str.length() > 4 ? str.substring(0, 4).concat("**") : str;
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m7277g() throws Throwable {
        ArrayList arrayList;
        Throwable th;
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CoreModule.f1533b.getResources().getAssets().open("user_data.csv")));
                try {
                    arrayList = new ArrayList();
                    try {
                        bufferedReader.readLine();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                return arrayList;
                            }
                            arrayList.add(line.split(",")[1]);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    arrayList = null;
                    th = th4;
                }
            } catch (IOException e) {
                arrayList = null;
                e = e;
                CrashHelper.c(e);
                return arrayList;
            }
        } catch (IOException e2) {
            e = e2;
            CrashHelper.c(e);
            return arrayList;
        }
    }
}
