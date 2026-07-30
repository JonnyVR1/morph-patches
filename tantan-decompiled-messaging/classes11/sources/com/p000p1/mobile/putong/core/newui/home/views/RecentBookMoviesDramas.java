package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.e51;
import l.g53;
import l.j760;
import l.mah0;
import l.qib0;
import l.t100;
import l.tgc0;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.xgc0;
import l.zvf0;
import p009l.d5m;
import p009l.dol;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RecentBookMoviesDramas extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardBottomBaseInfoView f2768a;

    /* JADX INFO: renamed from: b */
    public VLinear f2769b;

    /* JADX INFO: renamed from: c */
    public CardUserContentView f2770c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f2771d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2772e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2773f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f2774g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f2775h;

    /* JADX INFO: renamed from: i */
    public TextView f2776i;

    /* JADX INFO: renamed from: j */
    public TextView f2777j;

    /* JADX INFO: renamed from: k */
    public TextView f2778k;

    /* JADX INFO: renamed from: l */
    public View f2779l;

    /* JADX INFO: renamed from: m */
    public d5m f2780m;

    /* JADX INFO: renamed from: n */
    public String f2781n;

    /* JADX INFO: renamed from: o */
    public String f2782o;

    /* JADX INFO: renamed from: p */
    public String f2783p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas$a */
    public class C0227a implements e30<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2784a;

        public C0227a(String str) {
            this.f2784a = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (bool.booleanValue()) {
                CoreModule.c.m0.b2.add(this.f2784a);
                CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas$b */
    public class RunnableC0228b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dol f2786a;

        public RunnableC0228b(dol dolVar) {
            this.f2786a = dolVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (NullChecker.a(this.f2786a) && NullChecker.a(this.f2786a.getUser()) && ((Boolean) CoreModule.c.e0.h2.get()).booleanValue() && !mah0.s0().z0()) {
                    CoreModule.c.e0.h2.put(Boolean.FALSE);
                    String str = String.format("聊聊你们都感兴趣的作品，%s会优先看到你", TEnum.equals(this.f2786a.getUser().gender, "female") ? "她" : "他");
                    RecentBookMoviesDramas recentBookMoviesDramas = RecentBookMoviesDramas.this;
                    recentBookMoviesDramas.m3216g(recentBookMoviesDramas.f2778k.getContext(), str, "desc_click_bubble_tip");
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    public RecentBookMoviesDramas(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m3212c(View view) {
        tgc0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m3213d(List list, String str, View view) {
        d.l().k("desc_click_bubble_tip");
        g53.d dVar = new g53.d("card", "both_like");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LiteraturesComments literaturesComments = (LiteraturesComments) it.next();
            if (NullChecker.a(literaturesComments) && NullChecker.a(literaturesComments.localLiteratures) && !TextUtils.isEmpty(literaturesComments.localLiteratures.title)) {
                arrayList.add("你们都对《" + literaturesComments.localLiteratures.title + "》感兴趣");
            }
        }
        new g53().F(getContext(), str, "p_suggest_users_home_view", false, list, arrayList, dVar, new C0227a(str));
        zvf0.u("e_card_artwork_info", "p_suggest_users_home_view", new j760[]{vwb.Y("artwork_title", this.f2781n), vwb.Y("artwork_type", this.f2782o), vwb.Y("receiver_user_id", this.f2783p)});
    }

    /* JADX INFO: renamed from: e */
    public void m3214e(dol dolVar) {
        zvf0.A("e_card_artwork_info", "p_suggest_users_home_view", new j760[]{vwb.Y("artwork_title", this.f2781n), vwb.Y("artwork_type", this.f2782o), vwb.Y("receiver_user_id", this.f2783p)});
        xdl0.k0(this.f2780m.getCardView());
        if (NullChecker.a(this.f2778k.getContext())) {
            e51.H(this.f2778k.getContext(), new RunnableC0228b(dolVar), 1L);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3215f(Gender gender, final String str, final List<LiteraturesComments> list, d5m d5mVar) {
        this.f2780m = d5mVar;
        if (vwb.J(list)) {
            return;
        }
        Iterator<LiteraturesComments> it = list.iterator();
        while (it.hasNext()) {
            Literatures literatures = it.next().localLiteratures;
            if (literatures == null || TextUtils.isEmpty(literatures.title)) {
                return;
            }
        }
        this.f2783p = str;
        this.f2772e.setVisibility(0);
        LiteraturesComments literaturesComments = list.get(0);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.r(t100.d(8.0f), t100.d(8.0f), t100.d(8.0f), t100.d(8.0f));
        if (NullChecker.a(literaturesComments.localLiteratures) && !TextUtils.isEmpty(literaturesComments.localLiteratures.category) && TextUtils.equals(xgc0.b(literaturesComments.localLiteratures), "book")) {
            roundingParams.r(t100.d(1.5f), t100.d(5.0f), t100.d(5.0f), t100.d(1.5f));
        }
        this.f2775h.getHierarchy().H(roundingParams);
        int size = list.size();
        TextView textView = this.f2776i;
        if (size == 1) {
            textView.setText("你们都感兴趣的作品：");
            if (NullChecker.a(literaturesComments) && NullChecker.a(literaturesComments.localLiteratures)) {
                Literatures literatures2 = literaturesComments.localLiteratures;
                String str2 = literatures2.title;
                String str3 = literatures2.headUrl;
                this.f2777j.setText("《" + str2 + "》");
                qib0.G.L0(this.f2775h, str3);
                this.f2781n = str2;
                this.f2782o = xgc0.b(literaturesComments.localLiteratures);
            }
            this.f2773f.setVisibility(8);
            this.f2774g.setVisibility(8);
        } else {
            textView.setText(String.format("%d部共同感兴趣的作品：", Integer.valueOf(list.size())));
            StringBuilder sb = new StringBuilder();
            if (NullChecker.a(literaturesComments.localLiteratures)) {
                qib0.G.L0(this.f2775h, literaturesComments.localLiteratures.headUrl);
            }
            for (LiteraturesComments literaturesComments2 : list) {
                if (NullChecker.a(literaturesComments2) && NullChecker.a(literaturesComments2.localLiteratures)) {
                    String str4 = literaturesComments2.localLiteratures.title;
                    if (sb.length() == 0) {
                        this.f2781n = str4;
                        this.f2782o = xgc0.b(literaturesComments.localLiteratures);
                    }
                    if (sb.length() > 0) {
                        sb.append("、");
                    }
                    sb.append("《");
                    sb.append(str4);
                    sb.append("》");
                }
            }
            this.f2777j.setText(sb.toString());
            this.f2773f.setVisibility(0);
            this.f2774g.setVisibility(0);
        }
        xdl0.M(this.f2778k, true);
        this.f2778k.setText("聊一聊");
        xdl0.E0(this.f2778k, new View.OnClickListener() { // from class: l.sgc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20239a.m3213d(list, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m3216g(Context context, String str, String str2) {
        d.l().u(new a(context).k(new int[]{CoreModule.b.getResources().getColor(w0c0.I)}).J(13.0f).G(w0c0.N).t(true).E(true).D(str).e(true).w(t100.y).d(new a.b() { // from class: l.rgc0
            /* JADX INFO: renamed from: a */
            public final void m21657a(String str3) {
                d.l().k("desc_click_bubble_tip");
            }
        }).q(a.Q | a.R), this.f2778k, str2);
    }

    /* JADX INFO: renamed from: h */
    public void m3217h() {
        if (xdl0.O0(this.f2772e) && xdl0.O0(this.f2770c)) {
            xdl0.X(this.f2771d, 0);
            xdl0.X(this.f2772e, t100.h);
        } else {
            xdl0.X(this.f2771d, t100.d(1.5f));
            xdl0.X(this.f2772e, t100.j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3212c(this);
        this.f2779l = this;
        setLayerType(1, null);
        if (IntlCountryCodeController.v()) {
            this.f2770c.m3147g0();
        }
    }

    public RecentBookMoviesDramas(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecentBookMoviesDramas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
