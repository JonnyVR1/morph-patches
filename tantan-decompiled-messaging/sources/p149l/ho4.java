package p149l;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.Locale;
import org.spongycastle.crypto.tls.CipherSuite;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class ho4 extends m17 {

    /* JADX INFO: renamed from: g */
    public VLinear f108773g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f108774h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f108775i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f108776j;

    /* JADX INFO: renamed from: k */
    public VImage f108777k;

    /* JADX INFO: renamed from: l */
    public View f108778l;

    /* JADX INFO: renamed from: m */
    public VText_NoTopPadding f108779m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f108780n;

    /* JADX INFO: renamed from: o */
    public View f108781o;

    /* JADX INFO: renamed from: p */
    public VText_NoTopPadding f108782p;

    /* JADX INFO: renamed from: q */
    public VText_NoTopPadding f108783q;

    /* JADX INFO: renamed from: r */
    public VText_NoTopPadding f108784r;

    /* JADX INFO: renamed from: s */
    public final Act f108785s;

    /* JADX INFO: renamed from: t */
    public final Picture f108786t;

    /* JADX INFO: renamed from: u */
    public final Picture f108787u;

    /* JADX INFO: renamed from: v */
    public final Runnable f108788v;

    /* JADX INFO: renamed from: w */
    public Runnable f108789w;

    /* JADX INFO: renamed from: x */
    public Runnable f108790x;

    /* JADX INFO: renamed from: y */
    public boolean f108791y;

    /* JADX INFO: renamed from: z */
    public final String f108792z;

    public ho4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable) {
        super(act);
        this.f108789w = null;
        this.f108790x = null;
        this.f108791y = true;
        this.f108785s = act;
        this.f108786t = picture;
        this.f108787u = picture2;
        this.f108788v = runnable;
        this.f108792z = "p_authentication_failure_popup";
    }

    /* JADX INFO: renamed from: S */
    private void m132187S() {
        setContentView(m132197R(LayoutInflater.from(this.f108785s), null));
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f108774h.setTextColor(Color.parseColor("#CC000000"));
            this.f108779m.setCompoundDrawablesWithIntrinsicBounds(e3c0.f89024G0, 0, 0, 0);
            this.f108782p.setCompoundDrawablesWithIntrinsicBounds(e3c0.f89021F0, 0, 0, 0);
            this.f108783q.setBackgroundResource(e3c0.f89015D0);
            this.f108778l.setBackgroundResource(e3c0.f89138q);
        }
        int iM58146e = CertificationUtil.m58146e(CoreModule.f17545c.f19639e0.m169527p9());
        VImage vImage = this.f108777k;
        if (iM58146e == -1) {
            xdl0.m208344M(vImage, false);
        } else {
            vImage.setImageResource(iM58146e);
            xdl0.m208344M(this.f108777k, true);
        }
        VText_NoTopPadding vText_NoTopPadding = this.f108775i;
        Locale locale = Locale.CHINA;
        vText_NoTopPadding.setText(String.format(locale, "建议保留原头像及认证权益，照片未满%d张，新头像会保存为其他照片", Integer.valueOf(lqa.m150985w() ? 9 : 6)));
        int iM208412y0 = (((xdl0.m208412y0() - t100.m186890d(93.0f)) * CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384) / CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) >> 1;
        xdl0.m208325C0(this.f108776j, iM208412y0);
        xdl0.m208325C0(this.f108780n, iM208412y0);
        qib0.f154691G.m102331L0(this.f108776j, this.f108786t.profileMiddle().formatted());
        qib0.f154691G.m102331L0(this.f108780n, this.f108787u.profileMiddle().formatted());
        xdl0.m208329E0(this.f108776j, new View.OnClickListener() { // from class: l.yn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199141a.m132188T(view);
            }
        });
        xdl0.m208329E0(this.f108780n, new View.OnClickListener() { // from class: l.zn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203957a.m132189U(view);
            }
        });
        xdl0.m208329E0(this.f108778l, new View.OnClickListener() { // from class: l.ao4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70786a.m132190V(view);
            }
        });
        xdl0.m208329E0(this.f108781o, new View.OnClickListener() { // from class: l.bo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76480a.m132191W(view);
            }
        });
        if (this.f108789w == null) {
            this.f108774h.setText("新头像会导致认证失效");
            this.f108775i.setText(String.format(locale, "建议保留原头像及认证权益，照片未满%d张，新头像会保存为其他照片", Integer.valueOf(lqa.m150985w() ? 9 : 6)));
            xdl0.m208344M(this.f108778l, true);
            xdl0.m208344M(this.f108781o, true);
            xdl0.m208344M(this.f108783q, true);
            xdl0.m208344M(this.f108784r, false);
            this.f108783q.setText("确定");
            xdl0.m208329E0(this.f108783q, new View.OnClickListener() { // from class: l.co4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81746a.m132192X(view);
                }
            });
            return;
        }
        Runnable runnable = this.f108790x;
        VText_NoTopPadding vText_NoTopPadding2 = this.f108774h;
        if (runnable == null) {
            vText_NoTopPadding2.setText("新头像会导致认证失效");
            this.f108775i.setText("认证失效后系统会回收认证标识、只看认证权益");
            xdl0.m208344M(this.f108778l, false);
            xdl0.m208344M(this.f108781o, false);
            xdl0.m208344M(this.f108783q, true);
            xdl0.m208344M(this.f108784r, true);
            this.f108783q.setText("使用原头像，并保存其他资料");
            this.f108784r.setText("使用新头像，并保存其他资料");
            xdl0.m208329E0(this.f108783q, new View.OnClickListener() { // from class: l.do4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f87127a.m132193Y(view);
                }
            });
            xdl0.m208329E0(this.f108784r, new View.OnClickListener() { // from class: l.eo4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92419a.m132194Z(view);
                }
            });
            return;
        }
        vText_NoTopPadding2.setText("头像和其他资料修改未保存");
        this.f108775i.setText("新头像会导致认证失效，是否保存原头像和其他资料");
        xdl0.m208344M(this.f108778l, false);
        xdl0.m208344M(this.f108781o, false);
        xdl0.m208344M(this.f108783q, true);
        xdl0.m208344M(this.f108784r, true);
        this.f108783q.setText("使用原头像，并保存其他修改");
        this.f108784r.setText("不保存本次修改");
        xdl0.m208329E0(this.f108783q, new View.OnClickListener() { // from class: l.fo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98503a.m132195a0(view);
            }
        });
        xdl0.m208329E0(this.f108784r, new View.OnClickListener() { // from class: l.go4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103651a.m132196b0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m132188T(View view) {
        this.f108778l.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m132189U(View view) {
        this.f108781o.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m132190V(View view) {
        this.f108791y = true;
        m132198c0();
        if (this.f108789w == null) {
            zvf0.m220396r("e_select_avatar", this.f108792z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m132191W(View view) {
        this.f108791y = false;
        m132198c0();
        if (this.f108789w == null) {
            zvf0.m220396r("e_select_avatar", this.f108792z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m132192X(View view) {
        Runnable runnable;
        if (this.f108791y && (runnable = this.f108788v) != null) {
            runnable.run();
        }
        dismiss();
        zvf0.m220399u("e_confirm_selection", this.f108792z, j760.m140076a("select_type", this.f108791y ? ShareConstants.OLD_VERSION : ShareConstants.NEW_VERSION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m132193Y(View view) {
        Runnable runnable = this.f108788v;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f108789w;
        if (runnable2 != null) {
            runnable2.run();
        }
        dismiss();
        zvf0.m220396r("e_save_original_avatar_other_modify", this.f108792z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m132194Z(View view) {
        Runnable runnable = this.f108789w;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        zvf0.m220396r("e_save_new_avatar_other_modify", this.f108792z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m132195a0(View view) {
        Runnable runnable = this.f108788v;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f108789w;
        if (runnable2 != null) {
            runnable2.run();
        }
        dismiss();
        zvf0.m220396r("e_save_original_avatar_other_modify", this.f108792z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m132196b0(View view) {
        Runnable runnable = this.f108790x;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        zvf0.m220396r("e_not_save", this.f108792z);
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: C */
    public boolean mo121173C() {
        return true;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: F */
    public String mo121174F() {
        return this.f108792z;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: G */
    public View mo121175G() {
        return this.f108773g;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: H */
    public boolean mo121176H() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public View m132197R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return io4.m137286b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m132198c0() {
        boolean z = this.f108791y;
        View view = this.f108778l;
        if (z) {
            view.setBackgroundResource(e3c0.f89067U1);
            this.f108781o.setBackgroundResource(e3c0.f89064T1);
        } else {
            view.setBackgroundResource(e3c0.f89064T1);
            this.f108781o.setBackgroundResource(e3c0.f89067U1);
        }
    }

    @Override // p149l.m17, com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m132187S();
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: z */
    public boolean mo121181z() {
        return false;
    }

    public ho4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
        super(act);
        this.f108790x = null;
        this.f108791y = true;
        this.f108785s = act;
        this.f108786t = picture;
        this.f108787u = picture2;
        this.f108788v = runnable;
        this.f108789w = runnable2;
        this.f108792z = "p_save_second_authentication_prompt_popup";
    }

    public ho4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable, @NonNull Runnable runnable2, @NonNull Runnable runnable3) {
        super(act);
        this.f108791y = true;
        this.f108785s = act;
        this.f108786t = picture;
        this.f108787u = picture2;
        this.f108788v = runnable;
        this.f108789w = runnable2;
        this.f108790x = runnable3;
        this.f108792z = "p_return_second_authentication_prompt_popup";
    }
}
