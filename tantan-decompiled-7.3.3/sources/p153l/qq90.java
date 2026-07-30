package p153l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.mutualcontacts.MutualContactsAct;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class qq90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f158969u;

    /* JADX INFO: renamed from: v */
    public VText f158970v;

    /* JADX INFO: renamed from: w */
    public VText f158971w;

    /* JADX INFO: renamed from: x */
    public VText f158972x;

    /* JADX INFO: renamed from: y */
    public VText_Tags f158973y;

    public qq90(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m177485Y(View view) {
        mo53983O().startActivity(MutualContactsAct.m51281e2(mo53983O().act(), mo53983O().userId(), Boolean.valueOf(!mo53983O().mo53510s1())));
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: U */
    public View m177486U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rq90.m182601b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public ArrayList<Tag> m177487V() {
        return mo53983O().mo52258P1() ? new ArrayList<>() : jyb.m147522n(mo53983O().mo52252K2().profile.tags, new qcj() { // from class: l.pq90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153653a.m177489X((Tag) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public boolean m177488W(User user, User user2) {
        return user2.profile.contactLookups.lookups.isEmpty() || !(!TEnum.equals(user.source, "facebook") && !CoreModule.f18264c.f20381e0.m116600p9().settings.hideMutualContacts().booleanValue());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Boolean m177489X(Tag tag) {
        return Boolean.valueOf(mo53983O().mo53478me().profile.tags.contains(tag));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SpannableStringBuilder m177490Z(List list, Integer num, Boolean bool) {
        return m121837H(list, num, bool, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m177491a0(final List<Tag> list) {
        User userMo53478me = mo53983O().mo53478me();
        User userMo52252K2 = mo53983O().mo52252K2();
        if (m177488W(userMo53478me, userMo52252K2)) {
            m121845Q(this.f158971w, 8);
        } else {
            Drawable drawableMutate = mo53983O().act().getResources().getDrawable(dbc0.f87038h).mutate();
            drawableMutate.setBounds(0, 0, qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            bnl0.m105563k(this.f158971w, drawableMutate);
            this.f158971w.setVisibility(0);
            this.f158971w.setText(q8g0.m175782N(e1b.m118954L0(userMo52252K2.profile.contactLookups), mo53983O().act().getResources().getColor(c9c0.f80368Q1), lyh0.m156283c(3)));
        }
        if (list.isEmpty()) {
            m121845Q(this.f158972x, 8);
            m121845Q(this.f158973y, 8);
        } else {
            Drawable drawableMutate2 = mo53983O().act().getResources().getDrawable(dbc0.f87005g).mutate();
            drawableMutate2.setBounds(0, 0, qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            bnl0.m105563k(this.f158972x, drawableMutate2);
            this.f158972x.setVisibility(0);
            this.f158973y.setVisibility(0);
            this.f158973y.setTags(new rcj() { // from class: l.nq90
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return this.f143192a.m177490Z(list, (Integer) obj, (Boolean) obj2);
                }
            });
            this.f158972x.setText(q8g0.m175782N(mo53983O().act().getString(R$string.f19777wl, list.size() + ""), mo53983O().act().getResources().getColor(c9c0.f80368Q1), lyh0.m156283c(3)));
        }
        bnl0.m105524M(this.f158969u, this.f158971w.getVisibility() == 0 || this.f158972x.getVisibility() == 0);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f158971w.setOnClickListener(new View.OnClickListener() { // from class: l.oq90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f148562a.m177485Y(view2);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m177486U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m177491a0(m177487V());
    }
}
