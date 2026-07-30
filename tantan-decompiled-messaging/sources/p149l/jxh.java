package p149l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.KanPostData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import com.tantanapp.common.utils.NullChecker;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class jxh extends AbstractC17708j7 {
    public jxh(e3i e3iVar) {
        super(e3iVar);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m143798j(Throwable th) {
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: b */
    public void mo141119b(FeedStateCardView feedStateCardView) {
        feedStateCardView.m65516S();
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: c */
    public void mo141120c(VNavigationBar vNavigationBar) {
        vNavigationBar.setTitle(FeedModule.f38852a.getString(R$string.f39041d2));
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: d */
    public void mo141121d(LinearLayout linearLayout) {
        linearLayout.addView(m143800l());
    }

    /* JADX INFO: renamed from: l */
    public final View m143800l() {
        final FeedMineStatusBottomOperationView feedMineStatusBottomOperationView = new FeedMineStatusBottomOperationView(this.f116550a.m114591a());
        feedMineStatusBottomOperationView.f42897c.setOnClickListener(new View.OnClickListener() { // from class: l.dxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88287a.m143804p(view);
            }
        });
        feedMineStatusBottomOperationView.f42895a.setText(m143802n(this.f116550a.m114594d(0)));
        this.f116550a.m114591a().duringCreated(FeedModule.f38856e.f109186H).subscribe(mkd0.m154955G(new e30() { // from class: l.exh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93672a.m143806r(feedMineStatusBottomOperationView, (KanPostData) obj);
            }
        }));
        return feedMineStatusBottomOperationView;
    }

    /* JADX INFO: renamed from: m */
    public final void m143801m() {
        BubbleInfo bubbleInfoM114594d = this.f116550a.m114594d(0);
        FeedModule.f38855d.m209411Z6(bubbleInfoM114594d.f38730id, bubbleInfoM114594d.owner.f38803id).subscribe(mkd0.m154956H(new e30() { // from class: l.hxh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109870a.m143807s((Envelope) obj);
            }
        }, new e30() { // from class: l.ixh
            @Override // p149l.e30
            public final void call(Object obj) {
                jxh.m143798j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final String m143802n(BubbleInfo bubbleInfo) {
        return a5i.m95039o(bubbleInfo.createdTime + 8.64E7d) + "后自动结束";
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m143803o(View view) {
        m143801m();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m143804p(View view) {
        if (NullChecker.m81303a(FeedModule.f38856e.f109186H) && NullChecker.m81303a(FeedModule.f38856e.f109186H.m221515e()) && TEnum.equals(FeedModule.f38856e.f109186H.m221515e().status, "start")) {
            osi0.m165783g("状态发布中...");
            return;
        }
        Act actM114591a = this.f116550a.m114591a();
        zvf0.m220399u("e_my_state_over", "p_my_state", vwb.m200311Y("state_id", this.f116550a.m114594d(0).f38730id));
        xh0.C21150a c21150a = new xh0.C21150a(actM114591a);
        c21150a.m208740s(FeedModule.f38852a.getString(R$string.f39034c2)).m208731j("确认要结束这条状态？").m208736o(new View.OnClickListener() { // from class: l.fxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f99763a.m143803o(view2);
            }
        }).m208739r("确定").m208726e(R$string.f39017a);
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m143805q(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView) {
        if (TEnum.equals(FeedModule.f38856e.f109186H.m221515e().status, "start")) {
            feedMineStatusBottomOperationView.f42895a.setVisibility(8);
            feedMineStatusBottomOperationView.f42896b.setVisibility(0);
        } else {
            feedMineStatusBottomOperationView.f42895a.setVisibility(0);
            feedMineStatusBottomOperationView.f42896b.setVisibility(8);
            feedMineStatusBottomOperationView.f42895a.setText(m143802n(this.f116550a.m114594d(0)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m143806r(final FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, KanPostData kanPostData) {
        this.f116550a.m114591a().post(new Runnable() { // from class: l.gxh
            @Override // java.lang.Runnable
            public final void run() {
                this.f104896a.m143805q(feedMineStatusBottomOperationView);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m143807s(Envelope envelope) {
        if (nkg.m159889k0()) {
            FeedModule.f38855d.f193081z0.m132487l(Boolean.TRUE);
        }
        this.f116550a.m114591a().m66873d2();
        FeedModule.f38855d.m209500lc(null);
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: a */
    public void mo141118a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, FeedVDraweeView feedVDraweeView) {
    }
}
