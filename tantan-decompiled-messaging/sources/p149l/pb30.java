package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class pb30 extends jq2<yb30> {

    /* JADX INFO: renamed from: a */
    public final Set<String> f148036a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f148037b;

    /* JADX INFO: renamed from: c */
    public List<Conversation> f148038c;

    /* JADX INFO: renamed from: d */
    public long f148039d;

    /* JADX INFO: renamed from: e */
    public C22392a<roj0> f148040e;

    /* JADX INFO: renamed from: f */
    public List<Conversation> f148041f;

    /* JADX INFO: renamed from: g */
    public DbLinks f148042g;

    /* JADX INFO: renamed from: h */
    public c4g0 f148043h;

    /* JADX INFO: renamed from: i */
    public String f148044i;

    /* JADX INFO: renamed from: j */
    public double f148045j;

    public pb30(mcr mcrVar) {
        super(mcrVar);
        this.f148036a = new HashSet();
        this.f148037b = new HashSet();
        this.f148038c = new ArrayList();
        this.f148039d = 0L;
        this.f148040e = C22392a.m221513c(roj0.f160388a);
        this.f148041f = new ArrayList();
        this.f148042g = null;
        this.f148044i = "";
        this.f148045j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m168120f0(Throwable th) {
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(mkd0.m154985s(CoreModule.f17545c.f19642f0.m32960fo(), this.f148040e, CoreModule.f17545c.f19642f0.m33066og(), new y9j() { // from class: l.ib30
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((q860) obj, (roj0) obj2, (Boolean) obj3);
            }
        }).filter(new w9j() { // from class: l.jb30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117160a.m168128n0((xaj0) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.kb30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122197a.m168129o0((xaj0) obj);
            }
        }, new e30() { // from class: l.lb30
            @Override // p149l.e30
            public final void call(Object obj) {
                pb30.m168120f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m168125k0() {
        this.f148044i = "";
        this.f148036a.clear();
    }

    /* JADX INFO: renamed from: l0 */
    public void m168126l0(final Conversation conversation) {
        if (!NullChecker.m81303a(vwb.m200346r(this.f148038c, new w9j() { // from class: l.ob30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56011id, conversation.f56011id));
            }
        })) && !this.f148037b.contains(conversation.f56011id)) {
            this.f148038c.add(conversation);
            this.f148037b.add(conversation.f56011id);
        }
        if (this.f148038c.size() >= 10 || (!vwb.m200296J(this.f148038c) && mqi0.m155944o() - this.f148039d > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
            this.f148039d = mqi0.m155944o();
            CoreModule.f17545c.f19642f0.m32833Vf(new ArrayList(this.f148038c), this.f148037b);
            this.f148038c.clear();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m168127m0() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f148036a) {
            if (TextUtils.isEmpty(sb)) {
                sb.append(str);
            } else {
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Boolean m168128n0(xaj0 xaj0Var) {
        return Boolean.valueOf(vwb.m200296J(this.f148036a) && ((Boolean) xaj0Var.f191753c).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m168129o0(xaj0 xaj0Var) {
        List<T> list = ((q860) xaj0Var.f191751a).f153135a;
        if (!vwb.m200296J(list)) {
            double d = ((Conversation) list.get(0)).updatedTime;
            if (d > this.f148045j) {
                CoreModule.f17545c.f19642f0.m33140tp();
                this.f148045j = d;
            }
        }
        ((yb30) this.viewModel).m213917L(list, false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m168130p0(String str, boolean z, q860 q860Var) {
        if (TextUtils.equals(m168127m0(), str)) {
            ArrayList arrayList = new ArrayList();
            for (T t : q860Var.f153135a) {
                Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(t.f56011id);
                if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.localEverHasMessage) {
                    arrayList.add(t);
                }
            }
            if (!vwb.m200296J(arrayList)) {
                q860Var.f153135a.removeAll(arrayList);
            }
            this.f148042g = q860Var.f153136b;
            if (z) {
                this.f148041f.addAll(q860Var.f153135a);
            } else if (NullChecker.m81303a(q860Var.f153135a)) {
                this.f148041f.clear();
                this.f148041f.addAll(q860Var.f153135a);
            } else {
                this.f148041f = new ArrayList();
            }
            ((yb30) this.viewModel).m213917L(this.f148041f, true);
            ((yb30) this.viewModel).m213916K();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m168131q0(Throwable th) {
        this.f148044i = "";
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: r0 */
    public void m168132r0(final boolean z) {
        String str = "";
        if (vwb.m200296J(this.f148036a)) {
            this.f148044i = "";
            this.f148040e.m132487l(roj0.f160388a);
            return;
        }
        if (z) {
            DbLinks dbLinks = this.f148042g;
            if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.next)) {
                return;
            }
        } else {
            this.f148042g = null;
            this.f148041f.clear();
        }
        final String strM168127m0 = m168127m0();
        StringBuilder sb = new StringBuilder();
        sb.append(C4728a.m31184C(strM168127m0));
        if (z) {
            str = "&" + this.f148042g.links.next;
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.equals(this.f148044i, string)) {
            return;
        }
        this.f148044i = string;
        mkd0.m154992z(this.f148043h);
        this.f148043h = duringCreated(CoreModule.f17545c.f19642f0.m32964gg(string)).subscribe(mkd0.m154956H(new e30() { // from class: l.mb30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132985a.m168130p0(strM168127m0, z, (q860) obj);
            }
        }, new e30() { // from class: l.nb30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138000a.m168131q0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
