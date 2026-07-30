package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p051p1.mobile.putong.core.data.SeeInfos;
import com.p051p1.mobile.putong.core.data.ShowOnlineForWhoIMeet;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.CountInfo;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.byd0;
import p153l.dy6;
import p153l.gta;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.ti20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.vxd0;
import p153l.x1d0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class CoreLikers extends dy6 {

    /* JADX INFO: renamed from: R */
    public List f19976R;

    /* JADX INFO: renamed from: S */
    public C22507a<vg60<User>> f19977S;

    /* JADX INFO: renamed from: T */
    public C22507a<vg60<User>> f19978T;

    /* JADX INFO: renamed from: U */
    public C22507a<C4870a> f19979U;

    /* JADX INFO: renamed from: V */
    public C22507a<pf60<Integer, List<User>>> f19980V;

    /* JADX INFO: renamed from: W */
    public C22507a<pf60<Integer, List<User>>> f19981W;

    /* JADX INFO: renamed from: X */
    public C22507a<C4870a> f19982X;

    /* JADX INFO: renamed from: Y */
    public C22507a<Integer> f19983Y;

    /* JADX INFO: renamed from: Z */
    public C22507a<Integer> f19984Z;

    /* JADX INFO: renamed from: a0 */
    public C22507a<Long> f19985a0;

    /* JADX INFO: renamed from: b0 */
    public C22507a<vg60<User>> f19986b0;

    /* JADX INFO: renamed from: c0 */
    public C22507a<Optional<MonetizationChatSeeUser>> f19987c0;

    /* JADX INFO: renamed from: d0 */
    public C22507a<Optional<vg60<User>>> f19988d0;

    /* JADX INFO: renamed from: e0 */
    public C22507a<Optional<vg60<User>>> f19989e0;

    /* JADX INFO: renamed from: f0 */
    public C22507a<Optional<vg60<User>>> f19990f0;

    /* JADX INFO: renamed from: g0 */
    public C22507a<Optional<vg60<User>>> f19991g0;

    /* JADX INFO: renamed from: h0 */
    public HashSet<String> f19992h0;

    /* JADX INFO: renamed from: i0 */
    public HashSet<String> f19993i0;

    /* JADX INFO: renamed from: j0 */
    public Set<String> f19994j0;

    /* JADX INFO: renamed from: k0 */
    public HashMap<String, User> f19995k0;

    /* JADX INFO: renamed from: l0 */
    public final byd0 f19996l0;

    /* JADX INFO: renamed from: m0 */
    public final byd0 f19997m0;

    /* JADX INFO: renamed from: n0 */
    public final byd0 f19998n0;

    /* JADX INFO: renamed from: o0 */
    public vxd0 f19999o0;

    /* JADX INFO: renamed from: p0 */
    public final jxd0 f20000p0;

    /* JADX INFO: renamed from: q0 */
    public final byd0 f20001q0;

    /* JADX INFO: renamed from: r0 */
    public final byd0 f20002r0;

    /* JADX INFO: renamed from: s0 */
    public final byd0 f20003s0;

    /* JADX INFO: renamed from: t0 */
    public final byd0 f20004t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f20005u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f20006v0;

    /* JADX INFO: renamed from: w0 */
    public int f20007w0;

    /* JADX INFO: renamed from: x0 */
    public final C22507a<List<User>> f20008x0;

    /* JADX INFO: renamed from: y0 */
    public HashSet<String> f20009y0;

    /* JADX INFO: renamed from: z0 */
    public final HashSet<String> f20010z0;

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
    public static class C4870a {

        /* JADX INFO: renamed from: a */
        public LikersTriggerBy f20011a;

        /* JADX INFO: renamed from: b */
        public int f20012b;

        /* JADX INFO: renamed from: c */
        public int f20013c;

        /* JADX INFO: renamed from: d */
        public List<User> f20014d;

        /* JADX INFO: renamed from: e */
        public List<User> f20015e;

        /* JADX INFO: renamed from: f */
        public String f20016f;

        /* JADX INFO: renamed from: g */
        public Figure f20017g;

        /* JADX INFO: renamed from: h */
        public List<User> f20018h;

        /* JADX INFO: renamed from: i */
        public ShowOnlineForWhoIMeet f20019i;

        /* JADX INFO: renamed from: a */
        public static C4870a m31500a(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure) {
            C4870a c4870a = new C4870a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c4870a.f20011a = likersTriggerBy;
            c4870a.f20012b = i;
            c4870a.f20013c = i2;
            c4870a.f20014d = list;
            c4870a.f20015e = list2;
            c4870a.f20016f = str;
            c4870a.f20017g = figure;
            return c4870a;
        }

        /* JADX INFO: renamed from: b */
        public static C4870a m31501b(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure, List<User> list3) {
            C4870a c4870a = new C4870a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c4870a.f20011a = likersTriggerBy;
            c4870a.f20012b = i;
            c4870a.f20013c = i2;
            c4870a.f20014d = list;
            c4870a.f20015e = list2;
            c4870a.f20016f = str;
            c4870a.f20017g = figure;
            c4870a.f20018h = list3;
            return c4870a;
        }

        /* JADX INFO: renamed from: c */
        public static C4870a m31502c(LikersTriggerBy likersTriggerBy, int i, int i2, List<User> list, List<User> list2, String str, Figure figure, List<User> list3, ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
            C4870a c4870a = new C4870a();
            if (likersTriggerBy == null) {
                likersTriggerBy = LikersTriggerBy.normal;
            }
            c4870a.f20011a = likersTriggerBy;
            c4870a.f20012b = i;
            c4870a.f20013c = i2;
            c4870a.f20014d = list;
            c4870a.f20015e = list2;
            c4870a.f20016f = str;
            c4870a.f20017g = figure;
            c4870a.f20018h = list3;
            c4870a.f20019i = showOnlineForWhoIMeet;
            return c4870a;
        }

        public String toString() {
            return super.toString();
        }
    }

    public CoreLikers(C4883c c4883c) {
        super(c4883c);
        this.f19976R = new ArrayList();
        this.f19977S = C22507a.m222758b();
        this.f19978T = C22507a.m222758b();
        this.f19979U = C22507a.m222758b();
        this.f19980V = C22507a.m222758b();
        this.f19981W = C22507a.m222758b();
        this.f19982X = C22507a.m222758b();
        this.f19983Y = C22507a.m222759c(0);
        this.f19984Z = C22507a.m222759c(0);
        this.f19985a0 = C22507a.m222759c(0L);
        this.f19986b0 = C22507a.m222758b();
        this.f19987c0 = C22507a.m222759c(Optional.absent());
        this.f19988d0 = C22507a.m222759c(Optional.absent());
        this.f19989e0 = C22507a.m222758b();
        this.f19990f0 = C22507a.m222759c(Optional.absent());
        this.f19991g0 = C22507a.m222758b();
        this.f19992h0 = new HashSet<>();
        this.f19993i0 = new HashSet<>();
        this.f19994j0 = new HashSet();
        this.f19995k0 = new HashMap<>();
        this.f19996l0 = new byd0("see_last_read_time" + CoreModule.m30929H().userId(), 0L);
        this.f19997m0 = new byd0("fake_see_last_read_time" + CoreModule.m30929H().userId(), 0L);
        this.f19998n0 = new byd0("see_avatar_last_read_time_" + CoreModule.m30929H().userId(), 0L);
        this.f19999o0 = new vxd0("see_entry_anim_last_num_" + CoreModule.m30929H().userId(), 0, false);
        this.f20000p0 = new jxd0("gp_see_entry_clicked_" + CoreModule.m30929H().userId(), Boolean.FALSE, false);
        this.f20001q0 = new byd0("last_see_entry_click_time" + CoreModule.m30929H().userId(), 0L, false);
        this.f20002r0 = new byd0("see_last_read_time_Oms" + CoreModule.m30929H().userId(), 0L);
        this.f20003s0 = new byd0("female_get_like_time" + CoreModule.m30929H().userId(), 0L, false);
        this.f20004t0 = new byd0("female_get_like_time_slide_card_reward" + CoreModule.m30929H().userId(), 0L, false);
        this.f20005u0 = false;
        this.f20006v0 = false;
        this.f20007w0 = 0;
        this.f20008x0 = C22507a.m222758b();
        this.f20009y0 = new HashSet<>();
        this.f20010z0 = new HashSet<>();
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ Envelope m31262A3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) && ConnectivityReceiver.m82469i()) {
            jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.pi9
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: E5 */
    public static String m31272E5(long j, int i, String str, String str2) {
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
        if (CoreModule.f18273l.m143405a().mo34492e2()) {
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
    public static /* synthetic */ C4870a m31282J4(vg60 vg60Var) {
        if (vg60Var == null) {
            return C4870a.m31500a(null, 0, 0, null, null, null, null);
        }
        List<T> list = vg60Var.f184001a;
        if (list == 0 || list.size() == 0) {
            return C4870a.m31500a(null, vg60Var.m201222d(), 0, null, null, null, null);
        }
        int iM201222d = vg60Var.m201222d();
        List<T> list2 = vg60Var.f184001a;
        return C4870a.m31500a(null, iM201222d, 0, list2, list2, null, null);
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ Envelope m31290N4(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) && ConnectivityReceiver.m82469i()) {
            jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.bj9
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ pf60 m31296Q4(boolean z, int i, Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() > 4 && z) {
                Collections.sort(list, new Comparator() { // from class: l.ag9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return CoreLikers.m31337h4((User) obj, (User) obj2);
                    }
                });
            }
            int i2 = 0;
            for (User user : list) {
                if (NullChecker.m82486a(user) && !jyb.m147479J(user.pictures)) {
                    arrayList.add(user.picture(0).url);
                }
                i2++;
                if (i2 == i) {
                    break;
                }
            }
        }
        return jyb.m147494Y(Integer.valueOf(envelope.pagination.total), arrayList);
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ int m31337h4(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ int m31353p3(User user, User user2) {
        return user2.popLevel - user.popLevel;
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ pf60 m31359s3(boolean z, int i, Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() > 4 && z) {
                Collections.sort(list, new Comparator() { // from class: l.ek9
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return CoreLikers.m31353p3((User) obj, (User) obj2);
                    }
                });
            }
            int i2 = 0;
            for (User user : list) {
                if (NullChecker.m82486a(user) && NullChecker.m82486a(user.m61308fp().profileSmall())) {
                    arrayList.add(user.m61308fp().profileSmall());
                }
                i2++;
                if (i2 == i) {
                    break;
                }
            }
        }
        return jyb.m147494Y(Integer.valueOf(envelope.pagination.total), arrayList);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m31365v3(ArrayList arrayList, List list, User user) {
        if (arrayList.contains(user.f56859id)) {
            return;
        }
        list.add(user);
    }

    /* JADX INFO: renamed from: A5 */
    public boolean m31375A5() {
        Long lM222761e = this.f19985a0.m222761e();
        return lM222761e != null && lM222761e.longValue() > 0;
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ C22421c m31376A6(final long j) {
        return new ti20(new pcj() { // from class: l.dh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f88426a.m31486v6(j);
            }
        }).map(new qcj() { // from class: l.eh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f94011a.m31489w6((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.fh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99020a.m31498z6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A7 */
    public void m31377A7(final String str) {
        User user;
        User user2;
        int iMax = 0;
        if (this.f19977S.m222761e() != null ? this.f19977S.m222761e().f184001a.remove(jyb.m147529r(this.f19977S.m222761e().f184001a, new qcj() { // from class: l.eg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((User) obj).f56859id));
            }
        })) : false) {
            if (this.f19977S.m222761e().f184002b != null) {
                DbLinks dbLinks = this.f19977S.m222761e().f184002b;
                int i = dbLinks.total - 1;
                dbLinks.total = i;
                iMax = Math.max(i, 0);
            }
            int i2 = iMax;
            if (this.f19977S.m222761e().f184001a == null || this.f19977S.m222761e().f184001a.size() <= 0) {
                this.f19979U.onNext(C4870a.m31501b(null, i2, 0, null, null, null, null, null));
            } else {
                this.f19979U.onNext(C4870a.m31500a(null, i2, 0, this.f19977S.m222761e().f184001a, this.f19977S.m222761e().f184001a, null, null));
            }
        }
        if (this.f19980V.m222761e() != null && (user2 = (User) jyb.m147529r(this.f19980V.m222761e().f152157b, new qcj() { // from class: l.fg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((User) obj).f56859id));
            }
        })) != null) {
            pf60<Integer, List<User>> pf60VarM222761e = this.f19980V.m222761e();
            pf60VarM222761e.f152157b.remove(user2);
            this.f19980V.onNext(jyb.m147494Y(Integer.valueOf(pf60VarM222761e.f152156a.intValue() - 1), pf60VarM222761e.f152157b));
        }
        if (this.f19981W.m222761e() != null && (user = (User) jyb.m147529r(this.f19981W.m222761e().f152157b, new qcj() { // from class: l.gg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((User) obj).f56859id));
            }
        })) != null) {
            pf60<Integer, List<User>> pf60VarM222761e2 = this.f19981W.m222761e();
            pf60VarM222761e2.f152157b.remove(user);
            this.f19981W.onNext(jyb.m147494Y(Integer.valueOf(pf60VarM222761e2.f152156a.intValue() - 1), pf60VarM222761e2.f152157b));
        }
        if (this.f19978T.m222761e() != null && this.f19978T.m222761e().f184001a != null) {
            this.f19978T.m222761e().f184001a.remove(jyb.m147529r(this.f19978T.m222761e().f184001a, new qcj() { // from class: l.hg9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((User) obj).f56859id));
                }
            }));
        }
        if (this.f19995k0.size() > 0) {
            this.f19995k0.remove(str);
        }
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m31378B5() {
        User userM116600p9 = l51.m152884D() ? CoreModule.f18264c.f20381e0.m116600p9() : CoreModule.f18264c.f20381e0.m116502P9();
        return (userM116600p9 == null || userM116600p9.isFemale() || !CoreModule.f18273l.m143405a().mo34492e2()) ? false : true;
    }

    /* JADX INFO: renamed from: B6 */
    public final /* synthetic */ x1d0 m31379B6(long j, String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31390G5(j, true, str))).m209028b();
    }

    /* JADX INFO: renamed from: B7 */
    public void m31380B7(String str) {
    }

    /* JADX INFO: renamed from: C5 */
    public boolean m31381C5(User user) {
        if (NullChecker.m82486a(user)) {
            return this.f20010z0.contains(user.f56859id);
        }
        return false;
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ Envelope m31382C6(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.oi9
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.zj9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: C7 */
    public void m31383C7(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = false;
        if (this.f19977S.m222761e() != null && this.f19977S.m222761e().f184001a != null) {
            Iterator<User> it = this.f19977S.m222761e().f184001a.iterator();
            while (it.hasNext()) {
                User next = it.next();
                if (str.equals(next.f56859id)) {
                    it.remove();
                    if (this.f19977S.m222761e().f184002b != null) {
                        this.f19977S.m222761e().f184002b.total--;
                    }
                    if (this.f19979U.m222761e() != null && this.f19979U.m222761e().f20014d == this.f19977S.m222761e().f184001a) {
                        if (this.f19979U.m222761e().f20012b > 0) {
                            this.f19979U.m222761e().f20012b--;
                        }
                        if (this.f19979U.m222761e().f20013c > 0) {
                            this.f19979U.m222761e().f20013c--;
                        }
                        C22507a<C4870a> c22507a = this.f19979U;
                        c22507a.onNext(c22507a.m222761e());
                        z = true;
                    }
                    C22507a<vg60<User>> c22507a2 = this.f19977S;
                    c22507a2.onNext(c22507a2.m222761e());
                    this.f19993i0.remove(next.f56859id);
                    break;
                }
            }
        }
        if (this.f19979U.m222761e() != null && this.f19979U.m222761e().f20014d != null && !z) {
            Iterator<User> it2 = this.f19979U.m222761e().f20014d.iterator();
            while (it2.hasNext()) {
                if (str.equals(it2.next().f56859id)) {
                    it2.remove();
                    if (this.f19979U.m222761e().f20012b > 0) {
                        this.f19979U.m222761e().f20012b--;
                    }
                    if (this.f19979U.m222761e().f20013c > 0) {
                        this.f19979U.m222761e().f20013c--;
                    }
                    C22507a<C4870a> c22507a3 = this.f19979U;
                    c22507a3.onNext(c22507a3.m222761e());
                    break;
                }
            }
        }
        if (this.f19978T.m222761e() != null && this.f19978T.m222761e().f184001a != null) {
            Iterator<User> it3 = this.f19978T.m222761e().f184001a.iterator();
            while (it3.hasNext()) {
                if (str.equals(it3.next().f56859id)) {
                    it3.remove();
                    if (this.f19978T.m222761e().f184002b != null) {
                        this.f19978T.m222761e().f184002b.total--;
                    }
                    C22507a<vg60<User>> c22507a4 = this.f19978T;
                    c22507a4.onNext(c22507a4.m222761e());
                    break;
                }
            }
        }
        if (this.f19995k0.size() > 0) {
            this.f19995k0.remove(str);
        }
        this.f91137Q.f20430u1.m127303b3(str);
    }

    /* JADX INFO: renamed from: D5 */
    public final String m31384D5(User user, long j, LikersTriggerBy likersTriggerBy) {
        StringBuilder sb = new StringBuilder("query=count");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append(CoreModule.f18273l.m143405a().mo34492e2() ? "&verified=true" : "");
        if (m31378B5() && CoreModule.f18273l.m143405a().mo34492e2() && j == 0) {
            sb.append("&with_figure=true&limit=5");
        } else if (likersTriggerBy == LikersTriggerBy.new_like_dialog) {
            sb.append("&with_figure=true&limit=20");
        } else if (likersTriggerBy == LikersTriggerBy.request_limit_3_user) {
            sb.append("&with_figure=true&limit=3");
        } else if ((gta.m132210e().m132214d().mo34794Z5(user) && CoreModule.f18273l.m143405a().mo34492e2()) || (gta.m132210e().m132214d().mo34731Nl(user) && (LikersTriggerBy.home_total_liker_float == likersTriggerBy || LikersTriggerBy.home_new_liker_float == likersTriggerBy))) {
            sb.append("&with_figure=true");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m31385D6(List list, User user) {
        if (this.f19992h0.contains(user.f56859id)) {
            return;
        }
        this.f19992h0.add(user.f56859id);
        list.add(user);
    }

    /* JADX INFO: renamed from: D7 */
    public void m31386D7(boolean z, String str) {
        if (z) {
            if (this.f19988d0.m222765i() && this.f19988d0.m222761e().isPresent()) {
                vg60<User> vg60Var = this.f19988d0.m222761e().get();
                Iterator<User> it = vg60Var.f184001a.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (str.equals(next.f56859id)) {
                        it.remove();
                        DbLinks dbLinks = vg60Var.f184002b;
                        if (dbLinks != null) {
                            dbLinks.total--;
                        }
                        this.f19992h0.remove(next.f56859id);
                        this.f19988d0.onNext(Optional.m15467of(vg60Var));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f19990f0.m222765i() && this.f19990f0.m222761e().isPresent()) {
            vg60<User> vg60Var2 = this.f19990f0.m222761e().get();
            Iterator<User> it2 = vg60Var2.f184001a.iterator();
            while (it2.hasNext()) {
                User next2 = it2.next();
                if (str.equals(next2.f56859id)) {
                    it2.remove();
                    DbLinks dbLinks2 = vg60Var2.f184002b;
                    if (dbLinks2 != null) {
                        dbLinks2.total--;
                    }
                    this.f19992h0.remove(next2.f56859id);
                    this.f19990f0.onNext(Optional.m15467of(vg60Var2));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ uxj0 m31387E6(Envelope envelope) {
        vg60 vg60Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        if (this.f19988d0.m222761e() == null || this.f19992h0.isEmpty()) {
            this.f19992h0.addAll(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.hi9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).f56859id;
                }
            }));
            vg60Var = new vg60(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f19988d0.m222765i() && this.f19988d0.m222761e().isPresent()) {
                arrayList.addAll(this.f19988d0.m222761e().get().f184001a);
            }
            final ArrayList arrayList2 = new ArrayList();
            jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.ii9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f115059a.m31385D6(arrayList2, (User) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
            vg60Var = new vg60(arrayList, dbLinks);
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.ji9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                    }
                });
            }
        }
        this.f19988d0.onNext(Optional.m15467of(vg60Var));
        m31476s5(new vg60<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F5 */
    public final String m31388F5(long j) {
        StringBuilder sb = new StringBuilder("scene=whoimeet&limit=5&countinfo=true");
        String strDateToApiTimeString = j != 0 ? Converter.dateToApiTimeString(j) : null;
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            sb.append(URLEncoder.encode(strDateToApiTimeString));
        }
        sb.append("&query=count&verified=true&with_figure=true");
        return sb.toString();
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ C22421c m31389F6(final long j, final String str) {
        return new ti20(new pcj() { // from class: l.ug9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f178874a.m31379B6(j, str);
            }
        }).map(new qcj() { // from class: l.wg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188921a.m31382C6((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.xg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194160a.m31387E6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public final String m31390G5(long j, boolean z, String str) {
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

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ x1d0 m31391G6(long j) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31390G5(j, true, ""))).m209028b();
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ Envelope m31392H5(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.zi9
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.dk9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ Envelope m31393H6(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.fj9
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.zf9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m31394I5(Links links, List list, List list2, User user) {
        if (this.f19993i0.contains(user.f56859id)) {
            return;
        }
        this.f19993i0.add(user.f56859id);
        if (links != null) {
            list.add(user);
        } else {
            list2.add(user);
        }
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m31395I6(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m31396J5(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ uxj0 m31397J6(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.aj9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71801a.m31395I6((SeeInfos) obj);
                }
            });
        }
        DbLinks dbLinks = new DbLinks();
        dbLinks.total = envelope.pagination.total;
        this.f19989e0.onNext(Optional.m15467of(new vg60(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks)));
        return uxj0.f181467a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ uxj0 m31398K5(final Links links, Envelope envelope) {
        vg60<User> vg60Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (this.f19977S.m222761e() == null || this.f19993i0.isEmpty()) {
            this.f19993i0.addAll(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.gj9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).f56859id;
                }
            }));
            vg60Var = new vg60<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            final List<T> list = this.f19977S.m222761e().f184001a;
            arrayList.addAll(list);
            final ArrayList arrayList2 = new ArrayList();
            jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.hj9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110166a.m31394I5(links, list, arrayList2, (User) obj);
                }
            });
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.ij9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                    }
                });
            }
            if (arrayList2.size() > 0) {
                list.addAll(0, arrayList2);
            }
            vg60Var = new vg60<>(list, dbLinks);
        }
        if (this.f19977S.m222761e() == null || !vg60Var.f184002b.equals(this.f19977S.m222761e().f184002b) || !arrayList.equals(vg60Var.f184001a)) {
            this.f19977S.onNext(vg60Var);
        }
        this.f20010z0.clear();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.kj9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127081a.m31396J5((SeeInfos) obj);
                }
            });
        }
        m31476s5(new vg60<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks));
        C4870a c4870aM222761e = this.f19979U.m222761e();
        this.f20007w0 = vg60Var.m201222d();
        if (c4870aM222761e == null || c4870aM222761e.f20013c > 0 || vg60Var.m201222d() != c4870aM222761e.f20012b) {
            C22507a<C4870a> c22507a = this.f19979U;
            int iM201222d = vg60Var.m201222d();
            List<User> list2 = vg60Var.f184001a;
            c22507a.onNext(C4870a.m31500a(null, iM201222d, 0, list2, list2, null, null));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ C22421c m31399K6(final long j) {
        return new ti20(new pcj() { // from class: l.ph9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152406a.m31391G6(j);
            }
        }).map(new qcj() { // from class: l.qh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157520a.m31393H6((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.sh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f168602a.m31397J6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ C22421c m31400L5(final long j, final int i, final Links links, final String str) {
        return new ti20(new pcj() { // from class: l.kh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                long j2 = j;
                int i2 = i;
                Links links2 = links;
                return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(CoreLikers.m31272E5(j2, i2, links2 == null ? null : links2.next, str))).m209028b();
            }
        }).map(new qcj() { // from class: l.lh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132078a.m31392H5((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.mh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136832a.m31398K5(links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ uxj0 m31401L6(Envelope envelope) {
        this.f19984Z.onNext(Integer.valueOf(envelope.pagination.total));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ x1d0 m31402M5(User user, long j, LikersTriggerBy likersTriggerBy) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31384D5(user, j, likersTriggerBy))).m209028b();
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ C22421c m31403M6(final StringBuilder sb) {
        return new ti20(new pcj() { // from class: l.bh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32288c1(sb.toString())).m209028b();
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.ch9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f81772a.m31401L6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ Envelope m31404N5(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34811c()) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: N6 */
    public C22421c<vg60<User>> m31405N6() {
        return this.f19977S;
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ C22421c m31406O5(final User user, final long j, final LikersTriggerBy likersTriggerBy) {
        return new ti20(new pcj() { // from class: l.kg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f126586a.m31402M5(user, j, likersTriggerBy);
            }
        }).map(new qcj() { // from class: l.lg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131944a.m31404N5((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: O6 */
    public C22421c<pf60<Integer, List<Picture.ImageUri>>> m31407O6(final int i, final boolean z) {
        return this.f91137Q.scheduled("likersCountProfileSmall" + i + "sort_" + z, 0, new pcj() { // from class: l.rg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return new ti20(new pcj() { // from class: l.dj9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(CoreLikers.m31272E5(0L, i2, null, ""))).m209028b();
                    }
                }).map(new qcj() { // from class: l.ej9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreLikers.m31359s3(z, i2, (Envelope) obj);
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ x1d0 m31408P5(User user, long j, LikersTriggerBy likersTriggerBy) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31384D5(user, j, likersTriggerBy))).m209028b();
    }

    /* JADX INFO: renamed from: P6 */
    public C22421c<pf60<Integer, List<String>>> m31409P6() {
        return m31411Q6(3);
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ Envelope m31410Q5(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34811c()) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<Figure> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).figures;
            if (!jyb.m147479J(list) || !jyb.m147479J(list2)) {
                this.f91137Q.m32495w3(envelope, null);
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Q6 */
    public C22421c<pf60<Integer, List<String>>> m31411Q6(int i) {
        return m31413R6(i, false);
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ C4870a m31412R5(LikersTriggerBy likersTriggerBy, int i, Envelope envelope, Envelope envelope2) {
        Figure figure;
        int i2 = envelope2.pagination.total;
        List<User> list = i > 0 ? ((CommonData) envelope.getModuleData(CommonData.class)).users : ((CommonData) envelope2.getModuleData(CommonData.class)).users;
        List<User> list2 = ((CommonData) envelope2.getModuleData(CommonData.class)).users;
        if (IntlCountryCodeController.m29121r()) {
            figure = (i <= 0 || likersTriggerBy == LikersTriggerBy.home_total_liker_float) ? (Figure) jyb.m147519l0(((CoreData) envelope2.getModuleData(CoreData.class)).figures) : (Figure) jyb.m147519l0(((CoreData) envelope.getModuleData(CoreData.class)).figures);
        } else {
            figure = null;
        }
        return C4870a.m31501b(likersTriggerBy, i2, i, list, list2, null, figure, m31378B5() ? ((CommonData) envelope2.getModuleData(CommonData.class)).users : null);
    }

    /* JADX INFO: renamed from: R6 */
    public C22421c<pf60<Integer, List<String>>> m31413R6(final int i, final boolean z) {
        return this.f91137Q.scheduled("likersCountWithAvatarUrls_" + i + "sort_" + z, 0, new pcj() { // from class: l.fk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                return new ti20(new pcj() { // from class: l.ki9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(CoreLikers.m31272E5(0L, i2, null, ""))).m209028b();
                    }
                }).map(new qcj() { // from class: l.li9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreLikers.m31296Q4(z, i2, (Envelope) obj);
                    }
                }).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ C22421c m31414S5(long j, boolean z, final LikersTriggerBy likersTriggerBy, boolean z2, final Envelope envelope) {
        final int i = envelope.pagination.total;
        if (m31378B5() && j != 0) {
            this.f19984Z.onNext(Integer.valueOf(envelope.pagination.total));
        }
        if (z) {
            return C22421c.just(C4870a.m31501b(likersTriggerBy, i, 0, ((CommonData) envelope.getModuleData(CommonData.class)).users, ((CommonData) envelope.getModuleData(CommonData.class)).users, null, IntlCountryCodeController.m29121r() ? (Figure) jyb.m147519l0(((CoreData) envelope.getModuleData(CoreData.class)).figures) : null, m31378B5() ? ((CommonData) envelope.getModuleData(CommonData.class)).users : null));
        }
        return z2 ? C22421c.just(C4870a.m31501b(likersTriggerBy, i, i, ((CommonData) envelope.getModuleData(CommonData.class)).users, ((CommonData) envelope.getModuleData(CommonData.class)).users, null, (Figure) jyb.m147519l0(((CoreData) envelope.getModuleData(CoreData.class)).figures), ((CommonData) envelope.getModuleData(CommonData.class)).users)) : m31433b7(0L, likersTriggerBy).map(new qcj() { // from class: l.yj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200277a.m31412R5(likersTriggerBy, i, envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public C22421c<C4870a> m31415S6() {
        return C22421c.merge(this.f19977S.map(new qcj() { // from class: l.tg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreLikers.m31282J4((vg60) obj);
            }
        }), this.f19979U);
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ uxj0 m31416T5(LikersTriggerBy likersTriggerBy, C4870a c4870a) {
        this.f20006v0 = true;
        if (!jyb.m147479J(c4870a.f20014d) || this.f19977S.m222761e() == null || jyb.m147479J(this.f19977S.m222761e().f184001a)) {
            for (User user : c4870a.f20014d) {
                if (user.location.distance > 0) {
                    this.f19995k0.put(user.f56859id, user);
                }
            }
        } else {
            c4870a.f20014d = jyb.m147507f0(this.f19977S.m222761e().f184001a.get(0));
        }
        this.f19979U.onNext(c4870a);
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            this.f19982X.onNext(c4870a);
            this.f19983Y.onNext(Integer.valueOf(c4870a.f20013c));
        }
        gta.m132210e().m132214d().mo34880lb();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T6 */
    public C22421c<C4870a> m31417T6() {
        return this.f19979U;
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ C22421c m31418U5(final User user, final long j, final LikersTriggerBy likersTriggerBy, final boolean z, final boolean z2) {
        return new ti20(new pcj() { // from class: l.mj9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137061a.m31408P5(user, j, likersTriggerBy);
            }
        }).map(new qcj() { // from class: l.nj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142280a.m31410Q5((Envelope) obj);
            }
        }).compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.oj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147640a.m31414S5(j, z, likersTriggerBy, z2, (Envelope) obj);
            }
        }).map(new qcj() { // from class: l.pj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152675a.m31416T5(likersTriggerBy, (CoreLikers.C4870a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public C22421c<vg60<User>> m31419U6() {
        return this.f19978T;
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m31420V5(LikersTriggerBy likersTriggerBy, Throwable th) {
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            C22507a<C4870a> c22507a = this.f19982X;
            c22507a.onNext(c22507a.m222761e());
        }
    }

    /* JADX INFO: renamed from: V6 */
    public C22421c<pf60<Integer, List<User>>> m31421V6() {
        return this.f19980V.asObservable();
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ Envelope m31422W5(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.cj9
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.xj9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: W6 */
    public C22421c<pf60<Integer, List<User>>> m31423W6() {
        return this.f19981W.asObservable();
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m31424X5(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: X6 */
    public vg60<User> m31425X6() {
        return this.f19977S.m222761e();
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ uxj0 m31426Y5(Links links, Envelope envelope) {
        vg60<User> vg60Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (this.f19978T.m222761e() == null || !NullChecker.m82486a(links)) {
            vg60Var = new vg60<>(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            final List<User> list = this.f19978T.m222761e().f184001a;
            arrayList.addAll(list);
            final ArrayList arrayListM147486Q = jyb.m147486Q(list, new qcj() { // from class: l.ri9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).f56859id;
                }
            });
            jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.si9
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreLikers.m31365v3(arrayListM147486Q, list, (User) obj);
                }
            });
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.ti9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                    }
                });
            }
            vg60Var = new vg60<>(list, dbLinks);
        }
        if (this.f19978T.m222761e() == null || !vg60Var.f184002b.equals(this.f19978T.m222761e().f184002b) || !arrayList.equals(vg60Var.f184001a)) {
            this.f19978T.onNext(vg60Var);
        }
        this.f20010z0.clear();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.ui9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f179086a.m31424X5((SeeInfos) obj);
                }
            });
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y6 */
    public C22421c<uxj0> m31427Y6(Links links, long j, int i) {
        return m31429Z6(links, j, i, "");
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ C22421c m31428Z5(final long j, final int i, final Links links) {
        return new ti20(new pcj() { // from class: l.yg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                long j2 = j;
                int i2 = i;
                Links links2 = links;
                return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(CoreLikers.m31272E5(j2, i2, links2 == null ? null : links2.next, null))).m209028b();
            }
        }).map(new qcj() { // from class: l.zg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204279a.m31422W5((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.ah9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71330a.m31426Y5(links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public C22421c<uxj0> m31429Z6(Links links, long j, int i, String str) {
        return m31431a7(links, j, i, "", null);
    }

    /* JADX INFO: renamed from: a6 */
    public final /* synthetic */ uxj0 m31430a6(Envelope envelope) {
        this.f20008x0.onNext(((CommonData) envelope.getModuleData(CommonData.class)).users);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: a7 */
    public C22421c<uxj0> m31431a7(final Links links, final long j, final int i, final String str, LikersTriggerBy likersTriggerBy) {
        return this.f91137Q.scheduled("likers", 0, new pcj() { // from class: l.ci9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f81911a.m31400L5(j, i, links, str);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public final /* synthetic */ C22421c m31432b6(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.bk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209028b();
            }
        }).map(new qcj() { // from class: l.ck9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82267a.m31430a6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public final C22421c<Envelope> m31433b7(final long j, final LikersTriggerBy likersTriggerBy) {
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return this.f91137Q.scheduled("likersCount" + j, 0, new pcj() { // from class: l.ig9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f114767a.m31406O5(userM116600p9, j, likersTriggerBy);
            }
        });
    }

    /* JADX INFO: renamed from: c6 */
    public final /* synthetic */ Envelope m31434c6(Envelope envelope) {
        final CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!jyb.m147479J(commonData.users)) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.xi9
                @Override // p153l.x20
                public final void call() {
                    CoreModule.m30932N().mo61498Rf(jyb.m147486Q(commonData.users, new qcj() { // from class: l.ak9
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((User) obj).f56859id;
                        }
                    }));
                }
            });
        }
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: c7 */
    public C22421c<uxj0> m31435c7() {
        return m31437d7(this.f19996l0.get().longValue());
    }

    /* JADX INFO: renamed from: d6 */
    public final /* synthetic */ void m31436d6(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: d7 */
    public C22421c<uxj0> m31437d7(long j) {
        return m31439e7(j, LikersTriggerBy.normal);
    }

    /* JADX INFO: renamed from: e6 */
    public final /* synthetic */ uxj0 m31438e6(String str, Envelope envelope) {
        this.f19994j0.remove(str);
        int i = envelope.pagination.total;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        this.f19980V.onNext(jyb.m147494Y(Integer.valueOf(i), list));
        C4870a c4870aM222761e = this.f19979U.m222761e();
        this.f20010z0.clear();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.mi9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f136938a.m31436d6((SeeInfos) obj);
                }
            });
        }
        if (c4870aM222761e == null || c4870aM222761e.f20013c > 0 || i != c4870aM222761e.f20012b) {
            this.f19979U.onNext(C4870a.m31500a(null, i, 0, list, list, null, null));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: e7 */
    public C22421c<uxj0> m31439e7(long j, LikersTriggerBy likersTriggerBy) {
        return m31441f7(j, likersTriggerBy, false);
    }

    /* JADX INFO: renamed from: f6 */
    public final /* synthetic */ C22421c m31440f6(final long j, final int i, final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.jg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(CoreLikers.m31272E5(j, i, null, str))).m209028b();
            }
        }).map(new qcj() { // from class: l.mg9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136700a.m31434c6((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.ng9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreLikers.m31290N4((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.og9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147196a.m31438e6(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public C22421c<uxj0> m31441f7(final long j, final LikersTriggerBy likersTriggerBy, final boolean z) {
        final boolean z2 = j == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(z2 ? "seeCount" : "seeCountUntil");
        sb.append(likersTriggerBy);
        String string = sb.toString();
        final User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        return this.f91137Q.scheduled(string, 0, new pcj() { // from class: l.pg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152238a.m31418U5(userM116593na, j, likersTriggerBy, z2, z);
            }
        }).doOnError(new y20() { // from class: l.qg9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157389a.m31420V5(likersTriggerBy, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final /* synthetic */ Envelope m31442g6(Envelope envelope) {
        final CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (!jyb.m147479J(commonData.users)) {
            this.f91137Q.f20351U.m128074a(new x20() { // from class: l.ei9
                @Override // p153l.x20
                public final void call() {
                    CoreModule.m30932N().mo61498Rf(jyb.m147486Q(commonData.users, new qcj() { // from class: l.dg9
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((User) obj).f56859id;
                        }
                    }));
                }
            });
        }
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: g7 */
    public C22421c<uxj0> m31443g7(LikersTriggerBy likersTriggerBy) {
        if (likersTriggerBy == LikersTriggerBy.home_tab_msg) {
            this.f19982X.onNext(null);
        }
        return m31439e7(this.f19996l0.get().longValue(), likersTriggerBy);
    }

    /* JADX INFO: renamed from: h6 */
    public final /* synthetic */ void m31444h6(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: h7 */
    public C22421c<uxj0> m31445h7(final Links links, final long j, final int i) {
        return this.f91137Q.scheduled("likers_my_tab", 0, new pcj() { // from class: l.uj9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f179186a.m31428Z5(j, i, links);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public void m31446i5(String str) {
        this.f20010z0.add(str);
    }

    /* JADX INFO: renamed from: i6 */
    public final /* synthetic */ uxj0 m31447i6(Envelope envelope) {
        int i = envelope.pagination.total;
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        this.f19981W.onNext(jyb.m147494Y(Integer.valueOf(i), list));
        C4870a c4870aM222761e = this.f19979U.m222761e();
        this.f20010z0.clear();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.lj9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132313a.m31444h6((SeeInfos) obj);
                }
            });
        }
        if (c4870aM222761e == null || c4870aM222761e.f20013c > 0 || i != c4870aM222761e.f20012b) {
            this.f19979U.onNext(C4870a.m31500a(null, i, 0, list, list, null, null));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: i7 */
    public C22421c<uxj0> m31448i7() {
        ArrayList arrayList = new ArrayList();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        arrayList.add(new C4890f0.a().m32980a(1).m32982c(C4890f0.a.b.m32991d().m32993b()).m32981b(C4890f0.a.C22813a.m32987d().m32988e("50000"), C4890f0.a.C22813a.m32985b().m32988e(String.valueOf(userM116600p9.age))));
        arrayList.add(new C4890f0.a().m32980a(100).m32981b(C4890f0.a.C22813a.m32985b().m32988e(String.valueOf(userM116600p9.age))).m32982c(C4890f0.a.b.m32990c().m32992a()));
        arrayList.add(new C4890f0.a().m32980a(100).m32982c(C4890f0.a.b.m32990c().m32992a()));
        final String strM32978c = new C4890f0().m32979d().m32977b().m32976a((C4890f0.a[]) arrayList.toArray(new C4890f0.a[arrayList.size()])).m32978c();
        return this.f91137Q.scheduled("likers_for_popup_distance", 0, new pcj() { // from class: l.qj9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f157945a.m31432b6(strM32978c);
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public void m31449j5() {
        this.f19977S.onNext(null);
    }

    /* JADX INFO: renamed from: j6 */
    public final /* synthetic */ C22421c m31450j6(final long j, final int i) {
        return new ti20(new pcj() { // from class: l.th9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(CoreLikers.m31272E5(j, i, null, null))).m209028b();
            }
        }).map(new qcj() { // from class: l.uh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179002a.m31442g6((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.vh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreLikers.m31262A3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.wh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189099a.m31447i6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public C22421c<uxj0> m31451j7(final int i, final long j, final String str) {
        final String str2 = "loadLikersWithoutPrivilege_" + j;
        this.f19994j0.add(str2);
        return this.f91137Q.scheduled(str2, 0, new pcj() { // from class: l.gh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104077a.m31440f6(j, i, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public void m31452k5() {
        this.f19993i0.clear();
    }

    /* JADX INFO: renamed from: k6 */
    public final /* synthetic */ x1d0 m31453k6(long j) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31388F5(j))).m209028b();
    }

    /* JADX INFO: renamed from: k7 */
    public C22421c<uxj0> m31454k7(final int i, final long j) {
        return this.f91137Q.scheduled("loadLikersWithoutPrivilege_mytab_" + j, 0, new pcj() { // from class: l.rh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f163080a.m31450j6(j, i);
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public void m31455l5() {
        this.f19999o0.put(0);
        this.f19977S.onNext(null);
        this.f19979U.onNext(C4870a.m31500a(LikersTriggerBy.clear_before_patch_setting, 0, 0, null, null, null, null));
        this.f19993i0.clear();
        this.f19995k0.clear();
    }

    /* JADX INFO: renamed from: l6 */
    public final /* synthetic */ Envelope m31456l6(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34811c()) {
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<Figure> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).figures;
            if (!jyb.m147479J(list) || !jyb.m147479J(list2)) {
                this.f91137Q.m32495w3(envelope, null);
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: l7 */
    public C22421c<uxj0> m31457l7(final long j) {
        return this.f91137Q.scheduled("meet_entrance_likers", 0, new pcj() { // from class: l.nh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f141946a.m31462n6(j);
            }
        }).doOnError(new y20() { // from class: l.oh9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147349a.m31465o6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public void m31458m5() {
        CoreModule.f18264c.clearRequests("likers", 0);
        CoreModule.f18264c.clearRequests("seeCount", 0);
        CoreModule.f18264c.clearRequests("seeCountUntil", 0);
        Iterator<String> it = this.f19994j0.iterator();
        while (it.hasNext()) {
            this.f91137Q.clearRequests(it.next(), 0);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ uxj0 m31459m6(Envelope envelope) {
        int i;
        int i2;
        this.f20006v0 = true;
        if (NullChecker.m82486a(envelope.pagination.countInfo)) {
            CountInfo countInfo = envelope.pagination.countInfo;
            int i3 = countInfo.all;
            i2 = countInfo.unread;
            i = i3;
        } else {
            i = 0;
            i2 = 0;
        }
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = (ShowOnlineForWhoIMeet) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).showOnlineForWhoIMeet, new qcj() { // from class: l.wj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                ShowOnlineForWhoIMeet showOnlineForWhoIMeet2 = (ShowOnlineForWhoIMeet) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(showOnlineForWhoIMeet2.f21242id) && showOnlineForWhoIMeet2.show);
            }
        });
        LikersTriggerBy likersTriggerBy = LikersTriggerBy.home_tab_msg;
        List<User> list2 = null;
        List<User> list3 = i2 > 0 ? list : null;
        if (i2 <= 0) {
            list2 = list;
        }
        this.f19982X.onNext(C4870a.m31502c(likersTriggerBy, i, i2, list3, list2, null, (Figure) jyb.m147519l0(((CoreData) envelope.getModuleData(CoreData.class)).figures), null, showOnlineForWhoIMeet));
        gta.m132210e().m132214d().mo34880lb();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: m7 */
    public C22421c<uxj0> m31460m7(final String str, final long j) {
        return this.f91137Q.scheduled("meet_likers_list_old_likers", 0, new pcj() { // from class: l.jj9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121152a.m31480t6(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public void m31461n5() {
        CoreModule.f18264c.clearRequests("likers_my_tab", 0);
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ C22421c m31462n6(final long j) {
        return new ti20(new pcj() { // from class: l.rj9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f163434a.m31453k6(j);
            }
        }).map(new qcj() { // from class: l.sj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f168954a.m31456l6((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.tj9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174567a.m31459m6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public C22421c<uxj0> m31463n7(final long j) {
        return this.f91137Q.scheduled("meet_likers_list_old_likers_no_privilege", 0, new pcj() { // from class: l.yf9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f199454a.m31376A6(j);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public void m31464o5() {
        C4870a c4870aM222761e = this.f19982X.m222761e();
        if (c4870aM222761e != null) {
            c4870aM222761e.f20013c = 0;
        }
        this.f19982X.onNext(c4870aM222761e);
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ void m31465o6(Throwable th) {
        C22507a<C4870a> c22507a = this.f19982X;
        c22507a.onNext(c22507a.m222761e());
    }

    /* JADX INFO: renamed from: o7 */
    public C22421c<uxj0> m31466o7(final String str, final long j) {
        return this.f91137Q.scheduled("meet_likers_list_new_likers", 0, new pcj() { // from class: l.vg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184005a.m31389F6(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public void m31467p5() {
        if (this.f19988d0.m222765i()) {
            Optional<vg60<User>> optionalM222761e = this.f19988d0.m222761e();
            if (optionalM222761e.isPresent()) {
                vg60<User> vg60Var = optionalM222761e.get();
                for (int i = 0; i < vg60Var.f184001a.size(); i++) {
                    this.f19992h0.remove(vg60Var.f184001a.get(i).f56859id);
                }
            }
        }
        this.f19988d0.onNext(Optional.absent());
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ Envelope m31468p6(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.vj9
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.bg9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: p7 */
    public C22421c<uxj0> m31469p7(final long j) {
        return this.f91137Q.scheduled("meet_likers_list_new_likers_no_privilege", 0, new pcj() { // from class: l.ni9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f142100a.m31399K6(j);
            }
        });
    }

    /* JADX INFO: renamed from: q5 */
    public void m31470q5() {
        this.f20001q0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
        this.f19984Z.onNext(0);
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ void m31471q6(List list, User user) {
        if (this.f19992h0.contains(user.f56859id)) {
            return;
        }
        this.f19992h0.add(user.f56859id);
        list.add(user);
    }

    /* JADX INFO: renamed from: q7 */
    public C22421c<pf60<User, Integer>> m31472q7(long j) {
        return m31475r7(j, "");
    }

    /* JADX INFO: renamed from: r5 */
    public void m31473r5() {
        this.f19985a0.onNext(0L);
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m31474r6(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: r7 */
    public C22421c<pf60<User, Integer>> m31475r7(long j, String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query=count&verified=true&with_figure=true");
        if (j == 0) {
            j = uqb0.f180376H.guessedCurrentServerTime();
            this.f20001q0.put(Long.valueOf(j));
        }
        String strDateToApiTimeString = Converter.dateToApiTimeString(j);
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            try {
                sb.append(URLEncoder.encode(strDateToApiTimeString, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m82479c(e);
            }
        }
        return this.f91137Q.scheduled("load_new_likes_count_for_banner" + str, 0, new pcj() { // from class: l.sg9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.vi9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32288c1(sb.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.wi9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Envelope envelope = (Envelope) obj;
                        return pf60.m172085a(!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users) ? ((CommonData) envelope.getModuleData(CommonData.class)).users.get(0) : null, Integer.valueOf(envelope.pagination.total));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ uxj0 m31477s6(Envelope envelope) {
        vg60 vg60Var;
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        if (this.f19990f0.m222761e() == null || this.f19992h0.isEmpty()) {
            this.f19992h0.addAll(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.zh9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).f56859id;
                }
            }));
            vg60Var = new vg60(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks);
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f19990f0.m222765i() && this.f19990f0.m222761e().isPresent()) {
                arrayList.addAll(this.f19990f0.m222761e().get().f184001a);
            }
            final ArrayList arrayList2 = new ArrayList();
            jyb.m147537z(((CommonData) envelope.getModuleData(CommonData.class)).users, new y20() { // from class: l.ai9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71461a.m31471q6(arrayList2, (User) obj);
                }
            });
            if (arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
            vg60Var = new vg60(arrayList, dbLinks);
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147474E(((CommonData) envelope.getModuleData(CommonData.class)).users), new y20() { // from class: l.bi9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uqb0.f180374G.m127162z0(((User) obj).m61308fp().profileMiddle());
                    }
                });
            }
        }
        this.f20010z0.clear();
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.di9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88595a.m31474r6((SeeInfos) obj);
                }
            });
        }
        this.f19990f0.onNext(Optional.m15467of(vg60Var));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: s7 */
    public C22421c<uxj0> m31478s7(long j) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query=count&verified=true&with_figure=true");
        if (j == 0) {
            j = uqb0.f180376H.guessedCurrentServerTime();
            this.f20001q0.put(Long.valueOf(j));
        }
        String strDateToApiTimeString = Converter.dateToApiTimeString(j);
        if (!TextUtils.isEmpty(strDateToApiTimeString)) {
            sb.append("&read_until_time=");
            try {
                sb.append(URLEncoder.encode(strDateToApiTimeString, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m82479c(e);
            }
        }
        return this.f91137Q.scheduled("load_new_likes_count_without", 0, new pcj() { // from class: l.yi9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f200049a.m31403M6(sb);
            }
        });
    }

    /* JADX INFO: renamed from: t5 */
    public C4870a m31479t5() {
        return this.f19979U.m222761e();
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ C22421c m31480t6(final long j, final String str) {
        return new ti20(new pcj() { // from class: l.hh9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f109487a.m31483u6(j, str);
            }
        }).map(new qcj() { // from class: l.ih9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f114878a.m31468p6((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.jh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120826a.m31477s6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t7 */
    public void m31481t7() {
        this.f19985a0.onNext(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: u5 */
    public List<User> m31482u5() {
        return this.f20008x0.m222761e();
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ x1d0 m31483u6(long j, String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31390G5(j, false, str))).m209028b();
    }

    /* JADX INFO: renamed from: u7 */
    public C22421c<C4870a> m31484u7() {
        return this.f19982X;
    }

    /* JADX INFO: renamed from: v5 */
    public C4870a m31485v5() {
        return this.f19982X.m222761e();
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ x1d0 m31486v6(long j) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32180A0(m31390G5(j, false, ""))).m209028b();
    }

    /* JADX INFO: renamed from: v7 */
    public C22421c<Optional<vg60<User>>> m31487v7() {
        return this.f19990f0.asObservable();
    }

    /* JADX INFO: renamed from: w5 */
    public C22421c<Integer> m31488w5() {
        return this.f19983Y.asObservable();
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ Envelope m31489w6(final Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.qi9
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61498Rf(jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.cg9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                }));
            }
        });
        this.f91137Q.m32496x3(envelope, null, true);
        return envelope;
    }

    /* JADX INFO: renamed from: w7 */
    public C22421c<Optional<vg60<User>>> m31490w7() {
        return this.f19991g0.asObservable();
    }

    /* JADX INFO: renamed from: x5 */
    public User m31491x5() {
        if (this.f19995k0.size() == 0) {
            return null;
        }
        ArrayList arrayListM147486Q = jyb.m147486Q(this.f19995k0.values(), new qcj() { // from class: l.xh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((User) obj).location.distance);
            }
        });
        final int iIntValue = ((Integer) arrayListM147486Q.get(0)).intValue();
        Iterator it = arrayListM147486Q.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (iIntValue2 < iIntValue) {
                iIntValue = iIntValue2;
            }
        }
        return (User) jyb.m147529r(this.f19995k0.values(), new qcj() { // from class: l.yh9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).location.distance == iIntValue);
            }
        });
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m31492x6(SeeInfos seeInfos) {
        this.f20010z0.add(seeInfos.userId);
    }

    /* JADX INFO: renamed from: x7 */
    public C22421c<Optional<vg60<User>>> m31493x7() {
        return this.f19988d0.asObservable();
    }

    /* JADX INFO: renamed from: y5 */
    public C22421c<Integer> m31494y5() {
        return this.f19984Z;
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m31495y6(ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
        if (NullChecker.m82486a(showOnlineForWhoIMeet) && showOnlineForWhoIMeet.show && !TextUtils.isEmpty(showOnlineForWhoIMeet.f21242id)) {
            this.f20009y0.add(showOnlineForWhoIMeet.f21242id);
        }
    }

    /* JADX INFO: renamed from: y7 */
    public C22421c<Optional<vg60<User>>> m31496y7() {
        return this.f19989e0.asObservable();
    }

    /* JADX INFO: renamed from: z5 */
    public C22421c<Long> m31497z5() {
        return this.f19985a0;
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ uxj0 m31498z6(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos)) {
            jyb.m147537z(((CoreData) envelope.getModuleData(CoreData.class)).seeInfos, new y20() { // from class: l.fi9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99158a.m31492x6((SeeInfos) obj);
                }
            });
        }
        List<ShowOnlineForWhoIMeet> list = ((CoreData) envelope.getModuleData(CoreData.class)).showOnlineForWhoIMeet;
        this.f20009y0.clear();
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.gi9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104209a.m31495y6((ShowOnlineForWhoIMeet) obj);
                }
            });
        }
        DbLinks dbLinks = new DbLinks();
        dbLinks.total = envelope.pagination.total;
        this.f19991g0.onNext(Optional.m15467of(new vg60(((CommonData) envelope.getModuleData(CommonData.class)).users, dbLinks)));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: z7 */
    public C22421c<vg60<User>> m31499z7() {
        return this.f19986b0;
    }

    /* JADX INFO: renamed from: s5 */
    public final void m31476s5(vg60<User> vg60Var) {
    }
}
