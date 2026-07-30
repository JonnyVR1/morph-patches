package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.InteractionReason;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ptm {

    /* JADX INFO: renamed from: e */
    public static volatile ptm f151179e;

    /* JADX INFO: renamed from: a */
    public tpd0 f151180a = new tpd0("feed_insert_moments_limit_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f151181b = new zpd0("feed_insert_moments_date_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public Map<String, Map<String, List<Moment>>> f151182c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f151183d = new HashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m171351b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static ptm m171352d() {
        if (f151179e == null) {
            synchronized (ptm.class) {
                try {
                    if (f151179e == null) {
                        f151179e = new ptm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151179e;
    }

    /* JADX INFO: renamed from: c */
    public void m171353c(String str) {
        this.f151182c.remove(str);
        this.f151183d.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public void m171354e(Act act, PutongFrag putongFrag, final String str, final Moment moment, String str2, RawFeed rawFeed) {
        final py60 py60Var;
        if (!(NullChecker.m81303a(rawFeed) && NullChecker.m81303a(rawFeed.interaction) && rawFeed.interaction.isInteraction) && m171356g() && (putongFrag instanceof PhotoAlbumBaseFrag)) {
            List<String> list = this.f151183d.get(str);
            if ((vwb.m200296J(list) || !list.contains(moment.f56011id)) && (py60Var = ((PhotoAlbumBaseFrag) putongFrag).f41451A) != null) {
                this.f151180a.put(Integer.valueOf(this.f151180a.get().intValue() + 1));
                zi60.m218961w();
                act.duringCreated(FeedModule.f38855d.m209398X7(zi60.m218960D(str), moment.f56011id, str2)).subscribe(mkd0.m154956H(new e30() { // from class: l.ntm
                    @Override // p149l.e30
                    public final void call(Object obj) throws Throwable {
                        this.f140489a.m171357h(py60Var, str, moment, (j760) obj);
                    }
                }, new e30() { // from class: l.otm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ptm.m171351b((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m171355f(PutongFrag putongFrag, String str, String str2) throws Throwable {
        py60 py60Var;
        Map<String, List<Moment>> map;
        if (putongFrag == null || (py60Var = ((PhotoAlbumBaseFrag) putongFrag).f41451A) == null || (map = this.f151182c.get(str2)) == null || vwb.m200296J(map.get(str))) {
            return;
        }
        py60Var.m172064S0(map.get(str), str);
        this.f151182c.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m171356g() {
        if (!nkg.m159878f().enable) {
            return false;
        }
        if (!mqi0.m155929D(this.f151181b.get().longValue()) || this.f151181b.get().longValue() == 0) {
            this.f151181b.put(Long.valueOf(mqi0.m155944o()));
            this.f151180a.put(0);
        }
        return mqi0.m155929D(this.f151181b.get().longValue()) && this.f151180a.get().intValue() < nkg.m159878f().limitTime;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m171357h(py60 py60Var, String str, Moment moment, j760 j760Var) throws Throwable {
        if (j760Var == null || vwb.m200296J((Collection) j760Var.f116564a) || vwb.m200296J((Collection) j760Var.f116565b)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) j760Var.f116564a);
        ArrayList arrayList2 = new ArrayList((Collection) j760Var.f116565b);
        hx60 hx60Var = py60Var.f151803b;
        if (hx60Var == null || hx60Var.f109833b == null) {
            return;
        }
        boolean z = false;
        InteractionReason interactionReason = ((RawFeed) arrayList2.get(0)).interaction;
        if (arrayList.size() > 1 && arrayList2.size() > 1) {
            z = true;
        }
        interactionReason.haveMoreInteraction = z;
        py60Var.f151803b.f109833b.m130719a(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((RawFeed) it.next()).interaction.isInteraction = true;
        }
        m171360k(arrayList, str, moment, py60Var);
    }

    /* JADX INFO: renamed from: i */
    public void m171358i() {
        this.f151182c.clear();
        this.f151183d.clear();
        f151179e = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m171359j(String str, Moment moment) {
        List<String> arrayList = this.f151183d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f151183d.put(str, arrayList);
        }
        if (arrayList.contains(moment.f56011id)) {
            return;
        }
        arrayList.add(moment.f56011id);
    }

    /* JADX INFO: renamed from: k */
    public final void m171360k(List<Moment> list, String str, Moment moment, py60 py60Var) throws Throwable {
        boolean z = list.size() > 1;
        Moment moment2 = list.get(0);
        if (z) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(0);
            Map<String, List<Moment>> map = this.f151182c.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(moment2.f56011id, arrayList);
            this.f151182c.put(str, map);
        }
        py60Var.m172062R0(moment2, moment.f56011id);
        m171359j(str, moment);
    }
}
