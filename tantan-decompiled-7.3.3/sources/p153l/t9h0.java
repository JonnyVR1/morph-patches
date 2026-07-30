package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeListFrag;
import com.p051p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\f0\u0018j\b\u0012\u0004\u0012\u00020\f`\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/t9h0;", "Ll/ar2;", "Ll/r9h0;", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;)V", "", "g0", "()V", "", "type", "Ll/m9h0;", "f0", "(Ljava/lang/String;)Ll/m9h0;", "destroy", "a", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "", "b", "Ljava/util/List;", "defaultShowTab", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "e0", "()Ljava/util/ArrayList;", "setShowTabList", "(Ljava/util/ArrayList;)V", "showTabList", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class t9h0 extends ar2<r9h0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremePartnerTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<String> defaultShowTab;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ArrayList<m9h0> showTabList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9h0(@NotNull SupremePartnerTabFrag supremePartnerTabFrag) {
        super(supremePartnerTabFrag);
        supremePartnerTabFrag.getClass();
        this.frag = supremePartnerTabFrag;
        this.showTabList = new ArrayList<>();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final ArrayList<m9h0> m189754e0() {
        return this.showTabList;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final m9h0 m189755f0(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1049482625) {
            if (iHashCode != -258041904) {
                if (iHashCode == 464331288 && type.equals("online_zone")) {
                    return m9h0.INSTANCE.m157574a().m157572c(type).m157573d("在线专区").m157571b(new OnlineZoneFrag()).m157570a();
                }
            } else if (type.equals("personalized")) {
                return m9h0.INSTANCE.m157574a().m157572c(type).m157573d("私人定制").m157571b(new SupremeListFrag()).m157570a();
            }
        } else if (type.equals("nearby")) {
            return m9h0.INSTANCE.m157574a().m157572c(type).m157573d("附近的人").m157571b(NearbyFrag.Companion.m43719b(NearbyFrag.INSTANCE, null, 1, null)).m157570a();
        }
        return m9h0.INSTANCE.m157574a().m157572c(type).m157570a();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m189756g0() {
        List<String> list;
        if (CoreModule.m30933P().m143410g().mo36020Ki()) {
            this.defaultShowTab = CollectionsKt.mutableListOf("nearby");
            if (rs9.INSTANCE.m182943c() && (list = this.defaultShowTab) != null) {
                list.add("online_zone");
            }
        } else {
            this.defaultShowTab = CollectionsKt.mutableListOf("nearby", "personalized");
        }
        this.showTabList.clear();
        List<String> list2 = this.defaultShowTab;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                this.showTabList.add(m189755f0((String) it.next()));
            }
        }
        ((r9h0) this.viewModel).m180593v(this.showTabList);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
