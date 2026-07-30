package p149l;

import android.text.TextUtils;
import com.immomo.momo.mulog.exception.MULogIllegalParamsException;
import com.immomo.momo.mulog.exception.MULogIllegalStateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class hnw {

    /* JADX INFO: renamed from: d */
    fvl f108725d;

    /* JADX INFO: renamed from: e */
    InterfaceC17360e f108726e;

    /* JADX INFO: renamed from: f */
    AbstractC17359d f108727f;

    /* JADX INFO: renamed from: g */
    mgf0 f108728g;

    /* JADX INFO: renamed from: a */
    boolean f108722a = false;

    /* JADX INFO: renamed from: b */
    String f108723b = null;

    /* JADX INFO: renamed from: c */
    String f108724c = null;

    /* JADX INFO: renamed from: h */
    List<kul> f108729h = new ArrayList();

    /* JADX INFO: renamed from: l.hnw$a */
    public static class C17356a {

        /* JADX INFO: renamed from: a */
        private hnw f108730a = new hnw();

        /* JADX INFO: renamed from: a */
        public C17356a m132019a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new MULogIllegalStateException("appId must not be null");
            }
            this.f108730a.f108723b = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public hnw m132020b() {
            hnw hnwVar = this.f108730a;
            if (hnwVar.f108728g == null) {
                hnwVar.f108728g = new mgf0();
            }
            hnw hnwVar2 = this.f108730a;
            if (hnwVar2.f108726e == null) {
                hnwVar2.f108726e = new aqd();
            }
            hnw hnwVar3 = this.f108730a;
            if (hnwVar3.f108727f == null) {
                hnwVar3.f108727f = new kpd(true);
            }
            return this.f108730a;
        }

        /* JADX INFO: renamed from: c */
        public C17356a m132021c(kul... kulVarArr) {
            if (kulVarArr != null && kulVarArr.length > 0) {
                this.f108730a.f108729h.addAll(Arrays.asList(kulVarArr));
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17356a m132022d(mgf0 mgf0Var) throws MULogIllegalParamsException {
            this.f108730a.f108728g = mgf0Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17356a m132023e(boolean z) {
            this.f108730a.f108722a = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C17356a m132024f(AbstractC17359d abstractC17359d) throws MULogIllegalParamsException {
            this.f108730a.f108727f = abstractC17359d;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C17356a m132025g(fvl fvlVar) {
            if (fvlVar != null) {
                this.f108730a.f108725d = fvlVar;
                return this;
            }
            qkq0.m175383a("requester should be set");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public C17356a m132026h(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new MULogIllegalStateException("secret must not be null");
            }
            this.f108730a.f108724c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.hnw$b */
    public interface InterfaceC17357b {
        /* JADX INFO: renamed from: a */
        JSONObject mo132027a();
    }

    /* JADX INFO: renamed from: l.hnw$c */
    public interface InterfaceC17358c {
        /* JADX INFO: renamed from: b */
        int mo98250b();

        /* JADX INFO: renamed from: e */
        boolean mo98253e();
    }

    /* JADX INFO: renamed from: l.hnw$d */
    public static abstract class AbstractC17359d implements InterfaceC17358c {

        /* JADX INFO: renamed from: a */
        boolean f108731a;

        public AbstractC17359d(boolean z) {
            this.f108731a = z;
        }

        /* JADX INFO: renamed from: f */
        public String mo132028f() {
            return "";
        }
    }

    /* JADX INFO: renamed from: l.hnw$e */
    public interface InterfaceC17360e extends InterfaceC17358c {
        /* JADX INFO: renamed from: a */
        int mo98249a();

        /* JADX INFO: renamed from: c */
        int mo98251c();

        /* JADX INFO: renamed from: d */
        boolean mo98252d();
    }
}
