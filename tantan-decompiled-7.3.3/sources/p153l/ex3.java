package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ex3 {

    /* JADX INFO: renamed from: a */
    private boolean f96229a = false;

    /* JADX INFO: renamed from: b */
    private boolean f96230b = false;

    /* JADX INFO: renamed from: c */
    private final List<n1l0> f96231c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final List<n1l0> f96232d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final List<n1l0> f96233e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List<n1l0> f96234f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final k1l0 f96235g;

    public ex3(k1l0 k1l0Var) {
        this.f96235g = k1l0Var;
        k1l0Var.m147889u(new Runnable() { // from class: l.ax3
            @Override // java.lang.Runnable
            public final void run() {
                ex3.m122997a(this.f73815a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m122997a(ex3 ex3Var) {
        synchronized (ex3Var.f96231c) {
            try {
                Iterator<n1l0> it = ex3Var.f96231c.iterator();
                while (it.hasNext()) {
                    Utils.m5983z(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (ex3Var.f96232d) {
            try {
                Iterator<n1l0> it2 = ex3Var.f96232d.iterator();
                while (it2.hasNext()) {
                    Utils.m5983z(it2.next());
                }
                ex3Var.f96232d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m122998b(ex3 ex3Var) {
        ex3Var.m123003o();
        ex3Var.f96230b = true;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m122999c(ex3 ex3Var) {
        ex3Var.m123003o();
        ex3Var.f96230b = true;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m123000d() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m123001j(@NonNull JSONObject jSONObject, @Nullable xhi xhiVar) {
        m123011n(true);
        this.f96235g.m147891y(zw3.m221851a(wrq.m207619f(jSONObject)), new Function0() { // from class: l.bx3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ex3.m122998b(this.f78808a);
            }
        });
        if (xhiVar != null) {
            xhiVar.m211044a(true);
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m123002m(String str) {
        Logger.m5920d("variables", str);
    }

    /* JADX INFO: renamed from: o */
    private void m123003o() {
        synchronized (this.f96233e) {
            try {
                Iterator<n1l0> it = this.f96233e.iterator();
                while (it.hasNext()) {
                    Utils.m5983z(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f96234f) {
            try {
                Iterator<n1l0> it2 = this.f96234f.iterator();
                while (it2.hasNext()) {
                    Utils.m5983z(it2.next());
                }
                this.f96234f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m123004e() {
        m123002m("Clear user content in CTVariables");
        m123011n(false);
        this.f96230b = false;
        this.f96235g.m147882g();
    }

    /* JADX INFO: renamed from: f */
    public k1l0 m123005f() {
        return this.f96235g;
    }

    /* JADX INFO: renamed from: g */
    public void m123006g(@Nullable JSONArray jSONArray) {
        m123002m("handleVariantsResponse() called with: abVariants  " + jSONArray);
        this.f96235g.m147890x(wrq.m207616c(jSONArray));
    }

    /* JADX INFO: renamed from: h */
    public void m123007h(@Nullable JSONObject jSONObject, @Nullable xhi xhiVar) {
        m123002m("handleVariableResponse() called with: response = [" + jSONObject + Constants.AES_SUFFIX);
        if (jSONObject == null) {
            m123008i(xhiVar);
        } else {
            m123001j(jSONObject, xhiVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m123008i(@Nullable xhi xhiVar) {
        if (!m123009k().booleanValue()) {
            m123011n(true);
            this.f96235g.m147888o(new Function0() { // from class: l.cx3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ex3.m122999c(this.f84169a);
                }
            });
        }
        if (xhiVar != null) {
            xhiVar.m211044a(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public Boolean m123009k() {
        return Boolean.valueOf(this.f96229a);
    }

    /* JADX INFO: renamed from: l */
    public void m123010l() {
        m123002m("init() called");
        this.f96235g.m147887n(new Function0() { // from class: l.dx3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ex3.m123000d();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m123011n(boolean z) {
        this.f96229a = z;
    }
}
