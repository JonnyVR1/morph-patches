package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.AiTranslateResultData;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.bpb0;
import l.e30;
import l.i0;
import l.lsi0;
import l.mkd0;
import l.q0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class apb0 extends p3l implements vua0 {

    /* JADX INFO: renamed from: f */
    public VLinear f9600f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f9601g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f9602h;

    /* JADX INFO: renamed from: i */
    public VLinear f9603i;

    /* JADX INFO: renamed from: j */
    public View f9604j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f9605k;

    /* JADX INFO: renamed from: l */
    public VLinear f9606l;

    /* JADX INFO: renamed from: m */
    public VText f9607m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f9608n;

    /* JADX INFO: renamed from: o */
    public VImage f9609o;

    /* JADX INFO: renamed from: r */
    public String f9612r;

    /* JADX INFO: renamed from: s */
    public long f9613s;

    /* JADX INFO: renamed from: p */
    public boolean f9610p = false;

    /* JADX INFO: renamed from: q */
    public boolean f9611q = false;

    /* JADX INFO: renamed from: t */
    public boolean f9614t = false;

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Unit m11549E(String str, String str2) {
        vua0.INSTANCE.m23733b();
        return null;
    }

    /* JADX INFO: renamed from: K */
    private void m11554K(String str) {
        i0.d(str, new i0.a() { // from class: l.uob0
            /* JADX INFO: renamed from: a */
            public final void m23084a(String str2, boolean z) {
                this.f21277a.m11555L(str2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m11555L(String str, boolean z) {
        if (!z || !TextUtils.equals(str, this.f9602h.getText().toString())) {
            xdl0.M(this.f9603i, false);
            return;
        }
        xdl0.M(this.f9603i, true);
        xdl0.M(this.f9605k, false);
        xdl0.M(this.f9604j, false);
        m11563T();
        zvf0.x("e_intl_ai_translate", "p_suggest_user_profile_info_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m11556M(View view) {
        if (this.f9610p || this.f9614t) {
            return;
        }
        zvf0.r("e_intl_ai_translate", "p_suggest_user_profile_info_view");
        m11564U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m11557N(View view) {
        zvf0.r("e_intl_switch_language", "p_suggest_user_profile_info_view");
        new q0(m20098w(), new Function2() { // from class: l.zob0
            public final Object invoke(Object obj, Object obj2) {
                return apb0.m11549E((String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m11559P(Throwable th) {
        this.f9610p = false;
        this.f9607m.setText(App.e.getString(R.string.zg));
        xdl0.M(this.f9608n, false);
        this.f9608n.stopAnimation(true);
        xdl0.M(this.f9605k, false);
        xdl0.M(this.f9604j, false);
        if (th != null) {
            if (th instanceof TantanException.Client.CoreService) {
                lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
            } else {
                lsi0.y(th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m11558O(AiTranslateResultData aiTranslateResultData) {
        VText_Medium vText_Medium;
        if (this.f9610p) {
            this.f9610p = false;
            this.f9611q = true;
            this.f9607m.setText(App.e.getString(R.string.zg));
            xdl0.M(this.f9608n, false);
            this.f9608n.stopAnimation(true);
            if (aiTranslateResultData != null && !TextUtils.isEmpty(aiTranslateResultData.translated_text) && (vText_Medium = this.f9605k) != null) {
                this.f9614t = true;
                vText_Medium.setText(aiTranslateResultData.translated_text);
                xdl0.M(this.f9605k, true);
                xdl0.M(this.f9604j, true);
            }
            m24921m().requestLayout();
        }
    }

    /* JADX INFO: renamed from: S */
    private void m11562S() {
        this.f9610p = false;
        this.f9614t = false;
        xdl0.M(this.f9603i, false);
        m11559P(null);
    }

    /* JADX INFO: renamed from: T */
    private void m11563T() {
        xdl0.E0(this.f9606l, new View.OnClickListener() { // from class: l.vob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21708a.m11556M(view);
            }
        });
        xdl0.E0(this.f9609o, new View.OnClickListener() { // from class: l.wob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22237a.m11557N(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    private void m11564U() {
        this.f9610p = true;
        this.f9607m.setText(App.e.getString(R.string.Ag));
        xdl0.M(this.f9608n, true);
        SVGALoader.with(this.f9608n.getContext()).from("ai_translating.svga").autoPlay(true).repeatCount(-1).into(this.f9608n);
        m24919k(m20098w(), i0.g("profile_answers", this.f9612r, 0L, this.f9613s)).subscribe(mkd0.H(new e30() { // from class: l.xob0
            public final void call(Object obj) {
                this.f22683a.m11558O((AiTranslateResultData) obj);
            }
        }, new e30() { // from class: l.yob0
            public final void call(Object obj) {
                this.f23186a.m11559P((Throwable) obj);
            }
        }));
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (i3 < 0 || user.profile.answers.size() <= i3) {
            return;
        }
        vua0.INSTANCE.m23732a(this);
        Answer answer = (Answer) user.profile.answers.get(i3);
        Question questionO3 = CoreModule.c.d0.o3(answer.question);
        String str = questionO3 != null ? questionO3.text : "";
        this.f9602h.p(answer.value);
        this.f9601g.setText(str);
        this.f9612r = ((DbObject) user).id;
        try {
            this.f9613s = Long.parseLong(answer.question);
        } catch (NumberFormatException unused) {
            this.f9613s = 0L;
        }
        m11562S();
        if (user.isMe()) {
            return;
        }
        m11554K(answer.value);
    }

    /* JADX INFO: renamed from: J */
    public final void m11565J(View view) {
        bpb0.a(this, view);
    }

    @Override // p009l.vua0
    /* JADX INFO: renamed from: a */
    public void mo11566a() {
        this.f9610p = false;
        this.f9614t = false;
        this.f9611q = true;
        if (xdl0.O0(this.f9603i)) {
            m11559P(null);
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m11565J(view);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        super.mo2128q(z);
        if (z && this.f9611q && xdl0.O0(this.f9603i)) {
            this.f9611q = false;
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
