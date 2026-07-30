package p149l;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.annotation.ColorRes;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class n6k extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public LinearGradient f137416a;

    /* JADX INFO: renamed from: c */
    public int f137418c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: d */
    public int f137419d = 20;

    /* JADX INFO: renamed from: e */
    public int f137420e = -1000;

    /* JADX INFO: renamed from: f */
    @ColorRes
    public int f137421f = h1c0.f105416w1;

    /* JADX INFO: renamed from: g */
    public int f137422g = -1000;

    /* JADX INFO: renamed from: h */
    public boolean f137423h = false;

    /* JADX INFO: renamed from: b */
    public final Matrix f137417b = new Matrix();

    /* JADX INFO: renamed from: a */
    public void m158060a(boolean z) {
        this.f137423h = z;
    }

    /* JADX INFO: renamed from: b */
    public void m158061b(List<String> list) {
        if (vwb.m200296J(list)) {
            this.f137416a = new LinearGradient(0.0f, 0.0f, 500.0f, 0.0f, new int[]{kvc0.m147352a(this.f137421f), kvc0.m147352a(h1c0.f105417x), kvc0.m147352a(h1c0.f105301C0), kvc0.m147352a(h1c0.f105331R0), kvc0.m147352a(this.f137421f)}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        int size = list.size();
        int i = size + 2;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || i2 == size + 1) {
                iArr[i2] = kvc0.m147352a(this.f137421f);
            } else {
                iArr[i2] = kvc0.m147358g(list.get(i2 - 1));
            }
        }
        this.f137416a = new LinearGradient(0.0f, 0.0f, 500.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: c */
    public void m158062c(int i) {
        this.f137420e = i;
    }

    /* JADX INFO: renamed from: d */
    public void m158063d(int i) {
        this.f137421f = i;
    }

    /* JADX INFO: renamed from: e */
    public void m158064e(int i) {
        this.f137418c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m158065f(int i) {
        this.f137419d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i = this.f137422g + this.f137419d;
        this.f137422g = i;
        if (i < this.f137418c) {
            this.f137417b.setTranslate(i, 0.0f);
            this.f137416a.setLocalMatrix(this.f137417b);
        } else if (this.f137423h) {
            this.f137422g = this.f137420e;
        }
        textPaint.setColor(kvc0.m147352a(this.f137421f));
        textPaint.setShader(this.f137416a);
    }
}
