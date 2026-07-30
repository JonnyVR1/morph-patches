package com.p000p1.mobile.putong.core.newui.youthvip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import com.p1.mobile.putong.app.PutongFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.e30;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.sfq0;
import p009l.ufq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "", "pageId", "()Ljava/lang/String;", "Ll/sfq0;", "z", "Lkotlin/Lazy;", "P4", "()Ll/sfq0;", "presenter", "Ll/ufq0;", "A", "Q4", "()Ll/ufq0;", "viewModel", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class YouthVipTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter;

    public YouthVipTabFrag() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.presenter = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.pfq0
            public final Object invoke() {
                return YouthVipTabFrag.m8110M4(this.f18527a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.qfq0
            public final Object invoke() {
                return YouthVipTabFrag.m8111N4(this.f19227a);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static sfq0 m8110M4(YouthVipTabFrag youthVipTabFrag) {
        return new sfq0(youthVipTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static ufq0 m8111N4(YouthVipTabFrag youthVipTabFrag) {
        return new ufq0(youthVipTabFrag);
    }

    /* JADX INFO: renamed from: O4 */
    public static void m8112O4(YouthVipTabFrag youthVipTabFrag, boolean z) {
        if (z) {
            youthVipTabFrag.J4().l();
        } else {
            youthVipTabFrag.J4().k();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final sfq0 m8113P4() {
        return (sfq0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final ufq0 m8114Q4() {
        return (ufq0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: d4 */
    public void m8115d4() {
        super.d4();
        m8113P4().C(m8114Q4());
    }

    /* JADX INFO: renamed from: f4 */
    public void m8116f4() {
        super.f4();
        m8113P4().m22162a0();
        L4().subscribe(mkd0.G(new e30() { // from class: l.rfq0
            public final void call(Object obj) {
                YouthVipTabFrag.m8112O4(this.f19819a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m8117g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
        m8114Q4().m22876r();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m8114Q4().inflateView(inflater, container);
    }

    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @NotNull
    public String pageId() {
        return "p_youthvip_page";
    }
}
