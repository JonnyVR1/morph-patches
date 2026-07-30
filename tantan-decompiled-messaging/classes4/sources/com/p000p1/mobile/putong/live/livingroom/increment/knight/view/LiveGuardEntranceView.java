package com.p000p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.f30;
import l.mqv;
import l.w8u;
import l.w9j;
import p002l.drs;
import p002l.psk;
import p002l.t6c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6462d;

    /* JADX INFO: renamed from: e */
    public LivingUserRollAnimView f6463e;

    /* JADX INFO: renamed from: f */
    public VImage f6464f;

    /* JADX INFO: renamed from: g */
    public f30<Integer, Integer> f6465g;

    public LiveGuardEntranceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8234j0(View view) {
        drs.m12014a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m8235k0(Integer num, Integer num2) {
        if (NullChecker.a(this.f6465g)) {
            this.f6465g.call(num, num2);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m8236l0(boolean z, @Nullable BLiveData bLiveData, List<BLiveKnightsInfosSummary> list, boolean z2) {
        if (!NullChecker.a(list) || list.size() <= 0 || list.get(0).knightsNumber == 0) {
            this.f6462d.setText(w8u.t(z2 ? R$string.f3071W : R$string.f2745Ge));
        } else {
            this.f6462d.setText(w8u.u(R$string.f2987S, String.valueOf(list.get(0).knightsNumber)));
        }
        this.f6463e.setUsers(psk.m20659f(bLiveData));
        if (z) {
            this.f6463e.setItemViewFunc(new w9j() { // from class: l.brs
                public final Object call(Object obj) {
                    return this.f8319a.m8237m0((mqv) obj);
                }
            });
            this.f6463e.setDelay(2500);
            this.f6463e.requestDisallowInterceptTouchEvent(true);
            this.f6463e.setNextAction(new f30() { // from class: l.crs
                public final void call(Object obj, Object obj2) {
                    this.f8923a.m8235k0((Integer) obj, (Integer) obj2);
                }
            });
            this.f6463e.O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardSimpleUserView] */
    /* JADX INFO: renamed from: m0 */
    public final LiveGuardSimpleUserView m8237m0(@Nullable mqv<User> mqvVar) {
        ?? r2 = (LiveGuardSimpleUserView) LayoutInflater.from(getContext()).inflate(t6c0.f19783b2, (ViewGroup) null);
        r2.m8247a(mqvVar);
        r2.setOnClickListener(null);
        return r2;
    }

    /* JADX INFO: renamed from: n0 */
    public void m8238n0() {
        this.f6463e.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8234j0(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setNextAction(f30<Integer, Integer> f30Var) {
        this.f6465g = f30Var;
    }

    public LiveGuardEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
