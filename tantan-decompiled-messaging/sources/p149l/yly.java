package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageActionBarLeftLayout;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;
import p149l.uly;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yly<T extends uly> implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public List<MessageActionBarLeftLayout> f198950a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m215317c(iny inyVar, fcz fczVar, uly ulyVar, View view) {
        dqy dqyVarM128212u0 = inyVar.m156455e0().mo48954A0().m156457g0().m128212u0();
        if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
            lsi0.m151593w(R$string.f20730C5);
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158389i()) {
            CoreModule.f17545c.f19642f0.m32726Mf(fczVar.m120783i3());
        }
        if (CoreModule.m29935P().m94658i().mo158458v5()) {
            CoreModule.f17545c.f19642f0.m32602Cf(fczVar.m120783i3());
        }
        o6j0.m162859c("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        mqm0.m155965h().m155976o("voice_entry_actionbar");
        tqm0.m190131p().m190136h(ulyVar.act(), fczVar.mo120828r3(), "");
    }

    /* JADX INFO: renamed from: d */
    public void m215318d(final T t) {
        fcz<? extends DbObject, ?> fczVarMo48974l = t.m156455e0().mo48974l();
        tqz tqzVarM120842t7 = fczVarMo48974l.m120842t7();
        VNavigationBar vNavigationBarM190316m0 = tqzVarM120842t7.m190316m0();
        tqzVarM120842t7.m190316m0().setLeftIconAsBack(getAct());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tqzVarM120842t7.m190316m0().getLeftIconContainer().getLayoutParams();
        layoutParams.rightMargin = -t100.m186890d(1.0f);
        tqzVarM120842t7.m190316m0().getLeftIconContainer().setLayoutParams(layoutParams);
        View viewFindViewById = vNavigationBarM190316m0.findViewById(y4c0.f196005M1);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.height = t100.m186890d(60.0f);
        viewFindViewById.setLayoutParams(layoutParams2);
        VFrame titleContainer = tqzVarM120842t7.m190316m0().getTitleContainer();
        ViewGroup.LayoutParams layoutParams3 = titleContainer.getLayoutParams();
        layoutParams3.height = -1;
        titleContainer.setLayoutParams(layoutParams3);
        List<View> arrayList = new ArrayList<>();
        MessageActionBarLeftLayout messageActionBarLeftLayout = (MessageActionBarLeftLayout) LayoutInflater.from(getAct()).inflate(l6c0.f126386S4, (ViewGroup) null, false);
        this.f198950a.clear();
        this.f198950a.add(0, messageActionBarLeftLayout);
        titleContainer.addView(messageActionBarLeftLayout, new ViewGroup.LayoutParams(-1, -1));
        titleContainer.setVisibility(0);
        VIcon vIcon = new VIcon(getAct());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78787k4 : c3c0.f78778j4);
        vIcon.setTag("settingMenuTag");
        arrayList.add(vIcon);
        if (tqm0.m190131p().m190146s() && (this instanceof kny) && mo146635s(true) && !(fczVarMo48974l instanceof mcz) && !TextUtils.equals(fczVarMo48974l.f96919k.convType, ConversationType.fake_one_side_no_match) && !((MessagesAct) getAct()).m48957C2()) {
            final iny inyVar = (iny) t;
            final fcz<? extends DbObject, ?> fczVarMo48974l2 = inyVar.m156455e0().mo48974l();
            VIcon vIcon2 = new VIcon(getAct());
            vIcon2.setIconStyle(4);
            vIcon2.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78666W5 : c3c0.f78658V5);
            vIcon2.setTag("voiceCallView");
            vIcon2.setVisibility(4);
            xdl0.m208329E0(vIcon2, new View.OnClickListener() { // from class: l.vly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yly.m215317c(inyVar, fczVarMo48974l2, t, view);
                }
            });
            arrayList.add(0, vIcon2);
        }
        mo146633k(arrayList, vNavigationBarM190316m0.getRightIconContainer());
        if (!vwb.m200296J(arrayList)) {
            vNavigationBarM190316m0.setRightIconViews((View[]) arrayList.toArray(new View[arrayList.size()]));
        }
        if ((getAct() instanceof MessagesAct) && ura.m195053e().m195057d().mo33699I4()) {
            vNavigationBarM190316m0.setLeftIconResource(c3c0.f78523G1);
        }
        if ((getAct() instanceof MessagesAct) && ((MessagesAct) getAct()).m48958D2()) {
            View viewInflate = getAct().inflater().inflate(l6c0.f126580v1, (ViewGroup) vNavigationBarM190316m0.getRightIconContainer(), false);
            vNavigationBarM190316m0.m223584B();
            vNavigationBarM190316m0.m223589z(viewInflate);
            vNavigationBarM190316m0.setLeftIconResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78570L3 : c3c0.f78514F1);
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.wly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187037a.m215321l(view);
                }
            });
        }
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.xly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193508a.m215322m(view);
            }
        });
        mo117244i();
    }

    /* JADX INFO: renamed from: e */
    public View m215319e() {
        return !vwb.m200296J(this.f198950a) ? this.f198950a.get(0).f32098a : new View(getAct());
    }

    /* JADX INFO: renamed from: f */
    public View m215320f() {
        if (vwb.m200296J(this.f198950a)) {
            return new View(getAct());
        }
        boolean zM141784b = jjb0.m141784b();
        List<MessageActionBarLeftLayout> list = this.f198950a;
        return zM141784b ? list.get(0).f32112o : list.get(0).f32111n;
    }

    /* JADX INFO: renamed from: i */
    public void mo117244i() {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            it.next().m49489j(getAct());
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m215321l(View view) {
        mo117245p();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m215322m(View view) {
        mo117246q();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo117246q();

    /* JADX INFO: renamed from: s */
    public boolean mo146635s(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m215323u(boolean z) {
        Iterator<MessageActionBarLeftLayout> it = this.f198950a.iterator();
        while (it.hasNext()) {
            VImage vImage = it.next().f32121x;
            if (vImage != null && xdl0.m208349O0(vImage)) {
                if (ura.m195053e().m195057d().mo33699I4()) {
                    vImage.setImageResource(z ? c3c0.f78688Z3 : c3c0.f78706b4);
                } else {
                    vImage.setImageResource(z ? c3c0.f78680Y3 : c3c0.f78697a4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo117245p() {
    }

    /* JADX INFO: renamed from: k */
    public void mo146633k(List<View> list, VLinear vLinear) {
    }

    /* JADX INFO: renamed from: n */
    public void mo146634n(User user, Conversation conversation) {
    }

    /* JADX INFO: renamed from: j */
    public void mo146632j(GradientBgButton gradientBgButton, @NonNull VImage vImage, User user) {
    }
}
