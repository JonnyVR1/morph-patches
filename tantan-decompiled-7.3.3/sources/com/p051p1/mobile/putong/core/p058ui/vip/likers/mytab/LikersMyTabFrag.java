package com.p051p1.mobile.putong.core.p058ui.vip.likers.mytab;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0607k;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.cwl;
import p153l.mlr;
import p153l.nlr;
import p153l.zkr;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0005J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J)\u00103\u001a\u00020\u00062\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020 H\u0016¢\u0006\u0004\b6\u0010%R\u0018\u00109\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "Lcom/p1/mobile/putong/core/ui/vip/likers/b$a;", "Ll/cwl;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onDestroy", "Ll/mlr;", "Q4", "()Ll/mlr;", "Ll/nlr;", "P4", "()Ll/nlr;", "M4", "Landroidx/recyclerview/widget/k$e;", "O4", "()Landroidx/recyclerview/widget/k$e;", "Ll/zkr;", "N4", "()Ll/zkr;", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "", "liked", "b", "(Lcom/p1/mobile/putong/data/User;Z)V", "c", "(Z)V", "n", "()Z", "notifyDataSetChanged", "", "O2", "()I", Item.TYPE, "A1", "(Lcom/p1/mobile/putong/data/User;Z)Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "hidden", "onHiddenChanged", BaseSei.f14626Z, "Ll/mlr;", "presenter", "A", "Ll/nlr;", "viewModel", "Lcom/p1/mobile/putong/core/ui/vip/likers/b;", "B", "Lcom/p1/mobile/putong/core/ui/vip/likers/b;", "touchHelperCallback", c4s.C_ZONE, "Ll/zkr;", "likersAdapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LikersMyTabFrag extends PutongFrag implements C9127b.a, cwl {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public nlr viewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public C9127b touchHelperCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public zkr likersAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public mlr presenter;

    @Override // p153l.cwl
    /* JADX INFO: renamed from: A1 */
    public boolean mo57757A1(@NotNull User item, boolean liked) {
        item.getClass();
        return m57901N4().m220137A1(item, liked);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m57900M4() {
        this.presenter = new mlr(this);
        nlr nlrVar = new nlr(this);
        this.viewModel = nlrVar;
        mlr mlrVar = this.presenter;
        if (mlrVar != null) {
            mlrVar.mo52715C(nlrVar);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final zkr m57901N4() {
        if (this.likersAdapter == null) {
            this.likersAdapter = new zkr(this);
        }
        zkr zkrVar = this.likersAdapter;
        if (zkrVar != null) {
            return zkrVar;
        }
        zkr zkrVar2 = new zkr(this);
        this.likersAdapter = zkrVar2;
        return zkrVar2;
    }

    @Override // p153l.cwl
    /* JADX INFO: renamed from: O2 */
    public int mo57760O2() {
        return m57901N4().getPageCount();
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final C0607k.e m57902O4() {
        C9127b c9127b = this.touchHelperCallback;
        if (c9127b != null) {
            return c9127b;
        }
        C9127b c9127b2 = new C9127b(this);
        this.touchHelperCallback = c9127b2;
        return c9127b2;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final nlr m57903P4() {
        if (this.viewModel == null) {
            m57900M4();
        }
        nlr nlrVar = this.viewModel;
        nlrVar.getClass();
        return nlrVar;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final mlr m57904Q4() {
        if (this.presenter == null) {
            m57900M4();
        }
        mlr mlrVar = this.presenter;
        mlrVar.getClass();
        return mlrVar;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b.a
    /* JADX INFO: renamed from: b */
    public void mo57770b(@NotNull User clickedUser, boolean liked) {
        clickedUser.getClass();
        m57904Q4().m158939E(clickedUser, liked, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b.a
    /* JADX INFO: renamed from: c */
    public void mo57771c(boolean liked) {
        notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m57904Q4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m57904Q4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m57903P4().inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b.a
    /* JADX INFO: renamed from: n */
    public boolean mo57772n() {
        return false;
    }

    @Override // p153l.cwl
    public void notifyDataSetChanged() {
        m57901N4().notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (m57904Q4().m158944x0(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m57904Q4().destroy();
        m57903P4().destroy();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        m57904Q4().m158942t0();
    }
}
