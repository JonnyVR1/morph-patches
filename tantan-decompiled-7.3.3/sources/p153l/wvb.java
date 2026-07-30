package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.FloatRange;
import com.p051p1.mobile.android.p053ui.cropiwa.config.InitialPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class wvb {

    /* JADX INFO: renamed from: a */
    public float f190934a;

    /* JADX INFO: renamed from: b */
    public float f190935b;

    /* JADX INFO: renamed from: c */
    public boolean f190936c;

    /* JADX INFO: renamed from: d */
    public boolean f190937d;

    /* JADX INFO: renamed from: f */
    public float f190939f;

    /* JADX INFO: renamed from: h */
    public int f190941h;

    /* JADX INFO: renamed from: i */
    public int f190942i;

    /* JADX INFO: renamed from: k */
    public InitialPosition f190944k;

    /* JADX INFO: renamed from: e */
    public boolean f190938e = true;

    /* JADX INFO: renamed from: g */
    public int f190940g = RoundedDrawable.DEFAULT_BORDER_COLOR;

    /* JADX INFO: renamed from: j */
    public boolean f190943j = true;

    /* JADX INFO: renamed from: l */
    public List<dw5> f190945l = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static wvb m208033c() {
        return new wvb().m208052t(3.0f).m208053u(0.7f).m208051s(true).m208050r(true).m208054v(-1.0f);
    }

    /* JADX INFO: renamed from: d */
    public static wvb m208034d(Context context, AttributeSet attributeSet) {
        wvb wvbVarM208033c = m208033c();
        if (attributeSet == null) {
            return wvbVarM208033c;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109542C);
        try {
            wvbVarM208033c.m208052t(typedArrayObtainStyledAttributes.getFloat(hhc0.f109652T, wvbVarM208033c.m208041i()));
            wvbVarM208033c.m208051s(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109682Y, wvbVarM208033c.m208046n()));
            wvbVarM208033c.m208050r(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109676X, wvbVarM208033c.m208045m()));
            wvbVarM208033c.m208049q(InitialPosition.values()[typedArrayObtainStyledAttributes.getInt(hhc0.f109646S, 0)]);
            wvbVarM208033c.m208047o(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109598K, wvbVarM208033c.m208044l()));
            return wvbVarM208033c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m208035a(dw5 dw5Var) {
        if (dw5Var != null) {
            this.f190945l.add(dw5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m208036b() {
        Iterator<dw5> it = this.f190945l.iterator();
        while (it.hasNext()) {
            it.next().mo21917a();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m208037e() {
        return this.f190940g;
    }

    /* JADX INFO: renamed from: f */
    public int m208038f() {
        return this.f190941h;
    }

    /* JADX INFO: renamed from: g */
    public int m208039g() {
        return this.f190942i;
    }

    /* JADX INFO: renamed from: h */
    public InitialPosition m208040h() {
        return this.f190944k;
    }

    /* JADX INFO: renamed from: i */
    public float m208041i() {
        return this.f190934a;
    }

    /* JADX INFO: renamed from: j */
    public float m208042j() {
        return this.f190935b;
    }

    /* JADX INFO: renamed from: k */
    public float m208043k() {
        return this.f190939f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m208044l() {
        return this.f190938e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m208045m() {
        return this.f190936c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m208046n() {
        return this.f190937d;
    }

    /* JADX INFO: renamed from: o */
    public void m208047o(boolean z) {
        this.f190938e = z;
    }

    /* JADX INFO: renamed from: p */
    public wvb m208048p(int i, int i2) {
        this.f190942i = i;
        this.f190941h = i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public wvb m208049q(InitialPosition initialPosition) {
        this.f190944k = initialPosition;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public wvb m208050r(boolean z) {
        this.f190936c = z;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public wvb m208051s(boolean z) {
        this.f190937d = z;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public wvb m208052t(@FloatRange(from = 0.001d) float f) {
        this.f190934a = f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public wvb m208053u(@FloatRange(from = 0.001d) float f) {
        this.f190935b = f;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public wvb m208054v(@FloatRange(from = 0.01d, to = 1.0d) float f) {
        this.f190939f = f;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m208055w() {
        return this.f190943j;
    }
}
