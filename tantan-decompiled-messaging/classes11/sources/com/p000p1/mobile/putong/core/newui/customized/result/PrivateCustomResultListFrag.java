package com.p000p1.mobile.putong.core.newui.customized.result;

import com.p000p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
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
import l.xma;
import org.jetbrains.annotations.NotNull;
import p009l.t3m;
import p009l.xr80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\r¨\u0006$"}, d2 = {"Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/xr80;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Ll/t3m;", "<init>", "()V", "V4", "()Ll/xr80;", "W4", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Lcom/p1/mobile/putong/core/newui/customized/result/a;", "U4", "()Lcom/p1/mobile/putong/core/newui/customized/result/a;", "", "f4", "", "disableAutoPV", "()Z", "", "pageId", "()Ljava/lang/String;", "S4", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "B", "Z", "isHidden", "C", "needHasPrivilegeAutoEnterCustomized", "D", "Lkotlin/Lazy;", "T4", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateCustomResultListFrag extends PutongMvpFrag<xr80, PrivateCustomResultListViewModel> implements t3m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean isHidden;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean needHasPrivilegeAutoEnterCustomized;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.cr80
        public final Object invoke() {
            return PrivateCustomResultListFrag.m108O4(this.f10733a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static C0003a m108O4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        jq2 jq2Var = ((PutongMvpFrag) privateCustomResultListFrag).z;
        jq2Var.getClass();
        return new C0003a((xr80) jq2Var);
    }

    /* JADX INFO: renamed from: P4 */
    public static void m109P4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        Act act = privateCustomResultListFrag.act();
        SupremeCustomAct.Companion companion = SupremeCustomAct.INSTANCE;
        Act act2 = privateCustomResultListFrag.act();
        act2.getClass();
        act.startActivity(companion.m7852b(act2, 2));
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m110Q4(PrivateCustomResultListFrag privateCustomResultListFrag, boolean z) {
        if (z) {
            privateCustomResultListFrag.J4().l();
        } else {
            privateCustomResultListFrag.J4().k();
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static void m111R4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        Act act = privateCustomResultListFrag.act();
        if (act != null) {
            act.startActivity(SupremeCustomAct.INSTANCE.m7852b(act, 2));
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m114S4() {
        if (this.isHidden) {
            this.needHasPrivilegeAutoEnterCustomized = true;
            return;
        }
        this.needHasPrivilegeAutoEnterCustomized = false;
        CoreModule.c.y2.Z3();
        e51.G(new Runnable() { // from class: l.dr80
            @Override // java.lang.Runnable
            public final void run() {
                PrivateCustomResultListFrag.m109P4(this.f11969a);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final C0003a m115T4() {
        return (C0003a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final C0003a m116U4() {
        return m115T4();
    }

    @NotNull
    /* JADX INFO: renamed from: V4, reason: merged with bridge method [inline-methods] */
    public xr80 m112M4() {
        return new xr80(this);
    }

    @NotNull
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public PrivateCustomResultListViewModel m113N4() {
        return new PrivateCustomResultListViewModel(this);
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: f4 */
    public void m119f4() {
        super.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.br80
            public final void call(Object obj) {
                PrivateCustomResultListFrag.m110Q4(this.f10242a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @NotNull
    public String pageId() {
        return "p_personalized_page";
    }

    @Override // p009l.t3m
    /* JADX INFO: renamed from: z3 */
    public void mo120z3(boolean hidden, @NotNull String from) {
        from.getClass();
        this.isHidden = hidden;
        if (!hidden) {
            if (CoreModule.c.y2.R3()) {
                CoreModule.c.y2.Y3();
                if (xma.I3()) {
                    this.needHasPrivilegeAutoEnterCustomized = false;
                    CoreModule.c.y2.Z3();
                }
                e51.G(new Runnable() { // from class: l.ar80
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivateCustomResultListFrag.m111R4(this.f9625a);
                    }
                });
            } else if (this.needHasPrivilegeAutoEnterCustomized) {
                m114S4();
            }
        }
        if (!hidden && NullChecker.a(((PutongMvpFrag) this).z) && NullChecker.a(((PutongMvpFrag) this).A) && ((PrivateCustomResultListViewModel) ((PutongMvpFrag) this).A).m136B()) {
            ((xr80) ((PutongMvpFrag) this).z).m24984A0();
        }
    }
}
