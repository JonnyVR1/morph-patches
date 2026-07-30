package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.ShareItemBean;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.popup.NameFakeView;
import com.p051p1.mobile.putong.core.p058ui.popup.ProfileFakeView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.p051p1.mobile.putong.p070ui.DialogAct;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p137rx.C22421c;
import p137rx.Notification;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public final class qtk extends g6e {

    /* JADX INFO: renamed from: g */
    public static final List<String> f159454g = Arrays.asList("00:00", "01:00", "02:00", "03:00", "04:00", "05:00", Constants.DND_STOP, "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", Constants.DND_START, "23:00");

    /* JADX INFO: renamed from: h */
    public static final List<String> f159455h = Arrays.asList("01:00", "02:00", "03:00", "04:00", "05:00", Constants.DND_STOP, "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", Constants.DND_START, "23:00", "24:00");

    /* JADX INFO: renamed from: i */
    public static String f159456i;

    /* JADX INFO: renamed from: l.qtk$a */
    public class DialogInterfaceOnDismissListenerC19656a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f159457a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f159458b;

        public DialogInterfaceOnDismissListenerC19656a(l4g0 l4g0Var, x20 x20Var) {
            this.f159457a = l4g0Var;
            this.f159458b = x20Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f159457a);
            if (NullChecker.m82486a(this.f159458b)) {
                this.f159458b.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.qtk$b */
    public class DialogInterfaceOnKeyListenerC19657b implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.qtk$c */
    public class C19658c implements k0f0.InterfaceC18071b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f159459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pej0 f159460b;

        public C19658c(List list, pej0 pej0Var) {
            this.f159459a = list;
            this.f159460b = pej0Var;
        }

        @Override // p153l.k0f0.InterfaceC18071b
        /* JADX INFO: renamed from: a */
        public void mo147791a(View view, int i) {
            ((ShareItemBean) this.f159459a.get(i)).getAction().call();
            this.f159460b.m176562T();
        }
    }

    /* JADX INFO: renamed from: l.qtk$d */
    public class DialogInterfaceOnDismissListenerC19659d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f159461a;

        public DialogInterfaceOnDismissListenerC19659d(l4g0 l4g0Var) {
            this.f159461a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f159461a);
        }
    }

    /* JADX INFO: renamed from: l.qtk$e */
    public class DialogInterfaceOnKeyListenerC19660e implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.qtk$f */
    public class C19661f implements k0f0.InterfaceC18071b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f159462a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pej0 f159463b;

        public C19661f(List list, pej0 pej0Var) {
            this.f159462a = list;
            this.f159463b = pej0Var;
        }

        @Override // p153l.k0f0.InterfaceC18071b
        /* JADX INFO: renamed from: a */
        public void mo147791a(View view, int i) {
            ShareItemBean shareItemBean = (ShareItemBean) this.f159462a.get(i);
            if (NullChecker.m82486a(shareItemBean)) {
                String name = shareItemBean.getName();
                if (!TextUtils.isEmpty(name)) {
                    if ("微信".equals(name)) {
                        i4g0.m138520r("e_share_pop_wechat", "p_share_pop");
                    } else if ("朋友圈".equals(name)) {
                        i4g0.m138520r("e_share_pop_wechat_moment", "p_share_pop");
                    } else if (com.tencent.connect.common.Constants.SOURCE_QQ.equals(name)) {
                        i4g0.m138520r("e_share_pop_qq", "p_share_pop");
                    } else if ("QQ空间".equals(name)) {
                        i4g0.m138520r("e_share_pop_qqzone", "p_share_pop");
                    }
                }
                if (NullChecker.m82486a(((ShareItemBean) this.f159462a.get(i)).getAction())) {
                    ((ShareItemBean) this.f159462a.get(i)).getAction().call();
                }
                this.f159463b.m176562T();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m177963B0(VText vText, jl80.C17971a c17971a, CoreLikers.C4870a c4870a) {
        String str;
        int iRandom = c4870a.f20012b + 10;
        if (iRandom <= 10) {
            iRandom = (int) ((Math.random() * 89.0d) + 10.0d);
        }
        if (iRandom >= 99) {
            str = "99+";
        } else {
            str = iRandom + "";
        }
        vText.setText(str);
        c17971a.m146056y0(String.format("你离开后，仍有 %s 个人喜欢着你", c17.m107524q0(iRandom)));
        hlh0.m135741a().m135750j(true, "reBackAppGuideDialog");
        c17971a.m146049r0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m177964C(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f19537ot)));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m177967D0(kcg0 kcg0Var, kcg0 kcg0Var2, DialogInterface dialogInterface) {
        if (!kcg0Var.isUnsubscribed()) {
            kcg0Var.unsubscribe();
        }
        if (kcg0Var2.isUnsubscribed()) {
            return;
        }
        kcg0Var2.unsubscribe();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m177968E(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m177969E0(final Act act, final User user, final String str, final x20 x20Var, final boolean z) {
        final Runnable runnable = new Runnable() { // from class: l.htk
            @Override // java.lang.Runnable
            public final void run() {
                qtk.m178022g0(act, str, user, z, x20Var);
            }
        };
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(act.getString(R$string.f18735Oi)).m191148g(false).m191149h(false).m191146e(R$string.f19138c).m191158q(R$string.f18795Qi).m191156o(new View.OnClickListener() { // from class: l.itk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m177970F(VText vText, VButton vButton, CharSequence charSequence) {
        bnl0.m105524M(vText, false);
        bnl0.m105540X(vButton, qa00.f156330q);
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m177971F0(Act act, Runnable runnable) {
        if (!CoreModule.f18264c.f20381e0.m116549c8()) {
            return false;
        }
        m178003V0(act, true, CoreModule.f18264c.f20381e0.m116593na().m61308fp(), act.string(R$string.f19221el), runnable);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m177972G(User user, boolean z) {
        Application application = CoreModule.f18263b;
        application.startActivity(DialogAct.m80561Q0(application, 2, user, z));
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m177973G0(String str, boolean z) {
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
    public static void m177975H0(@NonNull jl80 jl80Var) {
        try {
            Window window = jl80Var.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) jl80Var.getContext().getSystemService("input_method");
            if (NullChecker.m82486a(window) && NullChecker.m82486a(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.m82486a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m177976I(boolean z, Runnable runnable, jl80[] jl80VarArr) {
        if (z) {
            fph0.m126682n();
        } else {
            fph0.m126687r();
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        jl80VarArr[0].dismiss();
    }

    /* JADX INFO: renamed from: I0 */
    public static String m177977I0() {
        if (jyb.m147479J(CoreModule.f18264c.f20381e0.m116593na().status)) {
            return AIMessageFeedback.good;
        }
        return CoreModule.f18264c.f20381e0.m116593na().status.contains(UserStatus.get("hidden")) ? Channel.fake : "other";
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m177978J(Act act, ArrayList arrayList, uxj0 uxj0Var) {
        act.progressDismiss();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        m178003V0(act, false, (Media) arrayList.get(0), act.string(R$string.f18307Al), null);
    }

    /* JADX INFO: renamed from: J0 */
    public static List<ShareItemBean> m177979J0(x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, String str, String str2, String str3, List<ShareItemBean> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        boolean zMo61506Tp = CoreModule.m30932N().mo61506Tp();
        if (NullChecker.m82486a(x20Var) && (!zMo61506Tp || !TextUtils.equals("喜欢", str2))) {
            if (TextUtils.equals("关注", str2)) {
                i = dbc0.f87373r6;
            } else if (TextUtils.equals("喜欢", str2)) {
                i = gra.m131778z() ? dbc0.f87600y6 : dbc0.f87568x6;
            } else if (TextUtils.equals("取消关注", str2) || TextUtils.equals("取消喜欢", str2)) {
                i = gra.m131778z() ? dbc0.f86047C6 : dbc0.f86015B6;
            } else {
                i = -1;
            }
            ShareItemBean shareItemBean = i != -1 ? new ShareItemBean(str2, i, x20Var) : null;
            if (shareItemBean != null) {
                arrayList.add(shareItemBean);
            }
        }
        if (NullChecker.m82486a(x20Var2)) {
            arrayList.add(new ShareItemBean("不感兴趣", gra.m131778z() ? dbc0.f87536w6 : dbc0.f87504v6, x20Var2));
        }
        if (NullChecker.m82486a(x20Var) && TextUtils.equals("share_right", str)) {
            arrayList.add(0, new ShareItemBean("匿名举报", gra.m131778z() ? dbc0.f86111E6 : dbc0.f86079D6, x20Var));
        } else if (NullChecker.m82486a(x20Var3)) {
            arrayList.add(new ShareItemBean("举报", gra.m131778z() ? dbc0.f86111E6 : dbc0.f86079D6, x20Var3));
        }
        if (NullChecker.m82486a(x20Var4)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            arrayList.add(new ShareItemBean(str3, gra.m131778z() ? dbc0.f87340q6 : dbc0.f87307p6, x20Var4));
        }
        if (!jyb.m147479J(list)) {
            arrayList.addAll(list);
        }
        ShareItemBean shareItemBean2 = (ShareItemBean) jyb.m147529r(arrayList, new qcj() { // from class: l.nsk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ShareItemBean) obj).getTag(), "foot_print"));
            }
        });
        int iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.osk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((ShareItemBean) obj).getName(), "取消喜欢"));
            }
        });
        if (NullChecker.m82486a(shareItemBean2)) {
            arrayList.remove(shareItemBean2);
            arrayList.add(iM147476G + 1, shareItemBean2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m177980K(Act act, final User user, final boolean z, uxj0 uxj0Var) {
        act.progressDismiss();
        act.m68056e2();
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.mtk
            @Override // java.lang.Runnable
            public final void run() {
                qtk.m177972G(user, z);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: K0 */
    public static List<ShareItemBean> m177981K0(final Act act, List<String> list, final Link link, final String str, final String str2, final String str3, final z20<String, String> z20Var, final a30<String, String, Throwable> a30Var) {
        ArrayList arrayList = new ArrayList();
        for (String str4 : list) {
            str4.getClass();
            switch (str4) {
                case "mo":
                    arrayList.add(new ShareItemBean("朋友圈", gra.m131778z() ? dbc0.f87472u6 : dbc0.f87406s6, new x20() { // from class: l.tqk
                        @Override // p153l.x20
                        public final void call() {
                            qtk.m177987N0(act, link, new ShareHelper.C13298c("朋友圈", kvp0.f128981b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), str, str2, str3, z20Var, a30Var);
                        }
                    }));
                    break;
                case "qq":
                    arrayList.add(new ShareItemBean(com.tencent.connect.common.Constants.SOURCE_QQ, gra.m131778z() ? dbc0.f87142k6 : dbc0.f87109j6, new x20() { // from class: l.uqk
                        @Override // p153l.x20
                        public final void call() {
                            qtk.m177987N0(act, link, new ShareHelper.C13298c("QQ好友", hvb0.f111748b, LinkChannel.get("qq_friend"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), str, str2, str3, z20Var, a30Var);
                        }
                    }));
                    break;
                case "qz":
                    arrayList.add(new ShareItemBean("QQ空间", gra.m131778z() ? dbc0.f87208m6 : dbc0.f87175l6, new x20() { // from class: l.vqk
                        @Override // p153l.x20
                        public final void call() {
                            qtk.m177987N0(act, link, new ShareHelper.C13298c("QQ空间", gvb0.f106619b, LinkChannel.get("qq-space"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), str, str2, str3, z20Var, a30Var);
                        }
                    }));
                    break;
                case "wx":
                    arrayList.add(0, new ShareItemBean("微信", gra.m131778z() ? dbc0.f85983A6 : dbc0.f87274o6, new x20() { // from class: l.ptk
                        @Override // p153l.x20
                        public final void call() {
                            qtk.m177987N0(act, link, new ShareHelper.C13298c("微信", vvp0.f185950b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), str, str2, str3, z20Var, a30Var);
                        }
                    }));
                    break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L0 */
    public static void m177983L0(final Act act, final ArrayList<Media> arrayList) {
        act.progress(R$string.f18632L5);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.drk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qtk.m178037o((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ork
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m177978J(act, arrayList, (uxj0) obj);
            }
        }, new y20() { // from class: l.zrk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m177968E(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public static void m177985M0(Act act, final Runnable runnable) {
        if (gra.m131761v2()) {
            o1j0.m165644r("触发冷启动弹窗取消实验-回流用户-优先推荐弹窗");
            return;
        }
        if (hlh0.m135741a().m135743c()) {
            return;
        }
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125508Lb, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(adc0.f70457mb);
        final VText vText = (VText) viewInflate.findViewById(adc0.f70440lb);
        CoreModule.f18264c.f20429u0.m31435c7();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_reback_popup", Dialog.class.getName());
        vImage.setImageResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? dbc0.f86965ep : dbc0.f86900cp);
        final jl80.C17971a c17971aM146046o0 = act.newDialog().m146023R(viewInflate).m146025T(true).m146021P(false).m146051t0(q8g0.m175796b0("欢迎回来，我们将对你进行优先推荐，你将会比现在多10倍的人看到。别让喜欢你的人等太久哦！", jyb.m147507f0("10倍"), Color.parseColor("#fe7e1d"), Typeface.DEFAULT)).m146034c0("去划卡", new Runnable() { // from class: l.tsk
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_reback_popup_confirm", "p_reback_popup");
            }
        }).m146029X("放弃", new Runnable() { // from class: l.usk
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_reback_popup_cancel", "p_reback_popup");
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.wsk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qtk.m178024h0(l4g0VarM204399c, runnable, dialogInterface);
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.xsk
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        act.duringCreated(CoreModule.f18264c.f20429u0.m31417T6().first()).subscribe(psd0.m173597H(new y20() { // from class: l.ysk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m177963B0(vText, c17971aM146046o0, (CoreLikers.C4870a) obj);
            }
        }, new y20() { // from class: l.zsk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178004W((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m177986N(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    public static void m177987N0(Act act, Link link, ShareHelper.C13298c c13298c, String str, String str2, String str3, z20<String, String> z20Var, a30<String, String, Throwable> a30Var) {
        new ShareHelper(link).m81199t0(z20Var).m81200u0(a30Var).m81168A0(act, c13298c, link.href, str, str2, str3);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m177988O(boolean z, Act act, TextView textView, LinearLayout linearLayout, Throwable th) {
        fph0.m126672i(z);
        act.progressDismiss();
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            bnl0.m105524M(textView, false);
            bnl0.m105524M(linearLayout, true);
            CoreModule.m30929H().handleAccountErrors(th);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static void m177989O0(Act act, String str, @NonNull x20 x20Var, boolean z) {
        m177991P0(act, str, x20Var, z, false, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static void m177991P0(final Act act, String str, @NonNull final x20 x20Var, boolean z, final boolean z2, @Nullable final x20 x20Var2) {
        String str2;
        String str3;
        View viewInflate = act.inflater().inflate(kec0.f125919kd, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(adc0.f70252a9);
        final LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(adc0.f70377hf);
        final View viewFindViewById = viewInflate.findViewById(adc0.f70273bd);
        final VText vText = (VText) viewInflate.findViewById(adc0.f70145U0);
        final VEditText vEditText = (VEditText) viewInflate.findViewById(adc0.f70241Ze);
        final VEditText vEditText2 = (VEditText) viewInflate.findViewById(adc0.f69908G1);
        final VText vText2 = (VText) viewInflate.findViewById(adc0.f70047O4);
        final VText vText3 = (VText) viewInflate.findViewById(adc0.f69893F3);
        final LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(adc0.f70071Pb);
        final TextView textView2 = (TextView) viewInflate.findViewById(adc0.f70088Qb);
        final VCheckBox vCheckBox = (VCheckBox) viewInflate.findViewById(adc0.f70346g1);
        final VButton vButton = (VButton) viewInflate.findViewById(adc0.f69815Aa);
        final VButton vButton2 = (VButton) viewInflate.findViewById(adc0.f69832Ba);
        VText vText4 = (VText) viewInflate.findViewById(adc0.f70051O8);
        final boolean[] zArr = {false};
        String strString = !z2 ? act.string(R$string.f18531Hs) : "登出当前帐号";
        vButton.setText(act.string(R$string.f18320B3));
        vButton2.setText(act.getString(R$string.f19785wt));
        vText4.setText(strString);
        final Runnable runnable = new Runnable() { // from class: l.wqk
            @Override // java.lang.Runnable
            public final void run() {
                act.showInput(vEditText, 0);
            }
        };
        final String str4 = strString;
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(true).m146018M(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.erk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qtk.m178029k(x20Var, act, runnable, dialogInterface);
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.frk
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                qtk.m178052v0(vEditText, act, runnable, dialogInterface);
            }
        }).m146020O();
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.grk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178021f0(z2, textView, zArr, act, linearLayout2, jl80VarM146020O, x20Var2, vEditText, linearLayout, vEditText2, vText, vText3, vButton, view);
            }
        });
        if ("登出当前帐号".equals(str4)) {
            jl80VarM146020O.setCancelable(false);
        }
        vText4.setOnClickListener(new View.OnClickListener() { // from class: l.hrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178054w0(str4, act, jl80VarM146020O, z2, view);
            }
        });
        vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.irk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178055x(linearLayout2, textView, vButton2, linearLayout, viewFindViewById, z2, view);
            }
        });
        final pf60<String, String> pf60VarM30593d = ChinaMobileController.m30593d();
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.jrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                pf60 pf60Var = pf60VarM30593d;
                act2.startActivity(WebViewAct.m81347a2(act2, (String) pf60Var.f152156a, (String) pf60Var.f152157b));
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.krk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30929H().mo29150Aq(act, new y20() { // from class: l.rsk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vText.setText((String) obj);
                    }
                });
            }
        });
        vText2.setOnClickListener(new View.OnClickListener() { // from class: l.lrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178014b0(vEditText, vText, vText2, vEditText2, act, z2, vText3, vButton, view);
            }
        });
        vText.setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
        if (l51.m152882B(act.getLocalClassName())) {
            vText2.setEnabled(false);
            vText2.setClickable(false);
            vText2.setText(R$string.f19318hp);
            act.duringCreated(l51.m152894N(act.getLocalClassName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.mrk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qtk.m177994R(vText2, act, (Long) obj);
                }
            }, new y20() { // from class: l.xqk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qtk.m177986N((Throwable) obj);
                }
            }, new x20() { // from class: l.yqk
                @Override // p153l.x20
                public final void call() {
                    qtk.m178026i0(vText2, vEditText);
                }
            }));
        } else {
            bnl0.m105591y(vText2, vEditText.getText().length() > 0);
        }
        vEditText.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.zqk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178018d0(vEditText, vText2, act, vText3, vButton, (CharSequence) obj);
            }
        }));
        vEditText2.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.ark
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m177970F(vText3, vButton, (CharSequence) obj);
            }
        }));
        if (TextUtils.isEmpty(str)) {
            str2 = str;
            bnl0.m105524M(linearLayout2, false);
            bnl0.m105540X(viewFindViewById, qa00.f156326m);
        } else {
            bnl0.m105524M(linearLayout2, true);
            i4g0.m138492A("e_sign_in_agreement", "", jyb.m147494Y("agreement_entrance", "bind_popup"));
            bnl0.m105509E0(vCheckBox, new View.OnClickListener() { // from class: l.brk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qtk.m178051v(zArr, vCheckBox, view);
                }
            });
            bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.crk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qtk.m178041q(textView2, zArr, vCheckBox, view);
                }
            });
            textView2.setText(q8g0.m175770B(act, act.getString(R$string.f18289A3, "《" + pf60VarM30593d.f152156a + "》"), pf60VarM30593d.f152156a, pf60VarM30593d.f152157b));
            textView2.setText(q8g0.m175770B(act, act.getString(R$string.f18289A3, "《" + pf60VarM30593d.f152156a + "》"), pf60VarM30593d.f152156a, pf60VarM30593d.f152157b));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            str2 = str;
            textView.setText(str2);
        }
        bnl0.m105524M(textView, !TextUtils.isEmpty(str2));
        bnl0.m105524M(linearLayout, TextUtils.isEmpty(str2));
        bnl0.m105524M(vButton2, !TextUtils.isEmpty(str2));
        if (d09.m113367d() && TextUtils.isEmpty(str2) && !z2) {
            String strM197171f = upp0.m197170e().m197171f(act);
            if (!TextUtils.isEmpty(strM197171f)) {
                vEditText.setText(strM197171f);
                vEditText.setSelection(strM197171f.length());
            }
        } else if (!z2 && TextUtils.isEmpty(str2)) {
            String strM197171f2 = upp0.m197170e().m197171f(act);
            if (!TextUtils.isEmpty(strM197171f2)) {
                vEditText.setText(strM197171f2);
                vEditText.setSelection(vEditText.getText().length());
            }
        }
        String str5 = z2 ? "signout" : "on";
        if (TextUtils.isEmpty(str2)) {
            str3 = TextUtils.isEmpty(vEditText.getText().toString()) ? "no_number" : "secret_number";
        } else {
            str3 = "one_click";
        }
        fph0.m126668g(str5, str3);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m177993Q0(Act act, String str, final x20 x20Var) {
        String str2 = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url;
        String string = act.getString(R$string.f18836S);
        Dialog dialogM21566z = act.dialog().m21520Q().m21516M(kec0.f126072td).m21558v().m21502E0(R$string.f19618rh).m21503F(q8g0.m175796b0(act.getString(R$string.f18806R, string), jyb.m147507f0(string), act.color(c9c0.f80362O1), lyh0.m156283c(3))).m21555t0(R$string.f19587qh, new Runnable() { // from class: l.lsk
            @Override // java.lang.Runnable
            public final void run() {
                fph0.m126633D();
            }
        }).m21541l0(R$string.f19375jm, new Runnable() { // from class: l.msk
            @Override // java.lang.Runnable
            public final void run() {
                qtk.m177998T(x20Var);
            }
        }).m21495B(false).m21566z();
        View viewM21457P = dialogM21566z.m21457P();
        VDraweeView vDraweeView = (VDraweeView) viewM21457P.findViewById(adc0.f70370h8);
        VDraweeView vDraweeView2 = (VDraweeView) viewM21457P.findViewById(adc0.f70388i9);
        uqb0.f180374G.m127115L0(vDraweeView, str2);
        uqb0.f180374G.m127115L0(vDraweeView2, str);
        dialogM21566z.show();
        fph0.m126634E();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m177994R(VText vText, Act act, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vText.setText(String.format(Locale.getDefault(), "%d%s", Long.valueOf(jLongValue), act.getString(R$string.f19537ot)));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static pej0 m177995R0(String str, Act act, String str2, String str3, String str4, String str5, x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6, x20 x20Var7, x20 x20Var8, User user) {
        return m178013a1(str, act, str2, str3, str4, str5, x20Var, x20Var2, x20Var3, x20Var4, x20Var5, x20Var6, x20Var7, x20Var8, null, user);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m177997S0(Act act, boolean z) {
        pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_alert_cheat_prevention__verify_required_popup.getIdentifier());
        final OmsBaseRender omsBaseRenderM196479h = uk50.m196472f().m196479h();
        final kcg0 kcg0VarSubscribe = act.duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.trk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178046s0(omsBaseRenderM196479h, (User) obj);
            }
        }));
        final kcg0 kcg0VarSubscribe2 = act.duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).filter(new qcj() { // from class: l.urk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((VerificationCenter) obj) != null);
            }
        }).map(new qcj() { // from class: l.vrk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VerificationCenter) obj).picVerificationInfo.status;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wrk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178028j0(omsBaseRenderM196479h, (StudentVerificationStatus) obj);
            }
        }));
        if (NullChecker.m82486a(omsBaseRenderM196479h)) {
            omsBaseRenderM196479h.m80451b0(new DialogInterface.OnDismissListener() { // from class: l.xrk
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    qtk.m177967D0(kcg0VarSubscribe, kcg0VarSubscribe2, dialogInterface);
                }
            });
            hxf.m137593n();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m177998T(x20 x20Var) {
        fph0.m126635F();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m177999T0(Act act) {
        NameFakeView nameFakeView = (NameFakeView) act.inflater().inflate(kec0.f125920ke, (ViewGroup) null, false);
        nameFakeView.m51606h(act);
        Dialog dialogM21566z = act.dialog().m21518O(nameFakeView).m21556u().m21495B(false).m21566z();
        Objects.requireNonNull(dialogM21566z);
        nameFakeView.m51607i(act, new sqk(dialogM21566z));
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m178000U(z20 z20Var, WheelPicker wheelPicker, WheelPicker wheelPicker2, pej0 pej0Var, View view) {
        z20Var.call(Integer.valueOf(wheelPicker.getCurrentItemPosition()), Integer.valueOf(wheelPicker2.getCurrentItemPosition()));
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: U0 */
    public static pej0 m178001U0(Act act, String str, x20 x20Var, x20 x20Var2) {
        return m178009Y0("", act, "", str, "", "", x20Var, x20Var2, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: V0 */
    public static void m178003V0(Act act, boolean z, Media media, CharSequence charSequence, Runnable runnable) {
        m178005W0(act, z, media, charSequence, runnable, "");
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m178004W(Throwable th) {
    }

    /* JADX INFO: renamed from: W0 */
    public static void m178005W0(Act act, final boolean z, Media media, CharSequence charSequence, final Runnable runnable, String str) {
        CoreModule.f18264c.f20381e0.m116600p9();
        final boolean z2 = false;
        ProfileFakeView profileFakeView = (ProfileFakeView) act.inflater().inflate(kec0.f125398Ee, (ViewGroup) null, false);
        profileFakeView.mo51611a(z, media);
        jl80.C17971a c17971aM146018M = new jl80.C17971a(act).m146036e0(true).m146023R(profileFakeView.getRenderView()).m146021P(!z).m146018M(true);
        c17971aM146018M.m146033b0(charSequence).m146028W(null);
        jl80 jl80VarM146020O = c17971aM146018M.m146020O();
        final jl80[] jl80VarArr = {jl80VarM146020O};
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.gtk
            @Override // java.lang.Runnable
            public final void run() {
                qtk.m177976I(z, runnable, jl80VarArr);
            }
        });
        if (!z && CoreModule.f18264c.f20381e0.m116579k8()) {
            profileFakeView.getTitleView().setText(act.getString(R$string.f18716O));
        }
        final kcg0 kcg0VarSubscribe = z ? act.duringCreated((C22421c) C7997b.m37423r().m37437q(), false).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ntk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178045s(jl80VarArr, (uxj0) obj);
            }
        })) : null;
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_fake_twoguide", Dialog.class.getName());
        jl80VarArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.otk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qtk.m178036n0(kcg0VarSubscribe, z, z2, l4g0VarM204399c, dialogInterface);
            }
        });
        jl80VarArr[0].show();
        if (!z) {
            fph0.m126688s();
        } else {
            fph0.m126685p(f159456i);
            f159456i = "";
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static void m178007X0(Act act, int i, int i2, final z20<Integer, Integer> z20Var) {
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCancelable(false);
        pej0Var.setContentView(kec0.f125884ib);
        VIcon vIcon = (VIcon) pej0Var.findViewById(adc0.f70535r4);
        TextView textView = (TextView) pej0Var.findViewById(adc0.f70552s4);
        final WheelPicker wheelPicker = (WheelPicker) pej0Var.findViewById(adc0.f70322eb);
        final WheelPicker wheelPicker2 = (WheelPicker) pej0Var.findViewById(adc0.f70339fb);
        if (i < 0 || i >= 24) {
            return;
        }
        wheelPicker.setData(f159454g);
        wheelPicker.setSelectedItemPosition(i);
        if (i2 <= 0 || i2 > 24) {
            return;
        }
        wheelPicker2.setData(f159455h);
        wheelPicker2.setSelectedItemPosition(i2 - 1);
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.atk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pej0Var.m176562T();
            }
        });
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.btk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178000U(z20Var, wheelPicker, wheelPicker2, pej0Var, view);
            }
        });
        final Window window = pej0Var.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2)).setBackgroundResource(dbc0.f86642Up);
        }
        l51.m152887G(new Runnable() { // from class: l.ctk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71125k);
            }
        });
        pej0Var.show();
    }

    /* JADX INFO: renamed from: Y0 */
    public static pej0 m178009Y0(String str, Act act, String str2, String str3, String str4, String str5, x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6, x20 x20Var7) {
        return m178011Z0(str, act, str2, str3, str4, str5, x20Var, x20Var2, x20Var3, x20Var4, x20Var5, x20Var6, x20Var7, null);
    }

    /* JADX INFO: renamed from: Z0 */
    public static pej0 m178011Z0(String str, Act act, String str2, String str3, String str4, String str5, x20 x20Var, x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6, x20 x20Var7, x20 x20Var8) {
        return m178013a1(str, act, str2, str3, str4, str5, x20Var, x20Var2, x20Var3, x20Var4, x20Var5, x20Var6, x20Var7, x20Var8, null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ uxj0 m178012a0(uxj0 uxj0Var, uxj0 uxj0Var2) {
        return uxj0Var;
    }

    /* JADX INFO: renamed from: a1 */
    public static pej0 m178013a1(String str, Act act, String str2, String str3, String str4, String str5, final x20 x20Var, final x20 x20Var2, x20 x20Var3, x20 x20Var4, x20 x20Var5, x20 x20Var6, x20 x20Var7, final x20 x20Var8, List<ShareItemBean> list, User user) {
        String str6;
        String str7;
        l4g0 l4g0VarM204399c = w1e.m204399c("p_share_pop", Dialog.class.getName());
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
        pf60 pf60VarM147494Y = jyb.m147494Y("moment_id", str);
        pf60 pf60VarM147494Y2 = jyb.m147494Y("share_pop_from_which", str6);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            str7 = str3;
        } else {
            str7 = str3;
            if (TextUtils.equals(str7, "discover_discussion")) {
                str8 = str2;
            }
        }
        l4g0VarM204399c.m152781p(pf60VarM147494Y, pf60VarM147494Y2, jyb.m147494Y("moment_share_from_which", str8));
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(true);
        pej0Var.setContentView(kec0.f125668Vb);
        pej0Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC19656a(l4g0VarM204399c, x20Var7));
        pej0Var.setOnKeyListener(new DialogInterfaceOnKeyListenerC19657b());
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2)).setBackgroundResource(dbc0.f86642Up);
        }
        l51.m152887G(new Runnable() { // from class: l.nrk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71125k);
            }
        });
        VLinear vLinear = (VLinear) pej0Var.findViewById(adc0.f69863D7);
        VImage vImage = (VImage) pej0Var.findViewById(adc0.f69880E7);
        VLinear vLinear2 = (VLinear) pej0Var.findViewById(adc0.f69829B7);
        VImage vImage2 = (VImage) pej0Var.findViewById(adc0.f69846C7);
        VImage vImage3 = (VImage) pej0Var.findViewById(adc0.f69812A7);
        if (gra.m131778z()) {
            vImage.setImageResource(dbc0.f87632z6);
            vImage2.setImageResource(dbc0.f87439t6);
            vImage3.setImageResource(dbc0.f87241n6);
        }
        TextView textView = (TextView) pej0Var.findViewById(adc0.f70409je);
        if (NullChecker.m82486a(user) && wj90.m206621d(user)) {
            textView.setText("更多操作");
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(vLinear2, false);
        }
        VLinear vLinear3 = (VLinear) pej0Var.findViewById(adc0.f70674z7);
        if (TextUtils.equals("p_moment_preview", str2) && NullChecker.m82486a(x20Var8)) {
            i4g0.m138526x("e_save_picture", "p_share_pop");
            bnl0.m105524M(vLinear3, true);
        }
        VRecyclerView vRecyclerView = (VRecyclerView) pej0Var.findViewById(adc0.f69986Kb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        k0f0 k0f0Var = new k0f0(act);
        List<ShareItemBean> listM177979J0 = m177979J0(x20Var3, x20Var4, x20Var5, x20Var6, str7, str4, str5, list);
        bnl0.m105524M(vRecyclerView, true ^ jyb.m147479J(listM177979J0));
        vRecyclerView.setAdapter(k0f0Var);
        k0f0Var.m147788C(listM177979J0);
        k0f0Var.m147789D(new C19658c(listM177979J0, pej0Var));
        VText vText = (VText) pej0Var.findViewById(adc0.f69819Ae);
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.prk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178020e0(x20Var, pej0Var, view);
            }
        });
        bnl0.m105509E0(vLinear2, new View.OnClickListener() { // from class: l.qrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178059z(x20Var2, pej0Var, view);
            }
        });
        bnl0.m105509E0(vLinear3, new View.OnClickListener() { // from class: l.rrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178060z0(x20Var8, pej0Var, view);
            }
        });
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.srk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178016c0(pej0Var, view);
            }
        });
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m178014b0(final VEditText vEditText, VText vText, final VText vText2, final VEditText vEditText2, final Act act, final boolean z, final VText vText3, final VButton vButton, View view) {
        if (!m177973G0(bsj0.m106255M(vEditText), bsj0.m106251I(vText) == 86)) {
            o1j0.m165651y("请输入正确手机号");
            return;
        }
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(vText);
        verifyData.mobileNumber = bsj0.m106255M(vEditText);
        bnl0.m105591y(vText2, false);
        vText2.setEnabled(false);
        vText2.setText("...");
        CoreModule.m30929H().send(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.psk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178027j(vEditText2, vText2, act, vEditText, z, (uxj0) obj);
            }
        }, new y20() { // from class: l.qsk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178053w(vText2, vEditText, vText3, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: b1 */
    public static pej0 m178015b1(Act act, String str, Link link, String str2, String str3, String str4, List<LinkChannel> list, z20<String, String> z20Var, a30<String, String, Throwable> a30Var) {
        return m178017c1(act, str, m177981K0(act, ShareHelper.m81135S(act, list), link, str2, str3, str4, z20Var, a30Var));
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m178016c0(pej0 pej0Var, View view) {
        i4g0.m138520r("e_share_pop_cancel", "p_share_pop");
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: c1 */
    public static pej0 m178017c1(Act act, String str, List<ShareItemBean> list) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_share_pop", Dialog.class.getName());
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        l4g0VarM204399c.m152781p(jyb.m147494Y("share_pop_from_which", str));
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(true);
        pej0Var.setContentView(kec0.f125716Yb);
        pej0Var.setOnDismissListener(new DialogInterfaceOnDismissListenerC19659d(l4g0VarM204399c));
        pej0Var.setOnKeyListener(new DialogInterfaceOnKeyListenerC19660e());
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2)).setBackgroundResource(dbc0.f86642Up);
        }
        l51.m152887G(new Runnable() { // from class: l.ksk
            @Override // java.lang.Runnable
            public final void run() {
                window.setWindowAnimations(agc0.f71125k);
            }
        });
        VRecyclerView vRecyclerView = (VRecyclerView) pej0Var.findViewById(adc0.f70003Lb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
        linearLayoutManager.setOrientation(0);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        k0f0 k0f0Var = new k0f0(act);
        vRecyclerView.setAdapter(k0f0Var);
        k0f0Var.m147788C(list);
        k0f0Var.m147789D(new C19661f(list, pej0Var));
        bnl0.m105509E0((VText) pej0Var.findViewById(adc0.f69819Ae), new View.OnClickListener() { // from class: l.vsk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtk.m178044r0(pej0Var, view);
            }
        });
        pej0Var.show();
        return pej0Var;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m178018d0(VEditText vEditText, VText vText, Act act, VText vText2, VButton vButton, CharSequence charSequence) {
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else if (TextUtils.equals(vText.getText().toString(), act.string(R$string.f19133bp))) {
            bnl0.m105591y(vText, true);
        }
        bnl0.m105524M(vText2, false);
        bnl0.m105540X(vButton, qa00.f156330q);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m178019d1(Act act, x20 x20Var) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_user_profile_share_agreement_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146024S(dbc0.f86674Vp).m146056y0("分享新功能").m146051t0("进入ta人主页可将ta的名片分享给您的朋友，使用截图有更多惊喜！若您需要关闭该功能则可前往设置-隐私和通知进行关闭").m146021P(false).m146034c0("我知道了", new Runnable() { // from class: l.yrk
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_user_profile_share_agreement_popup_confirm", "p_user_profile_share_agreement_popup");
            }
        }).m146049r0();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        jl80VarM146049r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ask
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m178020e0(x20 x20Var, pej0 pej0Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            i4g0.m138520r("e_share_pop_wechat", "p_share_pop");
            x20Var.call();
        }
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m178021f0(final boolean z, final TextView textView, boolean[] zArr, final Act act, LinearLayout linearLayout, final jl80 jl80Var, final x20 x20Var, final VEditText vEditText, final LinearLayout linearLayout2, VEditText vEditText2, VText vText, final VText vText2, final VButton vButton, View view) {
        fph0.m126660c(z ? "signout" : "on");
        if (textView.getVisibility() == 0) {
            if (!zArr[0]) {
                linearLayout.startAnimation(AnimationUtils.loadAnimation(act, x7c0.f192695j));
                return;
            } else {
                act.progress(R$string.f18632L5);
                act.duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.dsk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        qtk.m178048t0(z, act, (MobileRespInfo) obj);
                    }
                }).filter(new qcj() { // from class: l.esk
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((MobileRespInfo) obj).failed);
                    }
                }).flatMap(new qcj() { // from class: l.fsk
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                        return CoreModule.m30929H().oneClickBindPhone(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
                    }
                }), false).subscribe(psd0.m173597H(new y20() { // from class: l.gsk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        qtk.m178058y0(act, jl80Var, x20Var, z, vEditText, (uxj0) obj);
                    }
                }, new y20() { // from class: l.hsk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        qtk.m177988O(z, act, textView, linearLayout2, (Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (TextUtils.isEmpty(vEditText.getText())) {
            o1j0.m165649w(R$string.f19287gp);
            return;
        }
        if (TextUtils.isEmpty(vEditText2.getText())) {
            o1j0.m165649w(R$string.f19512o4);
            return;
        }
        act.progress(R$string.f18632L5);
        VerifyData verifyData = new VerifyData();
        verifyData.code = bsj0.m106251I(vEditText2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(vText);
        verifyData.mobileNumber = bsj0.m106255M(vEditText);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = bsj0.m106251I(vText);
        verifyData.mobileNumber = bsj0.m106255M(vEditText);
        CoreModule.m30929H().verify(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.isk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178042q0(act, jl80Var, x20Var, z, vEditText, (uxj0) obj);
            }
        }, new y20() { // from class: l.jsk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178049u(z, act, vText2, vButton, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m178022g0(final Act act, String str, final User user, final boolean z, x20 x20Var) {
        act.progress(R$string.f18632L5, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = act.getString(R$string.f19561pm);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        report.chatMessages = arrayList;
        new Relationship().state = RelationshipStatus.get("blocked");
        psd0.m173625r(CoreModule.f18264c.f20381e0.m116569ha(user.f56859id, report), CoreModule.f18264c.f20384f0.m34093qe(user.f56859id, act), new rcj() { // from class: l.jtk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return qtk.m178012a0((uxj0) obj, (uxj0) obj2);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ktk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m177980K(act, user, z, (uxj0) obj);
            }
        }, new y20() { // from class: l.ltk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178031l(act, (Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m178023h(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f19133bp);
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m178024h0(l4g0 l4g0Var, Runnable runnable, DialogInterface dialogInterface) {
        hlh0.m135741a().m135750j(false, "reBackAppGuideDialog");
        w1e.m204401e(l4g0Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m178026i0(VText vText, VEditText vEditText) {
        vText.setEnabled(true);
        vText.setText(R$string.f19133bp);
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m178027j(VEditText vEditText, final VText vText, final Act act, final VEditText vEditText2, boolean z, uxj0 uxj0Var) {
        vEditText.requestFocus();
        vText.setEnabled(false);
        vText.setClickable(false);
        vText.setText(R$string.f19318hp);
        act.duringCreated(l51.m152894N(act.getLocalClassName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.dtk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m177964C(vText, act, (Long) obj);
            }
        }, new y20() { // from class: l.etk
            @Override // p153l.y20
            public final void call(Object obj) {
                qtk.m178034m0((Throwable) obj);
            }
        }, new x20() { // from class: l.ftk
            @Override // p153l.x20
            public final void call() {
                qtk.m178023h(vText, vEditText2);
            }
        }));
        fph0.m126670h(z ? "signout" : "on");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m178028j0(OmsBaseRender omsBaseRender, StudentVerificationStatus studentVerificationStatus) {
        if ((TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "verified")) && NullChecker.m82486a(omsBaseRender) && omsBaseRender.f55071c.m21528Y().isShowing()) {
            omsBaseRender.m80440Q();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m178029k(x20 x20Var, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        fph0.m126666f();
        act.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m178031l(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m178034m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m178036n0(kcg0 kcg0Var, boolean z, boolean z2, l4g0 l4g0Var, DialogInterface dialogInterface) {
        psd0.m173633z(kcg0Var);
        if (!z) {
            fph0.m126686q();
        } else if (z2) {
            w1e.m204401e(l4g0Var);
        } else {
            fph0.m126684o();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C22421c m178037o(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m178041q(TextView textView, boolean[] zArr, VCheckBox vCheckBox, View view) {
        if (textView.getSelectionStart() == -1 && textView.getSelectionEnd() == -1) {
            i4g0.m138523u("e_sign_in_agreement", "", jyb.m147494Y("agreement_entrance", "bind_popup"));
            boolean z = !zArr[0];
            zArr[0] = z;
            vCheckBox.setChecked(z);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m178042q0(Act act, jl80 jl80Var, x20 x20Var, boolean z, VEditText vEditText, uxj0 uxj0Var) {
        act.progressDismiss();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        l51.m152891K(act.getLocalClassName());
        o1j0.m165651y(act.string(R$string.f19816xt));
        m177975H0(jl80Var);
        jl80Var.dismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        fph0.m126674j(z, vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m178043r(Notification notification) {
        if (NullChecker.m82486a(AccessToken.m7462d())) {
            z0w.m218186m().m218213u();
        }
        fph0.m126676k();
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m178044r0(pej0 pej0Var, View view) {
        i4g0.m138520r("e_share_pop_cancel", "p_share_pop");
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m178045s(jl80[] jl80VarArr, uxj0 uxj0Var) {
        if (jl80VarArr[0].isShowing()) {
            jl80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m178046s0(OmsBaseRender omsBaseRender, User user) {
        boolean zM82486a = NullChecker.m82486a(jyb.m147529r(user.status, new qcj() { // from class: l.ssk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((UserStatus) obj, UserStatus.RISK_TAG_MANDATORY_PICTURE_VERIFICATION));
            }
        }));
        boolean z = (jyb.m147479J(user.status) || !user.status.contains(UserStatus.get("hidden")) || App.f16092i.get().equals(CoreModule.f18264c.f20381e0.m116472I7())) ? false : true;
        if ((!zM82486a || z) && NullChecker.m82486a(omsBaseRender) && omsBaseRender.f55071c.m21528Y().isShowing()) {
            omsBaseRender.m80440Q();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m178048t0(boolean z, Act act, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            fph0.m126672i(z);
            act.progressDismiss();
            o1j0.m165651y(act.string(R$string.f19852z3));
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m178049u(boolean z, Act act, VText vText, VButton vButton, Throwable th) {
        fph0.m126672i(z);
        act.progressDismiss();
        if (!(th instanceof TantanException.Client.AccountService)) {
            bsj0.m106249G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            bsj0.m106249G(th);
            return;
        }
        String strM106276l = bsj0.m106276l(i);
        if (strM106276l == null) {
            bsj0.m106249G(th);
            return;
        }
        bnl0.m105525M0(vText, true);
        vText.setText(strM106276l);
        bnl0.m105540X(vButton, qa00.f156323j);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m178051v(boolean[] zArr, VCheckBox vCheckBox, View view) {
        i4g0.m138523u("e_sign_in_agreement", "", jyb.m147494Y("agreement_entrance", "bind_popup"));
        boolean z = !zArr[0];
        zArr[0] = z;
        vCheckBox.setChecked(z);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m178052v0(VEditText vEditText, Act act, Runnable runnable, DialogInterface dialogInterface) {
        if (jyb.m147481L(vEditText.getText().toString())) {
            act.postDelayed(runnable, 200L);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m178053w(VText vText, VEditText vEditText, VText vText2, VButton vButton, Throwable th) {
        vText.setClickable(true);
        vText.setEnabled(true);
        vText.setText(R$string.f19133bp);
        if (vEditText.getText().toString().isEmpty()) {
            bnl0.m105591y(vText, false);
        } else {
            bnl0.m105591y(vText, true);
        }
        if (!(th instanceof TantanException.Client.AccountService)) {
            bsj0.m106249G(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40000) {
            bsj0.m106249G(th);
            return;
        }
        String strM106276l = bsj0.m106276l(i);
        if (strM106276l == null) {
            bsj0.m106249G(th);
            return;
        }
        bnl0.m105525M0(vText2, true);
        vText2.setText(strM106276l);
        bnl0.m105540X(vButton, qa00.f156323j);
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m178054w0(String str, final Act act, jl80 jl80Var, boolean z, View view) {
        if ("登出当前帐号".equals(str)) {
            act.progress(R$string.f18632L5);
            if (vq8.m202359c()) {
                User userMe_ = CoreModule.m30930K().me_();
                if (NullChecker.m82486a(userMe_)) {
                    uqb0.f180380L.f17865d.m217964p(userMe_.m61308fp().url, CoreModule.m30929H().getAuthData().mo107143b(), userMe_.name);
                }
            }
            uqb0.m197259Z0(true, false).materialize().first().subscribe(psd0.m173597H(new y20() { // from class: l.bsk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qtk.m178043r((Notification) obj);
                }
            }, new y20() { // from class: l.csk
                @Override // p153l.y20
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }));
        }
        m177975H0(jl80Var);
        jl80Var.dismiss();
        if (z) {
            return;
        }
        fph0.m126664e();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m178055x(LinearLayout linearLayout, TextView textView, VButton vButton, LinearLayout linearLayout2, View view, boolean z, View view2) {
        bnl0.m105524M(linearLayout, false);
        bnl0.m105524M(textView, false);
        bnl0.m105524M(vButton, false);
        bnl0.m105524M(linearLayout2, true);
        bnl0.m105540X(view, qa00.f156326m);
        fph0.m126662d(z ? "signout" : "on");
        fph0.m126668g(z ? "signout" : "on", "no_number");
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m178058y0(Act act, jl80 jl80Var, x20 x20Var, boolean z, VEditText vEditText, uxj0 uxj0Var) {
        act.progressDismiss();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        o1j0.m165651y(act.string(R$string.f19816xt));
        jl80Var.dismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        fph0.m126674j(z, vEditText.getText().toString());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m178059z(x20 x20Var, pej0 pej0Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            i4g0.m138520r("e_share_pop_wechat_moment", "p_share_pop");
            x20Var.call();
        }
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m178060z0(x20 x20Var, pej0 pej0Var, View view) {
        i4g0.m138520r("e_save_picture", "p_share_pop");
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        pej0Var.m176562T();
    }
}
