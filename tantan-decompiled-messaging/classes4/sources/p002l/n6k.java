package p002l;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.annotation.ColorRes;
import java.util.List;
import l.kvc0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n6k extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public LinearGradient f15837a;

    /* JADX INFO: renamed from: c */
    public int f15839c = 1500;

    /* JADX INFO: renamed from: d */
    public int f15840d = 20;

    /* JADX INFO: renamed from: e */
    public int f15841e = -1000;

    /* JADX INFO: renamed from: f */
    @ColorRes
    public int f15842f = h1c0.f11836w1;

    /* JADX INFO: renamed from: g */
    public int f15843g = -1000;

    /* JADX INFO: renamed from: h */
    public boolean f15844h = false;

    /* JADX INFO: renamed from: b */
    public final Matrix f15838b = new Matrix();

    /* JADX INFO: renamed from: a */
    public void m18510a(boolean z) {
        this.f15844h = z;
    }

    /* JADX INFO: renamed from: b */
    public void m18511b(List<String> list) {
        if (vwb.J(list)) {
            this.f15837a = new LinearGradient(0.0f, 0.0f, 500.0f, 0.0f, new int[]{kvc0.a(this.f15842f), kvc0.a(h1c0.f11837x), kvc0.a(h1c0.f11721C0), kvc0.a(h1c0.f11751R0), kvc0.a(this.f15842f)}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        int size = list.size();
        int i = size + 2;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || i2 == size + 1) {
                iArr[i2] = kvc0.a(this.f15842f);
            } else {
                iArr[i2] = kvc0.g(list.get(i2 - 1));
            }
        }
        this.f15837a = new LinearGradient(0.0f, 0.0f, 500.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: c */
    public void m18512c(int i) {
        this.f15841e = i;
    }

    /* JADX INFO: renamed from: d */
    public void m18513d(int i) {
        this.f15842f = i;
    }

    /* JADX INFO: renamed from: e */
    public void m18514e(int i) {
        this.f15839c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m18515f(int i) {
        this.f15840d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i = this.f15843g + this.f15840d;
        this.f15843g = i;
        if (i < this.f15839c) {
            this.f15838b.setTranslate(i, 0.0f);
            this.f15837a.setLocalMatrix(this.f15838b);
        } else if (this.f15844h) {
            this.f15843g = this.f15841e;
        }
        textPaint.setColor(kvc0.a(this.f15842f));
        textPaint.setShader(this.f15837a);
    }
}
