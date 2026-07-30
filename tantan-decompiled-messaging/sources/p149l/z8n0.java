package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomVoiceItemView;

/* JADX INFO: loaded from: classes5.dex */
public class z8n0 extends tb3<BottomVoiceItemView> {

    /* JADX INFO: renamed from: l */
    public ub3<?> f202190l;

    public z8n0(int i, CharSequence charSequence, int i2, int i3, String str, ub3<?> ub3Var) {
        super(i, charSequence, i2, i3, str);
        this.f202190l = ub3Var;
    }

    @Override // p149l.tb3, p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70566u(BottomVoiceItemView bottomVoiceItemView) {
        super.mo70566u(bottomVoiceItemView);
        int i = this.f169210d;
        if (i != 0) {
            bottomVoiceItemView.setImageRes(i);
        } else if (!TextUtils.isEmpty(this.f169211e)) {
            bottomVoiceItemView.setImageUrl(this.f169211e);
        }
        bottomVoiceItemView.f48498e.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        bottomVoiceItemView.f48498e.setTextSize(12.0f);
        bottomVoiceItemView.setText(this.f169212f);
        int iMo154722E = this.f202190l.mo154722E();
        ub3<?> ub3Var = this.f202190l;
        if (iMo154722E > 0) {
            bottomVoiceItemView.m72145b(ub3Var.mo154722E());
        } else {
            bottomVoiceItemView.mo72138g0(ub3Var.mo108806l1());
        }
        int i2 = this.f169217k;
        if (i2 > 0) {
            xdl0.m208325C0(bottomVoiceItemView.f48498e, i2);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168351g1;
    }

    public z8n0(String str, CharSequence charSequence, int i, int i2, String str2, ub3<?> ub3Var) {
        super(str, charSequence, i, i2, str2);
        this.f202190l = ub3Var;
    }
}
