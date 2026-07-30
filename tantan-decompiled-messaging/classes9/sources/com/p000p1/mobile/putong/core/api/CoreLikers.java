package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Figure;
import com.p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p1.mobile.putong.core.data.SeeInfos;
import com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.CountInfo;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.q860;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import p006l.ax6;
import p006l.ia20;
import p006l.la20;
import p006l.qib0;
import p006l.ura;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreLikers extends ax6 {

    /* JADX INFO: renamed from: R */
    public List f3224R;

    /* JADX INFO: renamed from: S */
    public a<q860<User>> f3225S;

    /* JADX INFO: renamed from: T */
    public a<q860<User>> f3226T;

    /* JADX INFO: renamed from: U */
    public a<C0145a> f3227U;

    /* JADX INFO: renamed from: V */
    public a<j760<Integer, List<User>>> f3228V;

    /* JADX INFO: renamed from: W */
    public a<j760<Integer, List<User>>> f3229W;

    /* JADX INFO: renamed from: X */
    public a<C0145a> f3230X;

    /* JADX INFO: renamed from: Y */
    public a<Integer> f3231Y;

    /* JADX INFO: renamed from: Z */
    public a<Integer> f3232Z;

    /* JADX INFO: renamed from: a0 */
    public a<q860<User>> f3233a0;

    /* JADX INFO: renamed from: b0 */
    public a<Optional<MonetizationChatSeeUser>> f3234b0;

    /* JADX INFO: renamed from: c0 */
    public a<Optional<q860<User>>> f3235c0;

    /* JADX INFO: renamed from: d0 */
    public a<Optional<q860<User>>> f3236d0;

    /* JADX INFO: renamed from: e0 */
    public a<Optional<q860<User>>> f3237e0;

    /* JADX INFO: renamed from: f0 */
    public a<Optional<q860<User>>> f3238f0;

    /* JADX INFO: renamed from: g0 */
    public HashSet<String> f3239g0;

    /* JADX INFO: renamed from: h0 */
    public HashSet<String> f3240h0;

    /* JADX INFO: renamed from: i0 */
    public Set<String> f3241i0;

    /* JADX INFO: renamed from: j0 */
    public HashMap<String, User> f3242j0;

    /* JADX INFO: renamed from: k0 */
    public final zpd0 f3243k0;

    /* JADX INFO: renamed from: l0 */
    public final zpd0 f3244l0;

    /* JADX INFO: renamed from: m0 */
    public final zpd0 f3245m0;

    /* JADX INFO: renamed from: n0 */
    public tpd0 f3246n0;

    /* JADX INFO: renamed from: o0 */
    public final hpd0 f3247o0;

    /* JADX INFO: renamed from: p0 */
    public final zpd0 f3248p0;

    /* JADX INFO: renamed from: q0 */
    public final zpd0 f3249q0;

    /* JADX INFO: renamed from: r0 */
    public final zpd0 f3250r0;

    /* JADX INFO: renamed from: s0 */
    public final zpd0 f3251s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f3252t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f3253u0;

    /* JADX INFO: renamed from: v0 */
    public int f3254v0;

    /* JADX INFO: renamed from: w0 */
    public final a<List<User>> f3255w0;

    /* JADX INFO: renamed from: x0 */
    public HashSet<String> f3256x0;

    /* JADX INFO: renamed from: y0 */
    public final HashSet<String> f3257y0;

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
    public static class C0145a {

        /* JADX INFO: renamed from: a */
        public LikersTriggerBy f3258a;

        /* JADX INFO: renamed from: b */
        public int f3259b;

        /* JADX INFO: renamed from: c */
        public int f3260c;

        /* JADX INFO: renamed from: d */
        public List<User> f3261d;

        /* JADX INFO: renamed from: e */
        public List<User> f3262e;

        /* JADX INFO: renamed from: f */
        public String f3263f;

        /* JADX INFO: renamed from: g */
        public Figure f3264g;

        /* JADX INFO: renamed from: h */
        public List<User> f3265h;

        /* JADX INFO: renamed from: i */
        public ShowOnlineForWhoIMeet f3266i;

        /* JADX INFO: renamed from: a */
        public static C0145a m2425a(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure) {
            C0145a c0145a = new C0145a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c0145a.f3258a = likersTriggerBy;
            c0145a.f3259b = i;
            c0145a.f3260c = i2;
            c0145a.f3261d = list;
            c0145a.f3262e = list2;
            c0145a.f3263f = str;
            c0145a.f3264g = figure;
            return c0145a;
        }

        /* JADX INFO: renamed from: b */
        public static C0145a m2426b(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure, List<User> list3) {
            C0145a c0145a = new C0145a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c0145a.f3258a = likersTriggerBy;
            c0145a.f3259b = i;
            c0145a.f3260c = i2;
            c0145a.f3261d = list;
            c0145a.f3262e = list2;
            c0145a.f3263f = str;
            c0145a.f3264g = figure;
            c0145a.f3265h = list3;
            return c0145a;
        }

        /* JADX INFO: renamed from: c */
        public static C0145a m2427c(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure, List<User> list3, ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
            C0145a c0145a = new C0145a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c0145a.f3258a = likersTriggerBy;
            c0145a.f3259b = i;
            c0145a.f3260c = i2;
            c0145a.f3261d = list;
            c0145a.f3262e = list2;
            c0145a.f3263f = str;
            c0145a.f3264g = figure;
            c0145a.f3265h = list3;
            c0145a.f3266i = showOnlineForWhoIMeet;
            return c0145a;
        }

        public String toString() {
            return super.toString();
        }
    }

    public CoreLikers(C0158c c0158c) {
        super(c0158c);
        this.f3224R = new ArrayList();
        this.f3225S = a.b();
        this.f3226T = a.b();
        this.f3227U = a.b();
        this.f3228V = a.b();
        this.f3229W = a.b();
        this.f3230X = a.b();
        this.f3231Y = a.c(0);
        this.f3232Z = a.c(0);
        this.f3233a0 = a.b();
        this.f3234b0 = a.c(Optional.absent());
        this.f3235c0 = a.c(Optional.absent());
        this.f3236d0 = a.b();
        this.f3237e0 = a.c(Optional.absent());
        this.f3238f0 = a.b();
        this.f3239g0 = new HashSet<>();
        this.f3240h0 = new HashSet<>();
        this.f3241i0 = new HashSet();
        this.f3242j0 = new HashMap<>();
        this.f3243k0 = new zpd0("see_last_read_time" + CoreModule.m1850H().userId(), 0L);
        this.f3244l0 = new zpd0("fake_see_last_read_time" + CoreModule.m1850H().userId(), 0L);
        this.f3245m0 = new zpd0("see_avatar_last_read_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3246n0 = new tpd0("see_entry_anim_last_num_" + CoreModule.m1850H().userId(), 0, false);
        this.f3247o0 = new hpd0("gp_see_entry_clicked_" + CoreModule.m1850H().userId(), Boolean.FALSE, false);
        this.f3248p0 = new zpd0("last_see_entry_click_time" + CoreModule.m1850H().userId(), 0L, false);
        this.f3249q0 = new zpd0("see_last_read_time_Oms" + CoreModule.m1850H().userId(), 0L);
        this.f3250r0 = new zpd0("female_get_like_time" + CoreModule.m1850H().userId(), 0L, false);
        this.f3251s0 = new zpd0("female_get_like_time_slide_card_reward" + CoreModule.m1850H().userId(), 0L, false);
        this.f3252t0 = false;
        this.f3253u0 = false;
        this.f3254v0 = 0;
        this.f3255w0 = a.b();
        this.f3256x0 = new HashSet<>();
        this.f3257y0 = new HashSet<>();
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ Envelope m2192A3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users) && ConnectivityReceiver.i()) {
            vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.gh9
                public final void call(Object obj) {
                    qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: A5 */
    public static String m2194A5(long j, int i, String str, String str2) {
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
        if (CoreModule.f1543l.m11706a().m5426e2()) {
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
    public static /* synthetic */ C0145a m2212J4(q860 q860Var) {
        if (q860Var == null) {
            return C0145a.m2425a(null, 0, 0, null, null, null, null);
        }
        List list = q860Var.a;
        if (list == null || list.size() == 0) {
            return C0145a.m2425a(null, q860Var.d(), 0, null, null, null, null);
        }
        int iD = q860Var.d();
        List list2 = q860Var.a;
        return C0145a.m2425a(null, iD, 0, list2, list2, null, null);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Envelope m2220N4(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users) && ConnectivityReceiver.i()) {
            vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.sh9
                public final void call(Object obj) {
                    qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ j760 m2226Q4(boolean z, int i, Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            List<User> list = envelope.getModuleData(CommonData.class).users;
            if (envelope.getModuleData(CommonData.class).users.size() > 4 && z) {
                Collections.sort(list, new Comparator() { // from class: l.re9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return CoreLikers.m2267h4((User) obj, (User) obj2);
                    }
                });
            }
            int i2 = 0;
            for (User user : list) {
                if (NullChecker.a(user) && !vwb.J(user.pictures)) {
                    arrayList.add(((Media) user.picture(0)).url);
                }
                i2++;
                if (i2 == i) {
                    break;
                }
            }
        }
        return vwb.Y(Integer.valueOf(envelope.pagination.total), arrayList);
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ int m2267h4(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ int m2283p3(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ j760 m2289s3(boolean z, int i, Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            List<User> list = envelope.getModuleData(CommonData.class).users;
            if (envelope.getModuleData(CommonData.class).users.size() > 4 && z) {
                Collections.sort(list, new Comparator() { // from class: l.vi9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return CoreLikers.m2283p3((User) obj, (User) obj2);
                    }
                });
            }
            int i2 = 0;
            for (User user : list) {
                if (NullChecker.a(user) && NullChecker.a(user.fp().profileSmall())) {
                    arrayList.add(user.fp().profileSmall());
                }
                i2++;
                if (i2 == i) {
                    break;
                }
            }
        }
        return vwb.Y(Integer.valueOf(envelope.pagination.total), arrayList);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m2295v3(ArrayList arrayList, List list, User user) {
        if (arrayList.contains(((DbObject) user).id)) {
            return;
        }
        list.add(user);
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ roj0 m2305A6(Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        if (this.f3235c0.e() == null || this.f3239g0.isEmpty()) {
            this.f3239g0.addAll(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.yg9
                public final Object call(Object obj) {
                    return ((DbObject) ((User) obj)).id;
                }
            }));
            q860Var = new q860(envelope.getModuleData(CommonData.class).users, dbLinks);
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f3235c0.i() && ((Optional) this.f3235c0.e()).isPresent()) {
                arrayList.addAll(((q860) ((Optional) this.f3235c0.e()).get()).a);
            }
            final ArrayList arrayList2 = new ArrayList();
            vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.zg9
                public final void call(Object obj) {
                    this.f28742a.m2424z6(arrayList2, (User) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
            q860Var = new q860(arrayList, dbLinks);
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.ah9
                    public final void call(Object obj) {
                        qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                    }
                });
            }
        }
        this.f3235c0.onNext(Optional.of(q860Var));
        m2396q5(new q860<>(envelope.getModuleData(CommonData.class).users, dbLinks));
        return roj0.a;
    }

    /* JADX INFO: renamed from: B5 */
    public final String m2306B5(long j) {
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
    public final /* synthetic */ c m2307B6(final long j, final String str) {
        return new la20(new v9j() { // from class: l.lf9
            public final Object call() {
                return this.f16386a.m2418x6(j, str);
            }
        }).map(new w9j() { // from class: l.nf9
            public final Object call(Object obj) {
                return this.f17643a.m2421y6((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.of9
            public final Object call(Object obj) {
                return this.f18217a.m2305A6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public final String m2308C5(long j, boolean z, String str) {
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
    public final /* synthetic */ stc0 m2309C6(long j) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2308C5(j, true, ""))).b();
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ Envelope m2310D5(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.qh9
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.ui9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ Envelope m2311D6(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.wh9
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.qe9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m2312E5(Links links, List list, List list2, User user) {
        if (this.f3240h0.contains(((DbObject) user).id)) {
            return;
        }
        this.f3240h0.add(((DbObject) user).id);
        if (links != null) {
            list.add(user);
        } else {
            list2.add(user);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m2313E6(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m2314F5(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ roj0 m2315F6(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.rh9
                public final void call(Object obj) {
                    this.f20548a.m2313E6((SeeInfos) obj);
                }
            });
        }
        DbLinks dbLinks = new DbLinks();
        dbLinks.total = envelope.pagination.total;
        this.f3236d0.onNext(Optional.of(new q860(envelope.getModuleData(CommonData.class).users, dbLinks)));
        return roj0.a;
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ roj0 m2316G5(final Links links, Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (this.f3225S.e() == null || this.f3240h0.isEmpty()) {
            this.f3240h0.addAll(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.xh9
                public final Object call(Object obj) {
                    return ((DbObject) ((User) obj)).id;
                }
            }));
            q860Var = new q860(envelope.getModuleData(CommonData.class).users, dbLinks);
        } else {
            final List list = ((q860) this.f3225S.e()).a;
            arrayList.addAll(list);
            final ArrayList arrayList2 = new ArrayList();
            vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.yh9
                public final void call(Object obj) {
                    this.f28208a.m2312E5(links, list, arrayList2, (User) obj);
                }
            });
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.zh9
                    public final void call(Object obj) {
                        qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                    }
                });
            }
            if (arrayList2.size() > 0) {
                list.addAll(0, arrayList2);
            }
            q860Var = new q860(list, dbLinks);
        }
        if (this.f3225S.e() == null || !q860Var.b.equals(((q860) this.f3225S.e()).b) || !arrayList.equals(q860Var.a)) {
            this.f3225S.onNext(q860Var);
        }
        this.f3257y0.clear();
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.bi9
                public final void call(Object obj) {
                    this.f8920a.m2314F5((SeeInfos) obj);
                }
            });
        }
        m2396q5(new q860<>(envelope.getModuleData(CommonData.class).users, dbLinks));
        C0145a c0145a = (C0145a) this.f3227U.e();
        this.f3254v0 = q860Var.d();
        if (c0145a == null || c0145a.f3260c > 0 || q860Var.d() != c0145a.f3259b) {
            a<C0145a> aVar = this.f3227U;
            int iD = q860Var.d();
            List list2 = q860Var.a;
            aVar.onNext(C0145a.m2425a(null, iD, 0, list2, list2, null, null));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ c m2317G6(final long j) {
        return new la20(new v9j() { // from class: l.gg9
            public final Object call() {
                return this.f13311a.m2309C6(j);
            }
        }).map(new w9j() { // from class: l.hg9
            public final Object call(Object obj) {
                return this.f13874a.m2311D6((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.jg9
            public final Object call(Object obj) {
                return this.f15145a.m2315F6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ c m2318H5(final long j, final int i, final Links links, final String str) {
        return new la20(new v9j() { // from class: l.bg9
            public final Object call() {
                long j2 = j;
                int i2 = i;
                Links links2 = links;
                return C0154a.f3483P.auth().q(C0154a.m3107A0(CoreLikers.m2194A5(j2, i2, links2 == null ? null : links2.next, str))).b();
            }
        }).map(new w9j() { // from class: l.cg9
            public final Object call(Object obj) {
                return this.f9650a.m2310D5((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.dg9
            public final Object call(Object obj) {
                return this.f10391a.m2316G5(links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ roj0 m2319H6(Envelope envelope) {
        this.f3232Z.onNext(Integer.valueOf(envelope.pagination.total));
        return roj0.a;
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ stc0 m2320I5(User user, long j, LikersTriggerBy likersTriggerBy) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2423z5(user, j, likersTriggerBy))).b();
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ c m2321I6(final StringBuilder sb) {
        return new la20(new v9j() { // from class: l.sf9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3215c1(sb.toString())).b();
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.tf9
            public final Object call(Object obj) {
                return this.f22081a.m2319H6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ Envelope m2322J5(Envelope envelope) {
        if (ura.m25555e().m25559d().m5745c()) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: J6 */
    public c<q860<User>> m2323J6() {
        return this.f3225S;
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ c m2324K5(final User user, final long j, final LikersTriggerBy likersTriggerBy) {
        return new la20(new v9j() { // from class: l.bf9
            public final Object call() {
                return this.f8861a.m2320I5(user, j, likersTriggerBy);
            }
        }).map(new w9j() { // from class: l.cf9
            public final Object call(Object obj) {
                return this.f9637a.m2322J5((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: K6 */
    public c<j760<Integer, List<Picture.ImageUri>>> m2325K6(final int i, final boolean z) {
        return this.f8580Q.scheduled("likersCountProfileSmall" + i + "sort_" + z, 0, new v9j() { // from class: l.if9
            public final Object call() {
                int i2 = i;
                return new la20(new v9j() { // from class: l.uh9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3107A0(CoreLikers.m2194A5(0L, i2, null, ""))).b();
                    }
                }).map(new w9j() { // from class: l.vh9
                    public final Object call(Object obj) {
                        return CoreLikers.m2289s3(z, i2, (Envelope) obj);
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ stc0 m2326L5(User user, long j, LikersTriggerBy likersTriggerBy) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2423z5(user, j, likersTriggerBy))).b();
    }

    /* JADX INFO: renamed from: L6 */
    public c<j760<Integer, List<String>>> m2327L6() {
        return m2329M6(3);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ Envelope m2328M5(Envelope envelope) {
        if (ura.m25555e().m25559d().m5745c()) {
            List list = envelope.getModuleData(CommonData.class).users;
            List list2 = envelope.getModuleData(CoreData.class).figures;
            if (!vwb.J(list) || !vwb.J(list2)) {
                this.f8580Q.m3422w3(envelope, null);
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: M6 */
    public c<j760<Integer, List<String>>> m2329M6(int i) {
        return m2331N6(i, false);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ C0145a m2330N5(LikersTriggerBy likersTriggerBy, int i, Envelope envelope, Envelope envelope2) {
        Figure figure;
        int i2 = envelope2.pagination.total;
        List list = i > 0 ? envelope.getModuleData(CommonData.class).users : envelope2.getModuleData(CommonData.class).users;
        List list2 = envelope2.getModuleData(CommonData.class).users;
        if (IntlCountryCodeController.m17r()) {
            figure = (i <= 0 || likersTriggerBy == LikersTriggerBy.home_total_liker_float) ? (Figure) vwb.l0(envelope2.getModuleData(CoreData.class).figures) : (Figure) vwb.l0(envelope.getModuleData(CoreData.class).figures);
        } else {
            figure = null;
        }
        return C0145a.m2426b(likersTriggerBy, i2, i, list, list2, null, figure, m2417x5() ? envelope2.getModuleData(CommonData.class).users : null);
    }

    /* JADX INFO: renamed from: N6 */
    public c<j760<Integer, List<String>>> m2331N6(final int i, final boolean z) {
        return this.f8580Q.scheduled("likersCountWithAvatarUrls_" + i + "sort_" + z, 0, new v9j() { // from class: l.wi9
            public final Object call() {
                int i2 = i;
                return new la20(new v9j() { // from class: l.bh9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3107A0(CoreLikers.m2194A5(0L, i2, null, ""))).b();
                    }
                }).map(new w9j() { // from class: l.ch9
                    public final Object call(Object obj) {
                        return CoreLikers.m2226Q4(z, i2, (Envelope) obj);
                    }
                }).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ c m2332O5(long j, boolean z, final LikersTriggerBy likersTriggerBy, boolean z2, final Envelope envelope) {
        final int i = envelope.pagination.total;
        if (m2417x5() && j != 0) {
            this.f3232Z.onNext(Integer.valueOf(envelope.pagination.total));
        }
        if (z) {
            return c.just(C0145a.m2426b(likersTriggerBy, i, 0, envelope.getModuleData(CommonData.class).users, envelope.getModuleData(CommonData.class).users, null, IntlCountryCodeController.m17r() ? (Figure) vwb.l0(envelope.getModuleData(CoreData.class).figures) : null, m2417x5() ? envelope.getModuleData(CommonData.class).users : null));
        }
        return z2 ? c.just(C0145a.m2426b(likersTriggerBy, i, i, envelope.getModuleData(CommonData.class).users, envelope.getModuleData(CommonData.class).users, null, (Figure) vwb.l0(envelope.getModuleData(CoreData.class).figures), envelope.getModuleData(CommonData.class).users)) : m2351X6(0L, likersTriggerBy).map(new w9j() { // from class: l.pi9
            public final Object call(Object obj) {
                return this.f18742a.m2330N5(likersTriggerBy, i, envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public c<C0145a> m2333O6() {
        return c.merge(this.f3225S.map(new w9j() { // from class: l.kf9
            public final Object call(Object obj) {
                return CoreLikers.m2212J4((q860) obj);
            }
        }), this.f3227U);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ roj0 m2334P5(LikersTriggerBy likersTriggerBy, C0145a c0145a) {
        this.f3253u0 = true;
        if (!vwb.J(c0145a.f3261d) || this.f3225S.e() == null || vwb.J(((q860) this.f3225S.e()).a)) {
            for (User user : c0145a.f3261d) {
                if (user.location.distance > 0) {
                    this.f3242j0.put(((DbObject) user).id, user);
                }
            }
        } else {
            c0145a.f3261d = vwb.f0(new User[]{(User) ((q860) this.f3225S.e()).a.get(0)});
        }
        this.f3227U.onNext(c0145a);
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            this.f3230X.onNext(c0145a);
            this.f3231Y.onNext(Integer.valueOf(c0145a.f3260c));
        }
        ura.m25555e().m25559d().m5814lb();
        return roj0.a;
    }

    /* JADX INFO: renamed from: P6 */
    public c<C0145a> m2335P6() {
        return this.f3227U;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ c m2336Q5(final User user, final long j, final LikersTriggerBy likersTriggerBy, final boolean z, final boolean z2) {
        return new la20(new v9j() { // from class: l.di9
            public final Object call() {
                return this.f10410a.m2326L5(user, j, likersTriggerBy);
            }
        }).map(new w9j() { // from class: l.ei9
            public final Object call(Object obj) {
                return this.f11168a.m2328M5((Envelope) obj);
            }
        }).compose(mkd0.C()).flatMap(new w9j() { // from class: l.fi9
            public final Object call(Object obj) {
                return this.f12729a.m2332O5(j, z, likersTriggerBy, z2, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.gi9
            public final Object call(Object obj) {
                return this.f13327a.m2334P5(likersTriggerBy, (CoreLikers.C0145a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q6 */
    public c<q860<User>> m2337Q6() {
        return this.f3226T;
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m2338R5(LikersTriggerBy likersTriggerBy, Throwable th) {
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            a<C0145a> aVar = this.f3230X;
            aVar.onNext((C0145a) aVar.e());
        }
    }

    /* JADX INFO: renamed from: R6 */
    public c<j760<Integer, List<User>>> m2339R6() {
        return this.f3228V.asObservable();
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Envelope m2340S5(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.th9
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.oi9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: S6 */
    public c<j760<Integer, List<User>>> m2341S6() {
        return this.f3229W.asObservable();
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m2342T5(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: T6 */
    public q860<User> m2343T6() {
        return (q860) this.f3225S.e();
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ roj0 m2344U5(Links links, Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (this.f3226T.e() == null || !NullChecker.a(links)) {
            q860Var = new q860(envelope.getModuleData(CommonData.class).users, dbLinks);
        } else {
            final List list = ((q860) this.f3226T.e()).a;
            arrayList.addAll(list);
            final ArrayList arrayListQ = vwb.Q(list, new w9j() { // from class: l.ih9
                public final Object call(Object obj) {
                    return ((DbObject) ((User) obj)).id;
                }
            });
            vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.jh9
                public final void call(Object obj) {
                    CoreLikers.m2295v3(arrayListQ, list, (User) obj);
                }
            });
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.kh9
                    public final void call(Object obj) {
                        qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                    }
                });
            }
            q860Var = new q860(list, dbLinks);
        }
        if (this.f3226T.e() == null || !q860Var.b.equals(((q860) this.f3226T.e()).b) || !arrayList.equals(q860Var.a)) {
            this.f3226T.onNext(q860Var);
        }
        this.f3257y0.clear();
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.lh9
                public final void call(Object obj) {
                    this.f16417a.m2342T5((SeeInfos) obj);
                }
            });
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: U6 */
    public c<roj0> m2345U6(Links links, long j, int i) {
        return m2347V6(links, j, i, "");
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ c m2346V5(final long j, final int i, final Links links) {
        return new la20(new v9j() { // from class: l.pf9
            public final Object call() {
                long j2 = j;
                int i2 = i;
                Links links2 = links;
                return C0154a.f3483P.auth().q(C0154a.m3107A0(CoreLikers.m2194A5(j2, i2, links2 == null ? null : links2.next, null))).b();
            }
        }).map(new w9j() { // from class: l.qf9
            public final Object call(Object obj) {
                return this.f19728a.m2340S5((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.rf9
            public final Object call(Object obj) {
                return this.f20537a.m2344U5(links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public c<roj0> m2347V6(Links links, long j, int i, String str) {
        return m2349W6(links, j, i, "", null);
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ roj0 m2348W5(Envelope envelope) {
        this.f3255w0.onNext(envelope.getModuleData(CommonData.class).users);
        return roj0.a;
    }

    /* JADX INFO: renamed from: W6 */
    public c<roj0> m2349W6(final Links links, final long j, final int i, final String str, LikersTriggerBy likersTriggerBy) {
        return this.f8580Q.scheduled("likers", 0, new v9j() { // from class: l.tg9
            public final Object call() {
                return this.f22093a.m2318H5(j, i, links, str);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ c m2350X5(final String str) {
        return ia20.m16567a(new v9j() { // from class: l.si9
            public final Object call() {
                return C0154a.f3483P.auth().q(str).b();
            }
        }).map(new w9j() { // from class: l.ti9
            public final Object call(Object obj) {
                return this.f22130a.m2348W5((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X6 */
    public final c<Envelope> m2351X6(final long j, final LikersTriggerBy likersTriggerBy) {
        final User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        return this.f8580Q.scheduled("likersCount" + j, 0, new v9j() { // from class: l.ze9
            public final Object call() {
                return this.f28726a.m2324K5(userM21490p9, j, likersTriggerBy);
            }
        });
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Envelope m2352Y5(Envelope envelope) {
        final CommonData moduleData = envelope.getModuleData(CommonData.class);
        if (!vwb.J(moduleData.users)) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.oh9
                public final void call() {
                    CoreModule.m1853N().Rf(vwb.Q(moduleData.users, new w9j() { // from class: l.ri9
                        public final Object call(Object obj) {
                            return ((DbObject) ((User) obj)).id;
                        }
                    }));
                }
            });
        }
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: Y6 */
    public c<roj0> m2353Y6() {
        return m2355Z6(((Long) this.f3243k0.get()).longValue());
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m2354Z5(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: Z6 */
    public c<roj0> m2355Z6(long j) {
        return m2357a7(j, LikersTriggerBy.normal);
    }

    /* JADX INFO: renamed from: a6 */
    public final /* synthetic */ roj0 m2356a6(String str, Envelope envelope) {
        this.f3241i0.remove(str);
        int i = envelope.pagination.total;
        List list = envelope.getModuleData(CommonData.class).users;
        this.f3228V.onNext(vwb.Y(Integer.valueOf(i), list));
        C0145a c0145a = (C0145a) this.f3227U.e();
        this.f3257y0.clear();
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.dh9
                public final void call(Object obj) {
                    this.f10397a.m2354Z5((SeeInfos) obj);
                }
            });
        }
        if (c0145a == null || c0145a.f3260c > 0 || i != c0145a.f3259b) {
            this.f3227U.onNext(C0145a.m2425a(null, i, 0, list, list, null, null));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: a7 */
    public c<roj0> m2357a7(long j, LikersTriggerBy likersTriggerBy) {
        return m2359b7(j, likersTriggerBy, false);
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ c m2358b6(final long j, final int i, final String str, final String str2) {
        return new la20(new v9j() { // from class: l.af9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3107A0(CoreLikers.m2194A5(j, i, null, str))).b();
            }
        }).map(new w9j() { // from class: l.df9
            public final Object call(Object obj) {
                return this.f10381a.m2352Y5((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.ef9
            public final Object call(Object obj) {
                return CoreLikers.m2220N4((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ff9
            public final Object call(Object obj) {
                return this.f12701a.m2356a6(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public c<roj0> m2359b7(final long j, final LikersTriggerBy likersTriggerBy, final boolean z) {
        final boolean z2 = j == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(z2 ? "seeCount" : "seeCountUntil");
        sb.append(likersTriggerBy);
        String string = sb.toString();
        final User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        return this.f8580Q.scheduled(string, 0, new v9j() { // from class: l.gf9
            public final Object call() {
                return this.f13296a.m2336Q5(userM21483na, j, likersTriggerBy, z2, z);
            }
        }).doOnError(new e30() { // from class: l.hf9
            public final void call(Object obj) {
                this.f13861a.m2338R5(likersTriggerBy, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ Envelope m2360c6(Envelope envelope) {
        final CommonData moduleData = envelope.getModuleData(CommonData.class);
        if (!vwb.J(moduleData.users)) {
            this.f8580Q.f3598U.m13685a(new d30() { // from class: l.vg9
                public final void call() {
                    CoreModule.m1853N().Rf(vwb.Q(moduleData.users, new w9j() { // from class: l.ue9
                        public final Object call(Object obj) {
                            return ((DbObject) ((User) obj)).id;
                        }
                    }));
                }
            });
        }
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: c7 */
    public c<roj0> m2361c7(LikersTriggerBy likersTriggerBy) {
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            this.f3230X.onNext((Object) null);
        }
        return m2357a7(((Long) this.f3243k0.get()).longValue(), likersTriggerBy);
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ void m2362d6(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: d7 */
    public c<roj0> m2363d7(final Links links, final long j, final int i) {
        return this.f8580Q.scheduled("likers_my_tab", 0, new v9j() { // from class: l.li9
            public final Object call() {
                return this.f16426a.m2346V5(j, i, links);
            }
        });
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ roj0 m2364e6(Envelope envelope) {
        int i = envelope.pagination.total;
        List list = envelope.getModuleData(CommonData.class).users;
        this.f3229W.onNext(vwb.Y(Integer.valueOf(i), list));
        C0145a c0145a = (C0145a) this.f3227U.e();
        this.f3257y0.clear();
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.ci9
                public final void call(Object obj) {
                    this.f9670a.m2362d6((SeeInfos) obj);
                }
            });
        }
        if (c0145a == null || c0145a.f3260c > 0 || i != c0145a.f3259b) {
            this.f3227U.onNext(C0145a.m2425a(null, i, 0, list, list, null, null));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: e7 */
    public c<roj0> m2365e7() {
        ArrayList arrayList = new ArrayList();
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        arrayList.add(new C0165f0.a().m3907a(1).m3909c(C0165f0.a.b.m3918d().m3920b()).m3908b(C0165f0.a.C1547a.m3914d().m3915e("50000"), C0165f0.a.C1547a.m3912b().m3915e(String.valueOf(userM21490p9.age))));
        arrayList.add(new C0165f0.a().m3907a(100).m3908b(C0165f0.a.C1547a.m3912b().m3915e(String.valueOf(userM21490p9.age))).m3909c(C0165f0.a.b.m3917c().m3919a()));
        arrayList.add(new C0165f0.a().m3907a(100).m3909c(C0165f0.a.b.m3917c().m3919a()));
        final String strM3905c = new C0165f0().m3906d().m3904b().m3903a((C0165f0.a[]) arrayList.toArray(new C0165f0.a[arrayList.size()])).m3905c();
        return this.f8580Q.scheduled("likers_for_popup_distance", 0, new v9j() { // from class: l.hi9
            public final Object call() {
                return this.f13896a.m2350X5(strM3905c);
            }
        });
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ c m2366f6(final long j, final int i) {
        return new la20(new v9j() { // from class: l.kg9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3107A0(CoreLikers.m2194A5(j, i, null, null))).b();
            }
        }).map(new w9j() { // from class: l.lg9
            public final Object call(Object obj) {
                return this.f16408a.m2360c6((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.mg9
            public final Object call(Object obj) {
                return CoreLikers.m2192A3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ng9
            public final Object call(Object obj) {
                return this.f17679a.m2364e6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public c<roj0> m2367f7(final int i, final long j, final String str) {
        final String str2 = "loadLikersWithoutPrivilege_" + j;
        this.f3241i0.add(str2);
        return this.f8580Q.scheduled(str2, 0, new v9j() { // from class: l.xf9
            public final Object call() {
                return this.f27495a.m2358b6(j, i, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ stc0 m2368g6(long j) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2306B5(j))).b();
    }

    /* JADX INFO: renamed from: g7 */
    public c<roj0> m2369g7(final int i, final long j) {
        return this.f8580Q.scheduled("loadLikersWithoutPrivilege_mytab_" + j, 0, new v9j() { // from class: l.ig9
            public final Object call() {
                return this.f14433a.m2366f6(j, i);
            }
        });
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ Envelope m2370h6(Envelope envelope) {
        if (ura.m25555e().m25559d().m5745c()) {
            List list = envelope.getModuleData(CommonData.class).users;
            List list2 = envelope.getModuleData(CoreData.class).figures;
            if (!vwb.J(list) || !vwb.J(list2)) {
                this.f8580Q.m3422w3(envelope, null);
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: h7 */
    public c<roj0> m2371h7(final long j) {
        return this.f8580Q.scheduled("meet_entrance_likers", 0, new v9j() { // from class: l.eg9
            public final Object call() {
                return this.f11137a.m2376j6(j);
            }
        }).doOnError(new e30() { // from class: l.fg9
            public final void call(Object obj) {
                this.f12710a.m2379k6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public void m2372i5(String str) {
        this.f3257y0.add(str);
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ roj0 m2373i6(Envelope envelope) {
        int i;
        int i2;
        this.f3253u0 = true;
        if (NullChecker.a(envelope.pagination.countInfo)) {
            CountInfo countInfo = envelope.pagination.countInfo;
            int i3 = countInfo.all;
            i2 = countInfo.unread;
            i = i3;
        } else {
            i = 0;
            i2 = 0;
        }
        List list = envelope.getModuleData(CommonData.class).users;
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = (ShowOnlineForWhoIMeet) vwb.r(envelope.getModuleData(CoreData.class).showOnlineForWhoIMeet, new w9j() { // from class: l.ni9
            public final Object call(Object obj) {
                ShowOnlineForWhoIMeet showOnlineForWhoIMeet2 = (ShowOnlineForWhoIMeet) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(showOnlineForWhoIMeet2.id) && showOnlineForWhoIMeet2.show);
            }
        });
        LikersTriggerBy likersTriggerBy = LikersTriggerBy.home_tab_msg;
        List list2 = null;
        List list3 = i2 > 0 ? list : null;
        if (i2 <= 0) {
            list2 = list;
        }
        this.f3230X.onNext(C0145a.m2427c(likersTriggerBy, i, i2, list3, list2, null, (Figure) vwb.l0(envelope.getModuleData(CoreData.class).figures), null, showOnlineForWhoIMeet));
        ura.m25555e().m25559d().m5814lb();
        return roj0.a;
    }

    /* JADX INFO: renamed from: i7 */
    public c<roj0> m2374i7(final String str, final long j) {
        return this.f8580Q.scheduled("meet_likers_list_old_likers", 0, new v9j() { // from class: l.ai9
            public final Object call() {
                return this.f8271a.m2394p6(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public void m2375j5() {
        this.f3225S.onNext((Object) null);
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ c m2376j6(final long j) {
        return new la20(new v9j() { // from class: l.ii9
            public final Object call() {
                return this.f14487a.m2368g6(j);
            }
        }).map(new w9j() { // from class: l.ji9
            public final Object call(Object obj) {
                return this.f15166a.m2370h6((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ki9
            public final Object call(Object obj) {
                return this.f15840a.m2373i6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public c<roj0> m2377j7(final long j) {
        return this.f8580Q.scheduled("meet_likers_list_old_likers_no_privilege", 0, new v9j() { // from class: l.pe9
            public final Object call() {
                return this.f18697a.m2415w6(j);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public void m2378k5() {
        this.f3240h0.clear();
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ void m2379k6(Throwable th) {
        a<C0145a> aVar = this.f3230X;
        aVar.onNext((C0145a) aVar.e());
    }

    /* JADX INFO: renamed from: k7 */
    public c<roj0> m2380k7(final String str, final long j) {
        return this.f8580Q.scheduled("meet_likers_list_new_likers", 0, new v9j() { // from class: l.mf9
            public final Object call() {
                return this.f16955a.m2307B6(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public void m2381l5() {
        this.f3246n0.put(0);
        this.f3225S.onNext((Object) null);
        this.f3227U.onNext(C0145a.m2425a(LikersTriggerBy.clear_before_patch_setting, 0, 0, null, null, null, null));
        this.f3240h0.clear();
        this.f3242j0.clear();
    }

    /* JADX INFO: renamed from: l6 */
    public final /* synthetic */ Envelope m2382l6(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.mi9
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.se9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: l7 */
    public c<roj0> m2383l7(final long j) {
        return this.f8580Q.scheduled("meet_likers_list_new_likers_no_privilege", 0, new v9j() { // from class: l.eh9
            public final Object call() {
                return this.f11145a.m2317G6(j);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public void m2384m5() {
        CoreModule.f1534c.clearRequests("likers", 0);
        CoreModule.f1534c.clearRequests("seeCount", 0);
        CoreModule.f1534c.clearRequests("seeCountUntil", 0);
        Iterator<String> it = this.f3241i0.iterator();
        while (it.hasNext()) {
            this.f8580Q.clearRequests(it.next(), 0);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ void m2385m6(List list, User user) {
        if (this.f3239g0.contains(((DbObject) user).id)) {
            return;
        }
        this.f3239g0.add(((DbObject) user).id);
        list.add(user);
    }

    /* JADX INFO: renamed from: m7 */
    public c<j760<User, Integer>> m2386m7(long j) {
        return m2389n7(j, "");
    }

    /* JADX INFO: renamed from: n5 */
    public void m2387n5() {
        CoreModule.f1534c.clearRequests("likers_my_tab", 0);
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ void m2388n6(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: n7 */
    public c<j760<User, Integer>> m2389n7(long j, String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query=count&verified=true&with_figure=true");
        if (j == 0) {
            j = qib0.f19784H.guessedCurrentServerTime();
            this.f3248p0.put(Long.valueOf(j));
        }
        String strDateToApiTimeString = Converter.dateToApiTimeString(j);
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            try {
                sb.append(URLEncoder.encode(strDateToApiTimeString, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.c(e);
            }
        }
        return this.f8580Q.scheduled("load_new_likes_count_for_banner" + str, 0, new v9j() { // from class: l.jf9
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.mh9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3215c1(sb.toString())).b();
                    }
                }).map(new w9j() { // from class: l.nh9
                    public final Object call(Object obj) {
                        Envelope envelope = (Envelope) obj;
                        return j760.a(!vwb.J(envelope.getModuleData(CommonData.class).users) ? (User) envelope.getModuleData(CommonData.class).users.get(0) : null, Integer.valueOf(envelope.pagination.total));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public void m2390o5() {
        C0145a c0145a = (C0145a) this.f3230X.e();
        if (c0145a != null) {
            c0145a.f3260c = 0;
        }
        this.f3230X.onNext(c0145a);
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ roj0 m2391o6(Envelope envelope) {
        q860 q860Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        if (this.f3237e0.e() == null || this.f3239g0.isEmpty()) {
            this.f3239g0.addAll(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.qg9
                public final Object call(Object obj) {
                    return ((DbObject) ((User) obj)).id;
                }
            }));
            q860Var = new q860(envelope.getModuleData(CommonData.class).users, dbLinks);
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f3237e0.i() && ((Optional) this.f3237e0.e()).isPresent()) {
                arrayList.addAll(((q860) ((Optional) this.f3237e0.e()).get()).a);
            }
            final ArrayList arrayList2 = new ArrayList();
            vwb.z(envelope.getModuleData(CommonData.class).users, new e30() { // from class: l.rg9
                public final void call(Object obj) {
                    this.f20542a.m2385m6(arrayList2, (User) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
            q860Var = new q860(arrayList, dbLinks);
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.E(envelope.getModuleData(CommonData.class).users), new e30() { // from class: l.sg9
                    public final void call(Object obj) {
                        qib0.f19782G.m12792z0(((User) obj).fp().profileMiddle());
                    }
                });
            }
        }
        this.f3257y0.clear();
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.ug9
                public final void call(Object obj) {
                    this.f23529a.m2388n6((SeeInfos) obj);
                }
            });
        }
        this.f3237e0.onNext(Optional.of(q860Var));
        return roj0.a;
    }

    /* JADX INFO: renamed from: o7 */
    public c<roj0> m2392o7(long j) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query=count&verified=true&with_figure=true");
        if (j == 0) {
            j = qib0.f19784H.guessedCurrentServerTime();
            this.f3248p0.put(Long.valueOf(j));
        }
        String strDateToApiTimeString = Converter.dateToApiTimeString(j);
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            try {
                sb.append(URLEncoder.encode(strDateToApiTimeString, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.c(e);
            }
        }
        return this.f8580Q.scheduled("load_new_likes_count_without", 0, new v9j() { // from class: l.ph9
            public final Object call() {
                return this.f18732a.m2321I6(sb);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public void m2393p5() {
        if (this.f3235c0.i()) {
            Optional optional = (Optional) this.f3235c0.e();
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                for (int i = 0; i < q860Var.a.size(); i++) {
                    this.f3239g0.remove(((DbObject) ((User) q860Var.a.get(i))).id);
                }
            }
        }
        this.f3235c0.onNext(Optional.absent());
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ c m2394p6(final long j, final String str) {
        return new la20(new v9j() { // from class: l.yf9
            public final Object call() {
                return this.f28190a.m2397q6(j, str);
            }
        }).map(new w9j() { // from class: l.zf9
            public final Object call(Object obj) {
                return this.f28735a.m2382l6((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ag9
            public final Object call(Object obj) {
                return this.f8254a.m2391o6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public c<C0145a> m2395p7() {
        return this.f3230X;
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ stc0 m2397q6(long j, String str) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2308C5(j, false, str))).b();
    }

    /* JADX INFO: renamed from: q7 */
    public c<Optional<q860<User>>> m2398q7() {
        return this.f3237e0.asObservable();
    }

    /* JADX INFO: renamed from: r5 */
    public C0145a m2399r5() {
        return (C0145a) this.f3227U.e();
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ stc0 m2400r6(long j) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2308C5(j, false, ""))).b();
    }

    /* JADX INFO: renamed from: r7 */
    public c<Optional<q860<User>>> m2401r7() {
        return this.f3238f0.asObservable();
    }

    /* JADX INFO: renamed from: s5 */
    public List<User> m2402s5() {
        return (List) this.f3255w0.e();
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ Envelope m2403s6(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.hh9
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.te9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: s7 */
    public c<Optional<q860<User>>> m2404s7() {
        return this.f3235c0.asObservable();
    }

    /* JADX INFO: renamed from: t5 */
    public C0145a m2405t5() {
        return (C0145a) this.f3230X.e();
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m2406t6(SeeInfos seeInfos) {
        this.f3257y0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: t7 */
    public c<Optional<q860<User>>> m2407t7() {
        return this.f3236d0.asObservable();
    }

    /* JADX INFO: renamed from: u5 */
    public c<Integer> m2408u5() {
        return this.f3231Y.asObservable();
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m2409u6(ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
        if (NullChecker.a(showOnlineForWhoIMeet) && showOnlineForWhoIMeet.show && !TextUtils.isEmpty(showOnlineForWhoIMeet.id)) {
            this.f3256x0.add(showOnlineForWhoIMeet.id);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public c<q860<User>> m2410u7() {
        return this.f3233a0;
    }

    /* JADX INFO: renamed from: v5 */
    public User m2411v5() {
        if (this.f3242j0.size() == 0) {
            return null;
        }
        ArrayList arrayListQ = vwb.Q(this.f3242j0.values(), new w9j() { // from class: l.og9
            public final Object call(Object obj) {
                return Integer.valueOf(((User) obj).location.distance);
            }
        });
        final int iIntValue = ((Integer) arrayListQ.get(0)).intValue();
        Iterator it = arrayListQ.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (iIntValue2 < iIntValue) {
                iIntValue = iIntValue2;
            }
        }
        return (User) vwb.r(this.f3242j0.values(), new w9j() { // from class: l.pg9
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).location.distance == iIntValue);
            }
        });
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ roj0 m2412v6(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).seeInfos)) {
            vwb.z(envelope.getModuleData(CoreData.class).seeInfos, new e30() { // from class: l.wg9
                public final void call(Object obj) {
                    this.f25142a.m2406t6((SeeInfos) obj);
                }
            });
        }
        List list = envelope.getModuleData(CoreData.class).showOnlineForWhoIMeet;
        this.f3256x0.clear();
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.xg9
                public final void call(Object obj) {
                    this.f27508a.m2409u6((ShowOnlineForWhoIMeet) obj);
                }
            });
        }
        DbLinks dbLinks = new DbLinks();
        dbLinks.total = envelope.pagination.total;
        this.f3238f0.onNext(Optional.of(new q860(envelope.getModuleData(CommonData.class).users, dbLinks)));
        return roj0.a;
    }

    /* JADX INFO: renamed from: v7 */
    public void m2413v7(final String str) {
        User user;
        User user2;
        int iMax = 0;
        if (this.f3225S.e() != null ? ((q860) this.f3225S.e()).a.remove(vwb.r(((q860) this.f3225S.e()).a, new w9j() { // from class: l.ve9
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((DbObject) ((User) obj)).id));
            }
        })) : false) {
            if (((q860) this.f3225S.e()).b != null) {
                DbLinks dbLinks = ((q860) this.f3225S.e()).b;
                int i = dbLinks.total - 1;
                dbLinks.total = i;
                iMax = Math.max(i, 0);
            }
            int i2 = iMax;
            if (((q860) this.f3225S.e()).a == null || ((q860) this.f3225S.e()).a.size() <= 0) {
                this.f3227U.onNext(C0145a.m2426b(null, i2, 0, null, null, null, null, null));
            } else {
                this.f3227U.onNext(C0145a.m2425a(null, i2, 0, ((q860) this.f3225S.e()).a, ((q860) this.f3225S.e()).a, null, null));
            }
        }
        if (this.f3228V.e() != null && (user2 = (User) vwb.r((Collection) ((j760) this.f3228V.e()).b, new w9j() { // from class: l.we9
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((DbObject) ((User) obj)).id));
            }
        })) != null) {
            j760 j760Var = (j760) this.f3228V.e();
            ((List) j760Var.b).remove(user2);
            this.f3228V.onNext(vwb.Y(Integer.valueOf(((Integer) j760Var.a).intValue() - 1), (List) j760Var.b));
        }
        if (this.f3229W.e() != null && (user = (User) vwb.r((Collection) ((j760) this.f3229W.e()).b, new w9j() { // from class: l.xe9
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((DbObject) ((User) obj)).id));
            }
        })) != null) {
            j760 j760Var2 = (j760) this.f3229W.e();
            ((List) j760Var2.b).remove(user);
            this.f3229W.onNext(vwb.Y(Integer.valueOf(((Integer) j760Var2.a).intValue() - 1), (List) j760Var2.b));
        }
        if (this.f3226T.e() != null && ((q860) this.f3226T.e()).a != null) {
            ((q860) this.f3226T.e()).a.remove(vwb.r(((q860) this.f3226T.e()).a, new w9j() { // from class: l.ye9
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((DbObject) ((User) obj)).id));
                }
            }));
        }
        if (this.f3242j0.size() > 0) {
            this.f3242j0.remove(str);
        }
    }

    /* JADX INFO: renamed from: w5 */
    public c<Integer> m2414w5() {
        return this.f3232Z;
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ c m2415w6(final long j) {
        return new la20(new v9j() { // from class: l.uf9
            public final Object call() {
                return this.f23521a.m2400r6(j);
            }
        }).map(new w9j() { // from class: l.vf9
            public final Object call(Object obj) {
                return this.f24301a.m2403s6((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.wf9
            public final Object call(Object obj) {
                return this.f25135a.m2412v6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public void m2416w7(String str) {
    }

    /* JADX INFO: renamed from: x5 */
    public boolean m2417x5() {
        User userM21490p9 = e51.D() ? CoreModule.f1534c.f3628e0.m21490p9() : CoreModule.f1534c.f3628e0.m21392P9();
        return (userM21490p9 == null || userM21490p9.isFemale() || !CoreModule.f1543l.m11706a().m5426e2()) ? false : true;
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ stc0 m2418x6(long j, String str) {
        return C0154a.f3483P.auth().q(C0154a.m3107A0(m2308C5(j, true, str))).b();
    }

    /* JADX INFO: renamed from: x7 */
    public void m2419x7(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = false;
        if (this.f3225S.e() != null && ((q860) this.f3225S.e()).a != null) {
            Iterator it = ((q860) this.f3225S.e()).a.iterator();
            while (it.hasNext()) {
                User user = (User) it.next();
                if (str.equals(((DbObject) user).id)) {
                    it.remove();
                    if (((q860) this.f3225S.e()).b != null) {
                        ((q860) this.f3225S.e()).b.total--;
                    }
                    if (this.f3227U.e() != null && ((C0145a) this.f3227U.e()).f3261d == ((q860) this.f3225S.e()).a) {
                        if (((C0145a) this.f3227U.e()).f3259b > 0) {
                            ((C0145a) this.f3227U.e()).f3259b--;
                        }
                        if (((C0145a) this.f3227U.e()).f3260c > 0) {
                            ((C0145a) this.f3227U.e()).f3260c--;
                        }
                        a<C0145a> aVar = this.f3227U;
                        aVar.onNext((C0145a) aVar.e());
                        z = true;
                    }
                    a<q860<User>> aVar2 = this.f3225S;
                    aVar2.onNext((q860) aVar2.e());
                    this.f3240h0.remove(((DbObject) user).id);
                    break;
                }
            }
        }
        if (this.f3227U.e() != null && ((C0145a) this.f3227U.e()).f3261d != null && !z) {
            Iterator<User> it2 = ((C0145a) this.f3227U.e()).f3261d.iterator();
            while (it2.hasNext()) {
                if (str.equals(((DbObject) it2.next()).id)) {
                    it2.remove();
                    if (((C0145a) this.f3227U.e()).f3259b > 0) {
                        ((C0145a) this.f3227U.e()).f3259b--;
                    }
                    if (((C0145a) this.f3227U.e()).f3260c > 0) {
                        ((C0145a) this.f3227U.e()).f3260c--;
                    }
                    a<C0145a> aVar3 = this.f3227U;
                    aVar3.onNext((C0145a) aVar3.e());
                    break;
                }
            }
        }
        if (this.f3226T.e() != null && ((q860) this.f3226T.e()).a != null) {
            Iterator it3 = ((q860) this.f3226T.e()).a.iterator();
            while (it3.hasNext()) {
                if (str.equals(((DbObject) ((User) it3.next())).id)) {
                    it3.remove();
                    if (((q860) this.f3226T.e()).b != null) {
                        ((q860) this.f3226T.e()).b.total--;
                    }
                    a<q860<User>> aVar4 = this.f3226T;
                    aVar4.onNext((q860) aVar4.e());
                    break;
                }
            }
        }
        if (this.f3242j0.size() > 0) {
            this.f3242j0.remove(str);
        }
        this.f8580Q.f3677u1.m25553b3(str);
    }

    /* JADX INFO: renamed from: y5 */
    public boolean m2420y5(User user) {
        if (NullChecker.a(user)) {
            return this.f3257y0.contains(((DbObject) user).id);
        }
        return false;
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ Envelope m2421y6(final Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.fh9
            public final void call() {
                CoreModule.m1853N().Rf(vwb.Q(envelope.getModuleData(CommonData.class).users, new w9j() { // from class: l.qi9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                }));
            }
        });
        this.f8580Q.m3423x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: y7 */
    public void m2422y7(boolean z, String str) {
        if (z) {
            if (this.f3235c0.i() && ((Optional) this.f3235c0.e()).isPresent()) {
                q860 q860Var = (q860) ((Optional) this.f3235c0.e()).get();
                Iterator it = q860Var.a.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    if (str.equals(((DbObject) user).id)) {
                        it.remove();
                        DbLinks dbLinks = q860Var.b;
                        if (dbLinks != null) {
                            dbLinks.total--;
                        }
                        this.f3239g0.remove(((DbObject) user).id);
                        this.f3235c0.onNext(Optional.of(q860Var));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f3237e0.i() && ((Optional) this.f3237e0.e()).isPresent()) {
            q860 q860Var2 = (q860) ((Optional) this.f3237e0.e()).get();
            Iterator it2 = q860Var2.a.iterator();
            while (it2.hasNext()) {
                User user2 = (User) it2.next();
                if (str.equals(((DbObject) user2).id)) {
                    it2.remove();
                    DbLinks dbLinks2 = q860Var2.b;
                    if (dbLinks2 != null) {
                        dbLinks2.total--;
                    }
                    this.f3239g0.remove(((DbObject) user2).id);
                    this.f3237e0.onNext(Optional.of(q860Var2));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final String m2423z5(User user, long j, LikersTriggerBy likersTriggerBy) {
        StringBuilder sb = new StringBuilder("query=count");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append(CoreModule.f1543l.m11706a().m5426e2() ? "&verified=true" : "");
        if (m2417x5() && CoreModule.f1543l.m11706a().m5426e2() && j == 0) {
            sb.append("&with_figure=true&limit=5");
        } else if (likersTriggerBy == LikersTriggerBy.new_like_dialog) {
            sb.append("&with_figure=true&limit=20");
        } else if (likersTriggerBy == LikersTriggerBy.request_limit_3_user) {
            sb.append("&with_figure=true&limit=3");
        } else if ((ura.m25555e().m25559d().m5728Z5(user) && CoreModule.f1543l.m11706a().m5426e2()) || (ura.m25555e().m25559d().m5665Nl(user) && (LikersTriggerBy.home_total_liker_float == likersTriggerBy || LikersTriggerBy.home_new_liker_float == likersTriggerBy))) {
            sb.append("&with_figure=true");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m2424z6(List list, User user) {
        if (this.f3239g0.contains(((DbObject) user).id)) {
            return;
        }
        this.f3239g0.add(((DbObject) user).id);
        list.add(user);
    }

    /* JADX INFO: renamed from: q5 */
    public final void m2396q5(q860<User> q860Var) {
    }
}
