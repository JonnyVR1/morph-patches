package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRadioButton;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, m88121d2 = {"Ll/c680;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/i6t;", "Ll/dw40;", "pkPresenter", "", "isMute", "", "anchorName", "Ll/x20;", "closeAction", "Landroidx/appcompat/app/a;", "o", "(Lcom/p1/mobile/android/app/Act;Ll/i6t;ZLjava/lang/String;Ll/x20;)Landroidx/appcompat/app/a;", "userName", "k", "(ZLjava/lang/String;)Ljava/lang/String;", "j", "Landroid/content/Context;", "context", "Landroid/view/View;", "targetView", "Landroid/view/ViewGroup;", "rootView", "", "n", "(Landroid/content/Context;Landroid/view/View;Landroid/view/ViewGroup;)V", "Lcom/p1/mobile/putong/live/livingroom/recreation/pk/bean/PkData;", "pkInfo", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/live/livingroom/recreation/pk/bean/PkData;)Z", "Landroid/widget/TextView;", OMSTemplateModeType.view, "m", "(Landroid/widget/TextView;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class c680 {

    @NotNull
    public static final c680 INSTANCE = new c680();

    /* JADX INFO: renamed from: a */
    public static void m108102a(VRadioButton vRadioButton, View view) {
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: b */
    public static void m108103b(DialogC12774a dialogC12774a, View view) {
        dialogC12774a.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m108104c(VRadioButton vRadioButton, x20 x20Var, DialogC12774a dialogC12774a, View view) {
        ((ifv) zrv.m221194l(htd0.f111523e)).f114704m.put(Boolean.valueOf(!vRadioButton.isSelected()));
        x20Var.call();
        dialogC12774a.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m108105d(String str, BLivePkOwner bLivePkOwner) {
        bLivePkOwner.getClass();
        return Boolean.valueOf(TextUtils.equals(bLivePkOwner.userId, str));
    }

    /* JADX INFO: renamed from: e */
    public static void m108106e(VRadioButton vRadioButton, DialogC12774a dialogC12774a, View view) {
        ((ifv) zrv.m221194l(htd0.f111523e)).f114704m.put(Boolean.valueOf(!vRadioButton.isSelected()));
        dialogC12774a.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static void m108107f(String str) {
        fwk.m127777h().m127779g(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m108108g(i6t i6tVar, DialogInterface dialogInterface) {
        n180.m161088e(i6tVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m108109h(String str) {
    }

    /* JADX INFO: renamed from: i */
    public static void m108110i(View view) {
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m108111j(boolean isMute, @Nullable String userName) {
        return isMute ? xau.m209911u(R$string.f47635Ka, userName) : xau.m209911u(R$string.f47720Oa, userName);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final String m108112k(boolean isMute, @Nullable String userName) {
        return isMute ? xau.m209911u(R$string.f47657La, userName) : xau.m209911u(R$string.f47741Pa, userName);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m108113l(@NotNull PkData pkInfo) {
        pkInfo.getClass();
        final String str = pkInfo.otherUser().f56859id;
        str.getClass();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkInfo.f52415pk.players, new qcj() { // from class: l.z580
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return c680.m108105d(str, (BLivePkOwner) obj);
            }
        });
        if (bLivePkOwner != null) {
            return bLivePkOwner.muted;
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m108114n(@Nullable Context context, @Nullable View targetView, @Nullable ViewGroup rootView) {
        htd0<ifv> htd0Var = htd0.f111523e;
        Integer num = ((ifv) zrv.m221194l(htd0Var)).f114705n.get();
        if (num.intValue() < fct.f98282v) {
            zvk zvkVar = new zvk(context);
            zvkVar.m221776u(xau.m209910t(R$string.f47699Na)).m221773r(true).m221764i(zvk.f206224A).m221770o(qa00.m175859d(0.0f)).m221771p(qa00.m175859d(10.0f)).m221772q(-1).m221775t(13).m221774s(qa00.m175859d(16.0f), qa00.m175859d(10.0f), qa00.m175859d(16.0f), qa00.m175859d(10.0f)).m221760e(n3d0.m161277a(n9c0.f140855p0)).m221756a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m221759d(new zvk.InterfaceC21906b() { // from class: l.a680
                @Override // p153l.zvk.InterfaceC21906b
                /* JADX INFO: renamed from: a */
                public final void mo96261a(String str) {
                    c680.m108109h(str);
                }
            }).m221757b(new zvk.InterfaceC21905a() { // from class: l.b680
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    c680.m108107f(str);
                }
            });
            fwk.m127777h().m127789r(zvkVar, targetView, rootView);
            ((ifv) zrv.m221194l(htd0Var)).f114705n.put(Integer.valueOf(num.intValue() + 1));
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final DialogInterfaceC0075a m108115o(@NotNull Act act, @Nullable final i6t<dw40, ?> pkPresenter, boolean isMute, @Nullable String anchorName, @NotNull final x20 closeAction) {
        act.getClass();
        closeAction.getClass();
        if (!isMute || !((ifv) zrv.m221194l(htd0.f111523e)).f114704m.get().booleanValue()) {
            closeAction.call();
            return null;
        }
        View viewInflate = act.inflater().inflate(yec0.f199009a5, (ViewGroup) null);
        viewInflate.getClass();
        final DialogC12774a dialogC12774a = new DialogC12774a(act, viewInflate);
        dialogC12774a.m72954c0(jgc0.f120695b);
        View viewFindViewById = viewInflate.findViewById(mdc0.f136149d1);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(mdc0.f136264p0);
        viewFindViewById2.getClass();
        final VRadioButton vRadioButton = (VRadioButton) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(mdc0.f136291s0);
        viewFindViewById3.getClass();
        vRadioButton.setSelected(false);
        View viewFindViewById4 = viewInflate.findViewById(mdc0.f136282r0);
        viewFindViewById4.getClass();
        View viewFindViewById5 = viewInflate.findViewById(mdc0.f136007N6);
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(mdc0.f136168f0);
        viewFindViewById6.getClass();
        TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(mdc0.f136354z0);
        viewFindViewById7.getClass();
        TextView textView3 = (TextView) viewFindViewById7;
        c680 c680Var = INSTANCE;
        c680Var.m108116m(textView);
        c680Var.m108116m(textView2);
        c680Var.m108116m(textView3);
        c680Var.m108116m((TextView) viewFindViewById3);
        textView.setText(xau.m209911u(R$string.f47678Ma, anchorName));
        textView2.setText(xau.m209910t(R$string.f48510z));
        textView3.setText(xau.m209910t(R$string.f47920Y0));
        bnl0.m105509E0(viewFindViewById4, new View.OnClickListener() { // from class: l.t580
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c680.m108102a(vRadioButton, view);
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.u580
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c680.m108103b(dialogC12774a, view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.v580
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c680.m108110i(view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.w580
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c680.m108106e(vRadioButton, dialogC12774a, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.x580
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c680.m108104c(vRadioButton, closeAction, dialogC12774a, view);
            }
        });
        dialogC12774a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y580
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c680.m108108g(pkPresenter, dialogInterface);
            }
        });
        dialogC12774a.show();
        n180.m161089f(pkPresenter);
        return dialogC12774a;
    }

    /* JADX INFO: renamed from: m */
    public final void m108116m(TextView view) {
        view.getPaint().setFakeBoldText(true);
    }
}
