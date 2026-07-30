package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.apc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.epc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.oql;
import p153l.pf60;
import p153l.qa00;
import p153l.t7m;
import p153l.uih0;
import p153l.uqb0;
import p153l.w53;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class RecentBookMoviesDramas extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardBottomBaseInfoView f24732a;

    /* JADX INFO: renamed from: b */
    public VLinear f24733b;

    /* JADX INFO: renamed from: c */
    public CardUserContentView f24734c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f24735d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f24736e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f24737f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f24738g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f24739h;

    /* JADX INFO: renamed from: i */
    public TextView f24740i;

    /* JADX INFO: renamed from: j */
    public TextView f24741j;

    /* JADX INFO: renamed from: k */
    public TextView f24742k;

    /* JADX INFO: renamed from: l */
    public View f24743l;

    /* JADX INFO: renamed from: m */
    public t7m f24744m;

    /* JADX INFO: renamed from: n */
    public String f24745n;

    /* JADX INFO: renamed from: o */
    public String f24746o;

    /* JADX INFO: renamed from: p */
    public String f24747p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas$a */
    public class C8214a implements y20<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24748a;

        public C8214a(String str) {
            this.f24748a = str;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (bool.booleanValue()) {
                CoreModule.f18264c.f20405m0.f20141b2.add(this.f24748a);
                CoreModule.f18264c.f20405m0.f20088I2.onNext(pf60.m172085a(SwipeDirection.RIGHT, null));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas$b */
    public class RunnableC8215b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oql f24750a;

        public RunnableC8215b(oql oqlVar) {
            this.f24750a = oqlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (NullChecker.m82486a(this.f24750a) && NullChecker.m82486a(this.f24750a.getUser()) && CoreModule.f18264c.f20381e0.f89240h2.get().booleanValue() && !uih0.m196223s0().m196283z0()) {
                    CoreModule.f18264c.f20381e0.f89240h2.put(Boolean.FALSE);
                    String str = String.format("聊聊你们都感兴趣的作品，%s会优先看到你", TEnum.equals(this.f24750a.getUser().gender, "female") ? "她" : "他");
                    RecentBookMoviesDramas recentBookMoviesDramas = RecentBookMoviesDramas.this;
                    recentBookMoviesDramas.m40201g(recentBookMoviesDramas.f24742k.getContext(), str, "desc_click_bubble_tip");
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    public RecentBookMoviesDramas(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m40197c(View view) {
        apc0.m99301a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m40198d(List list, String str, View view) {
        C4499d.m21895l().m21899k("desc_click_bubble_tip");
        w53.C21023d c21023d = new w53.C21023d("card", "both_like");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LiteraturesComments literaturesComments = (LiteraturesComments) it.next();
            if (NullChecker.m82486a(literaturesComments) && NullChecker.m82486a(literaturesComments.localLiteratures) && !TextUtils.isEmpty(literaturesComments.localLiteratures.title)) {
                arrayList.add("你们都对《" + literaturesComments.localLiteratures.title + "》感兴趣");
            }
        }
        new w53().m204943F((Act) getContext(), str, "p_suggest_users_home_view", false, list, arrayList, c21023d, new C8214a(str));
        i4g0.m138523u("e_card_artwork_info", "p_suggest_users_home_view", jyb.m147494Y("artwork_title", this.f24745n), jyb.m147494Y("artwork_type", this.f24746o), jyb.m147494Y("receiver_user_id", this.f24747p));
    }

    /* JADX INFO: renamed from: e */
    public void m40199e(oql oqlVar) {
        i4g0.m138492A("e_card_artwork_info", "p_suggest_users_home_view", jyb.m147494Y("artwork_title", this.f24745n), jyb.m147494Y("artwork_type", this.f24746o), jyb.m147494Y("receiver_user_id", this.f24747p));
        bnl0.m105564k0(this.f24744m.getCardView());
        if (NullChecker.m82486a(this.f24742k.getContext())) {
            l51.m152888H(this.f24742k.getContext(), new RunnableC8215b(oqlVar), 1L);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m40200f(Gender gender, final String str, final List<LiteraturesComments> list, t7m t7mVar) {
        this.f24744m = t7mVar;
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<LiteraturesComments> it = list.iterator();
        while (it.hasNext()) {
            Literatures literatures = it.next().localLiteratures;
            if (literatures == null || TextUtils.isEmpty(literatures.title)) {
                return;
            }
        }
        this.f24747p = str;
        this.f24736e.setVisibility(0);
        LiteraturesComments literaturesComments = list.get(0);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8318r(qa00.m175859d(8.0f), qa00.m175859d(8.0f), qa00.m175859d(8.0f), qa00.m175859d(8.0f));
        if (NullChecker.m82486a(literaturesComments.localLiteratures) && !TextUtils.isEmpty(literaturesComments.localLiteratures.category) && TextUtils.equals(epc0.m121847b(literaturesComments.localLiteratures), "book")) {
            roundingParams.m8318r(qa00.m175859d(1.5f), qa00.m175859d(5.0f), qa00.m175859d(5.0f), qa00.m175859d(1.5f));
        }
        this.f24739h.getHierarchy().m207045H(roundingParams);
        int size = list.size();
        TextView textView = this.f24740i;
        if (size == 1) {
            textView.setText("你们都感兴趣的作品：");
            if (NullChecker.m82486a(literaturesComments) && NullChecker.m82486a(literaturesComments.localLiteratures)) {
                Literatures literatures2 = literaturesComments.localLiteratures;
                String str2 = literatures2.title;
                String str3 = literatures2.headUrl;
                this.f24741j.setText("《" + str2 + "》");
                uqb0.f180374G.m127115L0(this.f24739h, str3);
                this.f24745n = str2;
                this.f24746o = epc0.m121847b(literaturesComments.localLiteratures);
            }
            this.f24737f.setVisibility(8);
            this.f24738g.setVisibility(8);
        } else {
            textView.setText(String.format("%d部共同感兴趣的作品：", Integer.valueOf(list.size())));
            StringBuilder sb = new StringBuilder();
            if (NullChecker.m82486a(literaturesComments.localLiteratures)) {
                uqb0.f180374G.m127115L0(this.f24739h, literaturesComments.localLiteratures.headUrl);
            }
            for (LiteraturesComments literaturesComments2 : list) {
                if (NullChecker.m82486a(literaturesComments2) && NullChecker.m82486a(literaturesComments2.localLiteratures)) {
                    String str4 = literaturesComments2.localLiteratures.title;
                    if (sb.length() == 0) {
                        this.f24745n = str4;
                        this.f24746o = epc0.m121847b(literaturesComments.localLiteratures);
                    }
                    if (sb.length() > 0) {
                        sb.append("、");
                    }
                    sb.append("《");
                    sb.append(str4);
                    sb.append("》");
                }
            }
            this.f24741j.setText(sb.toString());
            this.f24737f.setVisibility(0);
            this.f24738g.setVisibility(0);
        }
        bnl0.m105524M(this.f24742k, true);
        this.f24742k.setText("聊一聊");
        bnl0.m105509E0(this.f24742k, new View.OnClickListener() { // from class: l.zoc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205310a.m40198d(list, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m40201g(Context context, String str, String str2) {
        C4499d.m21895l().m21908u(new C4496a(context).m21869k(CoreModule.f18263b.getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21851G(c9c0.f80357N).m21877t(true).m21849E(true).m21848D(str).m21863e(true).m21880w(qa00.f156338y).m21862d(new C4496a.b() { // from class: l.yoc0
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str3) {
                C4499d.m21895l().m21899k("desc_click_bubble_tip");
            }
        }).m21874q(C4496a.f16402Q | C4496a.f16403R), this.f24742k, str2);
    }

    /* JADX INFO: renamed from: h */
    public void m40202h() {
        if (bnl0.m105529O0(this.f24736e) && bnl0.m105529O0(this.f24734c)) {
            bnl0.m105540X(this.f24735d, 0);
            bnl0.m105540X(this.f24736e, qa00.f156321h);
        } else {
            bnl0.m105540X(this.f24735d, qa00.m175859d(1.5f));
            bnl0.m105540X(this.f24736e, qa00.f156323j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40197c(this);
        this.f24743l = this;
        setLayerType(1, null);
        if (IntlCountryCodeController.m29125v()) {
            this.f24734c.m40135g0();
        }
    }

    public RecentBookMoviesDramas(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecentBookMoviesDramas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
