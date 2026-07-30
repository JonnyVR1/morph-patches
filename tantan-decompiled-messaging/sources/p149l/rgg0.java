package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class rgg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ asg0 f159248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mcg0 f159249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pmg0 f159250c;

    public rgg0(pmg0 pmg0Var, asg0 asg0Var, mcg0 mcg0Var) {
        this.f159250c = pmg0Var;
        this.f159248a = asg0Var;
        this.f159249b = mcg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mqg0 mqg0Var = this.f159250c.f150225f;
        asg0 asg0Var = this.f159248a;
        if (asg0Var.f71449a == 0) {
            mlg0.f134430e = asg0Var;
            ymg0 ymg0Var = asg0Var.f71451c;
            mqg0Var.f135232i = ymg0Var.f198999a;
            j9g0 j9g0Var = ymg0Var.f199002d;
            mqg0Var.f135227d = j9g0Var.f116898a;
            mqg0Var.f135228e = j9g0Var.f116899b;
            mqg0Var.f135230g = j9g0Var.f116901d;
            mqg0Var.f135231h = j9g0Var.f116900c;
            mqg0Var.f135224a = true;
            synchronized (mqg0Var) {
                try {
                    ArrayList arrayList = mqg0Var.f135234k;
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
                        mqg0Var.f135234k = null;
                        mqg0Var.f135233j.set(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("getSDKToken fail appId=" + mlg0.f134432g);
            sb.append(" isTestEnv=" + mlg0.f134428c);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(" ret_code=" + asg0Var.f71449a);
            if (asg0Var.f71450b != null) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(asg0Var.f71450b);
            }
            mqg0Var.m155905g(asg0Var.f71449a, sb.toString());
        }
        mqg0Var.f135236m = null;
        mcg0 mcg0Var = this.f159249b;
        String str = xlg0.f193417a;
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.f133111a, mcg0Var.f133115e));
    }
}
