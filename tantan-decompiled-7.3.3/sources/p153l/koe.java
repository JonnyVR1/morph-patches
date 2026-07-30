package p153l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class koe extends ep90 {

    /* JADX INFO: renamed from: A */
    public VText f127714A;

    /* JADX INFO: renamed from: B */
    public VText f127715B;

    /* JADX INFO: renamed from: C */
    public VText f127716C;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f127717u;

    /* JADX INFO: renamed from: v */
    public VText f127718v;

    /* JADX INFO: renamed from: w */
    public ImageView f127719w;

    /* JADX INFO: renamed from: x */
    public ProfileIntegrityOptView f127720x;

    /* JADX INFO: renamed from: y */
    public VImage f127721y;

    /* JADX INFO: renamed from: z */
    public VText f127722z;

    public koe(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: U */
    private void m150599U() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "self_introduction"));
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: V */
    private String m150600V(int i) {
        return mo53983O().act().getString(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m150601W(View view) {
        m150599U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m150602X(View view) {
        m150599U();
    }

    /* JADX INFO: renamed from: T */
    public View m150603T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return loe.m155049b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f127718v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f127716C.setTypeface(typeface);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m150603T(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        int i;
        String str = mo53983O().m189086i2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ImageView imageView = this.f127719w;
        if (zIsEmpty) {
            imageView.setVisibility(8);
            this.f127716C.setText(m150600V(R$string.f18285A));
            Drawable drawable = mo53983O().act().getResources().getDrawable(dbc0.f87422sm);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f127716C.setCompoundDrawables(null, null, drawable, null);
        } else {
            imageView.setVisibility(0);
            this.f127716C.setText(str);
            this.f127716C.setCompoundDrawables(null, null, null, null);
        }
        this.f127719w.setOnClickListener(new View.OnClickListener() { // from class: l.ioe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116143a.m150601W(view);
            }
        });
        this.f127716C.setOnClickListener(new View.OnClickListener() { // from class: l.joe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121994a.m150602X(view);
            }
        });
        VText vText = this.f127718v;
        String strM150600V = m150600V(R$string.f18524Hl);
        if (TextUtils.isEmpty(str)) {
            i = gra.m131596L3() ? xra.m212800s().weight.introduction : gra.m131728p().weight.introduction;
        } else {
            i = 0;
        }
        m121844P(vText, strM150600V, i);
        if (!gra.m131596L3()) {
            bnl0.m105524M(this.f127720x, false);
            return;
        }
        int i2 = xra.m212800s().weight.introduction;
        if (i2 <= 0) {
            bnl0.m105524M(this.f127720x, false);
        } else {
            this.f127720x.m54066P(TextUtils.isEmpty(str) ? 0 : i2, i2, "添加自我介绍");
            bnl0.m105524M(this.f127720x, true);
        }
    }
}
