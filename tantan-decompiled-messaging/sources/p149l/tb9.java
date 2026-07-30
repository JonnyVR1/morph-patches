package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.IntlVisitor;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class tb9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f169233R;

    /* JADX INFO: renamed from: S */
    public int f169234S;

    /* JADX INFO: renamed from: T */
    public HashMap<String, User> f169235T;

    /* JADX INFO: renamed from: U */
    public HashSet<String> f169236U;

    /* JADX INFO: renamed from: V */
    public C22392a<j760<List<IntlVisitor>, Boolean>> f169237V;

    /* JADX INFO: renamed from: W */
    public C22392a<Integer> f169238W;

    /* JADX INFO: renamed from: X */
    public C22392a<Integer> f169239X;

    public tb9(C4732c c4732c) {
        super(c4732c);
        this.f169233R = 1;
        this.f169234S = 20;
        this.f169235T = new HashMap<>();
        this.f169236U = new HashSet<>();
        this.f169237V = C22392a.m221512b();
        this.f169238W = C22392a.m221512b();
        this.f169239X = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22306c m187826A3() {
        return new la20(new v9j() { // from class: l.lb9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31356u0()).m185887f().m185883b();
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.mb9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f132997a.m187827B3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ roj0 m187827B3(Envelope envelope) {
        this.f169238W.m132487l(Integer.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).count));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<roj0> m187828C3() {
        final String str = "pageNum=" + this.f169233R + "&limit=" + this.f169234S;
        return this.f72126Q.scheduled(LikeFrom.intl_visitor + CoreModule.m29931H().userId(), 0, new v9j() { // from class: l.ob9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f142893a.m187842x3(str);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m187829D3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetId", str);
        } catch (JSONException e) {
            App.f15368d.m20433k(e);
        }
        scheduled("intl_visitor_access", -1, new v9j() { // from class: l.db9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.nb9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31348s0()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public C22306c<roj0> m187830E3() {
        return scheduled("intl_visitor_all_count", 0, new v9j() { // from class: l.pb9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f148070a.m187844z3();
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public Integer m187831F3() {
        return this.f169239X.m221515e();
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<roj0> m187832G3() {
        if (CoreModule.f17545c.f19672p0.m173359g3()) {
            m187830E3();
        }
        return scheduled("intl_visitor_count", 0, new v9j() { // from class: l.kb9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f122224a.m187826A3();
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<Integer> m187833H3() {
        return this.f169238W.asObservable();
    }

    /* JADX INFO: renamed from: I3 */
    public C22306c<j760<List<IntlVisitor>, Boolean>> m187834I3() {
        return this.f169237V.asObservable();
    }

    /* JADX INFO: renamed from: q3 */
    public void m187835q3() {
        this.f169233R = 1;
        this.f169235T.clear();
        this.f169236U.clear();
        this.f169237V.m132487l(null);
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m187836r3() {
        return NullChecker.m81303a(this.f169237V.m221515e()) && !vwb.m200296J(this.f169237V.m221515e().f116564a);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ Envelope m187837s3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m187838t3(User user) {
        this.f169235T.put(user.f56011id, user);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m187839u3(List list, List list2, IntlVisitor intlVisitor) {
        User user = this.f169235T.get(intlVisitor.f20430id);
        if (this.f169236U.contains(intlVisitor.f20430id) || !NullChecker.m81303a(user) || user.isBanedOrInactivated()) {
            return;
        }
        this.f169236U.add(intlVisitor.f20430id);
        if (this.f169233R > 1) {
            list.add(intlVisitor);
        } else {
            list2.add(intlVisitor);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m187840v3(IntlVisitor intlVisitor) {
        User user = this.f169235T.get(intlVisitor.f20430id);
        return Boolean.valueOf(NullChecker.m81303a(user) && !user.isBanedOrInactivated());
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ roj0 m187841w3(Envelope envelope) {
        final List listM200339n;
        this.f169235T.clear();
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        ArrayList arrayList = new ArrayList();
        List<IntlVisitor> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).intlVisitorInfo;
        if (NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.gb9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101821a.m187838t3((User) obj);
                }
            });
        }
        if (this.f169235T.isEmpty()) {
            this.f169237V.m132487l(new j760<>(arrayList, Boolean.FALSE));
            return roj0.f160388a;
        }
        Boolean boolValueOf = Boolean.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).next);
        if (NullChecker.m81303a(this.f169237V.m221515e()) && !this.f169236U.isEmpty() && !vwb.m200296J(list2)) {
            listM200339n = this.f169237V.m221515e().f116564a;
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(list2, new e30() { // from class: l.hb9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f106912a.m187839u3(listM200339n, arrayList2, (IntlVisitor) obj);
                }
            });
            if (arrayList2.size() > 0) {
                listM200339n.addAll(0, arrayList2);
            }
            this.f169233R++;
        } else {
            if (NullChecker.m81303a(this.f169237V.m221515e()) && !this.f169236U.isEmpty() && vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
                return roj0.f160388a;
            }
            if (NullChecker.m81303a(this.f169237V.m221515e()) && this.f169236U.isEmpty() && vwb.m200296J(list2)) {
                listM200339n = new ArrayList();
            } else {
                this.f169236U.addAll(vwb.m200303Q(list2, new w9j() { // from class: l.ib9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((IntlVisitor) obj).f20430id;
                    }
                }));
                listM200339n = vwb.m200339n(list2, new w9j() { // from class: l.jb9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f117167a.m187840v3((IntlVisitor) obj);
                    }
                });
            }
        }
        this.f169237V.m132487l(new j760<>(listM200339n, boolValueOf));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ C22306c m187842x3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.qb9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31344r0(str)).m185883b();
            }
        }).map(new w9j() { // from class: l.rb9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158591a.m187837s3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.sb9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163510a.m187841w3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ roj0 m187843y3(Envelope envelope) {
        this.f169239X.m132487l(Integer.valueOf(((CoreData) envelope.getModuleData(CoreData.class)).visitorAllCount));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22306c m187844z3() {
        return new la20(new v9j() { // from class: l.eb9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31352t0()).m185887f().m185883b();
            }
        }).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.fb9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96700a.m187843y3((Envelope) obj);
            }
        });
    }
}
