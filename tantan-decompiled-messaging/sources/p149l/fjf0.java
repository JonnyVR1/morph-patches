package p149l;

import com.momo.mcamera.mask.SkinChooseFilter;
import com.momo.mcamera.mask.lightskin.LightSkinSmoothGroupFilter;

/* JADX INFO: loaded from: classes7.dex */
public class fjf0 {

    /* JADX INFO: renamed from: a */
    private SkinChooseFilter f97776a;

    /* JADX INFO: renamed from: b */
    private LightSkinSmoothGroupFilter f97777b;

    /* JADX INFO: renamed from: a */
    public ts2 m121591a(int i) {
        if (i == 1) {
            if (this.f97777b == null) {
                this.f97777b = new LightSkinSmoothGroupFilter();
            }
            LightSkinSmoothGroupFilter lightSkinSmoothGroupFilter = this.f97777b;
            this.f97776a = null;
            return lightSkinSmoothGroupFilter;
        }
        if (this.f97776a == null) {
            this.f97776a = new SkinChooseFilter(false, 0.0f, SkinChooseFilter.SKIN_TYPE_SMOOTH_DEFAULT);
        }
        SkinChooseFilter skinChooseFilter = this.f97776a;
        this.f97777b = null;
        return skinChooseFilter;
    }

    /* JADX INFO: renamed from: b */
    public float m121592b() {
        LightSkinSmoothGroupFilter lightSkinSmoothGroupFilter = this.f97777b;
        if (lightSkinSmoothGroupFilter != null) {
            return lightSkinSmoothGroupFilter.getSmoothLevel();
        }
        SkinChooseFilter skinChooseFilter = this.f97776a;
        if (skinChooseFilter != null) {
            return skinChooseFilter.getSkinLevel();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m121593c(float f) {
        SkinChooseFilter skinChooseFilter = this.f97776a;
        if (skinChooseFilter != null) {
            skinChooseFilter.setSmoothLevel(f);
            return;
        }
        LightSkinSmoothGroupFilter lightSkinSmoothGroupFilter = this.f97777b;
        if (lightSkinSmoothGroupFilter != null) {
            lightSkinSmoothGroupFilter.setSmoothLevel(f);
        }
    }
}
