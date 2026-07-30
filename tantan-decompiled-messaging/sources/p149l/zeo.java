package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersItem;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zeo extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<User> f202854c = new ArrayList<>();

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f202854c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121327Q, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, User user, int i, int i2) {
        ((IntlMeetLikersNewLikersItem) view).m39424S(user);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f202854c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m218383G(List<User> list) {
        this.f202854c.clear();
        this.f202854c.addAll(list);
        notifyDataSetChanged();
    }
}
