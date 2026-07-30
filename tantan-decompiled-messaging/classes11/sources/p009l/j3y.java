package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersItem;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.k6c0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j3y extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public final long f14930c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<User> f14931d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public DbLinks f14932e = null;

    public j3y(long j) {
        this.f14930c = j;
    }

    /* JADX INFO: renamed from: H */
    private void m16860H(String str) {
        CoreModule.c.u0.k7(str, this.f14930c);
    }

    /* JADX INFO: renamed from: C */
    public int m16862C() {
        return this.f14931d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16863D(ViewGroup viewGroup, int i) {
        return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.y1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m16861A(View view, User user, int i, int i2) {
        ((MeetLikersNewLikersItem) view).m4603T(user);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f14931d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public boolean m16866I(final String str) {
        int iG = vwb.G(this.f14931d, new w9j() { // from class: l.i3y
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((DbObject) ((User) obj)).id, str));
            }
        });
        if (iG == -1) {
            return false;
        }
        this.f14931d.remove(iG);
        notifyItemRemoved(iG);
        notifyItemRangeChanged(iG, this.f14931d.size());
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m16867J(DbLinks dbLinks, List<User> list) {
        this.f14931d.clear();
        this.f14931d.addAll(list);
        this.f14932e = dbLinks;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m16868e(int i) {
        super.e(i);
        if (vwb.J(this.f14931d) || i < this.f14931d.size() - 2 || !NullChecker.a(this.f14932e) || !NullChecker.a(this.f14932e.links) || TextUtils.isEmpty(this.f14932e.links.next)) {
            return;
        }
        m16860H(this.f14932e.links.next);
    }
}
