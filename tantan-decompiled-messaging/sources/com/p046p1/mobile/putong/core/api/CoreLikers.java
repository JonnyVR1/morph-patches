package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p046p1.mobile.putong.core.data.SeeInfos;
import com.p046p1.mobile.putong.core.data.ShowOnlineForWhoIMeet;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.CountInfo;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.la20;
import p149l.mkd0;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.stc0;
import p149l.tpd0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreLikers extends ax6 {

    /* JADX INFO: renamed from: R */
    public List f19235R;

    /* JADX INFO: renamed from: S */
    public C22392a<q860<User>> f19236S;

    /* JADX INFO: renamed from: T */
    public C22392a<q860<User>> f19237T;

    /* JADX INFO: renamed from: U */
    public C22392a<C4719a> f19238U;

    /* JADX INFO: renamed from: V */
    public C22392a<j760<Integer, List<User>>> f19239V;

    /* JADX INFO: renamed from: W */
    public C22392a<j760<Integer, List<User>>> f19240W;

    /* JADX INFO: renamed from: X */
    public C22392a<C4719a> f19241X;

    /* JADX INFO: renamed from: Y */
    public C22392a<Integer> f19242Y;

    /* JADX INFO: renamed from: Z */
    public C22392a<Integer> f19243Z;

    /* JADX INFO: renamed from: a0 */
    public C22392a<q860<User>> f19244a0;

    /* JADX INFO: renamed from: b0 */
    public C22392a<Optional<MonetizationChatSeeUser>> f19245b0;

    /* JADX INFO: renamed from: c0 */
    public C22392a<Optional<q860<User>>> f19246c0;

    /* JADX INFO: renamed from: d0 */
    public C22392a<Optional<q860<User>>> f19247d0;

    /* JADX INFO: renamed from: e0 */
    public C22392a<Optional<q860<User>>> f19248e0;

    /* JADX INFO: renamed from: f0 */
    public C22392a<Optional<q860<User>>> f19249f0;

    /* JADX INFO: renamed from: g0 */
    public HashSet<String> f19250g0;

    /* JADX INFO: renamed from: h0 */
    public HashSet<String> f19251h0;

    /* JADX INFO: renamed from: i0 */
    public Set<String> f19252i0;

    /* JADX INFO: renamed from: j0 */
    public HashMap<String, User> f19253j0;

    /* JADX INFO: renamed from: k0 */
    public final zpd0 f19254k0;

    /* JADX INFO: renamed from: l0 */
    public final zpd0 f19255l0;

    /* JADX INFO: renamed from: m0 */
    public final zpd0 f19256m0;

    /* JADX INFO: renamed from: n0 */
    public tpd0 f19257n0;

    /* JADX INFO: renamed from: o0 */
    public final hpd0 f19258o0;

    /* JADX INFO: renamed from: p0 */
    public final zpd0 f19259p0;

    /* JADX INFO: renamed from: q0 */
    public final zpd0 f19260q0;

    /* JADX INFO: renamed from: r0 */
    public final zpd0 f19261r0;

    /* JADX INFO: renamed from: s0 */
    public final zpd0 f19262s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f19263t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f19264u0;

    /* JADX INFO: renamed from: v0 */
    public int f19265v0;

    /* JADX INFO: renamed from: w0 */
    public final C22392a<List<User>> f19266w0;

    /* JADX INFO: renamed from: x0 */
    public HashSet<String> f19267x0;

    /* JADX INFO: renamed from: y0 */
    public final HashSet<String> f19268y0;

    public enum LikersTriggerBy {
        normal,
        home_total_liker_float,
        home_new_liker_float,
        new_like_dialog,
        clear_before_patch_setting,
        my_privilege_liker,
        home_tab_msg,
        request_limit_3_user
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreLikers$a */
    public static class C4719a {

        /* JADX INFO: renamed from: a */
        public LikersTriggerBy f19269a;

        /* JADX INFO: renamed from: b */
        public int f19270b;

        /* JADX INFO: renamed from: c */
        public int f19271c;

        /* JADX INFO: renamed from: d */
        public List<User> f19272d;

        /* JADX INFO: renamed from: e */
        public List<User> f19273e;

        /* JADX INFO: renamed from: f */
        public String f19274f;

        /* JADX INFO: renamed from: g */
        public Figure f19275g;

        /* JADX INFO: renamed from: h */
        public List<User> f19276h;

        /* JADX INFO: renamed from: i */
        public ShowOnlineForWhoIMeet f19277i;

        /* JADX INFO: renamed from: a */
        public static C4719a m30497a(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure) {
            C4719a c4719a = new C4719a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c4719a.f19269a = likersTriggerBy;
            c4719a.f19270b = i;
            c4719a.f19271c = i2;
            c4719a.f19272d = list;
            c4719a.f19273e = list2;
            c4719a.f19274f = str;
            c4719a.f19275g = figure;
            return c4719a;
        }

        /* JADX INFO: renamed from: b */
        public static C4719a m30498b(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure, List<User> list3) {
            C4719a c4719a = new C4719a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c4719a.f19269a = likersTriggerBy;
            c4719a.f19270b = i;
            c4719a.f19271c = i2;
            c4719a.f19272d = list;
            c4719a.f19273e = list2;
            c4719a.f19274f = str;
            c4719a.f19275g = figure;
            c4719a.f19276h = list3;
            return c4719a;
        }

        /* JADX INFO: renamed from: c */
        public static C4719a m30499c(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure, List<User> list3, ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
            C4719a c4719a = new C4719a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c4719a.f19269a = likersTriggerBy;
            c4719a.f19270b = i;
            c4719a.f19271c = i2;
            c4719a.f19272d = list;
            c4719a.f19273e = list2;
            c4719a.f19274f = str;
            c4719a.f19275g = figure;
            c4719a.f19276h = list3;
            c4719a.f19277i = showOnlineForWhoIMeet;
            return c4719a;
        }

        public String toString() {
            return super.toString();
        }
    }

    public CoreLikers(C4732c c4732c) {
        super(c4732c);
        this.f19235R = new ArrayList();
        this.f19236S = C22392a.m221512b();
        this.f19237T = C22392a.m221512b();
        this.f19238U = C22392a.m221512b();
        this.f19239V = C22392a.m221512b();
        this.f19240W = C22392a.m221512b();
        this.f19241X = C22392a.m221512b();
        this.f19242Y = C22392a.m221513c(0);
        this.f19243Z = C22392a.m221513c(0);
        this.f19244a0 = C22392a.m221512b();
        this.f19245b0 = C22392a.m221513c(Optional.absent());
        this.f19246c0 = C22392a.m221513c(Optional.absent());
        this.f19247d0 = C22392a.m221512b();
        this.f19248e0 = C22392a.m221513c(Optional.absent());
        this.f19249f0 = C22392a.m221512b();
        this.f19250g0 = new HashSet<>();
        this.f19251h0 = new HashSet<>();
        this.f19252i0 = new HashSet();
        this.f19253j0 = new HashMap<>();
        this.f19254k0 = new zpd0("see_last_read_time" + CoreModule.m29931H().userId(), 0L);
        this.f19255l0 = new zpd0("fake_see_last_read_time" + CoreModule.m29931H().userId(), 0L);
        this.f19256m0 = new zpd0("see_avatar_last_read_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19257n0 = new tpd0("see_entry_anim_last_num_" + CoreModule.m29931H().userId(), 0, false);
        this.f19258o0 = new hpd0("gp_see_entry_clicked_" + CoreModule.m29931H().userId(), Boolean.FALSE, false);
        this.f19259p0 = new zpd0("last_see_entry_click_time" + CoreModule.m29931H().userId(), 0L, false);
        this.f19260q0 = new zpd0("see_last_read_time_Oms" + CoreModule.m29931H().userId(), 0L);
        this.f19261r0 = new zpd0("female_get_like_time" + CoreModule.m29931H().userId(), 0L, false);
        this.f19262s0 = new zpd0("female_get_like_time_slide_card_reward" + CoreModule.m29931H().userId(), 0L, false);
        this.f19263t0 = false;
        this.f19264u0 = false;
        this.f19265v0 = 0;
        this.f19266w0 = C22392a.m221512b();
        this.f19267x0 = new HashSet<>();
        this.f19268y0 = new HashSet<>();
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ Envelope m30264A3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) && ConnectivityReceiver.m81286i()) {
            vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.gh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: A5 */
    public static String m30266A5(long j, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        } else if (i > 0) {
            sb.append("limit=");
            sb.append(i);
        }
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("last_read_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        if (CoreModule.f17554l.m94651a().mo33489e2()) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("verified=true");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ C4719a m30284J4(q860 q860Var) {
        if (q860Var == null) {
            return C4719a.m30497a(null, 0, 0, null, null, null, null);
        }
        List<T> list = q860Var.f153135a;
        if (list == 0 || list.size() == 0) {
            return C4719a.m30497a(null, q860Var.m173344d(), 0, null, null, null, null);
        }
        int iM173344d = q860Var.m173344d();
        List<T> list2 = q860Var.f153135a;
        return C4719a.m30497a(null, iM173344d, 0, list2, list2, null, null);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Envelope m30292N4(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) && ConnectivityReceiver.m81286i()) {
            vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.sh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ j760 m30298Q4(boolean z, int i, Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() > 4 && z) {
                Collections.sort(list, new Comparator() { // from class: l.re9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return CoreLikers.m30339h4((User) obj, (User) obj2);
                    }
                });
            }
            int i2 = 0;
            for (User user : list) {
                if (NullChecker.m81303a(user) && !vwb.m200296J(user.pictures)) {
                    arrayList.add(user.picture(0).url);
                }
                i2++;
                if (i2 == i) {
                    break;
                }
            }
        }
        return vwb.m200311Y(Integer.valueOf(envelope.pagination.total), arrayList);
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ int m30339h4(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ int m30355p3(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ j760 m30361s3(boolean z, int i, Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() > 4 && z) {
                Collections.sort(list, new Comparator() { // from class: l.vi9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return CoreLikers.m30355p3((User) obj, (User) obj2);
                    }
                });
            }
            int i2 = 0;
            for (User user : list) {
                if (NullChecker.m81303a(user) && NullChecker.m81303a(user.m60124fp().profileSmall())) {
                    arrayList.add(user.m60124fp().profileSmall());
                }
                i2++;
                if (i2 == i) {
                    break;
                }
            }
        }
        return vwb.m200311Y(Integer.valueOf(envelope.pagination.total), arrayList);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m30367v3(ArrayList arrayList, List list, User user) {
        if (arrayList.contains(user.f56011id)) {
            return;
        }
        list.add(user);
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ roj0 m30377A6(Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        if (this.f19246c0.m221515e() == null || this.f19250g0.isEmpty()) {
            this.f19250g0.addAll(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.yg9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).f56011id;
                }
            }));
            q860Var = new q860(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f19246c0.m221519i() && this.f19246c0.m221515e().isPresent()) {
                arrayList.addAll(this.f19246c0.m221515e().get().f153135a);
            }
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.zg9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203024a.m30496z6(arrayList2, (User) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
            q860Var = new q860(arrayList, dbLinks);
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.ah9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                    }
                });
            }
        }
        this.f19246c0.onNext(Optional.m15413of(q860Var));
        m30468q5(new q860<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: B5 */
    public final String m30378B5(long j) {
        StringBuilder sb = new StringBuilder("scene=whoimeet&limit=5&countinfo=true");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append("&query=count&verified=true&with_figure=true");
        return sb.toString();
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ C22306c m30379B6(final long j, final String str) {
        return new la20(new v9j() { // from class: l.lf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f127843a.m30490x6(j, str);
            }
        }).map(new w9j() { // from class: l.nf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138702a.m30493y6((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.of9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143633a.m30377A6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public final String m30380C5(long j, boolean z, String str) {
        StringBuilder sb = new StringBuilder("scene=whoimeet");
        sb.append(z ? "&datafrom=new" : "&datafrom=old");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append("&verified=true&limit=50");
        if (!TextUtils.isEmpty(str)) {
            sb.append("&");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ stc0 m30381C6(long j) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30380C5(j, true, ""))).m185883b();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ Envelope m30382D5(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.qh9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.ui9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ Envelope m30383D6(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.wh9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.qe9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m30384E5(Links links, List list, List list2, User user) {
        if (this.f19251h0.contains(user.f56011id)) {
            return;
        }
        this.f19251h0.add(user.f56011id);
        if (links != null) {
            list.add(user);
        } else {
            list2.add(user);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m30385E6(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m30386F5(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ roj0 m30387F6(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.rh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159347a.m30385E6((SeeInfos) obj);
                }
            });
        }
        DbLinks dbLinks = new DbLinks();
        dbLinks.total = envelope.pagination.total;
        this.f19247d0.onNext(Optional.m15413of(new q860(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks)));
        return roj0.f160388a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ roj0 m30388G5(final Links links, Envelope envelope) {
        q860<User> q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (this.f19236S.m221515e() == null || this.f19251h0.isEmpty()) {
            this.f19251h0.addAll(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.xh9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).f56011id;
                }
            }));
            q860Var = new q860<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            final List<T> list = this.f19236S.m221515e().f153135a;
            arrayList.addAll(list);
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.yh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198283a.m30384E5(links, list, arrayList2, (User) obj);
                }
            });
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.zh9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                    }
                });
            }
            if (arrayList2.size() > 0) {
                list.addAll(0, arrayList2);
            }
            q860Var = new q860<>(list, dbLinks);
        }
        if (this.f19236S.m221515e() == null || !q860Var.f153136b.equals(this.f19236S.m221515e().f153136b) || !arrayList.equals(q860Var.f153135a)) {
            this.f19236S.onNext(q860Var);
        }
        this.f19268y0.clear();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.bi9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75711a.m30386F5((SeeInfos) obj);
                }
            });
        }
        m30468q5(new q860<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks));
        C4719a c4719aM221515e = this.f19238U.m221515e();
        this.f19265v0 = q860Var.m173344d();
        if (c4719aM221515e == null || c4719aM221515e.f19271c > 0 || q860Var.m173344d() != c4719aM221515e.f19270b) {
            C22392a<C4719a> c22392a = this.f19238U;
            int iM173344d = q860Var.m173344d();
            List<User> list2 = q860Var.f153135a;
            c22392a.onNext(C4719a.m30497a(null, iM173344d, 0, list2, list2, null, null));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ C22306c m30389G6(final long j) {
        return new la20(new v9j() { // from class: l.gg9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f102474a.m30381C6(j);
            }
        }).map(new w9j() { // from class: l.hg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107583a.m30383D6((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.jg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117733a.m30387F6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ C22306c m30390H5(final long j, final int i, final Links links, final String str) {
        return new la20(new v9j() { // from class: l.bg9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                long j2 = j;
                int i2 = i;
                Links links2 = links;
                return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(CoreLikers.m30266A5(j2, i2, links2 == null ? null : links2.next, str))).m185883b();
            }
        }).map(new w9j() { // from class: l.cg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80728a.m30382D5((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.dg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86061a.m30388G5(links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ roj0 m30391H6(Envelope envelope) {
        this.f19243Z.onNext(Integer.valueOf(envelope.pagination.total));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ stc0 m30392I5(User user, long j, LikersTriggerBy likersTriggerBy) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30495z5(user, j, likersTriggerBy))).m185883b();
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ C22306c m30393I6(final StringBuilder sb) {
        return new la20(new v9j() { // from class: l.sf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31285c1(sb.toString())).m185883b();
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.tf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169950a.m30391H6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ Envelope m30394J5(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33808c()) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: J6 */
    public C22306c<q860<User>> m30395J6() {
        return this.f19236S;
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ C22306c m30396K5(final User user, final long j, final LikersTriggerBy likersTriggerBy) {
        return new la20(new v9j() { // from class: l.bf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f75280a.m30392I5(user, j, likersTriggerBy);
            }
        }).map(new w9j() { // from class: l.cf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80544a.m30394J5((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: K6 */
    public C22306c<j760<Integer, List<Picture.ImageUri>>> m30397K6(final int i, final boolean z) {
        return this.f72126Q.scheduled("likersCountProfileSmall" + i + "sort_" + z, 0, new v9j() { // from class: l.if9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return new la20(new v9j() { // from class: l.uh9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(CoreLikers.m30266A5(0L, i2, null, ""))).m185883b();
                    }
                }).map(new w9j() { // from class: l.vh9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreLikers.m30361s3(z, i2, (Envelope) obj);
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ stc0 m30398L5(User user, long j, LikersTriggerBy likersTriggerBy) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30495z5(user, j, likersTriggerBy))).m185883b();
    }

    /* JADX INFO: renamed from: L6 */
    public C22306c<j760<Integer, List<String>>> m30399L6() {
        return m30401M6(3);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ Envelope m30400M5(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33808c()) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<Figure> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).figures;
            if (!vwb.m200296J(list) || !vwb.m200296J(list2)) {
                this.f72126Q.m31492w3(envelope, null);
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: M6 */
    public C22306c<j760<Integer, List<String>>> m30401M6(int i) {
        return m30403N6(i, false);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C4719a m30402N5(LikersTriggerBy likersTriggerBy, int i, Envelope envelope, Envelope envelope2) {
        Figure figure;
        int i2 = envelope2.pagination.total;
        List<User> list = i > 0 ? ((CommonData) envelope.getModuleData(CommonData.class)).users : ((CommonData) envelope2.getModuleData(CommonData.class)).users;
        List<User> list2 = ((CommonData) envelope2.getModuleData(CommonData.class)).users;
        if (IntlCountryCodeController.m28122r()) {
            figure = (i <= 0 || likersTriggerBy == LikersTriggerBy.home_total_liker_float) ? (Figure) vwb.m200336l0(((CoreData) envelope2.getModuleData(CoreData.class)).figures) : (Figure) vwb.m200336l0(((CoreData) envelope.getModuleData(CoreData.class)).figures);
        } else {
            figure = null;
        }
        return C4719a.m30498b(likersTriggerBy, i2, i, list, list2, null, figure, m30489x5() ? ((CommonData) envelope2.getModuleData(CommonData.class)).users : null);
    }

    /* JADX INFO: renamed from: N6 */
    public C22306c<j760<Integer, List<String>>> m30403N6(final int i, final boolean z) {
        return this.f72126Q.scheduled("likersCountWithAvatarUrls_" + i + "sort_" + z, 0, new v9j() { // from class: l.wi9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return new la20(new v9j() { // from class: l.bh9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(CoreLikers.m30266A5(0L, i2, null, ""))).m185883b();
                    }
                }).map(new w9j() { // from class: l.ch9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreLikers.m30298Q4(z, i2, (Envelope) obj);
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ C22306c m30404O5(long j, boolean z, final LikersTriggerBy likersTriggerBy, boolean z2, final Envelope envelope) {
        final int i = envelope.pagination.total;
        if (m30489x5() && j != 0) {
            this.f19243Z.onNext(Integer.valueOf(envelope.pagination.total));
        }
        if (z) {
            return C22306c.just(C4719a.m30498b(likersTriggerBy, i, 0, ((CommonData) envelope.getModuleData(CommonData.class)).users, ((CommonData) envelope.getModuleData(CommonData.class)).users, null, IntlCountryCodeController.m28122r() ? (Figure) vwb.m200336l0(((CoreData) envelope.getModuleData(CoreData.class)).figures) : null, m30489x5() ? ((CommonData) envelope.getModuleData(CommonData.class)).users : null));
        }
        return z2 ? C22306c.just(C4719a.m30498b(likersTriggerBy, i, i, ((CommonData) envelope.getModuleData(CommonData.class)).users, ((CommonData) envelope.getModuleData(CommonData.class)).users, null, (Figure) vwb.m200336l0(((CoreData) envelope.getModuleData(CoreData.class)).figures), ((CommonData) envelope.getModuleData(CommonData.class)).users)) : m30423X6(0L, likersTriggerBy).map(new w9j() { // from class: l.pi9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149129a.m30402N5(likersTriggerBy, i, envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public C22306c<C4719a> m30405O6() {
        return C22306c.merge(this.f19236S.map(new w9j() { // from class: l.kf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreLikers.m30284J4((q860) obj);
            }
        }), this.f19238U);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ roj0 m30406P5(LikersTriggerBy likersTriggerBy, C4719a c4719a) {
        this.f19264u0 = true;
        if (!vwb.m200296J(c4719a.f19272d) || this.f19236S.m221515e() == null || vwb.m200296J(this.f19236S.m221515e().f153135a)) {
            for (User user : c4719a.f19272d) {
                if (user.location.distance > 0) {
                    this.f19253j0.put(user.f56011id, user);
                }
            }
        } else {
            c4719a.f19272d = vwb.m200324f0(this.f19236S.m221515e().f153135a.get(0));
        }
        this.f19238U.onNext(c4719a);
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            this.f19241X.onNext(c4719a);
            this.f19242Y.onNext(Integer.valueOf(c4719a.f19271c));
        }
        ura.m195053e().m195057d().mo33877lb();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: P6 */
    public C22306c<C4719a> m30407P6() {
        return this.f19238U;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ C22306c m30408Q5(final User user, final long j, final LikersTriggerBy likersTriggerBy, final boolean z, final boolean z2) {
        return new la20(new v9j() { // from class: l.di9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86363a.m30398L5(user, j, likersTriggerBy);
            }
        }).map(new w9j() { // from class: l.ei9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91572a.m30400M5((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.fi9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97639a.m30404O5(j, z, likersTriggerBy, z2, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.gi9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102858a.m30406P5(likersTriggerBy, (CoreLikers.C4719a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public C22306c<q860<User>> m30409Q6() {
        return this.f19237T;
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m30410R5(LikersTriggerBy likersTriggerBy, Throwable th) {
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            C22392a<C4719a> c22392a = this.f19241X;
            c22392a.onNext(c22392a.m221515e());
        }
    }

    /* JADX INFO: renamed from: R6 */
    public C22306c<j760<Integer, List<User>>> m30411R6() {
        return this.f19239V.asObservable();
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Envelope m30412S5(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.th9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.oi9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: S6 */
    public C22306c<j760<Integer, List<User>>> m30413S6() {
        return this.f19240W.asObservable();
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m30414T5(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: T6 */
    public q860<User> m30415T6() {
        return this.f19236S.m221515e();
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ roj0 m30416U5(Links links, Envelope envelope) {
        q860<User> q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (this.f19237T.m221515e() == null || !NullChecker.m81303a(links)) {
            q860Var = new q860<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            final List<User> list = this.f19237T.m221515e().f153135a;
            arrayList.addAll(list);
            final ArrayList arrayListM200303Q = vwb.m200303Q(list, new w9j() { // from class: l.ih9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).f56011id;
                }
            });
            vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.jh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreLikers.m30367v3(arrayListM200303Q, list, (User) obj);
                }
            });
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.kh9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                    }
                });
            }
            q860Var = new q860<>(list, dbLinks);
        }
        if (this.f19237T.m221515e() == null || !q860Var.f153136b.equals(this.f19237T.m221515e().f153136b) || !arrayList.equals(q860Var.f153135a)) {
            this.f19237T.onNext(q860Var);
        }
        this.f19268y0.clear();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.lh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128075a.m30414T5((SeeInfos) obj);
                }
            });
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: U6 */
    public C22306c<roj0> m30417U6(Links links, long j, int i) {
        return m30419V6(links, j, i, "");
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ C22306c m30418V5(final long j, final int i, final Links links) {
        return new la20(new v9j() { // from class: l.pf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                long j2 = j;
                int i2 = i;
                Links links2 = links;
                return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(CoreLikers.m30266A5(j2, i2, links2 == null ? null : links2.next, null))).m185883b();
            }
        }).map(new w9j() { // from class: l.qf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154092a.m30412S5((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.rf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159129a.m30416U5(links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public C22306c<roj0> m30419V6(Links links, long j, int i, String str) {
        return m30421W6(links, j, i, "", null);
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ roj0 m30420W5(Envelope envelope) {
        this.f19266w0.onNext(((CommonData) envelope.getModuleData(CommonData.class)).users);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: W6 */
    public C22306c<roj0> m30421W6(final Links links, final long j, final int i, final String str, LikersTriggerBy likersTriggerBy) {
        return this.f72126Q.scheduled("likers", 0, new v9j() { // from class: l.tg9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f170064a.m30390H5(j, i, links, str);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ C22306c m30422X5(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.si9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185883b();
            }
        }).map(new w9j() { // from class: l.ti9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170539a.m30420W5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X6 */
    public final C22306c<Envelope> m30423X6(final long j, final LikersTriggerBy likersTriggerBy) {
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return this.f72126Q.scheduled("likersCount" + j, 0, new v9j() { // from class: l.ze9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f202786a.m30396K5(userM169527p9, j, likersTriggerBy);
            }
        });
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Envelope m30424Y5(Envelope envelope) {
        final CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!vwb.m200296J(commonData.users)) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.oh9
                @Override // p149l.d30
                public final void call() {
                    CoreModule.m29934N().mo60314Rf(vwb.m200303Q(commonData.users, new w9j() { // from class: l.ri9
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((User) obj).f56011id;
                        }
                    }));
                }
            });
        }
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: Y6 */
    public C22306c<roj0> m30425Y6() {
        return m30427Z6(this.f19254k0.get().longValue());
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m30426Z5(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: Z6 */
    public C22306c<roj0> m30427Z6(long j) {
        return m30429a7(j, LikersTriggerBy.normal);
    }

    /* JADX INFO: renamed from: a6 */
    public final /* synthetic */ roj0 m30428a6(String str, Envelope envelope) {
        this.f19252i0.remove(str);
        int i = envelope.pagination.total;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        this.f19239V.onNext(vwb.m200311Y(Integer.valueOf(i), list));
        C4719a c4719aM221515e = this.f19238U.m221515e();
        this.f19268y0.clear();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.dh9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86247a.m30426Z5((SeeInfos) obj);
                }
            });
        }
        if (c4719aM221515e == null || c4719aM221515e.f19271c > 0 || i != c4719aM221515e.f19270b) {
            this.f19238U.onNext(C4719a.m30497a(null, i, 0, list, list, null, null));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: a7 */
    public C22306c<roj0> m30429a7(long j, LikersTriggerBy likersTriggerBy) {
        return m30431b7(j, likersTriggerBy, false);
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ C22306c m30430b6(final long j, final int i, final String str, final String str2) {
        return new la20(new v9j() { // from class: l.af9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(CoreLikers.m30266A5(j, i, null, str))).m185883b();
            }
        }).map(new w9j() { // from class: l.df9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f85901a.m30424Y5((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.ef9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreLikers.m30292N4((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ff9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97193a.m30428a6(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22306c<roj0> m30431b7(final long j, final LikersTriggerBy likersTriggerBy, final boolean z) {
        final boolean z2 = j == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(z2 ? "seeCount" : "seeCountUntil");
        sb.append(likersTriggerBy);
        String string = sb.toString();
        final User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        return this.f72126Q.scheduled(string, 0, new v9j() { // from class: l.gf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f102342a.m30408Q5(userM169520na, j, likersTriggerBy, z2, z);
            }
        }).doOnError(new e30() { // from class: l.hf9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107457a.m30410R5(likersTriggerBy, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ Envelope m30432c6(Envelope envelope) {
        final CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!vwb.m200296J(commonData.users)) {
            this.f72126Q.f19609U.m109085a(new d30() { // from class: l.vg9
                @Override // p149l.d30
                public final void call() {
                    CoreModule.m29934N().mo60314Rf(vwb.m200303Q(commonData.users, new w9j() { // from class: l.ue9
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((User) obj).f56011id;
                        }
                    }));
                }
            });
        }
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: c7 */
    public C22306c<roj0> m30433c7(LikersTriggerBy likersTriggerBy) {
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            this.f19241X.onNext(null);
        }
        return m30429a7(this.f19254k0.get().longValue(), likersTriggerBy);
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ void m30434d6(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: d7 */
    public C22306c<roj0> m30435d7(final Links links, final long j, final int i) {
        return this.f72126Q.scheduled("likers_my_tab", 0, new v9j() { // from class: l.li9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f128173a.m30418V5(j, i, links);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ roj0 m30436e6(Envelope envelope) {
        int i = envelope.pagination.total;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        this.f19240W.onNext(vwb.m200311Y(Integer.valueOf(i), list));
        C4719a c4719aM221515e = this.f19238U.m221515e();
        this.f19268y0.clear();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.ci9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81047a.m30434d6((SeeInfos) obj);
                }
            });
        }
        if (c4719aM221515e == null || c4719aM221515e.f19271c > 0 || i != c4719aM221515e.f19270b) {
            this.f19238U.onNext(C4719a.m30497a(null, i, 0, list, list, null, null));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: e7 */
    public C22306c<roj0> m30437e7() {
        ArrayList arrayList = new ArrayList();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        arrayList.add(new C4739f0.a().m31977a(1).m31979c(C4739f0.a.b.m31988d().m31990b()).m31978b(C4739f0.a.C22697a.m31984d().m31985e("50000"), C4739f0.a.C22697a.m31982b().m31985e(String.valueOf(userM169527p9.age))));
        arrayList.add(new C4739f0.a().m31977a(100).m31978b(C4739f0.a.C22697a.m31982b().m31985e(String.valueOf(userM169527p9.age))).m31979c(C4739f0.a.b.m31987c().m31989a()));
        arrayList.add(new C4739f0.a().m31977a(100).m31979c(C4739f0.a.b.m31987c().m31989a()));
        final String strM31975c = new C4739f0().m31976d().m31974b().m31973a((C4739f0.a[]) arrayList.toArray(new C4739f0.a[arrayList.size()])).m31975c();
        return this.f72126Q.scheduled("likers_for_popup_distance", 0, new v9j() { // from class: l.hi9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f107891a.m30422X5(strM31975c);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ C22306c m30438f6(final long j, final int i) {
        return new la20(new v9j() { // from class: l.kg9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(CoreLikers.m30266A5(j, i, null, null))).m185883b();
            }
        }).map(new w9j() { // from class: l.lg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127964a.m30432c6((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.mg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreLikers.m30264A3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ng9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138848a.m30436e6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public C22306c<roj0> m30439f7(final int i, final long j, final String str) {
        final String str2 = "loadLikersWithoutPrivilege_" + j;
        this.f19252i0.add(str2);
        return this.f72126Q.scheduled(str2, 0, new v9j() { // from class: l.xf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192669a.m30430b6(j, i, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ stc0 m30440g6(long j) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30378B5(j))).m185883b();
    }

    /* JADX INFO: renamed from: g7 */
    public C22306c<roj0> m30441g7(final int i, final long j) {
        return this.f72126Q.scheduled("loadLikersWithoutPrivilege_mytab_" + j, 0, new v9j() { // from class: l.ig9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113084a.m30438f6(j, i);
            }
        });
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ Envelope m30442h6(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33808c()) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<Figure> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).figures;
            if (!vwb.m200296J(list) || !vwb.m200296J(list2)) {
                this.f72126Q.m31492w3(envelope, null);
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: h7 */
    public C22306c<roj0> m30443h7(final long j) {
        return this.f72126Q.scheduled("meet_entrance_likers", 0, new v9j() { // from class: l.eg9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f90908a.m30448j6(j);
            }
        }).doOnError(new e30() { // from class: l.fg9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97340a.m30451k6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public void m30444i5(String str) {
        this.f19268y0.add(str);
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ roj0 m30445i6(Envelope envelope) {
        int i;
        int i2;
        this.f19264u0 = true;
        if (NullChecker.m81303a(envelope.pagination.countInfo)) {
            CountInfo countInfo = envelope.pagination.countInfo;
            int i3 = countInfo.all;
            i2 = countInfo.unread;
            i = i3;
        } else {
            i = 0;
            i2 = 0;
        }
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = (ShowOnlineForWhoIMeet) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).showOnlineForWhoIMeet, new w9j() { // from class: l.ni9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ShowOnlineForWhoIMeet showOnlineForWhoIMeet2 = (ShowOnlineForWhoIMeet) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(showOnlineForWhoIMeet2.f20500id) && showOnlineForWhoIMeet2.show);
            }
        });
        LikersTriggerBy likersTriggerBy = LikersTriggerBy.home_tab_msg;
        List<User> list2 = null;
        List<User> list3 = i2 > 0 ? list : null;
        if (i2 <= 0) {
            list2 = list;
        }
        this.f19241X.onNext(C4719a.m30499c(likersTriggerBy, i, i2, list3, list2, null, (Figure) vwb.m200336l0(((CoreData) envelope.getModuleData(CoreData.class)).figures), null, showOnlineForWhoIMeet));
        ura.m195053e().m195057d().mo33877lb();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: i7 */
    public C22306c<roj0> m30446i7(final String str, final long j) {
        return this.f72126Q.scheduled("meet_likers_list_old_likers", 0, new v9j() { // from class: l.ai9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f69961a.m30466p6(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public void m30447j5() {
        this.f19236S.onNext(null);
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ C22306c m30448j6(final long j) {
        return new la20(new v9j() { // from class: l.ii9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113374a.m30440g6(j);
            }
        }).map(new w9j() { // from class: l.ji9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118065a.m30442h6((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ki9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123282a.m30445i6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public C22306c<roj0> m30449j7(final long j) {
        return this.f72126Q.scheduled("meet_likers_list_old_likers_no_privilege", 0, new v9j() { // from class: l.pe9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f148405a.m30487w6(j);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public void m30450k5() {
        this.f19251h0.clear();
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ void m30451k6(Throwable th) {
        C22392a<C4719a> c22392a = this.f19241X;
        c22392a.onNext(c22392a.m221515e());
    }

    /* JADX INFO: renamed from: k7 */
    public C22306c<roj0> m30452k7(final String str, final long j) {
        return this.f72126Q.scheduled("meet_likers_list_new_likers", 0, new v9j() { // from class: l.mf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f133568a.m30379B6(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public void m30453l5() {
        this.f19257n0.put(0);
        this.f19236S.onNext(null);
        this.f19238U.onNext(C4719a.m30497a(LikersTriggerBy.clear_before_patch_setting, 0, 0, null, null, null, null));
        this.f19251h0.clear();
        this.f19253j0.clear();
    }

    /* JADX INFO: renamed from: l6 */
    public final /* synthetic */ Envelope m30454l6(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.mi9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.se9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: l7 */
    public C22306c<roj0> m30455l7(final long j) {
        return this.f72126Q.scheduled("meet_likers_list_new_likers_no_privilege", 0, new v9j() { // from class: l.eh9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f91309a.m30389G6(j);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public void m30456m5() {
        CoreModule.f17545c.clearRequests("likers", 0);
        CoreModule.f17545c.clearRequests("seeCount", 0);
        CoreModule.f17545c.clearRequests("seeCountUntil", 0);
        Iterator<String> it = this.f19252i0.iterator();
        while (it.hasNext()) {
            this.f72126Q.clearRequests(it.next(), 0);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ void m30457m6(List list, User user) {
        if (this.f19250g0.contains(user.f56011id)) {
            return;
        }
        this.f19250g0.add(user.f56011id);
        list.add(user);
    }

    /* JADX INFO: renamed from: m7 */
    public C22306c<j760<User, Integer>> m30458m7(long j) {
        return m30461n7(j, "");
    }

    /* JADX INFO: renamed from: n5 */
    public void m30459n5() {
        CoreModule.f17545c.clearRequests("likers_my_tab", 0);
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ void m30460n6(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: n7 */
    public C22306c<j760<User, Integer>> m30461n7(long j, String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query=count&verified=true&with_figure=true");
        if (j == 0) {
            j = qib0.f154693H.guessedCurrentServerTime();
            this.f19259p0.put(Long.valueOf(j));
        }
        String strDateToApiTimeString = Converter.dateToApiTimeString(j);
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            try {
                sb.append(URLEncoder.encode(strDateToApiTimeString, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m81296c(e);
            }
        }
        return this.f72126Q.scheduled("load_new_likes_count_for_banner" + str, 0, new v9j() { // from class: l.jf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.mh9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31285c1(sb.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.nh9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Envelope envelope = (Envelope) obj;
                        return j760.m140076a(!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0) : null, Integer.valueOf(envelope.pagination.total));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public void m30462o5() {
        C4719a c4719aM221515e = this.f19241X.m221515e();
        if (c4719aM221515e != null) {
            c4719aM221515e.f19271c = 0;
        }
        this.f19241X.onNext(c4719aM221515e);
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ roj0 m30463o6(Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        if (this.f19248e0.m221515e() == null || this.f19250g0.isEmpty()) {
            this.f19250g0.addAll(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.qg9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).f56011id;
                }
            }));
            q860Var = new q860(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f19248e0.m221519i() && this.f19248e0.m221515e().isPresent()) {
                arrayList.addAll(this.f19248e0.m221515e().get().f153135a);
            }
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(((CommonData) envelope.getModuleData(CommonData.class)).users, new e30() { // from class: l.rg9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159230a.m30457m6(arrayList2, (User) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
            q860Var = new q860(arrayList, dbLinks);
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200291E(((CommonData) envelope.getModuleData(CommonData.class)).users), new e30() { // from class: l.sg9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        qib0.f154691G.m102379z0(((User) obj).m60124fp().profileMiddle());
                    }
                });
            }
        }
        this.f19268y0.clear();
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.ug9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176362a.m30460n6((SeeInfos) obj);
                }
            });
        }
        this.f19248e0.onNext(Optional.m15413of(q860Var));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: o7 */
    public C22306c<roj0> m30464o7(long j) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query=count&verified=true&with_figure=true");
        if (j == 0) {
            j = qib0.f154693H.guessedCurrentServerTime();
            this.f19259p0.put(Long.valueOf(j));
        }
        String strDateToApiTimeString = Converter.dateToApiTimeString(j);
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            try {
                sb.append(URLEncoder.encode(strDateToApiTimeString, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m81296c(e);
            }
        }
        return this.f72126Q.scheduled("load_new_likes_count_without", 0, new v9j() { // from class: l.ph9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f148880a.m30393I6(sb);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public void m30465p5() {
        if (this.f19246c0.m221519i()) {
            Optional<q860<User>> optionalM221515e = this.f19246c0.m221515e();
            if (optionalM221515e.isPresent()) {
                q860<User> q860Var = optionalM221515e.get();
                for (int i = 0; i < q860Var.f153135a.size(); i++) {
                    this.f19250g0.remove(q860Var.f153135a.get(i).f56011id);
                }
            }
        }
        this.f19246c0.onNext(Optional.absent());
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ C22306c m30466p6(final long j, final String str) {
        return new la20(new v9j() { // from class: l.yf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f198007a.m30469q6(j, str);
            }
        }).map(new w9j() { // from class: l.zf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202924a.m30454l6((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ag9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69298a.m30463o6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public C22306c<C4719a> m30467p7() {
        return this.f19241X;
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ stc0 m30469q6(long j, String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30380C5(j, false, str))).m185883b();
    }

    /* JADX INFO: renamed from: q7 */
    public C22306c<Optional<q860<User>>> m30470q7() {
        return this.f19248e0.asObservable();
    }

    /* JADX INFO: renamed from: r5 */
    public C4719a m30471r5() {
        return this.f19238U.m221515e();
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ stc0 m30472r6(long j) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30380C5(j, false, ""))).m185883b();
    }

    /* JADX INFO: renamed from: r7 */
    public C22306c<Optional<q860<User>>> m30473r7() {
        return this.f19249f0.asObservable();
    }

    /* JADX INFO: renamed from: s5 */
    public List<User> m30474s5() {
        return this.f19266w0.m221515e();
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ Envelope m30475s6(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.hh9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.te9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: s7 */
    public C22306c<Optional<q860<User>>> m30476s7() {
        return this.f19246c0.asObservable();
    }

    /* JADX INFO: renamed from: t5 */
    public C4719a m30477t5() {
        return this.f19241X.m221515e();
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m30478t6(SeeInfos seeInfos) {
        this.f19268y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: t7 */
    public C22306c<Optional<q860<User>>> m30479t7() {
        return this.f19247d0.asObservable();
    }

    /* JADX INFO: renamed from: u5 */
    public C22306c<Integer> m30480u5() {
        return this.f19242Y.asObservable();
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m30481u6(ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
        if (NullChecker.m81303a(showOnlineForWhoIMeet) && showOnlineForWhoIMeet.show && !TextUtils.isEmpty(showOnlineForWhoIMeet.f20500id)) {
            this.f19267x0.add(showOnlineForWhoIMeet.f20500id);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public C22306c<q860<User>> m30482u7() {
        return this.f19244a0;
    }

    /* JADX INFO: renamed from: v5 */
    public User m30483v5() {
        if (this.f19253j0.size() == 0) {
            return null;
        }
        ArrayList arrayListM200303Q = vwb.m200303Q(this.f19253j0.values(), new w9j() { // from class: l.og9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((User) obj).location.distance);
            }
        });
        final int iIntValue = ((Integer) arrayListM200303Q.get(0)).intValue();
        Iterator it = arrayListM200303Q.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (iIntValue2 < iIntValue) {
                iIntValue = iIntValue2;
            }
        }
        return (User) vwb.m200346r(this.f19253j0.values(), new w9j() { // from class: l.pg9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).location.distance == iIntValue);
            }
        });
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ roj0 m30484v6(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            vwb.m200354z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new e30() { // from class: l.wg9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186154a.m30478t6((SeeInfos) obj);
                }
            });
        }
        List<ShowOnlineForWhoIMeet> list = ((CoreData) envelope.getModuleData(CoreData.class)).showOnlineForWhoIMeet;
        this.f19267x0.clear();
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.xg9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192746a.m30481u6((ShowOnlineForWhoIMeet) obj);
                }
            });
        }
        DbLinks dbLinks = new DbLinks();
        dbLinks.total = envelope.pagination.total;
        this.f19249f0.onNext(Optional.m15413of(new q860(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks)));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v7 */
    public void m30485v7(final String str) {
        User user;
        User user2;
        int iMax = 0;
        if (this.f19236S.m221515e() != null ? this.f19236S.m221515e().f153135a.remove(vwb.m200346r(this.f19236S.m221515e().f153135a, new w9j() { // from class: l.ve9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((User) obj).f56011id));
            }
        })) : false) {
            if (this.f19236S.m221515e().f153136b != null) {
                DbLinks dbLinks = this.f19236S.m221515e().f153136b;
                int i = dbLinks.total - 1;
                dbLinks.total = i;
                iMax = Math.max(i, 0);
            }
            int i2 = iMax;
            if (this.f19236S.m221515e().f153135a == null || this.f19236S.m221515e().f153135a.size() <= 0) {
                this.f19238U.onNext(C4719a.m30498b(null, i2, 0, null, null, null, null, null));
            } else {
                this.f19238U.onNext(C4719a.m30497a(null, i2, 0, this.f19236S.m221515e().f153135a, this.f19236S.m221515e().f153135a, null, null));
            }
        }
        if (this.f19239V.m221515e() != null && (user2 = (User) vwb.m200346r(this.f19239V.m221515e().f116565b, new w9j() { // from class: l.we9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((User) obj).f56011id));
            }
        })) != null) {
            j760<Integer, List<User>> j760VarM221515e = this.f19239V.m221515e();
            j760VarM221515e.f116565b.remove(user2);
            this.f19239V.onNext(vwb.m200311Y(Integer.valueOf(j760VarM221515e.f116564a.intValue() - 1), j760VarM221515e.f116565b));
        }
        if (this.f19240W.m221515e() != null && (user = (User) vwb.m200346r(this.f19240W.m221515e().f116565b, new w9j() { // from class: l.xe9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((User) obj).f56011id));
            }
        })) != null) {
            j760<Integer, List<User>> j760VarM221515e2 = this.f19240W.m221515e();
            j760VarM221515e2.f116565b.remove(user);
            this.f19240W.onNext(vwb.m200311Y(Integer.valueOf(j760VarM221515e2.f116564a.intValue() - 1), j760VarM221515e2.f116565b));
        }
        if (this.f19237T.m221515e() != null && this.f19237T.m221515e().f153135a != null) {
            this.f19237T.m221515e().f153135a.remove(vwb.m200346r(this.f19237T.m221515e().f153135a, new w9j() { // from class: l.ye9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((User) obj).f56011id));
                }
            }));
        }
        if (this.f19253j0.size() > 0) {
            this.f19253j0.remove(str);
        }
    }

    /* JADX INFO: renamed from: w5 */
    public C22306c<Integer> m30486w5() {
        return this.f19243Z;
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ C22306c m30487w6(final long j) {
        return new la20(new v9j() { // from class: l.uf9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176236a.m30472r6(j);
            }
        }).map(new w9j() { // from class: l.vf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181255a.m30475s6((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.wf9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186070a.m30484v6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public void m30488w7(String str) {
    }

    /* JADX INFO: renamed from: x5 */
    public boolean m30489x5() {
        User userM169527p9 = e51.m114739D() ? CoreModule.f17545c.f19639e0.m169527p9() : CoreModule.f17545c.f19639e0.m169429P9();
        return (userM169527p9 == null || userM169527p9.isFemale() || !CoreModule.f17554l.m94651a().mo33489e2()) ? false : true;
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ stc0 m30490x6(long j, String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31177A0(m30380C5(j, true, str))).m185883b();
    }

    /* JADX INFO: renamed from: x7 */
    public void m30491x7(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = false;
        if (this.f19236S.m221515e() != null && this.f19236S.m221515e().f153135a != null) {
            Iterator<User> it = this.f19236S.m221515e().f153135a.iterator();
            while (it.hasNext()) {
                User next = it.next();
                if (str.equals(next.f56011id)) {
                    it.remove();
                    if (this.f19236S.m221515e().f153136b != null) {
                        this.f19236S.m221515e().f153136b.total--;
                    }
                    if (this.f19238U.m221515e() != null && this.f19238U.m221515e().f19272d == this.f19236S.m221515e().f153135a) {
                        if (this.f19238U.m221515e().f19270b > 0) {
                            this.f19238U.m221515e().f19270b--;
                        }
                        if (this.f19238U.m221515e().f19271c > 0) {
                            this.f19238U.m221515e().f19271c--;
                        }
                        C22392a<C4719a> c22392a = this.f19238U;
                        c22392a.onNext(c22392a.m221515e());
                        z = true;
                    }
                    C22392a<q860<User>> c22392a2 = this.f19236S;
                    c22392a2.onNext(c22392a2.m221515e());
                    this.f19251h0.remove(next.f56011id);
                    break;
                }
            }
        }
        if (this.f19238U.m221515e() != null && this.f19238U.m221515e().f19272d != null && !z) {
            Iterator<User> it2 = this.f19238U.m221515e().f19272d.iterator();
            while (it2.hasNext()) {
                if (str.equals(it2.next().f56011id)) {
                    it2.remove();
                    if (this.f19238U.m221515e().f19270b > 0) {
                        this.f19238U.m221515e().f19270b--;
                    }
                    if (this.f19238U.m221515e().f19271c > 0) {
                        this.f19238U.m221515e().f19271c--;
                    }
                    C22392a<C4719a> c22392a3 = this.f19238U;
                    c22392a3.onNext(c22392a3.m221515e());
                    break;
                }
            }
        }
        if (this.f19237T.m221515e() != null && this.f19237T.m221515e().f153135a != null) {
            Iterator<User> it3 = this.f19237T.m221515e().f153135a.iterator();
            while (it3.hasNext()) {
                if (str.equals(it3.next().f56011id)) {
                    it3.remove();
                    if (this.f19237T.m221515e().f153136b != null) {
                        this.f19237T.m221515e().f153136b.total--;
                    }
                    C22392a<q860<User>> c22392a4 = this.f19237T;
                    c22392a4.onNext(c22392a4.m221515e());
                    break;
                }
            }
        }
        if (this.f19253j0.size() > 0) {
            this.f19253j0.remove(str);
        }
        this.f72126Q.f19688u1.m195051b3(str);
    }

    /* JADX INFO: renamed from: y5 */
    public boolean m30492y5(User user) {
        if (NullChecker.m81303a(user)) {
            return this.f19268y0.contains(user.f56011id);
        }
        return false;
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ Envelope m30493y6(final Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.fh9
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60314Rf(vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.qi9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                }));
            }
        });
        this.f72126Q.m31493x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: y7 */
    public void m30494y7(boolean z, String str) {
        if (z) {
            if (this.f19246c0.m221519i() && this.f19246c0.m221515e().isPresent()) {
                q860<User> q860Var = this.f19246c0.m221515e().get();
                Iterator<User> it = q860Var.f153135a.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (str.equals(next.f56011id)) {
                        it.remove();
                        DbLinks dbLinks = q860Var.f153136b;
                        if (dbLinks != null) {
                            dbLinks.total--;
                        }
                        this.f19250g0.remove(next.f56011id);
                        this.f19246c0.onNext(Optional.m15413of(q860Var));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f19248e0.m221519i() && this.f19248e0.m221515e().isPresent()) {
            q860<User> q860Var2 = this.f19248e0.m221515e().get();
            Iterator<User> it2 = q860Var2.f153135a.iterator();
            while (it2.hasNext()) {
                User next2 = it2.next();
                if (str.equals(next2.f56011id)) {
                    it2.remove();
                    DbLinks dbLinks2 = q860Var2.f153136b;
                    if (dbLinks2 != null) {
                        dbLinks2.total--;
                    }
                    this.f19250g0.remove(next2.f56011id);
                    this.f19248e0.onNext(Optional.m15413of(q860Var2));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final String m30495z5(User user, long j, LikersTriggerBy likersTriggerBy) {
        StringBuilder sb = new StringBuilder("query=count");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append(CoreModule.f17554l.m94651a().mo33489e2() ? "&verified=true" : "");
        if (m30489x5() && CoreModule.f17554l.m94651a().mo33489e2() && j == 0) {
            sb.append("&with_figure=true&limit=5");
        } else if (likersTriggerBy == LikersTriggerBy.new_like_dialog) {
            sb.append("&with_figure=true&limit=20");
        } else if (likersTriggerBy == LikersTriggerBy.request_limit_3_user) {
            sb.append("&with_figure=true&limit=3");
        } else if ((ura.m195053e().m195057d().mo33791Z5(user) && CoreModule.f17554l.m94651a().mo33489e2()) || (ura.m195053e().m195057d().mo33728Nl(user) && (LikersTriggerBy.home_total_liker_float == likersTriggerBy || LikersTriggerBy.home_new_liker_float == likersTriggerBy))) {
            sb.append("&with_figure=true");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m30496z6(List list, User user) {
        if (this.f19250g0.contains(user.f56011id)) {
            return;
        }
        this.f19250g0.add(user.f56011id);
        list.add(user);
    }

    /* JADX INFO: renamed from: q5 */
    public final void m30468q5(q860<User> q860Var) {
    }
}
