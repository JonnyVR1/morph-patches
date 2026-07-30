package com.p051p1.mobile.putong.core.newui.onlinezone;

import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.bx50;
import p153l.iq50;
import p153l.k6m;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Ll/bx50;", "Ll/k6m;", "<init>", "()V", "S4", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "T4", "()Ll/bx50;", "Ll/iq50;", "R4", "()Ll/iq50;", "", "onStart", "onStop", "", "requestCode", "", "", Permissions.TYPE, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "f4", "pageId", "()Ljava/lang/String;", "B", "Lkotlin/Lazy;", "Q4", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class OnlineZoneFrag extends PutongMvpFrag<OnlineZonePresenter, bx50> implements k6m {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.vv50
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OnlineZoneFrag.m44059O4(this.f185902a);
        }
    });

    /* JADX INFO: renamed from: O4 */
    public static iq50 m44059O4(OnlineZoneFrag onlineZoneFrag) {
        p p = onlineZoneFrag.f17894z;
        p.getClass();
        return new iq50((OnlineZonePresenter) p);
    }

    /* JADX INFO: renamed from: P4 */
    public static void m44060P4(OnlineZoneFrag onlineZoneFrag, boolean z) {
        if (z) {
            onlineZoneFrag.mo30636J4().m152777l();
        } else {
            onlineZoneFrag.mo30636J4().m152776k();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final iq50 m44061Q4() {
        return (iq50) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: R4 */
    public final iq50 m44062R4() {
        return m44061Q4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public OnlineZonePresenter mo30639M4() {
        return new OnlineZonePresenter(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public bx50 mo30640N4() {
        return new bx50(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.uv50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZoneFrag.m44060P4(this.f181123a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        ((OnlineZonePresenter) this.f17894z).m44111X0(requestCode, permissions, grantResults);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((bx50) this.f17893A).m106842I();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ((bx50) this.f17893A).m106843J();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_suggest_nearby";
    }

    @Override // p153l.k6m
    /* JADX INFO: renamed from: z3 */
    public void mo37215z3(boolean hidden, @NotNull String from) {
        from.getClass();
        if (!hidden && NullChecker.m82486a(this.f17894z) && NullChecker.m82486a(this.f17893A)) {
            ((OnlineZonePresenter) this.f17894z).m44112Y0();
        }
    }
}
