package p153l;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class eve0 extends dr2 {
    public eve0(ImageRequest imageRequest, yk90 yk90Var) {
        this(imageRequest, yk90Var.getId(), yk90Var.mo117680v(), yk90Var.mo117675n(), yk90Var.mo117672k(), yk90Var.mo117667I(), yk90Var.mo117666H(), yk90Var.mo117665F(), yk90Var.getPriority(), yk90Var.mo117674m());
    }

    public eve0(ImageRequest imageRequest, String str, cl90 cl90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, tjm tjmVar) {
        super(imageRequest, str, cl90Var, obj, requestLevel, z, z2, priority, tjmVar);
    }

    public eve0(ImageRequest imageRequest, String str, String str2, cl90 cl90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, tjm tjmVar) {
        super(imageRequest, str, str2, null, cl90Var, obj, requestLevel, z, z2, priority, tjmVar);
    }
}
