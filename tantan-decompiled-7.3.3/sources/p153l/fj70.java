package p153l;

import android.view.View;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class fj70 {

    /* JADX INFO: renamed from: a */
    public dj70 f99306a;

    public fj70(dj70 dj70Var) {
        this.f99306a = dj70Var;
    }

    /* JADX INFO: renamed from: a */
    public String m125787a(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: b */
    public pf60[] m125788b() {
        Moment moment = this.f99306a.f88791a;
        if (!NullChecker.m82486a(moment)) {
            return new pf60[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60("owner_id", moment.owner));
        if (moment.isLive) {
            arrayList.add(new pf60("liveId", moment.live.f39615id));
            arrayList.add(new pf60("anchorId", moment.live.anchor.f39651id));
        } else {
            arrayList.add(new pf60("moment_id", moment.f56859id));
        }
        if (NullChecker.m82486a(this.f99306a.f88796f)) {
            arrayList.add(new pf60("moment_user_id", this.f99306a.f88796f.f56859id));
        }
        arrayList.add(new pf60("moment_type", moment.isLive ? "live" : er60.m122104w().m122135y(moment)));
        arrayList.add(new pf60("receiver_user_id", moment.owner));
        return (pf60[]) arrayList.toArray(new pf60[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public String m125789c() {
        dj70 dj70Var = this.f99306a;
        String strM173809d = (dj70Var.f88793c || !"from_discover_dating".equals(dj70Var.f88792b)) ? "" : "p_discover_dating";
        dj70 dj70Var2 = this.f99306a;
        if (!dj70Var2.f88793c && "from_discover_discussion".equals(dj70Var2.f88792b)) {
            strM173809d = "p_discover_discussion";
        }
        dj70 dj70Var3 = this.f99306a;
        if (!dj70Var3.f88793c && "from_activity_tab_one".equals(dj70Var3.f88792b)) {
            strM173809d = pu20.m173809d("from_activity_tab_one");
        }
        dj70 dj70Var4 = this.f99306a;
        return (dj70Var4.f88793c || !"from_activity_tab_two".equals(dj70Var4.f88792b)) ? strM173809d : pu20.m173809d("from_activity_tab_two");
    }

    /* JADX INFO: renamed from: d */
    public boolean m125790d(View view) {
        if (!(view instanceof VDraweeView)) {
            return false;
        }
        er60 er60VarM122104w = er60.m122104w();
        dj70 dj70Var = this.f99306a;
        er60VarM122104w.m122124m(dj70Var.f88791a, dj70Var.f88792b, dj70Var.f88793c);
        return true;
    }
}
