package p149l;

import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListFrag;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyFrag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR2\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00100!j\b\u0012\u0004\u0012\u00020\u0010`\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Ll/ns80;", "Ll/jq2;", "Ll/qs80;", "Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;)V", "", "i0", "()V", "destroy", "", "j0", "()I", "", "type", "Ll/e1h0;", "g0", "(Ljava/lang/String;)Ll/e1h0;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "e0", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "f0", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "a", "Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "", "b", "Ljava/util/List;", "defaultShowTab", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "h0", "()Ljava/util/ArrayList;", "setShowTabList", "(Ljava/util/ArrayList;)V", "showTabList", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "nearbyFrag", "e", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "privateCustomResultListFrag", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ns80 extends jq2<qs80> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivateCustomTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<String> defaultShowTab;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ArrayList<e1h0> showTabList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public NearbyFrag nearbyFrag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PrivateCustomResultListFrag privateCustomResultListFrag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns80(@NotNull PrivateCustomTabFrag privateCustomTabFrag) {
        super(privateCustomTabFrag);
        privateCustomTabFrag.getClass();
        this.frag = privateCustomTabFrag;
        this.showTabList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e0 */
    public final NearbyFrag m160762e0() {
        if (this.nearbyFrag == null) {
            this.nearbyFrag = NearbyFrag.Companion.m42708b(NearbyFrag.INSTANCE, null, 1, null);
        }
        NearbyFrag nearbyFrag = this.nearbyFrag;
        if (nearbyFrag != null) {
            return nearbyFrag;
        }
        Intrinsics.m87502r("nearbyFrag");
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public final PrivateCustomResultListFrag m160763f0() {
        if (this.privateCustomResultListFrag == null) {
            this.privateCustomResultListFrag = new PrivateCustomResultListFrag();
        }
        PrivateCustomResultListFrag privateCustomResultListFrag = this.privateCustomResultListFrag;
        if (privateCustomResultListFrag != null) {
            return privateCustomResultListFrag;
        }
        Intrinsics.m87502r("privateCustomResultListFrag");
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public final e1h0 m160764g0(String type) {
        if (Intrinsics.m87488d(type, "nearby")) {
            return e1h0.INSTANCE.m114416a().m114414c(type).m114415d("附近的人").m114413b(m160762e0()).m114412a();
        }
        return Intrinsics.m87488d(type, "personalized") ? e1h0.INSTANCE.m114416a().m114414c(type).m114415d("私人定制").m114413b(m160763f0()).m114412a() : e1h0.INSTANCE.m114416a().m114414c(type).m114412a();
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final ArrayList<e1h0> m160765h0() {
        return this.showTabList;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m160766i0() {
        List<Fragment> listM2589t0 = this.frag.getChildFragmentManager().m2589t0();
        listM2589t0.getClass();
        if (!vwb.m200296J(listM2589t0)) {
            for (Fragment fragment : listM2589t0) {
                if (fragment instanceof NearbyFrag) {
                    this.nearbyFrag = (NearbyFrag) fragment;
                } else if (fragment instanceof PrivateCustomResultListFrag) {
                    this.privateCustomResultListFrag = (PrivateCustomResultListFrag) fragment;
                }
            }
        }
        if (CoreModule.m29935P().m94656g().mo35017Ki() && CoreModule.f17545c.f19598Q1.f20117R.m34761O()) {
            this.defaultShowTab = CollectionsKt.listOf((Object[]) new String[]{"nearby", "personalized"});
        } else {
            this.defaultShowTab = CollectionsKt.listOf("personalized");
        }
        this.showTabList.clear();
        List<String> list = this.defaultShowTab;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.showTabList.add(m160764g0((String) it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final int m160767j0() {
        List<String> list = this.defaultShowTab;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
