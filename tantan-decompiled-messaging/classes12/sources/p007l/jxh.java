package p007l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.KanKanStatus;
import com.p000p1.mobile.putong.data.KanPostData;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.osi0;
import l.vwb;
import l.xh0;
import l.zvf0;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jxh extends AbstractC2399j7 {
    public jxh(e3i e3iVar) {
        super(e3iVar);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m11374j(Throwable th) {
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: b */
    public void mo11132b(FeedStateCardView feedStateCardView) {
        feedStateCardView.m6643S();
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: c */
    public void mo11133c(VNavigationBar vNavigationBar) {
        vNavigationBar.setTitle(FeedModule.f313a.getString(R$string.f502d2));
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: d */
    public void mo11134d(LinearLayout linearLayout) {
        linearLayout.addView(m11376l());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView] */
    /* JADX INFO: renamed from: l */
    public final View m11376l() {
        final ?? feedMineStatusBottomOperationView = new FeedMineStatusBottomOperationView(this.f9242a.m9603a());
        feedMineStatusBottomOperationView.f4358c.setOnClickListener(new View.OnClickListener() { // from class: l.dxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7082a.m11380p(view);
            }
        });
        feedMineStatusBottomOperationView.f4356a.setText(m11378n(this.f9242a.m9606d(0)));
        this.f9242a.m9603a().duringCreated(FeedModule.f317e.f8795H).subscribe(mkd0.G(new e30() { // from class: l.exh
            public final void call(Object obj) {
                this.f7496a.m11382r(feedMineStatusBottomOperationView, (KanPostData) obj);
            }
        }));
        return feedMineStatusBottomOperationView;
    }

    /* JADX INFO: renamed from: m */
    public final void m11377m() {
        BubbleInfo bubbleInfoM9606d = this.f9242a.m9606d(0);
        FeedModule.f316d.m16592Z6(bubbleInfoM9606d.f191id, bubbleInfoM9606d.owner.f264id).subscribe(mkd0.H(new e30() { // from class: l.hxh
            public final void call(Object obj) {
                this.f8837a.m11383s((Envelope) obj);
            }
        }, new e30() { // from class: l.ixh
            public final void call(Object obj) {
                jxh.m11374j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final String m11378n(BubbleInfo bubbleInfo) {
        return a5i.m8415o(bubbleInfo.createdTime + 8.64E7d) + "后自动结束";
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m11379o(View view) {
        m11377m();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11380p(View view) {
        if (NullChecker.a(FeedModule.f317e.f8795H) && NullChecker.a(FeedModule.f317e.f8795H.e()) && TEnum.equals(((KanPostData) FeedModule.f317e.f8795H.e()).status, KanKanStatus.start)) {
            osi0.g("状态发布中...");
            return;
        }
        Act actM9603a = this.f9242a.m9603a();
        zvf0.u("e_my_state_over", "p_my_state", new j760[]{vwb.Y("state_id", this.f9242a.m9606d(0).f191id)});
        xh0.a aVar = new xh0.a(actM9603a);
        aVar.s(FeedModule.f313a.getString(R$string.f495c2)).j("确认要结束这条状态？").o(new View.OnClickListener() { // from class: l.fxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8270a.m11379o(view2);
            }
        }).r("确定").e(R$string.f478a);
        aVar.a().g();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11381q(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView) {
        if (TEnum.equals(((KanPostData) FeedModule.f317e.f8795H.e()).status, KanKanStatus.start)) {
            feedMineStatusBottomOperationView.f4356a.setVisibility(8);
            feedMineStatusBottomOperationView.f4357b.setVisibility(0);
        } else {
            feedMineStatusBottomOperationView.f4356a.setVisibility(0);
            feedMineStatusBottomOperationView.f4357b.setVisibility(8);
            feedMineStatusBottomOperationView.f4356a.setText(m11378n(this.f9242a.m9606d(0)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m11382r(final FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, KanPostData kanPostData) {
        this.f9242a.m9603a().post(new Runnable() { // from class: l.gxh
            @Override // java.lang.Runnable
            public final void run() {
                this.f8535a.m11381q(feedMineStatusBottomOperationView);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m11383s(Envelope envelope) {
        if (nkg.m12248k0()) {
            FeedModule.f316d.f15016z0.onNext(Boolean.TRUE);
        }
        this.f9242a.m9603a().finish();
        FeedModule.f316d.m16681lc(null);
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: a */
    public void mo11131a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, FeedVDraweeView feedVDraweeView) {
    }
}
