package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.data.Interactive;
import com.p051p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class nah extends r4h<Interactive> {

    /* JADX INFO: renamed from: f */
    public y20<View> f141012f;

    /* JADX INFO: renamed from: g */
    public kah f141013g;

    public nah(kah kahVar) {
        super(kahVar.m148974c());
        this.f141013g = kahVar;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, Interactive interactive, int i, int i2) {
        View childAt = ((ViewGroup) view).getChildAt(0);
        FeedInteractiveItemView feedInteractiveItemView = (FeedInteractiveItemView) childAt;
        if (this.f141013g.m148973b().booleanValue()) {
            feedInteractiveItemView.f40975a.setBackgroundResource(lbc0.f130941T);
            feedInteractiveItemView.f40977c.setTextColor(childAt.getResources().getColor(k9c0.f124531u));
        } else {
            feedInteractiveItemView.f40975a.setBackgroundResource(lbc0.f131131r4);
            feedInteractiveItemView.f40977c.setTextColor(childAt.getResources().getColor(k9c0.f124519m));
        }
        feedInteractiveItemView.f40977c.setTypeface(Typeface.defaultFromStyle(0));
        feedInteractiveItemView.m63235u(interactive);
        if (NullChecker.m82486a(this.f141012f)) {
            this.f141012f.call(feedInteractiveItemView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public void m162092C(List<Interactive> list) {
        this.f161204c = list;
    }

    /* JADX INFO: renamed from: D */
    public void m162093D(y20<View> y20Var) {
        this.f141012f = y20Var;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        FeedInteractiveItemView feedInteractiveItemView = new FeedInteractiveItemView(this.f141013g.m148972a());
        VFrame vFrame = new VFrame(this.f141013g.m148972a());
        vFrame.addView(feedInteractiveItemView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.f141013g.m148979h() ? 0 : qa00.m175859d(4.0f), 0, this.f141013g.m148975d());
        if (this.f141013g.m148979h()) {
            bnl0.m105558h0(feedInteractiveItemView.f40975a, 0);
        }
        feedInteractiveItemView.setLayoutParams(layoutParams);
        return vFrame;
    }
}
