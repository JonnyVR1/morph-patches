package p003l;

import java.util.ArrayList;
import l.asg0;
import l.fgg0;
import l.j9g0;
import l.mcg0;
import l.mlg0;
import l.xlg0;
import l.ymg0;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class rgg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ asg0 f6903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mcg0 f6904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pmg0 f6905c;

    public rgg0(pmg0 pmg0Var, asg0 asg0Var, mcg0 mcg0Var) {
        this.f6905c = pmg0Var;
        this.f6903a = asg0Var;
        this.f6904b = mcg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mqg0 mqg0Var = this.f6905c.f6464f;
        asg0 asg0Var = this.f6903a;
        if (asg0Var.a == 0) {
            mlg0.e = asg0Var;
            ymg0 ymg0Var = asg0Var.c;
            mqg0Var.f5734i = ymg0Var.a;
            j9g0 j9g0Var = ymg0Var.d;
            mqg0Var.f5729d = j9g0Var.a;
            mqg0Var.f5730e = j9g0Var.b;
            mqg0Var.f5732g = j9g0Var.d;
            mqg0Var.f5733h = j9g0Var.c;
            mqg0Var.f5726a = true;
            synchronized (mqg0Var) {
                try {
                    ArrayList arrayList = mqg0Var.f5736k;
                    if (arrayList == null) {
                        LogUtils.file("HttpService", "error notifyInitSdkSuccess but listenerList is null");
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((ISudListenerInitSDK) obj).onSuccess();
                        }
                        mqg0Var.f5736k = null;
                        mqg0Var.f5735j.set(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("getSDKToken fail appId=" + mlg0.g);
            sb.append(" isTestEnv=" + mlg0.c);
            sb.append(" ");
            sb.append(" ret_code=" + asg0Var.a);
            if (asg0Var.b != null) {
                sb.append(" ");
                sb.append(asg0Var.b);
            }
            mqg0Var.m6434g(asg0Var.a, sb.toString());
        }
        mqg0Var.f5738m = null;
        mcg0 mcg0Var = this.f6904b;
        String str = xlg0.a;
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.a, mcg0Var.e));
    }
}
