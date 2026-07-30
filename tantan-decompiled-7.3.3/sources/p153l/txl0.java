package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class txl0 {

    /* JADX INFO: renamed from: o */
    public static AtomicInteger f176567o = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public View f176568a;

    /* JADX INFO: renamed from: b */
    public String f176569b;

    /* JADX INFO: renamed from: c */
    public Object f176570c;

    /* JADX INFO: renamed from: d */
    public int f176571d;

    /* JADX INFO: renamed from: e */
    public int f176572e;

    /* JADX INFO: renamed from: f */
    public int f176573f;

    /* JADX INFO: renamed from: i */
    public CardOperation f176576i;

    /* JADX INFO: renamed from: g */
    public boolean f176574g = false;

    /* JADX INFO: renamed from: h */
    public boolean f176575h = false;

    /* JADX INFO: renamed from: j */
    public VirtualState f176577j = VirtualState.INIT;

    /* JADX INFO: renamed from: l */
    public float f176579l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f176580m = 0.0f;

    /* JADX INFO: renamed from: n */
    public boolean f176581n = false;

    /* JADX INFO: renamed from: k */
    public int f176578k = f176567o.getAndIncrement();

    /* JADX INFO: renamed from: a */
    public void m193508a() {
        this.f176579l = this.f176568a.getTranslationX();
        this.f176580m = this.f176568a.getTranslationY();
    }

    /* JADX INFO: renamed from: b */
    public boolean m193509b() {
        VirtualState virtualState = this.f176577j;
        return virtualState == VirtualState.RENDING || virtualState == VirtualState.INIT || virtualState == VirtualState.PRE_OUT;
    }

    /* JADX INFO: renamed from: c */
    public void m193510c(String str, Object obj) {
        this.f176569b = str;
        this.f176570c = obj;
    }

    /* JADX INFO: renamed from: d */
    public String m193511d() {
        return m193512e(true);
    }

    /* JADX INFO: renamed from: e */
    public String m193512e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f176572e);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f176577j);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f176578k);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f176569b);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f176571d);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f176568a.getClass().getName());
        if (this.f176568a.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.f176568a.getParent();
            sb.append(", gindex: ");
            sb.append(viewGroup.indexOfChild(this.f176568a) + " , " + this.f176568a.hashCode());
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public boolean m193513f() {
        VirtualState virtualState = this.f176577j;
        return virtualState == VirtualState.ANIM_OUT || virtualState == VirtualState.PRE_OUT;
    }

    /* JADX INFO: renamed from: g */
    public void m193514g(float f, mo0 mo0Var) {
        float f2 = mo0Var.f137753a;
        float f3 = f2 + ((mo0Var.f137754b - f2) * f);
        float f4 = mo0Var.f137755c;
        float f5 = f4 + ((mo0Var.f137756d - f4) * f);
        float f6 = mo0Var.f137759g;
        float f7 = f6 + ((mo0Var.f137760h - f6) * f);
        float f8 = mo0Var.f137757e;
        float f9 = f8 + ((mo0Var.f137758f - f8) * f);
        this.f176568a.setTranslationY(f3);
        this.f176568a.setTranslationX(f5);
        this.f176568a.setRotation(f7);
        this.f176568a.setScaleX(f9);
        this.f176568a.setScaleY(f9);
        float f10 = mo0Var.f137761i;
        float f11 = mo0Var.f137762j;
        if (f10 != f11) {
            this.f176568a.setAlpha(f10 + ((f11 - f10) * f));
        }
    }
}
