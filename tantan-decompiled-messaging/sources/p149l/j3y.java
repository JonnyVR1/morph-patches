package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersItem;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class j3y extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public final long f116119c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<User> f116120d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public DbLinks f116121e = null;

    public j3y(long j) {
        this.f116119c = j;
    }

    /* JADX INFO: renamed from: H */
    private void m139602H(String str) {
        CoreModule.f17545c.f19687u0.m30452k7(str, this.f116119c);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f116120d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121449y1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, User user, int i, int i2) {
        ((MeetLikersNewLikersItem) view).m40512T(user);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f116120d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public boolean m139605I(final String str) {
        int iM200293G = vwb.m200293G(this.f116120d, new w9j() { // from class: l.i3y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56011id, str));
            }
        });
        if (iM200293G == -1) {
            return false;
        }
        this.f116120d.remove(iM200293G);
        notifyItemRemoved(iM200293G);
        notifyItemRangeChanged(iM200293G, this.f116120d.size());
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m139606J(DbLinks dbLinks, List<User> list) {
        this.f116120d.clear();
        this.f116120d.addAll(list);
        this.f116121e = dbLinks;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        super.mo47327e(i);
        if (vwb.m200296J(this.f116120d) || i < this.f116120d.size() - 2 || !NullChecker.m81303a(this.f116121e) || !NullChecker.m81303a(this.f116121e.links) || TextUtils.isEmpty(this.f116121e.links.next)) {
            return;
        }
        m139602H(this.f116121e.links.next);
    }
}
