package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupTag;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import com.p1.mobile.putong.core.ui.view.CoreImEmptyView;
import com.tantanapp.common.data.DbObject;
import java.util.Collections;
import java.util.List;
import l.dac0;
import l.l6c0;
import l.o6j0;
import l.t100;
import l.tbk;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wlk extends dac0<ChatGroup> {

    /* JADX INFO: renamed from: c */
    public Act f22187c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f22188d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public rmk f22189e;

    public wlk(Act act, rmk rmkVar) {
        this.f22187c = act;
        this.f22189e = rmkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m24321H(ChatGroup chatGroup, int i, StringBuilder sb, View view) {
        Act act = this.f22187c;
        act.startActivity(GroupProfileAct.Z1(act, ((DbObject) chatGroup).id, chatGroup, false));
        o6j0.c("e_group_chat_list", this.f22189e.pageId(), new o6j0.a[]{o6j0.a.h("group_name", chatGroup.name), o6j0.a.f("group_order_id", i), o6j0.a.h("group_tag", sb.toString()), o6j0.a.h("groupchat_id", ((DbObject) chatGroup).id), o6j0.a.h("groupchat_type", chatGroup.category.name), o6j0.a.f("is_anonymou_group", tbk.s(chatGroup) ? 1 : 0)});
    }

    /* JADX INFO: renamed from: J */
    private void m24322J(CoreImEmptyView coreImEmptyView) {
        coreImEmptyView.b.setText("暂时没有新的内容");
        xdl0.X(coreImEmptyView.a, t100.d(176.0f));
    }

    /* JADX INFO: renamed from: C */
    public int m24324C() {
        if (this.f22188d.isEmpty()) {
            return 1;
        }
        return this.f22188d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m24325D(ViewGroup viewGroup, int i) {
        Act act = this.f22187c;
        return i == 2 ? act.inflater().inflate(l6c0.K0, viewGroup, false) : act.inflater().inflate(l6c0.i, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m24323A(View view, final ChatGroup chatGroup, int i, final int i2) {
        if (i == 2) {
            m24322J((CoreImEmptyView) view);
            return;
        }
        if (i == 1) {
            GroupSuggestItemView groupSuggestItemView = (GroupSuggestItemView) view;
            final StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < chatGroup.tags.size(); i3++) {
                sb.append(((ChatGroupTag) chatGroup.tags.get(i3)).name);
                if (i3 != chatGroup.tags.size() - 1) {
                    sb.append(":");
                }
            }
            if (groupSuggestItemView.m539j(this.f22189e.pageId(), chatGroup, false)) {
                o6j0.h("e_group_chat_list", this.f22189e.pageId(), new o6j0.a[]{o6j0.a.h("group_name", chatGroup.name), o6j0.a.f("group_order_id", i2), o6j0.a.h("group_tag", sb.toString()), o6j0.a.h("groupchat_id", ((DbObject) chatGroup).id), o6j0.a.h("groupchat_type", chatGroup.category.name), o6j0.a.f("is_anonymou_group", tbk.s(chatGroup) ? 1 : 0)});
            }
            xdl0.E0(groupSuggestItemView, new View.OnClickListener() { // from class: l.vlk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21644a.m24321H(chatGroup, i2, sb, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ChatGroup getItem(int i) {
        if (this.f22188d.isEmpty()) {
            return null;
        }
        return this.f22188d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m24328I(List<ChatGroup> list) {
        this.f22188d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m24329e(int i) {
        if (!this.f22189e.m21721A0() || this.f22188d.size() <= 0 || this.f22188d.size() - i >= 2) {
            return;
        }
        this.f22189e.m21735r();
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        return this.f22188d.isEmpty() ? 2 : 1;
    }
}
