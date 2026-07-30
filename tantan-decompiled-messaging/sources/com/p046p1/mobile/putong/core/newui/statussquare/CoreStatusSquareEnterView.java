package com.p046p1.mobile.putong.core.newui.statussquare;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.mkd0;
import p149l.qib0;
import p149l.w0c0;
import p149l.wxa;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreStatusSquareEnterView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public CoreStatusSquareEnterView f26788d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f26789e;

    /* JADX INFO: renamed from: f */
    public VLinear f26790f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f26791g;

    /* JADX INFO: renamed from: h */
    public VLinear f26792h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f26793i;

    /* JADX INFO: renamed from: j */
    public VLinear f26794j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f26795k;

    /* JADX INFO: renamed from: l */
    public VText f26796l;

    /* JADX INFO: renamed from: m */
    public TabName f26797m;

    public CoreStatusSquareEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m43559h0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m43563m0(View view) {
        zvf0.m220396r("e_state_explore", OMSDialogPositon.p_navigation_view);
        CoreModule.m29934N().mo60390t6(act(), true, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: p0 */
    private void m43564p0() {
        if (act() instanceof NewMainAct) {
            act().duringCreated(CoreModule.m29934N().mo60354gk("")).subscribe(mkd0.m154956H(new e30() { // from class: l.uxa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178718a.m43567o0((Envelope) obj);
                }
            }, new e30() { // from class: l.vxa
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreStatusSquareEnterView.m43559h0((Throwable) obj);
                }
            }));
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m43565l0(View view) {
        wxa.m205975a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m43566n0(TabName tabName) {
        if (this.f26797m != null && tabName.equals(TabName.Me) && this.f26797m != tabName) {
            m43564p0();
        }
        this.f26797m = tabName;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m43567o0(Envelope envelope) {
        m43569r0(((CoreData) envelope.data.getModuleData(CoreData.class)).states);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43565l0(this);
        TextPaint paint = this.f26796l.getPaint();
        if (NullChecker.m81303a(paint)) {
            paint.setFakeBoldText(true);
        }
        zvf0.m220402x("e_state_explore", OMSDialogPositon.p_navigation_view);
        xdl0.m208329E0(this.f26788d, new View.OnClickListener() { // from class: l.sxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166784a.m43563m0(view);
            }
        });
        this.f26797m = TabName.Me;
        m43564p0();
        if (act() instanceof NewMainAct) {
            act().duringCreated(((NewMainAct) getContext()).m39819i7()).subscribe(mkd0.m154955G(new e30() { // from class: l.txa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172498a.m43566n0((TabName) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m43568q0(List<User> list) {
        xdl0.m208344M(this.f26789e, true);
        qib0.f154691G.m102341Q0(this.f26791g, list.get(0).m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f26793i, list.get(1).m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f26795k, list.get(2).m60124fp().profileSmall());
        xdl0.m208344M(this.f26790f, true);
        xdl0.m208344M(this.f26792h, true);
        xdl0.m208344M(this.f26794j, true);
    }

    /* JADX INFO: renamed from: r0 */
    public void m43569r0(List<BubbleInfo> list) {
        if (list.size() < 3) {
            xdl0.m208344M(this.f26789e, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).owner.f38803id;
            if (!TextUtils.isEmpty(str)) {
                User userById = CoreModule.m29934N().getUserById(str);
                if (NullChecker.m81303a(userById)) {
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
            xdl0.m208344M(this.f26789e, false);
        } else {
            m43568q0(arrayList);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m43570s0() {
        this.f26790f.setBackgroundResource(x2c0.f190604u1);
        this.f26792h.setBackgroundResource(x2c0.f190604u1);
        this.f26794j.setBackgroundResource(x2c0.f190604u1);
        this.f26796l.setTextColor(getResources().getColor(w0c0.f183899x));
    }

    public CoreStatusSquareEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreStatusSquareEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
