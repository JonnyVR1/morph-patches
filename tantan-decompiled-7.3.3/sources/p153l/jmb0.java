package p153l;

import androidx.annotation.NonNull;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class jmb0 {

    /* JADX INFO: renamed from: a */
    public String f121658a;

    /* JADX INFO: renamed from: b */
    public int f121659b;

    /* JADX INFO: renamed from: c */
    public int f121660c;

    /* JADX INFO: renamed from: d */
    public int f121661d;

    /* JADX INFO: renamed from: e */
    public int f121662e;

    /* JADX INFO: renamed from: f */
    public int f121663f = 0;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jmb0 clone() {
        jmb0 jmb0Var = new jmb0();
        jmb0Var.f121658a = this.f121658a;
        jmb0Var.f121659b = this.f121659b;
        jmb0Var.f121660c = this.f121660c;
        jmb0Var.f121661d = this.f121661d;
        jmb0Var.f121662e = this.f121662e;
        jmb0Var.f121663f = this.f121663f;
        m146147b();
        return jmb0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m146147b() {
        this.f121659b = 0;
        this.f121660c = 0;
        this.f121661d = 0;
    }

    @NonNull
    public String toString() {
        return this.f121658a + Constants.PACKNAME_END + this.f121659b + Constants.PACKNAME_END + this.f121660c + Constants.PACKNAME_END + this.f121661d + Constants.PACKNAME_END + this.f121662e + Constants.PACKNAME_END + this.f121663f;
    }
}
