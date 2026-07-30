package p153l;

import tech.sud.gip.core.p140ai.ISudListenerLoadModel;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class mvg0 implements ISudListenerLoadModel {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ISudListenerLoadModel f138893a;

    public mvg0(ISudListenerLoadModel iSudListenerLoadModel) {
        this.f138893a = iSudListenerLoadModel;
    }

    @Override // tech.sud.gip.core.p140ai.ISudListenerLoadModel
    public final void onCompleted(byte[] bArr) {
        StringBuilder sb = new StringBuilder("loadModel onCompleted fileData size:");
        sb.append(bArr == null ? 0 : bArr.length);
        LogUtils.file("SudAiModelImpl", sb.toString());
        pyg0.f154639b.remove(this);
        this.f138893a.onCompleted(bArr);
    }

    @Override // tech.sud.gip.core.p140ai.ISudListenerLoadModel
    public final void onFailure(int i, String str) {
        LogUtils.file("SudAiModelImpl", "loadModel onFailure retCode:" + i + " retMsg:" + str);
        pyg0.f154639b.remove(this);
        this.f138893a.onFailure(i, str);
    }
}
