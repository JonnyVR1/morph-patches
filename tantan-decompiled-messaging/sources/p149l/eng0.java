package p149l;

import tech.sud.gip.core.p136ai.ISudListenerLoadModel;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class eng0 implements ISudListenerLoadModel {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ISudListenerLoadModel f92313a;

    public eng0(ISudListenerLoadModel iSudListenerLoadModel) {
        this.f92313a = iSudListenerLoadModel;
    }

    @Override // tech.sud.gip.core.p136ai.ISudListenerLoadModel
    public final void onCompleted(byte[] bArr) {
        StringBuilder sb = new StringBuilder("loadModel onCompleted fileData size:");
        sb.append(bArr == null ? 0 : bArr.length);
        LogUtils.file("SudAiModelImpl", sb.toString());
        hqg0.f109057b.remove(this);
        this.f92313a.onCompleted(bArr);
    }

    @Override // tech.sud.gip.core.p136ai.ISudListenerLoadModel
    public final void onFailure(int i, String str) {
        LogUtils.file("SudAiModelImpl", "loadModel onFailure retCode:" + i + " retMsg:" + str);
        hqg0.f109057b.remove(this);
        this.f92313a.onFailure(i, str);
    }
}
