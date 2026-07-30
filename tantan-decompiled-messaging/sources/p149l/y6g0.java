package p149l;

import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMStateHandle;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class y6g0 implements ISudFSMStateHandle {

    /* JADX INFO: renamed from: a */
    public final WeakReference f196559a;

    /* JADX INFO: renamed from: b */
    public final String f196560b;

    public y6g0(String str, rcg0 rcg0Var) {
        this.f196560b = str;
        this.f196559a = new WeakReference(rcg0Var);
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void failure(String str) {
        mjg0 mjg0Var = (mjg0) this.f196559a.get();
        StringBuilder sb = new StringBuilder("failure handle is null:");
        sb.append(mjg0Var == null);
        sb.append("  state:");
        sb.append(this.f196560b);
        sb.append("  dataJson:");
        sb.append(str);
        LogUtils.file("SUDSudFSMStateHandleImpl", sb.toString());
        if (mjg0Var != null) {
            try {
                mjg0Var.m127355f("fail", new JSONObject(str));
            } catch (Exception e) {
                LogUtils.file("SUDSudFSMStateHandleImpl", "failure state：" + this.f196560b + " 发生异常：" + LogUtils.getErrorInfo(e));
            }
        }
    }

    @Override // tech.sud.gip.core.ISudFSMStateHandle
    public final void success(String str) {
        mjg0 mjg0Var = (mjg0) this.f196559a.get();
        StringBuilder sb = new StringBuilder("success handle is null:");
        sb.append(mjg0Var == null);
        sb.append("  state:");
        sb.append(this.f196560b);
        sb.append("  dataJson:");
        sb.append(str);
        LogUtils.file("SUDSudFSMStateHandleImpl", sb.toString());
        if (mjg0Var != null) {
            try {
                mjg0Var.m127355f("success", new JSONObject(str));
            } catch (Exception e) {
                LogUtils.file("SUDSudFSMStateHandleImpl", "success state：" + this.f196560b + " 发生异常：" + LogUtils.getErrorInfo(e));
            }
        }
    }
}
