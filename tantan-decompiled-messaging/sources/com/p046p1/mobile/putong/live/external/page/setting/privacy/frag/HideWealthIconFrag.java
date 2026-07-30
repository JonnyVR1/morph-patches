package com.p046p1.mobile.putong.live.external.page.setting.privacy.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2l;
import p149l.y1l;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/page/setting/privacy/frag/HideWealthIconFrag;", "Lcom/p1/mobile/putong/live/external/module/arch/LiveBaseFrag;", "<init>", "()V", "", "M4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "Ll/b2l;", BaseSei.f13932Z, "Ll/b2l;", "fragPresenter", "Ll/y1l;", "A", "Ll/y1l;", "fragViewModel", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class HideWealthIconFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public y1l fragViewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public b2l fragPresenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.privacy.frag.HideWealthIconFrag$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/page/setting/privacy/frag/HideWealthIconFrag$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/external/page/setting/privacy/frag/HideWealthIconFrag;", "a", "()Lcom/p1/mobile/putong/live/external/page/setting/privacy/frag/HideWealthIconFrag;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final HideWealthIconFrag m70785a() {
            return new HideWealthIconFrag();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: M4 */
    private final void m70783M4() {
        this.fragViewModel = new y1l();
        b2l b2lVar = new b2l(this);
        y1l y1lVar = this.fragViewModel;
        if (y1lVar == null) {
            Intrinsics.m87502r("fragViewModel");
            y1lVar = null;
        }
        b2lVar.mo51532C(y1lVar);
        this.fragPresenter = b2lVar;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: N4 */
    public static final HideWealthIconFrag m70784N4() {
        return INSTANCE.m70785a();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m70783M4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        y1l y1lVar = this.fragViewModel;
        if (y1lVar == null) {
            Intrinsics.m87502r("fragViewModel");
            y1lVar = null;
        }
        y1lVar.m212233r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        y1l y1lVar = this.fragViewModel;
        if (y1lVar == null) {
            Intrinsics.m87502r("fragViewModel");
            y1lVar = null;
        }
        return y1lVar.inflateView(inflater, container);
    }
}
