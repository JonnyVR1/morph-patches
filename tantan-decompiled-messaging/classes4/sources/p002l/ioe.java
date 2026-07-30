package p002l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import l.f6c0;
import l.lqa;
import l.mcr;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ioe extends goe {

    /* JADX INFO: renamed from: A */
    public VText_Tags f13334A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f13335B;

    /* JADX INFO: renamed from: C */
    public VText f13336C;

    /* JADX INFO: renamed from: D */
    public ProfileIntegrityOptView f13337D;

    public ioe(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ SpannableStringBuilder m15268c0(Integer num, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "1");
        spannableStringBuilder.setSpan(new u600(CoreModule.b, "+ " + CoreModule.b.getString(R.string.xk), mo3351O().act().getResources().getColor(w0c0.p), -1, num.intValue(), 6, t100.i, 13.0f, -395016, t100.d(3.0f), true, t100.d(44.0f)), 0, 1, 33);
        return spannableStringBuilder;
    }

    @Override // p002l.goe, p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f13334A.setTypeface(Typeface.defaultFromStyle(1));
        this.f21930v.setTypeface(Typeface.defaultFromStyle(1));
        this.f13334A.setTags(new x9j() { // from class: l.hoe
            public final Object call(Object obj, Object obj2) {
                return this.f12202a.m15268c0((Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.goe, p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.wqa0, p002l.hn2
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.Oa, viewGroup, false);
        this.f13336C = viewInflate.findViewById(u4c0.gb);
        this.f21929u = viewInflate.findViewById(u4c0.hb);
        this.f13337D = (ProfileIntegrityOptView) viewInflate.findViewById(u4c0.r6);
        this.f21930v = viewInflate.findViewById(u4c0.gb);
        VText_Tags vText_TagsFindViewById = viewInflate.findViewById(u4c0.q);
        this.f13334A = vText_TagsFindViewById;
        this.f21931w = vText_TagsFindViewById;
        this.f13335B = (LinearLayout) viewInflate.findViewById(u4c0.v2);
        return viewInflate;
    }

    @Override // p002l.goe, p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        int i;
        super.mo3282t();
        if (!upa.L3() || (i = lqa.s().weight.question) <= 0) {
            xdl0.M(this.f13337D, false);
        } else {
            this.f13337D.m3436P(vwb.J(mo3351O().m9268i2().profile.answers) ? 0 : i, i, "添加问答");
            xdl0.M(this.f13337D, true);
        }
        mo3351O().m9268i2();
    }

    @Override // p002l.goe
    /* JADX INFO: renamed from: Z */
    public void mo13991Z() {
    }
}
