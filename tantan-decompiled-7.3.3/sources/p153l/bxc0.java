package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/bxc0;", "Ll/ar2;", "Ll/cxc0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "a0", "", "intlFriendPurpose", "f0", "(Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bxc0 extends ar2<cxc0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxc0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m106872e0(bxc0 bxc0Var, Bundle bundle) {
        String stringExtra;
        Intent intent;
        cxc0 cxc0Var = (cxc0) bxc0Var.viewModel;
        Act act = bxc0Var.act();
        if (act == null || (intent = act.getIntent()) == null || (stringExtra = intent.getStringExtra("key_intl_friend_purpose")) == null) {
            stringExtra = "";
        }
        cxc0Var.m112965A3(stringExtra);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.axc0
            @Override // p153l.y20
            public final void call(Object obj) {
                bxc0.m106872e0(this.f73839a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m106873f0(@NotNull String intlFriendPurpose) {
        intlFriendPurpose.getClass();
        Intent intent = new Intent();
        intent.putExtra("key_intl_friend_purpose", intlFriendPurpose);
        Act act = act();
        if (act != null) {
            act.setResult(-1, intent);
        }
        Act act2 = act();
        if (act2 != null) {
            act2.lambda$debugItems$19();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
