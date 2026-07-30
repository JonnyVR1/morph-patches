package com.p000p1.mobile.putong.core.newui.onlinezone;

import com.p000p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.e30;
import l.jq2;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import p009l.ci50;
import p009l.t3m;
import p009l.vo50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Ll/vo50;", "Ll/t3m;", "<init>", "()V", "S4", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "T4", "()Ll/vo50;", "Ll/ci50;", "R4", "()Ll/ci50;", "", "onStart", "onStop", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "f4", "pageId", "()Ljava/lang/String;", "B", "Lkotlin/Lazy;", "Q4", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnlineZoneFrag extends PutongMvpFrag<OnlineZonePresenter, vo50> implements t3m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.pn50
        public final Object invoke() {
            return OnlineZoneFrag.m7250O4(this.f18792a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static ci50 m7250O4(OnlineZoneFrag onlineZoneFrag) {
        jq2 jq2Var = ((PutongMvpFrag) onlineZoneFrag).z;
        jq2Var.getClass();
        return new ci50((OnlineZonePresenter) jq2Var);
    }

    /* JADX INFO: renamed from: P4 */
    public static void m7251P4(OnlineZoneFrag onlineZoneFrag, boolean z) {
        if (z) {
            onlineZoneFrag.J4().l();
        } else {
            onlineZoneFrag.J4().k();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final ci50 m7254Q4() {
        return (ci50) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: R4 */
    public final ci50 m7255R4() {
        return m7254Q4();
    }

    @NotNull
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public OnlineZonePresenter m7252M4() {
        return new OnlineZonePresenter(this);
    }

    @NotNull
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public vo50 m7253N4() {
        return new vo50(this);
    }

    /* JADX INFO: renamed from: f4 */
    public void m7258f4() {
        super.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.on50
            public final void call(Object obj) {
                OnlineZoneFrag.m7251P4(this.f18180a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        ((OnlineZonePresenter) ((PutongMvpFrag) this).z).m7305X0(requestCode, permissions, grantResults);
    }

    public void onStart() {
        super/*com.p1.mobile.android.app.Frag*/.onStart();
        ((vo50) ((PutongMvpFrag) this).A).m23464I();
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
        ((vo50) ((PutongMvpFrag) this).A).m23465J();
    }

    @NotNull
    public String pageId() {
        return "p_suggest_nearby";
    }

    @Override // p009l.t3m
    /* JADX INFO: renamed from: z3 */
    public void mo120z3(boolean hidden, @NotNull String from) {
        from.getClass();
        if (!hidden && NullChecker.a(((PutongMvpFrag) this).z) && NullChecker.a(((PutongMvpFrag) this).A)) {
            ((OnlineZonePresenter) ((PutongMvpFrag) this).z).m7306Y0();
        }
    }
}
