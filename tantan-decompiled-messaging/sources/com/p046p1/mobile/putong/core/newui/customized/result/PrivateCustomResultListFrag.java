package com.p046p1.mobile.putong.core.newui.customized.result;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.b2s;
import p149l.e30;
import p149l.e51;
import p149l.mkd0;
import p149l.t3m;
import p149l.xma;
import p149l.xr80;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\r¨\u0006$"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/xr80;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Ll/t3m;", "<init>", "()V", "V4", "()Ll/xr80;", "W4", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Lcom/p1/mobile/putong/core/newui/customized/result/a;", "U4", "()Lcom/p1/mobile/putong/core/newui/customized/result/a;", "", "f4", "", "disableAutoPV", "()Z", "", "pageId", "()Ljava/lang/String;", "S4", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "B", "Z", "isHidden", b2s.C_ZONE, "needHasPrivilegeAutoEnterCustomized", "D", "Lkotlin/Lazy;", "T4", "adapter", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivateCustomResultListFrag extends PutongMvpFrag<xr80, PrivateCustomResultListViewModel> implements t3m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean isHidden;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean needHasPrivilegeAutoEnterCustomized;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.cr80
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PrivateCustomResultListFrag.m36203O4(this.f82190a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static C7839a m36203O4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        p p = privateCustomResultListFrag.f17175z;
        p.getClass();
        return new C7839a((xr80) p);
    }

    /* JADX INFO: renamed from: P4 */
    public static void m36204P4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        Act act = privateCustomResultListFrag.act();
        SupremeCustomAct.Companion companion = SupremeCustomAct.INSTANCE;
        Act act2 = privateCustomResultListFrag.act();
        act2.getClass();
        act.startActivity(companion.m43602b(act2, 2));
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m36205Q4(PrivateCustomResultListFrag privateCustomResultListFrag, boolean z) {
        if (z) {
            privateCustomResultListFrag.mo29638J4().m109036l();
        } else {
            privateCustomResultListFrag.mo29638J4().m109035k();
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static void m36206R4(PrivateCustomResultListFrag privateCustomResultListFrag) {
        Act act = privateCustomResultListFrag.act();
        if (act != null) {
            act.startActivity(SupremeCustomAct.INSTANCE.m43602b(act, 2));
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m36207S4() {
        if (this.isHidden) {
            this.needHasPrivilegeAutoEnterCustomized = true;
            return;
        }
        this.needHasPrivilegeAutoEnterCustomized = false;
        CoreModule.f17545c.f19701y2.m155351Z3();
        e51.m114742G(new Runnable() { // from class: l.dr80
            @Override // java.lang.Runnable
            public final void run() {
                PrivateCustomResultListFrag.m36204P4(this.f87592a);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final C7839a m36208T4() {
        return (C7839a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final C7839a m36209U4() {
        return m36208T4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: V4, reason: merged with bridge method [inline-methods] */
    public xr80 mo29641M4() {
        return new xr80(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public PrivateCustomResultListViewModel mo29642N4() {
        return new PrivateCustomResultListViewModel(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.br80
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivateCustomResultListFrag.m36205Q4(this.f76882a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_personalized_page";
    }

    @Override // p149l.t3m
    /* JADX INFO: renamed from: z3 */
    public void mo36212z3(boolean hidden, @NotNull String from) {
        from.getClass();
        this.isHidden = hidden;
        if (!hidden) {
            if (CoreModule.f17545c.f19701y2.m155343R3()) {
                CoreModule.f17545c.f19701y2.m155350Y3();
                if (xma.m210046I3()) {
                    this.needHasPrivilegeAutoEnterCustomized = false;
                    CoreModule.f17545c.f19701y2.m155351Z3();
                }
                e51.m114742G(new Runnable() { // from class: l.ar80
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivateCustomResultListFrag.m36206R4(this.f71238a);
                    }
                });
            } else if (this.needHasPrivilegeAutoEnterCustomized) {
                m36207S4();
            }
        }
        if (!hidden && NullChecker.m81303a(this.f17175z) && NullChecker.m81303a(this.f17174A) && ((PrivateCustomResultListViewModel) this.f17174A).m36228B()) {
            ((xr80) this.f17175z).m210663A0();
        }
    }
}
