package p149l;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class uvg extends AbstractC17708j7 {
    public uvg(e3i e3iVar) {
        super(e3iVar);
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: a */
    public void mo141118a(int i, TextView textView, FeedLinearWithExtraIconsView feedLinearWithExtraIconsView, FeedVDraweeView feedVDraweeView) {
        User userM114596f = this.f116550a.m114596f(i);
        textView.setText(userM114596f.name);
        feedVDraweeView.m65785u(userM114596f);
        feedLinearWithExtraIconsView.m65134i((Act) feedVDraweeView.getContext(), userM114596f);
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: c */
    public void mo141120c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172285a.m196079g(view);
            }
        });
        vNavigationBar.setLeftIconDrawable(this.f116550a.m114591a().getResources().getDrawable(f3c0.f94348I3));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m196079g(View view) {
        this.f116550a.m114591a().m66873d2();
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: b */
    public void mo141119b(FeedStateCardView feedStateCardView) {
    }

    @Override // p149l.t1i
    /* JADX INFO: renamed from: d */
    public void mo141121d(LinearLayout linearLayout) {
    }
}
