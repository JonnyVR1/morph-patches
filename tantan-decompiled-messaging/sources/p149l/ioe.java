package p149l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class ioe extends goe {

    /* JADX INFO: renamed from: A */
    public VText_Tags f114151A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f114152B;

    /* JADX INFO: renamed from: C */
    public VText f114153C;

    /* JADX INFO: renamed from: D */
    public ProfileIntegrityOptView f114154D;

    public ioe(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ SpannableStringBuilder m137333c0(Integer num, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "1");
        spannableStringBuilder.setSpan(new u600(CoreModule.f17544b, "+ " + CoreModule.f17544b.getString(R$string.f19069xk), mo52800O().act().getResources().getColor(w0c0.f183875p), -1, num.intValue(), 6, t100.f167260i, 13.0f, -395016, t100.m186890d(3.0f), true, t100.m186890d(44.0f)), 0, 1, 33);
        return spannableStringBuilder;
    }

    @Override // p149l.goe, p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f114151A.setTypeface(Typeface.defaultFromStyle(1));
        this.f187674v.setTypeface(Typeface.defaultFromStyle(1));
        this.f114151A.setTags(new x9j() { // from class: l.hoe
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f108819a.m137333c0((Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.goe, p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.wqa0, p149l.hn2
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95501Oa, viewGroup, false);
        this.f114153C = (VText) viewInflate.findViewById(u4c0.f174265gb);
        this.f187673u = (VLinear_Dividers) viewInflate.findViewById(u4c0.f174282hb);
        this.f114154D = (ProfileIntegrityOptView) viewInflate.findViewById(u4c0.f174446r6);
        this.f187674v = (VText) viewInflate.findViewById(u4c0.f174265gb);
        VText_Tags vText_Tags = (VText_Tags) viewInflate.findViewById(u4c0.f174422q);
        this.f114151A = vText_Tags;
        this.f187675w = vText_Tags;
        this.f114152B = (LinearLayout) viewInflate.findViewById(u4c0.f174510v2);
        return viewInflate;
    }

    @Override // p149l.goe, p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        int i;
        super.mo52731t();
        if (!upa.m194665L3() || (i = lqa.m150981s().weight.question) <= 0) {
            xdl0.m208344M(this.f114154D, false);
        } else {
            this.f114154D.m52883P(vwb.m200296J(mo52800O().m94569i2().profile.answers) ? 0 : i, i, "添加问答");
            xdl0.m208344M(this.f114154D, true);
        }
        mo52800O().m94569i2();
    }

    @Override // p149l.goe
    /* JADX INFO: renamed from: Z */
    public void mo127241Z() {
    }
}
