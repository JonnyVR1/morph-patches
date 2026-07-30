package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p046p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack;
import com.p046p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p046p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import com.p046p1.mobile.putong.core.newui.explore.view.ExploreCardOperationButton;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;

/* JADX INFO: loaded from: classes11.dex */
public class g7l implements s7m<c7l> {

    /* JADX INFO: renamed from: a */
    public View f101392a;

    /* JADX INFO: renamed from: b */
    public View f101393b;

    /* JADX INFO: renamed from: c */
    public View f101394c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f101395d;

    /* JADX INFO: renamed from: e */
    public VImage f101396e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f101397f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f101398g;

    /* JADX INFO: renamed from: h */
    public TextView f101399h;

    /* JADX INFO: renamed from: i */
    public ExploreCardStack f101400i;

    /* JADX INFO: renamed from: j */
    public unf f101401j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f101402k;

    /* JADX INFO: renamed from: l */
    public VRelative f101403l;

    /* JADX INFO: renamed from: m */
    public View f101404m;

    /* JADX INFO: renamed from: n */
    public Act f101405n;

    /* JADX INFO: renamed from: o */
    public HomeExploreFrag f101406o;

    /* JADX INFO: renamed from: p */
    public c7l f101407p;

    /* JADX INFO: renamed from: q */
    public ExploreCardOperationButton f101408q;

    /* JADX INFO: renamed from: r */
    public ExploreCardOperationButton f101409r;

    /* JADX INFO: renamed from: s */
    public VLinear f101410s;

    /* JADX INFO: renamed from: t */
    public boolean f101411t;

    /* JADX INFO: renamed from: u */
    public p3m<lof.C18270a, VSwipeStack.OnCardSwipeResult> f101412u;

    public g7l(HomeExploreFrag homeExploreFrag) {
        this.f101406o = homeExploreFrag;
        this.f101405n = homeExploreFrag.act();
    }

