package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersUserItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.k6c0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x4y extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public final Act f22432c;

    /* JADX INFO: renamed from: d */
    public final List<User> f22433d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public lwl f22434e;

    public x4y(Act act) {
        this.f22432c = act;
    }

    /* JADX INFO: renamed from: C */
    public int m24713C() {
        return Math.min(this.f22433d.size(), 4);
    }

    /* JADX INFO: renamed from: D */
    public View m24714D(ViewGroup viewGroup, int i) {
        return this.f22432c.inflater().inflate(k6c0.l0, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m24712A(View view, User user, int i, int i2) {
        ((MeetLikersUserItemView) view).m7041g(user, this.f22434e);
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public User m24716G() {
        if (vwb.J(this.f22433d)) {
            return null;
        }
        return this.f22433d.get(0);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f22433d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public boolean m24718I(final String str) {
        int iG = vwb.G(this.f22433d, new w9j() { // from class: l.w4y
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((DbObject) ((User) obj)).id, str));
            }
        });
        if (iG == -1) {
            notifyDataSetChanged();
            return false;
        }
        this.f22433d.remove(iG);
        if (vwb.J(this.f22433d)) {
            notifyDataSetChanged();
            return false;
        }
        notifyItemRemoved(iG);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m24719J(lwl lwlVar, List<User> list) {
        this.f22434e = lwlVar;
        this.f22433d.clear();
        this.f22433d.addAll(list);
        notifyDataSetChanged();
    }
}
