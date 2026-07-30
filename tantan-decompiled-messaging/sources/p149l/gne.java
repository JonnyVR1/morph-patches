package p149l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gne extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f103587A;

    /* JADX INFO: renamed from: B */
    public VText f103588B;

    /* JADX INFO: renamed from: C */
    public VText f103589C;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f103590u;

    /* JADX INFO: renamed from: v */
    public VText f103591v;

    /* JADX INFO: renamed from: w */
    public ImageView f103592w;

    /* JADX INFO: renamed from: x */
    public ProfileIntegrityOptView f103593x;

    /* JADX INFO: renamed from: y */
    public VImage f103594y;

    /* JADX INFO: renamed from: z */
    public VText f103595z;

    public gne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    private void m127131U() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "self_introduction"));
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: V */
    private String m127132V(int i) {
        return mo52800O().act().getString(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m127133W(View view) {
        m127131U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m127134X(View view) {
        m127131U();
    }

    /* JADX INFO: renamed from: T */
    public View m127135T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hne.m131915b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f103591v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f103589C.setTypeface(typeface);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m127135T(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        int i;
        String str = mo52800O().m94569i2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ImageView imageView = this.f103592w;
        if (zIsEmpty) {
            imageView.setVisibility(8);
            this.f103589C.setText(m127132V(R$string.f17566A));
            Drawable drawable = mo52800O().act().getResources().getDrawable(x2c0.f189303El);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f103589C.setCompoundDrawables(null, null, drawable, null);
        } else {
            imageView.setVisibility(0);
            this.f103589C.setText(str);
            this.f103589C.setCompoundDrawables(null, null, null, null);
        }
        this.f103592w.setOnClickListener(new View.OnClickListener() { // from class: l.ene
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92307a.m127133W(view);
            }
        });
        this.f103589C.setOnClickListener(new View.OnClickListener() { // from class: l.fne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98415a.m127134X(view);
            }
        });
        VText vText = this.f103591v;
        String strM127132V = m127132V(R$string.f18706ll);
        if (TextUtils.isEmpty(str)) {
            i = upa.m194665L3() ? lqa.m150981s().weight.introduction : upa.m194797p().weight.introduction;
        } else {
            i = 0;
        }
        m96419P(vText, strM127132V, i);
        if (!upa.m194665L3()) {
            xdl0.m208344M(this.f103593x, false);
            return;
        }
        int i2 = lqa.m150981s().weight.introduction;
        if (i2 <= 0) {
            xdl0.m208344M(this.f103593x, false);
        } else {
            this.f103593x.m52883P(TextUtils.isEmpty(str) ? 0 : i2, i2, "添加自我介绍");
            xdl0.m208344M(this.f103593x, true);
        }
    }
}
