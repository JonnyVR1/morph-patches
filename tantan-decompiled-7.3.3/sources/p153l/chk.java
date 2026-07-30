package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupMembersAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class chk implements iam<zgk> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f81842a;

    /* JADX INFO: renamed from: b */
    public GroupMembersAct f81843b;

    /* JADX INFO: renamed from: c */
    public zgk f81844c;

    /* JADX INFO: renamed from: d */
    public sgk f81845d;

    /* JADX INFO: renamed from: e */
    public boolean f81846e;

    /* JADX INFO: renamed from: f */
    public boolean f81847f;

    /* JADX INFO: renamed from: l.chk$a */
    public static class C16260a {
        /* JADX INFO: renamed from: b */
        public static void m109835b(chk chkVar, View view) {
            chkVar.f81842a = (VRecyclerView) view;
        }

        /* JADX INFO: renamed from: c */
        public static View m109836c(chk chkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157079n0, viewGroup, false);
            m109835b(chkVar, viewInflate);
            return viewInflate;
        }
    }

    public chk(GroupMembersAct groupMembersAct) {
        this.f81843b = groupMembersAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f81843b;
    }

    /* JADX INFO: renamed from: d */
    public View m109826d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16260a.m109836c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zgk zgkVar) {
        this.f81844c = zgkVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m109828f(View view) {
        this.f81844c.m219647j0();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m109829i(String str, ChatGroupMember chatGroupMember, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(chatGroupMember)) {
            arrayList.add(chatGroupMember);
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        sgk sgkVar = this.f81845d;
        if (sgkVar != null) {
            sgkVar.m185791I(arrayList);
            this.f81845d.notifyDataSetChanged();
        } else {
            sgk sgkVar2 = new sgk(this.f81843b, str, arrayList);
            this.f81845d = sgkVar2;
            this.f81842a.setAdapter(sgkVar2);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m109826d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m109830j(Menu menu) {
        if (!this.f81847f || this.f81846e) {
            return;
        }
        this.f81843b.getMenuInflater().inflate(nfc0.f141721a, menu);
        bnl0.m105509E0(menu.findItem(edc0.f93381i2).getActionView(), new View.OnClickListener() { // from class: l.ahk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71371a.m109828f(view);
            }
        });
        this.f81846e = true;
    }

    /* JADX INFO: renamed from: k */
    public void m109831k(ChatGroup chatGroup) {
        String strUserId = CoreModule.m30929H().userId();
        this.f81847f = TextUtils.equals(chatGroup.ownerUserId, strUserId) || chatGroup.adminUserIds.contains(strUserId);
        GroupMembersAct groupMembersAct = this.f81843b;
        groupMembersAct.setTitle(String.format("%1$s(%2$s)", groupMembersAct.string(R$string.f21597S2), Integer.valueOf(chatGroup.memberCount)));
    }

    /* JADX INFO: renamed from: l */
    public void m109832l(final String str, ChatGroup chatGroup, List<ChatGroupMember> list) {
        jek.m144590v(chatGroup, list, new jek.InterfaceC17934b() { // from class: l.bhk
            @Override // p153l.jek.InterfaceC17934b
            /* JADX INFO: renamed from: a */
            public final void mo104349a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f76791a.m109829i(str, chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m109833r() {
        this.f81842a.setLayoutManager(new GridLayoutManager((Context) this.f81843b, 5, 1, false));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
