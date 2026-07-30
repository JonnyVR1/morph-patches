package p007l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.FloatRange;
import com.p003p1.mobile.android.p005ui.cropiwa.config.InitialPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class iub {

    /* JADX INFO: renamed from: a */
    public float f2926a;

    /* JADX INFO: renamed from: b */
    public float f2927b;

    /* JADX INFO: renamed from: c */
    public boolean f2928c;

    /* JADX INFO: renamed from: d */
    public boolean f2929d;

    /* JADX INFO: renamed from: f */
    public float f2931f;

    /* JADX INFO: renamed from: h */
    public int f2933h;

    /* JADX INFO: renamed from: i */
    public int f2934i;

    /* JADX INFO: renamed from: k */
    public InitialPosition f2936k;

    /* JADX INFO: renamed from: e */
    public boolean f2930e = true;

    /* JADX INFO: renamed from: g */
    public int f2932g = -16777216;

    /* JADX INFO: renamed from: j */
    public boolean f2935j = true;

    /* JADX INFO: renamed from: l */
    public List<zu5> f2937l = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static iub m9426c() {
        return new iub().m9445t(3.0f).m9446u(0.7f).m9444s(true).m9443r(true).m9447v(-1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static iub m9427d(Context context, AttributeSet attributeSet) {
        iub iubVarM9426c = m9426c();
        if (attributeSet == null) {
            return iubVarM9426c;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f1956C);
        try {
            iubVarM9426c.m9445t(typedArrayObtainStyledAttributes.getFloat(b9c0.f2066T, iubVarM9426c.m9434i()));
            iubVarM9426c.m9444s(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2096Y, iubVarM9426c.m9439n()));
            iubVarM9426c.m9443r(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2090X, iubVarM9426c.m9438m()));
            iubVarM9426c.m9442q(InitialPosition.values()[typedArrayObtainStyledAttributes.getInt(b9c0.f2060S, 0)]);
            iubVarM9426c.m9440o(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2012K, iubVarM9426c.m9437l()));
            return iubVarM9426c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m9428a(zu5 zu5Var) {
        if (zu5Var != null) {
            this.f2937l.add(zu5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9429b() {
        Iterator<zu5> it = this.f2937l.iterator();
        while (it.hasNext()) {
            it.next().mo1190a();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m9430e() {
        return this.f2932g;
    }

    /* JADX INFO: renamed from: f */
    public int m9431f() {
        return this.f2933h;
    }

    /* JADX INFO: renamed from: g */
    public int m9432g() {
        return this.f2934i;
    }

    /* JADX INFO: renamed from: h */
    public InitialPosition m9433h() {
        return this.f2936k;
    }

    /* JADX INFO: renamed from: i */
    public float m9434i() {
        return this.f2926a;
    }

    /* JADX INFO: renamed from: j */
    public float m9435j() {
        return this.f2927b;
    }

    /* JADX INFO: renamed from: k */
    public float m9436k() {
        return this.f2931f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m9437l() {
        return this.f2930e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m9438m() {
        return this.f2928c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m9439n() {
        return this.f2929d;
    }

    /* JADX INFO: renamed from: o */
    public void m9440o(boolean z) {
        this.f2930e = z;
    }

    /* JADX INFO: renamed from: p */
    public iub m9441p(int i, int i2) {
        this.f2934i = i;
        this.f2933h = i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public iub m9442q(InitialPosition initialPosition) {
        this.f2936k = initialPosition;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public iub m9443r(boolean z) {
        this.f2928c = z;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public iub m9444s(boolean z) {
        this.f2929d = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public iub m9445t(@FloatRange(from = 0.001d) float f) {
        this.f2926a = f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public iub m9446u(@FloatRange(from = 0.001d) float f) {
        this.f2927b = f;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public iub m9447v(@FloatRange(from = 0.01d, to = 1.0d) float f) {
        this.f2931f = f;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m9448w() {
        return this.f2935j;
    }
}
