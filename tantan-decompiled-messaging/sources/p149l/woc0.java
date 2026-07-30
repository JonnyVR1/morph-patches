package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/woc0;", "Ll/jq2;", "Ll/xoc0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "a0", "", "intlFriendPurpose", "f0", "(Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class woc0 extends jq2<xoc0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woc0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m204801e0(woc0 woc0Var, Bundle bundle) {
        String stringExtra;
        Intent intent;
        xoc0 xoc0Var = (xoc0) woc0Var.viewModel;
        Act act = woc0Var.act();
        if (act == null || (intent = act.getIntent()) == null || (stringExtra = intent.getStringExtra("key_intl_friend_purpose")) == null) {
            stringExtra = "";
        }
        xoc0Var.m210397A3(stringExtra);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.voc0
            @Override // p149l.e30
            public final void call(Object obj) {
                woc0.m204801e0(this.f182380a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m204802f0(@NotNull String intlFriendPurpose) {
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

    @Override // p149l.q0m
    public void destroy() {
    }
}
