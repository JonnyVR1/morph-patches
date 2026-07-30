package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersUserItemView;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class udy extends jic0<User> {

    /* JADX INFO: renamed from: c */
    public final Act f178603c;

    /* JADX INFO: renamed from: d */
    public final List<User> f178604d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public dzl f178605e;

    public udy(Act act) {
        this.f178603c = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return Math.min(this.f178604d.size(), 4);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f178603c.inflater().inflate(pec0.f152010l0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, User user, int i, int i2) {
        ((MeetLikersUserItemView) view).m43878g(user, this.f178605e);
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public User m195581G() {
        if (jyb.m147479J(this.f178604d)) {
            return null;
        }
        return this.f178604d.get(0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f178604d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public boolean m195583I(final String str) {
        int iM147476G = jyb.m147476G(this.f178604d, new qcj() { // from class: l.tdy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56859id, str));
            }
        });
        if (iM147476G == -1) {
            notifyDataSetChanged();
            return false;
        }
        this.f178604d.remove(iM147476G);
        if (jyb.m147479J(this.f178604d)) {
            notifyDataSetChanged();
            return false;
        }
        notifyItemRemoved(iM147476G);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m195584J(dzl dzlVar, List<User> list) {
        this.f178605e = dzlVar;
        this.f178604d.clear();
        this.f178604d.addAll(list);
        notifyDataSetChanged();
    }
}
