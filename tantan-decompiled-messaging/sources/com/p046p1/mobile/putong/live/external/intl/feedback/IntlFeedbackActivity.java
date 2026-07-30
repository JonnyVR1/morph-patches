package com.p046p1.mobile.putong.live.external.intl.feedback;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.len;
import p149l.wen;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/IntlFeedbackActivity;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "initSubscription", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/wen;", "c", "Ll/wen;", "viewModel", "Ll/len;", Constants.INAPP_DATA_TAG, "Ll/len;", "mPresenter", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlFeedbackActivity extends PutongAct {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public wen viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public len mPresenter;

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        wen wenVar = this.viewModel;
        if (wenVar == null) {
            Intrinsics.m87502r("viewModel");
            wenVar = null;
        }
        return wenVar.inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mPresenter = new len(this, this);
        this.viewModel = new wen();
        len lenVar = this.mPresenter;
        wen wenVar = null;
        if (lenVar == null) {
            Intrinsics.m87502r("mPresenter");
            lenVar = null;
        }
        wen wenVar2 = this.viewModel;
        if (wenVar2 == null) {
            Intrinsics.m87502r("viewModel");
        } else {
            wenVar = wenVar2;
        }
        lenVar.mo51532C(wenVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        len lenVar = this.mPresenter;
        if (lenVar == null) {
            Intrinsics.m87502r("mPresenter");
            lenVar = null;
        }
        lenVar.mo39470a0();
    }
}
