package com.p046p1.mobile.putong.core.p053ui.alifree;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.di0;
import p149l.e30;
import p149l.mkd0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class AliFreeUtils {

    /* JADX INFO: renamed from: a */
    public static c4g0 f28448a;

    /* JADX INFO: renamed from: b */
    public static List<String> f28449b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.alifree.AliFreeUtils$a */
    public static /* synthetic */ class C8287a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28450a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f28450a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m44318d(PurchaseType purchaseType) {
        String str = C8287a.f28450a[purchaseType.ordinal()] != 1 ? "%s 通过支付宝购买 VIP，获得全额免单" : "%s 通过支付宝购买 SVIP，获得全额免单";
        List<String> listM44319e = m44319e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM44319e.iterator();
        while (it.hasNext()) {
            arrayList.add(String.format(str, m44320f(it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m44319e() {
        if (!vwb.m200296J(f28449b)) {
            Collections.shuffle(f28449b);
            return f28449b;
        }
        if (f28448a == null) {
            f28448a = C22306c.fromCallable(new Callable() { // from class: l.ai0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AliFreeUtils.m44321g();
                }
            }).compose(mkd0.m154951C()).filter(new w9j() { // from class: l.bi0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((List) obj));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.ci0
                @Override // p149l.e30
                public final void call(Object obj) {
                    AliFreeUtils.f28449b = (List) obj;
                }
            }, new di0()));
        }
        return new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.alifree.AliFreeUtils.1
            {
                add("林德伟");
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static String m44320f(String str) {
        return str.length() > 4 ? str.substring(0, 4).concat("**") : str;
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m44321g() throws Throwable {
        ArrayList arrayList;
        Throwable th;
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CoreModule.f17544b.getResources().getAssets().open("user_data.csv")));
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
                            arrayList.add(line.split(Constants.SEPARATOR_COMMA)[1]);
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
                CrashHelper.m81296c(e);
                return arrayList;
            }
        } catch (IOException e2) {
            e = e2;
            CrashHelper.m81296c(e);
            return arrayList;
        }
    }
}
