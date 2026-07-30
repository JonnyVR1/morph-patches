package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupMembersAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j7c0;
import l.l6c0;
import l.s7m;
import l.xdl0;
import l.y4c0;
import p028v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mek implements s7m<jek> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f5610a;

    /* JADX INFO: renamed from: b */
    public GroupMembersAct f5611b;

    /* JADX INFO: renamed from: c */
    public jek f5612c;

    /* JADX INFO: renamed from: d */
    public cek f5613d;

    /* JADX INFO: renamed from: e */
    public boolean f5614e;

    /* JADX INFO: renamed from: f */
    public boolean f5615f;

    /* JADX INFO: renamed from: l.mek$a */
    public static class C0424a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m6376b(mek mekVar, View view) {
            mekVar.f5610a = (VRecyclerView) view;
        }

        /* JADX INFO: renamed from: c */
        public static View m6377c(mek mekVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.n0, viewGroup, false);
            m6376b(mekVar, viewInflate);
            return viewInflate;
        }
    }

    public mek(GroupMembersAct groupMembersAct) {
        this.f5611b = groupMembersAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6365C0() {
        return this.f5611b;
    }

    /* JADX INFO: renamed from: d */
    public View m6366d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0424a.m6377c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m6370i1(jek jekVar) {
        this.f5612c = jekVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6368f(View view) {
        this.f5612c.m5325j0();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6369i(String str, ChatGroupMember chatGroupMember, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(chatGroupMember)) {
            arrayList.add(chatGroupMember);
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        cek cekVar = this.f5613d;
        if (cekVar != null) {
            cekVar.m3255I(arrayList);
            this.f5613d.notifyDataSetChanged();
        } else {
            cek cekVar2 = new cek(this.f5611b, str, arrayList);
            this.f5613d = cekVar2;
            this.f5610a.setAdapter(cekVar2);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6366d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m6371j(Menu menu) {
        if (!this.f5615f || this.f5614e) {
            return;
        }
        this.f5611b.getMenuInflater().inflate(j7c0.a, menu);
        xdl0.E0(menu.findItem(y4c0.i2).getActionView(), new View.OnClickListener() { // from class: l.kek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4907a.m6368f(view);
            }
        });
        this.f5614e = true;
    }

    /* JADX INFO: renamed from: k */
    public void m6372k(ChatGroup chatGroup) {
        String strUserId = CoreModule.H().userId();
        this.f5615f = TextUtils.equals(chatGroup.ownerUserId, strUserId) || chatGroup.adminUserIds.contains(strUserId);
        GroupMembersAct groupMembersAct = this.f5611b;
        groupMembersAct.setTitle(String.format("%1$s(%2$s)", groupMembersAct.string(R.string.S2), Integer.valueOf(chatGroup.memberCount)));
    }

    /* JADX INFO: renamed from: l */
    public void m6373l(final String str, ChatGroup chatGroup, List<ChatGroupMember> list) {
        tbk.m7728v(chatGroup, list, new tbk.InterfaceC0547b() { // from class: l.lek
            @Override // p003l.tbk.InterfaceC0547b
            /* JADX INFO: renamed from: a */
            public final void mo2885a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f5286a.m6369i(str, chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m6374r() {
        this.f5610a.setLayoutManager(new GridLayoutManager(this.f5611b, 5, 1, false));
    }

    public void destroy() {
    }
}
