package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.umh;

/* JADX INFO: loaded from: classes13.dex */
public class elh<P extends umh> implements iam<P> {

    /* JADX INFO: renamed from: a */
    public umh f94520a;

    /* JADX INFO: renamed from: b */
    public boolean f94521b;

    /* JADX INFO: renamed from: c */
    public TextView f94522c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f94523d;

    /* JADX INFO: renamed from: e */
    public s8h f94524e;

    /* JADX INFO: renamed from: f */
    public VLinear f94525f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f94526g;

    /* JADX INFO: renamed from: h */
    public VText f94527h;

    /* JADX INFO: renamed from: i */
    public VText f94528i;

    /* JADX INFO: renamed from: j */
    public VPullDownRefreshLayout f94529j;

    /* JADX INFO: renamed from: k */
    public b370 f94530k;

    /* JADX INFO: renamed from: l */
    public PhotoAlbumInterestedHeaderView f94531l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f94532m;

    /* JADX INFO: renamed from: n */
    public String f94533n;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m121152d() {
        umg.f179629h.put(Long.valueOf(pzi0.m174454o()));
        tfj0.m190939b("e_all_read_remind_popup", "p_activity", tfj0.C20302a.m190948f("all_read_remind_popup_option", 0));
    }

    /* JADX INFO: renamed from: A */
    public void m121155A() {
        C4496a c4496aM21854J = new C4496a(getAct()).m21848D("点击全部已读，批量清除未读消息").m21869k(getAct().getResources().getColor(k9c0.f124521n)).m21854J(13.0f);
        int i = qa00.f156322i;
        this.f94533n = C4499d.m21895l().m21907t(c4496aM21854J.m21883z(i).m21849E(true).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21874q(C4496a.f16399N | C4496a.f16401P).m21872o(C4496a.f16401P, i).m21881x(qa00.f156316c), this.f94522c);
        tfj0.m190941d("e_all_read_bubble", "p_activity", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: B */
    public void m121156B() {
        new jl80.C17971a(getAct()).m146056y0("提示").m146051t0("你有过多历史互动消息未读，你可以点击全部已读一键清除，长时间未处理系统可能会自动清除").m146034c0("全部已读", new Runnable() { // from class: l.clh
            @Override // java.lang.Runnable
            public final void run() {
                this.f82383a.m121168q();
            }
        }).m146029X("暂时忽略", new Runnable() { // from class: l.dlh
            @Override // java.lang.Runnable
            public final void run() {
                elh.m121152d();
            }
        }).m146049r0();
        tfj0.m190941d("e_all_read_remind_popup", "p_activity", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: C */
    public void m121157C(int i) {
        th0.C20312a c20312aM191149h = new th0.C20312a(getAct()).m191149h(false);
        StringBuilder sb = new StringBuilder("有");
        sb.append(i > 99 ? "99+" : Integer.valueOf(i));
        sb.append("个人通过动态对你感兴趣，要不要看看他们都是谁？");
        c20312aM191149h.m191151j(sb.toString()).m191159r("去看看").m191156o(new View.OnClickListener() { // from class: l.alh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72111a.m121169s(view);
            }
        }).m191147f("全部已读").m191144c(new View.OnClickListener() { // from class: l.blh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77195a.m121170u(view);
            }
        }).m191142a().m191141g();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m121158E() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f94529j;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(true);
    }

    /* JADX INFO: renamed from: F */
    public void m121159F(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f94529j;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(z);
    }

    /* JADX INFO: renamed from: G */
    public void m121160G(boolean z) {
        VRecyclerView vRecyclerView = this.f94523d;
        if (vRecyclerView != null && z) {
            vRecyclerView.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m121161H(boolean z) {
        if (NullChecker.m82486a(this.f94532m)) {
            bnl0.m105524M(this.f94532m, z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m121162I(boolean z) {
        bnl0.m105525M0(this.f94523d, z);
        bnl0.m105525M0(this.f94525f, !z);
    }

    /* JADX INFO: renamed from: i */
    public void m121163i() {
        this.f94529j.m225013l();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f94520a = p;
    }

    /* JADX INFO: renamed from: m */
    public void m121165m() {
        if (NullChecker.m82486a(this.f94533n)) {
            C4499d.m21895l().m21899k(this.f94533n);
            this.f94533n = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo121166n() {
        if (NullChecker.m82486a(this.f94524e)) {
            this.f94524e.m222261D();
        }
        if (NullChecker.m82486a(this.f94531l) && bnl0.m105529O0(this.f94531l)) {
            bnl0.m105524M(this.f94531l, false);
        }
        this.f94530k.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m121167p() {
        this.f94523d.scrollTo(0, 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m121168q() {
        umh umhVar = this.f94520a;
        if (umhVar instanceof zmh) {
            ((zmh) umhVar).m220389b2().m136104V();
        } else {
            umhVar.m196734R1();
        }
        umg.m196664a();
        tfj0.m190939b("e_all_read_remind_popup", "p_activity", tfj0.C20302a.m190948f("all_read_remind_popup_option", 1));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m121169s(View view) {
        getAct().startActivityForResult(new Intent(getAct(), FeedModule.m61406H().mo31701Jn()), PhotoAlbumActivitiesAct.f43091i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m121170u(View view) {
        umh umhVar = this.f94520a;
        if (umhVar instanceof zmh) {
            ((zmh) umhVar).m220389b2().m136104V();
        } else {
            umhVar.m196734R1();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m121171v() {
        this.f94520a.m196732O1();
    }

    /* JADX INFO: renamed from: w */
    public void m121172w(boolean z) {
        if (z && NullChecker.m82486a(this.f94523d)) {
            l51.m152886F(getAct(), new Runnable() { // from class: l.zkh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204777a.m121167p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public void m121173x(List<MomentActivity> list) {
        if (this.f94523d == null) {
            return;
        }
        if (!jyb.m147479J(list)) {
            this.f94521b = false;
            bnl0.m105524M(this.f94525f, false);
            this.f94529j.setVisibility(0);
            this.f94530k.m102275G(list);
            return;
        }
        bnl0.m105524M(this.f94525f, true);
        bnl0.m105524M(this.f94529j, false);
        uqb0.f180374G.m127138Y0(this.f94526g, lbc0.f131032f1);
        if (cmg.m111195W() && PhotoAlbumActivitiesAct.f43092j.equals(this.f94520a.f179638a)) {
            this.f94527h.setText("还没有收到点赞，快去发布动态");
        } else {
            this.f94527h.setText("你没有收到任何消息");
        }
    }

    /* JADX INFO: renamed from: y */
    public void mo121174y(List<User> list, int i) {
        if (NullChecker.m82486a(this.f94531l)) {
            this.f94531l.m66181W(list, i);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo121175z(List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (MomentActivity momentActivity : this.f94520a.f179640c) {
            final String str = momentActivity.actors;
            if (jyb.m147529r(list, new qcj() { // from class: l.ykh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(str));
                }
            }) != null && !TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) && !TEnum.equals(momentActivity.action, "comment")) {
                momentActivity.read = true;
            }
        }
        this.f94530k.m102275G(this.f94520a.f179640c);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
