package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupTab;
import com.p051p1.mobile.putong.core.data.NotificationCounter;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p051p1.mobile.putong.core.newui.group.SwipeRefreshList;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ppk implements iam<hpk>, SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f153552a;

    /* JADX INFO: renamed from: b */
    public SwipeRefreshList f153553b;

    /* JADX INFO: renamed from: c */
    public VLinear f153554c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f153555d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f153556e;

    /* JADX INFO: renamed from: f */
    public VText f153557f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f153558g;

    /* JADX INFO: renamed from: h */
    public VRelative f153559h;

    /* JADX INFO: renamed from: i */
    public VImage f153560i;

    /* JADX INFO: renamed from: j */
    public VText f153561j;

    /* JADX INFO: renamed from: k */
    public hpk f153562k;

    /* JADX INFO: renamed from: l */
    public mok f153563l;

    /* JADX INFO: renamed from: m */
    public upk f153564m;

    /* JADX INFO: renamed from: n */
    public Act f153565n;

    /* JADX INFO: renamed from: l.ppk$a */
    public static class C19414a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = qa00.m175859d(8.0f);
            } else {
                rect.top = qa00.m175859d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.ppk$b */
    public static class C19415b extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = qa00.m175859d(12.0f);
            } else {
                rect.left = qa00.m175859d(6.0f);
            }
        }
    }

    public ppk(Act act) {
        this.f153565n = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m173235j(View view) {
        this.f153562k.m136565z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m173236k(View view) {
        Act act = this.f153565n;
        act.startActivity(GroupSearchAct.m37575Y1(act));
        sfj0.m185596c("e_group_search", this.f153562k.pageId(), new sfj0.C20032a[0]);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153565n;
    }

    /* JADX INFO: renamed from: d */
    public View m173237d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qpk.m177458b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hpk hpkVar) {
        this.f153562k = hpkVar;
    }

    /* JADX INFO: renamed from: f */
    public void m173239f() {
        bnl0.m105525M0(this.f153558g, false);
    }

    /* JADX INFO: renamed from: i */
    public boolean m173240i() {
        return bnl0.m105529O0(this.f153561j);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m173237d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m173241l(List<ChatGroup> list) {
        this.f153563l.m159302I(list);
    }

    /* JADX INFO: renamed from: m */
    public void m173242m(List<GroupTab> list) {
        this.f153564m.m197099G(list);
        bnl0.m105524M(this.f153555d, !jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: n */
    public void m173243n(boolean z) {
        this.f153553b.setRefreshing(z);
        if (z) {
            return;
        }
        bnl0.m105525M0(this.f153558g, true);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        this.f153562k.m136561P0();
    }

    /* JADX INFO: renamed from: q */
    public void m173244q() {
        List<ChatGroup> list = this.f153563l.f137835d;
        HashMap<String, GroupApply> mapM32794B6 = CoreModule.f18264c.f20387g0.m32794B6();
        for (final String str : mapM32794B6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) jyb.m147529r(list, new qcj() { // from class: l.opk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ChatGroup) obj).f56859id.equals(str));
                }
            });
            if (NullChecker.m82486a(chatGroup)) {
                GroupApply groupApply = mapM32794B6.get(str);
                if (!TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                    chatGroup.groupApply.status = groupApply.status;
                    this.f153563l.notifyItemChanged(list.indexOf(chatGroup));
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m173245r() {
        m173247u();
        this.f153564m = new upk(this.f153565n, this.f153562k);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f153565n);
        linearLayoutManager.setOrientation(0);
        this.f153555d.setLayoutManager(linearLayoutManager);
        this.f153555d.addItemDecoration(new C19415b());
        this.f153555d.setAdapter(this.f153564m);
        this.f153563l = new mok(this.f153565n, this.f153562k);
        this.f153558g.addItemDecoration(new C19414a());
        this.f153558g.setAdapter(this.f153563l);
        this.f153553b.setOnRefreshListener(this);
        ((AbstractC0618v) this.f153558g.getItemAnimator()).setSupportsChangeAnimations(false);
        bnl0.m105509E0(this.f153559h, new View.OnClickListener() { // from class: l.mpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137925a.m173235j(view);
            }
        });
        this.f153553b.setColorSchemeResources(g9c0.f102803U, g9c0.f102800R, g9c0.f102801S, g9c0.f102802T);
        bnl0.m105556g0(this.f153552a);
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            boolean zM172596q0 = pkb.m172596q0();
            VText vText = this.f153557f;
            if (zM172596q0) {
                vText.setText("输入关键词/群号进行搜索");
            } else {
                vText.setText(this.f153565n.string(R$string.f21451A0));
            }
        }
        bnl0.m105509E0(this.f153556e, new View.OnClickListener() { // from class: l.npk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143106a.m173236k(view);
            }
        });
        if (CoreModule.m30933P().m143412i().mo180560x2()) {
            this.f153552a.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m173246s(NotificationCounter notificationCounter) {
        String str;
        int i = notificationCounter.unread;
        VText vText = this.f153561j;
        if (i <= 0) {
            bnl0.m105524M(vText, false);
            this.f153560i.setSelected(false);
            return;
        }
        bnl0.m105524M(vText, true);
        VText vText2 = this.f153561j;
        if (notificationCounter.unread > 99) {
            str = "99+";
        } else {
            str = notificationCounter.unread + "";
        }
        vText2.setText(str);
        this.f153560i.setSelected(true);
    }

    /* JADX INFO: renamed from: u */
    public final void m173247u() {
        if (act() == null) {
            this.f153552a.setBackgroundColor(Color.parseColor("#FFFFFF"));
        } else {
            this.f153552a.setBackground(act().getAppTheme().mo134822b());
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
