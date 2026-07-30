package com.p051p1.mobile.putong.live.external.intl.feedback;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.lgn;
import p153l.wgn;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/IntlFeedbackActivity;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "initSubscription", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/wgn;", "c", "Ll/wgn;", "viewModel", "Ll/lgn;", Constants.INAPP_DATA_TAG, "Ll/lgn;", "mPresenter", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlFeedbackActivity extends PutongAct {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public wgn viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public lgn mPresenter;

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        wgn wgnVar = this.viewModel;
        if (wgnVar == null) {
            Intrinsics.m88391r("viewModel");
            wgnVar = null;
        }
        return wgnVar.inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mPresenter = new lgn(this, this);
        this.viewModel = new wgn();
        lgn lgnVar = this.mPresenter;
        wgn wgnVar = null;
        if (lgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            lgnVar = null;
        }
        wgn wgnVar2 = this.viewModel;
        if (wgnVar2 == null) {
            Intrinsics.m88391r("viewModel");
        } else {
            wgnVar = wgnVar2;
        }
        lgnVar.mo52715C(wgnVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lgn lgnVar = this.mPresenter;
        if (lgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            lgnVar = null;
        }
        lgnVar.mo40473a0();
    }
}
