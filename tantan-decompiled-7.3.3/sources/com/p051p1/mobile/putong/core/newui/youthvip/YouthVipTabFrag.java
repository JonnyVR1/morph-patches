package com.p051p1.mobile.putong.core.newui.youthvip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.psd0;
import p153l.xoq0;
import p153l.y20;
import p153l.zoq0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "", "pageId", "()Ljava/lang/String;", "Ll/xoq0;", BaseSei.f14626Z, "Lkotlin/Lazy;", "P4", "()Ll/xoq0;", "presenter", "Ll/zoq0;", "A", "Q4", "()Ll/zoq0;", "viewModel", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class YouthVipTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter;

    public YouthVipTabFrag() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.presenter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.uoq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YouthVipTabFrag.m45030M4(this.f180118a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.voq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YouthVipTabFrag.m45031N4(this.f185156a);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static xoq0 m45030M4(YouthVipTabFrag youthVipTabFrag) {
        return new xoq0(youthVipTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static zoq0 m45031N4(YouthVipTabFrag youthVipTabFrag) {
        return new zoq0(youthVipTabFrag);
    }

    /* JADX INFO: renamed from: O4 */
    public static void m45032O4(YouthVipTabFrag youthVipTabFrag, boolean z) {
        if (z) {
            youthVipTabFrag.mo30636J4().m152777l();
        } else {
            youthVipTabFrag.mo30636J4().m152776k();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final xoq0 m45033P4() {
        return (xoq0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final zoq0 m45034Q4() {
        return (zoq0) this.viewModel.getValue();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m45033P4().mo52715C(m45034Q4());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m45033P4().mo40473a0();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.woq0
            @Override // p153l.y20
            public final void call(Object obj) {
                YouthVipTabFrag.m45032O4(this.f190065a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        m45034Q4().m220795r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m45034Q4().inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_youthvip_page";
    }
}
