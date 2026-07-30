package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VListCell;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class dlk implements s7m<blk> {

    /* JADX INFO: renamed from: a */
    public VText f86814a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f86815b;

    /* JADX INFO: renamed from: c */
    public final Act f86816c;

    /* JADX INFO: renamed from: d */
    public C16406b f86817d;

    /* JADX INFO: renamed from: e */
    public blk f86818e;

    /* JADX INFO: renamed from: f */
    public List<ChatGroupMember> f86819f = null;

    /* JADX INFO: renamed from: g */
    public List<ChatGroupMember> f86820g = null;

    /* JADX INFO: renamed from: h */
    public final List<ChatGroupMember> f86821h = new ArrayList();

    /* JADX INFO: renamed from: l.dlk$a */
    public static class C16405a {
        /* JADX INFO: renamed from: b */
        public static void m112370b(dlk dlkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            dlkVar.f86814a = (VText) viewGroup.getChildAt(0);
            dlkVar.f86815b = (VRecyclerView) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m112371c(dlk dlkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126256A0, viewGroup, false);
            m112370b(dlkVar, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.dlk$b */
    public class C16406b extends dac0<ChatGroupMember> {

        /* JADX INFO: renamed from: c */
        public int f86822c;

        /* JADX INFO: renamed from: d */
        public final int f86823d;

        /* JADX INFO: renamed from: e */
        public final int f86824e;

        /* JADX INFO: renamed from: f */
        public c40 f86825f;

        public C16406b() {
            this.f86822c = 0;
            this.f86823d = 1;
            this.f86824e = 2;
        }

        /* JADX INFO: renamed from: H */
        public static /* synthetic */ void m112375H(boolean z, roj0 roj0Var) {
            if (z) {
                lsi0.m151593w(R$string.f20868U);
            } else {
                lsi0.m151593w(R$string.f20959e6);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return dlk.this.f86821h.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(dlk.this.f86816c).inflate(i == 2 ? l6c0.f126530o0 : l6c0.f126537p0, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final ChatGroupMember chatGroupMember, int i, final int i2) {
            if (i != 2) {
                ((VText) view.findViewById(y4c0.f196117e1)).setText(chatGroupMember.userName);
                return;
            }
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f196192p);
            VText vText = (VText) view.findViewById(y4c0.f195958E2);
            VText vText2 = (VText) view.findViewById(y4c0.f195935B);
            final ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(chatGroupMember.groupId);
            if (NullChecker.m81303a(chatGroupM31920s6) && tbk.m187872s(chatGroupM31920s6)) {
                vDraweeView.setBackgroundResource(c3c0.f78540I0);
                qib0.f154691G.m102356Z0(vDraweeView, tbk.m187863j(chatGroupMember));
            } else if (TextUtils.isEmpty(chatGroupMember.avatar)) {
                qib0.f154691G.m102354Y0(vDraweeView, c3c0.f78540I0);
            } else {
                qib0.f154691G.m102356Z0(vDraweeView, chatGroupMember.avatar);
            }
            xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.elk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f92103a.m112380M(chatGroupM31920s6, chatGroupMember, view2);
                }
            });
            vText.setText(chatGroupMember.groupMemberName());
            xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.flk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f98187a.m112381N(i2, chatGroupM31920s6, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember getItem(int i) {
            return (ChatGroupMember) dlk.this.f86821h.get(i);
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m112380M(ChatGroup chatGroup, ChatGroupMember chatGroupMember, View view) {
            dlk.this.f86816c.startActivity(tbk.m187858e(dlk.this.f86816c, chatGroupMember.userId, (NullChecker.m81303a(chatGroup) && tbk.m187872s(chatGroup)) ? "chat_group_anonymity" : "chat_group"));
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m112381N(int i, ChatGroup chatGroup, View view) {
            m112384Q(i, chatGroup.adminLimit);
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m112382O(View view) {
            this.f86825f.m105113b();
        }

        /* JADX INFO: renamed from: P */
        public final /* synthetic */ void m112383P(ChatGroupMember chatGroupMember, int i, final boolean z, VListCell vListCell, VListCell.C22545a c22545a, int i2) {
            if (vwb.m200296J(dlk.this.f86820g) || vwb.m200296J(dlk.this.f86819f) || !dlk.this.f86820g.contains(chatGroupMember) || dlk.this.f86819f.size() != i) {
                C22306c c22306cFilter = mo67374c(dlk.this.f86816c, CoreModule.f17545c.f19645g0.m31841S6(chatGroupMember.groupId, chatGroupMember.userId, Action.get(z ? Action.remove : "add"))).filter(new ilk());
                e30 e30Var = new e30() { // from class: l.jlk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        dlk.C16406b.m112375H(z, (roj0) obj);
                    }
                };
                CoreBusinessService coreBusinessServiceM94658i = CoreModule.f17554l.m94658i();
                Objects.requireNonNull(coreBusinessServiceM94658i);
                c22306cFilter.subscribe(mkd0.m154956H(e30Var, new yfk(coreBusinessServiceM94658i)));
            } else {
                lsi0.m151595y("管理员已达上限");
            }
            this.f86825f.m105113b();
        }

        /* JADX INFO: renamed from: Q */
        public final void m112384Q(int i, final int i2) {
            final ChatGroupMember item = getItem(i);
            c40.C16057b c16057b = new c40.C16057b(dlk.this.f86816c);
            c16057b.m105156I(dlk.this.f86816c.getResources().getString(R$string.f20916a));
            c16057b.m105168U(new View.OnClickListener() { // from class: l.glk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f103334a.m112382O(view);
                }
            });
            ArrayList arrayList = new ArrayList();
            final boolean z = i < this.f86822c;
            dlk dlkVar = dlk.this;
            arrayList.add(z ? dlkVar.getAct().string(R$string.f20860T) : dlkVar.getAct().string(R$string.f20876V));
            c16057b.m105164Q(arrayList);
            c16057b.m105169V(new c40.InterfaceC16059d() { // from class: l.hlk
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i3) {
                    this.f108355a.m112383P(item, i2, z, vListCell, c22545a, i3);
                }
            });
            c40 c40VarM105153F = c16057b.m105153F();
            this.f86825f = c40VarM105153F;
            c40VarM105153F.m105117f();
        }

        /* JADX INFO: renamed from: R */
        public final void m112385R(int i) {
            this.f86822c = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return (i == 0 || i == this.f86822c) ? 1 : 2;
        }
    }

    public dlk(Act act) {
        this.f86816c = act;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f86816c;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m112364j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m112364j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16405a.m112371c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(blk blkVar) {
        this.f86818e = blkVar;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m112366l(ChatGroupMember chatGroupMember, List list, List list2) {
        this.f86819f = list;
        this.f86820g = list2;
        this.f86821h.clear();
        if (!vwb.m200296J(list)) {
            ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
            chatGroupMemberNew_.userName = this.f86816c.string(R$string.f20852S);
            this.f86821h.add(chatGroupMemberNew_);
            Collections.sort(list, new tbk.C20140a());
            this.f86821h.addAll(list);
        }
        this.f86817d.m112385R(this.f86821h.size());
        if (!vwb.m200296J(list2)) {
            ChatGroupMember chatGroupMemberNew_2 = ChatGroupMember.new_();
            chatGroupMemberNew_2.userName = "群成员";
            this.f86821h.add(chatGroupMemberNew_2);
            Collections.sort(list2, new tbk.C20140a());
            this.f86821h.addAll(list2);
        }
        boolean zM200296J = vwb.m200296J(this.f86821h);
        VText vText = this.f86814a;
        if (zM200296J) {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f86815b, false);
        } else {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f86815b, true);
            this.f86817d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m112367m(ChatGroup chatGroup, List<ChatGroupMember> list) {
        tbk.m187875v(chatGroup, list, new tbk.InterfaceC20141b() { // from class: l.clk
            @Override // p149l.tbk.InterfaceC20141b
            /* JADX INFO: renamed from: a */
            public final void mo96977a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f81427a.m112366l(chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m112368r() {
        this.f86815b.setLayoutManager(new LinearLayoutManager(this.f86816c, 1, false));
        C16406b c16406b = new C16406b();
        this.f86817d = c16406b;
        this.f86815b.setAdapter(c16406b);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
