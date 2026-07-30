package p002l;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.Picture;
import java.util.Locale;
import l.e3c0;
import l.io4;
import l.j760;
import l.lqa;
import l.m17;
import l.qib0;
import l.t100;
import l.ura;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ho4 extends m17 {

    /* JADX INFO: renamed from: g */
    public VLinear f12170g;

    /* JADX INFO: renamed from: h */
    public VText_NoTopPadding f12171h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f12172i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f12173j;

    /* JADX INFO: renamed from: k */
    public VImage f12174k;

    /* JADX INFO: renamed from: l */
    public View f12175l;

    /* JADX INFO: renamed from: m */
    public VText_NoTopPadding f12176m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f12177n;

    /* JADX INFO: renamed from: o */
    public View f12178o;

    /* JADX INFO: renamed from: p */
    public VText_NoTopPadding f12179p;

    /* JADX INFO: renamed from: q */
    public VText_NoTopPadding f12180q;

    /* JADX INFO: renamed from: r */
    public VText_NoTopPadding f12181r;

    /* JADX INFO: renamed from: s */
    public final Act f12182s;

    /* JADX INFO: renamed from: t */
    public final Picture f12183t;

    /* JADX INFO: renamed from: u */
    public final Picture f12184u;

    /* JADX INFO: renamed from: v */
    public final Runnable f12185v;

    /* JADX INFO: renamed from: w */
    public Runnable f12186w;

    /* JADX INFO: renamed from: x */
    public Runnable f12187x;

    /* JADX INFO: renamed from: y */
    public boolean f12188y;

    /* JADX INFO: renamed from: z */
    public final String f12189z;

    public ho4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable) {
        super(act);
        this.f12186w = null;
        this.f12187x = null;
        this.f12188y = true;
        this.f12182s = act;
        this.f12183t = picture;
        this.f12184u = picture2;
        this.f12185v = runnable;
        this.f12189z = "p_authentication_failure_popup";
    }

    /* JADX INFO: renamed from: S */
    private void m14623S() {
        setContentView(m14637R(LayoutInflater.from(this.f12182s), null));
        if (ura.e().d().I4()) {
            this.f12171h.setTextColor(Color.parseColor("#CC000000"));
            this.f12176m.setCompoundDrawablesWithIntrinsicBounds(e3c0.G0, 0, 0, 0);
            this.f12179p.setCompoundDrawablesWithIntrinsicBounds(e3c0.F0, 0, 0, 0);
            this.f12180q.setBackgroundResource(e3c0.D0);
            this.f12175l.setBackgroundResource(e3c0.q);
        }
        int iE = CertificationUtil.e(CoreModule.c.e0.p9());
        VImage vImage = this.f12174k;
        if (iE == -1) {
            xdl0.M(vImage, false);
        } else {
            vImage.setImageResource(iE);
            xdl0.M(this.f12174k, true);
        }
        VText_NoTopPadding vText_NoTopPadding = this.f12172i;
        Locale locale = Locale.CHINA;
        vText_NoTopPadding.setText(String.format(locale, "建议保留原头像及认证权益，照片未满%d张，新头像会保存为其他照片", Integer.valueOf(lqa.w() ? 9 : 6)));
        int iY0 = (((xdl0.y0() - t100.d(93.0f)) * 173) / 141) >> 1;
        xdl0.C0(this.f12173j, iY0);
        xdl0.C0(this.f12177n, iY0);
        qib0.G.L0(this.f12173j, this.f12183t.profileMiddle().formatted());
        qib0.G.L0(this.f12177n, this.f12184u.profileMiddle().formatted());
        xdl0.E0(this.f12173j, new View.OnClickListener() { // from class: l.yn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22981a.m14624T(view);
            }
        });
        xdl0.E0(this.f12177n, new View.OnClickListener() { // from class: l.zn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23514a.m14625U(view);
            }
        });
        xdl0.E0(this.f12175l, new View.OnClickListener() { // from class: l.ao4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7773a.m14626V(view);
            }
        });
        xdl0.E0(this.f12178o, new View.OnClickListener() { // from class: l.bo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8289a.m14627W(view);
            }
        });
        if (this.f12186w == null) {
            this.f12171h.setText("新头像会导致认证失效");
            this.f12172i.setText(String.format(locale, "建议保留原头像及认证权益，照片未满%d张，新头像会保存为其他照片", Integer.valueOf(lqa.w() ? 9 : 6)));
            xdl0.M(this.f12175l, true);
            xdl0.M(this.f12178o, true);
            xdl0.M(this.f12180q, true);
            xdl0.M(this.f12181r, false);
            this.f12180q.setText("确定");
            xdl0.E0(this.f12180q, new View.OnClickListener() { // from class: l.co4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8769a.m14628X(view);
                }
            });
            return;
        }
        Runnable runnable = this.f12187x;
        VText_NoTopPadding vText_NoTopPadding2 = this.f12171h;
        if (runnable == null) {
            vText_NoTopPadding2.setText("新头像会导致认证失效");
            this.f12172i.setText("认证失效后系统会回收认证标识、只看认证权益");
            xdl0.M(this.f12175l, false);
            xdl0.M(this.f12178o, false);
            xdl0.M(this.f12180q, true);
            xdl0.M(this.f12181r, true);
            this.f12180q.setText("使用原头像，并保存其他资料");
            this.f12181r.setText("使用新头像，并保存其他资料");
            xdl0.E0(this.f12180q, new View.OnClickListener() { // from class: l.do4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9369a.m14629Y(view);
                }
            });
            xdl0.E0(this.f12181r, new View.OnClickListener() { // from class: l.eo4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9890a.m14630Z(view);
                }
            });
            return;
        }
        vText_NoTopPadding2.setText("头像和其他资料修改未保存");
        this.f12172i.setText("新头像会导致认证失效，是否保存原头像和其他资料");
        xdl0.M(this.f12175l, false);
        xdl0.M(this.f12178o, false);
        xdl0.M(this.f12180q, true);
        xdl0.M(this.f12181r, true);
        this.f12180q.setText("使用原头像，并保存其他修改");
        this.f12181r.setText("不保存本次修改");
        xdl0.E0(this.f12180q, new View.OnClickListener() { // from class: l.fo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10565a.m14631a0(view);
            }
        });
        xdl0.E0(this.f12181r, new View.OnClickListener() { // from class: l.go4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11559a.m14632b0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m14624T(View view) {
        this.f12175l.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m14625U(View view) {
        this.f12178o.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m14626V(View view) {
        this.f12188y = true;
        m14638c0();
        if (this.f12186w == null) {
            zvf0.r("e_select_avatar", this.f12189z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m14627W(View view) {
        this.f12188y = false;
        m14638c0();
        if (this.f12186w == null) {
            zvf0.r("e_select_avatar", this.f12189z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m14628X(View view) {
        Runnable runnable;
        if (this.f12188y && (runnable = this.f12185v) != null) {
            runnable.run();
        }
        dismiss();
        zvf0.u("e_confirm_selection", this.f12189z, new j760[]{j760.a("select_type", this.f12188y ? "old" : "new")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m14629Y(View view) {
        Runnable runnable = this.f12185v;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f12186w;
        if (runnable2 != null) {
            runnable2.run();
        }
        dismiss();
        zvf0.r("e_save_original_avatar_other_modify", this.f12189z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m14630Z(View view) {
        Runnable runnable = this.f12186w;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        zvf0.r("e_save_new_avatar_other_modify", this.f12189z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m14631a0(View view) {
        Runnable runnable = this.f12185v;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f12186w;
        if (runnable2 != null) {
            runnable2.run();
        }
        dismiss();
        zvf0.r("e_save_original_avatar_other_modify", this.f12189z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m14632b0(View view) {
        Runnable runnable = this.f12187x;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
        zvf0.r("e_not_save", this.f12189z);
    }

    /* JADX INFO: renamed from: C */
    public boolean m14633C() {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public String m14634F() {
        return this.f12189z;
    }

    /* JADX INFO: renamed from: G */
    public View m14635G() {
        return this.f12170g;
    }

    /* JADX INFO: renamed from: H */
    public boolean m14636H() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public View m14637R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return io4.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14638c0() {
        boolean z = this.f12188y;
        View view = this.f12175l;
        if (z) {
            view.setBackgroundResource(e3c0.U1);
            this.f12178o.setBackgroundResource(e3c0.T1);
        } else {
            view.setBackgroundResource(e3c0.T1);
            this.f12178o.setBackgroundResource(e3c0.U1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m14623S();
    }

    /* JADX INFO: renamed from: z */
    public boolean m14639z() {
        return false;
    }

    public ho4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
        super(act);
        this.f12187x = null;
        this.f12188y = true;
        this.f12182s = act;
        this.f12183t = picture;
        this.f12184u = picture2;
        this.f12185v = runnable;
        this.f12186w = runnable2;
        this.f12189z = "p_save_second_authentication_prompt_popup";
    }

    public ho4(@NonNull Act act, @NonNull Picture picture, @NonNull Picture picture2, @NonNull Runnable runnable, @NonNull Runnable runnable2, @NonNull Runnable runnable3) {
        super(act);
        this.f12188y = true;
        this.f12182s = act;
        this.f12183t = picture;
        this.f12184u = picture2;
        this.f12185v = runnable;
        this.f12186w = runnable2;
        this.f12187x = runnable3;
        this.f12189z = "p_return_second_authentication_prompt_popup";
    }
}
