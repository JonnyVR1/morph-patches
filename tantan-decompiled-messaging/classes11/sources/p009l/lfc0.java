package p009l;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessageBar;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.view.MenuCustomView;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.c40;
import l.e30;
import l.jf50;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xp5;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lfc0 {

    /* JADX INFO: renamed from: l.lfc0$a */
    public class C1013a extends jf50 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PopupWindow f16138b;

        public C1013a(PopupWindow popupWindow) {
            this.f16138b = popupWindow;
        }

        /* JADX INFO: renamed from: b */
        public void m17876b(int i, int i2) {
            super.b(i, i2);
            this.f16138b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.lfc0$b */
    public class C1014b implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f16139a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jf50 f16140b;

        public C1014b(Act act, jf50 jf50Var) {
            this.f16139a = act;
            this.f16140b = jf50Var;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            this.f16139a.f.t7().n1.B(this.f16140b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17866a(final Message message, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        CoreModule.c.f0.In(message).subscribe(mkd0.H(new e30() { // from class: l.jfc0
            public final void call(Object obj) {
                lfc0.m17868c((roj0) obj);
            }
        }, new e30() { // from class: l.kfc0
            public final void call(Object obj) {
                lfc0.m17870e(message, (Throwable) obj);
            }
        }));
        c40VarArr[0].b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17868c(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m17869d(Act act, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getResources().getString(R.string.K4));
        c40 c40VarF = new c40.b(act).L(act.getResources().getString(R.string.t4)).I(act.getResources().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.hfc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.ifc0
            /* JADX INFO: renamed from: a */
            public final void m16505a(VListCell vListCell, VListCell.a aVar, int i) {
                lfc0.m17866a(message, c40VarArr, vListCell, aVar, i);
            }
        }).F();
        c40VarF.f();
        final c40[] c40VarArr = {c40VarF};
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m17870e(Message message, Throwable th) {
        if (CoreModule.P().i().E() && TEnum.equals(message.channel, "group") && (th instanceof TantanException.Client.TantanForbidden)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.hasHandle) {
                return;
            } else {
                tantanForbidden.hasHandle = true;
            }
        }
        lsi0.h(R.string.u4);
    }

    /* JADX INFO: renamed from: f */
    public static void m17871f(final Message message, final Act act, List<knb0<String, Runnable, Integer, Void>> list) {
        if (!xp5.f(CoreModule.c.f0.Xe(message.cid)) && message.isMe() && TEnum.equals(message.status(), "normal") && message.likeOfMoment == null) {
            list.add(vwb.Z(act.getResources().getString(R.string.K4), new Runnable() { // from class: l.gfc0
                @Override // java.lang.Runnable
                public final void run() {
                    lfc0.m17869d(act, message);
                }
            }, Integer.valueOf(c3c0.u1), (Object) null));
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17872g(View view, int i, Act act) {
        if (!(act instanceof MessagesAct)) {
            return false;
        }
        MessageBar messageBarT0 = ((MessagesAct) act).f.e0().A0().g0().t0();
        int iD = t100.d(30.0f) + (t100.d(40.0f) * i);
        int[] iArr = new int[2];
        messageBarT0.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = (iArr[1] - iArr2[1]) - view.getHeight();
        int iD2 = iArr2[1] - t100.d(40.0f);
        boolean z = iD2 > height;
        if (!z || iD2 >= iD) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static int m17873h(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX INFO: renamed from: i */
    public static void m17874i(Message message, View view, Act act) {
        ArrayList arrayList = new ArrayList();
        m17871f(message, act, arrayList);
        m17875j(view, arrayList, m17872g(view, arrayList.size(), act), act);
    }

    /* JADX INFO: renamed from: j */
    public static void m17875j(View view, List<knb0<String, Runnable, Integer, Void>> list, boolean z, Act act) {
        int width;
        MenuCustomView menuCustomView = new MenuCustomView(view.getContext(), z);
        menuCustomView.setData(list);
        PopupWindow popupWindow = new PopupWindow((View) menuCustomView, -2, -2);
        menuCustomView.setPopupWindow(popupWindow);
        menuCustomView.measure(m17873h(popupWindow.getWidth()), m17873h(popupWindow.getHeight()));
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
        C1013a c1013a = new C1013a(popupWindow);
        popupWindow.setOnDismissListener(new C1014b(act, c1013a));
        ((MessagesAct) act).f.t7().n1.n(c1013a);
    }
}
