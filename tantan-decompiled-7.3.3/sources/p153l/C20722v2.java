package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.AiTranslateResultData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: renamed from: l.v2 */
/* JADX INFO: loaded from: classes11.dex */
public class C20722v2 extends f6l implements z2b0 {

    /* JADX INFO: renamed from: f */
    public VLinear f182040f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f182041g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f182042h;

    /* JADX INFO: renamed from: i */
    public VLinear f182043i;

    /* JADX INFO: renamed from: j */
    public View f182044j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f182045k;

    /* JADX INFO: renamed from: l */
    public VLinear f182046l;

    /* JADX INFO: renamed from: m */
    public VText f182047m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f182048n;

    /* JADX INFO: renamed from: o */
    public VImage f182049o;

    /* JADX INFO: renamed from: r */
    public String f182052r;

    /* JADX INFO: renamed from: p */
    public boolean f182050p = false;

    /* JADX INFO: renamed from: q */
    public boolean f182051q = false;

    /* JADX INFO: renamed from: s */
    public boolean f182053s = false;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Unit m199093F(String str, String str2) {
        z2b0.INSTANCE.m218396b();
        return null;
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (TextUtils.isEmpty(user.description)) {
            bnl0.m105524M(m116952m(), false);
            return;
        }
        z2b0.INSTANCE.m218395a(this);
        this.f182042h.m45256p(user.description);
        bnl0.m105524M(m116952m(), true);
        this.f182052r = user.f56859id;
        m199106S();
        if (user.isMe()) {
            return;
        }
        m199098K(user.description);
    }

    /* JADX INFO: renamed from: J */
    public final void m199097J(View view) {
        C20996w2.m204485a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final void m199098K(String str) {
        C17607i0.m137950d(str, new C17607i0.a() { // from class: l.p2
            @Override // p153l.C17607i0.a
            /* JADX INFO: renamed from: a */
            public final void mo137954a(String str2, boolean z) {
                this.f150233a.m199099L(str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m199099L(String str, boolean z) {
        if (!z || !TextUtils.equals(str, this.f182042h.getText().toString())) {
            bnl0.m105524M(this.f182043i, false);
            return;
        }
        bnl0.m105524M(this.f182043i, true);
        bnl0.m105524M(this.f182045k, false);
        bnl0.m105524M(this.f182044j, false);
        m199107T();
        i4g0.m138526x("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m199100M(View view) {
        if (this.f182050p || this.f182053s) {
            return;
        }
        i4g0.m138520r("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
        m199108U();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m199101N(View view) {
        i4g0.m138520r("e_intl_switch_language", OMSDialogPositon.p_suggest_user_profile_info_view);
        new DialogC19481q0(m124283w(), new Function2() { // from class: l.s2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C20722v2.m199093F((String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void m199103P(Throwable th) {
        this.f182050p = false;
        this.f182047m.setText(App.f16088e.getString(R$string.f18853Sg));
        bnl0.m105524M(this.f182048n, false);
        this.f182048n.stopAnimation(true);
        bnl0.m105524M(this.f182045k, false);
        bnl0.m105524M(this.f182044j, false);
        if (th != null) {
            if (th instanceof TantanException.Client.CoreService) {
                o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
            } else {
                o1j0.m165651y(th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m199102O(AiTranslateResultData aiTranslateResultData) {
        VText_Medium vText_Medium;
        if (this.f182050p) {
            this.f182050p = false;
            this.f182051q = true;
            this.f182047m.setText(App.f16088e.getString(R$string.f18853Sg));
            bnl0.m105524M(this.f182048n, false);
            this.f182048n.stopAnimation(true);
            if (aiTranslateResultData != null && !TextUtils.isEmpty(aiTranslateResultData.translated_text) && (vText_Medium = this.f182045k) != null) {
                this.f182053s = true;
                vText_Medium.setText(aiTranslateResultData.translated_text);
                bnl0.m105524M(this.f182045k, true);
                bnl0.m105524M(this.f182044j, true);
            }
            m116952m().requestLayout();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m199106S() {
        this.f182050p = false;
        this.f182053s = false;
        bnl0.m105524M(this.f182043i, false);
        m199103P(null);
    }

    /* JADX INFO: renamed from: T */
    public final void m199107T() {
        bnl0.m105509E0(this.f182046l, new View.OnClickListener() { // from class: l.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155241a.m199100M(view);
            }
        });
        bnl0.m105509E0(this.f182049o, new View.OnClickListener() { // from class: l.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160868a.m199101N(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m199108U() {
        this.f182050p = true;
        this.f182047m.setText(App.f16088e.getString(R$string.f18883Tg));
        bnl0.m105524M(this.f182048n, true);
        SVGALoader.with(this.f182048n.getContext()).from("ai_translating.svga").autoPlay(true).repeatCount(-1).into(this.f182048n);
        m116950k(m124283w(), C17607i0.m137953g("profile_description", this.f182052r, 0L, 0L)).subscribe(psd0.m173597H(new y20() { // from class: l.t2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171702a.m199102O((AiTranslateResultData) obj);
            }
        }, new y20() { // from class: l.u2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177162a.m199103P((Throwable) obj);
            }
        }));
    }

    @Override // p153l.z2b0
    /* JADX INFO: renamed from: a */
    public void mo123047a() {
        this.f182050p = false;
        this.f182053s = false;
        this.f182051q = true;
        if (bnl0.m105529O0(this.f182043i)) {
            m199103P(null);
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m199097J(view);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        super.mo39157q(z);
        if (z && this.f182051q && bnl0.m105529O0(this.f182043i)) {
            this.f182051q = false;
            m116952m().requestLayout();
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: r */
    public void mo39158r() {
        super.mo39158r();
        z2b0.INSTANCE.m218397c(this);
    }
}
