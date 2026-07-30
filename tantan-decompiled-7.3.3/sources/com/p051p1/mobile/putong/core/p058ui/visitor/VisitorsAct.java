package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.fjm0;
import p153l.sjm0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/fjm0;", "Ll/sjm0;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "Z1", "()Ll/fjm0;", "a2", "()Ll/sjm0;", "", "disableAutoPV", "()Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VisitorsAct extends PutongMvpAct<fjm0, sjm0> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public fjm0 mo29671X1() {
        return new fjm0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public sjm0 mo29672Y1() {
        return new sjm0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        ((fjm0) this.f17891c).m125832n0(this.act.getIntent().getBooleanExtra("hasPermission", true));
        super.preCreateView(sis);
    }
}
