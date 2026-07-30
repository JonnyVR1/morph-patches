package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.p001ui.gift.panel.NewGiftPanelItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.o7r;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vr20 extends dac0<CoreGiftInfo> {

    /* JADX INFO: renamed from: d */
    public final rr20 f8033d;

    /* JADX INFO: renamed from: e */
    public NewGiftPanelItemView f8034e;

    /* JADX INFO: renamed from: g */
    public int f8036g;

    /* JADX INFO: renamed from: c */
    public List<CoreGiftInfo> f8032c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f8035f = 0;

    public vr20(rr20 rr20Var) {
        this.f8033d = rr20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m10261L(View view) {
        User userPa = CoreModule.c.e0.Pa(this.f8033d.m9175v().m6501N());
        if (NullChecker.a(userPa)) {
            this.f8033d.m9165A();
            this.f8033d.m9179z(CoreModule.P().i().n3(!userPa.isFemale()));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m10263C() {
        return this.f8032c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m10264D(ViewGroup viewGroup, int i) {
        return o7r.a(viewGroup.getContext()).inflate(l6c0.f5848M, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, com.p1.mobile.putong.core.ui.gift.panel.NewGiftPanelItemView] */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m10262A(View view, final CoreGiftInfo coreGiftInfo, int i, final int i2) {
        final ?? r4 = (NewGiftPanelItemView) view;
        boolean z = i2 == this.f8035f;
        r4.m2877m0(this.f8033d, coreGiftInfo, z, this.f8036g <= i2);
        if (z && this.f8034e == null) {
            this.f8034e = r4;
        }
        if (coreGiftInfo.quota == 0 || this.f8036g > i2) {
            xdl0.E0((View) r4, new View.OnClickListener() { // from class: l.tr20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7613a.m10261L(view2);
                }
            });
        } else {
            xdl0.E0((View) r4, new View.OnClickListener() { // from class: l.sr20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7448a.m10268K(r4, coreGiftInfo, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public void m10266I() {
        if (NullChecker.a(this.f8034e)) {
            if (this.f8034e.isChecked()) {
                this.f8034e.toggle();
            }
            this.f8034e = null;
        }
        this.f8035f = 0;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CoreGiftInfo getItem(int i) {
        return this.f8032c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10268K(NewGiftPanelItemView newGiftPanelItemView, CoreGiftInfo coreGiftInfo, int i, View view) {
        if (NullChecker.a(newGiftPanelItemView.f1675n) && ((DbObject) coreGiftInfo).id.equals(((DbObject) newGiftPanelItemView.f1675n).id)) {
            if (!NullChecker.a(this.f8034e)) {
                boolean zEquals = TextUtils.equals(this.f8033d.m9175v().m6495F(), "from_meet_liked");
                rr20 rr20Var = this.f8033d;
                if (zEquals) {
                    zvf0.u("e_chat_gift_bar_gift", rr20Var.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id), vwb.Y("showfrom_meet_sayhi", "I_like_say_hi")});
                } else {
                    boolean zEquals2 = TextUtils.equals(rr20Var.m9175v().m6495F(), "from_meet_picks");
                    rr20 rr20Var2 = this.f8033d;
                    if (zEquals2) {
                        zvf0.u("e_chat_gift_bar_gift", rr20Var2.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id), vwb.Y("showfrom_meet_sayhi", "picks_say_hi")});
                    } else {
                        zvf0.u("e_chat_gift_bar_gift", rr20Var2.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
                    }
                }
                this.f8035f = i;
                this.f8034e = newGiftPanelItemView;
                if (newGiftPanelItemView.isChecked()) {
                    return;
                }
                this.f8034e.toggle();
                return;
            }
            if (this.f8035f != i) {
                boolean zEquals3 = TextUtils.equals(this.f8033d.m9175v().m6495F(), "from_meet_liked");
                rr20 rr20Var3 = this.f8033d;
                if (zEquals3) {
                    zvf0.u("e_chat_gift_bar_gift", rr20Var3.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id), vwb.Y("showfrom_meet_sayhi", "I_like_say_hi")});
                } else {
                    boolean zEquals4 = TextUtils.equals(rr20Var3.m9175v().m6495F(), "from_meet_picks");
                    rr20 rr20Var4 = this.f8033d;
                    if (zEquals4) {
                        zvf0.u("e_chat_gift_bar_gift", rr20Var4.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id), vwb.Y("showfrom_meet_sayhi", "picks_say_hi")});
                    } else {
                        zvf0.u("e_chat_gift_bar_gift", rr20Var4.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
                    }
                }
                if (this.f8034e.isChecked()) {
                    this.f8034e.toggle();
                }
                this.f8034e = newGiftPanelItemView;
                this.f8035f = i;
                if (newGiftPanelItemView.isChecked()) {
                    return;
                }
                this.f8034e.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m10269M(List<CoreGiftInfo> list, int i) {
        if (vwb.J(list)) {
            return;
        }
        this.f8032c.clear();
        this.f8032c = list;
        if (this.f8033d.m9175v().m6496G() == CoreGiftPanelName.get("note")) {
            this.f8035f = Math.max(this.f8035f, vwb.G(list, new w9j() { // from class: l.ur20
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
                }
            }));
        } else if (this.f8033d.m9175v().m6496G() == CoreGiftPanelName.get(GiftSubBizType.greet)) {
            int i2 = i - 1;
            this.f8036g = i2;
            if (i <= 1) {
                i2 = 1;
            }
            this.f8035f = i2;
        }
        notifyDataSetChanged();
    }
}
