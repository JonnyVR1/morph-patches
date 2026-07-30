package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class sv4 {

    /* JADX INFO: renamed from: a */
    public int f170794a;

    /* JADX INFO: renamed from: b */
    public int f170795b;

    /* JADX INFO: renamed from: c */
    public int f170796c;

    /* JADX INFO: renamed from: d */
    public int f170797d;

    /* JADX INFO: renamed from: e */
    public int f170798e;

    /* JADX INFO: renamed from: f */
    public int f170799f;

    /* JADX INFO: renamed from: g */
    public int f170800g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f170801h = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: i */
    public int f170802i = -1;

    /* JADX INFO: renamed from: j */
    public long f170803j = 1000;

    /* JADX INFO: renamed from: l */
    public boolean f170805l = false;

    /* JADX INFO: renamed from: m */
    public float f170806m = 1.0f;

    /* JADX INFO: renamed from: k */
    public List<pf60<Integer, Boolean>> f170804k = new ArrayList();

    public sv4(int i, int i2) {
        this.f170794a = i;
        this.f170795b = i2;
    }

    /* JADX INFO: renamed from: a */
    public static sv4 m188109a(Sticker sticker) {
        if (sticker != null && TEnum.equals(sticker.source, "poke")) {
            if (TextUtils.equals(sticker.name, "晚安")) {
                sv4 sv4Var = new sv4(-1, -1);
                sv4Var.m188110b(17);
                sv4Var.f170802i = 31;
                sv4Var.f170803j = 300L;
                return sv4Var;
            }
            if (TextUtils.equals(sticker.name, "震惊")) {
                sv4 sv4Var2 = new sv4(-1, qa00.m175859d(400.0f));
                sv4Var2.m188110b(81);
                sv4Var2.m188111c(qa00.m175859d(38.0f), 0, qa00.m175859d(38.0f), qa00.m175859d(105.0f));
                sv4Var2.f170802i = 47;
                sv4Var2.f170805l = true;
                return sv4Var2;
            }
            if (TextUtils.equals(sticker.name, "大笑")) {
                sv4 sv4Var3 = new sv4(-1, qa00.m175859d(233.0f));
                sv4Var3.m188110b(81);
                sv4Var3.m188111c(0, 0, 0, qa00.m175859d(180.0f));
                sv4Var3.f170802i = 3;
                sv4Var3.f170806m = 0.8f;
                sv4Var3.f170805l = true;
                return sv4Var3;
            }
            if (TextUtils.equals(sticker.name, "大哭")) {
                sv4 sv4Var4 = new sv4(-1, qa00.m175859d(267.0f));
                sv4Var4.m188110b(81);
                sv4Var4.m188111c(0, 0, 0, qa00.m175859d(107.0f));
                sv4Var4.m188112d(ImageView.ScaleType.FIT_END);
                sv4Var4.f170802i = 60;
                sv4Var4.f170805l = true;
                return sv4Var4;
            }
            if (TextUtils.equals(sticker.name, "比心")) {
                sv4 sv4Var5 = new sv4(-1, qa00.m175859d(495.0f));
                sv4Var5.m188110b(17);
                sv4Var5.m188111c(0, 0, 0, 0);
                sv4Var5.f170802i = 98;
                sv4Var5.f170805l = true;
                sv4Var5.f170806m = 0.4f;
                return sv4Var5;
            }
            if (TextUtils.equals(sticker.name, "在吗")) {
                sv4 sv4Var6 = new sv4(qa00.m175859d(160.0f), qa00.m175859d(200.0f));
                sv4Var6.m188110b(17);
                sv4Var6.m188111c(0, 0, 0, 0);
                List<pf60<Integer, Boolean>> list = sv4Var6.f170804k;
                Boolean bool = Boolean.FALSE;
                list.add(pf60.m172085a(22, bool));
                sv4Var6.f170804k.add(pf60.m172085a(49, bool));
                sv4Var6.f170805l = true;
                sv4Var6.f170806m = 0.4f;
                return sv4Var6;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m188110b(int i) {
        this.f170800g = i;
    }

    /* JADX INFO: renamed from: c */
    public void m188111c(int i, int i2, int i3, int i4) {
        this.f170796c = i;
        this.f170798e = i2;
        this.f170797d = i3;
        this.f170799f = i4;
    }

    /* JADX INFO: renamed from: d */
    public void m188112d(ImageView.ScaleType scaleType) {
        this.f170801h = scaleType;
    }

    /* JADX INFO: renamed from: e */
    public void m188113e(SVGAnimationView sVGAnimationView, int i, View view, View view2) {
        int i2;
        if (sVGAnimationView.getLayoutParams() != null) {
            int height = view.getHeight() - view2.getHeight();
            if (height > 0 && (i2 = this.f170799f) > 0) {
                this.f170799f = i2 + height;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVGAnimationView.getLayoutParams();
            layoutParams.setMargins(this.f170796c, this.f170798e, this.f170797d, this.f170799f);
            if (this.f170805l) {
                sVGAnimationView.setTranslationY(i * this.f170806m);
            }
            layoutParams.gravity = this.f170800g;
            layoutParams.width = this.f170794a;
            layoutParams.height = this.f170795b;
            sVGAnimationView.setLayoutParams(layoutParams);
            sVGAnimationView.setScaleType(this.f170801h);
        }
    }
}
