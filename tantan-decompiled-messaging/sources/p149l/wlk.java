package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.core.p053ui.view.CoreImEmptyView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class wlk extends dac0<ChatGroup> {

    /* JADX INFO: renamed from: c */
    public Act f186955c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f186956d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public rmk f186957e;

    public wlk(Act act, rmk rmkVar) {
        this.f186955c = act;
        this.f186957e = rmkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m203814H(ChatGroup chatGroup, int i, StringBuilder sb, View view) {
        Act act = this.f186955c;
        act.startActivity(GroupProfileAct.m49107Z1(act, chatGroup.f56011id, chatGroup, false));
        o6j0.m162859c("e_group_chat_list", this.f186957e.pageId(), o6j0.C18854a.m162878h("group_name", chatGroup.name), o6j0.C18854a.m162876f("group_order_id", i), o6j0.C18854a.m162878h("group_tag", sb.toString()), o6j0.C18854a.m162878h("groupchat_id", chatGroup.f56011id), o6j0.C18854a.m162878h("groupchat_type", chatGroup.category.name), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0));
    }

    /* JADX INFO: renamed from: J */
    private void m203815J(CoreImEmptyView coreImEmptyView) {
        coreImEmptyView.f36727b.setText("暂时没有新的内容");
        xdl0.m208360X(coreImEmptyView.f36726a, t100.m186890d(176.0f));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f186956d.isEmpty()) {
            return 1;
        }
        return this.f186956d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f186955c;
        return i == 2 ? act.inflater().inflate(l6c0.f126326K0, viewGroup, false) : act.inflater().inflate(l6c0.f126487i, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final ChatGroup chatGroup, int i, final int i2) {
        if (i == 2) {
            m203815J((CoreImEmptyView) view);
            return;
        }
        if (i == 1) {
            GroupSuggestItemView groupSuggestItemView = (GroupSuggestItemView) view;
            final StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < chatGroup.tags.size(); i3++) {
                sb.append(chatGroup.tags.get(i3).name);
                if (i3 != chatGroup.tags.size() - 1) {
                    sb.append(":");
                }
            }
            if (groupSuggestItemView.m36598j(this.f186957e.pageId(), chatGroup, false)) {
                o6j0.m162864h("e_group_chat_list", this.f186957e.pageId(), o6j0.C18854a.m162878h("group_name", chatGroup.name), o6j0.C18854a.m162876f("group_order_id", i2), o6j0.C18854a.m162878h("group_tag", sb.toString()), o6j0.C18854a.m162878h("groupchat_id", chatGroup.f56011id), o6j0.C18854a.m162878h("groupchat_type", chatGroup.category.name), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0));
            }
            xdl0.m208329E0(groupSuggestItemView, new View.OnClickListener() { // from class: l.vlk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f181957a.m203814H(chatGroup, i2, sb, view2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ChatGroup getItem(int i) {
        if (this.f186956d.isEmpty()) {
            return null;
        }
        return this.f186956d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m203818I(List<ChatGroup> list) {
        this.f186956d = list;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (!this.f186957e.m180003A0() || this.f186956d.size() <= 0 || this.f186956d.size() - i >= 2) {
            return;
        }
        this.f186957e.m180016r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f186956d.isEmpty() ? 2 : 1;
    }
}
