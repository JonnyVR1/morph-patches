package p002l;

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
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.o;
import com.p1.mobile.putong.data.CharacterEvaluate;
import com.p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.lqa;
import l.mcr;
import l.mkd0;
import l.ms90;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ls90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public TextView f15015A;

    /* JADX INFO: renamed from: B */
    public TextView f15016B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f15017C;

    /* JADX INFO: renamed from: D */
    public TextView f15018D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f15019E;

    /* JADX INFO: renamed from: F */
    public View f15020F;

    /* JADX INFO: renamed from: G */
    public TextView f15021G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f15022H;

    /* JADX INFO: renamed from: I */
    public View f15023I;

    /* JADX INFO: renamed from: J */
    public TextView f15024J;

    /* JADX INFO: renamed from: K */
    public FrameLayout f15025K;

    /* JADX INFO: renamed from: L */
    public View f15026L;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f15027u;

    /* JADX INFO: renamed from: v */
    public VText f15028v;

    /* JADX INFO: renamed from: w */
    public VText f15029w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f15030x;

    /* JADX INFO: renamed from: y */
    public ImageView f15031y;

    /* JADX INFO: renamed from: z */
    public TextView f15032z;

    public ls90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m17390T(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ Boolean m17398b0(boolean[] zArr, c cVar) {
        boolean z = false;
        if (cVar == c.i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ Boolean m17400d0(boolean[] zArr, c cVar) {
        boolean z = false;
        if (cVar == c.i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m17401e0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public View m17403g0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ms90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m17404h0(boolean z) {
        return z ? "p_edit_profile_view" : "p_suggest_user_profile_info_view";
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m17405i0(SettingGroups settingGroups) {
        m17412p0();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f15028v.setTypeface(Typeface.DEFAULT_BOLD);
        if (mo3351O().mo1523P1()) {
            mo3351O().lifecycle().filter(new w9j() { // from class: l.cs90
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).flatMap(new w9j() { // from class: l.ds90
                public final Object call(Object obj) {
                    return CoreModule.c.e0.J7();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.es90
                public final void call(Object obj) {
                    this.f9956a.m17405i0((SettingGroups) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m17406j0() {
        zvf0.u("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", o.n3(CoreModule.c.e0.na()) ? "match" : "test_too")});
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m17407k0(CharacterEvaluate characterEvaluate) {
        if (characterEvaluate.hideCharacter) {
            zvf0.A("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", "hide")});
            this.f15029w.setText("已隐藏");
        } else {
            zvf0.A("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", "none")});
            this.f15029w.setText("");
        }
        xdl0.M(this.f15029w, true);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (mo3351O().mo1523P1()) {
            return true;
        }
        if (!lqa.o() || o.n3(mo3351O().mo1517K2())) {
            return (NullChecker.a(mo3351O().mo1517K2()) && o.n3(mo3351O().mo1517K2())) || !o.m3(CoreModule.c.e0.na());
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m17408l0(CharacterEvaluate characterEvaluate, d30 d30Var) {
        zvf0.u("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", characterEvaluate.hideCharacter ? "hide" : "none")});
        d30Var.call();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m17409m0(CharacterEvaluate characterEvaluate) {
        m17416t0(this.f15020F, characterEvaluate.actionTemperature);
        m17416t0(this.f15023I, characterEvaluate.characterSweetness);
        m17416t0(this.f15026L, characterEvaluate.alcoholConcentration);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m17410n0(boolean[] zArr, d30 d30Var, String str, CharacterEvaluate characterEvaluate, String str2, View view) {
        zArr[0] = true;
        d30Var.call();
        o.r3(mo3351O().act(), mo3351O().mo1517K2(), o.s3(str, mo3351O().userId(), characterEvaluate.hideCharacter, str2));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m17411o0(boolean[] zArr, View view) {
        zArr[0] = true;
        zvf0.u("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", "test")});
        o.r3(mo3351O().act(), mo3351O().mo1517K2(), o.s3(o.U, "", false, mo3351O().mo1523P1() ? "my_profile" : "other_profile"));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m17412p0() {
        final CharacterEvaluate characterEvaluate = ((SettingGroups) CoreModule.c.e0.R.get()).characterEvaluate;
        if (!NullChecker.a(characterEvaluate) || TextUtils.isEmpty(characterEvaluate.classification)) {
            xdl0.M(this.f15029w, false);
            m17414r0();
        } else {
            final d30 d30Var = new d30() { // from class: l.js90
                public final void call() {
                    this.f14000a.m17407k0(characterEvaluate);
                }
            };
            d30Var.call();
            m17413q0(characterEvaluate, new d30() { // from class: l.ks90
                public final void call() {
                    this.f14496a.m17408l0(characterEvaluate, d30Var);
                }
            }, "my_profile");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m17413q0(@NonNull final CharacterEvaluate characterEvaluate, @NonNull final d30 d30Var, final String str) {
        m17417u0(characterEvaluate.tags);
        this.f15032z.setText(characterEvaluate.classification);
        m17415s0(characterEvaluate.classification);
        xdl0.M(this.f15017C, true);
        this.f15020F.post(new Runnable() { // from class: l.xr90
            @Override // java.lang.Runnable
            public final void run() {
                this.f22429a.m17409m0(characterEvaluate);
            }
        });
        final String str2 = o.m3(CoreModule.c.e0.na()) ? o.T : o.U;
        final boolean[] zArr = {false};
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.yr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23058a.m17410n0(zArr, d30Var, str2, characterEvaluate, str, view);
            }
        };
        this.f15029w.setOnClickListener(onClickListener);
        this.f15030x.setOnClickListener(onClickListener);
        this.f15017C.setOnClickListener(onClickListener);
        boolean zMo1523P1 = mo3351O().mo1523P1();
        TextView textView = this.f15016B;
        if (zMo1523P1) {
            xdl0.M(textView, false);
        } else {
            textView.setText(o.m3(CoreModule.c.e0.na()) ? "匹配解析" : "我也去测");
            xdl0.M(this.f15016B, true);
        }
        if (o.m3(CoreModule.c.e0.na())) {
            return;
        }
        mo3351O().lifecycle().filter(new w9j() { // from class: l.zr90
            public final Object call(Object obj) {
                return ls90.m17398b0(zArr, (c) obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.as90
            public final void call(Object obj) {
                CoreModule.c.e0.W9(CoreModule.H().userId());
            }
        }, new e30() { // from class: l.bs90
            public final void call(Object obj) {
                ls90.m17390T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m17414r0() {
        zvf0.A("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", "test")});
        this.f15016B.setText("去测试");
        xdl0.M(this.f15016B, true);
        xdl0.M(this.f15029w, false);
        xdl0.M(this.f15017C, false);
        this.f15031y.setImageResource(x2c0.yd);
        this.f15030x.setBackgroundResource(x2c0.vd);
        this.f15032z.setText("完成社交性格测试");
        this.f15015A.setText("让喜欢的人更直观了解你");
        final boolean[] zArr = {false};
        this.f15030x.setOnClickListener(new View.OnClickListener() { // from class: l.fs90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10622a.m17411o0(zArr, view);
            }
        });
        mo3351O().lifecycle().filter(new w9j() { // from class: l.gs90
            public final Object call(Object obj) {
                return ls90.m17400d0(zArr, (c) obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.hs90
            public final void call(Object obj) {
                CoreModule.c.e0.W9(CoreModule.H().userId());
            }
        }, new e30() { // from class: l.is90
            public final void call(Object obj) {
                ls90.m17401e0((Throwable) obj);
            }
        }));
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m17403g0(mo3351O().mo9267H2(), viewGroup);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m17415s0(String str) {
        if (TextUtils.equals(str, "冰山威士忌")) {
            this.f15031y.setImageResource(x2c0.id);
            this.f15030x.setBackgroundResource(x2c0.od);
            return;
        }
        if (TextUtils.equals(str, "陈年拉菲酒")) {
            this.f15031y.setImageResource(x2c0.jd);
            this.f15030x.setBackgroundResource(x2c0.pd);
            return;
        }
        if (TextUtils.equals(str, "清醒冰美式")) {
            this.f15031y.setImageResource(x2c0.xd);
            this.f15030x.setBackgroundResource(x2c0.ud);
            return;
        }
        if (TextUtils.equals(str, "手打柠檬茶")) {
            this.f15031y.setImageResource(x2c0.zd);
            this.f15030x.setBackgroundResource(x2c0.wd);
            return;
        }
        if (TextUtils.equals(str, "奥利奥奶茶")) {
            this.f15031y.setImageResource(x2c0.nd);
            this.f15030x.setBackgroundResource(x2c0.td);
            return;
        }
        if (TextUtils.equals(str, "橘子盐汽水")) {
            this.f15031y.setImageResource(x2c0.md);
            this.f15030x.setBackgroundResource(x2c0.sd);
            return;
        }
        boolean zEquals = TextUtils.equals(str, "纯纯凉白开");
        ImageView imageView = this.f15031y;
        if (zEquals) {
            imageView.setImageResource(x2c0.kd);
            this.f15030x.setBackgroundResource(x2c0.qd);
        } else {
            imageView.setImageResource(x2c0.ld);
            this.f15030x.setBackgroundResource(x2c0.rd);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (mo3351O().mo1523P1()) {
            return;
        }
        if (!o.n3(mo3351O().mo1517K2()) && !o.m3(CoreModule.c.e0.na())) {
            xdl0.M(this.f15029w, false);
            m17414r0();
            return;
        }
        CharacterEvaluate userCharacter = mo3351O().mo1517K2().settings.getUserCharacter();
        if (userCharacter == null) {
            CrashHelper.c(new NullChecker.TantanNullException());
            return;
        }
        zvf0.A("e_character", m17404h0(mo3351O().mo1570m0()), new j760[]{vwb.Y("tab_status", o.n3(CoreModule.c.e0.na()) ? "match" : "test_too")});
        xdl0.M(this.f15029w, false);
        m17413q0(userCharacter, new d30() { // from class: l.wr90
            public final void call() {
                this.f21950a.m17406j0();
            }
        }, "other_profile");
    }

    /* JADX INFO: renamed from: t0 */
    public final void m17416t0(View view, int i) {
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
                layoutParams.rightMargin = (int) (this.f15019E.getWidth() * 0.14f);
                break;
            case 2:
                layoutParams.rightMargin = (int) (this.f15019E.getWidth() * 0.27f);
                break;
            case 3:
                layoutParams.rightMargin = (int) (this.f15019E.getWidth() * 0.41f);
                break;
            case 4:
                layoutParams.leftMargin = (int) (this.f15019E.getWidth() * 0.41f);
                break;
            case 5:
                layoutParams.leftMargin = (int) (this.f15019E.getWidth() * 0.27f);
                break;
            case 6:
                layoutParams.leftMargin = (int) (this.f15019E.getWidth() * 0.14f);
                break;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m17417u0(List<String> list) {
        if (vwb.J(list)) {
            CrashHelper.c(new NullChecker.TantanNullException());
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(" · ");
            }
        }
        this.f15015A.setText(sb);
    }
}
