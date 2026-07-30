package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.discovery.SuggestUserItem;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class a2h0 extends jic0<User> {

    /* JADX INFO: renamed from: c */
    public Act f67992c;

    /* JADX INFO: renamed from: d */
    public List<User> f67993d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public GPTopicCard f67994e;

    /* JADX INFO: renamed from: f */
    public y20<User> f67995f;

    public a2h0(Act act, GPTopicCard gPTopicCard, y20<User> y20Var) {
        this.f67992c = act;
        this.f67994e = gPTopicCard;
        this.f67995f = y20Var;
    }

    /* JADX INFO: renamed from: H */
    private boolean m95668H() {
        return (jyb.m147479J(this.f67993d) || ljj.m154509a(this.f67994e.name)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m95669I(View view) {
        CoreModule.m30933P().m143405a().mo34625wr(this.f67992c, "see_all", Privilege.see_theme_unlock_more);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean zM95668H = m95668H();
        List<User> list = this.f67993d;
        return zM95668H ? list.size() + 2 : list.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return p9r.m171370a(this.f67992c).inflate(kec0.f125972nf, viewGroup, false);
        }
        Act act = this.f67992c;
        return i != 2 ? p9r.m171370a(act).inflate(kec0.f125989of, viewGroup, false) : p9r.m171370a(act).inflate(kec0.f125955mf, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, User user, int i, int i2) {
        if (i == 1) {
            ((VText) ((VFrame) view).findViewById(adc0.f70425kd)).setText(this.f67994e.headerDesc);
            return;
        }
        if (i != 2) {
            ((SuggestUserItem) view).m37298e(this.f67992c, this.f67994e.name, user, this.f67995f);
            return;
        }
        VFrame vFrame = (VFrame) view;
        VButton vButton = (VButton) vFrame.findViewById(adc0.f70392id);
        VText vText = (VText) vFrame.findViewById(adc0.f70408jd);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.z1h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202558a.m95669I(view2);
            }
        });
        if (rbb0.m180744q()) {
            bnl0.m105524M(vButton, true);
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vButton, false);
            bnl0.m105524M(vText, true);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        if (i != 0 && i <= this.f67993d.size()) {
            return this.f67993d.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m95672J(List<User> list) {
        this.f67993d.clear();
        this.f67993d.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m95673K(GPTopicCard gPTopicCard) {
        this.f67994e = gPTopicCard;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return (i <= this.f67993d.size() || !m95668H()) ? 0 : 2;
    }
}
