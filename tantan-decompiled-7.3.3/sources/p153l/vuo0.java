package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignTemplateDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveVoiceApi;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u000eJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0011R\"\u00104\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, m88121d2 = {"Ll/vuo0;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "Ll/ner;", "lifecycleProvider", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Ll/ner;)V", "", "order", "", "M", "(Ljava/lang/String;)V", BloodType.f39576O, "()V", "", "I", "()Ljava/util/List;", "Lrx/c;", "Ll/vpn0;", "c0", "()Lrx/c;", "Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/campaignBanner/LiveCampaignTemplateDetail;", "b0", "Ll/r6s;", "cardData", "", "K", "(Ll/r6s;)Z", "", "feeds", "G", "(Ljava/util/List;)V", "Ll/bwp;", "", RXScreenCaptureService.KEY_INDEX, "H", "(Ll/bwp;I)V", "getData", "L", "X", "Q", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "getVoiceTab", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "b", "Ljava/util/List;", "J", "pagerData", "c", "Z", "isWhiteTheme", "()Z", "d0", "(Z)V", "Lcom/p1/mobile/putong/data/Pagination;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/Pagination;", Pagination.TYPE, "Companion", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vuo0 extends BaseAsyncPlug {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceTab voiceTab;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<r6s> pagerData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isWhiteTheme;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Pagination pagination;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuo0(@NotNull BLiveVoiceTab bLiveVoiceTab, @NotNull ner nerVar) {
        super(nerVar);
        bLiveVoiceTab.getClass();
        nerVar.getClass();
        this.voiceTab = bLiveVoiceTab;
        this.pagerData = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public static List m202815A(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C */
    public static wxp m202817C(Function1 function1, Object obj) {
        return (wxp) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static void m202818D(vuo0 vuo0Var, wxp wxpVar) {
        List<String> list = wxpVar.f191505a;
        List<r6s> list2 = wxpVar.f191506b;
        r6s r6sVar = wxpVar.f191507c;
        LiveCampaignTemplateDetail liveCampaignTemplateDetail = wxpVar.f191508d;
        for (String str : list) {
            int size = vuo0Var.pagerData.size();
            for (int i = 0; i < size && !list.isEmpty() && list2.size() != 0; i++) {
                r6s r6sVar2 = vuo0Var.pagerData.get(i);
                if (vuo0Var.m202857K(r6sVar2) && TextUtils.equals(r6sVar2.m180025i().m106730c().liveId, str)) {
                    r6s r6sVarRemove = list2.remove(0);
                    bwp bwpVarM180025i = r6sVarRemove.m180025i();
                    bwpVarM180025i.getClass();
                    vuo0Var.m202854H(bwpVarM180025i, i);
                    vuo0Var.pagerData.set(i, r6sVarRemove);
                }
            }
        }
        if (liveCampaignTemplateDetail != null && !jyb.m147479J(vuo0Var.pagerData) && !jyb.m147479J(liveCampaignTemplateDetail.getCards())) {
            int iM147476G = jyb.m147476G(vuo0Var.pagerData, new qcj() { // from class: l.duo0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vuo0.m202830Z((r6s) obj);
                }
            });
            r6s r6sVar3 = liveCampaignTemplateDetail.getCards().get(0);
            List<r6s> list3 = vuo0Var.pagerData;
            if (iM147476G >= 0) {
                r6sVar3.getClass();
                list3.set(iM147476G, r6sVar3);
            } else {
                r6sVar3.getClass();
                list3.add(0, r6sVar3);
            }
        }
        if (r6sVar != null && !jyb.m147479J(vuo0Var.pagerData)) {
            int iM147476G2 = jyb.m147476G(vuo0Var.pagerData, new qcj() { // from class: l.euo0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vuo0.m202831a0((r6s) obj);
                }
            });
            List<r6s> list4 = vuo0Var.pagerData;
            if (iM147476G2 >= 0) {
                list4.set(iM147476G2, r6sVar);
            } else {
                list4.add(0, r6sVar);
            }
        }
        vuo0Var.success();
    }

    /* JADX INFO: renamed from: F */
    public static Function0 m202820F(final vuo0 vuo0Var, final bkj0 bkj0Var, final vpn0 vpn0Var, final LiveCampaignTemplateDetail liveCampaignTemplateDetail) {
        return new Function0() { // from class: l.cuo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vuo0.m202829Y(vpn0Var, bkj0Var, vuo0Var, liveCampaignTemplateDetail);
            }
        };
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m202821N(vuo0 vuo0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        vuo0Var.m202859M(str);
    }

    /* JADX INFO: renamed from: P */
    public static final List m202822P(vuo0 vuo0Var, kfn0 kfn0Var, List list, LiveCampaignTemplateDetail liveCampaignTemplateDetail, vpn0 vpn0Var) {
        vuo0Var.pagination = kfn0Var.f126462c;
        List<BLiveVoiceFeedBanners> list2 = kfn0Var.f126461b;
        list.getClass();
        list2.addAll(list);
        awp.Companion companion = awp.INSTANCE;
        String str = vuo0Var.voiceTab.source;
        str.getClass();
        List<r6s> listM100686j = companion.m100686j(kfn0Var, str);
        if (!jyb.m147479J(liveCampaignTemplateDetail.getCards())) {
            r6s r6sVar = liveCampaignTemplateDetail.getCards().get(0);
            r6sVar.getClass();
            listM100686j.add(0, r6sVar);
        }
        if (!jyb.m147479J(vpn0Var.m202264b())) {
            r6s r6sVar2 = new r6s();
            r6sVar2.m180034r(3004);
            vxp vxpVar = new vxp();
            vpn0Var.m202265c(vuo0Var.isWhiteTheme);
            vxpVar.m203867c(vpn0Var);
            vxpVar.m203868d(vuo0Var.isWhiteTheme ? companion.m100683g() : null);
            r6sVar2.m180036t(vxpVar);
            Unit unit = Unit.INSTANCE;
            listM100686j.add(0, r6sVar2);
        }
        vuo0Var.m202853G(listM100686j);
        return listM100686j;
    }

    /* JADX INFO: renamed from: R */
    public static final List m202823R(vuo0 vuo0Var, kfn0 kfn0Var) {
        vuo0Var.pagination = kfn0Var.f126462c;
        awp.Companion companion = awp.INSTANCE;
        String str = vuo0Var.voiceTab.source;
        str.getClass();
        return companion.m100686j(kfn0Var, str);
    }

    /* JADX INFO: renamed from: S */
    public static final List m202824S(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m202825T(vuo0 vuo0Var, List list) {
        List<r6s> list2 = vuo0Var.pagerData;
        list.getClass();
        list2.addAll(list);
        vuo0Var.m202853G(vuo0Var.pagerData);
        vuo0Var.success("TYPE_LOAD_MORE");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m202826U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final void m202827V(vuo0 vuo0Var, Throwable th) {
        th.getClass();
        vuo0Var.error(th);
    }

    /* JADX INFO: renamed from: W */
    public static final void m202828W(vuo0 vuo0Var) {
        vuo0Var.complete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final wxp m202829Y(vpn0 vpn0Var, bkj0 bkj0Var, vuo0 vuo0Var, LiveCampaignTemplateDetail liveCampaignTemplateDetail) {
        r6s r6sVar = null;
        if (!jyb.m147479J(vpn0Var.m202264b())) {
            r6s r6sVar2 = new r6s();
            r6sVar2.m180034r(3004);
            vxp vxpVar = new vxp();
            vxpVar.m203867c(vpn0Var);
            vxpVar.m203868d(vuo0Var.isWhiteTheme ? awp.INSTANCE.m100683g() : null);
            r6sVar2.m180036t(vxpVar);
            r6sVar = r6sVar2;
        }
        awp.Companion companion = awp.INSTANCE;
        B b = bkj0Var.f77082b;
        b.getClass();
        String str = vuo0Var.voiceTab.source;
        str.getClass();
        return new wxp((List) bkj0Var.f77081a, companion.m100686j((kfn0) b, str), r6sVar, liveCampaignTemplateDetail);
    }

    /* JADX INFO: renamed from: Z */
    public static final Boolean m202830Z(r6s r6sVar) {
        return Boolean.valueOf(r6sVar.m180020d() == 16);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Boolean m202831a0(r6s r6sVar) {
        return Boolean.valueOf(r6sVar.m180020d() == 3004);
    }

    /* JADX INFO: renamed from: g */
    public static void m202833g(vuo0 vuo0Var, Throwable th) {
        vsn0 vsn0Var = vsn0.INSTANCE;
        th.getClass();
        vsn0Var.m202641a(th);
        vuo0Var.error(th);
    }

    /* JADX INFO: renamed from: j */
    public static void m202836j(vuo0 vuo0Var, List list) {
        vuo0Var.pagerData.clear();
        List<r6s> list2 = vuo0Var.pagerData;
        list.getClass();
        list2.addAll(list);
        vuo0Var.success("TYPE_LOAD_ALL");
        vuo0Var.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: m */
    public static wxp m202839m(Function0 function0) {
        return (wxp) function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public static List m202840n(vuo0 vuo0Var, kfn0 kfn0Var) {
        vuo0Var.pagination = kfn0Var.f126462c;
        awp.Companion companion = awp.INSTANCE;
        String str = vuo0Var.voiceTab.source;
        str.getClass();
        List<r6s> listM100686j = companion.m100686j(kfn0Var, str);
        vuo0Var.m202853G(listM100686j);
        return listM100686j;
    }

    /* JADX INFO: renamed from: o */
    public static Function0 m202841o(final vuo0 vuo0Var, final kfn0 kfn0Var, final vpn0 vpn0Var, final List list, final LiveCampaignTemplateDetail liveCampaignTemplateDetail) {
        return new Function0() { // from class: l.guo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vuo0.m202822P(this.f106527a, kfn0Var, list, liveCampaignTemplateDetail, vpn0Var);
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static void m202842p(vuo0 vuo0Var) {
        vuo0Var.complete();
    }

    /* JADX INFO: renamed from: q */
    public static Function0 m202843q(Function4 function4, Object obj, Object obj2, Object obj3, Object obj4) {
        return (Function0) function4.invoke(obj, obj2, obj3, obj4);
    }

    /* JADX INFO: renamed from: r */
    public static List m202844r(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static void m202846t(vuo0 vuo0Var, List list) {
        vuo0Var.pagerData.clear();
        List<r6s> list2 = vuo0Var.pagerData;
        list.getClass();
        list2.addAll(list);
        vuo0Var.success("TYPE_LOAD_ALL");
    }

    /* JADX INFO: renamed from: u */
    public static List m202847u(Function0 function0) {
        return (List) function0.invoke();
    }

    /* JADX INFO: renamed from: w */
    public static void m202849w(vuo0 vuo0Var) {
        vuo0Var.complete();
    }

    /* JADX INFO: renamed from: y */
    public static void m202851y(vuo0 vuo0Var, Throwable th) {
        vsn0 vsn0Var = vsn0.INSTANCE;
        th.getClass();
        vsn0Var.m202641a(th);
        vuo0Var.error(th);
    }

    /* JADX INFO: renamed from: z */
    public static Function0 m202852z(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Function0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: G */
    public final void m202853G(List<? extends r6s> feeds) {
        int size = feeds.size();
        for (int i = 0; i < size; i++) {
            r6s r6sVar = feeds.get(i);
            if (m202857K(r6sVar)) {
                bwp bwpVarM180025i = r6sVar.m180025i();
                awp.Companion companion = awp.INSTANCE;
                BLiveVoiceRoomFeed bLiveVoiceRoomFeedM106730c = bwpVarM180025i.m106730c();
                bLiveVoiceRoomFeedM106730c.getClass();
                bwpVarM180025i.m106738k(companion.m100681e(i, bLiveVoiceRoomFeedM106730c, this.voiceTab));
                if (this.isWhiteTheme) {
                    bwpVarM180025i.m106739l(companion.m100683g());
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m202854H(bwp cardData, int i) {
        awp.Companion companion = awp.INSTANCE;
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM106730c = cardData.m106730c();
        bLiveVoiceRoomFeedM106730c.getClass();
        cardData.m106738k(companion.m100681e(i, bLiveVoiceRoomFeedM106730c, this.voiceTab));
        if (this.isWhiteTheme) {
            cardData.m106739l(companion.m100683g());
        }
    }

    /* JADX INFO: renamed from: I */
    public final List<String> m202855I() {
        bwp bwpVarM180025i;
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM106730c;
        String str;
        ArrayList arrayList = new ArrayList();
        for (r6s r6sVar : this.pagerData) {
            if (m202857K(r6sVar) && (bwpVarM180025i = r6sVar.m180025i()) != null && (bLiveVoiceRoomFeedM106730c = bwpVarM180025i.m106730c()) != null && (str = bLiveVoiceRoomFeedM106730c.liveId) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<r6s> m202856J() {
        return this.pagerData;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m202857K(r6s cardData) {
        return cardData.m180020d() == 3001 || cardData.m180020d() == 3002;
    }

    /* JADX INFO: renamed from: L */
    public final void m202858L() {
        if (Intrinsics.m88377d(this.voiceTab.f45361id, b5p0.f75083d)) {
            m202860O();
        } else {
            m202821N(this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m202859M(String order) {
        BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
        C22421c<kfn0> liveListInTopic = IntlLiveVoiceApi.getLiveListInTopic(bLiveVoiceTab.source, bLiveVoiceTab.f45361id, -1L, 30, "");
        liveListInTopic.getClass();
        C22421c c22421cDuringCreated = duringCreated(liveListInTopic);
        final Function1 function1 = new Function1() { // from class: l.suo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vuo0.m202840n(this.f170704a, (kfn0) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.tuo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vuo0.m202844r(function1, obj);
            }
        }).subscribe(dhw.m115827f(new y20() { // from class: l.uuo0
            @Override // p153l.y20
            public final void call(Object obj) {
                vuo0.m202836j(this.f181085a, (List) obj);
            }
        }, new y20() { // from class: l.vto0
            @Override // p153l.y20
            public final void call(Object obj) {
                vuo0.m202833g(this.f185733a, (Throwable) obj);
            }
        }, new x20() { // from class: l.wto0
            @Override // p153l.x20
            public final void call() {
                vuo0.m202842p(this.f190799a);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public final void m202860O() {
        BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
        C22421c<kfn0> liveListInTopic = IntlLiveVoiceApi.getLiveListInTopic(bLiveVoiceTab.source, bLiveVoiceTab.f45361id, -1L, 30, "");
        C22421c<vpn0> intlVoiceRoomSquareShipLinks = IntlLiveVoiceApi.getIntlVoiceRoomSquareShipLinks();
        C22421c<List<BLiveVoiceFeedBanners>> intlVoiceRoomSquareBanners = IntlLiveVoiceApi.getIntlVoiceRoomSquareBanners();
        C22421c<LiveCampaignTemplateDetail> campaignTemplate = IntlLiveVoiceApi.getCampaignTemplate();
        final Function4 function4 = new Function4() { // from class: l.uto0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return vuo0.m202841o(this.f180982a, (kfn0) obj, (vpn0) obj2, (List) obj3, (LiveCampaignTemplateDetail) obj4);
            }
        };
        C22421c c22421cCombineLatest = C22421c.combineLatest(liveListInTopic, intlVoiceRoomSquareShipLinks, intlVoiceRoomSquareBanners, campaignTemplate, new tcj() { // from class: l.fuo0
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return vuo0.m202843q(function4, obj, obj2, obj3, obj4);
            }
        });
        c22421cCombineLatest.getClass();
        C22421c c22421cDuringCreated = duringCreated(c22421cCombineLatest);
        final Function1 function1 = new Function1() { // from class: l.nuo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vuo0.m202847u((Function0) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.ouo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vuo0.m202815A(function1, obj);
            }
        }).subscribe(dhw.m115827f(new y20() { // from class: l.puo0
            @Override // p153l.y20
            public final void call(Object obj) {
                vuo0.m202846t(this.f154208a, (List) obj);
            }
        }, new y20() { // from class: l.quo0
            @Override // p153l.y20
            public final void call(Object obj) {
                vuo0.m202851y(this.f159595a, (Throwable) obj);
            }
        }, new x20() { // from class: l.ruo0
            @Override // p153l.x20
            public final void call() {
                vuo0.m202849w(this.f164928a);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m202861Q() {
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
            C22421c<kfn0> liveListInTopicNextPage = IntlLiveVoiceApi.getLiveListInTopicNextPage(pagination, bLiveVoiceTab.source, bLiveVoiceTab.f45361id, "");
            liveListInTopicNextPage.getClass();
            C22421c c22421cDuringCreated = duringCreated(liveListInTopicNextPage);
            final Function1 function1 = new Function1() { // from class: l.huo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vuo0.m202823R(this.f111687a, (kfn0) obj);
                }
            };
            C22421c map = c22421cDuringCreated.map(new qcj() { // from class: l.iuo0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vuo0.m202824S(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.juo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vuo0.m202825T(this.f122730a, (List) obj);
                }
            };
            map.subscribe(new y20() { // from class: l.kuo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vuo0.m202826U(function2, obj);
                }
            }, new y20() { // from class: l.luo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vuo0.m202827V(this.f133638a, (Throwable) obj);
                }
            }, new x20() { // from class: l.muo0
                @Override // p153l.x20
                public final void call() {
                    vuo0.m202828W(this.f138831a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m202862X() {
        List<String> listM202855I = m202855I();
        if (listM202855I.isEmpty()) {
            return;
        }
        BLiveVoiceTab bLiveVoiceTab = this.voiceTab;
        C22421c<bkj0<List<String>, kfn0, String>> c22421cRefreshSwipTopicRooms = IntlVoiceCenterApiProvider.refreshSwipTopicRooms(listM202855I, bLiveVoiceTab.f45361id, bLiveVoiceTab.source);
        C22421c<vpn0> c22421cM202864c0 = m202864c0();
        C22421c<LiveCampaignTemplateDetail> c22421cM202863b0 = m202863b0();
        final Function3 function3 = new Function3() { // from class: l.xto0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return vuo0.m202820F(this.f196235a, (bkj0) obj, (vpn0) obj2, (LiveCampaignTemplateDetail) obj3);
            }
        };
        C22421c c22421cCombineLatest = C22421c.combineLatest(c22421cRefreshSwipTopicRooms, c22421cM202864c0, c22421cM202863b0, new scj() { // from class: l.yto0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return vuo0.m202852z(function3, obj, obj2, obj3);
            }
        });
        c22421cCombineLatest.getClass();
        C22421c c22421cDuringCreated = duringCreated(c22421cCombineLatest);
        final Function1 function1 = new Function1() { // from class: l.zto0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vuo0.m202839m((Function0) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.auo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vuo0.m202817C(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.buo0
            @Override // p153l.y20
            public final void call(Object obj) {
                vuo0.m202818D(this.f78531a, (wxp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public final C22421c<LiveCampaignTemplateDetail> m202863b0() {
        C22421c<LiveCampaignTemplateDetail> campaignTemplate = IntlLiveVoiceApi.getCampaignTemplate();
        campaignTemplate.getClass();
        return duringCreated(campaignTemplate);
    }

    /* JADX INFO: renamed from: c0 */
    public final C22421c<vpn0> m202864c0() {
        if (Intrinsics.m88377d(this.voiceTab.source, "recommend")) {
            C22421c<vpn0> intlVoiceRoomSquareShipLinks = IntlLiveVoiceApi.getIntlVoiceRoomSquareShipLinks();
            intlVoiceRoomSquareShipLinks.getClass();
            return duringCreated(intlVoiceRoomSquareShipLinks);
        }
        C22421c<vpn0> c22421cJust = C22421c.just(new vpn0(this.isWhiteTheme, new ArrayList(), new ArrayList()));
        c22421cJust.getClass();
        return c22421cJust;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m202865d0(boolean z) {
        this.isWhiteTheme = z;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() {
        loading();
        m202858L();
    }
}
