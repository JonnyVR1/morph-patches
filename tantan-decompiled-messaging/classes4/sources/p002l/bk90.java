package p002l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.settings.addemoji.AddEmojiAct;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.mcr;
import l.rzb0;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bk90 extends xf90 {

    /* JADX INFO: renamed from: A */
    public boolean f8197A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f8198v;

    /* JADX INFO: renamed from: w */
    public VImage f8199w;

    /* JADX INFO: renamed from: x */
    public VImage f8200x;

    /* JADX INFO: renamed from: y */
    public VText f8201y;

    /* JADX INFO: renamed from: z */
    public cwa0 f8202z;

    public bk90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f8202z = new cwa0();
        this.f8197A = false;
    }

    @Override // p002l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo10392S() {
        if (mo3351O().mo1523P1()) {
            return false;
        }
        vwb.J(mo3351O().mo1517K2().profile.extensions.interest.emoji);
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10393X(boolean z) {
        zvf0.r("e_other_profile_edit_emoji_banner", mo3351O().pageId());
        mo3351O().startActivity(AddEmojiAct.a2(mo3351O().act(), true, !z, "other_profile"));
        mo3351O().act().overridePendingTransition(rzb0.y, rzb0.q);
    }

    /* JADX INFO: renamed from: Y */
    public final void m10394Y() {
        User userMo1517K2 = mo3351O().mo1517K2();
        final boolean zMo1523P1 = mo3351O().mo1523P1();
        mo3351O().mo2827me();
        if (vwb.J(userMo1517K2.profile.extensions.interest.emoji)) {
            return;
        }
        if (!this.f8197A) {
            zvf0.x("e_other_profile_edit_emoji_banner", mo3351O().pageId());
            this.f8197A = true;
        }
        xdl0.M(this.f8198v, true);
        this.f8199w.setImageResource(x2c0.a);
        ViewGroup.LayoutParams layoutParams = this.f8198v.getLayoutParams();
        layoutParams.height = t100.d(55.0f);
        this.f8198v.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f8199w.getLayoutParams();
        layoutParams2.width = t100.d(24.0f);
        layoutParams2.height = t100.d(24.0f);
        this.f8199w.setLayoutParams(layoutParams2);
        this.f8198v.setBackgroundColor(Color.parseColor("#e6f2ff"));
        ViewGroup.LayoutParams layoutParams3 = this.f8200x.getLayoutParams();
        layoutParams3.width = t100.d(24.0f);
        layoutParams3.height = t100.d(24.0f);
        this.f8200x.setLayoutParams(layoutParams3);
        this.f8200x.setImageResource(x2c0.Er);
        this.f8201y.setTextColor(-11777466);
        m25903U(this.f8198v, 0, true, new d30() { // from class: l.ak90
            public final void call() {
                this.f7667a.m10393X(zMo1523P1);
            }
        }, this.f8201y, mo3351O().act().getString(R.string.Tb));
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM11396a = this.f8202z.m11396a(m14465w().mo9267H2(), viewGroup);
        cwa0 cwa0Var = this.f8202z;
        this.f8198v = cwa0Var.f8957a;
        this.f8199w = cwa0Var.f8958b;
        this.f8200x = cwa0Var.f8959c;
        this.f8201y = cwa0Var.f8960d;
        return viewM11396a;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m10394Y();
    }
}
