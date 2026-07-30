package p153l;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MenuCustomView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p151v.VListCell;

/* JADX INFO: loaded from: classes11.dex */
public class snc0 {

    /* JADX INFO: renamed from: l.snc0$a */
    public class C20113a extends pn50 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PopupWindow f169672b;

        public C20113a(PopupWindow popupWindow) {
            this.f169672b = popupWindow;
        }

        @Override // p153l.pn50
        /* JADX INFO: renamed from: b */
        public void mo49560b(int i, int i2) {
            super.mo49560b(i, i2);
            this.f169672b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.snc0$b */
    public class C20114b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f169673a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pn50 f169674b;

        public C20114b(Act act, pn50 pn50Var) {
            this.f169673a = act;
            this.f169674b = pn50Var;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ((MessagesAct) this.f169673a).f32488f.m111048t7().f160408n1.mo50793B(this.f169674b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m186889a(final Message message, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        CoreModule.f18264c.f20384f0.m33689In(message).subscribe(psd0.m173597H(new y20() { // from class: l.qnc0
            @Override // p153l.y20
            public final void call(Object obj) {
                snc0.m186891c((uxj0) obj);
            }
        }, new y20() { // from class: l.rnc0
            @Override // p153l.y20
            public final void call(Object obj) {
                snc0.m186893e(message, (Throwable) obj);
            }
        }));
        w30VarArr[0].m204614b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m186891c(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m186892d(Act act, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getResources().getString(R$string.f21535K4));
        w30 w30VarM204654F = new w30.C21001b(act).m204660L(act.getResources().getString(R$string.f21831t4)).m204657I(act.getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.onc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.pnc0
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                snc0.m186889a(message, w30VarArr, vListCell, c22660a, i);
            }
        }).m204654F();
        w30VarM204654F.m204618f();
        final w30[] w30VarArr = {w30VarM204654F};
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m186893e(Message message, Throwable th) {
        if (CoreModule.m30933P().m143412i().mo180314E() && TEnum.equals(message.channel, "group") && (th instanceof TantanException.Client.TantanForbidden)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.hasHandle) {
                return;
            } else {
                tantanForbidden.hasHandle = true;
            }
        }
        o1j0.m165634h(R$string.f21839u4);
    }

    /* JADX INFO: renamed from: f */
    public static void m186894f(final Message message, final Act act, List<ovb0<String, Runnable, Integer, Void>> list) {
        if (!br5.m106035f(CoreModule.f18264c.f20384f0.m33859Xe(message.cid)) && message.isMe() && TEnum.equals(message.status(), "normal") && message.likeOfMoment == null) {
            list.add(jyb.m147495Z(act.getResources().getString(R$string.f21535K4), new Runnable() { // from class: l.nnc0
                @Override // java.lang.Runnable
                public final void run() {
                    snc0.m186892d(act, message);
                }
            }, Integer.valueOf(ibc0.f114149u1), null));
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m186895g(View view, int i, Act act) {
        if (!(act instanceof MessagesAct)) {
            return false;
        }
        MessageBar messageBarM114041t0 = ((MessagesAct) act).f32488f.m143372e0().mo50138B0().m143374g0().m114041t0();
        int iM175859d = qa00.m175859d(30.0f) + (qa00.m175859d(40.0f) * i);
        int[] iArr = new int[2];
        messageBarM114041t0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) - view.getHeight();
        int iM175859d2 = iArr2[1] - qa00.m175859d(40.0f);
        boolean z = iM175859d2 > height;
        if (!z || iM175859d2 >= iM175859d) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static int m186896h(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX INFO: renamed from: i */
    public static void m186897i(Message message, View view, Act act) {
        ArrayList arrayList = new ArrayList();
        m186894f(message, act, arrayList);
        m186898j(view, arrayList, m186895g(view, arrayList.size(), act), act);
    }

    /* JADX INFO: renamed from: j */
    public static void m186898j(View view, List<ovb0<String, Runnable, Integer, Void>> list, boolean z, Act act) {
        int width;
        MenuCustomView menuCustomView = new MenuCustomView(view.getContext(), z);
        menuCustomView.setData(list);
        PopupWindow popupWindow = new PopupWindow(menuCustomView, -2, -2);
        menuCustomView.setPopupWindow(popupWindow);
        menuCustomView.measure(m186896h(popupWindow.getWidth()), m186896h(popupWindow.getHeight()));
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
        C20113a c20113a = new C20113a(popupWindow);
        popupWindow.setOnDismissListener(new C20114b(act, c20113a));
        ((MessagesAct) act).f32488f.m111048t7().f160408n1.mo50800n(c20113a);
    }
}
