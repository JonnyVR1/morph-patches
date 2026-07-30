package p009l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.b0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.ComStatusAward;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.main.LocationPermissionView;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.data.UssTags;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.adi0;
import l.ark;
import l.c4g0;
import l.cxf;
import l.d30;
import l.do80;
import l.e2s;
import l.e30;
import l.e51;
import l.e900;
import l.ezc0;
import l.f3a;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mah0;
import l.mb90;
import l.mcr;
import l.mkd0;
import l.ogl0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.u59;
import l.upa;
import l.uq40;
import l.v9j;
import l.vwb;
import l.vy8;
import l.w9j;
import l.wge0;
import l.wvv;
import l.x2c0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xij0;
import l.xma;
import l.xnj0;
import l.y9j;
import l.ya5;
import l.ygh0;
import l.z9j;
import l.zvf0;
import rx.Notification;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dcl extends jq2<idl> {

    /* JADX INFO: renamed from: I */
    public static String f11728I = "suggest_user_profile_info";

    /* JADX INFO: renamed from: J */
    public static String f11729J = "home";

    /* JADX INFO: renamed from: K */
    public static String f11730K = "click";

    /* JADX INFO: renamed from: L */
    public static String f11731L = "swipe";

    /* JADX INFO: renamed from: A */
    public Runnable f11732A;

    /* JADX INFO: renamed from: B */
    public boolean f11733B;

    /* JADX INFO: renamed from: C */
    public String f11734C;

    /* JADX INFO: renamed from: D */
    public p3m<k7h0.C0984a, VSwipeStack.OnCardSwipeResult> f11735D;

    /* JADX INFO: renamed from: E */
    public boolean f11736E;

    /* JADX INFO: renamed from: F */
    public int f11737F;

    /* JADX INFO: renamed from: G */
    public c4g0 f11738G;

    /* JADX INFO: renamed from: H */
    public long f11739H;

    /* JADX INFO: renamed from: a */
    public String f11740a;

    /* JADX INFO: renamed from: b */
    public int f11741b;

    /* JADX INFO: renamed from: c */
    public String f11742c;

    /* JADX INFO: renamed from: d */
    public boolean f11743d;

    /* JADX INFO: renamed from: e */
    public boolean f11744e;

    /* JADX INFO: renamed from: f */
    public boolean f11745f;

    /* JADX INFO: renamed from: g */
    public boolean f11746g;

    /* JADX INFO: renamed from: h */
    public boolean f11747h;

    /* JADX INFO: renamed from: i */
    public a<roj0> f11748i;

    /* JADX INFO: renamed from: j */
    public a<PartialListOpt<CoreSuggested.UserInfo>> f11749j;

    /* JADX INFO: renamed from: k */
    public a<roj0> f11750k;

    /* JADX INFO: renamed from: l */
    public a<Boolean> f11751l;

    /* JADX INFO: renamed from: m */
    public b<roj0> f11752m;

    /* JADX INFO: renamed from: n */
    public boolean f11753n;

    /* JADX INFO: renamed from: o */
    public a<Boolean> f11754o;

    /* JADX INFO: renamed from: p */
    public boolean f11755p;

    /* JADX INFO: renamed from: q */
    public boolean f11756q;

    /* JADX INFO: renamed from: r */
    public boolean f11757r;

    /* JADX INFO: renamed from: s */
    public long f11758s;

    /* JADX INFO: renamed from: t */
    public boolean f11759t;

    /* JADX INFO: renamed from: u */
    public String f11760u;

    /* JADX INFO: renamed from: v */
    public String f11761v;

    /* JADX INFO: renamed from: w */
    public boolean f11762w;

    /* JADX INFO: renamed from: x */
    public boolean f11763x;

    /* JADX INFO: renamed from: y */
    public a<Boolean> f11764y;

    /* JADX INFO: renamed from: z */
    public c4g0 f11765z;

    /* JADX INFO: renamed from: l.dcl$a */
    public class C0845a implements w9j<roj0, c<xaj0>> {
        public C0845a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ xaj0 m13171a(User user, PartialListOpt partialListOpt, TabName tabName, Notification notification) {
            return new xaj0(user, partialListOpt, tabName);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<xaj0> call(roj0 roj0Var) {
            return mkd0.t(CoreModule.c.e0.o9(), CoreModule.c.n0.a4(eli0.m13974a()), dcl.this.m13145k1().m3895i7(), vi4.m23379b(CacheCardType.DEFAULT_CARD).mo12117d(4).timeout(3000L, TimeUnit.MILLISECONDS).materialize().observeOn(jo0.a()).first(), new z9j() { // from class: l.ccl
                /* JADX INFO: renamed from: b */
                public final Object m12496b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return dcl.C0845a.m13171a((User) obj, (PartialListOpt) obj2, (TabName) obj3, (Notification) obj4);
                }
            });
        }
    }

    public dcl(mcr mcrVar) {
        super(mcrVar);
        this.f11740a = "";
        this.f11741b = 0;
        this.f11742c = "";
        this.f11743d = false;
        this.f11744e = false;
        this.f11745f = true;
        this.f11746g = false;
        this.f11748i = a.b();
        this.f11749j = CoreModule.c.n0.V;
        this.f11750k = a.b();
        Boolean bool = Boolean.FALSE;
        this.f11751l = a.c(bool);
        this.f11752m = b.b();
        this.f11753n = false;
        this.f11754o = a.c(bool);
        this.f11755p = false;
        this.f11756q = true;
        this.f11757r = true;
        this.f11758s = 0L;
        this.f11759t = false;
        this.f11762w = true;
        this.f11764y = a.c(bool);
        this.f11732A = new Runnable() { // from class: l.fal
            @Override // java.lang.Runnable
            public final void run() {
                this.f12888a.m13094o2();
            }
        };
        this.f11734C = "";
        this.f11736E = false;
        this.f11737F = 0;
        this.f11738G = null;
        this.f11739H = adi0.INSTANCE.d();
    }

    /* JADX INFO: renamed from: A2 */
    private void m13042A2(final ArrayList<Media> arrayList, final String str) {
        ((idl) ((jq2) this).viewModel).m16456i0().o4(R.string.J5);
        ya5.I(arrayList, "profile").compose(mkd0.C()).flatMap(new w9j() { // from class: l.sbl
            public final Object call(Object obj) {
                return dcl.m13090m0((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.tbl
            public final void call(Object obj) {
                this.f20601a.m13155q2(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.vbl
            public final void call(Object obj) {
                this.f21521a.m13156r2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ roj0 m13045E0(com.p1.mobile.android.app.c cVar, roj0 roj0Var, List list) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            return roj0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    private void m13046E1() {
        duringCreated(CoreModule.c.r0.i0).subscribe(mkd0.G(new e30() { // from class: l.yal
            public final void call(Object obj) {
                this.f22952a.m13128U1((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E2 */
    private void m13047E2() {
        mkd0.z(this.f11765z);
        this.f11765z = null;
    }

    /* JADX INFO: renamed from: F1 */
    private void m13049F1() {
        duringCreated(CoreModule.c.O2.obs()).observeOn(jo0.a()).filter(new w9j() { // from class: l.gal
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.kal
            public final void call(Object obj) {
                this.f15568a.m13129V1((String) obj);
            }
        }));
        duringCreated(mkd0.r(lifecycle(), this.f11751l, new el30()).filter(new w9j() { // from class: l.lal
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.a == com.p1.mobile.android.app.c.i && ((Boolean) j760Var.b).booleanValue());
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.mal
            public final void call(Object obj) {
                this.f16781a.m13130W1((j760) obj);
            }
        }));
        duringCreated(this.f11748i.switchMap(new C0845a()).filter(new w9j() { // from class: l.oal
            public final Object call(Object obj) {
                return Boolean.valueOf(((xaj0) obj).c == TabName.Card);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.pal
            public final void call(Object obj) {
                this.f18442a.m13132Y1((xaj0) obj);
            }
        }));
        duringCreated(mkd0.s(lifecycle(), this.f11750k, CoreModule.c.j0.E4().take(1), new y9j() { // from class: l.qal
            /* JADX INFO: renamed from: a */
            public final Object m20850a(Object obj, Object obj2, Object obj3) {
                return dcl.m13045E0((com.p1.mobile.android.app.c) obj, (roj0) obj2, (List) obj3);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ral
            public final void call(Object obj) {
                this.f19712a.m13133Z1((roj0) obj);
            }
        }));
        if (ezc0.m0()) {
            duringCreated(CoreModule.c.G0.n3()).distinctUntilChanged().take(1).subscribe(mkd0.G(new e30() { // from class: l.sal
                public final void call(Object obj) {
                    this.f20146a.m13135a2((List) obj);
                }
            }));
            if (CoreModule.c.e0.na().isNewUserIn24H()) {
                duringCreated(CoreModule.c.G0.o3()).distinctUntilChanged().take(1).subscribe(mkd0.G(new e30() { // from class: l.hal
                    public final void call(Object obj) {
                        this.f13925a.m13136b2((roj0) obj);
                    }
                }));
                duringCreated(new v9j() { // from class: l.ial
                    public final Object call() {
                        return mkd0.r(CoreModule.c.e0.o9(), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")), new x9j() { // from class: l.rbl
                            public final Object call(Object obj, Object obj2) {
                                return j760.a((User) obj, (UserPrivilege) obj2);
                            }
                        });
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.jal
                    public final void call(Object obj) {
                        this.f15028a.m13137c2((j760) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    private void m13052H1() {
        creates(new e30() { // from class: l.tal
            public final void call(Object obj) {
                this.f20590a.m13139e2((Bundle) obj);
            }
        }, new d30() { // from class: l.ual
            public final void call() {
                dcl.m13101t0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m13053I0() {
    }

    /* JADX INFO: renamed from: I1 */
    private void m13054I1() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.jbl
            public final void call(Object obj) {
                this.f15042a.m13141g2((com.p1.mobile.android.app.c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ubl
            public final void call(Object obj) {
                this.f21058a.m13142h2((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    private void m13056J1() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.abl
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.k);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bbl
            public final void call(Object obj) {
                this.f10001a.m13143i2((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L1 */
    private void m13058L1() {
        duringCreated(CoreModule.c.e0.o9()).switchMap(new w9j() { // from class: l.xbl
            public final Object call(Object obj) {
                return this.f22500a.m13144j2((User) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ybl
            public final void call(Object obj) {
                this.f22985a.m13146k2((roj0) obj);
            }
        }));
        cxf.f().e(duringCreated(CoreModule.c.e0.o9()), m13145k1(), ((idl) ((jq2) this).viewModel).m16456i0(), 115);
        duringCreated(CoreModule.c.e0.wa()).subscribe(mkd0.G(new e30() { // from class: l.zbl
            public final void call(Object obj) {
                CoreModule.c.e0.va(-1);
            }
        }));
        duringCreated(CoreModule.c.e0.o9().filter(new w9j() { // from class: l.acl
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.bcl
            public final Object call(Object obj) {
                return ((Media) ((User) obj).fp()).url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.dal
            public final void call(Object obj) {
                this.f11701a.m13148l2((String) obj);
            }
        }, new e30() { // from class: l.eal
            public final void call(Object obj) {
                dcl.m13073b1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m13059N0(Throwable th) {
    }

    /* JADX INFO: renamed from: N2 */
    private void m13060N2() {
        wvv.l(m13145k1(), new PermissionHelper.InterfaceC0531b() { // from class: l.val
            @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
            /* JADX INFO: renamed from: a */
            public final void mo10235a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f21510a.m13160t2(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.wal
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f21970a.m13162u2(dialogInterface);
            }
        }, new Runnable() { // from class: l.xal
            @Override // java.lang.Runnable
            public final void run() {
                this.f22488a.m13164v2();
            }
        }, new d30() { // from class: l.zal
            public final void call() {
                ygh0.n0(ygh0.h);
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    private boolean m13065R2() {
        return NullChecker.a(CoreModule.c.n0.R);
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m13073b1(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m13082h0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ c m13090m0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: n1 */
    private void m13092n1() {
        NewMainAct newMainActM13145k1 = m13145k1();
        if (!NullChecker.a(newMainActM13145k1) || newMainActM13145k1.isDialogShowing()) {
            this.f11748i.onNext(roj0.a);
            return;
        }
        if (vy8.d()) {
            CoreModule.c.e0.c0.put(Boolean.TRUE);
            ark.O0(m13145k1(), "", new d30() { // from class: l.pbl
                public final void call() {
                    this.f18457a.m13126S1();
                }
            }, false);
        } else if (!m13147l1()) {
            this.f11748i.onNext(roj0.a);
        } else {
            CoreModule.c.e0.c0.put(Boolean.TRUE);
            ark.O0(newMainActM13145k1, "", new d30() { // from class: l.qbl
                public final void call() {
                    this.f19128a.m13127T1();
                }
            }, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m13094o2() {
        this.f11745f = false;
        HashMap map = new HashMap();
        map.put("sourcepage", f11729J);
        map.put("actiontype", f11730K);
        b0 b0Var = CoreModule.c.n0;
        final User user = b0Var.R;
        if (NullChecker.a(b0Var.S)) {
            CoreModule.c.n0.S.clone();
        }
        c cVarB4 = CoreModule.c.n0.b4(map);
        if (NullChecker.a(cVarB4)) {
            cVarB4.subscribe(mkd0.H(new e30() { // from class: l.dbl
                public final void call(Object obj) {
                    this.f11712a.m13150m2(user, (Relationship) obj);
                }
            }, new e30() { // from class: l.ebl
                public final void call(Object obj) {
                    this.f12486a.m13151n2(user, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0())) {
            m13114I2(m13096p1(((idl) ((jq2) this).viewModel).m16456i0().pageId(), "", ((idl) ((jq2) this).viewModel).m16475r0(), user), "");
        }
        this.f11745f = true;
        lsi0.H(m13145k1().getResources().getString(R.string.oq), m13145k1().getResources().getDrawable(x2c0.vu), m13145k1().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: p1 */
    private C0158d m13096p1(String str, String str2, wsf0 wsf0Var, User user) {
        String str3;
        int size;
        int iY3 = CoreModule.c.n0.y3() - 1;
        if (!NullChecker.a(user) || iY3 < 0 || user.pictures.size() <= iY3) {
            str3 = "";
            size = 0;
        } else {
            str3 = ((Media) user.pictures.get(iY3)).url;
            size = user.pictures.size();
        }
        C0158d c0158dM651h = HomeStatisticsHelper.m651h(str, str2, wsf0Var);
        c0158dM651h.m2439B(str3);
        c0158dM651h.m2469z(iY3);
        c0158dM651h.m2438A(size);
        return c0158dM651h;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m13098r0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void m13164v2() {
        ((idl) ((jq2) this).viewModel).m16468o0().e(LocationPermissionView.LocationPermissionState.requested);
        if (this.f11756q) {
            this.f11756q = false;
            this.f11748i.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m13101t0() {
    }

    /* JADX INFO: renamed from: B1 */
    public final void m13106B1(Intent intent) {
        String stringExtra = intent.getStringExtra("heart_confession_uid");
        String stringExtra2 = intent.getStringExtra("heart_confession_content");
        CoreSuggested.UserInfo userInfoMo2809j = ((idl) ((jq2) this).viewModel).m16475r0().mo2809j();
        String str = NullChecker.a(userInfoMo2809j) ? userInfoMo2809j.id : "";
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return;
        }
        this.f11760u = stringExtra;
        this.f11761v = stringExtra2;
    }

    /* JADX INFO: renamed from: B2 */
    public void m13107B2() {
        if (SystemClock.uptimeMillis() - this.f11758s >= 2000) {
            this.f11758s = SystemClock.uptimeMillis();
            m13112F2(true);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public void m13108C1() {
        if (m13145k1().lifecycle_() != com.p1.mobile.android.app.c.i || ((idl) ((jq2) this).viewModel).m16415I0() || ((idl) ((jq2) this).viewModel).m16456i0().isHidden() || !((idl) ((jq2) this).viewModel).m16404B1()) {
            return;
        }
        if (com.p1.mobile.putong.core.ui.onlinematch.a.f) {
            com.p1.mobile.putong.core.ui.onlinematch.a.f = false;
            ((idl) ((jq2) this).viewModel).m16406C1();
        }
        if (e2s.d()) {
            e2s.e(false);
            ((idl) ((jq2) this).viewModel).m16406C1();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m13109C2(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
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
            ygh0.l0(ygh0.h);
        } else {
            ygh0.m0(ygh0.h, wvv.n(m13145k1()) ? "off" : "on");
        }
        if (i == 1792) {
            if (!z) {
                m13060N2();
                return;
            }
            ((idl) ((jq2) this).viewModel).m16468o0().e(LocationPermissionView.LocationPermissionState.requested);
            if (this.f11756q) {
                this.f11756q = false;
                if (this.f11755p) {
                    return;
                }
                this.f11748i.onNext(roj0.a);
            }
        }
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m13110D1() {
        return this.f11757r;
    }

    /* JADX INFO: renamed from: D2 */
    public void m13111D2() {
        this.f11757r = false;
        ((idl) ((jq2) this).viewModel).m16473q1();
    }

    /* JADX INFO: renamed from: F2 */
    public void m13112F2(boolean z) {
        final a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f11749j;
        PartialListOpt partialListOpt = (PartialListOpt) aVar.e();
        if (z || partialListOpt == null || partialListOpt.hasMore()) {
            duringCreated(CoreModule.c.n0.S3(e900.b().f() ? e900.b().c() : upa.I0().tabId)).take(1).subscribe(mkd0.H(new e30() { // from class: l.fbl
                public final void call(Object obj) {
                    dcl.m13098r0((roj0) obj);
                }
            }, new e30() { // from class: l.gbl
                public final void call(Object obj) {
                    this.f13403a.m13158s2(aVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m13113H2(C0158d c0158d, Throwable th) {
        HomeStatisticsHelper.m636A(c0158d, th);
        this.f11746g = false;
        sbp.m22045b();
    }

    /* JADX INFO: renamed from: I2 */
    public void m13114I2(C0158d c0158d, String str) {
        HomeStatisticsHelper.m637B(c0158d, str);
        this.f11746g = false;
        sbp.m22045b();
    }

    /* JADX INFO: renamed from: J2 */
    public void m13115J2(int i) {
        this.f11741b = i;
    }

    /* JADX INFO: renamed from: K2 */
    public void m13116K2(String str) {
        this.f11740a = str;
    }

    /* JADX INFO: renamed from: L2 */
    public void m13117L2(String str) {
        this.f11734C = str;
    }

    /* JADX INFO: renamed from: M2 */
    public void m13118M2() {
        xdl0.M(((idl) ((jq2) this).viewModel).m16444b0(), true);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m13119N1(String str) {
        return TextUtils.equals(this.f11742c, str);
    }

    /* JADX INFO: renamed from: O1 */
    public boolean m13120O1(String str) {
        return (TextUtils.isEmpty(this.f11760u) || !this.f11760u.equals(str) || TextUtils.isEmpty(this.f11761v)) ? false : true;
    }

    /* JADX INFO: renamed from: P1 */
    public boolean m13121P1() {
        return this.f11736E;
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m13122P2(boolean z) {
        return m13124Q2(z, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ Boolean m13123Q1(j760 j760Var) {
        return Boolean.valueOf(this.f11737F == 1);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX INFO: renamed from: Q2 */
    public boolean m13124Q2(boolean z, boolean z2) {
        User user;
        C0158d c0158dM651h;
        UssTags ussTags;
        boolean z3;
        int iY3;
        String str = "";
        if (z) {
            user = null;
            c0158dM651h = HomeStatisticsHelper.m647d(((idl) ((jq2) this).viewModel).m16475r0() == null ? null : ((idl) ((jq2) this).viewModel).m16475r0().mo2814o(), true, this.f11746g, SwipeDirection.UP, ((idl) ((jq2) this).viewModel).m16475r0());
        } else {
            user = CoreModule.c.n0.R;
            c0158dM651h = HomeStatisticsHelper.m651h(((idl) ((jq2) this).viewModel).m16456i0().pageId(), user == null ? "" : ((DbObject) user).id, ((idl) ((jq2) this).viewModel).m16475r0());
            c0158dM651h.m2465v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
        }
        int size = 0;
        if (CoreModule.c.e0.p9().isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            m13114I2(c0158dM651h, "failJailedUser");
            return false;
        }
        KeyEvent.Callback callbackMo2805d = ((idl) ((jq2) this).viewModel).m16475r0().mo2805d();
        if (!NullChecker.a(callbackMo2805d) || (((callbackMo2805d instanceof d5m) && ((d5m) callbackMo2805d).mo865k0()) || !this.f11745f)) {
            return false;
        }
        if (z) {
            ((idl) ((jq2) this).viewModel).m16475r0().mo2797A(SwipeDirection.UP);
            return false;
        }
        if (m13065R2()) {
            CoreSuggested.UserInfo userInfo = CoreModule.c.n0.S;
            if (u59.f0() && NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.letter)) {
                lsi0.w(R.string.Y2);
            } else {
                Counter counterO3 = CoreModule.c.o3();
                CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
                CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3.undoLimit;
                if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
                    if (this.f11745f && CoreModule.c.n0.S.canUndo) {
                        this.f11732A.run();
                        if (ogl0.Z()) {
                            wge0.f().i(userInfo.id);
                            zvf0.D("e_undo_superlike", ((idl) ((jq2) this).viewModel).m16456i0().pageId(), new j760[]{vwb.Y("other_user_id", userInfo.id), vwb.Y("superlike_quantity", Integer.valueOf(wge0.f().d(userInfo.id)))});
                        }
                        z3 = true;
                    }
                    if (!z3) {
                        iY3 = CoreModule.c.n0.y3() - 1;
                        if (NullChecker.a(user) && iY3 >= 0 && user.pictures.size() > iY3) {
                            str = ((Media) user.pictures.get(iY3)).url;
                            size = user.pictures.size();
                        }
                        c0158dM651h.m2439B(str);
                        c0158dM651h.m2469z(iY3);
                        c0158dM651h.m2438A(size);
                        m13114I2(c0158dM651h, "failUndoLocal");
                    }
                    return z3;
                }
                com.p1.mobile.putong.core.ui.purchase.c.M1(m13145k1(), "p_home,undo", Privilege.vip_undo, (d30) null, (d30) null, false, CoreModule.c.n0.R);
            }
        } else {
            xnj0.a(m13145k1());
        }
        z3 = false;
        if (!z3) {
            iY3 = CoreModule.c.n0.y3() - 1;
            if (NullChecker.a(user)) {
                str = ((Media) user.pictures.get(iY3)).url;
                size = user.pictures.size();
            }
            c0158dM651h.m2439B(str);
            c0158dM651h.m2469z(iY3);
            c0158dM651h.m2438A(size);
            m13114I2(c0158dM651h, "failUndoLocal");
        }
        return z3;
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m13125R1(j760 j760Var) {
        StringBuilder sb = new StringBuilder("checkIntro error, local has user me is " + NullChecker.a(j760Var.b));
        sb.append(", ");
        if (!NullChecker.a(j760Var.a) || vwb.J(((q860) j760Var.a).f19068a)) {
            sb.append("local has no conversations");
        } else {
            for (int i = 0; i < ((q860) j760Var.a).f19068a.size() && i < 5; i++) {
                String str = ((DbObject) ((Conversation) ((q860) j760Var.a).f19068a.get(i))).id;
                sb.append("cid-");
                sb.append(str);
                sb.append(" : ");
                if (NullChecker.a(CoreModule.c.e0.Pa(str))) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }
        CrashHelper.c(new Exception(sb.toString()));
        this.f11737F = 0;
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m13126S1() {
        this.f11748i.onNext(roj0.a);
        if (uq40.y(m13145k1(), true)) {
            return;
        }
        this.f11754o.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m13127T1() {
        this.f11748i.onNext(roj0.a);
        if (uq40.y(m13145k1(), true)) {
            return;
        }
        this.f11754o.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m13128U1(String str) {
        if (NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0()) && NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0().mo2809j()) && TextUtils.equals(str, ((idl) ((jq2) this).viewModel).m16475r0().mo2809j().id)) {
            this.f11733B = true;
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m13129V1(String str) {
        ark.Q0(m13145k1(), str, new d30() { // from class: l.hbl
            public final void call() {
                this.f13943a.m13138d2();
            }
        });
        CoreModule.c.O2.put("");
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m13130W1(j760 j760Var) {
        this.f11751l.onNext(Boolean.FALSE);
        m13092n1();
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m13131X1() {
        m13169z1();
        m13108C1();
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m13132Y1(xaj0 xaj0Var) {
        boolean z;
        PartialListOpt partialListOpt = (PartialListOpt) xaj0Var.b;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM16048y = ((idl) ((jq2) this).viewModel).f14540W.m16048y(partialListOpt.loaded);
        if (TextUtils.isEmpty(this.f11742c) && !vwb.J(listM16048y) && (!mah0.m0() || !mah0.y0(listM16048y.get(0).id))) {
            this.f11742c = listM16048y.get(0).id;
        }
        if (size != listM16048y.size()) {
            y1j.m25171h("moment render List refresh change " + size + "," + listM16048y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        if (z) {
            ((idl) ((jq2) this).viewModel).f14540W.m16042G(listM16048y);
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        this.f11743d = true;
        m13145k1().postDelayed(new Runnable() { // from class: l.kbl
            @Override // java.lang.Runnable
            public final void run() {
                this.f15592a.m13131X1();
            }
        }, 100L);
        StringBuilder sb = new StringBuilder("moment render cards: ");
        sb.append(z);
        sb.append(",");
        sb.append(zNeedRefresh);
        sb.append(",");
        sb.append(!partialListOpt.hasMore() && listM16048y.size() == 0);
        sb.append(",");
        sb.append(listM16048y.isEmpty());
        y1j.m25171h(sb.toString());
        if (partialListOpt.hasMore() || listM16048y.size() != 0) {
            boolean zIsEmpty = listM16048y.isEmpty();
            s7m s7mVar = ((jq2) this).viewModel;
            if (zIsEmpty) {
                ((idl) s7mVar).m16479t1(true, true, true);
            } else {
                ((idl) s7mVar).m16479t1(false, true, true);
            }
        } else {
            ((idl) ((jq2) this).viewModel).m16479t1(true, false, true);
        }
        if (((idl) ((jq2) this).viewModel).m16418K0() || this.f11750k.e() != null) {
            return;
        }
        this.f11750k.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m13133Z1(roj0 roj0Var) {
        if (!NullChecker.a(roj0Var) || this.f11747h) {
            return;
        }
        m13149m1();
    }

    /* JADX INFO: renamed from: a0 */
    public void m13134a0() {
        m13052H1();
        m13049F1();
        m13058L1();
        m13054I1();
        m13056J1();
        m13046E1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m13135a2(List list) {
        if (vwb.m(list, new w9j() { // from class: l.ibl
            public final Object call(Object obj) {
                return Boolean.valueOf("newUserComGuideNewUI".equals(((ComStatusAward) obj).businessName));
            }
        })) {
            return;
        }
        if (!CoreModule.c.e0.na().isNewUserIn24H()) {
            CoreModule.c.G0.t3();
        } else {
            ((idl) ((jq2) this).viewModel).m16438Y();
            ezc0.i0().q0(true);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m13136b2(roj0 roj0Var) {
        ((idl) ((jq2) this).viewModel).m16442a0();
        ezc0.i0().j0();
        ezc0.i0().r0(true);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m13137c2(j760 j760Var) {
        if (xma.L3() || mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
            ezc0.i0().r0(false);
            ezc0.i0().q0(false);
            ((idl) ((jq2) this).viewModel).m16442a0();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m13138d2() {
        ((idl) ((jq2) this).viewModel).m16456i0().startActivityForResult(MediaPickerAct.g2(m13145k1(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender), 115);
    }

    public void destroy() {
        if (this.f11765z != null) {
            m13047E2();
        }
        cxf.f().d();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m13139e2(Bundle bundle) {
        this.f11748i.onNext(roj0.a);
        if (NullChecker.a(this.f11749j.e()) && !vwb.J(((PartialListOpt) this.f11749j.e()).loaded)) {
            ((idl) ((jq2) this).viewModel).m16411G0(false, true);
        } else if (!NullChecker.a(this.f11749j.e()) || ((PartialListOpt) this.f11749j.e()).hasMore()) {
            ((idl) ((jq2) this).viewModel).m16411G0(true, true);
        } else {
            ((idl) ((jq2) this).viewModel).m16411G0(true, false);
        }
        this.f11753n = true;
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m13140f2() {
        this.f11733B = false;
        ((idl) ((jq2) this).viewModel).m16475r0().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m13141g2(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i && this.f11733B) {
            e51.H(m13145k1(), new Runnable() { // from class: l.cbl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10496a.m13140f2();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m13142h2(com.p1.mobile.android.app.c cVar) {
        if (((idl) ((jq2) this).viewModel).m16456i0().isHidden()) {
            return;
        }
        if (cVar == com.p1.mobile.android.app.c.i) {
            if (this.f11762w) {
                this.f11762w = false;
            }
            HomeStatisticsHelper.m639D(true);
        } else if (cVar == com.p1.mobile.android.app.c.j) {
            HomeStatisticsHelper.m639D(false);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m13143i2(com.p1.mobile.android.app.c cVar) {
        ((idl) ((jq2) this).viewModel).m16481u1();
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ c m13144j2(User user) {
        return this.f11752m;
    }

    /* JADX INFO: renamed from: k1 */
    public NewMainAct m13145k1() {
        return ((idl) ((jq2) this).viewModel).act();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m13146k2(roj0 roj0Var) {
        ark.T0(m13145k1());
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m13147l1() {
        return (TEnum.equals(CoreModule.c.e0.p9().source, "wechat") || TEnum.equals(CoreModule.c.e0.p9().source, "qq")) && vy8.o() && !((Boolean) CoreModule.c.e0.b0.get()).booleanValue();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m13148l2(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = str;
        qib0.G.B0(((idl) ((jq2) this).viewModel).m16464m0(), picture.profile480());
        qib0.G.B0(((idl) ((jq2) this).viewModel).m16454h0(), picture.profile480());
    }

    /* JADX INFO: renamed from: m1 */
    public void m13149m1() {
        if (CoreModule.c.e0.p9() != null) {
            if (ic50.m16316j().m16322f().m17412g0() || ((idl) ((jq2) this).viewModel).act().m3888e6(TabName.Card)) {
                return;
            }
            this.f11747h = true;
            return;
        }
        this.f11737F = 1;
        if (NullChecker.a(this.f11738G) && !this.f11738G.isUnsubscribed()) {
            this.f11738G.unsubscribe();
        }
        CrashHelper.c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.H().userId() + ", login: " + CoreModule.H().signedIn_() + ", me == null"));
        this.f11738G = duringCreated(mkd0.r(CoreModule.c.f0.on(), CoreModule.c.e0.o9(), new yn30())).filter(new w9j() { // from class: l.lbl
            public final Object call(Object obj) {
                return this.f16044a.m13123Q1((j760) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.mbl
            public final void call(Object obj) {
                this.f16796a.m13125R1((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m13150m2(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0())) {
            C0158d c0158dM13096p1 = m13096p1(((idl) ((jq2) this).viewModel).m16456i0().pageId(), relationship.id, ((idl) ((jq2) this).viewModel).m16475r0(), user);
            c0158dM13096p1.m2465v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m13114I2(c0158dM13096p1, "success");
        }
        this.f11745f = true;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m13151n2(User user, Throwable th) {
        if (NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0())) {
            m13113H2(m13096p1(((idl) ((jq2) this).viewModel).m16456i0().pageId(), "", ((idl) ((jq2) this).viewModel).m16475r0(), user), th);
        }
        this.f11745f = true;
        lsi0.H(m13145k1().getResources().getString(R.string.oq), m13145k1().getResources().getDrawable(x2c0.vu), m13145k1().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: o1 */
    public void m13152o1() {
        this.f11761v = null;
        this.f11760u = null;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m13153p2(String str, int i, Intent intent, com.p1.mobile.android.app.c cVar) {
        if (NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0())) {
            CoreSuggested.UserInfo userInfoMo2809j = ((idl) ((jq2) this).viewModel).m16475r0().mo2809j();
            if (NullChecker.a(userInfoMo2809j) && TextUtils.equals(str, userInfoMo2809j.id)) {
                SwipeDirection swipeDirection = SwipeDirection.UP;
                if (i != swipeDirection.getValue()) {
                    ((idl) ((jq2) this).viewModel).m16475r0().mo2797A(SwipeDirection.fromValue(i));
                } else if (((idl) ((jq2) this).viewModel).m16475r0().mo2804c(false)) {
                    if (i == swipeDirection.getValue() && u59.f0() && NullChecker.a(intent)) {
                        m13106B1(intent);
                    }
                    m13122P2(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m13154q1() {
        this.f11744e = true;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m13155q2(ArrayList arrayList, String str, roj0 roj0Var) {
        ((idl) ((jq2) this).viewModel).m16456i0().s4();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        ark.V0(m13145k1(), false, (Media) arrayList.get(0), m13145k1().string(R.string.el), new Runnable() { // from class: l.wbl
            @Override // java.lang.Runnable
            public final void run() {
                dcl.m13053I0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.v();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m13156r2(Throwable th) {
        ((idl) ((jq2) this).viewModel).m16456i0().s4();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: s1 */
    public void m13157s1() {
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.autoAdjustRadius = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m13158s2(a aVar, Throwable th) {
        CoreModule.c.n0.Q3();
        if ((aVar.e() == null || ((PartialListOpt) aVar.e()).loaded.size() == 0) && ((idl) ((jq2) this).viewModel).m16418K0()) {
            this.f11736E = true;
            ((idl) ((jq2) this).viewModel).m16477s1(true, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public int m13159t1() {
        return this.f11741b;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m13160t2(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            ygh0.l0(ygh0.h);
        } else {
            ygh0.m0(ygh0.h, wvv.n(m13145k1()) ? "off" : "on");
        }
        m13164v2();
    }

    /* JADX INFO: renamed from: u1 */
    public String m13161u1() {
        return this.f11740a;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m13162u2(DialogInterface dialogInterface) {
        m13164v2();
    }

    /* JADX INFO: renamed from: v1 */
    public String m13163v1() {
        return this.f11734C;
    }

    /* JADX INFO: renamed from: w2 */
    public void m13165w2() {
        this.f11736E = false;
    }

    /* JADX INFO: renamed from: x1 */
    public void m13166x1() {
        psl pslVarI0 = m13145k1().fragmentManager().i0(TabName.Card.toString());
        if (pslVarI0 instanceof psl) {
            psl pslVar = pslVarI0;
            NewTanFragTag newTanFragTag = NewTanFragTag.HOME;
            pslVar.mo2528I2(newTanFragTag);
            pslVar.mo2550n2(newTanFragTag);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m13167x2(int i, final int i2, final Intent intent) {
        if (i != 114 || !NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0())) {
            if (i == 115 && i2 == -1) {
                m13042A2((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        SwipeDirection swipeDirection = SwipeDirection.RIGHT;
        if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
            m13145k1().f3217p = true;
        }
        jj4 jj4VarMo2814o = ((idl) ((jq2) this).viewModel).m16475r0().mo2814o();
        if (NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17130d())) {
            final String str = ((DbObject) jj4VarMo2814o.m17130d()).id;
            if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                this.f11746g = true;
                lifecycle().takeFirst(new w9j() { // from class: l.cal
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.nal
                    public final void call(Object obj) {
                        this.f17376a.m13153p2(str, i2, intent, (com.p1.mobile.android.app.c) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public VSwipeStack.OnCardSwipeResult m13168y2(mol molVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f11735D == null) {
            this.f11735D = new k7h0();
        }
        if (this.f11743d) {
            CoreBusinessModule.g.m17548b().f16792b = molVar.mo844e0() ? ((DbObject) molVar.getCardDataProxy().m17130d()).id : "";
        } else {
            CrashHelper.c(new IllegalStateException("moment onCardSwipe be called before card rendered"));
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z2 = true;
        boolean z3 = swipeDirection == swipeDirection2 || swipeDirection == SwipeDirection.UP;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z4 = swipeDirection == swipeDirection3;
        if (!z) {
            ((idl) ((jq2) this).viewModel).m16436X(z3, z4).mo2336i();
        }
        if (z3) {
            s7m s7mVar = ((jq2) this).viewModel;
            if (z4) {
                ((idl) s7mVar).m16458j0().reset();
            } else {
                ((idl) s7mVar).m16476s0().reset();
            }
            ((idl) ((jq2) this).viewModel).m16452g0().reset();
        } else {
            ((idl) ((jq2) this).viewModel).m16458j0().reset();
            ((idl) ((jq2) this).viewModel).m16476s0().reset();
        }
        molVar.mo861j0(swipeDirection);
        HomeStatisticsHelper.m640E("card");
        HomeStatisticsHelper.m641F("swipe");
        f3a f3aVar = CoreModule.c.Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        f3aVar.e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = this.f11735D.mo1468a(new k7h0.C0984a(this, (idl) ((jq2) this).viewModel, molVar.getCardDataProxy(), swipeDirection, z));
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo1468a == onCardSwipeResult) {
            CoreModule.c.Y0.f();
        }
        if (onCardSwipeResultMo1468a == VSwipeStack.OnCardSwipeResult.back || onCardSwipeResultMo1468a == onCardSwipeResult) {
            m13152o1();
        }
        this.f11746g = false;
        if (!IntlCountryCodeController.v()) {
            return onCardSwipeResultMo1468a;
        }
        ((idl) ((jq2) this).viewModel).m16490z1(onCardSwipeResultMo1468a, swipeDirection);
        return onCardSwipeResultMo1468a != onCardSwipeResult ? VSwipeStack.OnCardSwipeResult.stay : onCardSwipeResultMo1468a;
    }

    /* JADX INFO: renamed from: z1 */
    public void m13169z1() {
        if (!xij0.d0() || m13145k1().lifecycle_() != com.p1.mobile.android.app.c.i || ((idl) ((jq2) this).viewModel).m16415I0() || ((idl) ((jq2) this).viewModel).m16456i0().isHidden()) {
            return;
        }
        Object objMo2805d = ((idl) ((jq2) this).viewModel).m16475r0() == null ? null : ((idl) ((jq2) this).viewModel).m16475r0().mo2805d();
        if (NullChecker.a(objMo2805d) && (objMo2805d instanceof d5m)) {
            d5m d5mVar = (d5m) objMo2805d;
            if (d5mVar.mo914y()) {
                d5mVar.mo786L();
            }
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m13170z2(boolean z) {
        this.f11763x = z;
        this.f11764y.onNext(Boolean.valueOf(z));
        if (!z) {
            if (this.f11747h) {
                this.f11747h = false;
                m13149m1();
            }
            if (this.f11744e) {
                this.f11744e = false;
                if (NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0()) && NullChecker.a(((idl) ((jq2) this).viewModel).m16475r0().mo2809j())) {
                    HomeStatisticsHelper.m652i(((idl) ((jq2) this).viewModel).m16475r0().mo2809j(), ((idl) ((jq2) this).viewModel).m16456i0().pageId());
                    jj4 jj4VarMo2814o = ((idl) ((jq2) this).viewModel).m16475r0().mo2814o();
                    String strPageId = ((idl) ((jq2) this).viewModel).m16456i0().pageId();
                    String str = this.f11740a;
                    HomeStatisticsHelper.m661r(jj4VarMo2814o, strPageId, str, m13119N1(str));
                }
            }
        }
        if (CoreModule.c.J0.F3() && ((lifecycle_() == com.p1.mobile.android.app.c.i || lifecycle_() == com.p1.mobile.android.app.c.h) && !z)) {
            m13118M2();
        }
        ((idl) ((jq2) this).viewModel).m16463l1(z);
        if (this.f11763x) {
            return;
        }
        if (do80.f && this.f11753n) {
            ((idl) ((jq2) this).viewModel).m16477s1(true, true);
            duringCreated(CoreModule.c.n0.S3(e900.b().f() ? e900.b().c() : upa.I0().tabId)).take(1).subscribe(mkd0.H(new e30() { // from class: l.nbl
                public final void call(Object obj) {
                    dcl.m13082h0((roj0) obj);
                }
            }, new e30() { // from class: l.obl
                public final void call(Object obj) {
                    dcl.m13059N0((Throwable) obj);
                }
            }));
        }
        do80.f = false;
    }
}
