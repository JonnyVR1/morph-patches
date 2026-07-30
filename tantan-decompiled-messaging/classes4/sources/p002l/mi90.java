package p002l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.mutualcontacts.MutualContactsAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.eqh0;
import l.i0g0;
import l.mcr;
import l.ni90;
import l.rza;
import l.t100;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VLinear_Dividers;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mi90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f15393u;

    /* JADX INFO: renamed from: v */
    public VText f15394v;

    /* JADX INFO: renamed from: w */
    public VText f15395w;

    /* JADX INFO: renamed from: x */
    public VText f15396x;

    /* JADX INFO: renamed from: y */
    public VText_Tags f15397y;

    public mi90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m17953Y(View view) {
        mo3351O().startActivity(MutualContactsAct.m523d2(mo3351O().act(), mo3351O().userId(), Boolean.valueOf(!mo3351O().mo2860s1())));
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: U */
    public View m17954U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ni90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public ArrayList<Tag> m17955V() {
        return mo3351O().mo1523P1() ? new ArrayList<>() : vwb.n(mo3351O().mo1517K2().profile.tags, new w9j() { // from class: l.li90
            public final Object call(Object obj) {
                return this.f14882a.m17957X((Tag) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public boolean m17956W(User user, User user2) {
        return user2.profile.contactLookups.lookups.isEmpty() || !(!TEnum.equals(user.source, "facebook") && !CoreModule.c.e0.p9().settings.hideMutualContacts().booleanValue());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Boolean m17957X(Tag tag) {
        return Boolean.valueOf(mo3351O().mo2827me().profile.tags.contains(tag));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SpannableStringBuilder m17958Z(List list, Integer num, Boolean bool) {
        return m9643H(list, num, bool, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m17959a0(final List<Tag> list) {
        User userMo2827me = mo3351O().mo2827me();
        User userMo1517K2 = mo3351O().mo1517K2();
        if (m17956W(userMo2827me, userMo1517K2)) {
            m9651Q(this.f15395w, 8);
        } else {
            Drawable drawableMutate = mo3351O().act().getResources().getDrawable(x2c0.g).mutate();
            drawableMutate.setBounds(0, 0, t100.d(24.0f), t100.d(24.0f));
            xdl0.k(this.f15395w, drawableMutate);
            this.f15395w.setVisibility(0);
            this.f15395w.setText(i0g0.N(rza.L0(userMo1517K2.profile.contactLookups), mo3351O().act().getResources().getColor(w0c0.P1), eqh0.c(3)));
        }
        if (list.isEmpty()) {
            m9651Q(this.f15396x, 8);
            m9651Q(this.f15397y, 8);
        } else {
            Drawable drawableMutate2 = mo3351O().act().getResources().getDrawable(x2c0.f).mutate();
            drawableMutate2.setBounds(0, 0, t100.d(24.0f), t100.d(24.0f));
            xdl0.k(this.f15396x, drawableMutate2);
            this.f15396x.setVisibility(0);
            this.f15397y.setVisibility(0);
            this.f15397y.setTags(new x9j() { // from class: l.ji90
                public final Object call(Object obj, Object obj2) {
                    return this.f13785a.m17958Z(list, (Integer) obj, (Boolean) obj2);
                }
            });
            this.f15396x.setText(i0g0.N(mo3351O().act().getString(R.string.al, list.size() + ""), mo3351O().act().getResources().getColor(w0c0.P1), eqh0.c(3)));
        }
        xdl0.M(this.f15393u, this.f15395w.getVisibility() == 0 || this.f15396x.getVisibility() == 0);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f15395w.setOnClickListener(new View.OnClickListener() { // from class: l.ki90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14338a.m17953Y(view2);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m17954U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m17959a0(m17955V());
    }
}
