package p153l;

import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMStateHandle;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gfg0 implements ISudFSMStateHandle {

    /* JADX INFO: renamed from: a */
    public final WeakReference f103905a;

    /* JADX INFO: renamed from: b */
    public final String f103906b;

    public gfg0(String str, zkg0 zkg0Var) {
        this.f103906b = str;
        this.f103905a = new WeakReference(zkg0Var);
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void failure(String str) {
        urg0 urg0Var = (urg0) this.f103905a.get();
        StringBuilder sb = new StringBuilder("failure handle is null:");
        sb.append(urg0Var == null);
        sb.append("  state:");
        sb.append(this.f103906b);
        sb.append("  dataJson:");
        sb.append(str);
        LogUtils.file("SUDSudFSMStateHandleImpl", sb.toString());
        if (urg0Var != null) {
            try {
                urg0Var.m169707f("fail", new JSONObject(str));
            } catch (Exception e) {
                LogUtils.file("SUDSudFSMStateHandleImpl", "failure state：" + this.f103906b + " 发生异常：" + LogUtils.getErrorInfo(e));
            }
        }
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void success(String str) {
        urg0 urg0Var = (urg0) this.f103905a.get();
        StringBuilder sb = new StringBuilder("success handle is null:");
        sb.append(urg0Var == null);
        sb.append("  state:");
        sb.append(this.f103906b);
        sb.append("  dataJson:");
        sb.append(str);
        LogUtils.file("SUDSudFSMStateHandleImpl", sb.toString());
        if (urg0Var != null) {
            try {
                urg0Var.m169707f("success", new JSONObject(str));
            } catch (Exception e) {
                LogUtils.file("SUDSudFSMStateHandleImpl", "success state：" + this.f103906b + " 发生异常：" + LogUtils.getErrorInfo(e));
            }
        }
    }
}
