package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButtonDivision;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButton;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gb3 {

    /* JADX INFO: renamed from: a */
    public BLiveSettingButton f101791a;

    /* JADX INFO: renamed from: b */
    public List<BLiveBubbleConfig> f101792b;

    /* JADX INFO: renamed from: c */
    public List<BLiveBottomButton> f101793c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSettingButtonCategory> f101794d;

    /* JADX INFO: renamed from: e */
    public BLiveBottomButtonDivision f101795e;

    /* JADX INFO: renamed from: f */
    public List<String> f101796f;

    /* JADX INFO: renamed from: g */
    public String f101797g;

    /* JADX INFO: renamed from: h */
    public boolean f101798h;

    /* JADX INFO: renamed from: i */
    public int f101799i;

    /* JADX INFO: renamed from: j */
    public boolean f101800j;

    /* JADX INFO: renamed from: k */
    public boolean f101801k;

    /* JADX INFO: renamed from: l */
    public boolean f101802l;

    /* JADX INFO: renamed from: m */
    public List<BLiveChatBox> f101803m;

    public gb3(BLiveBottomMenu bLiveBottomMenu) {
        this.f101791a = bLiveBottomMenu.settingButton;
        this.f101793c = bLiveBottomMenu.buttons;
        this.f101794d = bLiveBottomMenu.categorys;
        this.f101795e = bLiveBottomMenu.menu;
        this.f101796f = bLiveBottomMenu.bubbleOrder;
        this.f101797g = bLiveBottomMenu.redDotDisappearMod;
        this.f101798h = bLiveBottomMenu.userEnableBubble;
        this.f101799i = bLiveBottomMenu.everyDayShowMaxCount;
        this.f101800j = bLiveBottomMenu.enableSettingButton;
        this.f101801k = bLiveBottomMenu.enableInputButton;
        this.f101792b = bLiveBottomMenu.bubbles;
        this.f101803m = bLiveBottomMenu.chatBox;
        this.f101802l = bLiveBottomMenu.enableLatestPlayButton;
    }

    /* JADX INFO: renamed from: a */
    public static gb3 m125116a(boolean z) {
        BLiveBottomMenu bLiveBottomMenu = new BLiveBottomMenu();
        bLiveBottomMenu.buttons = new ArrayList();
        BLiveBottomButtonDivision bLiveBottomButtonDivisionNew_ = BLiveBottomButtonDivision.new_();
        bLiveBottomMenu.menu = bLiveBottomButtonDivisionNew_;
        if (z) {
            BLiveSettingButtonCategory bLiveSettingButtonCategoryNew_ = BLiveSettingButtonCategory.new_();
            bLiveSettingButtonCategoryNew_.name = "";
            bLiveSettingButtonCategoryNew_.sort = 0;
            ArrayList arrayList = new ArrayList(1);
            bLiveBottomMenu.categorys = arrayList;
            arrayList.add(bLiveSettingButtonCategoryNew_);
            bLiveBottomMenu.menu.quickZone.add(3);
            bLiveBottomMenu.menu.quickZone.add(1);
            bLiveBottomMenu.menu.quickZone.add(2);
            bLiveBottomMenu.menu.settingZone.add(4);
            bLiveBottomMenu.menu.settingZone.add(5);
            bLiveBottomMenu.menu.settingZone.add(23);
            bLiveBottomMenu.enableSettingButton = false;
            bLiveBottomMenu.redDotDisappearMod = "layered";
        } else {
            bLiveBottomButtonDivisionNew_.quickZone.add(1);
            bLiveBottomMenu.menu.quickZone.add(2);
        }
        return new gb3(bLiveBottomMenu);
    }
}
