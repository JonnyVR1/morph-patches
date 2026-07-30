package p007l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.data.Interactive;
import com.p000p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.t100;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y8h extends c3h<Interactive> {

    /* JADX INFO: renamed from: f */
    public e30<View> f15298f;

    /* JADX INFO: renamed from: g */
    public v8h f15299g;

    public y8h(v8h v8hVar) {
        super(v8hVar.m15347c());
        this.f15299g = v8hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void m16972j(View view, Interactive interactive, int i, int i2) {
        View childAt = ((ViewGroup) view).getChildAt(0);
        FeedInteractiveItemView feedInteractiveItemView = (FeedInteractiveItemView) childAt;
        if (this.f15299g.m15346b().booleanValue()) {
            feedInteractiveItemView.f1588a.setBackgroundResource(f3c0.f7706T);
            feedInteractiveItemView.f1590c.setTextColor(childAt.getResources().getColor(e1c0.f7164u));
        } else {
            feedInteractiveItemView.f1588a.setBackgroundResource(f3c0.f7896r4);
            feedInteractiveItemView.f1590c.setTextColor(childAt.getResources().getColor(e1c0.f7152m));
        }
        feedInteractiveItemView.f1590c.setTypeface(Typeface.defaultFromStyle(0));
        feedInteractiveItemView.m3033u(interactive);
        if (NullChecker.a(this.f15298f)) {
            this.f15298f.call(feedInteractiveItemView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public void m16970C(List<Interactive> list) {
        this.f6517c = list;
    }

    /* JADX INFO: renamed from: D */
    public void m16971D(e30<View> e30Var) {
        this.f15298f = e30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView] */
    /* JADX INFO: renamed from: m */
    public View m16973m(ViewGroup viewGroup, int i) {
        ?? feedInteractiveItemView = new FeedInteractiveItemView(this.f15299g.m15345a());
        VFrame vFrame = new VFrame(this.f15299g.m15345a());
        vFrame.addView(feedInteractiveItemView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.f15299g.m15352h() ? 0 : t100.d(4.0f), 0, this.f15299g.m15348d());
        if (this.f15299g.m15352h()) {
            xdl0.h0(feedInteractiveItemView.f1588a, 0);
        }
        feedInteractiveItemView.setLayoutParams(layoutParams);
        return vFrame;
    }
}
