package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame_Shadow;
import p149l.da80;
import p149l.goh;
import p149l.j760;
import p149l.o6j0;
import p149l.t100;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemView extends VFrame_Shadow {

    /* JADX INFO: renamed from: A */
    public FeedPoiTraceFrag f26409A;

    /* JADX INFO: renamed from: B */
    public da80 f26410B;

    /* JADX INFO: renamed from: h */
    public FeedPoiCardItemView f26411h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f26412i;

    /* JADX INFO: renamed from: j */
    public FeedPoiCardScrollView f26413j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f26414k;

    /* JADX INFO: renamed from: l */
    public FeedPoiCardItemUserHeadView f26415l;

    /* JADX INFO: renamed from: m */
    public FeedPoiCardItemMomentInfoView f26416m;

    /* JADX INFO: renamed from: n */
    public FeedPoiCardItemAboutMeView f26417n;

    /* JADX INFO: renamed from: o */
    public FeedPoiCardItemMyTagsView f26418o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f26419p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f26420q;

    /* JADX INFO: renamed from: r */
    public FeedPoiCardOperationButton f26421r;

    /* JADX INFO: renamed from: s */
    public VFrame_Shadow f26422s;

    /* JADX INFO: renamed from: t */
    public FeedPoiCardOperationButton f26423t;

    /* JADX INFO: renamed from: u */
    public VFrame_Shadow f26424u;

    /* JADX INFO: renamed from: v */
    public FeedPoiCardOperationButton f26425v;

    /* JADX INFO: renamed from: w */
    public VFrame_Shadow f26426w;

    /* JADX INFO: renamed from: x */
    public FeedPoiCardOperationButton f26427x;

    /* JADX INFO: renamed from: y */
    public FeedPoiCardSendGreetView f26428y;

    /* JADX INFO: renamed from: z */
    public FeedPoiCardSmartScrollBar f26429z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView$a */
    public class C8215a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26430a;

        public C8215a(int i) {
            this.f26430a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f26430a);
        }
    }

    public FeedPoiCardItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m43178k(da80 da80Var, FeedPoiTraceFrag feedPoiTraceFrag, View view) {
        o6j0.m162859c("e_send_message", "p_poi_nearby_card", o6j0.C18854a.m162878h("is_reply", "0"), o6j0.C18854a.m162878h("moment_id", NullChecker.m81303a(da80Var.f85199c) ? da80Var.f85199c.f56008id : ""), o6j0.C18854a.m162878h("is_input", "0"), o6j0.C18854a.m162878h("is_match", "0"), o6j0.C18854a.m162878h("owner_id", da80Var.f85198b.f56011id), o6j0.C18854a.m162878h("state_id", ""));
        C8360d.a aVar = new C8360d.a(da80Var.f85198b.f56011id, "p_poi_nearby_card");
        aVar.m45918o("p_home,greet");
        C8360d.m45892a(feedPoiTraceFrag.act(), aVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m43180m(View view) {
        goh.m127245a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m43181n(User user) {
        if (user == null) {
            return;
        }
        zvf0.m220368A("e_moment_card", "p_poi_nearby_card", vwb.m200311Y("moments_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: o */
    public void m43182o(CoreMomentInfo coreMomentInfo) {
        if (coreMomentInfo == null) {
            return;
        }
        zvf0.m220368A("e_moment", "p_poi_nearby_card", j760.m140076a("moment_id", coreMomentInfo.f56008id), j760.m140076a("owner_id", coreMomentInfo.owner), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(coreMomentInfo.f56008id)), j760.m140076a("moment_distance", Long.valueOf(m43183p(coreMomentInfo))), j760.m140076a("moment_create_time", Long.valueOf((long) coreMomentInfo.createdTime)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43180m(this);
        this.f26429z.m43192b(this.f26413j);
        m43185r(this.f26412i, t100.f167266o);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public final long m43183p(CoreMomentInfo coreMomentInfo) {
        MessageLocation messageLocation;
        if (coreMomentInfo != null && (messageLocation = coreMomentInfo.location) != null) {
            try {
                return Long.parseLong(messageLocation.distance);
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public void m43184q(final FeedPoiTraceFrag feedPoiTraceFrag, final da80 da80Var) {
        da80 da80Var2 = this.f26410B;
        if (da80Var2 == null || !TextUtils.equals(da80Var2.f85198b.f56011id, da80Var.f85198b.f56011id)) {
            this.f26413j.scrollTo(0, 0);
            this.f26409A = feedPoiTraceFrag;
            this.f26410B = da80Var;
            this.f26415l.m43171g(da80Var);
            this.f26416m.m43153b(da80Var);
            this.f26417n.m43150h(da80Var);
            this.f26418o.m43164k(feedPoiTraceFrag, da80Var);
            xdl0.m208329E0(this.f26428y, new View.OnClickListener() { // from class: l.boh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedPoiCardItemView.m43178k(da80Var, feedPoiTraceFrag, view);
                }
            });
            this.f26421r.m43187s(x2c0.f190526rj, x2c0.f190622uj);
            xdl0.m208329E0(this.f26421r, new View.OnClickListener() { // from class: l.coh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m43123N4();
                }
            });
            this.f26423t.m43187s(x2c0.f190526rj, x2c0.f190398nj);
            xdl0.m208329E0(this.f26423t, new View.OnClickListener() { // from class: l.doh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m43124O4().m175915i().m43138r(SwipeDirection.LEFT, true);
                }
            });
            this.f26425v.m43187s(x2c0.f190526rj, x2c0.f190494qj);
            xdl0.m208329E0(this.f26425v, new View.OnClickListener() { // from class: l.eoh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m43124O4().m175915i().m43138r(SwipeDirection.RIGHT, true);
                }
            });
            this.f26427x.m43187s(x2c0.f190526rj, x2c0.f190590tj);
            xdl0.m208329E0(this.f26427x, new View.OnClickListener() { // from class: l.foh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m43124O4().m175915i().m43138r(SwipeDirection.UP, true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43185r(View view, int i) {
        view.setOutlineProvider(new C8215a(i));
        view.setClipToOutline(true);
    }

    public FeedPoiCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
