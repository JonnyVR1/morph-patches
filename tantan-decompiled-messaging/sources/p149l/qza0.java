package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.AwakeApp;
import com.p046p1.mobile.putong.data.AwakeAppRecord;
import com.p046p1.mobile.putong.data.CommonAssetsSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class qza0 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f157016a = new uqd0("pull_alive_record", "");

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f157017b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static SparseArray<InterfaceC19611a> f157018c;

    /* JADX INFO: renamed from: l.qza0$a */
    public interface InterfaceC19611a {
        /* JADX INFO: renamed from: a */
        boolean mo177177a(Context context, AwakeApp awakeApp);
    }

    /* JADX INFO: renamed from: l.qza0$b */
    public static final class C19612b implements InterfaceC19611a {
        @Override // p149l.qza0.InterfaceC19611a
        /* JADX INFO: renamed from: a */
        public boolean mo177177a(Context context, AwakeApp awakeApp) {
            Intent intent = new Intent();
            intent.setAction(awakeApp.action);
            if (ane0.f70732d) {
                intent.setPackage(awakeApp.packageName);
            }
            intent.addFlags(32);
            intent.putExtra(TextUtils.isEmpty(awakeApp.statisticsKey) ? "extra.from_packagename" : awakeApp.statisticsKey, awakeApp.from);
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (!NullChecker.m81303a(listQueryBroadcastReceivers) || listQueryBroadcastReceivers.size() != 1) {
                return false;
            }
            context.sendBroadcast(intent);
            return true;
        }

        public C19612b() {
        }
    }

    /* JADX INFO: renamed from: l.qza0$c */
    public static final class C19613c implements InterfaceC19611a {
        @Override // p149l.qza0.InterfaceC19611a
        /* JADX INFO: renamed from: a */
        public boolean mo177177a(Context context, AwakeApp awakeApp) {
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
            if (NullChecker.m81303a(listQueryIntentServices) && listQueryIntentServices.size() == 1) {
                try {
                    context.startService(intent);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }

        public C19613c() {
        }
    }

    static {
        SparseArray<InterfaceC19611a> sparseArray = new SparseArray<>();
        f157018c = sparseArray;
        sparseArray.put(1, new C19613c());
        f157018c.put(2, new C19612b());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m177170a(@NonNull AwakeApp awakeApp) {
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
    public static void m177171b() {
        m177175f();
    }

    /* JADX INFO: renamed from: c */
    public static List<AwakeApp> m177172c(List<AwakeApp> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AwakeApp awakeApp : list) {
            if (awakeApp != null && awakeApp.isOpen > 0 && m177170a(awakeApp)) {
                arrayList.add(awakeApp);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<AwakeApp> m177173d(List<AwakeApp> list, HashMap<String, AwakeAppRecord> map) {
        if (map.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
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
    public static HashMap<String, AwakeAppRecord> m177174e(List<AwakeApp> list) {
        String str = f157016a.get();
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        try {
            List<AwakeAppRecord> list2 = AwakeAppRecord.JSON_ADAPTER.ARRAY_ADAPTER().parse(str);
            ArrayList<AwakeAppRecord> arrayList = new ArrayList();
            if (NullChecker.m81303a(list2) && list2.size() != 0) {
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
            CrashHelper.m81296c(e);
            return new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m177175f() {
        CommonAssetsSettings commonAssetsSettingsM95177g = qib0.f154709X.m95177g();
        if (commonAssetsSettingsM95177g == null) {
            return;
        }
        AtomicBoolean atomicBoolean = f157017b;
        if (atomicBoolean.compareAndSet(false, true)) {
            List<AwakeApp> listM177172c = m177172c(commonAssetsSettingsM95177g.pullAlive);
            if (listM177172c == null) {
                atomicBoolean.set(false);
                return;
            }
            HashMap<String, AwakeAppRecord> mapM177174e = m177174e(listM177172c);
            List<AwakeApp> listM177173d = m177173d(listM177172c, mapM177174e);
            if (listM177173d.size() == 0) {
                atomicBoolean.set(false);
                return;
            }
            List<o460.C18838a> listM162552e = o460.m162552e(App.f15369e);
            for (AwakeApp awakeApp : listM177173d) {
                Iterator<o460.C18838a> it = listM162552e.iterator();
                do {
                    if (!it.hasNext()) {
                        InterfaceC19611a interfaceC19611a = f157018c.get(awakeApp.mode);
                        if (!NullChecker.m81303a(interfaceC19611a)) {
                            break;
                        }
                        interfaceC19611a.mo177177a(App.f15369e, awakeApp);
                        m177176g(awakeApp, mapM177174e);
                        break;
                    }
                } while (!awakeApp.packageName.equals(it.next().f141749b));
            }
            f157017b.set(false);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m177176g(AwakeApp awakeApp, HashMap<String, AwakeAppRecord> map) {
        if (map.containsKey(awakeApp.packageName)) {
            AwakeAppRecord awakeAppRecord = map.get(awakeApp.packageName);
            awakeAppRecord.hasPullAliveCount++;
            awakeAppRecord.lastPullAliveTime = qib0.f154693H.guessedCurrentServerTime();
        } else {
            AwakeAppRecord awakeAppRecord2 = new AwakeAppRecord();
            awakeAppRecord2.package_name = awakeApp.packageName;
            long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
            awakeAppRecord2.startPullAliveTime = jGuessedCurrentServerTime;
            awakeAppRecord2.lastPullAliveTime = jGuessedCurrentServerTime;
            awakeAppRecord2.hasPullAliveCount = 1;
            map.put(awakeAppRecord2.package_name, awakeAppRecord2);
        }
        f157016a.put(AwakeAppRecord.JSON_ADAPTER.ARRAY_ADAPTER().serialize(new ArrayList(map.values())));
    }
}
