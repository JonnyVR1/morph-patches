package p149l;

import com.p046p1.mobile.putong.core.data.LikeMindedConfigData;
import com.p046p1.mobile.putong.core.data.LikeMindedItemData;
import com.p046p1.mobile.putong.core.data.LikeMindedMccConfigData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/tdr;", "Ll/jq2;", "Ll/ber;", "Ll/mcr;", "lifecycleProvider", "", "isDebug", "<init>", "(Ll/mcr;Z)V", "", "destroy", "()V", "f0", "e0", "a", "Z", "()Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class tdr extends jq2<ber> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isDebug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdr(@NotNull mcr mcrVar, boolean z) {
        super(mcrVar);
        mcrVar.getClass();
        this.isDebug = z;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m188451e0() {
        LikeMindedMccConfigData likeMindedMccConfigData;
        LikeMindedConfigData likeMindedConfigDataM135618c = this.isDebug ? idr.INSTANCE.m135618c() : idr.INSTANCE.m135621f();
        if (likeMindedConfigDataM135618c != null) {
            if (!likeMindedConfigDataM135618c.mcc.containsKey(String.valueOf(qib0.f154717f0)) || (likeMindedMccConfigData = likeMindedConfigDataM135618c.mcc.get(String.valueOf(qib0.f154717f0))) == null) {
                return;
            }
            ber berVar = (ber) this.viewModel;
            List<String> list = likeMindedMccConfigData.items;
            list.getClass();
            Map<String, LikeMindedItemData> map = likeMindedConfigDataM135618c.same;
            map.getClass();
            berVar.m101400N(list, map, idr.INSTANCE.m135620e());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m188452f0() {
        ((ber) this.viewModel).m101407r();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
