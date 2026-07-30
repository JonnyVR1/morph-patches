package com.vivo.push.p118d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.p116b.C14692j;
import com.vivo.push.sdk.C14773a;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.f */
/* JADX INFO: loaded from: classes2.dex */
final class C14735f extends AbstractRunnableC14764l {
    public C14735f(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85995b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            C14795p.m86179a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
            C14795p.m86192d("OnChangePushStatusTask", "push service has disabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        C14795p.m86192d("OnChangePushStatusTask", "disableService push service.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static List<ResolveInfo> m85996c(Context context) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            listQueryBroadcastReceivers = null;
        }
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            return listQueryBroadcastReceivers;
        }
        Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            return context.getPackageManager().queryBroadcastReceivers(intent2, 576);
        } catch (Exception unused2) {
            return listQueryBroadcastReceivers;
        }
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        if (this.f61899a.getPackageName().equals(C14799t.m86204b(this.f61899a))) {
            return;
        }
        C14692j c14692j = (C14692j) abstractC14769o;
        int iM85927d = c14692j.m85927d();
        int iM85928e = c14692j.m85928e();
        C14795p.m86192d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + iM85927d + " ; receiverStatus is " + iM85928e);
        if (iM85927d == 2) {
            m85995b(this.f61899a);
        } else if (iM85927d == 1) {
            m85994a(this.f61899a);
        } else if (iM85927d == 0) {
            Context context = this.f61899a;
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                C14795p.m86179a("OnChangePushStatusTask", "defaultService error: can not find push service.");
            } else {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
                if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                    packageManager.setComponentEnabledSetting(componentName, 0, 1);
                    C14795p.m86192d("OnChangePushStatusTask", "defaultService push service.");
                } else {
                    C14795p.m86192d("OnChangePushStatusTask", "push service has defaulted");
                }
            }
        }
        if (iM85928e == 2) {
            Context context2 = this.f61899a;
            List<ResolveInfo> listM85996c = m85996c(context2);
            if (listM85996c == null || listM85996c.size() <= 0) {
                C14795p.m86179a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
            } else {
                String str = listM85996c.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str)) {
                    C14795p.m86192d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                } else {
                    PackageManager packageManager2 = context2.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context2, str);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                        C14795p.m86192d("OnChangePushStatusTask", "push service disableReceiver ");
                    } else {
                        C14795p.m86192d("OnChangePushStatusTask", "push service has disableReceiver ");
                    }
                }
            }
            C14773a.m86112a().m86119b();
            return;
        }
        if (iM85928e == 1) {
            Context context3 = this.f61899a;
            List<ResolveInfo> listM85996c2 = m85996c(context3);
            if (listM85996c2 == null || listM85996c2.size() <= 0) {
                C14795p.m86179a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                return;
            }
            String str2 = listM85996c2.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str2)) {
                C14795p.m86192d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager3 = context3.getPackageManager();
            ComponentName componentName3 = new ComponentName(context3, str2);
            if (packageManager3.getComponentEnabledSetting(componentName3) == 1) {
                C14795p.m86192d("OnChangePushStatusTask", "push service has enableReceiver ");
                return;
            } else {
                packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                C14795p.m86192d("OnChangePushStatusTask", "push service enableReceiver ");
                return;
            }
        }
        if (iM85928e == 0) {
            Context context4 = this.f61899a;
            List<ResolveInfo> listM85996c3 = m85996c(context4);
            if (listM85996c3 == null || listM85996c3.size() <= 0) {
                C14795p.m86179a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                return;
            }
            String str3 = listM85996c3.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str3)) {
                C14795p.m86192d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager4 = context4.getPackageManager();
            ComponentName componentName4 = new ComponentName(context4, str3);
            if (packageManager4.getComponentEnabledSetting(componentName4) == 0) {
                C14795p.m86192d("OnChangePushStatusTask", "push service has defaulted");
            } else {
                packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                C14795p.m86192d("OnChangePushStatusTask", "push service defaultReceiver ");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85994a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            C14795p.m86179a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 1) {
            C14795p.m86192d("OnChangePushStatusTask", "push service has enabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        C14795p.m86192d("OnChangePushStatusTask", "enableService push service.");
        return true;
    }
}
