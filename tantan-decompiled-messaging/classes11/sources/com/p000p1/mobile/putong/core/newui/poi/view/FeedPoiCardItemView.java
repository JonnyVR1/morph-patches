package com.p000p1.mobile.putong.core.newui.poi.view;

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
import com.p000p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p000p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.goh;
import l.j760;
import l.o6j0;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.da80;
import v.VFrame_Shadow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardItemView extends VFrame_Shadow {

    /* JADX INFO: renamed from: A */
    public FeedPoiTraceFrag f5187A;

    /* JADX INFO: renamed from: B */
    public da80 f5188B;

    /* JADX INFO: renamed from: h */
    public FeedPoiCardItemView f5189h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5190i;

    /* JADX INFO: renamed from: j */
    public FeedPoiCardScrollView f5191j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f5192k;

    /* JADX INFO: renamed from: l */
    public FeedPoiCardItemUserHeadView f5193l;

    /* JADX INFO: renamed from: m */
    public FeedPoiCardItemMomentInfoView f5194m;

    /* JADX INFO: renamed from: n */
    public FeedPoiCardItemAboutMeView f5195n;

    /* JADX INFO: renamed from: o */
    public FeedPoiCardItemMyTagsView f5196o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f5197p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f5198q;

    /* JADX INFO: renamed from: r */
    public FeedPoiCardOperationButton f5199r;

    /* JADX INFO: renamed from: s */
    public VFrame_Shadow f5200s;

    /* JADX INFO: renamed from: t */
    public FeedPoiCardOperationButton f5201t;

    /* JADX INFO: renamed from: u */
    public VFrame_Shadow f5202u;

    /* JADX INFO: renamed from: v */
    public FeedPoiCardOperationButton f5203v;

    /* JADX INFO: renamed from: w */
    public VFrame_Shadow f5204w;

    /* JADX INFO: renamed from: x */
    public FeedPoiCardOperationButton f5205x;

    /* JADX INFO: renamed from: y */
    public FeedPoiCardSendGreetView f5206y;

    /* JADX INFO: renamed from: z */
    public FeedPoiCardSmartScrollBar f5207z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView$a */
    public class C0379a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5208a;

        public C0379a(int i) {
            this.f5208a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f5208a);
        }
    }

    public FeedPoiCardItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m7393k(da80 da80Var, FeedPoiTraceFrag feedPoiTraceFrag, View view) {
        o6j0.c("e_send_message", "p_poi_nearby_card", new o6j0.a[]{o6j0.a.h("is_reply", "0"), o6j0.a.h("moment_id", NullChecker.a(da80Var.f11696c) ? ((CopyObject) da80Var.f11696c).id : ""), o6j0.a.h("is_input", "0"), o6j0.a.h("is_match", "0"), o6j0.a.h("owner_id", ((DbObject) da80Var.f11695b).id), o6j0.a.h("state_id", "")});
        d.a aVar = new d.a(((DbObject) da80Var.f11695b).id, "p_poi_nearby_card");
        aVar.o("p_home,greet");
        d.a(feedPoiTraceFrag.act(), aVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m7395m(View view) {
        goh.a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m7396n(User user) {
        if (user == null) {
            return;
        }
        zvf0.A("e_moment_card", "p_poi_nearby_card", new j760[]{vwb.Y("moments_user_id", ((DbObject) user).id)});
    }

    /* JADX INFO: renamed from: o */
    public void m7397o(CoreMomentInfo coreMomentInfo) {
        if (coreMomentInfo == null) {
            return;
        }
        zvf0.A("e_moment", "p_poi_nearby_card", new j760[]{j760.a("moment_id", ((CopyObject) coreMomentInfo).id), j760.a("owner_id", coreMomentInfo.owner), j760.a("moment_type", CoreModule.N().Ur(((CopyObject) coreMomentInfo).id)), j760.a("moment_distance", Long.valueOf(m7398p(coreMomentInfo))), j760.a("moment_create_time", Long.valueOf((long) coreMomentInfo.createdTime))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7395m(this);
        this.f5207z.m7408b(this.f5191j);
        m7400r(this.f5190i, t100.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public final long m7398p(CoreMomentInfo coreMomentInfo) {
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
    public void m7399q(final FeedPoiTraceFrag feedPoiTraceFrag, final da80 da80Var) {
        da80 da80Var2 = this.f5188B;
        if (da80Var2 == null || !TextUtils.equals(((DbObject) da80Var2.f11695b).id, ((DbObject) da80Var.f11695b).id)) {
            this.f5191j.scrollTo(0, 0);
            this.f5187A = feedPoiTraceFrag;
            this.f5188B = da80Var;
            this.f5193l.m7386g(da80Var);
            this.f5194m.m7368b(da80Var);
            this.f5195n.m7365h(da80Var);
            this.f5196o.m7379k(feedPoiTraceFrag, da80Var);
            xdl0.E0(this.f5206y, new View.OnClickListener() { // from class: l.boh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedPoiCardItemView.m7393k(da80Var, feedPoiTraceFrag, view);
                }
            });
            this.f5199r.m7402s(x2c0.rj, x2c0.uj);
            xdl0.E0(this.f5199r, new View.OnClickListener() { // from class: l.coh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m7335N4();
                }
            });
            this.f5201t.m7402s(x2c0.rj, x2c0.nj);
            xdl0.E0(this.f5201t, new View.OnClickListener() { // from class: l.doh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m7336O4().m21166i().m7353r(SwipeDirection.LEFT, true);
                }
            });
            this.f5203v.m7402s(x2c0.rj, x2c0.qj);
            xdl0.E0(this.f5203v, new View.OnClickListener() { // from class: l.eoh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m7336O4().m21166i().m7353r(SwipeDirection.RIGHT, true);
                }
            });
            this.f5205x.m7402s(x2c0.rj, x2c0.tj);
            xdl0.E0(this.f5205x, new View.OnClickListener() { // from class: l.foh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m7336O4().m21166i().m7353r(SwipeDirection.UP, true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7400r(View view, int i) {
        view.setOutlineProvider(new C0379a(i));
        view.setClipToOutline(true);
    }

    public FeedPoiCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
