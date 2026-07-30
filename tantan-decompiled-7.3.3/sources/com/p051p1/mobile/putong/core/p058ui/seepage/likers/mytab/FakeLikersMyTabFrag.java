package com.p051p1.mobile.putong.core.p058ui.seepage.likers.mytab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.app.PutongFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.l0g;
import p153l.t0g;
import p153l.w0g;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onDestroy", "Ll/t0g;", "P4", "()Ll/t0g;", "Ll/w0g;", "O4", "()Ll/w0g;", "M4", "Ll/l0g;", "N4", "()Ll/l0g;", "", "disableAutoPV", "()Z", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "hidden", "onHiddenChanged", "(Z)V", BaseSei.f14626Z, "Ll/t0g;", "presenter", "A", "Ll/w0g;", "viewModel", "B", "Ll/l0g;", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FakeLikersMyTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public w0g viewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public l0g adapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public t0g presenter;

    /* JADX INFO: renamed from: M4 */
    public final void m56165M4() {
        this.presenter = new t0g(this);
        w0g w0gVar = new w0g(this);
        this.viewModel = w0gVar;
        t0g t0gVar = this.presenter;
        if (t0gVar != null) {
            t0gVar.mo52715C(w0gVar);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final l0g m56166N4() {
        l0g l0gVar = this.adapter;
        if (l0gVar != null) {
            return l0gVar;
        }
        l0g l0gVar2 = new l0g(this);
        this.adapter = l0gVar2;
        return l0gVar2;
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final w0g m56167O4() {
        if (this.viewModel == null) {
            m56165M4();
        }
        w0g w0gVar = this.viewModel;
        w0gVar.getClass();
        return w0gVar;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final t0g m56168P4() {
        if (this.presenter == null) {
            m56165M4();
        }
        t0g t0gVar = this.presenter;
        t0gVar.getClass();
        return t0gVar;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m56168P4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m56168P4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m56167O4().inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m56168P4().destroy();
        m56167O4().destroy();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        m56168P4().m188734m0();
    }
}
