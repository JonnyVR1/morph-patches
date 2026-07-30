package p007l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.dd80;
import l.e51;
import l.mqi0;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import p007l.flh;
import v.VDraweeView;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pjh<P extends flh> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public flh f11851a;

    /* JADX INFO: renamed from: b */
    public boolean f11852b;

    /* JADX INFO: renamed from: c */
    public TextView f11853c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f11854d;

    /* JADX INFO: renamed from: e */
    public d7h f11855e;

    /* JADX INFO: renamed from: f */
    public VLinear f11856f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f11857g;

    /* JADX INFO: renamed from: h */
    public VText f11858h;

    /* JADX INFO: renamed from: i */
    public VText f11859i;

    /* JADX INFO: renamed from: j */
    public VPullDownRefreshLayout f11860j;

    /* JADX INFO: renamed from: k */
    public vu60 f11861k;

    /* JADX INFO: renamed from: l */
    public PhotoAlbumInterestedHeaderView f11862l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f11863m;

    /* JADX INFO: renamed from: n */
    public String f11864n;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13042d() {
        flg.f8134h.put(Long.valueOf(mqi0.o()));
        p6j0.m12912b("e_all_read_remind_popup", "p_activity", p6j0.C2456a.m12921f("all_read_remind_popup_option", 0));
    }

    /* JADX INFO: renamed from: A */
    public void m13045A() {
        a aVarJ = new a(act()).D("点击全部已读，批量清除未读消息").k(new int[]{act().getResources().getColor(e1c0.f7154n)}).J(13.0f);
        int i = t100.i;
        this.f11864n = d.l().t(aVarJ.z(i).E(true).b(5000L).q(a.N | a.P).o(a.P, i).x(t100.c), this.f11853c);
        p6j0.m12914d("e_all_read_bubble", "p_activity", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: B */
    public void m13046B() {
        new dd80.a(act()).y0("提示").t0("你有过多历史互动消息未读，你可以点击全部已读一键清除，长时间未处理系统可能会自动清除").c0("全部已读", new Runnable() { // from class: l.njh
            @Override // java.lang.Runnable
            public final void run() {
                this.f10816a.m13056q();
            }
        }).X("暂时忽略", new Runnable() { // from class: l.ojh
            @Override // java.lang.Runnable
            public final void run() {
                pjh.m13042d();
            }
        }).r0();
        p6j0.m12914d("e_all_read_remind_popup", "p_activity", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: C */
    public void m13047C(int i) {
        xh0.a aVarH = new xh0.a(act()).h(false);
        StringBuilder sb = new StringBuilder("有");
        sb.append(i > 99 ? "99+" : Integer.valueOf(i));
        sb.append("个人通过动态对你感兴趣，要不要看看他们都是谁？");
        aVarH.j(sb.toString()).r("去看看").o(new View.OnClickListener() { // from class: l.ljh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10054a.m13057s(view);
            }
        }).f("全部已读").c(new View.OnClickListener() { // from class: l.mjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10479a.m13058u(view);
            }
        }).a().g();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo9044C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m13048E() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f11860j;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(true);
    }

    /* JADX INFO: renamed from: F */
    public void m13049F(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f11860j;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(z);
    }

    /* JADX INFO: renamed from: G */
    public void m13050G(boolean z) {
        VRecyclerView vRecyclerView = this.f11854d;
        if (vRecyclerView != null && z) {
            vRecyclerView.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m13051H(boolean z) {
        if (NullChecker.a(this.f11863m)) {
            xdl0.M(this.f11863m, z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m13052I(boolean z) {
        xdl0.M0(this.f11854d, z);
        xdl0.M0(this.f11856f, !z);
    }

    /* JADX INFO: renamed from: i */
    public void m13053i() {
        this.f11860j.l();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo9049i1(P p) {
        this.f11851a = p;
    }

    /* JADX INFO: renamed from: m */
    public void m13054m() {
        if (NullChecker.a(this.f11864n)) {
            d.l().k(this.f11864n);
            this.f11864n = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo9204n() {
        if (NullChecker.a(this.f11855e)) {
            this.f11855e.D();
        }
        if (NullChecker.a(this.f11862l) && xdl0.O0(this.f11862l)) {
            xdl0.M(this.f11862l, false);
        }
        this.f11861k.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m13055p() {
        this.f11854d.scrollTo(0, 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m13056q() {
        flh flhVar = this.f11851a;
        if (flhVar instanceof klh) {
            ((klh) flhVar).m11498b2().m14235V();
        } else {
            flhVar.m10189R1();
        }
        flg.m10119a();
        p6j0.m12912b("e_all_read_remind_popup", "p_activity", p6j0.C2456a.m12921f("all_read_remind_popup_option", 1));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13057s(View view) {
        act().startActivityForResult(new Intent((Context) act(), (Class<?>) FeedModule.m1140H().Jn()), PhotoAlbumActivitiesAct.f3704i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13058u(View view) {
        flh flhVar = this.f11851a;
        if (flhVar instanceof klh) {
            ((klh) flhVar).m11498b2().m14235V();
        } else {
            flhVar.m10189R1();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m13059v() {
        this.f11851a.m10187O1();
    }

    /* JADX INFO: renamed from: w */
    public void m13060w(boolean z) {
        if (z && NullChecker.a(this.f11854d)) {
            e51.F(act(), new Runnable() { // from class: l.kjh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9728a.m13055p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public void m13061x(List<MomentActivity> list) {
        if (this.f11854d == null) {
            return;
        }
        if (!vwb.J(list)) {
            this.f11852b = false;
            xdl0.M(this.f11856f, false);
            this.f11860j.setVisibility(0);
            this.f11861k.m15583G(list);
            return;
        }
        xdl0.M(this.f11856f, true);
        xdl0.M(this.f11860j, false);
        qib0.G.Y0(this.f11857g, f3c0.f7797f1);
        if (nkg.m12225W() && PhotoAlbumActivitiesAct.f3705j.equals(this.f11851a.f8141a)) {
            this.f11858h.setText("还没有收到点赞，快去发布动态");
        } else {
            this.f11858h.setText("你没有收到任何消息");
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo9206y(List<User> list, int i) {
        if (NullChecker.a(this.f11862l)) {
            this.f11862l.m6098W(list, i);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo13062z(List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        for (MomentActivity momentActivity : this.f11851a.f8143c) {
            final String str = momentActivity.actors;
            if (vwb.r(list, new w9j() { // from class: l.jjh
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(str));
                }
            }) != null && !TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) && !TEnum.equals(momentActivity.action, "comment")) {
                momentActivity.read = true;
            }
        }
        this.f11861k.m15583G(this.f11851a.f8143c);
    }

    public void destroy() {
    }
}
