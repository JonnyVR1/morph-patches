package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pol0 {

    /* JADX INFO: renamed from: o */
    public static AtomicInteger f18799o = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public View f18800a;

    /* JADX INFO: renamed from: b */
    public String f18801b;

    /* JADX INFO: renamed from: c */
    public Object f18802c;

    /* JADX INFO: renamed from: d */
    public int f18803d;

    /* JADX INFO: renamed from: e */
    public int f18804e;

    /* JADX INFO: renamed from: f */
    public int f18805f;

    /* JADX INFO: renamed from: i */
    public CardOperation f18808i;

    /* JADX INFO: renamed from: g */
    public boolean f18806g = false;

    /* JADX INFO: renamed from: h */
    public boolean f18807h = false;

    /* JADX INFO: renamed from: j */
    public VirtualState f18809j = VirtualState.INIT;

    /* JADX INFO: renamed from: l */
    public float f18811l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f18812m = 0.0f;

    /* JADX INFO: renamed from: n */
    public boolean f18813n = false;

    /* JADX INFO: renamed from: k */
    public int f18810k = f18799o.getAndIncrement();

    /* JADX INFO: renamed from: a */
    public void m20519a() {
        this.f18811l = this.f18800a.getTranslationX();
        this.f18812m = this.f18800a.getTranslationY();
    }

    /* JADX INFO: renamed from: b */
    public boolean m20520b() {
        VirtualState virtualState = this.f18809j;
        return virtualState == VirtualState.RENDING || virtualState == VirtualState.INIT || virtualState == VirtualState.PRE_OUT;
    }

    /* JADX INFO: renamed from: c */
    public void m20521c(String str, Object obj) {
        this.f18801b = str;
        this.f18802c = obj;
    }

    /* JADX INFO: renamed from: d */
    public String m20522d() {
        return m20523e(true);
    }

    /* JADX INFO: renamed from: e */
    public String m20523e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18804e);
        sb.append(",");
        sb.append(this.f18809j);
        sb.append(",");
        sb.append(this.f18810k);
        sb.append(",");
        sb.append(this.f18801b);
        sb.append(",");
        sb.append(this.f18803d);
        sb.append(",");
        sb.append(this.f18800a.getClass().getName());
        if (this.f18800a.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.f18800a.getParent();
            sb.append(", gindex: ");
            sb.append(viewGroup.indexOfChild(this.f18800a) + " , " + this.f18800a.hashCode());
        }
        sb.append(" ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public boolean m20524f() {
        VirtualState virtualState = this.f18809j;
        return virtualState == VirtualState.ANIM_OUT || virtualState == VirtualState.PRE_OUT;
    }

    /* JADX INFO: renamed from: g */
    public void m20525g(float f, qo0 qo0Var) {
        float f2 = qo0Var.f19395a;
        float f3 = f2 + ((qo0Var.f19396b - f2) * f);
        float f4 = qo0Var.f19397c;
        float f5 = f4 + ((qo0Var.f19398d - f4) * f);
        float f6 = qo0Var.f19401g;
        float f7 = f6 + ((qo0Var.f19402h - f6) * f);
        float f8 = qo0Var.f19399e;
        float f9 = f8 + ((qo0Var.f19400f - f8) * f);
        this.f18800a.setTranslationY(f3);
        this.f18800a.setTranslationX(f5);
        this.f18800a.setRotation(f7);
        this.f18800a.setScaleX(f9);
        this.f18800a.setScaleY(f9);
        float f10 = qo0Var.f19403i;
        float f11 = qo0Var.f19404j;
        if (f10 != f11) {
            this.f18800a.setAlpha(f10 + ((f11 - f10) * f));
        }
    }
}
