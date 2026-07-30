package immomo.com.mklibrary.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.immomo.framework.storage.p039kv.C3750KV;
import com.immomo.mmutil.task.C3804c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.esj0;
import p149l.kiw;
import p149l.n460;
import p149l.ohw;
import p149l.r750;
import p149l.shw;
import p149l.v750;
import p149l.vei;
import p149l.y0f;
import p149l.yhw;
import p149l.z750;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"MDLogUse"})
public class MKPrepareService extends Service {
    private static final String KEY_UPDATE_PACKAGE_LIST = "mk_check_updatelist_time";
    private static final String TAG = "MKPrepareService";
    private static List<Runnable> extraRunnableList;
    private boolean isRunning = false;

    /* JADX INFO: renamed from: immomo.com.mklibrary.service.MKPrepareService$a */
    public class RunnableC14929a implements Runnable {
        public RunnableC14929a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vei.m198186e().m198190f();
            MKPrepareService.this.prepareEnhanceJsSdkPackage();
            if (shw.m184288h() || shw.m184303w()) {
                MKPrepareService.this.checkPackageUpdateList();
            }
            if (MKPrepareService.extraRunnableList != null) {
                Iterator it = MKPrepareService.extraRunnableList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                List unused = MKPrepareService.extraRunnableList = null;
            }
            MKPrepareService.this.onPrepareFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPackageUpdateList() {
        if (System.currentTimeMillis() - C3750KV.m18338e(KEY_UPDATE_PACKAGE_LIST, 0L) < 7200000) {
            MDLog.m7389d(TAG, "tang----MK 不超过两小时，不批量更新");
            return;
        }
        MDLog.m7389d(TAG, "tang----MK 超过两小时，开始批量检查更新");
        try {
            ArrayList<esj0> arrayListM178126e = r750.m178124d().m178126e(readPackageInfo());
            if (arrayListM178126e.size() > 10) {
                MDLog.m7391e(TAG, "\n========================警告！！！========================\n\n\n自动更新离线包太多！！！！！\n\n\n========================警告！！！========================");
            }
            yhw.m214862s().m214869m(arrayListM178126e);
            C3750KV.m18343j(KEY_UPDATE_PACKAGE_LIST, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            MDLog.printErrStackTrace(TAG, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrepareFinished() {
        this.isRunning = false;
        stopSelf();
    }

    public static void prepare(@NonNull Context context, List<Runnable> list) {
        extraRunnableList = list;
        try {
            Intent intent = new Intent("com.immomo.momo.prepare_mk");
            intent.setPackage(context.getPackageName());
            context.startService(intent);
        } catch (Exception e) {
            MDLog.printErrStackTrace(TAG, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareEnhanceJsSdkPackage() {
        y0f.m212119h();
    }

    private ArrayList<v750> readPackageInfo() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kiw kiwVarM146150f = kiw.m146150f();
        ArrayList<v750> arrayList = new ArrayList<>();
        File fileM164475m = ohw.m164475m();
        if (fileM164475m != null && fileM164475m.isDirectory()) {
            File[] fileArrListFiles = fileM164475m.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                MDLog.m7389d(TAG, "tang----离线包为 " + fileArrListFiles.length);
                try {
                    for (File file : fileArrListFiles) {
                        if (file != null && file.isDirectory() && file.exists()) {
                            String name = file.getName();
                            MDLog.m7389d(TAG, "tang-----准备读取离线包信息 " + name);
                            if (TextUtils.isEmpty(name) || name.indexOf(ohw.f144066m) >= 0) {
                                MDLog.m7389d(TAG, "tang----读取了临时包，跳过");
                            } else {
                                v750 v750Var = new v750(name);
                                v750Var.m197342h(z750.m217437h(name).getAbsolutePath());
                                if (v750Var.f180303c == null) {
                                    MDLog.m7389d(TAG, "tang-----不存在离线包配置");
                                } else {
                                    n460 n460VarM146155i = kiwVarM146150f.m146155i(name);
                                    if (n460VarM146155i == null) {
                                        n460VarM146155i = new n460(name);
                                    }
                                    v750Var.m197347m(n460VarM146155i);
                                    arrayList.add(v750Var);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    MDLog.printErrStackTrace(TAG, e);
                }
                MDLog.m7389d(TAG, "tang-----读取所有离线包的信息：耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "  读取到的离线包列表数量有 " + arrayList.size());
                return arrayList;
            }
            MDLog.m7389d(TAG, "tang----离线包目录为空");
        }
        return arrayList;
    }

    private void startPrepare() {
        if (this.isRunning) {
            onPrepareFinished();
        } else {
            this.isRunning = true;
            C3804c.m18444d(1, new RunnableC14929a());
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        startPrepare();
        return super.onStartCommand(intent, i, i2);
    }
}
