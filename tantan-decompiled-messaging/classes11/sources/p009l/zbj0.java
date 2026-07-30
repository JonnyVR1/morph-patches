package p009l;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.Serializable;
import kotlin.Metadata;
import l.e30;
import l.jq2;
import l.l3f;
import l.mcr;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ll/zbj0;", "Ll/jq2;", "Ll/ccj0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "a0", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zbj0 extends jq2<ccj0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbj0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m25631e0(zbj0 zbj0Var, Bundle bundle) {
        Intent intent;
        Act act = zbj0Var.act();
        Serializable serializableExtra = (act == null || (intent = act.getIntent()) == null) ? null : intent.getSerializableExtra("key_migrate_data");
        TtcMigrateDisplayData ttcMigrateDisplayData = serializableExtra instanceof TtcMigrateDisplayData ? (TtcMigrateDisplayData) serializableExtra : null;
        if (ttcMigrateDisplayData != null) {
            ((ccj0) ((jq2) zbj0Var).viewModel).m12495s(ttcMigrateDisplayData);
        }
        l3f l3fVar = new l3f();
        l3fVar.n = "p_clone_choose_account";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: a0 */
    public void m25632a0() {
        super.a0();
        creates(new e30() { // from class: l.ybj0
            public final void call(Object obj) {
                zbj0.m25631e0(this.f22983a, (Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
