package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignTemplateDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveVoiceApi;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u000eJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0011R\"\u00104\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, m87232d2 = {"Ll/rlo0;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "Ll/mcr;", "lifecycleProvider", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Ll/mcr;)V", "", "order", "", "M", "(Ljava/lang/String;)V", BloodType.f38728O, "()V", "", "I", "()Ljava/util/List;", "Lrx/c;", "Ll/rgn0;", "c0", "()Lrx/c;", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/campaignBanner/LiveCampaignTemplateDetail;", "b0", "Ll/q4s;", "cardData", "", "K", "(Ll/q4s;)Z", "", "feeds", "G", "(Ljava/util/List;)V", "Ll/bup;", "", RXScreenCaptureService.KEY_INDEX, "H", "(Ll/bup;I)V", "getData", "L", "X", "Q", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "getVoiceTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "b", "Ljava/util/List;", "J", "pagerData", "c", "Z", "isWhiteTheme", "()Z", "d0", "(Z)V", "Lcom/p1/mobile/putong/data/Pagination;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/Pagination;", Pagination.TYPE, "Companion", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class rlo0 extends BaseAsyncPlug {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceTab voiceTab;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<q4s> pagerData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isWhiteTheme;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Pagination pagination;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlo0(@NotNull BLiveVoiceTab bLiveVoiceTab, @NotNull mcr mcrVar) {
        super(mcrVar);
        bLiveVoiceTab.getClass();
        mcrVar.getClass();
        this.voiceTab = bLiveVoiceTab;
        this.pagerData = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public static List m179816A(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static wvp m179818C(Function1 function1, Object obj) {
        return (wvp) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static void m179819D(rlo0 rlo0Var, wvp wvpVar) {
        List<String> list = wvpVar.f188272a;
        List<q4s> list2 = wvpVar.f188273b;
        q4s q4sVar = wvpVar.f188274c;
        LiveCampaignTemplateDetail liveCampaignTemplateDetail = wvpVar.f188275d;
        for (String str : list) {
            int size = rlo0Var.pagerData.size();
            for (int i = 0; i < size && !list.isEmpty() && list2.size() != 0; i++) {
                q4s q4sVar2 = rlo0Var.pagerData.get(i);
                if (rlo0Var.m179858K(q4sVar2) && TextUtils.equals(q4sVar2.m172960i().m103979c().liveId, str)) {
                    q4s q4sVarRemove = list2.remove(0);
                    bup bupVarM172960i = q4sVarRemove.m172960i();
                    bupVarM172960i.getClass();
                    rlo0Var.m179855H(bupVarM172960i, i);
                    rlo0Var.pagerData.set(i, q4sVarRemove);
                }
            }
        }
        if (liveCampaignTemplateDetail != null && !vwb.m200296J(rlo0Var.pagerData) && !vwb.m200296J(liveCampaignTemplateDetail.getCards())) {
            int iM200293G = vwb.m200293G(rlo0Var.pagerData, new w9j() { // from class: l.zko0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rlo0.m179831Z((q4s) obj);
                }
            });
            q4s q4sVar3 = liveCampaignTemplateDetail.getCards().get(0);
            List<q4s> list3 = rlo0Var.pagerData;
            if (iM200293G >= 0) {
                q4sVar3.getClass();
                list3.set(iM200293G, q4sVar3);
            } else {
                q4sVar3.getClass();
                list3.add(0, q4sVar3);
            }
        }
        if (q4sVar != null && !vwb.m200296J(rlo0Var.pagerData)) {
            int iM200293G2 = vwb.m200293G(rlo0Var.pagerData, new w9j() { // from class: l.alo0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rlo0.m179832a0((q4s) obj);
                }
            });
            List<q4s> list4 = rlo0Var.pagerData;
            if (iM200293G2 >= 0) {
                list4.set(iM200293G2, q4sVar);
            } else {
                list4.add(0, q4sVar);
            }
        }
        rlo0Var.success();
    }

    /* JADX INFO: renamed from: F */
    public static Function0 m179821F(final rlo0 rlo0Var, final xaj0 xaj0Var, final rgn0 rgn0Var, final LiveCampaignTemplateDetail liveCampaignTemplateDetail) {
        return new Function0() { // from class: l.yko0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rlo0.m179830Y(rgn0Var, xaj0Var, rlo0Var, liveCampaignTemplateDetail);
            }
        };
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m179822N(rlo0 rlo0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        rlo0Var.m179860M(str);
    }

    /* JADX INFO: renamed from: P */
    public static final List m179823P(rlo0 rlo0Var, g6n0 g6n0Var, List list, LiveCampaignTemplateDetail liveCampaignTemplateDetail, rgn0 rgn0Var) {
        rlo0Var.pagination = g6n0Var.f101296c;
        List<BLiveVoiceFeedBanners> list2 = g6n0Var.f101295b;
        list.getClass();
        list2.addAll(list);
        aup.Companion companion = aup.INSTANCE;
        String str = rlo0Var.voiceTab.source;
        str.getClass();
        List<q4s> listM99033j = companion.m99033j(g6n0Var, str);
        if (!vwb.m200296J(liveCampaignTemplateDetail.getCards())) {
            q4s q4sVar = liveCampaignTemplateDetail.getCards().get(0);
            q4sVar.getClass();
            listM99033j.add(0, q4sVar);
        }
        if (!vwb.m200296J(rgn0Var.m179173b())) {
            q4s q4sVar2 = new q4s();
            q4sVar2.m172969r(3004);
            vvp vvpVar = new vvp();
            rgn0Var.m179174c(rlo0Var.isWhiteTheme);
            vvpVar.m200197c(rgn0Var);
            vvpVar.m200198d(rlo0Var.isWhiteTheme ? companion.m99030g() : null);
            q4sVar2.m172971t(vvpVar);
            Unit unit = Unit.INSTANCE;
            listM99033j.add(0, q4sVar2);
        }
        rlo0Var.m179854G(listM99033j);
        return listM99033j;
    }

    /* JADX INFO: renamed from: R */
    public static final List m179824R(rlo0 rlo0Var, g6n0 g6n0Var) {
        rlo0Var.pagination = g6n0Var.f101296c;
        aup.Companion companion = aup.INSTANCE;
        String str = rlo0Var.voiceTab.source;
        str.getClass();
        return companion.m99033j(g6n0Var, str);
    }

    /* JADX INFO: renamed from: S */
    public static final List m179825S(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m179826T(rlo0 rlo0Var, List list) {
        List<q4s> list2 = rlo0Var.pagerData;
        list.getClass();
        list2.addAll(list);
        rlo0Var.m179854G(rlo0Var.pagerData);
        rlo0Var.success("TYPE_LOAD_MORE");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m179827U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final void m179828V(rlo0 rlo0Var, Throwable th) {
        th.getClass();
        rlo0Var.error(th);
    }

    /* JADX INFO: renamed from: W */
    public static final void m179829W(rlo0 rlo0Var) {
        rlo0Var.complete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final wvp m179830Y(rgn0 rgn0Var, xaj0 xaj0Var, rlo0 rlo0Var, LiveCampaignTemplateDetail liveCampaignTemplateDetail) {
        q4s q4sVar = null;
        if (!vwb.m200296J(rgn0Var.m179173b())) {
            q4s q4sVar2 = new q4s();
            q4sVar2.m172969r(3004);
            vvp vvpVar = new vvp();
            vvpVar.m200197c(rgn0Var);
            vvpVar.m200198d(rlo0Var.isWhiteTheme ? aup.INSTANCE.m99030g() : null);
            q4sVar2.m172971t(vvpVar);
            q4sVar = q4sVar2;
        }
        aup.Companion companion = aup.INSTANCE;
        B b = xaj0Var.f191752b;
        b.getClass();
        String str = rlo0Var.voiceTab.source;
        str.getClass();
        return new wvp((List) xaj0Var.f191751a, companion.m99033j((g6n0) b, str), q4sVar, liveCampaignTemplateDetail);
    }

    /* JADX INFO: renamed from: Z */
    public static final Boolean m179831Z(q4s q4sVar) {
        return Boolean.valueOf(q4sVar.m172955d() == 16);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Boolean m179832a0(q4s q4sVar) {
        return Boolean.valueOf(q4sVar.m172955d() == 3004);
    }

    /* JADX INFO: renamed from: g */
    public static void m179834g(rlo0 rlo0Var, Throwable th) {
        rjn0 rjn0Var = rjn0.INSTANCE;
        th.getClass();
        rjn0Var.m179657a(th);
        rlo0Var.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static void m179837j(rlo0 rlo0Var, List list) {
        rlo0Var.pagerData.clear();
        List<q4s> list2 = rlo0Var.pagerData;
        list.getClass();
        list2.addAll(list);
        rlo0Var.success("TYPE_LOAD_ALL");
        rlo0Var.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: m */
    public static wvp m179840m(Function0 function0) {
        return (wvp) function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public static List m179841n(rlo0 rlo0Var, g6n0 g6n0Var) {
        rlo0Var.pagination = g6n0Var.f101296c;
        aup.Companion companion = aup.INSTANCE;
        String str = rlo0Var.voiceTab.source;
        str.getClass();
        List<q4s> listM99033j = companion.m99033j(g6n0Var, str);
        rlo0Var.m179854G(listM99033j);
        return listM99033j;
    }

    /* JADX INFO: renamed from: o */
    public static Function0 m179842o(final rlo0 rlo0Var, final g6n0 g6n0Var, final rgn0 rgn0Var, final List list, final LiveCampaignTemplateDetail liveCampaignTemplateDetail) {
        return new Function0() { // from class: l.clo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rlo0.m179823P(this.f81452a, g6n0Var, list, liveCampaignTemplateDetail, rgn0Var);
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static void m179843p(rlo0 rlo0Var) {
        rlo0Var.complete();
    }

    /* JADX INFO: renamed from: q */
    public static Function0 m179844q(Function4 function4, Object obj, Object obj2, Object obj3, Object obj4) {
        return (Function0) function4.invoke(obj, obj2, obj3, obj4);
    }

    /* JADX INFO: renamed from: r */
    public static List m179845r(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static void m179847t(rlo0 rlo0Var, List list) {
        rlo0Var.pagerData.clear();
        List<q4s> list2 = rlo0Var.pagerData;
        list.getClass();
        list2.addAll(list);
        rlo0Var.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: u */
    public static List m179848u(Function0 function0) {
        return (List) function0.invoke();
    }

    /* JADX INFO: renamed from: w */
    public static void m179850w(rlo0 rlo0Var) {
        rlo0Var.complete();
    }

    /* JADX INFO: renamed from: y */
    public static void m179852y(rlo0 rlo0Var, Throwable th) {
        rjn0 rjn0Var = rjn0.INSTANCE;
        th.getClass();
        rjn0Var.m179657a(th);
        rlo0Var.error(th);
    }

    /* JADX INFO: renamed from: z */
    public static Function0 m179853z(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Function0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: G */
    public final void m179854G(List<? extends q4s> feeds) {
        int size = feeds.size();
        for (int i = 0; i < size; i++) {
            q4s q4sVar = feeds.get(i);
            if (m179858K(q4sVar)) {
                bup bupVarM172960i = q4sVar.m172960i();
                aup.Companion companion = aup.INSTANCE;
                BLiveVoiceRoomFeed bLiveVoiceRoomFeedM103979c = bupVarM172960i.m103979c();
                bLiveVoiceRoomFeedM103979c.getClass();
                bupVarM172960i.m103987k(companion.m99028e(i, bLiveVoiceRoomFeedM103979c, this.voiceTab));
                if (this.isWhiteTheme) {
                    bupVarM172960i.m103988l(companion.m99030g());
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m179855H(bup cardData, int i) {
        aup.Companion companion = aup.INSTANCE;
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM103979c = cardData.m103979c();
        bLiveVoiceRoomFeedM103979c.getClass();
        cardData.m103987k(companion.m99028e(i, bLiveVoiceRoomFeedM103979c, this.voiceTab));
        if (this.isWhiteTheme) {
            cardData.m103988l(companion.m99030g());
        }
    }

    /* JADX INFO: renamed from: I */
    public final List<String> m179856I() {
        bup bupVarM172960i;
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM103979c;
        String str;
        ArrayList arrayList = new ArrayList();
        for (q4s q4sVar : this.pagerData) {
            if (m179858K(q4sVar) && (bupVarM172960i = q4sVar.m172960i()) != null && (bLiveVoiceRoomFeedM103979c = bupVarM172960i.m103979c()) != null && (str = bLiveVoiceRoomFeedM103979c.liveId) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<q4s> m179857J() {
        return this.pagerData;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m179858K(q4s cardData) {
        return cardData.m172955d() == 3001 || cardData.m172955d() == 3002;
    }

    /* JADX INFO: renamed from: L */
    public final void m179859L() {
        if (Intrinsics.m87488d(this.voiceTab.f44513id, xvo0.f194660d)) {
            m179861O();
        } else {
            m179822N(this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m179860M(String order) {
        BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
        C22306c<g6n0> liveListInTopic = IntlLiveVoiceApi.getLiveListInTopic(bLiveVoiceTab.source, bLiveVoiceTab.f44513id, -1L, 30, "");
        liveListInTopic.getClass();
        C22306c c22306cDuringCreated = duringCreated(liveListInTopic);
        final Function1 function1 = new Function1() { // from class: l.olo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rlo0.m179841n(this.f144521a, (g6n0) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.plo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rlo0.m179845r(function1, obj);
            }
        }).subscribe(ffw.m121195f(new e30() { // from class: l.qlo0
            @Override // p149l.e30
            public final void call(Object obj) {
                rlo0.m179837j(this.f155249a, (List) obj);
            }
        }, new e30() { // from class: l.rko0
            @Override // p149l.e30
            public final void call(Object obj) {
                rlo0.m179834g(this.f159876a, (Throwable) obj);
            }
        }, new d30() { // from class: l.sko0
            @Override // p149l.d30
            public final void call() {
                rlo0.m179843p(this.f165000a);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final void m179861O() {
        BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
        C22306c<g6n0> liveListInTopic = IntlLiveVoiceApi.getLiveListInTopic(bLiveVoiceTab.source, bLiveVoiceTab.f44513id, -1L, 30, "");
        C22306c<rgn0> intlVoiceRoomSquareShipLinks = IntlLiveVoiceApi.getIntlVoiceRoomSquareShipLinks();
        C22306c<List<BLiveVoiceFeedBanners>> intlVoiceRoomSquareBanners = IntlLiveVoiceApi.getIntlVoiceRoomSquareBanners();
        C22306c<LiveCampaignTemplateDetail> campaignTemplate = IntlLiveVoiceApi.getCampaignTemplate();
        final Function4 function4 = new Function4() { // from class: l.qko0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return rlo0.m179842o(this.f155151a, (g6n0) obj, (rgn0) obj2, (List) obj3, (LiveCampaignTemplateDetail) obj4);
            }
        };
        C22306c c22306cCombineLatest = C22306c.combineLatest(liveListInTopic, intlVoiceRoomSquareShipLinks, intlVoiceRoomSquareBanners, campaignTemplate, new z9j() { // from class: l.blo0
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return rlo0.m179844q(function4, obj, obj2, obj3, obj4);
            }
        });
        c22306cCombineLatest.getClass();
        C22306c c22306cDuringCreated = duringCreated(c22306cCombineLatest);
        final Function1 function1 = new Function1() { // from class: l.jlo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rlo0.m179848u((Function0) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.klo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rlo0.m179816A(function1, obj);
            }
        }).subscribe(ffw.m121195f(new e30() { // from class: l.llo0
            @Override // p149l.e30
            public final void call(Object obj) {
                rlo0.m179847t(this.f128738a, (List) obj);
            }
        }, new e30() { // from class: l.mlo0
            @Override // p149l.e30
            public final void call(Object obj) {
                rlo0.m179852y(this.f134458a, (Throwable) obj);
            }
        }, new d30() { // from class: l.nlo0
            @Override // p149l.d30
            public final void call() {
                rlo0.m179850w(this.f139576a);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m179862Q() {
        String str;
        Pagination pagination;
        Links links;
        Pagination pagination2 = this.pagination;
        if (pagination2 != null) {
            if (pagination2 == null || (links = pagination2.links) == null || (str = links.next) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(str) || (pagination = this.pagination) == null) {
                return;
            }
            BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
            C22306c<g6n0> liveListInTopicNextPage = IntlLiveVoiceApi.getLiveListInTopicNextPage(pagination, bLiveVoiceTab.source, bLiveVoiceTab.f44513id, "");
            liveListInTopicNextPage.getClass();
            C22306c c22306cDuringCreated = duringCreated(liveListInTopicNextPage);
            final Function1 function1 = new Function1() { // from class: l.dlo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return rlo0.m179824R(this.f86848a, (g6n0) obj);
                }
            };
            C22306c map = c22306cDuringCreated.map(new w9j() { // from class: l.elo0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rlo0.m179825S(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.flo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return rlo0.m179826T(this.f98203a, (List) obj);
                }
            };
            map.subscribe(new e30() { // from class: l.glo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    rlo0.m179827U(function2, obj);
                }
            }, new e30() { // from class: l.hlo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    rlo0.m179828V(this.f108361a, (Throwable) obj);
                }
            }, new d30() { // from class: l.ilo0
                @Override // p149l.d30
                public final void call() {
                    rlo0.m179829W(this.f113851a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m179863X() {
        List<String> listM179856I = m179856I();
        if (listM179856I.isEmpty()) {
            return;
        }
        BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
        C22306c<xaj0<List<String>, g6n0, String>> c22306cRefreshSwipTopicRooms = IntlVoiceCenterApiProvider.refreshSwipTopicRooms(listM179856I, bLiveVoiceTab.f44513id, bLiveVoiceTab.source);
        C22306c<rgn0> c22306cM179865c0 = m179865c0();
        C22306c<LiveCampaignTemplateDetail> c22306cM179864b0 = m179864b0();
        final Function3 function3 = new Function3() { // from class: l.tko0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return rlo0.m179821F(this.f170902a, (xaj0) obj, (rgn0) obj2, (LiveCampaignTemplateDetail) obj3);
            }
        };
        C22306c c22306cCombineLatest = C22306c.combineLatest(c22306cRefreshSwipTopicRooms, c22306cM179865c0, c22306cM179864b0, new y9j() { // from class: l.uko0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return rlo0.m179853z(function3, obj, obj2, obj3);
            }
        });
        c22306cCombineLatest.getClass();
        C22306c c22306cDuringCreated = duringCreated(c22306cCombineLatest);
        final Function1 function1 = new Function1() { // from class: l.vko0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rlo0.m179840m((Function0) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.wko0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rlo0.m179818C(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.xko0
            @Override // p149l.e30
            public final void call(Object obj) {
                rlo0.m179819D(this.f193332a, (wvp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public final C22306c<LiveCampaignTemplateDetail> m179864b0() {
        C22306c<LiveCampaignTemplateDetail> campaignTemplate = IntlLiveVoiceApi.getCampaignTemplate();
        campaignTemplate.getClass();
        return duringCreated(campaignTemplate);
    }

    /* JADX INFO: renamed from: c0 */
    public final C22306c<rgn0> m179865c0() {
        if (Intrinsics.m87488d(this.voiceTab.source, "recommend")) {
            C22306c<rgn0> intlVoiceRoomSquareShipLinks = IntlLiveVoiceApi.getIntlVoiceRoomSquareShipLinks();
            intlVoiceRoomSquareShipLinks.getClass();
            return duringCreated(intlVoiceRoomSquareShipLinks);
        }
        C22306c<rgn0> c22306cJust = C22306c.just(new rgn0(this.isWhiteTheme, new ArrayList(), new ArrayList()));
        c22306cJust.getClass();
        return c22306cJust;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m179866d0(boolean z) {
        this.isWhiteTheme = z;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        loading();
        m179859L();
    }
}
