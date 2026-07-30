package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.Action;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l.c3c0;
import l.c40;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.qib0;
import l.roj0;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.yfk;
import p014rx.C1099c;
import p028v.VDraweeView;
import p028v.VListCell;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dlk implements s7m<blk> {

    /* JADX INFO: renamed from: a */
    public VText f3016a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f3017b;

    /* JADX INFO: renamed from: c */
    public final Act f3018c;

    /* JADX INFO: renamed from: d */
    public C0232b f3019d;

    /* JADX INFO: renamed from: e */
    public blk f3020e;

    /* JADX INFO: renamed from: f */
    public List<ChatGroupMember> f3021f = null;

    /* JADX INFO: renamed from: g */
    public List<ChatGroupMember> f3022g = null;

    /* JADX INFO: renamed from: h */
    public final List<ChatGroupMember> f3023h = new ArrayList();

    /* JADX INFO: renamed from: l.dlk$a */
    public static class C0231a {
        /* JADX INFO: renamed from: b */
        public static void m3607b(dlk dlkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            dlkVar.f3016a = (VText) viewGroup.getChildAt(0);
            dlkVar.f3017b = (VRecyclerView) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m3608c(dlk dlkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.A0, viewGroup, false);
            m3607b(dlkVar, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.dlk$b */
    public class C0232b extends dac0<ChatGroupMember> {

        /* JADX INFO: renamed from: c */
        public int f3024c;

        /* JADX INFO: renamed from: d */
        public final int f3025d;

        /* JADX INFO: renamed from: e */
        public final int f3026e;

        /* JADX INFO: renamed from: f */
        public c40 f3027f;

        public C0232b() {
            this.f3024c = 0;
            this.f3025d = 1;
            this.f3026e = 2;
        }

        /* JADX INFO: renamed from: H */
        public static /* synthetic */ void m3612H(boolean z, roj0 roj0Var) {
            if (z) {
                lsi0.w(R.string.U);
            } else {
                lsi0.w(R.string.e6);
            }
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return dlk.this.f3023h.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return o7r.a(dlk.this.f3018c).inflate(i == 2 ? l6c0.o0 : l6c0.p0, viewGroup, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, final ChatGroupMember chatGroupMember, int i, final int i2) {
            if (i != 2) {
                ((VText) view.findViewById(y4c0.e1)).setText(chatGroupMember.userName);
                return;
            }
            SimpleDraweeView simpleDraweeView = (VDraweeView) view.findViewById(y4c0.p);
            AppCompatTextView appCompatTextView = (VText) view.findViewById(y4c0.E2);
            AppCompatTextView appCompatTextView2 = (VText) view.findViewById(y4c0.B);
            final ChatGroup chatGroupS6 = CoreModule.c.g0.s6(chatGroupMember.groupId);
            if (NullChecker.a(chatGroupS6) && tbk.m7725s(chatGroupS6)) {
                simpleDraweeView.setBackgroundResource(c3c0.I0);
                qib0.G.Z0(simpleDraweeView, tbk.m7716j(chatGroupMember));
            } else if (TextUtils.isEmpty(chatGroupMember.avatar)) {
                qib0.G.Y0(simpleDraweeView, c3c0.I0);
            } else {
                qib0.G.Z0(simpleDraweeView, chatGroupMember.avatar);
            }
            xdl0.E0(simpleDraweeView, new View.OnClickListener() { // from class: l.elk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f3327a.m3617M(chatGroupS6, chatGroupMember, view2);
                }
            });
            appCompatTextView.setText(chatGroupMember.groupMemberName());
            xdl0.E0(appCompatTextView2, new View.OnClickListener() { // from class: l.flk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f3655a.m3618N(i2, chatGroupS6, view2);
                }
            });
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember getItem(int i) {
            return (ChatGroupMember) dlk.this.f3023h.get(i);
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m3617M(ChatGroup chatGroup, ChatGroupMember chatGroupMember, View view) {
            dlk.this.f3018c.startActivity(tbk.m7711e(dlk.this.f3018c, chatGroupMember.userId, (NullChecker.a(chatGroup) && tbk.m7725s(chatGroup)) ? "chat_group_anonymity" : "chat_group"));
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m3618N(int i, ChatGroup chatGroup, View view) {
            m3621Q(i, chatGroup.adminLimit);
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m3619O(View view) {
            this.f3027f.b();
        }

        /* JADX INFO: renamed from: P */
        public final /* synthetic */ void m3620P(ChatGroupMember chatGroupMember, int i, final boolean z, VListCell vListCell, VListCell.C1338a c1338a, int i2) {
            if (vwb.J(dlk.this.f3022g) || vwb.J(dlk.this.f3021f) || !dlk.this.f3022g.contains(chatGroupMember) || dlk.this.f3021f.size() != i) {
                C1099c c1099cFilter = mo3522c(dlk.this.f3018c, CoreModule.c.g0.S6(chatGroupMember.groupId, chatGroupMember.userId, Action.get(z ? "remove" : "add"))).filter(new w9j() { // from class: l.ilk
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a((roj0) obj));
                    }
                });
                e30 e30Var = new e30() { // from class: l.jlk
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        dlk.C0232b.m3612H(z, (roj0) obj);
                    }
                };
                CoreBusinessService coreBusinessServiceI = CoreModule.l.i();
                Objects.requireNonNull(coreBusinessServiceI);
                c1099cFilter.subscribe((m250) mkd0.H(e30Var, new yfk(coreBusinessServiceI)));
            } else {
                lsi0.y("管理员已达上限");
            }
            this.f3027f.b();
        }

        /* JADX INFO: renamed from: Q */
        public final void m3621Q(int i, final int i2) {
            final ChatGroupMember item = getItem(i);
            c40.b bVar = new c40.b(dlk.this.f3018c);
            bVar.I(dlk.this.f3018c.getResources().getString(R.string.a));
            bVar.U(new View.OnClickListener() { // from class: l.glk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3925a.m3619O(view);
                }
            });
            ArrayList arrayList = new ArrayList();
            final boolean z = i < this.f3024c;
            dlk dlkVar = dlk.this;
            arrayList.add(z ? dlkVar.act().string(R.string.T) : dlkVar.act().string(R.string.V));
            bVar.Q(arrayList);
            bVar.V(new c40.d() { // from class: l.hlk
                /* JADX INFO: renamed from: a */
                public final void m4988a(VListCell vListCell, VListCell.C1338a c1338a, int i3) {
                    this.f4231a.m3620P(item, i2, z, vListCell, c1338a, i3);
                }
            });
            c40 c40VarF = bVar.F();
            this.f3027f = c40VarF;
            c40VarF.f();
        }

        /* JADX INFO: renamed from: R */
        public final void m3622R(int i) {
            this.f3024c = i;
        }

        public int getItemViewType(int i) {
            return (i == 0 || i == this.f3024c) ? 1 : 2;
        }
    }

    public dlk(Act act) {
        this.f3018c = act;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3599C0() {
        return this.f3018c;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3601j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m3601j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0231a.m3608c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m3600i1(blk blkVar) {
        this.f3020e = blkVar;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m3603l(ChatGroupMember chatGroupMember, List list, List list2) {
        this.f3021f = list;
        this.f3022g = list2;
        this.f3023h.clear();
        if (!vwb.J(list)) {
            ChatGroupMember chatGroupMemberNew_ = ChatGroupMember.new_();
            chatGroupMemberNew_.userName = this.f3018c.string(R.string.S);
            this.f3023h.add(chatGroupMemberNew_);
            Collections.sort(list, new tbk.C0546a());
            this.f3023h.addAll(list);
        }
        this.f3019d.m3622R(this.f3023h.size());
        if (!vwb.J(list2)) {
            ChatGroupMember chatGroupMemberNew_2 = ChatGroupMember.new_();
            chatGroupMemberNew_2.userName = "群成员";
            this.f3023h.add(chatGroupMemberNew_2);
            Collections.sort(list2, new tbk.C0546a());
            this.f3023h.addAll(list2);
        }
        boolean zJ = vwb.J(this.f3023h);
        AppCompatTextView appCompatTextView = this.f3016a;
        if (zJ) {
            xdl0.M(appCompatTextView, true);
            xdl0.M(this.f3017b, false);
        } else {
            xdl0.M(appCompatTextView, false);
            xdl0.M(this.f3017b, true);
            this.f3019d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m3604m(ChatGroup chatGroup, List<ChatGroupMember> list) {
        tbk.m7728v(chatGroup, list, new tbk.InterfaceC0547b() { // from class: l.clk
            @Override // p003l.tbk.InterfaceC0547b
            /* JADX INFO: renamed from: a */
            public final void mo2885a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f2723a.m3603l(chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m3605r() {
        this.f3017b.setLayoutManager(new LinearLayoutManager(this.f3018c, 1, false));
        C0232b c0232b = new C0232b();
        this.f3019d = c0232b;
        this.f3017b.setAdapter(c0232b);
    }

    public void destroy() {
    }
}
