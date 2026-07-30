package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemBlindBoxEntrance;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemFriendMoments;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemProfileLikeEntrance;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemSurpriseBoxEntrance;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.NewConversationItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class ipi0 implements iam<dpi0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f116274a;

    /* JADX INFO: renamed from: b */
    public VList f116275b;

    /* JADX INFO: renamed from: c */
    public VLinear f116276c;

    /* JADX INFO: renamed from: d */
    public VImage f116277d;

    /* JADX INFO: renamed from: e */
    public VText f116278e;

    /* JADX INFO: renamed from: f */
    public final Act f116279f;

    /* JADX INFO: renamed from: g */
    public C17766a f116280g;

    /* JADX INFO: renamed from: l.ipi0$a */
    public class C17766a extends dq1<Conversation> implements u46 {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f116281c = Collections.EMPTY_LIST;

        public C17766a() {
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m141479p() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f116281c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f116281c.size()) {
                return this.f116281c.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            Conversation conversation = this.f116281c.get(i);
            if (conversation == null) {
                return 0;
            }
            String str = conversation.f56859id;
            str.getClass();
            switch (str) {
                case "fake_conversation_oof_enter":
                    return 31;
                case "fake_conversation_blindbox_enter":
                    return 34;
                case "fake_conversation_surprise_gift_box":
                    return 36;
                case "fake_conversation_profile_featured":
                    return 37;
                case "fake_conversation_oof_pick":
                    return 30;
                case "fake_conversation_profile_like_enter":
                    return 38;
                default:
                    return 0;
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 49;
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: h */
        public int mo42530h() {
            return this.f116281c.size();
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo42531k() {
            return this.f116281c;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            int i2;
            switch (i) {
                case 30:
                case 31:
                case 37:
                    i2 = kec0.f125466J1;
                    break;
                case 32:
                case 33:
                case 35:
                default:
                    return ue6.m195664Z(ipi0.this.act(), viewGroup, false);
                case 34:
                    i2 = kec0.f125450I1;
                    break;
                case 36:
                    i2 = kec0.f125578Q1;
                    break;
                case 38:
                    i2 = kec0.f125546O1;
                    break;
            }
            return ipi0.this.act().inflater().inflate(i2, viewGroup, false);
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: o */
        public int mo42533o() {
            return 0;
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: q */
        public void mo42534q() {
            notifyDataSetChanged();
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, Conversation conversation, int i, int i2) {
            if (i == 0) {
                ((NewConversationItemView) view).m42776h4(this, conversation, new x20() { // from class: l.hpi0
                    @Override // p153l.x20
                    public final void call() {
                        ipi0.C17766a.m141479p();
                    }
                }, false, i2, null);
                return;
            }
            if (i == 34) {
                ((ConversationItemBlindBoxEntrance) view).m41815e(conversation);
                return;
            }
            if (i == 30) {
                ((ConversationItemFriendMoments) view).m41832p(this, conversation.otherUser);
                return;
            }
            if (i == 31) {
                ((ConversationItemFriendMoments) view).m41831o(this, conversation.otherUser);
                return;
            }
            switch (i) {
                case 36:
                    ((ConversationItemSurpriseBoxEntrance) view).m41927f(conversation);
                    break;
                case 37:
                    ((ConversationItemFriendMoments) view).m41833q(this, conversation.otherUser);
                    break;
                case 38:
                    ((ConversationItemProfileLikeEntrance) view).m41902i(conversation, this);
                    break;
            }
        }

        /* JADX INFO: renamed from: t */
        public void m141481t(List<Conversation> list) {
            this.f116281c = new ArrayList(list);
            notifyDataSetChanged();
            if (jyb.m147479J(list)) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89010C5.put(Long.valueOf((long) list.get(0).latestTime));
            ConversationsList.m42339A2();
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: v */
        public C22421c<Boolean> mo42535v() {
            return C22421c.just(Boolean.TRUE);
        }
    }

    public ipi0(Act act) {
        this.f116279f = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m141470a(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof ConversationItemView) {
            return ((ConversationItemView) view).f25676u.call().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m141471b(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof ConversationItemView) {
            ((ConversationItemView) view).f25675t.call();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m141473f() {
        this.f116274a.setLeftIconAsBack(this.f116279f);
        if (gra.m131778z()) {
            this.f116274a.setLeftIconResource(dbc0.f87021gf);
        }
        this.f116274a.setTitle("订阅内容");
        this.f116274a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.gpi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105468a.m141476i(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116279f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f116279f;
    }

    /* JADX INFO: renamed from: d */
    public View m141474d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jpi0.m146503b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m141476i(View view) {
        act().onBackPressed();
        i4g0.m138520r("e_back", this.f116279f.pageId());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m141474d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m141477j(List<Conversation> list) {
        boolean zM147479J = jyb.m147479J(list);
        VLinear vLinear = this.f116276c;
        if (zM147479J) {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f116275b, false);
        } else {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f116275b, true);
            this.f116280g.m141481t(list);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m141478r() {
        m141473f();
        C17766a c17766a = new C17766a();
        this.f116280g = c17766a;
        this.f116275b.setAdapter((ListAdapter) c17766a);
        this.f116275b.setRecyclerListener(this.f116280g);
        this.f116275b.setNestedScrollingEnabled(true);
        this.f116275b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.epi0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                ipi0.m141471b(adapterView, view, i, j);
            }
        });
        this.f116275b.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.fpi0
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return ipi0.m141470a(adapterView, view, i, j);
            }
        });
        this.f116275b.setRecyclerListener(this.f116280g);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dpi0 dpi0Var) {
    }
}
