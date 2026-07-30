package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.core.p058ui.view.CoreImEmptyView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mok extends jic0<ChatGroup> {

    /* JADX INFO: renamed from: c */
    public Act f137834c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f137835d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public hpk f137836e;

    public mok(Act act, hpk hpkVar) {
        this.f137834c = act;
        this.f137836e = hpkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m159298H(ChatGroup chatGroup, int i, StringBuilder sb, View view) {
        Act act = this.f137834c;
        act.startActivity(GroupProfileAct.m50290a2(act, chatGroup.f56859id, chatGroup, false));
        sfj0.m185596c("e_group_chat_list", this.f137836e.pageId(), sfj0.C20032a.m185615h("group_name", chatGroup.name), sfj0.C20032a.m185613f("group_order_id", i), sfj0.C20032a.m185615h("group_tag", sb.toString()), sfj0.C20032a.m185615h("groupchat_id", chatGroup.f56859id), sfj0.C20032a.m185615h("groupchat_type", chatGroup.category.name), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0));
    }

    /* JADX INFO: renamed from: J */
    private void m159299J(CoreImEmptyView coreImEmptyView) {
        coreImEmptyView.f37575b.setText("暂时没有新的内容");
        bnl0.m105540X(coreImEmptyView.f37574a, qa00.m175859d(176.0f));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f137835d.isEmpty()) {
            return 1;
        }
        return this.f137835d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f137834c;
        return i == 2 ? act.inflater().inflate(qec0.f156882K0, viewGroup, false) : act.inflater().inflate(qec0.f157043i, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final ChatGroup chatGroup, int i, final int i2) {
        if (i == 2) {
            m159299J((CoreImEmptyView) view);
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
            if (groupSuggestItemView.m37601j(this.f137836e.pageId(), chatGroup, false)) {
                sfj0.m185601h("e_group_chat_list", this.f137836e.pageId(), sfj0.C20032a.m185615h("group_name", chatGroup.name), sfj0.C20032a.m185613f("group_order_id", i2), sfj0.C20032a.m185615h("group_tag", sb.toString()), sfj0.C20032a.m185615h("groupchat_id", chatGroup.f56859id), sfj0.C20032a.m185615h("groupchat_type", chatGroup.category.name), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0));
            }
            bnl0.m105509E0(groupSuggestItemView, new View.OnClickListener() { // from class: l.lok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f132915a.m159298H(chatGroup, i2, sb, view2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ChatGroup getItem(int i) {
        if (this.f137835d.isEmpty()) {
            return null;
        }
        return this.f137835d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m159302I(List<ChatGroup> list) {
        this.f137835d = list;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (!this.f137836e.m136551A0() || this.f137835d.size() <= 0 || this.f137835d.size() - i >= 2) {
            return;
        }
        this.f137836e.m136564r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f137835d.isEmpty() ? 2 : 1;
    }
}
