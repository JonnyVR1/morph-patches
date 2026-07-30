package com.p051p1.mobile.putong.core.p058ui.alifree;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p153l.jyb;
import p153l.kcg0;
import p153l.psd0;
import p153l.qcj;
import p153l.y20;
import p153l.zh0;

/* JADX INFO: loaded from: classes9.dex */
public class AliFreeUtils {

    /* JADX INFO: renamed from: a */
    public static kcg0 f29296a;

    /* JADX INFO: renamed from: b */
    public static List<String> f29297b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.alifree.AliFreeUtils$a */
    public static /* synthetic */ class C8450a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29298a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f29298a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m45501d(PurchaseType purchaseType) {
        String str = C8450a.f29298a[purchaseType.ordinal()] != 1 ? "%s 通过支付宝购买 VIP，获得全额免单" : "%s 通过支付宝购买 SVIP，获得全额免单";
        List<String> listM45502e = m45502e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM45502e.iterator();
        while (it.hasNext()) {
            arrayList.add(String.format(str, m45503f(it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m45502e() {
        if (!jyb.m147479J(f29297b)) {
            Collections.shuffle(f29297b);
            return f29297b;
        }
        if (f29296a == null) {
            f29296a = C22421c.fromCallable(new Callable() { // from class: l.wh0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AliFreeUtils.m45504g();
                }
            }).compose(psd0.m173592C()).filter(new qcj() { // from class: l.xh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((List) obj));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.yh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    AliFreeUtils.f29297b = (List) obj;
                }
            }, new zh0()));
        }
        return new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.alifree.AliFreeUtils.1
            {
                add("林德伟");
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static String m45503f(String str) {
        return str.length() > 4 ? str.substring(0, 4).concat("**") : str;
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m45504g() throws Throwable {
        ArrayList arrayList;
        Throwable th;
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CoreModule.f18263b.getResources().getAssets().open("user_data.csv")));
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
                CrashHelper.m82479c(e);
                return arrayList;
            }
        } catch (IOException e2) {
            e = e2;
            CrashHelper.m82479c(e);
            return arrayList;
        }
    }
}
