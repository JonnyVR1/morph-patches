package p003l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tu4 {

    /* JADX INFO: renamed from: a */
    public int f7764a;

    /* JADX INFO: renamed from: b */
    public int f7765b;

    /* JADX INFO: renamed from: c */
    public int f7766c;

    /* JADX INFO: renamed from: d */
    public int f7767d;

    /* JADX INFO: renamed from: e */
    public int f7768e;

    /* JADX INFO: renamed from: f */
    public int f7769f;

    /* JADX INFO: renamed from: g */
    public int f7770g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f7771h = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: i */
    public int f7772i = -1;

    /* JADX INFO: renamed from: j */
    public long f7773j = 1000;

    /* JADX INFO: renamed from: l */
    public boolean f7775l = false;

    /* JADX INFO: renamed from: m */
    public float f7776m = 1.0f;

    /* JADX INFO: renamed from: k */
    public List<j760<Integer, Boolean>> f7774k = new ArrayList();

    public tu4(int i, int i2) {
        this.f7764a = i;
        this.f7765b = i2;
    }

    /* JADX INFO: renamed from: a */
    public static tu4 m8031a(Sticker sticker) {
        if (sticker != null && TEnum.equals(sticker.source, "poke")) {
            if (TextUtils.equals(sticker.name, "晚安")) {
                tu4 tu4Var = new tu4(-1, -1);
                tu4Var.m8032b(17);
                tu4Var.f7772i = 31;
                tu4Var.f7773j = 300L;
                return tu4Var;
            }
            if (TextUtils.equals(sticker.name, "震惊")) {
                tu4 tu4Var2 = new tu4(-1, t100.d(400.0f));
                tu4Var2.m8032b(81);
                tu4Var2.m8033c(t100.d(38.0f), 0, t100.d(38.0f), t100.d(105.0f));
                tu4Var2.f7772i = 47;
                tu4Var2.f7775l = true;
                return tu4Var2;
            }
            if (TextUtils.equals(sticker.name, "大笑")) {
                tu4 tu4Var3 = new tu4(-1, t100.d(233.0f));
                tu4Var3.m8032b(81);
                tu4Var3.m8033c(0, 0, 0, t100.d(180.0f));
                tu4Var3.f7772i = 3;
                tu4Var3.f7776m = 0.8f;
                tu4Var3.f7775l = true;
                return tu4Var3;
            }
            if (TextUtils.equals(sticker.name, "大哭")) {
                tu4 tu4Var4 = new tu4(-1, t100.d(267.0f));
                tu4Var4.m8032b(81);
                tu4Var4.m8033c(0, 0, 0, t100.d(107.0f));
                tu4Var4.m8034d(ImageView.ScaleType.FIT_END);
                tu4Var4.f7772i = 60;
                tu4Var4.f7775l = true;
                return tu4Var4;
            }
            if (TextUtils.equals(sticker.name, "比心")) {
                tu4 tu4Var5 = new tu4(-1, t100.d(495.0f));
                tu4Var5.m8032b(17);
                tu4Var5.m8033c(0, 0, 0, 0);
                tu4Var5.f7772i = 98;
                tu4Var5.f7775l = true;
                tu4Var5.f7776m = 0.4f;
                return tu4Var5;
            }
            if (TextUtils.equals(sticker.name, "在吗")) {
                tu4 tu4Var6 = new tu4(t100.d(160.0f), t100.d(200.0f));
                tu4Var6.m8032b(17);
                tu4Var6.m8033c(0, 0, 0, 0);
                List<j760<Integer, Boolean>> list = tu4Var6.f7774k;
                Boolean bool = Boolean.FALSE;
                list.add(j760.a(22, bool));
                tu4Var6.f7774k.add(j760.a(49, bool));
                tu4Var6.f7775l = true;
                tu4Var6.f7776m = 0.4f;
                return tu4Var6;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m8032b(int i) {
        this.f7770g = i;
    }

    /* JADX INFO: renamed from: c */
    public void m8033c(int i, int i2, int i3, int i4) {
        this.f7766c = i;
        this.f7768e = i2;
        this.f7767d = i3;
        this.f7769f = i4;
    }

    /* JADX INFO: renamed from: d */
    public void m8034d(ImageView.ScaleType scaleType) {
        this.f7771h = scaleType;
    }

    /* JADX INFO: renamed from: e */
    public void m8035e(SVGAnimationView sVGAnimationView, int i, View view, View view2) {
        int i2;
        if (sVGAnimationView.getLayoutParams() != null) {
            int height = view.getHeight() - view2.getHeight();
            if (height > 0 && (i2 = this.f7769f) > 0) {
                this.f7769f = i2 + height;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVGAnimationView.getLayoutParams();
            layoutParams.setMargins(this.f7766c, this.f7768e, this.f7767d, this.f7769f);
            if (this.f7775l) {
                sVGAnimationView.setTranslationY(i * this.f7776m);
            }
            layoutParams.gravity = this.f7770g;
            layoutParams.width = this.f7764a;
            layoutParams.height = this.f7765b;
            sVGAnimationView.setLayoutParams(layoutParams);
            sVGAnimationView.setScaleType(this.f7771h);
        }
    }
}
