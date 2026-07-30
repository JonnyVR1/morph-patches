package p003l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageActionBarLeftLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.c3c0;
import l.jjb0;
import l.l6c0;
import l.lsi0;
import l.mcz;
import l.mqm0;
import l.o6j0;
import l.s7m;
import l.t100;
import l.tqm0;
import l.uly;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y4c0;
import p028v.VFrame;
import p028v.VIcon;
import p028v.VImage;
import p028v.VLinear;
import p028v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class yly<T extends uly> implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public List<MessageActionBarLeftLayout> f9081a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9196c(iny inyVar, fcz fczVar, uly ulyVar, View view) {
        dqy dqyVarM4846u0 = inyVar.m6497e0().mo2046A0().m6499g0().m4846u0();
        if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0()) {
            lsi0.w(R.string.C5);
            return;
        }
        if (CoreModule.P().i().i()) {
            CoreModule.c.f0.Mf(fczVar.m4250i3());
        }
        if (CoreModule.P().i().v5()) {
            CoreModule.c.f0.Cf(fczVar.m4250i3());
        }
        o6j0.c("e_chat_more_voice_call", "p_chat_view", new o6j0.a[0]);
        mqm0.h().o("voice_entry_actionbar");
        tqm0.p().h(ulyVar.act(), fczVar.m4295r3(), "");
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [l.iny, l.muy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, androidx.appcompat.widget.AppCompatImageView, java.lang.Object, v.VIcon] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, androidx.appcompat.widget.AppCompatImageView, java.lang.Object, v.VIcon] */
    /* JADX INFO: renamed from: d */
    public void m9197d(final T t) {
        fcz<? extends DbObject, ?> fczVarMo2066l = t.m6497e0().mo2066l();
        tqz tqzVarM4309t7 = fczVarMo2066l.m4309t7();
        VNavigationBar vNavigationBarM7942m0 = tqzVarM4309t7.m7942m0();
        tqzVarM4309t7.m7942m0().setLeftIconAsBack(act());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tqzVarM4309t7.m7942m0().getLeftIconContainer().getLayoutParams();
        layoutParams.rightMargin = -t100.d(1.0f);
        tqzVarM4309t7.m7942m0().getLeftIconContainer().setLayoutParams(layoutParams);
        View viewFindViewById = vNavigationBarM7942m0.findViewById(y4c0.M1);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.height = t100.d(60.0f);
        viewFindViewById.setLayoutParams(layoutParams2);
        VFrame titleContainer = tqzVarM4309t7.m7942m0().getTitleContainer();
        ViewGroup.LayoutParams layoutParams3 = titleContainer.getLayoutParams();
        layoutParams3.height = -1;
        titleContainer.setLayoutParams(layoutParams3);
        ArrayList arrayList = new ArrayList();
        MessageActionBarLeftLayout messageActionBarLeftLayout = (MessageActionBarLeftLayout) LayoutInflater.from(act()).inflate(l6c0.S4, (ViewGroup) null, false);
        this.f9081a.clear();
        this.f9081a.add(0, messageActionBarLeftLayout);
        titleContainer.addView(messageActionBarLeftLayout, new ViewGroup.LayoutParams(-1, -1));
        titleContainer.setVisibility(0);
        ?? vIcon = new VIcon(act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(ura.e().d().I4() ? c3c0.k4 : c3c0.j4);
        vIcon.setTag("settingMenuTag");
        arrayList.add(vIcon);
        if (tqm0.p().s() && (this instanceof kny) && mo5718s(true) && !(fczVarMo2066l instanceof mcz) && !TextUtils.equals(fczVarMo2066l.f3551k.convType, "fake_one_side_no_match") && !act().m2049C2()) {
            final ?? r0 = (iny) t;
            final fcz<? extends DbObject, ?> fczVarMo2066l2 = r0.m6497e0().mo2066l();
            ?? vIcon2 = new VIcon(act());
            vIcon2.setIconStyle(4);
            vIcon2.setImageResource(ura.e().d().I4() ? c3c0.W5 : c3c0.V5);
            vIcon2.setTag("voiceCallView");
            vIcon2.setVisibility(4);
            xdl0.E0((View) vIcon2, new View.OnClickListener() { // from class: l.vly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yly.m9196c(r0, fczVarMo2066l2, t, view);
                }
            });
            arrayList.add(0, vIcon2);
        }
        mo5716k(arrayList, vNavigationBarM7942m0.getRightIconContainer());
        if (!vwb.J(arrayList)) {
            vNavigationBarM7942m0.setRightIconViews((View[]) arrayList.toArray(new View[arrayList.size()]));
        }
        if ((act() instanceof MessagesAct) && ura.e().d().I4()) {
            vNavigationBarM7942m0.setLeftIconResource(c3c0.G1);
        }
        if ((act() instanceof MessagesAct) && act().m2050D2()) {
            View viewInflate = act().inflater().inflate(l6c0.v1, (ViewGroup) vNavigationBarM7942m0.getRightIconContainer(), false);
            vNavigationBarM7942m0.m12087B();
            vNavigationBarM7942m0.m12092z(viewInflate);
            vNavigationBarM7942m0.setLeftIconResource(ura.e().d().I4() ? c3c0.L3 : c3c0.F1);
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.wly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8575a.m9200l(view);
                }
            });
        }
        xdl0.E0((View) vIcon, new View.OnClickListener() { // from class: l.xly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8803a.m9201m(view);
            }
        });
        mo3905i();
    }

    /* JADX INFO: renamed from: e */
    public View m9198e() {
        return !vwb.J(this.f9081a) ? this.f9081a.get(0).f1989a : new View(act());
    }

    /* JADX INFO: renamed from: f */
    public View m9199f() {
        if (vwb.J(this.f9081a)) {
            return new View(act());
        }
        boolean zB = jjb0.b();
        List<MessageActionBarLeftLayout> list = this.f9081a;
        return zB ? list.get(0).f2003o : list.get(0).f2002n;
    }

    /* JADX INFO: renamed from: i */
    public void mo3905i() {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            it.next().m2636j(act());
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9200l(View view) {
        mo3907p();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9201m(View view) {
        mo3908q();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo3908q();

    /* JADX INFO: renamed from: s */
    public boolean mo5718s(boolean z) {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m9202u(boolean z) {
        Iterator<MessageActionBarLeftLayout> it = this.f9081a.iterator();
        while (it.hasNext()) {
            AppCompatImageView appCompatImageView = it.next().f2012x;
            if (appCompatImageView != null && xdl0.O0(appCompatImageView)) {
                if (ura.e().d().I4()) {
                    appCompatImageView.setImageResource(z ? c3c0.Z3 : c3c0.b4);
                } else {
                    appCompatImageView.setImageResource(z ? c3c0.Y3 : c3c0.a4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo3907p() {
    }

    /* JADX INFO: renamed from: k */
    public void mo5716k(List<View> list, VLinear vLinear) {
    }

    /* JADX INFO: renamed from: n */
    public void mo5717n(User user, Conversation conversation) {
    }

    /* JADX INFO: renamed from: j */
    public void mo5715j(GradientBgButton gradientBgButton, @NonNull VImage vImage, User user) {
    }
}
