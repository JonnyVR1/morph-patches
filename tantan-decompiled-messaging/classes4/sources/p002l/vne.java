package p002l;

import android.graphics.Typeface;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.o;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p1.mobile.putong.data.CharacterEvaluate;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.e30;
import l.lqa;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.pj90;
import l.t100;
import l.upa;
import l.w9j;
import l.wn90;
import l.wne;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vne extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f21232A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f21233B;

    /* JADX INFO: renamed from: C */
    public VText f21234C;

    /* JADX INFO: renamed from: D */
    public ImageView f21235D;

    /* JADX INFO: renamed from: E */
    public MbtiLayout f21236E;

    /* JADX INFO: renamed from: F */
    public VLinear f21237F;

    /* JADX INFO: renamed from: G */
    public VText f21238G;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f21239u;

    /* JADX INFO: renamed from: v */
    public VText f21240v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f21241w;

    /* JADX INFO: renamed from: x */
    public VImage f21242x;

    /* JADX INFO: renamed from: y */
    public VText f21243y;

    /* JADX INFO: renamed from: z */
    public VText f21244z;

    public vne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m24075T(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ Boolean m24077V(boolean[] zArr, c cVar) {
        boolean z = false;
        if (cVar == c.i && zArr[0] && wn90.F().c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: X */
    public View m24079X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wne.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m24080Y(boolean[] zArr, String str, View view) {
        o6j0.c("e_test_mbti", "p_edit_profile_view", new o6j0.a[0]);
        wn90.F().c = false;
        zArr[0] = true;
        mo3351O().act().startActivity(MkWebViewAct.e2(mo3351O().act(), "", str, true, true, true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m24081Z(boolean[] zArr, View view) {
        String str = (String) CoreModule.c.e0.p9().profile.extensions.basic.mbti.get(0);
        wn90.F().c = false;
        zArr[0] = true;
        mo3351O().act().startActivity(MkWebViewAct.e2(mo3351O().act(), "", pj90.n + str + "&uid=" + CoreModule.H().userId(), true, true, true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m24082a0(CharacterEvaluate characterEvaluate, View view) {
        o.r3(mo3351O().act(), mo3351O().mo1517K2(), o.s3(o.T, mo3351O().userId(), characterEvaluate.hideCharacter, "my_profile"));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: d */
    public int mo11100d() {
        return t100.h;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m24079X(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        VText vText = this.f21238G;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f21240v.setTypeface(typeface);
        this.f21234C.setTypeface(typeface);
        final boolean[] zArr = {false};
        boolean zQ = wn90.Q(CoreModule.c.e0.na());
        LinearLayout linearLayout = this.f21233B;
        if (zQ) {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f21236E, true);
            xdl0.E0(this.f21236E, new View.OnClickListener() { // from class: l.qne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18101a.m24081Z(zArr, view);
                }
            });
            this.f21236E.f(mo3351O().mo1517K2());
            this.f21236E.e();
        } else {
            xdl0.M(linearLayout, true);
            xdl0.M(this.f21236E, false);
            final String str = String.format(pj90.o, "edit_profile");
            xdl0.E0(this.f21233B, new View.OnClickListener() { // from class: l.pne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17542a.m24080Y(zArr, str, view);
                }
            });
        }
        final CharacterEvaluate characterEvaluate = ((SettingGroups) CoreModule.c.e0.R.get()).characterEvaluate;
        if (characterEvaluate == null || TextUtils.isEmpty(characterEvaluate.classification)) {
            xdl0.M(this.f21237F, false);
        } else {
            xdl0.E0(this.f21237F, new View.OnClickListener() { // from class: l.rne
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18615a.m24082a0(characterEvaluate, view);
                }
            });
        }
        mo3351O().lifecycle().filter(new w9j() { // from class: l.sne
            public final Object call(Object obj) {
                return vne.m24077V(zArr, (c) obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.tne
            public final void call(Object obj) {
                CoreModule.c.e0.W9(CoreModule.H().userId());
            }
        }, new e30() { // from class: l.une
            public final void call(Object obj) {
                vne.m24075T((Throwable) obj);
            }
        }));
        m9650P(this.f21240v, "我的社交性格", wn90.Q(CoreModule.c.e0.na()) ? 0 : lqa.s().weight.socialPersonalityTest);
        if (!upa.L3()) {
            xdl0.M(this.f21241w, false);
            return;
        }
        int i = lqa.s().weight.livingHabit;
        if (i <= 0) {
            xdl0.M(this.f21241w, false);
        } else {
            this.f21241w.m3436P(wn90.Q(CoreModule.c.e0.na()) ? i : 0, i, "测试我的MBTI");
            xdl0.M(this.f21241w, true);
        }
    }
}
