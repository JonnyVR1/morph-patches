package p002l;

import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButtonDivision;
import com.p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p1.mobile.putong.live.base.data.BLiveSettingButton;
import com.p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gb3 {

    /* JADX INFO: renamed from: a */
    public BLiveSettingButton f11332a;

    /* JADX INFO: renamed from: b */
    public List<BLiveBubbleConfig> f11333b;

    /* JADX INFO: renamed from: c */
    public List<BLiveBottomButton> f11334c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSettingButtonCategory> f11335d;

    /* JADX INFO: renamed from: e */
    public BLiveBottomButtonDivision f11336e;

    /* JADX INFO: renamed from: f */
    public List<String> f11337f;

    /* JADX INFO: renamed from: g */
    public String f11338g;

    /* JADX INFO: renamed from: h */
    public boolean f11339h;

    /* JADX INFO: renamed from: i */
    public int f11340i;

    /* JADX INFO: renamed from: j */
    public boolean f11341j;

    /* JADX INFO: renamed from: k */
    public boolean f11342k;

    /* JADX INFO: renamed from: l */
    public boolean f11343l;

    /* JADX INFO: renamed from: m */
    public List<BLiveChatBox> f11344m;

    public gb3(BLiveBottomMenu bLiveBottomMenu) {
        this.f11332a = bLiveBottomMenu.settingButton;
        this.f11334c = bLiveBottomMenu.buttons;
        this.f11335d = bLiveBottomMenu.categorys;
        this.f11336e = bLiveBottomMenu.menu;
        this.f11337f = bLiveBottomMenu.bubbleOrder;
        this.f11338g = bLiveBottomMenu.redDotDisappearMod;
        this.f11339h = bLiveBottomMenu.userEnableBubble;
        this.f11340i = bLiveBottomMenu.everyDayShowMaxCount;
        this.f11341j = bLiveBottomMenu.enableSettingButton;
        this.f11342k = bLiveBottomMenu.enableInputButton;
        this.f11333b = bLiveBottomMenu.bubbles;
        this.f11344m = bLiveBottomMenu.chatBox;
        this.f11343l = bLiveBottomMenu.enableLatestPlayButton;
    }

    /* JADX INFO: renamed from: a */
    public static gb3 m13703a(boolean z) {
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
