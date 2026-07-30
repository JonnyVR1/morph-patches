package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.InteractionReason;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class qvm {

    /* JADX INFO: renamed from: e */
    public static volatile qvm f159783e;

    /* JADX INFO: renamed from: a */
    public vxd0 f159784a = new vxd0("feed_insert_moments_limit_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: b */
    public byd0 f159785b = new byd0("feed_insert_moments_date_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public Map<String, Map<String, List<Moment>>> f159786c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f159787d = new HashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m178364b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static qvm m178365d() {
        if (f159783e == null) {
            synchronized (qvm.class) {
                try {
                    if (f159783e == null) {
                        f159783e = new qvm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f159783e;
    }

    /* JADX INFO: renamed from: c */
    public void m178366c(String str) {
        this.f159786c.remove(str);
        this.f159787d.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public void m178367e(Act act, PutongFrag putongFrag, final String str, final Moment moment, String str2, RawFeed rawFeed) {
        final v670 v670Var;
        if (!(NullChecker.m82486a(rawFeed) && NullChecker.m82486a(rawFeed.interaction) && rawFeed.interaction.isInteraction) && m178369g() && (putongFrag instanceof PhotoAlbumBaseFrag)) {
            List<String> list = this.f159787d.get(str);
            if ((jyb.m147479J(list) || !list.contains(moment.f56859id)) && (v670Var = ((PhotoAlbumBaseFrag) putongFrag).f42299A) != null) {
                this.f159784a.put(Integer.valueOf(this.f159784a.get().intValue() + 1));
                er60.m122104w();
                act.duringCreated(FeedModule.f39703d.m145639X7(er60.m122103D(str), moment.f56859id, str2)).subscribe(psd0.m173597H(new y20() { // from class: l.ovm
                    @Override // p153l.y20
                    public final void call(Object obj) throws Throwable {
                        this.f149278a.m178370h(v670Var, str, moment, (pf60) obj);
                    }
                }, new y20() { // from class: l.pvm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        qvm.m178364b((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m178368f(PutongFrag putongFrag, String str, String str2) throws Throwable {
        v670 v670Var;
        Map<String, List<Moment>> map;
        if (putongFrag == null || (v670Var = ((PhotoAlbumBaseFrag) putongFrag).f42299A) == null || (map = this.f159786c.get(str2)) == null || jyb.m147479J(map.get(str))) {
            return;
        }
        v670Var.m200018S0(map.get(str), str);
        this.f159786c.remove(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m178369g() {
        if (!cmg.m111207f().enable) {
            return false;
        }
        if (!pzi0.m174439D(this.f159785b.get().longValue()) || this.f159785b.get().longValue() == 0) {
            this.f159785b.put(Long.valueOf(pzi0.m174454o()));
            this.f159784a.put(0);
        }
        return pzi0.m174439D(this.f159785b.get().longValue()) && this.f159784a.get().intValue() < cmg.m111207f().limitTime;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m178370h(v670 v670Var, String str, Moment moment, pf60 pf60Var) throws Throwable {
        if (pf60Var == null || jyb.m147479J((Collection) pf60Var.f152156a) || jyb.m147479J((Collection) pf60Var.f152157b)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) pf60Var.f152156a);
        ArrayList arrayList2 = new ArrayList((Collection) pf60Var.f152157b);
        n570 n570Var = v670Var.f182605b;
        if (n570Var == null || n570Var.f140315b == null) {
            return;
        }
        boolean z = false;
        InteractionReason interactionReason = ((RawFeed) arrayList2.get(0)).interaction;
        if (arrayList.size() > 1 && arrayList2.size() > 1) {
            z = true;
        }
        interactionReason.haveMoreInteraction = z;
        v670Var.f182605b.f140315b.m177158a(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((RawFeed) it.next()).interaction.isInteraction = true;
        }
        m178373k(arrayList, str, moment, v670Var);
    }

    /* JADX INFO: renamed from: i */
    public void m178371i() {
        this.f159786c.clear();
        this.f159787d.clear();
        f159783e = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m178372j(String str, Moment moment) {
        List<String> arrayList = this.f159787d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f159787d.put(str, arrayList);
        }
        if (arrayList.contains(moment.f56859id)) {
            return;
        }
        arrayList.add(moment.f56859id);
    }

    /* JADX INFO: renamed from: k */
    public final void m178373k(List<Moment> list, String str, Moment moment, v670 v670Var) throws Throwable {
        boolean z = list.size() > 1;
        Moment moment2 = list.get(0);
        if (z) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(0);
            Map<String, List<Moment>> map = this.f159786c.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(moment2.f56859id, arrayList);
            this.f159786c.put(str, map);
        }
        v670Var.m200016R0(moment2, moment.f56859id);
        m178372j(str, moment);
    }
}
