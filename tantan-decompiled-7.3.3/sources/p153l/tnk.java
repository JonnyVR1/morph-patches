package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VListCell;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class tnk implements iam<rnk> {

    /* JADX INFO: renamed from: a */
    public VText f175277a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f175278b;

    /* JADX INFO: renamed from: c */
    public final Act f175279c;

    /* JADX INFO: renamed from: d */
    public C20352b f175280d;

    /* JADX INFO: renamed from: e */
    public rnk f175281e;

    /* JADX INFO: renamed from: f */
    public List<ChatGroupMember> f175282f = null;

    /* JADX INFO: renamed from: g */
    public List<ChatGroupMember> f175283g = null;

    /* JADX INFO: renamed from: h */
    public final List<ChatGroupMember> f175284h = new ArrayList();

    /* JADX INFO: renamed from: l.tnk$a */
    public static class C20351a {
        /* JADX INFO: renamed from: b */
        public static void m191925b(tnk tnkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            tnkVar.f175277a = (VText) viewGroup.getChildAt(0);
            tnkVar.f175278b = (VRecyclerView) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m191926c(tnk tnkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f156812A0, viewGroup, false);
            m191925b(tnkVar, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.tnk$b */
    public class C20352b extends jic0<ChatGroupMember> {

        /* JADX INFO: renamed from: c */
        public int f175285c;

        /* JADX INFO: renamed from: d */
        public final int f175286d;

        /* JADX INFO: renamed from: e */
        public final int f175287e;

        /* JADX INFO: renamed from: f */
        public w30 f175288f;

        public C20352b() {
            this.f175285c = 0;
            this.f175286d = 1;
            this.f175287e = 2;
        }

        /* JADX INFO: renamed from: H */
        public static /* synthetic */ void m191930H(boolean z, uxj0 uxj0Var) {
            if (z) {
                o1j0.m165649w(R$string.f21610U);
            } else {
                o1j0.m165649w(R$string.f21701e6);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return tnk.this.f175284h.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(tnk.this.f175279c).inflate(i == 2 ? qec0.f157086o0 : qec0.f157093p0, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final ChatGroupMember chatGroupMember, int i, final int i2) {
            if (i != 2) {
                ((VText) view.findViewById(edc0.f93352e1)).setText(chatGroupMember.userName);
                return;
            }
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93427p);
            VText vText = (VText) view.findViewById(edc0.f93193E2);
            VText vText2 = (VText) view.findViewById(edc0.f93170B);
            final ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(chatGroupMember.groupId);
            if (NullChecker.m82486a(chatGroupM32923s6) && jek.m144587s(chatGroupM32923s6)) {
                vDraweeView.setBackgroundResource(ibc0.f113815I0);
                uqb0.f180374G.m127140Z0(vDraweeView, jek.m144578j(chatGroupMember));
            } else if (TextUtils.isEmpty(chatGroupMember.avatar)) {
                uqb0.f180374G.m127138Y0(vDraweeView, ibc0.f113815I0);
            } else {
                uqb0.f180374G.m127140Z0(vDraweeView, chatGroupMember.avatar);
            }
            bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.unk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f179737a.m191935M(chatGroupM32923s6, chatGroupMember, view2);
                }
            });
            vText.setText(chatGroupMember.groupMemberName());
            bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.vnk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f184886a.m191936N(i2, chatGroupM32923s6, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember getItem(int i) {
            return (ChatGroupMember) tnk.this.f175284h.get(i);
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m191935M(ChatGroup chatGroup, ChatGroupMember chatGroupMember, View view) {
            tnk.this.f175279c.startActivity(jek.m144573e(tnk.this.f175279c, chatGroupMember.userId, (NullChecker.m82486a(chatGroup) && jek.m144587s(chatGroup)) ? "chat_group_anonymity" : "chat_group"));
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m191936N(int i, ChatGroup chatGroup, View view) {
            m191939Q(i, chatGroup.adminLimit);
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m191937O(View view) {
            this.f175288f.m204614b();
        }

        /* JADX INFO: renamed from: P */
        public final /* synthetic */ void m191938P(ChatGroupMember chatGroupMember, int i, final boolean z, VListCell vListCell, VListCell.C22660a c22660a, int i2) {
            if (jyb.m147479J(tnk.this.f175283g) || jyb.m147479J(tnk.this.f175282f) || !tnk.this.f175283g.contains(chatGroupMember) || tnk.this.f175282f.size() != i) {
                C22421c c22421cFilter = mo68557c(tnk.this.f175279c, CoreModule.f18264c.f20387g0.m32844S6(chatGroupMember.groupId, chatGroupMember.userId, Action.get(z ? Action.remove : "add"))).filter(new ynk());
                y20 y20Var = new y20() { // from class: l.znk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        tnk.C20352b.m191930H(z, (uxj0) obj);
                    }
                };
                CoreBusinessService coreBusinessServiceM143412i = CoreModule.f18273l.m143412i();
                Objects.requireNonNull(coreBusinessServiceM143412i);
                c22421cFilter.subscribe(psd0.m173597H(y20Var, new oik(coreBusinessServiceM143412i)));
            } else {
                o1j0.m165651y("管理员已达上限");
            }
            this.f175288f.m204614b();
        }

        /* JADX INFO: renamed from: Q */
        public final void m191939Q(int i, final int i2) {
            final ChatGroupMember item = getItem(i);
            w30.C21001b c21001b = new w30.C21001b(tnk.this.f175279c);
            c21001b.m204657I(tnk.this.f175279c.getResources().getString(R$string.f21658a));
            c21001b.m204669U(new View.OnClickListener() { // from class: l.wnk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f189962a.m191937O(view);
                }
            });
            ArrayList arrayList = new ArrayList();
            final boolean z = i < this.f175285c;
            tnk tnkVar = tnk.this;
            arrayList.add(z ? tnkVar.getAct().string(R$string.f21602T) : tnkVar.getAct().string(R$string.f21618V));
            c21001b.m204665Q(arrayList);
            c21001b.m204670V(new w30.InterfaceC21003d() { // from class: l.xnk
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i3) {
                    this.f195400a.m191938P(item, i2, z, vListCell, c22660a, i3);
                }
            });
            w30 w30VarM204654F = c21001b.m204654F();
            this.f175288f = w30VarM204654F;
            w30VarM204654F.m204618f();
        }

        /* JADX INFO: renamed from: R */
        public final void m191940R(int i) {
            this.f175285c = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return (i == 0 || i == this.f175285c) ? 1 : 2;
        }
    }

    public tnk(Act act) {
        this.f175279c = act;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f175279c;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m191919j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m191919j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20351a.m191926c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rnk rnkVar) {
        this.f175281e = rnkVar;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m191921l(ChatGroupMember chatGroupMember, List list, List list2) {
        this.f175282f = list;
        this.f175283g = list2;
        this.f175284h.clear();
        if (!jyb.m147479J(list)) {
            ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
            chatGroupMemberNew_.userName = this.f175279c.string(R$string.f21594S);
            this.f175284h.add(chatGroupMemberNew_);
            Collections.sort(list, new jek.C17933a());
            this.f175284h.addAll(list);
        }
        this.f175280d.m191940R(this.f175284h.size());
        if (!jyb.m147479J(list2)) {
            ChatGroupMember chatGroupMemberNew_2 = ChatGroupMember.new_();
            chatGroupMemberNew_2.userName = "群成员";
            this.f175284h.add(chatGroupMemberNew_2);
            Collections.sort(list2, new jek.C17933a());
            this.f175284h.addAll(list2);
        }
        boolean zM147479J = jyb.m147479J(this.f175284h);
        VText vText = this.f175277a;
        if (zM147479J) {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f175278b, false);
        } else {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f175278b, true);
            this.f175280d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m191922m(ChatGroup chatGroup, List<ChatGroupMember> list) {
        jek.m144590v(chatGroup, list, new jek.InterfaceC17934b() { // from class: l.snk
            @Override // p153l.jek.InterfaceC17934b
            /* JADX INFO: renamed from: a */
            public final void mo104349a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f169708a.m191921l(chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m191923r() {
        this.f175278b.setLayoutManager(new LinearLayoutManager(this.f175279c, 1, false));
        C20352b c20352b = new C20352b();
        this.f175280d = c20352b;
        this.f175278b.setAdapter(c20352b);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
