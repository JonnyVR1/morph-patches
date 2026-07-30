package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J#\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0004J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*¨\u0006,"}, m87232d2 = {"Ll/it5;", "Ll/s7m;", "Ll/jt5;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "j", "presenter", Constants.INAPP_DATA_TAG, "(Ll/jt5;)V", "destroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "k", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;)V", "e", "Lv/VText;", "a", "Lv/VText;", "titleText", "b", "sendOther", "c", "confirmSend", "Landroid/view/View;", "parentView", "Ll/jt5;", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "menuDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class it5 implements s7m<jt5> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText titleText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText sendOther;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText confirmSend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View parentView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public jt5 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public DialogC12611a menuDialog;

    /* JADX INFO: renamed from: a */
    public static Unit m138171a(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m138172b(it5 it5Var, View view) {
        view.getClass();
        jt5 jt5Var = it5Var.presenter;
        if (jt5Var == null) {
            Intrinsics.m87502r("presenter");
            jt5Var = null;
        }
        jt5Var.m143083g0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m138173c(it5 it5Var, View view) {
        view.getClass();
        jt5 jt5Var = it5Var.presenter;
        if (jt5Var == null) {
            Intrinsics.m87502r("presenter");
            jt5Var = null;
        }
        jt5Var.m143081e0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    private final void m138174f(View view) {
        uep0.m193326m(view.findViewById(g5c0.f100710I), t100.f167264m);
        cxq.m109105c(view, new Function1() { // from class: l.ht5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return it5.m138171a((View) obj);
            }
        });
        View viewFindViewById = view.findViewById(g5c0.f100762N6);
        viewFindViewById.getClass();
        VText vText = (VText) viewFindViewById;
        this.titleText = vText;
        if (vText == null) {
            Intrinsics.m87502r("titleText");
            vText = null;
        }
        vText.setText(w8u.m202217t(R$string.f47335k2));
        View viewFindViewById2 = view.findViewById(g5c0.f100707H5);
        viewFindViewById2.getClass();
        this.confirmSend = (VText) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(g5c0.f100743L5);
        viewFindViewById3.getClass();
        this.sendOther = (VText) viewFindViewById3;
    }

    /* JADX INFO: renamed from: j */
    private final void m138175j() {
        VText vText = this.confirmSend;
        VText vText2 = null;
        if (vText == null) {
            Intrinsics.m87502r("confirmSend");
            vText = null;
        }
        cxq.m109105c(vText, new Function1() { // from class: l.ft5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return it5.m138173c(this.f99143a, (View) obj);
            }
        });
        VText vText3 = this.sendOther;
        if (vText3 == null) {
            Intrinsics.m87502r("sendOther");
        } else {
            vText2 = vText3;
        }
        cxq.m109105c(vText2, new Function1() { // from class: l.gt5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return it5.m138172b(this.f104245a, (View) obj);
            }
        });
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        View view = this.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        Context context = view.getContext();
        context.getClass();
        return context;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull jt5 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final void m138177e(Act act) {
        if (this.menuDialog == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(act);
            layoutInflaterFrom.getClass();
            View view = null;
            inflateView(layoutInflaterFrom, null);
            View view2 = this.parentView;
            if (view2 == null) {
                Intrinsics.m87502r("parentView");
                view2 = null;
            }
            this.menuDialog = new DialogC12611a(act, view2);
            View view3 = this.parentView;
            if (view3 == null) {
                Intrinsics.m87502r("parentView");
            } else {
                view = view3;
            }
            m138174f(view);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m138178i(@NotNull Act act) {
        act.getClass();
        m138177e(act);
        m138175j();
        DialogC12611a dialogC12611a = this.menuDialog;
        if (dialogC12611a != null) {
            dialogC12611a.show();
        }
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(t6c0.f168415l0, parent, false);
        viewInflate.getClass();
        this.parentView = viewInflate;
        if (viewInflate != null) {
            return viewInflate;
        }
        Intrinsics.m87502r("parentView");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m138179k() {
        DialogC12611a dialogC12611a = this.menuDialog;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
