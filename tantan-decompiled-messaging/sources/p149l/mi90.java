package p149l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.mutualcontacts.MutualContactsAct;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class mi90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f133948u;

    /* JADX INFO: renamed from: v */
    public VText f133949v;

    /* JADX INFO: renamed from: w */
    public VText f133950w;

    /* JADX INFO: renamed from: x */
    public VText f133951x;

    /* JADX INFO: renamed from: y */
    public VText_Tags f133952y;

    public mi90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m154662Y(View view) {
        mo52800O().startActivity(MutualContactsAct.m50098d2(mo52800O().act(), mo52800O().userId(), Boolean.valueOf(!mo52800O().mo52327s1())));
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: U */
    public View m154663U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ni90.m159496b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public ArrayList<Tag> m154664V() {
        return mo52800O().mo51075P1() ? new ArrayList<>() : vwb.m200339n(mo52800O().mo51069K2().profile.tags, new w9j() { // from class: l.li90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128177a.m154666X((Tag) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public boolean m154665W(User user, User user2) {
        return user2.profile.contactLookups.lookups.isEmpty() || !(!TEnum.equals(user.source, "facebook") && !CoreModule.f17545c.f19639e0.m169527p9().settings.hideMutualContacts().booleanValue());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Boolean m154666X(Tag tag) {
        return Boolean.valueOf(mo52800O().mo52295me().profile.tags.contains(tag));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SpannableStringBuilder m154667Z(List list, Integer num, Boolean bool) {
        return m96412H(list, num, bool, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m154668a0(final List<Tag> list) {
        User userMo52295me = mo52800O().mo52295me();
        User userMo51069K2 = mo52800O().mo51069K2();
        if (m154665W(userMo52295me, userMo51069K2)) {
            m96420Q(this.f133950w, 8);
        } else {
            Drawable drawableMutate = mo52800O().act().getResources().getDrawable(x2c0.f190156g).mutate();
            drawableMutate.setBounds(0, 0, t100.m186890d(24.0f), t100.m186890d(24.0f));
            xdl0.m208383k(this.f133950w, drawableMutate);
            this.f133950w.setVisibility(0);
            this.f133950w.setText(i0g0.m133847N(rza.m181732L0(userMo51069K2.profile.contactLookups), mo52800O().act().getResources().getColor(w0c0.f183796P1), eqh0.m117752c(3)));
        }
        if (list.isEmpty()) {
            m96420Q(this.f133951x, 8);
            m96420Q(this.f133952y, 8);
        } else {
            Drawable drawableMutate2 = mo52800O().act().getResources().getDrawable(x2c0.f190124f).mutate();
            drawableMutate2.setBounds(0, 0, t100.m186890d(24.0f), t100.m186890d(24.0f));
            xdl0.m208383k(this.f133951x, drawableMutate2);
            this.f133951x.setVisibility(0);
            this.f133952y.setVisibility(0);
            this.f133952y.setTags(new x9j() { // from class: l.ji90
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return this.f118066a.m154667Z(list, (Integer) obj, (Boolean) obj2);
                }
            });
            this.f133951x.setText(i0g0.m133847N(mo52800O().act().getString(R$string.f18368al, list.size() + ""), mo52800O().act().getResources().getColor(w0c0.f183796P1), eqh0.m117752c(3)));
        }
        xdl0.m208344M(this.f133948u, this.f133950w.getVisibility() == 0 || this.f133951x.getVisibility() == 0);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f133950w.setOnClickListener(new View.OnClickListener() { // from class: l.ki90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123283a.m154662Y(view2);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m154663U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m154668a0(m154664V());
    }
}
