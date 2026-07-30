package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public abstract class mi2 extends jic0<Conversation> {

    /* JADX INFO: renamed from: c */
    public VImage f136912c;

    /* JADX INFO: renamed from: d */
    public VText f136913d;

    /* JADX INFO: renamed from: e */
    public VText f136914e;

    /* JADX INFO: renamed from: f */
    public VLinear f136915f;

    /* JADX INFO: renamed from: l */
    public String f136921l;

    /* JADX INFO: renamed from: m */
    public Act f136922m;

    /* JADX INFO: renamed from: g */
    public final int f136916g = 0;

    /* JADX INFO: renamed from: h */
    public final int f136917h = 1;

    /* JADX INFO: renamed from: i */
    public final int f136918i = 2;

    /* JADX INFO: renamed from: j */
    public final int f136919j = 3;

    /* JADX INFO: renamed from: k */
    public List<Conversation> f136920k = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f136923n = true;

    /* JADX INFO: renamed from: o */
    public boolean f136924o = false;

    /* JADX INFO: renamed from: p */
    public boolean f136925p = false;

    public mi2(PutongFrag putongFrag) {
        this.f136921l = putongFrag.pageId();
        this.f136922m = putongFrag.act();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f136920k.size() + (this.f136923n ? 1 : 0) + (this.f136924o ? 1 : 0) + ((this.f136920k.size() <= 0 || !this.f136925p) ? 0 : 1);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return i == 0 ? m158452E(p9r.m171370a(this.f136922m), viewGroup) : new View(this.f136922m);
    }

    /* JADX INFO: renamed from: E */
    public View m158452E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ni2.m163263b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return (m158455H(i) || m158456I(i) || m158454G(i)) ? Conversation.new_() : this.f136920k.get(i - (this.f136923n ? 1 : 0));
    }

    /* JADX INFO: renamed from: G */
    public boolean m158454G(int i) {
        return this.f136920k.size() > 0 && this.f136925p && i == mo29823C() - 1;
    }

    /* JADX INFO: renamed from: H */
    public boolean m158455H(int i) {
        return this.f136923n && i == 0;
    }

    /* JADX INFO: renamed from: I */
    public boolean m158456I(int i) {
        return this.f136924o && i == this.f136923n;
    }

    /* JADX INFO: renamed from: J */
    public String m158457J() {
        return this.f136921l;
    }

    /* JADX INFO: renamed from: K */
    public int m158458K() {
        return this.f136920k.size();
    }

    /* JADX INFO: renamed from: L */
    public void m158459L(List<Conversation> list) {
        if (jyb.m147479J(list)) {
            this.f136924o = true;
            this.f136920k = new ArrayList();
        } else {
            this.f136924o = false;
            this.f136920k = list;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public void m158460M(boolean z) {
        this.f136925p = z;
    }

    /* JADX INFO: renamed from: N */
    public void m158461N() {
        Act act = this.f136922m;
        act.startActivity(ConversationSearchAct.m43562c2(act, -qa00.m175859d(53.5f), "", ConversationSearchAct.f26695o, new ArrayList(), new ArrayList()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m158455H(i)) {
            return 1;
        }
        if (m158456I(i)) {
            return 0;
        }
        return m158454G(i) ? 3 : 2;
    }

    public mi2(Act act) {
        this.f136921l = act.pageId();
        this.f136922m = act;
    }
}
