package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButtonDivision;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButton;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.et3;
import p153l.jyb;
import p153l.qcj;
import p153l.ve3;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0!j\b\u0012\u0004\u0012\u00020\u000e`\"2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b)\u0010\u0010J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010,\u001a\u0012\u0012\u0004\u0012\u00020+0!j\b\u0012\u0004\u0012\u00020+`\"H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0003\u0010\u000bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R'\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R'\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000e0!j\b\u0012\u0004\u0012\u00020\u000e`\"8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010-R'\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u000e0!j\b\u0012\u0004\u0012\u00020\u000e`\"8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010-R'\u0010D\u001a\u0012\u0012\u0004\u0012\u00020+0!j\b\u0012\u0004\u0012\u00020+`\"8\u0006¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\bC\u0010-¨\u0006F"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo;", "", "", "isAnchor", "<init>", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;", NavigationIntent.menu, BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;)Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo;", "o", "()Z", "p", "", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", Constants.KEY_T, "()Ljava/util/List;", "", "n", "()Ljava/lang/String;", "", "w", "()V", "k", "()Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo;", "", "", "zone", "initSize", "Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;", "area", "Ll/y20;", "extraAction", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "m", "(Ljava/util/List;ILcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;Ll/y20;)Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "type", BaseSei.f14625Y, "(Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;)Z", "f", "h", "Ll/et3;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/ArrayList;", "a", "Z", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;", "setMenu", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;)V", "", "c", "Lkotlin/Lazy;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ljava/util/Map;", "bottomButtonUtilMap", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "q", "aAreaList", "e", "r", "bAreaList", "u", "cAreaList", "Area", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class NewBottomIconModuleInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isAnchor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveBottomMenu menu;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy bottomButtonUtilMap = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.wp20
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewBottomIconModuleInfo.m73344a();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<BLiveBottomButton> aAreaList = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<BLiveBottomButton> bAreaList = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<et3> cAreaList = new ArrayList<>();

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "BOTTOM", "SETTING", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum Area {
        INPUT,
        BOTTOM,
        SETTING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<Area> getEntries() {
            return $ENTRIES;
        }
    }

    public NewBottomIconModuleInfo(boolean z) {
        this.isAnchor = z;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m73344a() {
        return new HashMap();
    }

    /* JADX INFO: renamed from: d */
    public static void m73347d(NewBottomIconModuleInfo newBottomIconModuleInfo, y20 y20Var, Area area, ArrayList arrayList, int i) {
        BLiveBottomButton bLiveBottomButton = newBottomIconModuleInfo.m73363s().get(Integer.valueOf(i));
        if (bLiveBottomButton != null) {
            ve3.m201031a(bLiveBottomButton);
            if (y20Var != null) {
                y20Var.call(bLiveBottomButton);
            }
            BLiveButtonType bLiveButtonType = bLiveBottomButton.localType;
            bLiveButtonType.getClass();
            if (newBottomIconModuleInfo.m73368y(bLiveButtonType, area)) {
                arrayList.add(bLiveBottomButton);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m73349g(BLiveBottomButton bLiveBottomButton) {
        bLiveBottomButton.getClass();
        if (TEnum.equals(bLiveBottomButton.localType, BLiveButtonType.callButton)) {
            bLiveBottomButton.localType = BLiveButtonType.get(BLiveButtonType.callButtonInput);
        } else if (TEnum.equals(bLiveBottomButton.localType, BLiveButtonType.multiCallButton)) {
            bLiveBottomButton.localType = BLiveButtonType.get(BLiveButtonType.multiCallButtonInput);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m73350j(BLiveBottomButton bLiveBottomButton, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        bLiveSettingButtonCategory.getClass();
        return Boolean.valueOf(bLiveSettingButtonCategory.f45283id == bLiveBottomButton.category);
    }

    /* JADX INFO: renamed from: x */
    public static final void m73351x(NewBottomIconModuleInfo newBottomIconModuleInfo, BLiveBottomButton bLiveBottomButton) {
        newBottomIconModuleInfo.m73363s().put(Integer.valueOf(bLiveBottomButton.f45187id), bLiveBottomButton);
    }

    /* JADX INFO: renamed from: f */
    public final List<BLiveBottomButton> m73352f() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenu.menu;
        List<Integer> list = bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.inputZone : null;
        list.getClass();
        return m73357m(list, 1, Area.INPUT, new y20() { // from class: l.yp20
            @Override // p153l.y20
            public final void call(Object obj) {
                NewBottomIconModuleInfo.m73349g((BLiveBottomButton) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final List<BLiveBottomButton> m73353h() {
        BLiveSettingButton bLiveSettingButton;
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenu.menu;
        List<Integer> list = bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.quickZone : null;
        list.getClass();
        ArrayList<BLiveBottomButton> arrayListM73357m = m73357m(list, 6, Area.BOTTOM, null);
        if (bLiveBottomMenu.enableSettingButton && (bLiveSettingButton = bLiveBottomMenu.settingButton) != null) {
            BLiveBottomButton bLiveBottomButtonNew_ = BLiveBottomButton.new_();
            bLiveBottomButtonNew_.name = bLiveSettingButton.name;
            bLiveBottomButtonNew_.icon.add(bLiveSettingButton.icon);
            bLiveBottomButtonNew_.type = "more";
            bLiveBottomButtonNew_.localType = BLiveButtonType.get("settingButton");
            bLiveBottomButtonNew_.url = "tantanapp://live/room/setting";
            bLiveBottomButtonNew_.animation = bLiveSettingButton.animation;
            arrayListM73357m.add(bLiveBottomButtonNew_);
        }
        return arrayListM73357m;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList<et3> m73354i() {
        ArrayList<et3> arrayList = new ArrayList<>();
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenu.menu;
        if (!jyb.m147479J(bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.settingZone : null)) {
            BLiveBottomButtonDivision bLiveBottomButtonDivision2 = bLiveBottomMenu.menu;
            List<Integer> list = bLiveBottomButtonDivision2 != null ? bLiveBottomButtonDivision2.settingZone : null;
            list.getClass();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                BLiveBottomButtonDivision bLiveBottomButtonDivision3 = bLiveBottomMenu.menu;
                List<Integer> list2 = bLiveBottomButtonDivision3 != null ? bLiveBottomButtonDivision3.settingZone : null;
                list2.getClass();
                final BLiveBottomButton bLiveBottomButton = m73363s().get(list2.get(i));
                if (bLiveBottomButton != null) {
                    ve3.m201031a(bLiveBottomButton);
                    BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) jyb.m147529r(bLiveBottomMenu.categorys, new qcj() { // from class: l.zp20
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return NewBottomIconModuleInfo.m73350j(bLiveBottomButton, (BLiveSettingButtonCategory) obj);
                        }
                    });
                    if (bLiveSettingButtonCategory != null) {
                        BLiveButtonType bLiveButtonType = bLiveBottomButton.localType;
                        bLiveButtonType.getClass();
                        if (m73368y(bLiveButtonType, Area.SETTING)) {
                            arrayList.add(new et3().m122413e(bLiveBottomButton).m122411c(i).m122410b(bLiveSettingButtonCategory.sort).m122409a(bLiveSettingButtonCategory.name).m122412d(bLiveSettingButtonCategory.type));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final NewBottomIconModuleInfo m73355k() {
        List<Integer> list;
        List<Integer> list2;
        List<Integer> list3;
        List<Integer> list4;
        List<Integer> list5;
        List<Integer> list6;
        List<Integer> list7;
        BLiveBottomMenu bLiveBottomMenuNew_ = BLiveBottomMenu.new_();
        ArrayList arrayList = new ArrayList();
        BLiveBottomButton bLiveBottomButtonNew_ = BLiveBottomButton.new_();
        bLiveBottomButtonNew_.f45187id = 1;
        bLiveBottomButtonNew_.localType = BLiveButtonType.get("fastGiftButton");
        bLiveBottomButtonNew_.url = "tantanapp://live/room/quickGift";
        arrayList.add(bLiveBottomButtonNew_);
        BLiveBottomButton bLiveBottomButtonNew_2 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_2.f45187id = 2;
        bLiveBottomButtonNew_2.localType = BLiveButtonType.get("giftButton");
        bLiveBottomButtonNew_2.url = "tantanapp://live/room/showGiftDialog";
        arrayList.add(bLiveBottomButtonNew_2);
        BLiveBottomButton bLiveBottomButtonNew_3 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_3.f45187id = 3;
        bLiveBottomButtonNew_3.localType = BLiveButtonType.get(BLiveButtonType.pkButton);
        bLiveBottomButtonNew_3.url = "tantanapp://live/room/pkButton";
        arrayList.add(bLiveBottomButtonNew_3);
        BLiveBottomButton bLiveBottomButtonNew_4 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_4.f45187id = 4;
        bLiveBottomButtonNew_4.localType = BLiveButtonType.get("beauty");
        bLiveBottomButtonNew_4.url = "tantanapp://live/room/beauty";
        bLiveBottomButtonNew_4.name = zrv.f205803e.getString(R$string.f48049e);
        arrayList.add(bLiveBottomButtonNew_4);
        BLiveBottomButton bLiveBottomButtonNew_5 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_5.f45187id = 5;
        bLiveBottomButtonNew_5.localType = BLiveButtonType.get(BLiveButtonType.switchCamera);
        bLiveBottomButtonNew_5.url = "tantanapp://live/room/switchCamera";
        bLiveBottomButtonNew_5.name = zrv.f205803e.getString(R$string.f48093g);
        arrayList.add(bLiveBottomButtonNew_5);
        BLiveBottomButton bLiveBottomButtonNew_6 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_6.f45187id = 23;
        bLiveBottomButtonNew_6.localType = BLiveButtonType.get(BLiveButtonType.chatManager);
        bLiveBottomButtonNew_6.url = "tantanapp://live/room/chatManage";
        bLiveBottomButtonNew_6.name = zrv.f205803e.getString(R$string.f47807Sd);
        arrayList.add(bLiveBottomButtonNew_6);
        bLiveBottomMenuNew_.buttons = arrayList;
        BLiveBottomButtonDivision bLiveBottomButtonDivisionNew_ = BLiveBottomButtonDivision.new_();
        bLiveBottomMenuNew_.menu = bLiveBottomButtonDivisionNew_;
        if (this.isAnchor) {
            bLiveBottomMenuNew_.settingButton = BLiveSettingButton.new_();
            ArrayList arrayList2 = new ArrayList(1);
            BLiveSettingButtonCategory bLiveSettingButtonCategoryNew_ = BLiveSettingButtonCategory.new_();
            bLiveSettingButtonCategoryNew_.name = "";
            bLiveSettingButtonCategoryNew_.sort = 0;
            arrayList2.add(bLiveSettingButtonCategoryNew_);
            bLiveBottomMenuNew_.categorys = arrayList2;
            BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenuNew_.menu;
            if (bLiveBottomButtonDivision != null && (list7 = bLiveBottomButtonDivision.quickZone) != null) {
                list7.add(3);
            }
            BLiveBottomButtonDivision bLiveBottomButtonDivision2 = bLiveBottomMenuNew_.menu;
            if (bLiveBottomButtonDivision2 != null && (list6 = bLiveBottomButtonDivision2.quickZone) != null) {
                list6.add(1);
            }
            BLiveBottomButtonDivision bLiveBottomButtonDivision3 = bLiveBottomMenuNew_.menu;
            if (bLiveBottomButtonDivision3 != null && (list5 = bLiveBottomButtonDivision3.quickZone) != null) {
                list5.add(2);
            }
            BLiveBottomButtonDivision bLiveBottomButtonDivision4 = bLiveBottomMenuNew_.menu;
            if (bLiveBottomButtonDivision4 != null && (list4 = bLiveBottomButtonDivision4.settingZone) != null) {
                list4.add(4);
            }
            BLiveBottomButtonDivision bLiveBottomButtonDivision5 = bLiveBottomMenuNew_.menu;
            if (bLiveBottomButtonDivision5 != null && (list3 = bLiveBottomButtonDivision5.settingZone) != null) {
                list3.add(5);
            }
            bLiveBottomMenuNew_.enableSettingButton = true;
            bLiveBottomMenuNew_.redDotDisappearMod = "layered";
        } else {
            if (bLiveBottomButtonDivisionNew_ != null && (list2 = bLiveBottomButtonDivisionNew_.quickZone) != null) {
                list2.add(1);
            }
            BLiveBottomButtonDivision bLiveBottomButtonDivision6 = bLiveBottomMenuNew_.menu;
            if (bLiveBottomButtonDivision6 != null && (list = bLiveBottomButtonDivision6.quickZone) != null) {
                list.add(2);
            }
        }
        this.menu = bLiveBottomMenuNew_;
        m73367w();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final NewBottomIconModuleInfo m73356l(@NotNull BLiveBottomMenu menu) {
        menu.getClass();
        this.menu = menu;
        m73367w();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList<BLiveBottomButton> m73357m(List<Integer> zone, int initSize, final Area area, final y20<BLiveBottomButton> extraAction) {
        final ArrayList<BLiveBottomButton> arrayList = new ArrayList<>(initSize);
        jyb.m147537z(zone, new y20() { // from class: com.p1.mobile.putong.live.livingroom.common.bottom.a
            @Override // p153l.y20
            public final void call(Object obj) {
                NewBottomIconModuleInfo.m73347d(this.f49410a, extraAction, area, arrayList, ((Integer) obj).intValue());
            }
        });
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final String m73358n() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.redDotDisappearMod;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m73359o() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.enableInputButton;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m73360p() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.enableSettingButton;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ArrayList<BLiveBottomButton> m73361q() {
        return this.aAreaList;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final ArrayList<BLiveBottomButton> m73362r() {
        return this.bAreaList;
    }

    /* JADX INFO: renamed from: s */
    public final Map<Integer, BLiveBottomButton> m73363s() {
        return (Map) this.bottomButtonUtilMap.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final List<BLiveBottomButton> m73364t() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.buttons;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ArrayList<et3> m73365u() {
        return this.cAreaList;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final BLiveBottomMenu getMenu() {
        return this.menu;
    }

    /* JADX INFO: renamed from: w */
    public final void m73367w() {
        m73363s().clear();
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        List<BLiveBottomButton> list = bLiveBottomMenu.buttons;
        if (list != null) {
            jyb.m147537z(list, new y20() { // from class: l.xp20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NewBottomIconModuleInfo.m73351x(this.f195633a, (BLiveBottomButton) obj);
                }
            });
        }
        this.aAreaList.clear();
        this.aAreaList.addAll(m73352f());
        this.bAreaList.clear();
        this.bAreaList.addAll(m73353h());
        this.cAreaList.clear();
        this.cAreaList.addAll(m73354i());
    }

    /* JADX INFO: renamed from: y */
    public final boolean m73368y(BLiveButtonType type, Area area) {
        if (TEnum.equals(type, BLiveButtonType.ear)) {
            return false;
        }
        if (TEnum.equals(type, BLiveButtonType.pkButton) || TEnum.equals(type, BLiveButtonType.multiCallPkButton) || TEnum.equals(type, "beauty") || TEnum.equals(type, BLiveButtonType.switchCamera) || TEnum.equals(type, "sticker") || TEnum.equals(type, BLiveButtonType.guideGift)) {
            return this.isAnchor;
        }
        if (TEnum.equals(type, BLiveButtonType.callButtonInput) || TEnum.equals(type, BLiveButtonType.multiCallButtonInput)) {
            return area == Area.INPUT && !this.isAnchor;
        }
        if (TEnum.equals(type, "unknown_") || TEnum.equals(type, "giftButton") || TEnum.equals(type, BLiveButtonType.giftResourceStatus)) {
            return true;
        }
        if (TEnum.equals(type, BLiveButtonType.magicGesture)) {
            return zrv.m221193k().m203621f7() && this.isAnchor;
        }
        if (TEnum.equals(type, "firstRechargeButton")) {
            return area == Area.INPUT || area == Area.BOTTOM;
        }
        if (TEnum.equals(type, BLiveButtonType.summonFans)) {
            return zrv.m221193k().m203673lb() && area == Area.SETTING;
        }
        return !(TEnum.equals(type, "settingButton") || TEnum.equals(type, "fastGiftButton") || TEnum.equals(type, BLiveButtonType.newUserTreasureBoxButton) || TEnum.equals(type, BLiveButtonType.dice)) || area == Area.BOTTOM;
    }
}
