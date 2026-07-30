package p153l;

import tech.sud.gip.core.p140ai.ISudListenerAiCommon;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class omg0 implements qtg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f147942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ISudListenerAiCommon f147943b;

    public omg0(String str, ISudListenerAiCommon iSudListenerAiCommon) {
        this.f147942a = str;
        this.f147943b = iSudListenerAiCommon;
    }

    @Override // p153l.qtg0
    public final void onCompleted(String str) {
        LogUtils.file("SudAiModelImpl", "aiCommon param:" + this.f147942a + " response:" + str);
        pyg0.f154639b.remove(this);
        this.f147943b.onCompleted(str);
    }
}
