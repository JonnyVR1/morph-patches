package p149l;

import androidx.annotation.NonNull;
import com.core.glcore.util.ArrayUtils;
import com.core.glcore.util.MMCvInfoHelper;
import com.momocv.facerigv3.FacerigV3Info;
import com.momocv.videoprocessor.VideoInfo;

/* JADX INFO: loaded from: classes.dex */
public class qtf implements Cloneable {

    /* JADX INFO: renamed from: a */
    public FacerigV3Info f156323a = new FacerigV3Info();

    /* JADX INFO: renamed from: b */
    public VideoInfo f156324b;

    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qtf clone() {
        qtf qtfVar = new qtf();
        if (this.f156323a != null) {
            FacerigV3Info facerigV3Info = new FacerigV3Info();
            qtfVar.f156323a = facerigV3Info;
            facerigV3Info.facerigV3_eulers_ = ArrayUtils.bunshin(this.f156323a.facerigV3_eulers_);
            qtfVar.f156323a.facerigV3_scores_ = ArrayUtils.bunshin(this.f156323a.facerigV3_scores_);
        }
        qtfVar.f156324b = MMCvInfoHelper.clone(this.f156324b);
        return qtfVar;
    }

    /* JADX INFO: renamed from: b */
    public float[] m176413b() {
        return this.f156323a.facerigV3_scores_;
    }

    /* JADX INFO: renamed from: c */
    public void m176414c(VideoInfo videoInfo) {
        this.f156324b = videoInfo;
    }
}
