package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.data.Interactive;
import com.p046p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class y8h extends c3h<Interactive> {

    /* JADX INFO: renamed from: f */
    public e30<View> f196829f;

    /* JADX INFO: renamed from: g */
    public v8h f196830g;

    public y8h(v8h v8hVar) {
        super(v8hVar.m197445c());
        this.f196830g = v8hVar;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, Interactive interactive, int i, int i2) {
        View childAt = ((ViewGroup) view).getChildAt(0);
        FeedInteractiveItemView feedInteractiveItemView = (FeedInteractiveItemView) childAt;
        if (this.f196830g.m197444b().booleanValue()) {
            feedInteractiveItemView.f40127a.setBackgroundResource(f3c0.f94423T);
            feedInteractiveItemView.f40129c.setTextColor(childAt.getResources().getColor(e1c0.f88808u));
        } else {
            feedInteractiveItemView.f40127a.setBackgroundResource(f3c0.f94613r4);
            feedInteractiveItemView.f40129c.setTextColor(childAt.getResources().getColor(e1c0.f88796m));
        }
        feedInteractiveItemView.f40129c.setTypeface(Typeface.defaultFromStyle(0));
        feedInteractiveItemView.m62052u(interactive);
        if (NullChecker.m81303a(this.f196829f)) {
            this.f196829f.call(feedInteractiveItemView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public void m213377C(List<Interactive> list) {
        this.f78945c = list;
    }

    /* JADX INFO: renamed from: D */
    public void m213378D(e30<View> e30Var) {
        this.f196829f = e30Var;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        FeedInteractiveItemView feedInteractiveItemView = new FeedInteractiveItemView(this.f196830g.m197443a());
        VFrame vFrame = new VFrame(this.f196830g.m197443a());
        vFrame.addView(feedInteractiveItemView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.f196830g.m197450h() ? 0 : t100.m186890d(4.0f), 0, this.f196830g.m197446d());
        if (this.f196830g.m197450h()) {
            xdl0.m208378h0(feedInteractiveItemView.f40127a, 0);
        }
        feedInteractiveItemView.setLayoutParams(layoutParams);
        return vFrame;
    }
}
