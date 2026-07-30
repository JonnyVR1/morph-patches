package p149l;

import tech.sud.gip.core.p136ai.ISudListenerAiCommon;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class geg0 implements ilg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f102249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ISudListenerAiCommon f102250b;

    public geg0(String str, ISudListenerAiCommon iSudListenerAiCommon) {
        this.f102249a = str;
        this.f102250b = iSudListenerAiCommon;
    }

    @Override // p149l.ilg0
    public final void onCompleted(String str) {
        LogUtils.file("SudAiModelImpl", "aiCommon param:" + this.f102249a + " response:" + str);
        hqg0.f109057b.remove(this);
        this.f102250b.onCompleted(str);
    }
}
