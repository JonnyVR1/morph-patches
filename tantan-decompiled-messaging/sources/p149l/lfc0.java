package p149l;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MenuCustomView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p147v.VListCell;

/* JADX INFO: loaded from: classes11.dex */
public class lfc0 {

    /* JADX INFO: renamed from: l.lfc0$a */
    public class C18212a extends jf50 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PopupWindow f127863b;

        public C18212a(PopupWindow popupWindow) {
            this.f127863b = popupWindow;
        }

        @Override // p149l.jf50
        /* JADX INFO: renamed from: b */
        public void mo48377b(int i, int i2) {
            super.mo48377b(i, i2);
            this.f127863b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.lfc0$b */
    public class C18213b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f127864a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jf50 f127865b;

        public C18213b(Act act, jf50 jf50Var) {
            this.f127864a = act;
            this.f127865b = jf50Var;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ((MessagesAct) this.f127864a).f31640f.m120842t7().f171745n1.mo49610B(this.f127865b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m149663a(final Message message, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        CoreModule.f17545c.f19642f0.m32686In(message).subscribe(mkd0.m154956H(new e30() { // from class: l.jfc0
            @Override // p149l.e30
            public final void call(Object obj) {
                lfc0.m149665c((roj0) obj);
            }
        }, new e30() { // from class: l.kfc0
            @Override // p149l.e30
            public final void call(Object obj) {
                lfc0.m149667e(message, (Throwable) obj);
            }
        }));
        c40VarArr[0].m105113b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m149665c(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m149666d(Act act, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getResources().getString(R$string.f20793K4));
        c40 c40VarM105153F = new c40.C16057b(act).m105159L(act.getResources().getString(R$string.f21089t4)).m105156I(act.getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.hfc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.ifc0
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                lfc0.m149663a(message, c40VarArr, vListCell, c22545a, i);
            }
        }).m105153F();
        c40VarM105153F.m105117f();
        final c40[] c40VarArr = {c40VarM105153F};
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m149667e(Message message, Throwable th) {
        if (CoreModule.m29935P().m94658i().mo158222E() && TEnum.equals(message.channel, "group") && (th instanceof TantanException.Client.TantanForbidden)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.hasHandle) {
                return;
            } else {
                tantanForbidden.hasHandle = true;
            }
        }
        lsi0.m151578h(R$string.f21097u4);
    }

    /* JADX INFO: renamed from: f */
    public static void m149668f(final Message message, final Act act, List<knb0<String, Runnable, Integer, Void>> list) {
        if (!xp5.m210466f(CoreModule.f17545c.f19642f0.m32856Xe(message.cid)) && message.isMe() && TEnum.equals(message.status(), "normal") && message.likeOfMoment == null) {
            list.add(vwb.m200312Z(act.getResources().getString(R$string.f20793K4), new Runnable() { // from class: l.gfc0
                @Override // java.lang.Runnable
                public final void run() {
                    lfc0.m149666d(act, message);
                }
            }, Integer.valueOf(c3c0.f78874u1), null));
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m149669g(View view, int i, Act act) {
        if (!(act instanceof MessagesAct)) {
            return false;
        }
        MessageBar messageBarM128210t0 = ((MessagesAct) act).f31640f.m156455e0().mo48954A0().m156457g0().m128210t0();
        int iM186890d = t100.m186890d(30.0f) + (t100.m186890d(40.0f) * i);
        int[] iArr = new int[2];
        messageBarM128210t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) - view.getHeight();
        int iM186890d2 = iArr2[1] - t100.m186890d(40.0f);
        boolean z = iM186890d2 > height;
        if (!z || iM186890d2 >= iM186890d) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static int m149670h(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX INFO: renamed from: i */
    public static void m149671i(Message message, View view, Act act) {
        ArrayList arrayList = new ArrayList();
        m149668f(message, act, arrayList);
        m149672j(view, arrayList, m149669g(view, arrayList.size(), act), act);
    }

    /* JADX INFO: renamed from: j */
    public static void m149672j(View view, List<knb0<String, Runnable, Integer, Void>> list, boolean z, Act act) {
        int width;
        MenuCustomView menuCustomView = new MenuCustomView(view.getContext(), z);
        menuCustomView.setData(list);
        PopupWindow popupWindow = new PopupWindow(menuCustomView, -2, -2);
        menuCustomView.setPopupWindow(popupWindow);
        menuCustomView.measure(m149670h(popupWindow.getWidth()), m149670h(popupWindow.getHeight()));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        int height = 10;
        if (z) {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
            height = ((-menuCustomView.getMeasuredHeight()) - view.getHeight()) - 10;
        } else {
            width = (view.getWidth() - menuCustomView.getMeasuredWidth()) / 2;
        }
        popupWindow.showAsDropDown(view, width, height, 8388611);
        C18212a c18212a = new C18212a(popupWindow);
        popupWindow.setOnDismissListener(new C18213b(act, c18212a));
        ((MessagesAct) act).f31640f.m120842t7().f171745n1.mo49617n(c18212a);
    }
}
