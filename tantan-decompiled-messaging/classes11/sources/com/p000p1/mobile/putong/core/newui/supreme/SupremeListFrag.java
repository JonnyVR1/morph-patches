package com.p000p1.mobile.putong.core.newui.supreme;

import com.p000p1.mobile.putong.core.newui.supreme.SupremeListFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.e30;
import l.e51;
import l.jq2;
import l.mkd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p009l.t3m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Ll/t3m;", "<init>", "()V", "", "onResume", "T4", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "U4", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Lcom/p1/mobile/putong/core/newui/supreme/a;", "S4", "()Lcom/p1/mobile/putong/core/newui/supreme/a;", "f4", "", "disableAutoPV", "()Z", "", "pageId", "()Ljava/lang/String;", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "B", "Lkotlin/Lazy;", "R4", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupremeListFrag extends PutongMvpFrag<SupremeListPresenter, SupremeListViewModel> implements t3m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.i0h0
        public final Object invoke() {
            return SupremeListFrag.m7859P4(this.f14368a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static void m7858O4(SupremeListFrag supremeListFrag, boolean z) {
        if (!z) {
            supremeListFrag.J4().k();
            return;
        }
        if (((SupremeListViewModel) ((PutongMvpFrag) supremeListFrag).A).m7899A()) {
            zvf0.x("e_supremepartner_apply", supremeListFrag.pageId());
        }
        supremeListFrag.J4().l();
    }

    /* JADX INFO: renamed from: P4 */
    public static C0406a m7859P4(SupremeListFrag supremeListFrag) {
        jq2 jq2Var = ((PutongMvpFrag) supremeListFrag).z;
        jq2Var.getClass();
        return new C0406a((SupremeListPresenter) jq2Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m7860Q4(SupremeListFrag supremeListFrag) {
        Act act = supremeListFrag.act();
        SupremeCustomAct.Companion companion = SupremeCustomAct.INSTANCE;
        Act act2 = supremeListFrag.act();
        act2.getClass();
        act.startActivity(SupremeCustomAct.Companion.m7850c(companion, act2, 0, 2, null));
    }

    /* JADX INFO: renamed from: R4 */
    public final C0406a m7863R4() {
        return (C0406a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final C0406a m7864S4() {
        return m7863R4();
    }

    @NotNull
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public SupremeListPresenter m7861M4() {
        return new SupremeListPresenter(this);
    }

    @NotNull
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public SupremeListViewModel m7862N4() {
        return new SupremeListViewModel(this);
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: f4 */
    public void m7867f4() {
        super.f4();
        ((SupremeListPresenter) ((PutongMvpFrag) this).z).m7883a0();
        L4().subscribe(mkd0.G(new e30() { // from class: l.j0h0
            public final void call(Object obj) {
                SupremeListFrag.m7858O4(this.f14883a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        CoreModule.c.f2.G3();
    }

    @NotNull
    public String pageId() {
        return "p_custom_page";
    }

    @Override // p009l.t3m
    /* JADX INFO: renamed from: z3 */
    public void mo120z3(boolean hidden, @NotNull String from) {
        from.getClass();
        if (!hidden && CoreModule.c.f2.I3()) {
            CoreModule.c.f2.r3();
            e51.G(new Runnable() { // from class: l.h0h0
                @Override // java.lang.Runnable
                public final void run() {
                    SupremeListFrag.m7860Q4(this.f13828a);
                }
            });
        }
        if (!hidden && NullChecker.a(((PutongMvpFrag) this).z) && NullChecker.a(((PutongMvpFrag) this).A)) {
            ((SupremeListPresenter) ((PutongMvpFrag) this).z).m7888r0();
        }
    }
}
