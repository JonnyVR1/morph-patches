package com.p046p1.mobile.putong.live.external.intl.feedback.upload;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.sdn;
import p149l.ydn;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/upload/IntlFeedbackCommitAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "initSubscription", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Ll/ydn;", "viewModel", "Ll/ydn;", "Ll/sdn;", "mPresenter", "Ll/sdn;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlFeedbackCommitAct extends PutongAct {
    private sdn mPresenter;
    private ydn viewModel;

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        ydn ydnVar = this.viewModel;
        if (ydnVar == null) {
            Intrinsics.m87502r("viewModel");
            ydnVar = null;
        }
        return ydnVar.inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mPresenter = new sdn(this, this);
        this.viewModel = new ydn();
        sdn sdnVar = this.mPresenter;
        ydn ydnVar = null;
        if (sdnVar == null) {
            Intrinsics.m87502r("mPresenter");
            sdnVar = null;
        }
        ydn ydnVar2 = this.viewModel;
        if (ydnVar2 == null) {
            Intrinsics.m87502r("viewModel");
        } else {
            ydnVar = ydnVar2;
        }
        sdnVar.mo51532C(ydnVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        sdn sdnVar = this.mPresenter;
        if (sdnVar == null) {
            Intrinsics.m87502r("mPresenter");
            sdnVar = null;
        }
        sdnVar.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 789 && resultCode == -1) {
            sdn sdnVar = this.mPresenter;
            if (sdnVar == null) {
                Intrinsics.m87502r("mPresenter");
                sdnVar = null;
            }
            sdnVar.m183518m0(requestCode, resultCode, data);
        }
    }
}
