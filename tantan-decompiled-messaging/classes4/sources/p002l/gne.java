package p002l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p1.mobile.putong.core.R;
import l.hne;
import l.lqa;
import l.mcr;
import l.o6j0;
import l.upa;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gne extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f11546A;

    /* JADX INFO: renamed from: B */
    public VText f11547B;

    /* JADX INFO: renamed from: C */
    public VText f11548C;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f11549u;

    /* JADX INFO: renamed from: v */
    public VText f11550v;

    /* JADX INFO: renamed from: w */
    public ImageView f11551w;

    /* JADX INFO: renamed from: x */
    public ProfileIntegrityOptView f11552x;

    /* JADX INFO: renamed from: y */
    public VImage f11553y;

    /* JADX INFO: renamed from: z */
    public VText f11554z;

    public gne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    private void m13968U() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "self_introduction")});
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: V */
    private String m13969V(int i) {
        return mo3351O().act().getString(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m13970W(View view) {
        m13968U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m13971X(View view) {
        m13968U();
    }

    /* JADX INFO: renamed from: T */
    public View m13972T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hne.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f11550v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f11548C.setTypeface(typeface);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m13972T(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        int i;
        String str = mo3351O().m9268i2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ImageView imageView = this.f11551w;
        if (zIsEmpty) {
            imageView.setVisibility(8);
            this.f11548C.setText(m13969V(R.string.A));
            Drawable drawable = mo3351O().act().getResources().getDrawable(x2c0.El);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f11548C.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            imageView.setVisibility(0);
            this.f11548C.setText(str);
            this.f11548C.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f11551w.setOnClickListener(new View.OnClickListener() { // from class: l.ene
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9883a.m13970W(view);
            }
        });
        this.f11548C.setOnClickListener(new View.OnClickListener() { // from class: l.fne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10536a.m13971X(view);
            }
        });
        VText vText = this.f11550v;
        String strM13969V = m13969V(R.string.ll);
        if (TextUtils.isEmpty(str)) {
            i = upa.L3() ? lqa.s().weight.introduction : upa.p().weight.introduction;
        } else {
            i = 0;
        }
        m9650P(vText, strM13969V, i);
        if (!upa.L3()) {
            xdl0.M(this.f11552x, false);
            return;
        }
        int i2 = lqa.s().weight.introduction;
        if (i2 <= 0) {
            xdl0.M(this.f11552x, false);
        } else {
            this.f11552x.m3436P(TextUtils.isEmpty(str) ? 0 : i2, i2, "添加自我介绍");
            xdl0.M(this.f11552x, true);
        }
    }
}
