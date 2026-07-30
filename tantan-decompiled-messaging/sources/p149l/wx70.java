package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRadioButton;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, m87232d2 = {"Ll/wx70;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/h4t;", "Ll/pn40;", "pkPresenter", "", "isMute", "", "anchorName", "Ll/d30;", "closeAction", "Landroidx/appcompat/app/a;", "o", "(Lcom/p1/mobile/android/app/Act;Ll/h4t;ZLjava/lang/String;Ll/d30;)Landroidx/appcompat/app/a;", "userName", "k", "(ZLjava/lang/String;)Ljava/lang/String;", "j", "Landroid/content/Context;", "context", "Landroid/view/View;", "targetView", "Landroid/view/ViewGroup;", "rootView", "", "n", "(Landroid/content/Context;Landroid/view/View;Landroid/view/ViewGroup;)V", "Lcom/p1/mobile/putong/live/livingroom/recreation/pk/bean/PkData;", "pkInfo", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/live/livingroom/recreation/pk/bean/PkData;)Z", "Landroid/widget/TextView;", OMSTemplateModeType.view, "m", "(Landroid/widget/TextView;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class wx70 {

    @NotNull
    public static final wx70 INSTANCE = new wx70();

    /* JADX INFO: renamed from: a */
    public static void m205901a(VRadioButton vRadioButton, View view) {
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: b */
    public static void m205902b(DialogC12611a dialogC12611a, View view) {
        dialogC12611a.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m205903c(VRadioButton vRadioButton, d30 d30Var, DialogC12611a dialogC12611a, View view) {
        ((hdv) ypv.m215673l(fld0.f98150e)).f107307m.put(Boolean.valueOf(!vRadioButton.isSelected()));
        d30Var.call();
        dialogC12611a.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m205904d(String str, BLivePkOwner bLivePkOwner) {
        bLivePkOwner.getClass();
        return Boolean.valueOf(TextUtils.equals(bLivePkOwner.userId, str));
    }

    /* JADX INFO: renamed from: e */
    public static void m205905e(VRadioButton vRadioButton, DialogC12611a dialogC12611a, View view) {
        ((hdv) ypv.m215673l(fld0.f98150e)).f107307m.put(Boolean.valueOf(!vRadioButton.isSelected()));
        dialogC12611a.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static void m205906f(String str) {
        ptk.m171332h().m171334g(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m205907g(h4t h4tVar, DialogInterface dialogInterface) {
        ht70.m132848e(h4tVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m205908h(String str) {
    }

    /* JADX INFO: renamed from: i */
    public static void m205909i(View view) {
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m205910j(boolean isMute, @Nullable String userName) {
        return isMute ? w8u.m202218u(R$string.f46787Ka, userName) : w8u.m202218u(R$string.f46872Oa, userName);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final String m205911k(boolean isMute, @Nullable String userName) {
        return isMute ? w8u.m202218u(R$string.f46809La, userName) : w8u.m202218u(R$string.f46893Pa, userName);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m205912l(@NotNull PkData pkInfo) {
        pkInfo.getClass();
        final String str = pkInfo.otherUser().f56011id;
        str.getClass();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkInfo.f51567pk.players, new w9j() { // from class: l.tx70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wx70.m205904d(str, (BLivePkOwner) obj);
            }
        });
        if (bLivePkOwner != null) {
            return bLivePkOwner.muted;
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m205913n(@Nullable Context context, @Nullable View targetView, @Nullable ViewGroup rootView) {
        fld0<hdv> fld0Var = fld0.f98150e;
        Integer num = ((hdv) ypv.m215673l(fld0Var)).f107308n.get();
        if (num.intValue() < eat.f90264v) {
            jtk jtkVar = new jtk(context);
            jtkVar.m143129u(w8u.m202217t(R$string.f46851Na)).m143126r(true).m143117i(jtk.f119614A).m143123o(t100.m186890d(0.0f)).m143124p(t100.m186890d(10.0f)).m143125q(-1).m143128t(13).m143127s(t100.m186890d(16.0f), t100.m186890d(10.0f), t100.m186890d(16.0f), t100.m186890d(10.0f)).m143113e(kvc0.m147352a(h1c0.f105394p0)).m143109a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m143112d(new jtk.InterfaceC17857b() { // from class: l.ux70
                @Override // p149l.jtk.InterfaceC17857b
                /* JADX INFO: renamed from: a */
                public final void mo135260a(String str) {
                    wx70.m205908h(str);
                }
            }).m143110b(new jtk.InterfaceC17856a() { // from class: l.vx70
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    wx70.m205906f(str);
                }
            });
            ptk.m171332h().m171344r(jtkVar, targetView, rootView);
            ((hdv) ypv.m215673l(fld0Var)).f107308n.put(Integer.valueOf(num.intValue() + 1));
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final DialogInterfaceC0074a m205914o(@NotNull Act act, @Nullable final h4t<pn40, ?> pkPresenter, boolean isMute, @Nullable String anchorName, @NotNull final d30 closeAction) {
        act.getClass();
        closeAction.getClass();
        if (!isMute || !((hdv) ypv.m215673l(fld0.f98150e)).f107307m.get().booleanValue()) {
            closeAction.call();
            return null;
        }
        View viewInflate = act.inflater().inflate(t6c0.f168277a5, (ViewGroup) null);
        viewInflate.getClass();
        final DialogC12611a dialogC12611a = new DialogC12611a(act, viewInflate);
        dialogC12611a.m71771c0(d8c0.f84847b);
        View viewFindViewById = viewInflate.findViewById(g5c0.f100904d1);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(g5c0.f101019p0);
        viewFindViewById2.getClass();
        final VRadioButton vRadioButton = (VRadioButton) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(g5c0.f101046s0);
        viewFindViewById3.getClass();
        vRadioButton.setSelected(false);
        View viewFindViewById4 = viewInflate.findViewById(g5c0.f101037r0);
        viewFindViewById4.getClass();
        View viewFindViewById5 = viewInflate.findViewById(g5c0.f100762N6);
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(g5c0.f100923f0);
        viewFindViewById6.getClass();
        TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(g5c0.f101109z0);
        viewFindViewById7.getClass();
        TextView textView3 = (TextView) viewFindViewById7;
        wx70 wx70Var = INSTANCE;
        wx70Var.m205915m(textView);
        wx70Var.m205915m(textView2);
        wx70Var.m205915m(textView3);
        wx70Var.m205915m((TextView) viewFindViewById3);
        textView.setText(w8u.m202218u(R$string.f46830Ma, anchorName));
        textView2.setText(w8u.m202217t(R$string.f47662z));
        textView3.setText(w8u.m202217t(R$string.f47072Y0));
        xdl0.m208329E0(viewFindViewById4, new View.OnClickListener() { // from class: l.nx70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wx70.m205901a(vRadioButton, view);
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ox70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wx70.m205902b(dialogC12611a, view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.px70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wx70.m205909i(view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: l.qx70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wx70.m205905e(vRadioButton, dialogC12611a, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.rx70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wx70.m205903c(vRadioButton, closeAction, dialogC12611a, view);
            }
        });
        dialogC12611a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sx70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wx70.m205907g(pkPresenter, dialogInterface);
            }
        });
        dialogC12611a.show();
        ht70.m132849f(pkPresenter);
        return dialogC12611a;
    }

    /* JADX INFO: renamed from: m */
    public final void m205915m(TextView view) {
        view.getPaint().setFakeBoldText(true);
    }
}
