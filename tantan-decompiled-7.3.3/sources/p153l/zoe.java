package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p051p1.mobile.putong.data.CharacterEvaluate;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zoe extends ep90 {

    /* JADX INFO: renamed from: A */
    public VText f205321A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f205322B;

    /* JADX INFO: renamed from: C */
    public VText f205323C;

    /* JADX INFO: renamed from: D */
    public ImageView f205324D;

    /* JADX INFO: renamed from: E */
    public MbtiLayout f205325E;

    /* JADX INFO: renamed from: F */
    public VLinear f205326F;

    /* JADX INFO: renamed from: G */
    public VText f205327G;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f205328u;

    /* JADX INFO: renamed from: v */
    public VText f205329v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f205330w;

    /* JADX INFO: renamed from: x */
    public VImage f205331x;

    /* JADX INFO: renamed from: y */
    public VText f205332y;

    /* JADX INFO: renamed from: z */
    public VText f205333z;

    public zoe(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m220742T(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ Boolean m220744V(boolean[] zArr, C4470c c4470c) {
        boolean z = false;
        if (c4470c == C4470c.f16267i && zArr[0] && aw90.m100562F().f73703c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: X */
    public View m220746X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ape.m99313b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m220747Y(boolean[] zArr, String str, View view) {
        sfj0.m185596c("e_test_mbti", "p_edit_profile_view", new sfj0.C20032a[0]);
        aw90.m100562F().f73703c = false;
        zArr[0] = true;
        mo53983O().act().startActivity(MkWebViewAct.m81423g2(mo53983O().act(), "", str, true, true, true, true, null));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m220748Z(boolean[] zArr, View view) {
        String str = CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.mbti.get(0);
        aw90.m100562F().f73703c = false;
        zArr[0] = true;
        mo53983O().act().startActivity(MkWebViewAct.m81423g2(mo53983O().act(), "", tr90.f175820n + str + "&uid=" + CoreModule.m30929H().userId(), true, true, true, true, null));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m220749a0(CharacterEvaluate characterEvaluate, View view) {
        C4900o.m35347r3(mo53983O().act(), mo53983O().mo52252K2(), C4900o.m35348s3(C4900o.f20810T, mo53983O().userId(), characterEvaluate.hideCharacter, "my_profile"));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: d */
    public int mo130650d() {
        return qa00.f156321h;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m220746X(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        VText vText = this.f205327G;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f205329v.setTypeface(typeface);
        this.f205323C.setTypeface(typeface);
        final boolean[] zArr = {false};
        boolean zM100564Q = aw90.m100564Q(CoreModule.f18264c.f20381e0.m116593na());
        LinearLayout linearLayout = this.f205322B;
        if (zM100564Q) {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f205325E, true);
            bnl0.m105509E0(this.f205325E, new View.OnClickListener() { // from class: l.uoe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180036a.m220748Z(zArr, view);
                }
            });
            this.f205325E.m39355f(mo53983O().mo52252K2());
            this.f205325E.m39354e();
        } else {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(this.f205325E, false);
            final String str = String.format(tr90.f175821o, "edit_profile");
            bnl0.m105509E0(this.f205322B, new View.OnClickListener() { // from class: l.toe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f175396a.m220747Y(zArr, str, view);
                }
            });
        }
        final CharacterEvaluate characterEvaluate = CoreModule.f18264c.f20381e0.f89110R.get().characterEvaluate;
        if (characterEvaluate == null || TextUtils.isEmpty(characterEvaluate.classification)) {
            bnl0.m105524M(this.f205326F, false);
        } else {
            bnl0.m105509E0(this.f205326F, new View.OnClickListener() { // from class: l.voe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185036a.m220749a0(characterEvaluate, view);
                }
            });
        }
        mo53983O().lifecycle().filter(new qcj() { // from class: l.woe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zoe.m220744V(zArr, (C4470c) obj);
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.xoe
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }, new y20() { // from class: l.yoe
            @Override // p153l.y20
            public final void call(Object obj) {
                zoe.m220742T((Throwable) obj);
            }
        }));
        m121844P(this.f205329v, "我的社交性格", aw90.m100564Q(CoreModule.f18264c.f20381e0.m116593na()) ? 0 : xra.m212800s().weight.socialPersonalityTest);
        if (!gra.m131596L3()) {
            bnl0.m105524M(this.f205330w, false);
            return;
        }
        int i = xra.m212800s().weight.livingHabit;
        if (i <= 0) {
            bnl0.m105524M(this.f205330w, false);
        } else {
            this.f205330w.m54066P(aw90.m100564Q(CoreModule.f18264c.f20381e0.m116593na()) ? i : 0, i, "测试我的MBTI");
            bnl0.m105524M(this.f205330w, true);
        }
    }
}
