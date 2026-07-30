package p149l;

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
public class fw3 {

    /* JADX INFO: renamed from: a */
    private boolean f99600a = false;

    /* JADX INFO: renamed from: b */
    private boolean f99601b = false;

    /* JADX INFO: renamed from: c */
    private final List<hsk0> f99602c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final List<hsk0> f99603d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final List<hsk0> f99604e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List<hsk0> f99605f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final esk0 f99606g;

    public fw3(esk0 esk0Var) {
        this.f99606g = esk0Var;
        esk0Var.m117937u(new Runnable() { // from class: l.bw3
            @Override // java.lang.Runnable
            public final void run() {
                fw3.m123496a(this.f77578a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123496a(fw3 fw3Var) {
        synchronized (fw3Var.f99602c) {
            try {
                Iterator<hsk0> it = fw3Var.f99602c.iterator();
                while (it.hasNext()) {
                    Utils.m5929z(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (fw3Var.f99603d) {
            try {
                Iterator<hsk0> it2 = fw3Var.f99603d.iterator();
                while (it2.hasNext()) {
                    Utils.m5929z(it2.next());
                }
                fw3Var.f99603d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m123497b(fw3 fw3Var) {
        fw3Var.m123502o();
        fw3Var.f99601b = true;
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m123498c(fw3 fw3Var) {
        fw3Var.m123502o();
        fw3Var.f99601b = true;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m123499d() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m123500j(@NonNull JSONObject jSONObject, @Nullable bfi bfiVar) {
        m123510n(true);
        this.f99606g.m117939y(aw3.m99229a(vpq.m199286f(jSONObject)), new Function0() { // from class: l.cw3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fw3.m123497b(this.f82742a);
            }
        });
        if (bfiVar != null) {
            bfiVar.m101536a(true);
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m123501m(String str) {
        Logger.m5866d("variables", str);
    }

    /* JADX INFO: renamed from: o */
    private void m123502o() {
        synchronized (this.f99604e) {
            try {
                Iterator<hsk0> it = this.f99604e.iterator();
                while (it.hasNext()) {
                    Utils.m5929z(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f99605f) {
            try {
                Iterator<hsk0> it2 = this.f99605f.iterator();
                while (it2.hasNext()) {
                    Utils.m5929z(it2.next());
                }
                this.f99605f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m123503e() {
        m123501m("Clear user content in CTVariables");
        m123510n(false);
        this.f99601b = false;
        this.f99606g.m117930g();
    }

    /* JADX INFO: renamed from: f */
    public esk0 m123504f() {
        return this.f99606g;
    }

    /* JADX INFO: renamed from: g */
    public void m123505g(@Nullable JSONArray jSONArray) {
        m123501m("handleVariantsResponse() called with: abVariants  " + jSONArray);
        this.f99606g.m117938x(vpq.m199283c(jSONArray));
    }

    /* JADX INFO: renamed from: h */
    public void m123506h(@Nullable JSONObject jSONObject, @Nullable bfi bfiVar) {
        m123501m("handleVariableResponse() called with: response = [" + jSONObject + Constants.AES_SUFFIX);
        if (jSONObject == null) {
            m123507i(bfiVar);
        } else {
            m123500j(jSONObject, bfiVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m123507i(@Nullable bfi bfiVar) {
        if (!m123508k().booleanValue()) {
            m123510n(true);
            this.f99606g.m117936o(new Function0() { // from class: l.dw3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fw3.m123498c(this.f88136a);
                }
            });
        }
        if (bfiVar != null) {
            bfiVar.m101536a(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public Boolean m123508k() {
        return Boolean.valueOf(this.f99600a);
    }

    /* JADX INFO: renamed from: l */
    public void m123509l() {
        m123501m("init() called");
        this.f99606g.m117935n(new Function0() { // from class: l.ew3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fw3.m123499d();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m123510n(boolean z) {
        this.f99600a = z;
    }
}
