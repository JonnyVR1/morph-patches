package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.AiTranslateResultData;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class exb0 extends f6l implements z2b0 {

    /* JADX INFO: renamed from: f */
    public VLinear f96266f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f96267g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f96268h;

    /* JADX INFO: renamed from: i */
    public VLinear f96269i;

    /* JADX INFO: renamed from: j */
    public View f96270j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f96271k;

    /* JADX INFO: renamed from: l */
    public VLinear f96272l;

    /* JADX INFO: renamed from: m */
    public VText f96273m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f96274n;

    /* JADX INFO: renamed from: o */
    public VImage f96275o;

    /* JADX INFO: renamed from: r */
    public String f96278r;

    /* JADX INFO: renamed from: s */
    public long f96279s;

    /* JADX INFO: renamed from: p */
    public boolean f96276p = false;

    /* JADX INFO: renamed from: q */
    public boolean f96277q = false;

    /* JADX INFO: renamed from: t */
    public boolean f96280t = false;

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Unit m123030E(String str, String str2) {
        z2b0.INSTANCE.m218396b();
        return null;
    }

    /* JADX INFO: renamed from: K */
    private void m123035K(String str) {
        C17607i0.m137950d(str, new C17607i0.a() { // from class: l.ywb0
            @Override // p153l.C17607i0.a
            /* JADX INFO: renamed from: a */
            public final void mo137954a(String str2, boolean z) {
                this.f201809a.m123036L(str2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m123036L(String str, boolean z) {
        if (!z || !TextUtils.equals(str, this.f96268h.getText().toString())) {
            bnl0.m105524M(this.f96269i, false);
            return;
        }
        bnl0.m105524M(this.f96269i, true);
        bnl0.m105524M(this.f96271k, false);
        bnl0.m105524M(this.f96270j, false);
        m123044T();
        i4g0.m138526x("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m123037M(View view) {
        if (this.f96276p || this.f96280t) {
            return;
        }
        i4g0.m138520r("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
        m123045U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m123038N(View view) {
        i4g0.m138520r("e_intl_switch_language", OMSDialogPositon.p_suggest_user_profile_info_view);
        new DialogC19481q0(m124283w(), new Function2() { // from class: l.dxb0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return exb0.m123030E((String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m123040P(Throwable th) {
        this.f96276p = false;
        this.f96273m.setText(App.f16088e.getString(R$string.f18853Sg));
        bnl0.m105524M(this.f96274n, false);
        this.f96274n.stopAnimation(true);
        bnl0.m105524M(this.f96271k, false);
        bnl0.m105524M(this.f96270j, false);
        if (th != null) {
            if (th instanceof TantanException.Client.CoreService) {
                o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
            } else {
                o1j0.m165651y(th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m123039O(AiTranslateResultData aiTranslateResultData) {
        VText_Medium vText_Medium;
        if (this.f96276p) {
            this.f96276p = false;
            this.f96277q = true;
            this.f96273m.setText(App.f16088e.getString(R$string.f18853Sg));
            bnl0.m105524M(this.f96274n, false);
            this.f96274n.stopAnimation(true);
            if (aiTranslateResultData != null && !TextUtils.isEmpty(aiTranslateResultData.translated_text) && (vText_Medium = this.f96271k) != null) {
                this.f96280t = true;
                vText_Medium.setText(aiTranslateResultData.translated_text);
                bnl0.m105524M(this.f96271k, true);
                bnl0.m105524M(this.f96270j, true);
            }
            m116952m().requestLayout();
        }
    }

    /* JADX INFO: renamed from: S */
    private void m123043S() {
        this.f96276p = false;
        this.f96280t = false;
        bnl0.m105524M(this.f96269i, false);
        m123040P(null);
    }

    /* JADX INFO: renamed from: T */
    private void m123044T() {
        bnl0.m105509E0(this.f96272l, new View.OnClickListener() { // from class: l.zwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206331a.m123037M(view);
            }
        });
        bnl0.m105509E0(this.f96275o, new View.OnClickListener() { // from class: l.axb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73837a.m123038N(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    private void m123045U() {
        this.f96276p = true;
        this.f96273m.setText(App.f16088e.getString(R$string.f18883Tg));
        bnl0.m105524M(this.f96274n, true);
        SVGALoader.with(this.f96274n.getContext()).from("ai_translating.svga").autoPlay(true).repeatCount(-1).into(this.f96274n);
        m116950k(m124283w(), C17607i0.m137953g("profile_answers", this.f96278r, 0L, this.f96279s)).subscribe(psd0.m173597H(new y20() { // from class: l.bxb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78858a.m123039O((AiTranslateResultData) obj);
            }
        }, new y20() { // from class: l.cxb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84196a.m123040P((Throwable) obj);
            }
        }));
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (i3 < 0 || user.profile.answers.size() <= i3) {
            return;
        }
        z2b0.INSTANCE.m218395a(this);
        Answer answer = user.profile.answers.get(i3);
        Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(answer.question);
        String str = questionM151465o3 != null ? questionM151465o3.text : "";
        this.f96268h.m45256p(answer.value);
        this.f96267g.setText(str);
        this.f96278r = user.f56859id;
        try {
            this.f96279s = Long.parseLong(answer.question);
        } catch (NumberFormatException unused) {
            this.f96279s = 0L;
        }
        m123043S();
        if (user.isMe()) {
            return;
        }
        m123035K(answer.value);
    }

    /* JADX INFO: renamed from: J */
    public final void m123046J(View view) {
        fxb0.m127971a(this, view);
    }

    @Override // p153l.z2b0
    /* JADX INFO: renamed from: a */
    public void mo123047a() {
        this.f96276p = false;
        this.f96280t = false;
        this.f96277q = true;
        if (bnl0.m105529O0(this.f96269i)) {
            m123040P(null);
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m123046J(view);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        super.mo39157q(z);
        if (z && this.f96277q && bnl0.m105529O0(this.f96269i)) {
            this.f96277q = false;
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
