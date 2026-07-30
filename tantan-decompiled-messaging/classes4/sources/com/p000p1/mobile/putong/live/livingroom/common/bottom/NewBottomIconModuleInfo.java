package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButtonDivision;
import com.p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveSettingButton;
import com.p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
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
import l.e30;
import l.vwb;
import l.w9j;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.fs3;
import p002l.ge3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0!j\b\u0012\u0004\u0012\u00020\u000e`\"2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b)\u0010\u0010J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010,\u001a\u0012\u0012\u0004\u0012\u00020+0!j\b\u0012\u0004\u0012\u00020+`\"H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0003\u0010\u000bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R'\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R'\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000e0!j\b\u0012\u0004\u0012\u00020\u000e`\"8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010-R'\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u000e0!j\b\u0012\u0004\u0012\u00020\u000e`\"8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010-R'\u0010D\u001a\u0012\u0012\u0004\u0012\u00020+0!j\b\u0012\u0004\u0012\u00020+`\"8\u0006¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\bC\u0010-¨\u0006F"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo;", "", "", "isAnchor", "<init>", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;", "menu", "l", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;)Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo;", "o", "()Z", "p", "", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "t", "()Ljava/util/List;", "", "n", "()Ljava/lang/String;", "", "w", "()V", "k", "()Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo;", "", "", "zone", "initSize", "Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;", "area", "Ll/e30;", "extraAction", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "m", "(Ljava/util/List;ILcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;Ll/e30;)Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "type", "y", "(Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;)Z", "f", "h", "Ll/fs3;", "i", "()Ljava/util/ArrayList;", "a", "Z", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;", "v", "()Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;", "setMenu", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomMenu;)V", "", "c", "Lkotlin/Lazy;", "s", "()Ljava/util/Map;", "bottomButtonUtilMap", "d", "Ljava/util/ArrayList;", "q", "aAreaList", "e", "r", "bAreaList", "u", "cAreaList", "Area", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class NewBottomIconModuleInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isAnchor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public BLiveBottomMenu menu;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy bottomButtonUtilMap = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.mh20
        public final Object invoke() {
            return NewBottomIconModuleInfo.m5634a();
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
    public final ArrayList<fs3> cAreaList = new ArrayList<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/bottom/NewBottomIconModuleInfo$Area;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "BOTTOM", "SETTING", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Area {
        INPUT,
        BOTTOM,
        SETTING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<Area> getEntries() {
            return $ENTRIES;
        }
    }

    public NewBottomIconModuleInfo(boolean z) {
        this.isAnchor = z;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m5634a() {
        return new HashMap();
    }

    /* JADX INFO: renamed from: d */
    public static void m5637d(NewBottomIconModuleInfo newBottomIconModuleInfo, e30 e30Var, Area area, ArrayList arrayList, int i) {
        BLiveBottomButton bLiveBottomButton = newBottomIconModuleInfo.m5653s().get(Integer.valueOf(i));
        if (bLiveBottomButton != null) {
            ge3.m13760a(bLiveBottomButton);
            if (e30Var != null) {
                e30Var.call(bLiveBottomButton);
            }
            BLiveButtonType bLiveButtonType = bLiveBottomButton.localType;
            bLiveButtonType.getClass();
            if (newBottomIconModuleInfo.m5658y(bLiveButtonType, area)) {
                arrayList.add(bLiveBottomButton);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m5639g(BLiveBottomButton bLiveBottomButton) {
        bLiveBottomButton.getClass();
        if (TEnum.equals(bLiveBottomButton.localType, "callButton")) {
            bLiveBottomButton.localType = BLiveButtonType.get("callButtonInput");
        } else if (TEnum.equals(bLiveBottomButton.localType, "multiCallButton")) {
            bLiveBottomButton.localType = BLiveButtonType.get("multiCallButtonInput");
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m5640j(BLiveBottomButton bLiveBottomButton, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        bLiveSettingButtonCategory.getClass();
        return Boolean.valueOf(bLiveSettingButtonCategory.id == bLiveBottomButton.category);
    }

    /* JADX INFO: renamed from: x */
    public static final void m5641x(NewBottomIconModuleInfo newBottomIconModuleInfo, BLiveBottomButton bLiveBottomButton) {
        newBottomIconModuleInfo.m5653s().put(Integer.valueOf(bLiveBottomButton.id), bLiveBottomButton);
    }

    /* JADX INFO: renamed from: f */
    public final List<BLiveBottomButton> m5642f() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenu.menu;
        List<Integer> list = bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.inputZone : null;
        list.getClass();
        return m5647m(list, 1, Area.INPUT, new e30() { // from class: l.oh20
            public final void call(Object obj) {
                NewBottomIconModuleInfo.m5639g((BLiveBottomButton) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final List<BLiveBottomButton> m5643h() {
        BLiveSettingButton bLiveSettingButton;
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenu.menu;
        List<Integer> list = bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.quickZone : null;
        list.getClass();
        ArrayList<BLiveBottomButton> arrayListM5647m = m5647m(list, 6, Area.BOTTOM, null);
        if (bLiveBottomMenu.enableSettingButton && (bLiveSettingButton = bLiveBottomMenu.settingButton) != null) {
            BLiveBottomButton bLiveBottomButtonNew_ = BLiveBottomButton.new_();
            bLiveBottomButtonNew_.name = bLiveSettingButton.name;
            bLiveBottomButtonNew_.icon.add(bLiveSettingButton.icon);
            bLiveBottomButtonNew_.type = "more";
            bLiveBottomButtonNew_.localType = BLiveButtonType.get("settingButton");
            bLiveBottomButtonNew_.url = "tantanapp://live/room/setting";
            bLiveBottomButtonNew_.animation = bLiveSettingButton.animation;
            arrayListM5647m.add(bLiveBottomButtonNew_);
        }
        return arrayListM5647m;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList<fs3> m5644i() {
        ArrayList<fs3> arrayList = new ArrayList<>();
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        BLiveBottomButtonDivision bLiveBottomButtonDivision = bLiveBottomMenu.menu;
        if (!vwb.J(bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.settingZone : null)) {
            BLiveBottomButtonDivision bLiveBottomButtonDivision2 = bLiveBottomMenu.menu;
            List list = bLiveBottomButtonDivision2 != null ? bLiveBottomButtonDivision2.settingZone : null;
            list.getClass();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                BLiveBottomButtonDivision bLiveBottomButtonDivision3 = bLiveBottomMenu.menu;
                List list2 = bLiveBottomButtonDivision3 != null ? bLiveBottomButtonDivision3.settingZone : null;
                list2.getClass();
                final BLiveBottomButton bLiveBottomButton = m5653s().get((Integer) list2.get(i));
                if (bLiveBottomButton != null) {
                    ge3.m13760a(bLiveBottomButton);
                    BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) vwb.r(bLiveBottomMenu.categorys, new w9j() { // from class: l.ph20
                        public final Object call(Object obj) {
                            return NewBottomIconModuleInfo.m5640j(bLiveBottomButton, (BLiveSettingButtonCategory) obj);
                        }
                    });
                    if (bLiveSettingButtonCategory != null) {
                        BLiveButtonType bLiveButtonType = bLiveBottomButton.localType;
                        bLiveButtonType.getClass();
                        if (m5658y(bLiveButtonType, Area.SETTING)) {
                            arrayList.add(new fs3().m13468e(bLiveBottomButton).m13466c(i).m13465b(bLiveSettingButtonCategory.sort).m13464a(bLiveSettingButtonCategory.name).m13467d(bLiveSettingButtonCategory.type));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final NewBottomIconModuleInfo m5645k() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        BLiveBottomMenu bLiveBottomMenuNew_ = BLiveBottomMenu.new_();
        ArrayList arrayList = new ArrayList();
        BLiveBottomButton bLiveBottomButtonNew_ = BLiveBottomButton.new_();
        bLiveBottomButtonNew_.id = 1;
        bLiveBottomButtonNew_.localType = BLiveButtonType.get("fastGiftButton");
        bLiveBottomButtonNew_.url = "tantanapp://live/room/quickGift";
        arrayList.add(bLiveBottomButtonNew_);
        BLiveBottomButton bLiveBottomButtonNew_2 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_2.id = 2;
        bLiveBottomButtonNew_2.localType = BLiveButtonType.get("giftButton");
        bLiveBottomButtonNew_2.url = "tantanapp://live/room/showGiftDialog";
        arrayList.add(bLiveBottomButtonNew_2);
        BLiveBottomButton bLiveBottomButtonNew_3 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_3.id = 3;
        bLiveBottomButtonNew_3.localType = BLiveButtonType.get("pkButton");
        bLiveBottomButtonNew_3.url = "tantanapp://live/room/pkButton";
        arrayList.add(bLiveBottomButtonNew_3);
        BLiveBottomButton bLiveBottomButtonNew_4 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_4.id = 4;
        bLiveBottomButtonNew_4.localType = BLiveButtonType.get("beauty");
        bLiveBottomButtonNew_4.url = "tantanapp://live/room/beauty";
        bLiveBottomButtonNew_4.name = ypv.e.getString(R$string.f3243e);
        arrayList.add(bLiveBottomButtonNew_4);
        BLiveBottomButton bLiveBottomButtonNew_5 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_5.id = 5;
        bLiveBottomButtonNew_5.localType = BLiveButtonType.get("switchCamera");
        bLiveBottomButtonNew_5.url = "tantanapp://live/room/switchCamera";
        bLiveBottomButtonNew_5.name = ypv.e.getString(R$string.f3287g);
        arrayList.add(bLiveBottomButtonNew_5);
        BLiveBottomButton bLiveBottomButtonNew_6 = BLiveBottomButton.new_();
        bLiveBottomButtonNew_6.id = 23;
        bLiveBottomButtonNew_6.localType = BLiveButtonType.get("chatManager");
        bLiveBottomButtonNew_6.url = "tantanapp://live/room/chatManage";
        bLiveBottomButtonNew_6.name = ypv.e.getString(R$string.f3001Sd);
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
        m5657w();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final NewBottomIconModuleInfo m5646l(@NotNull BLiveBottomMenu menu) {
        menu.getClass();
        this.menu = menu;
        m5657w();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList<BLiveBottomButton> m5647m(List<Integer> zone, int initSize, final Area area, final e30<BLiveBottomButton> extraAction) {
        final ArrayList<BLiveBottomButton> arrayList = new ArrayList<>(initSize);
        vwb.z(zone, new e30() { // from class: com.p1.mobile.putong.live.livingroom.common.bottom.a
            public final void call(Object obj) {
                NewBottomIconModuleInfo.m5637d(this.f4604a, extraAction, area, arrayList, ((Integer) obj).intValue());
            }
        });
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final String m5648n() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.redDotDisappearMod;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5649o() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.enableInputButton;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5650p() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.enableSettingButton;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ArrayList<BLiveBottomButton> m5651q() {
        return this.aAreaList;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final ArrayList<BLiveBottomButton> m5652r() {
        return this.bAreaList;
    }

    /* JADX INFO: renamed from: s */
    public final Map<Integer, BLiveBottomButton> m5653s() {
        return (Map) this.bottomButtonUtilMap.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final List<BLiveBottomButton> m5654t() {
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        return bLiveBottomMenu.buttons;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ArrayList<fs3> m5655u() {
        return this.cAreaList;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final BLiveBottomMenu getMenu() {
        return this.menu;
    }

    /* JADX INFO: renamed from: w */
    public final void m5657w() {
        m5653s().clear();
        BLiveBottomMenu bLiveBottomMenu = this.menu;
        bLiveBottomMenu.getClass();
        List list = bLiveBottomMenu.buttons;
        if (list != null) {
            vwb.z(list, new e30() { // from class: l.nh20
                public final void call(Object obj) {
                    NewBottomIconModuleInfo.m5641x(this.f16033a, (BLiveBottomButton) obj);
                }
            });
        }
        this.aAreaList.clear();
        this.aAreaList.addAll(m5642f());
        this.bAreaList.clear();
        this.bAreaList.addAll(m5643h());
        this.cAreaList.clear();
        this.cAreaList.addAll(m5644i());
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5658y(BLiveButtonType type, Area area) {
        if (TEnum.equals(type, "ear")) {
            return false;
        }
        if (TEnum.equals(type, "pkButton") || TEnum.equals(type, "multiCallPkButton") || TEnum.equals(type, "beauty") || TEnum.equals(type, "switchCamera") || TEnum.equals(type, "sticker") || TEnum.equals(type, "guideGift")) {
            return this.isAnchor;
        }
        if (TEnum.equals(type, "callButtonInput") || TEnum.equals(type, "multiCallButtonInput")) {
            return area == Area.INPUT && !this.isAnchor;
        }
        if (TEnum.equals(type, "unknown_") || TEnum.equals(type, "giftButton") || TEnum.equals(type, "giftResourceStatus")) {
            return true;
        }
        if (TEnum.equals(type, "magicGesture")) {
            return ypv.k().f7() && this.isAnchor;
        }
        if (TEnum.equals(type, "firstRechargeButton")) {
            return area == Area.INPUT || area == Area.BOTTOM;
        }
        if (TEnum.equals(type, "summonFans")) {
            return ypv.k().lb() && area == Area.SETTING;
        }
        return !(TEnum.equals(type, "settingButton") || TEnum.equals(type, "fastGiftButton") || TEnum.equals(type, "newUserTreasureBoxButton") || TEnum.equals(type, "dice")) || area == Area.BOTTOM;
    }
}
