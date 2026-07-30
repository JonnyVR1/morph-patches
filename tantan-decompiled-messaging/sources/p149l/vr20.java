package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.panel.NewGiftPanelItemView;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vr20 extends dac0<CoreGiftInfo> {

    /* JADX INFO: renamed from: d */
    public final rr20 f182694d;

    /* JADX INFO: renamed from: e */
    public NewGiftPanelItemView f182695e;

    /* JADX INFO: renamed from: g */
    public int f182697g;

    /* JADX INFO: renamed from: c */
    public List<CoreGiftInfo> f182693c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f182696f = 0;

    public vr20(rr20 rr20Var) {
        this.f182694d = rr20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m199612L(View view) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f182694d.m180538v().m122800N());
        if (NullChecker.m81303a(userM169430Pa)) {
            this.f182694d.m180528A();
            this.f182694d.m180542z(CoreModule.m29935P().m94658i().mo158415n3(!userM169430Pa.isFemale()));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f182693c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126339M, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final CoreGiftInfo coreGiftInfo, int i, final int i2) {
        final NewGiftPanelItemView newGiftPanelItemView = (NewGiftPanelItemView) view;
        boolean z = i2 == this.f182696f;
        newGiftPanelItemView.m45541m0(this.f182694d, coreGiftInfo, z, this.f182697g <= i2);
        if (z && this.f182695e == null) {
            this.f182695e = newGiftPanelItemView;
        }
        if (coreGiftInfo.quota == 0 || this.f182697g > i2) {
            xdl0.m208329E0(newGiftPanelItemView, new View.OnClickListener() { // from class: l.tr20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f171784a.m199612L(view2);
                }
            });
        } else {
            xdl0.m208329E0(newGiftPanelItemView, new View.OnClickListener() { // from class: l.sr20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f166040a.m199616K(newGiftPanelItemView, coreGiftInfo, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public void m199614I() {
        if (NullChecker.m81303a(this.f182695e)) {
            if (this.f182695e.isChecked()) {
                this.f182695e.toggle();
            }
            this.f182695e = null;
        }
        this.f182696f = 0;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CoreGiftInfo getItem(int i) {
        return this.f182693c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m199616K(NewGiftPanelItemView newGiftPanelItemView, CoreGiftInfo coreGiftInfo, int i, View view) {
        if (NullChecker.m81303a(newGiftPanelItemView.f29281n) && coreGiftInfo.f56011id.equals(newGiftPanelItemView.f29281n.f56011id)) {
            if (!NullChecker.m81303a(this.f182695e)) {
                boolean zEquals = TextUtils.equals(this.f182694d.m180538v().m122794F(), "from_meet_liked");
                rr20 rr20Var = this.f182694d;
                if (zEquals) {
                    zvf0.m220399u("e_chat_gift_bar_gift", rr20Var.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id), vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"));
                } else {
                    boolean zEquals2 = TextUtils.equals(rr20Var.m180538v().m122794F(), "from_meet_picks");
                    rr20 rr20Var2 = this.f182694d;
                    if (zEquals2) {
                        zvf0.m220399u("e_chat_gift_bar_gift", rr20Var2.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id), vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"));
                    } else {
                        zvf0.m220399u("e_chat_gift_bar_gift", rr20Var2.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
                    }
                }
                this.f182696f = i;
                this.f182695e = newGiftPanelItemView;
                if (newGiftPanelItemView.isChecked()) {
                    return;
                }
                this.f182695e.toggle();
                return;
            }
            if (this.f182696f != i) {
                boolean zEquals3 = TextUtils.equals(this.f182694d.m180538v().m122794F(), "from_meet_liked");
                rr20 rr20Var3 = this.f182694d;
                if (zEquals3) {
                    zvf0.m220399u("e_chat_gift_bar_gift", rr20Var3.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id), vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"));
                } else {
                    boolean zEquals4 = TextUtils.equals(rr20Var3.m180538v().m122794F(), "from_meet_picks");
                    rr20 rr20Var4 = this.f182694d;
                    if (zEquals4) {
                        zvf0.m220399u("e_chat_gift_bar_gift", rr20Var4.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id), vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"));
                    } else {
                        zvf0.m220399u("e_chat_gift_bar_gift", rr20Var4.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
                    }
                }
                if (this.f182695e.isChecked()) {
                    this.f182695e.toggle();
                }
                this.f182695e = newGiftPanelItemView;
                this.f182696f = i;
                if (newGiftPanelItemView.isChecked()) {
                    return;
                }
                this.f182695e.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m199617M(List<CoreGiftInfo> list, int i) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f182693c.clear();
        this.f182693c = list;
        if (this.f182694d.m180538v().m122795G() == CoreGiftPanelName.get("note")) {
            this.f182696f = Math.max(this.f182696f, vwb.m200293G(list, new w9j() { // from class: l.ur20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
                }
            }));
        } else if (this.f182694d.m180538v().m122795G() == CoreGiftPanelName.get("greet")) {
            int i2 = i - 1;
            this.f182697g = i2;
            if (i <= 1) {
                i2 = 1;
            }
            this.f182696f = i2;
        }
        notifyDataSetChanged();
    }
}
