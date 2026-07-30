package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.AwakeApp;
import com.p051p1.mobile.putong.data.AwakeAppRecord;
import com.p051p1.mobile.putong.data.CommonAssetsSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class u7b0 {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f177891a = new wyd0("pull_alive_record", "");

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f177892b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static SparseArray<InterfaceC20514a> f177893c;

    /* JADX INFO: renamed from: l.u7b0$a */
    public interface InterfaceC20514a {
        /* JADX INFO: renamed from: a */
        boolean mo194852a(Context context, AwakeApp awakeApp);
    }

    /* JADX INFO: renamed from: l.u7b0$b */
    public static final class C20515b implements InterfaceC20514a {
        @Override // p153l.u7b0.InterfaceC20514a
        /* JADX INFO: renamed from: a */
        public boolean mo194852a(Context context, AwakeApp awakeApp) {
            Intent intent = new Intent();
            intent.setAction(awakeApp.action);
            if (hve0.f111752d) {
                intent.setPackage(awakeApp.packageName);
            }
            intent.addFlags(32);
            intent.putExtra(TextUtils.isEmpty(awakeApp.statisticsKey) ? "extra.from_packagename" : awakeApp.statisticsKey, awakeApp.from);
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (!NullChecker.m82486a(listQueryBroadcastReceivers) || listQueryBroadcastReceivers.size() != 1) {
                return false;
            }
            context.sendBroadcast(intent);
            return true;
        }

        public C20515b() {
        }
    }

    /* JADX INFO: renamed from: l.u7b0$c */
    public static final class C20516c implements InterfaceC20514a {
        @Override // p153l.u7b0.InterfaceC20514a
        /* JADX INFO: renamed from: a */
        public boolean mo194852a(Context context, AwakeApp awakeApp) {
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
            if (NullChecker.m82486a(listQueryIntentServices) && listQueryIntentServices.size() == 1) {
                try {
                    context.startService(intent);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }

        public C20516c() {
        }
    }

    static {
        SparseArray<InterfaceC20514a> sparseArray = new SparseArray<>();
        f177893c = sparseArray;
        sparseArray.put(1, new C20516c());
        f177893c.put(2, new C20515b());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m194845a(@NonNull AwakeApp awakeApp) {
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
    public static void m194846b() {
        m194850f();
    }

    /* JADX INFO: renamed from: c */
    public static List<AwakeApp> m194847c(List<AwakeApp> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AwakeApp awakeApp : list) {
            if (awakeApp != null && awakeApp.isOpen > 0 && m194845a(awakeApp)) {
                arrayList.add(awakeApp);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<AwakeApp> m194848d(List<AwakeApp> list, HashMap<String, AwakeAppRecord> map) {
        if (map.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        for (AwakeApp awakeApp : list) {
            if (map.containsKey(awakeApp.packageName)) {
                AwakeAppRecord awakeAppRecord = map.get(awakeApp.packageName);
                if ((jGuessedCurrentServerTime - awakeAppRecord.startPullAliveTime) / 3600000 >= awakeApp.cycleTime) {
                    arrayList.add(awakeApp);
                    map.remove(awakeAppRecord.package_name);
                } else if (awakeAppRecord.hasPullAliveCount < awakeApp.count && (jGuessedCurrentServerTime - awakeAppRecord.lastPullAliveTime) / Constants.ONE_MIN_IN_MILLIS > awakeApp.interval) {
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
    public static HashMap<String, AwakeAppRecord> m194849e(List<AwakeApp> list) {
        String str = f177891a.get();
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        try {
            List<AwakeAppRecord> list2 = AwakeAppRecord.JSON_ADAPTER.ARRAY_ADAPTER().parse(str);
            ArrayList<AwakeAppRecord> arrayList = new ArrayList();
            if (NullChecker.m82486a(list2) && list2.size() != 0) {
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
            CrashHelper.m82479c(e);
            return new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m194850f() {
        CommonAssetsSettings commonAssetsSettingsM144645g = uqb0.f180392X.m144645g();
        if (commonAssetsSettingsM144645g == null) {
            return;
        }
        AtomicBoolean atomicBoolean = f177892b;
        if (atomicBoolean.compareAndSet(false, true)) {
            List<AwakeApp> listM194847c = m194847c(commonAssetsSettingsM144645g.pullAlive);
            if (listM194847c == null) {
                atomicBoolean.set(false);
                return;
            }
            HashMap<String, AwakeAppRecord> mapM194849e = m194849e(listM194847c);
            List<AwakeApp> listM194848d = m194848d(listM194847c, mapM194849e);
            if (listM194848d.size() == 0) {
                atomicBoolean.set(false);
                return;
            }
            List<uc60.C20543a> listM195382e = uc60.m195382e(App.f16088e);
            for (AwakeApp awakeApp : listM194848d) {
                Iterator<uc60.C20543a> it = listM195382e.iterator();
                do {
                    if (!it.hasNext()) {
                        InterfaceC20514a interfaceC20514a = f177893c.get(awakeApp.mode);
                        if (!NullChecker.m82486a(interfaceC20514a)) {
                            break;
                        }
                        interfaceC20514a.mo194852a(App.f16088e, awakeApp);
                        m194851g(awakeApp, mapM194849e);
                        break;
                    }
                } while (!awakeApp.packageName.equals(it.next().f178410b));
            }
            f177892b.set(false);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m194851g(AwakeApp awakeApp, HashMap<String, AwakeAppRecord> map) {
        if (map.containsKey(awakeApp.packageName)) {
            AwakeAppRecord awakeAppRecord = map.get(awakeApp.packageName);
            awakeAppRecord.hasPullAliveCount++;
            awakeAppRecord.lastPullAliveTime = uqb0.f180376H.guessedCurrentServerTime();
        } else {
            AwakeAppRecord awakeAppRecord2 = new AwakeAppRecord();
            awakeAppRecord2.package_name = awakeApp.packageName;
            long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
            awakeAppRecord2.startPullAliveTime = jGuessedCurrentServerTime;
            awakeAppRecord2.lastPullAliveTime = jGuessedCurrentServerTime;
            awakeAppRecord2.hasPullAliveCount = 1;
            map.put(awakeAppRecord2.package_name, awakeAppRecord2);
        }
        f177891a.put(AwakeAppRecord.JSON_ADAPTER.ARRAY_ADAPTER().serialize(new ArrayList(map.values())));
    }
}
