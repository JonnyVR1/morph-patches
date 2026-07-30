package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomVoicePlayItemView;

/* JADX INFO: loaded from: classes5.dex */
public class z7o0 extends tb3<BottomVoicePlayItemView> {

    /* JADX INFO: renamed from: l */
    public ub3<?> f202045l;

    public z7o0(String str, CharSequence charSequence, int i, int i2, String str2, ub3<?> ub3Var) {
        super(str, charSequence, i, i2, str2);
        this.f202045l = ub3Var;
    }

    @Override // p149l.tb3, p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70566u(BottomVoicePlayItemView bottomVoicePlayItemView) {
        super.mo70566u(bottomVoicePlayItemView);
        int i = this.f169210d;
        if (i != 0) {
            bottomVoicePlayItemView.setImageRes(i);
        } else if (!TextUtils.isEmpty(this.f169211e)) {
            bottomVoicePlayItemView.setImageUrl(this.f169211e);
        }
        bottomVoicePlayItemView.f48504e.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        bottomVoicePlayItemView.f48504e.setTextSize(12.0f);
        bottomVoicePlayItemView.setText(this.f169212f);
        int iMo154722E = this.f202045l.mo154722E();
        ub3<?> ub3Var = this.f202045l;
        if (iMo154722E > 0) {
            bottomVoicePlayItemView.m72147b(ub3Var.mo154722E());
        } else {
            bottomVoicePlayItemView.mo72138g0(ub3Var.mo108806l1());
        }
        xdl0.m208327D0((int) ((xdl0.m208412y0() - t100.m186890d(85.0f)) / 4.0f), bottomVoicePlayItemView, bottomVoicePlayItemView.f48500a);
        int i2 = this.f169217k;
        if (i2 > 0) {
            xdl0.m208325C0(bottomVoicePlayItemView.f48504e, i2);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167959A;
    }
}
