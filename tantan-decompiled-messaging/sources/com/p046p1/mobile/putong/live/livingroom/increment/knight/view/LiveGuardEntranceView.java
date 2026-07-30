package com.p046p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.drs;
import p149l.f30;
import p149l.mqv;
import p149l.psk;
import p149l.t6c0;
import p149l.w8u;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50420d;

    /* JADX INFO: renamed from: e */
    public LivingUserRollAnimView f50421e;

    /* JADX INFO: renamed from: f */
    public VImage f50422f;

    /* JADX INFO: renamed from: g */
    public f30<Integer, Integer> f50423g;

    public LiveGuardEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74641j0(View view) {
        drs.m113333a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m74642k0(Integer num, Integer num2) {
        if (NullChecker.m81303a(this.f50423g)) {
            this.f50423g.call(num, num2);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m74643l0(boolean z, @Nullable BLiveData bLiveData, List<BLiveKnightsInfosSummary> list, boolean z2) {
        if (!NullChecker.m81303a(list) || list.size() <= 0 || list.get(0).knightsNumber == 0) {
            this.f50420d.setText(w8u.m202217t(z2 ? R$string.f47029W : R$string.f46703Ge));
        } else {
            this.f50420d.setText(w8u.m202218u(R$string.f46945S, String.valueOf(list.get(0).knightsNumber)));
        }
        this.f50421e.setUsers(psk.m171163f(bLiveData));
        if (z) {
            this.f50421e.setItemViewFunc(new w9j() { // from class: l.brs
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f76938a.m74644m0((mqv) obj);
                }
            });
            this.f50421e.setDelay(2500);
            this.f50421e.requestDisallowInterceptTouchEvent(true);
            this.f50421e.setNextAction(new f30() { // from class: l.crs
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f82304a.m74642k0((Integer) obj, (Integer) obj2);
                }
            });
            this.f50421e.m68832O();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final LiveGuardSimpleUserView m74644m0(@Nullable mqv<User> mqvVar) {
        LiveGuardSimpleUserView liveGuardSimpleUserView = (LiveGuardSimpleUserView) LayoutInflater.from(getContext()).inflate(t6c0.f168287b2, (ViewGroup) null);
        liveGuardSimpleUserView.mo68836a(mqvVar);
        liveGuardSimpleUserView.setOnClickListener(null);
        return liveGuardSimpleUserView;
    }

    /* JADX INFO: renamed from: n0 */
    public void m74645n0() {
        this.f50421e.reset();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74641j0(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setNextAction(f30<Integer, Integer> f30Var) {
        this.f50423g = f30Var;
    }

    public LiveGuardEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
