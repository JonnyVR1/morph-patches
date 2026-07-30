package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hzk;
import p149l.mzk;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/HelperManagerAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initSubscription", "initDataOnCreate", "Ll/hzk;", "c", "Ll/hzk;", "presenter", "Ll/mzk;", Constants.INAPP_DATA_TAG, "Ll/mzk;", "helperManagerActViewModel", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class HelperManagerAct extends PutongAct {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public hzk presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public mzk helperManagerActViewModel;

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        mzk mzkVar = this.helperManagerActViewModel;
        if (mzkVar == null) {
            Intrinsics.m87502r("helperManagerActViewModel");
            mzkVar = null;
        }
        return mzkVar.inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.presenter = new hzk(this);
        this.helperManagerActViewModel = new mzk(this);
        hzk hzkVar = this.presenter;
        mzk mzkVar = null;
        if (hzkVar == null) {
            Intrinsics.m87502r("presenter");
            hzkVar = null;
        }
        mzk mzkVar2 = this.helperManagerActViewModel;
        if (mzkVar2 == null) {
            Intrinsics.m87502r("helperManagerActViewModel");
        } else {
            mzkVar = mzkVar2;
        }
        hzkVar.mo51532C(mzkVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        hzk hzkVar = this.presenter;
        if (hzkVar == null) {
            Intrinsics.m87502r("presenter");
            hzkVar = null;
        }
        hzkVar.mo39470a0();
    }
}
