package p007l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import com.p1.mobile.android.app.Act;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uvg extends AbstractC2399j7 {
    public uvg(e3i e3iVar) {
        super(e3iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.t1i
    /* JADX INFO: renamed from: a */
    public void mo11131a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, FeedVDraweeView feedVDraweeView) {
        User userM9608f = this.f9242a.m9608f(i);
        textView.setText(userM9608f.name);
        feedVDraweeView.m6931u(userM9608f);
        feedLinearWithExtraIconsView.m6235i((Act) feedVDraweeView.getContext(), userM9608f);
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: c */
    public void mo11133c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13430a.m15176g(view);
            }
        });
        vNavigationBar.setLeftIconDrawable(this.f9242a.m9603a().getResources().getDrawable(f3c0.f7631I3));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m15176g(View view) {
        this.f9242a.m9603a().finish();
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: b */
    public void mo11132b(FeedStateCardView feedStateCardView) {
    }

    @Override // p007l.t1i
    /* JADX INFO: renamed from: d */
    public void mo11134d(LinearLayout linearLayout) {
    }
}
