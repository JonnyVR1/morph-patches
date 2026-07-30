package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupMembersAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class mek implements s7m<jek> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f133430a;

    /* JADX INFO: renamed from: b */
    public GroupMembersAct f133431b;

    /* JADX INFO: renamed from: c */
    public jek f133432c;

    /* JADX INFO: renamed from: d */
    public cek f133433d;

    /* JADX INFO: renamed from: e */
    public boolean f133434e;

    /* JADX INFO: renamed from: f */
    public boolean f133435f;

    /* JADX INFO: renamed from: l.mek$a */
    public static class C18443a {
        /* JADX INFO: renamed from: b */
        public static void m154237b(mek mekVar, View view) {
            mekVar.f133430a = (VRecyclerView) view;
        }

        /* JADX INFO: renamed from: c */
        public static View m154238c(mek mekVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126523n0, viewGroup, false);
            m154237b(mekVar, viewInflate);
            return viewInflate;
        }
    }

    public mek(GroupMembersAct groupMembersAct) {
        this.f133431b = groupMembersAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f133431b;
    }

    /* JADX INFO: renamed from: d */
    public View m154228d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18443a.m154238c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jek jekVar) {
        this.f133432c = jekVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m154230f(View view) {
        this.f133432c.m141157j0();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m154231i(String str, ChatGroupMember chatGroupMember, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(chatGroupMember)) {
            arrayList.add(chatGroupMember);
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        cek cekVar = this.f133433d;
        if (cekVar != null) {
            cekVar.m106323I(arrayList);
            this.f133433d.notifyDataSetChanged();
        } else {
            cek cekVar2 = new cek(this.f133431b, str, arrayList);
            this.f133433d = cekVar2;
            this.f133430a.setAdapter(cekVar2);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m154228d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m154232j(Menu menu) {
        if (!this.f133435f || this.f133434e) {
            return;
        }
        this.f133431b.getMenuInflater().inflate(j7c0.f116585a, menu);
        xdl0.m208329E0(menu.findItem(y4c0.f196146i2).getActionView(), new View.OnClickListener() { // from class: l.kek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122718a.m154230f(view);
            }
        });
        this.f133434e = true;
    }

    /* JADX INFO: renamed from: k */
    public void m154233k(ChatGroup chatGroup) {
        String strUserId = CoreModule.m29931H().userId();
        this.f133435f = TextUtils.equals(chatGroup.ownerUserId, strUserId) || chatGroup.adminUserIds.contains(strUserId);
        GroupMembersAct groupMembersAct = this.f133431b;
        groupMembersAct.setTitle(String.format("%1$s(%2$s)", groupMembersAct.string(R$string.f20855S2), Integer.valueOf(chatGroup.memberCount)));
    }

    /* JADX INFO: renamed from: l */
    public void m154234l(final String str, ChatGroup chatGroup, List<ChatGroupMember> list) {
        tbk.m187875v(chatGroup, list, new tbk.InterfaceC20141b() { // from class: l.lek
            @Override // p149l.tbk.InterfaceC20141b
            /* JADX INFO: renamed from: a */
            public final void mo96977a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f127706a.m154231i(str, chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m154235r() {
        this.f133430a.setLayoutManager(new GridLayoutManager((Context) this.f133431b, 5, 1, false));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
