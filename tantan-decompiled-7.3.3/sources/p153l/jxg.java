package p153l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class jxg extends AbstractC16723e7 {
    public jxg(t4i t4iVar) {
        super(t4iVar);
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: a */
    public void mo128174a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, FeedVDraweeView feedVDraweeView) {
        User userM189276f = this.f92380a.m189276f(i);
        textView.setText(userM189276f.name);
        feedVDraweeView.m66968u(userM189276f);
        feedLinearWithExtraIconsView.m66317i((Act) feedVDraweeView.getContext(), userM189276f);
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: c */
    public void mo128176c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ixg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117398a.m147342g(view);
            }
        });
        vNavigationBar.setLeftIconDrawable(this.f92380a.m189271a().getResources().getDrawable(lbc0.f130866I3));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m147342g(View view) {
        this.f92380a.m189271a().m68056e2();
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: b */
    public void mo128175b(FeedStateCardView feedStateCardView) {
    }

    @Override // p153l.i3i
    /* JADX INFO: renamed from: d */
    public void mo128177d(LinearLayout linearLayout) {
    }
}
