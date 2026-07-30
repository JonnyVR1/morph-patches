package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.AiTranslateResultData;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class apb0 extends p3l implements vua0 {

    /* JADX INFO: renamed from: f */
    public VLinear f71010f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f71011g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f71012h;

    /* JADX INFO: renamed from: i */
    public VLinear f71013i;

    /* JADX INFO: renamed from: j */
    public View f71014j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f71015k;

    /* JADX INFO: renamed from: l */
    public VLinear f71016l;

    /* JADX INFO: renamed from: m */
    public VText f71017m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f71018n;

    /* JADX INFO: renamed from: o */
    public VImage f71019o;

    /* JADX INFO: renamed from: r */
    public String f71022r;

    /* JADX INFO: renamed from: s */
    public long f71023s;

    /* JADX INFO: renamed from: p */
    public boolean f71020p = false;

    /* JADX INFO: renamed from: q */
    public boolean f71021q = false;

    /* JADX INFO: renamed from: t */
    public boolean f71024t = false;

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Unit m98089E(String str, String str2) {
        vua0.INSTANCE.m200066b();
        return null;
    }

    /* JADX INFO: renamed from: K */
    private void m98094K(String str) {
        C17441i0.m133729d(str, new C17441i0.a() { // from class: l.uob0
            @Override // p149l.C17441i0.a
            /* JADX INFO: renamed from: a */
            public final void mo133733a(String str2, boolean z) {
                this.f177501a.m98095L(str2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m98095L(String str, boolean z) {
        if (!z || !TextUtils.equals(str, this.f71012h.getText().toString())) {
            xdl0.m208344M(this.f71013i, false);
            return;
        }
        xdl0.m208344M(this.f71013i, true);
        xdl0.m208344M(this.f71015k, false);
        xdl0.m208344M(this.f71014j, false);
        m98103T();
        zvf0.m220402x("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m98096M(View view) {
        if (this.f71020p || this.f71024t) {
            return;
        }
        zvf0.m220396r("e_intl_ai_translate", OMSDialogPositon.p_suggest_user_profile_info_view);
        m98104U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m98097N(View view) {
        zvf0.m220396r("e_intl_switch_language", OMSDialogPositon.p_suggest_user_profile_info_view);
        new DialogC19382q0(m167252w(), new Function2() { // from class: l.zob0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return apb0.m98089E((String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m98099P(Throwable th) {
        this.f71020p = false;
        this.f71017m.setText(App.f15369e.getString(R$string.f19125zg));
        xdl0.m208344M(this.f71018n, false);
        this.f71018n.stopAnimation(true);
        xdl0.m208344M(this.f71015k, false);
        xdl0.m208344M(this.f71014j, false);
        if (th != null) {
            if (th instanceof TantanException.Client.CoreService) {
                lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
            } else {
                lsi0.m151595y(th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m98098O(AiTranslateResultData aiTranslateResultData) {
        VText_Medium vText_Medium;
        if (this.f71020p) {
            this.f71020p = false;
            this.f71021q = true;
            this.f71017m.setText(App.f15369e.getString(R$string.f19125zg));
            xdl0.m208344M(this.f71018n, false);
            this.f71018n.stopAnimation(true);
            if (aiTranslateResultData != null && !TextUtils.isEmpty(aiTranslateResultData.translated_text) && (vText_Medium = this.f71015k) != null) {
                this.f71024t = true;
                vText_Medium.setText(aiTranslateResultData.translated_text);
                xdl0.m208344M(this.f71015k, true);
                xdl0.m208344M(this.f71014j, true);
            }
            m209783m().requestLayout();
        }
    }

    /* JADX INFO: renamed from: S */
    private void m98102S() {
        this.f71020p = false;
        this.f71024t = false;
        xdl0.m208344M(this.f71013i, false);
        m98099P(null);
    }

    /* JADX INFO: renamed from: T */
    private void m98103T() {
        xdl0.m208329E0(this.f71016l, new View.OnClickListener() { // from class: l.vob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182379a.m98096M(view);
            }
        });
        xdl0.m208329E0(this.f71019o, new View.OnClickListener() { // from class: l.wob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187399a.m98097N(view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    private void m98104U() {
        this.f71020p = true;
        this.f71017m.setText(App.f15369e.getString(R$string.f17583Ag));
        xdl0.m208344M(this.f71018n, true);
        SVGALoader.with(this.f71018n.getContext()).from("ai_translating.svga").autoPlay(true).repeatCount(-1).into(this.f71018n);
        m209781k(m167252w(), C17441i0.m133732g("profile_answers", this.f71022r, 0L, this.f71023s)).subscribe(mkd0.m154956H(new e30() { // from class: l.xob0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193812a.m98098O((AiTranslateResultData) obj);
            }
        }, new e30() { // from class: l.yob0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199286a.m98099P((Throwable) obj);
            }
        }));
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (i3 < 0 || user.profile.answers.size() <= i3) {
            return;
        }
        vua0.INSTANCE.m200065a(this);
        Answer answer = user.profile.answers.get(i3);
        Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(answer.question);
        String str = questionM215900o3 != null ? questionM215900o3.text : "";
        this.f71012h.m44073p(answer.value);
        this.f71011g.setText(str);
        this.f71022r = user.f56011id;
        try {
            this.f71023s = Long.parseLong(answer.question);
        } catch (NumberFormatException unused) {
            this.f71023s = 0L;
        }
        m98102S();
        if (user.isMe()) {
            return;
        }
        m98094K(answer.value);
    }

    /* JADX INFO: renamed from: J */
    public final void m98105J(View view) {
        bpb0.m103050a(this, view);
    }

    @Override // p149l.vua0
    /* JADX INFO: renamed from: a */
    public void mo98106a() {
        this.f71020p = false;
        this.f71024t = false;
        this.f71021q = true;
        if (xdl0.m208349O0(this.f71013i)) {
            m98099P(null);
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m98105J(view);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        super.mo38154q(z);
        if (z && this.f71021q && xdl0.m208349O0(this.f71013i)) {
            this.f71021q = false;
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
