package com.p051p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.ets;
import p153l.fvk;
import p153l.nsv;
import p153l.qcj;
import p153l.xau;
import p153l.yec0;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51268d;

    /* JADX INFO: renamed from: e */
    public LivingUserRollAnimView f51269e;

    /* JADX INFO: renamed from: f */
    public VImage f51270f;

    /* JADX INFO: renamed from: g */
    public z20<Integer, Integer> f51271g;

    public LiveGuardEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75824j0(View view) {
        ets.m122503a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m75825k0(Integer num, Integer num2) {
        if (NullChecker.m82486a(this.f51271g)) {
            this.f51271g.call(num, num2);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m75826l0(boolean z, @Nullable BLiveData bLiveData, List<BLiveKnightsInfosSummary> list, boolean z2) {
        if (!NullChecker.m82486a(list) || list.size() <= 0 || list.get(0).knightsNumber == 0) {
            this.f51268d.setText(xau.m209910t(z2 ? R$string.f47877W : R$string.f47551Ge));
        } else {
            this.f51268d.setText(xau.m209911u(R$string.f47793S, String.valueOf(list.get(0).knightsNumber)));
        }
        this.f51269e.setUsers(fvk.m127655f(bLiveData));
        if (z) {
            this.f51269e.setItemViewFunc(new qcj() { // from class: l.cts
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f83759a.m75827m0((nsv) obj);
                }
            });
            this.f51269e.setDelay(2500);
            this.f51269e.requestDisallowInterceptTouchEvent(true);
            this.f51269e.setNextAction(new z20() { // from class: l.dts
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f90625a.m75825k0((Integer) obj, (Integer) obj2);
                }
            });
            this.f51269e.m70015O();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final LiveGuardSimpleUserView m75827m0(@Nullable nsv<User> nsvVar) {
        LiveGuardSimpleUserView liveGuardSimpleUserView = (LiveGuardSimpleUserView) LayoutInflater.from(getContext()).inflate(yec0.f199019b2, (ViewGroup) null);
        liveGuardSimpleUserView.mo70019a(nsvVar);
        liveGuardSimpleUserView.setOnClickListener(null);
        return liveGuardSimpleUserView;
    }

    /* JADX INFO: renamed from: n0 */
    public void m75828n0() {
        this.f51269e.reset();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75824j0(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setNextAction(z20<Integer, Integer> z20Var) {
        this.f51271g = z20Var;
    }

    public LiveGuardEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
