package p149l;

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
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupTab;
import com.p046p1.mobile.putong.core.data.NotificationCounter;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p046p1.mobile.putong.core.newui.group.SwipeRefreshList;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class zmk implements s7m<rmk>, SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f203731a;

    /* JADX INFO: renamed from: b */
    public SwipeRefreshList f203732b;

    /* JADX INFO: renamed from: c */
    public VLinear f203733c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f203734d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f203735e;

    /* JADX INFO: renamed from: f */
    public VText f203736f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f203737g;

    /* JADX INFO: renamed from: h */
    public VRelative f203738h;

    /* JADX INFO: renamed from: i */
    public VImage f203739i;

    /* JADX INFO: renamed from: j */
    public VText f203740j;

    /* JADX INFO: renamed from: k */
    public rmk f203741k;

    /* JADX INFO: renamed from: l */
    public wlk f203742l;

    /* JADX INFO: renamed from: m */
    public enk f203743m;

    /* JADX INFO: renamed from: n */
    public Act f203744n;

    /* JADX INFO: renamed from: l.zmk$a */
    public static class C21732a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = t100.m186890d(8.0f);
            } else {
                rect.top = t100.m186890d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.zmk$b */
    public static class C21733b extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.m186890d(12.0f);
            } else {
                rect.left = t100.m186890d(6.0f);
            }
        }
    }

    public zmk(Act act) {
        this.f203744n = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m219353j(View view) {
        this.f203741k.m180017z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m219354k(View view) {
        Act act = this.f203744n;
        act.startActivity(GroupSearchAct.m36572X1(act));
        o6j0.m162859c("e_group_search", this.f203741k.pageId(), new o6j0.C18854a[0]);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203744n;
    }

    /* JADX INFO: renamed from: d */
    public View m219355d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ank.m97756b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rmk rmkVar) {
        this.f203741k = rmkVar;
    }

    /* JADX INFO: renamed from: f */
    public void m219357f() {
        xdl0.m208345M0(this.f203737g, false);
    }

    /* JADX INFO: renamed from: i */
    public boolean m219358i() {
        return xdl0.m208349O0(this.f203740j);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219355d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m219359l(List<ChatGroup> list) {
        this.f203742l.m203818I(list);
    }

    /* JADX INFO: renamed from: m */
    public void m219360m(List<GroupTab> list) {
        this.f203743m.m117282G(list);
        xdl0.m208344M(this.f203734d, !vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: n */
    public void m219361n(boolean z) {
        this.f203732b.setRefreshing(z);
        if (z) {
            return;
        }
        xdl0.m208345M0(this.f203737g, true);
    }

    /* JADX INFO: renamed from: p */
    public void m219362p() {
        List<ChatGroup> list = this.f203742l.f186956d;
        HashMap<String, GroupApply> mapM31791B6 = CoreModule.f17545c.f19645g0.m31791B6();
        for (final String str : mapM31791B6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) vwb.m200346r(list, new w9j() { // from class: l.ymk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ChatGroup) obj).f56011id.equals(str));
                }
            });
            if (NullChecker.m81303a(chatGroup)) {
                GroupApply groupApply = mapM31791B6.get(str);
                if (!TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                    chatGroup.groupApply.status = groupApply.status;
                    this.f203742l.notifyItemChanged(list.indexOf(chatGroup));
                }
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        this.f203741k.m180013P0();
    }

    /* JADX INFO: renamed from: r */
    public void m219363r() {
        m219365u();
        this.f203743m = new enk(this.f203744n, this.f203741k);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f203744n);
        linearLayoutManager.setOrientation(0);
        this.f203734d.setLayoutManager(linearLayoutManager);
        this.f203734d.addItemDecoration(new C21733b());
        this.f203734d.setAdapter(this.f203743m);
        this.f203742l = new wlk(this.f203744n, this.f203741k);
        this.f203737g.addItemDecoration(new C21732a());
        this.f203737g.setAdapter(this.f203742l);
        this.f203732b.setOnRefreshListener(this);
        ((AbstractC0616v) this.f203737g.getItemAnimator()).setSupportsChangeAnimations(false);
        xdl0.m208329E0(this.f203738h, new View.OnClickListener() { // from class: l.wmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187078a.m219353j(view);
            }
        });
        this.f203732b.setColorSchemeResources(a1c0.f67139U, a1c0.f67136R, a1c0.f67137S, a1c0.f67138T);
        xdl0.m208376g0(this.f203731a);
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            boolean zM102165q0 = bjb.m102165q0();
            VText vText = this.f203736f;
            if (zM102165q0) {
                vText.setText("输入关键词/群号进行搜索");
            } else {
                vText.setText(this.f203744n.string(R$string.f20709A0));
            }
        }
        xdl0.m208329E0(this.f203735e, new View.OnClickListener() { // from class: l.xmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193564a.m219354k(view);
            }
        });
        if (CoreModule.m29935P().m94658i().mo158468x2()) {
            this.f203731a.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m219364s(NotificationCounter notificationCounter) {
        String str;
        int i = notificationCounter.unread;
        VText vText = this.f203740j;
        if (i <= 0) {
            xdl0.m208344M(vText, false);
            this.f203739i.setSelected(false);
            return;
        }
        xdl0.m208344M(vText, true);
        VText vText2 = this.f203740j;
        if (notificationCounter.unread > 99) {
            str = "99+";
        } else {
            str = notificationCounter.unread + "";
        }
        vText2.setText(str);
        this.f203739i.setSelected(true);
    }

    /* JADX INFO: renamed from: u */
    public final void m219365u() {
        if (act() == null) {
            this.f203731a.setBackgroundColor(Color.parseColor("#FFFFFF"));
        } else {
            this.f203731a.setBackground(act().getAppTheme().mo105492b());
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
