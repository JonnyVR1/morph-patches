package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.lifecycle.InterfaceC0476e;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4882b0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.ComStatusAward;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.main.LocationPermissionView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class tel extends ar2<yfl> {

    /* JADX INFO: renamed from: I */
    public static String f173843I = "suggest_user_profile_info";

    /* JADX INFO: renamed from: J */
    public static String f173844J = "home";

    /* JADX INFO: renamed from: K */
    public static String f173845K = "click";

    /* JADX INFO: renamed from: L */
    public static String f173846L = "swipe";

    /* JADX INFO: renamed from: A */
    public Runnable f173847A;

    /* JADX INFO: renamed from: B */
    public boolean f173848B;

    /* JADX INFO: renamed from: C */
    public String f173849C;

    /* JADX INFO: renamed from: D */
    public g6m<sfh0.C20031a, VSwipeStack.OnCardSwipeResult> f173850D;

    /* JADX INFO: renamed from: E */
    public boolean f173851E;

    /* JADX INFO: renamed from: F */
    public int f173852F;

    /* JADX INFO: renamed from: G */
    public kcg0 f173853G;

    /* JADX INFO: renamed from: H */
    public long f173854H;

    /* JADX INFO: renamed from: a */
    public String f173855a;

    /* JADX INFO: renamed from: b */
    public int f173856b;

    /* JADX INFO: renamed from: c */
    public String f173857c;

    /* JADX INFO: renamed from: d */
    public boolean f173858d;

    /* JADX INFO: renamed from: e */
    public boolean f173859e;

    /* JADX INFO: renamed from: f */
    public boolean f173860f;

    /* JADX INFO: renamed from: g */
    public boolean f173861g;

    /* JADX INFO: renamed from: h */
    public boolean f173862h;

    /* JADX INFO: renamed from: i */
    public C22507a<uxj0> f173863i;

    /* JADX INFO: renamed from: j */
    public C22507a<PartialListOpt<CoreSuggested.UserInfo>> f173864j;

    /* JADX INFO: renamed from: k */
    public C22507a<uxj0> f173865k;

    /* JADX INFO: renamed from: l */
    public C22507a<Boolean> f173866l;

    /* JADX INFO: renamed from: m */
    public C22508b<uxj0> f173867m;

    /* JADX INFO: renamed from: n */
    public boolean f173868n;

    /* JADX INFO: renamed from: o */
    public C22507a<Boolean> f173869o;

    /* JADX INFO: renamed from: p */
    public boolean f173870p;

    /* JADX INFO: renamed from: q */
    public boolean f173871q;

    /* JADX INFO: renamed from: r */
    public boolean f173872r;

    /* JADX INFO: renamed from: s */
    public long f173873s;

    /* JADX INFO: renamed from: t */
    public boolean f173874t;

    /* JADX INFO: renamed from: u */
    public String f173875u;

    /* JADX INFO: renamed from: v */
    public String f173876v;

    /* JADX INFO: renamed from: w */
    public boolean f173877w;

    /* JADX INFO: renamed from: x */
    public boolean f173878x;

    /* JADX INFO: renamed from: y */
    public C22507a<Boolean> f173879y;

    /* JADX INFO: renamed from: z */
    public kcg0 f173880z;

    /* JADX INFO: renamed from: l.tel$a */
    public class C20298a implements qcj<uxj0, C22421c<bkj0>> {
        public C20298a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ bkj0 m190842a(User user, PartialListOpt partialListOpt, TabName tabName, Notification notification) {
            return new bkj0(user, partialListOpt, tabName);
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C22421c<bkj0> call(uxj0 uxj0Var) {
            return psd0.m173627t(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20408n0.m32459a4(eui0.m122571a()), tel.this.m190816k1().m40829o7(), uj4.m196317b(CacheCardType.DEFAULT_CARD).mo136051d(4).timeout(3000L, TimeUnit.MILLISECONDS).materialize().observeOn(fo0.m126432a()).first(), new tcj() { // from class: l.sel
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return tel.C20298a.m190842a((User) obj, (PartialListOpt) obj2, (TabName) obj3, (Notification) obj4);
                }
            });
        }
    }

    public tel(ner nerVar) {
        super(nerVar);
        this.f173855a = "";
        this.f173856b = 0;
        this.f173857c = "";
        this.f173858d = false;
        this.f173859e = false;
        this.f173860f = true;
        this.f173861g = false;
        this.f173863i = C22507a.m222758b();
        this.f173864j = CoreModule.f18264c.f20408n0.f20285V;
        this.f173865k = C22507a.m222758b();
        Boolean bool = Boolean.FALSE;
        this.f173866l = C22507a.m222759c(bool);
        this.f173867m = C22508b.m222767b();
        this.f173868n = false;
        this.f173869o = C22507a.m222759c(bool);
        this.f173870p = false;
        this.f173871q = true;
        this.f173872r = true;
        this.f173873s = 0L;
        this.f173874t = false;
        this.f173877w = true;
        this.f173879y = C22507a.m222759c(bool);
        this.f173847A = new Runnable() { // from class: l.vcl
            @Override // java.lang.Runnable
            public final void run() {
                this.f183470a.m190766o2();
            }
        };
        this.f173849C = "";
        this.f173851E = false;
        this.f173852F = 0;
        this.f173853G = null;
        this.f173854H = ami0.INSTANCE.m98830d();
    }

    /* JADX INFO: renamed from: A2 */
    private void m190714A2(final ArrayList<Media> arrayList, final String str) {
        ((yfl) this.viewModel).m215717i0().m21594o4(R$string.f18632L5);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.iel
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tel.m190762m0((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.jel
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120510a.m190826q2(arrayList, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.lel
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131766a.m190827r2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ uxj0 m190717E0(C4470c c4470c, uxj0 uxj0Var, List list) {
        if (c4470c == C4470c.f16267i) {
            return uxj0.f181467a;
        }
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    private void m190718E1() {
        duringCreated(CoreModule.f18264c.f20420r0.f20770i0).subscribe(psd0.m173596G(new y20() { // from class: l.odl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146922a.m190800U1((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E2 */
    private void m190719E2() {
        psd0.m173633z(this.f173880z);
        this.f173880z = null;
    }

    /* JADX INFO: renamed from: F1 */
    private void m190721F1() {
        duringCreated(CoreModule.f18264c.f20335O2.obs()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.wcl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.adl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70700a.m190801V1((String) obj);
            }
        }));
        duringCreated(psd0.m173625r(lifecycle(), this.f173866l, new st30()).filter(new qcj() { // from class: l.bdl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(pf60Var.f152156a == C4470c.f16267i && ((Boolean) pf60Var.f152157b).booleanValue());
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.cdl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81242a.m190802W1((pf60) obj);
            }
        }));
        duringCreated(this.f173863i.switchMap(new C20298a()).filter(new qcj() { // from class: l.edl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((bkj0) obj).f77083c == TabName.Card);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.fdl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98484a.m190804Y1((bkj0) obj);
            }
        }));
        duringCreated(psd0.m173626s(lifecycle(), this.f173865k, CoreModule.f18264c.f20396j0.m31583E4().take(1), new scj() { // from class: l.gdl
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return tel.m190717E0((C4470c) obj, (uxj0) obj2, (List) obj3);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.hdl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109009a.m190805Z1((uxj0) obj);
            }
        }));
        if (h7d0.m133774m0()) {
            duringCreated(CoreModule.f18264c.f20309G0.m183911n3()).distinctUntilChanged().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.idl
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114509a.m190806a2((List) obj);
                }
            }));
            if (CoreModule.f18264c.f20381e0.m116593na().isNewUserIn24H()) {
                duringCreated(CoreModule.f18264c.f20309G0.m183912o3()).distinctUntilChanged().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.xcl
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f193316a.m190807b2((uxj0) obj);
                    }
                }));
                duringCreated(new pcj() { // from class: l.ycl
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")), new rcj() { // from class: l.hel
                            @Override // p153l.rcj
                            public final Object call(Object obj, Object obj2) {
                                return pf60.m172085a((User) obj, (UserPrivilege) obj2);
                            }
                        });
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.zcl
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f203802a.m190808c2((pf60) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    private void m190724H1() {
        creates(new y20() { // from class: l.jdl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120276a.m190810e2((Bundle) obj);
            }
        }, new x20() { // from class: l.kdl
            @Override // p153l.x20
            public final void call() {
                tel.m190773t0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m190725I0() {
    }

    /* JADX INFO: renamed from: I1 */
    private void m190726I1() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.zdl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203889a.m190812g2((C4470c) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.kel
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126199a.m190813h2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J1 */
    private void m190728J1() {
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.qdl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.rdl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162319a.m190814i2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L1 */
    private void m190730L1() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).switchMap(new qcj() { // from class: l.nel
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141665a.m190815j2((User) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.oel
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147001a.m190817k2((uxj0) obj);
            }
        }));
        qyf.m178643f().m178645e(duringCreated(CoreModule.f18264c.f20381e0.m116596o9()), m190816k1(), ((yfl) this.viewModel).m215717i0(), 115);
        duringCreated(CoreModule.f18264c.f20381e0.m116629wa()).subscribe(psd0.m173596G(new y20() { // from class: l.pel
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116625va(-1);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.qel
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new qcj() { // from class: l.rel
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().url;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.tcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173239a.m190819l2((String) obj);
            }
        }, new y20() { // from class: l.ucl
            @Override // p153l.y20
            public final void call(Object obj) {
                tel.m190745b1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m190731N0(Throwable th) {
    }

    /* JADX INFO: renamed from: N2 */
    private void m190732N2() {
        xxv.m213585l(m190816k1(), new PermissionHelper.InterfaceC13292b() { // from class: l.ldl
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f131656a.m190831t2(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.mdl
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f136388a.m190833u2(dialogInterface);
            }
        }, new Runnable() { // from class: l.ndl
            @Override // java.lang.Runnable
            public final void run() {
                this.f141506a.m190835v2();
            }
        }, new x20() { // from class: l.pdl
            @Override // p153l.x20
            public final void call() {
                fph0.m126683n0(fph0.f100175h);
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    private boolean m190737R2() {
        return NullChecker.m82486a(CoreModule.f18264c.f20408n0.f20281R);
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m190745b1(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m190754h0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22421c m190762m0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: n1 */
    private void m190764n1() {
        NewMainAct newMainActM190816k1 = m190816k1();
        if (!NullChecker.m82486a(newMainActM190816k1) || newMainActM190816k1.isDialogShowing()) {
            this.f173863i.m137019l(uxj0.f181467a);
            return;
        }
        if (d09.m113367d()) {
            CoreModule.f18264c.f20381e0.f89198c0.put(Boolean.TRUE);
            qtk.m177989O0(m190816k1(), "", new x20() { // from class: l.fel
                @Override // p153l.x20
                public final void call() {
                    this.f98690a.m190798S1();
                }
            }, false);
        } else if (!m190818l1()) {
            this.f173863i.m137019l(uxj0.f181467a);
        } else {
            CoreModule.f18264c.f20381e0.f89198c0.put(Boolean.TRUE);
            qtk.m177989O0(newMainActM190816k1, "", new x20() { // from class: l.gel
                @Override // p153l.x20
                public final void call() {
                    this.f103841a.m190799T1();
                }
            }, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m190766o2() {
        this.f173860f = false;
        HashMap map = new HashMap();
        map.put("sourcepage", f173844J);
        map.put("actiontype", f173845K);
        C4882b0 c4882b0 = CoreModule.f18264c.f20408n0;
        final User user = c4882b0.f20281R;
        if (NullChecker.m82486a(c4882b0.f20282S)) {
            CoreModule.f18264c.f20408n0.f20282S.m225062clone();
        }
        C22421c<Relationship> c22421cM32460b4 = CoreModule.f18264c.f20408n0.m32460b4(map);
        if (NullChecker.m82486a(c22421cM32460b4)) {
            c22421cM32460b4.subscribe(psd0.m173597H(new y20() { // from class: l.tdl
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173370a.m190821m2(user, (Relationship) obj);
                }
            }, new y20() { // from class: l.udl
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178550a.m190822n2(user, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m82486a(((yfl) this.viewModel).m215735r0())) {
            m190786I2(m190768p1(((yfl) this.viewModel).m215717i0().pageId(), "", ((yfl) this.viewModel).m215735r0(), user), "");
        }
        this.f173860f = true;
        o1j0.m165626H(m190816k1().getResources().getString(R$string.f18591Jq), m190816k1().getResources().getDrawable(dbc0.f87134jv), m190816k1().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: p1 */
    private C8145d m190768p1(String str, String str2, f1g0 f1g0Var, User user) {
        String str3;
        int size;
        int iM32464y3 = CoreModule.f18264c.f20408n0.m32464y3() - 1;
        if (!NullChecker.m82486a(user) || iM32464y3 < 0 || user.pictures.size() <= iM32464y3) {
            str3 = "";
            size = 0;
        } else {
            str3 = user.pictures.get(iM32464y3).url;
            size = user.pictures.size();
        }
        C8145d c8145dM37705h = HomeStatisticsHelper.m37705h(str, str2, f1g0Var);
        c8145dM37705h.m39464B(str3);
        c8145dM37705h.m39494z(iM32464y3);
        c8145dM37705h.m39463A(size);
        return c8145dM37705h;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m190770r0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void m190835v2() {
        ((yfl) this.viewModel).m215728o0().m48544e(LocationPermissionView.LocationPermissionState.requested);
        if (this.f173871q) {
            this.f173871q = false;
            this.f173863i.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m190773t0() {
    }

    /* JADX INFO: renamed from: B1 */
    public final void m190778B1(Intent intent) {
        String stringExtra = intent.getStringExtra("heart_confession_uid");
        String stringExtra2 = intent.getStringExtra("heart_confession_content");
        CoreSuggested.UserInfo userInfoMo39816j = ((yfl) this.viewModel).m215735r0().mo39816j();
        String str = NullChecker.m82486a(userInfoMo39816j) ? userInfoMo39816j.f20214id : "";
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return;
        }
        this.f173875u = stringExtra;
        this.f173876v = stringExtra2;
    }

    /* JADX INFO: renamed from: B2 */
    public void m190779B2() {
        if (SystemClock.uptimeMillis() - this.f173873s >= 2000) {
            this.f173873s = SystemClock.uptimeMillis();
            m190784F2(true);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public void m190780C1() {
        if (m190816k1().lifecycle_() != C4470c.f16267i || ((yfl) this.viewModel).m215676I0() || ((yfl) this.viewModel).m215717i0().isHidden() || !((yfl) this.viewModel).m215666B1()) {
            return;
        }
        if (C8772a.f33518f) {
            C8772a.f33518f = false;
            ((yfl) this.viewModel).m215667C1();
        }
        if (f4s.m124037d()) {
            f4s.m124038e(false);
            ((yfl) this.viewModel).m215667C1();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m190781C2(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
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
            fph0.m126679l0(fph0.f100175h);
        } else {
            fph0.m126681m0(fph0.f100175h, xxv.m213587n(m190816k1()) ? BLiveOperationTitleShowType.off : "on");
        }
        if (i == 1792) {
            if (!z) {
                m190732N2();
                return;
            }
            ((yfl) this.viewModel).m215728o0().m48544e(LocationPermissionView.LocationPermissionState.requested);
            if (this.f173871q) {
                this.f173871q = false;
                if (this.f173870p) {
                    return;
                }
                this.f173863i.m137019l(uxj0.f181467a);
            }
        }
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m190782D1() {
        return this.f173872r;
    }

    /* JADX INFO: renamed from: D2 */
    public void m190783D2() {
        this.f173872r = false;
        ((yfl) this.viewModel).m215733q1();
    }

    /* JADX INFO: renamed from: F2 */
    public void m190784F2(boolean z) {
        final C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f173864j;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = c22507a.m222761e();
        if (z || partialListOptM222761e == null || partialListOptM222761e.hasMore()) {
            duringCreated(CoreModule.f18264c.f20408n0.m32445K3(nh00.m163018b().m163022f() ? nh00.m163018b().m163019c() : gra.m131578I0().tabId)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.vdl
                @Override // p153l.y20
                public final void call(Object obj) {
                    tel.m190770r0((uxj0) obj);
                }
            }, new y20() { // from class: l.wdl
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188619a.m190829s2(c22507a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m190785H2(C8145d c8145d, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
        this.f173861g = false;
        sdp.m185485b();
    }

    /* JADX INFO: renamed from: I2 */
    public void m190786I2(C8145d c8145d, String str) {
        HomeStatisticsHelper.m37691B(c8145d, str);
        this.f173861g = false;
        sdp.m185485b();
    }

    /* JADX INFO: renamed from: J2 */
    public void m190787J2(int i) {
        this.f173856b = i;
    }

    /* JADX INFO: renamed from: K2 */
    public void m190788K2(String str) {
        this.f173855a = str;
    }

    /* JADX INFO: renamed from: L2 */
    public void m190789L2(String str) {
        this.f173849C = str;
    }

    /* JADX INFO: renamed from: M2 */
    public void m190790M2() {
        bnl0.m105524M(((yfl) this.viewModel).m215705b0(), true);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m190791N1(String str) {
        return TextUtils.equals(this.f173857c, str);
    }

    /* JADX INFO: renamed from: O1 */
    public boolean m190792O1(String str) {
        return (TextUtils.isEmpty(this.f173875u) || !this.f173875u.equals(str) || TextUtils.isEmpty(this.f173876v)) ? false : true;
    }

    /* JADX INFO: renamed from: P1 */
    public boolean m190793P1() {
        return this.f173851E;
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m190794P2(boolean z) {
        return m190796Q2(z, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ Boolean m190795Q1(pf60 pf60Var) {
        return Boolean.valueOf(this.f173852F == 1);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX INFO: renamed from: Q2 */
    public boolean m190796Q2(boolean z, boolean z2) {
        User user;
        C8145d c8145dM37705h;
        UssTags ussTags;
        boolean z3;
        int iM32464y3;
        String str = "";
        if (z) {
            user = null;
            c8145dM37705h = HomeStatisticsHelper.m37701d(((yfl) this.viewModel).m215735r0() == null ? null : ((yfl) this.viewModel).m215735r0().mo39821o(), true, this.f173861g, SwipeDirection.UP, ((yfl) this.viewModel).m215735r0());
        } else {
            user = CoreModule.f18264c.f20408n0.f20281R;
            c8145dM37705h = HomeStatisticsHelper.m37705h(((yfl) this.viewModel).m215717i0().pageId(), user == null ? "" : user.f56859id, ((yfl) this.viewModel).m215735r0());
            c8145dM37705h.m39490v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
        }
        int size = 0;
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            m190786I2(c8145dM37705h, "failJailedUser");
            return false;
        }
        KeyEvent.Callback callbackMo39812d = ((yfl) this.viewModel).m215735r0().mo39812d();
        if (!NullChecker.m82486a(callbackMo39812d) || (((callbackMo39812d instanceof t7m) && ((t7m) callbackMo39812d).mo37905k0()) || !this.f173860f)) {
            return false;
        }
        if (z) {
            ((yfl) this.viewModel).m215735r0().mo39804A(SwipeDirection.UP);
            return false;
        }
        if (m190737R2()) {
            CoreSuggested.UserInfo userInfo = CoreModule.f18264c.f20408n0.f20282S;
            if (d79.m114685j0() && NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.letter)) {
                o1j0.m165649w(R$string.f19080a3);
            } else {
                Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
                CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
                CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.undoLimit;
                if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - uqb0.f180376H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
                    if (this.f173860f && CoreModule.f18264c.f20408n0.f20282S.canUndo) {
                        this.f173847A.run();
                        if (spl0.m187374Z()) {
                            bpe0.m105814f().m105820i(userInfo.f20214id);
                            i4g0.m138495D("e_undo_superlike", ((yfl) this.viewModel).m215717i0().pageId(), jyb.m147494Y("other_user_id", userInfo.f20214id), jyb.m147494Y("superlike_quantity", Integer.valueOf(bpe0.m105814f().m105817d(userInfo.f20214id))));
                        }
                        z3 = true;
                    }
                    if (!z3) {
                        iM32464y3 = CoreModule.f18264c.f20408n0.m32464y3() - 1;
                        if (NullChecker.m82486a(user) && iM32464y3 >= 0 && user.pictures.size() > iM32464y3) {
                            str = user.pictures.get(iM32464y3).url;
                            size = user.pictures.size();
                        }
                        c8145dM37705h.m39464B(str);
                        c8145dM37705h.m39494z(iM32464y3);
                        c8145dM37705h.m39463A(size);
                        m190786I2(c8145dM37705h, "failUndoLocal");
                    }
                    return z3;
                }
                C8927c.m54595M1(m190816k1(), "p_home,undo", Privilege.vip_undo, null, null, false, CoreModule.f18264c.f20408n0.f20281R);
            }
        } else {
            axj0.m100773a(m190816k1());
        }
        z3 = false;
        if (!z3) {
            iM32464y3 = CoreModule.f18264c.f20408n0.m32464y3() - 1;
            if (NullChecker.m82486a(user)) {
                str = user.pictures.get(iM32464y3).url;
                size = user.pictures.size();
            }
            c8145dM37705h.m39464B(str);
            c8145dM37705h.m39494z(iM32464y3);
            c8145dM37705h.m39463A(size);
            m190786I2(c8145dM37705h, "failUndoLocal");
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m190797R1(pf60 pf60Var) {
        StringBuilder sb = new StringBuilder("checkIntro error, local has user me is " + NullChecker.m82486a(pf60Var.f152157b));
        sb.append(", ");
        if (!NullChecker.m82486a(pf60Var.f152156a) || jyb.m147479J(((vg60) pf60Var.f152156a).f184001a)) {
            sb.append("local has no conversations");
        } else {
            for (int i = 0; i < ((vg60) pf60Var.f152156a).f184001a.size() && i < 5; i++) {
                String str = ((Conversation) ((vg60) pf60Var.f152156a).f184001a.get(i)).f56859id;
                sb.append("cid-");
                sb.append(str);
                sb.append(" : ");
                if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(str))) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
        }
        CrashHelper.m82479c(new Exception(sb.toString()));
        this.f173852F = 0;
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m190798S1() {
        this.f173863i.m137019l(uxj0.f181467a);
        if (iz40.m142788y(m190816k1(), true)) {
            return;
        }
        this.f173869o.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m190799T1() {
        this.f173863i.m137019l(uxj0.f181467a);
        if (iz40.m142788y(m190816k1(), true)) {
            return;
        }
        this.f173869o.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m190800U1(String str) {
        if (NullChecker.m82486a(((yfl) this.viewModel).m215735r0()) && NullChecker.m82486a(((yfl) this.viewModel).m215735r0().mo39816j()) && TextUtils.equals(str, ((yfl) this.viewModel).m215735r0().mo39816j().f20214id)) {
            this.f173848B = true;
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m190801V1(String str) {
        qtk.m177993Q0(m190816k1(), str, new x20() { // from class: l.xdl
            @Override // p153l.x20
            public final void call() {
                this.f193609a.m190809d2();
            }
        });
        CoreModule.f18264c.f20335O2.put("");
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m190802W1(pf60 pf60Var) {
        this.f173866l.m137019l(Boolean.FALSE);
        m190764n1();
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m190803X1() {
        m190840z1();
        m190780C1();
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
    public final /* synthetic */ void m190804Y1(bkj0 bkj0Var) {
        boolean z;
        PartialListOpt partialListOpt = (PartialListOpt) bkj0Var.f77082b;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM200190y = ((yfl) this.viewModel).f199579W.m200190y(partialListOpt.loaded);
        if (TextUtils.isEmpty(this.f173857c) && !jyb.m147479J(listM200190y) && (!uih0.m196214m0() || !uih0.m196232y0(listM200190y.get(0).f20214id))) {
            this.f173857c = listM200190y.get(0).f20214id;
        }
        if (size != listM200190y.size()) {
            t4j.m189282h("moment render List refresh change " + size + Constants.SEPARATOR_COMMA + listM200190y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        if (z) {
            ((yfl) this.viewModel).f199579W.m200187G(listM200190y);
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        this.f173858d = true;
        m190816k1().postDelayed(new Runnable() { // from class: l.ael
            @Override // java.lang.Runnable
            public final void run() {
                this.f70810a.m190803X1();
            }
        }, 100L);
        StringBuilder sb = new StringBuilder("moment render cards: ");
        sb.append(z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(zNeedRefresh);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(!partialListOpt.hasMore() && listM200190y.size() == 0);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(listM200190y.isEmpty());
        t4j.m189282h(sb.toString());
        if (partialListOpt.hasMore() || listM200190y.size() != 0) {
            boolean zIsEmpty = listM200190y.isEmpty();
            V v2 = this.viewModel;
            if (zIsEmpty) {
                ((yfl) v2).m215739t1(true, true, true);
            } else {
                ((yfl) v2).m215739t1(false, true, true);
            }
        } else {
            ((yfl) this.viewModel).m215739t1(true, false, true);
        }
        if (((yfl) this.viewModel).m215679K0() || this.f173865k.m222761e() != null) {
            return;
        }
        this.f173865k.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m190805Z1(uxj0 uxj0Var) {
        if (!NullChecker.m82486a(uxj0Var) || this.f173862h) {
            return;
        }
        m190820m1();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        m190724H1();
        m190721F1();
        m190730L1();
        m190726I1();
        m190728J1();
        m190718E1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m190806a2(List list) {
        if (jyb.m147520m(list, new qcj() { // from class: l.ydl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("newUserComGuideNewUI".equals(((ComStatusAward) obj).businessName));
            }
        })) {
            return;
        }
        if (!CoreModule.f18264c.f20381e0.m116593na().isNewUserIn24H()) {
            CoreModule.f18264c.f20309G0.m183914t3();
        } else {
            ((yfl) this.viewModel).m215699Y();
            h7d0.m133773i0().m133785q0(true);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m190807b2(uxj0 uxj0Var) {
        ((yfl) this.viewModel).m215703a0();
        h7d0.m133773i0().m133780j0();
        h7d0.m133773i0().m133786r0(true);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m190808c2(pf60 pf60Var) {
        if (joa.m146361M3() || qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
            h7d0.m133773i0().m133786r0(false);
            h7d0.m133773i0().m133785q0(false);
            ((yfl) this.viewModel).m215703a0();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m190809d2() {
        ((yfl) this.viewModel).m215717i0().startActivityForResult(MediaPickerAct.m48968h2(m190816k1(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender), 115);
    }

    @Override // p153l.k3m
    public void destroy() {
        if (this.f173880z != null) {
            m190719E2();
        }
        qyf.m178643f().m178644d();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m190810e2(Bundle bundle) {
        this.f173863i.m137019l(uxj0.f181467a);
        if (NullChecker.m82486a(this.f173864j.m222761e()) && !jyb.m147479J(this.f173864j.m222761e().loaded)) {
            ((yfl) this.viewModel).m215672G0(false, true);
        } else if (!NullChecker.m82486a(this.f173864j.m222761e()) || this.f173864j.m222761e().hasMore()) {
            ((yfl) this.viewModel).m215672G0(true, true);
        } else {
            ((yfl) this.viewModel).m215672G0(true, false);
        }
        this.f173868n = true;
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m190811f2() {
        this.f173848B = false;
        ((yfl) this.viewModel).m215735r0().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m190812g2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f173848B) {
            l51.m152888H(m190816k1(), new Runnable() { // from class: l.sdl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f167421a.m190811f2();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m190813h2(C4470c c4470c) {
        if (((yfl) this.viewModel).m215717i0().isHidden()) {
            return;
        }
        if (c4470c == C4470c.f16267i) {
            if (this.f173877w) {
                this.f173877w = false;
            }
            HomeStatisticsHelper.m37693D(true);
        } else if (c4470c == C4470c.f16268j) {
            HomeStatisticsHelper.m37693D(false);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m190814i2(C4470c c4470c) {
        ((yfl) this.viewModel).m215741u1();
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ C22421c m190815j2(User user) {
        return this.f173867m;
    }

    /* JADX INFO: renamed from: k1 */
    public NewMainAct m190816k1() {
        return ((yfl) this.viewModel).act();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m190817k2(uxj0 uxj0Var) {
        qtk.m177999T0(m190816k1());
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m190818l1() {
        return (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "wechat") || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "qq")) && d09.m113378o() && !CoreModule.f18264c.f20381e0.f89190b0.get().booleanValue();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m190819l2(String str) {
        Picture picture = new Picture();
        picture.url = str;
        uqb0.f180374G.m127096B0(((yfl) this.viewModel).m215724m0(), picture.profile480());
        uqb0.f180374G.m127096B0(((yfl) this.viewModel).m215715h0(), picture.profile480());
    }

    /* JADX INFO: renamed from: m1 */
    public void m190820m1() {
        if (CoreModule.f18264c.f20381e0.m116600p9() != null) {
            if (pk50.m172568j().m172574f().m181669g0() || ((yfl) this.viewModel).act().m40820i6(TabName.Card)) {
                return;
            }
            this.f173862h = true;
            return;
        }
        this.f173852F = 1;
        if (NullChecker.m82486a(this.f173853G) && !this.f173853G.isUnsubscribed()) {
            this.f173853G.unsubscribe();
        }
        CrashHelper.m82479c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.m30929H().userId() + ", login: " + CoreModule.m30929H().signedIn_() + ", me == null"));
        this.f173853G = duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34076on(), CoreModule.f18264c.f20381e0.m116596o9(), new mw30())).filter(new qcj() { // from class: l.bel
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76387a.m190795Q1((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.cel
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81370a.m190797R1((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m190821m2(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.m82486a(((yfl) this.viewModel).m215735r0())) {
            C8145d c8145dM190768p1 = m190768p1(((yfl) this.viewModel).m215717i0().pageId(), relationship.f39654id, ((yfl) this.viewModel).m215735r0(), user);
            c8145dM190768p1.m39490v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m190786I2(c8145dM190768p1, "success");
        }
        this.f173860f = true;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m190822n2(User user, Throwable th) {
        if (NullChecker.m82486a(((yfl) this.viewModel).m215735r0())) {
            m190785H2(m190768p1(((yfl) this.viewModel).m215717i0().pageId(), "", ((yfl) this.viewModel).m215735r0(), user), th);
        }
        this.f173860f = true;
        o1j0.m165626H(m190816k1().getResources().getString(R$string.f18591Jq), m190816k1().getResources().getDrawable(dbc0.f87134jv), m190816k1().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: o1 */
    public void m190823o1() {
        this.f173876v = null;
        this.f173875u = null;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m190824p2(String str, int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(((yfl) this.viewModel).m215735r0())) {
            CoreSuggested.UserInfo userInfoMo39816j = ((yfl) this.viewModel).m215735r0().mo39816j();
            if (NullChecker.m82486a(userInfoMo39816j) && TextUtils.equals(str, userInfoMo39816j.f20214id)) {
                SwipeDirection swipeDirection = SwipeDirection.UP;
                if (i != swipeDirection.getValue()) {
                    ((yfl) this.viewModel).m215735r0().mo39804A(SwipeDirection.fromValue(i));
                } else if (((yfl) this.viewModel).m215735r0().mo39811c(false)) {
                    if (i == swipeDirection.getValue() && d79.m114685j0() && NullChecker.m82486a(intent)) {
                        m190778B1(intent);
                    }
                    m190794P2(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m190825q1() {
        this.f173859e = true;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m190826q2(ArrayList arrayList, String str, uxj0 uxj0Var) {
        ((yfl) this.viewModel).m215717i0().m21598s4();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        qtk.m178003V0(m190816k1(), false, (Media) arrayList.get(0), m190816k1().string(R$string.f18307Al), new Runnable() { // from class: l.mel
            @Override // java.lang.Runnable
            public final void run() {
                tel.m190725I0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            fph0.m126636G();
        } else if (TextUtils.equals(str, "fakeView")) {
            fph0.m126691v();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m190827r2(Throwable th) {
        ((yfl) this.viewModel).m215717i0().m21598s4();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: s1 */
    public void m190828s1() {
        SettingGroups settingGroups = new SettingGroups();
        UserSearchSettings userSearchSettings = new UserSearchSettings();
        settingGroups.search = userSearchSettings;
        userSearchSettings.autoAdjustRadius = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m190829s2(C22507a c22507a, Throwable th) {
        CoreModule.f18264c.f20408n0.m32451Q3();
        if ((c22507a.m222761e() == null || ((PartialListOpt) c22507a.m222761e()).loaded.size() == 0) && ((yfl) this.viewModel).m215679K0()) {
            this.f173851E = true;
            ((yfl) this.viewModel).m215737s1(true, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public int m190830t1() {
        return this.f173856b;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m190831t2(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            fph0.m126679l0(fph0.f100175h);
        } else {
            fph0.m126681m0(fph0.f100175h, xxv.m213587n(m190816k1()) ? BLiveOperationTitleShowType.off : "on");
        }
        m190835v2();
    }

    /* JADX INFO: renamed from: u1 */
    public String m190832u1() {
        return this.f173855a;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m190833u2(DialogInterface dialogInterface) {
        m190835v2();
    }

    /* JADX INFO: renamed from: v1 */
    public String m190834v1() {
        return this.f173849C;
    }

    /* JADX INFO: renamed from: w2 */
    public void m190836w2() {
        this.f173851E = false;
    }

    /* JADX INFO: renamed from: x1 */
    public void m190837x1() {
        InterfaceC0476e interfaceC0476eM2558i0 = m190816k1().fragmentManager().m2558i0(TabName.Card.toString());
        if (interfaceC0476eM2558i0 instanceof cvl) {
            cvl cvlVar = (cvl) interfaceC0476eM2558i0;
            NewTanFragTag newTanFragTag = NewTanFragTag.HOME;
            cvlVar.mo39549I2(newTanFragTag);
            cvlVar.mo39568n2(newTanFragTag);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m190838x2(int i, final int i2, final Intent intent) {
        if (i != 114 || !NullChecker.m82486a(((yfl) this.viewModel).m215735r0())) {
            if (i == 115 && i2 == -1) {
                m190714A2((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        SwipeDirection swipeDirection = SwipeDirection.RIGHT;
        if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
            m190816k1().f25181p = true;
        }
        ik4 ik4VarMo39821o = ((yfl) this.viewModel).m215735r0().mo39821o();
        if (NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140259d())) {
            final String str = ik4VarMo39821o.m140259d().f56859id;
            if (i2 == swipeDirection.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                this.f173861g = true;
                lifecycle().takeFirst(new qcj() { // from class: l.scl
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.ddl
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f87942a.m190824p2(str, i2, intent, (C4470c) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public VSwipeStack.OnCardSwipeResult m190839y2(xql xqlVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f173850D == null) {
            this.f173850D = new sfh0();
        }
        if (this.f173858d) {
            CoreBusinessModule.f18256g.m191629b().f169296b = xqlVar.mo37886e0() ? xqlVar.getCardDataProxy().m140259d().f56859id : "";
        } else {
            CrashHelper.m82479c(new IllegalStateException("moment onCardSwipe be called before card rendered"));
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z2 = true;
        boolean z3 = swipeDirection == swipeDirection2 || swipeDirection == SwipeDirection.UP;
        SwipeDirection swipeDirection3 = SwipeDirection.UP;
        boolean z4 = swipeDirection == swipeDirection3;
        if (!z) {
            ((yfl) this.viewModel).m215697X(z3, z4).mo39361i();
        }
        if (z3) {
            V v2 = this.viewModel;
            if (z4) {
                ((yfl) v2).m215718j0().reset();
            } else {
                ((yfl) v2).m215736s0().reset();
            }
            ((yfl) this.viewModel).m215713g0().reset();
        } else {
            ((yfl) this.viewModel).m215718j0().reset();
            ((yfl) this.viewModel).m215736s0().reset();
        }
        xqlVar.mo37901j0(swipeDirection);
        HomeStatisticsHelper.m37694E("card");
        HomeStatisticsHelper.m37695F("swipe");
        r4a r4aVar = CoreModule.f18264c.f20364Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        r4aVar.m179746e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = this.f173850D.mo38500a(new sfh0.C20031a(this, (yfl) this.viewModel, xqlVar.getCardDataProxy(), swipeDirection, z));
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo38500a == onCardSwipeResult) {
            CoreModule.f18264c.f20364Y0.m179747f();
        }
        if (onCardSwipeResultMo38500a == VSwipeStack.OnCardSwipeResult.back || onCardSwipeResultMo38500a == onCardSwipeResult) {
            m190823o1();
        }
        this.f173861g = false;
        if (!IntlCountryCodeController.m29125v()) {
            return onCardSwipeResultMo38500a;
        }
        ((yfl) this.viewModel).m215750z1(onCardSwipeResultMo38500a, swipeDirection);
        return onCardSwipeResultMo38500a != onCardSwipeResult ? VSwipeStack.OnCardSwipeResult.stay : onCardSwipeResultMo38500a;
    }

    /* JADX INFO: renamed from: z1 */
    public void m190840z1() {
        if (!asj0.m99935d0() || m190816k1().lifecycle_() != C4470c.f16267i || ((yfl) this.viewModel).m215676I0() || ((yfl) this.viewModel).m215717i0().isHidden()) {
            return;
        }
        Object objMo39812d = ((yfl) this.viewModel).m215735r0() == null ? null : ((yfl) this.viewModel).m215735r0().mo39812d();
        if (NullChecker.m82486a(objMo39812d) && (objMo39812d instanceof t7m)) {
            t7m t7mVar = (t7m) objMo39812d;
            if (t7mVar.mo37950y()) {
                t7mVar.mo37833L();
            }
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m190841z2(boolean z) {
        this.f173878x = z;
        this.f173879y.m137019l(Boolean.valueOf(z));
        if (!z) {
            if (this.f173862h) {
                this.f173862h = false;
                m190820m1();
            }
            if (this.f173859e) {
                this.f173859e = false;
                if (NullChecker.m82486a(((yfl) this.viewModel).m215735r0()) && NullChecker.m82486a(((yfl) this.viewModel).m215735r0().mo39816j())) {
                    HomeStatisticsHelper.m37706i(((yfl) this.viewModel).m215735r0().mo39816j(), ((yfl) this.viewModel).m215717i0().pageId());
                    ik4 ik4VarMo39821o = ((yfl) this.viewModel).m215735r0().mo39821o();
                    String strPageId = ((yfl) this.viewModel).m215717i0().pageId();
                    String str = this.f173855a;
                    HomeStatisticsHelper.m37715r(ik4VarMo39821o, strPageId, str, m190791N1(str));
                }
            }
        }
        if (CoreModule.f18264c.f20318J0.m156766F3() && ((lifecycle_() == C4470c.f16267i || lifecycle_() == C4470c.f16266h) && !z)) {
            m190790M2();
        }
        ((yfl) this.viewModel).m215723l1(z);
        if (this.f173878x) {
            return;
        }
        if (hw80.f111874f && this.f173868n) {
            ((yfl) this.viewModel).m215737s1(true, true);
            duringCreated(CoreModule.f18264c.f20408n0.m32445K3(nh00.m163018b().m163022f() ? nh00.m163018b().m163019c() : gra.m131578I0().tabId)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.del
                @Override // p153l.y20
                public final void call(Object obj) {
                    tel.m190754h0((uxj0) obj);
                }
            }, new y20() { // from class: l.eel
                @Override // p153l.y20
                public final void call(Object obj) {
                    tel.m190731N0((Throwable) obj);
                }
            }));
        }
        hw80.f111874f = false;
    }
}
