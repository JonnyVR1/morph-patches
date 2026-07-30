package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4899n;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
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
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.data.VerificationLimit;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class hjp extends ar2<pkp> {

    /* JADX INFO: renamed from: I */
    public static String f110254I = "click";

    /* JADX INFO: renamed from: J */
    public static String f110255J = "swipe";

    /* JADX INFO: renamed from: A */
    public Runnable f110256A;

    /* JADX INFO: renamed from: B */
    public boolean f110257B;

    /* JADX INFO: renamed from: C */
    public String f110258C;

    /* JADX INFO: renamed from: D */
    public g6m<rfh0.C19824a, VSwipeStack.OnCardSwipeResult> f110259D;

    /* JADX INFO: renamed from: E */
    public boolean f110260E;

    /* JADX INFO: renamed from: F */
    public int f110261F;

    /* JADX INFO: renamed from: G */
    public kcg0 f110262G;

    /* JADX INFO: renamed from: H */
    public long f110263H;

    /* JADX INFO: renamed from: a */
    public boolean f110264a;

    /* JADX INFO: renamed from: b */
    public boolean f110265b;

    /* JADX INFO: renamed from: c */
    public String f110266c;

    /* JADX INFO: renamed from: d */
    public int f110267d;

    /* JADX INFO: renamed from: e */
    public String f110268e;

    /* JADX INFO: renamed from: f */
    public boolean f110269f;

    /* JADX INFO: renamed from: g */
    public boolean f110270g;

    /* JADX INFO: renamed from: h */
    public boolean f110271h;

    /* JADX INFO: renamed from: i */
    public boolean f110272i;

    /* JADX INFO: renamed from: j */
    public C22507a<uxj0> f110273j;

    /* JADX INFO: renamed from: k */
    public C22507a<PartialListOpt<CoreSuggested.UserInfo>> f110274k;

    /* JADX INFO: renamed from: l */
    public C22507a<uxj0> f110275l;

    /* JADX INFO: renamed from: m */
    public C22507a<Boolean> f110276m;

    /* JADX INFO: renamed from: n */
    public C22508b<uxj0> f110277n;

    /* JADX INFO: renamed from: o */
    public boolean f110278o;

    /* JADX INFO: renamed from: p */
    public C22507a<Boolean> f110279p;

    /* JADX INFO: renamed from: q */
    public boolean f110280q;

    /* JADX INFO: renamed from: r */
    public boolean f110281r;

    /* JADX INFO: renamed from: s */
    public boolean f110282s;

    /* JADX INFO: renamed from: t */
    public long f110283t;

    /* JADX INFO: renamed from: u */
    public String f110284u;

    /* JADX INFO: renamed from: v */
    public String f110285v;

    /* JADX INFO: renamed from: w */
    public boolean f110286w;

    /* JADX INFO: renamed from: x */
    public boolean f110287x;

    /* JADX INFO: renamed from: y */
    public C22507a<Boolean> f110288y;

    /* JADX INFO: renamed from: z */
    public kcg0 f110289z;

    /* JADX INFO: renamed from: l.hjp$a */
    public class C17473a implements qcj<uxj0, C22421c<pf60>> {
        public C17473a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ pf60 m135499a(User user, PartialListOpt partialListOpt) {
            return new pf60(user, partialListOpt);
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C22421c<pf60> call(uxj0 uxj0Var) {
            return psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20411o0.m35329c4(((pkp) hjp.this.viewModel).f152895T, ((pkp) hjp.this.viewModel).f152896U), new rcj() { // from class: l.gjp
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return hjp.C17473a.m135499a((User) obj, (PartialListOpt) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.hjp$b */
    public static /* synthetic */ class C17474b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f110291a;

        static {
            int[] iArr = new int[HomeStatisticsHelper.ScActionName.values().length];
            f110291a = iArr;
            try {
                iArr[HomeStatisticsHelper.ScActionName.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f110291a[HomeStatisticsHelper.ScActionName.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f110291a[HomeStatisticsHelper.ScActionName.SUPER_LIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f110291a[HomeStatisticsHelper.ScActionName.UNDO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f110291a[HomeStatisticsHelper.ScActionName.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public hjp(ner nerVar) {
        super(nerVar);
        this.f110264a = false;
        this.f110265b = false;
        this.f110266c = "";
        this.f110267d = 0;
        this.f110268e = "";
        this.f110269f = false;
        this.f110270g = false;
        this.f110271h = true;
        this.f110272i = false;
        this.f110273j = C22507a.m222758b();
        this.f110274k = CoreModule.f18264c.f20411o0.f20805Y;
        this.f110275l = C22507a.m222758b();
        Boolean bool = Boolean.FALSE;
        this.f110276m = C22507a.m222759c(bool);
        this.f110277n = C22508b.m222767b();
        this.f110278o = false;
        this.f110279p = C22507a.m222759c(bool);
        this.f110280q = false;
        this.f110281r = true;
        this.f110282s = true;
        this.f110283t = 0L;
        this.f110286w = true;
        this.f110288y = C22507a.m222759c(bool);
        this.f110256A = new Runnable() { // from class: l.gip
            @Override // java.lang.Runnable
            public final void run() {
                this.f104516a.m135416e2();
            }
        };
        this.f110258C = "";
        this.f110260E = false;
        this.f110261F = 0;
        this.f110262G = null;
        this.f110263H = ami0.INSTANCE.m98830d();
    }

    /* JADX INFO: renamed from: D2 */
    private void m135382D2() {
        xxv.m213585l(m135470e1(), new PermissionHelper.InterfaceC13292b() { // from class: l.qhp
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f157743a.m135478j2(z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.rhp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f163188a.m135480k2(dialogInterface);
            }
        }, new Runnable() { // from class: l.shp
            @Override // java.lang.Runnable
            public final void run() {
                this.f168736a.m135481l2();
            }
        }, new x20() { // from class: l.thp
            @Override // p153l.x20
            public final void call() {
                fph0.m126683n0(fph0.f100175h);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m135384F0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: H2 */
    private boolean m135387H2() {
        return NullChecker.m82486a(CoreModule.f18264c.f20411o0.f20801U);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ C22421c m135388I0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m135391N0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public /* synthetic */ void m135392N1(String str) {
        if (NullChecker.m82486a(((pkp) this.viewModel).m172725m0()) && NullChecker.m82486a(((pkp) this.viewModel).m172725m0().mo39816j()) && TextUtils.equals(str, ((pkp) this.viewModel).m172725m0().mo39816j().f20214id)) {
            this.f110257B = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m135394O1(String str) {
        qtk.m177993Q0(m135470e1(), str, new x20() { // from class: l.yip
            @Override // p153l.x20
            public final void call() {
                this.f200230a.m135402U1();
            }
        });
        CoreModule.f18264c.f20335O2.put("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public /* synthetic */ void m135396P1(pf60 pf60Var) {
        this.f110276m.m137019l(Boolean.FALSE);
        m135420h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public /* synthetic */ void m135400T1(uxj0 uxj0Var) {
        CoreModule.f18264c.f20411o0.m35332x3();
        this.f110273j.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public /* synthetic */ void m135402U1() {
        ((pkp) this.viewModel).m172715e0().startActivityForResult(MediaPickerAct.m48968h2(m135470e1(), 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender), 115);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public /* synthetic */ void m135404V1(Bundle bundle) {
        CoreModule.f18264c.f20411o0.m35331w3();
        CoreModule.f18264c.f20411o0.m35332x3();
        this.f110273j.m137019l(uxj0.f181467a);
        ((pkp) this.viewModel).m172675B0(true, true);
        this.f110278o = true;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ uxj0 m135407Y0(C4470c c4470c, uxj0 uxj0Var, List list) {
        if (c4470c == C4470c.f16267i) {
            return uxj0.f181467a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public /* synthetic */ void m135408Y1(C4470c c4470c) {
        ((pkp) this.viewModel).m172744w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m135412c2(User user, Relationship relationship) {
        UssTags ussTags;
        if (NullChecker.m82486a(((pkp) this.viewModel).m172725m0())) {
            C8145d c8145dM135423j1 = m135423j1(m135470e1().pageId(), relationship.f39654id, ((pkp) this.viewModel).m172725m0(), user);
            c8145dM135423j1.m39490v((user == null || (ussTags = user.ussTags) == null) ? "" : ussTags.eventInfo);
            m135496x2(c8145dM135423j1, "success");
        }
        this.f110271h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m135414d2(User user, Throwable th) {
        if (NullChecker.m82486a(((pkp) this.viewModel).m172725m0())) {
            m135495w2(m135423j1(m135470e1().pageId(), "", ((pkp) this.viewModel).m172725m0(), user), th);
        }
        this.f110271h = true;
        o1j0.m165626H(m135470e1().getResources().getString(R$string.f18591Jq), m135470e1().getResources().getDrawable(dbc0.f87134jv), m135470e1().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m135415e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m135416e2() {
        this.f110271h = false;
        HashMap map = new HashMap();
        map.put("sourcepage", "tribe-" + ((pkp) this.viewModel).f152896U);
        map.put("actiontype", f110254I);
        C4899n c4899n = CoreModule.f18264c.f20411o0;
        final User user = c4899n.f20801U;
        if (NullChecker.m82486a(c4899n.f20802V)) {
            CoreModule.f18264c.f20411o0.f20802V.m225062clone();
        }
        C22421c<Relationship> c22421cM35330d4 = CoreModule.f18264c.f20411o0.m35330d4(map, "tribe-" + ((pkp) this.viewModel).f152896U);
        if (NullChecker.m82486a(c22421cM35330d4)) {
            c22421cM35330d4.subscribe(psd0.m173597H(new y20() { // from class: l.jip
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121110a.m135412c2(user, (Relationship) obj);
                }
            }, new y20() { // from class: l.kip
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127013a.m135414d2(user, (Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m82486a(((pkp) this.viewModel).m172725m0())) {
            m135496x2(m135423j1(m135470e1().pageId(), "", ((pkp) this.viewModel).m172725m0(), user), "");
        }
        this.f110271h = true;
        o1j0.m165626H(m135470e1().getResources().getString(R$string.f18591Jq), m135470e1().getResources().getDrawable(dbc0.f87134jv), m135470e1().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: h1 */
    private void m135420h1() {
        IntlTribeSwipeAct intlTribeSwipeActM135470e1 = m135470e1();
        if (!NullChecker.m82486a(intlTribeSwipeActM135470e1) || intlTribeSwipeActM135470e1.isDialogShowing()) {
            this.f110273j.m137019l(uxj0.f181467a);
            return;
        }
        if (d09.m113367d()) {
            CoreModule.f18264c.f20381e0.f89198c0.put(Boolean.TRUE);
            qtk.m177989O0(m135470e1(), "", new x20() { // from class: l.pip
                @Override // p153l.x20
                public final void call() {
                    this.f152589a.m135460J1();
                }
            }, false);
        } else if (!m135471f1()) {
            this.f110273j.m137019l(uxj0.f181467a);
        } else {
            CoreModule.f18264c.f20381e0.f89198c0.put(Boolean.TRUE);
            qtk.m177989O0(intlTribeSwipeActM135470e1, "", new x20() { // from class: l.qip
                @Override // p153l.x20
                public final void call() {
                    this.f157854a.m135461L1();
                }
            }, true);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private C8145d m135423j1(String str, String str2, f1g0 f1g0Var, User user) {
        String str3;
        int size;
        int iM35301A3 = CoreModule.f18264c.f20411o0.m35301A3() - 1;
        if (!NullChecker.m82486a(user) || iM35301A3 < 0 || user.pictures.size() <= iM35301A3) {
            str3 = "";
            size = 0;
        } else {
            str3 = user.pictures.get(iM35301A3).url;
            size = user.pictures.size();
        }
        C8145d c8145dM37705h = HomeStatisticsHelper.m37705h(str, str2, f1g0Var);
        c8145dM37705h.m39464B(str3);
        c8145dM37705h.m39494z(iM35301A3);
        c8145dM37705h.m39463A(size);
        return c8145dM37705h;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m135425l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void m135481l2() {
        ((pkp) this.viewModel).m172720j0().m48544e(LocationPermissionView.LocationPermissionState.requested);
        if (this.f110281r) {
            this.f110281r = false;
            this.f110273j.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: q1 */
    private void m135432q1(Intent intent) {
        String stringExtra = intent.getStringExtra("heart_confession_uid");
        String stringExtra2 = intent.getStringExtra("heart_confession_content");
        CoreSuggested.UserInfo userInfoMo39816j = ((pkp) this.viewModel).m172725m0().mo39816j();
        String str = NullChecker.m82486a(userInfoMo39816j) ? userInfoMo39816j.f20214id : "";
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return;
        }
        this.f110284u = stringExtra;
        this.f110285v = stringExtra2;
    }

    /* JADX INFO: renamed from: q2 */
    private void m135433q2(final ArrayList<Media> arrayList, final String str) {
        ((pkp) this.viewModel).m172715e0().m21594o4(R$string.f18632L5);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.sip
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hjp.m135388I0((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.tip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174488a.m135474g2(arrayList, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.uip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179139a.m135475h2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    private void m135436s1() {
        duringCreated(CoreModule.f18264c.f20420r0.f20770i0).subscribe(psd0.m173596G(new y20() { // from class: l.eip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94186a.m135392N1((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    private void m135438t1() {
        duringCreated(CoreModule.f18264c.f20335O2.obs()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.php
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((String) obj).equals(""));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.aip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71556a.m135394O1((String) obj);
            }
        }));
        duringCreated(psd0.m173625r(lifecycle(), this.f110276m, new st30()).filter(new qcj() { // from class: l.lip
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(pf60Var.f152156a == C4470c.f16267i && ((Boolean) pf60Var.f152157b).booleanValue());
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.wip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189378a.m135396P1((pf60) obj);
            }
        }));
        duringCreated((C22421c) this.f110273j.switchMap(new C17473a())).subscribe(psd0.m173596G(new y20() { // from class: l.ajp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71845a.m135463R1((pf60) obj);
            }
        }));
        duringCreated(psd0.m173626s(lifecycle(), this.f110275l, CoreModule.f18264c.f20396j0.m31583E4().take(1), new scj() { // from class: l.bjp
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return hjp.m135407Y0((C4470c) obj, (uxj0) obj2, (List) obj3);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.cjp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82206a.m135464S1((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.m32113h9()).subscribe(psd0.m173596G(new y20() { // from class: l.djp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88929a.m135400T1((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    private void m135440u1() {
        this.f110274k.m137019l(null);
        creates(new y20() { // from class: l.cip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81970a.m135404V1((Bundle) obj);
            }
        }, new x20() { // from class: l.dip
            @Override // p153l.x20
            public final void call() {
                hjp.m135391N0();
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    private void m135441u2() {
        psd0.m173633z(this.f110289z);
        this.f110289z = null;
    }

    /* JADX INFO: renamed from: v1 */
    private void m135442v1() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.fip
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99213a.m135466X1((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x1 */
    private void m135444x1() {
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.ejp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.fjp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99402a.m135408Y1((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z1 */
    private void m135447z1() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).switchMap(new qcj() { // from class: l.uhp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179046a.m135467Z1((User) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vhp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184184a.m135468a2((uxj0) obj);
            }
        }));
        qyf.m178643f().m178645e(duringCreated(CoreModule.f18264c.f20381e0.m116596o9()), m135470e1(), ((pkp) this.viewModel).m172715e0(), 115);
        duringCreated(CoreModule.f18264c.f20381e0.m116629wa()).subscribe(psd0.m173596G(new y20() { // from class: l.whp
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116625va(-1);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.xhp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new qcj() { // from class: l.yhp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().url;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.zhp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204442a.m135469b2((String) obj);
            }
        }, new y20() { // from class: l.bip
            @Override // p153l.y20
            public final void call(Object obj) {
                hjp.m135425l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A2 */
    public void m135448A2(String str) {
        this.f110258C = str;
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m135449B1(String str) {
        return TextUtils.equals(this.f110268e, str);
    }

    /* JADX INFO: renamed from: B2 */
    public void m135450B2(boolean z) {
        this.f110265b = z;
    }

    /* JADX INFO: renamed from: C1 */
    public boolean m135451C1(String str) {
        return (TextUtils.isEmpty(this.f110284u) || !this.f110284u.equals(str) || TextUtils.isEmpty(this.f110285v)) ? false : true;
    }

    /* JADX INFO: renamed from: C2 */
    public void m135452C2(boolean z) {
        this.f110264a = z;
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m135453D1() {
        return this.f110260E;
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m135454E1() {
        return this.f110265b;
    }

    /* JADX INFO: renamed from: E2 */
    public boolean m135455E2(boolean z) {
        return m135457F2(z, false);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m135456F1() {
        return this.f110264a;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX INFO: renamed from: F2 */
    public boolean m135457F2(boolean z, boolean z2) {
        User user;
        C8145d c8145dM37701d;
        UssTags ussTags;
        boolean z3;
        int iM35301A3;
        String str = "";
        if (z) {
            c8145dM37701d = HomeStatisticsHelper.m37701d(((pkp) this.viewModel).m172725m0() == null ? null : ((pkp) this.viewModel).m172725m0().mo39821o(), true, this.f110272i, SwipeDirection.UP, ((pkp) this.viewModel).m172725m0());
            user = null;
        } else {
            User user2 = CoreModule.f18264c.f20411o0.f20801U;
            C8145d c8145dM37705h = HomeStatisticsHelper.m37705h(m135470e1().pageId(), user2 == null ? "" : user2.f56859id, ((pkp) this.viewModel).m172725m0());
            c8145dM37705h.m39490v((user2 == null || (ussTags = user2.ussTags) == null) ? "" : ussTags.eventInfo);
            user = user2;
            c8145dM37701d = c8145dM37705h;
        }
        int size = 0;
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            m135496x2(c8145dM37701d, "failJailedUser");
            return false;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        VerificationLimit verificationLimit = counterM32487o3 != null ? counterM32487o3.verification : null;
        if (TextUtils.equals(((pkp) this.viewModel).f152896U, "certified") && joa.m146386f4() && verificationLimit != null && verificationLimit.tribeSwipeCount >= verificationLimit.tribeTotalCount) {
            CoreModule.m30933P().m143405a().mo34568pr(m135470e1(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.intl_advanced_filter);
            return false;
        }
        KeyEvent.Callback callbackMo39812d = ((pkp) this.viewModel).m172725m0().mo39812d();
        if (!NullChecker.m82486a(callbackMo39812d) || (((callbackMo39812d instanceof t7m) && ((t7m) callbackMo39812d).mo37905k0()) || !this.f110271h)) {
            return false;
        }
        if (z) {
            ((pkp) this.viewModel).m172725m0().mo39804A(SwipeDirection.UP);
            return false;
        }
        if (m135387H2()) {
            CoreSuggested.UserInfo userInfo = CoreModule.f18264c.f20411o0.f20802V;
            if (d79.m114685j0() && NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.letter)) {
                o1j0.m165649w(R$string.f19080a3);
            } else {
                CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
                CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.undoLimit;
                if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - uqb0.f180376H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
                    if (this.f110271h && CoreModule.f18264c.f20411o0.f20802V.canUndo) {
                        this.f110256A.run();
                        if (spl0.m187374Z()) {
                            bpe0.m105814f().m105820i(userInfo.f20214id);
                            i4g0.m138495D("e_undo_superlike", m135470e1().pageId(), jyb.m147494Y("other_user_id", userInfo.f20214id), jyb.m147494Y("superlike_quantity", Integer.valueOf(bpe0.m105814f().m105817d(userInfo.f20214id))));
                        }
                        z3 = true;
                    }
                    boolean z4 = z3;
                    if (!z3) {
                        iM35301A3 = CoreModule.f18264c.f20411o0.m35301A3() - 1;
                        if (NullChecker.m82486a(user) && iM35301A3 >= 0 && user.pictures.size() > iM35301A3) {
                            str = user.pictures.get(iM35301A3).url;
                            size = user.pictures.size();
                        }
                        c8145dM37701d.m39464B(str);
                        c8145dM37701d.m39494z(iM35301A3);
                        c8145dM37701d.m39463A(size);
                        m135496x2(c8145dM37701d, "failUndoLocal");
                    }
                    return z4;
                }
                C8927c.m54595M1(m135470e1(), "p_intl_tribe_swipe_view,e_undo_button,click", Privilege.vip_undo, null, null, false, CoreModule.f18264c.f20411o0.f20801U);
            }
        } else {
            CounterLikeLimit counterLikeLimit2 = counterM32487o3.likeLimit;
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counterM32487o3.undoLimit;
            if ((((long) (counterSuperlikeAndUndoLimit2.reset * 1000)) + counterLikeLimit2.serverTime) - uqb0.f180376H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit2.remainToday() != 0) {
                axj0.m100773a(m135470e1());
            } else {
                C8927c.m54595M1(m135470e1(), "p_intl_tribe_swipe_view,e_undo_button,click", Privilege.vip_undo, null, null, false, CoreModule.f18264c.f20411o0.f20801U);
            }
        }
        z3 = false;
        boolean z5 = z3;
        if (!z3) {
            iM35301A3 = CoreModule.f18264c.f20411o0.m35301A3() - 1;
            if (NullChecker.m82486a(user)) {
                str = user.pictures.get(iM35301A3).url;
                size = user.pictures.size();
            }
            c8145dM37701d.m39464B(str);
            c8145dM37701d.m39494z(iM35301A3);
            c8145dM37701d.m39463A(size);
            m135496x2(c8145dM37701d, "failUndoLocal");
        }
        return z5;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ Boolean m135458H1(pf60 pf60Var) {
        return Boolean.valueOf(this.f110261F == 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m135459I1(pf60 pf60Var) {
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
        this.f110261F = 0;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m135460J1() {
        this.f110273j.m137019l(uxj0.f181467a);
        if (iz40.m142788y(m135470e1(), true)) {
            return;
        }
        this.f110279p.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m135461L1() {
        this.f110273j.m137019l(uxj0.f181467a);
        if (iz40.m142788y(m135470e1(), true)) {
            return;
        }
        this.f110279p.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m135462Q1() {
        m135488p1();
        m135490r1();
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
    public final /* synthetic */ void m135463R1(pf60 pf60Var) {
        boolean z;
        PartialListOpt partialListOpt = (PartialListOpt) pf60Var.f152157b;
        int size = partialListOpt.loaded.size();
        boolean zNeedRefresh = partialListOpt.needRefresh();
        List<CoreSuggested.UserInfo> listM184956y = ((pkp) this.viewModel).f152876F.m184956y(partialListOpt.loaded);
        if (TextUtils.isEmpty(this.f110268e) && !jyb.m147479J(listM184956y) && (!uih0.m196214m0() || !uih0.m196232y0(listM184956y.get(0).f20214id))) {
            this.f110268e = listM184956y.get(0).f20214id;
        }
        if (size != listM184956y.size()) {
            t4j.m189282h("moment render List refresh change " + size + Constants.SEPARATOR_COMMA + listM184956y.size());
            z = true;
        } else {
            z = zNeedRefresh;
        }
        if (z) {
            ((pkp) this.viewModel).f152876F.m184953G(listM184956y);
        }
        if (!z) {
            partialListOpt.setRefreshValue(true);
        }
        this.f110269f = true;
        m135470e1().postDelayed(new Runnable() { // from class: l.rip
            @Override // java.lang.Runnable
            public final void run() {
                this.f163382a.m135462Q1();
            }
        }, 100L);
        StringBuilder sb = new StringBuilder("moment render cards: ");
        sb.append(z);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(zNeedRefresh);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(!partialListOpt.hasMore() && listM184956y.size() == 0);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(listM184956y.isEmpty());
        t4j.m189282h(sb.toString());
        if (partialListOpt.hasMore() || listM184956y.size() != 0) {
            boolean zIsEmpty = listM184956y.isEmpty();
            V v2 = this.viewModel;
            if (zIsEmpty) {
                ((pkp) v2).m172743v1(true, true, true);
            } else {
                ((pkp) v2).m172743v1(false, true, true);
            }
        } else {
            ((pkp) this.viewModel).m172743v1(true, false, true);
        }
        if (((pkp) this.viewModel).m172686J0() || this.f110275l.m222761e() != null) {
            return;
        }
        this.f110275l.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m135464S1(uxj0 uxj0Var) {
        if (NullChecker.m82486a(uxj0Var)) {
            m135473g1();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m135465W1() {
        this.f110257B = false;
        ((pkp) this.viewModel).m172725m0().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m135466X1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f110257B) {
            l51.m152888H(m135470e1(), new Runnable() { // from class: l.mip
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137006a.m135465W1();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ C22421c m135467Z1(User user) {
        return this.f110277n;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        m135440u1();
        m135438t1();
        m135447z1();
        m135442v1();
        m135444x1();
        m135436s1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m135468a2(uxj0 uxj0Var) {
        qtk.m177999T0(m135470e1());
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m135469b2(String str) {
        Picture picture = new Picture();
        picture.url = str;
        uqb0.f180374G.m127096B0(((pkp) this.viewModel).m172718h0(), picture.profile480());
        uqb0.f180374G.m127096B0(((pkp) this.viewModel).m172713d0(), picture.profile480());
    }

    @Override // p153l.k3m
    public void destroy() {
        if (this.f110289z != null) {
            m135441u2();
        }
        qyf.m178643f().m178644d();
    }

    /* JADX INFO: renamed from: e1 */
    public IntlTribeSwipeAct m135470e1() {
        return ((pkp) this.viewModel).getAct();
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m135471f1() {
        return (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "wechat") || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "qq")) && d09.m113378o() && !CoreModule.f18264c.f20381e0.f89190b0.get().booleanValue();
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m135472f2(String str, int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(((pkp) this.viewModel).m172725m0())) {
            CoreSuggested.UserInfo userInfoMo39816j = ((pkp) this.viewModel).m172725m0().mo39816j();
            if (NullChecker.m82486a(userInfoMo39816j) && TextUtils.equals(str, userInfoMo39816j.f20214id)) {
                SwipeDirection swipeDirection = SwipeDirection.UP;
                if (i != swipeDirection.getValue()) {
                    ((pkp) this.viewModel).m172725m0().mo39804A(SwipeDirection.fromValue(i));
                } else if (((pkp) this.viewModel).m172725m0().mo39811c(false)) {
                    if (i == swipeDirection.getValue() && d79.m114685j0() && NullChecker.m82486a(intent)) {
                        m135432q1(intent);
                    }
                    m135455E2(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m135473g1() {
        if (CoreModule.f18264c.f20381e0.m116600p9() == null) {
            this.f110261F = 1;
            if (NullChecker.m82486a(this.f110262G) && !this.f110262G.isUnsubscribed()) {
                this.f110262G.unsubscribe();
            }
            CrashHelper.m82479c(new IllegalStateException("checkIntro error when illegal account state, userId:" + CoreModule.m30929H().userId() + ", login: " + CoreModule.m30929H().signedIn_() + ", me == null"));
            this.f110262G = duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34076on(), CoreModule.f18264c.f20381e0.m116596o9(), new mw30())).filter(new qcj() { // from class: l.vip
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f184286a.m135458H1((pf60) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.xip
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194475a.m135459I1((pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m135474g2(ArrayList arrayList, String str, uxj0 uxj0Var) {
        ((pkp) this.viewModel).m172715e0().m21598s4();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        qtk.m178003V0(m135470e1(), false, (Media) arrayList.get(0), m135470e1().string(R$string.f18307Al), new Runnable() { // from class: l.zip
            @Override // java.lang.Runnable
            public final void run() {
                hjp.m135415e0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            fph0.m126636G();
        } else if (TextUtils.equals(str, "fakeView")) {
            fph0.m126691v();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m135475h2(Throwable th) {
        ((pkp) this.viewModel).m172715e0().m21598s4();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: i1 */
    public void m135476i1() {
        this.f110285v = null;
        this.f110284u = null;
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m135477i2(C22507a c22507a, Throwable th) {
        CoreModule.f18264c.f20411o0.m35319S3();
        if ((c22507a.m222761e() == null || ((PartialListOpt) c22507a.m222761e()).loaded.size() == 0) && ((pkp) this.viewModel).m172686J0()) {
            this.f110260E = true;
            ((pkp) this.viewModel).m172741u1(true, false);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m135478j2(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (permissionDeniedReason == PermissionHelper.PermissionDeniedReason.Null) {
            fph0.m126679l0(fph0.f100175h);
        } else {
            fph0.m126681m0(fph0.f100175h, xxv.m213587n(m135470e1()) ? BLiveOperationTitleShowType.off : "on");
        }
        m135481l2();
    }

    /* JADX INFO: renamed from: k1 */
    public void m135479k1() {
        this.f110270g = true;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m135480k2(DialogInterface dialogInterface) {
        m135481l2();
    }

    /* JADX INFO: renamed from: m1 */
    public int m135482m1() {
        return this.f110267d;
    }

    /* JADX INFO: renamed from: m2 */
    public void m135483m2() {
        this.f110260E = false;
    }

    /* JADX INFO: renamed from: n1 */
    public String m135484n1() {
        return this.f110266c;
    }

    /* JADX INFO: renamed from: n2 */
    public void m135485n2(int i, final int i2, final Intent intent) {
        if (i != 114 || !NullChecker.m82486a(((pkp) this.viewModel).m172725m0())) {
            if (i == 115 && i2 == -1) {
                m135433q2((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h), intent.getStringExtra("from"));
                return;
            }
            return;
        }
        ik4 ik4VarMo39821o = ((pkp) this.viewModel).m172725m0().mo39821o();
        if (NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140259d())) {
            final String str = ik4VarMo39821o.m140259d().f56859id;
            if (i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) {
                this.f110272i = true;
                lifecycle().takeFirst(new qcj() { // from class: l.hip
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.iip
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f115113a.m135472f2(str, i2, intent, (C4470c) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public String m135486o1() {
        return this.f110258C;
    }

    /* JADX INFO: renamed from: o2 */
    public VSwipeStack.OnCardSwipeResult m135487o2(xql xqlVar, SwipeDirection swipeDirection, boolean z) {
        if (this.f110259D == null) {
            this.f110259D = new rfh0();
        }
        if (this.f110269f) {
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
            ((pkp) this.viewModel).m172701W(z3, z4).mo39361i();
        }
        if (z3) {
            V v2 = this.viewModel;
            if (z4) {
                ((pkp) v2).m172716f0().reset();
            } else {
                ((pkp) v2).m172727n0().reset();
            }
            ((pkp) this.viewModel).m172712c0().reset();
        } else {
            ((pkp) this.viewModel).m172716f0().reset();
            ((pkp) this.viewModel).m172727n0().reset();
        }
        xqlVar.mo37901j0(swipeDirection);
        HomeStatisticsHelper.m37694E("card");
        HomeStatisticsHelper.m37695F("swipe");
        r4a r4aVar = CoreModule.f18264c.f20364Y0;
        if (swipeDirection != swipeDirection2 && swipeDirection != swipeDirection3) {
            z2 = false;
        }
        r4aVar.m179746e(z2);
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = this.f110259D.mo38500a(new rfh0.C19824a(this, (pkp) this.viewModel, xqlVar.getCardDataProxy(), swipeDirection, z));
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        if (onCardSwipeResultMo38500a == onCardSwipeResult) {
            CoreModule.f18264c.f20364Y0.m179747f();
        }
        if (onCardSwipeResultMo38500a == VSwipeStack.OnCardSwipeResult.back || onCardSwipeResultMo38500a == onCardSwipeResult) {
            m135476i1();
        }
        this.f110272i = false;
        if (!IntlCountryCodeController.m29125v()) {
            return onCardSwipeResultMo38500a;
        }
        ((pkp) this.viewModel).m172745y1(onCardSwipeResultMo38500a, swipeDirection);
        return onCardSwipeResultMo38500a != onCardSwipeResult ? VSwipeStack.OnCardSwipeResult.stay : onCardSwipeResultMo38500a;
    }

    /* JADX INFO: renamed from: p1 */
    public void m135488p1() {
        if (!asj0.m99935d0() || m135470e1().lifecycle_() != C4470c.f16267i || ((pkp) this.viewModel).m172682G0() || ((pkp) this.viewModel).m172715e0().isHidden()) {
            return;
        }
        Object objMo39812d = ((pkp) this.viewModel).m172725m0() == null ? null : ((pkp) this.viewModel).m172725m0().mo39812d();
        if (NullChecker.m82486a(objMo39812d) && (objMo39812d instanceof t7m)) {
            t7m t7mVar = (t7m) objMo39812d;
            if (t7mVar.mo37950y()) {
                t7mVar.mo37833L();
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void m135489p2(boolean z) {
        this.f110287x = z;
        this.f110288y.m137019l(Boolean.valueOf(z));
        if (!z) {
            CoreModule.f18264c.f20381e0.m116470H9();
            if (this.f110270g) {
                this.f110270g = false;
                if (NullChecker.m82486a(((pkp) this.viewModel).m172725m0()) && NullChecker.m82486a(((pkp) this.viewModel).m172725m0().mo39816j())) {
                    sfj0.m185601h("e_intl_tribe_card", "p_intl_tribe_swipe_view", sfj0.C20032a.m185615h("intl_tribe_source_name", ((pkp) this.viewModel).f152896U), sfj0.C20032a.m185615h("receiver_user_id", ((pkp) this.viewModel).m172725m0().mo39816j().f20214id));
                    HomeStatisticsHelper.m37706i(((pkp) this.viewModel).m172725m0().mo39816j(), m135470e1().pageId());
                    ik4 ik4VarMo39821o = ((pkp) this.viewModel).m172725m0().mo39821o();
                    String strPageId = m135470e1().pageId();
                    String str = this.f110266c;
                    HomeStatisticsHelper.m37715r(ik4VarMo39821o, strPageId, str, m135449B1(str));
                }
            }
        }
        ((pkp) this.viewModel).m172728n1(z);
        if (this.f110287x) {
            return;
        }
        if (this.f110286w) {
            this.f110286w = false;
            return;
        }
        if (this.f110278o) {
            if (this.f110274k.m222761e() == null || jyb.m147479J(this.f110274k.m222761e().loaded)) {
                CoreModule.f18264c.f20411o0.m35332x3();
                this.f110273j.m137019l(uxj0.f181467a);
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m135490r1() {
        if (m135470e1().lifecycle_() != C4470c.f16267i || ((pkp) this.viewModel).m172682G0() || ((pkp) this.viewModel).m172715e0().isHidden() || !((pkp) this.viewModel).m172674A1()) {
            return;
        }
        if (C8772a.f33518f) {
            C8772a.f33518f = false;
            ((pkp) this.viewModel).m172676B1();
        }
        if (f4s.m124037d()) {
            f4s.m124038e(false);
            ((pkp) this.viewModel).m172676B1();
        }
        if (bnl0.m105529O0(((pkp) this.viewModel).m172707Z())) {
            return;
        }
        ((pkp) this.viewModel).m172676B1();
    }

    /* JADX INFO: renamed from: r2 */
    public void m135491r2() {
        if (SystemClock.uptimeMillis() - this.f110283t >= 2000) {
            this.f110283t = SystemClock.uptimeMillis();
            m135494v2(true);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m135492s2(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
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
            fph0.m126681m0(fph0.f100175h, xxv.m213587n(m135470e1()) ? BLiveOperationTitleShowType.off : "on");
        }
        if (i == 1792) {
            if (!z) {
                m135382D2();
                return;
            }
            ((pkp) this.viewModel).m172720j0().m48544e(LocationPermissionView.LocationPermissionState.requested);
            if (this.f110281r) {
                this.f110281r = false;
                if (this.f110280q) {
                    return;
                }
                this.f110273j.m137019l(uxj0.f181467a);
            }
        }
    }

    /* JADX INFO: renamed from: t2 */
    public void m135493t2() {
        this.f110282s = false;
        ((pkp) this.viewModel).m172738s1();
    }

    /* JADX INFO: renamed from: v2 */
    public void m135494v2(boolean z) {
        final C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = this.f110274k;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = c22507a.m222761e();
        if (z || partialListOptM222761e == null || partialListOptM222761e.hasMore()) {
            C4899n c4899n = CoreModule.f18264c.f20411o0;
            V v2 = this.viewModel;
            duringCreated(c4899n.m35313M3(((pkp) v2).f152895T, ((pkp) v2).f152896U)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.nip
                @Override // p153l.y20
                public final void call(Object obj) {
                    hjp.m135384F0((uxj0) obj);
                }
            }, new y20() { // from class: l.oip
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147560a.m135477i2(c22507a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m135495w2(C8145d c8145d, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
        this.f110272i = false;
        sdp.m185485b();
    }

    /* JADX INFO: renamed from: x2 */
    public void m135496x2(C8145d c8145d, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "success")) {
            i4g0.m138495D("e_user_cant_rightswipe_reason", m135470e1().pageId(), jyb.m147494Y("reason_type", str));
        }
        int i = C17474b.f110291a[c8145d.m39479k().ordinal()];
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
        sfj0.m185600g("e_intl_tribe_card", m135470e1().pageId(), sfj0.C20032a.m185615h("direction", str2), sfj0.C20032a.m185615h("intl_tribe_source_name", ((pkp) this.viewModel).f152896U));
        HomeStatisticsHelper.m37691B(c8145d, str);
        this.f110272i = false;
        sdp.m185485b();
    }

    /* JADX INFO: renamed from: y2 */
    public void m135497y2(int i) {
        this.f110267d = i;
    }

    /* JADX INFO: renamed from: z2 */
    public void m135498z2(String str) {
        this.f110266c = str;
    }
}
