package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.d5m;
import p149l.dol;
import p149l.e30;
import p149l.e51;
import p149l.g53;
import p149l.j760;
import p149l.mah0;
import p149l.qib0;
import p149l.t100;
import p149l.tgc0;
import p149l.vwb;
import p149l.w0c0;
import p149l.xdl0;
import p149l.xgc0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class RecentBookMoviesDramas extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardBottomBaseInfoView f23990a;

    /* JADX INFO: renamed from: b */
    public VLinear f23991b;

    /* JADX INFO: renamed from: c */
    public CardUserContentView f23992c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f23993d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f23994e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f23995f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f23996g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f23997h;

    /* JADX INFO: renamed from: i */
    public TextView f23998i;

    /* JADX INFO: renamed from: j */
    public TextView f23999j;

    /* JADX INFO: renamed from: k */
    public TextView f24000k;

    /* JADX INFO: renamed from: l */
    public View f24001l;

    /* JADX INFO: renamed from: m */
    public d5m f24002m;

    /* JADX INFO: renamed from: n */
    public String f24003n;

    /* JADX INFO: renamed from: o */
    public String f24004o;

    /* JADX INFO: renamed from: p */
    public String f24005p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas$a */
    public class C8063a implements e30<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24006a;

        public C8063a(String str) {
            this.f24006a = str;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (bool.booleanValue()) {
                CoreModule.f17545c.f19663m0.f19399b2.add(this.f24006a);
                CoreModule.f17545c.f19663m0.f19346I2.onNext(j760.m140076a(SwipeDirection.RIGHT, null));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas$b */
    public class RunnableC8064b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dol f24008a;

        public RunnableC8064b(dol dolVar) {
            this.f24008a = dolVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (NullChecker.m81303a(this.f24008a) && NullChecker.m81303a(this.f24008a.getUser()) && CoreModule.f17545c.f19639e0.f149383h2.get().booleanValue() && !mah0.m153729s0().m153789z0()) {
                    CoreModule.f17545c.f19639e0.f149383h2.put(Boolean.FALSE);
                    String str = String.format("聊聊你们都感兴趣的作品，%s会优先看到你", TEnum.equals(this.f24008a.getUser().gender, "female") ? "她" : "他");
                    RecentBookMoviesDramas recentBookMoviesDramas = RecentBookMoviesDramas.this;
                    recentBookMoviesDramas.m39198g(recentBookMoviesDramas.f24000k.getContext(), str, "desc_click_bubble_tip");
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    public RecentBookMoviesDramas(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m39194c(View view) {
        tgc0.m188804a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m39195d(List list, String str, View view) {
        C4348d.m20896l().m20900k("desc_click_bubble_tip");
        g53.C17002d c17002d = new g53.C17002d("card", "both_like");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LiteraturesComments literaturesComments = (LiteraturesComments) it.next();
            if (NullChecker.m81303a(literaturesComments) && NullChecker.m81303a(literaturesComments.localLiteratures) && !TextUtils.isEmpty(literaturesComments.localLiteratures.title)) {
                arrayList.add("你们都对《" + literaturesComments.localLiteratures.title + "》感兴趣");
            }
        }
        new g53().m124460F((Act) getContext(), str, "p_suggest_users_home_view", false, list, arrayList, c17002d, new C8063a(str));
        zvf0.m220399u("e_card_artwork_info", "p_suggest_users_home_view", vwb.m200311Y("artwork_title", this.f24003n), vwb.m200311Y("artwork_type", this.f24004o), vwb.m200311Y("receiver_user_id", this.f24005p));
    }

    /* JADX INFO: renamed from: e */
    public void m39196e(dol dolVar) {
        zvf0.m220368A("e_card_artwork_info", "p_suggest_users_home_view", vwb.m200311Y("artwork_title", this.f24003n), vwb.m200311Y("artwork_type", this.f24004o), vwb.m200311Y("receiver_user_id", this.f24005p));
        xdl0.m208384k0(this.f24002m.getCardView());
        if (NullChecker.m81303a(this.f24000k.getContext())) {
            e51.m114743H(this.f24000k.getContext(), new RunnableC8064b(dolVar), 1L);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m39197f(Gender gender, final String str, final List<LiteraturesComments> list, d5m d5mVar) {
        this.f24002m = d5mVar;
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<LiteraturesComments> it = list.iterator();
        while (it.hasNext()) {
            Literatures literatures = it.next().localLiteratures;
            if (literatures == null || TextUtils.isEmpty(literatures.title)) {
                return;
            }
        }
        this.f24005p = str;
        this.f23994e.setVisibility(0);
        LiteraturesComments literaturesComments = list.get(0);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8264r(t100.m186890d(8.0f), t100.m186890d(8.0f), t100.m186890d(8.0f), t100.m186890d(8.0f));
        if (NullChecker.m81303a(literaturesComments.localLiteratures) && !TextUtils.isEmpty(literaturesComments.localLiteratures.category) && TextUtils.equals(xgc0.m208624b(literaturesComments.localLiteratures), "book")) {
            roundingParams.m8264r(t100.m186890d(1.5f), t100.m186890d(5.0f), t100.m186890d(5.0f), t100.m186890d(1.5f));
        }
        this.f23997h.getHierarchy().m112053H(roundingParams);
        int size = list.size();
        TextView textView = this.f23998i;
        if (size == 1) {
            textView.setText("你们都感兴趣的作品：");
            if (NullChecker.m81303a(literaturesComments) && NullChecker.m81303a(literaturesComments.localLiteratures)) {
                Literatures literatures2 = literaturesComments.localLiteratures;
                String str2 = literatures2.title;
                String str3 = literatures2.headUrl;
                this.f23999j.setText("《" + str2 + "》");
                qib0.f154691G.m102331L0(this.f23997h, str3);
                this.f24003n = str2;
                this.f24004o = xgc0.m208624b(literaturesComments.localLiteratures);
            }
            this.f23995f.setVisibility(8);
            this.f23996g.setVisibility(8);
        } else {
            textView.setText(String.format("%d部共同感兴趣的作品：", Integer.valueOf(list.size())));
            StringBuilder sb = new StringBuilder();
            if (NullChecker.m81303a(literaturesComments.localLiteratures)) {
                qib0.f154691G.m102331L0(this.f23997h, literaturesComments.localLiteratures.headUrl);
            }
            for (LiteraturesComments literaturesComments2 : list) {
                if (NullChecker.m81303a(literaturesComments2) && NullChecker.m81303a(literaturesComments2.localLiteratures)) {
                    String str4 = literaturesComments2.localLiteratures.title;
                    if (sb.length() == 0) {
                        this.f24003n = str4;
                        this.f24004o = xgc0.m208624b(literaturesComments.localLiteratures);
                    }
                    if (sb.length() > 0) {
                        sb.append("、");
                    }
                    sb.append("《");
                    sb.append(str4);
                    sb.append("》");
                }
            }
            this.f23999j.setText(sb.toString());
            this.f23995f.setVisibility(0);
            this.f23996g.setVisibility(0);
        }
        xdl0.m208344M(this.f24000k, true);
        this.f24000k.setText("聊一聊");
        xdl0.m208329E0(this.f24000k, new View.OnClickListener() { // from class: l.sgc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164383a.m39195d(list, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m39198g(Context context, String str, String str2) {
        C4348d.m20896l().m20909u(new C4345a(context).m20870k(CoreModule.f17544b.getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20852G(w0c0.f183788N).m20878t(true).m20850E(true).m20849D(str).m20864e(true).m20881w(t100.f167276y).m20863d(new C4345a.b() { // from class: l.rgc0
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str3) {
                C4348d.m20896l().m20900k("desc_click_bubble_tip");
            }
        }).m20875q(C4345a.f15683Q | C4345a.f15684R), this.f24000k, str2);
    }

    /* JADX INFO: renamed from: h */
    public void m39199h() {
        if (xdl0.m208349O0(this.f23994e) && xdl0.m208349O0(this.f23992c)) {
            xdl0.m208360X(this.f23993d, 0);
            xdl0.m208360X(this.f23994e, t100.f167259h);
        } else {
            xdl0.m208360X(this.f23993d, t100.m186890d(1.5f));
            xdl0.m208360X(this.f23994e, t100.f167261j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39194c(this);
        this.f24001l = this;
        setLayerType(1, null);
        if (IntlCountryCodeController.m28126v()) {
            this.f23992c.m39132g0();
        }
    }

    public RecentBookMoviesDramas(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecentBookMoviesDramas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
