package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p046p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.VisitorInfo;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetLikedItemView;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorAdmobItemView;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsItemView;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J-\u0010,\u001a\u00020\t2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010'¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u000bJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000bJ\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u0010\u000bJ\u0017\u0010;\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\u0018\u00102\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010ER\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010E¨\u0006U"}, m87232d2 = {"Ll/fio;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/ijo;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/ijo;)V", "", "U", "()V", "", Constants.INAPP_POSITION, "", "a0", "(I)Z", j6f.GPS_DIRECTION_TRUE, j6f.GPS_MEASUREMENT_INTERRUPTED, b2s.C_ZONE, "()I", "position", "Y", "(I)Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "", "getItemId", "(I)J", "Landroid/view/ViewGroup;", "parent", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "L", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;II)V", "getItemViewType", "(I)I", "", "Lcom/p1/mobile/putong/core/data/VisitorInfo;", "visitorItems", "Lcom/p1/mobile/putong/core/data/InstantMatchUserInfo;", "instantMatchItems", "e0", "(Ljava/util/List;Ljava/util/List;)V", "canVisitor", "hasPrivilege", "b0", "(ZZ)V", "adView", "R", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Landroid/view/View;)V", "Q", "P", "W", j6f.LATITUDE_SOUTH, "", "id", "d0", "(Ljava/lang/String;)Z", "c0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;)Z", "c", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Ll/ijo;", "e", "Ljava/util/List;", "Z", "()Ljava/util/List;", "setVisitorItems", "(Ljava/util/List;)V", "f", "X", "setInstantMatchItems", "g", "Landroid/view/View;", "h", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "adFakeItem", RXScreenCaptureService.KEY_INDEX, "j", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fio extends dac0<IntlBaseVisitorInfo> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ijo presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlBaseVisitorInfo> visitorItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlBaseVisitorInfo> instantMatchItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View adView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IntlBaseVisitorInfo adFakeItem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean canVisitor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean hasPrivilege;

    public fio(@NotNull Act act, @NotNull ijo ijoVar) {
        act.getClass();
        ijoVar.getClass();
        this.act = act;
        this.presenter = ijoVar;
        this.visitorItems = new ArrayList();
        this.instantMatchItems = new ArrayList();
        this.canVisitor = CoreModule.f17545c.f19672p0.m173359g3() ? !xma.m210077h4() : xma.m210047L3();
        this.hasPrivilege = xma.m210040C3();
    }

    /* JADX INFO: renamed from: E */
    public static void m121528E(fio fioVar, IntlMeetLikedItemView intlMeetLikedItemView, IntlBaseVisitorInfo intlBaseVisitorInfo) {
        intlBaseVisitorInfo.getClass();
        fioVar.presenter.m136735N0(intlBaseVisitorInfo);
        CoreModule.m29935P().m94651a().mo33284Ad(fioVar.presenter.act(), intlBaseVisitorInfo.userID, intlMeetLikedItemView, new e30() { // from class: l.dio
            @Override // p149l.e30
            public final void call(Object obj) {
                fio.m121536N(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static void m121530G(IntlBaseVisitorInfo intlBaseVisitorInfo, final fio fioVar, Boolean bool) {
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(intlBaseVisitorInfo.userID);
        CoreModule.m29935P().m94651a().mo33367Me(fioVar.presenter.act(), userM169430Pa, "p_intl_meet_view,e_intl_instantmatch_btn,click", new d30() { // from class: l.cio
            @Override // p149l.d30
            public final void call() {
                fio.m121537O(this.f81102a, userM169430Pa);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m121531H(final fio fioVar, final IntlBaseVisitorInfo intlBaseVisitorInfo, User user) {
        user.getClass();
        if (NullChecker.m81303a(user.localRelationship)) {
            Relationship relationship = user.localRelationship;
            if (TEnum.equals(relationship != null ? relationship.state : null, "matched")) {
                e51.m114742G(new Runnable() { // from class: l.eio
                    @Override // java.lang.Runnable
                    public final void run() {
                        fio.m121535M(this.f91620a, intlBaseVisitorInfo);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m121533J(IntlBaseVisitorInfo intlBaseVisitorInfo, fio fioVar, Boolean bool) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(intlBaseVisitorInfo.userID);
        ijo ijoVar = fioVar.presenter;
        userM169430Pa.getClass();
        ijoVar.m136734L0(intlBaseVisitorInfo, userM169430Pa, true);
    }

    /* JADX INFO: renamed from: M */
    public static final void m121535M(fio fioVar, IntlBaseVisitorInfo intlBaseVisitorInfo) {
        fioVar.m121552c0(intlBaseVisitorInfo);
    }

    /* JADX INFO: renamed from: O */
    public static final void m121537O(fio fioVar, User user) {
        fioVar.m121553d0(user.f56011id);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return (this.hasPrivilege || this.instantMatchItems.size() <= 3) ? this.visitorItems.size() + this.instantMatchItems.size() : this.visitorItems.size() + 3;
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType == 2) {
            View viewInflate = this.act.inflater().inflate(k6c0.f121300H, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        if (itemViewType == 3) {
            View viewInflate2 = this.act.inflater().inflate(k6c0.f121306J, parent, false);
            viewInflate2.getClass();
            return viewInflate2;
        }
        if (itemViewType == 4) {
            View viewInflate3 = this.act.inflater().inflate(k6c0.f121303I, parent, false);
            viewInflate3.getClass();
            return viewInflate3;
        }
        if (itemViewType == 5) {
            View viewInflate4 = this.act.inflater().inflate(k6c0.f121315M, parent, false);
            viewInflate4.getClass();
            return viewInflate4;
        }
        Act act = this.act;
        if (itemViewType == 6) {
            View viewInflate5 = act.inflater().inflate(k6c0.f121312L, parent, false);
            viewInflate5.getClass();
            return viewInflate5;
        }
        View viewInflate6 = act.inflater().inflate(k6c0.f121309K, parent, false);
        viewInflate6.getClass();
        return viewInflate6;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @NotNull final IntlBaseVisitorInfo item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 2) {
            View view = this.adView;
            if (view != null) {
                ((IntlMeetVisitorAdmobItemView) convertView).m39504b(view);
                return;
            }
            return;
        }
        if (itemViewType == 3 || itemViewType == 4 || itemViewType == 5) {
            return;
        }
        if (itemViewType != 6) {
            IntlMeetVisitorsItemView intlMeetVisitorsItemView = (IntlMeetVisitorsItemView) convertView;
            String str = item.userID;
            str.getClass();
            intlMeetVisitorsItemView.m39517g(item, str, position == 0, this.canVisitor);
            return;
        }
        mo67374c(this.presenter.act(), CoreModule.f17545c.f19639e0.m169410Ka(item.userID)).subscribe(mkd0.m154955G(new e30() { // from class: l.yho
            @Override // p149l.e30
            public final void call(Object obj) {
                fio.m121531H(this.f198375a, item, (User) obj);
            }
        }));
        final IntlMeetLikedItemView intlMeetLikedItemView = (IntlMeetLikedItemView) convertView;
        String str2 = item.userID;
        str2.getClass();
        intlMeetLikedItemView.m39501C(this, item, str2, position == this.visitorItems.size(), this.hasPrivilege, new e30() { // from class: l.zho
            @Override // p149l.e30
            public final void call(Object obj) {
                fio.m121528E(this.f203199a, intlMeetLikedItemView, (IntlBaseVisitorInfo) obj);
            }
        }, new e30() { // from class: l.aio
            @Override // p149l.e30
            public final void call(Object obj) {
                fio.m121533J(item, this, (Boolean) obj);
            }
        }, new e30() { // from class: l.bio
            @Override // p149l.e30
            public final void call(Object obj) {
                fio.m121530G(item, this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m121539P() {
        if (vwb.m200296J(this.instantMatchItems)) {
            return;
        }
        IntlBaseVisitorInfo intlBaseVisitorInfoNew_ = IntlBaseVisitorInfo.new_();
        intlBaseVisitorInfoNew_.userID = "fake_visitor_list_dividing_id";
        List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
        list.getClass();
        ((ArrayList) list).add(intlBaseVisitorInfoNew_);
        notifyItemInserted(this.visitorItems.size());
    }

    /* JADX INFO: renamed from: Q */
    public final void m121540Q() {
        IntlBaseVisitorInfo intlBaseVisitorInfoNew_ = IntlBaseVisitorInfo.new_();
        intlBaseVisitorInfoNew_.userID = "fake_visitor_list_empty_id";
        List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
        list.getClass();
        ((ArrayList) list).add(0, intlBaseVisitorInfoNew_);
        notifyItemInserted(0);
    }

    /* JADX INFO: renamed from: R */
    public final void m121541R(@NotNull IntlBaseVisitorInfo item, @Nullable View adView) {
        item.getClass();
        if (xma.m210087m4()) {
            this.adView = adView;
            this.adFakeItem = item;
            List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
            list.getClass();
            ArrayList arrayList = (ArrayList) list;
            boolean zEquals = TextUtils.equals(((IntlBaseVisitorInfo) CollectionsKt.last((List) arrayList)).userID, "fake_visitor_list_dividing_id");
            List<? extends IntlBaseVisitorInfo> list2 = this.visitorItems;
            int size = 3;
            if (zEquals) {
                if (list2.size() < 5) {
                    size = this.visitorItems.size() - 1;
                }
            } else if (list2.size() < 4) {
                size = this.visitorItems.size();
            }
            arrayList.add(size, item);
            notifyItemInserted(size);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m121542S() {
        if (vwb.m200296J(this.instantMatchItems)) {
            return;
        }
        IntlBaseVisitorInfo intlBaseVisitorInfoNew_ = IntlBaseVisitorInfo.new_();
        intlBaseVisitorInfoNew_.userID = "fake_visitor_list_more_id";
        List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
        list.getClass();
        ((ArrayList) list).add(intlBaseVisitorInfoNew_);
        notifyItemInserted(this.visitorItems.size());
    }

    /* JADX INFO: renamed from: T */
    public final void m121543T() {
        if (vwb.m200296J(this.visitorItems)) {
            return;
        }
        List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
        if (TextUtils.equals(list.get(list.size() - 1).userID, "fake_visitor_list_dividing_id")) {
            List<? extends IntlBaseVisitorInfo> list2 = this.visitorItems;
            list2.getClass();
            CollectionsKt.removeLastOrNull((ArrayList) list2);
            m121546W();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m121544U() {
        if (vwb.m200296J(this.visitorItems) || this.adFakeItem == null) {
            return;
        }
        List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
        list.getClass();
        TypeIntrinsics.m87534a((ArrayList) list).remove(this.adFakeItem);
        m121546W();
    }

    /* JADX INFO: renamed from: V */
    public final void m121545V() {
        if (vwb.m200296J(this.visitorItems)) {
            return;
        }
        List<? extends IntlBaseVisitorInfo> list = this.visitorItems;
        if (TextUtils.equals(list.get(list.size() - 1).userID, "fake_visitor_list_more_id")) {
            List<? extends IntlBaseVisitorInfo> list2 = this.visitorItems;
            list2.getClass();
            CollectionsKt.removeLastOrNull((ArrayList) list2);
            m121546W();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m121546W() {
        if (this.adView != null) {
            this.adFakeItem = null;
            this.adView = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final List<IntlBaseVisitorInfo> m121547X() {
        return this.instantMatchItems;
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public IntlBaseVisitorInfo getItem(int position) {
        return position >= this.visitorItems.size() ? this.instantMatchItems.get(position - this.visitorItems.size()) : this.visitorItems.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final List<IntlBaseVisitorInfo> m121549Z() {
        return this.visitorItems;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m121550a0(int pos) {
        if (!vwb.m200296J(this.visitorItems) && pos < this.visitorItems.size()) {
            IntlBaseVisitorInfo intlBaseVisitorInfo = this.visitorItems.get(pos);
            if (NullChecker.m81303a(intlBaseVisitorInfo) && TextUtils.equals(intlBaseVisitorInfo.userID, "fake_visitor_list_admob_id")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m121551b0(boolean canVisitor, boolean hasPrivilege) {
        this.canVisitor = canVisitor;
        this.hasPrivilege = hasPrivilege;
        if (canVisitor) {
            m121544U();
            m121543T();
            m121545V();
            if (!vwb.m200296J(this.visitorItems) && !TextUtils.equals(this.visitorItems.get(0).userID, "fake_visitor_list_empty_id") && !vwb.m200296J(this.instantMatchItems)) {
                m121542S();
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m121552c0(@Nullable IntlBaseVisitorInfo item) {
        int iIndexOf = CollectionsKt.contains(this.instantMatchItems, item) ? CollectionsKt.indexOf(this.instantMatchItems, item) + this.visitorItems.size() : -1;
        if (iIndexOf == -1) {
            return false;
        }
        List<? extends IntlBaseVisitorInfo> list = this.instantMatchItems;
        list.getClass();
        TypeIntrinsics.m87534a((ArrayList) list).remove(item);
        if (this.instantMatchItems.size() > 0) {
            notifyItemRemoved(iIndexOf);
            return true;
        }
        notifyDataSetChanged();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    /* JADX INFO: renamed from: d0 */
    public final boolean m121553d0(@Nullable String id) {
        Iterator<? extends IntlBaseVisitorInfo> it = this.instantMatchItems.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().userID, id)) {
                if (i >= 0) {
                    return m121552c0(this.instantMatchItems.get(i));
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return m121552c0(this.instantMatchItems.get(i));
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m121554e0(@Nullable List<? extends VisitorInfo> visitorItems, @Nullable List<? extends InstantMatchUserInfo> instantMatchItems) {
        if (visitorItems != null) {
            this.visitorItems = visitorItems;
        } else {
            this.visitorItems = new ArrayList();
        }
        if (instantMatchItems != null) {
            this.instantMatchItems = instantMatchItems;
        } else {
            this.instantMatchItems = new ArrayList();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position >= this.visitorItems.size() ? this.instantMatchItems.get(position - this.visitorItems.size()).userID.hashCode() : this.visitorItems.get(position).userID.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position >= this.visitorItems.size()) {
            return 6;
        }
        if (m121550a0(position)) {
            return 2;
        }
        if (TextUtils.equals(this.visitorItems.get(position).userID, "fake_visitor_list_empty_id")) {
            return 3;
        }
        if (TextUtils.equals(this.visitorItems.get(position).userID, "fake_visitor_list_dividing_id")) {
            return 4;
        }
        return TextUtils.equals(this.visitorItems.get(position).userID, "fake_visitor_list_more_id") ? 5 : 1;
    }

    /* JADX INFO: renamed from: N */
    public static final void m121536N(boolean z) {
    }
}
