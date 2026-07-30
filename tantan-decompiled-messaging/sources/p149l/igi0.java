package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemBlindBoxEntrance;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemFriendMoments;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemProfileLikeEntrance;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemSurpriseBoxEntrance;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.NewConversationItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class igi0 implements s7m<dgi0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f113114a;

    /* JADX INFO: renamed from: b */
    public VList f113115b;

    /* JADX INFO: renamed from: c */
    public VLinear f113116c;

    /* JADX INFO: renamed from: d */
    public VImage f113117d;

    /* JADX INFO: renamed from: e */
    public VText f113118e;

    /* JADX INFO: renamed from: f */
    public final Act f113119f;

    /* JADX INFO: renamed from: g */
    public C17542a f113120g;

    /* JADX INFO: renamed from: l.igi0$a */
    public class C17542a extends wp1<Conversation> implements p36 {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f113121c = Collections.EMPTY_LIST;

        public C17542a() {
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m135994p() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f113121c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.f113121c.size()) {
                return this.f113121c.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            Conversation conversation = this.f113121c.get(i);
            if (conversation == null) {
                return 0;
            }
            String str = conversation.f56011id;
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

        @Override // p149l.p36
        /* JADX INFO: renamed from: h */
        public int mo41519h() {
            return this.f113121c.size();
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo41520k() {
            return this.f113121c;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            int i2;
            switch (i) {
                case 30:
                case 31:
                case 37:
                    i2 = f6c0.f95412J1;
                    break;
                case 32:
                case 33:
                case 35:
                default:
                    return rd6.m178870Z(igi0.this.act(), viewGroup, false);
                case 34:
                    i2 = f6c0.f95396I1;
                    break;
                case 36:
                    i2 = f6c0.f95524Q1;
                    break;
                case 38:
                    i2 = f6c0.f95492O1;
                    break;
            }
            return igi0.this.act().inflater().inflate(i2, viewGroup, false);
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: o */
        public int mo41522o() {
            return 0;
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: q */
        public void mo41523q() {
            notifyDataSetChanged();
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, Conversation conversation, int i, int i2) {
            if (i == 0) {
                ((NewConversationItemView) view).m41765h4(this, conversation, new d30() { // from class: l.hgi0
                    @Override // p149l.d30
                    public final void call() {
                        igi0.C17542a.m135994p();
                    }
                }, false, i2, null);
                return;
            }
            if (i == 34) {
                ((ConversationItemBlindBoxEntrance) view).m40804e(conversation);
                return;
            }
            if (i == 30) {
                ((ConversationItemFriendMoments) view).m40821p(this, conversation.otherUser);
                return;
            }
            if (i == 31) {
                ((ConversationItemFriendMoments) view).m40820o(this, conversation.otherUser);
                return;
            }
            switch (i) {
                case 36:
                    ((ConversationItemSurpriseBoxEntrance) view).m40916f(conversation);
                    break;
                case 37:
                    ((ConversationItemFriendMoments) view).m40822q(this, conversation.otherUser);
                    break;
                case 38:
                    ((ConversationItemProfileLikeEntrance) view).m40891i(conversation, this);
                    break;
            }
        }

        /* JADX INFO: renamed from: t */
        public void m135996t(List<Conversation> list) {
            this.f113121c = new ArrayList(list);
            notifyDataSetChanged();
            if (vwb.m200296J(list)) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149153C5.put(Long.valueOf((long) list.get(0).latestTime));
            ConversationsList.m41328A2();
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: v */
        public C22306c<Boolean> mo41524v() {
            return C22306c.just(Boolean.TRUE);
        }
    }

    public igi0(Act act) {
        this.f113119f = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m135985a(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof ConversationItemView) {
            return ((ConversationItemView) view).f24934u.call().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m135986b(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof ConversationItemView) {
            ((ConversationItemView) view).f24933t.call();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m135988f() {
        this.f113114a.setLeftIconAsBack(this.f113119f);
        if (upa.m194847z()) {
            this.f113114a.setLeftIconResource(x2c0.f190553se);
        }
        this.f113114a.setTitle("订阅内容");
        this.f113114a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ggi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102515a.m135991i(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113119f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f113119f;
    }

    /* JADX INFO: renamed from: d */
    public View m135989d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jgi0.m141296b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m135991i(View view) {
        act().onBackPressed();
        zvf0.m220396r("e_back", this.f113119f.pageId());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m135989d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m135992j(List<Conversation> list) {
        boolean zM200296J = vwb.m200296J(list);
        VLinear vLinear = this.f113116c;
        if (zM200296J) {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f113115b, false);
        } else {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f113115b, true);
            this.f113120g.m135996t(list);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m135993r() {
        m135988f();
        C17542a c17542a = new C17542a();
        this.f113120g = c17542a;
        this.f113115b.setAdapter((ListAdapter) c17542a);
        this.f113115b.setRecyclerListener(this.f113120g);
        this.f113115b.setNestedScrollingEnabled(true);
        this.f113115b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.egi0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                igi0.m135986b(adapterView, view, i, j);
            }
        });
        this.f113115b.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.fgi0
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return igi0.m135985a(adapterView, view, i, j);
            }
        });
        this.f113115b.setRecyclerListener(this.f113120g);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dgi0 dgi0Var) {
    }
}
