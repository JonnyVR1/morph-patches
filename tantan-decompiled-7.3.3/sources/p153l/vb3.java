package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButtonDivision;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButton;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vb3 {

    /* JADX INFO: renamed from: a */
    public BLiveSettingButton f183193a;

    /* JADX INFO: renamed from: b */
    public List<BLiveBubbleConfig> f183194b;

    /* JADX INFO: renamed from: c */
    public List<BLiveBottomButton> f183195c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSettingButtonCategory> f183196d;

    /* JADX INFO: renamed from: e */
    public BLiveBottomButtonDivision f183197e;

    /* JADX INFO: renamed from: f */
    public List<String> f183198f;

    /* JADX INFO: renamed from: g */
    public String f183199g;

    /* JADX INFO: renamed from: h */
    public boolean f183200h;

    /* JADX INFO: renamed from: i */
    public int f183201i;

    /* JADX INFO: renamed from: j */
    public boolean f183202j;

    /* JADX INFO: renamed from: k */
    public boolean f183203k;

    /* JADX INFO: renamed from: l */
    public boolean f183204l;

    /* JADX INFO: renamed from: m */
    public List<BLiveChatBox> f183205m;

    public vb3(BLiveBottomMenu bLiveBottomMenu) {
        this.f183193a = bLiveBottomMenu.settingButton;
        this.f183195c = bLiveBottomMenu.buttons;
        this.f183196d = bLiveBottomMenu.categorys;
        this.f183197e = bLiveBottomMenu.menu;
        this.f183198f = bLiveBottomMenu.bubbleOrder;
        this.f183199g = bLiveBottomMenu.redDotDisappearMod;
        this.f183200h = bLiveBottomMenu.userEnableBubble;
        this.f183201i = bLiveBottomMenu.everyDayShowMaxCount;
        this.f183202j = bLiveBottomMenu.enableSettingButton;
        this.f183203k = bLiveBottomMenu.enableInputButton;
        this.f183194b = bLiveBottomMenu.bubbles;
        this.f183205m = bLiveBottomMenu.chatBox;
        this.f183204l = bLiveBottomMenu.enableLatestPlayButton;
    }

    /* JADX INFO: renamed from: a */
    public static vb3 m200684a(boolean z) {
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
        return new vb3(bLiveBottomMenu);
    }
}
