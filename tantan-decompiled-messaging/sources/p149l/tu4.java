package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tu4 {

    /* JADX INFO: renamed from: a */
    public int f172116a;

    /* JADX INFO: renamed from: b */
    public int f172117b;

    /* JADX INFO: renamed from: c */
    public int f172118c;

    /* JADX INFO: renamed from: d */
    public int f172119d;

    /* JADX INFO: renamed from: e */
    public int f172120e;

    /* JADX INFO: renamed from: f */
    public int f172121f;

    /* JADX INFO: renamed from: g */
    public int f172122g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f172123h = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: i */
    public int f172124i = -1;

    /* JADX INFO: renamed from: j */
    public long f172125j = 1000;

    /* JADX INFO: renamed from: l */
    public boolean f172127l = false;

    /* JADX INFO: renamed from: m */
    public float f172128m = 1.0f;

    /* JADX INFO: renamed from: k */
    public List<j760<Integer, Boolean>> f172126k = new ArrayList();

    public tu4(int i, int i2) {
        this.f172116a = i;
        this.f172117b = i2;
    }

    /* JADX INFO: renamed from: a */
    public static tu4 m190676a(Sticker sticker) {
        if (sticker != null && TEnum.equals(sticker.source, "poke")) {
            if (TextUtils.equals(sticker.name, "晚安")) {
                tu4 tu4Var = new tu4(-1, -1);
                tu4Var.m190677b(17);
                tu4Var.f172124i = 31;
                tu4Var.f172125j = 300L;
                return tu4Var;
            }
            if (TextUtils.equals(sticker.name, "震惊")) {
                tu4 tu4Var2 = new tu4(-1, t100.m186890d(400.0f));
                tu4Var2.m190677b(81);
                tu4Var2.m190678c(t100.m186890d(38.0f), 0, t100.m186890d(38.0f), t100.m186890d(105.0f));
                tu4Var2.f172124i = 47;
                tu4Var2.f172127l = true;
                return tu4Var2;
            }
            if (TextUtils.equals(sticker.name, "大笑")) {
                tu4 tu4Var3 = new tu4(-1, t100.m186890d(233.0f));
                tu4Var3.m190677b(81);
                tu4Var3.m190678c(0, 0, 0, t100.m186890d(180.0f));
                tu4Var3.f172124i = 3;
                tu4Var3.f172128m = 0.8f;
                tu4Var3.f172127l = true;
                return tu4Var3;
            }
            if (TextUtils.equals(sticker.name, "大哭")) {
                tu4 tu4Var4 = new tu4(-1, t100.m186890d(267.0f));
                tu4Var4.m190677b(81);
                tu4Var4.m190678c(0, 0, 0, t100.m186890d(107.0f));
                tu4Var4.m190679d(ImageView.ScaleType.FIT_END);
                tu4Var4.f172124i = 60;
                tu4Var4.f172127l = true;
                return tu4Var4;
            }
            if (TextUtils.equals(sticker.name, "比心")) {
                tu4 tu4Var5 = new tu4(-1, t100.m186890d(495.0f));
                tu4Var5.m190677b(17);
                tu4Var5.m190678c(0, 0, 0, 0);
                tu4Var5.f172124i = 98;
                tu4Var5.f172127l = true;
                tu4Var5.f172128m = 0.4f;
                return tu4Var5;
            }
            if (TextUtils.equals(sticker.name, "在吗")) {
                tu4 tu4Var6 = new tu4(t100.m186890d(160.0f), t100.m186890d(200.0f));
                tu4Var6.m190677b(17);
                tu4Var6.m190678c(0, 0, 0, 0);
                List<j760<Integer, Boolean>> list = tu4Var6.f172126k;
                Boolean bool = Boolean.FALSE;
                list.add(j760.m140076a(22, bool));
                tu4Var6.f172126k.add(j760.m140076a(49, bool));
                tu4Var6.f172127l = true;
                tu4Var6.f172128m = 0.4f;
                return tu4Var6;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m190677b(int i) {
        this.f172122g = i;
    }

    /* JADX INFO: renamed from: c */
    public void m190678c(int i, int i2, int i3, int i4) {
        this.f172118c = i;
        this.f172120e = i2;
        this.f172119d = i3;
        this.f172121f = i4;
    }

    /* JADX INFO: renamed from: d */
    public void m190679d(ImageView.ScaleType scaleType) {
        this.f172123h = scaleType;
    }

    /* JADX INFO: renamed from: e */
    public void m190680e(SVGAnimationView sVGAnimationView, int i, View view, View view2) {
        int i2;
        if (sVGAnimationView.getLayoutParams() != null) {
            int height = view.getHeight() - view2.getHeight();
            if (height > 0 && (i2 = this.f172121f) > 0) {
                this.f172121f = i2 + height;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVGAnimationView.getLayoutParams();
            layoutParams.setMargins(this.f172118c, this.f172120e, this.f172119d, this.f172121f);
            if (this.f172127l) {
                sVGAnimationView.setTranslationY(i * this.f172128m);
            }
            layoutParams.gravity = this.f172122g;
            layoutParams.width = this.f172116a;
            layoutParams.height = this.f172117b;
            sVGAnimationView.setLayoutParams(layoutParams);
            sVGAnimationView.setScaleType(this.f172123h);
        }
    }
}
