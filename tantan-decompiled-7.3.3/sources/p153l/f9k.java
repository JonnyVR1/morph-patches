package p153l;

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
public class f9k extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public LinearGradient f97889a;

    /* JADX INFO: renamed from: c */
    public int f97891c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: d */
    public int f97892d = 20;

    /* JADX INFO: renamed from: e */
    public int f97893e = -1000;

    /* JADX INFO: renamed from: f */
    @ColorRes
    public int f97894f = n9c0.f140877w1;

    /* JADX INFO: renamed from: g */
    public int f97895g = -1000;

    /* JADX INFO: renamed from: h */
    public boolean f97896h = false;

    /* JADX INFO: renamed from: b */
    public final Matrix f97890b = new Matrix();

    /* JADX INFO: renamed from: a */
    public void m124668a(boolean z) {
        this.f97896h = z;
    }

    /* JADX INFO: renamed from: b */
    public void m124669b(List<String> list) {
        if (jyb.m147479J(list)) {
            this.f97889a = new LinearGradient(0.0f, 0.0f, 500.0f, 0.0f, new int[]{n3d0.m161277a(this.f97894f), n3d0.m161277a(n9c0.f140878x), n3d0.m161277a(n9c0.f140762C0), n3d0.m161277a(n9c0.f140792R0), n3d0.m161277a(this.f97894f)}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        int size = list.size();
        int i = size + 2;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || i2 == size + 1) {
                iArr[i2] = n3d0.m161277a(this.f97894f);
            } else {
                iArr[i2] = n3d0.m161283g(list.get(i2 - 1));
            }
        }
        this.f97889a = new LinearGradient(0.0f, 0.0f, 500.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: c */
    public void m124670c(int i) {
        this.f97893e = i;
    }

    /* JADX INFO: renamed from: d */
    public void m124671d(int i) {
        this.f97894f = i;
    }

    /* JADX INFO: renamed from: e */
    public void m124672e(int i) {
        this.f97891c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m124673f(int i) {
        this.f97892d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i = this.f97895g + this.f97892d;
        this.f97895g = i;
        if (i < this.f97891c) {
            this.f97890b.setTranslate(i, 0.0f);
            this.f97889a.setLocalMatrix(this.f97890b);
        } else if (this.f97896h) {
            this.f97895g = this.f97893e;
        }
        textPaint.setColor(n3d0.m161277a(this.f97894f));
        textPaint.setShader(this.f97889a);
    }
}
