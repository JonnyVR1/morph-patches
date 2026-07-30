package p153l;

import android.content.Context;
import com.momo.mcamera.mask.AISkinWhiteningFilter;
import com.momo.mcamera.mask.CXSkinWhiteningFilter;
import com.momo.mcamera.mask.FaceLightingFilter;
import com.momo.mcamera.mask.VersionType;

/* JADX INFO: loaded from: classes7.dex */
public class qrf0 {

    /* JADX INFO: renamed from: a */
    private FaceLightingFilter f159111a;

    /* JADX INFO: renamed from: b */
    private CXSkinWhiteningFilter f159112b;

    /* JADX INFO: renamed from: c */
    private AISkinWhiteningFilter f159113c = new AISkinWhiteningFilter();

    /* JADX INFO: renamed from: d */
    private float f159114d;

    /* JADX INFO: renamed from: a */
    public float m177542a() {
        return this.f159114d;
    }

    /* JADX INFO: renamed from: b */
    public jt2 m177543b(Context context, int i) {
        if (i == 1) {
            if (this.f159112b == null) {
                this.f159112b = (CXSkinWhiteningFilter) this.f159113c.getSkinWhiteningFilter(context, VersionType.CXSkinVersion.VersionType1);
            }
            CXSkinWhiteningFilter cXSkinWhiteningFilter = this.f159112b;
            this.f159111a = null;
            return cXSkinWhiteningFilter;
        }
        if (this.f159111a == null) {
            this.f159111a = (FaceLightingFilter) this.f159113c.getSkinWhiteningFilter(context, VersionType.CXSkinVersion.VersionType2);
        }
        FaceLightingFilter faceLightingFilter = this.f159111a;
        this.f159112b = null;
        return faceLightingFilter;
    }

    /* JADX INFO: renamed from: c */
    public void m177544c(float f) {
        this.f159114d = f;
        this.f159113c.setSkinLightLevel(f);
    }
}
