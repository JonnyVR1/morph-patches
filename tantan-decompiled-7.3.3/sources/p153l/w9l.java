package p153l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p051p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack;
import com.p051p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p051p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import com.p051p1.mobile.putong.core.newui.explore.view.ExploreCardOperationButton;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;

/* JADX INFO: loaded from: classes11.dex */
public class w9l implements iam<s9l> {

    /* JADX INFO: renamed from: a */
    public View f188019a;

    /* JADX INFO: renamed from: b */
    public View f188020b;

    /* JADX INFO: renamed from: c */
    public View f188021c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f188022d;

    /* JADX INFO: renamed from: e */
    public VImage f188023e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f188024f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f188025g;

    /* JADX INFO: renamed from: h */
    public TextView f188026h;

    /* JADX INFO: renamed from: i */
    public ExploreCardStack f188027i;

    /* JADX INFO: renamed from: j */
    public bpf f188028j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f188029k;

    /* JADX INFO: renamed from: l */
    public VRelative f188030l;

    /* JADX INFO: renamed from: m */
    public View f188031m;

    /* JADX INFO: renamed from: n */
    public Act f188032n;

    /* JADX INFO: renamed from: o */
    public HomeExploreFrag f188033o;

    /* JADX INFO: renamed from: p */
    public s9l f188034p;

    /* JADX INFO: renamed from: q */
    public ExploreCardOperationButton f188035q;

    /* JADX INFO: renamed from: r */
    public ExploreCardOperationButton f188036r;

    /* JADX INFO: renamed from: s */
    public VLinear f188037s;

    /* JADX INFO: renamed from: t */
    public boolean f188038t;

    /* JADX INFO: renamed from: u */
    public g6m<spf.C20128a, VSwipeStack.OnCardSwipeResult> f188039u;

    public w9l(HomeExploreFrag homeExploreFrag) {
        this.f188033o = homeExploreFrag;
        this.f188032n = homeExploreFrag.act();
    }

