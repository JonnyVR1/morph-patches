package com.p046p1.mobile.putong.core.newui.supreme;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeListFrag;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.e30;
import p149l.e51;
import p149l.mkd0;
import p149l.t3m;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Ll/t3m;", "<init>", "()V", "", "onResume", "T4", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "U4", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Lcom/p1/mobile/putong/core/newui/supreme/a;", "S4", "()Lcom/p1/mobile/putong/core/newui/supreme/a;", "f4", "", "disableAutoPV", "()Z", "", "pageId", "()Ljava/lang/String;", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "B", "Lkotlin/Lazy;", "R4", "adapter", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SupremeListFrag extends PutongMvpFrag<SupremeListPresenter, SupremeListViewModel> implements t3m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.i0h0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SupremeListFrag.m43609P4(this.f110344a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static void m43608O4(SupremeListFrag supremeListFrag, boolean z) {
        if (!z) {
            supremeListFrag.mo29638J4().m109035k();
            return;
        }
        if (((SupremeListViewModel) supremeListFrag.f17174A).m43645A()) {
            zvf0.m220402x("e_supremepartner_apply", supremeListFrag.pageId());
        }
        supremeListFrag.mo29638J4().m109036l();
    }

    /* JADX INFO: renamed from: P4 */
    public static C8242a m43609P4(SupremeListFrag supremeListFrag) {
        p p = supremeListFrag.f17175z;
        p.getClass();
        return new C8242a((SupremeListPresenter) p);
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m43610Q4(SupremeListFrag supremeListFrag) {
        Act act = supremeListFrag.act();
        SupremeCustomAct.Companion companion = SupremeCustomAct.INSTANCE;
        Act act2 = supremeListFrag.act();
        act2.getClass();
        act.startActivity(SupremeCustomAct.Companion.m43600c(companion, act2, 0, 2, null));
    }

    /* JADX INFO: renamed from: R4 */
    public final C8242a m43611R4() {
        return (C8242a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final C8242a m43612S4() {
        return m43611R4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public SupremeListPresenter mo29641M4() {
        return new SupremeListPresenter(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public SupremeListViewModel mo29642N4() {
        return new SupremeListViewModel(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        ((SupremeListPresenter) this.f17175z).mo39470a0();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.j0h0
            @Override // p149l.e30
            public final void call(Object obj) {
                SupremeListFrag.m43608O4(this.f115675a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CoreModule.f17545c.f19644f2.m148602G3();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_custom_page";
    }

    @Override // p149l.t3m
    /* JADX INFO: renamed from: z3 */
    public void mo36212z3(boolean hidden, @NotNull String from) {
        from.getClass();
        if (!hidden && CoreModule.f17545c.f19644f2.m148604I3()) {
            CoreModule.f17545c.f19644f2.m148610r3();
            e51.m114742G(new Runnable() { // from class: l.h0h0
                @Override // java.lang.Runnable
                public final void run() {
                    SupremeListFrag.m43610Q4(this.f105218a);
                }
            });
        }
        if (!hidden && NullChecker.m81303a(this.f17175z) && NullChecker.m81303a(this.f17174A)) {
            ((SupremeListPresenter) this.f17175z).m43634r0();
        }
    }
}
