package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.SummonFansItemView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveSettingNewBaseView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveSettingView;

/* JADX INFO: loaded from: classes4.dex */
public class lt3 extends i80<SummonFansItemView> {

    /* JADX INFO: renamed from: A */
    public boolean f129924A;

    /* JADX INFO: renamed from: B */
    public final x24 f129925B;

    /* JADX INFO: renamed from: C */
    @DrawableRes
    public final int f129926C;

    /* JADX INFO: renamed from: D */
    @DrawableRes
    public final int f129927D;

    /* JADX INFO: renamed from: E */
    public View f129928E;

    /* JADX INFO: renamed from: x */
    public boolean f129929x;

    /* JADX INFO: renamed from: y */
    public String f129930y;

    /* JADX INFO: renamed from: z */
    public boolean f129931z;

    public lt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, t6c0.f168596z, bLiveBottomButton, i, i2, str, str2);
        this.f129929x = false;
        this.f129930y = "";
        this.f129931z = true;
        this.f129924A = false;
        this.f129926C = i3c0.f111076l6;
        this.f129927D = i3c0.f111088m6;
        this.f129928E = null;
        this.f129925B = (x24) m144512z2(new x24(bsmVar, this));
    }

    @Override // p149l.i80, p149l.df2
    @SuppressLint({"MissingSuperCall"})
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        m111423g4();
        LiveSettingView liveSettingView = (LiveSettingView) m129297F3(new xjj(5000));
        LiveSettingNewBaseView liveSettingNewBaseView = (LiveSettingNewBaseView) m129297F3(new wjj(5000));
        if (liveSettingView == null && liveSettingNewBaseView == null) {
            return;
        }
        this.f129925B.m206798D4(liveSettingView);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.summonFans);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: f4 */
    public boolean mo111422f4() {
        return this.f129929x;
    }

    /* JADX INFO: renamed from: n4 */
    public View m151663n4() {
        if (this.viewModel == 0) {
            return null;
        }
        return this.f129928E;
    }

    /* JADX INFO: renamed from: o4 */
    public void m151664o4() {
        V v2 = this.f85887k;
        if (v2 != 0) {
            mo108215d4((SummonFansItemView) v2);
        }
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(SummonFansItemView summonFansItemView) {
        super.mo108215d4(summonFansItemView);
        this.f129928E = summonFansItemView;
        summonFansItemView.f48547f.setText(this.f85888l.name);
        m151666q4(this.f129931z);
        m151667r4(this.f129924A);
    }

    /* JADX INFO: renamed from: q4 */
    public void m151666q4(boolean z) {
        this.f129931z = z;
        V v2 = this.f85887k;
        if (v2 == 0) {
            return;
        }
        if (z) {
            ((SummonFansItemView) v2).f48544c.setImageResource(this.f129926C);
        } else {
            ((SummonFansItemView) v2).f48544c.setImageResource(this.f129927D);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m151667r4(boolean z) {
        this.f129924A = z;
        V v2 = this.f85887k;
        if (v2 == 0) {
            return;
        }
        xdl0.m208344M(((SummonFansItemView) v2).f48548g, z);
        ((SummonFansItemView) this.f85887k).f48548g.setText(this.f129930y);
    }

    /* JADX INFO: renamed from: s4 */
    public void m151668s4(String str) {
        this.f129930y = str;
    }

    /* JADX INFO: renamed from: t4 */
    public void m151669t4(boolean z) {
        this.f129929x = z;
    }
}
