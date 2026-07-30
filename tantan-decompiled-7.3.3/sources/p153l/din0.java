package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomVoiceItemView;

/* JADX INFO: loaded from: classes5.dex */
public class din0 extends ic3<BottomVoiceItemView> {

    /* JADX INFO: renamed from: l */
    public jc3<?> f88695l;

    public din0(int i, CharSequence charSequence, int i2, int i3, String str, jc3<?> jc3Var) {
        super(i, charSequence, i2, i3, str);
        this.f88695l = jc3Var;
    }

    @Override // p153l.ic3, p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo71749u(BottomVoiceItemView bottomVoiceItemView) {
        super.mo71749u(bottomVoiceItemView);
        int i = this.f114273d;
        if (i != 0) {
            bottomVoiceItemView.setImageRes(i);
        } else if (!TextUtils.isEmpty(this.f114274e)) {
            bottomVoiceItemView.setImageUrl(this.f114274e);
        }
        bottomVoiceItemView.f49346e.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        bottomVoiceItemView.f49346e.setTextSize(12.0f);
        bottomVoiceItemView.setText(this.f114275f);
        int iMo112223E = this.f88695l.mo112223E();
        jc3<?> jc3Var = this.f88695l;
        if (iMo112223E > 0) {
            bottomVoiceItemView.m73328b(jc3Var.mo112223E());
        } else {
            bottomVoiceItemView.mo73321g0(jc3Var.mo103476l1());
        }
        int i2 = this.f114280k;
        if (i2 > 0) {
            bnl0.m105505C0(bottomVoiceItemView.f49346e, i2);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199083g1;
    }

    public din0(String str, CharSequence charSequence, int i, int i2, String str2, jc3<?> jc3Var) {
        super(str, charSequence, i, i2, str2);
        this.f88695l = jc3Var;
    }
}
