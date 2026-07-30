package p003l;

import android.app.Application;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.AccessToken;
import com.p000p1.mobile.putong.core.data.AIMessageFeedback;
import com.p000p1.mobile.putong.core.data.LikedUserFilter;
import com.p000p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p000p1.mobile.putong.core.data.QuestionCategory;
import com.p000p1.mobile.putong.core.data.ShareItemBean;
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.popup.NameFakeView;
import com.p1.mobile.putong.core.ui.popup.ProfileFakeView;
import com.p1.mobile.putong.core.ui.profile.views.WheelPicker;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.oms.OmsBaseRender;
import com.p1.mobile.putong.ui.DialogAct;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import l.bzv;
import l.c4g0;
import l.cnb0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.dnb0;
import l.dse0;
import l.e30;
import l.e51;
import l.eqh0;
import l.f30;
import l.f6c0;
import l.g30;
import l.gmp0;
import l.i0e;
import l.i0g0;
import l.ic50;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.nc50;
import l.o7r;
import l.qib0;
import l.qp8;
import l.rmp0;
import l.roj0;
import l.rzb0;
import l.t100;
import l.tvf;
import l.u4c0;
import l.upa;
import l.v7c0;
import l.vwb;
import l.vy8;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xh0;
import l.ya5;
import l.yij0;
import l.zch0;
import l.zqb;
import l.zvf0;
import l.zz6;
import rx.Notification;
import rx.c;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VEditText;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class ark extends s4e {

    /* JADX INFO: renamed from: g */
    public static final List<String> f2863g = Arrays.asList("00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00");

    /* JADX INFO: renamed from: h */
    public static final List<String> f2864h = Arrays.asList("01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00");

    /* JADX INFO: renamed from: i */
    public static String f2865i;

    /* JADX INFO: renamed from: l.ark$a */
    public class DialogInterfaceOnDismissListenerC3289a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f2866a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f2867b;

        public DialogInterfaceOnDismissListenerC3289a(cwf0 cwf0Var, d30 d30Var) {
            this.f2866a = cwf0Var;
            this.f2867b = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f2866a);
            if (NullChecker.a(this.f2867b)) {
                this.f2867b.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.ark$b */
    public class DialogInterfaceOnKeyListenerC3290b implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ark$c */
    public class C3291c implements dse0.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f2868a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5j0 f2869b;

        public C3291c(List list, l5j0 l5j0Var) {
            this.f2868a = list;
            this.f2869b = l5j0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m5618a(View view, int i) {
            ((ShareItemBean) this.f2868a.get(i)).getAction().call();
            this.f2869b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.ark$d */
    public class DialogInterfaceOnDismissListenerC3292d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f2870a;

        public DialogInterfaceOnDismissListenerC3292d(cwf0 cwf0Var) {
            this.f2870a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f2870a);
        }
    }

    /* JADX INFO: renamed from: l.ark$e */
    public class DialogInterfaceOnKeyListenerC3293e implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ark$f */
    public class C3294f implements dse0.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f2871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5j0 f2872b;

        public C3294f(List list, l5j0 l5j0Var) {
            this.f2871a = list;
            this.f2872b = l5j0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m5619a(View view, int i) {
            ShareItemBean shareItemBean = (ShareItemBean) this.f2871a.get(i);
            if (NullChecker.a(shareItemBean)) {
                String name = shareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        zvf0.r("e_share_pop_wechat", "p_share_pop");
                    } else if ("朋友圈".equals(name)) {
                        zvf0.r("e_share_pop_wechat_moment", "p_share_pop");
                    } else if ("QQ".equals(name)) {
                        zvf0.r("e_share_pop_qq", "p_share_pop");
                    } else if ("QQ空间".equals(name)) {
                        zvf0.r("e_share_pop_qqzone", "p_share_pop");
                    }
                }
                if (NullChecker.a(((ShareItemBean) this.f2871a.get(i)).getAction())) {
                    ((ShareItemBean) this.f2871a.get(i)).getAction().call();
                }
                this.f2872b.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m5520B0(VText vText, dd80.a aVar, CoreLikers.a aVar2) {
        String str;
        int iRandom = aVar2.b + 10;
        if (iRandom <= 10) {
            iRandom = (int) ((Math.random() * 89.0d) + 10.0d);
        }
        if (iRandom >= 99) {
            str = "99+";
        } else {
            str = iRandom + "";
        }
        vText.setText(str);
        aVar.y0(String.format("你离开后，仍有 %s 个人喜欢着你", zz6.q0(iRandom)));
        zch0.a().j(true, "reBackAppGuideDialog");
        aVar.r0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m5521C(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R.string.Rs)));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m5524D0(c4g0 c4g0Var, c4g0 c4g0Var2, DialogInterface dialogInterface) {
        if (!c4g0Var.isUnsubscribed()) {
            c4g0Var.unsubscribe();
        }
        if (c4g0Var2.isUnsubscribed()) {
            return;
        }
        c4g0Var2.unsubscribe();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m5525E(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m5526E0(final Act act, final User user, final String str, final d30 d30Var, final boolean z) {
        final Runnable runnable = new Runnable() { // from class: l.rqk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m5579g0(act, str, user, z, d30Var);
            }
        };
        xh0.a aVar = new xh0.a(act);
        aVar.j(act.getString(R.string.si)).g(false).h(false).e(R.string.c).q(R.string.ui).o(new View.OnClickListener() { // from class: l.sqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        aVar.a().g();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m5527F(VText vText, VButton vButton, CharSequence charSequence) {
        xdl0.M(vText, false);
        xdl0.X(vButton, t100.q);
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m5528F0(Act act, Runnable runnable) {
        if (!CoreModule.c.e0.c8()) {
            return false;
        }
        m5560V0(act, true, CoreModule.c.e0.na().fp(), act.string(R.string.Ik), runnable);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m5529G(User user, boolean z) {
        Application application = CoreModule.b;
        application.startActivity(DialogAct.P0(application, 2, user, z));
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m5530G0(String str, boolean z) {
        if (str.length() < 3) {
            return false;
        }
        if (!z) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m5532H0(@NonNull dd80 dd80Var) {
        try {
            Window window = dd80Var.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) dd80Var.getContext().getSystemService("input_method");
            if (NullChecker.a(window) && NullChecker.a(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m5533I(boolean z, Runnable runnable, dd80[] dd80VarArr) {
        if (z) {
            ygh0.m11229n();
        } else {
            ygh0.m11234r();
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        dd80VarArr[0].dismiss();
    }

    /* JADX INFO: renamed from: I0 */
    public static String m5534I0() {
        if (vwb.J(CoreModule.c.e0.na().status)) {
            return AIMessageFeedback.good;
        }
        return CoreModule.c.e0.na().status.contains(UserStatus.get(MyVisitorsShowType.hidden)) ? "fake" : "other";
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m5535J(Act act, ArrayList arrayList, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        m5560V0(act, false, (Media) arrayList.get(0), act.string(R.string.el), null);
    }

    /* JADX INFO: renamed from: J0 */
    public static List<ShareItemBean> m5536J0(d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, String str, String str2, String str3, List<ShareItemBean> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        boolean zTp = CoreModule.N().Tp();
        if (NullChecker.a(d30Var) && (!zTp || !TextUtils.equals("喜欢", str2))) {
            if (TextUtils.equals("关注", str2)) {
                i = x2c0.q6;
            } else if (TextUtils.equals("喜欢", str2)) {
                i = upa.z() ? x2c0.x6 : x2c0.w6;
            } else if (TextUtils.equals("取消关注", str2) || TextUtils.equals("取消喜欢", str2)) {
                i = upa.z() ? x2c0.B6 : x2c0.A6;
            } else {
                i = -1;
            }
            ShareItemBean shareItemBean = i != -1 ? new ShareItemBean(str2, i, d30Var) : null;
            if (shareItemBean != null) {
                arrayList.add(shareItemBean);
            }
        }
        if (NullChecker.a(d30Var2)) {
            arrayList.add(new ShareItemBean("不感兴趣", upa.z() ? x2c0.v6 : x2c0.u6, d30Var2));
        }
        if (NullChecker.a(d30Var) && TextUtils.equals("share_right", str)) {
            arrayList.add(0, new ShareItemBean("匿名举报", upa.z() ? x2c0.D6 : x2c0.C6, d30Var));
        } else if (NullChecker.a(d30Var3)) {
            arrayList.add(new ShareItemBean("举报", upa.z() ? x2c0.D6 : x2c0.C6, d30Var3));
        }
        if (NullChecker.a(d30Var4)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            arrayList.add(new ShareItemBean(str3, upa.z() ? x2c0.p6 : x2c0.o6, d30Var4));
        }
        if (!vwb.J(list)) {
            arrayList.addAll(list);
        }
        ShareItemBean shareItemBean2 = (ShareItemBean) vwb.r(arrayList, new w9j() { // from class: l.xpk
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ShareItemBean) obj).getTag(), "foot_print"));
            }
        });
        int iG = vwb.G(arrayList, new w9j() { // from class: l.ypk
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ShareItemBean) obj).getName(), "取消喜欢"));
            }
        });
        if (NullChecker.a(shareItemBean2)) {
            arrayList.remove(shareItemBean2);
            arrayList.add(iG + 1, shareItemBean2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m5537K(Act act, final User user, final boolean z, roj0 roj0Var) {
        act.progressDismiss();
        act.finish();
        e51.H(CoreModule.b, new Runnable() { // from class: l.wqk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m5529G(user, z);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: K0 */
    public static List<ShareItemBean> m5538K0(final Act act, List<String> list, final Link link, final String str, final String str2, final String str3, final f30<String, String> f30Var, final g30<String, String, Throwable> g30Var) {
        ArrayList arrayList = new ArrayList();
        for (String str4 : list) {
            str4.getClass();
            switch (str4) {
                case "mo":
                    arrayList.add(new ShareItemBean("朋友圈", upa.z() ? x2c0.t6 : x2c0.r6, new d30() { // from class: l.dok
                        public final void call() {
                            ark.m5544N0(act, link, new ShareHelper.c("朋友圈", gmp0.b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
                case "qq":
                    arrayList.add(new ShareItemBean("QQ", upa.z() ? x2c0.j6 : x2c0.i6, new d30() { // from class: l.eok
                        public final void call() {
                            ark.m5544N0(act, link, new ShareHelper.c("QQ好友", dnb0.b, LinkChannel.get("qq_friend"), new String[]{"com.tencent.tim", "com.tencent.mobileqq", "com.tencent.mobileqqi"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
                case "qz":
                    arrayList.add(new ShareItemBean("QQ空间", upa.z() ? x2c0.l6 : x2c0.k6, new d30() { // from class: l.fok
                        public final void call() {
                            ark.m5544N0(act, link, new ShareHelper.c("QQ空间", cnb0.b, LinkChannel.get("qq-space"), new String[]{"com.tencent.tim", "com.tencent.mobileqq", "com.tencent.mobileqqi"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
                case "wx":
                    arrayList.add(0, new ShareItemBean("微信", upa.z() ? x2c0.z6 : x2c0.n6, new d30() { // from class: l.zqk
                        public final void call() {
                            ark.m5544N0(act, link, new ShareHelper.c("微信", rmp0.b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L0 */
    public static void m5540L0(final Act act, final ArrayList<Media> arrayList) {
        act.progress(R.string.J5);
        ya5.I(arrayList, QuestionCategory.profile).compose(mkd0.C()).flatMap(new w9j() { // from class: l.nok
            public final Object call(Object obj) {
                return ark.m5594o((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.yok
            public final void call(Object obj) {
                ark.m5535J(act, arrayList, (roj0) obj);
            }
        }, new e30() { // from class: l.jpk
            public final void call(Object obj) {
                ark.m5525E(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public static void m5542M0(Act act, final Runnable runnable) {
        if (upa.v2()) {
            lsi0.r("触发冷启动弹窗取消实验-回流用户-优先推荐弹窗");
            return;
        }
        if (zch0.a().c()) {
            return;
        }
        View viewInflate = o7r.a(act).inflate(f6c0.Eb, (ViewGroup) null);
        VImage vImageFindViewById = viewInflate.findViewById(u4c0.kb);
        final VText vTextFindViewById = viewInflate.findViewById(u4c0.jb);
        CoreModule.c.u0.Y6();
        final cwf0 cwf0VarC = i0e.c("p_reback_popup", Dialog.class.getName());
        vImageFindViewById.setImageResource(CoreModule.c.e0.na().isFemale() ? x2c0.qo : x2c0.oo);
        final dd80.a aVarO0 = act.newDialog().R(viewInflate).T(true).P(false).t0(i0g0.b0("欢迎回来，我们将对你进行优先推荐，你将会比现在多10倍的人看到。别让喜欢你的人等太久哦！", vwb.f0(new String[]{"10倍"}), Color.parseColor("#fe7e1d"), Typeface.DEFAULT)).c0("去划卡", new Runnable() { // from class: l.dqk
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_reback_popup_confirm", "p_reback_popup");
            }
        }).X("放弃", new Runnable() { // from class: l.eqk
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_reback_popup_cancel", "p_reback_popup");
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.gqk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ark.m5581h0(cwf0VarC, runnable, dialogInterface);
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.hqk
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        });
        act.duringCreated(CoreModule.c.u0.P6().first()).subscribe(mkd0.H(new e30() { // from class: l.iqk
            public final void call(Object obj) {
                ark.m5520B0(vTextFindViewById, aVarO0, (CoreLikers.a) obj);
            }
        }, new e30() { // from class: l.jqk
            public final void call(Object obj) {
                ark.m5561W((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m5543N(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static void m5544N0(Act act, Link link, ShareHelper.c cVar, String str, String str2, String str3, f30<String, String> f30Var, g30<String, String, Throwable> g30Var) {
        new ShareHelper(link).t0(f30Var).u0(g30Var).A0(act, cVar, link.href, str, str2, str3);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m5545O(boolean z, Act act, TextView textView, LinearLayout linearLayout, Throwable th) {
        ygh0.m11219i(z);
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            xdl0.M(textView, false);
            xdl0.M(linearLayout, true);
            CoreModule.H().handleAccountErrors(th);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static void m5546O0(Act act, String str, @NonNull d30 d30Var, boolean z) {
        m5548P0(act, str, d30Var, z, false, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static void m5548P0(final Act act, String str, @NonNull final d30 d30Var, boolean z, final boolean z2, @Nullable final d30 d30Var2) {
        String str2;
        String str3;
        View viewInflate = act.inflater().inflate(f6c0.dd, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(u4c0.Y8);
        final LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.ef);
        final View viewFindViewById = viewInflate.findViewById(u4c0.Zc);
        final VText vTextFindViewById = viewInflate.findViewById(u4c0.U0);
        final VEditText vEditTextFindViewById = viewInflate.findViewById(u4c0.We);
        final VEditText vEditTextFindViewById2 = viewInflate.findViewById(u4c0.G1);
        final VText vTextFindViewById2 = viewInflate.findViewById(u4c0.M4);
        final VText vTextFindViewById3 = viewInflate.findViewById(u4c0.D3);
        final LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(u4c0.Nb);
        final TextView textView2 = (TextView) viewInflate.findViewById(u4c0.Ob);
        final VCheckBox vCheckBoxFindViewById = viewInflate.findViewById(u4c0.g1);
        final VButton vButtonFindViewById = viewInflate.findViewById(u4c0.ya);
        final VButton vButtonFindViewById2 = viewInflate.findViewById(u4c0.za);
        VText vTextFindViewById4 = viewInflate.findViewById(u4c0.M8);
        final boolean[] zArr = {false};
        String strString = !z2 ? act.string(R.string.ls) : "登出当前帐号";
        vButtonFindViewById.setText(act.string(R.string.z3));
        vButtonFindViewById2.setText(act.getString(R.string.Zs));
        vTextFindViewById4.setText(strString);
        final Runnable runnable = new Runnable() { // from class: l.gok
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditTextFindViewById, 0);
            }
        };
        final String str4 = strString;
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(true).M(false).n0(new DialogInterface.OnDismissListener() { // from class: l.ook
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ark.m5586k(d30Var, act, runnable, dialogInterface);
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.pok
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ark.m5609v0(vEditTextFindViewById, act, runnable, dialogInterface);
            }
        }).O();
        vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.qok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5578f0(z2, textView, zArr, act, linearLayout2, dd80VarO, d30Var2, vEditTextFindViewById, linearLayout, vEditTextFindViewById2, vTextFindViewById, vTextFindViewById3, vButtonFindViewById, view);
            }
        });
        if ("登出当前帐号".equals(str4)) {
            dd80VarO.setCancelable(false);
        }
        vTextFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: l.rok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5611w0(str4, act, dd80VarO, z2, view);
            }
        });
        vButtonFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.sok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5612x(linearLayout2, textView, vButtonFindViewById2, linearLayout, viewFindViewById, z2, view);
            }
        });
        final j760 j760VarD = ChinaMobileController.d();
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.tok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                j760 j760Var = j760VarD;
                act2.startActivity(WebViewAct.Z1(act2, (String) j760Var.a, (String) j760Var.b));
            }
        });
        vTextFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.uok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.H().Aq(act, new e30() { // from class: l.bqk
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        vTextFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.vok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5571b0(vEditTextFindViewById, vTextFindViewById, vTextFindViewById2, vEditTextFindViewById2, act, z2, vTextFindViewById3, vButtonFindViewById, view);
            }
        });
        vTextFindViewById.setText("+" + ((zqb) zqb.d.get(0)).b);
        if (e51.B(act.getLocalClassName())) {
            vTextFindViewById2.setEnabled(false);
            vTextFindViewById2.setClickable(false);
            vTextFindViewById2.setText(R.string.Lo);
            act.duringCreated(e51.N(act.getLocalClassName(), 60)).subscribe(mkd0.I(new e30() { // from class: l.wok
                public final void call(Object obj) {
                    ark.m5551R(vTextFindViewById2, act, (Long) obj);
                }
            }, new e30() { // from class: l.hok
                public final void call(Object obj) {
                    ark.m5543N((Throwable) obj);
                }
            }, new d30() { // from class: l.iok
                public final void call() {
                    ark.m5583i0(vTextFindViewById2, vEditTextFindViewById);
                }
            }));
        } else {
            xdl0.y(vTextFindViewById2, vEditTextFindViewById.getText().length() > 0);
        }
        vEditTextFindViewById.h().subscribe(mkd0.G(new e30() { // from class: l.jok
            public final void call(Object obj) {
                ark.m5575d0(vEditTextFindViewById, vTextFindViewById2, act, vTextFindViewById3, vButtonFindViewById, (CharSequence) obj);
            }
        }));
        vEditTextFindViewById2.h().subscribe(mkd0.G(new e30() { // from class: l.kok
            public final void call(Object obj) {
                ark.m5527F(vTextFindViewById3, vButtonFindViewById, (CharSequence) obj);
            }
        }));
        if (TextUtils.isEmpty(str)) {
            str2 = str;
            xdl0.M(linearLayout2, false);
            xdl0.X(viewFindViewById, t100.m);
        } else {
            xdl0.M(linearLayout2, true);
            zvf0.A("e_sign_in_agreement", "", new j760[]{vwb.Y("agreement_entrance", "bind_popup")});
            xdl0.E0(vCheckBoxFindViewById, new View.OnClickListener() { // from class: l.lok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ark.m5608v(zArr, vCheckBoxFindViewById, view);
                }
            });
            xdl0.E0(textView2, new View.OnClickListener() { // from class: l.mok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ark.m5598q(textView2, zArr, vCheckBoxFindViewById, view);
                }
            });
            textView2.setText(i0g0.B(act, act.getString(R.string.y3, "《" + ((String) j760VarD.a) + "》"), new String[]{(String) j760VarD.a, (String) j760VarD.b}));
            textView2.setText(i0g0.B(act, act.getString(R.string.y3, "《" + ((String) j760VarD.a) + "》"), new String[]{(String) j760VarD.a, (String) j760VarD.b}));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            str2 = str;
            textView.setText(str2);
        }
        xdl0.M(textView, !TextUtils.isEmpty(str2));
        xdl0.M(linearLayout, TextUtils.isEmpty(str2));
        xdl0.M(vButtonFindViewById2, !TextUtils.isEmpty(str2));
        if (vy8.d() && TextUtils.isEmpty(str2) && !z2) {
            String strM8991f = qgp0.m8990e().m8991f(act);
            if (!TextUtils.isEmpty(strM8991f)) {
                vEditTextFindViewById.setText(strM8991f);
                vEditTextFindViewById.setSelection(strM8991f.length());
            }
        } else if (!z2 && TextUtils.isEmpty(str2)) {
            String strM8991f2 = qgp0.m8990e().m8991f(act);
            if (!TextUtils.isEmpty(strM8991f2)) {
                vEditTextFindViewById.setText(strM8991f2);
                vEditTextFindViewById.setSelection(vEditTextFindViewById.getText().length());
            }
        }
        String str5 = z2 ? "signout" : "on";
        if (TextUtils.isEmpty(str2)) {
            str3 = TextUtils.isEmpty(vEditTextFindViewById.getText().toString()) ? "no_number" : "secret_number";
        } else {
            str3 = "one_click";
        }
        ygh0.m11215g(str5, str3);
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m5550Q0(Act act, String str, final d30 d30Var) {
        String str2 = ((Media) CoreModule.c.e0.p9().fp()).url;
        String string = act.getString(R.string.S);
        Dialog dialogZ = act.dialog().Q().M(f6c0.md).v().E0(R.string.Wg).F(i0g0.b0(act.getString(R.string.R, string), vwb.f0(new String[]{string}), act.color(w0c0.N1), eqh0.c(3))).t0(R.string.Vg, new Runnable() { // from class: l.vpk
            @Override // java.lang.Runnable
            public final void run() {
                ygh0.m11180D();
            }
        }).l0(R.string.Nl, new Runnable() { // from class: l.wpk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m5555T(d30Var);
            }
        }).B(false).z();
        View viewP = dialogZ.P();
        VDraweeView vDraweeViewFindViewById = viewP.findViewById(u4c0.f8);
        VDraweeView vDraweeViewFindViewById2 = viewP.findViewById(u4c0.g9);
        qib0.G.L0(vDraweeViewFindViewById, str2);
        qib0.G.L0(vDraweeViewFindViewById2, str);
        dialogZ.show();
        ygh0.m11181E();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m5551R(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R.string.Rs)));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static l5j0 m5552R0(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8, User user) {
        return m5570a1(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, d30Var8, null, user);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m5554S0(Act act, boolean z) {
        ic50.j().f().s0(act, OmsDialog.p_alert_cheat_prevention__verify_required_popup.getIdentifier());
        final OmsBaseRender omsBaseRenderH = nc50.f().h();
        final c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.c.e0.o9().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.dpk
            public final void call(Object obj) {
                ark.m5603s0(omsBaseRenderH, (User) obj);
            }
        }));
        final c4g0 c4g0VarSubscribe2 = act.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).filter(new w9j() { // from class: l.epk
            public final Object call(Object obj) {
                return Boolean.valueOf(((VerificationCenter) obj) != null);
            }
        }).map(new w9j() { // from class: l.fpk
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).picVerificationInfo.status;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.gpk
            public final void call(Object obj) {
                ark.m5585j0(omsBaseRenderH, (StudentVerificationStatus) obj);
            }
        }));
        if (NullChecker.a(omsBaseRenderH)) {
            omsBaseRenderH.b0(new DialogInterface.OnDismissListener() { // from class: l.hpk
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ark.m5524D0(c4g0VarSubscribe, c4g0VarSubscribe2, dialogInterface);
                }
            });
            tvf.n();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m5555T(d30 d30Var) {
        ygh0.m11182F();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m5556T0(Act act) {
        NameFakeView nameFakeViewInflate = act.inflater().inflate(f6c0.de, (ViewGroup) null, false);
        nameFakeViewInflate.h(act);
        final Dialog dialogZ = act.dialog().O(nameFakeViewInflate).u().B(false).z();
        Objects.requireNonNull(dialogZ);
        nameFakeViewInflate.i(act, new d30() { // from class: l.cok
            public final void call() {
                dialogZ.dismiss();
            }
        });
        dialogZ.show();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m5557U(f30 f30Var, WheelPicker wheelPicker, WheelPicker wheelPicker2, l5j0 l5j0Var, View view) {
        f30Var.call(Integer.valueOf(wheelPicker.getCurrentItemPosition()), Integer.valueOf(wheelPicker2.getCurrentItemPosition()));
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: U0 */
    public static l5j0 m5558U0(Act act, String str, d30 d30Var, d30 d30Var2) {
        return m5566Y0("", act, "", str, "", "", d30Var, d30Var2, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: V0 */
    public static void m5560V0(Act act, boolean z, Media media, CharSequence charSequence, Runnable runnable) {
        m5562W0(act, z, media, charSequence, runnable, "");
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m5561W(Throwable th) {
    }

    /* JADX INFO: renamed from: W0 */
    public static void m5562W0(Act act, final boolean z, Media media, CharSequence charSequence, final Runnable runnable, String str) {
        CoreModule.c.e0.p9();
        final boolean z2 = false;
        ProfileFakeView profileFakeViewInflate = act.inflater().inflate(f6c0.xe, (ViewGroup) null, false);
        profileFakeViewInflate.a(z, media);
        dd80.a aVarM = new dd80.a(act).e0(true).R(profileFakeViewInflate.getRenderView()).P(!z).M(true);
        aVarM.b0(charSequence).W((CharSequence) null);
        dd80 dd80VarO = aVarM.O();
        final dd80[] dd80VarArr = {dd80VarO};
        dd80VarO.W(new Runnable() { // from class: l.qqk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m5533I(z, runnable, dd80VarArr);
            }
        });
        if (!z && CoreModule.c.e0.k8()) {
            profileFakeViewInflate.getTitleView().setText(act.getString(R.string.O));
        }
        final c4g0 c4g0VarSubscribe = z ? act.duringCreated(b.r().q(), false).take(1).subscribe(mkd0.G(new e30() { // from class: l.xqk
            public final void call(Object obj) {
                ark.m5602s(dd80VarArr, (roj0) obj);
            }
        })) : null;
        final cwf0 cwf0VarC = i0e.c("p_fake_twoguide", Dialog.class.getName());
        dd80VarArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yqk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ark.m5593n0(c4g0VarSubscribe, z, z2, cwf0VarC, dialogInterface);
            }
        });
        dd80VarArr[0].show();
        if (!z) {
            ygh0.m11235s();
        } else {
            ygh0.m11232p(f2865i);
            f2865i = "";
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static void m5564X0(Act act, int i, int i2, final f30<Integer, Integer> f30Var) {
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCancelable(false);
        l5j0Var.setContentView(f6c0.bb);
        VIcon vIconFindViewById = l5j0Var.findViewById(u4c0.p4);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.q4);
        final WheelPicker wheelPickerFindViewById = l5j0Var.findViewById(u4c0.cb);
        final WheelPicker wheelPickerFindViewById2 = l5j0Var.findViewById(u4c0.db);
        if (i < 0 || i >= 24) {
            return;
        }
        wheelPickerFindViewById.setData(f2863g);
        wheelPickerFindViewById.setSelectedItemPosition(i);
        if (i2 <= 0 || i2 > 24) {
            return;
        }
        wheelPickerFindViewById2.setData(f2864h);
        wheelPickerFindViewById2.setSelectedItemPosition(i2 - 1);
        xdl0.E0(vIconFindViewById, new View.OnClickListener() { // from class: l.kqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.dismiss();
            }
        });
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.lqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5557U(f30Var, wheelPickerFindViewById, wheelPickerFindViewById2, l5j0Var, view);
            }
        });
        final Window window = l5j0Var.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(android.R.id.content).findViewById(u4c0.o2)).setBackgroundResource(x2c0.gp);
        }
        e51.G(new Runnable() { // from class: l.mqk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.k);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: Y0 */
    public static l5j0 m5566Y0(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7) {
        return m5568Z0(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, null);
    }

    /* JADX INFO: renamed from: Z0 */
    public static l5j0 m5568Z0(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8) {
        return m5570a1(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, d30Var8, null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ roj0 m5569a0(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: a1 */
    public static l5j0 m5570a1(String str, Act act, String str2, String str3, String str4, String str5, final d30 d30Var, final d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, final d30 d30Var8, List<ShareItemBean> list, User user) {
        String str6;
        String str7;
        cwf0 cwf0VarC = i0e.c("p_share_pop", Dialog.class.getName());
        if (TextUtils.equals("from_discover_dating", str2) || TextUtils.equals("from_album", str2) || TextUtils.equals("from_like", str2) || TextUtils.equals("from_nearby_falls_feed", str2) || TextUtils.equals("from_nearby_focus", str2) || TextUtils.equals("from_activity_tab_one", str2) || TextUtils.equals("from_activity_tab_two", str2) || TextUtils.equals("from_discover_discussion", str2)) {
            str6 = "moment_feed";
        } else {
            str6 = "moment_detail";
            if (!TextUtils.equals("moment_detail", str2)) {
                str6 = null;
            }
        }
        String str8 = "";
        if (TextUtils.isEmpty(str6)) {
            str6 = TextUtils.isEmpty(str3) ? "" : str3;
        }
        j760 j760VarY = vwb.Y("moment_id", str);
        j760 j760VarY2 = vwb.Y("share_pop_from_which", str6);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            str7 = str3;
        } else {
            str7 = str3;
            if (TextUtils.equals(str7, "discover_discussion")) {
                str8 = str2;
            }
        }
        cwf0VarC.p(new j760[]{j760VarY, j760VarY2, vwb.Y("moment_share_from_which", str8)});
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(f6c0.Ob);
        l5j0Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC3289a(cwf0VarC, d30Var7));
        l5j0Var.setOnKeyListener(new DialogInterfaceOnKeyListenerC3290b());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(android.R.id.content).findViewById(u4c0.o2)).setBackgroundResource(x2c0.gp);
        }
        e51.G(new Runnable() { // from class: l.xok
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.k);
            }
        });
        VLinear vLinearFindViewById = l5j0Var.findViewById(u4c0.B7);
        VImage vImageFindViewById = l5j0Var.findViewById(u4c0.C7);
        VLinear vLinearFindViewById2 = l5j0Var.findViewById(u4c0.z7);
        VImage vImageFindViewById2 = l5j0Var.findViewById(u4c0.A7);
        VImage vImageFindViewById3 = l5j0Var.findViewById(u4c0.y7);
        if (upa.z()) {
            vImageFindViewById.setImageResource(x2c0.y6);
            vImageFindViewById2.setImageResource(x2c0.s6);
            vImageFindViewById3.setImageResource(x2c0.m6);
        }
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.ge);
        if (NullChecker.a(user) && sb90.m9300d(user)) {
            textView.setText("更多操作");
            xdl0.M(vLinearFindViewById, false);
            xdl0.M(vLinearFindViewById2, false);
        }
        VLinear vLinearFindViewById3 = l5j0Var.findViewById(u4c0.x7);
        if (TextUtils.equals("p_moment_preview", str2) && NullChecker.a(d30Var8)) {
            zvf0.x("e_save_picture", "p_share_pop");
            xdl0.M(vLinearFindViewById3, true);
        }
        VRecyclerView vRecyclerViewFindViewById = l5j0Var.findViewById(u4c0.Ib);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerViewFindViewById.setLayoutManager(linearLayoutManager);
        dse0 dse0Var = new dse0(act);
        List<ShareItemBean> listM5536J0 = m5536J0(d30Var3, d30Var4, d30Var5, d30Var6, str7, str4, str5, list);
        xdl0.M(vRecyclerViewFindViewById, true ^ vwb.J(listM5536J0));
        vRecyclerViewFindViewById.setAdapter(dse0Var);
        dse0Var.C(listM5536J0);
        dse0Var.D(new C3291c(listM5536J0, l5j0Var));
        VText vTextFindViewById = l5j0Var.findViewById(u4c0.xe);
        xdl0.E0(vLinearFindViewById, new View.OnClickListener() { // from class: l.zok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5577e0(d30Var, l5j0Var, view);
            }
        });
        xdl0.E0(vLinearFindViewById2, new View.OnClickListener() { // from class: l.apk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5616z(d30Var2, l5j0Var, view);
            }
        });
        xdl0.E0(vLinearFindViewById3, new View.OnClickListener() { // from class: l.bpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5617z0(d30Var8, l5j0Var, view);
            }
        });
        xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.cpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5573c0(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m5571b0(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, final boolean z, final VText vText3, final VButton vButton, View view) {
        if (!m5530G0(yij0.M(vEditText), yij0.I(vText) == 86)) {
            lsi0.y("请输入正确手机号");
            return;
        }
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(vText);
        verifyData.mobileNumber = yij0.M(vEditText);
        xdl0.y(vText2, false);
        vText2.setEnabled(false);
        vText2.setText("...");
        CoreModule.H().send(verifyData).subscribe(mkd0.K(new e30() { // from class: l.zpk
            public final void call(Object obj) {
                ark.m5584j(vEditText2, vText2, act, vEditText, z, (roj0) obj);
            }
        }, new e30() { // from class: l.aqk
            public final void call(Object obj) {
                ark.m5610w(vText2, vEditText, vText3, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: b1 */
    public static l5j0 m5572b1(Act act, String str, Link link, String str2, String str3, String str4, List<LinkChannel> list, f30<String, String> f30Var, g30<String, String, Throwable> g30Var) {
        return m5574c1(act, str, m5538K0(act, ShareHelper.S(act, list), link, str2, str3, str4, f30Var, g30Var));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m5573c0(l5j0 l5j0Var, View view) {
        zvf0.r("e_share_pop_cancel", "p_share_pop");
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: c1 */
    public static l5j0 m5574c1(Act act, String str, List<ShareItemBean> list) {
        cwf0 cwf0VarC = i0e.c("p_share_pop", Dialog.class.getName());
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        cwf0VarC.p(new j760[]{vwb.Y("share_pop_from_which", str)});
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(f6c0.Rb);
        l5j0Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC3292d(cwf0VarC));
        l5j0Var.setOnKeyListener(new DialogInterfaceOnKeyListenerC3293e());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(android.R.id.content).findViewById(u4c0.o2)).setBackgroundResource(x2c0.gp);
        }
        e51.G(new Runnable() { // from class: l.upk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.k);
            }
        });
        VRecyclerView vRecyclerViewFindViewById = l5j0Var.findViewById(u4c0.Jb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerViewFindViewById.setLayoutManager(linearLayoutManager);
        dse0 dse0Var = new dse0(act);
        vRecyclerViewFindViewById.setAdapter(dse0Var);
        dse0Var.C(list);
        dse0Var.D(new C3294f(list, l5j0Var));
        xdl0.E0(l5j0Var.findViewById(u4c0.xe), new View.OnClickListener() { // from class: l.fqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m5601r0(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m5575d0(VEditText vEditText, VText vText, Act act, VText vText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else if (TextUtils.equals(vText.getText().toString(), act.string(R.string.Fo))) {
            xdl0.y(vText, true);
        }
        xdl0.M(vText2, false);
        xdl0.X(vButton, t100.q);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m5576d1(Act act, d30 d30Var) {
        final cwf0 cwf0VarC = i0e.c("p_user_profile_share_agreement_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        dd80 dd80VarR0 = new dd80.a(act).S(x2c0.hp).y0("分享新功能").t0("进入ta人主页可将ta的名片分享给您的朋友，使用截图有更多惊喜！若您需要关闭该功能则可前往设置-隐私和通知进行关闭").P(false).c0("我知道了", new Runnable() { // from class: l.ipk
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_user_profile_share_agreement_popup_confirm", "p_user_profile_share_agreement_popup");
            }
        }).r0();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        dd80VarR0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kpk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m5577e0(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.a(d30Var)) {
            zvf0.r("e_share_pop_wechat", "p_share_pop");
            d30Var.call();
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m5578f0(final boolean z, final TextView textView, boolean[] zArr, final Act act, LinearLayout linearLayout, final dd80 dd80Var, final d30 d30Var, final VEditText vEditText, final LinearLayout linearLayout2, VEditText vEditText2, VText vText, final VText vText2, final VButton vButton, View view) {
        ygh0.m11207c(z ? "signout" : "on");
        if (textView.getVisibility() == 0) {
            if (!zArr[0]) {
                linearLayout.startAnimation(AnimationUtils.loadAnimation(act, rzb0.j));
                return;
            } else {
                act.progress(R.string.J5);
                act.duringCreated(ChinaMobileController.b().h(5000).doOnNext(new e30() { // from class: l.npk
                    public final void call(Object obj) {
                        ark.m5605t0(z, act, (MobileRespInfo) obj);
                    }
                }).filter(new w9j() { // from class: l.opk
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((MobileRespInfo) obj).failed);
                    }
                }).flatMap(new w9j() { // from class: l.ppk
                    public final Object call(Object obj) {
                        MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                        return CoreModule.H().oneClickBindPhone(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
                    }
                }), false).subscribe(mkd0.H(new e30() { // from class: l.qpk
                    public final void call(Object obj) {
                        ark.m5615y0(act, dd80Var, d30Var, z, vEditText, (roj0) obj);
                    }
                }, new e30() { // from class: l.rpk
                    public final void call(Object obj) {
                        ark.m5545O(z, act, textView, linearLayout2, (Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (TextUtils.isEmpty(vEditText.getText())) {
            lsi0.w(R.string.Ko);
            return;
        }
        if (TextUtils.isEmpty(vEditText2.getText())) {
            lsi0.w(R.string.m4);
            return;
        }
        act.progress(R.string.J5);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.I(vEditText2);
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(vText);
        verifyData.mobileNumber = yij0.M(vEditText);
        verifyData.action = VerifyReason.get("bind_mobile");
        verifyData.countryCode = yij0.I(vText);
        verifyData.mobileNumber = yij0.M(vEditText);
        CoreModule.H().verify(verifyData).subscribe(mkd0.K(new e30() { // from class: l.spk
            public final void call(Object obj) {
                ark.m5599q0(act, dd80Var, d30Var, z, vEditText, (roj0) obj);
            }
        }, new e30() { // from class: l.tpk
            public final void call(Object obj) {
                ark.m5606u(z, act, vText2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m5579g0(final Act act, String str, final User user, final boolean z, d30 d30Var) {
        act.progress(R.string.J5, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = act.getString(R.string.Tl);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        report.chatMessages = arrayList;
        new Relationship().state = RelationshipStatus.get(LikedUserFilter.blocked);
        mkd0.r(CoreModule.c.e0.ha(((DbObject) user).id, report), CoreModule.c.f0.qe(((DbObject) user).id, act), new x9j() { // from class: l.tqk
            public final Object call(Object obj, Object obj2) {
                return ark.m5569a0((roj0) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.uqk
            public final void call(Object obj) {
                ark.m5537K(act, user, z, (roj0) obj);
            }
        }, new e30() { // from class: l.vqk
            public final void call(Object obj) {
                ark.m5588l(act, (Throwable) obj);
            }
        }));
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m5580h(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R.string.Fo);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m5581h0(cwf0 cwf0Var, Runnable runnable, DialogInterface dialogInterface) {
        zch0.a().j(false, "reBackAppGuideDialog");
        i0e.e(cwf0Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m5583i0(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R.string.Fo);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m5584j(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, boolean z, roj0 roj0Var) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R.string.Lo);
        act.duringCreated(e51.N(act.getLocalClassName(), 60)).subscribe(mkd0.I(new e30() { // from class: l.nqk
            public final void call(Object obj) {
                ark.m5521C(vText, act, (Long) obj);
            }
        }, new e30() { // from class: l.oqk
            public final void call(Object obj) {
                ark.m5591m0((Throwable) obj);
            }
        }, new d30() { // from class: l.pqk
            public final void call() {
                ark.m5580h(vText, vEditText2);
            }
        }));
        ygh0.m11217h(z ? "signout" : "on");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m5585j0(OmsBaseRender omsBaseRender, StudentVerificationStatus studentVerificationStatus) {
        if ((TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "verified")) && NullChecker.a(omsBaseRender) && omsBaseRender.c.Y().isShowing()) {
            omsBaseRender.Q();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m5586k(d30 d30Var, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        ygh0.m11213f();
        act.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m5588l(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m5591m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m5593n0(c4g0 c4g0Var, boolean z, boolean z2, cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.z(c4g0Var);
        if (!z) {
            ygh0.m11233q();
        } else if (z2) {
            i0e.e(cwf0Var);
        } else {
            ygh0.m11231o();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ c m5594o(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5598q(TextView textView, boolean[] zArr, VCheckBox vCheckBox, View view) {
        if (textView.getSelectionStart() == -1 && textView.getSelectionEnd() == -1) {
            zvf0.u("e_sign_in_agreement", "", new j760[]{vwb.Y("agreement_entrance", "bind_popup")});
            boolean z = !zArr[0];
            zArr[0] = z;
            vCheckBox.setChecked(z);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m5599q0(Act act, dd80 dd80Var, d30 d30Var, boolean z, VEditText vEditText, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.c.e0.W9(CoreModule.H().userId());
        e51.K(act.getLocalClassName());
        lsi0.y(act.string(R.string.at));
        m5532H0(dd80Var);
        dd80Var.dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        ygh0.m11221j(z, vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5600r(Notification notification) {
        if (NullChecker.a(AccessToken.d())) {
            bzv.m().u();
        }
        ygh0.m11223k();
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m5601r0(l5j0 l5j0Var, View view) {
        zvf0.r("e_share_pop_cancel", "p_share_pop");
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5602s(dd80[] dd80VarArr, roj0 roj0Var) {
        if (dd80VarArr[0].isShowing()) {
            dd80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m5603s0(OmsBaseRender omsBaseRender, User user) {
        boolean zA = NullChecker.a(vwb.r(user.status, new w9j() { // from class: l.cqk
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((UserStatus) obj, "RISK_TAG_MANDATORY_PICTURE_VERIFICATION"));
            }
        }));
        boolean z = (vwb.J(user.status) || !user.status.contains(UserStatus.get(MyVisitorsShowType.hidden)) || ((Integer) App.i.get()).equals(CoreModule.c.e0.I7())) ? false : true;
        if ((!zA || z) && NullChecker.a(omsBaseRender) && omsBaseRender.c.Y().isShowing()) {
            omsBaseRender.Q();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m5605t0(boolean z, Act act, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ygh0.m11219i(z);
            act.progressDismiss();
            lsi0.y(act.string(R.string.x3));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5606u(boolean z, Act act, VText vText, VButton vButton, Throwable th) {
        ygh0.m11219i(z);
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.G(th);
            return;
        }
        String strL = yij0.l(i);
        if (strL == null) {
            yij0.G(th);
            return;
        }
        xdl0.M0(vText, true);
        vText.setText(strL);
        xdl0.X(vButton, t100.j);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5608v(boolean[] zArr, VCheckBox vCheckBox, View view) {
        zvf0.u("e_sign_in_agreement", "", new j760[]{vwb.Y("agreement_entrance", "bind_popup")});
        boolean z = !zArr[0];
        zArr[0] = z;
        vCheckBox.setChecked(z);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m5609v0(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (vwb.L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m5610w(VText vText, VEditText vEditText, VText vText2, VButton vButton, Throwable th) {
        vText.setClickable(true);
        vText.setEnabled(true);
        vText.setText(R.string.Fo);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.y(vText, false);
        } else {
            xdl0.y(vText, true);
        }
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.G(th);
            return;
        }
        String strL = yij0.l(i);
        if (strL == null) {
            yij0.G(th);
            return;
        }
        xdl0.M0(vText2, true);
        vText2.setText(strL);
        xdl0.X(vButton, t100.j);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m5611w0(String str, final Act act, dd80 dd80Var, boolean z, View view) {
        if ("登出当前帐号".equals(str)) {
            act.progress(R.string.J5);
            if (qp8.c()) {
                User userMe_ = CoreModule.K().me_();
                if (NullChecker.a(userMe_)) {
                    qib0.L.d.p(((Media) userMe_.fp()).url, (AuthData) CoreModule.H().getAuthData().b(), userMe_.name);
                }
            }
            qib0.Z0(true, false).materialize().first().subscribe(mkd0.H(new e30() { // from class: l.lpk
                public final void call(Object obj) {
                    ark.m5600r((Notification) obj);
                }
            }, new e30() { // from class: l.mpk
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }));
        }
        m5532H0(dd80Var);
        dd80Var.dismiss();
        if (z) {
            return;
        }
        ygh0.m11211e();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m5612x(LinearLayout linearLayout, TextView textView, VButton vButton, LinearLayout linearLayout2, View view, boolean z, View view2) {
        xdl0.M(linearLayout, false);
        xdl0.M(textView, false);
        xdl0.M(vButton, false);
        xdl0.M(linearLayout2, true);
        xdl0.X(view, t100.m);
        ygh0.m11209d(z ? "signout" : "on");
        ygh0.m11215g(z ? "signout" : "on", "no_number");
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m5615y0(Act act, dd80 dd80Var, d30 d30Var, boolean z, VEditText vEditText, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.c.e0.W9(CoreModule.H().userId());
        lsi0.y(act.string(R.string.at));
        dd80Var.dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        ygh0.m11221j(z, vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m5616z(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.a(d30Var)) {
            zvf0.r("e_share_pop_wechat_moment", "p_share_pop");
            d30Var.call();
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m5617z0(d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.r("e_save_picture", "p_share_pop");
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        l5j0Var.dismiss();
    }
}
