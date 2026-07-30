package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.User;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.BCoreLiveActivity;
import com.p1.mobile.putong.core.data.CoreData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.j760;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rm0 {

    /* JADX INFO: renamed from: a */
    public Links f12673a;

    /* JADX INFO: renamed from: b */
    public List<tm0> f12674b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ j760 m13905a(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (NullChecker.a(envelope.getModuleData(CoreData.class).lives)) {
            for (Live live : envelope.getModuleData(CoreData.class).lives) {
                map.put(live.f228id, live);
            }
        }
        for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
            map2.put(((DbObject) user).id, user);
        }
        if (NullChecker.a(envelope.getModuleData(CoreData.class).liveActivities)) {
            for (BCoreLiveActivity bCoreLiveActivity : envelope.getModuleData(CoreData.class).liveActivities) {
                Live live2 = (Live) map.get(bCoreLiveActivity.reference.f220id);
                User user2 = (User) map2.get(bCoreLiveActivity.owner.f220id);
                if (user2 != null) {
                    arrayList.add(new tm0(user2, live2, bCoreLiveActivity));
                }
            }
        }
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public List<tm0> m13906b() {
        return this.f12674b;
    }

    /* JADX INFO: renamed from: c */
    public Links m13907c() {
        return this.f12673a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m13908d() {
        return !vwb.J(this.f12674b);
    }

    /* JADX INFO: renamed from: e */
    public boolean m13909e() {
        Links links = this.f12673a;
        if (links == null) {
            return false;
        }
        return !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: renamed from: f */
    public c<j760<Links, List<tm0>>> m13910f(String str) {
        return CoreModule.c.Z0.c4(str).map(new w9j() { // from class: l.qm0
            public final Object call(Object obj) {
                return rm0.m13905a((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public c<j760<Links, List<tm0>>> m13911g(String str) {
        return m13910f(str);
    }

    /* JADX INFO: renamed from: h */
    public c<j760<Links, List<tm0>>> m13912h() {
        return m13910f("");
    }

    /* JADX INFO: renamed from: i */
    public void m13913i(Links links) {
        this.f12673a = links;
    }

    /* JADX INFO: renamed from: j */
    public void m13914j(List<tm0> list) {
        this.f12674b.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m13915k(List<tm0> list) {
        this.f12674b = list;
    }
}