    /* JADX INFO: renamed from: l */
    private void m124698l() {
        this.f101396e.setOnClickListener(new View.OnClickListener() { // from class: l.d7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84750a.m124706n(view);
            }
        });
        if (NullChecker.m81303a(this.f101405n)) {
            int iM131709n1 = hmb.m131709n1(this.f101405n);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f101396e.getLayoutParams();
            layoutParams.topMargin = iM131709n1;
            this.f101396e.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f101394c.getLayoutParams();
            layoutParams2.height = xdl0.m208336I(this.f101405n);
            this.f101394c.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f101402k.getLayoutParams();
            layoutParams3.topMargin = xdl0.m208407w(115.0f) + iM131709n1;
            this.f101402k.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f101403l.getLayoutParams();
            layoutParams4.topMargin = iM131709n1 + xdl0.m208407w(115.0f);
            this.f101403l.setLayoutParams(layoutParams4);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(RemoteConfig.m79298x().m79302F("growth_explore_config")).optJSONObject(this.f101407p.f79628c);
            if (NullChecker.m81303a(jSONObjectOptJSONObject)) {
                String strOptString = jSONObjectOptJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                String strOptString2 = jSONObjectOptJSONObject.optString("icon");
                String strOptString3 = jSONObjectOptJSONObject.optString(OMSResourceType.background);
                String strOptString4 = jSONObjectOptJSONObject.optString("backgroundColor");
                String strOptString5 = jSONObjectOptJSONObject.optString("emptyColor");
                this.f101399h.setText(strOptString);
                qib0.f154691G.m102363i0(this.f101398g, strOptString3);
                qib0.f154691G.m102363i0(this.f101397f, strOptString2);
                m124713w(strOptString4, strOptString5);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f101405n;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f101405n;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c7l c7lVar) {
        this.f101407p = c7lVar;
    }

    /* JADX INFO: renamed from: e */
    public void m124700e(boolean z, float f) {
        if (!z) {
            this.f101409r.reset();
            this.f101408q.reset();
        } else if (f > 0.0f) {
            this.f101408q.reset();
            this.f101409r.m36391j(f);
        } else {
            this.f101409r.reset();
            this.f101408q.m36391j(-f);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m124701f() {
        this.f101405n.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i */
    public ExploreCardStack m124702i() {
        return this.f101400i;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95720c3, viewGroup, false);
        this.f101392a = viewInflate;
        this.f101395d = (FrameLayout) viewInflate.findViewById(u4c0.f174009R3);
        this.f101393b = this.f101392a.findViewById(u4c0.f173915Lb);
        this.f101396e = (VImage) this.f101392a.findViewById(u4c0.f174156a4);
        this.f101397f = (VDraweeView) this.f101392a.findViewById(u4c0.f174190c4);
        this.f101399h = (TextView) this.f101392a.findViewById(u4c0.f174173b4);
        this.f101402k = (RelativeLayout) this.f101392a.findViewById(u4c0.f173992Q3);
        this.f101403l = (VRelative) this.f101392a.findViewById(u4c0.f174059U3);
        this.f101404m = this.f101392a.findViewById(u4c0.f174043T3);
        this.f101408q = (ExploreCardOperationButton) this.f101392a.findViewById(u4c0.f174026S3);
        this.f101409r = (ExploreCardOperationButton) this.f101392a.findViewById(u4c0.f174091W3);
        this.f101398g = (VDraweeView) this.f101392a.findViewById(u4c0.f173958O3);
        this.f101394c = this.f101392a.findViewById(u4c0.f174107X3);
        this.f101410s = (VLinear) this.f101392a.findViewById(u4c0.f173975P3);
        return this.f101392a;
    }

    /* JADX INFO: renamed from: j */
    public void m124703j() {
        xdl0.m208344M(this.f101410s, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m124704k() {
        ExploreCardStack exploreCardStack = new ExploreCardStack(getAct(), this);
        this.f101400i = exploreCardStack;
        exploreCardStack.setClipChildren(false);
        this.f101400i.setClipToPadding(false);
        this.f101395d.addView(this.f101400i, 0, new FrameLayout.LayoutParams(-1, -1));
        unf unfVar = new unf(this.f101406o, this.f101400i);
        this.f101401j = unfVar;
        this.f101400i.setAdapter(unfVar);
    }

    /* JADX INFO: renamed from: m */
    public boolean m124705m(SwipeDirection swipeDirection) {
        return swipeDirection == SwipeDirection.RIGHT;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m124706n(View view) {
        m124701f();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m124707p(View view) {
        m124702i().m36366r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m124708q(View view) {
        m124702i().m36366r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: r */
    public void m124709r() {
        m124698l();
        m124704k();
    }

    /* JADX INFO: renamed from: s */
    public VSwipeStack.OnCardSwipeResult m124710s(View view, SwipeDirection swipeDirection, boolean z) {
        xnf xnfVar = view instanceof ExploreCardItemView ? ((ExploreCardItemView) view).f21421z : null;
        if (xnfVar == null) {
            this.f101406o.mo36354M3(m124705m(swipeDirection), "other");
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f101412u == null) {
            this.f101412u = new lof();
        }
        p3m<lof.C18270a, VSwipeStack.OnCardSwipeResult> p3mVar = this.f101412u;
        Act act = getAct();
        User user = xnfVar.f193672b;
        ExploreDialogData exploreDialogData = xnfVar.f193677g;
        boolean z2 = xnfVar.f193678h;
        boolean z3 = xnfVar.f193679i;
        HomeExploreFrag homeExploreFrag = this.f101406o;
        return p3mVar.mo37497a(new lof.C18270a(act, user, exploreDialogData, z2, z3, homeExploreFrag.f21392C, this.f101411t, view, swipeDirection, z, homeExploreFrag));
    }

    /* JADX INFO: renamed from: u */
    public void m124711u(View view, SwipeDirection swipeDirection) {
        xnf xnfVar = view instanceof ExploreCardItemView ? ((ExploreCardItemView) view).f21421z : null;
        if (xnfVar == null) {
            return;
        }
        this.f101407p.f79626a = new hof(xnfVar, swipeDirection);
    }

    /* JADX INFO: renamed from: v */
    public void m124712v(List<xnf> list) {
        unf unfVar = this.f101401j;
        if (unfVar == null) {
            return;
        }
        unfVar.m194421n(list);
        xdl0.m208344M(this.f101410s, true);
        m124714x(this.f101410s);
        this.f101408q.m36394u(x2c0.f190029c, x2c0.f189257D7);
        xdl0.m208329E0(this.f101408q, new View.OnClickListener() { // from class: l.e7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89724a.m124707p(view);
            }
        });
        this.f101409r.m36394u(x2c0.f190029c, x2c0.f189193B7);
        xdl0.m208329E0(this.f101409r, new View.OnClickListener() { // from class: l.f7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96266a.m124708q(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m124713w(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("#")) {
            str = "#".concat(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("#")) {
            str2 = "#".concat(str2);
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xdl0.m208407w(20.0f));
            gradientDrawable.setShape(0);
            if (!TextUtils.isEmpty(str2)) {
                gradientDrawable.setColor(Color.parseColor(str2));
            }
            gradientDrawable.setStroke(xdl0.m208407w(3.0f), Color.parseColor(str));
            this.f101404m.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m124714x(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: y */
    public void m124715y() {
        xdl0.m208344M(this.f101403l, true);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
