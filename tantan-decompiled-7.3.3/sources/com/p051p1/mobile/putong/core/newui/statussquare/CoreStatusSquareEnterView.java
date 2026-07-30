package com.p051p1.mobile.putong.core.newui.statussquare;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.iza;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CoreStatusSquareEnterView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public CoreStatusSquareEnterView f27636d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f27637e;

    /* JADX INFO: renamed from: f */
    public VLinear f27638f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f27639g;

    /* JADX INFO: renamed from: h */
    public VLinear f27640h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f27641i;

    /* JADX INFO: renamed from: j */
    public VLinear f27642j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f27643k;

    /* JADX INFO: renamed from: l */
    public VText f27644l;

    /* JADX INFO: renamed from: m */
    public TabName f27645m;

    public CoreStatusSquareEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m44745h0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m44749m0(View view) {
        i4g0.m138520r("e_state_explore", OMSDialogPositon.p_navigation_view);
        CoreModule.m30932N().mo61574t6(act(), true, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: p0 */
    private void m44750p0() {
        if (act() instanceof NewMainAct) {
            act().duringCreated(CoreModule.m30932N().mo61538gk("")).subscribe(psd0.m173597H(new y20() { // from class: l.gza
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107183a.m44753o0((Envelope) obj);
                }
            }, new y20() { // from class: l.hza
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreStatusSquareEnterView.m44745h0((Throwable) obj);
                }
            }));
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m44751l0(View view) {
        iza.m142797a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m44752n0(TabName tabName) {
        if (this.f27645m != null && tabName.equals(TabName.Me) && this.f27645m != tabName) {
            m44750p0();
        }
        this.f27645m = tabName;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m44753o0(Envelope envelope) {
        m44755r0(((CoreData) envelope.data.getModuleData(CoreData.class)).states);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44751l0(this);
        TextPaint paint = this.f27644l.getPaint();
        if (NullChecker.m82486a(paint)) {
            paint.setFakeBoldText(true);
        }
        i4g0.m138526x("e_state_explore", OMSDialogPositon.p_navigation_view);
        bnl0.m105509E0(this.f27636d, new View.OnClickListener() { // from class: l.eza
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96575a.m44749m0(view);
            }
        });
        this.f27645m = TabName.Me;
        m44750p0();
        if (act() instanceof NewMainAct) {
            act().duringCreated(((NewMainAct) getContext()).m40829o7()).subscribe(psd0.m173596G(new y20() { // from class: l.fza
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101457a.m44752n0((TabName) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m44754q0(List<User> list) {
        bnl0.m105524M(this.f27637e, true);
        uqb0.f180374G.m127125Q0(this.f27639g, list.get(0).m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f27641i, list.get(1).m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f27643k, list.get(2).m61308fp().profileSmall());
        bnl0.m105524M(this.f27638f, true);
        bnl0.m105524M(this.f27640h, true);
        bnl0.m105524M(this.f27642j, true);
    }

    /* JADX INFO: renamed from: r0 */
    public void m44755r0(List<BubbleInfo> list) {
        if (list.size() < 3) {
            bnl0.m105524M(this.f27637e, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).owner.f39651id;
            if (!TextUtils.isEmpty(str)) {
                User userById = CoreModule.m30932N().getUserById(str);
                if (NullChecker.m82486a(userById)) {
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
            bnl0.m105524M(this.f27637e, false);
        } else {
            m44754q0(arrayList);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m44756s0() {
        this.f27638f.setBackgroundResource(dbc0.f87499v1);
        this.f27640h.setBackgroundResource(dbc0.f87499v1);
        this.f27642j.setBackgroundResource(dbc0.f87499v1);
        this.f27644l.setTextColor(getResources().getColor(c9c0.f80469x));
    }

    public CoreStatusSquareEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreStatusSquareEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
