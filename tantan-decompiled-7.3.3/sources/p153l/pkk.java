package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.p051p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.core.p058ui.view.CoreImEmptyView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class pkk extends jic0<ChatGroup> {

    /* JADX INFO: renamed from: c */
    public GroupSearchAct f152842c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f152843d;

    /* JADX INFO: renamed from: e */
    public List<ChatGroup> f152844e;

    /* JADX INFO: renamed from: f */
    public boolean f152845f;

    /* JADX INFO: renamed from: g */
    public String f152846g;

    public pkk(GroupSearchAct groupSearchAct) {
        List<ChatGroup> list = Collections.EMPTY_LIST;
        this.f152843d = list;
        this.f152844e = list;
        this.f152845f = false;
        this.f152846g = "";
        this.f152842c = groupSearchAct;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f152845f) {
            return this.f152844e.size() + 1;
        }
        if (this.f152843d.isEmpty()) {
            return 1;
        }
        return this.f152843d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        GroupSearchAct groupSearchAct = this.f152842c;
        return i == 1 ? groupSearchAct.inflater().inflate(qec0.f156882K0, viewGroup, false) : groupSearchAct.inflater().inflate(qec0.f157043i, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final ChatGroup chatGroup, int i, final int i2) {
        if (i == 1) {
            m172611Q((CoreImEmptyView) view);
        }
        if (i == 0) {
            GroupSuggestItemView groupSuggestItemView = (GroupSuggestItemView) view;
            final StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < chatGroup.tags.size(); i3++) {
                sb.append(chatGroup.tags.get(i3).name);
                if (i3 != chatGroup.tags.size() - 1) {
                    sb.append(":");
                }
            }
            if (groupSuggestItemView.m37601j(this.f152842c.pageId(), chatGroup, this.f152845f)) {
                sfj0.m185601h("e_group_chat_list", this.f152842c.pageId(), sfj0.C20032a.m185615h("group_name", chatGroup.name), sfj0.C20032a.m185613f("group_order_id", i2), sfj0.C20032a.m185615h("group_tag", sb.toString()), sfj0.C20032a.m185615h("groupchat_id", chatGroup.f56859id), sfj0.C20032a.m185615h("groupchat_type", chatGroup.category.name), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0), sfj0.C20032a.m185615h("which_page", this.f152845f ? "search_empty" : "search_no_empty"));
            }
            bnl0.m105509E0(groupSuggestItemView, new View.OnClickListener() { // from class: l.lkk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f132478a.m172605K(chatGroup, i2, sb, view2);
                }
            });
            if (i2 >= getPageCount() - 3) {
                this.f152842c.m37576Z1().m158919u0();
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ChatGroup getItem(int i) {
        if (!this.f152843d.isEmpty()) {
            return this.f152843d.get(i);
        }
        if (!this.f152845f || i <= 0 || this.f152844e.isEmpty()) {
            return null;
        }
        return this.f152844e.get(i - 1);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m172605K(ChatGroup chatGroup, int i, StringBuilder sb, View view) {
        GroupSearchAct groupSearchAct = this.f152842c;
        groupSearchAct.startActivity(GroupProfileAct.m50290a2(groupSearchAct, chatGroup.f56859id, chatGroup, false));
        sfj0.m185596c("e_group_chat_list", this.f152842c.pageId(), sfj0.C20032a.m185615h("group_name", chatGroup.name), sfj0.C20032a.m185613f("group_order_id", i), sfj0.C20032a.m185615h("group_tag", sb.toString()), sfj0.C20032a.m185615h("groupchat_id", chatGroup.f56859id), sfj0.C20032a.m185615h("groupchat_type", chatGroup.category.name), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0), sfj0.C20032a.m185615h("which_page", this.f152845f ? "search_empty" : "search_no_empty"));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m172606L(List list) {
        this.f152842c.progressDismiss();
        if (!GroupCreateCategoryAct.m37542b2(list)) {
            o1j0.m165649w(R$string.f21563O0);
        } else {
            GroupSearchAct groupSearchAct = this.f152842c;
            groupSearchAct.startActivity(GroupCreateTypeAct.m37551a2(groupSearchAct, list));
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m172607M(Throwable th) {
        this.f152842c.progressDismiss();
        o1j0.m165634h(R$string.f21461B2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m172608N(View view) {
        sfj0.m185596c("e_create_group", this.f152842c.pageId(), sfj0.C20032a.m185615h("which_page", this.f152845f ? "search_empty" : "search_no_empty"));
        if (jek.m144576h(this.f152842c)) {
            this.f152842c.progress("", true);
            this.f152842c.duringCreated(CoreModule.f18264c.f20387g0.m32829N6()).subscribe(psd0.m173597H(new y20() { // from class: l.nkk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142465a.m172606L((List) obj);
                }
            }, new y20() { // from class: l.okk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147760a.m172607M((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m172609O(List<ChatGroup> list) {
        this.f152845f = false;
        this.f152846g = "";
        this.f152843d = list;
    }

    /* JADX INFO: renamed from: P */
    public void m172610P(List<ChatGroup> list, List<ChatGroup> list2, String str) {
        if (list.isEmpty()) {
            this.f152845f = true;
            this.f152846g = str;
        } else {
            this.f152845f = false;
            this.f152846g = "";
        }
        this.f152843d = list;
        this.f152844e = list2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m172611Q(CoreImEmptyView coreImEmptyView) {
        bnl0.m105524M(coreImEmptyView.f37574a, false);
        coreImEmptyView.f37575b.setTextSize(14.0f);
        coreImEmptyView.f37575b.setTextColor(Color.parseColor("#d0d0d0"));
        bnl0.m105540X(coreImEmptyView.f37574a, qa00.m175859d(29.0f));
        boolean z = this.f152845f;
        LinearLayout linearLayout = coreImEmptyView.f37576c;
        if (z) {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(coreImEmptyView.f37575b, false);
            coreImEmptyView.f37577d.setText(this.f152846g);
            bnl0.m105509E0(coreImEmptyView.f37578e, new View.OnClickListener() { // from class: l.mkk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137317a.m172608N(view);
                }
            });
        } else {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(coreImEmptyView.f37575b, true);
            coreImEmptyView.f37575b.setText("没有符合要求的群");
        }
        bnl0.m105524M(coreImEmptyView.f37579f, !this.f152844e.isEmpty());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f152845f) {
            return i == 0 ? 1 : 0;
        }
        return this.f152843d.isEmpty() ? 1 : 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
    }
}
