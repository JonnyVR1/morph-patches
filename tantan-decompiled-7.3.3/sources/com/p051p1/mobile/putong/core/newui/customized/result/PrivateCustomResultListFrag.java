package com.p051p1.mobile.putong.core.newui.customized.result;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.b090;
import p153l.c4s;
import p153l.joa;
import p153l.k6m;
import p153l.l51;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\r¨\u0006$"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/b090;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Ll/k6m;", "<init>", "()V", "V4", "()Ll/b090;", "W4", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Lcom/p1/mobile/putong/core/newui/customized/result/a;", "U4", "()Lcom/p1/mobile/putong/core/newui/customized/result/a;", "", "f4", "", "disableAutoPV", "()Z", "", "pageId", "()Ljava/lang/String;", "S4", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "B", "Z", "isHidden", c4s.C_ZONE, "needHasPrivilegeAutoEnterCustomized", "D", "Lkotlin/Lazy;", "T4", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivateCustomResultListFrag extends PutongMvpFrag<b090, PrivateCustomResultListViewModel> implements k6m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean isHidden;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean needHasPrivilegeAutoEnterCustomized;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.gz80
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PrivateCustomResultListFrag.m37206O4(this.f107179a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static C7990a m37206O4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        p p = privateCustomResultListFrag.f17894z;
        p.getClass();
        return new C7990a((b090) p);
    }

    /* JADX INFO: renamed from: P4 */
    public static void m37207P4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        Act act = privateCustomResultListFrag.act();
        SupremeCustomAct.Companion companion = SupremeCustomAct.INSTANCE;
        Act act2 = privateCustomResultListFrag.act();
        act2.getClass();
        act.startActivity(companion.m44788b(act2, 2));
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m37208Q4(PrivateCustomResultListFrag privateCustomResultListFrag, boolean z) {
        if (z) {
            privateCustomResultListFrag.mo30636J4().m152777l();
        } else {
            privateCustomResultListFrag.mo30636J4().m152776k();
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static void m37209R4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        Act act = privateCustomResultListFrag.act();
        if (act != null) {
            act.startActivity(SupremeCustomAct.INSTANCE.m44788b(act, 2));
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m37210S4() {
        if (this.isHidden) {
            this.needHasPrivilegeAutoEnterCustomized = true;
            return;
        }
        this.needHasPrivilegeAutoEnterCustomized = false;
        CoreModule.f18264c.f20443y2.m216820Z3();
        l51.m152887G(new Runnable() { // from class: l.hz80
            @Override // java.lang.Runnable
            public final void run() {
                PrivateCustomResultListFrag.m37207P4(this.f112218a);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final C7990a m37211T4() {
        return (C7990a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final C7990a m37212U4() {
        return m37211T4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: V4, reason: merged with bridge method [inline-methods] */
    public b090 mo30639M4() {
        return new b090(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public PrivateCustomResultListViewModel mo30640N4() {
        return new PrivateCustomResultListViewModel(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.fz80
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivateCustomResultListFrag.m37208Q4(this.f101453a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_personalized_page";
    }

    @Override // p153l.k6m
    /* JADX INFO: renamed from: z3 */
    public void mo37215z3(boolean hidden, @NotNull String from) {
        from.getClass();
        this.isHidden = hidden;
        if (!hidden) {
            if (CoreModule.f18264c.f20443y2.m216812R3()) {
                CoreModule.f18264c.f20443y2.m216819Y3();
                if (joa.m146360J3()) {
                    this.needHasPrivilegeAutoEnterCustomized = false;
                    CoreModule.f18264c.f20443y2.m216820Z3();
                }
                l51.m152887G(new Runnable() { // from class: l.ez80
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivateCustomResultListFrag.m37209R4(this.f96570a);
                    }
                });
            } else if (this.needHasPrivilegeAutoEnterCustomized) {
                m37210S4();
            }
        }
        if (!hidden && NullChecker.m82486a(this.f17894z) && NullChecker.m82486a(this.f17893A) && ((PrivateCustomResultListViewModel) this.f17893A).m37231B()) {
            ((b090) this.f17894z).m101281A0();
        }
    }
}
