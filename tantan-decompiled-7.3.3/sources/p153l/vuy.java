package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageActionBarLeftLayout;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;
import p153l.ruy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vuy<T extends ruy> implements iam<T> {

    /* JADX INFO: renamed from: a */
    public List<MessageActionBarLeftLayout> f185872a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m202975c(fwy fwyVar, clz clzVar, ruy ruyVar, View view) {
        azy azyVarM114043u0 = fwyVar.m143372e0().mo50138B0().m143374g0().m114043u0();
        if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
            o1j0.m165649w(R$string.f21472C5);
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180481i()) {
            CoreModule.f18264c.f20384f0.m33729Mf(clzVar.m110989i3());
        }
        if (CoreModule.m30933P().m143412i().mo180550v5()) {
            CoreModule.f18264c.f20384f0.m33605Cf(clzVar.m110989i3());
        }
        sfj0.m185596c("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        qzm0.m178812h().m178823o("voice_entry_actionbar");
        xzm0.m213760p().m213765h(ruyVar.act(), clzVar.mo111034r3(), "");
    }

    /* JADX INFO: renamed from: d */
    public void m202976d(final T t) {
        clz<? extends DbObject, ?> clzVarMo50158l = t.m143372e0().mo50158l();
        qzz qzzVarM111048t7 = clzVarMo50158l.m111048t7();
        VNavigationBar vNavigationBarM178960m0 = qzzVarM111048t7.m178960m0();
        qzzVarM111048t7.m178960m0().setLeftIconAsBack(getAct());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) qzzVarM111048t7.m178960m0().getLeftIconContainer().getLayoutParams();
        layoutParams.rightMargin = -qa00.m175859d(1.0f);
        qzzVarM111048t7.m178960m0().getLeftIconContainer().setLayoutParams(layoutParams);
        View viewFindViewById = vNavigationBarM178960m0.findViewById(edc0.f93240M1);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.height = qa00.m175859d(60.0f);
        viewFindViewById.setLayoutParams(layoutParams2);
        VFrame titleContainer = qzzVarM111048t7.m178960m0().getTitleContainer();
        ViewGroup.LayoutParams layoutParams3 = titleContainer.getLayoutParams();
        layoutParams3.height = -1;
        titleContainer.setLayoutParams(layoutParams3);
        List<View> arrayList = new ArrayList<>();
        MessageActionBarLeftLayout messageActionBarLeftLayout = (MessageActionBarLeftLayout) LayoutInflater.from(getAct()).inflate(qec0.f156942S4, (ViewGroup) null, false);
        this.f185872a.clear();
        this.f185872a.add(0, messageActionBarLeftLayout);
        titleContainer.addView(messageActionBarLeftLayout, new ViewGroup.LayoutParams(-1, -1));
        titleContainer.setVisibility(0);
        VIcon vIcon = new VIcon(getAct());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114062k4 : ibc0.f114053j4);
        vIcon.setTag("settingMenuTag");
        arrayList.add(vIcon);
        if (xzm0.m213760p().m213775s() && (this instanceof hwy) && mo137538s(true) && !(clzVarMo50158l instanceof jlz) && !TextUtils.equals(clzVarMo50158l.f82482k.convType, ConversationType.fake_one_side_no_match) && !((MessagesAct) getAct()).m50141D2()) {
            final fwy fwyVar = (fwy) t;
            final clz<? extends DbObject, ?> clzVarMo50158l2 = fwyVar.m143372e0().mo50158l();
            VIcon vIcon2 = new VIcon(getAct());
            vIcon2.setIconStyle(4);
            vIcon2.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113941W5 : ibc0.f113933V5);
            vIcon2.setTag("voiceCallView");
            vIcon2.setVisibility(4);
            bnl0.m105509E0(vIcon2, new View.OnClickListener() { // from class: l.suy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vuy.m202975c(fwyVar, clzVarMo50158l2, t, view);
                }
            });
            arrayList.add(0, vIcon2);
        }
        mo137536k(arrayList, vNavigationBarM178960m0.getRightIconContainer());
        if (!jyb.m147479J(arrayList)) {
            vNavigationBarM178960m0.setRightIconViews((View[]) arrayList.toArray(new View[arrayList.size()]));
        }
        if ((getAct() instanceof MessagesAct) && gta.m132210e().m132214d().mo34702I4()) {
            vNavigationBarM178960m0.setLeftIconResource(ibc0.f113798G1);
        }
        if ((getAct() instanceof MessagesAct) && ((MessagesAct) getAct()).m50142E2()) {
            View viewInflate = getAct().inflater().inflate(qec0.f157136v1, (ViewGroup) vNavigationBarM178960m0.getRightIconContainer(), false);
            vNavigationBarM178960m0.m224830B();
            vNavigationBarM178960m0.m224835z(viewInflate);
            vNavigationBarM178960m0.setLeftIconResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113845L3 : ibc0.f113789F1);
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.tuy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176231a.m202979l(view);
                }
            });
        }
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.uuy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181098a.m202980m(view);
            }
        });
        mo106630i();
    }

    /* JADX INFO: renamed from: e */
    public View m202977e() {
        return !jyb.m147479J(this.f185872a) ? this.f185872a.get(0).f32946a : new View(getAct());
    }

    /* JADX INFO: renamed from: f */
    public View m202978f() {
        if (jyb.m147479J(this.f185872a)) {
            return new View(getAct());
        }
        boolean zM164466b = nrb0.m164466b();
        List<MessageActionBarLeftLayout> list = this.f185872a;
        return zM164466b ? list.get(0).f32960o : list.get(0).f32959n;
    }

    /* JADX INFO: renamed from: i */
    public void mo106630i() {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            it.next().m50672j(getAct());
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m202979l(View view) {
        mo106631p();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m202980m(View view) {
        mo106632q();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo106632q();

    /* JADX INFO: renamed from: s */
    public boolean mo137538s(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m202981u(boolean z) {
        Iterator<MessageActionBarLeftLayout> it = this.f185872a.iterator();
        while (it.hasNext()) {
            VImage vImage = it.next().f32969x;
            if (vImage != null && bnl0.m105529O0(vImage)) {
                if (gta.m132210e().m132214d().mo34702I4()) {
                    vImage.setImageResource(z ? ibc0.f113963Z3 : ibc0.f113981b4);
                } else {
                    vImage.setImageResource(z ? ibc0.f113955Y3 : ibc0.f113972a4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo106631p() {
    }

    /* JADX INFO: renamed from: k */
    public void mo137536k(List<View> list, VLinear vLinear) {
    }

    /* JADX INFO: renamed from: n */
    public void mo137537n(User user, Conversation conversation) {
    }

    /* JADX INFO: renamed from: j */
    public void mo137535j(GradientBgButton gradientBgButton, @NonNull VImage vImage, User user) {
    }
}
