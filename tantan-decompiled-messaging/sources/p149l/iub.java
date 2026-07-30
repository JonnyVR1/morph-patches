package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.FloatRange;
import com.p046p1.mobile.android.p048ui.cropiwa.config.InitialPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class iub {

    /* JADX INFO: renamed from: a */
    public float f114988a;

    /* JADX INFO: renamed from: b */
    public float f114989b;

    /* JADX INFO: renamed from: c */
    public boolean f114990c;

    /* JADX INFO: renamed from: d */
    public boolean f114991d;

    /* JADX INFO: renamed from: f */
    public float f114993f;

    /* JADX INFO: renamed from: h */
    public int f114995h;

    /* JADX INFO: renamed from: i */
    public int f114996i;

    /* JADX INFO: renamed from: k */
    public InitialPosition f114998k;

    /* JADX INFO: renamed from: e */
    public boolean f114992e = true;

    /* JADX INFO: renamed from: g */
    public int f114994g = RoundedDrawable.DEFAULT_BORDER_COLOR;

    /* JADX INFO: renamed from: j */
    public boolean f114997j = true;

    /* JADX INFO: renamed from: l */
    public List<zu5> f114999l = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static iub m138365c() {
        return new iub().m138384t(3.0f).m138385u(0.7f).m138383s(true).m138382r(true).m138386v(-1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static iub m138366d(Context context, AttributeSet attributeSet) {
        iub iubVarM138365c = m138365c();
        if (attributeSet == null) {
            return iubVarM138365c;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74233C);
        try {
            iubVarM138365c.m138384t(typedArrayObtainStyledAttributes.getFloat(b9c0.f74343T, iubVarM138365c.m138373i()));
            iubVarM138365c.m138383s(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74373Y, iubVarM138365c.m138378n()));
            iubVarM138365c.m138382r(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74367X, iubVarM138365c.m138377m()));
            iubVarM138365c.m138381q(InitialPosition.values()[typedArrayObtainStyledAttributes.getInt(b9c0.f74337S, 0)]);
            iubVarM138365c.m138379o(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74289K, iubVarM138365c.m138376l()));
            return iubVarM138365c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m138367a(zu5 zu5Var) {
        if (zu5Var != null) {
            this.f114999l.add(zu5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m138368b() {
        Iterator<zu5> it = this.f114999l.iterator();
        while (it.hasNext()) {
            it.next().mo20918a();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m138369e() {
        return this.f114994g;
    }

    /* JADX INFO: renamed from: f */
    public int m138370f() {
        return this.f114995h;
    }

    /* JADX INFO: renamed from: g */
    public int m138371g() {
        return this.f114996i;
    }

    /* JADX INFO: renamed from: h */
    public InitialPosition m138372h() {
        return this.f114998k;
    }

    /* JADX INFO: renamed from: i */
    public float m138373i() {
        return this.f114988a;
    }

    /* JADX INFO: renamed from: j */
    public float m138374j() {
        return this.f114989b;
    }

    /* JADX INFO: renamed from: k */
    public float m138375k() {
        return this.f114993f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m138376l() {
        return this.f114992e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m138377m() {
        return this.f114990c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m138378n() {
        return this.f114991d;
    }

    /* JADX INFO: renamed from: o */
    public void m138379o(boolean z) {
        this.f114992e = z;
    }

    /* JADX INFO: renamed from: p */
    public iub m138380p(int i, int i2) {
        this.f114996i = i;
        this.f114995h = i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public iub m138381q(InitialPosition initialPosition) {
        this.f114998k = initialPosition;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public iub m138382r(boolean z) {
        this.f114990c = z;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public iub m138383s(boolean z) {
        this.f114991d = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public iub m138384t(@FloatRange(from = 0.001d) float f) {
        this.f114988a = f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public iub m138385u(@FloatRange(from = 0.001d) float f) {
        this.f114989b = f;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public iub m138386v(@FloatRange(from = 0.01d, to = 1.0d) float f) {
        this.f114993f = f;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m138387w() {
        return this.f114997j;
    }
}
