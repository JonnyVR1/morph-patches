package p149l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.flh;

/* JADX INFO: loaded from: classes12.dex */
public class pjh<P extends flh> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public flh f149775a;

    /* JADX INFO: renamed from: b */
    public boolean f149776b;

    /* JADX INFO: renamed from: c */
    public TextView f149777c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f149778d;

    /* JADX INFO: renamed from: e */
    public d7h f149779e;

    /* JADX INFO: renamed from: f */
    public VLinear f149780f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f149781g;

    /* JADX INFO: renamed from: h */
    public VText f149782h;

    /* JADX INFO: renamed from: i */
    public VText f149783i;

    /* JADX INFO: renamed from: j */
    public VPullDownRefreshLayout f149784j;

    /* JADX INFO: renamed from: k */
    public vu60 f149785k;

    /* JADX INFO: renamed from: l */
    public PhotoAlbumInterestedHeaderView f149786l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f149787m;

    /* JADX INFO: renamed from: n */
    public String f149788n;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m169845d() {
        flg.f98167h.put(Long.valueOf(mqi0.m155944o()));
        p6j0.m167668b("e_all_read_remind_popup", "p_activity", p6j0.C19147a.m167677f("all_read_remind_popup_option", 0));
    }

    /* JADX INFO: renamed from: A */
    public void m169848A() {
        C4345a c4345aM20855J = new C4345a(getAct()).m20849D("点击全部已读，批量清除未读消息").m20870k(getAct().getResources().getColor(e1c0.f88798n)).m20855J(13.0f);
        int i = t100.f167260i;
        this.f149788n = C4348d.m20896l().m20908t(c4345aM20855J.m20884z(i).m20850E(true).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20875q(C4345a.f15680N | C4345a.f15682P).m20873o(C4345a.f15682P, i).m20882x(t100.f167254c), this.f149777c);
        p6j0.m167670d("e_all_read_bubble", "p_activity", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: B */
    public void m169849B() {
        new dd80.C16336a(getAct()).m110996y0("提示").m110991t0("你有过多历史互动消息未读，你可以点击全部已读一键清除，长时间未处理系统可能会自动清除").m110974c0("全部已读", new Runnable() { // from class: l.njh
            @Override // java.lang.Runnable
            public final void run() {
                this.f139236a.m169859q();
            }
        }).m110969X("暂时忽略", new Runnable() { // from class: l.ojh
            @Override // java.lang.Runnable
            public final void run() {
                pjh.m169845d();
            }
        }).m110989r0();
        p6j0.m167670d("e_all_read_remind_popup", "p_activity", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: C */
    public void m169850C(int i) {
        xh0.C21150a c21150aM208729h = new xh0.C21150a(getAct()).m208729h(false);
        StringBuilder sb = new StringBuilder("有");
        sb.append(i > 99 ? "99+" : Integer.valueOf(i));
        sb.append("个人通过动态对你感兴趣，要不要看看他们都是谁？");
        c21150aM208729h.m208731j(sb.toString()).m208739r("去看看").m208736o(new View.OnClickListener() { // from class: l.ljh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128329a.m169860s(view);
            }
        }).m208727f("全部已读").m208724c(new View.OnClickListener() { // from class: l.mjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134134a.m169861u(view);
            }
        }).m208722a().m208721g();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m169851E() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f149784j;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(true);
    }

    /* JADX INFO: renamed from: F */
    public void m169852F(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f149784j;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(z);
    }

    /* JADX INFO: renamed from: G */
    public void m169853G(boolean z) {
        VRecyclerView vRecyclerView = this.f149778d;
        if (vRecyclerView != null && z) {
            vRecyclerView.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m169854H(boolean z) {
        if (NullChecker.m81303a(this.f149787m)) {
            xdl0.m208344M(this.f149787m, z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m169855I(boolean z) {
        xdl0.m208345M0(this.f149778d, z);
        xdl0.m208345M0(this.f149780f, !z);
    }

    /* JADX INFO: renamed from: i */
    public void m169856i() {
        this.f149784j.m223767l();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f149775a = p;
    }

    /* JADX INFO: renamed from: m */
    public void m169857m() {
        if (NullChecker.m81303a(this.f149788n)) {
            C4348d.m20896l().m20900k(this.f149788n);
            this.f149788n = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo107467n() {
        if (NullChecker.m81303a(this.f149779e)) {
            this.f149779e.m143811D();
        }
        if (NullChecker.m81303a(this.f149786l) && xdl0.m208349O0(this.f149786l)) {
            xdl0.m208344M(this.f149786l, false);
        }
        this.f149785k.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m169858p() {
        this.f149778d.scrollTo(0, 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m169859q() {
        flh flhVar = this.f149775a;
        if (flhVar instanceof klh) {
            ((klh) flhVar).m146398b2().m184813V();
        } else {
            flhVar.m122046R1();
        }
        flg.m121976a();
        p6j0.m167668b("e_all_read_remind_popup", "p_activity", p6j0.C19147a.m167677f("all_read_remind_popup_option", 1));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m169860s(View view) {
        getAct().startActivityForResult(new Intent(getAct(), FeedModule.m60222H().mo30698Jn()), PhotoAlbumActivitiesAct.f42243i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m169861u(View view) {
        flh flhVar = this.f149775a;
        if (flhVar instanceof klh) {
            ((klh) flhVar).m146398b2().m184813V();
        } else {
            flhVar.m122046R1();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m169862v() {
        this.f149775a.m122044O1();
    }

    /* JADX INFO: renamed from: w */
    public void m169863w(boolean z) {
        if (z && NullChecker.m81303a(this.f149778d)) {
            e51.m114741F(getAct(), new Runnable() { // from class: l.kjh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123450a.m169858p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public void m169864x(List<MomentActivity> list) {
        if (this.f149778d == null) {
            return;
        }
        if (!vwb.m200296J(list)) {
            this.f149776b = false;
            xdl0.m208344M(this.f149780f, false);
            this.f149784j.setVisibility(0);
            this.f149785k.m200064G(list);
            return;
        }
        xdl0.m208344M(this.f149780f, true);
        xdl0.m208344M(this.f149784j, false);
        qib0.f154691G.m102354Y0(this.f149781g, f3c0.f94514f1);
        if (nkg.m159866W() && PhotoAlbumActivitiesAct.f42244j.equals(this.f149775a.f98174a)) {
            this.f149782h.setText("还没有收到点赞，快去发布动态");
        } else {
            this.f149782h.setText("你没有收到任何消息");
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo107468y(List<User> list, int i) {
        if (NullChecker.m81303a(this.f149786l)) {
            this.f149786l.m64998W(list, i);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo169865z(List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (MomentActivity momentActivity : this.f149775a.f98176c) {
            final String str = momentActivity.actors;
            if (vwb.m200346r(list, new w9j() { // from class: l.jjh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(str));
                }
            }) != null && !TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) && !TEnum.equals(momentActivity.action, "comment")) {
                momentActivity.read = true;
            }
        }
        this.f149785k.m200064G(this.f149775a.f98176c);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
