package p009l;

import com.p000p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p000p1.mobile.putong.core.newui.onlinezone.OnlineZoneFrag;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeListFrag;
import com.p000p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import l.gr9;
import l.jq2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\f0\u0018j\b\u0012\u0004\u0012\u00020\f`\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ll/l1h0;", "Ll/jq2;", "Ll/j1h0;", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;)V", "", "g0", "()V", "", MiniWidgetProvider.KEY_TYPE, "Ll/e1h0;", "f0", "(Ljava/lang/String;)Ll/e1h0;", "destroy", "a", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "", "b", "Ljava/util/List;", "defaultShowTab", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "e0", "()Ljava/util/ArrayList;", "setShowTabList", "(Ljava/util/ArrayList;)V", "showTabList", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class l1h0 extends jq2<j1h0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremePartnerTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<String> defaultShowTab;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ArrayList<e1h0> showTabList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1h0(@NotNull SupremePartnerTabFrag supremePartnerTabFrag) {
        super(supremePartnerTabFrag);
        supremePartnerTabFrag.getClass();
        this.frag = supremePartnerTabFrag;
        this.showTabList = new ArrayList<>();
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final ArrayList<e1h0> m17629e0() {
        return this.showTabList;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final e1h0 m17630f0(@NotNull String type) {
        type.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode != -1049482625) {
            if (iHashCode != -258041904) {
                if (iHashCode == 464331288 && type.equals("online_zone")) {
                    return e1h0.INSTANCE.m13637a().m13635c(type).m13636d("在线专区").m13634b(new OnlineZoneFrag()).m13633a();
                }
            } else if (type.equals("personalized")) {
                return e1h0.INSTANCE.m13637a().m13635c(type).m13636d("私人定制").m13634b(new SupremeListFrag()).m13633a();
            }
        } else if (type.equals("nearby")) {
            return e1h0.INSTANCE.m13637a().m13635c(type).m13636d("附近的人").m13634b(NearbyFrag.Companion.m6879b(NearbyFrag.INSTANCE, null, 1, null)).m13633a();
        }
        return e1h0.INSTANCE.m13637a().m13635c(type).m13633a();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m17631g0() {
        List<String> list;
        if (CoreModule.P().g().Ki()) {
            this.defaultShowTab = CollectionsKt.mutableListOf(new String[]{"nearby"});
            if (gr9.Companion.c() && (list = this.defaultShowTab) != null) {
                list.add("online_zone");
            }
        } else {
            this.defaultShowTab = CollectionsKt.mutableListOf(new String[]{"nearby", "personalized"});
        }
        this.showTabList.clear();
        List<String> list2 = this.defaultShowTab;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                this.showTabList.add(m17630f0((String) it.next()));
            }
        }
        ((j1h0) ((jq2) this).viewModel).m16851v(this.showTabList);
    }

    public void destroy() {
    }
}
