package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.p046p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.core.p053ui.view.CoreImEmptyView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zhk extends dac0<ChatGroup> {

    /* JADX INFO: renamed from: c */
    public GroupSearchAct f203185c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f203186d;

    /* JADX INFO: renamed from: e */
    public List<ChatGroup> f203187e;

    /* JADX INFO: renamed from: f */
    public boolean f203188f;

    /* JADX INFO: renamed from: g */
    public String f203189g;

    public zhk(GroupSearchAct groupSearchAct) {
        List<ChatGroup> list = Collections.EMPTY_LIST;
        this.f203186d = list;
        this.f203187e = list;
        this.f203188f = false;
        this.f203189g = "";
        this.f203185c = groupSearchAct;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f203188f) {
            return this.f203187e.size() + 1;
        }
        if (this.f203186d.isEmpty()) {
            return 1;
        }
        return this.f203186d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        GroupSearchAct groupSearchAct = this.f203185c;
        return i == 1 ? groupSearchAct.inflater().inflate(l6c0.f126326K0, viewGroup, false) : groupSearchAct.inflater().inflate(l6c0.f126487i, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final ChatGroup chatGroup, int i, final int i2) {
        if (i == 1) {
            m218823Q((CoreImEmptyView) view);
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
            if (groupSuggestItemView.m36598j(this.f203185c.pageId(), chatGroup, this.f203188f)) {
                o6j0.m162864h("e_group_chat_list", this.f203185c.pageId(), o6j0.C18854a.m162878h("group_name", chatGroup.name), o6j0.C18854a.m162876f("group_order_id", i2), o6j0.C18854a.m162878h("group_tag", sb.toString()), o6j0.C18854a.m162878h("groupchat_id", chatGroup.f56011id), o6j0.C18854a.m162878h("groupchat_type", chatGroup.category.name), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0), o6j0.C18854a.m162878h("which_page", this.f203188f ? "search_empty" : "search_no_empty"));
            }
            xdl0.m208329E0(groupSuggestItemView, new View.OnClickListener() { // from class: l.vhk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f181510a.m218817K(chatGroup, i2, sb, view2);
                }
            });
            if (i2 >= getPageCount() - 3) {
                this.f203185c.m36573Y1().m203338u0();
            }
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ChatGroup getItem(int i) {
        if (!this.f203186d.isEmpty()) {
            return this.f203186d.get(i);
        }
        if (!this.f203188f || i <= 0 || this.f203187e.isEmpty()) {
            return null;
        }
        return this.f203187e.get(i - 1);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m218817K(ChatGroup chatGroup, int i, StringBuilder sb, View view) {
        GroupSearchAct groupSearchAct = this.f203185c;
        groupSearchAct.startActivity(GroupProfileAct.m49107Z1(groupSearchAct, chatGroup.f56011id, chatGroup, false));
        o6j0.m162859c("e_group_chat_list", this.f203185c.pageId(), o6j0.C18854a.m162878h("group_name", chatGroup.name), o6j0.C18854a.m162876f("group_order_id", i), o6j0.C18854a.m162878h("group_tag", sb.toString()), o6j0.C18854a.m162878h("groupchat_id", chatGroup.f56011id), o6j0.C18854a.m162878h("groupchat_type", chatGroup.category.name), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0), o6j0.C18854a.m162878h("which_page", this.f203188f ? "search_empty" : "search_no_empty"));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m218818L(List list) {
        this.f203185c.progressDismiss();
        if (!GroupCreateCategoryAct.m36539a2(list)) {
            lsi0.m151593w(R$string.f20821O0);
        } else {
            GroupSearchAct groupSearchAct = this.f203185c;
            groupSearchAct.startActivity(GroupCreateTypeAct.m36548Z1(groupSearchAct, list));
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m218819M(Throwable th) {
        this.f203185c.progressDismiss();
        lsi0.m151578h(R$string.f20719B2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m218820N(View view) {
        o6j0.m162859c("e_create_group", this.f203185c.pageId(), o6j0.C18854a.m162878h("which_page", this.f203188f ? "search_empty" : "search_no_empty"));
        if (tbk.m187861h(this.f203185c)) {
            this.f203185c.progress("", true);
            this.f203185c.duringCreated(CoreModule.f17545c.f19645g0.m31826N6()).subscribe(mkd0.m154956H(new e30() { // from class: l.xhk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192896a.m218818L((List) obj);
                }
            }, new e30() { // from class: l.yhk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198354a.m218819M((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m218821O(List<ChatGroup> list) {
        this.f203188f = false;
        this.f203189g = "";
        this.f203186d = list;
    }

    /* JADX INFO: renamed from: P */
    public void m218822P(List<ChatGroup> list, List<ChatGroup> list2, String str) {
        if (list.isEmpty()) {
            this.f203188f = true;
            this.f203189g = str;
        } else {
            this.f203188f = false;
            this.f203189g = "";
        }
        this.f203186d = list;
        this.f203187e = list2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m218823Q(CoreImEmptyView coreImEmptyView) {
        xdl0.m208344M(coreImEmptyView.f36726a, false);
        coreImEmptyView.f36727b.setTextSize(14.0f);
        coreImEmptyView.f36727b.setTextColor(Color.parseColor("#d0d0d0"));
        xdl0.m208360X(coreImEmptyView.f36726a, t100.m186890d(29.0f));
        boolean z = this.f203188f;
        LinearLayout linearLayout = coreImEmptyView.f36728c;
        if (z) {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(coreImEmptyView.f36727b, false);
            coreImEmptyView.f36729d.setText(this.f203189g);
            xdl0.m208329E0(coreImEmptyView.f36730e, new View.OnClickListener() { // from class: l.whk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186443a.m218820N(view);
                }
            });
        } else {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(coreImEmptyView.f36727b, true);
            coreImEmptyView.f36727b.setText("没有符合要求的群");
        }
        xdl0.m208344M(coreImEmptyView.f36731f, !this.f203187e.isEmpty());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f203188f) {
            return i == 0 ? 1 : 0;
        }
        return this.f203186d.isEmpty() ? 1 : 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
    }
}
