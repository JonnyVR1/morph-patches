package p009l;

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
import com.p000p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p000p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack;
import com.p000p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p000p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import com.p000p1.mobile.putong.core.newui.explore.view.ExploreCardOperationButton;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.f6c0;
import l.hmb;
import l.qib0;
import l.s7m;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g7l implements s7m<c7l> {

    /* JADX INFO: renamed from: a */
    public View f13342a;

    /* JADX INFO: renamed from: b */
    public View f13343b;

    /* JADX INFO: renamed from: c */
    public View f13344c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f13345d;

    /* JADX INFO: renamed from: e */
    public VImage f13346e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f13347f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f13348g;

    /* JADX INFO: renamed from: h */
    public TextView f13349h;

    /* JADX INFO: renamed from: i */
    public ExploreCardStack f13350i;

    /* JADX INFO: renamed from: j */
    public unf f13351j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f13352k;

    /* JADX INFO: renamed from: l */
    public VRelative f13353l;

    /* JADX INFO: renamed from: m */
    public View f13354m;

    /* JADX INFO: renamed from: n */
    public Act f13355n;

    /* JADX INFO: renamed from: o */
    public HomeExploreFrag f13356o;

    /* JADX INFO: renamed from: p */
    public c7l f13357p;

    /* JADX INFO: renamed from: q */
    public ExploreCardOperationButton f13358q;

    /* JADX INFO: renamed from: r */
    public ExploreCardOperationButton f13359r;

    /* JADX INFO: renamed from: s */
    public VLinear f13360s;

    /* JADX INFO: renamed from: t */
    public boolean f13361t;

    /* JADX INFO: renamed from: u */
    public p3m<lof.C1021a, VSwipeStack.OnCardSwipeResult> f13362u;

    public g7l(HomeExploreFrag homeExploreFrag) {
        this.f13356o = homeExploreFrag;
        this.f13355n = homeExploreFrag.act();
    }

    /* JADX INFO: renamed from: l */
    private void m14801l() {
        this.f13346e.setOnClickListener(new View.OnClickListener() { // from class: l.d7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11660a.m14811n(view);
            }
        });
        if (NullChecker.a(this.f13355n)) {
            int iN1 = hmb.n1(this.f13355n);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13346e.getLayoutParams();
            layoutParams.topMargin = iN1;
            this.f13346e.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f13344c.getLayoutParams();
            layoutParams2.height = xdl0.I(this.f13355n);
            this.f13344c.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f13352k.getLayoutParams();
            layoutParams3.topMargin = xdl0.w(115.0f) + iN1;
            this.f13352k.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f13353l.getLayoutParams();
            layoutParams4.topMargin = iN1 + xdl0.w(115.0f);
            this.f13353l.setLayoutParams(layoutParams4);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(RemoteConfig.m9619x().m9623F("growth_explore_config")).optJSONObject(this.f13357p.f10453c);
            if (NullChecker.a(jSONObjectOptJSONObject)) {
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strOptString2 = jSONObjectOptJSONObject.optString("icon");
                String strOptString3 = jSONObjectOptJSONObject.optString("background");
                String strOptString4 = jSONObjectOptJSONObject.optString("backgroundColor");
                String strOptString5 = jSONObjectOptJSONObject.optString("emptyColor");
                this.f13349h.setText(strOptString);
                qib0.G.i0(this.f13348g, strOptString3);
                qib0.G.i0(this.f13347f, strOptString2);
                m14818w(strOptString4, strOptString5);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14802C0() {
        return this.f13355n;
    }

    @Nullable
    public Act act() {
        return this.f13355n;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m14807i1(c7l c7lVar) {
        this.f13357p = c7lVar;
    }

    /* JADX INFO: renamed from: e */
    public void m14804e(boolean z, float f) {
        if (!z) {
            this.f13359r.reset();
            this.f13358q.reset();
        } else if (f > 0.0f) {
            this.f13358q.reset();
            this.f13359r.m320j(f);
        } else {
            this.f13359r.reset();
            this.f13358q.m320j(-f);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14805f() {
        this.f13355n.finish();
    }

    /* JADX INFO: renamed from: i */
    public ExploreCardStack m14806i() {
        return this.f13350i;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.c3, viewGroup, false);
        this.f13342a = viewInflate;
        this.f13345d = (FrameLayout) viewInflate.findViewById(u4c0.R3);
        this.f13343b = this.f13342a.findViewById(u4c0.Lb);
        this.f13346e = this.f13342a.findViewById(u4c0.a4);
        this.f13347f = this.f13342a.findViewById(u4c0.c4);
        this.f13349h = (TextView) this.f13342a.findViewById(u4c0.b4);
        this.f13352k = (RelativeLayout) this.f13342a.findViewById(u4c0.Q3);
        this.f13353l = this.f13342a.findViewById(u4c0.U3);
        this.f13354m = this.f13342a.findViewById(u4c0.T3);
        this.f13358q = (ExploreCardOperationButton) this.f13342a.findViewById(u4c0.S3);
        this.f13359r = (ExploreCardOperationButton) this.f13342a.findViewById(u4c0.W3);
        this.f13348g = this.f13342a.findViewById(u4c0.O3);
        this.f13344c = this.f13342a.findViewById(u4c0.X3);
        this.f13360s = this.f13342a.findViewById(u4c0.P3);
        return this.f13342a;
    }

    /* JADX INFO: renamed from: j */
    public void m14808j() {
        xdl0.M(this.f13360s, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m14809k() {
        ExploreCardStack exploreCardStack = new ExploreCardStack((Context) act(), this);
        this.f13350i = exploreCardStack;
        exploreCardStack.setClipChildren(false);
        this.f13350i.setClipToPadding(false);
        this.f13345d.addView(this.f13350i, 0, new FrameLayout.LayoutParams(-1, -1));
        unf unfVar = new unf(this.f13356o, this.f13350i);
        this.f13351j = unfVar;
        this.f13350i.setAdapter(unfVar);
    }

    /* JADX INFO: renamed from: m */
    public boolean m14810m(SwipeDirection swipeDirection) {
        return swipeDirection == SwipeDirection.RIGHT;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m14811n(View view) {
        m14805f();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m14812p(View view) {
        m14806i().m295r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m14813q(View view) {
        m14806i().m295r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: r */
    public void m14814r() {
        m14801l();
        m14809k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public VSwipeStack.OnCardSwipeResult m14815s(View view, SwipeDirection swipeDirection, boolean z) {
        xnf xnfVar = view instanceof ExploreCardItemView ? ((ExploreCardItemView) view).f199z : null;
        if (xnfVar == null) {
            this.f13356o.mo279M3(m14810m(swipeDirection), "other");
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f13362u == null) {
            this.f13362u = new lof();
        }
        p3m<lof.C1021a, VSwipeStack.OnCardSwipeResult> p3mVar = this.f13362u;
        Act act = act();
        User user = xnfVar.f22654b;
        ExploreDialogData exploreDialogData = xnfVar.f22659g;
        boolean z2 = xnfVar.f22660h;
        boolean z3 = xnfVar.f22661i;
        HomeExploreFrag homeExploreFrag = this.f13356o;
        return p3mVar.mo1468a(new lof.C1021a(act, user, exploreDialogData, z2, z3, homeExploreFrag.f170C, this.f13361t, view, swipeDirection, z, homeExploreFrag));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public void m14816u(View view, SwipeDirection swipeDirection) {
        xnf xnfVar = view instanceof ExploreCardItemView ? ((ExploreCardItemView) view).f199z : null;
        if (xnfVar == null) {
            return;
        }
        this.f13357p.f10451a = new hof(xnfVar, swipeDirection);
    }

    /* JADX INFO: renamed from: v */
    public void m14817v(List<xnf> list) {
        unf unfVar = this.f13351j;
        if (unfVar == null) {
            return;
        }
        unfVar.m23083n(list);
        xdl0.M(this.f13360s, true);
        m14819x(this.f13360s);
        this.f13358q.m323u(x2c0.c, x2c0.D7);
        xdl0.E0(this.f13358q, new View.OnClickListener() { // from class: l.e7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12443a.m14812p(view);
            }
        });
        this.f13359r.m323u(x2c0.c, x2c0.B7);
        xdl0.E0(this.f13359r, new View.OnClickListener() { // from class: l.f7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12854a.m14813q(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m14818w(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("#")) {
            str = "#".concat(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("#")) {
            str2 = "#".concat(str2);
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xdl0.w(20.0f));
            gradientDrawable.setShape(0);
            if (!TextUtils.isEmpty(str2)) {
                gradientDrawable.setColor(Color.parseColor(str2));
            }
            gradientDrawable.setStroke(xdl0.w(3.0f), Color.parseColor(str));
            this.f13354m.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14819x(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: y */
    public void m14820y() {
        xdl0.M(this.f13353l, true);
    }

    public void destroy() {
    }
}
