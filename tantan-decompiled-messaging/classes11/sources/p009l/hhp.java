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
import com.p000p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.n;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.main.LocationPermissionView;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UssTags;
import com.p1.mobile.putong.data.VerificationLimit;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.adi0;
import l.ark;
import l.c4g0;
import l.cxf;
import l.d30;
import l.e2s;
import l.e30;
import l.e51;
import l.f3a;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mah0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.ogl0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.u59;
import l.uq40;
import l.vwb;
import l.vy8;
import l.w9j;
import l.wge0;
import l.wvv;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xij0;
import l.xma;
import l.xnj0;
import l.y9j;
import l.ya5;
import l.ygh0;
import l.zvf0;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hhp extends jq2<pip> {

    /* JADX INFO: renamed from: I */
    public static String f14091I = "click";

    /* JADX INFO: renamed from: J */
    public static String f14092J = "swipe";

    /* JADX INFO: renamed from: A */
    public Runnable f14093A;

    /* JADX INFO: renamed from: B */
    public boolean f14094B;

    /* JADX INFO: renamed from: C */
    public String f14095C;

    /* JADX INFO: renamed from: D */
    public p3m<j7h0.C0970a, VSwipeStack.OnCardSwipeResult> f14096D;

    /* JADX INFO: renamed from: E */
    public boolean f14097E;

    /* JADX INFO: renamed from: F */
    public int f14098F;

    /* JADX INFO: renamed from: G */
    public c4g0 f14099G;

    /* JADX INFO: renamed from: H */
    public long f14100H;

    /* JADX INFO: renamed from: a */
    public boolean f14101a;

    /* JADX INFO: renamed from: b */
    public boolean f14102b;

    /* JADX INFO: renamed from: c */
    public String f14103c;

    /* JADX INFO: renamed from: d */
    public int f14104d;

    /* JADX INFO: renamed from: e */
    public String f14105e;

    /* JADX INFO: renamed from: f */
    public boolean f14106f;

    /* JADX INFO: renamed from: g */
    public boolean f14107g;

    /* JADX INFO: renamed from: h */
    public boolean f14108h;

    /* JADX INFO: renamed from: i */
    public boolean f14109i;

    /* JADX INFO: renamed from: j */
    public a<roj0> f14110j;

    /* JADX INFO: renamed from: k */
    public a<PartialListOpt<CoreSuggested.UserInfo>> f14111k;

    /* JADX INFO: renamed from: l */
    public a<roj0> f14112l;

    /* JADX INFO: renamed from: m */
    public a<Boolean> f14113m;

    /* JADX INFO: renamed from: n */
    public b<roj0> f14114n;

    /* JADX INFO: renamed from: o */
    public boolean f14115o;

    /* JADX INFO: renamed from: p */
    public a<Boolean> f14116p;

    /* JADX INFO: renamed from: q */
    public boolean f14117q;

    /* JADX INFO: renamed from: r */
    public boolean f14118r;

    /* JADX INFO: renamed from: s */
    public boolean f14119s;

    /* JADX INFO: renamed from: t */
    public long f14120t;

    /* JADX INFO: renamed from: u */
    public String f14121u;

    /* JADX INFO: renamed from: v */
    public String f14122v;

    /* JADX INFO: renamed from: w */
    public boolean f14123w;

    /* JADX INFO: renamed from: x */
    public boolean f14124x;

    /* JADX INFO: renamed from: y */
    public a<Boolean> f14125y;

    /* JADX INFO: renamed from: z */
    public c4g0 f14126z;

    /* JADX INFO: renamed from: l.hhp$a */
    public class C0938a implements w9j<roj0, c<j760>> {
        public C0938a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ j760 m15838a(User user, PartialListOpt partialListOpt) {
            return new j760(user, partialListOpt);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<j760> call(roj0 roj0Var) {
            return mkd0.r(CoreModule.c.e0.o9(), CoreModule.c.o0.c4(((pip) ((jq2) hhp.this).viewModel).f18674T, ((pip) ((jq2) hhp.this).viewModel).f18675U), new x9j() { // from class: l.ghp
                public final Object call(Object obj, Object obj2) {
                    return hhp.C0938a.m15838a((User) obj, (PartialListOpt) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.hhp$b */
    public static /* synthetic */ class C0939b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14128a;

        static {
            int[] iArr = new int[HomeStatisticsHelper.ScActionName.values().length];
            f14128a = iArr;
            try {
                iArr[HomeStatisticsHelper.ScActionName.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14128a[HomeStatisticsHelper.ScActionName.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14128a[HomeStatisticsHelper.ScActionName.SUPER_LIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14128a[HomeStatisticsHelper.ScActionName.UNDO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14128a[HomeStatisticsHelper.ScActionName.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public hhp(mcr mcrVar) {
        super(mcrVar);
        this.f14101a = false;
        this.f14102b = false;
        this.f14103c = "";
        this.f14104d = 0;
        this.f14105e = "";
        this.f14106f = false;
        this.f14107g = false;
        this.f14108h = true;
        this.f14109i = false;
        this.f14110j = a.b();
        this.f14111k = CoreModule.c.o0.Y;
        this.f14112l = a.b();
        Boolean bool = Boolean.FALSE;
        this.f14113m = a.c(bool);
        this.f14114n = b.b();
        this.f14115o = false;
        this.f14116p = a.c(bool);
        this.f14117q = false;
        this.f14118r = true;
        this.f14119s = true;
        this.f14120t = 0L;
        this.f14123w = true;
        this.f14125y = a.c(bool);
        this.f14093A = new Runnable() { // from class: l.ggp
            @Override // java.lang.Runnable
            public final void run() {
                this.f13537a.m15754e2();
            }
        };
        this.f14095C = "";
        this.f14097E = false;
        this.f14098F = 0;
        this.f14099G = null;
        this.f14100H = adi0.INSTANCE.d();
    }

    /* JADX INFO: renamed from: D2 */
    private void m15720D2() {
        wvv.l(m15809e1(), new PermissionHelper.InterfaceC0531b() { // from class: l.qfp
            @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
            /* JADX INFO: renamed from: a */
            public final void mo10235a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f19226a.m15817j2(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.rfp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f19818a.m15819k2(dialogInterface);
            }
        }, new Runnable() { // from class: l.sfp
            @Override // java.lang.Runnable
            public final void run() {
                this.f20231a.m15820l2();
            }
        }, new d30() { // from class: l.tfp
            public final void call() {
                ygh0.n0(ygh0.h);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m15722F0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: H2 */
    private boolean m15725H2() {
        return NullChecker.a(CoreModule.c.o0.U);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ c m15726I0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m15729N0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public /* synthetic */ void m15730N1(String str) {
        if (NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0()) && NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0().mo2809j()) && TextUtils.equals(str, ((pip) ((jq2) this).viewModel).m20414m0().mo2809j().id)) {
            this.f14094B = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m15732O1(String str) {
        ark.Q0(m15809e1(), str, new d30() { // from class: l.ygp
            public final void call() {
                this.f23058a.m15740U1();
            }
        });
        CoreModule.c.O2.put("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public /* synthetic */ void m15734P1(j760 j760Var) {
        this.f14113m.onNext(Boolean.FALSE);
        m15758h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public /* synthetic */ void m15738T1(roj0 roj0Var) {
        CoreModule.c.o0.x3();
        this.f14110j.onNext(roj0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public /* synthetic */ void m15740U1() {
        ((pip) ((jq2) this).viewModel).m20403e0().startActivityForResult(MediaPickerAct.g2(m15809e1(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender), 115);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public /* synthetic */ void m15742V1(Bundle bundle) {
        CoreModule.c.o0.w3();
        CoreModule.c.o0.x3();
        this.f14110j.onNext(roj0.a);
        ((pip) ((jq2) this).viewModel).m20362B0(true, true);
        this.f14115o = true;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ roj0 m15745Y0(com.p1.mobile.android.app.c cVar, roj0 roj0Var, List list) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            return roj0.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public /* synthetic */ void m15746Y1(com.p1.mobile.android.app.c cVar) {
        ((pip) ((jq2) this).viewModel).m20433w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m15750c2(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0())) {
            C0158d c0158dM15761j1 = m15761j1(m15809e1().pageId(), relationship.id, ((pip) ((jq2) this).viewModel).m20414m0(), user);
            c0158dM15761j1.m2465v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m15835x2(c0158dM15761j1, "success");
        }
        this.f14108h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m15752d2(User user, Throwable th) {
        if (NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0())) {
            m15834w2(m15761j1(m15809e1().pageId(), "", ((pip) ((jq2) this).viewModel).m20414m0(), user), th);
        }
        this.f14108h = true;
        lsi0.H(m15809e1().getResources().getString(R.string.oq), m15809e1().getResources().getDrawable(x2c0.vu), m15809e1().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m15753e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m15754e2() {
        this.f14108h = false;
        HashMap map = new HashMap();
        map.put("sourcepage", "tribe-" + ((pip) ((jq2) this).viewModel).f18675U);
        map.put("actiontype", f14091I);
        n nVar = CoreModule.c.o0;
        final User user = nVar.U;
        if (NullChecker.a(nVar.V)) {
            CoreModule.c.o0.V.clone();
        }
        c cVarD4 = CoreModule.c.o0.d4(map, "tribe-" + ((pip) ((jq2) this).viewModel).f18675U);
        if (NullChecker.a(cVarD4)) {
            cVarD4.subscribe(mkd0.H(new e30() { // from class: l.jgp
                public final void call(Object obj) {
                    this.f15117a.m15750c2(user, (Relationship) obj);
                }
            }, new e30() { // from class: l.kgp
                public final void call(Object obj) {
                    this.f15669a.m15752d2(user, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0())) {
            m15835x2(m15761j1(m15809e1().pageId(), "", ((pip) ((jq2) this).viewModel).m20414m0(), user), "");
        }
        this.f14108h = true;
        lsi0.H(m15809e1().getResources().getString(R.string.oq), m15809e1().getResources().getDrawable(x2c0.vu), m15809e1().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: h1 */
    private void m15758h1() {
        IntlTribeSwipeAct intlTribeSwipeActM15809e1 = m15809e1();
        if (!NullChecker.a(intlTribeSwipeActM15809e1) || intlTribeSwipeActM15809e1.isDialogShowing()) {
            this.f14110j.onNext(roj0.a);
            return;
        }
        if (vy8.d()) {
            CoreModule.c.e0.c0.put(Boolean.TRUE);
            ark.O0(m15809e1(), "", new d30() { // from class: l.pgp
                public final void call() {
                    this.f18578a.m15798J1();
                }
            }, false);
        } else if (!m15810f1()) {
            this.f14110j.onNext(roj0.a);
        } else {
            CoreModule.c.e0.c0.put(Boolean.TRUE);
            ark.O0(intlTribeSwipeActM15809e1, "", new d30() { // from class: l.qgp
                public final void call() {
                    this.f19249a.m15799L1();
                }
            }, true);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private C0158d m15761j1(String str, String str2, wsf0 wsf0Var, User user) {
        String str3;
        int size;
        int iA3 = CoreModule.c.o0.A3() - 1;
        if (!NullChecker.a(user) || iA3 < 0 || user.pictures.size() <= iA3) {
            str3 = "";
            size = 0;
        } else {
            str3 = ((Media) user.pictures.get(iA3)).url;
            size = user.pictures.size();
        }
        C0158d c0158dM651h = HomeStatisticsHelper.m651h(str, str2, wsf0Var);
        c0158dM651h.m2439B(str3);
        c0158dM651h.m2469z(iA3);
        c0158dM651h.m2438A(size);
        return c0158dM651h;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m15763l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void m15820l2() {
        ((pip) ((jq2) this).viewModel).m20409j0().e(LocationPermissionView.LocationPermissionState.requested);
        if (this.f14118r) {
            this.f14118r = false;
            this.f14110j.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m15770q1(Intent intent) {
        String stringExtra = intent.getStringExtra("heart_confession_uid");
        String stringExtra2 = intent.getStringExtra("heart_confession_content");
        CoreSuggested.UserInfo userInfoMo2809j = ((pip) ((jq2) this).viewModel).m20414m0().mo2809j();
        String str = NullChecker.a(userInfoMo2809j) ? userInfoMo2809j.id : "";
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return;
        }
        this.f14121u = stringExtra;
        this.f14122v = stringExtra2;
    }

    /* JADX INFO: renamed from: q2 */
    private void m15771q2(final ArrayList<Media> arrayList, final String str) {
        ((pip) ((jq2) this).viewModel).m20403e0().o4(R.string.J5);
        ya5.I(arrayList, "profile").compose(mkd0.C()).flatMap(new w9j() { // from class: l.sgp
            public final Object call(Object obj) {
                return hhp.m15726I0((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.tgp
            public final void call(Object obj) {
                this.f20673a.m15813g2(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ugp
            public final void call(Object obj) {
                this.f21139a.m15814h2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    private void m15774s1() {
        duringCreated(CoreModule.c.r0.i0).subscribe(mkd0.G(new e30() { // from class: l.egp
            public final void call(Object obj) {
                this.f12558a.m15730N1((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    private void m15776t1() {
        duringCreated(CoreModule.c.O2.obs()).observeOn(jo0.a()).filter(new w9j() { // from class: l.pfp
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.agp
            public final void call(Object obj) {
                this.f9496a.m15732O1((String) obj);
            }
        }));
        duringCreated(mkd0.r(lifecycle(), this.f14113m, new el30()).filter(new w9j() { // from class: l.lgp
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.a == com.p1.mobile.android.app.c.i && ((Boolean) j760Var.b).booleanValue());
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.wgp
            public final void call(Object obj) {
                this.f22106a.m15734P1((j760) obj);
            }
        }));
        duringCreated(this.f14110j.switchMap(new C0938a())).subscribe(mkd0.G(new e30() { // from class: l.ahp
            public final void call(Object obj) {
                this.f9518a.m15801R1((j760) obj);
            }
        }));
        duringCreated(mkd0.s(lifecycle(), this.f14112l, CoreModule.c.j0.E4().take(1), new y9j() { // from class: l.bhp
            /* JADX INFO: renamed from: a */
            public final Object m12032a(Object obj, Object obj2, Object obj3) {
                return hhp.m15745Y0((com.p1.mobile.android.app.c) obj, (roj0) obj2, (List) obj3);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.chp
            public final void call(Object obj) {
                this.f10607a.m15802S1((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.h9()).subscribe(mkd0.G(new e30() { // from class: l.dhp
            public final void call(Object obj) {
                this.f11845a.m15738T1((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    private void m15778u1() {
        this.f14111k.onNext((Object) null);
        creates(new e30() { // from class: l.cgp
            public final void call(Object obj) {
                this.f10585a.m15742V1((Bundle) obj);
            }
        }, new d30() { // from class: l.dgp
            public final void call() {
                hhp.m15729N0();
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    private void m15779u2() {
        mkd0.z(this.f14126z);
        this.f14126z = null;
    }

    /* JADX INFO: renamed from: v1 */
    private void m15780v1() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.fgp
            public final void call(Object obj) {
                this.f12994a.m15804X1((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x1 */
    private void m15782x1() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.ehp
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.k);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.fhp
            public final void call(Object obj) {
                this.f13006a.m15746Y1((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z1 */
    private void m15785z1() {
        duringCreated(CoreModule.c.e0.o9()).switchMap(new w9j() { // from class: l.ufp
            public final Object call(Object obj) {
                return this.f21114a.m15805Z1((User) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vfp
            public final void call(Object obj) {
                this.f21566a.m15807a2((roj0) obj);
            }
        }));
        cxf.f().e(duringCreated(CoreModule.c.e0.o9()), m15809e1(), ((pip) ((jq2) this).viewModel).m20403e0(), 115);
        duringCreated(CoreModule.c.e0.wa()).subscribe(mkd0.G(new e30() { // from class: l.wfp
            public final void call(Object obj) {
                CoreModule.c.e0.va(-1);
            }
        }));
        duringCreated(CoreModule.c.e0.o9().filter(new w9j() { // from class: l.xfp
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.yfp
            public final Object call(Object obj) {
                return ((Media) ((User) obj).fp()).url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.zfp
            public final void call(Object obj) {
                this.f23644a.m15808b2((String) obj);
            }
        }, new e30() { // from class: l.bgp
            public final void call(Object obj) {
                hhp.m15763l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A2 */
    public void m15786A2(String str) {
        this.f14095C = str;
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m15787B1(String str) {
        return TextUtils.equals(this.f14105e, str);
    }

    /* JADX INFO: renamed from: B2 */
    public void m15788B2(boolean z) {
        this.f14102b = z;
    }

    /* JADX INFO: renamed from: C1 */
    public boolean m15789C1(String str) {
        return (TextUtils.isEmpty(this.f14121u) || !this.f14121u.equals(str) || TextUtils.isEmpty(this.f14122v)) ? false : true;
    }

    /* JADX INFO: renamed from: C2 */
    public void m15790C2(boolean z) {
        this.f14101a = z;
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m15791D1() {
        return this.f14097E;
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m15792E1() {
        return this.f14102b;
    }

    /* JADX INFO: renamed from: E2 */
    public boolean m15793E2(boolean z) {
        return m15795F2(z, false);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m15794F1() {
        return this.f14101a;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX INFO: renamed from: F2 */
    public boolean m15795F2(boolean z, boolean z2) {
        User user;
        C0158d c0158dM647d;
        UssTags ussTags;
        boolean z3;
        int iA3;
        String str = "";
        if (z) {
            c0158dM647d = HomeStatisticsHelper.m647d(((pip) ((jq2) this).viewModel).m20414m0() == null ? null : ((pip) ((jq2) this).viewModel).m20414m0().mo2814o(), true, this.f14109i, SwipeDirection.UP, ((pip) ((jq2) this).viewModel).m20414m0());
            user = null;
        } else {
            User user2 = CoreModule.c.o0.U;
            C0158d c0158dM651h = HomeStatisticsHelper.m651h(m15809e1().pageId(), user2 == null ? "" : ((DbObject) user2).id, ((pip) ((jq2) this).viewModel).m20414m0());
            c0158dM651h.m2465v((user2 == null || (ussTags = user2.ussTags) == null) ? "" : ussTags.eventInfo);
            user = user2;
            c0158dM647d = c0158dM651h;
        }
        int size = 0;
        if (CoreModule.c.e0.p9().isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            m15835x2(c0158dM647d, "failJailedUser");
            return false;
        }
        Counter counterO3 = CoreModule.c.o3();
        VerificationLimit verificationLimit = counterO3 != null ? counterO3.verification : null;
        if (TextUtils.equals(((pip) ((jq2) this).viewModel).f18675U, "certified") && xma.e4() && verificationLimit != null && verificationLimit.tribeSwipeCount >= verificationLimit.tribeTotalCount) {
            CoreModule.P().a().pr(m15809e1(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.intl_advanced_filter);
            return false;
        }
        KeyEvent.Callback callbackMo2805d = ((pip) ((jq2) this).viewModel).m20414m0().mo2805d();
        if (!NullChecker.a(callbackMo2805d) || (((callbackMo2805d instanceof d5m) && ((d5m) callbackMo2805d).mo865k0()) || !this.f14108h)) {
            return false;
        }
        if (z) {
            ((pip) ((jq2) this).viewModel).m20414m0().mo2797A(SwipeDirection.UP);
            return false;
        }
        if (m15725H2()) {
            CoreSuggested.UserInfo userInfo = CoreModule.c.o0.V;
            if (u59.f0() && NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.letter)) {
                lsi0.w(R.string.Y2);
            } else {
                CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
                CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3.undoLimit;
                if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
                    if (this.f14108h && CoreModule.c.o0.V.canUndo) {
                        this.f14093A.run();
                        if (ogl0.Z()) {
                            wge0.f().i(userInfo.id);
                            zvf0.D("e_undo_superlike", m15809e1().pageId(), new j760[]{vwb.Y("other_user_id", userInfo.id), vwb.Y("superlike_quantity", Integer.valueOf(wge0.f().d(userInfo.id)))});
                        }
                        z3 = true;
                    }
                    boolean z4 = z3;
                    if (!z3) {
                        iA3 = CoreModule.c.o0.A3() - 1;
                        if (NullChecker.a(user) && iA3 >= 0 && user.pictures.size() > iA3) {
                            str = ((Media) user.pictures.get(iA3)).url;
                            size = user.pictures.size();
                        }
                        c0158dM647d.m2439B(str);
                        c0158dM647d.m2469z(iA3);
                        c0158dM647d.m2438A(size);
                        m15835x2(c0158dM647d, "failUndoLocal");
                    }
                    return z4;
                }
                com.p1.mobile.putong.core.ui.purchase.c.M1(m15809e1(), "p_intl_tribe_swipe_view,e_undo_button,click", Privilege.vip_undo, (d30) null, (d30) null, false, CoreModule.c.o0.U);
            }
        } else {
            CounterLikeLimit counterLikeLimit2 = counterO3.likeLimit;
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counterO3.undoLimit;
            if ((((long) (counterSuperlikeAndUndoLimit2.reset * 1000)) + counterLikeLimit2.serverTime) - qib0.H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit2.remainToday() != 0) {
                xnj0.a(m15809e1());
            } else {
                com.p1.mobile.putong.core.ui.purchase.c.M1(m15809e1(), "p_intl_tribe_swipe_view,e_undo_button,click", Privilege.vip_undo, (d30) null, (d30) null, false, CoreModule.c.o0.U);
            }
        }
        z3 = false;
        boolean z5 = z3;
        if (!z3) {
            iA3 = CoreModule.c.o0.A3() - 1;
            if (NullChecker.a(user)) {
                str = ((Media) user.pictures.get(iA3)).url;
                size = user.pictures.size();
            }
            c0158dM647d.m2439B(str);
            c0158dM647d.m2469z(iA3);
            c0158dM647d.m2438A(size);
            m15835x2(c0158dM647d, "failUndoLocal");
        }
        return z5;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ Boolean m15796H1(j760 j760Var) {
        return Boolean.valueOf(this.f14098F == 1);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m15797I1(j760 j760Var) {
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
        this.f14098F = 0;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m15798J1() {
        this.f14110j.onNext(roj0.a);
        if (uq40.y(m15809e1(), true)) {
            return;
        }
        this.f14116p.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m15799L1() {
        this.f14110j.onNext(roj0.a);
        if (uq40.y(m15809e1(), true)) {
            return;
        }
        this.f14116p.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m15800Q1() {
        m15827p1();
        m15829r1();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m15801R1(j760 j760Var) {
        boolean z;
        PartialListOpt partialListOpt = (PartialListOpt) j760Var.b;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM14196y = ((pip) ((jq2) this).viewModel).f18655F.m14196y(partialListOpt.loaded);
        if (TextUtils.isEmpty(this.f14105e) && !vwb.J(listM14196y) && (!mah0.m0() || !mah0.y0(listM14196y.get(0).id))) {
            this.f14105e = listM14196y.get(0).id;
        }
        if (size != listM14196y.size()) {
            y1j.m25171h("moment render List refresh change " + size + "," + listM14196y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        if (z) {
            ((pip) ((jq2) this).viewModel).f18655F.m14190G(listM14196y);
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        this.f14106f = true;
        m15809e1().postDelayed(new Runnable() { // from class: l.rgp
            @Override // java.lang.Runnable
            public final void run() {
                this.f19832a.m15800Q1();
            }
        }, 100L);
        StringBuilder sb = new StringBuilder("moment render cards: ");
        sb.append(z);
        sb.append(",");
        sb.append(zNeedRefresh);
        sb.append(",");
        sb.append(!partialListOpt.hasMore() && listM14196y.size() == 0);
        sb.append(",");
        sb.append(listM14196y.isEmpty());
        y1j.m25171h(sb.toString());
        if (partialListOpt.hasMore() || listM14196y.size() != 0) {
            boolean zIsEmpty = listM14196y.isEmpty();
            s7m s7mVar = ((jq2) this).viewModel;
            if (zIsEmpty) {
                ((pip) s7mVar).m20432v1(true, true, true);
            } else {
                ((pip) s7mVar).m20432v1(false, true, true);
            }
        } else {
            ((pip) ((jq2) this).viewModel).m20432v1(true, false, true);
        }
        if (((pip) ((jq2) this).viewModel).m20374J0() || this.f14112l.e() != null) {
            return;
        }
        this.f14112l.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m15802S1(roj0 roj0Var) {
        if (NullChecker.a(roj0Var)) {
            m15812g1();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m15803W1() {
        this.f14094B = false;
        ((pip) ((jq2) this).viewModel).m20414m0().mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m15804X1(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i && this.f14094B) {
            e51.H(m15809e1(), new Runnable() { // from class: l.mgp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16911a.m15803W1();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ c m15805Z1(User user) {
        return this.f14114n;
    }

    /* JADX INFO: renamed from: a0 */
    public void m15806a0() {
        m15778u1();
        m15776t1();
        m15785z1();
        m15780v1();
        m15782x1();
        m15774s1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m15807a2(roj0 roj0Var) {
        ark.T0(m15809e1());
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m15808b2(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = str;
        qib0.G.B0(((pip) ((jq2) this).viewModel).m20406h0(), picture.profile480());
        qib0.G.B0(((pip) ((jq2) this).viewModel).m20401d0(), picture.profile480());
    }

    public void destroy() {
        if (this.f14126z != null) {
            m15779u2();
        }
        cxf.f().d();
    }

    /* JADX INFO: renamed from: e1 */
    public IntlTribeSwipeAct m15809e1() {
        return ((pip) ((jq2) this).viewModel).act();
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m15810f1() {
        return (TEnum.equals(CoreModule.c.e0.p9().source, "wechat") || TEnum.equals(CoreModule.c.e0.p9().source, "qq")) && vy8.o() && !((Boolean) CoreModule.c.e0.b0.get()).booleanValue();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m15811f2(String str, int i, Intent intent, com.p1.mobile.android.app.c cVar) {
        if (NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0())) {
            CoreSuggested.UserInfo userInfoMo2809j = ((pip) ((jq2) this).viewModel).m20414m0().mo2809j();
            if (NullChecker.a(userInfoMo2809j) && TextUtils.equals(str, userInfoMo2809j.id)) {
                SwipeDirection swipeDirection = SwipeDirection.UP;
                if (i != swipeDirection.getValue()) {
                    ((pip) ((jq2) this).viewModel).m20414m0().mo2797A(SwipeDirection.fromValue(i));
                } else if (((pip) ((jq2) this).viewModel).m20414m0().mo2804c(false)) {
                    if (i == swipeDirection.getValue() && u59.f0() && NullChecker.a(intent)) {
                        m15770q1(intent);
                    }
                    m15793E2(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m15812g1() {
        if (CoreModule.c.e0.p9() == null) {
            this.f14098F = 1;
            if (NullChecker.a(this.f14099G) && !this.f14099G.isUnsubscribed()) {
                this.f14099G.unsubscribe();
            }
            CrashHelper.c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.H().userId() + ", login: " + CoreModule.H().signedIn_() + ", me == null"));
            this.f14099G = duringCreated(mkd0.r(CoreModule.c.f0.on(), CoreModule.c.e0.o9(), new yn30())).filter(new w9j() { // from class: l.vgp
                public final Object call(Object obj) {
                    return this.f21573a.m15796H1((j760) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.xgp
                public final void call(Object obj) {
                    this.f22604a.m15797I1((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m15813g2(ArrayList arrayList, String str, roj0 roj0Var) {
        ((pip) ((jq2) this).viewModel).m20403e0().s4();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        ark.V0(m15809e1(), false, (Media) arrayList.get(0), m15809e1().string(R.string.el), new Runnable() { // from class: l.zgp
            @Override // java.lang.Runnable
            public final void run() {
                hhp.m15753e0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.v();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m15814h2(Throwable th) {
        ((pip) ((jq2) this).viewModel).m20403e0().s4();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: i1 */
    public void m15815i1() {
        this.f14122v = null;
        this.f14121u = null;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m15816i2(a aVar, Throwable th) {
        CoreModule.c.o0.S3();
        if ((aVar.e() == null || ((PartialListOpt) aVar.e()).loaded.size() == 0) && ((pip) ((jq2) this).viewModel).m20374J0()) {
            this.f14097E = true;
            ((pip) ((jq2) this).viewModel).m20430u1(true, false);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m15817j2(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            ygh0.l0(ygh0.h);
        } else {
            ygh0.m0(ygh0.h, wvv.n(m15809e1()) ? "off" : "on");
        }
        m15820l2();
    }

    /* JADX INFO: renamed from: k1 */
    public void m15818k1() {
        this.f14107g = true;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m15819k2(DialogInterface dialogInterface) {
        m15820l2();
    }

    /* JADX INFO: renamed from: m1 */
    public int m15821m1() {
        return this.f14104d;
    }

    /* JADX INFO: renamed from: m2 */
    public void m15822m2() {
        this.f14097E = false;
    }

    /* JADX INFO: renamed from: n1 */
    public String m15823n1() {
        return this.f14103c;
    }

    /* JADX INFO: renamed from: n2 */
    public void m15824n2(int i, final int i2, final Intent intent) {
        if (i != 114 || !NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0())) {
            if (i == 115 && i2 == -1) {
                m15771q2((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        jj4 jj4VarMo2814o = ((pip) ((jq2) this).viewModel).m20414m0().mo2814o();
        if (NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17130d())) {
            final String str = ((DbObject) jj4VarMo2814o.m17130d()).id;
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                this.f14109i = true;
                lifecycle().takeFirst(new w9j() { // from class: l.hgp
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.igp
                    public final void call(Object obj) {
                        this.f14623a.m15811f2(str, i2, intent, (com.p1.mobile.android.app.c) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public String m15825o1() {
        return this.f14095C;
    }

    /* JADX INFO: renamed from: o2 */
    public VSwipeStack.OnCardSwipeResult m15826o2(mol molVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f14096D == null) {
            this.f14096D = new j7h0();
        }
        if (this.f14106f) {
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
            ((pip) ((jq2) this).viewModel).m20389W(z3, z4).mo2336i();
        }
        if (z3) {
            s7m s7mVar = ((jq2) this).viewModel;
            if (z4) {
                ((pip) s7mVar).m20404f0().reset();
            } else {
                ((pip) s7mVar).m20416n0().reset();
            }
            ((pip) ((jq2) this).viewModel).m20400c0().reset();
        } else {
            ((pip) ((jq2) this).viewModel).m20404f0().reset();
            ((pip) ((jq2) this).viewModel).m20416n0().reset();
        }
        molVar.mo861j0(swipeDirection);
        HomeStatisticsHelper.m640E("card");
        HomeStatisticsHelper.m641F("swipe");
        f3a f3aVar = CoreModule.c.Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        f3aVar.e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = this.f14096D.mo1468a(new j7h0.C0970a(this, (pip) ((jq2) this).viewModel, molVar.getCardDataProxy(), swipeDirection, z));
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo1468a == onCardSwipeResult) {
            CoreModule.c.Y0.f();
        }
        if (onCardSwipeResultMo1468a == VSwipeStack.OnCardSwipeResult.back || onCardSwipeResultMo1468a == onCardSwipeResult) {
            m15815i1();
        }
        this.f14109i = false;
        if (!IntlCountryCodeController.v()) {
            return onCardSwipeResultMo1468a;
        }
        ((pip) ((jq2) this).viewModel).m20434y1(onCardSwipeResultMo1468a, swipeDirection);
        return onCardSwipeResultMo1468a != onCardSwipeResult ? VSwipeStack.OnCardSwipeResult.stay : onCardSwipeResultMo1468a;
    }

    /* JADX INFO: renamed from: p1 */
    public void m15827p1() {
        if (!xij0.d0() || m15809e1().lifecycle_() != com.p1.mobile.android.app.c.i || ((pip) ((jq2) this).viewModel).m20370G0() || ((pip) ((jq2) this).viewModel).m20403e0().isHidden()) {
            return;
        }
        Object objMo2805d = ((pip) ((jq2) this).viewModel).m20414m0() == null ? null : ((pip) ((jq2) this).viewModel).m20414m0().mo2805d();
        if (NullChecker.a(objMo2805d) && (objMo2805d instanceof d5m)) {
            d5m d5mVar = (d5m) objMo2805d;
            if (d5mVar.mo914y()) {
                d5mVar.mo786L();
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void m15828p2(boolean z) {
        this.f14124x = z;
        this.f14125y.onNext(Boolean.valueOf(z));
        if (!z) {
            CoreModule.c.e0.H9();
            if (this.f14107g) {
                this.f14107g = false;
                if (NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0()) && NullChecker.a(((pip) ((jq2) this).viewModel).m20414m0().mo2809j())) {
                    o6j0.h("e_intl_tribe_card", "p_intl_tribe_swipe_view", new o6j0.a[]{o6j0.a.h("intl_tribe_source_name", ((pip) ((jq2) this).viewModel).f18675U), o6j0.a.h("receiver_user_id", ((pip) ((jq2) this).viewModel).m20414m0().mo2809j().id)});
                    HomeStatisticsHelper.m652i(((pip) ((jq2) this).viewModel).m20414m0().mo2809j(), m15809e1().pageId());
                    jj4 jj4VarMo2814o = ((pip) ((jq2) this).viewModel).m20414m0().mo2814o();
                    String strPageId = m15809e1().pageId();
                    String str = this.f14103c;
                    HomeStatisticsHelper.m661r(jj4VarMo2814o, strPageId, str, m15787B1(str));
                }
            }
        }
        ((pip) ((jq2) this).viewModel).m20417n1(z);
        if (this.f14124x) {
            return;
        }
        if (this.f14123w) {
            this.f14123w = false;
            return;
        }
        if (this.f14115o) {
            if (this.f14111k.e() == null || vwb.J(((PartialListOpt) this.f14111k.e()).loaded)) {
                CoreModule.c.o0.x3();
                this.f14110j.onNext(roj0.a);
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m15829r1() {
        if (m15809e1().lifecycle_() != com.p1.mobile.android.app.c.i || ((pip) ((jq2) this).viewModel).m20370G0() || ((pip) ((jq2) this).viewModel).m20403e0().isHidden() || !((pip) ((jq2) this).viewModel).m20361A1()) {
            return;
        }
        if (com.p1.mobile.putong.core.ui.onlinematch.a.f) {
            com.p1.mobile.putong.core.ui.onlinematch.a.f = false;
            ((pip) ((jq2) this).viewModel).m20363B1();
        }
        if (e2s.d()) {
            e2s.e(false);
            ((pip) ((jq2) this).viewModel).m20363B1();
        }
        if (xdl0.O0(((pip) ((jq2) this).viewModel).m20395Z())) {
            return;
        }
        ((pip) ((jq2) this).viewModel).m20363B1();
    }

    /* JADX INFO: renamed from: r2 */
    public void m15830r2() {
        if (SystemClock.uptimeMillis() - this.f14120t >= 2000) {
            this.f14120t = SystemClock.uptimeMillis();
            m15833v2(true);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m15831s2(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
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
            ygh0.m0(ygh0.h, wvv.n(m15809e1()) ? "off" : "on");
        }
        if (i == 1792) {
            if (!z) {
                m15720D2();
                return;
            }
            ((pip) ((jq2) this).viewModel).m20409j0().e(LocationPermissionView.LocationPermissionState.requested);
            if (this.f14118r) {
                this.f14118r = false;
                if (this.f14117q) {
                    return;
                }
                this.f14110j.onNext(roj0.a);
            }
        }
    }

    /* JADX INFO: renamed from: t2 */
    public void m15832t2() {
        this.f14119s = false;
        ((pip) ((jq2) this).viewModel).m20427s1();
    }

    /* JADX INFO: renamed from: v2 */
    public void m15833v2(boolean z) {
        final a<PartialListOpt<CoreSuggested.UserInfo>> aVar = this.f14111k;
        PartialListOpt partialListOpt = (PartialListOpt) aVar.e();
        if (z || partialListOpt == null || partialListOpt.hasMore()) {
            n nVar = CoreModule.c.o0;
            s7m s7mVar = ((jq2) this).viewModel;
            duringCreated(nVar.U3(((pip) s7mVar).f18674T, ((pip) s7mVar).f18675U)).take(1).subscribe(mkd0.H(new e30() { // from class: l.ngp
                public final void call(Object obj) {
                    hhp.m15722F0((roj0) obj);
                }
            }, new e30() { // from class: l.ogp
                public final void call(Object obj) {
                    this.f18034a.m15816i2(aVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m15834w2(C0158d c0158d, Throwable th) {
        HomeStatisticsHelper.m636A(c0158d, th);
        this.f14109i = false;
        sbp.m22045b();
    }

    /* JADX INFO: renamed from: x2 */
    public void m15835x2(C0158d c0158d, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "success")) {
            zvf0.D("e_user_cant_rightswipe_reason", m15809e1().pageId(), new j760[]{vwb.Y("reason_type", str)});
        }
        int i = C0939b.f14128a[c0158d.m2454k().ordinal()];
        if (i == 1) {
            str2 = "right";
        } else if (i == 2) {
            str2 = "left";
        } else if (i == 3) {
            str2 = "up";
        } else if (i != 4) {
            str2 = i != 5 ? "unknow" : "unkown";
        } else {
            str2 = "back";
        }
        o6j0.g("e_intl_tribe_card", m15809e1().pageId(), new o6j0.a[]{o6j0.a.h("direction", str2), o6j0.a.h("intl_tribe_source_name", ((pip) ((jq2) this).viewModel).f18675U)});
        HomeStatisticsHelper.m637B(c0158d, str);
        this.f14109i = false;
        sbp.m22045b();
    }

    /* JADX INFO: renamed from: y2 */
    public void m15836y2(int i) {
        this.f14104d = i;
    }

    /* JADX INFO: renamed from: z2 */
    public void m15837z2(String str) {
        this.f14103c = str;
    }
}
