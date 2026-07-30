package p007l;

import android.view.View;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.j760;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class za70 {

    /* JADX INFO: renamed from: a */
    public xa70 f15673a;

    public za70(xa70 xa70Var) {
        this.f15673a = xa70Var;
    }

    /* JADX INFO: renamed from: a */
    public String m17282a(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: b */
    public j760[] m17283b() {
        Moment moment = this.f15673a.f14820a;
        if (!NullChecker.a(moment)) {
            return new j760[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("owner_id", moment.owner));
        if (moment.isLive) {
            arrayList.add(new j760("liveId", moment.live.f228id));
            arrayList.add(new j760("anchorId", moment.live.anchor.f264id));
        } else {
            arrayList.add(new j760("moment_id", ((DbObject) moment).id));
        }
        if (NullChecker.a(this.f15673a.f14825f)) {
            arrayList.add(new j760("moment_user_id", ((DbObject) this.f15673a.f14825f).id));
        }
        arrayList.add(new j760("moment_type", moment.isLive ? "live" : zi60.m17436w().m17467y(moment)));
        arrayList.add(new j760("receiver_user_id", moment.owner));
        return (j760[]) arrayList.toArray(new j760[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public String m17284c() {
        xa70 xa70Var = this.f15673a;
        String strM10224d = (xa70Var.f14822c || !"from_discover_dating".equals(xa70Var.f14821b)) ? "" : "p_discover_dating";
        xa70 xa70Var2 = this.f15673a;
        if (!xa70Var2.f14822c && "from_discover_discussion".equals(xa70Var2.f14821b)) {
            strM10224d = "p_discover_discussion";
        }
        xa70 xa70Var3 = this.f15673a;
        if (!xa70Var3.f14822c && "from_activity_tab_one".equals(xa70Var3.f14821b)) {
            strM10224d = fm20.m10224d("from_activity_tab_one");
        }
        xa70 xa70Var4 = this.f15673a;
        return (xa70Var4.f14822c || !"from_activity_tab_two".equals(xa70Var4.f14821b)) ? strM10224d : fm20.m10224d("from_activity_tab_two");
    }

    /* JADX INFO: renamed from: d */
    public boolean m17285d(View view) {
        if (!(view instanceof VDraweeView)) {
            return false;
        }
        zi60 zi60VarM17436w = zi60.m17436w();
        xa70 xa70Var = this.f15673a;
        zi60VarM17436w.m17456m(xa70Var.f14820a, xa70Var.f14821b, xa70Var.f14822c);
        return true;
    }
}
