package p153l;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.Locale;
import org.spongycastle.crypto.tls.CipherSuite;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class gp4 extends q27 {

    /* JADX INFO: renamed from: g */
    public VLinear f105409g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f105410h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f105411i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f105412j;

    /* JADX INFO: renamed from: k */
    public VImage f105413k;

    /* JADX INFO: renamed from: l */
    public View f105414l;

    /* JADX INFO: renamed from: m */
    public VText_NoTopPadding f105415m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f105416n;

    /* JADX INFO: renamed from: o */
    public View f105417o;

    /* JADX INFO: renamed from: p */
    public VText_NoTopPadding f105418p;

    /* JADX INFO: renamed from: q */
    public VText_NoTopPadding f105419q;

    /* JADX INFO: renamed from: r */
    public VText_NoTopPadding f105420r;

    /* JADX INFO: renamed from: s */
    public final Act f105421s;

    /* JADX INFO: renamed from: t */
    public final Picture f105422t;

    /* JADX INFO: renamed from: u */
    public final Picture f105423u;

    /* JADX INFO: renamed from: v */
    public final Runnable f105424v;

    /* JADX INFO: renamed from: w */
    public Runnable f105425w;

    /* JADX INFO: renamed from: x */
    public Runnable f105426x;

    /* JADX INFO: renamed from: y */
    public boolean f105427y;

    /* JADX INFO: renamed from: z */
    public final String f105428z;

    public gp4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable) {
        super(act);
        this.f105425w = null;
        this.f105426x = null;
        this.f105427y = true;
        this.f105421s = act;
        this.f105422t = picture;
        this.f105423u = picture2;
        this.f105424v = runnable;
        this.f105428z = "p_authentication_failure_popup";
    }

    /* JADX INFO: renamed from: S */
    private void m131215S() {
        setContentView(m131225R(LayoutInflater.from(this.f105421s), null));
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f105410h.setTextColor(Color.parseColor("#CC000000"));
            this.f105415m.setCompoundDrawablesWithIntrinsicBounds(kbc0.f124787G0, 0, 0, 0);
            this.f105418p.setCompoundDrawablesWithIntrinsicBounds(kbc0.f124784F0, 0, 0, 0);
            this.f105419q.setBackgroundResource(kbc0.f124778D0);
            this.f105414l.setBackgroundResource(kbc0.f124901q);
        }
        int iM59329e = CertificationUtil.m59329e(CoreModule.f18264c.f20381e0.m116600p9());
        VImage vImage = this.f105413k;
        if (iM59329e == -1) {
            bnl0.m105524M(vImage, false);
        } else {
            vImage.setImageResource(iM59329e);
            bnl0.m105524M(this.f105413k, true);
        }
        VText_NoTopPadding vText_NoTopPadding = this.f105411i;
        Locale locale = Locale.CHINA;
        vText_NoTopPadding.setText(String.format(locale, "建议保留原头像及认证权益，照片未满%d张，新头像会保存为其他照片", Integer.valueOf(xra.m212804w() ? 9 : 6)));
        int iM105592y0 = (((bnl0.m105592y0() - qa00.m175859d(93.0f)) * CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384) / CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) >> 1;
        bnl0.m105505C0(this.f105412j, iM105592y0);
        bnl0.m105505C0(this.f105416n, iM105592y0);
        uqb0.f180374G.m127115L0(this.f105412j, this.f105422t.profileMiddle().formatted());
        uqb0.f180374G.m127115L0(this.f105416n, this.f105423u.profileMiddle().formatted());
        bnl0.m105509E0(this.f105412j, new View.OnClickListener() { // from class: l.xo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195555a.m131216T(view);
            }
        });
        bnl0.m105509E0(this.f105416n, new View.OnClickListener() { // from class: l.yo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200953a.m131217U(view);
            }
        });
        bnl0.m105509E0(this.f105414l, new View.OnClickListener() { // from class: l.zo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205294a.m131218V(view);
            }
        });
        bnl0.m105509E0(this.f105417o, new View.OnClickListener() { // from class: l.ap4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72687a.m131219W(view);
            }
        });
        if (this.f105425w == null) {
            this.f105410h.setText("新头像会导致认证失效");
            this.f105411i.setText(String.format(locale, "建议保留原头像及认证权益，照片未满%d张，新头像会保存为其他照片", Integer.valueOf(xra.m212804w() ? 9 : 6)));
            bnl0.m105524M(this.f105414l, true);
            bnl0.m105524M(this.f105417o, true);
            bnl0.m105524M(this.f105419q, true);
            bnl0.m105524M(this.f105420r, false);
            this.f105419q.setText("确定");
            bnl0.m105509E0(this.f105419q, new View.OnClickListener() { // from class: l.bp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77729a.m131220X(view);
                }
            });
            return;
        }
        Runnable runnable = this.f105426x;
        VText_NoTopPadding vText_NoTopPadding2 = this.f105410h;
        if (runnable == null) {
            vText_NoTopPadding2.setText("新头像会导致认证失效");
            this.f105411i.setText("认证失效后系统会回收认证标识、只看认证权益");
            bnl0.m105524M(this.f105414l, false);
            bnl0.m105524M(this.f105417o, false);
            bnl0.m105524M(this.f105419q, true);
            bnl0.m105524M(this.f105420r, true);
            this.f105419q.setText("使用原头像，并保存其他资料");
            this.f105420r.setText("使用新头像，并保存其他资料");
            bnl0.m105509E0(this.f105419q, new View.OnClickListener() { // from class: l.cp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f82961a.m131221Y(view);
                }
            });
            bnl0.m105509E0(this.f105420r, new View.OnClickListener() { // from class: l.dp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90027a.m131222Z(view);
                }
            });
            return;
        }
        vText_NoTopPadding2.setText("头像和其他资料修改未保存");
        this.f105411i.setText("新头像会导致认证失效，是否保存原头像和其他资料");
        bnl0.m105524M(this.f105414l, false);
        bnl0.m105524M(this.f105417o, false);
        bnl0.m105524M(this.f105419q, true);
        bnl0.m105524M(this.f105420r, true);
        this.f105419q.setText("使用原头像，并保存其他修改");
        this.f105420r.setText("不保存本次修改");
        bnl0.m105509E0(this.f105419q, new View.OnClickListener() { // from class: l.ep4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95200a.m131223a0(view);
            }
        });
        bnl0.m105509E0(this.f105420r, new View.OnClickListener() { // from class: l.fp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100100a.m131224b0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m131216T(View view) {
        this.f105414l.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m131217U(View view) {
        this.f105417o.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m131218V(View view) {
        this.f105427y = true;
        m131226c0();
        if (this.f105425w == null) {
            i4g0.m138520r("e_select_avatar", this.f105428z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m131219W(View view) {
        this.f105427y = false;
        m131226c0();
        if (this.f105425w == null) {
            i4g0.m138520r("e_select_avatar", this.f105428z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m131220X(View view) {
        Runnable runnable;
        if (this.f105427y && (runnable = this.f105424v) != null) {
            runnable.run();
        }
        dismiss();
        i4g0.m138523u("e_confirm_selection", this.f105428z, pf60.m172085a("select_type", this.f105427y ? ShareConstants.OLD_VERSION : ShareConstants.NEW_VERSION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m131221Y(View view) {
        Runnable runnable = this.f105424v;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f105425w;
        if (runnable2 != null) {
            runnable2.run();
        }
        dismiss();
        i4g0.m138520r("e_save_original_avatar_other_modify", this.f105428z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m131222Z(View view) {
        Runnable runnable = this.f105425w;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        i4g0.m138520r("e_save_new_avatar_other_modify", this.f105428z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m131223a0(View view) {
        Runnable runnable = this.f105424v;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f105425w;
        if (runnable2 != null) {
            runnable2.run();
        }
        dismiss();
        i4g0.m138520r("e_save_original_avatar_other_modify", this.f105428z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m131224b0(View view) {
        Runnable runnable = this.f105426x;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        i4g0.m138520r("e_not_save", this.f105428z);
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: C */
    public boolean mo125591C() {
        return true;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: F */
    public String mo125592F() {
        return this.f105428z;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: G */
    public View mo125593G() {
        return this.f105409g;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: H */
    public boolean mo125594H() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public View m131225R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hp4.m136468b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m131226c0() {
        boolean z = this.f105427y;
        View view = this.f105414l;
        if (z) {
            view.setBackgroundResource(kbc0.f124830U1);
            this.f105417o.setBackgroundResource(kbc0.f124827T1);
        } else {
            view.setBackgroundResource(kbc0.f124827T1);
            this.f105417o.setBackgroundResource(kbc0.f124830U1);
        }
    }

    @Override // p153l.q27, com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m131215S();
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: z */
    public boolean mo125599z() {
        return false;
    }

    public gp4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
        super(act);
        this.f105426x = null;
        this.f105427y = true;
        this.f105421s = act;
        this.f105422t = picture;
        this.f105423u = picture2;
        this.f105424v = runnable;
        this.f105425w = runnable2;
        this.f105428z = "p_save_second_authentication_prompt_popup";
    }

    public gp4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable, @NonNull Runnable runnable2, @NonNull Runnable runnable3) {
        super(act);
        this.f105427y = true;
        this.f105421s = act;
        this.f105422t = picture;
        this.f105423u = picture2;
        this.f105424v = runnable;
        this.f105425w = runnable2;
        this.f105426x = runnable3;
        this.f105428z = "p_return_second_authentication_prompt_popup";
    }
}
