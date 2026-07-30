package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CoreMemePhotoPreviewAct;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CorePopularMemeAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VListCell;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class w3z {

    /* JADX INFO: renamed from: a */
    public static c40 f184456a;

    /* JADX INFO: renamed from: l.w3z$a */
    public class C20794a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f184457a;

        public C20794a(Act act) {
            this.f184457a = act;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i2 != -1 || !NullChecker.m81303a(intent)) {
                return true;
            }
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selected_image");
            if (vwb.m200296J(arrayList)) {
                return true;
            }
            Act act = this.f184457a;
            act.startActivityForResult(CoreMemePhotoPreviewAct.m49233Z1(act, arrayList), 292);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.w3z$b */
    public class C20795b implements n3m {
        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_quickchat_overheat_popup";
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m201395A(final Act act, final Sticker sticker) {
        dd80.C16336a c16336aNewDialog = act.newDialog();
        c16336aNewDialog.m110962Q(l6c0.f126417X3);
        final dd80 dd80VarM110960O = c16336aNewDialog.m110960O();
        View viewM110906L = dd80VarM110960O.m110906L();
        VDraweeView vDraweeView = (VDraweeView) viewM110906L.findViewById(y4c0.f196257y1);
        VText vText = (VText) viewM110906L.findViewById(y4c0.f196058V0);
        VText vText2 = (VText) viewM110906L.findViewById(y4c0.f196186o0);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        vText2.setTypeface(typeface);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.d3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201416h(act, sticker, dd80VarM110960O, view);
            }
        });
        xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.e3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201430v(act, sticker, dd80VarM110960O, view);
            }
        });
        if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
            qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
        }
        CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: B */
    public static void m201396B(Act act, final Runnable runnable) {
        new xh0.C21150a(act).m208731j("离开后，设置的问题将不能被保存。确定离开吗？").m208739r("确定离开").m208736o(new View.OnClickListener() { // from class: l.a3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201411c(runnable, view);
            }
        }).m208727f("继续编辑").m208722a().m208721g();
    }

    /* JADX INFO: renamed from: C */
    public static void m201397C(Act act, String str, final Runnable runnable, final Runnable runnable2, final cwf0 cwf0Var) {
        new xh0.C21150a(act).m208740s(CoreModule.f17544b.getString(R$string.f21101v0)).m208731j(CoreModule.f17544b.getString(R$string.f21109w0, str)).m208727f(act.getResources().getString(R$string.f20916a)).m208724c(new View.OnClickListener() { // from class: l.l3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201413e(runnable, view);
            }
        }).m208739r(act.getResources().getString(R$string.f20799L2)).m208736o(new View.OnClickListener() { // from class: l.o3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201409a(runnable2, view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.p3z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w3z.m201414f(cwf0Var, dialogInterface);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: D */
    public static void m201398D(Act act, final Runnable runnable, final Runnable runnable2) {
        new xh0.C21150a(act).m208740s("开启设置以及时收到消息").m208731j("您的手机系统默认设置可能导致无法及时收到对方消息，请开启相关设置。").m208739r("查看开启方法").m208736o(new View.OnClickListener() { // from class: l.f3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201425q(runnable, view);
            }
        }).m208727f("不再提醒").m208724c(new View.OnClickListener() { // from class: l.g3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201415g(runnable2, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: E */
    public static void m201399E(Act act, String str, final Runnable runnable) {
        new xh0.C21150a(act).m208731j(str).m208738q(R$string.f20925b).m208736o(new View.OnClickListener() { // from class: l.b3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201410b(runnable, view);
            }
        }).m208726e(R$string.f20916a).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: F */
    public static void m201400F(Act act, User user) {
        final cwf0 cwf0Var = new cwf0(new C20795b());
        act.newDialog().m110964S(c3c0.f78650U5).m110996y0(String.format(Locale.CHINESE, "别着急，等%s回复后再继续聊天", user.isFemale() ? "她" : "他")).m110974c0("好的", new Runnable() { // from class: l.t3z
            @Override // java.lang.Runnable
            public final void run() {
                w3z.m201419k();
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.u3z
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cwf0Var.m109036l();
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.v3z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cwf0Var.m109035k();
            }
        }).m110960O().show();
    }

    /* JADX INFO: renamed from: G */
    public static void m201401G(Act act, String str, final Runnable runnable) {
        new xh0.C21150a(act).m208740s("温馨提醒").m208731j(str).m208727f("我知道了").m208739r("购买更多").m208736o(new View.OnClickListener() { // from class: l.k3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201429u(runnable, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: H */
    public static void m201402H(Act act, final Runnable runnable) {
        new xh0.C21150a(act).m208730i(R$string.f21061q0).m208726e(R$string.f21085t0).m208738q(R$string.f21034n0).m208736o(new View.OnClickListener() { // from class: l.j3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201427s(runnable, view);
            }
        }).m208728g(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: I */
    public static void m201403I(Act act) {
        new xh0.C21150a(act).m208740s(act.getResources().getString(R$string.f21043o0)).m208730i(R$string.f21069r0).m208738q(R$string.f21025m0).m208728g(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: J */
    public static void m201404J(final Act act) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R$string.f21004j6));
        arrayList.add(act.getString(R$string.f21013k6));
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105155H(R$string.f20916a).m105168U(new View.OnClickListener() { // from class: l.m3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.f184456a.m105113b();
            }
        }).m105164Q(arrayList).m105163P(Typeface.DEFAULT_BOLD).m105165R(new int[]{0, 1}, new int[]{a1c0.f67152f, a1c0.f67161o}).m105169V(new c40.InterfaceC16059d() { // from class: l.n3z
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                w3z.m201412d(act, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        f184456a = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: K */
    public static void m201405K(Act act, boolean z, String str, final Runnable runnable, final Runnable runnable2) {
        String string;
        final cwf0 cwf0Var = new cwf0("p_group_chat_confirm_prohibit", Dialog.class.getName());
        i0e.m133797f(cwf0Var);
        xh0.C21150a c21150aM208740s = new xh0.C21150a(act).m208740s(z ? CoreModule.f17544b.getString(R$string.f20796L) : "解禁确认");
        if (z) {
            string = CoreModule.f17544b.getString(R$string.f20812N, str);
        } else {
            string = "解除对「" + str + "」的禁言";
        }
        c21150aM208740s.m208731j(string).m208727f(act.getResources().getString(R$string.f20916a)).m208724c(new View.OnClickListener() { // from class: l.q3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201424p(runnable, view);
            }
        }).m208739r(act.getResources().getString(R$string.f20799L2)).m208736o(new View.OnClickListener() { // from class: l.r3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201421m(runnable2, view);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.s3z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: L */
    public static void m201406L(Act act, String str) {
        act.newDialog().m110996y0(str).m110989r0();
    }

    /* JADX INFO: renamed from: M */
    public static void m201407M(Act act) {
        new xh0.C21150a(act).m208730i(R$string.f21015l).m208738q(R$string.f20997j).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: N */
    public static void m201408N(Act act) {
        new xh0.C21150a(act).m208730i(R$string.f20914Z5).m208740s(act.getResources().getString(R$string.f20923a6)).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m201409a(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m201410b(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m201411c(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m201412d(Act act, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        f184456a.m105113b();
        if (i == 0) {
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C20794a(act));
        } else if (i == 1) {
            Intent intent = new Intent(act, (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f31859l, true);
            act.startActivity(intent);
            act.overridePendingTransition(szb0.f167030e, szb0.f167026a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m201413e(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m201414f(cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(cwf0Var)) {
            i0e.m133796e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m201415g(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m201416h(Act act, Sticker sticker, dd80 dd80Var, View view) {
        zvf0.m220399u("e_stickers_move_to_front", act.pageId(), vwb.m200311Y("stickers_id_new", sticker.f56011id));
        UserSticker userStickerNew_ = UserSticker.new_();
        ArrayList arrayList = new ArrayList();
        userStickerNew_.favoriteStickers = arrayList;
        arrayList.add(sticker.f56011id);
        CoreModule.f17545c.f19624Z.f20143T.m34958W(userStickerNew_);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m201419k() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m201421m(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m201422n(Act act, Runnable runnable) {
        zvf0.m220396r("e_add_stickers", act.pageId());
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m201423o(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m201424p(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m201425q(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m201426r(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m201427s(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m201429u(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m201430v(Act act, Sticker sticker, dd80 dd80Var, View view) {
        zvf0.m220399u("e_stickers_delete", act.pageId(), vwb.m200311Y("stickers_id_new", sticker.f56011id));
        UserSticker userStickerNew_ = UserSticker.new_();
        ArrayList arrayList = new ArrayList();
        userStickerNew_.favoriteStickers = arrayList;
        arrayList.add(sticker.f56011id);
        CoreModule.f17545c.f19624Z.f20143T.m34951P(userStickerNew_);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static void m201431w(final Act act, Sticker sticker, final Runnable runnable) {
        dd80.C16336a c16336aNewDialog = act.newDialog();
        c16336aNewDialog.m110962Q(l6c0.f126513l4);
        c16336aNewDialog.m110974c0(act.getResources().getString(R$string.f20968f6), new Runnable() { // from class: l.c3z
            @Override // java.lang.Runnable
            public final void run() {
                w3z.m201422n(act, runnable);
            }
        });
        dd80 dd80VarM110960O = c16336aNewDialog.m110960O();
        dd80VarM110960O.show();
        VDraweeView vDraweeView = (VDraweeView) dd80VarM110960O.m110906L().findViewById(y4c0.f196257y1);
        if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
            qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).attachments.get(0).url);
        }
        CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
    }

    /* JADX INFO: renamed from: x */
    public static void m201432x(Act act, final Runnable runnable) {
        new xh0.C21150a(act).m208730i(R$string.f20988i).m208738q(R$string.f20997j).m208736o(new View.OnClickListener() { // from class: l.i3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201423o(runnable, view);
            }
        }).m208726e(R$string.f20916a).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: y */
    public static void m201433y(Act act) {
        new xh0.C21150a(act).m208730i(R$string.f20937c2).m208738q(R$string.f20946d2).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: z */
    public static void m201434z(Act act, final Runnable runnable) {
        new xh0.C21150a(act).m208731j(act.getResources().getString(R$string.f20807M2)).m208727f(act.getResources().getString(R$string.f20916a)).m208739r(act.getResources().getString(R$string.f20799L2)).m208736o(new View.OnClickListener() { // from class: l.h3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m201426r(runnable, view);
            }
        }).m208722a().m208721g();
    }
}
