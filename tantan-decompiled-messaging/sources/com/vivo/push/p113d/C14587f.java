package com.vivo.push.p113d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.p111b.C14544j;
import com.vivo.push.sdk.C14625a;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.f */
/* JADX INFO: loaded from: classes2.dex */
final class C14587f extends AbstractRunnableC14616l {
    public C14587f(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m84824b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            C14647p.m85008a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
            C14647p.m85021d("OnChangePushStatusTask", "push service has disabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        C14647p.m85021d("OnChangePushStatusTask", "disableService push service.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static List<ResolveInfo> m84825c(Context context) {
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

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        if (this.f61052a.getPackageName().equals(C14651t.m85033b(this.f61052a))) {
            return;
        }
        C14544j c14544j = (C14544j) abstractC14621o;
        int iM84756d = c14544j.m84756d();
        int iM84757e = c14544j.m84757e();
        C14647p.m85021d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + iM84756d + " ; receiverStatus is " + iM84757e);
        if (iM84756d == 2) {
            m84824b(this.f61052a);
        } else if (iM84756d == 1) {
            m84823a(this.f61052a);
        } else if (iM84756d == 0) {
            Context context = this.f61052a;
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                C14647p.m85008a("OnChangePushStatusTask", "defaultService error: can not find push service.");
            } else {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
                if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                    packageManager.setComponentEnabledSetting(componentName, 0, 1);
                    C14647p.m85021d("OnChangePushStatusTask", "defaultService push service.");
                } else {
                    C14647p.m85021d("OnChangePushStatusTask", "push service has defaulted");
                }
            }
        }
        if (iM84757e == 2) {
            Context context2 = this.f61052a;
            List<ResolveInfo> listM84825c = m84825c(context2);
            if (listM84825c == null || listM84825c.size() <= 0) {
                C14647p.m85008a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
            } else {
                String str = listM84825c.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str)) {
                    C14647p.m85021d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                } else {
                    PackageManager packageManager2 = context2.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context2, str);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                        C14647p.m85021d("OnChangePushStatusTask", "push service disableReceiver ");
                    } else {
                        C14647p.m85021d("OnChangePushStatusTask", "push service has disableReceiver ");
                    }
                }
            }
            C14625a.m84941a().m84948b();
            return;
        }
        if (iM84757e == 1) {
            Context context3 = this.f61052a;
            List<ResolveInfo> listM84825c2 = m84825c(context3);
            if (listM84825c2 == null || listM84825c2.size() <= 0) {
                C14647p.m85008a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                return;
            }
            String str2 = listM84825c2.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str2)) {
                C14647p.m85021d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager3 = context3.getPackageManager();
            ComponentName componentName3 = new ComponentName(context3, str2);
            if (packageManager3.getComponentEnabledSetting(componentName3) == 1) {
                C14647p.m85021d("OnChangePushStatusTask", "push service has enableReceiver ");
                return;
            } else {
                packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                C14647p.m85021d("OnChangePushStatusTask", "push service enableReceiver ");
                return;
            }
        }
        if (iM84757e == 0) {
            Context context4 = this.f61052a;
            List<ResolveInfo> listM84825c3 = m84825c(context4);
            if (listM84825c3 == null || listM84825c3.size() <= 0) {
                C14647p.m85008a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                return;
            }
            String str3 = listM84825c3.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str3)) {
                C14647p.m85021d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager4 = context4.getPackageManager();
            ComponentName componentName4 = new ComponentName(context4, str3);
            if (packageManager4.getComponentEnabledSetting(componentName4) == 0) {
                C14647p.m85021d("OnChangePushStatusTask", "push service has defaulted");
            } else {
                packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                C14647p.m85021d("OnChangePushStatusTask", "push service defaultReceiver ");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84823a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            C14647p.m85008a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, listQueryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 1) {
            C14647p.m85021d("OnChangePushStatusTask", "push service has enabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        C14647p.m85021d("OnChangePushStatusTask", "enableService push service.");
        return true;
    }
}
