package p153l;

import com.p051p1.mobile.putong.core.data.LikeMindedConfigData;
import com.p051p1.mobile.putong.core.data.LikeMindedItemData;
import com.p051p1.mobile.putong.core.data.LikeMindedMccConfigData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/ufr;", "Ll/ar2;", "Ll/cgr;", "Ll/ner;", "lifecycleProvider", "", "isDebug", "<init>", "(Ll/ner;Z)V", "", "destroy", "()V", "f0", "e0", "a", "Z", "()Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ufr extends ar2<cgr> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isDebug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufr(@NotNull ner nerVar, boolean z) {
        super(nerVar);
        nerVar.getClass();
        this.isDebug = z;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m195857e0() {
        LikeMindedMccConfigData likeMindedMccConfigData;
        LikeMindedConfigData likeMindedConfigDataM144705c = this.isDebug ? jfr.INSTANCE.m144705c() : jfr.INSTANCE.m144708f();
        if (likeMindedConfigDataM144705c != null) {
            if (!likeMindedConfigDataM144705c.mcc.containsKey(String.valueOf(uqb0.f180400f0)) || (likeMindedMccConfigData = likeMindedConfigDataM144705c.mcc.get(String.valueOf(uqb0.f180400f0))) == null) {
                return;
            }
            cgr cgrVar = (cgr) this.viewModel;
            List<String> list = likeMindedMccConfigData.items;
            list.getClass();
            Map<String, LikeMindedItemData> map = likeMindedConfigDataM144705c.same;
            map.getClass();
            cgrVar.m109740N(list, map, jfr.INSTANCE.m144707e());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m195858f0() {
        ((cgr) this.viewModel).m109747r();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
