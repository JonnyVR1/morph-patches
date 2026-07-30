package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class pol0 {

    /* JADX INFO: renamed from: o */
    public static AtomicInteger f150529o = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public View f150530a;

    /* JADX INFO: renamed from: b */
    public String f150531b;

    /* JADX INFO: renamed from: c */
    public Object f150532c;

    /* JADX INFO: renamed from: d */
    public int f150533d;

    /* JADX INFO: renamed from: e */
    public int f150534e;

    /* JADX INFO: renamed from: f */
    public int f150535f;

    /* JADX INFO: renamed from: i */
    public CardOperation f150538i;

    /* JADX INFO: renamed from: g */
    public boolean f150536g = false;

    /* JADX INFO: renamed from: h */
    public boolean f150537h = false;

    /* JADX INFO: renamed from: j */
    public VirtualState f150539j = VirtualState.INIT;

    /* JADX INFO: renamed from: l */
    public float f150541l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f150542m = 0.0f;

    /* JADX INFO: renamed from: n */
    public boolean f150543n = false;

    /* JADX INFO: renamed from: k */
    public int f150540k = f150529o.getAndIncrement();

    /* JADX INFO: renamed from: a */
    public void m170600a() {
        this.f150541l = this.f150530a.getTranslationX();
        this.f150542m = this.f150530a.getTranslationY();
    }

    /* JADX INFO: renamed from: b */
    public boolean m170601b() {
        VirtualState virtualState = this.f150539j;
        return virtualState == VirtualState.RENDING || virtualState == VirtualState.INIT || virtualState == VirtualState.PRE_OUT;
    }

    /* JADX INFO: renamed from: c */
    public void m170602c(String str, Object obj) {
        this.f150531b = str;
        this.f150532c = obj;
    }

    /* JADX INFO: renamed from: d */
    public String m170603d() {
        return m170604e(true);
    }

    /* JADX INFO: renamed from: e */
    public String m170604e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f150534e);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f150539j);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f150540k);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f150531b);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f150533d);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f150530a.getClass().getName());
        if (this.f150530a.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.f150530a.getParent();
            sb.append(", gindex: ");
            sb.append(viewGroup.indexOfChild(this.f150530a) + " , " + this.f150530a.hashCode());
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public boolean m170605f() {
        VirtualState virtualState = this.f150539j;
        return virtualState == VirtualState.ANIM_OUT || virtualState == VirtualState.PRE_OUT;
    }

    /* JADX INFO: renamed from: g */
    public void m170606g(float f, qo0 qo0Var) {
        float f2 = qo0Var.f155518a;
        float f3 = f2 + ((qo0Var.f155519b - f2) * f);
        float f4 = qo0Var.f155520c;
        float f5 = f4 + ((qo0Var.f155521d - f4) * f);
        float f6 = qo0Var.f155524g;
        float f7 = f6 + ((qo0Var.f155525h - f6) * f);
        float f8 = qo0Var.f155522e;
        float f9 = f8 + ((qo0Var.f155523f - f8) * f);
        this.f150530a.setTranslationY(f3);
        this.f150530a.setTranslationX(f5);
        this.f150530a.setRotation(f7);
        this.f150530a.setScaleX(f9);
        this.f150530a.setScaleY(f9);
        float f10 = qo0Var.f155526i;
        float f11 = qo0Var.f155527j;
        if (f10 != f11) {
            this.f150530a.setAlpha(f10 + ((f11 - f10) * f));
        }
    }
}
