package p153l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class mpe extends kpe {

    /* JADX INFO: renamed from: A */
    public VText_Tags f137912A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f137913B;

    /* JADX INFO: renamed from: C */
    public VText f137914C;

    /* JADX INFO: renamed from: D */
    public ProfileIntegrityOptView f137915D;

    public mpe(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ SpannableStringBuilder m159362c0(Integer num, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "1");
        spannableStringBuilder.setSpan(new df00(CoreModule.f18263b, "+ " + CoreModule.f18263b.getString(R$string.f18887Tk), mo53983O().act().getResources().getColor(c9c0.f80445p), -1, num.intValue(), 6, qa00.f156322i, 13.0f, -395016, qa00.m175859d(3.0f), true, qa00.m175859d(44.0f)), 0, 1, 33);
        return spannableStringBuilder;
    }

    @Override // p153l.kpe, p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f137912A.setTypeface(Typeface.defaultFromStyle(1));
        this.f74121v.setTypeface(Typeface.defaultFromStyle(1));
        this.f137912A.setTags(new rcj() { // from class: l.lpe
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f133043a.m159362c0((Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.kpe, p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.aza0, p153l.on2
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125667Va, viewGroup, false);
        this.f137914C = (VText) viewInflate.findViewById(adc0.f70390ib);
        this.f74120u = (VLinear_Dividers) viewInflate.findViewById(adc0.f70406jb);
        this.f137915D = (ProfileIntegrityOptView) viewInflate.findViewById(adc0.f70571t6);
        this.f74121v = (VText) viewInflate.findViewById(adc0.f70390ib);
        VText_Tags vText_Tags = (VText_Tags) viewInflate.findViewById(adc0.f70513q);
        this.f137912A = vText_Tags;
        this.f74122w = vText_Tags;
        this.f137913B = (LinearLayout) viewInflate.findViewById(adc0.f70635x2);
        return viewInflate;
    }

    @Override // p153l.kpe, p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        int i;
        super.mo53914t();
        if (!gra.m131596L3() || (i = xra.m212800s().weight.question) <= 0) {
            bnl0.m105524M(this.f137915D, false);
        } else {
            this.f137915D.m54066P(jyb.m147479J(mo53983O().m189086i2().profile.answers) ? 0 : i, i, "添加问答");
            bnl0.m105524M(this.f137915D, true);
        }
        mo53983O().m189086i2();
    }

    @Override // p153l.kpe
    /* JADX INFO: renamed from: Z */
    public void mo150722Z() {
    }
}
