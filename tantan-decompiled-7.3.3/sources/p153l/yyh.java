package p153l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.KanPostData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.view.FeedMineStatusBottomOperationView;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import com.tantanapp.common.utils.NullChecker;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class yyh extends AbstractC16723e7 {
    public yyh(t4i t4iVar) {
        super(t4iVar);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m217975j(Throwable th) {
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: b */
    public void mo128175b(FeedStateCardView feedStateCardView) {
        feedStateCardView.m66699S();
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: c */
    public void mo128176c(VNavigationBar vNavigationBar) {
        vNavigationBar.setTitle(FeedModule.f39700a.getString(R$string.f39889d2));
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: d */
    public void mo128177d(LinearLayout linearLayout) {
        linearLayout.addView(m217977l());
    }

    /* JADX INFO: renamed from: l */
    public final View m217977l() {
        final FeedMineStatusBottomOperationView feedMineStatusBottomOperationView = new FeedMineStatusBottomOperationView(this.f92380a.m189271a());
        feedMineStatusBottomOperationView.f43745c.setOnClickListener(new View.OnClickListener() { // from class: l.syh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171254a.m217981p(view);
            }
        });
        feedMineStatusBottomOperationView.f43743a.setText(m217979n(this.f92380a.m189274d(0)));
        this.f92380a.m189271a().duringCreated(FeedModule.f39704e.f138458H).subscribe(psd0.m173596G(new y20() { // from class: l.tyh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176676a.m217983r(feedMineStatusBottomOperationView, (KanPostData) obj);
            }
        }));
        return feedMineStatusBottomOperationView;
    }

    /* JADX INFO: renamed from: m */
    public final void m217978m() {
        BubbleInfo bubbleInfoM189274d = this.f92380a.m189274d(0);
        FeedModule.f39703d.m145652Z6(bubbleInfoM189274d.f39578id, bubbleInfoM189274d.owner.f39651id).subscribe(psd0.m173597H(new y20() { // from class: l.wyh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191653a.m217984s((Envelope) obj);
            }
        }, new y20() { // from class: l.xyh
            @Override // p153l.y20
            public final void call(Object obj) {
                yyh.m217975j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final String m217979n(BubbleInfo bubbleInfo) {
        return p6i.m170906o(bubbleInfo.createdTime + 8.64E7d) + "后自动结束";
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m217980o(View view) {
        m217978m();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m217981p(View view) {
        if (NullChecker.m82486a(FeedModule.f39704e.f138458H) && NullChecker.m82486a(FeedModule.f39704e.f138458H.m222761e()) && TEnum.equals(FeedModule.f39704e.f138458H.m222761e().status, "start")) {
            r1j0.m179420g("状态发布中...");
            return;
        }
        Act actM189271a = this.f92380a.m189271a();
        i4g0.m138523u("e_my_state_over", "p_my_state", jyb.m147494Y("state_id", this.f92380a.m189274d(0).f39578id));
        th0.C20312a c20312a = new th0.C20312a(actM189271a);
        c20312a.m191160s(FeedModule.f39700a.getString(R$string.f39882c2)).m191151j("确认要结束这条状态？").m191156o(new View.OnClickListener() { // from class: l.uyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f181616a.m217980o(view2);
            }
        }).m191159r("确定").m191146e(R$string.f39865a);
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m217982q(FeedMineStatusBottomOperationView feedMineStatusBottomOperationView) {
        if (TEnum.equals(FeedModule.f39704e.f138458H.m222761e().status, "start")) {
            feedMineStatusBottomOperationView.f43743a.setVisibility(8);
            feedMineStatusBottomOperationView.f43744b.setVisibility(0);
        } else {
            feedMineStatusBottomOperationView.f43743a.setVisibility(0);
            feedMineStatusBottomOperationView.f43744b.setVisibility(8);
            feedMineStatusBottomOperationView.f43743a.setText(m217979n(this.f92380a.m189274d(0)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m217983r(final FeedMineStatusBottomOperationView feedMineStatusBottomOperationView, KanPostData kanPostData) {
        this.f92380a.m189271a().post(new Runnable() { // from class: l.vyh
            @Override // java.lang.Runnable
            public final void run() {
                this.f186375a.m217982q(feedMineStatusBottomOperationView);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m217984s(Envelope envelope) {
        if (cmg.m111218k0()) {
            FeedModule.f39703d.f121391z0.m137019l(Boolean.TRUE);
        }
        this.f92380a.m189271a().m68056e2();
        FeedModule.f39703d.m145741lc(null);
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: a */
    public void mo128174a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, FeedVDraweeView feedVDraweeView) {
    }
}
