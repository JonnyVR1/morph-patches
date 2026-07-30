package com.p000p1.mobile.putong.core.p002ui.intloperation.flash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.i30;
import l.rzb0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.npi;
import p009l.vpi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/flash/FlashStickerAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "setTransparentStatusBar", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "finish", "", "pageId", "()Ljava/lang/String;", "", "shouldSwitchToTransparentStatus", "()Z", "Ll/npi;", "c", "Ll/npi;", "V1", "()Ll/npi;", "Y1", "(Ll/npi;)V", "presenter", "Ll/vpi;", "d", "Ll/vpi;", "X1", "()Ll/vpi;", "Z1", "(Ll/vpi;)V", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlashStickerAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public npi presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public vpi viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.flash.FlashStickerAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/flash/FlashStickerAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m8390a(@NotNull Act act) {
            act.getClass();
            return new Intent((Context) act, (Class<?>) FlashStickerAct.class);
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final npi m8386V1() {
        npi npiVar = this.presenter;
        if (npiVar != null) {
            return npiVar;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final vpi m8387X1() {
        vpi vpiVar = this.viewModel;
        if (vpiVar != null) {
            return vpiVar;
        }
        Intrinsics.r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m8388Y1(@NotNull npi npiVar) {
        npiVar.getClass();
        this.presenter = npiVar;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m8389Z1(@NotNull vpi vpiVar) {
        vpiVar.getClass();
        this.viewModel = vpiVar;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(rzb0.o, rzb0.x);
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflateView = m8387X1().inflateView(inflater, parent);
        m8386V1().m19002f0();
        m8386V1().m19001e0();
        return viewInflateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    @NotNull
    public String pageId() {
        return "p_intl_mkt_time_sticker_choose";
    }

    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        m8388Y1(new npi(this));
        m8389Z1(new vpi(this));
        m8386V1().C(m8387X1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.a(getSupportActionBar())) {
            i30 supportActionBar = getSupportActionBar();
            supportActionBar.getClass();
            supportActionBar.A(0.0f);
        }
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
