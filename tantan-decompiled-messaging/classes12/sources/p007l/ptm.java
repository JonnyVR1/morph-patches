package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.InteractionReason;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e30;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ptm {

    /* JADX INFO: renamed from: e */
    public static volatile ptm f11975e;

    /* JADX INFO: renamed from: a */
    public tpd0 f11976a = new tpd0("feed_insert_moments_limit_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f11977b = new zpd0("feed_insert_moments_date_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public Map<String, Map<String, List<Moment>>> f11978c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f11979d = new HashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13220b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static ptm m13221d() {
        if (f11975e == null) {
            synchronized (ptm.class) {
                try {
                    if (f11975e == null) {
                        f11975e = new ptm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11975e;
    }

    /* JADX INFO: renamed from: c */
    public void m13222c(String str) {
        this.f11978c.remove(str);
        this.f11979d.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public void m13223e(Act act, PutongFrag putongFrag, final String str, final Moment moment, String str2, RawFeed rawFeed) {
        final py60 py60Var;
        if (!(NullChecker.a(rawFeed) && NullChecker.a(rawFeed.interaction) && rawFeed.interaction.isInteraction) && m13225g() && (putongFrag instanceof PhotoAlbumBaseFrag)) {
            List<String> list = this.f11979d.get(str);
            if ((vwb.J(list) || !list.contains(((DbObject) moment).id)) && (py60Var = ((PhotoAlbumBaseFrag) putongFrag).f2912A) != null) {
                this.f11976a.put(Integer.valueOf(((Integer) this.f11976a.get()).intValue() + 1));
                zi60.m17436w();
                act.duringCreated(FeedModule.f316d.m16579X7(zi60.m17435D(str), ((DbObject) moment).id, str2)).subscribe(mkd0.H(new e30() { // from class: l.ntm
                    public final void call(Object obj) throws Throwable {
                        this.f10880a.m13226h(py60Var, str, moment, (j760) obj);
                    }
                }, new e30() { // from class: l.otm
                    public final void call(Object obj) {
                        ptm.m13220b((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m13224f(PutongFrag putongFrag, String str, String str2) throws Throwable {
        py60 py60Var;
        Map<String, List<Moment>> map;
        if (putongFrag == null || (py60Var = ((PhotoAlbumBaseFrag) putongFrag).f2912A) == null || (map = this.f11978c.get(str2)) == null || vwb.J(map.get(str))) {
            return;
        }
        py60Var.m13322S0(map.get(str), str);
        this.f11978c.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m13225g() {
        if (!nkg.m12237f().enable) {
            return false;
        }
        if (!mqi0.D(((Long) this.f11977b.get()).longValue()) || ((Long) this.f11977b.get()).longValue() == 0) {
            this.f11977b.put(Long.valueOf(mqi0.o()));
            this.f11976a.put(0);
        }
        return mqi0.D(((Long) this.f11977b.get()).longValue()) && ((Integer) this.f11976a.get()).intValue() < nkg.m12237f().limitTime;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m13226h(py60 py60Var, String str, Moment moment, j760 j760Var) throws Throwable {
        if (j760Var == null || vwb.J((Collection) j760Var.a) || vwb.J((Collection) j760Var.b)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) j760Var.a);
        ArrayList arrayList2 = new ArrayList((Collection) j760Var.b);
        hx60 hx60Var = py60Var.f12011b;
        if (hx60Var == null || hx60Var.f8835b == null) {
            return;
        }
        boolean z = false;
        InteractionReason interactionReason = ((RawFeed) arrayList2.get(0)).interaction;
        if (arrayList.size() > 1 && arrayList2.size() > 1) {
            z = true;
        }
        interactionReason.haveMoreInteraction = z;
        py60Var.f12011b.f8835b.m10600a(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((RawFeed) it.next()).interaction.isInteraction = true;
        }
        m13229k(arrayList, str, moment, py60Var);
    }

    /* JADX INFO: renamed from: i */
    public void m13227i() {
        this.f11978c.clear();
        this.f11979d.clear();
        f11975e = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m13228j(String str, Moment moment) {
        List<String> arrayList = this.f11979d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f11979d.put(str, arrayList);
        }
        if (arrayList.contains(((DbObject) moment).id)) {
            return;
        }
        arrayList.add(((DbObject) moment).id);
    }

    /* JADX INFO: renamed from: k */
    public final void m13229k(List<Moment> list, String str, Moment moment, py60 py60Var) throws Throwable {
        boolean z = list.size() > 1;
        Moment moment2 = list.get(0);
        if (z) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(0);
            Map<String, List<Moment>> map = this.f11978c.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(((DbObject) moment2).id, arrayList);
            this.f11978c.put(str, map);
        }
        py60Var.m13320R0(moment2, ((DbObject) moment).id);
        m13228j(str, moment);
    }
}
