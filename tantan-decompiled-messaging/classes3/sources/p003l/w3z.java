package p003l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CoreMemePhotoPreviewAct;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CorePopularMemeAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import l.a1c0;
import l.c3c0;
import l.c40;
import l.cwf0;
import l.dd80;
import l.i0e;
import l.j760;
import l.l6c0;
import l.n3m;
import l.qib0;
import l.szb0;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VListCell;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class w3z {

    /* JADX INFO: renamed from: a */
    public static c40 f8483a;

    /* JADX INFO: renamed from: l.w3z$a */
    public class C0610a implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f8484a;

        public C0610a(Act act) {
            this.f8484a = act;
        }

        /* JADX INFO: renamed from: a */
        public boolean m8469a(int i, int i2, Intent intent) {
            if (i2 != -1 || !NullChecker.a(intent)) {
                return true;
            }
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selected_image");
            if (vwb.J(arrayList)) {
                return true;
            }
            Act act = this.f8484a;
            act.startActivityForResult(CoreMemePhotoPreviewAct.m2352Z1(act, arrayList), 292);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.w3z$b */
    public class C0611b implements n3m {
        public boolean disableAutoPV() {
            return false;
        }

        public String pageId() {
            return "p_quickchat_overheat_popup";
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m8429A(final Act act, final Sticker sticker) {
        dd80.a aVarNewDialog = act.newDialog();
        aVarNewDialog.Q(l6c0.X3);
        final dd80 dd80VarO = aVarNewDialog.O();
        View viewL = dd80VarO.L();
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewL.findViewById(y4c0.y1);
        AppCompatTextView appCompatTextView = (VText) viewL.findViewById(y4c0.V0);
        AppCompatTextView appCompatTextView2 = (VText) viewL.findViewById(y4c0.o0);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        appCompatTextView.setTypeface(typeface);
        appCompatTextView2.setTypeface(typeface);
        xdl0.E0(appCompatTextView, new View.OnClickListener() { // from class: l.d3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8450h(act, sticker, dd80VarO, view);
            }
        });
        xdl0.E0(appCompatTextView2, new View.OnClickListener() { // from class: l.e3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8464v(act, sticker, dd80VarO, view);
            }
        });
        if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
            qib0.G.L0(simpleDraweeView, ((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
        }
        CoreModule.N().R9(simpleDraweeView, 10.0f);
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: B */
    public static void m8430B(Act act, final Runnable runnable) {
        new xh0.a(act).j("离开后，设置的问题将不能被保存。确定离开吗？").r("确定离开").o(new View.OnClickListener() { // from class: l.a3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8445c(runnable, view);
            }
        }).f("继续编辑").a().g();
    }

    /* JADX INFO: renamed from: C */
    public static void m8431C(Act act, String str, final Runnable runnable, final Runnable runnable2, final cwf0 cwf0Var) {
        new xh0.a(act).s(CoreModule.b.getString(R.string.v0)).j(CoreModule.b.getString(R.string.w0, str)).f(act.getResources().getString(R.string.a)).c(new View.OnClickListener() { // from class: l.l3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8447e(runnable, view);
            }
        }).r(act.getResources().getString(R.string.L2)).o(new View.OnClickListener() { // from class: l.o3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8443a(runnable2, view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.p3z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w3z.m8448f(cwf0Var, dialogInterface);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: D */
    public static void m8432D(Act act, final Runnable runnable, final Runnable runnable2) {
        new xh0.a(act).s("开启设置以及时收到消息").j("您的手机系统默认设置可能导致无法及时收到对方消息，请开启相关设置。").r("查看开启方法").o(new View.OnClickListener() { // from class: l.f3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8459q(runnable, view);
            }
        }).f("不再提醒").c(new View.OnClickListener() { // from class: l.g3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8449g(runnable2, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: E */
    public static void m8433E(Act act, String str, final Runnable runnable) {
        new xh0.a(act).j(str).q(R.string.b).o(new View.OnClickListener() { // from class: l.b3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8444b(runnable, view);
            }
        }).e(R.string.a).a().g();
    }

    /* JADX INFO: renamed from: F */
    public static void m8434F(Act act, User user) {
        final cwf0 cwf0Var = new cwf0(new C0611b());
        act.newDialog().S(c3c0.U5).y0(String.format(Locale.CHINESE, "别着急，等%s回复后再继续聊天", user.isFemale() ? "她" : "他")).c0("好的", new Runnable() { // from class: l.t3z
            @Override // java.lang.Runnable
            public final void run() {
                w3z.m8453k();
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.u3z
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cwf0Var.l();
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.v3z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cwf0Var.k();
            }
        }).O().show();
    }

    /* JADX INFO: renamed from: G */
    public static void m8435G(Act act, String str, final Runnable runnable) {
        new xh0.a(act).s("温馨提醒").j(str).f("我知道了").r("购买更多").o(new View.OnClickListener() { // from class: l.k3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8463u(runnable, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: H */
    public static void m8436H(Act act, final Runnable runnable) {
        new xh0.a(act).i(R.string.q0).e(R.string.t0).q(R.string.n0).o(new View.OnClickListener() { // from class: l.j3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8461s(runnable, view);
            }
        }).g(false).a().g();
    }

    /* JADX INFO: renamed from: I */
    public static void m8437I(Act act) {
        new xh0.a(act).s(act.getResources().getString(R.string.o0)).i(R.string.r0).q(R.string.m0).g(false).a().g();
    }

    /* JADX INFO: renamed from: J */
    public static void m8438J(final Act act) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R.string.j6));
        arrayList.add(act.getString(R.string.k6));
        c40.b bVar = new c40.b(act);
        bVar.H(R.string.a).U(new View.OnClickListener() { // from class: l.m3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.f8483a.b();
            }
        }).Q(arrayList).P(Typeface.DEFAULT_BOLD).R(new int[]{0, 1}, new int[]{a1c0.f, a1c0.o}).V(new c40.d() { // from class: l.n3z
            /* JADX INFO: renamed from: a */
            public final void m6526a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                w3z.m8446d(act, vListCell, c1338a, i);
            }
        });
        c40 c40VarF = bVar.F();
        f8483a = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: K */
    public static void m8439K(Act act, boolean z, String str, final Runnable runnable, final Runnable runnable2) {
        String string;
        final cwf0 cwf0Var = new cwf0("p_group_chat_confirm_prohibit", Dialog.class.getName());
        i0e.f(cwf0Var);
        xh0.a aVarS = new xh0.a(act).s(z ? CoreModule.b.getString(R.string.L) : "解禁确认");
        if (z) {
            string = CoreModule.b.getString(R.string.N, str);
        } else {
            string = "解除对「" + str + "」的禁言";
        }
        aVarS.j(string).f(act.getResources().getString(R.string.a)).c(new View.OnClickListener() { // from class: l.q3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8458p(runnable, view);
            }
        }).r(act.getResources().getString(R.string.L2)).o(new View.OnClickListener() { // from class: l.r3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8455m(runnable2, view);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.s3z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: L */
    public static void m8440L(Act act, String str) {
        act.newDialog().y0(str).r0();
    }

    /* JADX INFO: renamed from: M */
    public static void m8441M(Act act) {
        new xh0.a(act).i(R.string.l).q(R.string.j).a().g();
    }

    /* JADX INFO: renamed from: N */
    public static void m8442N(Act act) {
        new xh0.a(act).i(R.string.Z5).s(act.getResources().getString(R.string.a6)).a().g();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8443a(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8444b(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8445c(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8446d(Act act, VListCell vListCell, VListCell.C1338a c1338a, int i) {
        f8483a.b();
        if (i == 0) {
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C0610a(act));
        } else if (i == 1) {
            Intent intent = new Intent((Context) act, (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f1750l, true);
            act.startActivity(intent);
            act.overridePendingTransition(szb0.e, szb0.a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8447e(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m8448f(cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (NullChecker.a(cwf0Var)) {
            i0e.e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8449g(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8450h(Act act, Sticker sticker, dd80 dd80Var, View view) {
        zvf0.u("e_stickers_move_to_front", act.pageId(), new j760[]{vwb.Y("stickers_id_new", ((DbObject) sticker).id)});
        UserSticker userStickerNew_ = UserSticker.new_();
        ArrayList arrayList = new ArrayList();
        userStickerNew_.favoriteStickers = arrayList;
        arrayList.add(((DbObject) sticker).id);
        CoreModule.c.Z.T.W(userStickerNew_);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8453k() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m8455m(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m8456n(Act act, Runnable runnable) {
        zvf0.r("e_add_stickers", act.pageId());
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m8457o(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8458p(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m8459q(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m8460r(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8461s(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m8463u(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m8464v(Act act, Sticker sticker, dd80 dd80Var, View view) {
        zvf0.u("e_stickers_delete", act.pageId(), new j760[]{vwb.Y("stickers_id_new", ((DbObject) sticker).id)});
        UserSticker userStickerNew_ = UserSticker.new_();
        ArrayList arrayList = new ArrayList();
        userStickerNew_.favoriteStickers = arrayList;
        arrayList.add(((DbObject) sticker).id);
        CoreModule.c.Z.T.P(userStickerNew_);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static void m8465w(final Act act, Sticker sticker, final Runnable runnable) {
        dd80.a aVarNewDialog = act.newDialog();
        aVarNewDialog.Q(l6c0.l4);
        aVarNewDialog.c0(act.getResources().getString(R.string.f6), new Runnable() { // from class: l.c3z
            @Override // java.lang.Runnable
            public final void run() {
                w3z.m8456n(act, runnable);
            }
        });
        dd80 dd80VarO = aVarNewDialog.O();
        dd80VarO.show();
        SimpleDraweeView simpleDraweeView = (VDraweeView) dd80VarO.L().findViewById(y4c0.y1);
        if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
            qib0.G.L0(simpleDraweeView, ((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
        }
        CoreModule.N().R9(simpleDraweeView, 10.0f);
    }

    /* JADX INFO: renamed from: x */
    public static void m8466x(Act act, final Runnable runnable) {
        new xh0.a(act).i(R.string.i).q(R.string.j).o(new View.OnClickListener() { // from class: l.i3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8457o(runnable, view);
            }
        }).e(R.string.a).a().g();
    }

    /* JADX INFO: renamed from: y */
    public static void m8467y(Act act) {
        new xh0.a(act).i(R.string.c2).q(R.string.d2).a().g();
    }

    /* JADX INFO: renamed from: z */
    public static void m8468z(Act act, final Runnable runnable) {
        new xh0.a(act).j(act.getResources().getString(R.string.M2)).f(act.getResources().getString(R.string.a)).r(act.getResources().getString(R.string.L2)).o(new View.OnClickListener() { // from class: l.h3z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w3z.m8460r(runnable, view);
            }
        }).a().g();
    }
}
