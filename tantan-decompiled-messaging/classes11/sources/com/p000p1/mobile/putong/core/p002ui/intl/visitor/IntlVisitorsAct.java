package com.p000p1.mobile.putong.core.p002ui.intl.visitor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.eop;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "initSubscription", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "", "pageId", "()Ljava/lang/String;", "", "needBindBillingService", "()Z", "Ll/eop;", "c", "Ll/eop;", "V1", "()Ll/eop;", "Y1", "(Ll/eop;)V", "presenter", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "d", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "X1", "()Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "Z1", "(Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;)V", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlVisitorsAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public eop presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public IntlVisitorsViewModel viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.visitor.IntlVisitorsAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m8272a(@Nullable Context context) {
            return new Intent(context, (Class<?>) IntlVisitorsAct.class);
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final eop m8268V1() {
        eop eopVar = this.presenter;
        if (eopVar != null) {
            return eopVar;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final IntlVisitorsViewModel m8269X1() {
        IntlVisitorsViewModel intlVisitorsViewModel = this.viewModel;
        if (intlVisitorsViewModel != null) {
            return intlVisitorsViewModel;
        }
        Intrinsics.r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m8270Y1(@NotNull eop eopVar) {
        eopVar.getClass();
        this.presenter = eopVar;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m8271Z1(@NotNull IntlVisitorsViewModel intlVisitorsViewModel) {
        intlVisitorsViewModel.getClass();
        this.viewModel = intlVisitorsViewModel;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m8269X1().inflateView(inflater, parent);
    }

    public void initDataOnCreate() {
        m8271Z1(new IntlVisitorsViewModel(this));
        m8270Y1(new eop(this));
        m8268V1().C(m8269X1());
        m8268V1().m14052Z();
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        m8268V1().m14053a0();
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (m8268V1().m14050U0(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @NotNull
    public String pageId() {
        return "p_intl_visitors_list";
    }
}
