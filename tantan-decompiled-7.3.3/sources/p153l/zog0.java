package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zog0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i0h0 f205348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ukg0 f205349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xug0 f205350c;

    public zog0(xug0 xug0Var, i0h0 i0h0Var, ukg0 ukg0Var) {
        this.f205350c = xug0Var;
        this.f205348a = i0h0Var;
        this.f205349b = ukg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uyg0 uyg0Var = this.f205350c.f196283f;
        i0h0 i0h0Var = this.f205348a;
        if (i0h0Var.f112368a == 0) {
            utg0.f180950e = i0h0Var;
            gvg0 gvg0Var = i0h0Var.f112370c;
            uyg0Var.f181609i = gvg0Var.f106630a;
            rhg0 rhg0Var = gvg0Var.f106633d;
            uyg0Var.f181604d = rhg0Var.f163163a;
            uyg0Var.f181605e = rhg0Var.f163164b;
            uyg0Var.f181607g = rhg0Var.f163166d;
            uyg0Var.f181608h = rhg0Var.f163165c;
            uyg0Var.f181601a = true;
            synchronized (uyg0Var) {
                try {
                    ArrayList arrayList = uyg0Var.f181611k;
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
                        uyg0Var.f181611k = null;
                        uyg0Var.f181610j.set(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("getSDKToken fail appId=" + utg0.f180952g);
            sb.append(" isTestEnv=" + utg0.f180948c);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(" ret_code=" + i0h0Var.f112368a);
            if (i0h0Var.f112369b != null) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(i0h0Var.f112369b);
            }
            uyg0Var.m198638g(i0h0Var.f112368a, sb.toString());
        }
        uyg0Var.f181613m = null;
        ukg0 ukg0Var = this.f205349b;
        String str = fug0.f100911a;
        ThreadUtils.postUITask(new nog0(ukg0Var.toString(), false, ukg0Var.f179392a, ukg0Var.f179396e));
    }
}