    /* JADX INFO: renamed from: l */
    private void m205579l() {
        this.f188023e.setOnClickListener(new View.OnClickListener() { // from class: l.t9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172648a.m205587n(view);
            }
        });
        if (NullChecker.m82486a(this.f188032n)) {
            int iM201954n1 = vnb.m201954n1(this.f188032n);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f188023e.getLayoutParams();
            layoutParams.topMargin = iM201954n1;
            this.f188023e.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f188021c.getLayoutParams();
            layoutParams2.height = bnl0.m105516I(this.f188032n);
            this.f188021c.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f188029k.getLayoutParams();
            layoutParams3.topMargin = bnl0.m105587w(115.0f) + iM201954n1;
            this.f188029k.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f188030l.getLayoutParams();
            layoutParams4.topMargin = iM201954n1 + bnl0.m105587w(115.0f);
            this.f188030l.setLayoutParams(layoutParams4);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(RemoteConfig.m80481x().m80485F("growth_explore_config")).optJSONObject(this.f188034p.f166947c);
            if (NullChecker.m82486a(jSONObjectOptJSONObject)) {
                String strOptString = jSONObjectOptJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                String strOptString2 = jSONObjectOptJSONObject.optString("icon");
                String strOptString3 = jSONObjectOptJSONObject.optString(OMSResourceType.background);
                String strOptString4 = jSONObjectOptJSONObject.optString("backgroundColor");
                String strOptString5 = jSONObjectOptJSONObject.optString("emptyColor");
                this.f188026h.setText(strOptString);
                uqb0.f180374G.m127146i0(this.f188025g, strOptString3);
                uqb0.f180374G.m127146i0(this.f188024f, strOptString2);
                m205594w(strOptString4, strOptString5);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f188032n;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f188032n;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s9l s9lVar) {
        this.f188034p = s9lVar;
    }

    /* JADX INFO: renamed from: e */
    public void m205581e(boolean z, float f) {
        if (!z) {
            this.f188036r.reset();
            this.f188035q.reset();
        } else if (f > 0.0f) {
            this.f188035q.reset();
            this.f188036r.m37394j(f);
        } else {
            this.f188036r.reset();
            this.f188035q.m37394j(-f);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m205582f() {
        this.f188032n.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i */
    public ExploreCardStack m205583i() {
        return this.f188027i;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125774c3, viewGroup, false);
        this.f188019a = viewInflate;
        this.f188022d = (FrameLayout) viewInflate.findViewById(adc0.f70131T3);
        this.f188020b = this.f188019a.findViewById(adc0.f70037Nb);
        this.f188023e = (VImage) this.f188019a.findViewById(adc0.f70281c4);
        this.f188024f = (VDraweeView) this.f188019a.findViewById(adc0.f70315e4);
        this.f188026h = (TextView) this.f188019a.findViewById(adc0.f70298d4);
        this.f188029k = (RelativeLayout) this.f188019a.findViewById(adc0.f70114S3);
        this.f188030l = (VRelative) this.f188019a.findViewById(adc0.f70182W3);
        this.f188031m = this.f188019a.findViewById(adc0.f70165V3);
        this.f188035q = (ExploreCardOperationButton) this.f188019a.findViewById(adc0.f70148U3);
        this.f188036r = (ExploreCardOperationButton) this.f188019a.findViewById(adc0.f70214Y3);
        this.f188025g = (VDraweeView) this.f188019a.findViewById(adc0.f70080Q3);
        this.f188021c = this.f188019a.findViewById(adc0.f70230Z3);
        this.f188037s = (VLinear) this.f188019a.findViewById(adc0.f70097R3);
        return this.f188019a;
    }

    /* JADX INFO: renamed from: j */
    public void m205584j() {
        bnl0.m105524M(this.f188037s, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m205585k() {
        ExploreCardStack exploreCardStack = new ExploreCardStack(getAct(), this);
        this.f188027i = exploreCardStack;
        exploreCardStack.setClipChildren(false);
        this.f188027i.setClipToPadding(false);
        this.f188022d.addView(this.f188027i, 0, new FrameLayout.LayoutParams(-1, -1));
        bpf bpfVar = new bpf(this.f188033o, this.f188027i);
        this.f188028j = bpfVar;
        this.f188027i.setAdapter(bpfVar);
    }

    /* JADX INFO: renamed from: m */
    public boolean m205586m(SwipeDirection swipeDirection) {
        return swipeDirection == SwipeDirection.RIGHT;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m205587n(View view) {
        m205582f();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m205588p(View view) {
        m205583i().m37369r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m205589q(View view) {
        m205583i().m37369r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: r */
    public void m205590r() {
        m205579l();
        m205585k();
    }

    /* JADX INFO: renamed from: s */
    public VSwipeStack.OnCardSwipeResult m205591s(View view, SwipeDirection swipeDirection, boolean z) {
        epf epfVar = view instanceof ExploreCardItemView ? ((ExploreCardItemView) view).f22163z : null;
        if (epfVar == null) {
            this.f188033o.mo37357M3(m205586m(swipeDirection), "other");
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f188039u == null) {
            this.f188039u = new spf();
        }
        g6m<spf.C20128a, VSwipeStack.OnCardSwipeResult> g6mVar = this.f188039u;
        Act act = getAct();
        User user = epfVar.f95241b;
        ExploreDialogData exploreDialogData = epfVar.f95246g;
        boolean z2 = epfVar.f95247h;
        boolean z3 = epfVar.f95248i;
        HomeExploreFrag homeExploreFrag = this.f188033o;
        return g6mVar.mo38500a(new spf.C20128a(act, user, exploreDialogData, z2, z3, homeExploreFrag.f22134C, this.f188038t, view, swipeDirection, z, homeExploreFrag));
    }

    /* JADX INFO: renamed from: u */
    public void m205592u(View view, SwipeDirection swipeDirection) {
        epf epfVar = view instanceof ExploreCardItemView ? ((ExploreCardItemView) view).f22163z : null;
        if (epfVar == null) {
            return;
        }
        this.f188034p.f166945a = new opf(epfVar, swipeDirection);
    }

    /* JADX INFO: renamed from: v */
    public void m205593v(List<epf> list) {
        bpf bpfVar = this.f188028j;
        if (bpfVar == null) {
            return;
        }
        bpfVar.m105837n(list);
        bnl0.m105524M(this.f188037s, true);
        m205595x(this.f188037s);
        this.f188035q.m37397u(dbc0.f86874c, dbc0.f86112E7);
        bnl0.m105509E0(this.f188035q, new View.OnClickListener() { // from class: l.u9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178123a.m205588p(view);
            }
        });
        this.f188036r.m37397u(dbc0.f86874c, dbc0.f86048C7);
        bnl0.m105509E0(this.f188036r, new View.OnClickListener() { // from class: l.v9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183009a.m205589q(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m205594w(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("#")) {
            str = "#".concat(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("#")) {
            str2 = "#".concat(str2);
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(bnl0.m105587w(20.0f));
            gradientDrawable.setShape(0);
            if (!TextUtils.isEmpty(str2)) {
                gradientDrawable.setColor(Color.parseColor(str2));
            }
            gradientDrawable.setStroke(bnl0.m105587w(3.0f), Color.parseColor(str));
            this.f188031m.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m205595x(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: y */
    public void m205596y() {
        bnl0.m105524M(this.f188030l, true);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
