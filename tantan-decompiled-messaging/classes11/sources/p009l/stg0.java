package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.discovery.SuggestUserItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f6c0;
import l.n3b0;
import l.u4c0;
import l.vwb;
import l.xdl0;
import v.VButton;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class stg0 extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public Act f20465c;

    /* JADX INFO: renamed from: d */
    public List<User> f20466d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public GPTopicCard f20467e;

    /* JADX INFO: renamed from: f */
    public e30<User> f20468f;

    public stg0(Act act, GPTopicCard gPTopicCard, e30<User> e30Var) {
        this.f20465c = act;
        this.f20467e = gPTopicCard;
        this.f20468f = e30Var;
    }

    /* JADX INFO: renamed from: H */
    private boolean m22385H() {
        return (vwb.J(this.f20466d) || rgj.m21658a(this.f20467e.name)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m22386I(View view) {
        CoreModule.P().a().wr(this.f20465c, "see_all", Privilege.see_theme_unlock_more);
    }

    /* JADX INFO: renamed from: C */
    public int m22388C() {
        boolean zM22385H = m22385H();
        List<User> list = this.f20466d;
        return zM22385H ? list.size() + 2 : list.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m22389D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return o7r.m19649a(this.f20465c).inflate(f6c0.ff, viewGroup, false);
        }
        Act act = this.f20465c;
        return i != 2 ? o7r.m19649a(act).inflate(f6c0.gf, viewGroup, false) : o7r.m19649a(act).inflate(f6c0.ef, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m22387A(View view, User user, int i, int i2) {
        if (i == 1) {
            ((VFrame) view).findViewById(u4c0.id).setText(this.f20467e.headerDesc);
            return;
        }
        if (i != 2) {
            ((SuggestUserItem) view).m213e(this.f20465c, this.f20467e.name, user, this.f20468f);
            return;
        }
        VFrame vFrame = (VFrame) view;
        VButton vButtonFindViewById = vFrame.findViewById(u4c0.gd);
        VText vTextFindViewById = vFrame.findViewById(u4c0.hd);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.rtg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19977a.m22386I(view2);
            }
        });
        if (n3b0.q()) {
            xdl0.M(vButtonFindViewById, true);
            xdl0.M(vTextFindViewById, false);
        } else {
            xdl0.M(vButtonFindViewById, false);
            xdl0.M(vTextFindViewById, true);
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        if (i != 0 && i <= this.f20466d.size()) {
            return this.f20466d.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m22392J(List<User> list) {
        this.f20466d.clear();
        this.f20466d.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m22393K(GPTopicCard gPTopicCard) {
        this.f20467e = gPTopicCard;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return (i <= this.f20466d.size() || !m22385H()) ? 0 : 2;
    }
}
