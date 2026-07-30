package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersUserItemView;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class x4y extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public final Act f191068c;

    /* JADX INFO: renamed from: d */
    public final List<User> f191069d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public lwl f191070e;

    public x4y(Act act) {
        this.f191068c = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return Math.min(this.f191069d.size(), 4);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f191068c.inflater().inflate(k6c0.f121402l0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, User user, int i, int i2) {
        ((MeetLikersUserItemView) view).m42867g(user, this.f191070e);
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public User m207044G() {
        if (vwb.m200296J(this.f191069d)) {
            return null;
        }
        return this.f191069d.get(0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f191069d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public boolean m207046I(final String str) {
        int iM200293G = vwb.m200293G(this.f191069d, new w9j() { // from class: l.w4y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56011id, str));
            }
        });
        if (iM200293G == -1) {
            notifyDataSetChanged();
            return false;
        }
        this.f191069d.remove(iM200293G);
        if (vwb.m200296J(this.f191069d)) {
            notifyDataSetChanged();
            return false;
        }
        notifyItemRemoved(iM200293G);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m207047J(lwl lwlVar, List<User> list) {
        this.f191070e = lwlVar;
        this.f191069d.clear();
        this.f191069d.addAll(list);
        notifyDataSetChanged();
    }
}
