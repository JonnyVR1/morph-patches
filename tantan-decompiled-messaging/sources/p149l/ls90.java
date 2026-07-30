package p149l;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.data.CharacterEvaluate;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ls90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public TextView f129820A;

    /* JADX INFO: renamed from: B */
    public TextView f129821B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f129822C;

    /* JADX INFO: renamed from: D */
    public TextView f129823D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f129824E;

    /* JADX INFO: renamed from: F */
    public View f129825F;

    /* JADX INFO: renamed from: G */
    public TextView f129826G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f129827H;

    /* JADX INFO: renamed from: I */
    public View f129828I;

    /* JADX INFO: renamed from: J */
    public TextView f129829J;

    /* JADX INFO: renamed from: K */
    public FrameLayout f129830K;

    /* JADX INFO: renamed from: L */
    public View f129831L;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f129832u;

    /* JADX INFO: renamed from: v */
    public VText f129833v;

    /* JADX INFO: renamed from: w */
    public VText f129834w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f129835x;

    /* JADX INFO: renamed from: y */
    public ImageView f129836y;

    /* JADX INFO: renamed from: z */
    public TextView f129837z;

    public ls90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m151523T(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ Boolean m151531b0(boolean[] zArr, C4319c c4319c) {
        boolean z = false;
        if (c4319c == C4319c.f15548i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ Boolean m151533d0(boolean[] zArr, C4319c c4319c) {
        boolean z = false;
        if (c4319c == C4319c.f15548i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m151534e0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public View m151536g0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ms90.m156122b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m151537h0(boolean z) {
        return z ? "p_edit_profile_view" : OMSDialogPositon.p_suggest_user_profile_info_view;
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m151538i0(SettingGroups settingGroups) {
        m151545p0();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f129833v.setTypeface(Typeface.DEFAULT_BOLD);
        if (mo52800O().mo51075P1()) {
            mo52800O().lifecycle().filter(new w9j() { // from class: l.cs90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).flatMap(new w9j() { // from class: l.ds90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19639e0.m169403J7();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.es90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92998a.m151538i0((SettingGroups) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m151539j0() {
        zvf0.m220399u("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", C4749o.m34343n3(CoreModule.f17545c.f19639e0.m169520na()) ? "match" : "test_too"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m151540k0(CharacterEvaluate characterEvaluate) {
        if (characterEvaluate.hideCharacter) {
            zvf0.m220368A("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", "hide"));
            this.f129834w.setText("已隐藏");
        } else {
            zvf0.m220368A("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", "none"));
            this.f129834w.setText("");
        }
        xdl0.m208344M(this.f129834w, true);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (mo52800O().mo51075P1()) {
            return true;
        }
        if (!lqa.m150977o() || C4749o.m34343n3(mo52800O().mo51069K2())) {
            return (NullChecker.m81303a(mo52800O().mo51069K2()) && C4749o.m34343n3(mo52800O().mo51069K2())) || !C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na());
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m151541l0(CharacterEvaluate characterEvaluate, d30 d30Var) {
        zvf0.m220399u("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", characterEvaluate.hideCharacter ? "hide" : "none"));
        d30Var.call();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m151542m0(CharacterEvaluate characterEvaluate) {
        m151549t0(this.f129825F, characterEvaluate.actionTemperature);
        m151549t0(this.f129828I, characterEvaluate.characterSweetness);
        m151549t0(this.f129831L, characterEvaluate.alcoholConcentration);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m151543n0(boolean[] zArr, d30 d30Var, String str, CharacterEvaluate characterEvaluate, String str2, View view) {
        zArr[0] = true;
        d30Var.call();
        C4749o.m34344r3(mo52800O().act(), mo52800O().mo51069K2(), C4749o.m34345s3(str, mo52800O().userId(), characterEvaluate.hideCharacter, str2));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m151544o0(boolean[] zArr, View view) {
        zArr[0] = true;
        zvf0.m220399u("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", "test"));
        C4749o.m34344r3(mo52800O().act(), mo52800O().mo51069K2(), C4749o.m34345s3(C4749o.f20069U, "", false, mo52800O().mo51075P1() ? "my_profile" : "other_profile"));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m151545p0() {
        final CharacterEvaluate characterEvaluate = CoreModule.f17545c.f19639e0.f149253R.get().characterEvaluate;
        if (!NullChecker.m81303a(characterEvaluate) || TextUtils.isEmpty(characterEvaluate.classification)) {
            xdl0.m208344M(this.f129834w, false);
            m151547r0();
        } else {
            final d30 d30Var = new d30() { // from class: l.js90
                @Override // p149l.d30
                public final void call() {
                    this.f119483a.m151540k0(characterEvaluate);
                }
            };
            d30Var.call();
            m151546q0(characterEvaluate, new d30() { // from class: l.ks90
                @Override // p149l.d30
                public final void call() {
                    this.f124428a.m151541l0(characterEvaluate, d30Var);
                }
            }, "my_profile");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m151546q0(@NonNull final CharacterEvaluate characterEvaluate, @NonNull final d30 d30Var, final String str) {
        m151550u0(characterEvaluate.tags);
        this.f129837z.setText(characterEvaluate.classification);
        m151548s0(characterEvaluate.classification);
        xdl0.m208344M(this.f129822C, true);
        this.f129825F.post(new Runnable() { // from class: l.xr90
            @Override // java.lang.Runnable
            public final void run() {
                this.f194104a.m151542m0(characterEvaluate);
            }
        });
        final String str2 = C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na()) ? C4749o.f20068T : C4749o.f20069U;
        final boolean[] zArr = {false};
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.yr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199651a.m151543n0(zArr, d30Var, str2, characterEvaluate, str, view);
            }
        };
        this.f129834w.setOnClickListener(onClickListener);
        this.f129835x.setOnClickListener(onClickListener);
        this.f129822C.setOnClickListener(onClickListener);
        boolean zMo51075P1 = mo52800O().mo51075P1();
        TextView textView = this.f129821B;
        if (zMo51075P1) {
            xdl0.m208344M(textView, false);
        } else {
            textView.setText(C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na()) ? "匹配解析" : "我也去测");
            xdl0.m208344M(this.f129821B, true);
        }
        if (C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na())) {
            return;
        }
        mo52800O().lifecycle().filter(new w9j() { // from class: l.zr90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ls90.m151531b0(zArr, (C4319c) obj);
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.as90
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }, new e30() { // from class: l.bs90
            @Override // p149l.e30
            public final void call(Object obj) {
                ls90.m151523T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m151547r0() {
        zvf0.m220368A("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", "test"));
        this.f129821B.setText("去测试");
        xdl0.m208344M(this.f129821B, true);
        xdl0.m208344M(this.f129834w, false);
        xdl0.m208344M(this.f129822C, false);
        this.f129836y.setImageResource(x2c0.f190744yd);
        this.f129835x.setBackgroundResource(x2c0.f190648vd);
        this.f129837z.setText("完成社交性格测试");
        this.f129820A.setText("让喜欢的人更直观了解你");
        final boolean[] zArr = {false};
        this.f129835x.setOnClickListener(new View.OnClickListener() { // from class: l.fs90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99052a.m151544o0(zArr, view);
            }
        });
        mo52800O().lifecycle().filter(new w9j() { // from class: l.gs90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ls90.m151533d0(zArr, (C4319c) obj);
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.hs90
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }, new e30() { // from class: l.is90
            @Override // p149l.e30
            public final void call(Object obj) {
                ls90.m151534e0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m151536g0(mo52800O().mo94568H2(), viewGroup);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m151548s0(String str) {
        if (TextUtils.equals(str, "冰山威士忌")) {
            this.f129836y.setImageResource(x2c0.f190234id);
            this.f129835x.setBackgroundResource(x2c0.f190424od);
            return;
        }
        if (TextUtils.equals(str, "陈年拉菲酒")) {
            this.f129836y.setImageResource(x2c0.f190264jd);
            this.f129835x.setBackgroundResource(x2c0.f190456pd);
            return;
        }
        if (TextUtils.equals(str, "清醒冰美式")) {
            this.f129836y.setImageResource(x2c0.f190712xd);
            this.f129835x.setBackgroundResource(x2c0.f190616ud);
            return;
        }
        if (TextUtils.equals(str, "手打柠檬茶")) {
            this.f129836y.setImageResource(x2c0.f190776zd);
            this.f129835x.setBackgroundResource(x2c0.f190680wd);
            return;
        }
        if (TextUtils.equals(str, "奥利奥奶茶")) {
            this.f129836y.setImageResource(x2c0.f190392nd);
            this.f129835x.setBackgroundResource(x2c0.f190584td);
            return;
        }
        if (TextUtils.equals(str, "橘子盐汽水")) {
            this.f129836y.setImageResource(x2c0.f190360md);
            this.f129835x.setBackgroundResource(x2c0.f190552sd);
            return;
        }
        boolean zEquals = TextUtils.equals(str, "纯纯凉白开");
        ImageView imageView = this.f129836y;
        if (zEquals) {
            imageView.setImageResource(x2c0.f190296kd);
            this.f129835x.setBackgroundResource(x2c0.f190488qd);
        } else {
            imageView.setImageResource(x2c0.f190328ld);
            this.f129835x.setBackgroundResource(x2c0.f190520rd);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (mo52800O().mo51075P1()) {
            return;
        }
        if (!C4749o.m34343n3(mo52800O().mo51069K2()) && !C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na())) {
            xdl0.m208344M(this.f129834w, false);
            m151547r0();
            return;
        }
        CharacterEvaluate userCharacter = mo52800O().mo51069K2().settings.getUserCharacter();
        if (userCharacter == null) {
            CrashHelper.m81296c(new NullChecker.TantanNullException());
            return;
        }
        zvf0.m220368A("e_character", m151537h0(mo52800O().mo51119m0()), vwb.m200311Y("tab_status", C4749o.m34343n3(CoreModule.f17545c.f19639e0.m169520na()) ? "match" : "test_too"));
        xdl0.m208344M(this.f129834w, false);
        m151546q0(userCharacter, new d30() { // from class: l.wr90
            @Override // p149l.d30
            public final void call() {
                this.f187776a.m151539j0();
            }
        }, "other_profile");
    }

    /* JADX INFO: renamed from: t0 */
    public final void m151549t0(View view, int i) {
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
                layoutParams.rightMargin = (int) (this.f129824E.getWidth() * 0.14f);
                break;
            case 2:
                layoutParams.rightMargin = (int) (this.f129824E.getWidth() * 0.27f);
                break;
            case 3:
                layoutParams.rightMargin = (int) (this.f129824E.getWidth() * 0.41f);
                break;
            case 4:
                layoutParams.leftMargin = (int) (this.f129824E.getWidth() * 0.41f);
                break;
            case 5:
                layoutParams.leftMargin = (int) (this.f129824E.getWidth() * 0.27f);
                break;
            case 6:
                layoutParams.leftMargin = (int) (this.f129824E.getWidth() * 0.14f);
                break;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m151550u0(List<String> list) {
        if (vwb.m200296J(list)) {
            CrashHelper.m81296c(new NullChecker.TantanNullException());
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(" · ");
            }
        }
        this.f129820A.setText(sb);
    }
}
