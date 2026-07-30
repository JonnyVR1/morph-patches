package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CoreMemePhotoPreviewAct;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CorePopularMemeAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VListCell;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class tcz {

    /* JADX INFO: renamed from: a */
    public static w30 f173287a;

    /* JADX INFO: renamed from: l.tcz$a */
    public class C20289a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f173288a;

        public C20289a(Act act) {
            this.f173288a = act;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i2 != -1 || !NullChecker.m82486a(intent)) {
                return true;
            }
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selected_image");
            if (jyb.m147479J(arrayList)) {
                return true;
            }
            Act act = this.f173288a;
            act.startActivityForResult(CoreMemePhotoPreviewAct.m50416a2(act, arrayList), 292);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.tcz$b */
    public class C20290b implements e6m {
        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_quickchat_overheat_popup";
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m190523A(final Act act, final Sticker sticker) {
        jl80.C17971a c17971aNewDialog = act.newDialog();
        c17971aNewDialog.m146022Q(qec0.f156973X3);
        final jl80 jl80VarM146020O = c17971aNewDialog.m146020O();
        View viewM145966L = jl80VarM146020O.m145966L();
        VDraweeView vDraweeView = (VDraweeView) viewM145966L.findViewById(edc0.f93492y1);
        VText vText = (VText) viewM145966L.findViewById(edc0.f93293V0);
        VText vText2 = (VText) viewM145966L.findViewById(edc0.f93421o0);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        vText2.setTypeface(typeface);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.acz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190544h(act, sticker, jl80VarM146020O, view);
            }
        });
        bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.bcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190558v(act, sticker, jl80VarM146020O, view);
            }
        });
        if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
            uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
        }
        CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: B */
    public static void m190524B(Act act, final Runnable runnable) {
        new th0.C20312a(act).m191151j("离开后，设置的问题将不能被保存。确定离开吗？").m191159r("确定离开").m191156o(new View.OnClickListener() { // from class: l.xbz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190539c(runnable, view);
            }
        }).m191147f("继续编辑").m191142a().m191141g();
    }

    /* JADX INFO: renamed from: C */
    public static void m190525C(Act act, String str, final Runnable runnable, final Runnable runnable2, final l4g0 l4g0Var) {
        new th0.C20312a(act).m191160s(CoreModule.f18263b.getString(R$string.f21843v0)).m191151j(CoreModule.f18263b.getString(R$string.f21851w0, str)).m191147f(act.getResources().getString(R$string.f21658a)).m191144c(new View.OnClickListener() { // from class: l.icz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190541e(runnable, view);
            }
        }).m191159r(act.getResources().getString(R$string.f21541L2)).m191156o(new View.OnClickListener() { // from class: l.lcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190537a(runnable2, view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.mcz
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                tcz.m190542f(l4g0Var, dialogInterface);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: D */
    public static void m190526D(Act act, final Runnable runnable, final Runnable runnable2) {
        new th0.C20312a(act).m191160s("开启设置以及时收到消息").m191151j("您的手机系统默认设置可能导致无法及时收到对方消息，请开启相关设置。").m191159r("查看开启方法").m191156o(new View.OnClickListener() { // from class: l.ccz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190553q(runnable, view);
            }
        }).m191147f("不再提醒").m191144c(new View.OnClickListener() { // from class: l.dcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190543g(runnable2, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: E */
    public static void m190527E(Act act, String str, final Runnable runnable) {
        new th0.C20312a(act).m191151j(str).m191158q(R$string.f21667b).m191156o(new View.OnClickListener() { // from class: l.ybz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190538b(runnable, view);
            }
        }).m191146e(R$string.f21658a).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: F */
    public static void m190528F(Act act, User user) {
        final l4g0 l4g0Var = new l4g0(new C20290b());
        act.newDialog().m146024S(ibc0.f113925U5).m146056y0(String.format(Locale.CHINESE, "别着急，等%s回复后再继续聊天", user.isFemale() ? "她" : "他")).m146034c0("好的", new Runnable() { // from class: l.qcz
            @Override // java.lang.Runnable
            public final void run() {
                tcz.m190547k();
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.rcz
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                l4g0Var.m152777l();
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.scz
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l4g0Var.m152776k();
            }
        }).m146020O().show();
    }

    /* JADX INFO: renamed from: G */
    public static void m190529G(Act act, String str, final Runnable runnable) {
        new th0.C20312a(act).m191160s("温馨提醒").m191151j(str).m191147f("我知道了").m191159r("购买更多").m191156o(new View.OnClickListener() { // from class: l.hcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190557u(runnable, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: H */
    public static void m190530H(Act act, final Runnable runnable) {
        new th0.C20312a(act).m191150i(R$string.f21803q0).m191146e(R$string.f21827t0).m191158q(R$string.f21776n0).m191156o(new View.OnClickListener() { // from class: l.gcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190555s(runnable, view);
            }
        }).m191148g(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: I */
    public static void m190531I(Act act) {
        new th0.C20312a(act).m191160s(act.getResources().getString(R$string.f21785o0)).m191150i(R$string.f21811r0).m191158q(R$string.f21767m0).m191148g(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: J */
    public static void m190532J(final Act act) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R$string.f21746j6));
        arrayList.add(act.getString(R$string.f21755k6));
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204656H(R$string.f21658a).m204669U(new View.OnClickListener() { // from class: l.jcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.f173287a.m204614b();
            }
        }).m204665Q(arrayList).m204664P(Typeface.DEFAULT_BOLD).m204666R(new int[]{0, 1}, new int[]{g9c0.f102816f, g9c0.f102825o}).m204670V(new w30.InterfaceC21003d() { // from class: l.kcz
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                tcz.m190540d(act, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        f173287a = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: K */
    public static void m190533K(Act act, boolean z, String str, final Runnable runnable, final Runnable runnable2) {
        String string;
        final l4g0 l4g0Var = new l4g0("p_group_chat_confirm_prohibit", Dialog.class.getName());
        w1e.m204402f(l4g0Var);
        th0.C20312a c20312aM191160s = new th0.C20312a(act).m191160s(z ? CoreModule.f18263b.getString(R$string.f21538L) : "解禁确认");
        if (z) {
            string = CoreModule.f18263b.getString(R$string.f21554N, str);
        } else {
            string = "解除对「" + str + "」的禁言";
        }
        c20312aM191160s.m191151j(string).m191147f(act.getResources().getString(R$string.f21658a)).m191144c(new View.OnClickListener() { // from class: l.ncz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190552p(runnable, view);
            }
        }).m191159r(act.getResources().getString(R$string.f21541L2)).m191156o(new View.OnClickListener() { // from class: l.ocz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190549m(runnable2, view);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.pcz
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: L */
    public static void m190534L(Act act, String str) {
        act.newDialog().m146056y0(str).m146049r0();
    }

    /* JADX INFO: renamed from: M */
    public static void m190535M(Act act) {
        new th0.C20312a(act).m191150i(R$string.f21757l).m191158q(R$string.f21739j).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: N */
    public static void m190536N(Act act) {
        new th0.C20312a(act).m191150i(R$string.f21656Z5).m191160s(act.getResources().getString(R$string.f21665a6)).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m190537a(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m190538b(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m190539c(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m190540d(Act act, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        f173287a.m204614b();
        if (i == 0) {
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C20289a(act));
        } else if (i == 1) {
            Intent intent = new Intent(act, (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f32707l, true);
            act.startActivity(intent);
            act.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m190541e(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m190542f(l4g0 l4g0Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(l4g0Var)) {
            w1e.m204401e(l4g0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m190543g(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m190544h(Act act, Sticker sticker, jl80 jl80Var, View view) {
        i4g0.m138523u("e_stickers_move_to_front", act.pageId(), jyb.m147494Y("stickers_id_new", sticker.f56859id));
        UserSticker userStickerNew_ = UserSticker.new_();
        ArrayList arrayList = new ArrayList();
        userStickerNew_.favoriteStickers = arrayList;
        arrayList.add(sticker.f56859id);
        CoreModule.f18264c.f20366Z.f20885T.m35961W(userStickerNew_);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m190547k() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m190549m(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m190550n(Act act, Runnable runnable) {
        i4g0.m138520r("e_add_stickers", act.pageId());
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m190551o(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m190552p(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m190553q(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m190554r(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m190555s(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m190557u(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m190558v(Act act, Sticker sticker, jl80 jl80Var, View view) {
        i4g0.m138523u("e_stickers_delete", act.pageId(), jyb.m147494Y("stickers_id_new", sticker.f56859id));
        UserSticker userStickerNew_ = UserSticker.new_();
        ArrayList arrayList = new ArrayList();
        userStickerNew_.favoriteStickers = arrayList;
        arrayList.add(sticker.f56859id);
        CoreModule.f18264c.f20366Z.f20885T.m35954P(userStickerNew_);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static void m190559w(final Act act, Sticker sticker, final Runnable runnable) {
        jl80.C17971a c17971aNewDialog = act.newDialog();
        c17971aNewDialog.m146022Q(qec0.f157069l4);
        c17971aNewDialog.m146034c0(act.getResources().getString(R$string.f21710f6), new Runnable() { // from class: l.zbz
            @Override // java.lang.Runnable
            public final void run() {
                tcz.m190550n(act, runnable);
            }
        });
        jl80 jl80VarM146020O = c17971aNewDialog.m146020O();
        jl80VarM146020O.show();
        VDraweeView vDraweeView = (VDraweeView) jl80VarM146020O.m145966L().findViewById(edc0.f93492y1);
        if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
            uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
        }
        CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
    }

    /* JADX INFO: renamed from: x */
    public static void m190560x(Act act, final Runnable runnable) {
        new th0.C20312a(act).m191150i(R$string.f21730i).m191158q(R$string.f21739j).m191156o(new View.OnClickListener() { // from class: l.fcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190551o(runnable, view);
            }
        }).m191146e(R$string.f21658a).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: y */
    public static void m190561y(Act act) {
        new th0.C20312a(act).m191150i(R$string.f21679c2).m191158q(R$string.f21688d2).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: z */
    public static void m190562z(Act act, final Runnable runnable) {
        new th0.C20312a(act).m191151j(act.getResources().getString(R$string.f21549M2)).m191147f(act.getResources().getString(R$string.f21658a)).m191159r(act.getResources().getString(R$string.f21541L2)).m191156o(new View.OnClickListener() { // from class: l.ecz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tcz.m190554r(runnable, view);
            }
        }).m191142a().m191141g();
    }
}
