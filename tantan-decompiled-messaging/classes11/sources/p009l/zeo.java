package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersItem;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.k6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zeo extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<User> f23626c = new ArrayList<>();

    /* JADX INFO: renamed from: C */
    public int m25758C() {
        return this.f23626c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m25759D(ViewGroup viewGroup, int i) {
        return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.Q, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m25757A(View view, User user, int i, int i2) {
        ((IntlMeetLikersNewLikersItem) view).m3471S(user);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f23626c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m25762G(List<User> list) {
        this.f23626c.clear();
        this.f23626c.addAll(list);
        notifyDataSetChanged();
    }
}
