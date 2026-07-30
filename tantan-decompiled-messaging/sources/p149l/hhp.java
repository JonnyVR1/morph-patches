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
import com.p046p1.mobile.putong.core.api.C4748n;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.data.VerificationLimit;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class hhp extends jq2<pip> {

    /* JADX INFO: renamed from: I */
    public static String f107736I = "click";

    /* JADX INFO: renamed from: J */
    public static String f107737J = "swipe";

    /* JADX INFO: renamed from: A */
    public Runnable f107738A;

    /* JADX INFO: renamed from: B */
    public boolean f107739B;

    /* JADX INFO: renamed from: C */
    public String f107740C;

    /* JADX INFO: renamed from: D */
    public p3m<j7h0.C17710a, VSwipeStack.OnCardSwipeResult> f107741D;

    /* JADX INFO: renamed from: E */
    public boolean f107742E;

    /* JADX INFO: renamed from: F */
    public int f107743F;

    /* JADX INFO: renamed from: G */
    public c4g0 f107744G;

    /* JADX INFO: renamed from: H */
    public long f107745H;

    /* JADX INFO: renamed from: a */
    public boolean f107746a;

    /* JADX INFO: renamed from: b */
    public boolean f107747b;

    /* JADX INFO: renamed from: c */
    public String f107748c;

    /* JADX INFO: renamed from: d */
    public int f107749d;

    /* JADX INFO: renamed from: e */
    public String f107750e;

    /* JADX INFO: renamed from: f */
    public boolean f107751f;

    /* JADX INFO: renamed from: g */
    public boolean f107752g;

    /* JADX INFO: renamed from: h */
    public boolean f107753h;

    /* JADX INFO: renamed from: i */
    public boolean f107754i;

    /* JADX INFO: renamed from: j */
    public C22392a<roj0> f107755j;

    /* JADX INFO: renamed from: k */
    public C22392a<PartialListOpt<CoreSuggested.UserInfo>> f107756k;

    /* JADX INFO: renamed from: l */
    public C22392a<roj0> f107757l;

    /* JADX INFO: renamed from: m */
    public C22392a<Boolean> f107758m;

    /* JADX INFO: renamed from: n */
    public C22393b<roj0> f107759n;

    /* JADX INFO: renamed from: o */
    public boolean f107760o;

    /* JADX INFO: renamed from: p */
    public C22392a<Boolean> f107761p;

    /* JADX INFO: renamed from: q */
    public boolean f107762q;

    /* JADX INFO: renamed from: r */
    public boolean f107763r;

    /* JADX INFO: renamed from: s */
    public boolean f107764s;

    /* JADX INFO: renamed from: t */
    public long f107765t;

    /* JADX INFO: renamed from: u */
    public String f107766u;

    /* JADX INFO: renamed from: v */
    public String f107767v;

    /* JADX INFO: renamed from: w */
    public boolean f107768w;

    /* JADX INFO: renamed from: x */
    public boolean f107769x;

    /* JADX INFO: renamed from: y */
    public C22392a<Boolean> f107770y;

    /* JADX INFO: renamed from: z */
    public c4g0 f107771z;

    /* JADX INFO: renamed from: l.hhp$a */
    public class C17312a implements w9j<roj0, C22306c<j760>> {
        public C17312a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ j760 m131095a(User user, PartialListOpt partialListOpt) {
            return new j760(user, partialListOpt);
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C22306c<j760> call(roj0 roj0Var) {
            return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19669o0.m34326c4(((pip) hhp.this.viewModel).f149628T, ((pip) hhp.this.viewModel).f149629U), new x9j() { // from class: l.ghp
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return hhp.C17312a.m131095a((User) obj, (PartialListOpt) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.hhp$b */
    public static /* synthetic */ class C17313b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f107773a;

        static {
            int[] iArr = new int[HomeStatisticsHelper.ScActionName.values().length];
            f107773a = iArr;
            try {
                iArr[HomeStatisticsHelper.ScActionName.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107773a[HomeStatisticsHelper.ScActionName.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107773a[HomeStatisticsHelper.ScActionName.SUPER_LIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107773a[HomeStatisticsHelper.ScActionName.UNDO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f107773a[HomeStatisticsHelper.ScActionName.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public hhp(mcr mcrVar) {
        super(mcrVar);
        this.f107746a = false;
        this.f107747b = false;
        this.f107748c = "";
        this.f107749d = 0;
        this.f107750e = "";
        this.f107751f = false;
        this.f107752g = false;
        this.f107753h = true;
        this.f107754i = false;
        this.f107755j = C22392a.m221512b();
        this.f107756k = CoreModule.f17545c.f19669o0.f20063Y;
        this.f107757l = C22392a.m221512b();
        Boolean bool = Boolean.FALSE;
        this.f107758m = C22392a.m221513c(bool);
        this.f107759n = C22393b.m221521b();
        this.f107760o = false;
        this.f107761p = C22392a.m221513c(bool);
        this.f107762q = false;
        this.f107763r = true;
        this.f107764s = true;
        this.f107765t = 0L;
        this.f107768w = true;
        this.f107770y = C22392a.m221513c(bool);
        this.f107738A = new Runnable() { // from class: l.ggp
            @Override // java.lang.Runnable
            public final void run() {
                this.f102529a.m131012e2();
            }
        };
        this.f107740C = "";
        this.f107742E = false;
        this.f107743F = 0;
        this.f107744G = null;
        this.f107745H = adi0.INSTANCE.m95899d();
    }

    /* JADX INFO: renamed from: D2 */
    private void m130978D2() {
        wvv.m205772l(m131066e1(), new PermissionHelper.InterfaceC13129b() { // from class: l.qfp
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f154156a.m131074j2(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.rfp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f159170a.m131076k2(dialogInterface);
            }
        }, new Runnable() { // from class: l.sfp
            @Override // java.lang.Runnable
            public final void run() {
                this.f164325a.m131077l2();
            }
        }, new d30() { // from class: l.tfp
            @Override // p149l.d30
            public final void call() {
                ygh0.m214695n0(ygh0.f198173h);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m130980F0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: H2 */
    private boolean m130983H2() {
        return NullChecker.m81303a(CoreModule.f17545c.f19669o0.f20059U);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ C22306c m130984I0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m130987N0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public /* synthetic */ void m130988N1(String str) {
        if (NullChecker.m81303a(((pip) this.viewModel).m169729m0()) && NullChecker.m81303a(((pip) this.viewModel).m169729m0().mo38813j()) && TextUtils.equals(str, ((pip) this.viewModel).m169729m0().mo38813j().f19472id)) {
            this.f107739B = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m130990O1(String str) {
        ark.m98443Q0(m131066e1(), str, new d30() { // from class: l.ygp
            @Override // p149l.d30
            public final void call() {
                this.f198215a.m130998U1();
            }
        });
        CoreModule.f17545c.f19593O2.put("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public /* synthetic */ void m130992P1(j760 j760Var) {
        this.f107758m.m132487l(Boolean.FALSE);
        m131016h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public /* synthetic */ void m130996T1(roj0 roj0Var) {
        CoreModule.f17545c.f19669o0.m34329x3();
        this.f107755j.m132487l(roj0.f160388a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public /* synthetic */ void m130998U1() {
        ((pip) this.viewModel).m169719e0().startActivityForResult(MediaPickerAct.m47785g2(m131066e1(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender), 115);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public /* synthetic */ void m131000V1(Bundle bundle) {
        CoreModule.f17545c.f19669o0.m34328w3();
        CoreModule.f17545c.f19669o0.m34329x3();
        this.f107755j.m132487l(roj0.f160388a);
        ((pip) this.viewModel).m169679B0(true, true);
        this.f107760o = true;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ roj0 m131003Y0(C4319c c4319c, roj0 roj0Var, List list) {
        if (c4319c == C4319c.f15548i) {
            return roj0.f160388a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public /* synthetic */ void m131004Y1(C4319c c4319c) {
        ((pip) this.viewModel).m169748w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m131008c2(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.m81303a(((pip) this.viewModel).m169729m0())) {
            C7994d c7994dM131019j1 = m131019j1(m131066e1().pageId(), relationship.f38806id, ((pip) this.viewModel).m169729m0(), user);
            c7994dM131019j1.m38487v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m131092x2(c7994dM131019j1, "success");
        }
        this.f107753h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m131010d2(User user, Throwable th) {
        if (NullChecker.m81303a(((pip) this.viewModel).m169729m0())) {
            m131091w2(m131019j1(m131066e1().pageId(), "", ((pip) this.viewModel).m169729m0(), user), th);
        }
        this.f107753h = true;
        lsi0.m151570H(m131066e1().getResources().getString(R$string.f18804oq), m131066e1().getResources().getDrawable(x2c0.f190665vu), m131066e1().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m131011e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m131012e2() {
        this.f107753h = false;
        HashMap map = new HashMap();
        map.put("sourcepage", "tribe-" + ((pip) this.viewModel).f149629U);
        map.put("actiontype", f107736I);
        C4748n c4748n = CoreModule.f17545c.f19669o0;
        final User user = c4748n.f20059U;
        if (NullChecker.m81303a(c4748n.f20060V)) {
            CoreModule.f17545c.f19669o0.f20060V.m223816clone();
        }
        C22306c<Relationship> c22306cM34327d4 = CoreModule.f17545c.f19669o0.m34327d4(map, "tribe-" + ((pip) this.viewModel).f149629U);
        if (NullChecker.m81303a(c22306cM34327d4)) {
            c22306cM34327d4.subscribe(mkd0.m154956H(new e30() { // from class: l.jgp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117814a.m131008c2(user, (Relationship) obj);
                }
            }, new e30() { // from class: l.kgp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123050a.m131010d2(user, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m81303a(((pip) this.viewModel).m169729m0())) {
            m131092x2(m131019j1(m131066e1().pageId(), "", ((pip) this.viewModel).m169729m0(), user), "");
        }
        this.f107753h = true;
        lsi0.m151570H(m131066e1().getResources().getString(R$string.f18804oq), m131066e1().getResources().getDrawable(x2c0.f190665vu), m131066e1().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: h1 */
    private void m131016h1() {
        IntlTribeSwipeAct intlTribeSwipeActM131066e1 = m131066e1();
        if (!NullChecker.m81303a(intlTribeSwipeActM131066e1) || intlTribeSwipeActM131066e1.isDialogShowing()) {
            this.f107755j.m132487l(roj0.f160388a);
            return;
        }
        if (vy8.m200606d()) {
            CoreModule.f17545c.f19639e0.f149341c0.put(Boolean.TRUE);
            ark.m98439O0(m131066e1(), "", new d30() { // from class: l.pgp
                @Override // p149l.d30
                public final void call() {
                    this.f148792a.m131056J1();
                }
            }, false);
        } else if (!m131067f1()) {
            this.f107755j.m132487l(roj0.f160388a);
        } else {
            CoreModule.f17545c.f19639e0.f149341c0.put(Boolean.TRUE);
            ark.m98439O0(intlTribeSwipeActM131066e1, "", new d30() { // from class: l.qgp
                @Override // p149l.d30
                public final void call() {
                    this.f154365a.m131057L1();
                }
            }, true);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private C7994d m131019j1(String str, String str2, wsf0 wsf0Var, User user) {
        String str3;
        int size;
        int iM34298A3 = CoreModule.f17545c.f19669o0.m34298A3() - 1;
        if (!NullChecker.m81303a(user) || iM34298A3 < 0 || user.pictures.size() <= iM34298A3) {
            str3 = "";
            size = 0;
        } else {
            str3 = user.pictures.get(iM34298A3).url;
            size = user.pictures.size();
        }
        C7994d c7994dM36702h = HomeStatisticsHelper.m36702h(str, str2, wsf0Var);
        c7994dM36702h.m38461B(str3);
        c7994dM36702h.m38491z(iM34298A3);
        c7994dM36702h.m38460A(size);
        return c7994dM36702h;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m131021l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void m131077l2() {
        ((pip) this.viewModel).m169724j0().m47361e(LocationPermissionView.LocationPermissionState.requested);
        if (this.f107763r) {
            this.f107763r = false;
            this.f107755j.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m131028q1(Intent intent) {
        String stringExtra = intent.getStringExtra("heart_confession_uid");
        String stringExtra2 = intent.getStringExtra("heart_confession_content");
        CoreSuggested.UserInfo userInfoMo38813j = ((pip) this.viewModel).m169729m0().mo38813j();
        String str = NullChecker.m81303a(userInfoMo38813j) ? userInfoMo38813j.f19472id : "";
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return;
        }
        this.f107766u = stringExtra;
        this.f107767v = stringExtra2;
    }

    /* JADX INFO: renamed from: q2 */
    private void m131029q2(final ArrayList<Media> arrayList, final String str) {
        ((pip) this.viewModel).m169719e0().m20595o4(R$string.f17842J5);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.sgp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hhp.m130984I0((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.tgp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170110a.m131070g2(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ugp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176408a.m131071h2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    private void m131032s1() {
        duringCreated(CoreModule.f17545c.f19678r0.f20028i0).subscribe(mkd0.m154955G(new e30() { // from class: l.egp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90968a.m130988N1((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    private void m131034t1() {
        duringCreated(CoreModule.f17545c.f19593O2.obs()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.pfp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.agp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69386a.m130990O1((String) obj);
            }
        }));
        duringCreated(mkd0.m154984r(lifecycle(), this.f107758m, new el30()).filter(new w9j() { // from class: l.lgp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.f116564a == C4319c.f15548i && ((Boolean) j760Var.f116565b).booleanValue());
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.wgp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186212a.m130992P1((j760) obj);
            }
        }));
        duringCreated((C22306c) this.f107755j.switchMap(new C17312a())).subscribe(mkd0.m154955G(new e30() { // from class: l.ahp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69675a.m131059R1((j760) obj);
            }
        }));
        duringCreated(mkd0.m154985s(lifecycle(), this.f107757l, CoreModule.f17545c.f19654j0.m30580E4().take(1), new y9j() { // from class: l.bhp
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return hhp.m131003Y0((C4319c) obj, (roj0) obj2, (List) obj3);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.chp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80991a.m131060S1((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.m31110h9()).subscribe(mkd0.m154955G(new e30() { // from class: l.dhp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86314a.m130996T1((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    private void m131036u1() {
        this.f107756k.m132487l(null);
        creates(new e30() { // from class: l.cgp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80786a.m131000V1((Bundle) obj);
            }
        }, new d30() { // from class: l.dgp
            @Override // p149l.d30
            public final void call() {
                hhp.m130987N0();
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    private void m131037u2() {
        mkd0.m154992z(this.f107771z);
        this.f107771z = null;
    }

    /* JADX INFO: renamed from: v1 */
    private void m131038v1() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.fgp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97392a.m131062X1((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x1 */
    private void m131040x1() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.ehp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fhp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97536a.m131004Y1((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z1 */
    private void m131043z1() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).switchMap(new w9j() { // from class: l.ufp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176297a.m131063Z1((User) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vfp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181293a.m131064a2((roj0) obj);
            }
        }));
        cxf.m109094f().m109096e(duringCreated(CoreModule.f17545c.f19639e0.m169523o9()), m131066e1(), ((pip) this.viewModel).m169719e0(), 115);
        duringCreated(CoreModule.f17545c.f19639e0.m169556wa()).subscribe(mkd0.m154955G(new e30() { // from class: l.wfp
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169552va(-1);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.xfp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.yfp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.zfp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202973a.m131065b2((String) obj);
            }
        }, new e30() { // from class: l.bgp
            @Override // p149l.e30
            public final void call(Object obj) {
                hhp.m131021l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A2 */
    public void m131044A2(String str) {
        this.f107740C = str;
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m131045B1(String str) {
        return TextUtils.equals(this.f107750e, str);
    }

    /* JADX INFO: renamed from: B2 */
    public void m131046B2(boolean z) {
        this.f107747b = z;
    }

    /* JADX INFO: renamed from: C1 */
    public boolean m131047C1(String str) {
        return (TextUtils.isEmpty(this.f107766u) || !this.f107766u.equals(str) || TextUtils.isEmpty(this.f107767v)) ? false : true;
    }

    /* JADX INFO: renamed from: C2 */
    public void m131048C2(boolean z) {
        this.f107746a = z;
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m131049D1() {
        return this.f107742E;
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m131050E1() {
        return this.f107747b;
    }

    /* JADX INFO: renamed from: E2 */
    public boolean m131051E2(boolean z) {
        return m131053F2(z, false);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m131052F1() {
        return this.f107746a;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX INFO: renamed from: F2 */
    public boolean m131053F2(boolean z, boolean z2) {
        User user;
        C7994d c7994dM36698d;
        UssTags ussTags;
        boolean z3;
        int iM34298A3;
        String str = "";
        if (z) {
            c7994dM36698d = HomeStatisticsHelper.m36698d(((pip) this.viewModel).m169729m0() == null ? null : ((pip) this.viewModel).m169729m0().mo38818o(), true, this.f107754i, SwipeDirection.UP, ((pip) this.viewModel).m169729m0());
            user = null;
        } else {
            User user2 = CoreModule.f17545c.f19669o0.f20059U;
            C7994d c7994dM36702h = HomeStatisticsHelper.m36702h(m131066e1().pageId(), user2 == null ? "" : user2.f56011id, ((pip) this.viewModel).m169729m0());
            c7994dM36702h.m38487v((user2 == null || (ussTags = user2.ussTags) == null) ? "" : ussTags.eventInfo);
            user = user2;
            c7994dM36698d = c7994dM36702h;
        }
        int size = 0;
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            m131092x2(c7994dM36698d, "failJailedUser");
            return false;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        VerificationLimit verificationLimit = counterM31484o3 != null ? counterM31484o3.verification : null;
        if (TextUtils.equals(((pip) this.viewModel).f149629U, "certified") && xma.m210071e4() && verificationLimit != null && verificationLimit.tribeSwipeCount >= verificationLimit.tribeTotalCount) {
            CoreModule.m29935P().m94651a().mo33565pr(m131066e1(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.intl_advanced_filter);
            return false;
        }
        KeyEvent.Callback callbackMo38809d = ((pip) this.viewModel).m169729m0().mo38809d();
        if (!NullChecker.m81303a(callbackMo38809d) || (((callbackMo38809d instanceof d5m) && ((d5m) callbackMo38809d).mo36902k0()) || !this.f107753h)) {
            return false;
        }
        if (z) {
            ((pip) this.viewModel).m169729m0().mo38801A(SwipeDirection.UP);
            return false;
        }
        if (m130983H2()) {
            CoreSuggested.UserInfo userInfo = CoreModule.f17545c.f19669o0.f20060V;
            if (u59.m191827f0() && NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.letter)) {
                lsi0.m151593w(R$string.f18289Y2);
            } else {
                CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
                CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.undoLimit;
                if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.f154693H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
                    if (this.f107753h && CoreModule.f17545c.f19669o0.f20060V.canUndo) {
                        this.f107738A.run();
                        if (ogl0.m164247Z()) {
                            wge0.m203034f().m203040i(userInfo.f19472id);
                            zvf0.m220371D("e_undo_superlike", m131066e1().pageId(), vwb.m200311Y("other_user_id", userInfo.f19472id), vwb.m200311Y("superlike_quantity", Integer.valueOf(wge0.m203034f().m203037d(userInfo.f19472id))));
                        }
                        z3 = true;
                    }
                    boolean z4 = z3;
                    if (!z3) {
                        iM34298A3 = CoreModule.f17545c.f19669o0.m34298A3() - 1;
                        if (NullChecker.m81303a(user) && iM34298A3 >= 0 && user.pictures.size() > iM34298A3) {
                            str = user.pictures.get(iM34298A3).url;
                            size = user.pictures.size();
                        }
                        c7994dM36698d.m38461B(str);
                        c7994dM36698d.m38491z(iM34298A3);
                        c7994dM36698d.m38460A(size);
                        m131092x2(c7994dM36698d, "failUndoLocal");
                    }
                    return z4;
                }
                C8764c.m53412M1(m131066e1(), "p_intl_tribe_swipe_view,e_undo_button,click", Privilege.vip_undo, null, null, false, CoreModule.f17545c.f19669o0.f20059U);
            }
        } else {
            CounterLikeLimit counterLikeLimit2 = counterM31484o3.likeLimit;
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counterM31484o3.undoLimit;
            if ((((long) (counterSuperlikeAndUndoLimit2.reset * 1000)) + counterLikeLimit2.serverTime) - qib0.f154693H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit2.remainToday() != 0) {
                xnj0.m210172a(m131066e1());
            } else {
                C8764c.m53412M1(m131066e1(), "p_intl_tribe_swipe_view,e_undo_button,click", Privilege.vip_undo, null, null, false, CoreModule.f17545c.f19669o0.f20059U);
            }
        }
        z3 = false;
        boolean z5 = z3;
        if (!z3) {
            iM34298A3 = CoreModule.f17545c.f19669o0.m34298A3() - 1;
            if (NullChecker.m81303a(user)) {
                str = user.pictures.get(iM34298A3).url;
                size = user.pictures.size();
            }
            c7994dM36698d.m38461B(str);
            c7994dM36698d.m38491z(iM34298A3);
            c7994dM36698d.m38460A(size);
            m131092x2(c7994dM36698d, "failUndoLocal");
        }
        return z5;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ Boolean m131054H1(j760 j760Var) {
        return Boolean.valueOf(this.f107743F == 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m131055I1(j760 j760Var) {
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
        this.f107743F = 0;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m131056J1() {
        this.f107755j.m132487l(roj0.f160388a);
        if (uq40.m194983y(m131066e1(), true)) {
            return;
        }
        this.f107761p.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m131057L1() {
        this.f107755j.m132487l(roj0.f160388a);
        if (uq40.m194983y(m131066e1(), true)) {
            return;
        }
        this.f107761p.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m131058Q1() {
        m131084p1();
        m131086r1();
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
    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m131059R1(j760 j760Var) {
        boolean z;
        PartialListOpt partialListOpt = (PartialListOpt) j760Var.f116565b;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM118839y = ((pip) this.viewModel).f149609F.m118839y(partialListOpt.loaded);
        if (TextUtils.isEmpty(this.f107750e) && !vwb.m200296J(listM118839y) && (!mah0.m153720m0() || !mah0.m153738y0(listM118839y.get(0).f19472id))) {
            this.f107750e = listM118839y.get(0).f19472id;
        }
        if (size != listM118839y.size()) {
            y1j.m212199h("moment render List refresh change " + size + Constants.SEPARATOR_COMMA + listM118839y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        if (z) {
            ((pip) this.viewModel).f149609F.m118836G(listM118839y);
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        this.f107751f = true;
        m131066e1().postDelayed(new Runnable() { // from class: l.rgp
            @Override // java.lang.Runnable
            public final void run() {
                this.f159278a.m131058Q1();
            }
        }, 100L);
        StringBuilder sb = new StringBuilder("moment render cards: ");
        sb.append(z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(zNeedRefresh);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(!partialListOpt.hasMore() && listM118839y.size() == 0);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(listM118839y.isEmpty());
        y1j.m212199h(sb.toString());
        if (partialListOpt.hasMore() || listM118839y.size() != 0) {
            boolean zIsEmpty = listM118839y.isEmpty();
            V v2 = this.viewModel;
            if (zIsEmpty) {
                ((pip) v2).m169747v1(true, true, true);
            } else {
                ((pip) v2).m169747v1(false, true, true);
            }
        } else {
            ((pip) this.viewModel).m169747v1(true, false, true);
        }
        if (((pip) this.viewModel).m169690J0() || this.f107757l.m221515e() != null) {
            return;
        }
        this.f107757l.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m131060S1(roj0 roj0Var) {
        if (NullChecker.m81303a(roj0Var)) {
            m131069g1();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m131061W1() {
        this.f107739B = false;
        ((pip) this.viewModel).m169729m0().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m131062X1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f107739B) {
            e51.m114743H(m131066e1(), new Runnable() { // from class: l.mgp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133709a.m131061W1();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ C22306c m131063Z1(User user) {
        return this.f107759n;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        m131036u1();
        m131034t1();
        m131043z1();
        m131038v1();
        m131040x1();
        m131032s1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m131064a2(roj0 roj0Var) {
        ark.m98449T0(m131066e1());
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m131065b2(String str) {
        Picture picture = new Picture();
        picture.url = str;
        qib0.f154691G.m102312B0(((pip) this.viewModel).m169722h0(), picture.profile480());
        qib0.f154691G.m102312B0(((pip) this.viewModel).m169717d0(), picture.profile480());
    }

    @Override // p149l.q0m
    public void destroy() {
        if (this.f107771z != null) {
            m131037u2();
        }
        cxf.m109094f().m109095d();
    }

    /* JADX INFO: renamed from: e1 */
    public IntlTribeSwipeAct m131066e1() {
        return ((pip) this.viewModel).getAct();
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m131067f1() {
        return (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "wechat") || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "qq")) && vy8.m200617o() && !CoreModule.f17545c.f19639e0.f149333b0.get().booleanValue();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m131068f2(String str, int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(((pip) this.viewModel).m169729m0())) {
            CoreSuggested.UserInfo userInfoMo38813j = ((pip) this.viewModel).m169729m0().mo38813j();
            if (NullChecker.m81303a(userInfoMo38813j) && TextUtils.equals(str, userInfoMo38813j.f19472id)) {
                SwipeDirection swipeDirection = SwipeDirection.UP;
                if (i != swipeDirection.getValue()) {
                    ((pip) this.viewModel).m169729m0().mo38801A(SwipeDirection.fromValue(i));
                } else if (((pip) this.viewModel).m169729m0().mo38808c(false)) {
                    if (i == swipeDirection.getValue() && u59.m191827f0() && NullChecker.m81303a(intent)) {
                        m131028q1(intent);
                    }
                    m131051E2(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m131069g1() {
        if (CoreModule.f17545c.f19639e0.m169527p9() == null) {
            this.f107743F = 1;
            if (NullChecker.m81303a(this.f107744G) && !this.f107744G.isUnsubscribed()) {
                this.f107744G.unsubscribe();
            }
            CrashHelper.m81296c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.m29931H().userId() + ", login: " + CoreModule.m29931H().signedIn_() + ", me == null"));
            this.f107744G = duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33073on(), CoreModule.f17545c.f19639e0.m169523o9(), new yn30())).filter(new w9j() { // from class: l.vgp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f181415a.m131054H1((j760) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.xgp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192781a.m131055I1((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m131070g2(ArrayList arrayList, String str, roj0 roj0Var) {
        ((pip) this.viewModel).m169719e0().m20599s4();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        ark.m98453V0(m131066e1(), false, (Media) arrayList.get(0), m131066e1().string(R$string.f18491el), new Runnable() { // from class: l.zgp
            @Override // java.lang.Runnable
            public final void run() {
                hhp.m131011e0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m214648G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m214703v();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m131071h2(Throwable th) {
        ((pip) this.viewModel).m169719e0().m20599s4();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: i1 */
    public void m131072i1() {
        this.f107767v = null;
        this.f107766u = null;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m131073i2(C22392a c22392a, Throwable th) {
        CoreModule.f17545c.f19669o0.m34316S3();
        if ((c22392a.m221515e() == null || ((PartialListOpt) c22392a.m221515e()).loaded.size() == 0) && ((pip) this.viewModel).m169690J0()) {
            this.f107742E = true;
            ((pip) this.viewModel).m169745u1(true, false);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m131074j2(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            ygh0.m214691l0(ygh0.f198173h);
        } else {
            ygh0.m214693m0(ygh0.f198173h, wvv.m205774n(m131066e1()) ? BLiveOperationTitleShowType.off : "on");
        }
        m131077l2();
    }

    /* JADX INFO: renamed from: k1 */
    public void m131075k1() {
        this.f107752g = true;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m131076k2(DialogInterface dialogInterface) {
        m131077l2();
    }

    /* JADX INFO: renamed from: m1 */
    public int m131078m1() {
        return this.f107749d;
    }

    /* JADX INFO: renamed from: m2 */
    public void m131079m2() {
        this.f107742E = false;
    }

    /* JADX INFO: renamed from: n1 */
    public String m131080n1() {
        return this.f107748c;
    }

    /* JADX INFO: renamed from: n2 */
    public void m131081n2(int i, final int i2, final Intent intent) {
        if (i != 114 || !NullChecker.m81303a(((pip) this.viewModel).m169729m0())) {
            if (i == 115 && i2 == -1) {
                m131029q2((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        jj4 jj4VarMo38818o = ((pip) this.viewModel).m169729m0().mo38818o();
        if (NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141745d())) {
            final String str = jj4VarMo38818o.m141745d().f56011id;
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                this.f107754i = true;
                lifecycle().takeFirst(new w9j() { // from class: l.hgp
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.igp
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f113140a.m131068f2(str, i2, intent, (C4319c) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public String m131082o1() {
        return this.f107740C;
    }

    /* JADX INFO: renamed from: o2 */
    public VSwipeStack.OnCardSwipeResult m131083o2(mol molVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f107741D == null) {
            this.f107741D = new j7h0();
        }
        if (this.f107751f) {
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
            ((pip) this.viewModel).m169705W(z3, z4).mo38358i();
        }
        if (z3) {
            V v2 = this.viewModel;
            if (z4) {
                ((pip) v2).m169720f0().reset();
            } else {
                ((pip) v2).m169731n0().reset();
            }
            ((pip) this.viewModel).m169716c0().reset();
        } else {
            ((pip) this.viewModel).m169720f0().reset();
            ((pip) this.viewModel).m169731n0().reset();
        }
        molVar.mo36898j0(swipeDirection);
        HomeStatisticsHelper.m36691E("card");
        HomeStatisticsHelper.m36692F("swipe");
        f3a f3aVar = CoreModule.f17545c.f19622Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        f3aVar.m119255e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = this.f107741D.mo37497a(new j7h0.C17710a(this, (pip) this.viewModel, molVar.getCardDataProxy(), swipeDirection, z));
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo37497a == onCardSwipeResult) {
            CoreModule.f17545c.f19622Y0.m119256f();
        }
        if (onCardSwipeResultMo37497a == VSwipeStack.OnCardSwipeResult.back || onCardSwipeResultMo37497a == onCardSwipeResult) {
            m131072i1();
        }
        this.f107754i = false;
        if (!IntlCountryCodeController.m28126v()) {
            return onCardSwipeResultMo37497a;
        }
        ((pip) this.viewModel).m169749y1(onCardSwipeResultMo37497a, swipeDirection);
        return onCardSwipeResultMo37497a != onCardSwipeResult ? VSwipeStack.OnCardSwipeResult.stay : onCardSwipeResultMo37497a;
    }

    /* JADX INFO: renamed from: p1 */
    public void m131084p1() {
        if (!xij0.m209661d0() || m131066e1().lifecycle_() != C4319c.f15548i || ((pip) this.viewModel).m169686G0() || ((pip) this.viewModel).m169719e0().isHidden()) {
            return;
        }
        Object objMo38809d = ((pip) this.viewModel).m169729m0() == null ? null : ((pip) this.viewModel).m169729m0().mo38809d();
        if (NullChecker.m81303a(objMo38809d) && (objMo38809d instanceof d5m)) {
            d5m d5mVar = (d5m) objMo38809d;
            if (d5mVar.mo36947y()) {
                d5mVar.mo36830L();
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void m131085p2(boolean z) {
        this.f107769x = z;
        this.f107770y.m132487l(Boolean.valueOf(z));
        if (!z) {
            CoreModule.f17545c.f19639e0.m169397H9();
            if (this.f107752g) {
                this.f107752g = false;
                if (NullChecker.m81303a(((pip) this.viewModel).m169729m0()) && NullChecker.m81303a(((pip) this.viewModel).m169729m0().mo38813j())) {
                    o6j0.m162864h("e_intl_tribe_card", "p_intl_tribe_swipe_view", o6j0.C18854a.m162878h("intl_tribe_source_name", ((pip) this.viewModel).f149629U), o6j0.C18854a.m162878h("receiver_user_id", ((pip) this.viewModel).m169729m0().mo38813j().f19472id));
                    HomeStatisticsHelper.m36703i(((pip) this.viewModel).m169729m0().mo38813j(), m131066e1().pageId());
                    jj4 jj4VarMo38818o = ((pip) this.viewModel).m169729m0().mo38818o();
                    String strPageId = m131066e1().pageId();
                    String str = this.f107748c;
                    HomeStatisticsHelper.m36712r(jj4VarMo38818o, strPageId, str, m131045B1(str));
                }
            }
        }
        ((pip) this.viewModel).m169732n1(z);
        if (this.f107769x) {
            return;
        }
        if (this.f107768w) {
            this.f107768w = false;
            return;
        }
        if (this.f107760o) {
            if (this.f107756k.m221515e() == null || vwb.m200296J(this.f107756k.m221515e().loaded)) {
                CoreModule.f17545c.f19669o0.m34329x3();
                this.f107755j.m132487l(roj0.f160388a);
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m131086r1() {
        if (m131066e1().lifecycle_() != C4319c.f15548i || ((pip) this.viewModel).m169686G0() || ((pip) this.viewModel).m169719e0().isHidden() || !((pip) this.viewModel).m169678A1()) {
            return;
        }
        if (C8609a.f32670f) {
            C8609a.f32670f = false;
            ((pip) this.viewModel).m169680B1();
        }
        if (e2s.m114523d()) {
            e2s.m114524e(false);
            ((pip) this.viewModel).m169680B1();
        }
        if (xdl0.m208349O0(((pip) this.viewModel).m169711Z())) {
            return;
        }
        ((pip) this.viewModel).m169680B1();
    }

    /* JADX INFO: renamed from: r2 */
    public void m131087r2() {
        if (SystemClock.uptimeMillis() - this.f107765t >= 2000) {
            this.f107765t = SystemClock.uptimeMillis();
            m131090v2(true);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m131088s2(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
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
            ygh0.m214693m0(ygh0.f198173h, wvv.m205774n(m131066e1()) ? BLiveOperationTitleShowType.off : "on");
        }
        if (i == 1792) {
            if (!z) {
                m130978D2();
                return;
            }
            ((pip) this.viewModel).m169724j0().m47361e(LocationPermissionView.LocationPermissionState.requested);
            if (this.f107763r) {
                this.f107763r = false;
                if (this.f107762q) {
                    return;
                }
                this.f107755j.m132487l(roj0.f160388a);
            }
        }
    }

    /* JADX INFO: renamed from: t2 */
    public void m131089t2() {
        this.f107764s = false;
        ((pip) this.viewModel).m169742s1();
    }

    /* JADX INFO: renamed from: v2 */
    public void m131090v2(boolean z) {
        final C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = this.f107756k;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = c22392a.m221515e();
        if (z || partialListOptM221515e == null || partialListOptM221515e.hasMore()) {
            C4748n c4748n = CoreModule.f17545c.f19669o0;
            V v2 = this.viewModel;
            duringCreated(c4748n.m34310M3(((pip) v2).f149628T, ((pip) v2).f149629U)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.ngp
                @Override // p149l.e30
                public final void call(Object obj) {
                    hhp.m130980F0((roj0) obj);
                }
            }, new e30() { // from class: l.ogp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143888a.m131073i2(c22392a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m131091w2(C7994d c7994d, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
        this.f107754i = false;
        sbp.m183242b();
    }

    /* JADX INFO: renamed from: x2 */
    public void m131092x2(C7994d c7994d, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "success")) {
            zvf0.m220371D("e_user_cant_rightswipe_reason", m131066e1().pageId(), vwb.m200311Y("reason_type", str));
        }
        int i = C17313b.f107773a[c7994d.m38476k().ordinal()];
        if (i == 1) {
            str2 = "right";
        } else if (i == 2) {
            str2 = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i == 3) {
            str2 = "up";
        } else if (i != 4) {
            str2 = i != 5 ? CardButtonsShowAndHideType.unknow : "unkown";
        } else {
            str2 = "back";
        }
        o6j0.m162863g("e_intl_tribe_card", m131066e1().pageId(), o6j0.C18854a.m162878h("direction", str2), o6j0.C18854a.m162878h("intl_tribe_source_name", ((pip) this.viewModel).f149629U));
        HomeStatisticsHelper.m36688B(c7994d, str);
        this.f107754i = false;
        sbp.m183242b();
    }

    /* JADX INFO: renamed from: y2 */
    public void m131093y2(int i) {
        this.f107749d = i;
    }

    /* JADX INFO: renamed from: z2 */
    public void m131094z2(String str) {
        this.f107748c = str;
    }
}
