package com.p051p1.mobile.putong.core.p058ui.intl.greet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.cgc0;
import p153l.crl;
import p153l.g9c0;
import p153l.gnn;
import p153l.xnn;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J)\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.R(\u00104\u001a\u0004\u0018\u00010'2\b\u0010/\u001a\u0004\u0018\u00010'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R(\u00109\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u0010<\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010>\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010;\u001a\u0004\b>\u0010?\"\u0004\b@\u0010#R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010/\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006G"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "Ll/crl;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "checkGradientColors", "finish", "initDataOnCreate", "initSubscription", "setTheme", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "pageId", "()Ljava/lang/String;", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "onBackPressed", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "Ll/gnn;", "X1", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)Ll/gnn;", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "Ll/xnn;", "Y1", "(Lcom/p1/mobile/putong/core/data/Greeting;)Ll/xnn;", "value", "c", "Ll/gnn;", "a2", "()Ll/gnn;", "presenter", Constants.INAPP_DATA_TAG, "Ll/xnn;", "getViewModel", "()Ll/xnn;", "viewModel", "e", "Z", "forceFinish", "f", "isNoSend", "()Z", "b2", "g", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "Z1", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "Companion", "a", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlGreetAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public gnn presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public xnn viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean forceFinish;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isNoSend = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlGreetingParam param;

    /* JADX INFO: renamed from: X1 */
    public final gnn m47329X1(IntlGreetingParam param) {
        return new gnn(this, param);
    }

    /* JADX INFO: renamed from: Y1 */
    public final xnn m47330Y1(Greeting greeting) {
        return new xnn(this);
    }

    @Nullable
    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final IntlGreetingParam getParam() {
        return this.param;
    }

    @Nullable
    /* JADX INFO: renamed from: a2, reason: from getter */
    public final gnn getPresenter() {
        return this.presenter;
    }

    /* JADX INFO: renamed from: b2 */
    public final void m47333b2(boolean z) {
        this.isNoSend = z;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(g9c0.f102807Y);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.forceFinish) {
            return;
        }
        act().overridePendingTransition(0, y7c0.f197764b);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        xnn xnnVar = this.viewModel;
        if (xnnVar != null) {
            return xnnVar.inflateView(inflater, parent);
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        IntlGreetingParam intlGreetingParam = (IntlGreetingParam) getIntent().getSerializableExtra("greet_param");
        this.param = intlGreetingParam;
        if (NullChecker.m82486a(intlGreetingParam)) {
            IntlGreetingParam intlGreetingParam2 = this.param;
            if (NullChecker.m82486a(intlGreetingParam2 != null ? intlGreetingParam2.getGreetInfo() : null)) {
                IntlGreetingParam intlGreetingParam3 = this.param;
                intlGreetingParam3.getClass();
                this.presenter = m47329X1(intlGreetingParam3);
                IntlGreetingParam intlGreetingParam4 = this.param;
                intlGreetingParam4.getClass();
                Greeting greetInfo = intlGreetingParam4.getGreetInfo();
                greetInfo.getClass();
                xnn xnnVarM47330Y1 = m47330Y1(greetInfo);
                this.viewModel = xnnVarM47330Y1;
                gnn gnnVar = this.presenter;
                if (gnnVar != null) {
                    gnnVar.mo52715C(xnnVarM47330Y1);
                }
                gnn gnnVar2 = this.presenter;
                if (gnnVar2 != null) {
                    gnnVar2.m117338j0();
                    return;
                }
                return;
            }
        }
        this.forceFinish = true;
        lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m82486a(this.presenter)) {
            gnn gnnVar = this.presenter;
            gnnVar.getClass();
            gnnVar.mo40473a0();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        gnn gnnVar = this.presenter;
        if (gnnVar == null || !gnnVar.m130896d1(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        xnn xnnVar = this.viewModel;
        if (xnnVar != null) {
            xnnVar.m212253C();
        }
        this.act.lambda$debugItems$19();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        xnn xnnVar = this.viewModel;
        if (xnnVar != null) {
            xnnVar.m212276e0(hasFocus);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_intl_ilike_im_popup";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(cgc0.f81653i);
    }
}
