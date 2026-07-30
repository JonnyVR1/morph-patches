package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public abstract class fi2 extends dac0<Conversation> {

    /* JADX INFO: renamed from: c */
    public VImage f97606c;

    /* JADX INFO: renamed from: d */
    public VText f97607d;

    /* JADX INFO: renamed from: e */
    public VText f97608e;

    /* JADX INFO: renamed from: f */
    public VLinear f97609f;

    /* JADX INFO: renamed from: l */
    public String f97615l;

    /* JADX INFO: renamed from: m */
    public Act f97616m;

    /* JADX INFO: renamed from: g */
    public final int f97610g = 0;

    /* JADX INFO: renamed from: h */
    public final int f97611h = 1;

    /* JADX INFO: renamed from: i */
    public final int f97612i = 2;

    /* JADX INFO: renamed from: j */
    public final int f97613j = 3;

    /* JADX INFO: renamed from: k */
    public List<Conversation> f97614k = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f97617n = true;

    /* JADX INFO: renamed from: o */
    public boolean f97618o = false;

    /* JADX INFO: renamed from: p */
    public boolean f97619p = false;

    public fi2(PutongFrag putongFrag) {
        this.f97615l = putongFrag.pageId();
        this.f97616m = putongFrag.act();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f97614k.size() + (this.f97617n ? 1 : 0) + (this.f97618o ? 1 : 0) + ((this.f97614k.size() <= 0 || !this.f97619p) ? 0 : 1);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return i == 0 ? m121480E(o7r.m163037a(this.f97616m), viewGroup) : new View(this.f97616m);
    }

    /* JADX INFO: renamed from: E */
    public View m121480E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gi2.m126248b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return (m121483H(i) || m121484I(i) || m121482G(i)) ? Conversation.new_() : this.f97614k.get(i - (this.f97617n ? 1 : 0));
    }

    /* JADX INFO: renamed from: G */
    public boolean m121482G(int i) {
        return this.f97614k.size() > 0 && this.f97619p && i == mo28824C() - 1;
    }

    /* JADX INFO: renamed from: H */
    public boolean m121483H(int i) {
        return this.f97617n && i == 0;
    }

    /* JADX INFO: renamed from: I */
    public boolean m121484I(int i) {
        return this.f97618o && i == this.f97617n;
    }

    /* JADX INFO: renamed from: J */
    public String m121485J() {
        return this.f97615l;
    }

    /* JADX INFO: renamed from: K */
    public int m121486K() {
        return this.f97614k.size();
    }

    /* JADX INFO: renamed from: L */
    public void m121487L(List<Conversation> list) {
        if (vwb.m200296J(list)) {
            this.f97618o = true;
            this.f97614k = new ArrayList();
        } else {
            this.f97618o = false;
            this.f97614k = list;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public void m121488M(boolean z) {
        this.f97619p = z;
    }

    /* JADX INFO: renamed from: N */
    public void m121489N() {
        Act act = this.f97616m;
        act.startActivity(ConversationSearchAct.m42551b2(act, -t100.m186890d(53.5f), "", ConversationSearchAct.f25953o, new ArrayList(), new ArrayList()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m121483H(i)) {
            return 1;
        }
        if (m121484I(i)) {
            return 0;
        }
        return m121482G(i) ? 3 : 2;
    }

    public fi2(Act act) {
        this.f97615l = act.pageId();
        this.f97616m = act;
    }
}
