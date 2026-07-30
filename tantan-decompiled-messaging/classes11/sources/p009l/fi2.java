package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.Conversation;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.gi2;
import l.t100;
import l.vwb;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class fi2 extends dac0<Conversation> {

    /* JADX INFO: renamed from: c */
    public VImage f13007c;

    /* JADX INFO: renamed from: d */
    public VText f13008d;

    /* JADX INFO: renamed from: e */
    public VText f13009e;

    /* JADX INFO: renamed from: f */
    public VLinear f13010f;

    /* JADX INFO: renamed from: l */
    public String f13016l;

    /* JADX INFO: renamed from: m */
    public Act f13017m;

    /* JADX INFO: renamed from: g */
    public final int f13011g = 0;

    /* JADX INFO: renamed from: h */
    public final int f13012h = 1;

    /* JADX INFO: renamed from: i */
    public final int f13013i = 2;

    /* JADX INFO: renamed from: j */
    public final int f13014j = 3;

    /* JADX INFO: renamed from: k */
    public List<Conversation> f13015k = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f13018n = true;

    /* JADX INFO: renamed from: o */
    public boolean f13019o = false;

    /* JADX INFO: renamed from: p */
    public boolean f13020p = false;

    public fi2(PutongFrag putongFrag) {
        this.f13016l = putongFrag.pageId();
        this.f13017m = putongFrag.act();
    }

    /* JADX INFO: renamed from: C */
    public int m14434C() {
        return this.f13015k.size() + (this.f13018n ? 1 : 0) + (this.f13019o ? 1 : 0) + ((this.f13015k.size() <= 0 || !this.f13020p) ? 0 : 1);
    }

    /* JADX INFO: renamed from: D */
    public View mo5985D(ViewGroup viewGroup, int i) {
        return i == 0 ? m14435E(o7r.m19649a(this.f13017m), viewGroup) : new View(this.f13017m);
    }

    /* JADX INFO: renamed from: E */
    public View m14435E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gi2.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return (m14438H(i) || m14439I(i) || m14437G(i)) ? Conversation.new_() : this.f13015k.get(i - (this.f13018n ? 1 : 0));
    }

    /* JADX INFO: renamed from: G */
    public boolean m14437G(int i) {
        return this.f13015k.size() > 0 && this.f13020p && i == m14434C() - 1;
    }

    /* JADX INFO: renamed from: H */
    public boolean m14438H(int i) {
        return this.f13018n && i == 0;
    }

    /* JADX INFO: renamed from: I */
    public boolean m14439I(int i) {
        return this.f13019o && i == this.f13018n;
    }

    /* JADX INFO: renamed from: J */
    public String m14440J() {
        return this.f13016l;
    }

    /* JADX INFO: renamed from: K */
    public int m14441K() {
        return this.f13015k.size();
    }

    /* JADX INFO: renamed from: L */
    public void m14442L(List<Conversation> list) {
        if (vwb.J(list)) {
            this.f13019o = true;
            this.f13015k = new ArrayList();
        } else {
            this.f13019o = false;
            this.f13015k = list;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public void m14443M(boolean z) {
        this.f13020p = z;
    }

    /* JADX INFO: renamed from: N */
    public void m14444N() {
        Act act = this.f13017m;
        act.startActivity(ConversationSearchAct.m6710b2(act, -t100.d(53.5f), "", ConversationSearchAct.f4731o, new ArrayList(), new ArrayList()));
    }

    public int getItemViewType(int i) {
        if (m14438H(i)) {
            return 1;
        }
        if (m14439I(i)) {
            return 0;
        }
        return m14437G(i) ? 3 : 2;
    }

    public fi2(Act act) {
        this.f13016l = act.pageId();
        this.f13017m = act;
    }
}
