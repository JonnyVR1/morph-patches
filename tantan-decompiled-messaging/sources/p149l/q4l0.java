package p149l;

import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class q4l0 {

    /* JADX INFO: renamed from: a */
    public VideoEffectModel f152648a;

    public q4l0(VideoEffectModel videoEffectModel) {
        if (videoEffectModel == null) {
            this.f152648a = new VideoEffectModel();
        } else {
            this.f152648a = videoEffectModel;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m172943a(String str) {
        return VideoEffectModel.getConfigPath(str);
    }

    /* JADX INFO: renamed from: d */
    public static q4l0 m172944d(String str) {
        return new q4l0(VideoEffectModel.parseByPath(str));
    }

    /* JADX INFO: renamed from: b */
    public List<Element> m172945b() {
        return this.f152648a.getElements();
    }

    /* JADX INFO: renamed from: c */
    public VideoEffectModel m172946c() {
        return this.f152648a;
    }
}
