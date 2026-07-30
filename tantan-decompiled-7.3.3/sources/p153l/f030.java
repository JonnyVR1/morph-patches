package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.panel.NewGiftPanelItemView;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f030 extends jic0<CoreGiftInfo> {

    /* JADX INFO: renamed from: d */
    public final b030 f96649d;

    /* JADX INFO: renamed from: e */
    public NewGiftPanelItemView f96650e;

    /* JADX INFO: renamed from: g */
    public int f96652g;

    /* JADX INFO: renamed from: c */
    public List<CoreGiftInfo> f96648c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f96651f = 0;

    public f030(b030 b030Var) {
        this.f96649d = b030Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m123439L(View view) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f96649d.m101257v().m174336N());
        if (NullChecker.m82486a(userM116503Pa)) {
            this.f96649d.m101247A();
            this.f96649d.m101261z(CoreModule.m30933P().m143412i().mo180507n3(!userM116503Pa.isFemale()));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f96648c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156895M, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final CoreGiftInfo coreGiftInfo, int i, final int i2) {
        final NewGiftPanelItemView newGiftPanelItemView = (NewGiftPanelItemView) view;
        boolean z = i2 == this.f96651f;
        newGiftPanelItemView.m46724m0(this.f96649d, coreGiftInfo, z, this.f96652g <= i2);
        if (z && this.f96650e == null) {
            this.f96650e = newGiftPanelItemView;
        }
        if (coreGiftInfo.quota == 0 || this.f96652g > i2) {
            bnl0.m105509E0(newGiftPanelItemView, new View.OnClickListener() { // from class: l.d030
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f84524a.m123439L(view2);
                }
            });
        } else {
            bnl0.m105509E0(newGiftPanelItemView, new View.OnClickListener() { // from class: l.c030
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f79199a.m123443K(newGiftPanelItemView, coreGiftInfo, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public void m123441I() {
        if (NullChecker.m82486a(this.f96650e)) {
            if (this.f96650e.isChecked()) {
                this.f96650e.toggle();
            }
            this.f96650e = null;
        }
        this.f96651f = 0;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CoreGiftInfo getItem(int i) {
        return this.f96648c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m123443K(NewGiftPanelItemView newGiftPanelItemView, CoreGiftInfo coreGiftInfo, int i, View view) {
        if (NullChecker.m82486a(newGiftPanelItemView.f30129n) && coreGiftInfo.f56859id.equals(newGiftPanelItemView.f30129n.f56859id)) {
            if (!NullChecker.m82486a(this.f96650e)) {
                boolean zEquals = TextUtils.equals(this.f96649d.m101257v().m174330F(), "from_meet_liked");
                b030 b030Var = this.f96649d;
                if (zEquals) {
                    i4g0.m138523u("e_chat_gift_bar_gift", b030Var.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id), jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"));
                } else {
                    boolean zEquals2 = TextUtils.equals(b030Var.m101257v().m174330F(), "from_meet_picks");
                    b030 b030Var2 = this.f96649d;
                    if (zEquals2) {
                        i4g0.m138523u("e_chat_gift_bar_gift", b030Var2.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id), jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"));
                    } else {
                        i4g0.m138523u("e_chat_gift_bar_gift", b030Var2.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
                    }
                }
                this.f96651f = i;
                this.f96650e = newGiftPanelItemView;
                if (newGiftPanelItemView.isChecked()) {
                    return;
                }
                this.f96650e.toggle();
                return;
            }
            if (this.f96651f != i) {
                boolean zEquals3 = TextUtils.equals(this.f96649d.m101257v().m174330F(), "from_meet_liked");
                b030 b030Var3 = this.f96649d;
                if (zEquals3) {
                    i4g0.m138523u("e_chat_gift_bar_gift", b030Var3.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id), jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"));
                } else {
                    boolean zEquals4 = TextUtils.equals(b030Var3.m101257v().m174330F(), "from_meet_picks");
                    b030 b030Var4 = this.f96649d;
                    if (zEquals4) {
                        i4g0.m138523u("e_chat_gift_bar_gift", b030Var4.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id), jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"));
                    } else {
                        i4g0.m138523u("e_chat_gift_bar_gift", b030Var4.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
                    }
                }
                if (this.f96650e.isChecked()) {
                    this.f96650e.toggle();
                }
                this.f96650e = newGiftPanelItemView;
                this.f96651f = i;
                if (newGiftPanelItemView.isChecked()) {
                    return;
                }
                this.f96650e.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m123444M(List<CoreGiftInfo> list, int i) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f96648c.clear();
        this.f96648c = list;
        if (this.f96649d.m101257v().m174331G() == CoreGiftPanelName.get("note")) {
            this.f96651f = Math.max(this.f96651f, jyb.m147476G(list, new qcj() { // from class: l.e030
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
                }
            }));
        } else if (this.f96649d.m101257v().m174331G() == CoreGiftPanelName.get("greet")) {
            int i2 = i - 1;
            this.f96652g = i2;
            if (i <= 1) {
                i2 = 1;
            }
            this.f96651f = i2;
        }
        notifyDataSetChanged();
    }
}
