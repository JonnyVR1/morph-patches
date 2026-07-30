package com.p046p1.mobile.putong.core.p053ui.seepage.likers.mytab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.app.PutongFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fzf;
import p149l.izf;
import p149l.xyf;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onDestroy", "Ll/fzf;", "P4", "()Ll/fzf;", "Ll/izf;", "O4", "()Ll/izf;", "M4", "Ll/xyf;", "N4", "()Ll/xyf;", "", "disableAutoPV", "()Z", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "hidden", "onHiddenChanged", "(Z)V", BaseSei.f13932Z, "Ll/fzf;", "presenter", "A", "Ll/izf;", "viewModel", "B", "Ll/xyf;", "adapter", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FakeLikersMyTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public izf viewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public xyf adapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public fzf presenter;

    /* JADX INFO: renamed from: M4 */
    public final void m54982M4() {
        this.presenter = new fzf(this);
        izf izfVar = new izf(this);
        this.viewModel = izfVar;
        fzf fzfVar = this.presenter;
        if (fzfVar != null) {
            fzfVar.mo51532C(izfVar);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final xyf m54983N4() {
        xyf xyfVar = this.adapter;
        if (xyfVar != null) {
            return xyfVar;
        }
        xyf xyfVar2 = new xyf(this);
        this.adapter = xyfVar2;
        return xyfVar2;
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final izf m54984O4() {
        if (this.viewModel == null) {
            m54982M4();
        }
        izf izfVar = this.viewModel;
        izfVar.getClass();
        return izfVar;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final fzf m54985P4() {
        if (this.presenter == null) {
            m54982M4();
        }
        fzf fzfVar = this.presenter;
        fzfVar.getClass();
        return fzfVar;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m54985P4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m54985P4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m54984O4().inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m54985P4().destroy();
        m54984O4().destroy();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        m54985P4().m123838m0();
    }
}
