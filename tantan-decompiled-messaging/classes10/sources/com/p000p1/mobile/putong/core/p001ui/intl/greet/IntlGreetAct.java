package com.p000p1.mobile.putong.core.p001ui.intl.greet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import l.rol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.a1c0;
import p003l.gln;
import p003l.szb0;
import p003l.x7c0;
import p003l.xln;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J)\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.R(\u00104\u001a\u0004\u0018\u00010'2\b\u0010/\u001a\u0004\u0018\u00010'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R(\u00109\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u0010<\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010>\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010;\u001a\u0004\b>\u0010?\"\u0004\b@\u0010#R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010/\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "Ll/rol;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "checkGradientColors", "finish", "initDataOnCreate", "initSubscription", "setTheme", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "pageId", "()Ljava/lang/String;", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "onBackPressed", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "Ll/gln;", "V1", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)Ll/gln;", "Lcom/p1/mobile/putong/core/data/Greeting;", Greeting.TYPE, "Ll/xln;", "X1", "(Lcom/p1/mobile/putong/core/data/Greeting;)Ll/xln;", "value", "c", "Ll/gln;", "Z1", "()Ll/gln;", "presenter", "d", "Ll/xln;", "getViewModel", "()Ll/xln;", "viewModel", "e", "Z", "forceFinish", "f", "isNoSend", "()Z", "a2", "g", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "Y1", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "Companion", "a", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class IntlGreetAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public gln presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public xln viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean forceFinish;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isNoSend = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlGreetingParam param;

    /* JADX INFO: renamed from: V1 */
    public final gln m3511V1(IntlGreetingParam param) {
        return new gln(this, param);
    }

    /* JADX INFO: renamed from: X1 */
    public final xln m3512X1(Greeting greeting) {
        return new xln(this);
    }

    @Nullable
    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final IntlGreetingParam getParam() {
        return this.param;
    }

    @Nullable
    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final gln getPresenter() {
        return this.presenter;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m3515a2(boolean z) {
        this.isNoSend = z;
    }

    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(a1c0.f2689Y);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (this.forceFinish) {
            return;
        }
        act().overridePendingTransition(0, szb0.f7491b);
    }

    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        xln xlnVar = this.viewModel;
        if (xlnVar != null) {
            return xlnVar.inflateView(inflater, parent);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        IntlGreetingParam intlGreetingParam = (IntlGreetingParam) getIntent().getSerializableExtra("greet_param");
        this.param = intlGreetingParam;
        if (NullChecker.a(intlGreetingParam)) {
            IntlGreetingParam intlGreetingParam2 = this.param;
            if (NullChecker.a(intlGreetingParam2 != null ? intlGreetingParam2.getGreetInfo() : null)) {
                IntlGreetingParam intlGreetingParam3 = this.param;
                intlGreetingParam3.getClass();
                this.presenter = m3511V1(intlGreetingParam3);
                IntlGreetingParam intlGreetingParam4 = this.param;
                intlGreetingParam4.getClass();
                Greeting greetInfo = intlGreetingParam4.getGreetInfo();
                greetInfo.getClass();
                xln xlnVarM3512X1 = m3512X1(greetInfo);
                this.viewModel = xlnVarM3512X1;
                gln glnVar = this.presenter;
                if (glnVar != null) {
                    glnVar.C(xlnVarM3512X1);
                }
                gln glnVar2 = this.presenter;
                if (glnVar2 != null) {
                    glnVar2.m6180j0();
                    return;
                }
                return;
            }
        }
        this.forceFinish = true;
        finish();
    }

    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.a(this.presenter)) {
            gln glnVar = this.presenter;
            glnVar.getClass();
            glnVar.mo6175a0();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        gln glnVar = this.presenter;
        if (glnVar == null || !glnVar.m6764d1(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onBackPressed() {
        xln xlnVar = this.viewModel;
        if (xlnVar != null) {
            xlnVar.m10904C();
        }
        ((Act) this).act.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean hasFocus) {
        super/*android.app.Activity*/.onWindowFocusChanged(hasFocus);
        xln xlnVar = this.viewModel;
        if (xlnVar != null) {
            xlnVar.m10928e0(hasFocus);
        }
    }

    @NotNull
    public String pageId() {
        return "p_intl_ilike_im_popup";
    }

    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
    }

    public void setTheme() {
        super.setTheme();
        setTheme(x7c0.f8382i);
    }
}
