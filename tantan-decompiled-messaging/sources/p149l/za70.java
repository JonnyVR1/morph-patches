package p149l;

import android.view.View;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class za70 {

    /* JADX INFO: renamed from: a */
    public xa70 f202331a;

    public za70(xa70 xa70Var) {
        this.f202331a = xa70Var;
    }

    /* JADX INFO: renamed from: a */
    public String m217728a(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: b */
    public j760[] m217729b() {
        Moment moment = this.f202331a.f191689a;
        if (!NullChecker.m81303a(moment)) {
            return new j760[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("owner_id", moment.owner));
        if (moment.isLive) {
            arrayList.add(new j760("liveId", moment.live.f38767id));
            arrayList.add(new j760("anchorId", moment.live.anchor.f38803id));
        } else {
            arrayList.add(new j760("moment_id", moment.f56011id));
        }
        if (NullChecker.m81303a(this.f202331a.f191694f)) {
            arrayList.add(new j760("moment_user_id", this.f202331a.f191694f.f56011id));
        }
        arrayList.add(new j760("moment_type", moment.isLive ? "live" : zi60.m218961w().m218992y(moment)));
        arrayList.add(new j760("receiver_user_id", moment.owner));
        return (j760[]) arrayList.toArray(new j760[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public String m217730c() {
        xa70 xa70Var = this.f202331a;
        String strM122121d = (xa70Var.f191691c || !"from_discover_dating".equals(xa70Var.f191690b)) ? "" : "p_discover_dating";
        xa70 xa70Var2 = this.f202331a;
        if (!xa70Var2.f191691c && "from_discover_discussion".equals(xa70Var2.f191690b)) {
            strM122121d = "p_discover_discussion";
        }
        xa70 xa70Var3 = this.f202331a;
        if (!xa70Var3.f191691c && "from_activity_tab_one".equals(xa70Var3.f191690b)) {
            strM122121d = fm20.m122121d("from_activity_tab_one");
        }
        xa70 xa70Var4 = this.f202331a;
        return (xa70Var4.f191691c || !"from_activity_tab_two".equals(xa70Var4.f191690b)) ? strM122121d : fm20.m122121d("from_activity_tab_two");
    }

    /* JADX INFO: renamed from: d */
    public boolean m217731d(View view) {
        if (!(view instanceof VDraweeView)) {
            return false;
        }
        zi60 zi60VarM218961w = zi60.m218961w();
        xa70 xa70Var = this.f202331a;
        zi60VarM218961w.m218981m(xa70Var.f191689a, xa70Var.f191690b, xa70Var.f191691c);
        return true;
    }
}
