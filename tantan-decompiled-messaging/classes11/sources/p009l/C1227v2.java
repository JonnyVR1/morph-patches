package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.AiTranslateResultData;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.e30;
import l.i0;
import l.lsi0;
import l.mkd0;
import l.q0;
import l.w2;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: l.v2 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C1227v2 extends p3l implements vua0 {

    /* JADX INFO: renamed from: f */
    public VLinear f21417f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f21418g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f21419h;

    /* JADX INFO: renamed from: i */
    public VLinear f21420i;

    /* JADX INFO: renamed from: j */
    public View f21421j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f21422k;

    /* JADX INFO: renamed from: l */
    public VLinear f21423l;

    /* JADX INFO: renamed from: m */
    public VText f21424m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f21425n;

    /* JADX INFO: renamed from: o */
    public VImage f21426o;

    /* JADX INFO: renamed from: r */
    public String f21429r;

    /* JADX INFO: renamed from: p */
    public boolean f21427p = false;

    /* JADX INFO: renamed from: q */
    public boolean f21428q = false;

    /* JADX INFO: renamed from: s */
    public boolean f21430s = false;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Unit m23234F(String str, String str2) {
        vua0.INSTANCE.m23733b();
        return null;
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (TextUtils.isEmpty(user.description)) {
            xdl0.M(m24921m(), false);
            return;
        }
        vua0.INSTANCE.m23732a(this);
        this.f21419h.p(user.description);
        xdl0.M(m24921m(), true);
        this.f21429r = ((DbObject) user).id;
        m23247S();
        if (user.isMe()) {
            return;
        }
        m23239K(user.description);
    }

    /* JADX INFO: renamed from: J */
    public final void m23238J(View view) {
        w2.a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final void m23239K(String str) {
        i0.d(str, new i0.a() { // from class: l.p2
            /* JADX INFO: renamed from: a */
            public final void m20087a(String str2, boolean z) {
                this.f18360a.m23240L(str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m23240L(String str, boolean z) {
        if (!z || !TextUtils.equals(str, this.f21419h.getText().toString())) {
            xdl0.M(this.f21420i, false);
            return;
        }
        xdl0.M(this.f21420i, true);
        xdl0.M(this.f21422k, false);
        xdl0.M(this.f21421j, false);
        m23248T();
        zvf0.x("e_intl_ai_translate", "p_suggest_user_profile_info_view");
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m23241M(View view) {
        if (this.f21427p || this.f21430s) {
            return;
        }
        zvf0.r("e_intl_ai_translate", "p_suggest_user_profile_info_view");
        m23249U();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m23242N(View view) {
        zvf0.r("e_intl_switch_language", "p_suggest_user_profile_info_view");
        new q0(m20098w(), new Function2() { // from class: l.s2
            public final Object invoke(Object obj, Object obj2) {
                return C1227v2.m23234F((String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void m23244P(Throwable th) {
        this.f21427p = false;
        this.f21424m.setText(App.e.getString(R.string.zg));
        xdl0.M(this.f21425n, false);
        this.f21425n.stopAnimation(true);
        xdl0.M(this.f21422k, false);
        xdl0.M(this.f21421j, false);
        if (th != null) {
            if (th instanceof TantanException.Client.CoreService) {
                lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
            } else {
                lsi0.y(th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m23243O(AiTranslateResultData aiTranslateResultData) {
        VText_Medium vText_Medium;
        if (this.f21427p) {
            this.f21427p = false;
            this.f21428q = true;
            this.f21424m.setText(App.e.getString(R.string.zg));
            xdl0.M(this.f21425n, false);
            this.f21425n.stopAnimation(true);
            if (aiTranslateResultData != null && !TextUtils.isEmpty(aiTranslateResultData.translated_text) && (vText_Medium = this.f21422k) != null) {
                this.f21430s = true;
                vText_Medium.setText(aiTranslateResultData.translated_text);
                xdl0.M(this.f21422k, true);
                xdl0.M(this.f21421j, true);
            }
            m24921m().requestLayout();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m23247S() {
        this.f21427p = false;
        this.f21430s = false;
        xdl0.M(this.f21420i, false);
        m23244P(null);
    }

    /* JADX INFO: renamed from: T */
    public final void m23248T() {
        xdl0.E0(this.f21423l, new View.OnClickListener() { // from class: l.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18994a.m23241M(view);
            }
        });
        xdl0.E0(this.f21426o, new View.OnClickListener() { // from class: l.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19613a.m23242N(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m23249U() {
        this.f21427p = true;
        this.f21424m.setText(App.e.getString(R.string.Ag));
        xdl0.M(this.f21425n, true);
        SVGALoader.with(this.f21425n.getContext()).from("ai_translating.svga").autoPlay(true).repeatCount(-1).into(this.f21425n);
        m24919k(m20098w(), i0.g("profile_description", this.f21429r, 0L, 0L)).subscribe(mkd0.H(new e30() { // from class: l.t2
            public final void call(Object obj) {
                this.f20523a.m23243O((AiTranslateResultData) obj);
            }
        }, new e30() { // from class: l.u2
            public final void call(Object obj) {
                this.f20962a.m23244P((Throwable) obj);
            }
        }));
    }

    @Override // p009l.vua0
    /* JADX INFO: renamed from: a */
    public void mo11566a() {
        this.f21427p = false;
        this.f21430s = false;
        this.f21428q = true;
        if (xdl0.O0(this.f21420i)) {
            m23244P(null);
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m23238J(view);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        super.mo2128q(z);
        if (z && this.f21428q && xdl0.O0(this.f21420i)) {
            this.f21428q = false;
            m24921m().requestLayout();
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: r */
    public void mo2129r() {
        super.mo2129r();
        vua0.INSTANCE.m23734c(this);
    }
}
