package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J#\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0004J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*¨\u0006,"}, m88121d2 = {"Ll/mu5;", "Ll/iam;", "Ll/nu5;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "j", "presenter", Constants.INAPP_DATA_TAG, "(Ll/nu5;)V", "destroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "k", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;)V", "e", "Lv/VText;", "a", "Lv/VText;", "titleText", "b", "sendOther", "c", "confirmSend", "Landroid/view/View;", "parentView", "Ll/nu5;", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "menuDialog", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mu5 implements iam<nu5> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText titleText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText sendOther;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText confirmSend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View parentView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public nu5 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public DialogC12774a menuDialog;

    /* JADX INFO: renamed from: a */
    public static Unit m160118a(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m160119b(mu5 mu5Var, View view) {
        view.getClass();
        nu5 nu5Var = mu5Var.presenter;
        if (nu5Var == null) {
            Intrinsics.m88391r("presenter");
            nu5Var = null;
        }
        nu5Var.m164764g0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m160120c(mu5 mu5Var, View view) {
        view.getClass();
        nu5 nu5Var = mu5Var.presenter;
        if (nu5Var == null) {
            Intrinsics.m88391r("presenter");
            nu5Var = null;
        }
        nu5Var.m164762e0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    private final void m160121f(View view) {
        ynp0.m216936m(view.findViewById(mdc0.f135955I), qa00.f156326m);
        czq.m113347c(view, new Function1() { // from class: l.lu5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mu5.m160118a((View) obj);
            }
        });
        View viewFindViewById = view.findViewById(mdc0.f136007N6);
        viewFindViewById.getClass();
        VText vText = (VText) viewFindViewById;
        this.titleText = vText;
        if (vText == null) {
            Intrinsics.m88391r("titleText");
            vText = null;
        }
        vText.setText(xau.m209910t(R$string.f48183k2));
        View viewFindViewById2 = view.findViewById(mdc0.f135952H5);
        viewFindViewById2.getClass();
        this.confirmSend = (VText) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(mdc0.f135988L5);
        viewFindViewById3.getClass();
        this.sendOther = (VText) viewFindViewById3;
    }

    /* JADX INFO: renamed from: j */
    private final void m160122j() {
        VText vText = this.confirmSend;
        VText vText2 = null;
        if (vText == null) {
            Intrinsics.m88391r("confirmSend");
            vText = null;
        }
        czq.m113347c(vText, new Function1() { // from class: l.ju5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mu5.m160120c(this.f122691a, (View) obj);
            }
        });
        VText vText3 = this.sendOther;
        if (vText3 == null) {
            Intrinsics.m88391r("sendOther");
        } else {
            vText2 = vText3;
        }
        czq.m113347c(vText2, new Function1() { // from class: l.ku5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mu5.m160119b(this.f128815a, (View) obj);
            }
        });
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        View view = this.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        Context context = view.getContext();
        context.getClass();
        return context;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull nu5 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final void m160124e(Act act) {
        if (this.menuDialog == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(act);
            layoutInflaterFrom.getClass();
            View view = null;
            inflateView(layoutInflaterFrom, null);
            View view2 = this.parentView;
            if (view2 == null) {
                Intrinsics.m88391r("parentView");
                view2 = null;
            }
            this.menuDialog = new DialogC12774a(act, view2);
            View view3 = this.parentView;
            if (view3 == null) {
                Intrinsics.m88391r("parentView");
            } else {
                view = view3;
            }
            m160121f(view);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m160125i(@NotNull Act act) {
        act.getClass();
        m160124e(act);
        m160122j();
        DialogC12774a dialogC12774a = this.menuDialog;
        if (dialogC12774a != null) {
            dialogC12774a.show();
        }
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(yec0.f199147l0, parent, false);
        viewInflate.getClass();
        this.parentView = viewInflate;
        if (viewInflate != null) {
            return viewInflate;
        }
        Intrinsics.m88391r("parentView");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m160126k() {
        DialogC12774a dialogC12774a = this.menuDialog;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
