package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/dlj0;", "Ll/ar2;", "Ll/glj0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "a0", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dlj0 extends ar2<glj0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlj0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m116767e0(dlj0 dlj0Var, Bundle bundle) {
        Intent intent;
        Act act = dlj0Var.act();
        Serializable serializableExtra = (act == null || (intent = act.getIntent()) == null) ? null : intent.getSerializableExtra("key_migrate_data");
        TtcMigrateDisplayData ttcMigrateDisplayData = serializableExtra instanceof TtcMigrateDisplayData ? (TtcMigrateDisplayData) serializableExtra : null;
        if (ttcMigrateDisplayData != null) {
            ((glj0) dlj0Var.viewModel).m130676s(ttcMigrateDisplayData);
        }
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_clone_choose_account";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138515m(q4fVar);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.clj0
            @Override // p153l.y20
            public final void call(Object obj) {
                dlj0.m116767e0(this.f82385a, (Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
