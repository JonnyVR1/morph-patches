package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class swr extends d3q<FrameLayout> {
    private VDraweeView avatar;
    private final pwr.C19458a data;
    private TextView descView;
    private VDraweeView sideIcon;
    private TextView titleView;

    public swr(pwr.C19458a c19458a) {
        this.data = c19458a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(FrameLayout frameLayout) {
        super.mo71749u(frameLayout);
        this.titleView = (TextView) frameLayout.findViewById(jdc0.f120175Z0);
        this.avatar = (VDraweeView) frameLayout.findViewById(jdc0.f120203j);
        this.descView = (TextView) frameLayout.findViewById(jdc0.f120132E);
        this.sideIcon = (VDraweeView) frameLayout.findViewById(jdc0.f120141I0);
        this.descView.setText(this.data.m174078a());
        this.titleView.setText(this.data.m174083f());
        izs.m142868s("context_square", this.avatar, this.data.m174081d());
        boolean zIsEmpty = TextUtils.isEmpty(this.data.m174082e());
        VDraweeView vDraweeView = this.sideIcon;
        if (zIsEmpty) {
            bnl0.m105525M0(vDraweeView, false);
        } else {
            bnl0.m105525M0(vDraweeView, true);
            izs.m142868s("context_square", this.sideIcon, this.data.m174082e());
        }
        LiveCardTracker.trackMv(this.data.m174084g());
        if (this.avatar.getHierarchy().m207055p() != null) {
            boolean zM174085h = this.data.m174085h();
            VDraweeView vDraweeView2 = this.avatar;
            if (zM174085h) {
                vDraweeView2.getHierarchy().m207055p().m8316p(Color.parseColor("#ff8231"));
                this.avatar.getHierarchy().m207055p().m8321u(qa00.m175859d(7.0f));
            } else {
                vDraweeView2.getHierarchy().m207055p().m8316p(0);
                this.avatar.getHierarchy().m207055p().m8321u(qa00.m175859d(3.0f));
            }
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183735c;
    }
}
