package p009l;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p000p1.mobile.putong.core.newui.group.SwipeRefreshList;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupTab;
import com.p1.mobile.putong.core.data.NotificationCounter;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.a1c0;
import l.ank;
import l.bjb;
import l.o6j0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zmk implements s7m<rmk>, SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f23735a;

    /* JADX INFO: renamed from: b */
    public SwipeRefreshList f23736b;

    /* JADX INFO: renamed from: c */
    public VLinear f23737c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f23738d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f23739e;

    /* JADX INFO: renamed from: f */
    public VText f23740f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f23741g;

    /* JADX INFO: renamed from: h */
    public VRelative f23742h;

    /* JADX INFO: renamed from: i */
    public VImage f23743i;

    /* JADX INFO: renamed from: j */
    public VText f23744j;

    /* JADX INFO: renamed from: k */
    public rmk f23745k;

    /* JADX INFO: renamed from: l */
    public wlk f23746l;

    /* JADX INFO: renamed from: m */
    public enk f23747m;

    /* JADX INFO: renamed from: n */
    public Act f23748n;

    /* JADX INFO: renamed from: l.zmk$a */
    public static class C1369a extends RecyclerView.n {
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = t100.d(8.0f);
            } else {
                rect.top = t100.d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.zmk$b */
    public static class C1370b extends RecyclerView.n {
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.d(12.0f);
            } else {
                rect.left = t100.d(6.0f);
            }
        }
    }

    public zmk(Act act) {
        this.f23748n = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m25855j(View view) {
        this.f23745k.m21736z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m25856k(View view) {
        Act act = this.f23748n;
        act.startActivity(GroupSearchAct.m511X1(act));
        o6j0.c("e_group_search", this.f23745k.pageId(), new o6j0.a[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25857C0() {
        return this.f23748n;
    }

    /* JADX INFO: renamed from: d */
    public View m25858d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ank.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m25862i1(rmk rmkVar) {
        this.f23745k = rmkVar;
    }

    /* JADX INFO: renamed from: f */
    public void m25860f() {
        xdl0.M0(this.f23741g, false);
    }

    /* JADX INFO: renamed from: i */
    public boolean m25861i() {
        return xdl0.O0(this.f23744j);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25858d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m25863l(List<ChatGroup> list) {
        this.f23746l.m24328I(list);
    }

    /* JADX INFO: renamed from: m */
    public void m25864m(List<GroupTab> list) {
        this.f23747m.m14007G(list);
        xdl0.M(this.f23738d, !vwb.J(list));
    }

    /* JADX INFO: renamed from: n */
    public void m25865n(boolean z) {
        this.f23736b.setRefreshing(z);
        if (z) {
            return;
        }
        xdl0.M0(this.f23741g, true);
    }

    /* JADX INFO: renamed from: p */
    public void m25866p() {
        List<ChatGroup> list = this.f23746l.f22188d;
        HashMap mapB6 = CoreModule.c.g0.B6();
        for (final String str : mapB6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) vwb.r(list, new w9j() { // from class: l.ymk
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((ChatGroup) obj)).id.equals(str));
                }
            });
            if (NullChecker.a(chatGroup)) {
                GroupApply groupApply = (GroupApply) mapB6.get(str);
                if (!TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                    chatGroup.groupApply.status = groupApply.status;
                    this.f23746l.notifyItemChanged(list.indexOf(chatGroup));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m25867q() {
        this.f23745k.m21731P0();
    }

    /* JADX INFO: renamed from: r */
    public void m25868r() {
        m25870u();
        this.f23747m = new enk(this.f23748n, this.f23745k);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f23748n);
        linearLayoutManager.setOrientation(0);
        this.f23738d.setLayoutManager(linearLayoutManager);
        this.f23738d.addItemDecoration(new C1370b());
        this.f23738d.setAdapter(this.f23747m);
        this.f23746l = new wlk(this.f23748n, this.f23745k);
        this.f23741g.addItemDecoration(new C1369a());
        this.f23741g.setAdapter(this.f23746l);
        this.f23736b.setOnRefreshListener(this);
        this.f23741g.getItemAnimator().setSupportsChangeAnimations(false);
        xdl0.E0(this.f23742h, new View.OnClickListener() { // from class: l.wmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22195a.m25855j(view);
            }
        });
        this.f23736b.setColorSchemeResources(new int[]{a1c0.U, a1c0.R, a1c0.S, a1c0.T});
        xdl0.g0(new View[]{this.f23735a});
        if (CoreModule.P().i().E()) {
            boolean zQ0 = bjb.q0();
            VText vText = this.f23740f;
            if (zQ0) {
                vText.setText("输入关键词/群号进行搜索");
            } else {
                vText.setText(this.f23748n.string(R.string.A0));
            }
        }
        xdl0.E0(this.f23739e, new View.OnClickListener() { // from class: l.xmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22648a.m25856k(view);
            }
        });
        if (CoreModule.P().i().x2()) {
            this.f23735a.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m25869s(NotificationCounter notificationCounter) {
        String str;
        int i = notificationCounter.unread;
        VText vText = this.f23744j;
        if (i <= 0) {
            xdl0.M(vText, false);
            this.f23743i.setSelected(false);
            return;
        }
        xdl0.M(vText, true);
        VText vText2 = this.f23744j;
        if (notificationCounter.unread > 99) {
            str = "99+";
        } else {
            str = notificationCounter.unread + "";
        }
        vText2.setText(str);
        this.f23743i.setSelected(true);
    }

    /* JADX INFO: renamed from: u */
    public final void m25870u() {
        if (act() == null) {
            this.f23735a.setBackgroundColor(Color.parseColor("#FFFFFF"));
        } else {
            this.f23735a.setBackground(act().getAppTheme().b());
        }
    }

    public void destroy() {
    }
}
