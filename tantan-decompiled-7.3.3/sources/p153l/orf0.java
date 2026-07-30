package p153l;

import com.momo.mcamera.mask.SkinChooseFilter;
import com.momo.mcamera.mask.lightskin.LightSkinSmoothGroupFilter;

/* JADX INFO: loaded from: classes7.dex */
public class orf0 {

    /* JADX INFO: renamed from: a */
    private SkinChooseFilter f148700a;

    /* JADX INFO: renamed from: b */
    private LightSkinSmoothGroupFilter f148701b;

    /* JADX INFO: renamed from: a */
    public jt2 m168917a(int i) {
        if (i == 1) {
            if (this.f148701b == null) {
                this.f148701b = new LightSkinSmoothGroupFilter();
            }
            LightSkinSmoothGroupFilter lightSkinSmoothGroupFilter = this.f148701b;
            this.f148700a = null;
            return lightSkinSmoothGroupFilter;
        }
        if (this.f148700a == null) {
            this.f148700a = new SkinChooseFilter(false, 0.0f, SkinChooseFilter.SKIN_TYPE_SMOOTH_DEFAULT);
        }
        SkinChooseFilter skinChooseFilter = this.f148700a;
        this.f148701b = null;
        return skinChooseFilter;
    }

    /* JADX INFO: renamed from: b */
    public float m168918b() {
        LightSkinSmoothGroupFilter lightSkinSmoothGroupFilter = this.f148701b;
        if (lightSkinSmoothGroupFilter != null) {
            return lightSkinSmoothGroupFilter.getSmoothLevel();
        }
        SkinChooseFilter skinChooseFilter = this.f148700a;
        if (skinChooseFilter != null) {
            return skinChooseFilter.getSkinLevel();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m168919c(float f) {
        SkinChooseFilter skinChooseFilter = this.f148700a;
        if (skinChooseFilter != null) {
            skinChooseFilter.setSmoothLevel(f);
            return;
        }
        LightSkinSmoothGroupFilter lightSkinSmoothGroupFilter = this.f148701b;
        if (lightSkinSmoothGroupFilter != null) {
            lightSkinSmoothGroupFilter.setSmoothLevel(f);
        }
    }
}
