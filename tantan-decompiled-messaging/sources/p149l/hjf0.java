package p149l;

import android.content.Context;
import com.momo.mcamera.mask.AISkinWhiteningFilter;
import com.momo.mcamera.mask.CXSkinWhiteningFilter;
import com.momo.mcamera.mask.FaceLightingFilter;
import com.momo.mcamera.mask.VersionType;

/* JADX INFO: loaded from: classes7.dex */
public class hjf0 {

    /* JADX INFO: renamed from: a */
    private FaceLightingFilter f108076a;

    /* JADX INFO: renamed from: b */
    private CXSkinWhiteningFilter f108077b;

    /* JADX INFO: renamed from: c */
    private AISkinWhiteningFilter f108078c = new AISkinWhiteningFilter();

    /* JADX INFO: renamed from: d */
    private float f108079d;

    /* JADX INFO: renamed from: a */
    public float m131371a() {
        return this.f108079d;
    }

    /* JADX INFO: renamed from: b */
    public ts2 m131372b(Context context, int i) {
        if (i == 1) {
            if (this.f108077b == null) {
                this.f108077b = (CXSkinWhiteningFilter) this.f108078c.getSkinWhiteningFilter(context, VersionType.CXSkinVersion.VersionType1);
            }
            CXSkinWhiteningFilter cXSkinWhiteningFilter = this.f108077b;
            this.f108076a = null;
            return cXSkinWhiteningFilter;
        }
        if (this.f108076a == null) {
            this.f108076a = (FaceLightingFilter) this.f108078c.getSkinWhiteningFilter(context, VersionType.CXSkinVersion.VersionType2);
        }
        FaceLightingFilter faceLightingFilter = this.f108076a;
        this.f108077b = null;
        return faceLightingFilter;
    }

    /* JADX INFO: renamed from: c */
    public void m131373c(float f) {
        this.f108079d = f;
        this.f108078c.setSkinLightLevel(f);
    }
}
