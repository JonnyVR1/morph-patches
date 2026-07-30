package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersItem;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class gcy extends jic0<User> {

    /* JADX INFO: renamed from: c */
    public final long f103611c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<User> f103612d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public DbLinks f103613e = null;

    public gcy(long j) {
        this.f103611c = j;
    }

    /* JADX INFO: renamed from: H */
    private void m129909H(String str) {
        CoreModule.f18264c.f20429u0.m31466o7(str, this.f103611c);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f103612d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152057y1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, User user, int i, int i2) {
        ((MeetLikersNewLikersItem) view).m41523T(user);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f103612d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public boolean m129912I(final String str) {
        int iM147476G = jyb.m147476G(this.f103612d, new qcj() { // from class: l.fcy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56859id, str));
            }
        });
        if (iM147476G == -1) {
            return false;
        }
        this.f103612d.remove(iM147476G);
        notifyItemRemoved(iM147476G);
        notifyItemRangeChanged(iM147476G, this.f103612d.size());
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m129913J(DbLinks dbLinks, List<User> list) {
        this.f103612d.clear();
        this.f103612d.addAll(list);
        this.f103613e = dbLinks;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        super.mo48510e(i);
        if (jyb.m147479J(this.f103612d) || i < this.f103612d.size() - 2 || !NullChecker.m82486a(this.f103613e) || !NullChecker.m82486a(this.f103613e.links) || TextUtils.isEmpty(this.f103613e.links.next)) {
            return;
        }
        m129909H(this.f103613e.links.next);
    }
}
