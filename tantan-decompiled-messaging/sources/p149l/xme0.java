package p149l;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class xme0 extends mq2 {
    public xme0(ImageRequest imageRequest, uc90 uc90Var) {
        this(imageRequest, uc90Var.getId(), uc90Var.mo155875v(), uc90Var.mo155870n(), uc90Var.mo155867k(), uc90Var.mo155860I(), uc90Var.mo155859H(), uc90Var.mo155858F(), uc90Var.getPriority(), uc90Var.mo155869m());
    }

    public xme0(ImageRequest imageRequest, String str, yc90 yc90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, qhm qhmVar) {
        super(imageRequest, str, yc90Var, obj, requestLevel, z, z2, priority, qhmVar);
    }

    public xme0(ImageRequest imageRequest, String str, String str2, yc90 yc90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, qhm qhmVar) {
        super(imageRequest, str, str2, null, yc90Var, obj, requestLevel, z, z2, priority, qhmVar);
    }
}
