package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class dk30 extends ar2<mk30> {

    /* JADX INFO: renamed from: a */
    public final Set<String> f88964a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f88965b;

    /* JADX INFO: renamed from: c */
    public List<Conversation> f88966c;

    /* JADX INFO: renamed from: d */
    public long f88967d;

    /* JADX INFO: renamed from: e */
    public C22507a<uxj0> f88968e;

    /* JADX INFO: renamed from: f */
    public List<Conversation> f88969f;

    /* JADX INFO: renamed from: g */
    public DbLinks f88970g;

    /* JADX INFO: renamed from: h */
    public kcg0 f88971h;

    /* JADX INFO: renamed from: i */
    public String f88972i;

    /* JADX INFO: renamed from: j */
    public double f88973j;

    public dk30(ner nerVar) {
        super(nerVar);
        this.f88964a = new HashSet();
        this.f88965b = new HashSet();
        this.f88966c = new ArrayList();
        this.f88967d = 0L;
        this.f88968e = C22507a.m222759c(uxj0.f181467a);
        this.f88969f = new ArrayList();
        this.f88970g = null;
        this.f88972i = "";
        this.f88973j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m116191f0(Throwable th) {
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(psd0.m173626s(CoreModule.f18264c.f20384f0.m33963fo(), this.f88968e, CoreModule.f18264c.f20384f0.m34069og(), new scj() { // from class: l.wj30
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((vg60) obj, (uxj0) obj2, (Boolean) obj3);
            }
        }).filter(new qcj() { // from class: l.xj30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194536a.m116199n0((bkj0) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.yj30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200269a.m116200o0((bkj0) obj);
            }
        }, new y20() { // from class: l.zj30
            @Override // p153l.y20
            public final void call(Object obj) {
                dk30.m116191f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m116196k0() {
        this.f88972i = "";
        this.f88964a.clear();
    }

    /* JADX INFO: renamed from: l0 */
    public void m116197l0(final Conversation conversation) {
        if (!NullChecker.m82486a(jyb.m147529r(this.f88966c, new qcj() { // from class: l.ck30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56859id, conversation.f56859id));
            }
        })) && !this.f88965b.contains(conversation.f56859id)) {
            this.f88966c.add(conversation);
            this.f88965b.add(conversation.f56859id);
        }
        if (this.f88966c.size() >= 10 || (!jyb.m147479J(this.f88966c) && pzi0.m174454o() - this.f88967d > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
            this.f88967d = pzi0.m174454o();
            CoreModule.f18264c.f20384f0.m33836Vf(new ArrayList(this.f88966c), this.f88965b);
            this.f88966c.clear();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m116198m0() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f88964a) {
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
    public final /* synthetic */ Boolean m116199n0(bkj0 bkj0Var) {
        return Boolean.valueOf(jyb.m147479J(this.f88964a) && ((Boolean) bkj0Var.f77083c).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m116200o0(bkj0 bkj0Var) {
        List<T> list = ((vg60) bkj0Var.f77081a).f184001a;
        if (!jyb.m147479J(list)) {
            double d = ((Conversation) list.get(0)).updatedTime;
            if (d > this.f88973j) {
                CoreModule.f18264c.f20384f0.m34143tp();
                this.f88973j = d;
            }
        }
        ((mk30) this.viewModel).m158682L(list, false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m116201p0(String str, boolean z, vg60 vg60Var) {
        if (TextUtils.equals(m116198m0(), str)) {
            ArrayList arrayList = new ArrayList();
            for (T t : vg60Var.f184001a) {
                Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(t.f56859id);
                if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.localEverHasMessage) {
                    arrayList.add(t);
                }
            }
            if (!jyb.m147479J(arrayList)) {
                vg60Var.f184001a.removeAll(arrayList);
            }
            this.f88970g = vg60Var.f184002b;
            if (z) {
                this.f88969f.addAll(vg60Var.f184001a);
            } else if (NullChecker.m82486a(vg60Var.f184001a)) {
                this.f88969f.clear();
                this.f88969f.addAll(vg60Var.f184001a);
            } else {
                this.f88969f = new ArrayList();
            }
            ((mk30) this.viewModel).m158682L(this.f88969f, true);
            ((mk30) this.viewModel).m158681K();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m116202q0(Throwable th) {
        this.f88972i = "";
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: r0 */
    public void m116203r0(final boolean z) {
        String str = "";
        if (jyb.m147479J(this.f88964a)) {
            this.f88972i = "";
            this.f88968e.m137019l(uxj0.f181467a);
            return;
        }
        if (z) {
            DbLinks dbLinks = this.f88970g;
            if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.next)) {
                return;
            }
        } else {
            this.f88970g = null;
            this.f88969f.clear();
        }
        final String strM116198m0 = m116198m0();
        StringBuilder sb = new StringBuilder();
        sb.append(C4879a.m32187C(strM116198m0));
        if (z) {
            str = "&" + this.f88970g.links.next;
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.equals(this.f88972i, string)) {
            return;
        }
        this.f88972i = string;
        psd0.m173633z(this.f88971h);
        this.f88971h = duringCreated(CoreModule.f18264c.f20384f0.m33967gg(string)).subscribe(psd0.m173597H(new y20() { // from class: l.ak30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71956a.m116201p0(strM116198m0, z, (vg60) obj);
            }
        }, new y20() { // from class: l.bk30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77044a.m116202q0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
