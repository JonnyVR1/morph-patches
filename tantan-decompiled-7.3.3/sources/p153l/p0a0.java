package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.data.CharacterEvaluate;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p0a0 extends ep90 {

    /* JADX INFO: renamed from: A */
    public TextView f150020A;

    /* JADX INFO: renamed from: B */
    public TextView f150021B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f150022C;

    /* JADX INFO: renamed from: D */
    public TextView f150023D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f150024E;

    /* JADX INFO: renamed from: F */
    public View f150025F;

    /* JADX INFO: renamed from: G */
    public TextView f150026G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f150027H;

    /* JADX INFO: renamed from: I */
    public View f150028I;

    /* JADX INFO: renamed from: J */
    public TextView f150029J;

    /* JADX INFO: renamed from: K */
    public FrameLayout f150030K;

    /* JADX INFO: renamed from: L */
    public View f150031L;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f150032u;

    /* JADX INFO: renamed from: v */
    public VText f150033v;

    /* JADX INFO: renamed from: w */
    public VText f150034w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f150035x;

    /* JADX INFO: renamed from: y */
    public ImageView f150036y;

    /* JADX INFO: renamed from: z */
    public TextView f150037z;

    public p0a0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m170023T(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ Boolean m170031b0(boolean[] zArr, C4470c c4470c) {
        boolean z = false;
        if (c4470c == C4470c.f16267i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ Boolean m170033d0(boolean[] zArr, C4470c c4470c) {
        boolean z = false;
        if (c4470c == C4470c.f16267i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m170034e0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public View m170036g0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q0a0.m174687b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m170037h0(boolean z) {
        return z ? "p_edit_profile_view" : OMSDialogPositon.p_suggest_user_profile_info_view;
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m170038i0(SettingGroups settingGroups) {
        m170045p0();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f150033v.setTypeface(Typeface.DEFAULT_BOLD);
        if (mo53983O().mo52258P1()) {
            mo53983O().lifecycle().filter(new qcj() { // from class: l.g0a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).flatMap(new qcj() { // from class: l.h0a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20381e0.m116476J7();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.i0a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112344a.m170038i0((SettingGroups) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m170039j0() {
        i4g0.m138523u("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", C4900o.m35346n3(CoreModule.f18264c.f20381e0.m116593na()) ? "match" : "test_too"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m170040k0(CharacterEvaluate characterEvaluate) {
        if (characterEvaluate.hideCharacter) {
            i4g0.m138492A("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", "hide"));
            this.f150034w.setText("已隐藏");
        } else {
            i4g0.m138492A("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", "none"));
            this.f150034w.setText("");
        }
        bnl0.m105524M(this.f150034w, true);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (mo53983O().mo52258P1()) {
            return true;
        }
        if (!xra.m212796o() || C4900o.m35346n3(mo53983O().mo52252K2())) {
            return (NullChecker.m82486a(mo53983O().mo52252K2()) && C4900o.m35346n3(mo53983O().mo52252K2())) || !C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na());
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m170041l0(CharacterEvaluate characterEvaluate, x20 x20Var) {
        i4g0.m138523u("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", characterEvaluate.hideCharacter ? "hide" : "none"));
        x20Var.call();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m170042m0(CharacterEvaluate characterEvaluate) {
        m170049t0(this.f150025F, characterEvaluate.actionTemperature);
        m170049t0(this.f150028I, characterEvaluate.characterSweetness);
        m170049t0(this.f150031L, characterEvaluate.alcoholConcentration);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m170043n0(boolean[] zArr, x20 x20Var, String str, CharacterEvaluate characterEvaluate, String str2, View view) {
        zArr[0] = true;
        x20Var.call();
        C4900o.m35347r3(mo53983O().act(), mo53983O().mo52252K2(), C4900o.m35348s3(str, mo53983O().userId(), characterEvaluate.hideCharacter, str2));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m170044o0(boolean[] zArr, View view) {
        zArr[0] = true;
        i4g0.m138523u("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", "test"));
        C4900o.m35347r3(mo53983O().act(), mo53983O().mo52252K2(), C4900o.m35348s3(C4900o.f20811U, "", false, mo53983O().mo52258P1() ? "my_profile" : "other_profile"));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m170045p0() {
        final CharacterEvaluate characterEvaluate = CoreModule.f18264c.f20381e0.f89110R.get().characterEvaluate;
        if (!NullChecker.m82486a(characterEvaluate) || TextUtils.isEmpty(characterEvaluate.classification)) {
            bnl0.m105524M(this.f150034w, false);
            m170047r0();
        } else {
            final x20 x20Var = new x20() { // from class: l.n0a0
                @Override // p153l.x20
                public final void call() {
                    this.f139602a.m170040k0(characterEvaluate);
                }
            };
            x20Var.call();
            m170046q0(characterEvaluate, new x20() { // from class: l.o0a0
                @Override // p153l.x20
                public final void call() {
                    this.f144505a.m170041l0(characterEvaluate, x20Var);
                }
            }, "my_profile");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m170046q0(@NonNull final CharacterEvaluate characterEvaluate, @NonNull final x20 x20Var, final String str) {
        m170050u0(characterEvaluate.tags);
        this.f150037z.setText(characterEvaluate.classification);
        m170048s0(characterEvaluate.classification);
        bnl0.m105524M(this.f150022C, true);
        this.f150025F.post(new Runnable() { // from class: l.b0a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74259a.m170042m0(characterEvaluate);
            }
        });
        final String str2 = C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na()) ? C4900o.f20810T : C4900o.f20811U;
        final boolean[] zArr = {false};
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.c0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79240a.m170043n0(zArr, x20Var, str2, characterEvaluate, str, view);
            }
        };
        this.f150034w.setOnClickListener(onClickListener);
        this.f150035x.setOnClickListener(onClickListener);
        this.f150022C.setOnClickListener(onClickListener);
        boolean zMo52258P1 = mo53983O().mo52258P1();
        TextView textView = this.f150021B;
        if (zMo52258P1) {
            bnl0.m105524M(textView, false);
        } else {
            textView.setText(C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na()) ? "匹配解析" : "我也去测");
            bnl0.m105524M(this.f150021B, true);
        }
        if (C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na())) {
            return;
        }
        mo53983O().lifecycle().filter(new qcj() { // from class: l.d0a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p0a0.m170031b0(zArr, (C4470c) obj);
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.e0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }, new y20() { // from class: l.f0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                p0a0.m170023T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m170047r0() {
        i4g0.m138492A("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", "test"));
        this.f150021B.setText("去测试");
        bnl0.m105524M(this.f150021B, true);
        bnl0.m105524M(this.f150034w, false);
        bnl0.m105524M(this.f150022C, false);
        this.f150036y.setImageResource(dbc0.f87639zd);
        this.f150035x.setBackgroundResource(dbc0.f87543wd);
        this.f150037z.setText("完成社交性格测试");
        this.f150020A.setText("让喜欢的人更直观了解你");
        final boolean[] zArr = {false};
        this.f150035x.setOnClickListener(new View.OnClickListener() { // from class: l.j0a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117802a.m170044o0(zArr, view);
            }
        });
        mo53983O().lifecycle().filter(new qcj() { // from class: l.k0a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p0a0.m170033d0(zArr, (C4470c) obj);
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.l0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }, new y20() { // from class: l.m0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                p0a0.m170034e0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m170036g0(mo53983O().mo146493H2(), viewGroup);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m170048s0(String str) {
        if (TextUtils.equals(str, "冰山威士忌")) {
            this.f150036y.setImageResource(dbc0.f87116jd);
            this.f150035x.setBackgroundResource(dbc0.f87314pd);
            return;
        }
        if (TextUtils.equals(str, "陈年拉菲酒")) {
            this.f150036y.setImageResource(dbc0.f87149kd);
            this.f150035x.setBackgroundResource(dbc0.f87347qd);
            return;
        }
        if (TextUtils.equals(str, "清醒冰美式")) {
            this.f150036y.setImageResource(dbc0.f87607yd);
            this.f150035x.setBackgroundResource(dbc0.f87511vd);
            return;
        }
        if (TextUtils.equals(str, "手打柠檬茶")) {
            this.f150036y.setImageResource(dbc0.f85990Ad);
            this.f150035x.setBackgroundResource(dbc0.f87575xd);
            return;
        }
        if (TextUtils.equals(str, "奥利奥奶茶")) {
            this.f150036y.setImageResource(dbc0.f87281od);
            this.f150035x.setBackgroundResource(dbc0.f87479ud);
            return;
        }
        if (TextUtils.equals(str, "橘子盐汽水")) {
            this.f150036y.setImageResource(dbc0.f87248nd);
            this.f150035x.setBackgroundResource(dbc0.f87446td);
            return;
        }
        boolean zEquals = TextUtils.equals(str, "纯纯凉白开");
        ImageView imageView = this.f150036y;
        if (zEquals) {
            imageView.setImageResource(dbc0.f87182ld);
            this.f150035x.setBackgroundResource(dbc0.f87380rd);
        } else {
            imageView.setImageResource(dbc0.f87215md);
            this.f150035x.setBackgroundResource(dbc0.f87413sd);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (mo53983O().mo52258P1()) {
            return;
        }
        if (!C4900o.m35346n3(mo53983O().mo52252K2()) && !C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na())) {
            bnl0.m105524M(this.f150034w, false);
            m170047r0();
            return;
        }
        CharacterEvaluate userCharacter = mo53983O().mo52252K2().settings.getUserCharacter();
        if (userCharacter == null) {
            CrashHelper.m82479c(new NullChecker.TantanNullException());
            return;
        }
        i4g0.m138492A("e_character", m170037h0(mo53983O().mo52302m0()), jyb.m147494Y("tab_status", C4900o.m35346n3(CoreModule.f18264c.f20381e0.m116593na()) ? "match" : "test_too"));
        bnl0.m105524M(this.f150034w, false);
        m170046q0(userCharacter, new x20() { // from class: l.a0a0
            @Override // p153l.x20
            public final void call() {
                this.f67696a.m170039j0();
            }
        }, "other_profile");
    }

    /* JADX INFO: renamed from: t0 */
    public final void m170049t0(View view, int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 7) {
            i = 7;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (i <= 3) {
            layoutParams.gravity = 5;
        } else {
            layoutParams.gravity = 3;
        }
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        switch (i) {
            case 1:
                layoutParams.rightMargin = (int) (this.f150024E.getWidth() * 0.14f);
                break;
            case 2:
                layoutParams.rightMargin = (int) (this.f150024E.getWidth() * 0.27f);
                break;
            case 3:
                layoutParams.rightMargin = (int) (this.f150024E.getWidth() * 0.41f);
                break;
            case 4:
                layoutParams.leftMargin = (int) (this.f150024E.getWidth() * 0.41f);
                break;
            case 5:
                layoutParams.leftMargin = (int) (this.f150024E.getWidth() * 0.27f);
                break;
            case 6:
                layoutParams.leftMargin = (int) (this.f150024E.getWidth() * 0.14f);
                break;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m170050u0(List<String> list) {
        if (jyb.m147479J(list)) {
            CrashHelper.m82479c(new NullChecker.TantanNullException());
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(" · ");
            }
        }
        this.f150020A.setText(sb);
    }
}
