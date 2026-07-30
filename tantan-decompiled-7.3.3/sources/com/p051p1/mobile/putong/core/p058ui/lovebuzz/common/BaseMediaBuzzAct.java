package com.p051p1.mobile.putong.core.p058ui.lovebuzz.common;

import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0011"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseMediaBuzzAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "onStartLifecycle", "", OMSTemplateModeType.page, "X1", "(Ljava/lang/String;)V", "onDestroyLifecycle", "", "shouldSwitchToTransparentStatus", "()Z", "isAnonymousMode", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class BaseMediaBuzzAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public void mo48105X1(@NotNull String page) {
        page.getClass();
        if (C15493d.m94380w(page, "_call", false, 2, null)) {
            BuzzMediaCallManager.INSTANCE.m48156k0();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        BuzzMediaCallManager.INSTANCE.m48122C().onNext(Boolean.FALSE);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        BuzzMediaCallManager.INSTANCE.m48122C().onNext(Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
