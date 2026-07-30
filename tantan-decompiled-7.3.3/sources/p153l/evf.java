package p153l;

import androidx.annotation.NonNull;
import com.core.glcore.util.ArrayUtils;
import com.core.glcore.util.MMCvInfoHelper;
import com.momocv.facerigv3.FacerigV3Info;
import com.momocv.videoprocessor.VideoInfo;

/* JADX INFO: loaded from: classes.dex */
public class evf implements Cloneable {

    /* JADX INFO: renamed from: a */
    public FacerigV3Info f96000a = new FacerigV3Info();

    /* JADX INFO: renamed from: b */
    public VideoInfo f96001b;

    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public evf clone() {
        evf evfVar = new evf();
        if (this.f96000a != null) {
            FacerigV3Info facerigV3Info = new FacerigV3Info();
            evfVar.f96000a = facerigV3Info;
            facerigV3Info.facerigV3_eulers_ = ArrayUtils.bunshin(this.f96000a.facerigV3_eulers_);
            evfVar.f96000a.facerigV3_scores_ = ArrayUtils.bunshin(this.f96000a.facerigV3_scores_);
        }
        evfVar.f96001b = MMCvInfoHelper.clone(this.f96001b);
        return evfVar;
    }

    /* JADX INFO: renamed from: b */
    public float[] m122798b() {
        return this.f96000a.facerigV3_scores_;
    }

    /* JADX INFO: renamed from: c */
    public void m122799c(VideoInfo videoInfo) {
        this.f96001b = videoInfo;
    }
}
