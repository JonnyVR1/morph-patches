package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class rur extends d1q<FrameLayout> {
    private VDraweeView avatar;
    private final our.C19046a data;
    private TextView descView;
    private VDraweeView sideIcon;
    private TextView titleView;

    public rur(our.C19046a c19046a) {
        this.data = c19046a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(FrameLayout frameLayout) {
        super.mo70566u(frameLayout);
        this.titleView = (TextView) frameLayout.findViewById(d5c0.f84457Z0);
        this.avatar = (VDraweeView) frameLayout.findViewById(d5c0.f84485j);
        this.descView = (TextView) frameLayout.findViewById(d5c0.f84414E);
        this.sideIcon = (VDraweeView) frameLayout.findViewById(d5c0.f84423I0);
        this.descView.setText(this.data.m166119a());
        this.titleView.setText(this.data.m166124f());
        hxs.m133406s("context_square", this.avatar, this.data.m166122d());
        boolean zIsEmpty = TextUtils.isEmpty(this.data.m166123e());
        VDraweeView vDraweeView = this.sideIcon;
        if (zIsEmpty) {
            xdl0.m208345M0(vDraweeView, false);
        } else {
            xdl0.m208345M0(vDraweeView, true);
            hxs.m133406s("context_square", this.sideIcon, this.data.m166123e());
        }
        LiveCardTracker.trackMv(this.data.m166125g());
        if (this.avatar.getHierarchy().m112069p() != null) {
            boolean zM166126h = this.data.m166126h();
            VDraweeView vDraweeView2 = this.avatar;
            if (zM166126h) {
                vDraweeView2.getHierarchy().m112069p().m8262p(Color.parseColor("#ff8231"));
                this.avatar.getHierarchy().m112069p().m8267u(t100.m186890d(7.0f));
            } else {
                vDraweeView2.getHierarchy().m112069p().m8262p(0);
                this.avatar.getHierarchy().m112069p().m8267u(t100.m186890d(3.0f));
            }
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152878c;
    }
}
