package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.SummonFansItemView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveSettingNewBaseView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveSettingView;

/* JADX INFO: loaded from: classes4.dex */
public class ku3 extends e80<SummonFansItemView> {

    /* JADX INFO: renamed from: A */
    public boolean f128802A;

    /* JADX INFO: renamed from: B */
    public final w34 f128803B;

    /* JADX INFO: renamed from: C */
    @DrawableRes
    public final int f128804C;

    /* JADX INFO: renamed from: D */
    @DrawableRes
    public final int f128805D;

    /* JADX INFO: renamed from: E */
    public View f128806E;

    /* JADX INFO: renamed from: x */
    public boolean f128807x;

    /* JADX INFO: renamed from: y */
    public String f128808y;

    /* JADX INFO: renamed from: z */
    public boolean f128809z;

    public ku3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, yec0.f199328z, bLiveBottomButton, i, i2, str, str2);
        this.f128807x = false;
        this.f128808y = "";
        this.f128809z = true;
        this.f128802A = false;
        this.f128804C = obc0.f146404l6;
        this.f128805D = obc0.f146416m6;
        this.f128806E = null;
        this.f128803B = (w34) m153103z2(new w34(dumVar, this));
    }

    @Override // p153l.e80, p153l.kf2
    @SuppressLint({"MissingSuperCall"})
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        m149350g4();
        LiveSettingView liveSettingView = (LiveSettingView) m138856F3(new qmj(5000));
        LiveSettingNewBaseView liveSettingNewBaseView = (LiveSettingNewBaseView) m138856F3(new pmj(5000));
        if (liveSettingView == null && liveSettingNewBaseView == null) {
            return;
        }
        this.f128803B.m204711D4(liveSettingView);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.summonFans);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: f4 */
    public boolean mo149349f4() {
        return this.f128807x;
    }

    /* JADX INFO: renamed from: n4 */
    public View m151443n4() {
        if (this.viewModel == 0) {
            return null;
        }
        return this.f128806E;
    }

    /* JADX INFO: renamed from: o4 */
    public void m151444o4() {
        V v2 = this.f126232k;
        if (v2 != 0) {
            mo108591d4((SummonFansItemView) v2);
        }
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(SummonFansItemView summonFansItemView) {
        super.mo108591d4(summonFansItemView);
        this.f128806E = summonFansItemView;
        summonFansItemView.f49395f.setText(this.f126233l.name);
        m151446q4(this.f128809z);
        m151447r4(this.f128802A);
    }

    /* JADX INFO: renamed from: q4 */
    public void m151446q4(boolean z) {
        this.f128809z = z;
        V v2 = this.f126232k;
        if (v2 == 0) {
            return;
        }
        if (z) {
            ((SummonFansItemView) v2).f49392c.setImageResource(this.f128804C);
        } else {
            ((SummonFansItemView) v2).f49392c.setImageResource(this.f128805D);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m151447r4(boolean z) {
        this.f128802A = z;
        V v2 = this.f126232k;
        if (v2 == 0) {
            return;
        }
        bnl0.m105524M(((SummonFansItemView) v2).f49396g, z);
        ((SummonFansItemView) this.f126232k).f49396g.setText(this.f128808y);
    }

    /* JADX INFO: renamed from: s4 */
    public void m151448s4(String str) {
        this.f128808y = str;
    }

    /* JADX INFO: renamed from: t4 */
    public void m151449t4(boolean z) {
        this.f128807x = z;
    }
}
