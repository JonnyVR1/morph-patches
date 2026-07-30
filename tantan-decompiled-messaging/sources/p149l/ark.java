package p149l;

import android.R;
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
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.ShareItemBean;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.popup.NameFakeView;
import com.p046p1.mobile.putong.core.p053ui.popup.ProfileFakeView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p133rx.C22306c;
import p133rx.Notification;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public final class ark extends s4e {

    /* JADX INFO: renamed from: g */
    public static final List<String> f71284g = Arrays.asList("00:00", "01:00", "02:00", "03:00", "04:00", "05:00", Constants.DND_STOP, "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", Constants.DND_START, "23:00");

    /* JADX INFO: renamed from: h */
    public static final List<String> f71285h = Arrays.asList("01:00", "02:00", "03:00", "04:00", "05:00", Constants.DND_STOP, "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", Constants.DND_START, "23:00", "24:00");

    /* JADX INFO: renamed from: i */
    public static String f71286i;

    /* JADX INFO: renamed from: l.ark$a */
    public class DialogInterfaceOnDismissListenerC15699a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f71287a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f71288b;

        public DialogInterfaceOnDismissListenerC15699a(cwf0 cwf0Var, d30 d30Var) {
            this.f71287a = cwf0Var;
            this.f71288b = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f71287a);
            if (NullChecker.m81303a(this.f71288b)) {
                this.f71288b.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.ark$b */
    public class DialogInterfaceOnKeyListenerC15700b implements DialogInterface.OnKeyListener {
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
    public class C15701c implements dse0.InterfaceC16463b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f71289a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5j0 f71290b;

        public C15701c(List list, l5j0 l5j0Var) {
            this.f71289a = list;
            this.f71290b = l5j0Var;
        }

        @Override // p149l.dse0.InterfaceC16463b
        /* JADX INFO: renamed from: a */
        public void mo98511a(View view, int i) {
            ((ShareItemBean) this.f71289a.get(i)).getAction().call();
            this.f71290b.m101651T();
        }
    }

    /* JADX INFO: renamed from: l.ark$d */
    public class DialogInterfaceOnDismissListenerC15702d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f71291a;

        public DialogInterfaceOnDismissListenerC15702d(cwf0 cwf0Var) {
            this.f71291a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f71291a);
        }
    }

    /* JADX INFO: renamed from: l.ark$e */
    public class DialogInterfaceOnKeyListenerC15703e implements DialogInterface.OnKeyListener {
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
    public class C15704f implements dse0.InterfaceC16463b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f71292a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5j0 f71293b;

        public C15704f(List list, l5j0 l5j0Var) {
            this.f71292a = list;
            this.f71293b = l5j0Var;
        }

        @Override // p149l.dse0.InterfaceC16463b
        /* JADX INFO: renamed from: a */
        public void mo98511a(View view, int i) {
            ShareItemBean shareItemBean = (ShareItemBean) this.f71292a.get(i);
            if (NullChecker.m81303a(shareItemBean)) {
                String name = shareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        zvf0.m220396r("e_share_pop_wechat", "p_share_pop");
                    } else if ("朋友圈".equals(name)) {
                        zvf0.m220396r("e_share_pop_wechat_moment", "p_share_pop");
                    } else if (com.tencent.connect.common.Constants.SOURCE_QQ.equals(name)) {
                        zvf0.m220396r("e_share_pop_qq", "p_share_pop");
                    } else if ("QQ空间".equals(name)) {
                        zvf0.m220396r("e_share_pop_qqzone", "p_share_pop");
                    }
                }
                if (NullChecker.m81303a(((ShareItemBean) this.f71292a.get(i)).getAction())) {
                    ((ShareItemBean) this.f71292a.get(i)).getAction().call();
                }
                this.f71293b.m101651T();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m98413B0(VText vText, dd80.C16336a c16336a, CoreLikers.C4719a c4719a) {
        String str;
        int iRandom = c4719a.f19270b + 10;
        if (iRandom <= 10) {
            iRandom = (int) ((Math.random() * 89.0d) + 10.0d);
        }
        if (iRandom >= 99) {
            str = "99+";
        } else {
            str = iRandom + "";
        }
        vText.setText(str);
        c16336a.m110996y0(String.format("你离开后，仍有 %s 个人喜欢着你", zz6.m221000q0(iRandom)));
        zch0.m218024a().m218033j(true, "reBackAppGuideDialog");
        c16336a.m110989r0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m98414C(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f18105Rs)));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m98417D0(c4g0 c4g0Var, c4g0 c4g0Var2, DialogInterface dialogInterface) {
        if (!c4g0Var.isUnsubscribed()) {
            c4g0Var.unsubscribe();
        }
        if (c4g0Var2.isUnsubscribed()) {
            return;
        }
        c4g0Var2.unsubscribe();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m98418E(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m98419E0(final Act act, final User user, final String str, final d30 d30Var, final boolean z) {
        final Runnable runnable = new Runnable() { // from class: l.rqk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m98472g0(act, str, user, z, d30Var);
            }
        };
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(act.getString(R$string.f18917si)).m208728g(false).m208729h(false).m208726e(R$string.f18408c).m208738q(R$string.f18977ui).m208736o(new View.OnClickListener() { // from class: l.sqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m98420F(VText vText, VButton vButton, CharSequence charSequence) {
        xdl0.m208344M(vText, false);
        xdl0.m208360X(vButton, t100.f167268q);
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m98421F0(Act act, Runnable runnable) {
        if (!CoreModule.f17545c.f19639e0.m169476c8()) {
            return false;
        }
        m98453V0(act, true, CoreModule.f17545c.f19639e0.m169520na().m60124fp(), act.string(R$string.f17827Ik), runnable);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m98422G(User user, boolean z) {
        Application application = CoreModule.f17544b;
        application.startActivity(DialogAct.m79378P0(application, 2, user, z));
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m98423G0(String str, boolean z) {
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
    public static void m98425H0(@NonNull dd80 dd80Var) {
        try {
            Window window = dd80Var.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) dd80Var.getContext().getSystemService("input_method");
            if (NullChecker.m81303a(window) && NullChecker.m81303a(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.m81303a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m98426I(boolean z, Runnable runnable, dd80[] dd80VarArr) {
        if (z) {
            ygh0.m214694n();
        } else {
            ygh0.m214699r();
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        dd80VarArr[0].dismiss();
    }

    /* JADX INFO: renamed from: I0 */
    public static String m98427I0() {
        if (vwb.m200296J(CoreModule.f17545c.f19639e0.m169520na().status)) {
            return AIMessageFeedback.good;
        }
        return CoreModule.f17545c.f19639e0.m169520na().status.contains(UserStatus.get("hidden")) ? Channel.fake : "other";
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m98428J(Act act, ArrayList arrayList, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        m98453V0(act, false, (Media) arrayList.get(0), act.string(R$string.f18491el), null);
    }

    /* JADX INFO: renamed from: J0 */
    public static List<ShareItemBean> m98429J0(d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, String str, String str2, String str3, List<ShareItemBean> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        boolean zMo60322Tp = CoreModule.m29934N().mo60322Tp();
        if (NullChecker.m81303a(d30Var) && (!zMo60322Tp || !TextUtils.equals("喜欢", str2))) {
            if (TextUtils.equals("关注", str2)) {
                i = x2c0.f190481q6;
            } else if (TextUtils.equals("喜欢", str2)) {
                i = upa.m194847z() ? x2c0.f190705x6 : x2c0.f190673w6;
            } else if (TextUtils.equals("取消关注", str2) || TextUtils.equals("取消喜欢", str2)) {
                i = upa.m194847z() ? x2c0.f189192B6 : x2c0.f189160A6;
            } else {
                i = -1;
            }
            ShareItemBean shareItemBean = i != -1 ? new ShareItemBean(str2, i, d30Var) : null;
            if (shareItemBean != null) {
                arrayList.add(shareItemBean);
            }
        }
        if (NullChecker.m81303a(d30Var2)) {
            arrayList.add(new ShareItemBean("不感兴趣", upa.m194847z() ? x2c0.f190641v6 : x2c0.f190609u6, d30Var2));
        }
        if (NullChecker.m81303a(d30Var) && TextUtils.equals("share_right", str)) {
            arrayList.add(0, new ShareItemBean("匿名举报", upa.m194847z() ? x2c0.f189256D6 : x2c0.f189224C6, d30Var));
        } else if (NullChecker.m81303a(d30Var3)) {
            arrayList.add(new ShareItemBean("举报", upa.m194847z() ? x2c0.f189256D6 : x2c0.f189224C6, d30Var3));
        }
        if (NullChecker.m81303a(d30Var4)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            arrayList.add(new ShareItemBean(str3, upa.m194847z() ? x2c0.f190449p6 : x2c0.f190417o6, d30Var4));
        }
        if (!vwb.m200296J(list)) {
            arrayList.addAll(list);
        }
        ShareItemBean shareItemBean2 = (ShareItemBean) vwb.m200346r(arrayList, new w9j() { // from class: l.xpk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ShareItemBean) obj).getTag(), "foot_print"));
            }
        });
        int iM200293G = vwb.m200293G(arrayList, new w9j() { // from class: l.ypk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ShareItemBean) obj).getName(), "取消喜欢"));
            }
        });
        if (NullChecker.m81303a(shareItemBean2)) {
            arrayList.remove(shareItemBean2);
            arrayList.add(iM200293G + 1, shareItemBean2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m98430K(Act act, final User user, final boolean z, roj0 roj0Var) {
        act.progressDismiss();
        act.m66873d2();
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.wqk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m98422G(user, z);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: K0 */
    public static List<ShareItemBean> m98431K0(final Act act, List<String> list, final Link link, final String str, final String str2, final String str3, final f30<String, String> f30Var, final g30<String, String, Throwable> g30Var) {
        ArrayList arrayList = new ArrayList();
        for (String str4 : list) {
            str4.getClass();
            switch (str4) {
                case "mo":
                    arrayList.add(new ShareItemBean("朋友圈", upa.m194847z() ? x2c0.f190577t6 : x2c0.f190513r6, new d30() { // from class: l.dok
                        @Override // p149l.d30
                        public final void call() {
                            ark.m98437N0(act, link, new ShareHelper.C13135c("朋友圈", gmp0.f103510b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
                case "qq":
                    arrayList.add(new ShareItemBean(com.tencent.connect.common.Constants.SOURCE_QQ, upa.m194847z() ? x2c0.f190257j6 : x2c0.f190227i6, new d30() { // from class: l.eok
                        @Override // p149l.d30
                        public final void call() {
                            ark.m98437N0(act, link, new ShareHelper.C13135c("QQ好友", dnb0.f87044b, LinkChannel.get("qq_friend"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
                case "qz":
                    arrayList.add(new ShareItemBean("QQ空间", upa.m194847z() ? x2c0.f190321l6 : x2c0.f190289k6, new d30() { // from class: l.fok
                        @Override // p149l.d30
                        public final void call() {
                            ark.m98437N0(act, link, new ShareHelper.C13135c("QQ空间", cnb0.f81658b, LinkChannel.get("qq-space"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
                case "wx":
                    arrayList.add(0, new ShareItemBean("微信", upa.m194847z() ? x2c0.f190769z6 : x2c0.f190385n6, new d30() { // from class: l.zqk
                        @Override // p149l.d30
                        public final void call() {
                            ark.m98437N0(act, link, new ShareHelper.C13135c("微信", rmp0.f160111b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), str, str2, str3, f30Var, g30Var);
                        }
                    }));
                    break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L0 */
    public static void m98433L0(final Act act, final ArrayList<Media> arrayList) {
        act.progress(R$string.f17842J5);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.nok
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ark.m98487o((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.yok
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98428J(act, arrayList, (roj0) obj);
            }
        }, new e30() { // from class: l.jpk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98418E(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public static void m98435M0(Act act, final Runnable runnable) {
        if (upa.m194830v2()) {
            lsi0.m151588r("触发冷启动弹窗取消实验-回流用户-优先推荐弹窗");
            return;
        }
        if (zch0.m218024a().m218026c()) {
            return;
        }
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95342Eb, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.f174332kb);
        final VText vText = (VText) viewInflate.findViewById(u4c0.f174315jb);
        CoreModule.f17545c.f19687u0.m30425Y6();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_reback_popup", Dialog.class.getName());
        vImage.setImageResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? x2c0.f190499qo : x2c0.f190435oo);
        final dd80.C16336a c16336aM110986o0 = act.newDialog().m110963R(viewInflate).m110965T(true).m110961P(false).m110991t0(i0g0.m133861b0("欢迎回来，我们将对你进行优先推荐，你将会比现在多10倍的人看到。别让喜欢你的人等太久哦！", vwb.m200324f0("10倍"), Color.parseColor("#fe7e1d"), Typeface.DEFAULT)).m110974c0("去划卡", new Runnable() { // from class: l.dqk
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_reback_popup_confirm", "p_reback_popup");
            }
        }).m110969X("放弃", new Runnable() { // from class: l.eqk
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_reback_popup_cancel", "p_reback_popup");
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.gqk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ark.m98474h0(cwf0VarM133794c, runnable, dialogInterface);
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.hqk
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        act.duringCreated(CoreModule.f17545c.f19687u0.m30407P6().first()).subscribe(mkd0.m154956H(new e30() { // from class: l.iqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98413B0(vText, c16336aM110986o0, (CoreLikers.C4719a) obj);
            }
        }, new e30() { // from class: l.jqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98454W((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m98436N(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static void m98437N0(Act act, Link link, ShareHelper.C13135c c13135c, String str, String str2, String str3, f30<String, String> f30Var, g30<String, String, Throwable> g30Var) {
        new ShareHelper(link).m80016t0(f30Var).m80017u0(g30Var).m79985A0(act, c13135c, link.href, str, str2, str3);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m98438O(boolean z, Act act, TextView textView, LinearLayout linearLayout, Throwable th) {
        ygh0.m214684i(z);
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            xdl0.m208344M(textView, false);
            xdl0.m208344M(linearLayout, true);
            CoreModule.m29931H().handleAccountErrors(th);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static void m98439O0(Act act, String str, @NonNull d30 d30Var, boolean z) {
        m98441P0(act, str, d30Var, z, false, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static void m98441P0(final Act act, String str, @NonNull final d30 d30Var, boolean z, final boolean z2, @Nullable final d30 d30Var2) {
        String str2;
        String str3;
        View viewInflate = act.inflater().inflate(f6c0.f95747dd, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(u4c0.f174128Y8);
        final LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f174235ef);
        final View viewFindViewById = viewInflate.findViewById(u4c0.f174148Zc);
        final VText vText = (VText) viewInflate.findViewById(u4c0.f174056U0);
        final VEditText vEditText = (VEditText) viewInflate.findViewById(u4c0.f174102We);
        final VEditText vEditText2 = (VEditText) viewInflate.findViewById(u4c0.f173820G1);
        final VText vText2 = (VText) viewInflate.findViewById(u4c0.f173925M4);
        final VText vText3 = (VText) viewInflate.findViewById(u4c0.f173771D3);
        final LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(u4c0.f173949Nb);
        final TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f173966Ob);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(u4c0.f174255g1);
        final VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174569ya);
        final VButton vButton2 = (VButton) viewInflate.findViewById(u4c0.f174586za);
        VText vText4 = (VText) viewInflate.findViewById(u4c0.f173929M8);
        final boolean[] zArr = {false};
        String strString = !z2 ? act.string(R$string.f18713ls) : "登出当前帐号";
        vButton.setText(act.string(R$string.f19112z3));
        vButton2.setText(act.getString(R$string.f18345Zs));
        vText4.setText(strString);
        final Runnable runnable = new Runnable() { // from class: l.gok
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditText, 0);
            }
        };
        final String str4 = strString;
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(true).m110958M(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ook
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ark.m98479k(d30Var, act, runnable, dialogInterface);
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.pok
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ark.m98502v0(vEditText, act, runnable, dialogInterface);
            }
        }).m110960O();
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.qok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98471f0(z2, textView, zArr, act, linearLayout2, dd80VarM110960O, d30Var2, vEditText, linearLayout, vEditText2, vText, vText3, vButton, view);
            }
        });
        if ("登出当前帐号".equals(str4)) {
            dd80VarM110960O.setCancelable(false);
        }
        vText4.setOnClickListener(new View.OnClickListener() { // from class: l.rok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98504w0(str4, act, dd80VarM110960O, z2, view);
            }
        });
        vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.sok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98505x(linearLayout2, textView, vButton2, linearLayout, viewFindViewById, z2, view);
            }
        });
        final j760<String, String> j760VarM29595d = ChinaMobileController.m29595d();
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.tok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                j760 j760Var = j760VarM29595d;
                act2.startActivity(WebViewAct.m80164Z1(act2, (String) j760Var.f116564a, (String) j760Var.f116565b));
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.uok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29931H().mo28151Aq(act, new e30() { // from class: l.bqk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        vText2.setOnClickListener(new View.OnClickListener() { // from class: l.vok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98464b0(vEditText, vText, vText2, vEditText2, act, z2, vText3, vButton, view);
            }
        });
        vText.setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
        if (e51.m114737B(act.getLocalClassName())) {
            vText2.setEnabled(false);
            vText2.setClickable(false);
            vText2.setText(R$string.f17921Lo);
            act.duringCreated(e51.m114749N(act.getLocalClassName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.wok
                @Override // p149l.e30
                public final void call(Object obj) {
                    ark.m98444R(vText2, act, (Long) obj);
                }
            }, new e30() { // from class: l.hok
                @Override // p149l.e30
                public final void call(Object obj) {
                    ark.m98436N((Throwable) obj);
                }
            }, new d30() { // from class: l.iok
                @Override // p149l.d30
                public final void call() {
                    ark.m98476i0(vText2, vEditText);
                }
            }));
        } else {
            xdl0.m208411y(vText2, vEditText.getText().length() > 0);
        }
        vEditText.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.jok
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98468d0(vEditText, vText2, act, vText3, vButton, (CharSequence) obj);
            }
        }));
        vEditText2.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.kok
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98420F(vText3, vButton, (CharSequence) obj);
            }
        }));
        if (TextUtils.isEmpty(str)) {
            str2 = str;
            xdl0.m208344M(linearLayout2, false);
            xdl0.m208360X(viewFindViewById, t100.f167264m);
        } else {
            xdl0.m208344M(linearLayout2, true);
            zvf0.m220368A("e_sign_in_agreement", "", vwb.m200311Y("agreement_entrance", "bind_popup"));
            xdl0.m208329E0(vCheckBox, new View.OnClickListener() { // from class: l.lok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ark.m98501v(zArr, vCheckBox, view);
                }
            });
            xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.mok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ark.m98491q(textView2, zArr, vCheckBox, view);
                }
            });
            textView2.setText(i0g0.m133835B(act, act.getString(R$string.f19082y3, "《" + j760VarM29595d.f116564a + "》"), j760VarM29595d.f116564a, j760VarM29595d.f116565b));
            textView2.setText(i0g0.m133835B(act, act.getString(R$string.f19082y3, "《" + j760VarM29595d.f116564a + "》"), j760VarM29595d.f116564a, j760VarM29595d.f116565b));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            str2 = str;
            textView.setText(str2);
        }
        xdl0.m208344M(textView, !TextUtils.isEmpty(str2));
        xdl0.m208344M(linearLayout, TextUtils.isEmpty(str2));
        xdl0.m208344M(vButton2, !TextUtils.isEmpty(str2));
        if (vy8.m200606d() && TextUtils.isEmpty(str2) && !z2) {
            String strM174451f = qgp0.m174450e().m174451f(act);
            if (!TextUtils.isEmpty(strM174451f)) {
                vEditText.setText(strM174451f);
                vEditText.setSelection(strM174451f.length());
            }
        } else if (!z2 && TextUtils.isEmpty(str2)) {
            String strM174451f2 = qgp0.m174450e().m174451f(act);
            if (!TextUtils.isEmpty(strM174451f2)) {
                vEditText.setText(strM174451f2);
                vEditText.setSelection(vEditText.getText().length());
            }
        }
        String str5 = z2 ? "signout" : "on";
        if (TextUtils.isEmpty(str2)) {
            str3 = TextUtils.isEmpty(vEditText.getText().toString()) ? "no_number" : "secret_number";
        } else {
            str3 = "one_click";
        }
        ygh0.m214680g(str5, str3);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m98443Q0(Act act, String str, final d30 d30Var) {
        String str2 = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url;
        String string = act.getString(R$string.f18106S);
        Dialog dialogM20567z = act.dialog().m20521Q().m20517M(f6c0.f95899md).m20559v().m20503E0(R$string.f18243Wg).m20504F(i0g0.m133861b0(act.getString(R$string.f18076R, string), vwb.m200324f0(string), act.color(w0c0.f183790N1), eqh0.m117752c(3))).m20556t0(R$string.f18213Vg, new Runnable() { // from class: l.vpk
            @Override // java.lang.Runnable
            public final void run() {
                ygh0.m214645D();
            }
        }).m20542l0(R$string.f17978Nl, new Runnable() { // from class: l.wpk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m98448T(d30Var);
            }
        }).m20496B(false).m20567z();
        View viewM20458P = dialogM20567z.m20458P();
        VDraweeView vDraweeView = (VDraweeView) viewM20458P.findViewById(u4c0.f174245f8);
        VDraweeView vDraweeView2 = (VDraweeView) viewM20458P.findViewById(u4c0.f174263g9);
        qib0.f154691G.m102331L0(vDraweeView, str2);
        qib0.f154691G.m102331L0(vDraweeView2, str);
        dialogM20567z.show();
        ygh0.m214646E();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m98444R(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f18105Rs)));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static l5j0 m98445R0(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8, User user) {
        return m98463a1(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, d30Var8, null, user);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m98447S0(Act act, boolean z) {
        ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_alert_cheat_prevention__verify_required_popup.getIdentifier());
        final OmsBaseRender omsBaseRenderM158919h = nc50.m158912f().m158919h();
        final c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.dpk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98496s0(omsBaseRenderM158919h, (User) obj);
            }
        }));
        final c4g0 c4g0VarSubscribe2 = act.duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).filter(new w9j() { // from class: l.epk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((VerificationCenter) obj) != null);
            }
        }).map(new w9j() { // from class: l.fpk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).picVerificationInfo.status;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.gpk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98478j0(omsBaseRenderM158919h, (StudentVerificationStatus) obj);
            }
        }));
        if (NullChecker.m81303a(omsBaseRenderM158919h)) {
            omsBaseRenderM158919h.m79268b0(new DialogInterface.OnDismissListener() { // from class: l.hpk
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ark.m98417D0(c4g0VarSubscribe, c4g0VarSubscribe2, dialogInterface);
                }
            });
            tvf.m190736n();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m98448T(d30 d30Var) {
        ygh0.m214647F();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m98449T0(Act act) {
        NameFakeView nameFakeView = (NameFakeView) act.inflater().inflate(f6c0.f95748de, (ViewGroup) null, false);
        nameFakeView.m50423h(act);
        Dialog dialogM20567z = act.dialog().m20519O(nameFakeView).m20557u().m20496B(false).m20567z();
        Objects.requireNonNull(dialogM20567z);
        nameFakeView.m50424i(act, new cok(dialogM20567z));
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m98450U(f30 f30Var, WheelPicker wheelPicker, WheelPicker wheelPicker2, l5j0 l5j0Var, View view) {
        f30Var.call(Integer.valueOf(wheelPicker.getCurrentItemPosition()), Integer.valueOf(wheelPicker2.getCurrentItemPosition()));
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: U0 */
    public static l5j0 m98451U0(Act act, String str, d30 d30Var, d30 d30Var2) {
        return m98459Y0("", act, "", str, "", "", d30Var, d30Var2, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: V0 */
    public static void m98453V0(Act act, boolean z, Media media, CharSequence charSequence, Runnable runnable) {
        m98455W0(act, z, media, charSequence, runnable, "");
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m98454W(Throwable th) {
    }

    /* JADX INFO: renamed from: W0 */
    public static void m98455W0(Act act, final boolean z, Media media, CharSequence charSequence, final Runnable runnable, String str) {
        CoreModule.f17545c.f19639e0.m169527p9();
        final boolean z2 = false;
        ProfileFakeView profileFakeView = (ProfileFakeView) act.inflater().inflate(f6c0.f96087xe, (ViewGroup) null, false);
        profileFakeView.mo50428a(z, media);
        dd80.C16336a c16336aM110958M = new dd80.C16336a(act).m110976e0(true).m110963R(profileFakeView.getRenderView()).m110961P(!z).m110958M(true);
        c16336aM110958M.m110973b0(charSequence).m110968W(null);
        dd80 dd80VarM110960O = c16336aM110958M.m110960O();
        final dd80[] dd80VarArr = {dd80VarM110960O};
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.qqk
            @Override // java.lang.Runnable
            public final void run() {
                ark.m98426I(z, runnable, dd80VarArr);
            }
        });
        if (!z && CoreModule.f17545c.f19639e0.m169506k8()) {
            profileFakeView.getTitleView().setText(act.getString(R$string.f17986O));
        }
        final c4g0 c4g0VarSubscribe = z ? act.duringCreated((C22306c) C7846b.m36420r().m36434q(), false).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.xqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98495s(dd80VarArr, (roj0) obj);
            }
        })) : null;
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_fake_twoguide", Dialog.class.getName());
        dd80VarArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yqk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ark.m98486n0(c4g0VarSubscribe, z, z2, cwf0VarM133794c, dialogInterface);
            }
        });
        dd80VarArr[0].show();
        if (!z) {
            ygh0.m214700s();
        } else {
            ygh0.m214697p(f71286i);
            f71286i = "";
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static void m98457X0(Act act, int i, int i2, final f30<Integer, Integer> f30Var) {
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCancelable(false);
        l5j0Var.setContentView(f6c0.f95711bb);
        VIcon vIcon = (VIcon) l5j0Var.findViewById(u4c0.f174410p4);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f174427q4);
        final WheelPicker wheelPicker = (WheelPicker) l5j0Var.findViewById(u4c0.f174197cb);
        final WheelPicker wheelPicker2 = (WheelPicker) l5j0Var.findViewById(u4c0.f174214db);
        if (i < 0 || i >= 24) {
            return;
        }
        wheelPicker.setData(f71284g);
        wheelPicker.setSelectedItemPosition(i);
        if (i2 <= 0 || i2 > 24) {
            return;
        }
        wheelPicker2.setData(f71285h);
        wheelPicker2.setSelectedItemPosition(i2 - 1);
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.kqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.m101651T();
            }
        });
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.lqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98450U(f30Var, wheelPicker, wheelPicker2, l5j0Var, view);
            }
        });
        final Window window = l5j0Var.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2)).setBackgroundResource(x2c0.f190182gp);
        }
        e51.m114742G(new Runnable() { // from class: l.mqk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180364k);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: Y0 */
    public static l5j0 m98459Y0(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7) {
        return m98461Z0(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, null);
    }

    /* JADX INFO: renamed from: Z0 */
    public static l5j0 m98461Z0(String str, Act act, String str2, String str3, String str4, String str5, d30 d30Var, d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, d30 d30Var8) {
        return m98463a1(str, act, str2, str3, str4, str5, d30Var, d30Var2, d30Var3, d30Var4, d30Var5, d30Var6, d30Var7, d30Var8, null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ roj0 m98462a0(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: a1 */
    public static l5j0 m98463a1(String str, Act act, String str2, String str3, String str4, String str5, final d30 d30Var, final d30 d30Var2, d30 d30Var3, d30 d30Var4, d30 d30Var5, d30 d30Var6, d30 d30Var7, final d30 d30Var8, List<ShareItemBean> list, User user) {
        String str6;
        String str7;
        cwf0 cwf0VarM133794c = i0e.m133794c("p_share_pop", Dialog.class.getName());
        if (TextUtils.equals("from_discover_dating", str2) || TextUtils.equals("from_album", str2) || TextUtils.equals("from_like", str2) || TextUtils.equals("from_nearby_falls_feed", str2) || TextUtils.equals("from_nearby_focus", str2) || TextUtils.equals("from_activity_tab_one", str2) || TextUtils.equals("from_activity_tab_two", str2) || TextUtils.equals("from_discover_discussion", str2)) {
            str6 = BannerLoc.moment_feed;
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
        j760 j760VarM200311Y = vwb.m200311Y("moment_id", str);
        j760 j760VarM200311Y2 = vwb.m200311Y("share_pop_from_which", str6);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            str7 = str3;
        } else {
            str7 = str3;
            if (TextUtils.equals(str7, "discover_discussion")) {
                str8 = str2;
            }
        }
        cwf0VarM133794c.m109040p(j760VarM200311Y, j760VarM200311Y2, vwb.m200311Y("moment_share_from_which", str8));
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(f6c0.f95502Ob);
        l5j0Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC15699a(cwf0VarM133794c, d30Var7));
        l5j0Var.setOnKeyListener(new DialogInterfaceOnKeyListenerC15700b());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2)).setBackgroundResource(x2c0.f190182gp);
        }
        e51.m114742G(new Runnable() { // from class: l.xok
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180364k);
            }
        });
        VLinear vLinear = (VLinear) l5j0Var.findViewById(u4c0.f173741B7);
        VImage vImage = (VImage) l5j0Var.findViewById(u4c0.f173758C7);
        VLinear vLinear2 = (VLinear) l5j0Var.findViewById(u4c0.f174583z7);
        VImage vImage2 = (VImage) l5j0Var.findViewById(u4c0.f173724A7);
        VImage vImage3 = (VImage) l5j0Var.findViewById(u4c0.f174566y7);
        if (upa.m194847z()) {
            vImage.setImageResource(x2c0.f190737y6);
            vImage2.setImageResource(x2c0.f190545s6);
            vImage3.setImageResource(x2c0.f190353m6);
        }
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f174268ge);
        if (NullChecker.m81303a(user) && sb90.m183208d(user)) {
            textView.setText("更多操作");
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(vLinear2, false);
        }
        VLinear vLinear3 = (VLinear) l5j0Var.findViewById(u4c0.f174549x7);
        if (TextUtils.equals("p_moment_preview", str2) && NullChecker.m81303a(d30Var8)) {
            zvf0.m220402x("e_save_picture", "p_share_pop");
            xdl0.m208344M(vLinear3, true);
        }
        VRecyclerView vRecyclerView = (VRecyclerView) l5j0Var.findViewById(u4c0.f173864Ib);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        dse0 dse0Var = new dse0(act);
        List<ShareItemBean> listM98429J0 = m98429J0(d30Var3, d30Var4, d30Var5, d30Var6, str7, str4, str5, list);
        xdl0.m208344M(vRecyclerView, true ^ vwb.m200296J(listM98429J0));
        vRecyclerView.setAdapter(dse0Var);
        dse0Var.m113468C(listM98429J0);
        dse0Var.m113469D(new C15701c(listM98429J0, l5j0Var));
        VText vText = (VText) l5j0Var.findViewById(u4c0.f174556xe);
        xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.zok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98470e0(d30Var, l5j0Var, view);
            }
        });
        xdl0.m208329E0(vLinear2, new View.OnClickListener() { // from class: l.apk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98509z(d30Var2, l5j0Var, view);
            }
        });
        xdl0.m208329E0(vLinear3, new View.OnClickListener() { // from class: l.bpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98510z0(d30Var8, l5j0Var, view);
            }
        });
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.cpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98466c0(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m98464b0(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, final boolean z, final VText vText3, final VButton vButton, View view) {
        if (!m98423G0(yij0.m214935M(vEditText), yij0.m214931I(vText) == 86)) {
            lsi0.m151595y("请输入正确手机号");
            return;
        }
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(vText);
        verifyData.mobileNumber = yij0.m214935M(vEditText);
        xdl0.m208411y(vText2, false);
        vText2.setEnabled(false);
        vText2.setText("...");
        CoreModule.m29931H().send(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.zpk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98477j(vEditText2, vText2, act, vEditText, z, (roj0) obj);
            }
        }, new e30() { // from class: l.aqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98503w(vText2, vEditText, vText3, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: b1 */
    public static l5j0 m98465b1(Act act, String str, Link link, String str2, String str3, String str4, List<LinkChannel> list, f30<String, String> f30Var, g30<String, String, Throwable> g30Var) {
        return m98467c1(act, str, m98431K0(act, ShareHelper.m79952S(act, list), link, str2, str3, str4, f30Var, g30Var));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m98466c0(l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_share_pop_cancel", "p_share_pop");
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: c1 */
    public static l5j0 m98467c1(Act act, String str, List<ShareItemBean> list) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_share_pop", Dialog.class.getName());
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        cwf0VarM133794c.m109040p(vwb.m200311Y("share_pop_from_which", str));
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(f6c0.f95550Rb);
        l5j0Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC15702d(cwf0VarM133794c));
        l5j0Var.setOnKeyListener(new DialogInterfaceOnKeyListenerC15703e());
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2)).setBackgroundResource(x2c0.f190182gp);
        }
        e51.m114742G(new Runnable() { // from class: l.upk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(v7c0.f180364k);
            }
        });
        VRecyclerView vRecyclerView = (VRecyclerView) l5j0Var.findViewById(u4c0.f173881Jb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        dse0 dse0Var = new dse0(act);
        vRecyclerView.setAdapter(dse0Var);
        dse0Var.m113468C(list);
        dse0Var.m113469D(new C15704f(list, l5j0Var));
        xdl0.m208329E0((VText) l5j0Var.findViewById(u4c0.f174556xe), new View.OnClickListener() { // from class: l.fqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ark.m98494r0(l5j0Var, view);
            }
        });
        l5j0Var.show();
        return l5j0Var;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m98468d0(VEditText vEditText, VText vText, Act act, VText vText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else if (TextUtils.equals(vText.getText().toString(), act.string(R$string.f17741Fo))) {
            xdl0.m208411y(vText, true);
        }
        xdl0.m208344M(vText2, false);
        xdl0.m208360X(vButton, t100.f167268q);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m98469d1(Act act, d30 d30Var) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_user_profile_share_agreement_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110964S(x2c0.f190214hp).m110996y0("分享新功能").m110991t0("进入ta人主页可将ta的名片分享给您的朋友，使用截图有更多惊喜！若您需要关闭该功能则可前往设置-隐私和通知进行关闭").m110961P(false).m110974c0("我知道了", new Runnable() { // from class: l.ipk
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_user_profile_share_agreement_popup_confirm", "p_user_profile_share_agreement_popup");
            }
        }).m110989r0();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        dd80VarM110989r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kpk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m98470e0(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            zvf0.m220396r("e_share_pop_wechat", "p_share_pop");
            d30Var.call();
        }
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m98471f0(final boolean z, final TextView textView, boolean[] zArr, final Act act, LinearLayout linearLayout, final dd80 dd80Var, final d30 d30Var, final VEditText vEditText, final LinearLayout linearLayout2, VEditText vEditText2, VText vText, final VText vText2, final VButton vButton, View view) {
        ygh0.m214672c(z ? "signout" : "on");
        if (textView.getVisibility() == 0) {
            if (!zArr[0]) {
                linearLayout.startAnimation(AnimationUtils.loadAnimation(act, rzb0.f161638j));
                return;
            } else {
                act.progress(R$string.f17842J5);
                act.duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.npk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ark.m98498t0(z, act, (MobileRespInfo) obj);
                    }
                }).filter(new w9j() { // from class: l.opk
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((MobileRespInfo) obj).failed);
                    }
                }).flatMap(new w9j() { // from class: l.ppk
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                        return CoreModule.m29931H().oneClickBindPhone(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
                    }
                }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.qpk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ark.m98508y0(act, dd80Var, d30Var, z, vEditText, (roj0) obj);
                    }
                }, new e30() { // from class: l.rpk
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ark.m98438O(z, act, textView, linearLayout2, (Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (TextUtils.isEmpty(vEditText.getText())) {
            lsi0.m151593w(R$string.f17891Ko);
            return;
        }
        if (TextUtils.isEmpty(vEditText2.getText())) {
            lsi0.m151593w(R$string.f18720m4);
            return;
        }
        act.progress(R$string.f17842J5);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.m214931I(vEditText2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(vText);
        verifyData.mobileNumber = yij0.m214935M(vEditText);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = yij0.m214931I(vText);
        verifyData.mobileNumber = yij0.m214935M(vEditText);
        CoreModule.m29931H().verify(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.spk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98492q0(act, dd80Var, d30Var, z, vEditText, (roj0) obj);
            }
        }, new e30() { // from class: l.tpk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98499u(z, act, vText2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m98472g0(final Act act, String str, final User user, final boolean z, d30 d30Var) {
        act.progress(R$string.f17842J5, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = act.getString(R$string.f18158Tl);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        report.chatMessages = arrayList;
        new Relationship().state = RelationshipStatus.get("blocked");
        mkd0.m154984r(CoreModule.f17545c.f19639e0.m169496ha(user.f56011id, report), CoreModule.f17545c.f19642f0.m33090qe(user.f56011id, act), new x9j() { // from class: l.tqk
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ark.m98462a0((roj0) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.uqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98430K(act, user, z, (roj0) obj);
            }
        }, new e30() { // from class: l.vqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98481l(act, (Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m98473h(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f17741Fo);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m98474h0(cwf0 cwf0Var, Runnable runnable, DialogInterface dialogInterface) {
        zch0.m218024a().m218033j(false, "reBackAppGuideDialog");
        i0e.m133796e(cwf0Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m98476i0(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f17741Fo);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m98477j(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, boolean z, roj0 roj0Var) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f17921Lo);
        act.duringCreated(e51.m114749N(act.getLocalClassName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.nqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98414C(vText, act, (Long) obj);
            }
        }, new e30() { // from class: l.oqk
            @Override // p149l.e30
            public final void call(Object obj) {
                ark.m98484m0((Throwable) obj);
            }
        }, new d30() { // from class: l.pqk
            @Override // p149l.d30
            public final void call() {
                ark.m98473h(vText, vEditText2);
            }
        }));
        ygh0.m214682h(z ? "signout" : "on");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m98478j0(OmsBaseRender omsBaseRender, StudentVerificationStatus studentVerificationStatus) {
        if ((TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "verified")) && NullChecker.m81303a(omsBaseRender) && omsBaseRender.f54223c.m20529Y().isShowing()) {
            omsBaseRender.m79257Q();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m98479k(d30 d30Var, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        ygh0.m214678f();
        act.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m98481l(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m98484m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m98486n0(c4g0 c4g0Var, boolean z, boolean z2, cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(c4g0Var);
        if (!z) {
            ygh0.m214698q();
        } else if (z2) {
            i0e.m133796e(cwf0Var);
        } else {
            ygh0.m214696o();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C22306c m98487o(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m98491q(TextView textView, boolean[] zArr, VCheckBox vCheckBox, View view) {
        if (textView.getSelectionStart() == -1 && textView.getSelectionEnd() == -1) {
            zvf0.m220399u("e_sign_in_agreement", "", vwb.m200311Y("agreement_entrance", "bind_popup"));
            boolean z = !zArr[0];
            zArr[0] = z;
            vCheckBox.setChecked(z);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m98492q0(Act act, dd80 dd80Var, d30 d30Var, boolean z, VEditText vEditText, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        e51.m114746K(act.getLocalClassName());
        lsi0.m151595y(act.string(R$string.f18376at));
        m98425H0(dd80Var);
        dd80Var.dismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        ygh0.m214686j(z, vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m98493r(Notification notification) {
        if (NullChecker.m81303a(AccessToken.m7408d())) {
            bzv.m104655m().m104682u();
        }
        ygh0.m214688k();
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m98494r0(l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_share_pop_cancel", "p_share_pop");
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m98495s(dd80[] dd80VarArr, roj0 roj0Var) {
        if (dd80VarArr[0].isShowing()) {
            dd80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m98496s0(OmsBaseRender omsBaseRender, User user) {
        boolean zM81303a = NullChecker.m81303a(vwb.m200346r(user.status, new w9j() { // from class: l.cqk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((UserStatus) obj, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION));
            }
        }));
        boolean z = (vwb.m200296J(user.status) || !user.status.contains(UserStatus.get("hidden")) || App.f15373i.get().equals(CoreModule.f17545c.f19639e0.m169399I7())) ? false : true;
        if ((!zM81303a || z) && NullChecker.m81303a(omsBaseRender) && omsBaseRender.f54223c.m20529Y().isShowing()) {
            omsBaseRender.m79257Q();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m98498t0(boolean z, Act act, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ygh0.m214684i(z);
            act.progressDismiss();
            lsi0.m151595y(act.string(R$string.f19052x3));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m98499u(boolean z, Act act, VText vText, VButton vButton, Throwable th) {
        ygh0.m214684i(z);
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.m214929G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.m214929G(th);
            return;
        }
        String strM214956l = yij0.m214956l(i);
        if (strM214956l == null) {
            yij0.m214929G(th);
            return;
        }
        xdl0.m208345M0(vText, true);
        vText.setText(strM214956l);
        xdl0.m208360X(vButton, t100.f167261j);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m98501v(boolean[] zArr, VCheckBox vCheckBox, View view) {
        zvf0.m220399u("e_sign_in_agreement", "", vwb.m200311Y("agreement_entrance", "bind_popup"));
        boolean z = !zArr[0];
        zArr[0] = z;
        vCheckBox.setChecked(z);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m98502v0(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (vwb.m200298L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m98503w(VText vText, VEditText vEditText, VText vText2, VButton vButton, Throwable th) {
        vText.setClickable(true);
        vText.setEnabled(true);
        vText.setText(R$string.f17741Fo);
        if (vEditText.getText().toString().isEmpty()) {
            xdl0.m208411y(vText, false);
        } else {
            xdl0.m208411y(vText, true);
        }
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.m214929G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            yij0.m214929G(th);
            return;
        }
        String strM214956l = yij0.m214956l(i);
        if (strM214956l == null) {
            yij0.m214929G(th);
            return;
        }
        xdl0.m208345M0(vText2, true);
        vText2.setText(strM214956l);
        xdl0.m208360X(vButton, t100.f167261j);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m98504w0(String str, final Act act, dd80 dd80Var, boolean z, View view) {
        if ("登出当前帐号".equals(str)) {
            act.progress(R$string.f17842J5);
            if (qp8.m175818c()) {
                User userMe_ = CoreModule.m29932K().me_();
                if (NullChecker.m81303a(userMe_)) {
                    qib0.f154697L.f17146d.m205063p(userMe_.m60124fp().url, CoreModule.m29931H().getAuthData().mo108248b(), userMe_.name);
                }
            }
            qib0.m174805Z0(true, false).materialize().first().subscribe(mkd0.m154956H(new e30() { // from class: l.lpk
                @Override // p149l.e30
                public final void call(Object obj) {
                    ark.m98493r((Notification) obj);
                }
            }, new e30() { // from class: l.mpk
                @Override // p149l.e30
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }));
        }
        m98425H0(dd80Var);
        dd80Var.dismiss();
        if (z) {
            return;
        }
        ygh0.m214676e();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m98505x(LinearLayout linearLayout, TextView textView, VButton vButton, LinearLayout linearLayout2, View view, boolean z, View view2) {
        xdl0.m208344M(linearLayout, false);
        xdl0.m208344M(textView, false);
        xdl0.m208344M(vButton, false);
        xdl0.m208344M(linearLayout2, true);
        xdl0.m208360X(view, t100.f167264m);
        ygh0.m214674d(z ? "signout" : "on");
        ygh0.m214680g(z ? "signout" : "on", "no_number");
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m98508y0(Act act, dd80 dd80Var, d30 d30Var, boolean z, VEditText vEditText, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        lsi0.m151595y(act.string(R$string.f18376at));
        dd80Var.dismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        ygh0.m214686j(z, vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m98509z(d30 d30Var, l5j0 l5j0Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            zvf0.m220396r("e_share_pop_wechat_moment", "p_share_pop");
            d30Var.call();
        }
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m98510z0(d30 d30Var, l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_save_picture", "p_share_pop");
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        l5j0Var.m101651T();
    }
}
