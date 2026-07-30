package p009l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.p000p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p000p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupTag;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import com.p1.mobile.putong.core.ui.view.CoreImEmptyView;
import com.tantanapp.common.data.DbObject;
import java.util.Collections;
import java.util.List;
import l.dac0;
import l.e30;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.t100;
import l.tbk;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zhk extends dac0<ChatGroup> {

    /* JADX INFO: renamed from: c */
    public GroupSearchAct f23675c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f23676d;

    /* JADX INFO: renamed from: e */
    public List<ChatGroup> f23677e;

    /* JADX INFO: renamed from: f */
    public boolean f23678f;

    /* JADX INFO: renamed from: g */
    public String f23679g;

    public zhk(GroupSearchAct groupSearchAct) {
        List<ChatGroup> list = Collections.EMPTY_LIST;
        this.f23676d = list;
        this.f23677e = list;
        this.f23678f = false;
        this.f23679g = "";
        this.f23675c = groupSearchAct;
    }

    /* JADX INFO: renamed from: C */
    public int m25789C() {
        if (this.f23678f) {
            return this.f23677e.size() + 1;
        }
        if (this.f23676d.isEmpty()) {
            return 1;
        }
        return this.f23676d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m25790D(ViewGroup viewGroup, int i) {
        GroupSearchAct groupSearchAct = this.f23675c;
        return i == 1 ? groupSearchAct.inflater().inflate(l6c0.K0, viewGroup, false) : groupSearchAct.inflater().inflate(l6c0.i, viewGroup, false);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m25788A(View view, final ChatGroup chatGroup, int i, final int i2) {
        if (i == 1) {
            m25799Q((CoreImEmptyView) view);
        }
        if (i == 0) {
            GroupSuggestItemView groupSuggestItemView = (GroupSuggestItemView) view;
            final StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < chatGroup.tags.size(); i3++) {
                sb.append(((ChatGroupTag) chatGroup.tags.get(i3)).name);
                if (i3 != chatGroup.tags.size() - 1) {
                    sb.append(":");
                }
            }
            if (groupSuggestItemView.m539j(this.f23675c.pageId(), chatGroup, this.f23678f)) {
                o6j0.h("e_group_chat_list", this.f23675c.pageId(), new o6j0.a[]{o6j0.a.h("group_name", chatGroup.name), o6j0.a.f("group_order_id", i2), o6j0.a.h("group_tag", sb.toString()), o6j0.a.h("groupchat_id", ((DbObject) chatGroup).id), o6j0.a.h("groupchat_type", chatGroup.category.name), o6j0.a.f("is_anonymou_group", tbk.s(chatGroup) ? 1 : 0), o6j0.a.h("which_page", this.f23678f ? "search_empty" : "search_no_empty")});
            }
            xdl0.E0(groupSuggestItemView, new View.OnClickListener() { // from class: l.vhk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21580a.m25793K(chatGroup, i2, sb, view2);
                }
            });
            if (i2 >= m25789C() - 3) {
                this.f23675c.m512Y1().m24241u0();
            }
        }
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ChatGroup getItem(int i) {
        if (!this.f23676d.isEmpty()) {
            return this.f23676d.get(i);
        }
        if (!this.f23678f || i <= 0 || this.f23677e.isEmpty()) {
            return null;
        }
        return this.f23677e.get(i - 1);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m25793K(ChatGroup chatGroup, int i, StringBuilder sb, View view) {
        PutongCoreAct putongCoreAct = this.f23675c;
        putongCoreAct.startActivity(GroupProfileAct.Z1(putongCoreAct, ((DbObject) chatGroup).id, chatGroup, false));
        o6j0.c("e_group_chat_list", this.f23675c.pageId(), new o6j0.a[]{o6j0.a.h("group_name", chatGroup.name), o6j0.a.f("group_order_id", i), o6j0.a.h("group_tag", sb.toString()), o6j0.a.h("groupchat_id", ((DbObject) chatGroup).id), o6j0.a.h("groupchat_type", chatGroup.category.name), o6j0.a.f("is_anonymou_group", tbk.s(chatGroup) ? 1 : 0), o6j0.a.h("which_page", this.f23678f ? "search_empty" : "search_no_empty")});
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m25794L(List list) {
        this.f23675c.progressDismiss();
        if (!GroupCreateCategoryAct.m468a2(list)) {
            lsi0.w(R.string.O0);
        } else {
            PutongCoreAct putongCoreAct = this.f23675c;
            putongCoreAct.startActivity(GroupCreateTypeAct.m483Z1(putongCoreAct, list));
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m25795M(Throwable th) {
        this.f23675c.progressDismiss();
        lsi0.h(R.string.B2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m25796N(View view) {
        o6j0.c("e_create_group", this.f23675c.pageId(), new o6j0.a[]{o6j0.a.h("which_page", this.f23678f ? "search_empty" : "search_no_empty")});
        if (tbk.h(this.f23675c)) {
            this.f23675c.progress("", true);
            this.f23675c.duringCreated(CoreModule.c.g0.N6()).subscribe(mkd0.H(new e30() { // from class: l.xhk
                public final void call(Object obj) {
                    this.f22612a.m25794L((List) obj);
                }
            }, new e30() { // from class: l.yhk
                public final void call(Object obj) {
                    this.f23064a.m25795M((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public void m25797O(List<ChatGroup> list) {
        this.f23678f = false;
        this.f23679g = "";
        this.f23676d = list;
    }

    /* JADX INFO: renamed from: P */
    public void m25798P(List<ChatGroup> list, List<ChatGroup> list2, String str) {
        if (list.isEmpty()) {
            this.f23678f = true;
            this.f23679g = str;
        } else {
            this.f23678f = false;
            this.f23679g = "";
        }
        this.f23676d = list;
        this.f23677e = list2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m25799Q(CoreImEmptyView coreImEmptyView) {
        xdl0.M(coreImEmptyView.a, false);
        coreImEmptyView.b.setTextSize(14.0f);
        coreImEmptyView.b.setTextColor(Color.parseColor("#d0d0d0"));
        xdl0.X(coreImEmptyView.a, t100.d(29.0f));
        boolean z = this.f23678f;
        LinearLayout linearLayout = coreImEmptyView.c;
        if (z) {
            xdl0.M(linearLayout, true);
            xdl0.M(coreImEmptyView.b, false);
            coreImEmptyView.d.setText(this.f23679g);
            xdl0.E0(coreImEmptyView.e, new View.OnClickListener() { // from class: l.whk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22116a.m25796N(view);
                }
            });
        } else {
            xdl0.M(linearLayout, false);
            xdl0.M(coreImEmptyView.b, true);
            coreImEmptyView.b.setText("没有符合要求的群");
        }
        xdl0.M(coreImEmptyView.f, !this.f23677e.isEmpty());
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (this.f23678f) {
            return i == 0 ? 1 : 0;
        }
        return this.f23676d.isEmpty() ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public void m25800e(int i) {
    }
}
