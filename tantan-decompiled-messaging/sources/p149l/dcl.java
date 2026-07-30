package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4731b0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.ComStatusAward;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.main.LocationPermissionView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSearchSettings;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class dcl extends jq2<idl> {

    /* JADX INFO: renamed from: I */
    public static String f85440I = "suggest_user_profile_info";

    /* JADX INFO: renamed from: J */
    public static String f85441J = "home";

    /* JADX INFO: renamed from: K */
    public static String f85442K = "click";

    /* JADX INFO: renamed from: L */
    public static String f85443L = "swipe";

    /* JADX INFO: renamed from: A */
    public Runnable f85444A;

    /* JADX INFO: renamed from: B */
    public boolean f85445B;

    /* JADX INFO: renamed from: C */
    public String f85446C;

    /* JADX INFO: renamed from: D */
    public p3m<k7h0.C17941a, VSwipeStack.OnCardSwipeResult> f85447D;

    /* JADX INFO: renamed from: E */
    public boolean f85448E;

    /* JADX INFO: renamed from: F */
    public int f85449F;

    /* JADX INFO: renamed from: G */
    public c4g0 f85450G;

    /* JADX INFO: renamed from: H */
    public long f85451H;

    /* JADX INFO: renamed from: a */
    public String f85452a;

    /* JADX INFO: renamed from: b */
    public int f85453b;

    /* JADX INFO: renamed from: c */
    public String f85454c;

    /* JADX INFO: renamed from: d */
    public boolean f85455d;

    /* JADX INFO: renamed from: e */
    public boolean f85456e;

    /* JADX INFO: renamed from: f */
    public boolean f85457f;

    /* JADX INFO: renamed from: g */
    public boolean f85458g;

    /* JADX INFO: renamed from: h */
    public boolean f85459h;

    /* JADX INFO: renamed from: i */
    public C22392a<roj0> f85460i;

    /* JADX INFO: renamed from: j */
    public C22392a<PartialListOpt<CoreSuggested.UserInfo>> f85461j;

    /* JADX INFO: renamed from: k */
    public C22392a<roj0> f85462k;

    /* JADX INFO: renamed from: l */
    public C22392a<Boolean> f85463l;

    /* JADX INFO: renamed from: m */
    public C22393b<roj0> f85464m;

    /* JADX INFO: renamed from: n */
    public boolean f85465n;

    /* JADX INFO: renamed from: o */
    public C22392a<Boolean> f85466o;

    /* JADX INFO: renamed from: p */
    public boolean f85467p;

    /* JADX INFO: renamed from: q */
    public boolean f85468q;

    /* JADX INFO: renamed from: r */
    public boolean f85469r;

    /* JADX INFO: renamed from: s */
    public long f85470s;

    /* JADX INFO: renamed from: t */
    public boolean f85471t;

    /* JADX INFO: renamed from: u */
    public String f85472u;

    /* JADX INFO: renamed from: v */
    public String f85473v;

    /* JADX INFO: renamed from: w */
    public boolean f85474w;

    /* JADX INFO: renamed from: x */
    public boolean f85475x;

    /* JADX INFO: renamed from: y */
    public C22392a<Boolean> f85476y;

    /* JADX INFO: renamed from: z */
    public c4g0 f85477z;

    /* JADX INFO: renamed from: l.dcl$a */
    public class C16333a implements w9j<roj0, C22306c<xaj0>> {
        public C16333a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ xaj0 m110860a(User user, PartialListOpt partialListOpt, TabName tabName, Notification notification) {
            return new xaj0(user, partialListOpt, tabName);
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C22306c<xaj0> call(roj0 roj0Var) {
            return mkd0.m154986t(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19666n0.m31456a4(eli0.m117121a()), dcl.this.m110834k1().m39819i7(), vi4.m198496b(CacheCardType.DEFAULT_CARD).mo102631d(4).timeout(3000L, TimeUnit.MILLISECONDS).materialize().observeOn(jo0.m142408a()).first(), new z9j() { // from class: l.ccl
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return dcl.C16333a.m110860a((User) obj, (PartialListOpt) obj2, (TabName) obj3, (Notification) obj4);
                }
            });
        }
    }

    public dcl(mcr mcrVar) {
        super(mcrVar);
        this.f85452a = "";
        this.f85453b = 0;
        this.f85454c = "";
        this.f85455d = false;
        this.f85456e = false;
        this.f85457f = true;
        this.f85458g = false;
        this.f85460i = C22392a.m221512b();
        this.f85461j = CoreModule.f17545c.f19666n0.f19543V;
        this.f85462k = C22392a.m221512b();
        Boolean bool = Boolean.FALSE;
        this.f85463l = C22392a.m221513c(bool);
        this.f85464m = C22393b.m221521b();
        this.f85465n = false;
        this.f85466o = C22392a.m221513c(bool);
        this.f85467p = false;
        this.f85468q = true;
        this.f85469r = true;
        this.f85470s = 0L;
        this.f85471t = false;
        this.f85474w = true;
        this.f85476y = C22392a.m221513c(bool);
        this.f85444A = new Runnable() { // from class: l.fal
            @Override // java.lang.Runnable
            public final void run() {
                this.f96612a.m110784o2();
            }
        };
        this.f85446C = "";
        this.f85448E = false;
        this.f85449F = 0;
        this.f85450G = null;
        this.f85451H = adi0.INSTANCE.m95899d();
    }

    /* JADX INFO: renamed from: A2 */
    private void m110732A2(final ArrayList<Media> arrayList, final String str) {
        ((idl) this.viewModel).m135564i0().m20595o4(R$string.f17842J5);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.sbl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dcl.m110780m0((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.tbl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169271a.m110844q2(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.vbl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180858a.m110845r2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ roj0 m110735E0(C4319c c4319c, roj0 roj0Var, List list) {
        if (c4319c == C4319c.f15548i) {
            return roj0.f160388a;
        }
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    private void m110736E1() {
        duringCreated(CoreModule.f17545c.f19678r0.f20028i0).subscribe(mkd0.m154955G(new e30() { // from class: l.yal
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197221a.m110818U1((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E2 */
    private void m110737E2() {
        mkd0.m154992z(this.f85477z);
        this.f85477z = null;
    }

    /* JADX INFO: renamed from: F1 */
    private void m110739F1() {
        duringCreated(CoreModule.f17545c.f19593O2.obs()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.gal
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kal
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122131a.m110819V1((String) obj);
            }
        }));
        duringCreated(mkd0.m154984r(lifecycle(), this.f85463l, new el30()).filter(new w9j() { // from class: l.lal
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.f116564a == C4319c.f15548i && ((Boolean) j760Var.f116565b).booleanValue());
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.mal
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132935a.m110820W1((j760) obj);
            }
        }));
        duringCreated(this.f85460i.switchMap(new C16333a()).filter(new w9j() { // from class: l.oal
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((xaj0) obj).f191753c == TabName.Card);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.pal
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147988a.m110822Y1((xaj0) obj);
            }
        }));
        duringCreated(mkd0.m154985s(lifecycle(), this.f85462k, CoreModule.f17545c.f19654j0.m30580E4().take(1), new y9j() { // from class: l.qal
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return dcl.m110735E0((C4319c) obj, (roj0) obj2, (List) obj3);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ral
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158526a.m110823Z1((roj0) obj);
            }
        }));
        if (ezc0.m118907m0()) {
            duringCreated(CoreModule.f17545c.f19567G0.m172210n3()).distinctUntilChanged().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.sal
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163418a.m110824a2((List) obj);
                }
            }));
            if (CoreModule.f17545c.f19639e0.m169520na().isNewUserIn24H()) {
                duringCreated(CoreModule.f17545c.f19567G0.m172211o3()).distinctUntilChanged().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.hal
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f106748a.m110825b2((roj0) obj);
                    }
                }));
                duringCreated(new v9j() { // from class: l.ial
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")), new x9j() { // from class: l.rbl
                            @Override // p149l.x9j
                            public final Object call(Object obj, Object obj2) {
                                return j760.m140076a((User) obj, (UserPrivilege) obj2);
                            }
                        });
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.jal
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f117099a.m110826c2((j760) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    private void m110742H1() {
        creates(new e30() { // from class: l.tal
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169127a.m110828e2((Bundle) obj);
            }
        }, new d30() { // from class: l.ual
            @Override // p149l.d30
            public final void call() {
                dcl.m110791t0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m110743I0() {
    }

    /* JADX INFO: renamed from: I1 */
    private void m110744I1() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.jbl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117197a.m110830g2((C4319c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ubl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175705a.m110831h2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    private void m110746J1() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.abl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bbl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74852a.m110832i2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L1 */
    private void m110748L1() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).switchMap(new w9j() { // from class: l.xbl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191955a.m110833j2((User) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ybl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197346a.m110835k2((roj0) obj);
            }
        }));
        cxf.m109094f().m109096e(duringCreated(CoreModule.f17545c.f19639e0.m169523o9()), m110834k1(), ((idl) this.viewModel).m135564i0(), 115);
        duringCreated(CoreModule.f17545c.f19639e0.m169556wa()).subscribe(mkd0.m154955G(new e30() { // from class: l.zbl
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169552va(-1);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.acl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.bcl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.dal
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85239a.m110837l2((String) obj);
            }
        }, new e30() { // from class: l.eal
            @Override // p149l.e30
            public final void call(Object obj) {
                dcl.m110763b1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m110749N0(Throwable th) {
    }

    /* JADX INFO: renamed from: N2 */
    private void m110750N2() {
        wvv.m205772l(m110834k1(), new PermissionHelper.InterfaceC13129b() { // from class: l.val
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f180758a.m110849t2(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.wal
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f185480a.m110851u2(dialogInterface);
            }
        }, new Runnable() { // from class: l.xal
            @Override // java.lang.Runnable
            public final void run() {
                this.f191754a.m110853v2();
            }
        }, new d30() { // from class: l.zal
            @Override // p149l.d30
            public final void call() {
                ygh0.m214695n0(ygh0.f198173h);
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    private boolean m110755R2() {
        return NullChecker.m81303a(CoreModule.f17545c.f19666n0.f19539R);
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m110763b1(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m110772h0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22306c m110780m0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: n1 */
    private void m110782n1() {
        NewMainAct newMainActM110834k1 = m110834k1();
        if (!NullChecker.m81303a(newMainActM110834k1) || newMainActM110834k1.isDialogShowing()) {
            this.f85460i.m132487l(roj0.f160388a);
            return;
        }
        if (vy8.m200606d()) {
            CoreModule.f17545c.f19639e0.f149341c0.put(Boolean.TRUE);
            ark.m98439O0(m110834k1(), "", new d30() { // from class: l.pbl
                @Override // p149l.d30
                public final void call() {
                    this.f148091a.m110816S1();
                }
            }, false);
        } else if (!m110836l1()) {
            this.f85460i.m132487l(roj0.f160388a);
        } else {
            CoreModule.f17545c.f19639e0.f149341c0.put(Boolean.TRUE);
            ark.m98439O0(newMainActM110834k1, "", new d30() { // from class: l.qbl
                @Override // p149l.d30
                public final void call() {
                    this.f153666a.m110817T1();
                }
            }, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m110784o2() {
        this.f85457f = false;
        HashMap map = new HashMap();
        map.put("sourcepage", f85441J);
        map.put("actiontype", f85442K);
        C4731b0 c4731b0 = CoreModule.f17545c.f19666n0;
        final User user = c4731b0.f19539R;
        if (NullChecker.m81303a(c4731b0.f19540S)) {
            CoreModule.f17545c.f19666n0.f19540S.m223816clone();
        }
        C22306c<Relationship> c22306cM31457b4 = CoreModule.f17545c.f19666n0.m31457b4(map);
        if (NullChecker.m81303a(c22306cM31457b4)) {
            c22306cM31457b4.subscribe(mkd0.m154956H(new e30() { // from class: l.dbl
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85324a.m110839m2(user, (Relationship) obj);
                }
            }, new e30() { // from class: l.ebl
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90360a.m110840n2(user, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m81303a(((idl) this.viewModel).m135582r0())) {
            m110804I2(m110786p1(((idl) this.viewModel).m135564i0().pageId(), "", ((idl) this.viewModel).m135582r0(), user), "");
        }
        this.f85457f = true;
        lsi0.m151570H(m110834k1().getResources().getString(R$string.f18804oq), m110834k1().getResources().getDrawable(x2c0.f190665vu), m110834k1().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: p1 */
    private C7994d m110786p1(String str, String str2, wsf0 wsf0Var, User user) {
        String str3;
        int size;
        int iM31461y3 = CoreModule.f17545c.f19666n0.m31461y3() - 1;
        if (!NullChecker.m81303a(user) || iM31461y3 < 0 || user.pictures.size() <= iM31461y3) {
            str3 = "";
            size = 0;
        } else {
            str3 = user.pictures.get(iM31461y3).url;
            size = user.pictures.size();
        }
        C7994d c7994dM36702h = HomeStatisticsHelper.m36702h(str, str2, wsf0Var);
        c7994dM36702h.m38461B(str3);
        c7994dM36702h.m38491z(iM31461y3);
        c7994dM36702h.m38460A(size);
        return c7994dM36702h;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m110788r0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void m110853v2() {
        ((idl) this.viewModel).m135575o0().m47361e(LocationPermissionView.LocationPermissionState.requested);
        if (this.f85468q) {
            this.f85468q = false;
            this.f85460i.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m110791t0() {
    }

    /* JADX INFO: renamed from: B1 */
    public final void m110796B1(Intent intent) {
        String stringExtra = intent.getStringExtra("heart_confession_uid");
        String stringExtra2 = intent.getStringExtra("heart_confession_content");
        CoreSuggested.UserInfo userInfoMo38813j = ((idl) this.viewModel).m135582r0().mo38813j();
        String str = NullChecker.m81303a(userInfoMo38813j) ? userInfoMo38813j.f19472id : "";
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return;
        }
        this.f85472u = stringExtra;
        this.f85473v = stringExtra2;
    }

    /* JADX INFO: renamed from: B2 */
    public void m110797B2() {
        if (SystemClock.uptimeMillis() - this.f85470s >= 2000) {
            this.f85470s = SystemClock.uptimeMillis();
            m110802F2(true);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public void m110798C1() {
        if (m110834k1().lifecycle_() != C4319c.f15548i || ((idl) this.viewModel).m135523I0() || ((idl) this.viewModel).m135564i0().isHidden() || !((idl) this.viewModel).m135513B1()) {
            return;
        }
        if (C8609a.f32670f) {
            C8609a.f32670f = false;
            ((idl) this.viewModel).m135514C1();
        }
        if (e2s.m114523d()) {
            e2s.m114524e(false);
            ((idl) this.viewModel).m135514C1();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m110799C2(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                z = false;
                break;
            } else {
                if (iArr[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (z) {
            ygh0.m214691l0(ygh0.f198173h);
        } else {
            ygh0.m214693m0(ygh0.f198173h, wvv.m205774n(m110834k1()) ? BLiveOperationTitleShowType.off : "on");
        }
        if (i == 1792) {
            if (!z) {
                m110750N2();
                return;
            }
            ((idl) this.viewModel).m135575o0().m47361e(LocationPermissionView.LocationPermissionState.requested);
            if (this.f85468q) {
                this.f85468q = false;
                if (this.f85467p) {
                    return;
                }
                this.f85460i.m132487l(roj0.f160388a);
            }
        }
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m110800D1() {
        return this.f85469r;
    }

    /* JADX INFO: renamed from: D2 */
    public void m110801D2() {
        this.f85469r = false;
        ((idl) this.viewModel).m135580q1();
    }

    /* JADX INFO: renamed from: F2 */
    public void m110802F2(boolean z) {
        final C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f85461j;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = c22392a.m221515e();
        if (z || partialListOptM221515e == null || partialListOptM221515e.hasMore()) {
            duringCreated(CoreModule.f17545c.f19666n0.m31442K3(e900.m115330b().m115334f() ? e900.m115330b().m115331c() : upa.m194647I0().tabId)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.fbl
                @Override // p149l.e30
                public final void call(Object obj) {
                    dcl.m110788r0((roj0) obj);
                }
            }, new e30() { // from class: l.gbl
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101860a.m110847s2(c22392a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m110803H2(C7994d c7994d, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
        this.f85458g = false;
        sbp.m183242b();
    }

    /* JADX INFO: renamed from: I2 */
    public void m110804I2(C7994d c7994d, String str) {
        HomeStatisticsHelper.m36688B(c7994d, str);
        this.f85458g = false;
        sbp.m183242b();
    }

    /* JADX INFO: renamed from: J2 */
    public void m110805J2(int i) {
        this.f85453b = i;
    }

    /* JADX INFO: renamed from: K2 */
    public void m110806K2(String str) {
        this.f85452a = str;
    }

    /* JADX INFO: renamed from: L2 */
    public void m110807L2(String str) {
        this.f85446C = str;
    }

    /* JADX INFO: renamed from: M2 */
    public void m110808M2() {
        xdl0.m208344M(((idl) this.viewModel).m135552b0(), true);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m110809N1(String str) {
        return TextUtils.equals(this.f85454c, str);
    }

    /* JADX INFO: renamed from: O1 */
    public boolean m110810O1(String str) {
        return (TextUtils.isEmpty(this.f85472u) || !this.f85472u.equals(str) || TextUtils.isEmpty(this.f85473v)) ? false : true;
    }

    /* JADX INFO: renamed from: P1 */
    public boolean m110811P1() {
        return this.f85448E;
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m110812P2(boolean z) {
        return m110814Q2(z, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ Boolean m110813Q1(j760 j760Var) {
        return Boolean.valueOf(this.f85449F == 1);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX INFO: renamed from: Q2 */
    public boolean m110814Q2(boolean z, boolean z2) {
        User user;
        C7994d c7994dM36702h;
        UssTags ussTags;
        boolean z3;
        int iM31461y3;
        String str = "";
        if (z) {
            user = null;
            c7994dM36702h = HomeStatisticsHelper.m36698d(((idl) this.viewModel).m135582r0() == null ? null : ((idl) this.viewModel).m135582r0().mo38818o(), true, this.f85458g, SwipeDirection.UP, ((idl) this.viewModel).m135582r0());
        } else {
            user = CoreModule.f17545c.f19666n0.f19539R;
            c7994dM36702h = HomeStatisticsHelper.m36702h(((idl) this.viewModel).m135564i0().pageId(), user == null ? "" : user.f56011id, ((idl) this.viewModel).m135582r0());
            c7994dM36702h.m38487v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
        }
        int size = 0;
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            m110804I2(c7994dM36702h, "failJailedUser");
            return false;
        }
        KeyEvent.Callback callbackMo38809d = ((idl) this.viewModel).m135582r0().mo38809d();
        if (!NullChecker.m81303a(callbackMo38809d) || (((callbackMo38809d instanceof d5m) && ((d5m) callbackMo38809d).mo36902k0()) || !this.f85457f)) {
            return false;
        }
        if (z) {
            ((idl) this.viewModel).m135582r0().mo38801A(SwipeDirection.UP);
            return false;
        }
        if (m110755R2()) {
            CoreSuggested.UserInfo userInfo = CoreModule.f17545c.f19666n0.f19540S;
            if (u59.m191827f0() && NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.letter)) {
                lsi0.m151593w(R$string.f18289Y2);
            } else {
                Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
                CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
                CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.undoLimit;
                if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.f154693H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
                    if (this.f85457f && CoreModule.f17545c.f19666n0.f19540S.canUndo) {
                        this.f85444A.run();
                        if (ogl0.m164247Z()) {
                            wge0.m203034f().m203040i(userInfo.f19472id);
                            zvf0.m220371D("e_undo_superlike", ((idl) this.viewModel).m135564i0().pageId(), vwb.m200311Y("other_user_id", userInfo.f19472id), vwb.m200311Y("superlike_quantity", Integer.valueOf(wge0.m203034f().m203037d(userInfo.f19472id))));
                        }
                        z3 = true;
                    }
                    if (!z3) {
                        iM31461y3 = CoreModule.f17545c.f19666n0.m31461y3() - 1;
                        if (NullChecker.m81303a(user) && iM31461y3 >= 0 && user.pictures.size() > iM31461y3) {
                            str = user.pictures.get(iM31461y3).url;
                            size = user.pictures.size();
                        }
                        c7994dM36702h.m38461B(str);
                        c7994dM36702h.m38491z(iM31461y3);
                        c7994dM36702h.m38460A(size);
                        m110804I2(c7994dM36702h, "failUndoLocal");
                    }
                    return z3;
                }
                C8764c.m53412M1(m110834k1(), "p_home,undo", Privilege.vip_undo, null, null, false, CoreModule.f17545c.f19666n0.f19539R);
            }
        } else {
            xnj0.m210172a(m110834k1());
        }
        z3 = false;
        if (!z3) {
            iM31461y3 = CoreModule.f17545c.f19666n0.m31461y3() - 1;
            if (NullChecker.m81303a(user)) {
                str = user.pictures.get(iM31461y3).url;
                size = user.pictures.size();
            }
            c7994dM36702h.m38461B(str);
            c7994dM36702h.m38491z(iM31461y3);
            c7994dM36702h.m38460A(size);
            m110804I2(c7994dM36702h, "failUndoLocal");
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m110815R1(j760 j760Var) {
        StringBuilder sb = new StringBuilder("checkIntro error, local has user me is " + NullChecker.m81303a(j760Var.f116565b));
        sb.append(", ");
        if (!NullChecker.m81303a(j760Var.f116564a) || vwb.m200296J(((q860) j760Var.f116564a).f153135a)) {
            sb.append("local has no conversations");
        } else {
            for (int i = 0; i < ((q860) j760Var.f116564a).f153135a.size() && i < 5; i++) {
                String str = ((Conversation) ((q860) j760Var.f116564a).f153135a.get(i)).f56011id;
                sb.append("cid-");
                sb.append(str);
                sb.append(" : ");
                if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(str))) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }
        CrashHelper.m81296c(new Exception(sb.toString()));
        this.f85449F = 0;
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m110816S1() {
        this.f85460i.m132487l(roj0.f160388a);
        if (uq40.m194983y(m110834k1(), true)) {
            return;
        }
        this.f85466o.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m110817T1() {
        this.f85460i.m132487l(roj0.f160388a);
        if (uq40.m194983y(m110834k1(), true)) {
            return;
        }
        this.f85466o.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m110818U1(String str) {
        if (NullChecker.m81303a(((idl) this.viewModel).m135582r0()) && NullChecker.m81303a(((idl) this.viewModel).m135582r0().mo38813j()) && TextUtils.equals(str, ((idl) this.viewModel).m135582r0().mo38813j().f19472id)) {
            this.f85445B = true;
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m110819V1(String str) {
        ark.m98443Q0(m110834k1(), str, new d30() { // from class: l.hbl
            @Override // p149l.d30
            public final void call() {
                this.f106943a.m110827d2();
            }
        });
        CoreModule.f17545c.f19593O2.put("");
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m110820W1(j760 j760Var) {
        this.f85463l.m132487l(Boolean.FALSE);
        m110782n1();
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m110821X1() {
        m110858z1();
        m110798C1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m110822Y1(xaj0 xaj0Var) {
        boolean z;
        PartialListOpt partialListOpt = (PartialListOpt) xaj0Var.f191752b;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM133663y = ((idl) this.viewModel).f112609W.m133663y(partialListOpt.loaded);
        if (TextUtils.isEmpty(this.f85454c) && !vwb.m200296J(listM133663y) && (!mah0.m153720m0() || !mah0.m153738y0(listM133663y.get(0).f19472id))) {
            this.f85454c = listM133663y.get(0).f19472id;
        }
        if (size != listM133663y.size()) {
            y1j.m212199h("moment render List refresh change " + size + Constants.SEPARATOR_COMMA + listM133663y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        if (z) {
            ((idl) this.viewModel).f112609W.m133660G(listM133663y);
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        this.f85455d = true;
        m110834k1().postDelayed(new Runnable() { // from class: l.kbl
            @Override // java.lang.Runnable
            public final void run() {
                this.f122250a.m110821X1();
            }
        }, 100L);
        StringBuilder sb = new StringBuilder("moment render cards: ");
        sb.append(z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(zNeedRefresh);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(!partialListOpt.hasMore() && listM133663y.size() == 0);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(listM133663y.isEmpty());
        y1j.m212199h(sb.toString());
        if (partialListOpt.hasMore() || listM133663y.size() != 0) {
            boolean zIsEmpty = listM133663y.isEmpty();
            V v2 = this.viewModel;
            if (zIsEmpty) {
                ((idl) v2).m135586t1(true, true, true);
            } else {
                ((idl) v2).m135586t1(false, true, true);
            }
        } else {
            ((idl) this.viewModel).m135586t1(true, false, true);
        }
        if (((idl) this.viewModel).m135526K0() || this.f85462k.m221515e() != null) {
            return;
        }
        this.f85462k.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m110823Z1(roj0 roj0Var) {
        if (!NullChecker.m81303a(roj0Var) || this.f85459h) {
            return;
        }
        m110838m1();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        m110742H1();
        m110739F1();
        m110748L1();
        m110744I1();
        m110746J1();
        m110736E1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m110824a2(List list) {
        if (vwb.m200337m(list, new w9j() { // from class: l.ibl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("newUserComGuideNewUI".equals(((ComStatusAward) obj).businessName));
            }
        })) {
            return;
        }
        if (!CoreModule.f17545c.f19639e0.m169520na().isNewUserIn24H()) {
            CoreModule.f17545c.f19567G0.m172213t3();
        } else {
            ((idl) this.viewModel).m135546Y();
            ezc0.m118906i0().m118918q0(true);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m110825b2(roj0 roj0Var) {
        ((idl) this.viewModel).m135550a0();
        ezc0.m118906i0().m118913j0();
        ezc0.m118906i0().m118919r0(true);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m110826c2(j760 j760Var) {
        if (xma.m210047L3() || mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
            ezc0.m118906i0().m118919r0(false);
            ezc0.m118906i0().m118918q0(false);
            ((idl) this.viewModel).m135550a0();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m110827d2() {
        ((idl) this.viewModel).m135564i0().startActivityForResult(MediaPickerAct.m47785g2(m110834k1(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender), 115);
    }

    @Override // p149l.q0m
    public void destroy() {
        if (this.f85477z != null) {
            m110737E2();
        }
        cxf.m109094f().m109095d();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m110828e2(Bundle bundle) {
        this.f85460i.m132487l(roj0.f160388a);
        if (NullChecker.m81303a(this.f85461j.m221515e()) && !vwb.m200296J(this.f85461j.m221515e().loaded)) {
            ((idl) this.viewModel).m135519G0(false, true);
        } else if (!NullChecker.m81303a(this.f85461j.m221515e()) || this.f85461j.m221515e().hasMore()) {
            ((idl) this.viewModel).m135519G0(true, true);
        } else {
            ((idl) this.viewModel).m135519G0(true, false);
        }
        this.f85465n = true;
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m110829f2() {
        this.f85445B = false;
        ((idl) this.viewModel).m135582r0().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m110830g2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f85445B) {
            e51.m114743H(m110834k1(), new Runnable() { // from class: l.cbl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80163a.m110829f2();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m110831h2(C4319c c4319c) {
        if (((idl) this.viewModel).m135564i0().isHidden()) {
            return;
        }
        if (c4319c == C4319c.f15548i) {
            if (this.f85474w) {
                this.f85474w = false;
            }
            HomeStatisticsHelper.m36690D(true);
        } else if (c4319c == C4319c.f15549j) {
            HomeStatisticsHelper.m36690D(false);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m110832i2(C4319c c4319c) {
        ((idl) this.viewModel).m135588u1();
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ C22306c m110833j2(User user) {
        return this.f85464m;
    }

    /* JADX INFO: renamed from: k1 */
    public NewMainAct m110834k1() {
        return ((idl) this.viewModel).act();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m110835k2(roj0 roj0Var) {
        ark.m98449T0(m110834k1());
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m110836l1() {
        return (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "wechat") || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "qq")) && vy8.m200617o() && !CoreModule.f17545c.f19639e0.f149333b0.get().booleanValue();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m110837l2(String str) {
        Picture picture = new Picture();
        picture.url = str;
        qib0.f154691G.m102312B0(((idl) this.viewModel).m135571m0(), picture.profile480());
        qib0.f154691G.m102312B0(((idl) this.viewModel).m135562h0(), picture.profile480());
    }

    /* JADX INFO: renamed from: m1 */
    public void m110838m1() {
        if (CoreModule.f17545c.f19639e0.m169527p9() != null) {
            if (ic50.m135327j().m135333f().m145246g0() || ((idl) this.viewModel).act().m39812e6(TabName.Card)) {
                return;
            }
            this.f85459h = true;
            return;
        }
        this.f85449F = 1;
        if (NullChecker.m81303a(this.f85450G) && !this.f85450G.isUnsubscribed()) {
            this.f85450G.unsubscribe();
        }
        CrashHelper.m81296c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.m29931H().userId() + ", login: " + CoreModule.m29931H().signedIn_() + ", me == null"));
        this.f85450G = duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33073on(), CoreModule.f17545c.f19639e0.m169523o9(), new yn30())).filter(new w9j() { // from class: l.lbl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127304a.m110813Q1((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mbl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133035a.m110815R1((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m110839m2(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.m81303a(((idl) this.viewModel).m135582r0())) {
            C7994d c7994dM110786p1 = m110786p1(((idl) this.viewModel).m135564i0().pageId(), relationship.f38806id, ((idl) this.viewModel).m135582r0(), user);
            c7994dM110786p1.m38487v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m110804I2(c7994dM110786p1, "success");
        }
        this.f85457f = true;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m110840n2(User user, Throwable th) {
        if (NullChecker.m81303a(((idl) this.viewModel).m135582r0())) {
            m110803H2(m110786p1(((idl) this.viewModel).m135564i0().pageId(), "", ((idl) this.viewModel).m135582r0(), user), th);
        }
        this.f85457f = true;
        lsi0.m151570H(m110834k1().getResources().getString(R$string.f18804oq), m110834k1().getResources().getDrawable(x2c0.f190665vu), m110834k1().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: o1 */
    public void m110841o1() {
        this.f85473v = null;
        this.f85472u = null;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m110842p2(String str, int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(((idl) this.viewModel).m135582r0())) {
            CoreSuggested.UserInfo userInfoMo38813j = ((idl) this.viewModel).m135582r0().mo38813j();
            if (NullChecker.m81303a(userInfoMo38813j) && TextUtils.equals(str, userInfoMo38813j.f19472id)) {
                SwipeDirection swipeDirection = SwipeDirection.UP;
                if (i != swipeDirection.getValue()) {
                    ((idl) this.viewModel).m135582r0().mo38801A(SwipeDirection.fromValue(i));
                } else if (((idl) this.viewModel).m135582r0().mo38808c(false)) {
                    if (i == swipeDirection.getValue() && u59.m191827f0() && NullChecker.m81303a(intent)) {
                        m110796B1(intent);
                    }
                    m110812P2(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m110843q1() {
        this.f85456e = true;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m110844q2(ArrayList arrayList, String str, roj0 roj0Var) {
        ((idl) this.viewModel).m135564i0().m20599s4();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        ark.m98453V0(m110834k1(), false, (Media) arrayList.get(0), m110834k1().string(R$string.f18491el), new Runnable() { // from class: l.wbl
            @Override // java.lang.Runnable
            public final void run() {
                dcl.m110743I0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m214648G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m214703v();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m110845r2(Throwable th) {
        ((idl) this.viewModel).m135564i0().m20599s4();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: s1 */
    public void m110846s1() {
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.autoAdjustRadius = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m110847s2(C22392a c22392a, Throwable th) {
        CoreModule.f17545c.f19666n0.m31448Q3();
        if ((c22392a.m221515e() == null || ((PartialListOpt) c22392a.m221515e()).loaded.size() == 0) && ((idl) this.viewModel).m135526K0()) {
            this.f85448E = true;
            ((idl) this.viewModel).m135584s1(true, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public int m110848t1() {
        return this.f85453b;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m110849t2(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            ygh0.m214691l0(ygh0.f198173h);
        } else {
            ygh0.m214693m0(ygh0.f198173h, wvv.m205774n(m110834k1()) ? BLiveOperationTitleShowType.off : "on");
        }
        m110853v2();
    }

    /* JADX INFO: renamed from: u1 */
    public String m110850u1() {
        return this.f85452a;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m110851u2(DialogInterface dialogInterface) {
        m110853v2();
    }

    /* JADX INFO: renamed from: v1 */
    public String m110852v1() {
        return this.f85446C;
    }

    /* JADX INFO: renamed from: w2 */
    public void m110854w2() {
        this.f85448E = false;
    }

    /* JADX INFO: renamed from: x1 */
    public void m110855x1() {
        pcl0 pcl0VarM2557i0 = m110834k1().fragmentManager().m2557i0(TabName.Card.toString());
        if (pcl0VarM2557i0 instanceof psl) {
            psl pslVar = (psl) pcl0VarM2557i0;
            NewTanFragTag newTanFragTag = NewTanFragTag.HOME;
            pslVar.mo38546I2(newTanFragTag);
            pslVar.mo38565n2(newTanFragTag);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m110856x2(int i, final int i2, final Intent intent) {
        if (i != 114 || !NullChecker.m81303a(((idl) this.viewModel).m135582r0())) {
            if (i == 115 && i2 == -1) {
                m110732A2((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        SwipeDirection swipeDirection = SwipeDirection.RIGHT;
        if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
            m110834k1().f24439p = true;
        }
        jj4 jj4VarMo38818o = ((idl) this.viewModel).m135582r0().mo38818o();
        if (NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141745d())) {
            final String str = jj4VarMo38818o.m141745d().f56011id;
            if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                this.f85458g = true;
                lifecycle().takeFirst(new w9j() { // from class: l.cal
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.nal
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f137914a.m110842p2(str, i2, intent, (C4319c) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public VSwipeStack.OnCardSwipeResult m110857y2(mol molVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f85447D == null) {
            this.f85447D = new k7h0();
        }
        if (this.f85455d) {
            CoreBusinessModule.f17537g.m146315b().f133031b = molVar.mo36883e0() ? molVar.getCardDataProxy().m141745d().f56011id : "";
        } else {
            CrashHelper.m81296c(new IllegalStateException("moment onCardSwipe be called before card rendered"));
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z2 = true;
        boolean z3 = swipeDirection == swipeDirection2 || swipeDirection == SwipeDirection.UP;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z4 = swipeDirection == swipeDirection3;
        if (!z) {
            ((idl) this.viewModel).m135544X(z3, z4).mo38358i();
        }
        if (z3) {
            V v2 = this.viewModel;
            if (z4) {
                ((idl) v2).m135565j0().reset();
            } else {
                ((idl) v2).m135583s0().reset();
            }
            ((idl) this.viewModel).m135560g0().reset();
        } else {
            ((idl) this.viewModel).m135565j0().reset();
            ((idl) this.viewModel).m135583s0().reset();
        }
        molVar.mo36898j0(swipeDirection);
        HomeStatisticsHelper.m36691E("card");
        HomeStatisticsHelper.m36692F("swipe");
        f3a f3aVar = CoreModule.f17545c.f19622Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        f3aVar.m119255e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = this.f85447D.mo37497a(new k7h0.C17941a(this, (idl) this.viewModel, molVar.getCardDataProxy(), swipeDirection, z));
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo37497a == onCardSwipeResult) {
            CoreModule.f17545c.f19622Y0.m119256f();
        }
        if (onCardSwipeResultMo37497a == VSwipeStack.OnCardSwipeResult.back || onCardSwipeResultMo37497a == onCardSwipeResult) {
            m110841o1();
        }
        this.f85458g = false;
        if (!IntlCountryCodeController.m28126v()) {
            return onCardSwipeResultMo37497a;
        }
        ((idl) this.viewModel).m135597z1(onCardSwipeResultMo37497a, swipeDirection);
        return onCardSwipeResultMo37497a != onCardSwipeResult ? VSwipeStack.OnCardSwipeResult.stay : onCardSwipeResultMo37497a;
    }

    /* JADX INFO: renamed from: z1 */
    public void m110858z1() {
        if (!xij0.m209661d0() || m110834k1().lifecycle_() != C4319c.f15548i || ((idl) this.viewModel).m135523I0() || ((idl) this.viewModel).m135564i0().isHidden()) {
            return;
        }
        Object objMo38809d = ((idl) this.viewModel).m135582r0() == null ? null : ((idl) this.viewModel).m135582r0().mo38809d();
        if (NullChecker.m81303a(objMo38809d) && (objMo38809d instanceof d5m)) {
            d5m d5mVar = (d5m) objMo38809d;
            if (d5mVar.mo36947y()) {
                d5mVar.mo36830L();
            }
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m110859z2(boolean z) {
        this.f85475x = z;
        this.f85476y.m132487l(Boolean.valueOf(z));
        if (!z) {
            if (this.f85459h) {
                this.f85459h = false;
                m110838m1();
            }
            if (this.f85456e) {
                this.f85456e = false;
                if (NullChecker.m81303a(((idl) this.viewModel).m135582r0()) && NullChecker.m81303a(((idl) this.viewModel).m135582r0().mo38813j())) {
                    HomeStatisticsHelper.m36703i(((idl) this.viewModel).m135582r0().mo38813j(), ((idl) this.viewModel).m135564i0().pageId());
                    jj4 jj4VarMo38818o = ((idl) this.viewModel).m135582r0().mo38818o();
                    String strPageId = ((idl) this.viewModel).m135564i0().pageId();
                    String str = this.f85452a;
                    HomeStatisticsHelper.m36712r(jj4VarMo38818o, strPageId, str, m110809N1(str));
                }
            }
        }
        if (CoreModule.f17545c.f19576J0.m139254F3() && ((lifecycle_() == C4319c.f15548i || lifecycle_() == C4319c.f15547h) && !z)) {
            m110808M2();
        }
        ((idl) this.viewModel).m135570l1(z);
        if (this.f85475x) {
            return;
        }
        if (do80.f87149f && this.f85465n) {
            ((idl) this.viewModel).m135584s1(true, true);
            duringCreated(CoreModule.f17545c.f19666n0.m31442K3(e900.m115330b().m115334f() ? e900.m115330b().m115331c() : upa.m194647I0().tabId)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.nbl
                @Override // p149l.e30
                public final void call(Object obj) {
                    dcl.m110772h0((roj0) obj);
                }
            }, new e30() { // from class: l.obl
                @Override // p149l.e30
                public final void call(Object obj) {
                    dcl.m110749N0((Throwable) obj);
                }
            }));
        }
        do80.f87149f = false;
    }
}
