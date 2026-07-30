package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.discovery.SuggestUserItem;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class stg0 extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public Act f166349c;

    /* JADX INFO: renamed from: d */
    public List<User> f166350d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public GPTopicCard f166351e;

    /* JADX INFO: renamed from: f */
    public e30<User> f166352f;

    public stg0(Act act, GPTopicCard gPTopicCard, e30<User> e30Var) {
        this.f166349c = act;
        this.f166351e = gPTopicCard;
        this.f166352f = e30Var;
    }

    /* JADX INFO: renamed from: H */
    private boolean m185944H() {
        return (vwb.m200296J(this.f166350d) || rgj.m179167a(this.f166351e.name)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m185945I(View view) {
        CoreModule.m29935P().m94651a().mo33622wr(this.f166349c, "see_all", Privilege.see_theme_unlock_more);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean zM185944H = m185944H();
        List<User> list = this.f166350d;
        return zM185944H ? list.size() + 2 : list.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return o7r.m163037a(this.f166349c).inflate(f6c0.f95783ff, viewGroup, false);
        }
        Act act = this.f166349c;
        return i != 2 ? o7r.m163037a(act).inflate(f6c0.f95800gf, viewGroup, false) : o7r.m163037a(act).inflate(f6c0.f95766ef, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, User user, int i, int i2) {
        if (i == 1) {
            ((VText) ((VFrame) view).findViewById(u4c0.f174301id)).setText(this.f166351e.headerDesc);
            return;
        }
        if (i != 2) {
            ((SuggestUserItem) view).m36295e(this.f166349c, this.f166351e.name, user, this.f166352f);
            return;
        }
        VFrame vFrame = (VFrame) view;
        VButton vButton = (VButton) vFrame.findViewById(u4c0.f174267gd);
        VText vText = (VText) vFrame.findViewById(u4c0.f174284hd);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.rtg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f160964a.m185945I(view2);
            }
        });
        if (n3b0.m157742q()) {
            xdl0.m208344M(vButton, true);
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vButton, false);
            xdl0.m208344M(vText, true);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        if (i != 0 && i <= this.f166350d.size()) {
            return this.f166350d.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m185948J(List<User> list) {
        this.f166350d.clear();
        this.f166350d.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m185949K(GPTopicCard gPTopicCard) {
        this.f166351e = gPTopicCard;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return (i <= this.f166350d.size() || !m185944H()) ? 0 : 2;
    }
}
