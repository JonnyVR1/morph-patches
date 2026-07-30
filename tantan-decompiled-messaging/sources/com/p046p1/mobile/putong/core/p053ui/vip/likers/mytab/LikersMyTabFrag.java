package com.p046p1.mobile.putong.core.p053ui.vip.likers.mytab;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0605k;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.ljr;
import p149l.mjr;
import p149l.otl;
import p149l.yir;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0005J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J)\u00103\u001a\u00020\u00062\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020 H\u0016¢\u0006\u0004\b6\u0010%R\u0018\u00109\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "Lcom/p1/mobile/putong/core/ui/vip/likers/b$a;", "Ll/otl;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "onDestroy", "Ll/ljr;", "Q4", "()Ll/ljr;", "Ll/mjr;", "P4", "()Ll/mjr;", "M4", "Landroidx/recyclerview/widget/k$e;", "O4", "()Landroidx/recyclerview/widget/k$e;", "Ll/yir;", "N4", "()Ll/yir;", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "", "liked", "b", "(Lcom/p1/mobile/putong/data/User;Z)V", "c", "(Z)V", "n", "()Z", "notifyDataSetChanged", "", "O2", "()I", Item.TYPE, "A1", "(Lcom/p1/mobile/putong/data/User;Z)Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "hidden", "onHiddenChanged", BaseSei.f13932Z, "Ll/ljr;", "presenter", "A", "Ll/mjr;", "viewModel", "Lcom/p1/mobile/putong/core/ui/vip/likers/b;", "B", "Lcom/p1/mobile/putong/core/ui/vip/likers/b;", "touchHelperCallback", b2s.C_ZONE, "Ll/yir;", "likersAdapter", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LikersMyTabFrag extends PutongFrag implements C8964b.a, otl {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public mjr viewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public C8964b touchHelperCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public yir likersAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public ljr presenter;

    @Override // p149l.otl
    /* JADX INFO: renamed from: A1 */
    public boolean mo56574A1(@NotNull User item, boolean liked) {
        item.getClass();
        return m56718N4().m215016A1(item, liked);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m56717M4() {
        this.presenter = new ljr(this);
        mjr mjrVar = new mjr(this);
        this.viewModel = mjrVar;
        ljr ljrVar = this.presenter;
        if (ljrVar != null) {
            ljrVar.mo51532C(mjrVar);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final yir m56718N4() {
        if (this.likersAdapter == null) {
            this.likersAdapter = new yir(this);
        }
        yir yirVar = this.likersAdapter;
        if (yirVar != null) {
            return yirVar;
        }
        yir yirVar2 = new yir(this);
        this.likersAdapter = yirVar2;
        return yirVar2;
    }

    @Override // p149l.otl
    /* JADX INFO: renamed from: O2 */
    public int mo56577O2() {
        return m56718N4().getPageCount();
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final C0605k.e m56719O4() {
        C8964b c8964b = this.touchHelperCallback;
        if (c8964b != null) {
            return c8964b;
        }
        C8964b c8964b2 = new C8964b(this);
        this.touchHelperCallback = c8964b2;
        return c8964b2;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final mjr m56720P4() {
        if (this.viewModel == null) {
            m56717M4();
        }
        mjr mjrVar = this.viewModel;
        mjrVar.getClass();
        return mjrVar;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final ljr m56721Q4() {
        if (this.presenter == null) {
            m56717M4();
        }
        ljr ljrVar = this.presenter;
        ljrVar.getClass();
        return ljrVar;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b.a
    /* JADX INFO: renamed from: b */
    public void mo56587b(@NotNull User clickedUser, boolean liked) {
        clickedUser.getClass();
        m56721Q4().m150029E(clickedUser, liked, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b.a
    /* JADX INFO: renamed from: c */
    public void mo56588c(boolean liked) {
        notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m56721Q4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m56721Q4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m56720P4().inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b.a
    /* JADX INFO: renamed from: n */
    public boolean mo56589n() {
        return false;
    }

    @Override // p149l.otl
    public void notifyDataSetChanged() {
        m56718N4().notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (m56721Q4().m150034x0(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m56721Q4().destroy();
        m56720P4().destroy();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        m56721Q4().m150032t0();
    }
}
