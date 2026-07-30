package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersItem;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zgo extends jic0<User> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<User> f204328c = new ArrayList<>();

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f204328c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151935Q, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, User user, int i, int i2) {
        ((IntlMeetLikersNewLikersItem) view).m40427S(user);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f204328c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m219651G(List<User> list) {
        this.f204328c.clear();
        this.f204328c.addAll(list);
        notifyDataSetChanged();
    }
}
