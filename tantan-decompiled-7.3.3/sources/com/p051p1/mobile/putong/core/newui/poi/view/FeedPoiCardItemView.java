package com.p051p1.mobile.putong.core.newui.poi.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame_Shadow;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.ji80;
import p153l.jyb;
import p153l.pf60;
import p153l.qa00;
import p153l.sfj0;
import p153l.vph;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemView extends VFrame_Shadow {

    /* JADX INFO: renamed from: A */
    public FeedPoiTraceFrag f27151A;

    /* JADX INFO: renamed from: B */
    public ji80 f27152B;

    /* JADX INFO: renamed from: h */
    public FeedPoiCardItemView f27153h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f27154i;

    /* JADX INFO: renamed from: j */
    public FeedPoiCardScrollView f27155j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f27156k;

    /* JADX INFO: renamed from: l */
    public FeedPoiCardItemUserHeadView f27157l;

    /* JADX INFO: renamed from: m */
    public FeedPoiCardItemMomentInfoView f27158m;

    /* JADX INFO: renamed from: n */
    public FeedPoiCardItemAboutMeView f27159n;

    /* JADX INFO: renamed from: o */
    public FeedPoiCardItemMyTagsView f27160o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f27161p;

    /* JADX INFO: renamed from: q */
    public VFrame_Shadow f27162q;

    /* JADX INFO: renamed from: r */
    public FeedPoiCardOperationButton f27163r;

    /* JADX INFO: renamed from: s */
    public VFrame_Shadow f27164s;

    /* JADX INFO: renamed from: t */
    public FeedPoiCardOperationButton f27165t;

    /* JADX INFO: renamed from: u */
    public VFrame_Shadow f27166u;

    /* JADX INFO: renamed from: v */
    public FeedPoiCardOperationButton f27167v;

    /* JADX INFO: renamed from: w */
    public VFrame_Shadow f27168w;

    /* JADX INFO: renamed from: x */
    public FeedPoiCardOperationButton f27169x;

    /* JADX INFO: renamed from: y */
    public FeedPoiCardSendGreetView f27170y;

    /* JADX INFO: renamed from: z */
    public FeedPoiCardSmartScrollBar f27171z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView$a */
    public class C8366a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f27172a;

        public C8366a(int i) {
            this.f27172a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f27172a);
        }
    }

    public FeedPoiCardItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m44189k(ji80 ji80Var, FeedPoiTraceFrag feedPoiTraceFrag, View view) {
        sfj0.m185596c("e_send_message", "p_poi_nearby_card", sfj0.C20032a.m185615h("is_reply", "0"), sfj0.C20032a.m185615h("moment_id", NullChecker.m82486a(ji80Var.f121051c) ? ji80Var.f121051c.f56856id : ""), sfj0.C20032a.m185615h("is_input", "0"), sfj0.C20032a.m185615h("is_match", "0"), sfj0.C20032a.m185615h("owner_id", ji80Var.f121050b.f56859id), sfj0.C20032a.m185615h("state_id", ""));
        C8523d.a aVar = new C8523d.a(ji80Var.f121050b.f56859id, "p_poi_nearby_card");
        aVar.m47101o("p_home,greet");
        C8523d.m47075a(feedPoiTraceFrag.act(), aVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m44191m(View view) {
        vph.m202236a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m44192n(User user) {
        if (user == null) {
            return;
        }
        i4g0.m138492A("e_moment_card", "p_poi_nearby_card", jyb.m147494Y("moments_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: o */
    public void m44193o(CoreMomentInfo coreMomentInfo) {
        if (coreMomentInfo == null) {
            return;
        }
        i4g0.m138492A("e_moment", "p_poi_nearby_card", pf60.m172085a("moment_id", coreMomentInfo.f56856id), pf60.m172085a("owner_id", coreMomentInfo.owner), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(coreMomentInfo.f56856id)), pf60.m172085a("moment_distance", Long.valueOf(m44194p(coreMomentInfo))), pf60.m172085a("moment_create_time", Long.valueOf((long) coreMomentInfo.createdTime)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44191m(this);
        this.f27171z.m44203b(this.f27155j);
        m44196r(this.f27154i, qa00.f156328o);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public final long m44194p(CoreMomentInfo coreMomentInfo) {
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
    public void m44195q(final FeedPoiTraceFrag feedPoiTraceFrag, final ji80 ji80Var) {
        ji80 ji80Var2 = this.f27152B;
        if (ji80Var2 == null || !TextUtils.equals(ji80Var2.f121050b.f56859id, ji80Var.f121050b.f56859id)) {
            this.f27155j.scrollTo(0, 0);
            this.f27151A = feedPoiTraceFrag;
            this.f27152B = ji80Var;
            this.f27157l.m44182g(ji80Var);
            this.f27158m.m44164b(ji80Var);
            this.f27159n.m44161h(ji80Var);
            this.f27160o.m44175k(feedPoiTraceFrag, ji80Var);
            bnl0.m105509E0(this.f27170y, new View.OnClickListener() { // from class: l.qph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedPoiCardItemView.m44189k(ji80Var, feedPoiTraceFrag, view);
                }
            });
            this.f27163r.m44198s(dbc0.f86993fk, dbc0.f87091ik);
            bnl0.m105509E0(this.f27163r, new View.OnClickListener() { // from class: l.rph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m44134N4();
                }
            });
            this.f27165t.m44198s(dbc0.f86993fk, dbc0.f86862bk);
            bnl0.m105509E0(this.f27165t, new View.OnClickListener() { // from class: l.sph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m44135O4().m127186i().m44149r(SwipeDirection.LEFT, true);
                }
            });
            this.f27167v.m44198s(dbc0.f86993fk, dbc0.f86960ek);
            bnl0.m105509E0(this.f27167v, new View.OnClickListener() { // from class: l.tph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m44135O4().m127186i().m44149r(SwipeDirection.RIGHT, true);
                }
            });
            this.f27169x.m44198s(dbc0.f86993fk, dbc0.f87059hk);
            bnl0.m105509E0(this.f27169x, new View.OnClickListener() { // from class: l.uph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feedPoiTraceFrag.m44135O4().m127186i().m44149r(SwipeDirection.UP, true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m44196r(View view, int i) {
        view.setOutlineProvider(new C8366a(i));
        view.setClipToOutline(true);
    }

    public FeedPoiCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
