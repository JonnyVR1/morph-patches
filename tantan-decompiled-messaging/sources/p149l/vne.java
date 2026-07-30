package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p046p1.mobile.putong.data.CharacterEvaluate;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vne extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f182228A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f182229B;

    /* JADX INFO: renamed from: C */
    public VText f182230C;

    /* JADX INFO: renamed from: D */
    public ImageView f182231D;

    /* JADX INFO: renamed from: E */
    public MbtiLayout f182232E;

    /* JADX INFO: renamed from: F */
    public VLinear f182233F;

    /* JADX INFO: renamed from: G */
    public VText f182234G;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f182235u;

    /* JADX INFO: renamed from: v */
    public VText f182236v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f182237w;

    /* JADX INFO: renamed from: x */
    public VImage f182238x;

    /* JADX INFO: renamed from: y */
    public VText f182239y;

    /* JADX INFO: renamed from: z */
    public VText f182240z;

    public vne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m199006T(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ Boolean m199008V(boolean[] zArr, C4319c c4319c) {
        boolean z = false;
        if (c4319c == C4319c.f15548i && zArr[0] && wn90.m204602F().f187271c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: X */
    public View m199010X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wne.m204679b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m199011Y(boolean[] zArr, String str, View view) {
        o6j0.m162859c("e_test_mbti", "p_edit_profile_view", new o6j0.C18854a[0]);
        wn90.m204602F().f187271c = false;
        zArr[0] = true;
        mo52800O().act().startActivity(MkWebViewAct.m80240e2(mo52800O().act(), "", str, true, true, true, true, null));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m199012Z(boolean[] zArr, View view) {
        String str = CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.mbti.get(0);
        wn90.m204602F().f187271c = false;
        zArr[0] = true;
        mo52800O().act().startActivity(MkWebViewAct.m80240e2(mo52800O().act(), "", pj90.f149726n + str + "&uid=" + CoreModule.m29931H().userId(), true, true, true, true, null));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m199013a0(CharacterEvaluate characterEvaluate, View view) {
        C4749o.m34344r3(mo52800O().act(), mo52800O().mo51069K2(), C4749o.m34345s3(C4749o.f20068T, mo52800O().userId(), characterEvaluate.hideCharacter, "my_profile"));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: d */
    public int mo107404d() {
        return t100.f167259h;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m199010X(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        VText vText = this.f182234G;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f182236v.setTypeface(typeface);
        this.f182230C.setTypeface(typeface);
        final boolean[] zArr = {false};
        boolean zM204604Q = wn90.m204604Q(CoreModule.f17545c.f19639e0.m169520na());
        LinearLayout linearLayout = this.f182229B;
        if (zM204604Q) {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f182232E, true);
            xdl0.m208329E0(this.f182232E, new View.OnClickListener() { // from class: l.qne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155419a.m199012Z(zArr, view);
                }
            });
            this.f182232E.m38352f(mo52800O().mo51069K2());
            this.f182232E.m38351e();
        } else {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(this.f182232E, false);
            final String str = String.format(pj90.f149727o, "edit_profile");
            xdl0.m208329E0(this.f182229B, new View.OnClickListener() { // from class: l.pne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150387a.m199011Y(zArr, str, view);
                }
            });
        }
        final CharacterEvaluate characterEvaluate = CoreModule.f17545c.f19639e0.f149253R.get().characterEvaluate;
        if (characterEvaluate == null || TextUtils.isEmpty(characterEvaluate.classification)) {
            xdl0.m208344M(this.f182233F, false);
        } else {
            xdl0.m208329E0(this.f182233F, new View.OnClickListener() { // from class: l.rne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f160262a.m199013a0(characterEvaluate, view);
                }
            });
        }
        mo52800O().lifecycle().filter(new w9j() { // from class: l.sne
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vne.m199008V(zArr, (C4319c) obj);
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.tne
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }, new e30() { // from class: l.une
            @Override // p149l.e30
            public final void call(Object obj) {
                vne.m199006T((Throwable) obj);
            }
        }));
        m96419P(this.f182236v, "我的社交性格", wn90.m204604Q(CoreModule.f17545c.f19639e0.m169520na()) ? 0 : lqa.m150981s().weight.socialPersonalityTest);
        if (!upa.m194665L3()) {
            xdl0.m208344M(this.f182237w, false);
            return;
        }
        int i = lqa.m150981s().weight.livingHabit;
        if (i <= 0) {
            xdl0.m208344M(this.f182237w, false);
        } else {
            this.f182237w.m52883P(wn90.m204604Q(CoreModule.f17545c.f19639e0.m169520na()) ? i : 0, i, "测试我的MBTI");
            xdl0.m208344M(this.f182237w, true);
        }
    }
}
