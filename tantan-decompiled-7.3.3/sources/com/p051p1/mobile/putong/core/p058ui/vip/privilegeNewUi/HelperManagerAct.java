package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c2l;
import p153l.x1l;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/HelperManagerAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initSubscription", "initDataOnCreate", "Ll/x1l;", "c", "Ll/x1l;", "presenter", "Ll/c2l;", Constants.INAPP_DATA_TAG, "Ll/c2l;", "helperManagerActViewModel", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class HelperManagerAct extends PutongAct {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public x1l presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public c2l helperManagerActViewModel;

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        c2l c2lVar = this.helperManagerActViewModel;
        if (c2lVar == null) {
            Intrinsics.m88391r("helperManagerActViewModel");
            c2lVar = null;
        }
        return c2lVar.inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.presenter = new x1l(this);
        this.helperManagerActViewModel = new c2l(this);
        x1l x1lVar = this.presenter;
        c2l c2lVar = null;
        if (x1lVar == null) {
            Intrinsics.m88391r("presenter");
            x1lVar = null;
        }
        c2l c2lVar2 = this.helperManagerActViewModel;
        if (c2lVar2 == null) {
            Intrinsics.m88391r("helperManagerActViewModel");
        } else {
            c2lVar = c2lVar2;
        }
        x1lVar.mo52715C(c2lVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        x1l x1lVar = this.presenter;
        if (x1lVar == null) {
            Intrinsics.m88391r("presenter");
            x1lVar = null;
        }
        x1lVar.mo40473a0();
    }
}
