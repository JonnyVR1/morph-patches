package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.os.Bundle;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.bam0;
import p006l.oam0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/bam0;", "Ll/oam0;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "Y1", "()Ll/bam0;", "Z1", "()Ll/oam0;", "", "disableAutoPV", "()Z", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VisitorsAct extends PutongMvpAct<bam0, oam0> {
    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public bam0 mo571V1() {
        return new bam0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public oam0 mo572X1() {
        return new oam0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(@Nullable Bundle sis) {
        ((bam0) this.f1161c).m12594n0(((Act) this).act.getIntent().getBooleanExtra("hasPermission", true));
        super.preCreateView(sis);
    }
}
