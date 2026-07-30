package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.AiTranslateResultData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: renamed from: l.v2 */
/* JADX INFO: loaded from: classes11.dex */
public class C20562v2 extends p3l implements vua0 {

    /* JADX INFO: renamed from: f */
    public VLinear f179310f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f179311g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f179312h;

    /* JADX INFO: renamed from: i */
    public VLinear f179313i;

    /* JADX INFO: renamed from: j */
    public View f179314j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f179315k;

    /* JADX INFO: renamed from: l */
    public VLinear f179316l;

    /* JADX INFO: renamed from: m */
    public VText f179317m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f179318n;

    /* JADX INFO: renamed from: o */
    public VImage f179319o;

    /* JADX INFO: renamed from: r */
    public String f179322r;

    /* JADX INFO: renamed from: p */
    public boolean f179320p = false;

    /* JADX INFO: renamed from: q */
    public boolean f179321q = false;

    /* JADX INFO: renamed from: s */
    public boolean f179323s = false;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Unit m196673F(String str, String str2) {
        vua0.INSTANCE.m200066b();
        return null;
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (TextUtils.isEmpty(user.description)) {
            xdl0.m208344M(m209783m(), false);
            return;
        }
        vua0.INSTANCE.m200065a(this);
        this.f179312h.m44073p(user.description);
        xdl0.m208344M(m209783m(), true);
        this.f179322r = user.f56011id;
        m196686S();
        if (user.isMe()) {
            return;
        }
        m196678K(user.description);
    }

    /* JADX INFO: renamed from: J */
    public final void m196677J(View view) {
        C20786w2.m201013a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public final void m196678K(String str) {
        C17441i0.m133729d(str, new C17441i0.a() { // from class: l.p2
            @Override // p149l.C17441i0.a
            /* JADX INFO: renamed from: a */
            public final void mo133733a(String str2, boolean z) {
                this.f146784a.m196679L(str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m196679L(String str, boolean z) {
        if (!z || !TextUtils.equals(str, this.f179312h.getText().toString())) {
            xdl0.m208344M(this.f179313i, false);
            return;
        }
        xdl0.m208344M(this.f179313i, true);
        xdl0.m208344M(this.f179315k, false);
        xdl0.m208344M(this.f179314j, false);
        m196687T();
        zvf0.m220402x("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m196680M(View view) {
        if (this.f179320p || this.f179323s) {
            return;
        }
        zvf0.m220396r("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
        m196688U();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m196681N(View view) {
        zvf0.m220396r("e_intl_switch_language", OMSDialogPositon.p_suggest_user_profile_info_view);
        new DialogC19382q0(m167252w(), new Function2() { // from class: l.s2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C20562v2.m196673F((String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void m196683P(Throwable th) {
        this.f179320p = false;
        this.f179317m.setText(App.f15369e.getString(R$string.f19125zg));
        xdl0.m208344M(this.f179318n, false);
        this.f179318n.stopAnimation(true);
        xdl0.m208344M(this.f179315k, false);
        xdl0.m208344M(this.f179314j, false);
        if (th != null) {
            if (th instanceof TantanException.Client.CoreService) {
                lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
            } else {
                lsi0.m151595y(th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m196682O(AiTranslateResultData aiTranslateResultData) {
        VText_Medium vText_Medium;
        if (this.f179320p) {
            this.f179320p = false;
            this.f179321q = true;
            this.f179317m.setText(App.f15369e.getString(R$string.f19125zg));
            xdl0.m208344M(this.f179318n, false);
            this.f179318n.stopAnimation(true);
            if (aiTranslateResultData != null && !TextUtils.isEmpty(aiTranslateResultData.translated_text) && (vText_Medium = this.f179315k) != null) {
                this.f179323s = true;
                vText_Medium.setText(aiTranslateResultData.translated_text);
                xdl0.m208344M(this.f179315k, true);
                xdl0.m208344M(this.f179314j, true);
            }
            m209783m().requestLayout();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m196686S() {
        this.f179320p = false;
        this.f179323s = false;
        xdl0.m208344M(this.f179313i, false);
        m196683P(null);
    }

    /* JADX INFO: renamed from: T */
    public final void m196687T() {
        xdl0.m208329E0(this.f179316l, new View.OnClickListener() { // from class: l.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152186a.m196680M(view);
            }
        });
        xdl0.m208329E0(this.f179319o, new View.OnClickListener() { // from class: l.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157351a.m196681N(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m196688U() {
        this.f179320p = true;
        this.f179317m.setText(App.f15369e.getString(R$string.f17583Ag));
        xdl0.m208344M(this.f179318n, true);
        SVGALoader.with(this.f179318n.getContext()).from("ai_translating.svga").autoPlay(true).repeatCount(-1).into(this.f179318n);
        m209781k(m167252w(), C17441i0.m133732g("profile_description", this.f179322r, 0L, 0L)).subscribe(mkd0.m154956H(new e30() { // from class: l.t2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167413a.m196682O((AiTranslateResultData) obj);
            }
        }, new e30() { // from class: l.u2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173056a.m196683P((Throwable) obj);
            }
        }));
    }

    @Override // p149l.vua0
    /* JADX INFO: renamed from: a */
    public void mo98106a() {
        this.f179320p = false;
        this.f179323s = false;
        this.f179321q = true;
        if (xdl0.m208349O0(this.f179313i)) {
            m196683P(null);
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m196677J(view);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        super.mo38154q(z);
        if (z && this.f179321q && xdl0.m208349O0(this.f179313i)) {
            this.f179321q = false;
            m209783m().requestLayout();
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: r */
    public void mo38155r() {
        super.mo38155r();
        vua0.INSTANCE.m200067c(this);
    }
}
