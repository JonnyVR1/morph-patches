package p153l;

import android.text.TextUtils;
import com.immomo.momo.mulog.exception.MULogIllegalParamsException;
import com.immomo.momo.mulog.exception.MULogIllegalStateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fqw {

    /* JADX INFO: renamed from: d */
    xxl f100345d;

    /* JADX INFO: renamed from: e */
    InterfaceC17040e f100346e;

    /* JADX INFO: renamed from: f */
    AbstractC17039d f100347f;

    /* JADX INFO: renamed from: g */
    tof0 f100348g;

    /* JADX INFO: renamed from: a */
    boolean f100342a = false;

    /* JADX INFO: renamed from: b */
    String f100343b = null;

    /* JADX INFO: renamed from: c */
    String f100344c = null;

    /* JADX INFO: renamed from: h */
    List<ywl> f100349h = new ArrayList();

    /* JADX INFO: renamed from: l.fqw$a */
    public static class C17036a {

        /* JADX INFO: renamed from: a */
        private fqw f100350a = new fqw();

        /* JADX INFO: renamed from: a */
        public C17036a m126801a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new MULogIllegalStateException("appId must not be null");
            }
            this.f100350a.f100343b = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public fqw m126802b() {
            fqw fqwVar = this.f100350a;
            if (fqwVar.f100348g == null) {
                fqwVar.f100348g = new tof0();
            }
            fqw fqwVar2 = this.f100350a;
            if (fqwVar2.f100346e == null) {
                fqwVar2.f100346e = new rrd();
            }
            fqw fqwVar3 = this.f100350a;
            if (fqwVar3.f100347f == null) {
                fqwVar3.f100347f = new pqd(true);
            }
            return this.f100350a;
        }

        /* JADX INFO: renamed from: c */
        public C17036a m126803c(ywl... ywlVarArr) {
            if (ywlVarArr != null && ywlVarArr.length > 0) {
                this.f100350a.f100349h.addAll(Arrays.asList(ywlVarArr));
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17036a m126804d(tof0 tof0Var) throws MULogIllegalParamsException {
            this.f100350a.f100348g = tof0Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17036a m126805e(boolean z) {
            this.f100350a.f100342a = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C17036a m126806f(xxl xxlVar) {
            if (xxlVar != null) {
                this.f100350a.f100345d = xxlVar;
                return this;
            }
            wtq0.m207906a("requester should be set");
            return null;
        }

        /* JADX INFO: renamed from: g */
        public C17036a m126807g(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new MULogIllegalStateException("secret must not be null");
            }
            this.f100350a.f100344c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.fqw$b */
    public interface InterfaceC17037b {
        /* JADX INFO: renamed from: a */
        JSONObject mo126808a();
    }

    /* JADX INFO: renamed from: l.fqw$c */
    public interface InterfaceC17038c {
        /* JADX INFO: renamed from: b */
        int mo126809b();

        /* JADX INFO: renamed from: e */
        boolean mo126810e();
    }

    /* JADX INFO: renamed from: l.fqw$d */
    public static abstract class AbstractC17039d implements InterfaceC17038c {

        /* JADX INFO: renamed from: a */
        boolean f100351a;

        public AbstractC17039d(boolean z) {
            this.f100351a = z;
        }

        /* JADX INFO: renamed from: f */
        public abstract String mo126811f();
    }

    /* JADX INFO: renamed from: l.fqw$e */
    public interface InterfaceC17040e extends InterfaceC17038c {
        /* JADX INFO: renamed from: a */
        int mo126812a();

        /* JADX INFO: renamed from: c */
        int mo126813c();

        /* JADX INFO: renamed from: d */
        boolean mo126814d();
    }
}
