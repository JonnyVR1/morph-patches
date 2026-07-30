package p153l;

import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class udl0 {

    /* JADX INFO: renamed from: a */
    public VideoEffectModel f178552a;

    public udl0(VideoEffectModel videoEffectModel) {
        if (videoEffectModel == null) {
            this.f178552a = new VideoEffectModel();
        } else {
            this.f178552a = videoEffectModel;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m195497a(String str) {
        return VideoEffectModel.getConfigPath(str);
    }

    /* JADX INFO: renamed from: d */
    public static udl0 m195498d(String str) {
        return new udl0(VideoEffectModel.parseByPath(str));
    }

    /* JADX INFO: renamed from: b */
    public List<Element> m195499b() {
        return this.f178552a.getElements();
    }

    /* JADX INFO: renamed from: c */
    public VideoEffectModel m195500c() {
        return this.f178552a;
    }
}
