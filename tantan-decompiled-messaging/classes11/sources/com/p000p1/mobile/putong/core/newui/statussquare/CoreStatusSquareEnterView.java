package com.p000p1.mobile.putong.core.newui.statussquare;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.qib0;
import l.w0c0;
import l.wxa;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreStatusSquareEnterView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public CoreStatusSquareEnterView f5566d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f5567e;

    /* JADX INFO: renamed from: f */
    public VLinear f5568f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5569g;

    /* JADX INFO: renamed from: h */
    public VLinear f5570h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f5571i;

    /* JADX INFO: renamed from: j */
    public VLinear f5572j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f5573k;

    /* JADX INFO: renamed from: l */
    public VText f5574l;

    /* JADX INFO: renamed from: m */
    public TabName f5575m;

    public CoreStatusSquareEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m7805h0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m7809m0(View view) {
        zvf0.r("e_state_explore", "p_navigation_view");
        CoreModule.N().t6(act(), true, "p_navigation_view");
    }

    /* JADX INFO: renamed from: p0 */
    private void m7810p0() {
        if (act() instanceof NewMainAct) {
            act().duringCreated(CoreModule.N().gk("")).subscribe(mkd0.H(new e30() { // from class: l.uxa
                public final void call(Object obj) {
                    this.f21360a.m7813o0((Envelope) obj);
                }
            }, new e30() { // from class: l.vxa
                public final void call(Object obj) {
                    CoreStatusSquareEnterView.m7805h0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7811l0(View view) {
        wxa.a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m7812n0(TabName tabName) {
        if (this.f5575m != null && tabName.equals(TabName.Me) && this.f5575m != tabName) {
            m7810p0();
        }
        this.f5575m = tabName;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m7813o0(Envelope envelope) {
        m7815r0(envelope.data.getModuleData(CoreData.class).states);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7811l0(this);
        TextPaint paint = this.f5574l.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(true);
        }
        zvf0.x("e_state_explore", "p_navigation_view");
        xdl0.E0(this.f5566d, new View.OnClickListener() { // from class: l.sxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20490a.m7809m0(view);
            }
        });
        this.f5575m = TabName.Me;
        m7810p0();
        if (act() instanceof NewMainAct) {
            act().duringCreated(((NewMainAct) getContext()).m3895i7()).subscribe(mkd0.G(new e30() { // from class: l.txa
                public final void call(Object obj) {
                    this.f20907a.m7812n0((TabName) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m7814q0(List<User> list) {
        xdl0.M(this.f5567e, true);
        qib0.G.Q0(this.f5569g, list.get(0).fp().profileSmall());
        qib0.G.Q0(this.f5571i, list.get(1).fp().profileSmall());
        qib0.G.Q0(this.f5573k, list.get(2).fp().profileSmall());
        xdl0.M(this.f5568f, true);
        xdl0.M(this.f5570h, true);
        xdl0.M(this.f5572j, true);
    }

    /* JADX INFO: renamed from: r0 */
    public void m7815r0(List<BubbleInfo> list) {
        if (list.size() < 3) {
            xdl0.M(this.f5567e, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).owner.id;
            if (!TextUtils.isEmpty(str)) {
                User userById = CoreModule.N().getUserById(str);
                if (NullChecker.a(userById)) {
                    arrayList.add(userById);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.size() < 3) {
            xdl0.M(this.f5567e, false);
        } else {
            m7814q0(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public void m7816s0() {
        this.f5568f.setBackgroundResource(x2c0.u1);
        this.f5570h.setBackgroundResource(x2c0.u1);
        this.f5572j.setBackgroundResource(x2c0.u1);
        this.f5574l.setTextColor(getResources().getColor(w0c0.x));
    }

    public CoreStatusSquareEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreStatusSquareEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
