package p153l;

import android.content.Context;
import com.idv.identity.base.algorithm.IDFrame;
import com.idv.identity.base.algorithm.IIdentityDelegate;
import com.idv.identity.base.algorithm.IdentityAlgConfig;
import com.idv.identity.base.algorithm.IdentityFaceAttr;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class cn2 implements IIdentityDelegate {
    public abstract boolean config(IdentityAlgConfig identityAlgConfig);

    public abstract void finishPhotinus();

    @Override // com.idv.identity.base.algorithm.IIdentityDelegate
    public abstract void handleCaptureCompleted(int i, Map<String, Object> map);

    @Override // com.idv.identity.base.algorithm.IIdentityDelegate
    public abstract void handleEventStated(int i);

    @Override // com.idv.identity.base.algorithm.IIdentityDelegate
    public abstract void handleInfoReady(IDFrame iDFrame);

    @Override // com.idv.identity.base.algorithm.IIdentityDelegate
    public abstract void handleStateUpdated(int i, IdentityFaceAttr identityFaceAttr);

    public abstract boolean init(Context context, IdentityAlgConfig identityAlgConfig, gfm gfmVar);

    public abstract void preProcess();

    public abstract boolean processImage(IDFrame iDFrame);

    public abstract void registerIdentityFaceCallback(gfm gfmVar);

    public abstract void release();

    public abstract void removeIdentityFaceCallback(gfm gfmVar);

    public abstract boolean setFarNeatAction(boolean z);
}
