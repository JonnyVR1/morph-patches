package com.p051p1.mobile.putong.live.external.intl.feedback.upload;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.pgn;
import p153l.rgn;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/upload/IntlFeedbackResultAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "initSubscription", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/rgn;", "viewModel", "Ll/rgn;", "Ll/pgn;", "mPresenter", "Ll/pgn;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlFeedbackResultAct extends PutongAct {
    private pgn mPresenter;
    private rgn viewModel;

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        rgn rgnVar = this.viewModel;
        if (rgnVar == null) {
            Intrinsics.m88391r("viewModel");
            rgnVar = null;
        }
        return rgnVar.inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mPresenter = new pgn(this, this);
        this.viewModel = new rgn();
        pgn pgnVar = this.mPresenter;
        rgn rgnVar = null;
        if (pgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            pgnVar = null;
        }
        rgn rgnVar2 = this.viewModel;
        if (rgnVar2 == null) {
            Intrinsics.m88391r("viewModel");
        } else {
            rgnVar = rgnVar2;
        }
        pgnVar.mo52715C(rgnVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        pgn pgnVar = this.mPresenter;
        if (pgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            pgnVar = null;
        }
        pgnVar.mo40473a0();
    }
}
