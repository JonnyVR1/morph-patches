package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemBlindBoxEntrance;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemFriendMoments;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemProfileLikeEntrance;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemSurpriseBoxEntrance;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.d30;
import l.f6c0;
import l.jgi0;
import l.s7m;
import l.upa;
import l.vwb;
import l.wp1;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import rx.c;
import v.VImage;
import v.VLinear;
import v.VList;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class igi0 implements s7m<dgi0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f14612a;

    /* JADX INFO: renamed from: b */
    public VList f14613b;

    /* JADX INFO: renamed from: c */
    public VLinear f14614c;

    /* JADX INFO: renamed from: d */
    public VImage f14615d;

    /* JADX INFO: renamed from: e */
    public VText f14616e;

    /* JADX INFO: renamed from: f */
    public final Act f14617f;

    /* JADX INFO: renamed from: g */
    public C0958a f14618g;

    /* JADX INFO: renamed from: l.igi0$a */
    public class C0958a extends wp1<Conversation> implements p36 {

        /* JADX INFO: renamed from: c */
        public List<Conversation> f14619c = Collections.EMPTY_LIST;

        public C0958a() {
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m16518p() {
        }

        public int getCount() {
            return this.f14619c.size();
        }

        public Object getItem(int i) {
            if (i < this.f14619c.size()) {
                return this.f14619c.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            Conversation conversation = this.f14619c.get(i);
            if (conversation == null) {
                return 0;
            }
            String str = ((DbObject) conversation).id;
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

        public int getViewTypeCount() {
            return 49;
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: h */
        public int mo5626h() {
            return this.f14619c.size();
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo5628k() {
            return this.f14619c;
        }

        /* JADX INFO: renamed from: m */
        public View m16520m(ViewGroup viewGroup, int i) {
            int i2;
            switch (i) {
                case 30:
                case 31:
                case 37:
                    i2 = f6c0.J1;
                    break;
                case 32:
                case 33:
                case 35:
                default:
                    return rd6.m21511Z(igi0.this.act(), viewGroup, false);
                case 34:
                    i2 = f6c0.I1;
                    break;
                case 36:
                    i2 = f6c0.Q1;
                    break;
                case 38:
                    i2 = f6c0.O1;
                    break;
            }
            return igi0.this.act().inflater().inflate(i2, viewGroup, false);
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: o */
        public int mo5631o() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p009l.p36
        /* JADX INFO: renamed from: q */
        public void mo5632q() {
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void m16519j(View view, Conversation conversation, int i, int i2) {
            if (i == 0) {
                ((NewConversationItemView) view).m5889h4(this, conversation, new d30() { // from class: l.hgi0
                    public final void call() {
                        igi0.C0958a.m16518p();
                    }
                }, false, i2, null);
                return;
            }
            if (i == 34) {
                ((ConversationItemBlindBoxEntrance) view).m4902e(conversation);
                return;
            }
            if (i == 30) {
                ((ConversationItemFriendMoments) view).m4919p(this, conversation.otherUser);
                return;
            }
            if (i == 31) {
                ((ConversationItemFriendMoments) view).m4918o(this, conversation.otherUser);
                return;
            }
            switch (i) {
                case 36:
                    ((ConversationItemSurpriseBoxEntrance) view).m5015f(conversation);
                    break;
                case 37:
                    ((ConversationItemFriendMoments) view).m4920q(this, conversation.otherUser);
                    break;
                case 38:
                    ((ConversationItemProfileLikeEntrance) view).m4990i(conversation, this);
                    break;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: t */
        public void m16522t(List<Conversation> list) {
            this.f14619c = new ArrayList(list);
            notifyDataSetChanged();
            if (vwb.J(list)) {
                return;
            }
            CoreModule.c.e0.C5.put(Long.valueOf((long) list.get(0).latestTime));
            ConversationsList.m5434A2();
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: v */
        public c<Boolean> mo5633v() {
            return c.just(Boolean.TRUE);
        }
    }

    public igi0(Act act) {
        this.f14617f = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m16507a(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof ConversationItemView) {
            return ((Boolean) ((ConversationItemView) view).f3712u.call()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16508b(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof ConversationItemView) {
            ((ConversationItemView) view).f3711t.call();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m16510f() {
        this.f14612a.setLeftIconAsBack(this.f14617f);
        if (upa.z()) {
            this.f14612a.setLeftIconResource(x2c0.se);
        }
        this.f14612a.setTitle("订阅内容");
        this.f14612a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ggi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13535a.m16514i(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16511C0() {
        return this.f14617f;
    }

    @Nullable
    public Act act() {
        return this.f14617f;
    }

    /* JADX INFO: renamed from: d */
    public View m16512d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jgi0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m16514i(View view) {
        act().onBackPressed();
        zvf0.r("e_back", this.f14617f.pageId());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16512d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m16516j(List<Conversation> list) {
        boolean zJ = vwb.J(list);
        VLinear vLinear = this.f14614c;
        if (zJ) {
            xdl0.M(vLinear, true);
            xdl0.M(this.f14613b, false);
        } else {
            xdl0.M(vLinear, false);
            xdl0.M(this.f14613b, true);
            this.f14618g.m16522t(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ListAdapter, l.igi0$a] */
    /* JADX INFO: renamed from: r */
    public void m16517r() {
        m16510f();
        ?? c0958a = new C0958a();
        this.f14618g = c0958a;
        this.f14613b.setAdapter((ListAdapter) c0958a);
        this.f14613b.setRecyclerListener(this.f14618g);
        this.f14613b.setNestedScrollingEnabled(true);
        this.f14613b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.egi0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                igi0.m16508b(adapterView, view, i, j);
            }
        });
        this.f14613b.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.fgi0
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return igi0.m16507a(adapterView, view, i, j);
            }
        });
        this.f14613b.setRecyclerListener(this.f14618g);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m16515i1(dgi0 dgi0Var) {
    }
}
