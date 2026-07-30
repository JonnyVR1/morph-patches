package p006l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.AwakeApp;
import com.p1.mobile.putong.data.AwakeAppRecord;
import com.p1.mobile.putong.data.CommonAssetsSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.ane0;
import l.o460;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qza0 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f20171a = new uqd0("pull_alive_record", "");

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f20172b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static SparseArray<InterfaceC1195a> f20173c;

    /* JADX INFO: renamed from: l.qza0$a */
    public interface InterfaceC1195a {
        /* JADX INFO: renamed from: a */
        boolean mo22522a(Context context, AwakeApp awakeApp);
    }

    /* JADX INFO: renamed from: l.qza0$b */
    public static final class C1196b implements InterfaceC1195a {
        @Override // p006l.qza0.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public boolean mo22522a(Context context, AwakeApp awakeApp) {
            Intent intent = new Intent();
            intent.setAction(awakeApp.action);
            if (ane0.d) {
                intent.setPackage(awakeApp.packageName);
            }
            intent.addFlags(32);
            intent.putExtra(TextUtils.isEmpty(awakeApp.statisticsKey) ? "extra.from_packagename" : awakeApp.statisticsKey, awakeApp.from);
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (!NullChecker.a(listQueryBroadcastReceivers) || listQueryBroadcastReceivers.size() != 1) {
                return false;
            }
            context.sendBroadcast(intent);
            return true;
        }

        public C1196b() {
        }
    }

    /* JADX INFO: renamed from: l.qza0$c */
    public static final class C1197c implements InterfaceC1195a {
        @Override // p006l.qza0.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public boolean mo22522a(Context context, AwakeApp awakeApp) {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(awakeApp.action)) {
                intent.setClassName(awakeApp.packageName, awakeApp.className);
            } else {
                intent.setAction(awakeApp.action);
                intent.setPackage(awakeApp.packageName);
            }
            intent.putExtra(TextUtils.isEmpty(awakeApp.statisticsKey) ? "extra.from_packagename" : awakeApp.statisticsKey, awakeApp.from);
            intent.addFlags(32);
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (NullChecker.a(listQueryIntentServices) && listQueryIntentServices.size() == 1) {
                try {
                    context.startService(intent);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }

        public C1197c() {
        }
    }

    static {
        SparseArray<InterfaceC1195a> sparseArray = new SparseArray<>();
        f20173c = sparseArray;
        sparseArray.put(1, new C1197c());
        f20173c.put(2, new C1196b());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22515a(@NonNull AwakeApp awakeApp) {
        if (awakeApp.cycleTime <= 0 || awakeApp.count <= 0 || awakeApp.interval <= 0) {
            return false;
        }
        int i = awakeApp.mode;
        if (i == 1) {
            return (TextUtils.isEmpty(awakeApp.packageName) || TextUtils.isEmpty(awakeApp.className)) ? false : true;
        }
        if (i == 2) {
            return !TextUtils.isEmpty(awakeApp.action);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m22516b() {
        m22520f();
    }

    /* JADX INFO: renamed from: c */
    public static List<AwakeApp> m22517c(List<AwakeApp> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AwakeApp awakeApp : list) {
            if (awakeApp != null && awakeApp.isOpen > 0 && m22515a(awakeApp)) {
                arrayList.add(awakeApp);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<AwakeApp> m22518d(List<AwakeApp> list, HashMap<String, AwakeAppRecord> map) {
        if (map.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        for (AwakeApp awakeApp : list) {
            if (map.containsKey(awakeApp.packageName)) {
                AwakeAppRecord awakeAppRecord = map.get(awakeApp.packageName);
                if ((jGuessedCurrentServerTime - awakeAppRecord.startPullAliveTime) / 3600000 >= awakeApp.cycleTime) {
                    arrayList.add(awakeApp);
                    map.remove(awakeAppRecord.package_name);
                } else if (awakeAppRecord.hasPullAliveCount < awakeApp.count && (jGuessedCurrentServerTime - awakeAppRecord.lastPullAliveTime) / 60000 > awakeApp.interval) {
                    arrayList.add(awakeApp);
                }
            } else {
                arrayList.add(awakeApp);
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static HashMap<String, AwakeAppRecord> m22519e(List<AwakeApp> list) {
        String str = (String) f20171a.get();
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        try {
            List<AwakeAppRecord> list2 = (List) AwakeAppRecord.JSON_ADAPTER.ARRAY_ADAPTER().parse(str);
            ArrayList<AwakeAppRecord> arrayList = new ArrayList();
            if (NullChecker.a(list2) && list2.size() != 0) {
                for (AwakeAppRecord awakeAppRecord : list2) {
                    Iterator<AwakeApp> it = list.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (awakeAppRecord.package_name.equals(it.next().packageName)) {
                            z = true;
                        }
                    }
                    if (z) {
                        arrayList.add(awakeAppRecord);
                    }
                }
            }
            HashMap<String, AwakeAppRecord> map = new HashMap<>();
            for (AwakeAppRecord awakeAppRecord2 : arrayList) {
                map.put(awakeAppRecord2.package_name, awakeAppRecord2);
            }
            return map;
        } catch (IOException e) {
            CrashHelper.c(e);
            return new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m22520f() {
        CommonAssetsSettings commonAssetsSettingsM11767g = qib0.f19800X.m11767g();
        if (commonAssetsSettingsM11767g == null) {
            return;
        }
        AtomicBoolean atomicBoolean = f20172b;
        if (atomicBoolean.compareAndSet(false, true)) {
            List<AwakeApp> listM22517c = m22517c(commonAssetsSettingsM11767g.pullAlive);
            if (listM22517c == null) {
                atomicBoolean.set(false);
                return;
            }
            HashMap<String, AwakeAppRecord> mapM22519e = m22519e(listM22517c);
            List<AwakeApp> listM22518d = m22518d(listM22517c, mapM22519e);
            if (listM22518d.size() == 0) {
                atomicBoolean.set(false);
                return;
            }
            List listE = o460.e(App.e);
            for (AwakeApp awakeApp : listM22518d) {
                Iterator it = listE.iterator();
                do {
                    if (!it.hasNext()) {
                        InterfaceC1195a interfaceC1195a = f20173c.get(awakeApp.mode);
                        if (!NullChecker.a(interfaceC1195a)) {
                            break;
                        }
                        interfaceC1195a.mo22522a(App.e, awakeApp);
                        m22521g(awakeApp, mapM22519e);
                        break;
                    }
                } while (!awakeApp.packageName.equals(((o460.a) it.next()).b));
            }
            f20172b.set(false);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m22521g(AwakeApp awakeApp, HashMap<String, AwakeAppRecord> map) {
        if (map.containsKey(awakeApp.packageName)) {
            AwakeAppRecord awakeAppRecord = map.get(awakeApp.packageName);
            awakeAppRecord.hasPullAliveCount++;
            awakeAppRecord.lastPullAliveTime = qib0.f19784H.guessedCurrentServerTime();
        } else {
            AwakeAppRecord awakeAppRecord2 = new AwakeAppRecord();
            awakeAppRecord2.package_name = awakeApp.packageName;
            long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
            awakeAppRecord2.startPullAliveTime = jGuessedCurrentServerTime;
            awakeAppRecord2.lastPullAliveTime = jGuessedCurrentServerTime;
            awakeAppRecord2.hasPullAliveCount = 1;
            map.put(awakeAppRecord2.package_name, awakeAppRecord2);
        }
        f20171a.put(AwakeAppRecord.JSON_ADAPTER.ARRAY_ADAPTER().serialize(new ArrayList(map.values())));
    }
}
